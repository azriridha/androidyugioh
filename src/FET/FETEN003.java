package FET;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class FETEN003 extends Card
{
public FETEN003()
{
 super("FET","Chu-Ske The Mouse Fighter","FET-EN003","/images/fet/FET-EN003.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.EARTH,SubType.BEAST,3,1200,0,"A fiery mouse, travelling the world to become the strongest fighter in the world of mice.  Be careful not to touch him, or you will get burned.");
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