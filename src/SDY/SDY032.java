package SDY;
import main.Card;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.SubType;
import main.CardAttriubtes.SpellType;
import main.table;
public  class SDY032 extends Card
{
public SDY032()
{
 super("SDY","Change of Heart","SDY-032","/images/sdy/SDY-032.jpg",CardType.SPELL,null,SpellType.NORMAL,null,null,SubType.NORMAL,-1,-1,-1,"Select and control 1 opposing monster (regardless of position) on the field until the end of your turn.");
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