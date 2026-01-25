import java.util.PriorityQueue;
import java.util.Queue;

public class OrderProcessingSystem
{
    // It will take care of ordering of items.
    // Queue we will use here FIFO,
    // Because we are using priorities, so we will use PRiority queues here.

    private Queue<Orders> orderQueue;

    public OrderProcessingSystem( )
    {
        this.orderQueue = new PriorityQueue<>();
    }
    public Queue<Orders> getOrderQueue() {
        return orderQueue;
    }

    public void setOrderQueue(Queue<Orders> orderQueue) {
        this.orderQueue = orderQueue;
    }

    //TO add order in a queue.
    public void addOrder(Orders orders)
    {
        orderQueue.offer(orders);
    }

    //To remove order from a queue.
    public void processORder()
    {
        orderQueue.poll();
    }

    public int sizeOfQueue()
    {
        return orderQueue.size();
    }
}
