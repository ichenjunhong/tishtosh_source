package com.bytedance.apm.p501q;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: com.bytedance.apm.q.p */
public final class C9199p<E extends Comparable> {

    /* renamed from: a */
    private PriorityQueue<E> f25170a;

    /* renamed from: b */
    private int f25171b;

    /* renamed from: a */
    public final List<E> mo16563a() {
        ArrayList arrayList = new ArrayList(this.f25170a);
        Collections.sort(arrayList);
        return arrayList;
    }

    public C9199p(int i) {
        if (i > 0) {
            this.f25171b = i;
            this.f25170a = new PriorityQueue<>(i, new Comparator<E>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((Comparable) obj).compareTo((Comparable) obj2);
                }
            });
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final void mo16564a(E e) {
        if (this.f25170a.size() < this.f25171b) {
            this.f25170a.add(e);
            return;
        }
        if (e.compareTo((Comparable) this.f25170a.peek()) > 0) {
            this.f25170a.poll();
            this.f25170a.add(e);
        }
    }
}
