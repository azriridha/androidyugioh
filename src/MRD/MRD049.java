package MRD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRD049 extends Card
{
public MRD049()
{
 super("MRD","Hunter Spider","MRD-049","/images/mrd/MRD-049.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.EARTH,SubType.INSECT,5,1600,1400,"This monster feeds on whatever it catches in its web.");
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