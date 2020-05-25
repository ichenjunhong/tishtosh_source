package com.p683ss.android.ugc.playerkit.p2494c;

import android.content.Context;
import com.p683ss.android.ugc.playerkit.p2492a.C50104d;

/* renamed from: com.ss.android.ugc.playerkit.c.i */
public final class C50120i {

    /* renamed from: A */
    public String f125568A;

    /* renamed from: a */
    public final C50104d<C50121j> f125569a;

    /* renamed from: b */
    public final C50104d<Boolean> f125570b;

    /* renamed from: c */
    public Context f125571c;

    /* renamed from: d */
    public final String f125572d;

    /* renamed from: e */
    public final boolean f125573e;

    /* renamed from: f */
    public final C50111c f125574f;

    /* renamed from: g */
    public final boolean f125575g;

    /* renamed from: h */
    public boolean f125576h;

    /* renamed from: i */
    public int f125577i;

    /* renamed from: j */
    public int f125578j;

    /* renamed from: k */
    public int f125579k;

    /* renamed from: l */
    public int f125580l = 1;

    /* renamed from: m */
    public C50104d<Integer> f125581m;

    /* renamed from: n */
    public final String f125582n;

    /* renamed from: o */
    public String f125583o;

    /* renamed from: p */
    public String f125584p;

    /* renamed from: q */
    public boolean f125585q;

    /* renamed from: r */
    public boolean f125586r;

    /* renamed from: s */
    public C50121j f125587s;

    /* renamed from: t */
    public boolean f125588t;

    /* renamed from: u */
    public int f125589u;

    /* renamed from: v */
    public boolean f125590v;

    /* renamed from: w */
    public boolean f125591w;

    /* renamed from: x */
    public boolean f125592x;

    /* renamed from: y */
    public boolean f125593y;

    /* renamed from: z */
    public C50110b f125594z;

    /* renamed from: b */
    public final boolean mo97891b() {
        if (this.f125570b == null) {
            return false;
        }
        return ((Boolean) this.f125570b.mo95137a()).booleanValue();
    }

    /* renamed from: a */
    public final C50121j mo97890a() {
        if (this.f125587s == null) {
            this.f125587s = (C50121j) this.f125569a.mo95137a();
        }
        if (C50109a.m108068s().mo95430k() && this.f125587s != null) {
            this.f125576h = this.f125587s.f125597c;
        }
        if (this.f125587s != null) {
            this.f125583o = this.f125587s.f125599e;
            this.f125584p = this.f125587s.f125600f;
        }
        return this.f125587s;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrepareData{id='");
        sb.append(this.f125572d);
        sb.append('\'');
        sb.append(", isRenderReady=");
        sb.append(this.f125573e);
        sb.append(", config=");
        sb.append(this.f125574f);
        sb.append(", vr=");
        sb.append(this.f125575g);
        sb.append(", h265=");
        sb.append(this.f125576h);
        sb.append(", isCurPlayer=");
        sb.append(this.f125585q);
        sb.append(", isPrepareCallback=");
        sb.append(this.f125586r);
        sb.append(", processUrlData=");
        sb.append(this.f125587s);
        sb.append(", isAsyncInit=");
        sb.append(this.f125588t);
        sb.append(", framesWait=");
        sb.append(this.f125580l);
        sb.append(", cacheKey=");
        sb.append(this.f125583o);
        sb.append(", enableAlog=");
        sb.append(this.f125579k);
        sb.append('}');
        return sb.toString();
    }

    public C50120i(C50104d<C50121j> dVar, C50104d<Boolean> dVar2, Context context, String str, boolean z, C50111c cVar, boolean z2, boolean z3, int i, C50104d<Integer> dVar3, String str2, boolean z4, boolean z5, boolean z6, int i2) {
        this.f125569a = dVar;
        this.f125570b = dVar2;
        this.f125571c = context;
        this.f125572d = str;
        this.f125573e = z;
        this.f125574f = cVar;
        this.f125575g = z2;
        this.f125576h = z3;
        this.f125577i = i;
        this.f125581m = dVar3;
        this.f125582n = str2;
        this.f125585q = z4;
        this.f125586r = z5;
        this.f125588t = z6;
        this.f125578j = i2;
    }
}
