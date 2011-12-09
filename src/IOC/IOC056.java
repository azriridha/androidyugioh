package IOC;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class IOC056 extends Card
{
public IOC056()
{
 super("IOC","Giga Gagagigo","IOC-056","/images/ioc/IOC-056.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.REPTILE,5,2450,1500,"In order to fight tremendous evil, he gained formidable power through body reconstruction, but lost his heart and his redemption.");
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