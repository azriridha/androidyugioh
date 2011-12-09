package PGD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class PGD054 extends Card
{
public PGD054()
{
 super("PGD","Kabazauls","PGD-054","/images/pgd/PGD-054.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.DINOSAUR,5,1700,1750,"A huge monster in the shape of a hippopotamus. The sneezing from his gigantic body is no fierce that people mistake it for a hurricane.");
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