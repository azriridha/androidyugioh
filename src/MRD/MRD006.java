package MRD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRD006 extends Card
{
public MRD006()
{
 super("MRD","Killer Needle","MRD-006","/images/mrd/MRD-006.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.INSECT,4,1200,1000,"A huge bee with exceptional strength that's particularly dangerous in a swarm.");
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