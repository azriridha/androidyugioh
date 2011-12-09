package MRD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRD008 extends Card
{
public MRD008()
{
 super("MRD","Harpie Lady","MRD-008","/images/mrd/MRD-008.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.WINGED_BEAST,4,1300,1400,"This human-shaped animal with wings is beautiful to watch but deadly in battle.");
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