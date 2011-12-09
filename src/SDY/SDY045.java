package SDY;

import main.Card;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.SubType;
import main.CardAttriubtes.SpellType;
import main.table;
import main.utils;
public  class SDY045 extends Card
{
public SDY045()
{
 super("SDY","Yami","SDY-045","/images/sdy/SDY-045.jpg",CardType.SPELL,null,SpellType.FIELD,null,null,SubType.FIELD,-1,-1,-1,"Increases the ATK and DEF of all Fiend and Spellcaster-Type monsters by 200 points. Also decreases the ATK and DEF of all Fairy-Type monsters by 200 points.");
}  
    public void mainEffect(table gameTable,int mainPlayer)
    {}
    @Override
    public void secondEffect(table gameTable,int mainPlayer)
    {}
    @Override
    public void triggerEffect(Card cardPlayed, int player)
    {
        utils.changeAttackBySubType(SubType.FIEND,200);
        utils.changeAttackBySubType(SubType.SPELLCASTER,200);
        utils.changeAttackBySubType(SubType.FAIRY,-200);
        
        utils.changeDefenceBySubType(SubType.FIEND,200);
        utils.changeDefenceBySubType(SubType.SPELLCASTER,200);
        utils.changeDefenceBySubType(SubType.FAIRY,-200);
        
    }
}