package LON;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LON055 extends Card
{
public LON055()
{
 super("LON","Earthbound Spirit","LON-055","/images/lon/LON-055.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.EARTH,SubType.FIEND,4,500,2000,"A vengeful creature formed by the spirits of fallen warriors, it drags any who dare approach it into the deepest bowels of the earth.");
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