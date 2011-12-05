package PSV;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class PSV093 extends Card
{
public PSV093()
{
 super("PSV","The All-Seeing White Tiger","PSV-093","/images/psv/PSV-093.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.BEAST,3,1300,500,"A proud ruler of the jungle that some fear and others respect.");
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