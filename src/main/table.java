package main;
import java.util.Vector;



public class table
{
    public static final int SPELLZONE = 0;
    public static final int MONSTERZONE = 1;
    public static final int PLAYER1 = 1;
    public static final int PLAYER2 = 2;
    
    Thread cardPlayedtrigger = new Thread(new Runnable() {
        
        @Override
        public void run()
        {
            Card playedcard = null;
            for(int i =0;i<triggerList.size();i++)
            {
                triggerList.get(0).triggerEffect(playedcard, null);
            }
        }
    });
    public static Vector<Card> triggerList = new Vector<Card>();
    public static Vector<Vector<Card>> hands = new Vector<Vector<Card>>(2);
    public static Vector<Vector<Card>> deck = new Vector<Vector<Card>>(2);
    public static Vector<Vector<Card>> graveyard = new Vector<Vector<Card>>(2);
    public static Vector<Vector<Card>> fusionPile = new Vector<Vector<Card>>(2);
    public static Vector<Vector<Card>> outOfPlayPile = new Vector<Vector<Card>>(2); 
    //player one is hands.get(0);
    
    public static MonsterZone[][] monsterZone = new MonsterZone[2][5];
    public static SpellZone[][] spellZone = new SpellZone[2][5];
    
    public static int[] lifepoints = new int[2];
    
    public static boolean[] canSummon = new boolean[2];
    
    
    public void drawCard(int player, int numberOfCards)
    {
        utils.drawCards(player, numberOfCards);
    }
/**
 * Adds a card to the field in atk/def faceup/down
 * @param card
 * @param player
 * @param faceUp
 * @param defence
 */
    public void addCardsToField(Card card,int player,boolean faceUp,boolean defence)
    {
        
    }
    /**
     * Adds a spell card to the field
     * @param card
     * @param player
     * @param faceUp
     */
    public void addSpellToField(Card card,int player,boolean faceUp)
    {
        this.addCard(card, SPELLZONE, player,faceUp,false);
    }
    /**
     * adds a monster card to the field
     * @param card
     * @param player
     * @param faceUp
     * @param defence
     */
    public void addMonsterToField(Card card,int player,boolean faceUp,boolean defence)
    {
        this.addCard(card, MONSTERZONE, player,faceUp,defence);
    }
    /**
     * adds a monster card to the field and asks if it is in defence 
     * @param card
     * @param player
     * @param faceUp
     */
    public void addMonsterToField(Card card,int player,boolean faceUp)
    {
        //TODO make ask dialog
        boolean defence = utils.askDefence(card);
        
        this.addMonsterToField(card, player, faceUp, defence);
    }
    /**
     * adds a monster card to the field and asks if it is faceup and in defence 
     * @param card
     * @param player
     */
    public void addMonsterToField(Card card,int player)
    {
        //TODO make ask dialog
        boolean defence = utils.askDefence(card);
        boolean faceUp = utils.askFaceUp(card);
        
        this.addMonsterToField(card, player, faceUp, defence);
    }
   
    public void addCardsToGraveyard(Vector<Card> card,int player)
    {
        utils.addCardToGrave(card, player);   
    }
    public void addCardsToOutOfPlayPile(Vector<Card> card,int player)
    {
        utils.addCardToOutOfPlay(card, player);   
    }
    public void attack(int attackingCard, int DefendingCard,int attackingPlayer)
    {
        utils.attack(attackingCard, DefendingCard, attackingPlayer, (attackingPlayer==PLAYER1)? PLAYER2:PLAYER1);
    }
    public void attack(int attackingCard,int attackingPlayer)
    {
        utils.attack(attackingCard, -1, attackingPlayer, (attackingPlayer==PLAYER1)? PLAYER2:PLAYER1);
    }
    public Vector<Card> selectGrave(int player, int numberOfCards)
    {
        return utils.chooseCards(graveyard.get(player), numberOfCards);
    }
    
    /**
     * adds a card to the field depending on the part of the field and the player
     * @param card
     * @param zone
     * @param player
     */
    private void addCard(Card card,int zone, int player,boolean faceUp,boolean defence)
    {
        switch(zone)
        {
            case MONSTERZONE:
            for(int i =0;i<5;i++)
            {
                if(monsterZone[player][i]==null)
                {
                    utils.addCard(i, player, new MonsterZone(card,faceUp,defence));
                    break;
                }
            }
            break;
            case SPELLZONE:
                for(int i =0;i<5;i++)
                {
                    if(spellZone[player][i]==null)
                    {       
                        utils.addCard(i, player, new SpellZone(card,faceUp));
                        break;
                    }
                }
                break;
        }
    }
    
    
    
}


