package PSV;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class PSV092 extends Card
{
public PSV092()
{
 super("PSV","Skull Mariner","PSV-092","/images/psv/PSV-092.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.WARRIOR,4,1600,900,"A pirate ship that appears out of the mist and sinks any seagoing vessels.");
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