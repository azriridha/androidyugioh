package DCR;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class DCR002 extends Card
{
public DCR002()
{
 super("DCR","Nin-Ken Dog","DCR-002","/images/dcr/DCR-002.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.BEAST_WARRIOR,4,1800,1000,"A Ninja dog who has mastered extreme Ninjitsu. Through hard training, it learned the technique to metamorphose into a human being.");
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