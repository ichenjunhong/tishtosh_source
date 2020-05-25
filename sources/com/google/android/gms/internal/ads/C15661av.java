package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.C14895a;
import com.google.android.gms.ads.C14935g;
import com.google.android.gms.ads.p1028a.C14896a;
import com.google.android.gms.ads.p1028a.C14897b;
import com.google.android.gms.ads.p1028a.C14899d;
import com.google.android.gms.ads.reward.C15080a;
import com.google.android.gms.ads.reward.C15082c;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.av */
public final class C15661av {

    /* renamed from: a */
    public C14895a f41401a;

    /* renamed from: b */
    public String f41402b;

    /* renamed from: c */
    public C14896a f41403c;

    /* renamed from: d */
    public C14897b f41404d;

    /* renamed from: e */
    public boolean f41405e;

    /* renamed from: f */
    private final C16133om f41406f;

    /* renamed from: g */
    private final Context f41407g;

    /* renamed from: h */
    private final bzu f41408h;

    /* renamed from: i */
    private bzl f41409i;

    /* renamed from: j */
    private C15931h f41410j;

    /* renamed from: k */
    private C15080a f41411k;

    /* renamed from: l */
    private C14935g f41412l;

    /* renamed from: m */
    private C15082c f41413m;

    /* renamed from: n */
    private boolean f41414n;

    public C15661av(Context context) {
        this(context, bzu.f44719a, null);
    }

    private C15661av(Context context, bzu bzu, C14899d dVar) {
        this.f41406f = new C16133om();
        this.f41407g = context;
        this.f41408h = bzu;
    }

    /* renamed from: a */
    public final void mo29563a(C15619ar arVar) {
        try {
            if (this.f41410j == null) {
                String str = "loadAd";
                if (this.f41402b == null) {
                    m34205b(str);
                }
                zzyz a = this.f41405e ? zzyz.m39302a() : new zzyz();
                bzy b = caf.m37097b();
                Context context = this.f41407g;
                cac cac = new cac(b, context, a, this.f41402b, this.f41406f);
                this.f41410j = (C15931h) cac.mo30891a(context, false);
                if (this.f41401a != null) {
                    this.f41410j.mo27457a((cal) new bzo(this.f41401a));
                }
                if (this.f41409i != null) {
                    this.f41410j.mo27456a((cai) new bzm(this.f41409i));
                }
                if (this.f41411k != null) {
                    this.f41410j.mo27460a((C16066m) new bzr(this.f41411k));
                }
                if (this.f41403c != null) {
                    this.f41410j.mo27461a((C16147p) new bzx(this.f41403c));
                }
                if (this.f41404d != null) {
                    this.f41410j.mo27459a((C15813cr) new C15816cu(this.f41404d));
                }
                if (this.f41412l != null) {
                    this.f41410j.mo27464a((C16309v) this.f41412l.f38492a);
                }
                if (this.f41413m != null) {
                    this.f41410j.mo27466a((C16396yf) new C16403ym(this.f41413m));
                }
                this.f41410j.mo27481b(this.f41414n);
            }
            if (this.f41410j.mo27482b(bzu.m37053a(this.f41407g, arVar))) {
                this.f41406f.f45384a = arVar.f41244h;
            }
        } catch (RemoteException e) {
            afc.m32797d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo29560a(C14895a aVar) {
        try {
            this.f41401a = aVar;
            if (this.f41410j != null) {
                this.f41410j.mo27457a((cal) aVar != null ? new bzo(aVar) : null);
            }
        } catch (RemoteException e) {
            afc.m32797d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo29564a(bzl bzl) {
        try {
            this.f41409i = bzl;
            if (this.f41410j != null) {
                this.f41410j.mo27456a((cai) bzl != null ? new bzm(bzl) : null);
            }
        } catch (RemoteException e) {
            afc.m32797d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo29565a(String str) {
        if (this.f41402b == null) {
            this.f41402b = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }

    /* renamed from: a */
    public final void mo29561a(C15080a aVar) {
        try {
            this.f41411k = aVar;
            if (this.f41410j != null) {
                this.f41410j.mo27460a((C16066m) aVar != null ? new bzr(aVar) : null);
            }
        } catch (RemoteException e) {
            afc.m32797d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final Bundle mo29559a() {
        try {
            if (this.f41410j != null) {
                return this.f41410j.mo27492n();
            }
        } catch (RemoteException e) {
            afc.m32797d("#008 Must be called on the main UI thread.", e);
        }
        return new Bundle();
    }

    /* renamed from: a */
    public final void mo29562a(C15082c cVar) {
        try {
            this.f41413m = cVar;
            if (this.f41410j != null) {
                this.f41410j.mo27466a((C16396yf) cVar != null ? new C16403ym(cVar) : null);
            }
        } catch (RemoteException e) {
            afc.m32797d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: b */
    public final void mo29567b() {
        try {
            m34205b("show");
            this.f41410j.mo27508E();
        } catch (RemoteException e) {
            afc.m32797d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo29566a(boolean z) {
        try {
            this.f41414n = z;
            if (this.f41410j != null) {
                this.f41410j.mo27481b(z);
            }
        } catch (RemoteException e) {
            afc.m32797d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: b */
    private final void m34205b(String str) {
        if (this.f41410j == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
            sb.append("The ad unit ID must be set on InterstitialAd before ");
            sb.append(str);
            sb.append(" is called.");
            throw new IllegalStateException(sb.toString());
        }
    }
}
