package IOC;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class IOC002 extends Card
{
public IOC002()
{
 super("IOC","Ojama Black","IOC-002","/images/ioc/IOC-002.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.LIGHT,SubType.BEAST,2,0,1000,"He's one of the Ojama Trio. It's said that he butts in by any means necessary. It's also said that when the three are together, something happens.");
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