package SDY;
import main.Card;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.SubType;
import main.CardAttriubtes.TrapTypes;
import main.table;
public  class SDY028 extends Card
{
public SDY028()
{
 super("SDY","Two-Pronged Attack","SDY-028","/images/sdy/SDY-028.jpg",CardType.TRAP,null,null,TrapTypes.NORMAL,null,SubType.NORMAL,-1,-1,-1,"Select and destroy 2 of your monsters and 1 of your opponent's monsters.");
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