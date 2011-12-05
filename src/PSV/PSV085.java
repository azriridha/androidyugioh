package PSV;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class PSV085 extends Card
{
public PSV085()
{
 super("PSV","Girochin Kuwagata","PSV-085","/images/psv/PSV-085.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.INSECT,4,1700,1000,"Despite its small size, this monster has powerful jaws that can rip metal to shreds.");
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