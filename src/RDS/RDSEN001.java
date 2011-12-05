package RDS;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class RDSEN001 extends Card
{
public RDSEN001()
{
 super("RDS","Woodborg Inpachi","RDS-EN001","/images/rds/RDS-EN001.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.FIRE,SubType.MACHINE,5,500,2500,"The new form of the enigmatic Inpachi, remodeled by cutting-edge Dark World technology. Maneuverability has been sacrificed for strong armor, which was considered more important.");
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