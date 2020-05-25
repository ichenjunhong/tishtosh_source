package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.C14850a.C14851a;
import com.google.ads.C14853b;
import com.google.ads.mediation.C14860a;
import com.google.ads.mediation.C14862c;
import com.google.ads.mediation.C14870d;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.customevent.C15059c;
import com.google.android.gms.internal.ads.afc;

public final class CustomEventAdapter implements MediationBannerAdapter<C15059c, C14869e>, MediationInterstitialAdapter<C15059c, C14869e> {

    /* renamed from: a */
    private C14865a f38399a;

    /* renamed from: b */
    private C14867c f38400b;
    public View zzmw;

    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$a */
    static final class C14863a implements C14866b {

        /* renamed from: a */
        private final CustomEventAdapter f38401a;

        /* renamed from: b */
        private final C14862c f38402b;

        public C14863a(CustomEventAdapter customEventAdapter, C14862c cVar) {
            this.f38401a = customEventAdapter;
            this.f38402b = cVar;
        }
    }

    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$b */
    class C14864b implements C14868d {

        /* renamed from: a */
        private final CustomEventAdapter f38403a;

        /* renamed from: b */
        private final C14870d f38404b;

        public C14864b(CustomEventAdapter customEventAdapter, C14870d dVar) {
            this.f38403a = customEventAdapter;
            this.f38404b = dVar;
        }
    }

    public final void destroy() {
    }

    /* renamed from: a */
    private static <T> T m30506a(String str) {
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

    public final Class<C15059c> getAdditionalParametersType() {
        return C15059c.class;
    }

    public final View getBannerView() {
        return this.zzmw;
    }

    public final Class<C14869e> getServerParametersType() {
        return C14869e.class;
    }

    public final void requestBannerAd(C14862c cVar, Activity activity, C14869e eVar, C14853b bVar, C14860a aVar, C15059c cVar2) {
        Object a;
        this.f38399a = (C14865a) m30506a(eVar.f38407b);
        if (this.f38399a == null) {
            cVar.mo27215a(this, C14851a.INTERNAL_ERROR);
            return;
        }
        if (cVar2 == null) {
            a = null;
        } else {
            a = cVar2.mo27766a(eVar.f38406a);
        }
        this.f38399a.mo27218a(new C14863a(this, cVar), activity, eVar.f38406a, eVar.f38408c, bVar, aVar, a);
    }

    public final void requestInterstitialAd(C14870d dVar, Activity activity, C14869e eVar, C14860a aVar, C15059c cVar) {
        Object a;
        this.f38400b = (C14867c) m30506a(eVar.f38407b);
        if (this.f38400b == null) {
            dVar.mo27221a(this, C14851a.INTERNAL_ERROR);
            return;
        }
        if (cVar == null) {
            a = null;
        } else {
            a = cVar.mo27766a(eVar.f38406a);
        }
        this.f38400b.mo27220a(new C14864b(this, dVar), activity, eVar.f38406a, eVar.f38408c, aVar, a);
    }

    public final void showInterstitial() {
        this.f38400b.mo27219a();
    }
}
