package LOB;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LOB023 extends Card
{
public LOB023()
{
 super("LOB","Turtle Tiger","LOB-023","/images/lob/LOB-023.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.AQUA,4,1000,1500,"A tiger encased in a protective shell that attacks with razor-sharp fangs.");
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