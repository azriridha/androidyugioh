package SDY;
import main.Card;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.SubType;
import main.CardAttriubtes.SpellType;
import main.table;
public  class SDY021 extends Card
{
public SDY021()
{
 super("SDY","Book of Secret Arts","SDY-021","/images/sdy/SDY-021.jpg",CardType.SPELL,null,SpellType.NORMAL,null,null,SubType.NORMAL,-1,-1,-1,"A Spellcaster-Type monster equipped with this card increases its ATK and DEF by 300 points.");
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