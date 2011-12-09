package YSD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class YSDEN008 extends Card
{
public YSDEN008()
{
 super("YSD","Elemental Hero Burstinatrix","YSD-EN008","/images/ysd/YSD-EN008.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.FIRE,SubType.WARRIOR,3,1200,800,"A flame manipulator who is the only woman among the Elemental Heroes. Her Burstfire burns away villainy.");
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