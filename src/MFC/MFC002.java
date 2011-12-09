package MFC;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MFC002 extends Card
{
public MFC002()
{
 super("MFC","Oppressed People","MFC-002","/images/mfc/MFC-002.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.AQUA,1,400,2000,"They are oppressed, but believe they will have their freedom someday.");
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