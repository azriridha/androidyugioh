package SKE;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SKE010 extends Card
{
public SKE010()
{
 super("SKE","Skull Red Bird","SKE-010","/images/ske/SKE-010.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.WINGED-BEAST,4,1550,1200,"This monster swoops down and attacks with a rain of knives stored in its wings.");
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