package SDK;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDK025 extends Card
{
public SDK025()
{
 super("SDK","Swordstalker","SDK-025","/images/sdk/SDK-025.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.WARRIOR,6,2000,1600,"A monster formed by the vengeful souls of those who passed away in battle.");
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