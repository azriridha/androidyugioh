package SOD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SODEN001 extends Card
{
public SODEN001()
{
 super("SOD","Charcoal Inpachi","SOD-EN001","/images/sod/SOD-EN001.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.FIRE,SubType.PYRO,1,100,2100,"A wicked wooden spirit that has burned out. The barbecue grilled with this charcoal is so awesome that everybody thinks it's priceless.");
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