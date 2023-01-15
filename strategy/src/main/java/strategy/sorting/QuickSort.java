package strategy.sorting;


public class QuickSort implements SortingStrategy {

    @Override
    public int[] sortArray(final int[] inputList) {
        int l = 0;
        int h = inputList.length-1;
        int[] stack = new int[h - l + 1];

        // initialize top of stack
        int top = -1;

        // push initial values of l and h to stack
        stack[++top] = l;
        stack[++top] = h;

        // Keep popping from stack while is not empty
        while (top >= 0) {
            // Pop h and l
            h = stack[top--];
            l = stack[top--];

            // Set pivot element at its correct position
            // in sorted array
            int p = sort(inputList, l, h);

            // If there are elements on left side of pivot,
            // then push left side to stack
            if (p - 1 > l) {
                stack[++top] = l;
                stack[++top] = p - 1;
            }

            // If there are elements on right side of pivot,
            // then push right side to stack
            if (p + 1 < h) {
                stack[++top] = p + 1;
                stack[++top] = h;
            }
        }
        return inputList;
    }

    private int sort(int[] inputList, int minPos, int maxPos) {
        int pivot = inputList[maxPos];
        int i = (minPos - 1);
        for (int j = minPos; j <= maxPos - 1; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (inputList[j] <= pivot) {
                i++;

                // swap inputList[i] and inputList[j]
                int temp = inputList[i];
                inputList[i] = inputList[j];
                inputList[j] = temp;
            }
        }

        // swap inputList[i+1] and inputList[maxPos] (or pivot)
        int temp = inputList[i + 1];
        inputList[i + 1] = inputList[maxPos];
        inputList[maxPos] = temp;

        return i + 1;
    }
}
