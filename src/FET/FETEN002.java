package FET;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class FETEN002 extends Card
{
public FETEN002()
{
 super("FET","Divine Dragon Ragnarok","FET-EN002","/images/fet/FET-EN002.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.LIGHT,SubType.DRAGON,4,1500,1000,"A legendary dragon sent by the gods as their instrument.  Legends say that if provoked , the whole world will sink beneath the sea.");
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