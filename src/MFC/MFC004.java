package MFC;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MFC004 extends Card
{
public MFC004()
{
 super("MFC","X-Head Cannon","MFC-004","/images/mfc/MFC-004.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.LIGHT,SubType.MACHINE,4,1800,1500,"A monster with a mighty cannon barrel, it is able to integrate its attacks. It attacks in many ways by combining and separating with other monsters.");
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