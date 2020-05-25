package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.gms.ads.C14895a;
import com.google.android.gms.ads.C14912d;
import com.google.android.gms.ads.C14935g;
import com.google.android.gms.ads.C14937i;
import com.google.android.gms.ads.C15040j;
import com.google.android.gms.ads.p1028a.C14896a;
import com.google.android.gms.ads.p1028a.C14897b;
import java.util.concurrent.atomic.AtomicBoolean;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.at */
public final class C15641at {

    /* renamed from: a */
    public final C16133om f41315a;

    /* renamed from: b */
    public final C14937i f41316b;

    /* renamed from: c */
    public final cah f41317c;

    /* renamed from: d */
    public bzl f41318d;

    /* renamed from: e */
    public C14895a f41319e;

    /* renamed from: f */
    public C14912d[] f41320f;

    /* renamed from: g */
    public C14896a f41321g;

    /* renamed from: h */
    public C14935g f41322h;

    /* renamed from: i */
    public C15931h f41323i;

    /* renamed from: j */
    public C14897b f41324j;

    /* renamed from: k */
    public C15040j f41325k;

    /* renamed from: l */
    public String f41326l;

    /* renamed from: m */
    public ViewGroup f41327m;

    /* renamed from: n */
    public int f41328n;

    /* renamed from: o */
    public boolean f41329o;

    /* renamed from: p */
    private final bzu f41330p;

    /* renamed from: q */
    private final AtomicBoolean f41331q;

    /* renamed from: a */
    private static boolean m34090a(int i) {
        return i == 1;
    }

    public C15641at(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, bzu.f44719a, i);
    }

    private C15641at(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, bzu bzu, C15931h hVar, int i) {
        this.f41315a = new C16133om();
        this.f41316b = new C14937i();
        this.f41317c = new C15658au(this);
        this.f41327m = viewGroup;
        this.f41330p = bzu;
        this.f41323i = null;
        this.f41331q = new AtomicBoolean(false);
        this.f41328n = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzzc zzzc = new zzzc(context, attributeSet);
                if (!z) {
                    if (zzzc.f46348a.length != 1) {
                        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
                    }
                }
                this.f41320f = zzzc.f46348a;
                this.f41326l = zzzc.f46349b;
                if (viewGroup.isInEditMode()) {
                    caf.m37096a();
                    C14912d dVar = this.f41320f[0];
                    int i2 = this.f41328n;
                    zzyz zzyz = new zzyz(context, dVar);
                    zzyz.f46347j = m34090a(i2);
                    aes.m32755a(viewGroup, zzyz, "Ads by Google", -16777216, -1);
                }
            } catch (IllegalArgumentException e) {
                caf.m37096a().mo28762a(viewGroup, new zzyz(context, C14912d.f38454a), e.getMessage(), e.getMessage());
            }
        }
    }

    private C15641at(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, bzu bzu, int i) {
        this(viewGroup, null, false, bzu, null, i);
    }

    /* renamed from: a */
    public final C14912d mo29512a() {
        try {
            if (this.f41323i != null) {
                zzyz i = this.f41323i.mo27487i();
                if (i != null) {
                    return i.mo31647b();
                }
            }
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
        if (this.f41320f != null) {
            return this.f41320f[0];
        }
        return null;
    }

    /* renamed from: b */
    public final String mo29518b() {
        if (this.f41326l == null && this.f41323i != null) {
            try {
                this.f41326l = this.f41323i.mo27444A();
            } catch (RemoteException e) {
                afc.m32797d("#007 Could not call remote method.", e);
            }
        }
        return this.f41326l;
    }

    /* renamed from: a */
    public final void mo29514a(C14895a aVar) {
        this.f41319e = aVar;
        this.f41317c.mo30893a(aVar);
    }

    /* renamed from: a */
    public final void mo29515a(bzl bzl) {
        try {
            this.f41318d = bzl;
            if (this.f41323i != null) {
                this.f41323i.mo27456a((cai) bzl != null ? new bzm(bzl) : null);
            }
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo29517a(C14912d... dVarArr) {
        if (this.f41320f == null) {
            mo29519b(dVarArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    /* renamed from: b */
    public final void mo29519b(C14912d... dVarArr) {
        this.f41320f = dVarArr;
        try {
            if (this.f41323i != null) {
                this.f41323i.mo27470a(m34089a(this.f41327m.getContext(), this.f41320f, this.f41328n));
            }
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
        this.f41327m.requestLayout();
    }

    /* renamed from: a */
    public final void mo29516a(String str) {
        if (this.f41326l == null) {
            this.f41326l = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    /* renamed from: a */
    public final void mo29513a(C14896a aVar) {
        try {
            this.f41321g = aVar;
            if (this.f41323i != null) {
                this.f41323i.mo27461a((C16147p) aVar != null ? new bzx(aVar) : null);
            }
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final String mo29520c() {
        try {
            if (this.f41323i != null) {
                return this.f41323i.mo27550B_();
            }
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
        return null;
    }

    /* renamed from: d */
    public final C15583ak mo29521d() {
        if (this.f41323i == null) {
            return null;
        }
        try {
            return this.f41323i.mo27495q();
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* renamed from: a */
    public static zzyz m34089a(Context context, C14912d[] dVarArr, int i) {
        zzyz zzyz = new zzyz(context, dVarArr);
        zzyz.f46347j = m34090a(i);
        return zzyz;
    }
}
