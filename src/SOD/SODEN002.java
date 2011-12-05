package SOD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SODEN002 extends Card
{
public SODEN002()
{
 super("SOD","Neo Aqua Madoor","SOD-EN002","/images/sod/SOD-EN002.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.SPELLCASTER,6,1200,3000,"The true nature of this wizard, who rules all water. It defends itself with a vast, impenetrable wall of ice.");
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