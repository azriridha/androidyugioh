package MFC;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MFC003 extends Card
{
public MFC003()
{
 super("MFC","United Resistance","MFC-003","/images/mfc/MFC-003.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.THUNDER,3,1000,400,"The people that gather to swear to fight their oppressors. A revolution is cooking.");
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