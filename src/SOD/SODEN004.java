package SOD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SODEN004 extends Card
{
public SODEN004()
{
 super("SOD","Goblin Calligrapher","SOD-EN004","/images/sod/SOD-EN004.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.FIEND,1,400,400,"A Goblin who devotes himself to perfect calligraphy of the word \"False\". He gives his all to each stroke.");
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