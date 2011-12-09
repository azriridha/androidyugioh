package SDY;
import main.Card;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.SubType;
import main.CardAttriubtes.SpellType;
import main.table;
public  class SDY030 extends Card
{
public SDY030()
{
 super("SDY","Monster Reborn","SDY-030","/images/sdy/SDY-030.jpg",CardType.SPELL,null,SpellType.NORMAL,null,null,SubType.NORMAL,-1,-1,-1,"Select 1 Monster Card from either your opponent's or your own graveyard and place it on the field under your control in Attack or Defense Position (face-up). This is considered a Special Summon");
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