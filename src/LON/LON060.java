package LON;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LON060 extends Card
{
public LON060()
{
 super("LON","Lightning Conger","LON-060","/images/lon/LON-060.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.THUNDER,3,350,750,"This massive eel generates huge charges of electricity and unleashes them as thunderbolts.");
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