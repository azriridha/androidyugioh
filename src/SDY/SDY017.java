package SDY;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDY017 extends Card
{
public SDY017()
{
 super("SDY","Witty Phantom","SDY-017","/images/sdy/SDY-017.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.FIEND,4,1400,1300,"Dressed in a night-black tuxedo, this creature presides over death.");
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