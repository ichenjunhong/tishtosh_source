package com.p683ss.android.ugc.aweme.account.agegate.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.account.agegate.p1263a.C20862a;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21091a;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.ExportVideoActivity */
public final class ExportVideoActivity extends AmeActivity {

    /* renamed from: a */
    public static final C20881a f56849a = new C20881a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.activity.ExportVideoActivity$a */
    public static final class C20881a {
        private C20881a() {
        }

        public /* synthetic */ C20881a(C52707g gVar) {
            this();
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.ExportVideoActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.ExportVideoActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.ExportVideoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onBackPressed() {
        C0654k supportFragmentManager = getSupportFragmentManager();
        C52711k.m112236a((Object) supportFragmentManager, "supportFragmentManager");
        List f = supportFragmentManager.mo2238f();
        C52711k.m112236a((Object) f, "supportFragmentManager.fragments");
        boolean z = false;
        if (!C9376b.m18558a((Collection<T>) f)) {
            C0654k supportFragmentManager2 = getSupportFragmentManager();
            C52711k.m112236a((Object) supportFragmentManager2, "supportFragmentManager");
            Fragment fragment = (Fragment) supportFragmentManager2.mo2238f().get(f.size() - 1);
            if ((fragment instanceof C21091a) && ((C21091a) fragment).aj_()) {
                z = true;
            }
        }
        if (!z) {
            super.onBackPressed();
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.ExportVideoActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ay5);
        C0679r a = getSupportFragmentManager().mo2225a();
        C52711k.m112236a((Object) a, "supportFragmentManager.beginTransaction()");
        C20862a aVar = new C20862a();
        Intent intent = getIntent();
        C52711k.m112236a((Object) intent, "intent");
        aVar.setArguments(intent.getExtras());
        a.mo2175a((int) R.id.ajf, (Fragment) aVar);
        a.mo2189b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.ExportVideoActivity", "onCreate", false);
    }
}
