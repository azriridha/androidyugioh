package SDK;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDK006 extends Card
{
public SDK006()
{
 super("SDK","Koumori Dragon","SDK-006","/images/sdk/SDK-006.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.DRAGON,4,1500,1200,"A vicious, fire-breathing dragon whose wicked flame corrupts the souls of its victims.");
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