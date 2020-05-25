package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C14895a;
import com.google.android.gms.ads.C14900b;
import com.google.android.gms.ads.C14900b.C14901a;
import com.google.android.gms.ads.C14908c;
import com.google.android.gms.ads.C14908c.C14909a;
import com.google.android.gms.ads.C14912d;
import com.google.android.gms.ads.C14913e;
import com.google.android.gms.ads.C14936h;
import com.google.android.gms.ads.C14937i;
import com.google.android.gms.ads.formats.C14916b;
import com.google.android.gms.ads.formats.C14919c;
import com.google.android.gms.ads.formats.C14921d;
import com.google.android.gms.ads.formats.C14922e;
import com.google.android.gms.ads.formats.C14923f;
import com.google.android.gms.ads.formats.C14923f.C14924a;
import com.google.android.gms.ads.formats.C14925g;
import com.google.android.gms.ads.formats.C14925g.C14926a;
import com.google.android.gms.ads.formats.C14927h;
import com.google.android.gms.ads.formats.C14927h.C14928a;
import com.google.android.gms.ads.formats.C14927h.C14929b;
import com.google.android.gms.ads.formats.C14930i;
import com.google.android.gms.ads.formats.C14930i.C14931a;
import com.google.android.gms.ads.formats.C14932j;
import com.google.android.gms.ads.mediation.C15050a;
import com.google.android.gms.ads.mediation.C15051b.C15052a;
import com.google.android.gms.ads.mediation.C15053c;
import com.google.android.gms.ads.mediation.C15062d;
import com.google.android.gms.ads.mediation.C15063e;
import com.google.android.gms.ads.mediation.C15064f;
import com.google.android.gms.ads.mediation.C15065g;
import com.google.android.gms.ads.mediation.C15066h;
import com.google.android.gms.ads.mediation.C15067i;
import com.google.android.gms.ads.mediation.C15068j;
import com.google.android.gms.ads.mediation.C15069k;
import com.google.android.gms.ads.mediation.C15079u;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.p1028a.C14896a;
import com.google.android.gms.ads.reward.C15080a;
import com.google.android.gms.ads.reward.C15082c;
import com.google.android.gms.ads.reward.mediation.C15083a;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.internal.ads.C15583ak;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.aes;
import com.google.android.gms.internal.ads.afc;
import com.google.android.gms.internal.ads.bzl;
import com.google.android.gms.internal.ads.zzbpt;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@C16299uq
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, C15068j, C15079u, MediationRewardedVideoAdAdapter, zzbpt {
    private C14913e zzmc;
    private C14936h zzmd;
    private C14900b zzme;
    private Context zzmf;
    /* access modifiers changed from: private */
    public C14936h zzmg;
    /* access modifiers changed from: private */
    public C15083a zzmh;
    private final C15082c zzmi = new C14875g(this);

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$a */
    static class C14854a extends C15065g {

        /* renamed from: p */
        private final C14923f f38385p;

        public C14854a(C14923f fVar) {
            this.f38385p = fVar;
            this.f38893h = fVar.mo27366b().toString();
            this.f38894i = fVar.mo27367c();
            this.f38895j = fVar.mo27368d().toString();
            this.f38896k = fVar.mo27369e();
            this.f38897l = fVar.mo27370f().toString();
            if (fVar.mo27371g() != null) {
                this.f38898m = fVar.mo27371g().doubleValue();
            }
            if (fVar.mo27372h() != null) {
                this.f38899n = fVar.mo27372h().toString();
            }
            if (fVar.mo27373i() != null) {
                this.f38900o = fVar.mo27373i().toString();
            }
            this.f38886a = true;
            this.f38887b = true;
            this.f38891f = fVar.mo27374j();
        }

        /* renamed from: a */
        public final void mo27193a(View view) {
            if (view instanceof C14921d) {
                ((C14921d) view).setNativeAd(this.f38385p);
            }
            C14922e eVar = (C14922e) C14922e.f38487a.get(view);
            if (eVar != null) {
                eVar.mo27364a((C14916b) this.f38385p);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$b */
    static class C14855b extends C15066h {

        /* renamed from: n */
        private final C14925g f38386n;

        public C14855b(C14925g gVar) {
            this.f38386n = gVar;
            this.f38901h = gVar.mo27375b().toString();
            this.f38902i = gVar.mo27376c();
            this.f38903j = gVar.mo27377d().toString();
            if (gVar.mo27378e() != null) {
                this.f38904k = gVar.mo27378e();
            }
            this.f38905l = gVar.mo27379f().toString();
            this.f38906m = gVar.mo27380g().toString();
            this.f38886a = true;
            this.f38887b = true;
            this.f38891f = gVar.mo27381h();
        }

        /* renamed from: a */
        public final void mo27193a(View view) {
            if (view instanceof C14921d) {
                ((C14921d) view).setNativeAd(this.f38386n);
            }
            C14922e eVar = (C14922e) C14922e.f38487a.get(view);
            if (eVar != null) {
                eVar.mo27364a((C14916b) this.f38386n);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$c */
    static class C14856c extends C15069k {

        /* renamed from: r */
        private final C14930i f38387r;

        public C14856c(C14930i iVar) {
            this.f38387r = iVar;
            this.f38907a = iVar.mo27383a();
            this.f38908b = iVar.mo27384b();
            this.f38909c = iVar.mo27385c();
            this.f38910d = iVar.mo27386d();
            this.f38911e = iVar.mo27387e();
            this.f38912f = iVar.mo27388f();
            this.f38913g = iVar.mo27389g();
            this.f38914h = iVar.mo27390h();
            this.f38915i = iVar.mo27391i();
            this.f38920n = iVar.mo27394l();
            this.f38916j = iVar.mo27392j();
        }

        /* renamed from: a */
        public final void mo27194a(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof C14932j) {
                ((C14932j) view).setNativeAd(this.f38387r);
                return;
            }
            C14922e eVar = (C14922e) C14922e.f38487a.get(view);
            if (eVar != null) {
                eVar.mo27365a(this.f38387r);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$d */
    static final class C14857d extends C14895a implements C14896a, bzl {

        /* renamed from: a */
        private final AbstractAdViewAdapter f38388a;

        /* renamed from: b */
        private final C15053c f38389b;

        public C14857d(AbstractAdViewAdapter abstractAdViewAdapter, C15053c cVar) {
            this.f38388a = abstractAdViewAdapter;
            this.f38389b = cVar;
        }

        /* renamed from: a */
        public final void mo27195a() {
            this.f38389b.mo27755a(this.f38388a);
        }

        /* renamed from: a */
        public final void mo27196a(int i) {
            this.f38389b.mo27756a(this.f38388a, i);
        }

        /* renamed from: b */
        public final void mo27198b() {
            this.f38389b.mo27758b(this.f38388a);
        }

        /* renamed from: c */
        public final void mo27199c() {
            this.f38389b.mo27759c(this.f38388a);
        }

        /* renamed from: d */
        public final void mo27200d() {
            this.f38389b.mo27760d(this.f38388a);
        }

        /* renamed from: e */
        public final void mo27201e() {
            this.f38389b.mo27761e(this.f38388a);
        }

        /* renamed from: a */
        public final void mo27197a(String str, String str2) {
            this.f38389b.mo27757a(this.f38388a, str, str2);
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$e */
    static final class C14858e extends C14895a implements bzl {

        /* renamed from: a */
        private final AbstractAdViewAdapter f38390a;

        /* renamed from: b */
        private final C15062d f38391b;

        public C14858e(AbstractAdViewAdapter abstractAdViewAdapter, C15062d dVar) {
            this.f38390a = abstractAdViewAdapter;
            this.f38391b = dVar;
        }

        /* renamed from: a */
        public final void mo27195a() {
            this.f38391b.mo27767a(this.f38390a);
        }

        /* renamed from: a */
        public final void mo27196a(int i) {
            this.f38391b.mo27768a(this.f38390a, i);
        }

        /* renamed from: b */
        public final void mo27198b() {
            this.f38391b.mo27769b(this.f38390a);
        }

        /* renamed from: c */
        public final void mo27199c() {
            this.f38391b.mo27770c(this.f38390a);
        }

        /* renamed from: d */
        public final void mo27200d() {
            this.f38391b.mo27771d(this.f38390a);
        }

        /* renamed from: e */
        public final void mo27201e() {
            this.f38391b.mo27772e(this.f38390a);
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$f */
    static final class C14859f extends C14895a implements C14924a, C14926a, C14928a, C14929b, C14931a {

        /* renamed from: a */
        private final AbstractAdViewAdapter f38392a;

        /* renamed from: b */
        private final C15063e f38393b;

        public C14859f(AbstractAdViewAdapter abstractAdViewAdapter, C15063e eVar) {
            this.f38392a = abstractAdViewAdapter;
            this.f38393b = eVar;
        }

        /* renamed from: a */
        public final void mo27195a() {
        }

        /* renamed from: a */
        public final void mo27196a(int i) {
            this.f38393b.mo27774a((MediationNativeAdapter) this.f38392a, i);
        }

        /* renamed from: b */
        public final void mo27198b() {
            this.f38393b.mo27773a(this.f38392a);
        }

        /* renamed from: c */
        public final void mo27199c() {
            this.f38393b.mo27779b(this.f38392a);
        }

        /* renamed from: d */
        public final void mo27200d() {
            this.f38393b.mo27780c(this.f38392a);
        }

        /* renamed from: e */
        public final void mo27201e() {
            this.f38393b.mo27781d(this.f38392a);
        }

        /* renamed from: f */
        public final void mo27207f() {
            this.f38393b.mo27782e(this.f38392a);
        }

        /* renamed from: a */
        public final void mo27202a(C14923f fVar) {
            this.f38393b.mo27777a((MediationNativeAdapter) this.f38392a, (C15064f) new C14854a(fVar));
        }

        /* renamed from: a */
        public final void mo27206a(C14930i iVar) {
            this.f38393b.mo27778a((MediationNativeAdapter) this.f38392a, (C15069k) new C14856c(iVar));
        }

        /* renamed from: a */
        public final void mo27203a(C14925g gVar) {
            this.f38393b.mo27777a((MediationNativeAdapter) this.f38392a, (C15064f) new C14855b(gVar));
        }

        /* renamed from: a */
        public final void mo27204a(C14927h hVar) {
            this.f38393b.mo27775a((MediationNativeAdapter) this.f38392a, hVar);
        }

        /* renamed from: a */
        public final void mo27205a(C14927h hVar, String str) {
            this.f38393b.mo27776a(this.f38392a, hVar, str);
        }
    }

    /* access modifiers changed from: protected */
    public abstract Bundle zza(Bundle bundle, Bundle bundle2);

    private final C14908c zza(Context context, C15050a aVar, Bundle bundle, Bundle bundle2) {
        C14909a aVar2 = new C14909a();
        Date a = aVar.mo27748a();
        if (a != null) {
            aVar2.f38451a.f41279g = a;
        }
        int b = aVar.mo27749b();
        if (b != 0) {
            aVar2.f38451a.f41281i = b;
        }
        Set<String> c = aVar.mo27750c();
        if (c != null) {
            for (String add : c) {
                aVar2.f38451a.f41273a.add(add);
            }
        }
        Location d = aVar.mo27751d();
        if (d != null) {
            aVar2.f38451a.f41282j = d;
        }
        if (aVar.mo27753f()) {
            aVar2.f38451a.mo29489a(aes.m32750a(context));
        }
        if (aVar.mo27752e() != -1) {
            int i = 1;
            if (aVar.mo27752e() != 1) {
                i = 0;
            }
            aVar2.f38451a.f41286n = i;
        }
        aVar2.f38451a.f41287o = aVar.mo27754g();
        Bundle zza = zza(bundle, bundle2);
        Class<AdMobAdapter> cls = AdMobAdapter.class;
        aVar2.f38451a.f41274b.putBundle(cls.getName(), zza);
        if (cls.equals(AdMobAdapter.class) && zza.getBoolean("_emulatorLiveAds")) {
            aVar2.f38451a.f41276d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return new C14908c(aVar2);
    }

    public void onDestroy() {
        if (this.zzmc != null) {
            this.zzmc.mo27334c();
            this.zzmc = null;
        }
        if (this.zzmd != null) {
            this.zzmd = null;
        }
        if (this.zzme != null) {
            this.zzme = null;
        }
        if (this.zzmg != null) {
            this.zzmg = null;
        }
    }

    public void onPause() {
        if (this.zzmc != null) {
            this.zzmc.mo27333b();
        }
    }

    public void onResume() {
        if (this.zzmc != null) {
            this.zzmc.mo27330a();
        }
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString("pubid");
    }

    public void requestBannerAd(Context context, C15053c cVar, Bundle bundle, C14912d dVar, C15050a aVar, Bundle bundle2) {
        this.zzmc = new C14913e(context);
        this.zzmc.setAdSize(new C14912d(dVar.f38464k, dVar.f38465l));
        this.zzmc.setAdUnitId(getAdUnitId(bundle));
        this.zzmc.setAdListener(new C14857d(this, cVar));
        this.zzmc.mo27331a(zza(context, aVar, bundle2, bundle));
    }

    public View getBannerView() {
        return this.zzmc;
    }

    public void requestInterstitialAd(Context context, C15062d dVar, Bundle bundle, C15050a aVar, Bundle bundle2) {
        this.zzmd = new C14936h(context);
        this.zzmd.mo27428a(getAdUnitId(bundle));
        C14936h hVar = this.zzmd;
        C14858e eVar = new C14858e(this, dVar);
        hVar.f38493a.mo29560a((C14895a) eVar);
        hVar.f38493a.mo29564a((bzl) eVar);
        this.zzmd.mo27427a(zza(context, aVar, bundle2, bundle));
    }

    public void onImmersiveModeUpdated(boolean z) {
        if (this.zzmd != null) {
            this.zzmd.mo27429a(z);
        }
        if (this.zzmg != null) {
            this.zzmg.mo27429a(z);
        }
    }

    public C15583ak getVideoController() {
        if (this.zzmc != null) {
            C14937i videoController = this.zzmc.getVideoController();
            if (videoController != null) {
                return videoController.mo27430a();
            }
        }
        return null;
    }

    public void showInterstitial() {
        this.zzmd.mo27426a();
    }

    public Bundle getInterstitialAdapterInfo() {
        C15052a aVar = new C15052a();
        aVar.f38874a = 1;
        Bundle bundle = new Bundle();
        bundle.putInt("capabilities", aVar.f38874a);
        return bundle;
    }

    public void requestNativeAd(Context context, C15063e eVar, Bundle bundle, C15067i iVar, Bundle bundle2) {
        C14859f fVar = new C14859f(this, eVar);
        C14901a a = new C14901a(context, bundle.getString("pubid")).mo27300a((C14895a) fVar);
        C14919c h = iVar.mo27783h();
        if (h != null) {
            a.mo27301a(h);
        }
        if (iVar.mo27785j()) {
            a.mo27304a((C14931a) fVar);
        }
        if (iVar.mo27784i()) {
            a.mo27302a((C14924a) fVar);
        }
        if (iVar.mo27786k()) {
            a.mo27303a((C14926a) fVar);
        }
        if (iVar.mo27787l()) {
            for (String str : iVar.mo27788m().keySet()) {
                a.mo27305a(str, fVar, ((Boolean) iVar.mo27788m().get(str)).booleanValue() ? fVar : null);
            }
        }
        this.zzme = a.mo27306a();
        this.zzme.mo27299a(zza(context, iVar, bundle2, bundle).f38450a);
    }

    public void initialize(Context context, C15050a aVar, String str, C15083a aVar2, Bundle bundle, Bundle bundle2) {
        this.zzmf = context.getApplicationContext();
        this.zzmh = aVar2;
        this.zzmh.mo27797a((MediationRewardedVideoAdAdapter) this);
    }

    public void loadAd(C15050a aVar, Bundle bundle, Bundle bundle2) {
        if (this.zzmf == null || this.zzmh == null) {
            afc.m32794c("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        this.zzmg = new C14936h(this.zzmf);
        this.zzmg.f38493a.f41405e = true;
        this.zzmg.mo27428a(getAdUnitId(bundle));
        C14936h hVar = this.zzmg;
        hVar.f38493a.mo29562a(this.zzmi);
        C14936h hVar2 = this.zzmg;
        hVar2.f38493a.mo29561a((C15080a) new C14876h(this));
        this.zzmg.mo27427a(zza(this.zzmf, aVar, bundle2, bundle));
    }

    public void showVideo() {
        this.zzmg.mo27426a();
    }

    public boolean isInitialized() {
        return this.zzmh != null;
    }
}
