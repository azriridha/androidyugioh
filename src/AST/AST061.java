package AST;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class AST061 extends Card
{
public AST061()
{
 super("AST","Pharaonic Protector","AST-061","/images/ast/AST-061.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.EARTH,SubType.ZOMBIE,2,900,0,"The mummy of a soldier that has been guarding the royal family for thousands of years. Even now, its spirit does not allow anybody to trespass.");
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