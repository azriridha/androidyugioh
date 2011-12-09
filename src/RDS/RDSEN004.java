package RDS;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class RDSEN004 extends Card
{
public RDSEN004()
{
 super("RDS","Harpie Girl","RDS-EN004","/images/rds/RDS-EN004.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.WINGED_BEAST,2,500,500,"A Harpie chick who aspires to flit about beautifully and gorgeously, but attack sharply.");
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