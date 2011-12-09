package SDY;
import main.Card;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.SubType;
import main.CardAttriubtes.SpellType;
import main.table;
public  class SDY026 extends Card
{
public SDY026()
{
 super("SDY","Fissure","SDY-026","/images/sdy/SDY-026.jpg",CardType.SPELL,null,SpellType.NORMAL,null,null,SubType.NORMAL,-1,-1,-1,"Destroys 1 face-up monster with the lowest attack.");
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