package com.p683ss.android.vesdk;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vesdk.a */
public final class C50588a<E> {

    /* renamed from: a */
    private List<E> f126845a = new ArrayList();

    /* renamed from: b */
    private boolean f126846b = false;

    /* renamed from: c */
    private List<E> f126847c = new ArrayList();

    /* renamed from: a */
    public final synchronized boolean mo98726a() {
        return this.f126845a.isEmpty();
    }

    /* renamed from: b */
    public final synchronized List<E> mo98728b() {
        if (this.f126846b) {
            this.f126847c = new ArrayList(this.f126845a.size());
            for (E add : this.f126845a) {
                this.f126847c.add(add);
            }
            this.f126846b = false;
        }
        return this.f126847c;
    }

    /* renamed from: b */
    public final synchronized boolean mo98729b(E e) {
        this.f126846b = true;
        return this.f126845a.remove(e);
    }

    /* renamed from: a */
    public final synchronized boolean mo98727a(E e) {
        this.f126846b = true;
        return this.f126845a.add(e);
    }
}
