package AST;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class AST003 extends Card
{
public AST003()
{
 super("AST","Sealmaster Meisei","AST-003","/images/ast/AST-003.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.DARK,SubType.SPELLCASTER,3,1100,900,"One of the few people who has a good command of Talismans. His history is a mystery.");
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