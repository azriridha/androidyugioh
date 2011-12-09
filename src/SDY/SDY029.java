package SDY;
import main.Card;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.SubType;
import main.CardAttriubtes.SpellType;
import main.table;
public  class SDY029 extends Card
{
public SDY029()
{
 super("SDY","De-Spell","SDY-029","/images/sdy/SDY-029.jpg",CardType.SPELL,null,SpellType.NORMAL,null,null,SubType.NORMAL,-1,-1,-1,"Destroys 1 Magic Card on the field. If this card's target is face-down, turn it face-up. If the card is a Magic Card, it is destroyed. If not, it is returned to its face-down position. The flipped card is not activated.");
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