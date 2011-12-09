package SDY;
import main.Card;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.SubType;
import main.CardAttriubtes.TrapTypes;
import main.table;
public  class SDY047 extends Card
{
public SDY047()
{
 super("SDY","Reverse Trap","SDY-047","/images/sdy/SDY-047.jpg",CardType.TRAP,null,null,TrapTypes.NORMAL,null,SubType.NORMAL,-1,-1,-1,"All increases and decreases to ATK and DEF are reversed for the turn in which this card is activated.");
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