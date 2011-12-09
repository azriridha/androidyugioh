package DCR;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class DCR003 extends Card
{
public DCR003()
{
 super("DCR","Acrobat Monkey","DCR-003","/images/dcr/DCR-003.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.EARTH,SubType.MACHINE,3,1000,1800,"An autonomous monkey type robot which was developed with cutting-edge technology. It moves very acrobatically.");
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