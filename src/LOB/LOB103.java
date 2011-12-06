package LOB;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LOB103 extends Card
{
public LOB103()
{
 super("LOB","Spike Seadra","LOB-103","/images/lob/LOB-103.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.SEA_SERPENT,5,1600,1300,"Using the spikes sprouting from its body, this creature stabs its opponents and floods them with electricity.");
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