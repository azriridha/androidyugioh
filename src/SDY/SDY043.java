package SDY;
import main.Card;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDY043 extends Card
{
public SDY043()
{
 super("SDY","Trap Master","SDY-043","/images/sdy/SDY-043.jpg",CardType.MONSTER,MonsterType.EFFECT,null,null,Attribute.EARTH,SubType.WARRIOR,3,500,1100,"FLIP: Destroys 1 Trap Card on the field. If this card's target is face-down, flip it face-up. If this card is a Trap Card, it is destroyed. If not, it is returned to its face-down position. The flipped card is not activated.");
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