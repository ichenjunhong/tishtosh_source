package com.p683ss.android.message.p1191b;

import java.util.LinkedList;

/* renamed from: com.ss.android.message.b.d */
public final class C19461d<E> {

    /* renamed from: a */
    public int f53779a = 5;

    /* renamed from: b */
    private LinkedList<E> f53780b = new LinkedList<>();

    /* renamed from: a */
    public final int mo40594a() {
        return this.f53780b.size();
    }

    public C19461d(int i) {
    }

    /* renamed from: a */
    public final E mo40595a(int i) {
        return this.f53780b.get(i);
    }

    /* renamed from: a */
    public final void mo40596a(E e) {
        if (this.f53780b.size() >= this.f53779a) {
            this.f53780b.poll();
        }
        this.f53780b.offer(e);
    }
}
