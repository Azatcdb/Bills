import Classes.Bills;
import Classes.Services;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List <Services> servList = Arrays.asList(
                new Services("cold water", 100, 3),
                new Services("hot water", 500, 1),
                new Services("electricity", 2.3, 120));

        Bills bill1 = new Bills("ENSER", 00001, new Date(2022,06,01), servList);

        bill1.getServ();
        System.out.println(bill1.summaryForEach());
    }
}
