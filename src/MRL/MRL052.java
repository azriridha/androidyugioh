package MRL;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRL052 extends Card
{
public MRL052()
{
 super("MRL","Octoberser","MRL-052","/images/mrl/MRL-052.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.AQUA,5,1600,1400,"With the head of a fish and the legs of an octopus, this strange creature attacks enemies by flinging spears.");
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