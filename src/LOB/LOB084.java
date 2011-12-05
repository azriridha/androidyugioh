package LOB;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LOB084 extends Card
{
public LOB084()
{
 super("LOB","Enchanting Mermaid","LOB-084","/images/lob/LOB-084.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.FISH,3,1200,900,"A beautiful mermaid that lures voyagers to a watery death.");
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