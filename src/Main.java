public class Main {
    public static void main(String[] args) {
        Employee[] empl = new Employee[10];
        empl[0] = new Employee("Fam1 Name1 SName1", 1, 20_000);
        empl[1] = new Employee("Fam2 Name2 SName2", 2, 30_000);
        empl[2] = new Employee("Fam3 Name3 SName3", 3, 50_000);
        empl[3] = new Employee("Fam4 Name4 SName4", 2, 44_000);
        empl[4] = new Employee("Fam5 Name5 SName5", 4, 36_000);
        empl[5] = new Employee("Fam6 Name6 SName6", 5, 25_000);
        empl[6] = new Employee("Fam7 Name7 SName7", 1, 38_000);
        empl[7] = new Employee("Fam8 Name8 SName8", 2, 37_000);
        empl[8] = new Employee("Fam9 Name9 SName9", 3, 34_000);
        empl[9] = new Employee("Fam10 Name10 SName10", 4, 39_000);


        System.out.println("Информация о всех сотрудниках: ");
        printAll(empl);
        System.out.println();

        salarySum(empl);
        System.out.println();

        minSalary(empl);
        System.out.println();

        maxSalary(empl);
        System.out.println();

        averageSalary(empl);
        System.out.println();

        for (Employee e: empl) {
            System.out.println(e);
        }
    }


        public static void printAll(Employee[] empl){
            for (int i =0; i< empl.length; i++){
                System.out.println(empl[i]);
            }
        }

        public static int salarySum(Employee[] empl){
            int salarySum = 0;
            for (int i =0; i< empl.length; i++){
                salarySum = salarySum + empl[i].getSalary();
            }
            System.out.println("Сумма затрат на зарплаты в месяц составляют: " + salarySum);
            return salarySum;
        }

        public static void minSalary(Employee[] empl){
            int minSalary = 20_000;
            String minEmpl = "";
            for (int i =0; i< empl.length; i++){
                if (empl[i].getSalary() < minSalary){
                    minSalary = empl[i].getSalary();
                    minEmpl = empl[i].getFIO();
                }
            }
            System.out.println("Сотрудник с минимальной зарплатой: " + minEmpl + " " + minSalary);
        }

        public static void maxSalary(Employee[] empl){
            int maxSalary = 50_000;
            String maxEmpl = "";
            for (int i =0; i< empl.length; i++){
                if (empl[i].getSalary() > maxSalary){
                    maxSalary = empl[i].getSalary();
                    maxEmpl = empl[i].getFIO();
                }
            }
            System.out.println("Сотрудник с максимальной зарплатой: " + maxEmpl + " " + maxSalary);
        }
        public static void averageSalary(Employee[] empl){
            int averageSalary = 0;
            for (int i =0; i< empl.length; i++){
                int salarySum=0;
                salarySum = salarySum + empl[i].getSalary();
                averageSalary = salarySum/10;
                }
            System.out.println("Средняя зарплата: " + averageSalary);
            }
    }
