package mnc;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        if (n > 0) {
            List<Integer> employeeIds = new ArrayList<>();
            List<Integer> footballTeam = new ArrayList<>();
            List<Integer> basketballTeam = new ArrayList<>();
            //System.out.println("Enter employee IDs:");
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                employeeIds.add(a);
                if ((a % 10) % 2 == 0) {
                    footballTeam.add(a);
                } else {
                    basketballTeam.add(a);
                }
            }
            if (n > 5) {
                Collections.sort(employeeIds);
                List<Integer> duplicateIds = new ArrayList<>();
                for (int i = 0; i < employeeIds.size() - 1; i++) {
                    if (employeeIds.get(i) == employeeIds.get(i + 1)) {
                        duplicateIds.add(employeeIds.get(i));
                    }
                }
                if (duplicateIds.size() > 0) {
                    System.out.println("Duplicates are present - Team members-ID should be unique");
                    //for (auto it = duplicate_ids.begin(); it != duplicate_ids.end(); //++it)
                    //cout << *it << " ";
                    System.out.println();
                    return;
                }
                System.out.print("List of employees in foot ball team are: ");
                for (Integer id : footballTeam) {
                    System.out.print(id + " ");
                }
                System.out.println();
                System.out.print("List of employees in basket ball team are: ");
                for (Integer id : basketballTeam) {
                    System.out.print(id + " ");
                }
            } else {
                System.out.println("Number of employees participating in sports must be greater than 5");
            }
        }
    }

}
