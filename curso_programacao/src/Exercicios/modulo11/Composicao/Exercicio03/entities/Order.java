package Exercicios.modulo11.Composicao.Exercicio03.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Exercicios.modulo11.Composicao.Exercicio03.entities.enums.OrderStatus;

public class Order {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	SimpleDateFormat birthday = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private OrderStatus status;

	private Client client;
	private List<OrderItem> items = new ArrayList<>();

	
	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	public double total() {
		double sum = 0;
		for (OrderItem oi : items) {
			sum += oi.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:  \n");
		sb.append("\n");
		sb.append("Order momment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " (" +
					birthday.format(client.getBirthDate()) + ") - " +
					client.getEmail());
		sb.append("\n" + "\n" + "--------------" + "\n");
		sb.append("\nOrder items: \n");
		for (OrderItem oi : items) {
			sb.append(oi.getProduct().getName() + ", ");
			sb.append("$" + String.format("%.2f", oi.getProduct().getPrice()) + ", ");
			sb.append("Quantity: " + oi.getQuantity() + ", ");
			sb.append("SubTotal: $" + String.format("%.2f", oi.subTotal()));
			sb.append("\n");
		}
		sb.append("\nTotal Price: $" + String.format("%.2f", total()));
		return sb.toString();
	}

	
}
