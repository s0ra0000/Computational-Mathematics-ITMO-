

public class App {
    private static final int DEFAULT_EQUATIONS_NUMBER = 5;
    private static final int DEFAULT_VARIABLES_NUMBER = 5;
    public static void main(String[] args) {
        Float [][] twoDimArray = {{3f,2f,-5f,-1f}, {2f,-1f,3f,13f}, {1f,2f,-1f,9f}}  ;
//        FileManager fileManager = new FileManager(args);
//        LinearSystem linearSystem = new LinearSystem();
        Matrix matrix = new Matrix(twoDimArray);
       // matrix.printSystem();
        matrix.calcute();
        matrix.solve();
        matrix.printResult();

    }
}
