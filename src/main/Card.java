package main;

public class Card
{
public String cardName;
public String cardCode;
public String cardImageURL;
public boolean visible;
public CardAttriubtes.CardType type;
public CardAttriubtes.MonsterType monsterType;
public CardAttriubtes.SpellType spellType;
public CardAttriubtes.TrapTypes trapType;
public int attack;
public int defence;
public boolean attacking;
public Effect cardEffect;


public Card(String cardName, String cardCode, String cardImageURL,CardAttriubtes.CardType type)
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
