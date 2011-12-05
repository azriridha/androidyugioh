package IOC;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class IOC057 extends Card
{
public IOC057()
{
 super("IOC","Mad Dog of Darkness","IOC-057","/images/ioc/IOC-057.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.BEAST,4,1900,1400,"He used to be a normal dog who played around in a park, but was corrupted by the power of darkness.");
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