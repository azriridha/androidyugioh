package SDJ;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDJ008 extends Card
{
public SDJ008()
{
 super("SDJ","7 Colored Fish","SDJ-008","/images/sdj/SDJ-008.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.FISH,4,1800,800,"A rare rainbow fish that has never been caught by mortal man.");
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