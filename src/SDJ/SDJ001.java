package SDJ;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDJ001 extends Card
{
public SDJ001()
{
 super("SDJ","Red-Eyes B. Dragon","SDJ-001","/images/sdj/SDJ-001.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.DRAGON,7,2400,2000,"A ferocious dragon with a deadly attack.");
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