package SDK;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDK017 extends Card
{
public SDK017()
{
 super("SDK","Unknown Warrior of Fiend","SDK-017","/images/sdk/SDK-017.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.WARRIOR,3,1000,500,"A deadly duo consisting of a beast master and its loyal servant.");
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