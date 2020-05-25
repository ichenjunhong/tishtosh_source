package com.p683ss.android.download.p1160a;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.ss.android.download.a.g */
public final class C19090g<K, T, E, V, R> extends C19081a<K, T, E, V, R, Set<V>, C19089f<K, T, E, V, R>> {

    /* renamed from: g */
    private final WeakReference<C19091a<K, T, E, V, R>> f52575g;

    /* renamed from: h */
    private final Collection<V> f52576h = new ArrayList();

    /* renamed from: com.ss.android.download.a.g$a */
    public interface C19091a<K, T, E, V, R> {
        /* renamed from: a */
        R mo38786a(K k, T t, E e);

        /* renamed from: a */
        void mo38787a(K k, T t, E e, Collection<V> collection, R r);
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
        return new C19089f();
    }

    /* renamed from: b */
    public final void mo39007b() {
        super.mo39007b();
        this.f52575g.clear();
    }

    public final /* bridge */ /* synthetic */ void handleMsg(Message message) {
        super.handleMsg(message);
    }

    public C19090g(int i, int i2, C19091a<K, T, E, V, R> aVar) {
        super(i, i2, aVar.getClass().getName());
        this.f52575g = new WeakReference<>(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final R mo39004a(K k, T t, E e) {
        C19091a aVar = (C19091a) this.f52575g.get();
        if (aVar != null) {
            return aVar.mo38786a(k, t, e);
        }
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo39005a(Object obj, Object obj2, Object obj3, Object obj4) {
        super.mo39005a(obj, obj2, obj3, obj4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo39006a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Set set = (Set) obj4;
        C19091a aVar = (C19091a) this.f52575g.get();
        if (aVar != null) {
            this.f52576h.clear();
            for (Object next : set) {
                if (next != null) {
                    this.f52576h.add(next);
                }
            }
            aVar.mo38787a(obj, obj2, obj3, this.f52576h, obj5);
            this.f52576h.clear();
        }
    }
}
