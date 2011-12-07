package main;

import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SpellType;
import main.CardAttriubtes.SubType;
import main.CardAttriubtes.TrapTypes;

abstract public class Card
{
    public final String packCode;
    public final String cardName;
    public final String cardCode;
    public final String cardImageURL;
    public final CardType cardType;
    public final MonsterType monsterType;
    public final SpellType spellType;
    public final TrapTypes trapType;
    public final Attribute attrib;
    public final SubType subType;
    public final int lvl;
    public final int attack;
    public final int defence;
    public final String description;

   public Card()
{
       this.packCode = "";
       this.cardName = "";
       this.cardCode = "";
       this.cardImageURL = "";
       this.cardType = null;
       this.monsterType = null;
       this.spellType = null;
       this.trapType = null;
       this.attrib = null;
       this.subType = null;
       this.lvl = -1;
       this.attack = -1;
       this.defence = -1;
       this.description = "";
}
    public Card(String packCode, String cardName, String cardCode, String cardImageURL, CardType type,
            MonsterType monsterType, SpellType spellType, TrapTypes trapType, Attribute attrib, SubType subType,
            int lvl, int attack, int defence, String description)
    {
        this.packCode = packCode;
        this.cardName = cardName;
        this.cardCode = cardCode;
        this.cardImageURL = cardImageURL;
        this.cardType = type;
        this.monsterType = monsterType;
        this.spellType = spellType;
        this.trapType = trapType;
        this.attrib = attrib;
        this.subType = subType;
        this.lvl = lvl;
        this.attack = attack;
        this.defence = defence;
        this.description = description;
    }

    abstract public void mainEffect(table gameTable,int mainPlayer);

    abstract public void secondEffect(table gameTable,int mainPlayer);

    abstract public void triggerEffect(Card cardPlayed);


//    private Effect myClassloader(String className)
//    {
//        Effect tmp = null;
//        try
//        {
//            Class classToLoad = Class.forName(className);
//            tmp = (Effect) classToLoad.newInstance();
//        }
//        catch (ClassNotFoundException e)
//        {
//            System.err.println("Could not load class " + className);
//        }
//        catch (InstantiationException e)
//        {
//            System.err.println("Could not instantiate a new instance of Effect from " + className);
//        }
//        catch (IllegalAccessException e)
//        {
//
//        }
//
//        return tmp;
//    }

}
