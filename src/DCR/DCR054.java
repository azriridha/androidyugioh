package DCR;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class DCR054 extends Card
{
public DCR054()
{
 super("DCR","Gagagigo","DCR-054","/images/dcr/DCR-054.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.REPTILE,4,1850,1000,"This young evildoer used to have an evil heart, but by meeting a special person, he discovered justice.");
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