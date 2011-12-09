package SDK;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDK008 extends Card
{
public SDK008()
{
 super("SDK","Rogue Doll","SDK-008","/images/sdk/SDK-008.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.LIGHT,SubType.SPELLCASTER,4,1600,1000,"A deadly doll gifted with mystical power, it is particularly powerful when attacking against dark forces.");
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