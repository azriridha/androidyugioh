package SDY;
import main.Card;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.SubType;
import main.CardAttriubtes.TrapTypes;
import main.table;
import main.utils;
public  class SDY049 extends Card
{
public SDY049()
{
 super("SDY","Castle Walls","SDY-049","/images/sdy/SDY-049.jpg",CardType.TRAP,null,null,TrapTypes.NORMAL,null,SubType.NORMAL,-1,-1,-1,"Increase a selected monster's DEF by 500 points during the turn this card is activated.");
}  
    public void mainEffect(table gameTable,int mainPlayer)
    {}
    @Override
    public void secondEffect(table gameTable,int mainPlayer)
    {}
    @Override
    public void triggerEffect(Card cardPlayed, int player)
    {
        utils.changeDefenceValue(500, 1, player);
    }
}