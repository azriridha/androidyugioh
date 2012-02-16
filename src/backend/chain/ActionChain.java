package backend.chain;

import java.util.Vector;

public class ActionChain {

    private Vector<Action> actionChain = new Vector<Action>();
    
    public void addAction(Action action)
    {
        actionChain.add(action);
    }
    public void removeAction(Action action)
    {
        actionChain.remove(action);
    }
    
    public void performActions()
    {
        for(Action action : actionChain)
        {
            action.perform();
        }
    }
}
