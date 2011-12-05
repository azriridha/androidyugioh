package SYE;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SYE009 extends Card
{
public SYE009()
{
 super("SYE","Great White","SYE-009","/images/sye/SYE-009.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.FISH,4,1600,800,"A giant white shark with razor-sharp teeth.");
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