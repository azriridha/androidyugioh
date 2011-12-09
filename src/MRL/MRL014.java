package MRL;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class MRL014 extends Card
{
public MRL014()
{
 super("MRL","Fire Kraken","MRL-014","/images/mrl/MRL-014.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.FIRE,SubType.AQUA,4,1600,1500,"A squid that thrives on fire and heat.");
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