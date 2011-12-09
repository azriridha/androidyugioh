package main;

public class MonsterZone
{
    Card currentCard;
    boolean faceUp;
    boolean defence;
    CardAttriubtes.MonsterType monsterType;
    CardAttriubtes.EffectMosterTypes monsterEffect;
    public int attackValue;
    public int defenceValue;

    public MonsterZone(Card monsterCard, boolean faceUp,boolean defence)
    {
        this.currentCard = monsterCard;
        this.monsterType = monsterCard.monsterType;
        this.faceUp = faceUp;
        this.defence = defence;
        setValues();
    }
    
    public void updateCardStatus(boolean faceUp, boolean defence)
    {
        this.faceUp = faceUp;
        this.defence = defence;
    }
    private void setValues()
    {
     this.attackValue = currentCard.attack;
     this.defenceValue = currentCard.defence;
    }
    
    
    
}
