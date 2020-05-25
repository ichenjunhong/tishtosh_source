package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class ayr extends awh<String> implements ays, RandomAccess {

    /* renamed from: a */
    private static final ayr f41644a;

    /* renamed from: b */
    private static final ays f41645b = f41644a;

    /* renamed from: c */
    private final List<Object> f41646c;

    public ayr() {
        this(10);
    }

    public ayr(int i) {
        this(new ArrayList<>(i));
    }

    private ayr(ArrayList<Object> arrayList) {
        this.f41646c = arrayList;
    }

    public final int size() {
        return this.f41646c.size();
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo29594c();
        if (collection instanceof ays) {
            collection = ((ays) collection).mo29857d();
        }
        boolean addAll = this.f41646c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo29594c();
        this.f41646c.clear();
        this.modCount++;
    }

    /* renamed from: a */
    public final void mo29855a(awo awo) {
        mo29594c();
        this.f41646c.add(awo);
        this.modCount++;
    }

    /* renamed from: b */
    public final Object mo29856b(int i) {
        return this.f41646c.get(i);
    }

    /* renamed from: a */
    private static String m34793a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof awo) {
            return ((awo) obj).zzare();
        }
        return ayb.m34771a((byte[]) obj);
    }

    /* renamed from: d */
    public final List<?> mo29857d() {
        return Collections.unmodifiableList(this.f41646c);
    }

    /* renamed from: e */
    public final ays mo29858e() {
        return mo29588a() ? new bax(this) : this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        mo29594c();
        return m34793a(this.f41646c.set(i, str));
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
        mo29594c();
        Object remove = this.f41646c.remove(i);
        this.modCount++;
        return m34793a(remove);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo29588a() {
        return super.mo29588a();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        mo29594c();
        this.f41646c.add(i, str);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: a */
    public final /* synthetic */ ayh mo29603a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f41646c);
            return new ayr(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f41646c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof awo) {
            awo awo = (awo) obj;
            String zzare = awo.zzare();
            if (awo.zzarf()) {
                this.f41646c.set(i, zzare);
            }
            return zzare;
        }
        byte[] bArr = (byte[]) obj;
        String a = ayb.m34771a(bArr);
        if (bbc.f41768a.mo30014a(bArr, 0, bArr.length)) {
            this.f41646c.set(i, a);
        }
        return a;
    }

    static {
        ayr ayr = new ayr();
        f41644a = ayr;
        ayr.mo29593b();
    }
}
