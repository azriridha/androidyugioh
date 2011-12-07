package SDY;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDY036 extends Card
{
public SDY036()
{
 super("SDY","Baron of the Fiend Sword","SDY-036","/images/sdy/SDY-036.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.FIEND,4,1550,800,"An aristocrat who wields a sword possessed by a malicious spirit that preys on the weak.");
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