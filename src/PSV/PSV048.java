package PSV;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class PSV048 extends Card
{
public PSV048()
{
 super("PSV","Flying Kamakiri #2","PSV-048","/images/psv/PSV-048.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.INSECT,4,1500,800,"A flying mantis that feeds primarily on insects.");
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