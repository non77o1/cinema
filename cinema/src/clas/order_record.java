package clas;

import java.sql.*;

public class order_record {
    Order order;
    Payment pay;
    Customer customer;
    int num_items;

    movieName movie;

    public order_record(Order order, Payment pay, Customer customer, int num_items,movieName movie) {
        this.order = order;
        this.pay = pay;
        this.customer = customer;
        this.num_items = num_items;
        this.movie=movie;
    }

    public order_record() {
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Payment getPay() {
        return pay;
    }

    public void setPay(Payment pay) {
        this.pay = pay;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getNum_items() {
        return num_items;
    }

    public void setNum_items(int num_items) {
        this.num_items = num_items;
    }

    @Override
    public String toString() {
        String sym=null;
          if (pay instanceof cash){
               sym = "Order Id: " + order.getId() +
                       "\tPayment Id: " + pay.getPay_id() +
                       "\tCustomer Id: " + customer.getId() +
                       "\tCustomer Name: " + customer.getName()+ "\n\n"  +
                       "\tMovie Name: " + movie.getItem_name() + "\n\n"  +
                       "\tMovie Language: " + movie.getLanguage() + "\n\n"  +
                       "\tage: " + movie.getAge()+ "\n\n"  +
                       "\t way of pay: cash"+
                       "\tTotal Price: " + (pay.getTotal_price()) +
                       "\tNumber of Items: " + num_items + "\n\n";
          }
          if (pay instanceof card){
              sym = "Order Id: " + order.getId() +
                      "\tPayment Id: " + pay.getPay_id() +
                      "\tCustomer Id: " + customer.getId() +
                      "\tCustomer Name: " + customer.getName() + "\n\n"  +
                      "\tMovie Name: " + movie.getItem_name() + "\n\n"  +
                      "\tMovie Language: " + movie.getLanguage() + "\n\n"  +
                      "\tage: " + movie.getAge()+ "\n\n"  +
                      "\t way of pay: Online(card)"+
                      "\tTotal Price: " + (pay.getTotal_price()) +
                      "\tNumber of Items: " + num_items + "\n\n" ;
          }
          return sym;

    }
}
