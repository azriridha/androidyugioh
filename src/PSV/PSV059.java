package PSV;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class PSV059 extends Card
{
public PSV059()
{
 super("PSV","Oni Tank T-34","PSV-059","/images/psv/PSV-059.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.EARTH,SubType.MACHINE,4,1400,1700,"An armored tank possessed by a fiend that will pursue enemies until they're crushed.");
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