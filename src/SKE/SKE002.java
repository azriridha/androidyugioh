package SKE;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SKE002 extends Card
{
public SKE002()
{
 super("SKE","Battle Ox","SKE-002","/images/ske/SKE-002.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.EARTH,SubType.BEAST_WARRIOR,4,1700,1000,"A monster with tremendous power, it destroys enemies with a swing of its axe.");
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