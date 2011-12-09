package SDY;
import main.Card;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.SubType;
import main.CardAttriubtes.TrapTypes;
import main.table;
public  class SDY050 extends Card
{
public SDY050()
{
 super("SDY","Ultimate Offering","SDY-050","/images/sdy/SDY-050.jpg",CardType.TRAP,null,null,TrapTypes.CONTINUOUS,null,SubType.CONTINUOUS,-1,-1,-1,"At the cost of 500 Life Points per monster, a player is allowed an extra Normal Summon, Tribute Summon, or Set.");
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