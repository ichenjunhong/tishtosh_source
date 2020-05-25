package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C15041k;
import com.google.android.gms.ads.C15043m;
import com.google.android.gms.ads.formats.C14927h;
import com.google.android.gms.ads.mediation.C15051b;
import com.google.android.gms.ads.mediation.C15064f;
import com.google.android.gms.ads.mediation.C15065g;
import com.google.android.gms.ads.mediation.C15066h;
import com.google.android.gms.ads.mediation.C15068j;
import com.google.android.gms.ads.mediation.C15069k;
import com.google.android.gms.ads.mediation.C15070l;
import com.google.android.gms.ads.mediation.C15074p;
import com.google.android.gms.ads.mediation.C15077s;
import com.google.android.gms.ads.mediation.C15079u;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.pl */
public final class C16159pl extends C16139os {

    /* renamed from: a */
    private final Object f45400a;

    /* renamed from: b */
    private C16162po f45401b;

    /* renamed from: c */
    private C16421zd f45402c;

    /* renamed from: d */
    private C14882b f45403d;

    public C16159pl(C15051b bVar) {
        this.f45400a = bVar;
    }

    public C16159pl(C15070l lVar) {
        this.f45400a = lVar;
    }

    /* renamed from: a */
    public final C14882b mo31238a() throws RemoteException {
        if (this.f45400a instanceof MediationBannerAdapter) {
            try {
                return C14886d.m30544a(((MediationBannerAdapter) this.f45400a).getBannerView());
            } catch (Throwable th) {
                afc.m32793b("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.f45400a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            afc.m32798e(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo31246a(C14882b bVar, zzyz zzyz, zzyv zzyv, String str, C16141ou ouVar) throws RemoteException {
        mo31247a(bVar, zzyz, zzyv, str, null, ouVar);
    }

    /* renamed from: a */
    public final void mo31247a(C14882b bVar, zzyz zzyz, zzyv zzyv, String str, String str2, C16141ou ouVar) throws RemoteException {
        Date date;
        zzyz zzyz2 = zzyz;
        zzyv zzyv2 = zzyv;
        String str3 = str;
        if (this.f45400a instanceof MediationBannerAdapter) {
            afc.m32792b("Requesting banner ad from adapter.");
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f45400a;
                Bundle bundle = null;
                Set hashSet = zzyv2.f46321e != null ? new HashSet(zzyv2.f46321e) : null;
                if (zzyv2.f46318b == -1) {
                    date = null;
                } else {
                    date = new Date(zzyv2.f46318b);
                }
                C16158pk pkVar = new C16158pk(date, zzyv2.f46320d, hashSet, zzyv2.f46327k, m38459a(zzyv), zzyv2.f46323g, zzyv2.f46334r, zzyv2.f46336t, m38458a(str3, zzyv2));
                if (zzyv2.f46329m != null) {
                    bundle = zzyv2.f46329m.getBundle(mediationBannerAdapter.getClass().getName());
                }
                mediationBannerAdapter.requestBannerAd((Context) C14886d.m30545a(bVar), new C16162po(ouVar), m38457a(str3, zzyv2, str2), C15043m.m31117a(zzyz2.f46342e, zzyz2.f46339b, zzyz2.f46338a), pkVar, bundle);
            } catch (Throwable th) {
                afc.m32793b("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.f45400a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            afc.m32798e(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: j */
    public final Bundle mo31261j() {
        if (this.f45400a instanceof zzbps) {
            return ((zzbps) this.f45400a).zzxs();
        }
        String canonicalName = zzbps.class.getCanonicalName();
        String canonicalName2 = this.f45400a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        afc.m32798e(sb.toString());
        return new Bundle();
    }

    /* renamed from: a */
    public final void mo31242a(C14882b bVar, zzyv zzyv, String str, C16141ou ouVar) throws RemoteException {
        mo31244a(bVar, zzyv, str, (String) null, ouVar);
    }

    /* renamed from: a */
    public final void mo31244a(C14882b bVar, zzyv zzyv, String str, String str2, C16141ou ouVar) throws RemoteException {
        Date date;
        zzyv zzyv2 = zzyv;
        String str3 = str;
        if (this.f45400a instanceof MediationInterstitialAdapter) {
            afc.m32792b("Requesting interstitial ad from adapter.");
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f45400a;
                Bundle bundle = null;
                Set hashSet = zzyv2.f46321e != null ? new HashSet(zzyv2.f46321e) : null;
                if (zzyv2.f46318b == -1) {
                    date = null;
                } else {
                    date = new Date(zzyv2.f46318b);
                }
                C16158pk pkVar = new C16158pk(date, zzyv2.f46320d, hashSet, zzyv2.f46327k, m38459a(zzyv), zzyv2.f46323g, zzyv2.f46334r, zzyv2.f46336t, m38458a(str3, zzyv2));
                if (zzyv2.f46329m != null) {
                    bundle = zzyv2.f46329m.getBundle(mediationInterstitialAdapter.getClass().getName());
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) C14886d.m30545a(bVar), new C16162po(ouVar), m38457a(str3, zzyv2, str2), pkVar, bundle);
            } catch (Throwable th) {
                afc.m32793b("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f45400a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            afc.m32798e(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: k */
    public final Bundle mo31262k() {
        if (this.f45400a instanceof zzbpt) {
            return ((zzbpt) this.f45400a).getInterstitialAdapterInfo();
        }
        String canonicalName = zzbpt.class.getCanonicalName();
        String canonicalName2 = this.f45400a.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        afc.m32798e(sb.toString());
        return new Bundle();
    }

    /* renamed from: a */
    public final void mo31245a(C14882b bVar, zzyv zzyv, String str, String str2, C16141ou ouVar, zzafl zzafl, List<String> list) throws RemoteException {
        Date date;
        zzyv zzyv2 = zzyv;
        String str3 = str;
        if (this.f45400a instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) this.f45400a;
                Bundle bundle = null;
                Set hashSet = zzyv2.f46321e != null ? new HashSet(zzyv2.f46321e) : null;
                if (zzyv2.f46318b == -1) {
                    date = null;
                } else {
                    date = new Date(zzyv2.f46318b);
                }
                C16167pt ptVar = new C16167pt(date, zzyv2.f46320d, hashSet, zzyv2.f46327k, m38459a(zzyv), zzyv2.f46323g, zzafl, list, zzyv2.f46334r, zzyv2.f46336t, m38458a(str3, zzyv2));
                if (zzyv2.f46329m != null) {
                    bundle = zzyv2.f46329m.getBundle(mediationNativeAdapter.getClass().getName());
                }
                this.f45401b = new C16162po(ouVar);
                mediationNativeAdapter.requestNativeAd((Context) C14886d.m30545a(bVar), this.f45401b, m38457a(str3, zzyv2, str2), ptVar, bundle);
            } catch (Throwable th) {
                afc.m32793b("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = this.f45400a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            afc.m32798e(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: l */
    public final Bundle mo31263l() {
        return new Bundle();
    }

    /* renamed from: h */
    public final C16148pa mo31259h() {
        C15064f fVar = this.f45401b.f45408a;
        if (fVar instanceof C15065g) {
            return new C16165pr((C15065g) fVar);
        }
        return null;
    }

    /* renamed from: p */
    public final C16154pg mo31267p() {
        C15069k kVar = this.f45401b.f45409b;
        if (kVar != null) {
            return new C16175qa(kVar);
        }
        return null;
    }

    /* renamed from: i */
    public final C16151pd mo31260i() {
        C15064f fVar = this.f45401b.f45408a;
        if (fVar instanceof C15066h) {
            return new C16166ps((C15066h) fVar);
        }
        return null;
    }

    /* renamed from: n */
    public final C15889fl mo31265n() {
        C14927h hVar = this.f45401b.f45410c;
        if (hVar instanceof C15892fo) {
            return ((C15892fo) hVar).f44991a;
        }
        return null;
    }

    /* renamed from: m */
    public final boolean mo31264m() {
        return this.f45400a instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    /* renamed from: a */
    public final void mo31243a(C14882b bVar, zzyv zzyv, String str, C16421zd zdVar, String str2) throws RemoteException {
        Bundle bundle;
        C16158pk pkVar;
        Date date;
        zzyv zzyv2 = zzyv;
        C16421zd zdVar2 = zdVar;
        String str3 = str2;
        if (this.f45400a instanceof MediationRewardedVideoAdAdapter) {
            afc.m32792b("Initialize rewarded video adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f45400a;
                Bundle a = m38457a(str3, zzyv2, (String) null);
                if (zzyv2 != null) {
                    Set hashSet = zzyv2.f46321e != null ? new HashSet(zzyv2.f46321e) : null;
                    if (zzyv2.f46318b == -1) {
                        date = null;
                    } else {
                        date = new Date(zzyv2.f46318b);
                    }
                    C16158pk pkVar2 = new C16158pk(date, zzyv2.f46320d, hashSet, zzyv2.f46327k, m38459a(zzyv), zzyv2.f46323g, zzyv2.f46334r, zzyv2.f46336t, m38458a(str3, zzyv2));
                    bundle = zzyv2.f46329m != null ? zzyv2.f46329m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                    pkVar = pkVar2;
                } else {
                    pkVar = null;
                    bundle = null;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) C14886d.m30545a(bVar), pkVar, str, new C16424zg(zdVar2), a, bundle);
            } catch (Throwable th) {
                afc.m32793b("", th);
                throw new RemoteException();
            }
        } else if (this.f45400a instanceof C15070l) {
            this.f45403d = bVar;
            this.f45402c = zdVar2;
            zdVar2.mo31526a(C14886d.m30544a(this.f45400a));
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = C15070l.class.getCanonicalName();
            String canonicalName3 = this.f45400a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            afc.m32798e(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo31241a(C14882b bVar, C16421zd zdVar, List<String> list) throws RemoteException {
        if (this.f45400a instanceof InitializableMediationRewardedVideoAdAdapter) {
            afc.m32792b("Initialize rewarded video adapter.");
            try {
                InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.f45400a;
                ArrayList arrayList = new ArrayList();
                for (String a : list) {
                    arrayList.add(m38457a(a, (zzyv) null, (String) null));
                }
                initializableMediationRewardedVideoAdAdapter.initialize((Context) C14886d.m30545a(bVar), new C16424zg(zdVar), arrayList);
            } catch (Throwable th) {
                afc.m32795c("Could not initialize rewarded video adapter.", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = InitializableMediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = this.f45400a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            afc.m32798e(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo31248a(zzyv zzyv, String str) throws RemoteException {
        mo31249a(zzyv, str, (String) null);
    }

    /* renamed from: a */
    public final void mo31249a(zzyv zzyv, String str, String str2) throws RemoteException {
        Date date;
        zzyv zzyv2 = zzyv;
        String str3 = str;
        if (this.f45400a instanceof MediationRewardedVideoAdAdapter) {
            afc.m32792b("Requesting rewarded video ad from adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f45400a;
                Bundle bundle = null;
                Set hashSet = zzyv2.f46321e != null ? new HashSet(zzyv2.f46321e) : null;
                if (zzyv2.f46318b == -1) {
                    date = null;
                } else {
                    date = new Date(zzyv2.f46318b);
                }
                C16158pk pkVar = new C16158pk(date, zzyv2.f46320d, hashSet, zzyv2.f46327k, m38459a(zzyv), zzyv2.f46323g, zzyv2.f46334r, zzyv2.f46336t, m38458a(str3, zzyv2));
                if (zzyv2.f46329m != null) {
                    bundle = zzyv2.f46329m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
                }
                mediationRewardedVideoAdAdapter.loadAd(pkVar, m38457a(str3, zzyv2, str2), bundle);
            } catch (Throwable th) {
                afc.m32793b("", th);
                throw new RemoteException();
            }
        } else if (this.f45400a instanceof C15070l) {
            mo31253b(this.f45403d, zzyv2, str3, new C16164pq((C15070l) this.f45400a, this.f45402c));
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = C15070l.class.getCanonicalName();
            String canonicalName3 = this.f45400a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            afc.m32798e(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: f */
    public final void mo31257f() throws RemoteException {
        if (this.f45400a instanceof MediationRewardedVideoAdAdapter) {
            afc.m32792b("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.f45400a).showVideo();
            } catch (Throwable th) {
                afc.m32793b("", th);
                throw new RemoteException();
            }
        } else if (!(this.f45400a instanceof C15070l)) {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = C15070l.class.getCanonicalName();
            String canonicalName3 = this.f45400a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            afc.m32798e(sb.toString());
            throw new RemoteException();
        } else {
            afc.m32794c("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
    }

    /* renamed from: g */
    public final boolean mo31258g() throws RemoteException {
        if (this.f45400a instanceof MediationRewardedVideoAdAdapter) {
            afc.m32792b("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.f45400a).isInitialized();
            } catch (Throwable th) {
                afc.m32793b("", th);
                throw new RemoteException();
            }
        } else if (this.f45400a instanceof C15070l) {
            return this.f45402c != null;
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = C15070l.class.getCanonicalName();
            String canonicalName3 = this.f45400a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            afc.m32798e(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: b */
    public final void mo31253b(C14882b bVar, zzyv zzyv, String str, C16141ou ouVar) throws RemoteException {
        Bundle bundle;
        zzyv zzyv2 = zzyv;
        String str2 = str;
        if (this.f45400a instanceof C15070l) {
            afc.m32792b("Requesting rewarded ad from adapter.");
            try {
                C15070l lVar = (C15070l) this.f45400a;
                C16160pm pmVar = new C16160pm(this, ouVar, lVar);
                Context context = (Context) C14886d.m30545a(bVar);
                String str3 = "";
                Bundle a = m38457a(str2, zzyv2, (String) null);
                if (zzyv2.f46329m != null) {
                    bundle = zzyv2.f46329m.getBundle(this.f45400a.getClass().getName());
                    if (bundle != null) {
                        C15077s sVar = new C15077s(context, str3, a, bundle, m38459a(zzyv), zzyv2.f46327k, zzyv2.f46323g, zzyv2.f46336t, m38458a(str2, zzyv2));
                        lVar.mo27790a(sVar, pmVar);
                    }
                }
                bundle = new Bundle();
                C15077s sVar2 = new C15077s(context, str3, a, bundle, m38459a(zzyv), zzyv2.f46327k, zzyv2.f46323g, zzyv2.f46336t, m38458a(str2, zzyv2));
                lVar.mo27790a(sVar2, pmVar);
            } catch (Exception e) {
                afc.m32793b("", e);
                throw new RemoteException();
            }
        } else {
            String canonicalName = C15070l.class.getCanonicalName();
            String canonicalName2 = this.f45400a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            afc.m32798e(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: b */
    public final void mo31252b(C14882b bVar) throws RemoteException {
        if (!(this.f45400a instanceof C15070l)) {
            String canonicalName = C15070l.class.getCanonicalName();
            String canonicalName2 = this.f45400a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            afc.m32798e(sb.toString());
            throw new RemoteException();
        }
        afc.m32792b("Show rewarded ad from adapter.");
        afc.m32794c("Can not show null mediation rewarded ad.");
        throw new RemoteException();
    }

    /* renamed from: a */
    public final void mo31250a(boolean z) throws RemoteException {
        if (!(this.f45400a instanceof C15068j)) {
            String canonicalName = C15068j.class.getCanonicalName();
            String canonicalName2 = this.f45400a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            afc.m32798e(sb.toString());
            return;
        }
        try {
            ((C15068j) this.f45400a).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            afc.m32793b("", th);
        }
    }

    /* renamed from: o */
    public final C15583ak mo31266o() {
        if (!(this.f45400a instanceof C15079u)) {
            return null;
        }
        try {
            return ((C15079u) this.f45400a).getVideoController();
        } catch (Throwable th) {
            afc.m32793b("", th);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo31251b() throws RemoteException {
        if (this.f45400a instanceof MediationInterstitialAdapter) {
            afc.m32792b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f45400a).showInterstitial();
            } catch (Throwable th) {
                afc.m32793b("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f45400a.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            afc.m32798e(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: c */
    public final void mo31254c() throws RemoteException {
        if (this.f45400a instanceof C15051b) {
            try {
                ((C15051b) this.f45400a).onDestroy();
            } catch (Throwable th) {
                afc.m32793b("", th);
                throw new RemoteException();
            }
        }
    }

    /* renamed from: d */
    public final void mo31255d() throws RemoteException {
        if (this.f45400a instanceof C15051b) {
            try {
                ((C15051b) this.f45400a).onPause();
            } catch (Throwable th) {
                afc.m32793b("", th);
                throw new RemoteException();
            }
        }
    }

    /* renamed from: e */
    public final void mo31256e() throws RemoteException {
        if (this.f45400a instanceof C15051b) {
            try {
                ((C15051b) this.f45400a).onResume();
            } catch (Throwable th) {
                afc.m32793b("", th);
                throw new RemoteException();
            }
        }
    }

    /* renamed from: a */
    public final void mo31239a(C14882b bVar) throws RemoteException {
        C14886d.m30545a(bVar);
    }

    /* renamed from: a */
    public final void mo31240a(C14882b bVar, C15983iy iyVar, List<zzakq> list) throws RemoteException {
        int i;
        if (this.f45400a instanceof C15070l) {
            new C16161pn(this, iyVar);
            ArrayList arrayList = new ArrayList();
            for (zzakq zzakq : list) {
                String str = zzakq.f46088a;
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != -1396342996) {
                    if (hashCode != -1052618729) {
                        if (hashCode != -239580146) {
                            if (hashCode == 604727084 && str.equals("interstitial")) {
                                c = 1;
                            }
                        } else if (str.equals("rewarded")) {
                            c = 2;
                        }
                    } else if (str.equals("native")) {
                        c = 3;
                    }
                } else if (str.equals("banner")) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                        i = C15041k.f38869a;
                        break;
                    case 1:
                        i = C15041k.f38870b;
                        break;
                    case 2:
                        i = C15041k.f38871c;
                        break;
                    case 3:
                        i = C15041k.f38872d;
                        break;
                    default:
                        throw new RemoteException();
                }
                arrayList.add(new C15074p(i, zzakq.f46089b));
            }
            C14886d.m30545a(bVar);
            return;
        }
        throw new RemoteException();
    }

    /* renamed from: a */
    private final Bundle m38457a(String str, zzyv zzyv, String str2) throws RemoteException {
        Bundle bundle;
        String str3 = "Server parameters: ";
        String valueOf = String.valueOf(str);
        afc.m32792b(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        try {
            Bundle bundle2 = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                bundle = new Bundle();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str4 = (String) keys.next();
                    bundle.putString(str4, jSONObject.getString(str4));
                }
            } else {
                bundle = bundle2;
            }
            if (this.f45400a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzyv != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzyv.f46323g);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            afc.m32793b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    private static boolean m38459a(zzyv zzyv) {
        return zzyv.f46322f || aes.m32757a();
    }

    /* renamed from: a */
    private static String m38458a(String str, zzyv zzyv) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzyv.f46337u;
        }
    }
}
