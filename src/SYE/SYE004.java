package SYE;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SYE004 extends Card
{
public SYE004()
{
 super("SYE","Winged Dragon, Guardian of the Fortress #1","SYE-004","/images/sye/SYE-004.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.DRAGON,4,1400,1200,"A dragon commonly found guarding mountain fortresses. Its signature attack is a sweeping dive from out of the blue.");
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