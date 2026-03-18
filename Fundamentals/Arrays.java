class Employee {
    int EmpId;
    String name;
    int age;
}

public class Arrays {
    public static void main(String[] args) {
        // 1-D Arrays
        // Initialzation and declaration

        int[] rollno = new int[5];

        rollno[0] = 2;
        rollno[1] = 4;
        rollno[2] = 1;
        rollno[3] = 6;
        rollno[4] = 5;

        // print the first element 
        System.out.println(rollno[0]);

        // print all elements using loops
        for(int i = 0;i < rollno.length;i++){
            System.out.print(rollno[i]+" ");
        }

        System.out.println();

        // print all elements using enhanced for loop
        for(int n : rollno){
            System.out.print(n+" ");
        }

        System.out.println();

        // using multi dimensional array
        int[][] matrix = new int[3][3];

        // Assigning values using random method
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }

        // Displaying values
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        // Using foreach method to display
        for(int[] n : matrix){
            for(int m : n){
                System.out.print(m+" ");
            }
            System.out.println();
        }

        // Creating array for employee class
        Employee emp1 = new Employee();
        emp1.EmpId = 2891;
        emp1.name = "Manoj";
        emp1.age = 21;

        Employee emp2 = new Employee();
        emp2.EmpId = 1211;
        emp2.name = "Suriya";
        emp2.age = 49;

        Employee emp3 = new Employee();
        emp3.EmpId = 5271;
        emp3.name = "Deva";
        emp3.age = 52;

        Employee emp4 = new Employee();
        emp4.EmpId = 788;
        emp4.name = "Robert";
        emp4.age = 35;

        Employee[] employee = new Employee[4];
        employee[0] = emp1;
        employee[1] = emp2;
        employee[2] = emp3;
        employee[3] = emp4;

        for(int i=0;i<employee.length;i++){
            System.out.println(employee[i].name+" "+employee[i].age);
        }

    }
}
