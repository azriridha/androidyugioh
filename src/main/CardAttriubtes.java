package main;

public class CardAttriubtes
{
    public enum CardType
    {
        MONSTER,SPELL,TRAP;
    }
    public enum SpellType
    {/**
        A. Normal Magic Cards
            Once their magic is activated these cards are destroyed. Like the "Dark Hole" card, they are often very powerful.
        B. Continuous Magic Cards*
            These cards remain on the field once they are played and their magic effect continues until they are destroyed or removed. There is often a cost involved to maintain the effect of this type of Magic Card.
        C. Equip Magic Cards
            These cards allow you to modify the strength of monsters. When playing this card to the field, place it so that it overlaps with the Monster Card that you wish to equip.
            Usually, this card can only be used with monsters that are face-up on the field. However, you may equip either your own OR you opponent's Monster Cards with Equip Magic Cards. In some cases, certain monsters cannot be equipped with these cards (refer to the individual card's text)
        D. Field Magic Cards
            These cards are used to alter the conditions on the field and modify the Attack and Defense capabilities of monsters. They are placed in the Field Card Zone and are NOT included in the Magic & Trap Zone's 5-card limit. They may be placed face-down in the Field Card Zone, but will not be activated until flipped face-up.
            There can only be 1 active Field Magic Card on the field at any given time between both players. When a new Field Magic Card is activated, the previous active card is sent to the Graveyard. Also, if a Field Magic card is destroyed and there are no active Field Magic Cards on the field, the field returns to the original state that it was at the beginning of the game.
            If a player's Field Magic Card is Set when an active Field Magic Card is destroyed, the Set card does not automatically activate. Field Magic Cards can only be activated by a player, but never during and opponent's turn.
        E. Quick-Play Magic Card*
            Aside from the Main Phase, this type of card can be activated during the Battle Phase. Also, if you have this card Set on the field, you can activate it during your opponent's turn.
        F. Ritual Magic Cards*
            These cards are needed to summon a Ritual Monster. After the Ritual Monster Summon, it is destroyed together with the required Tribute monster (s).
            These types of Magic Cards will be included in future Yu-Gi-Oh! releases.
        **/
        NORMAL,CONTINUOUS,Equip,Field,QUICKPLAY,Ritual;
    }

    public enum MonsterType
    {
        NORMAL,EFFECT,FUSION,RITUAL;
    }
    /**
     * A. FLIP 
     *      The monster's effect is activated when the card is flipped from face-down to face-up. The effect is also activated if the card is flipped face-up as a result of a Magic or Trap card, or another monster's attack.
     * B. CONTINUOUS EFFECT  
     *      As long as this Monster Card is face-up on the field, its effect remains active. When the monster is turned face-down, its effect is no longer active.
     * C. COST EFFECT 
     *      Costs vary from card to card so be sure to read the instructions printed on each card.
     * D. TRIGGER EFFECT 
     *      These cards are activated when you inflict Direct Damage to an opponent's Life Points, or when you have fulfilled a specific requirement indicated on the card itself.
     * E. MULTI-TRIGGER EFFECT 
     *      These are special Effect Monster Cards that you can activate even if it is your opponent's turn.
     */
    public enum EffectMosterTypes
    {
        FLIP,CONTINUOUS,COST,TRIGGER,MULTITRIGGER; 
    }
    /**
     * 
     * A. Normal Trap Cards
     *      A Normal Trap Card has no icon. Once activated, this type of card is destroyed.
     * B. Counter Trap Cards
     *      These Trap Cards are activated in response to the Summon of monsters or to neutralize the effects of Magic or Trap Cards. Once activated, this type of card is destroyed. This type of Trap Card will be included in future Yu-gi-oh! releases.
     * C. Continuous Trap Cards
     *      These cards remain on the field once they are activated and their effect continues until they are destroyed or removed. There is often a cost involved to maintain the effect of this type of Trap Card.
     *
     */
    public enum TrapTypes
    {
        NORMAL,COUNTER,COUNTINUOUS;
    }
    
    public enum Attribute
    {
    	DARK,EARTH,WIND,WATER,LIGHT,FIRE;
    }
    public enum SubType
    {
    	SPELLCASTER,MACHINE,FIEND,ROCK,INSECT,WARRIOR,
    	PLANT,DRAGON,REPTILE,THUNDER,BEAST_WARRIOR,BEAST,
    	PSYCHIC,SEA_SERPENT,FAIRY,PYRO,NORMAL,EQUIP,
    	CONTINUOUS,FIELD,RITUAL,QUICK_PLAY,COUNTER,
    	WINGED_BEAST,ZOMBIE,FISH,AQUA,DINOSAUR;
    }
}

