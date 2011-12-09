package LOB;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LOB014 extends Card
{
public LOB014()
{
 super("LOB","The 13th Grave","LOB-014","/images/lob/LOB-014.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.ZOMBIE,3,1200,900,"A zombie that suddenly appeared from plot #13 - an empty grave.");
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