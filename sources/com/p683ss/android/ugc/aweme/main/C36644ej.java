package com.p683ss.android.ugc.aweme.main;

import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.main.ej */
public abstract class C36644ej<T> implements Runnable {

    /* renamed from: a */
    protected WeakReference<T> f93766a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo75537a(T t);

    public void run() {
        if (this.f93766a != null && this.f93766a.get() != null) {
            mo75537a(this.f93766a.get());
        }
    }

    public C36644ej(T t) {
        this.f93766a = new WeakReference<>(t);
    }
}
