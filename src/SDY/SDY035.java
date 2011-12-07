package SDY;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class SDY035 extends Card
{
public SDY035()
{
 super("SDY","Neo the Magic Swordsman","SDY-035","/images/sdy/SDY-035.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.LIGHT,SubType.SPELLCASTER,4,1700,1000,"A dimensional drifter who not only practices sorcery, but is also a sword and martial arts master.");
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