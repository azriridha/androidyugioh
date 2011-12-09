package YSD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class YSDEN001 extends Card
{
public YSDEN001()
{
 super("YSD","Gazelle the King of Mythical Beasts","YSD-EN001","/images/ysd/YSD-EN001.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.EARTH,SubType.BEAST,4,1500,1200,"This monster moves so fast that it looks like an illusion to mortal eyes.");
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