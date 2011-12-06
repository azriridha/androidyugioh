package MRD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRD064 extends Card
{
public MRD064()
{
 super("MRD","Battle Steer","MRD-064","/images/mrd/MRD-064.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.EARTH,SubType.BEAST_WARRIOR,5,1800,1300,"A bull monster often found in the woods, it charges enemies with a pair of deadly horns.");
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