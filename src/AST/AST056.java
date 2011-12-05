package AST;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class AST056 extends Card
{
public AST056()
{
 super("AST","Gigobyte","AST-056","/images/ast/AST-056.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.REPTILE,1,350,300,"He has a tranquil soul, but carries a destiny that one day his heart shall be tainted by evil....");
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