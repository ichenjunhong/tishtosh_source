package com.p683ss.android.ugc.aweme.commercialize.p1572im;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.commercialize.p1572im.C25938a.C25939a;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35464a;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity */
public final class ChatCheckLoginActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C25935a f68484a = new C25935a(null);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity$a */
    public static final class C25935a {
        private C25935a() {
        }

        public /* synthetic */ C25935a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity$b */
    public static final class C25936b implements C23505g {

        /* renamed from: a */
        final /* synthetic */ ChatCheckLoginActivity f68485a;

        /* renamed from: b */
        final /* synthetic */ C52727e f68486b;

        /* renamed from: a */
        public final void mo46279a() {
            ((C52670a) this.f68486b.element).invoke();
        }

        /* renamed from: a */
        public final void mo46280a(Bundle bundle) {
            this.f68485a.finish();
        }

        C25936b(ChatCheckLoginActivity chatCheckLoginActivity, C52727e eVar) {
            this.f68485a = chatCheckLoginActivity;
            this.f68486b = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity$c */
    static final class C25937c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ ChatCheckLoginActivity f68487a;

        C25937c(ChatCheckLoginActivity chatCheckLoginActivity) {
            this.f68487a = chatCheckLoginActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            new C25939a(this.f68487a, this.f68487a.getIntent().getStringExtra("extra_uid"), this.f68487a.getIntent().getStringExtra("extra_ext"), (C35464a) this.f68487a.getIntent().getSerializableExtra("extra_imadlog")).mo53282a();
            this.f68487a.finish();
            return C52860x.f131107a;
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        C52727e eVar = new C52727e();
        eVar.element = (C52670a) new C25937c(this);
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (g.isLogin()) {
            ((C52670a) eVar.element).invoke();
        } else {
            C27965f.m66722a((Activity) this, "", "", (C23505g) new C25936b(this, eVar));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onCreate", false);
    }
}
