package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.C0374c;
import android.support.customtabs.C0374c.C0375a;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.mediation.C15050a;
import com.google.android.gms.ads.mediation.C15062d;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.common.util.C15524o;

@C16299uq
public final class zzasq implements MediationInterstitialAdapter {

    /* renamed from: a */
    Activity f46094a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C15062d f46095b;

    /* renamed from: c */
    private Uri f46096c;

    public final void requestInterstitialAd(Context context, C15062d dVar, Bundle bundle, C15050a aVar, Bundle bundle2) {
        this.f46095b = dVar;
        if (this.f46095b == null) {
            afc.m32798e("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            afc.m32798e("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f46095b.mo27768a(this, 0);
        } else {
            if (!(C15524o.m32293a() && C15817cv.m37169a(context))) {
                afc.m32798e("Default browser does not support custom tabs. Bailing out.");
                this.f46095b.mo27768a(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                afc.m32798e("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f46095b.mo27768a(this, 0);
                return;
            }
            this.f46094a = (Activity) context;
            this.f46096c = Uri.parse(string);
            this.f46095b.mo27767a(this);
        }
    }

    public final void showInterstitial() {
        C0374c a = new C0375a().mo865a();
        a.f1250a.setData(this.f46096c);
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(new zzc(a.f1250a), null, new C16199qy(this), null, new zzbgz(0, 0, false));
        acd.f40245a.post(new C16200qz(this, adOverlayInfoParcel));
        C14963ax.m30834d().f40170h.mo28599a(abl.f40182b, abl.f40183c);
    }

    public final void onDestroy() {
        afc.m32792b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        afc.m32792b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        afc.m32792b("Resuming AdMobCustomTabsAdapter adapter.");
    }
}
