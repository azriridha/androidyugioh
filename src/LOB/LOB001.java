package LOB;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LOB001 extends Card
{
public LOB001()
{
 super("LOB","Blue-Eyes White Dragon","LOB-001","/images/lob/LOB-001.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.LIGHT,SubType.DRAGON,8,3000,2500,"This legendary dragon is a powerful engine of destruction. Virtually invincible, Very few have faced this awesome creature and lived to tell the tale.");
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