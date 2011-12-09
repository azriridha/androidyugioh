package MRL;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRL103 extends Card
{
public MRL103()
{
 super("MRL","Serpent Night Dragon","MRL-103","/images/mrl/MRL-103.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.DRAGON,7,2350,2400,"A dragon created from the soul of a wicked knight.");
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