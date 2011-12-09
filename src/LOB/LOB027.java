package LOB;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LOB027 extends Card
{
public LOB027()
{
 super("LOB","Aqua Madoor","LOB-027","/images/lob/LOB-027.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.SPELLCASTER,4,1200,2000,"A wizard of the waters that conjures a liquid wall to crush any enemies that oppose him.");
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