package SDY;
import main.Card;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDY033 extends Card
{
public SDY033()
{
 super("SDY","The Stern Mystic","SDY-033","/images/sdy/SDY-033.jpg",CardType.MONSTER,MonsterType.EFFECT,null,null,Attribute.LIGHT,SubType.SPELLCASTER,4,1500,1200,"FLIP: All face-down cards on the field are turned face-up, and then returned to their original position. No card effects are activated when cards are turned face-up.");
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