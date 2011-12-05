package LOB;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LOB070 extends Card
{
public LOB070()
{
 super("LOB","Red-Eyes B. Dragon","LOB-070","/images/lob/LOB-070.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.DRAGON,7,2400,2000,"A ferocious dragon with a deadly attack.");
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