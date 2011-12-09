package MRD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRD074 extends Card
{
public MRD074()
{
 super("MRD","King of Yamimakai","MRD-074","/images/mrd/MRD-074.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.FIEND,5,2000,1530,"Wields the power of darkness to destroy its enemies.");
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