
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TechnicalService<T extends Transport> {
    private String name;
    private String firm;
    private ArrayList<TechnicalService> technicalServices;
    private final Queue<T> queueMaintenance = new LinkedList<>();
    private final Queue<T> queueFixedCar = new LinkedList<>();

    public TechnicalService(String name, String firm) {
        this.name = name;
        this.firm = firm;
    }

    public void addMaintenance(T transport) {
        queueMaintenance.offer(transport);
    }


    public void addFixedCar(T transport) {
        queueFixedCar.offer(transport);
    }

    public Queue<T> getQueueMaintenance() {
        return queueMaintenance;
    }

    public Queue<T> getQueueFixedCar() {
        return queueFixedCar;
    }

    public String getName() {
        return name;
    }

    public void setFullName(String name) {
        this.name = name;
    }

    public String getFirm() {
        return firm;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<TechnicalService> getTechnicalServices() {
        return technicalServices;
    }

    public void setTechnicalServices(ArrayList<TechnicalService> technicalServices) {
        this.technicalServices = technicalServices;
    }


    public void setFirm(String firm) {
        this.firm = firm;
    }


    public void maintenance() {
        T transport = queueMaintenance.poll();
        if (transport != null) {
            System.out.println("Механик " + name + " проводит техобслуживание " + transport.getBrand());
            maintenance();
        } else {
            System.out.println("В очереди больше никого нет");
        }

    }

    public void fixedCar() {
        T transport = queueFixedCar.poll();
        if (transport != null) {
            System.out.println("Механик " + name + " починил машину " + transport.getBrand());
            System.out.println("В очереди " + queueFixedCar.size() + " машин");
            fixedCar();
        } else {
            System.out.println("В очереди больше никого нет");
        }

    }

}
