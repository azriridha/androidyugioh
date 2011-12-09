package SDP;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDP009 extends Card
{
public SDP009()
{
 super("SDP","Toon Alligator","SDP-009","/images/sdp/SDP-009.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.REPTILE,4,800,1600,"An alligator monster straight from the cartoons.");
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