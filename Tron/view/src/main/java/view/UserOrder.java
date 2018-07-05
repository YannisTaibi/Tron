/*
 *
 */
package view;

import controller.IUserOrder;
import controller.Order;

// TODO: Auto-generated Javadoc
/**
 * The Class UserOrder.
 */
public class UserOrder implements IUserOrder {

    /** The player. */
    private final int   player;

    /** The order. */
    private final Order order;

    /**
     * Instantiates a new user order.
     *
     * @param player
     *            the player
     * @param order
     *            the order
     */
    public UserOrder(final int player, final Order order) {
        this.player = player;
        this.order = order;
    }

    /*
     * (non-Javadoc)
     * 
     * @see controller.IUserOrder#getPlayer()
     */
    @Override
    public int getPlayer() {
        return this.player;
    }

    /*
     * (non-Javadoc)
     * 
     * @see controller.IUserOrder#getOrder()
     */
    @Override
    public Order getOrder() {
        return this.order;
    }
}
