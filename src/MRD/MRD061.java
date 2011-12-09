package MRD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRD061 extends Card
{
public MRD061()
{
 super("MRD","Baby Dragon","MRD-061","/images/mrd/MRD-061.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.DRAGON,3,1200,700,"Much more than just a child, this dragon is gifted with untapped power.");
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