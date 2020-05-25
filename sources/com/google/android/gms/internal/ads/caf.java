package com.google.android.gms.internal.ads;

import java.util.Random;
import java.util.WeakHashMap;

@C16299uq
public final class caf {

    /* renamed from: a */
    static caf f44759a = new caf();

    /* renamed from: b */
    final Random f44760b;

    /* renamed from: c */
    private final aes f44761c;

    /* renamed from: d */
    private final bzy f44762d;

    /* renamed from: e */
    private final String f44763e;

    /* renamed from: f */
    private final C15735bs f44764f;

    /* renamed from: g */
    private final C15736bt f44765g;

    /* renamed from: h */
    private final C15737bu f44766h;

    /* renamed from: i */
    private final zzbgz f44767i;

    /* renamed from: j */
    private final WeakHashMap<Object, String> f44768j;

    protected caf() {
        aes aes = new aes();
        bzy bzy = new bzy(new bzq(), new bzp(), new C15664ax(), new C15918gn(), new C16402yl(), new C16431zn(), new C16221rt(), new C15919go());
        this(aes, bzy, new C15735bs(), new C15736bt(), new C15737bu(), aes.m32763c(), new zzbgz(0, 15302000, true), new Random(), new WeakHashMap());
    }

    private caf(aes aes, bzy bzy, C15735bs bsVar, C15736bt btVar, C15737bu buVar, String str, zzbgz zzbgz, Random random, WeakHashMap<Object, String> weakHashMap) {
        this.f44761c = aes;
        this.f44762d = bzy;
        this.f44764f = bsVar;
        this.f44765g = btVar;
        this.f44766h = buVar;
        this.f44763e = str;
        this.f44767i = zzbgz;
        this.f44760b = random;
        this.f44768j = weakHashMap;
    }

    /* renamed from: a */
    public static aes m37096a() {
        return f44759a.f44761c;
    }

    /* renamed from: b */
    public static bzy m37097b() {
        return f44759a.f44762d;
    }

    /* renamed from: c */
    public static C15735bs m37098c() {
        return f44759a.f44764f;
    }

    /* renamed from: d */
    public static C15737bu m37099d() {
        return f44759a.f44766h;
    }

    /* renamed from: e */
    public static String m37100e() {
        return f44759a.f44763e;
    }

    /* renamed from: f */
    public static zzbgz m37101f() {
        return f44759a.f44767i;
    }
}
