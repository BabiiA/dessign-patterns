package strategy;

import strategy.sorting.MergeSort;
import strategy.sorting.SortingStrategy;

import java.util.Arrays;

public class App
{
    public static void main( String[] args ) {
        SortingStrategy strategy = new MergeSort();
        final var sortedArray = strategy.sortArray(new int[]{ 4, 3, 5, 2, 1, 3, 2, 3 });
        Arrays.stream(sortedArray).sequential().forEach(System.out::print);
    }
}
