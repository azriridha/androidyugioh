package SKE;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SKE014 extends Card
{
public SKE014()
{
 super("SKE","Luster Dragon #2","SKE-014","/images/ske/SKE-014.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.DRAGON,6,2400,1400,"This dragon feeds on emerald. Enchanted by this monster even when attacked, few people live to tell of its beauty.");
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