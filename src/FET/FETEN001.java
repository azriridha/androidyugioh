package FET;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class FETEN001 extends Card
{
public FETEN001()
{
 super("FET","Space Mambo","FET-EN001","/images/fet/FET-EN001.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.FISH,4,1700,1000,"A Space Mambo floating in the vast universe. This living relic was found in the ruins of a super civilization on Alphard 4.");
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