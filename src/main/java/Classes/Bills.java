package Classes;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Bills {
    private String name;
    private int number;
    private Date date;
    private List<Services> serv;

    public Bills(String name, int number, Date date, List<Services> serv) {
        this.name = name;
        this.number = number;
        this.serv = serv;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Services> getServ() {
        serv.forEach(services -> {
            System.out.println(services.getName());
            System.out.println(services.getTariff());
            System.out.println(services.getCount());

        });
        return serv;
    }

    public void setServ(List<Services> serv) {
        this.serv = serv;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public HashMap<String, Double> summaryForEach () {
        HashMap <String, Double> mapOfSum = new HashMap<>();
        serv.forEach(services -> {
           mapOfSum.put(services.getName(), services.getCount() * services.getTariff());
        });
        return mapOfSum;
    }
}
