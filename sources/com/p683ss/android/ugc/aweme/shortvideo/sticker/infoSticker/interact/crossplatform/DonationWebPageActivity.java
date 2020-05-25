package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.crossplatform;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a.C27183a;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27298a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44654d;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.crossplatform.DonationWebPageActivity */
public final class DonationWebPageActivity extends AmeSSActivity {

    /* renamed from: a */
    private C27182a f113086a;

    /* renamed from: b */
    private C44654d f113087b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.crossplatform.DonationWebPageActivity$a */
    static final class C44699a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ DonationWebPageActivity f113088a;

        C44699a(DonationWebPageActivity donationWebPageActivity) {
            this.f113088a = donationWebPageActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f113088a.finish();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.crossplatform.DonationWebPageActivity$b */
    static final class C44700b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ DonationWebPageActivity f113089a;

        C44700b(DonationWebPageActivity donationWebPageActivity) {
            this.f113089a = donationWebPageActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f113089a.setResult(-1);
            this.f113089a.finish();
            return C52860x.f131107a;
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.crossplatform.DonationWebPageActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.crossplatform.DonationWebPageActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.crossplatform.DonationWebPageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onBackPressed() {
        C44654d dVar = this.f113087b;
        if (dVar == null) {
            C52711k.m112237a("donationWebPageContainer");
        }
        C27298a e = dVar.mo54149e();
        if (e == null || !e.mo55681a()) {
            super.onBackPressed();
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.crossplatform.DonationWebPageActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.b9v);
        C27182a a = C27183a.m65604a(getIntent());
        C52711k.m112236a((Object) a, "CrossPlatformParams.Factory.create(intent)");
        this.f113086a = a;
        Activity activity = this;
        C27182a aVar = this.f113086a;
        if (aVar == null) {
            C52711k.m112237a("crossPlatformParams");
        }
        C44654d dVar = new C44654d(activity, aVar, null, 4, null);
        this.f113087b = dVar;
        C44654d dVar2 = this.f113087b;
        if (dVar2 == null) {
            C52711k.m112237a("donationWebPageContainer");
        }
        dVar2.mo90616a();
        C44654d dVar3 = this.f113087b;
        if (dVar3 == null) {
            C52711k.m112237a("donationWebPageContainer");
        }
        dVar3.f112965e = new C44699a(this);
        C44654d dVar4 = this.f113087b;
        if (dVar4 == null) {
            C52711k.m112237a("donationWebPageContainer");
        }
        dVar4.f112964d = new C44700b(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.crossplatform.DonationWebPageActivity", "onCreate", false);
    }
}
