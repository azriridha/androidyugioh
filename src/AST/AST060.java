package AST;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class AST060 extends Card
{
public AST060()
{
 super("AST","Pharaoh's Servant","AST-060","/images/ast/AST-060.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.ZOMBIE,2,900,0,"An apparition of those said to formerly serve the Pharaoh. It has tremendous loyalty that does not waiver.");
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