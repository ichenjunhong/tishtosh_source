package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.p1030c.C14910a;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ar */
public final class C15619ar {

    /* renamed from: a */
    public final Date f41237a;

    /* renamed from: b */
    public final String f41238b;

    /* renamed from: c */
    public final int f41239c;

    /* renamed from: d */
    public final Set<String> f41240d;

    /* renamed from: e */
    public final Location f41241e;

    /* renamed from: f */
    public final boolean f41242f;

    /* renamed from: g */
    public final Bundle f41243g;

    /* renamed from: h */
    public final Map<Class<? extends Object>, Object> f41244h;

    /* renamed from: i */
    public final String f41245i;

    /* renamed from: j */
    public final String f41246j;

    /* renamed from: k */
    public final C14910a f41247k;

    /* renamed from: l */
    public final int f41248l;

    /* renamed from: m */
    public final Bundle f41249m;

    /* renamed from: n */
    public final Set<String> f41250n;

    /* renamed from: o */
    public final boolean f41251o;

    /* renamed from: p */
    public final int f41252p;

    /* renamed from: q */
    public final String f41253q;

    /* renamed from: r */
    private final Set<String> f41254r;

    /* renamed from: s */
    private final aol f41255s;

    public C15619ar(C15631as asVar) {
        this(asVar, null);
    }

    private C15619ar(C15631as asVar, C14910a aVar) {
        this.f41237a = asVar.f41279g;
        this.f41238b = asVar.f41280h;
        this.f41239c = asVar.f41281i;
        this.f41240d = Collections.unmodifiableSet(asVar.f41273a);
        this.f41241e = asVar.f41282j;
        this.f41242f = asVar.f41283k;
        this.f41243g = asVar.f41274b;
        this.f41244h = Collections.unmodifiableMap(asVar.f41275c);
        this.f41245i = asVar.f41284l;
        this.f41246j = asVar.f41285m;
        this.f41247k = null;
        this.f41248l = asVar.f41286n;
        this.f41254r = Collections.unmodifiableSet(asVar.f41276d);
        this.f41249m = asVar.f41277e;
        this.f41250n = Collections.unmodifiableSet(asVar.f41278f);
        this.f41251o = asVar.f41287o;
        this.f41255s = null;
        this.f41252p = asVar.f41288p;
        this.f41253q = asVar.f41289q;
    }

    /* renamed from: a */
    public final Bundle mo29468a(Class<? extends Object> cls) {
        return this.f41243g.getBundle(cls.getName());
    }

    /* renamed from: a */
    public final boolean mo29469a(Context context) {
        return this.f41254r.contains(aes.m32750a(context));
    }
}
