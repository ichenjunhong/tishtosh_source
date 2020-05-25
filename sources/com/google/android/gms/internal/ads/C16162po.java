package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C14937i;
import com.google.android.gms.ads.formats.C14927h;
import com.google.android.gms.ads.mediation.C15053c;
import com.google.android.gms.ads.mediation.C15062d;
import com.google.android.gms.ads.mediation.C15063e;
import com.google.android.gms.ads.mediation.C15064f;
import com.google.android.gms.ads.mediation.C15069k;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.internal.C15464q;
import com.taobao.android.dexposed.ClassUtils;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.po */
public final class C16162po implements C15053c, C15062d, C15063e {

    /* renamed from: a */
    public C15064f f45408a;

    /* renamed from: b */
    public C15069k f45409b;

    /* renamed from: c */
    public C14927h f45410c;

    /* renamed from: d */
    private final C16141ou f45411d;

    public C16162po(C16141ou ouVar) {
        this.f45411d = ouVar;
    }

    /* renamed from: a */
    public final void mo27757a(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAppEvent.");
        try {
            this.f45411d.mo31210a(str, str2);
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo27761e(MediationBannerAdapter mediationBannerAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdClicked.");
        try {
            this.f45411d.mo31201a();
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void mo27759c(MediationBannerAdapter mediationBannerAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdClosed.");
        try {
            this.f45411d.mo31211b();
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo27756a(MediationBannerAdapter mediationBannerAdapter, int i) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i);
        afc.m32792b(sb.toString());
        try {
            this.f45411d.mo31202a(i);
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo27760d(MediationBannerAdapter mediationBannerAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdLeftApplication.");
        try {
            this.f45411d.mo31213c();
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo27758b(MediationBannerAdapter mediationBannerAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdOpened.");
        try {
            this.f45411d.mo31214d();
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo27755a(MediationBannerAdapter mediationBannerAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdLoaded.");
        try {
            this.f45411d.mo31215e();
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo27772e(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdClicked.");
        try {
            this.f45411d.mo31201a();
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void mo27770c(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdClosed.");
        try {
            this.f45411d.mo31211b();
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo27768a(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        afc.m32792b(sb.toString());
        try {
            this.f45411d.mo31202a(i);
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo27771d(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdLeftApplication.");
        try {
            this.f45411d.mo31213c();
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo27769b(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdOpened.");
        try {
            this.f45411d.mo31214d();
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo27767a(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdLoaded.");
        try {
            this.f45411d.mo31215e();
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo27777a(MediationNativeAdapter mediationNativeAdapter, C15064f fVar) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdLoaded.");
        this.f45408a = fVar;
        this.f45409b = null;
        m38491a(mediationNativeAdapter, this.f45409b, this.f45408a);
        try {
            this.f45411d.mo31215e();
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo27778a(MediationNativeAdapter mediationNativeAdapter, C15069k kVar) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdLoaded.");
        this.f45409b = kVar;
        this.f45408a = null;
        m38491a(mediationNativeAdapter, this.f45409b, this.f45408a);
        try {
            this.f45411d.mo31215e();
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    private static void m38491a(MediationNativeAdapter mediationNativeAdapter, C15069k kVar, C15064f fVar) {
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            C14937i iVar = new C14937i();
            iVar.mo27431a(new C16157pj());
            if (kVar != null && kVar.f38917k) {
                kVar.f38916j = iVar;
            }
            if (fVar != null && fVar.f38892g) {
                fVar.f38891f = iVar;
            }
        }
    }

    /* renamed from: a */
    public final void mo27775a(MediationNativeAdapter mediationNativeAdapter, C14927h hVar) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        String str = "Adapter called onAdLoaded with template id ";
        String valueOf = String.valueOf(hVar.mo27382a());
        afc.m32792b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        this.f45410c = hVar;
        try {
            this.f45411d.mo31215e();
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo27776a(MediationNativeAdapter mediationNativeAdapter, C14927h hVar, String str) {
        if (hVar instanceof C15892fo) {
            try {
                this.f45411d.mo31204a(((C15892fo) hVar).f44991a, str);
            } catch (RemoteException e) {
                afc.m32797d("#007 Could not call remote method.", e);
            }
        } else {
            afc.m32798e("Unexpected native custom template ad type.");
        }
    }

    /* renamed from: a */
    public final void mo27774a(MediationNativeAdapter mediationNativeAdapter, int i) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        afc.m32792b(sb.toString());
        try {
            this.f45411d.mo31202a(i);
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo27773a(MediationNativeAdapter mediationNativeAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdOpened.");
        try {
            this.f45411d.mo31214d();
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo27779b(MediationNativeAdapter mediationNativeAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdClosed.");
        try {
            this.f45411d.mo31211b();
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void mo27780c(MediationNativeAdapter mediationNativeAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdLeftApplication.");
        try {
            this.f45411d.mo31213c();
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo27781d(MediationNativeAdapter mediationNativeAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        C15064f fVar = this.f45408a;
        C15069k kVar = this.f45409b;
        if (this.f45410c == null) {
            if (fVar == null && kVar == null) {
                afc.m32797d("#007 Could not call remote method.", null);
                return;
            } else if (kVar != null && !kVar.f38923q) {
                afc.m32792b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            } else if (fVar != null && !fVar.f38887b) {
                afc.m32792b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        afc.m32792b("Adapter called onAdClicked.");
        try {
            this.f45411d.mo31201a();
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo27782e(MediationNativeAdapter mediationNativeAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        C15064f fVar = this.f45408a;
        C15069k kVar = this.f45409b;
        if (this.f45410c == null) {
            if (fVar == null && kVar == null) {
                afc.m32797d("#007 Could not call remote method.", null);
                return;
            } else if (kVar != null && !kVar.f38922p) {
                afc.m32792b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            } else if (fVar != null && !fVar.f38886a) {
                afc.m32792b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        afc.m32792b("Adapter called onAdImpression.");
        try {
            this.f45411d.mo31216f();
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }
}
