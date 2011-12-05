package AST;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class AST001 extends Card
{
public AST001()
{
 super("AST","Gogiga Gagagigo","AST-001","/images/ast/AST-001.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.WATER,SubType.REPTILE,8,2950,2800,"His soul long-since collapsed, his body recklessly continues onward, driven by a lust for more power. He no longer resembles his former self....");
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