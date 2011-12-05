package MRL;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRL025 extends Card
{
public MRL025()
{
 super("MRL","High Tide Gyojin","MRL-025","/images/mrl/MRL-025.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.AQUA,4,1650,1300,"A very agile half-fish warrior known for its relentless attacks.");
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