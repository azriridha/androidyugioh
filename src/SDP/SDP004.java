package SDP;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDP004 extends Card
{
public SDP004()
{
 super("SDP","Illusionist Faceless Mage","SDP-004","/images/sdp/SDP-004.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.SPELLCASTER,5,1200,2200,"Manipulates enemy attacks with the power of illusion.");
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