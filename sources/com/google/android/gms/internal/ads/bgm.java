package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class bgm implements Callable {

    /* renamed from: a */
    protected final bey f42314a;

    /* renamed from: b */
    protected final C15588a f42315b;

    /* renamed from: c */
    protected Method f42316c;

    /* renamed from: d */
    private final String f42317d = getClass().getSimpleName();

    /* renamed from: e */
    private final String f42318e;

    /* renamed from: f */
    private final String f42319f;

    /* renamed from: g */
    private final int f42320g;

    /* renamed from: h */
    private final int f42321h;

    public bgm(bey bey, String str, String str2, C15588a aVar, int i, int i2) {
        this.f42314a = bey;
        this.f42318e = str;
        this.f42319f = str2;
        this.f42315b = aVar;
        this.f42320g = i;
        this.f42321h = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo30119a() throws IllegalAccessException, InvocationTargetException;

    /* renamed from: b */
    public Void call() throws Exception {
        try {
            long nanoTime = System.nanoTime();
            this.f42316c = this.f42314a.mo30094a(this.f42318e, this.f42319f);
            if (this.f42316c == null) {
                return null;
            }
            mo30119a();
            bea bea = this.f42314a.f42225j;
            if (!(bea == null || this.f42320g == Integer.MIN_VALUE)) {
                bea.mo30068a(this.f42321h, this.f42320g, (System.nanoTime() - nanoTime) / 1000);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
