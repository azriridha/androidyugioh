package MRD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRD122 extends Card
{
public MRD122()
{
 super("MRD","Blue-Winged Crown","MRD-122","/images/mrd/MRD-122.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WIND,SubType.WINGED_BEAST,4,1600,1200,"With hair shaped like a crown and a body incased in bluish white flames, this bird is a formidable sight.");
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