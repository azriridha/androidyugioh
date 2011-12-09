package SDY;
import main.Card;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.SubType;
import main.CardAttriubtes.TrapTypes;
import main.table;
public  class SDY044 extends Card
{
public SDY044()
{
 super("SDY","Dragon Capture Jar","SDY-044","/images/sdy/SDY-044.jpg",CardType.TRAP,null,null,TrapTypes.CONTINUOUS,null,SubType.CONTINUOUS,-1,-1,-1,"All Dragon-Type monsters on the field are switched to Defense Position and remain in this position as long as this card is active.");
}  
    public void mainEffect(table gameTable,int mainPlayer)
    {
        
        
        
        
    }
    @Override
    public void secondEffect(table gameTable,int mainPlayer)
    {}
    @Override
    public void triggerEffect(Card cardPlayed, int player)
    {}
}