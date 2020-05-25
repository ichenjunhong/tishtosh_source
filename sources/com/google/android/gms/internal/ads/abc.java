package com.google.android.gms.internal.ads;

import org.json.JSONObject;

@C16299uq
public final class abc {

    /* renamed from: a */
    public final zzaxe f40129a;

    /* renamed from: b */
    public final zzaxi f40130b;

    /* renamed from: c */
    public final C16118ny f40131c;

    /* renamed from: d */
    public final zzyz f40132d;

    /* renamed from: e */
    public final int f40133e;

    /* renamed from: f */
    public final long f40134f;

    /* renamed from: g */
    public final long f40135g;

    /* renamed from: h */
    public final JSONObject f40136h;

    /* renamed from: i */
    public final byc f40137i;

    /* renamed from: j */
    public final boolean f40138j;

    public abc(zzaxe zzaxe, zzaxi zzaxi, C16118ny nyVar, zzyz zzyz, int i, long j, long j2, JSONObject jSONObject, byh byh) {
        this.f40129a = zzaxe;
        this.f40130b = zzaxi;
        this.f40133e = i;
        this.f40134f = j;
        this.f40135g = j2;
        this.f40137i = new byc(byh);
        this.f40138j = false;
    }

    public abc(zzaxe zzaxe, zzaxi zzaxi, C16118ny nyVar, zzyz zzyz, int i, long j, long j2, JSONObject jSONObject, byc byc, Boolean bool) {
        this.f40129a = zzaxe;
        this.f40130b = zzaxi;
        this.f40131c = nyVar;
        this.f40132d = zzyz;
        this.f40133e = i;
        this.f40134f = j;
        this.f40135g = j2;
        this.f40136h = jSONObject;
        this.f40137i = byc;
        if (bool != null) {
            this.f40138j = bool.booleanValue();
        } else {
            this.f40138j = ael.m32733a(zzaxe.f46132c.f46329m);
        }
    }
}
