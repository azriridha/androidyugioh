package SYE;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SYE002 extends Card
{
public SYE002()
{
 super("SYE","Mystical Elf","SYE-002","/images/sye/SYE-002.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.LIGHT,SubType.SPELLCASTER,4,800,2000,"A delicate elf that lacks offense, but has a terrific defense backed by mystical power.");
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