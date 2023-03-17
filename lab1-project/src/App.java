/**
 * Main class
 */
public class App {
    /**
     * main метод
     * @param args путь к файлу.
     */
    public static void main(String[] args) {
        FileManager fileManager = new FileManager(args);
        Matrix matrix = new Matrix(fileManager.readFile());
        matrix.printSystem();
        matrix.transform();
        matrix.solve();
        matrix.printResult();
    }
}
