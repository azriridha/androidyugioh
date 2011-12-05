package LOD;
import main.Card;
import main.CardAttriubtes.Attribute;
import main.CardAttriubtes.CardType;
import main.CardAttriubtes.MonsterType;
import main.CardAttriubtes.SubType;
import main.table;
public  class LOD051 extends Card
{
public LOD051()
{
 super("LOD","Robotic Knight","LOD-051","/images/lod/LOD-051.jpg",CardType.MONSTER,MonsterType.NORMAL,null,null,Attribute.FIRE,SubType.MACHINE,4,1600,1800,"The Commander of Machine-Types, he serves the Machine King. He is famous for the way he controls his troops.");
}  
    public void mainEffect(table gameTable,int mainPlayer)
    {}
    @Override
    public void secondEffect(table gameTable,int mainPlayer)
    {}
    @Override
    public void triggerEffect(Card cardPlayed)
    {}
}