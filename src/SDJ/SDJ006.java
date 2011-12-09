package SDJ;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDJ006 extends Card
{
public SDJ006()
{
 super("SDJ","Flame Manipulator","SDJ-006","/images/sdj/SDJ-006.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.FIRE,SubType.SPELLCASTER,3,900,1000,"This Spellcaster attacks enemies with fire-related spells such as \"Sea of Flames\" and \"Wall of Fire\".");
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