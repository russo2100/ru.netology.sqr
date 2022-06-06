package ru.netology.javaqa.javaqamvn.services;

public class SqrtService {

    public int rangeSqrt(int x, int y) {
        int root = 0;
        for (int i = 10; i <= 99; i++) {
            int range = i * i;
            if (range >= x) {
                continue;
            }
            if (range >=y) {
                break;
            }
            root = root + 1;
        }
        return root;
    }
}
