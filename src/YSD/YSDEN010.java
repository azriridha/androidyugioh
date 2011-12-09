package YSD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class YSDEN010 extends Card
{
public YSDEN010()
{
 super("YSD","Elemental Hero Sparkman","YSD-EN010","/images/ysd/YSD-EN010.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.LIGHT,SubType.WARRIOR,4,1600,1400,"An Elemental Hero and a warrior of light who proficiently wields many kinds of armaments. His Shining Surge Flash cuts off the path of villainy.");
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