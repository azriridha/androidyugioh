package LOB;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LOB039 extends Card
{
public LOB039()
{
 super("LOB","Kurama","LOB-039","/images/lob/LOB-039.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.WINGED_BEAST,3,800,800,"A vicious bird that attacks from the skies with its whip-like tail.");
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