package pl.javastart;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import pl.javastart.dao.DaoClient;
import pl.javastart.model.Client;
import pl.javastart.model.Order;


@SpringBootApplication
public class Application {

	public static void main(String[] args) throws InterruptedException {
			
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		DaoClient daoClient = ctx.getBean(DaoClient.class); 
		
		
// DODANIE NOWYCH KLIENTÓW I ZAMÓWIEŃ I ZAPIS W BAZIE 
		
		/*
		Client client1 = new Client("Wojciech", "Tomczyk", "Plana 2");
		Order order1 = new Order("rzutnik", "rzutnik do ogladania filmow");
		Order order2 = new Order("telewizor LCD", "telewizon marki RUBIN");
		Client client2 = new Client("Tomasz", "Wilk", "Graniczna 12");
		Order order3 = new Order("smartphone", "smartphone galaxy note 4");
		Order order4 = new Order("płyta Cd", "płyta RHCP Californication");
		
		ArrayList<Order> lista1 = new ArrayList<>();
		lista1.add(order1);
		lista1.add(order2);
		client1.setOrders(lista1);
		
		ArrayList<Order> lista2 = new ArrayList<>();
		lista2.add(order3);
		lista2.add(order4);
		client2.setOrders(lista2);
		
		daoClient.save(client1);
		daoClient.save(client2);
		Thread.sleep(19000);
		ctx.close();
		*/
		
		
		
//DODANIE DO JEDNEGO Z KLIENTÓW NOWEGO ZAMÓWIENIA (DODAWANIE DO LISTY ZAMÓWIEŃ) 
		/*
		Order order5 = new Order("lina dynamiczna", "lina dynamiczna renomowanej firmy beal");
		Client clientToChangeOrder = daoClient.get(2L);
		
		List<Order> newLista =clientToChangeOrder.getOrders();      //new ArrayList<Order>();
		newLista.add(order5);
		clientToChangeOrder.setOrders(newLista);
		daoClient.update(clientToChangeOrder);
		*/
		
//EDYTOWANIE KLIENTA
		/*
		Client clientToChange = daoClient.get(1L);
		clientToChange.setFirstName("Franek");
		daoClient.update(clientToChange);
		*/
	
		
//USUWANIE KLIENTA
		/*
		Client clientToRemove = daoClient.get(1L);
		daoClient.remove(clientToRemove);
		*/
		
	}

}
