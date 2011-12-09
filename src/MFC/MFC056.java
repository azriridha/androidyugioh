package MFC;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MFC056 extends Card
{
public MFC056()
{
 super("MFC","Aitsu","MFC-056","/images/mfc/MFC-056.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.FIRE,SubType.FAIRY,5,100,100,"He seems to be very unreliable, but he might have incredible potential.");
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