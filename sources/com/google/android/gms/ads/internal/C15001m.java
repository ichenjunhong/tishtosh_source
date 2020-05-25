package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.p030v4.p038f.C0800n;
import android.text.TextUtils;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.C15822d;
import com.google.android.gms.internal.ads.C15893fp;
import com.google.android.gms.internal.ads.C15897ft;
import com.google.android.gms.internal.ads.C15900fw;
import com.google.android.gms.internal.ads.C15903fz;
import com.google.android.gms.internal.ads.C15907gc;
import com.google.android.gms.internal.ads.C15909ge;
import com.google.android.gms.internal.ads.C15994ji;
import com.google.android.gms.internal.ads.C16134on;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.C16309v;
import com.google.android.gms.internal.ads.cal;
import com.google.android.gms.internal.ads.cao;
import com.google.android.gms.internal.ads.zzafl;
import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzyz;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.m */
public final class C15001m extends C15822d {

    /* renamed from: a */
    private cal f38739a;

    /* renamed from: b */
    private C15893fp f38740b;

    /* renamed from: c */
    private C15909ge f38741c;

    /* renamed from: d */
    private C15897ft f38742d;

    /* renamed from: e */
    private C0800n<String, C15900fw> f38743e = new C0800n<>();

    /* renamed from: f */
    private C0800n<String, C15903fz> f38744f = new C0800n<>();

    /* renamed from: g */
    private C15907gc f38745g;

    /* renamed from: h */
    private zzyz f38746h;

    /* renamed from: i */
    private PublisherAdViewOptions f38747i;

    /* renamed from: j */
    private zzafl f38748j;

    /* renamed from: k */
    private zzaks f38749k;

    /* renamed from: l */
    private C15994ji f38750l;

    /* renamed from: m */
    private C16309v f38751m;

    /* renamed from: n */
    private final Context f38752n;

    /* renamed from: o */
    private final C16134on f38753o;

    /* renamed from: p */
    private final String f38754p;

    /* renamed from: q */
    private final zzbgz f38755q;

    /* renamed from: r */
    private final C14986bt f38756r;

    public C15001m(Context context, String str, C16134on onVar, zzbgz zzbgz, C14986bt btVar) {
        this.f38752n = context;
        this.f38754p = str;
        this.f38753o = onVar;
        this.f38755q = zzbgz;
        this.f38756r = btVar;
    }

    /* renamed from: a */
    public final cao mo27648a() {
        C14998j jVar = new C14998j(this.f38752n, this.f38754p, this.f38753o, this.f38755q, this.f38739a, this.f38740b, this.f38741c, this.f38750l, this.f38742d, this.f38744f, this.f38743e, this.f38748j, this.f38749k, this.f38751m, this.f38756r, this.f38745g, this.f38746h, this.f38747i);
        return jVar;
    }

    /* renamed from: a */
    public final void mo27650a(cal cal) {
        this.f38739a = cal;
    }

    /* renamed from: a */
    public final void mo27657a(zzafl zzafl) {
        this.f38748j = zzafl;
    }

    /* renamed from: a */
    public final void mo27649a(PublisherAdViewOptions publisherAdViewOptions) {
        this.f38747i = publisherAdViewOptions;
    }

    /* renamed from: a */
    public final void mo27656a(C16309v vVar) {
        this.f38751m = vVar;
    }

    /* renamed from: a */
    public final void mo27658a(zzaks zzaks) {
        this.f38749k = zzaks;
    }

    /* renamed from: a */
    public final void mo27652a(C15897ft ftVar) {
        this.f38742d = ftVar;
    }

    /* renamed from: a */
    public final void mo27651a(C15893fp fpVar) {
        this.f38740b = fpVar;
    }

    /* renamed from: a */
    public final void mo27654a(C15909ge geVar) {
        this.f38741c = geVar;
    }

    /* renamed from: a */
    public final void mo27655a(C15994ji jiVar) {
        this.f38750l = jiVar;
    }

    /* renamed from: a */
    public final void mo27659a(String str, C15903fz fzVar, C15900fw fwVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f38744f.put(str, fzVar);
            this.f38743e.put(str, fwVar);
            return;
        }
        throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
    }

    /* renamed from: a */
    public final void mo27653a(C15907gc gcVar, zzyz zzyz) {
        this.f38745g = gcVar;
        this.f38746h = zzyz;
    }
}
