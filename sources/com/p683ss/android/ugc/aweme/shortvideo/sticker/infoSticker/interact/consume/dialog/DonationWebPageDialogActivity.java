package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a.C27183a;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27298a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44654d;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.DonationWebPageDialogActivity */
public final class DonationWebPageDialogActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C44603a f112834a = new C44603a(null);

    /* renamed from: b */
    private C27182a f112835b;

    /* renamed from: c */
    private C44654d f112836c;

    /* renamed from: d */
    private HashMap f112837d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.DonationWebPageDialogActivity$a */
    public static final class C44603a {
        private C44603a() {
        }

        public /* synthetic */ C44603a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m97561a(Context context, Bundle bundle) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(bundle, "bundle");
            bundle.putBoolean("show_load_dialog", false);
            bundle.putBoolean("webview_progress_bar", true);
            Intent intent = new Intent(context, DonationWebPageDialogActivity.class);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.DonationWebPageDialogActivity$b */
    static final class C44604b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ DonationWebPageDialogActivity f112838a;

        C44604b(DonationWebPageDialogActivity donationWebPageDialogActivity) {
            this.f112838a = donationWebPageDialogActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f112838a.finish();
            return C52860x.f131107a;
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.DonationWebPageDialogActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.DonationWebPageDialogActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.DonationWebPageDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    public final void finish() {
        super.finish();
        super.overridePendingTransition(0, R.anim.r);
    }

    public final void onBackPressed() {
        C44654d dVar = this.f112836c;
        if (dVar == null) {
            C52711k.m112237a("donationWebPageContainer");
        }
        C27298a e = dVar.mo54149e();
        if (e == null || !e.mo55681a()) {
            super.onBackPressed();
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.DonationWebPageDialogActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.b9v);
        super.overridePendingTransition(R.anim.q, 0);
        C27182a a = C27183a.m65604a(getIntent());
        C52711k.m112236a((Object) a, "CrossPlatformParams.Factory.create(intent)");
        this.f112835b = a;
        if (VERSION.SDK_INT >= 19) {
            if (this.f112837d == null) {
                this.f112837d = new HashMap();
            }
            View view = (View) this.f112837d.get(Integer.valueOf(R.id.csm));
            if (view == null) {
                view = findViewById(R.id.csm);
                this.f112837d.put(Integer.valueOf(R.id.csm), view);
            }
            C52711k.m112236a((Object) view, "status_bar");
            view.getLayoutParams().height = C11065a.m22390a((Context) this);
        }
        Activity activity = this;
        C27182a aVar = this.f112835b;
        if (aVar == null) {
            C52711k.m112237a("crossPlatformParams");
        }
        C44654d dVar = new C44654d(activity, aVar, null, 4, null);
        this.f112836c = dVar;
        C44654d dVar2 = this.f112836c;
        if (dVar2 == null) {
            C52711k.m112237a("donationWebPageContainer");
        }
        dVar2.mo90616a();
        C44654d dVar3 = this.f112836c;
        if (dVar3 == null) {
            C52711k.m112237a("donationWebPageContainer");
        }
        dVar3.f112965e = new C44604b(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.DonationWebPageDialogActivity", "onCreate", false);
    }
}
