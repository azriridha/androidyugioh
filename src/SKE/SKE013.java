package SKE;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SKE013 extends Card
{
public SKE013()
{
 super("SKE","The Dragon Dwelling in the Cave","SKE-013","/images/ske/SKE-013.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.DRAGON,4,1300,2000,"A huge dragon dwelling in a cave. It is horrible when it gets angry, although it is usually quiet. It is said to preserve certain treasures.");
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