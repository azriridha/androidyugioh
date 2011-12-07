package SDY;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDY006 extends Card
{
public SDY006()
{
 super("SDY","Dark Magician","SDY-006","/images/sdy/SDY-006.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.SPELLCASTER,7,2500,2100,"The ultimate wizard in the terms of attack and defense.");
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