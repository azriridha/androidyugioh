package PGD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class PGD053 extends Card
{
public PGD053()
{
 super("PGD","Master Kyonshee","PGD-053","/images/pgd/PGD-053.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.EARTH,SubType.ZOMBIE,4,1750,1000,"A wandering Kyonshee searching for a strong rival to defeat. They say he was known as the master of all martial arts.");
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