package LOB;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LOB080 extends Card
{
public LOB080()
{
 super("LOB","Terra the Terrible","LOB-080","/images/lob/LOB-080.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.FIEND,4,1200,1300,"Known as a swamp dweller, this creature is a minion of the dark forces.");
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