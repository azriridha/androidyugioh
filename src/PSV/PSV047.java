package PSV;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class PSV047 extends Card
{
public PSV047()
{
 super("PSV","Cyber Falcon","PSV-047","/images/psv/PSV-047.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.MACHINE,4,1400,1200,"A jet-powered hawk that travels at the speed of sound.");
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