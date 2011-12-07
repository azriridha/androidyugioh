package SDY;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDY001 extends Card
{
public SDY001()
{
 super("SDY","Mystical Elf","SDY-001","/images/sdy/SDY-001.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.LIGHT,SubType.SPELLCASTER,4,800,2000,"A delicate elf that lacks offense, but has a terrific defense backed up by mystical power.");
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