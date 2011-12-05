package LON;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LON040 extends Card
{
public LON040()
{
 super("LON","Empress Mantis","LON-040","/images/lon/LON-040.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.INSECT,6,2200,1400,"Queen of an army of giant mantises whose command moves legions.");
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