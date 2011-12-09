package LOB;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LOB009 extends Card
{
public LOB009()
{
 super("LOB","Mammoth Graveyard","LOB-009","/images/lob/LOB-009.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.EARTH,SubType.DINOSAUR,3,1200,800,"A mammoth that protects the graves of its pack and is absolutely merciless when facing grave-robbers.");
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