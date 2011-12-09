package SDY;
import main.Card;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.SubType;
import main.CardAttriubtes.SpellType;
import main.table;
public  class SDY039 extends Card
{
public SDY039()
{
 super("SDY","Last Will","SDY-039","/images/sdy/SDY-039.jpg",CardType.SPELL,null,SpellType.NORMAL,null,null,SubType.NORMAL,-1,-1,-1,"If a monster of yours is sent from the field to the Graveyard during the turn you played this card, you can select a monster with an ATK of 1500 or less from your deck and play it as a Special Summon. Shuffle the Deck after playing the card. This card is active for 1`turn only.");
}  
    public void mainEffect(table gameTable,int mainPlayer)
    {}
    @Override
    public void secondEffect(table gameTable,int mainPlayer)
    {}
    @Override
    public void triggerEffect(Card cardPlayed)
    {}
}