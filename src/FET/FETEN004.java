package FET;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class FETEN004 extends Card
{
public FETEN004()
{
 super("FET","Insect Knight","FET-EN004","/images/fet/FET-EN004.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.EARTH,SubType.INSECT,4,1900,1500,"Of all Insect fighters, he is the paragon of the Indestructible Insect Invaders, which only the elite of the elite can join.  We can no longer ignore their unmatched battle prowess.");
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