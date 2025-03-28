package factory;

import model.Container;
import model.QueueContainer;
import model.StackContainer;

public class ContainerFactory implements Factory{
    @Override
    public Container createContainer(Strategy strategy) {
        if(strategy.equals(Strategy.LIFO)){
            return new StackContainer();
        } else {
            return new QueueContainer();
        }
    }
}
