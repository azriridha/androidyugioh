package main;

public class MonsterZone
{
    Card currentCard;
    boolean faceUp;
    boolean defence;
    CardAttriubtes.MonsterType monsterType;
    CardAttriubtes.EffectMosterTypes monsterEffect;

    public MonsterZone()
    {

    }
    
    public void SetMonster(Card monsterCard)
    {
        this.currentCard = monsterCard;
        this.monsterType = monsterCard.monsterType;
        
    }
    
    
    
}
