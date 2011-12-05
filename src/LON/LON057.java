package LON;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LON057 extends Card
{
public LON057()
{
 super("LON","Boneheimer","LON-057","/images/lon/LON-057.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.AQUA,3,850,400,"This monster wanders the seas, sucking dry any creatures it may encounter.");
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