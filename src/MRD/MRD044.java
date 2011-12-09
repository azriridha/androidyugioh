package MRD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRD044 extends Card
{
public MRD044()
{
 super("MRD","Mega Thunderball","MRD-044","/images/mrd/MRD-044.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.THUNDER,2,750,600,"Rolls along the ground releasing bolts of electricity to attack its enemies.");
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