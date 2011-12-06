package SDY1;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDY014 extends Card
{
public SDY014()
{
 super("SDY","Dragon Zombie","SDY-014","/images/sdy/SDY-014.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.ZOMBIE,3,1600,0,"A dragon revived by sorcery. Its breath is highly corrosive.");
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