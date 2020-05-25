package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.C14853b;
import com.google.ads.mediation.C14861b;
import com.google.ads.mediation.C14871e;
import com.google.ads.mediation.C14874f;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.C15043m;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.pu */
public final class C16168pu<NETWORK_EXTRAS extends C14874f, SERVER_PARAMETERS extends C14871e> extends C16139os {

    /* renamed from: a */
    private final C14861b<NETWORK_EXTRAS, SERVER_PARAMETERS> f45428a;

    /* renamed from: b */
    private final NETWORK_EXTRAS f45429b;

    public C16168pu(C14861b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.f45428a = bVar;
        this.f45429b = network_extras;
    }

    /* renamed from: a */
    public final void mo31239a(C14882b bVar) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo31240a(C14882b bVar, C15983iy iyVar, List<zzakq> list) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo31241a(C14882b bVar, C16421zd zdVar, List<String> list) {
    }

    /* renamed from: a */
    public final void mo31243a(C14882b bVar, zzyv zzyv, String str, C16421zd zdVar, String str2) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo31245a(C14882b bVar, zzyv zzyv, String str, String str2, C16141ou ouVar, zzafl zzafl, List<String> list) {
    }

    /* renamed from: a */
    public final void mo31248a(zzyv zzyv, String str) {
    }

    /* renamed from: a */
    public final void mo31249a(zzyv zzyv, String str, String str2) {
    }

    /* renamed from: a */
    public final void mo31250a(boolean z) {
    }

    /* renamed from: b */
    public final void mo31252b(C14882b bVar) throws RemoteException {
    }

    /* renamed from: b */
    public final void mo31253b(C14882b bVar, zzyv zzyv, String str, C16141ou ouVar) throws RemoteException {
    }

    /* renamed from: f */
    public final void mo31257f() {
    }

    /* renamed from: g */
    public final boolean mo31258g() {
        return true;
    }

    /* renamed from: h */
    public final C16148pa mo31259h() {
        return null;
    }

    /* renamed from: i */
    public final C16151pd mo31260i() {
        return null;
    }

    /* renamed from: m */
    public final boolean mo31264m() {
        return false;
    }

    /* renamed from: n */
    public final C15889fl mo31265n() {
        return null;
    }

    /* renamed from: o */
    public final C15583ak mo31266o() {
        return null;
    }

    /* renamed from: p */
    public final C16154pg mo31267p() {
        return null;
    }

    /* renamed from: a */
    public final C14882b mo31238a() throws RemoteException {
        if (!(this.f45428a instanceof MediationBannerAdapter)) {
            String str = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f45428a.getClass().getCanonicalName());
            afc.m32798e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
        try {
            return C14886d.m30544a(((MediationBannerAdapter) this.f45428a).getBannerView());
        } catch (Throwable th) {
            afc.m32793b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo31246a(C14882b bVar, zzyz zzyz, zzyv zzyv, String str, C16141ou ouVar) throws RemoteException {
        mo31247a(bVar, zzyz, zzyv, str, null, ouVar);
    }

    /* renamed from: a */
    public final void mo31247a(C14882b bVar, zzyz zzyz, zzyv zzyv, String str, String str2, C16141ou ouVar) throws RemoteException {
        C14853b bVar2;
        if (!(this.f45428a instanceof MediationBannerAdapter)) {
            String str3 = "Not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f45428a.getClass().getCanonicalName());
            afc.m32798e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
        afc.m32792b("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f45428a;
            C16169pv pvVar = new C16169pv(ouVar);
            Activity activity = (Activity) C14886d.m30545a(bVar);
            C14871e a = m38589a(str);
            int i = 0;
            C14853b[] bVarArr = {C14853b.f38378a, C14853b.f38379b, C14853b.f38380c, C14853b.f38381d, C14853b.f38382e, C14853b.f38383f};
            while (true) {
                if (i < 6) {
                    if (bVarArr[i].mo27171a() == zzyz.f46342e && bVarArr[i].mo27172b() == zzyz.f46339b) {
                        bVar2 = bVarArr[i];
                        break;
                    }
                    i++;
                } else {
                    bVar2 = new C14853b(C15043m.m31117a(zzyz.f46342e, zzyz.f46339b, zzyz.f46338a));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(pvVar, activity, a, bVar2, C16172py.m38625a(zzyv, m38590a(zzyv)), this.f45429b);
        } catch (Throwable th) {
            afc.m32793b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: j */
    public final Bundle mo31261j() {
        return new Bundle();
    }

    /* renamed from: a */
    public final void mo31242a(C14882b bVar, zzyv zzyv, String str, C16141ou ouVar) throws RemoteException {
        mo31244a(bVar, zzyv, str, (String) null, ouVar);
    }

    /* renamed from: a */
    public final void mo31244a(C14882b bVar, zzyv zzyv, String str, String str2, C16141ou ouVar) throws RemoteException {
        if (!(this.f45428a instanceof MediationInterstitialAdapter)) {
            String str3 = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f45428a.getClass().getCanonicalName());
            afc.m32798e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
        afc.m32792b("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f45428a).requestInterstitialAd(new C16169pv(ouVar), (Activity) C14886d.m30545a(bVar), m38589a(str), C16172py.m38625a(zzyv, m38590a(zzyv)), this.f45429b);
        } catch (Throwable th) {
            afc.m32793b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: k */
    public final Bundle mo31262k() {
        return new Bundle();
    }

    /* renamed from: b */
    public final void mo31251b() throws RemoteException {
        if (!(this.f45428a instanceof MediationInterstitialAdapter)) {
            String str = "Not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f45428a.getClass().getCanonicalName());
            afc.m32798e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
        afc.m32792b("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f45428a).showInterstitial();
        } catch (Throwable th) {
            afc.m32793b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: l */
    public final Bundle mo31263l() {
        return new Bundle();
    }

    /* renamed from: c */
    public final void mo31254c() throws RemoteException {
        try {
            this.f45428a.destroy();
        } catch (Throwable th) {
            afc.m32793b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: d */
    public final void mo31255d() throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: e */
    public final void mo31256e() throws RemoteException {
        throw new RemoteException();
    }

    /* renamed from: a */
    private final SERVER_PARAMETERS m38589a(String str) throws RemoteException {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    hashMap.put(str2, jSONObject.getString(str2));
                }
            } finally {
                afc.m32793b("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class serverParametersType = this.f45428a.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS server_parameters = (C14871e) serverParametersType.newInstance();
        server_parameters.mo27222a(hashMap);
        return server_parameters;
    }

    /* renamed from: a */
    private static boolean m38590a(zzyv zzyv) {
        return zzyv.f46322f || aes.m32757a();
    }
}
