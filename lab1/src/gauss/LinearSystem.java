package gauss;

import java.util.ArrayList;
import java.util.List;

public class LinearSystem<N extends Number, T extends Gauss<N, T>> {
    private final List<T> list = new ArrayList<T>();

    public T get(int index){
        return list.get(index);
    }

    public void push(T elem){
        list.add(elem);
    }

    public int size(){
        return list.size();
    }

    public N itemAt(int i, int j){
        return list.get(i).at(j);
    }

    public void printSystem(LinearSystem<Float, MyEquation> system){
        for (int i = 0; i < system.size(); i++){
            MyEquation temp = system.get(i);
            String s = "";
            for (int j = 0; j < temp.size(); j++){
                s += String.format("%f; %s", system.itemAt(i, j), "\t");
            }
            System.out.println(s);
        }System.out.println("");
    }
}