package com.p683ss.android.ugc.aweme.mediaplayer;

import android.view.Surface;
import android.view.TextureView;
import com.p683ss.android.ugc.asve.p1239c.C20342a;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.asve.p1239c.C20348d;
import com.p683ss.android.ugc.asve.p1239c.C20349e;
import com.p683ss.android.vesdk.C50720o.C50743d;
import com.p683ss.android.vesdk.C50720o.C50747h;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.mediaplayer.j */
public final class C36765j implements C36756a {

    /* renamed from: a */
    private C20347c f93951a;

    /* renamed from: b */
    private long f93952b;

    /* renamed from: c */
    private long f93953c;

    /* renamed from: d */
    private double f93954d = 1.0d;

    /* renamed from: a */
    public final void mo75874a() {
        this.f93951a.mo43087s();
    }

    /* renamed from: d */
    public final void mo75884d() {
        this.f93951a.mo43082p();
    }

    /* renamed from: g */
    private boolean m82739g() {
        if (this.f93951a.mo43063g() == C50747h.STARTED) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo75880b() {
        this.f93951a.mo43085r();
    }

    /* renamed from: c */
    public final void mo75883c() {
        this.f93951a.mo43087s();
    }

    /* renamed from: e */
    public final long mo75885e() {
        double k = (double) this.f93951a.mo43071k();
        double d = this.f93954d;
        Double.isNaN(k);
        return (long) (k * d);
    }

    /* renamed from: f */
    public final long mo75886f() {
        double l = (double) this.f93951a.mo43073l();
        double d = this.f93954d;
        Double.isNaN(l);
        return (long) (l * d);
    }

    /* renamed from: b */
    public final int mo75879b(long j) {
        mo75876a(j, this.f93953c);
        return 0;
    }

    /* renamed from: c */
    public final int mo75882c(long j) {
        mo75876a(this.f93952b, j);
        return 0;
    }

    /* renamed from: a */
    public final void mo75875a(double d) {
        this.f93951a.mo43021a(0, 0, (float) d);
    }

    /* renamed from: a */
    public final int mo75872a(long j) {
        C20347c cVar = this.f93951a;
        double d = (double) j;
        double d2 = this.f93954d;
        Double.isNaN(d);
        cVar.mo42983a((int) (d / d2), C50743d.EDITOR_SEEK_FLAG_OnGoing);
        return 0;
    }

    /* renamed from: b */
    public final void mo75881b(double d) {
        this.f93954d = d;
        this.f93951a.mo42967a((float) d);
    }

    /* renamed from: a */
    public final int mo75873a(String str) {
        this.f93951a.mo42990a((C20348d) new C20349e(new String[]{str}));
        this.f93951a.mo43077n();
        return 0;
    }

    /* renamed from: a */
    public final void mo75877a(boolean z) {
        this.f93951a.mo43019a(z);
    }

    /* renamed from: a */
    public final boolean mo75878a(Surface surface) {
        this.f93951a.mo43085r();
        return true;
    }

    public C36765j(String str, TextureView textureView) {
        C52711k.m112240b(str, "workSpace");
        C52711k.m112240b(textureView, "textureView");
        this.f93951a = new C20342a(str, textureView);
    }

    /* renamed from: a */
    public final void mo75876a(long j, long j2) {
        boolean g = m82739g();
        this.f93952b = j;
        this.f93953c = j2;
        this.f93951a.mo43028b(((int) j) / 2, ((int) j2) / 2);
        mo75872a(j);
        if (g) {
            mo75880b();
        }
    }
}
