package LOB;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LOB117 extends Card
{
public LOB117()
{
 super("LOB","Succubus Knight","LOB-117","/images/lob/LOB-117.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.WARRIOR,5,1650,1300,"A warrior wizard adept in casting bone-chilling spells.");
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