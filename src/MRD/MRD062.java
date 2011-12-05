package MRD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRD062 extends Card
{
public MRD062()
{
 super("MRD","Blackland Fire Dragon","MRD-062","/images/mrd/MRD-062.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.DRAGON,4,1500,800,"A dragon that dwells in the depths of darkness, its vulnerability lies in its poor eyesight.");
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