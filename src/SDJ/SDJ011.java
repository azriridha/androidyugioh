package SDJ;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDJ011 extends Card
{
public SDJ011()
{
 super("SDJ","Harpie's Brother","SDJ-011","/images/sdj/SDJ-011.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.WINGED-BEAST,4,1800,600,"With eyes like a hawk and a flying speed exceeding Mach 5, this monster is a master of the sky.");
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