package MRL;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRL021 extends Card
{
public MRL021()
{
 super("MRL","Mechanical Snail","MRL-021","/images/mrl/MRL-021.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.MACHINE,3,800,1000,"A cyborg snail that still travels at a slow place.");
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