package MFC;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MFC007 extends Card
{
public MFC007()
{
 super("MFC","Dark Blade","MFC-007","/images/mfc/MFC-007.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.WARRIOR,4,1800,1500,"They say he is a dragon manipulating warrior from the dark world. His attack is tremendous, using his great swords with vicious power.");
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