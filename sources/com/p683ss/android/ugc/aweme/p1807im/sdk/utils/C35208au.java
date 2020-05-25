package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.au */
public abstract class C35208au<T> {

    /* renamed from: a */
    private T f90497a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo70757a();

    /* renamed from: b */
    public final T mo73326b() {
        T t;
        synchronized (this) {
            if (this.f90497a == null) {
                this.f90497a = mo70757a();
            }
            t = this.f90497a;
        }
        return t;
    }
}
