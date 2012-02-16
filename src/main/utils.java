package main;

import java.util.Vector;

import backend.chain.ActionChain;
import backend.events.Attack;
import backend.events.Draw;
import backend.events.Event;
import backend.events.RemovedFromPlay;
import backend.events.Set;
import backend.pipeline.Pipeline;

import main.CardAttriubtes.CardType;
import main.CardAttriubtes.SubType;

public class utils
{
private static final int MONSTER = 1;
private static final int SPELL_TRAP = 0; 
private static final int ATTACK = 0;
private static final int DEFENCE =1;
private static Pipeline pipeline = new Pipeline();
private static ActionChain actionChain = new ActionChain();

public static void toManyCards(int player)
{
    int cards = table.hands.get(player).size()-5;
    //TODO show dialog to remove x number of cards
    int[] dicard =new int[cards];
    Vector<Card> discard = new Vector<Card>();
    for(Card card : discard){
    pipeline.removeEvent(card);
    }
    addCardToGrave(discard, player);
    
}
    public static void drawCards(int player, int numberOfCards)
    {
        for(int i =0;i<numberOfCards;i++)
        {
            Card toadd = table.deck.get(player).firstElement();
            Draw d = new Draw() {};
            pipeline.addSegment(toadd);
            pipeline.fireNewEvent(d);
            table.hands.get(player).add(toadd);
        }
    }
public static void moveCards(Object from, Object to, int number, Event event){
    
}
    public static Vector<Card> chooseCards(Vector<Card> cardList, int numberOfCards)
    {
        Vector<Card> tmp = new Vector<Card>();
        String message = "Choose "+numberOfCards+" "+((numberOfCards>1)? "cards": "card");
        //open with selctable coverflow limit to the number specified
        return tmp;
        
    }
    public static void addCardToGrave(Vector<Card> cardList, int player)
    {
        table.graveyard.get(player).addAll(cardList);
    }
    public static void addCardToOutOfPlay(Vector<Card> cardList, int player)
    {
        for(Card card : cardList){
            pipeline.removeEvent(card);
            RemovedFromPlay removedFromPlay = new RemovedFromPlay() {};
            pipeline.fireNewEvent(removedFromPlay);
        }
        table.outOfPlayPile.get(player).addAll(cardList);
    }
    
    public static boolean askDefence(Card card)
    {
        boolean tmp = false;
        
        
        return tmp;
    }
    public static boolean askFaceUp(Card card)
    {
        boolean tmp = false;
        
        return tmp;
    }
    public static <T> void addCard(int index,int player , T card)
    {
        Object zone = (Object) card;
        if(zone instanceof MonsterZone){
            Set newSet = new Set() {};
            //player is going to set
            pipeline.fireNewEvent(newSet);
            table.monsterZone[player][index] = (MonsterZone)card;
//            pipeline.addSegment(card);
          //player is has set
            pipeline.fireNewEvent(newSet);
        }
        else if(zone instanceof SpellZone){
            table.spellZone[player][index] = (SpellZone)card;    
        }
    }
    
    public static void attack(int attacker, int defender, int attackingPLayer, int defendingPlayer)
    {
        Attack attack = new Attack() {};
        //going to attack
        pipeline.fireNewEvent(attack);
        if(defender ==-1)
        {
            directAttack(attacker, attackingPLayer, defendingPlayer);
        }
        else
        {
            cardsAttack(attacker, defender, attackingPLayer, defendingPlayer);
        }
    }
    private static void directAttack(int attacker, int attackingPlayer, int defendingPlayer)
    {
        table.lifepoints[defendingPlayer] -= table.monsterZone[attackingPlayer][attacker].currentCard.attack;
        Attack attack = new Attack() {};
        //going to attack
        pipeline.fireNewEvent(attack);
    }
    private static void cardsAttack(int attacker, int defender, int attackingPlayer, int defendingPlayer)
    {
        Attack monsterAttack = new Attack() {};
        //going to attack
        pipeline.fireNewEvent(monsterAttack);
        if(!table.monsterZone[defendingPlayer][defender].faceUp)
        {
         showFaceDown(defender);    
        }
        int defence = table.monsterZone[defendingPlayer][defender].currentCard.defence; 
        int attack = table.monsterZone[attackingPlayer][attacker].currentCard.attack;
        if(defence > attack)
        {
            changePlayerLifePoints(attackingPlayer, defence-attack);
        }
        else if(defence < attack)
        {
            destroyCard(defender,defendingPlayer,MONSTER);
        }
    }
    private static void destroyCard(int cardToDestroy,int player,int cardType)
    {
        switch(cardType)
        {
            case SPELL_TRAP:
                table.graveyard.get(player).add(table.spellZone[player][cardToDestroy].currentCard);
                table.spellZone[player][cardToDestroy] = null;
                break;
            case MONSTER:
                table.graveyard.get(player).add(table.monsterZone[player][cardToDestroy].currentCard);
                table.monsterZone[player][cardToDestroy] = null;
                break;
        }
    }
    public static void changePlayerLifePoints(int player, int amount)
    {
        table.lifepoints[player]+=amount;
    }
    private static void showFaceDown(int feceDownCard)
    {
        
    }
    public static void changeDefenceValue(int value, int numberOfTurns,int player)
    {
        //TODO ask to choose a monster
        int zoneNumber =0;
        table.monsterZone[player][zoneNumber].defenceValue+=value;
        
    }
    public static void changeAttackValue(int value, int numberOfTurns,int player)
    {
        //TODO ask to choose a monster
        int zoneNumber =0;
        table.monsterZone[player][zoneNumber].defenceValue+=value;
        
    }
    public static void destroyTrap()
    {
        //TODO wait for select
       int traptoDestroy =0;
       int player =0;
       destroyCard(traptoDestroy, player, SPELL_TRAP);
    }
    public static void destroMonster(int player)
    {
        //TODO select monster
        int monsterToDestroy = 0;
        player=0;
        destroyCard(monsterToDestroy, player, MONSTER);
    }
    private static void changeBySubType(SubType subType, int value, int atkOrDef)
    {
        for(int i =0;i<2;i++)
        {
            for(int p=0;p<5;p++)
            {
                if(table.monsterZone[i][p]!=null)
                {
                    if(table.monsterZone[i][p].currentCard.subType==subType)
                    {
                        switch(atkOrDef)
                        {
                        case ATTACK:
                            table.monsterZone[i][p].attackValue+=value;
                            break;
                        case DEFENCE:
                            table.monsterZone[i][p].defenceValue+=value;
                            break;
                        }
                    }
                }
            }
        }
    }
    public static void changeAttackBySubType(SubType subType, int value)
    {
       changeBySubType(subType, value, ATTACK);
    }
    public static void changeDefenceBySubType(SubType subType, int value)
    {
        changeBySubType(subType, value, DEFENCE);
    }
   
            
}
