package main;

import java.util.Vector;

public class utils
{
private static final int MONSTER = 1;
private static final int SPELL = 0; 


public static void toManyCards(int player)
{
    int cards = table.hands.get(player).size()-5;
    //TODO sho dialog to remove x number of cards
    int[] dicard =new int[cards];
    Vector<Card> discard = new Vector<Card>();
    
        addCardToGrave(discard, player);
    
}
    public static void drawCards(int player, int numberOfCards)
    {
        for(int i =0;i<numberOfCards;i++)
        {
            Card toadd = table.deck.get(player).remove(i);
            table.hands.get(player).add(toadd);
        }
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
        table.graveyard.get(player).addAll(cardList);
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
    public static void addCard(int index,int player , MonsterZone monsterCard)
    {
        table.monsterZone[player][index] = monsterCard;
    }
    public static void addCard(int index,int player , SpellZone spellCard)
    {
        table.spellZone[player][index] = spellCard;
    }
    
    public static void attack(int attacker, int defender, int attackingPLayer, int defendingPlayer)
    {
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
    }
    private static void cardsAttack(int attacker, int defender, int attackingPlayer, int defendingPlayer)
    {
        
        if(!table.monsterZone[defendingPlayer][defender].faceUp)
        {
         showFaceDown(defender);    
        }
        int defence = table.monsterZone[defendingPlayer][defender].currentCard.defence; 
        int attack = table.monsterZone[attackingPlayer][attacker].currentCard.attack;
        if(defence > attack)
        {
            dmgPlayer(attackingPlayer, defence-attack);
        }
        else if(defence < attack)
        {
            destroyCard(defender,defendingPlayer,MONSTER);
        }
    }
    public static void destroyCard(int cardToDestroy,int player,int cardType)
    {
        switch(cardType)
        {
            case SPELL:
                table.graveyard.get(player).add(table.spellZone[player][cardToDestroy].currentCard);
                table.spellZone[player][cardToDestroy] = null;
                break;
            case MONSTER:
                table.graveyard.get(player).add(table.monsterZone[player][cardToDestroy].currentCard);
                table.monsterZone[player][cardToDestroy] = null;
                break;
        }
    }
    private static void dmgPlayer(int player, int amount)
    {
        table.lifepoints[player]-=amount;
    }
    private static void showFaceDown(int feceDownCard)
    {
        
    }
            
}
