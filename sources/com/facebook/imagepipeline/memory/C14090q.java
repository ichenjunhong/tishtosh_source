package com.facebook.imagepipeline.memory;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.imagepipeline.memory.q */
public abstract class C14090q<T> implements C14063aa<T> {

    /* renamed from: a */
    private final Set<T> f36815a = new HashSet();

    /* renamed from: b */
    private final C14076g<T> f36816b = new C14076g<>();

    /* renamed from: a */
    public final T mo26314a() {
        return m28833c(this.f36816b.mo26336a());
    }

    /* renamed from: c */
    private T m28833c(T t) {
        if (t != null) {
            synchronized (this) {
                this.f36815a.remove(t);
            }
        }
        return t;
    }

    /* renamed from: a */
    public T mo26315a(int i) {
        return m28833c(this.f36816b.mo26337a(i));
    }

    /* renamed from: a */
    public void mo26316a(T t) {
        boolean add;
        synchronized (this) {
            add = this.f36815a.add(t);
        }
        if (add) {
            this.f36816b.mo26338a(mo26317b(t), t);
        }
    }
}
