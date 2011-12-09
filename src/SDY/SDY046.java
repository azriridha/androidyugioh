package SDY;
import main.Card;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
import main.utils;
public  class SDY046 extends Card
{
public SDY046()
{
 super("SDY","Man-Eater Bug","SDY-046","/images/sdy/SDY-046.jpg",CardType.MONSTER,MonsterType.EFFECT,null,null,Attribute.EARTH,SubType.INSECT,2,450,600,"FLIP: Destroys 1 monster on the field (regardless of position).");
}  
    public void mainEffect(table gameTable,int mainPlayer)
    {}
    @Override
    public void secondEffect(table gameTable,int mainPlayer)
    {}
    @Override
    public void triggerEffect(Card cardPlayed, int player)
    {
        if(cardPlayed.getFlipped())
        {
            utils.destroMonster(player);
        }
    }
}