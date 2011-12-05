package IOC;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class IOC060 extends Card
{
public IOC060()
{
 super("IOC","Terrorking Salmon","IOC-060","/images/ioc/IOC-060.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.FISH,5,2400,1000,"A feared salmon, master of the Sea of Darkness. Its roe is the best delicacy in the World of Darkness.");
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