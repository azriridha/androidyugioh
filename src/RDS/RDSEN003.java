package RDS;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class RDSEN003 extends Card
{
public RDSEN003()
{
 super("RDS","Bokoichi the Freightening Car","RDS-EN003","/images/rds/RDS-EN003.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.MACHINE,2,500,500,"A freight car that is exclusively for Dekoichi. It can transport anything, but most cargo arrives broken.");
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