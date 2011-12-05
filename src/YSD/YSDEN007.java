package YSD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class YSDEN007 extends Card
{
public YSDEN007()
{
 super("YSD","Elemental Hero Avian","YSD-EN007","/images/ysd/YSD-EN007.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.WARRIOR,3,1000,1000,"A winged Elemental Hero who wheels through the sky and manipulates the wind. His signature move, Featherbreak, gives villainy a blow from sky-high.");
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