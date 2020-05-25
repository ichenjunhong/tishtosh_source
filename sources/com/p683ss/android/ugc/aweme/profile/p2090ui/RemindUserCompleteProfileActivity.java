package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40462w;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.RemindUserCompleteProfileActivity */
public final class RemindUserCompleteProfileActivity extends AmeSSActivity {

    /* renamed from: b */
    public static OnDismissListener f102575b;

    /* renamed from: c */
    public static final C40192a f102576c = new C40192a(null);

    /* renamed from: a */
    public C40462w f102577a;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.RemindUserCompleteProfileActivity$a */
    public static final class C40192a {
        private C40192a() {
        }

        /* renamed from: a */
        public static void m89371a(OnDismissListener onDismissListener) {
            RemindUserCompleteProfileActivity.f102575b = onDismissListener;
        }

        public /* synthetic */ C40192a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.RemindUserCompleteProfileActivity$b */
    static final class C40193b implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ RemindUserCompleteProfileActivity f102578a;

        C40193b(RemindUserCompleteProfileActivity remindUserCompleteProfileActivity) {
            this.f102578a = remindUserCompleteProfileActivity;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            OnDismissListener onDismissListener = RemindUserCompleteProfileActivity.f102575b;
            if (onDismissListener != null) {
                C40462w wVar = this.f102578a.f102577a;
                if (wVar == null) {
                    C52711k.m112237a("mDialog");
                }
                onDismissListener.onDismiss(wVar);
            }
            C40192a.m89371a(null);
            this.f102578a.finish();
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RemindUserCompleteProfileActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RemindUserCompleteProfileActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RemindUserCompleteProfileActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RemindUserCompleteProfileActivity", "onCreate", true);
        super.onCreate(bundle);
        Context context = this;
        Intent intent = getIntent();
        C52711k.m112236a((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            C52711k.m112234a();
        }
        this.f102577a = new C40462w(context, extras);
        C40462w wVar = this.f102577a;
        if (wVar == null) {
            C52711k.m112237a("mDialog");
        }
        wVar.show();
        C40462w wVar2 = this.f102577a;
        if (wVar2 == null) {
            C52711k.m112237a("mDialog");
        }
        wVar2.setOnDismissListener(new C40193b(this));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.RemindUserCompleteProfileActivity", "onCreate", false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C40462w wVar = this.f102577a;
        if (wVar == null) {
            C52711k.m112237a("mDialog");
        }
        wVar.f103302b.mo80923a(i, i2, intent);
    }
}
