

public class Matrix {
    private final Float[][] matrix;
    private int size;
    private Float coefficient;

    public Matrix(Float [][] matrix){
        this.matrix = matrix;
        this.size = size();

    }
    private Float [] x = new Float[3];
    public void solve(){
        int j = 0;
        System.out.println("ASDASDASDDAS: " + x[2]);
        for(int i=size-1; i >= 0; i--){
            Float sum = 0.0f;
            for(j=size-1; j > i; j--){
                sum += matrix[i][j]*x[j];

            }
            x[i] = (matrix[i][size]-sum)/matrix[i][j];
        }
    }


    public void calcute(){
        printSystem();
        System.out.println();
        for(int i=0; i<size-1;i++){
            for(int j=i+1; j<size; j++) {
                coefficient = findCoefficient(matrix[j][i], matrix[i][i]);
                System.out.println("a: " + matrix[j][i]);
                System.out.println("b: " + matrix[i][i]);
                multiple(coefficient, j);
                addEquation(i, j);
//                System.out.println("row1: " + i);
//                System.out.println("row2: " + j);

                printSystem();
                System.out.println();
            }
        }
    }

    private void addEquation(int row_1, int row_2){
        for(int j=0; j < size+1; j++){
            matrix[row_2][j] += matrix[row_1][j];
        }

    }

    private void multiple(Float coefficient, int row){
        for(int j=0; j < size+1; j++){
            matrix[row][j] *= coefficient;
        }
        System.out.print("GOGOOGO: ");;
        for(int j=0; j < size+1; j++){
            System.out.print(matrix[row][j] + " ");;
        }
        System.out.println();

    }

    private Float findCoefficient(Float a, Float b){
        if(a == 0.0f) return 1.0f;
        System.out.println("wtf: " + -b/a);
        return -b/a ;
    }

    private boolean checkSystem(){
        if (size < 2) return false;
        for(int i = 0; i < size; i++){
            if (matrix[i].length != (size + 1)){
                return false;
            }
        }
        return true;
    }

    private int size(){
        return matrix.length;
    }


    public void printSystem(){
        for(int i=0; i<size;i++){
            for(int j=0; j<size+1; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printResult(){
        for(int i=0; i<x.length;i++){
            System.out.println("x"+i+" = " + x[i] +", ");
        }

    }

}
