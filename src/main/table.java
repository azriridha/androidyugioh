package main;
import java.util.Vector;



public class table
{
    
    Vector<Vector<Card>> hands = new Vector<Vector<Card>>(2);
    Vector<Vector<Card>> deck = new Vector<Vector<Card>>(2);
    Vector<Vector<Card>> graveyard = new Vector<Vector<Card>>(2);
    Vector<Vector<Card>> fusionPile = new Vector<Vector<Card>>(2);
    Vector<Vector<Card>> outOfPlayPile = new Vector<Vector<Card>>(2); 
    //player one is hands.get(0);
    
    Card[][][] field = new Card[2][2][5];
//    player one
//    plyer one monster field = Card[0][1][0-4]
//    plyer one spell/trap field = Card[0][0][0-4]
    
//    player two
//    plyer two monster field = Card[1][1][0-4]
//    plyer two spell/trap field = Card[1][0][0-4]
    
    
    int[] lifepoints = new int[2];
    
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
    public void addSpellToField(Vector<Card> card,int player,boolean faceUp)
    {
        
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
        this.addCard(card, 1, player);
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
        
    }
    public void addCardsToOutOfPlayPile(Vector<Card> card,int player)
    {
        
    }
    public void attack(Card attackingCard, Card DefendingCard,int attackingPlayer)
    {
        
    }
    public void attack(Card attackingCard,int attackingPlayer)
    {
        
    }
    public Vector<Card> selectGrave(int player)
    {
        return this.graveyard.get(player);
    }
    
    /**
     * adds a card to the field depending on the part of the field and the player
     * @param card
     * @param part
     * @param player
     */
    private void addCard(Card card,int part, int player)
    {
        for(int i =0;i<5;i++)
        {
            if(field[player][part][i]==null)
            {
                field[player][part][i] =card;
                break;
            }
        }
    }
    
    
}


