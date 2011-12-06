package MFC;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MFC058 extends Card
{
public MFC058()
{
 super("MFC","Luster Dragon","MFC-058","/images/mfc/MFC-058.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.DRAGON,4,1900,1600,"A very beautiful dragon covered with Sapphire. It does not like fights, but has incredibly high attack power.");
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