package MRL;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRL009 extends Card
{
public MRL009()
{
 super("MRL","Queen Bird","MRL-009","/images/mrl/MRL-009.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.WINGED_BEAST,5,1200,2000,"This monster attacks using its huge beak.");
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