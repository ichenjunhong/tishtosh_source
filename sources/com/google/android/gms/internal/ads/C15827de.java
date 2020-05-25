package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.de */
public final class C15827de extends C15866ep {

    /* renamed from: a */
    private final Drawable f44824a;

    /* renamed from: b */
    private final Uri f44825b;

    /* renamed from: c */
    private final double f44826c;

    /* renamed from: d */
    private final int f44827d;

    /* renamed from: e */
    private final int f44828e;

    public C15827de(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.f44824a = drawable;
        this.f44825b = uri;
        this.f44826c = d;
        this.f44827d = i;
        this.f44828e = i2;
    }

    /* renamed from: a */
    public final C14882b mo30929a() throws RemoteException {
        return C14886d.m30544a(this.f44824a);
    }

    /* renamed from: b */
    public final Uri mo30930b() throws RemoteException {
        return this.f44825b;
    }

    /* renamed from: c */
    public final double mo30931c() {
        return this.f44826c;
    }

    /* renamed from: d */
    public final int mo30932d() {
        return this.f44827d;
    }

    /* renamed from: e */
    public final int mo30933e() {
        return this.f44828e;
    }
}
