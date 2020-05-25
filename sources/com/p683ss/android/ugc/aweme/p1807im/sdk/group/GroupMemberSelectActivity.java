package com.p683ss.android.ugc.aweme.p1807im.sdk.group;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.C35097f;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity */
public final class GroupMemberSelectActivity extends AmeActivity {

    /* renamed from: a */
    public static final C34178a f88311a = new C34178a(null);

    /* renamed from: b */
    private final C35097f f88312b = new C35097f();

    /* renamed from: c */
    private final String f88313c = "GROUP_MEMBER_FRAGMENT_TAG";

    /* renamed from: d */
    private Fragment f88314d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity$a */
    public static final class C34178a {
        private C34178a() {
        }

        public /* synthetic */ C34178a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m78000a(Activity activity, int i, String str, int i2) {
            C52711k.m112240b(activity, "activity");
            Intent intent = new Intent(activity, GroupMemberSelectActivity.class);
            intent.putExtra("key_member_list_type", i);
            if (str != null) {
                intent.putExtra("session_id", str);
            }
            activity.startActivityForResult(intent, i2);
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
    }

    public final void finish() {
        super.finish();
        if (this.f88314d instanceof C34179a) {
            overridePendingTransition(R.anim.ej, R.anim.el);
        }
    }

    public final void onBackPressed() {
        if (this.f88314d instanceof C34179a) {
            Fragment fragment = this.f88314d;
            if (fragment == null) {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.group.AtMemberFragment");
            } else if (!((C34179a) fragment).bl_()) {
                super.onBackPressed();
            }
        }
        if (this.f88314d instanceof C34270g) {
            Fragment fragment2 = this.f88314d;
            if (fragment2 == null) {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.group.GroupMemberRemoveFragment");
            } else if (!((C34270g) fragment2).bl_()) {
                super.onBackPressed();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bc7);
        C34004b.m77718b().setupStatusBar(this);
        C0654k supportFragmentManager = getSupportFragmentManager();
        C0679r a = supportFragmentManager.mo2225a();
        C52711k.m112236a((Object) a, "fm.beginTransaction()");
        Fragment a2 = supportFragmentManager.mo2224a(this.f88313c);
        if (a2 == null) {
            a2 = C35097f.m79312a(getIntent().getIntExtra("key_member_list_type", 5));
        }
        this.f88314d = a2;
        Fragment fragment = this.f88314d;
        if (fragment != null) {
            Intent intent = getIntent();
            C52711k.m112236a((Object) intent, "intent");
            fragment.setArguments(intent.getExtras());
            a.mo2192b(R.id.agz, fragment, this.f88313c).mo2195c();
        }
        if (this.f88314d instanceof C34179a) {
            overridePendingTransition(R.anim.ek, R.anim.ej);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.group.GroupMemberSelectActivity", "onCreate", false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.f88314d;
        if (fragment != null) {
            fragment.onActivityResult(i, i2, intent);
        }
    }
}
