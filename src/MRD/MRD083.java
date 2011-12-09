package MRD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRD083 extends Card
{
public MRD083()
{
 super("MRD","Guardian of the Labyrinth","MRD-083","/images/mrd/MRD-083.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.EARTH,SubType.WARRIOR,4,1000,1200,"A monster that guards the entrance to the Netherworld.");
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