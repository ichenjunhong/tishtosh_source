package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.C15081b;
import com.google.android.gms.ads.reward.mediation.C15083a;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.p1027a.C14886d;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.zg */
public final class C16424zg implements C15083a {

    /* renamed from: a */
    private final C16421zd f46037a;

    public C16424zg(C16421zd zdVar) {
        this.f46037a = zdVar;
    }

    /* renamed from: a */
    public final void mo27797a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onInitializationSucceeded.");
        try {
            this.f46037a.mo31526a(C14886d.m30544a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo27800b(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdLoaded.");
        try {
            this.f46037a.mo31529b(C14886d.m30544a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void mo27801c(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdOpened.");
        try {
            this.f46037a.mo31531c(C14886d.m30544a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo27802d(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onVideoStarted.");
        try {
            this.f46037a.mo31532d(C14886d.m30544a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo27803e(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdClosed.");
        try {
            this.f46037a.mo31533e(C14886d.m30544a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo27799a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, C15081b bVar) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onRewarded.");
        if (bVar != null) {
            try {
                this.f46037a.mo31528a(C14886d.m30544a(mediationRewardedVideoAdAdapter), new zzbaz(bVar));
            } catch (RemoteException e) {
                afc.m32797d("#007 Could not call remote method.", e);
            }
        } else {
            this.f46037a.mo31528a(C14886d.m30544a(mediationRewardedVideoAdAdapter), new zzbaz("", 1));
        }
    }

    /* renamed from: a */
    public final void mo27798a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdFailedToLoad.");
        try {
            this.f46037a.mo31530b(C14886d.m30544a(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: f */
    public final void mo27804f(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdLeftApplication.");
        try {
            this.f46037a.mo31535g(C14886d.m30544a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: g */
    public final void mo27805g(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onVideoCompleted.");
        try {
            this.f46037a.mo31536h(C14886d.m30544a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo27796a(Bundle bundle) {
        C15464q.m32132b("#008 Must be called on the main UI thread.");
        afc.m32792b("Adapter called onAdMetadataChanged.");
        try {
            this.f46037a.mo31525a(bundle);
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }
}
