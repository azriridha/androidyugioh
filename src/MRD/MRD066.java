package MRD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRD066 extends Card
{
public MRD066()
{
 super("MRD","Saggi the Dark Clown","MRD-066","/images/mrd/MRD-066.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.SPELLCASTER,3,600,1500,"This clown appears from nowhere and executes very strange moves to avoid enemy attacks.");
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