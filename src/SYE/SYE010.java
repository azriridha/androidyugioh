package SYE;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SYE010 extends Card
{
public SYE010()
{
 super("SYE","Giant Soldier of Stone","SYE-010","/images/sye/SYE-010.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.EARTH,SubType.ROCK,3,1300,2000,"A giant warrior made of stone. A punch from this creature has earth-shaking results.");
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