package SDY;
import main.Card;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.SubType;
import main.CardAttriubtes.SpellType;
import main.table;
public  class SDY022 extends Card
{
public SDY022()
{
 super("SDY","Dark Hole","SDY-022","/images/sdy/SDY-022.jpg",CardType.SPELL,null,SpellType.NORMAL,null,null,SubType.NORMAL,-1,-1,-1,"Destroys all monsters on the field.");
}  
    public void mainEffect(table gameTable,int mainPlayer)
    {}
    @Override
    public void secondEffect(table gameTable,int mainPlayer)
    {}
    @Override
    public void triggerEffect(Card cardPlayed, int player)
    {}
}