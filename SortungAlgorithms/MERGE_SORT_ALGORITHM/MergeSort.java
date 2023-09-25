package SortungAlgorithms.MERGE_SORT_ALGORITHM;

public class MergeSort {

    static void display(int data[]) {
        int n = data.length;
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + "\t");
        }
    }

    static void merge(int data[], int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        int i, j, k;

        for (i = 0; i < n1; i++) {
            left[i] = data[l + i];
        }
        for (j = 0; j < n2; j++) {
            right[j] = data[mid + 1 + j];
        }
        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                data[k] = left[i];
                k++;
                i++;
            } else {
                data[k] = right[j];
                k++;
                j++;
            }
        }

        while (i < n1) {
            data[k] = left[i];
            k++;
            i++;
        }
        while (j < n2) {
            data[k] = right[j];
            k++;
            j++;
        }

    }

    static void MergeSort(int data[], int l, int r) {

        if (l >= r) {
            return;
        }

        int mid = (l + r) / 2;

        MergeSort(data, l, mid);
        MergeSort(data, mid + 1, r);
        merge(data, l, mid, r);

    }

    public static void main(String[] args) {
        int data[] = { 90, 77, 6, 0, 55, 44, 33, 1, 3, 5, 2, 6, 8 };
        int n = data.length;
        MergeSort(data, 0, n - 1);
        display(data);

    }
}
