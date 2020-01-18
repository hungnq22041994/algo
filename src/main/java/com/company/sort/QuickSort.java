package com.company.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author hung.nguyenquang
 */
public class QuickSort {
    @Test
    public void positiveTest() {
        int[] actual = {5, 1, 6, 2, 3, 4, 10};
        int[] expected = {1, 2, 3, 4, 5, 6, 10};
        quickSort(actual, 0, actual.length - 1);
        assertArrayEquals(expected, actual);
    }

    private void quickSort(int[] a, int p, int q) {
        if (p < q) {
            int r = partition(a, p, q);
            quickSort(a, p, r - 1);
            quickSort(a, r + 1, q);
        }
    }

    private int partition(int[] a, int p, int q) {
        int i = p - 1;
        for (int j = p; j <= q; j++) {
            if (a[j] <= a[q]) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        return i;
    }

}
