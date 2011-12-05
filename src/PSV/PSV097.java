package PSV;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class PSV097 extends Card
{
public PSV097()
{
 super("PSV","Science Soldier","PSV-097","/images/psv/PSV-097.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.WARRIOR,3,800,800,"Soldiers equipped with state-of-the-art weaponry to face unknown creatures.");
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