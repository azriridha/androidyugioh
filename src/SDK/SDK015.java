package SDK;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDK015 extends Card
{
public SDK015()
{
 super("SDK","Dark Assailant","SDK-015","/images/sdk/SDK-015.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.ZOMBIE,4,1200,1200,"Armed with the Psycho Sword, this sinister assassin rules the bad land.");
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