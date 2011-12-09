package PGD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class PGD002 extends Card
{
public PGD002()
{
 super("PGD","Shapesnatch","PGD-002","/images/pgd/PGD-002.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.MACHINE,5,1200,1700,"A bow tie with horrible power, it attacks an opponent by controlling others.");
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