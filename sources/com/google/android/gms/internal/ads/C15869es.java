package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.C14916b.C14918b;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.es */
public final class C15869es extends C14918b {

    /* renamed from: a */
    private final C15865eo f44974a;

    /* renamed from: b */
    private final Drawable f44975b;

    /* renamed from: c */
    private final Uri f44976c;

    /* renamed from: d */
    private final double f44977d;

    /* renamed from: e */
    private final int f44978e;

    /* renamed from: f */
    private final int f44979f;

    public C15869es(C15865eo eoVar) {
        Drawable drawable;
        int i;
        this.f44974a = eoVar;
        Uri uri = null;
        try {
            C14882b a = this.f44974a.mo30929a();
            if (a != null) {
                drawable = (Drawable) C14886d.m30545a(a);
                this.f44975b = drawable;
                uri = this.f44974a.mo30930b();
                this.f44976c = uri;
                double d = 1.0d;
                d = this.f44974a.mo30931c();
                this.f44977d = d;
                int i2 = -1;
                i = this.f44974a.mo30932d();
                this.f44978e = i;
                i2 = this.f44974a.mo30933e();
                this.f44979f = i2;
            }
        } catch (RemoteException e) {
            afc.m32793b("", e);
        }
        drawable = null;
        this.f44975b = drawable;
        try {
            uri = this.f44974a.mo30930b();
        } catch (RemoteException e2) {
            afc.m32793b("", e2);
        }
        this.f44976c = uri;
        double d2 = 1.0d;
        try {
            d2 = this.f44974a.mo30931c();
        } catch (RemoteException e3) {
            afc.m32793b("", e3);
        }
        this.f44977d = d2;
        int i22 = -1;
        try {
            i = this.f44974a.mo30932d();
        } catch (RemoteException e4) {
            afc.m32793b("", e4);
            i = -1;
        }
        this.f44978e = i;
        try {
            i22 = this.f44974a.mo30933e();
        } catch (RemoteException e5) {
            afc.m32793b("", e5);
        }
        this.f44979f = i22;
    }

    /* renamed from: a */
    public final Drawable mo27347a() {
        return this.f44975b;
    }

    /* renamed from: b */
    public final Uri mo27348b() {
        return this.f44976c;
    }

    /* renamed from: c */
    public final double mo27349c() {
        return this.f44977d;
    }

    /* renamed from: d */
    public final int mo27350d() {
        return this.f44978e;
    }

    /* renamed from: e */
    public final int mo27351e() {
        return this.f44979f;
    }
}
