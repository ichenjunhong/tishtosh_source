package com.bytedance.lighten.loader;

import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.bytedance.lighten.loader.i */
final class C12230i<E> extends LinkedBlockingDeque<E> {

    /* renamed from: a */
    private int f32324a;

    public C12230i(int i) {
        this.f32324a = i;
    }

    public final boolean offer(E e) {
        synchronized (this) {
            if (size() == this.f32324a) {
                removeLast();
            }
        }
        return super.offerFirst(e);
    }
}
