package SDK;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDK009 extends Card
{
public SDK009()
{
 super("SDK","Kojikocy","SDK-009","/images/sdk/SDK-009.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.EARTH,SubType.WARRIOR,4,1500,1200,"A man-hunter with powerful arms that can crush boulders.");
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