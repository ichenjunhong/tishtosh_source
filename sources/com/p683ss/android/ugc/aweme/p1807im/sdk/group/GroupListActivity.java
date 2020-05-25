package com.p683ss.android.ugc.aweme.p1807im.sdk.group;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.C35097f;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity */
public class GroupListActivity extends AmeActivity {

    /* renamed from: a */
    public static C23371a<Boolean> f88306a;

    /* renamed from: b */
    public static final C34177a f88307b = new C34177a(null);

    /* renamed from: c */
    private final C35097f f88308c = new C35097f();

    /* renamed from: d */
    private final String f88309d = "GROUP_FRAGMENT_TAG";

    /* renamed from: e */
    private Fragment f88310e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity$a */
    public static final class C34177a {
        private C34177a() {
        }

        public /* synthetic */ C34177a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m77999a(Activity activity, int i, Bundle bundle, C23371a<Boolean> aVar, int i2) {
            C52711k.m112240b(activity, "activity");
            Intent intent = new Intent(activity, GroupListActivity.class);
            intent.putExtra("key_member_list_type", i);
            intent.putExtras(bundle);
            GroupListActivity.f88306a = aVar;
            activity.startActivityForResult(intent, 224);
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void onBackPressed() {
        if (this.f88310e instanceof C34215c) {
            Fragment fragment = this.f88310e;
            if (fragment == null) {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.group.GroupListFragment");
            } else if (!((C34215c) fragment).bl_()) {
                super.onBackPressed();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bc6);
        C34004b.m77718b().setupStatusBar(this);
        C0654k supportFragmentManager = getSupportFragmentManager();
        C0679r a = supportFragmentManager.mo2225a();
        C52711k.m112236a((Object) a, "fm.beginTransaction()");
        Fragment a2 = supportFragmentManager.mo2224a(this.f88309d);
        if (a2 == null) {
            a2 = C35097f.m79312a(getIntent().getIntExtra("key_member_list_type", 5));
        }
        this.f88310e = a2;
        Fragment fragment = this.f88310e;
        if (fragment != null) {
            Intent intent = getIntent();
            C52711k.m112236a((Object) intent, "intent");
            fragment.setArguments(intent.getExtras());
            a.mo2192b(R.id.agz, fragment, this.f88309d).mo2195c();
        }
        if (this.f88310e instanceof C34215c) {
            Fragment fragment2 = this.f88310e;
            if (fragment2 != null) {
                ((C34215c) fragment2).f88392e = f88306a;
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.group.GroupListFragment");
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupListActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.f88310e;
        if (fragment != null) {
            fragment.onActivityResult(i, i2, intent);
        }
    }
}
