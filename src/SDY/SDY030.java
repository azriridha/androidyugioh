package SDY;
import java.util.Vector;

import main.Card;
import main.CardAttriubtes.CardType;
import main.Effect;
import main.table;
import main.CardAttriubtes;
import main.utils;
public  class SDY030 extends Card
{
    
    public final CardType card = CardType.SPELL;
    @Override
//    Select 1 Monster Card from either your opponent's 
//    or your own graveyard and place it on the field under 
//    your control in Attack or Defense Position (face-up). 
//    This is considered a Special Summon
    
    public void mainEffect(table gameTable,int mainPlayer)
    {
        Vector<Card> graveList = new Vector<Card>();
        graveList.addAll(table.graveyard.get(0));
        graveList.addAll(table.graveyard.get(1));
        
        gameTable.addMonsterToField(utils.chooseCards(graveList,1).get(0), mainPlayer,true);
    }
    
    
    @Override
    public void secondEffect(table gameTable, int mainPlayer)
    {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void triggerEffect(Card cardPlayed)
    {
        // TODO Auto-generated method stub
        
    }

}
