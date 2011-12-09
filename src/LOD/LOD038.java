package LOD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LOD038 extends Card
{
public LOD038()
{
 super("LOD","Lizard Soldier","LOD-038","/images/lod/LOD-038.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.DRAGON,3,1100,800,"A beast soldier derived from dragons, it is small for a Dragon-Type. Moving very quickly, this monster is an excellent strategist.");
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