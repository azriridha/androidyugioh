package AST;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class AST002 extends Card
{
public AST002()
{
 super("AST","Warrior of Zera","AST-002","/images/ast/AST-002.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.EARTH,SubType.WARRIOR,4,1600,1600,"A wandering warrior who seeks the sanctuary where he can gain the power of the Archlords. To escape the temptation of evil fiends, he fights solo day by day.");
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