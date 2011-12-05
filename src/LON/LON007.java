package LON;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LON007 extends Card
{
public LON007()
{
 super("LON","Flying Fish","LON-007","/images/lon/LON-007.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.FISH,4,800,500,"Three wishes are granted to those fortunate enough to see this monster in flight.");
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