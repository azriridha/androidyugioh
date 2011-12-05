package LOB;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LOB030 extends Card
{
public LOB030()
{
 super("LOB","Two-Mouth Darkruler","LOB-030","/images/lob/LOB-030.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.EARTH,SubType.DRAGON,3,900,700,"A dinosaur with two deadly jaws, it stores electricity in its horn and releases high voltage bolts from the mouth on its back.");
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