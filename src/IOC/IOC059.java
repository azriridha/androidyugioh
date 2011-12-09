package IOC;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class IOC059 extends Card
{
public IOC059()
{
 super("IOC","Sea Serpent Warrior of Darkness","IOC-059","/images/ioc/IOC-059.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.SEA_SERPENT,4,1800,1500,"A warrior who defends the world of the Sea of Darkness. He prides himself on his fighting prowess both on the ground and, of course, in the water.");
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