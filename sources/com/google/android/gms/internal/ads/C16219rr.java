package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.rr */
public final class C16219rr {

    /* renamed from: a */
    static final Object f45518a = new Object();

    /* renamed from: b */
    static boolean f45519b = false;

    /* renamed from: d */
    private static boolean f45520d = false;

    /* renamed from: c */
    aoj f45521c;

    /* renamed from: a */
    public final boolean mo31372a(Context context) {
        synchronized (f45518a) {
            if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44334cO)).booleanValue()) {
                return false;
            }
            if (f45519b) {
                return true;
            }
            try {
                m38729c(context);
                boolean a = this.f45521c.mo29421a(C14886d.m30544a(context));
                f45519b = a;
                return a;
            } catch (RemoteException | NullPointerException e) {
                afc.m32797d("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    /* renamed from: c */
    private final void m38729c(Context context) {
        synchronized (f45518a) {
            if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44334cO)).booleanValue() && !f45520d) {
                try {
                    f45520d = true;
                    this.f45521c = (aoj) afd.m32800a(context, "com.google.android.gms.ads.omid.DynamiteOmid", C16220rs.f45522a);
                } catch (aff e) {
                    afc.m32797d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    /* renamed from: b */
    public final String mo31373b(Context context) {
        if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44334cO)).booleanValue()) {
            return null;
        }
        try {
            m38729c(context);
            String str = "a.";
            String valueOf = String.valueOf(this.f45521c.mo29419a());
            return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        } catch (RemoteException | NullPointerException e) {
            afc.m32797d("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* renamed from: a */
    public final C14882b mo31368a(String str, WebView webView, String str2, String str3, String str4) {
        return mo31369a(str, webView, str2, str3, str4, "Google");
    }

    /* renamed from: a */
    public final C14882b mo31369a(String str, WebView webView, String str2, String str3, String str4, String str5) {
        synchronized (f45518a) {
            try {
                if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44334cO)).booleanValue()) {
                    if (f45519b) {
                        try {
                            return this.f45521c.mo29418a(str, C14886d.m30544a(webView), str2, str3, str4, str5);
                        } catch (RemoteException | NullPointerException e) {
                            afc.m32797d("#007 Could not call remote method.", e);
                            return null;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo31370a(C14882b bVar) {
        synchronized (f45518a) {
            if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44334cO)).booleanValue()) {
                if (f45519b) {
                    try {
                        this.f45521c.mo29422b(bVar);
                    } catch (RemoteException | NullPointerException e) {
                        afc.m32797d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo31371a(C14882b bVar, View view) {
        synchronized (f45518a) {
            if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44334cO)).booleanValue()) {
                if (f45519b) {
                    try {
                        this.f45521c.mo29420a(bVar, C14886d.m30544a(view));
                    } catch (RemoteException | NullPointerException e) {
                        afc.m32797d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }
}
