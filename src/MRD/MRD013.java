package MRD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRD013 extends Card
{
public MRD013()
{
 super("MRD","Armored Zombie","MRD-013","/images/mrd/MRD-013.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.ZOMBIE,3,1500,0,"This warrior blindly swings a deadly blade with devastating force.");
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