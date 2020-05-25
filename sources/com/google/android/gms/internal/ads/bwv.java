package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@C16299uq
public final class bwv {

    /* renamed from: a */
    private final int f44180a;

    /* renamed from: b */
    private final int f44181b;

    /* renamed from: c */
    private final int f44182c;

    /* renamed from: d */
    private final bwu f44183d = new bwz();

    public bwv(int i) {
        this.f44181b = i;
        this.f44180a = 6;
        this.f44182c = 0;
    }

    /* renamed from: a */
    public final String mo30836a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            sb.append(((String) obj).toLowerCase(Locale.US));
            sb.append(10);
        }
        return m36934a(sb.toString());
    }

    /* renamed from: a */
    private final String m36934a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        bwx bwx = new bwx();
        PriorityQueue priorityQueue = new PriorityQueue(this.f44181b, new bww(this));
        for (String a : split) {
            String[] a2 = bwy.m36938a(a, false);
            if (a2.length != 0) {
                bxb.m36947a(a2, this.f44181b, this.f44180a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                bwx.mo30838a(this.f44183d.mo30835a(((bxc) it.next()).f44498b));
            } catch (IOException e) {
                abv.m32793b("Error while writing hash to byteStream", e);
            }
        }
        return bwx.toString();
    }
}
