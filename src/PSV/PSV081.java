package PSV;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class PSV081 extends Card
{
public PSV081()
{
 super("PSV","Spikebot","PSV-081","/images/psv/PSV-081.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.MACHINE,5,1800,1700,"A mechanical soldier created by a wicked sorcerer, it attacks with the two steel balls attached to its arms.");
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