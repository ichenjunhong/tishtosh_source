package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;

/* renamed from: com.google.b.c.bd */
final class C17640bd<E> extends C17530ab<E> {

    /* renamed from: a */
    static final C17530ab<Object> f49322a = new C17640bd(new Object[0], 0);

    /* renamed from: b */
    final transient Object[] f49323b;

    /* renamed from: c */
    private final transient int f49324c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33977a() {
        return false;
    }

    public final int size() {
        return this.f49324c;
    }

    public final E get(int i) {
        C17421k.m42652a(i, this.f49324c);
        return this.f49323b[i];
    }

    C17640bd(Object[] objArr, int i) {
        this.f49323b = objArr;
        this.f49324c = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo33952a(Object[] objArr, int i) {
        System.arraycopy(this.f49323b, 0, objArr, i, this.f49324c);
        return i + this.f49324c;
    }
}
