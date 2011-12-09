package MRL;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRL013 extends Card
{
public MRL013()
{
 super("MRL","Guardian of the Throne Room","MRL-013","/images/mrl/MRL-013.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.LIGHT,SubType.MACHINE,4,1650,1600,"A robot guard built to guard throne rooms, it is armed with homing missiles.");
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