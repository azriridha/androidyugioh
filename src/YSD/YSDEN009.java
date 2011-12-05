package YSD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class YSDEN009 extends Card
{
public YSDEN009()
{
 super("YSD","Elemental Hero Clayman","YSD-EN009","/images/ysd/YSD-EN009.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.EARTH,SubType.WARRIOR,4,800,2000,"An Elemental Hero with a clay body built-to-last. He will preserve his Elemental Hero colleagues at any cost.");
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