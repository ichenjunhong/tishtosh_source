package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;

@C16299uq
public final class bxb {
    /* renamed from: a */
    public static void m36947a(String[] strArr, int i, int i2, PriorityQueue<bxc> priorityQueue) {
        String[] strArr2 = strArr;
        int i3 = i2;
        if (strArr2.length < i3) {
            m36946a(i, m36948b(strArr2, 0, strArr2.length), m36945a(strArr2, 0, strArr2.length), strArr2.length, priorityQueue);
            return;
        }
        long b = m36948b(strArr2, 0, i3);
        m36946a(i, b, m36945a(strArr2, 0, i3), i2, priorityQueue);
        long a = m36944a(16785407, i3 - 1);
        for (int i4 = 1; i4 < (strArr2.length - i3) + 1; i4++) {
            long j = b + 1073807359;
            b = (((((j - ((((((long) bwy.m36937a(strArr2[i4 - 1])) + 2147483647L) % 1073807359) * a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) bwy.m36937a(strArr2[(i4 + i3) - 1])) + 2147483647L) % 1073807359)) % 1073807359;
            m36946a(i, b, m36945a(strArr2, i4, i3), strArr2.length, priorityQueue);
        }
    }

    /* renamed from: a */
    private static void m36946a(int i, long j, String str, int i2, PriorityQueue<bxc> priorityQueue) {
        bxc bxc = new bxc(j, str, i2);
        if ((priorityQueue.size() != i || (((bxc) priorityQueue.peek()).f44499c <= bxc.f44499c && ((bxc) priorityQueue.peek()).f44497a <= bxc.f44497a)) && !priorityQueue.contains(bxc)) {
            priorityQueue.add(bxc);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    /* renamed from: a */
    private static String m36945a(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            abv.m32794c("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb.append(strArr[i]);
                sb.append(' ');
                i++;
            } else {
                sb.append(strArr[i4]);
                return sb.toString();
            }
        }
    }

    /* renamed from: b */
    private static long m36948b(String[] strArr, int i, int i2) {
        long a = (((long) bwy.m36937a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            a = (((a * 16785407) % 1073807359) + ((((long) bwy.m36937a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }

    /* renamed from: a */
    private static long m36944a(long j, int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return j;
        }
        if (i % 2 == 0) {
            return m36944a((j * j) % 1073807359, i / 2) % 1073807359;
        }
        return (j * (m36944a((j * j) % 1073807359, i / 2) % 1073807359)) % 1073807359;
    }
}
