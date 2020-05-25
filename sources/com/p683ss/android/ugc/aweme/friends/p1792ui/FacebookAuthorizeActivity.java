package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C12316a;
import com.bytedance.lobby.auth.C12318c;
import com.bytedance.lobby.auth.C12318c.C12320a;
import com.bytedance.lobby.internal.C12347d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.friends.utils.C32783c;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.trill.p2516b.p2517a.C50310a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity */
public final class FacebookAuthorizeActivity extends AmeSSActivity implements C12316a {

    /* renamed from: a */
    public static final C32631a f84908a = new C32631a(null);

    /* renamed from: b */
    private C12347d f84909b;

    /* renamed from: c */
    private String f84910c = "";

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity$a */
    public static final class C32631a {
        private C32631a() {
        }

        public /* synthetic */ C32631a(C52707g gVar) {
            this();
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public final void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    public final void finish() {
        super.finish();
        if (isTaskRoot()) {
            C41302w.m91042a().mo83858a((Activity) this, "aweme://main");
        }
    }

    /* renamed from: a */
    private final void m75435a(int i) {
        C26890h.m65011a("authorize_facebook_response", C23089d.m56640a().mo47829a("enter_from", this.f84910c).mo47826a("is_allow", i).f61491a);
    }

    /* renamed from: a */
    public final void mo23306a(AuthResult authResult) {
        C52711k.m112240b(authResult, "authResult");
        if (this.mStatusDestroyed || !authResult.f32453a || TextUtils.isEmpty(authResult.f32458f)) {
            if (!authResult.f32453a) {
                m75435a(0);
                C32783c.m75665a("contact_list", 0);
                finish();
            }
            return;
        }
        C50310a.m108576a(authResult.f32458f, authResult.f32460h);
        m75435a(1);
        C32783c.m75665a("contact_list", 1);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bb2);
        if (getIntent().hasExtra("enter_from")) {
            String stringExtra = getIntent().getStringExtra("enter_from");
            C52711k.m112236a((Object) stringExtra, "intent.getStringExtra(ENTER_FROM_INTENT_KEY)");
            this.f84910c = stringExtra;
        }
        this.f84909b = C12347d.m24857a();
        C12318c a = new C12320a(this).mo23309a("facebook").mo23307a(new C47661ab().mo94972a("fb_read_permissions", "public_profile, user_friends, user_age_range, email").f120139a).mo23308a((C12316a) this).mo23310a();
        if (this.f84909b != null) {
            C12347d.m24858a(a);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity", "onCreate", false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 101) {
            finish();
        }
    }
}
