/*
 *
 */
package view;

import java.awt.event.KeyEvent;

import controller.IOrderPerformer;
import controller.IUserOrder;
import controller.Order;

// TODO: Auto-generated Javadoc
/**
 * The Class EventPerformer.
 */
class EventPerformer implements IEventPerformer {

    /** The order performer. */
    private final IOrderPerformer orderPerformer;

    /**
     * Instantiates a new event performer.
     *
     * @param orderPerformer
     *            the order performer
     */
    public EventPerformer(final IOrderPerformer orderPerformer) {
        this.orderPerformer = orderPerformer;
    }

    /*
     * (non-Javadoc)
     *
     * @see view.IEventPerformer#eventPerform(java.awt.event.KeyEvent)
     */
    @Override
    public void eventPerform(final KeyEvent keyCode) {
        // TODO Auto-generated method stub
        final IUserOrder userOrder = this.keyCodeToUserOrder(keyCode.getKeyCode());
        if (userOrder != null) {
            this.orderPerformer.orderPerform(userOrder);
        }
    }

    /**
     * Key code to user order.
     *
     * @param keyCode
     *            the key code
     * @return the i user order
     */
    private IUserOrder keyCodeToUserOrder(final int keyCode) {
        IUserOrder userOrder;
        switch (keyCode) {
        case KeyEvent.VK_Q:
            userOrder = new UserOrder(0, Order.LEFT);
            System.out.println("Key Q pressed");
            break;
        case KeyEvent.VK_D:
            userOrder = new UserOrder(0, Order.RIGHT);
            System.out.println("Key D pressed");
            break;
        case KeyEvent.VK_LEFT:
            userOrder = new UserOrder(1, Order.LEFT);
            System.out.println("Key LEFT pressed");
            break;
        case KeyEvent.VK_RIGHT:
            userOrder = new UserOrder(1, Order.RIGHT);
            System.out.println("Key RIGHT pressed");
            break;
        default:
            userOrder = null;
        }
        return userOrder;
    }
}
