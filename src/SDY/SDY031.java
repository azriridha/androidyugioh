package SDY;
import main.Card;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.SubType;
import main.CardAttriubtes.TrapTypes;
import main.table;
public  class SDY031 extends Card
{
public SDY031()
{
 super("SDY","Reinforcements","SDY-031","/images/sdy/SDY-031.jpg",CardType.TRAP,null,null,TrapTypes.NORMAL,null,SubType.NORMAL,-1,-1,-1,"Increase 1 selected monster's ATK by 500 points during the turn this card is activated.");
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