package SDY;
import main.Card;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.SubType;
import main.CardAttriubtes.TrapTypes;
import main.table;
public  class SDY027 extends Card
{
public SDY027()
{
 super("SDY","Trap Hole","SDY-027","/images/sdy/SDY-027.jpg",CardType.TRAP,null,null,TrapTypes.NORMAL,null,SubType.NORMAL,-1,-1,-1,"If the ATK of a monster summoned by your opponent (excluding Special Summon) is 1000 or more, the monster is destroyed.");
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