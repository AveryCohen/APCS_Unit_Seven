import java.io.File;
import java.io.IOException;
import java.security.DomainCombiner;
import java.util.ArrayList;
import java.util.Scanner;

public class DonorRunner {

    public static ArrayList<Donor> donorList;

    public static void main(String[] args) throws IOException {
        donorList = new ArrayList<>();
        getDonorList("files/donors.txt");
        sortDonorList();
        System.out.println(donorList.get(0).getName()); // Should print out Hernandez
        System.out.println(donorList.get(donorList.size()-1).getName()); // Should print out Hall
        System.out.println(getDonatedAmount("Anderson")); // should print 1436.5
        System.out.println(getDonatedAmount("Roberts")); // should print 307.86
        System.out.println(getDonatedAmount("Wilkinson")); // should print 0.0

    }

    public static void getDonorList(String filename) throws IOException {
        Scanner scan = new Scanner(new File("files/donors.txt"));

        while (scan.hasNext())
        {
            String name = scan.next();
            Double amount = scan.nextDouble();
            Donor nextDonor = new Donor(name, amount);
            donorList.add(nextDonor);
        }
    }

    public static void sortDonorList() {
        for (int j = 1; j < donorList.size(); j++) {
            Donor temp = donorList.get(j);
            double tempd = temp.getAmount();
            int i = j - 1;
            while ((i >= 0) && tempd < donorList.get(i).getAmount()) {
                donorList.set(i + 1, donorList.get(i));
                i--;
            }
            donorList.set(i + 1, temp);

        }
    }

    public static double getDonatedAmount(String name) {
            int min = 0;
            int max = donorList.size() - 1;
            while (min <= max) {
                int mid = (min + max) / 2;
                if (donorList.get(mid).getName().equals(name))
                    return donorList.get(mid).getAmount();
                else if (donorList.get(mid).getName().equals(name))
                    max = mid - 1;
                else
                    min = mid + 1;
            }
            return 0.0;
        }

}
