package LOD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LOD009 extends Card
{
public LOD009()
{
 super("LOD","Opticlops","LOD-009","/images/lod/LOD-009.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.FIEND,4,1800,1700,"A one-eyed giant that serves the \"Dark Ruler Ha Des\", it skewers its enemies with its sharp horn, shattering them to pieces.");
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