package MRL;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRL028 extends Card
{
public MRL028()
{
 super("MRL","Slot Machine","MRL-028","/images/mrl/MRL-028.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.MACHINE,7,2000,2300,"This machine's ability is said to vary according to its slot results");
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