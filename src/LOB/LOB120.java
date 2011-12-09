package LOB;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LOB120 extends Card
{
public LOB120()
{
 super("LOB","Right Leg of the Forbidden One","LOB-120","/images/lob/LOB-120.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.SPELLCASTER,1,200,300,"A forbidden right leg sealed by magic. Whosoever breaks the seal will know infinite power.");
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