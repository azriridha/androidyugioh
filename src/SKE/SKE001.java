package SKE;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SKE001 extends Card
{
public SKE001()
{
 super("SKE","Blue-Eyes White Dragon","SKE-001","/images/ske/SKE-001.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.LIGHT,SubType.DRAGON,8,3000,2500,"This legendary dragon is a powerful engine of destruction. Virtually invincible, Very few have faced this awesome creature and lived to tell the tale.");
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