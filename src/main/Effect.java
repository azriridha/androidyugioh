package main;

public abstract class Effect
{
    abstract public void mainEffect(table gameTable,int mainPlayer); 
    abstract public void secondEffect(table gameTable, int mainPlayer);
}
