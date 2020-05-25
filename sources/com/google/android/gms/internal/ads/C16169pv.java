package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.C14850a.C14851a;
import com.google.ads.mediation.C14862c;
import com.google.ads.mediation.C14870d;
import com.google.ads.mediation.C14871e;
import com.google.ads.mediation.C14874f;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.taobao.android.dexposed.ClassUtils;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.pv */
public final class C16169pv<NETWORK_EXTRAS extends C14874f, SERVER_PARAMETERS extends C14871e> implements C14862c, C14870d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C16141ou f45430a;

    public C16169pv(C16141ou ouVar) {
        this.f45430a = ouVar;
    }

    /* renamed from: a */
    public final void mo27215a(MediationBannerAdapter<?, ?> mediationBannerAdapter, C14851a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(valueOf);
        afc.m32792b(sb.toString());
        if (!aes.m32760b()) {
            afc.m32797d("#008 Must be called on the main UI thread.", null);
            aes.f40377a.post(new C16170pw(this, aVar));
            return;
        }
        try {
            this.f45430a.mo31202a(C16172py.m38624a(aVar));
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo27221a(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, C14851a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        afc.m32792b(sb.toString());
        if (!aes.m32760b()) {
            afc.m32797d("#008 Must be called on the main UI thread.", null);
            aes.f40377a.post(new C16171px(this, aVar));
            return;
        }
        try {
            this.f45430a.mo31202a(C16172py.m38624a(aVar));
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }
}
