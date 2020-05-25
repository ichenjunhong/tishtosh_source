package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.C14912d;
import com.google.android.gms.ads.mediation.C15050a;
import com.google.android.gms.ads.mediation.C15053c;
import com.google.android.gms.ads.mediation.C15062d;
import com.google.android.gms.ads.mediation.C15063e;
import com.google.android.gms.ads.mediation.C15067i;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.afc;

public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: a */
    private CustomEventBanner f38875a;

    /* renamed from: b */
    private CustomEventInterstitial f38876b;

    /* renamed from: c */
    private CustomEventNative f38877c;
    public View zzmw;

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$a */
    static final class C15054a implements C15058b {

        /* renamed from: a */
        private final CustomEventAdapter f38878a;

        /* renamed from: b */
        private final C15053c f38879b;

        public C15054a(CustomEventAdapter customEventAdapter, C15053c cVar) {
            this.f38878a = customEventAdapter;
            this.f38879b = cVar;
        }
    }

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$b */
    class C15055b implements C15060d {

        /* renamed from: a */
        private final CustomEventAdapter f38880a;

        /* renamed from: b */
        private final C15062d f38881b;

        public C15055b(CustomEventAdapter customEventAdapter, C15062d dVar) {
            this.f38880a = customEventAdapter;
            this.f38881b = dVar;
        }
    }

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$c */
    static class C15056c implements C15061e {

        /* renamed from: a */
        private final CustomEventAdapter f38883a;

        /* renamed from: b */
        private final C15063e f38884b;

        public C15056c(CustomEventAdapter customEventAdapter, C15063e eVar) {
            this.f38883a = customEventAdapter;
            this.f38884b = eVar;
        }
    }

    public final void onDestroy() {
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    /* renamed from: a */
    private static <T> T m31168a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            afc.m32798e(sb.toString());
            return null;
        }
    }

    public final View getBannerView() {
        return this.zzmw;
    }

    public final void requestBannerAd(Context context, C15053c cVar, Bundle bundle, C14912d dVar, C15050a aVar, Bundle bundle2) {
        Bundle bundle3;
        this.f38875a = (CustomEventBanner) m31168a(bundle.getString("class_name"));
        if (this.f38875a == null) {
            cVar.mo27756a(this, 0);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        this.f38875a.requestBannerAd(context, new C15054a(this, cVar), bundle.getString("parameter"), dVar, aVar, bundle3);
    }

    public final void requestInterstitialAd(Context context, C15062d dVar, Bundle bundle, C15050a aVar, Bundle bundle2) {
        Bundle bundle3;
        this.f38876b = (CustomEventInterstitial) m31168a(bundle.getString("class_name"));
        if (this.f38876b == null) {
            dVar.mo27768a(this, 0);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        this.f38876b.requestInterstitialAd(context, new C15055b(this, dVar), bundle.getString("parameter"), aVar, bundle3);
    }

    public final void requestNativeAd(Context context, C15063e eVar, Bundle bundle, C15067i iVar, Bundle bundle2) {
        Bundle bundle3;
        this.f38877c = (CustomEventNative) m31168a(bundle.getString("class_name"));
        if (this.f38877c == null) {
            eVar.mo27774a((MediationNativeAdapter) this, 0);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        this.f38877c.requestNativeAd(context, new C15056c(this, eVar), bundle.getString("parameter"), iVar, bundle3);
    }

    public final void showInterstitial() {
        this.f38876b.showInterstitial();
    }
}
