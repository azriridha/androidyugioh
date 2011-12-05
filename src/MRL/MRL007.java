package MRL;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRL007 extends Card
{
public MRL007()
{
 super("MRL","Metal Fish","MRL-007","/images/mrl/MRL-007.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.MACHINE,5,1600,1900,"A metal fish with a razor-sharp caudal fin.");
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