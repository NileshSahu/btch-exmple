import beans.Customer;

import java.io.File;
import java.io.FileWriter;
import java.util.stream.LongStream;

import static util.IDGenerator.*;

/**
 * Created by Nilesh Sahu on 10/28/2017.
 */
public class Application {

    private static final File file = new File("test-data.txt");

    public static void main(String[] args) throws Exception {

        long startTime = System.currentTimeMillis();
        try (FileWriter writer = new FileWriter(file)) {
            LongStream.range(0, 5000000).parallel().forEach(index -> {
                Customer customer = getCustomer(index);
                try {
                    writer.append(customer.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("Total generated unique IDS " + getGeneratedIds().size() + "\nTotal unique ids " + generatedUniqueIdCount());
        System.out.println("Total time in records file creation : " + (System.currentTimeMillis() - startTime) / 1000 + " Seconds");
        System.out.println("Total Ids and count Map = " + getIdsCountMap());
        //System.out.println("Total Ids "+getGeneratedIds());
    }

    private static Customer getCustomer(long index) {
        Customer customer = new Customer();

        customer.setId(index);
        customer.setAccountId(generateId());
        customer.setName("Nilesh");
        customer.setBankCode("" + index / 10000);
        customer.setBankName("SBI" + index);
        return customer;
    }
}
