package MFC;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MFC055 extends Card
{
public MFC055()
{
 super("MFC","Great Angus","MFC-055","/images/mfc/MFC-055.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.FIRE,SubType.BEAST,4,1800,600,"A very violent beast, it is always berserk. People say that they have never seen it silent.");
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