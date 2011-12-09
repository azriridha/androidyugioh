package LOB;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LOB081 extends Card
{
public LOB081()
{
 super("LOB","Frenzied Panda","LOB-081","/images/lob/LOB-081.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.EARTH,SubType.BEAST,4,1200,1000,"A savage beast that carries a big bamboo stick for beating down its enemies.");
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