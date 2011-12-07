package main;

import main.CardAttriubtes.CardType;
import main.CardAttriubtes.SpellType;
import main.CardAttriubtes.TrapTypes;

public class SpellZone
{
    Card currentCard;
    boolean faceUp;
    CardType cardType;
    SpellType spellType;
    TrapTypes trapType;


    public SpellZone(Card Card, boolean faceUp)
    {
        this.currentCard = Card;
        this.cardType = Card.cardType;
        this.faceUp = faceUp;
        if(Card.cardType == CardType.SPELL)
        {
            this.spellType = Card.spellType;
        }
        else if(Card.cardType == CardType.TRAP)
        {
            this.trapType = Card.trapType;
        }
    }
    
    public void updateCardStatus(boolean faceUp)
    {
       this.faceUp = faceUp;
    }
    
    
    
}
