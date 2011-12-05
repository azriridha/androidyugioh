package main;

import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SpellType;
import main.CardAttriubtes.TrapTypes;

abstract public class Card
{
	public String packCode;
public String cardName;
public String cardCode;
public String cardImageURL;
public CardType type;
public MonsterType monsterType;
public SpellType spellType;
public TrapTypes trapType;
public Attributes attrib;
public SubType subType;
public int attack;
public int defence;
public String description;
Class card;


public Card(String cardName, String cardCode, String cardImageURL,CardType type)
{
    this.cardName = cardName;
    this.cardCode = cardCode;
    this.cardImageURL = cardImageURL;
    this.type = type;
    loadCard(cardCode);
}

private void loadCard(String cardCode)
{
    String[] path = cardCode.split("-");
    cardEffect = myClassloader(path[0].toLowerCase()+"."+path[0]+path[1]+".class");
}

private Effect myClassloader(String className)
{
    Effect tmp = null;
    try
    {
        Class classToLoad = Class.forName(className);
        tmp = (Effect)classToLoad.newInstance();
    }
    catch (ClassNotFoundException e)
    {
        System.err.println("Could not load class "+className);
    }
    catch (InstantiationException e)
    {
     System.err.println("Could not instantiate a new instance of Effect from "+className);
    }
    catch (IllegalAccessException e)
    {
      
    }
    
    return tmp;
}


}
