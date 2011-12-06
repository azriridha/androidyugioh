package main;
import java.util.Vector;



public class table
{
    public static int SPELLZONE = 0;
    public static int MONSTERZONE = 1;
    
    Thread cardPlayedtrigger = new Thread(new Runnable() {
        
        @Override
        public void run()
        {
            Card playedcard = null;
            for(int i =0;i<triggerList.size();i++)
            {
                triggerList.get(0).triggerEffect(playedcard);
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
        graveyard.get(player).addAll(card);
    }
    public void addCardsToOutOfPlayPile(Vector<Card> card,int player)
    {
     outOfPlayPile.get(player).addAll(card);   
    }
    public void attack(Card attackingCard, Card DefendingCard,int attackingPlayer)
    {
        
    }
    public void attack(Card attackingCard,int attackingPlayer)
    {
        
    }
    public Vector<Card> selectGrave(int player)
    {
        return graveyard.get(player);
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
            case 1:
            for(int i =0;i<5;i++)
            {
                if(monsterZone[player][i]==null)
                {
                    monsterZone[player][i] = new MonsterZone(card,faceUp,defence);
                    break;
                }
            }
            break;
            case 0:
                for(int i =0;i<5;i++)
                {
                    if(spellZone[player][i]==null)
                    {
                        spellZone[player][i] = new SpellZone(card,faceUp);
                        break;
                    }
                }
                break;
        }
    }
    
    
    
}


