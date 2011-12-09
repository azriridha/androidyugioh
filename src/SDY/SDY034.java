package SDY;
import main.Card;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDY034 extends Card
{
public SDY034()
{
 super("SDY","Wall of Illusion","SDY-034","/images/sdy/SDY-034.jpg",CardType.MONSTER,MonsterType.EFFECT,null,null,Attribute.DARK,SubType.FIEND,4,1000,1850,"The monster attacking this creature is returned to its owner's hand. Any damage resulting from the attack is calculated normally.");
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