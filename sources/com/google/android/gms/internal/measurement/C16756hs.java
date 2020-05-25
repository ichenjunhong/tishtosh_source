package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.hs */
public final class C16756hs extends C16687fo<String> implements C16757ht, RandomAccess {

    /* renamed from: a */
    private static final C16756hs f47123a;

    /* renamed from: b */
    private static final C16757ht f47124b = f47123a;

    /* renamed from: c */
    private final List<Object> f47125c;

    public C16756hs() {
        this(10);
    }

    public C16756hs(int i) {
        this(new ArrayList<>(i));
    }

    private C16756hs(ArrayList<Object> arrayList) {
        this.f47125c = arrayList;
    }

    public final int size() {
        return this.f47125c.size();
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo31999c();
        if (collection instanceof C16757ht) {
            collection = ((C16757ht) collection).mo32261d();
        }
        boolean addAll = this.f47125c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo31999c();
        this.f47125c.clear();
        this.modCount++;
    }

    /* renamed from: a */
    public final void mo32259a(C16691fs fsVar) {
        mo31999c();
        this.f47125c.add(fsVar);
        this.modCount++;
    }

    /* renamed from: b */
    public final Object mo32260b(int i) {
        return this.f47125c.get(i);
    }

    /* renamed from: a */
    private static String m40334a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C16691fs) {
            return ((C16691fs) obj).zzud();
        }
        return C16743hf.m40317a((byte[]) obj);
    }

    /* renamed from: d */
    public final List<?> mo32261d() {
        return Collections.unmodifiableList(this.f47125c);
    }

    /* renamed from: e */
    public final C16757ht mo32262e() {
        return mo31993a() ? new C16815jx(this) : this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        mo31999c();
        return m40334a(this.f47125c.set(i, str));
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* synthetic */ Object remove(int i) {
        mo31999c();
        Object remove = this.f47125c.remove(i);
        this.modCount++;
        return m40334a(remove);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo31993a() {
        return super.mo31993a();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        mo31999c();
        this.f47125c.add(i, str);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: a */
    public final /* synthetic */ C16747hj mo32008a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f47125c);
            return new C16756hs(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f47125c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C16691fs) {
            C16691fs fsVar = (C16691fs) obj;
            String zzud = fsVar.zzud();
            if (fsVar.zzue()) {
                this.f47125c.set(i, zzud);
            }
            return zzud;
        }
        byte[] bArr = (byte[]) obj;
        String a = C16743hf.m40317a(bArr);
        if (C16825kc.f47256a.mo32417a(bArr, 0, bArr.length)) {
            this.f47125c.set(i, a);
        }
        return a;
    }

    static {
        C16756hs hsVar = new C16756hs();
        f47123a = hsVar;
        hsVar.mo31998b();
    }
}
