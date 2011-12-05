package SDK;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDK001 extends Card
{
public SDK001()
{
 super("SDK","Blue-Eyes White Dragon","SDK-001","/images/sdk/SDK-001.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.LIGHT,SubType.DRAGON,8,3000,2500,"This legendary dragon is a powerful engine of destruction. Virtually invincible, Very few have faced this awesome creature and lived to tell the tale.");
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