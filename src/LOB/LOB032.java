package LOB;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LOB032 extends Card
{
public LOB032()
{
 super("LOB","Root Water","LOB-032","/images/lob/LOB-032.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.FISH,3,900,800,"An amphibian capable of calling up a massive tidal wave from the dark seas to wipe out enemy monsters.");
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