package com.p683ss.android.download.p1160a;

import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.download.a.c */
public final class C19084c<K, T, E, V, R> extends C19081a<K, T, E, V, R, V, C19092h<K, T, E, V, R>> {

    /* renamed from: g */
    private final WeakReference<C19085a<K, T, E, V, R>> f52564g;

    /* renamed from: com.ss.android.download.a.c$a */
    public interface C19085a<K, T, E, V, R> {
        /* renamed from: a */
        R mo38831a(K k, T t, E e);

        /* renamed from: a */
        void mo38832a(K k, T t, E e, V v, R r);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo39008c() {
        super.mo39008c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo39009d() {
        super.mo39009d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ C19083b mo39003a() {
        return new C19092h();
    }

    /* renamed from: b */
    public final void mo39007b() {
        super.mo39007b();
        this.f52564g.clear();
    }

    public final /* bridge */ /* synthetic */ void handleMsg(Message message) {
        super.handleMsg(message);
    }

    public C19084c(int i, int i2, C19085a<K, T, E, V, R> aVar) {
        this(i, i2, aVar, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final R mo39004a(K k, T t, E e) {
        C19085a aVar = (C19085a) this.f52564g.get();
        if (aVar != null) {
            return aVar.mo38831a(k, t, e);
        }
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo39005a(Object obj, Object obj2, Object obj3, Object obj4) {
        super.mo39005a(obj, obj2, obj3, obj4);
    }

    private C19084c(int i, int i2, C19085a<K, T, E, V, R> aVar, boolean z) {
        super(i, i2, aVar.getClass().getName(), false);
        this.f52564g = new WeakReference<>(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39006a(K k, T t, E e, V v, R r) {
        C19085a aVar = (C19085a) this.f52564g.get();
        if (aVar != null) {
            aVar.mo38832a(k, t, e, v, r);
        }
    }
}
