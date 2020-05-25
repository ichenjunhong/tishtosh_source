package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui;

import android.app.Activity;
import android.arch.lifecycle.C0195p;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.keva.Keva;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.C22475af;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22137r;
import com.p683ss.android.ugc.aweme.account.agegate.C20884b;
import com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p683ss.android.ugc.aweme.account.login.C21635v;
import com.p683ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.ActionResultModel;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.BaseAccountFlowActivity;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.C21851a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21945q;
import com.p683ss.android.ugc.aweme.account.login.termsconstent.C21472c;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a.C20977b;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity */
public final class SignUpOrLoginActivity extends BaseAccountFlowActivity implements C20977b {

    /* renamed from: b */
    public static final C21859a f59172b = new C21859a(null);

    /* renamed from: a */
    public AgeGateResponse f59173a;

    /* renamed from: c */
    private C21850i f59174c = C21850i.PHONE_EMAIL_LOGIN;

    /* renamed from: d */
    private C21850i f59175d = C21850i.NONE;

    /* renamed from: e */
    private boolean f59176e;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity$a */
    public static final class C21859a {
        private C21859a() {
        }

        public /* synthetic */ C21859a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static Intent m54544a(Context context) {
            C52711k.m112240b(context, "context");
            Intent putExtra = new Intent(context, SignUpOrLoginActivity.class).putExtra("current_scene", C21848h.SIGN_UP.getValue()).putExtra("next_page", C21850i.PHONE_EMAIL_SIGN_UP.getValue());
            C52711k.m112236a((Object) putExtra, "Intent(context, SignUpOr…HONE_EMAIL_SIGN_UP.value)");
            return putExtra;
        }

        /* renamed from: b */
        public static Intent m54545b(Context context) {
            C52711k.m112240b(context, "context");
            Intent putExtra = new Intent(context, SignUpOrLoginActivity.class).putExtra("current_scene", C21848h.LOGIN.getValue()).putExtra("next_page", C21850i.PHONE_EMAIL_LOGIN.getValue());
            C52711k.m112236a((Object) putExtra, "Intent(context, SignUpOr….PHONE_EMAIL_LOGIN.value)");
            return putExtra;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity$b */
    static final class C21860b<TTaskResult, TContinuationResult> implements C0011g<Bundle, C0013i<Bundle>> {

        /* renamed from: a */
        final /* synthetic */ SignUpOrLoginActivity f59177a;

        /* renamed from: b */
        final /* synthetic */ C21829b f59178b;

        C21860b(SignUpOrLoginActivity signUpOrLoginActivity, C21829b bVar) {
            this.f59177a = signUpOrLoginActivity;
            this.f59178b = bVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C21829b bVar = this.f59178b;
            if (bVar != null) {
                bVar.mo45963b(0);
            }
            this.f59177a.finish();
            if (C23826bi.m58466g()) {
                C23826bi.m58451a(1, 1, (Object) "");
            }
            this.f59177a.mo45577a();
            C23826bi.m58461b(C23826bi.m58468i());
            return iVar;
        }
    }

    /* renamed from: a */
    public static final Intent m54539a(Context context) {
        return C21859a.m54545b(context);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo45577a() {
        if (this.f59176e) {
            C20975a.m53337a(11);
        } else {
            C20975a.m53337a(10);
        }
    }

    public final void onDestroy() {
        C20975a.m53341b(this);
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarColor((int) R.color.in).statusBarDarkFont(true).init();
    }

    public final void finish() {
        super.finish();
        C20884b.m53199a();
        switch (C22019o.f59495a[this.f59174c.ordinal()]) {
            case 1:
                C23826bi.m58451a(15, 1, (Object) "");
                return;
            case 2:
            case 3:
                if (this.f59175d == C21850i.NONE) {
                    if (C23826bi.m58466g()) {
                        mo45577a();
                        return;
                    }
                } else if (this.f59175d == C21850i.INPUT_PHONE_LOGIN || this.f59175d == C21850i.INPUT_EMAIL_LOGIN) {
                    Intent intent = getIntent();
                    C52711k.m112236a((Object) intent, "intent");
                    Bundle extras = intent.getExtras();
                    if (extras != null && extras.getBoolean("from_last_login", false)) {
                        C21829b b = mo45951b();
                        if (!(b instanceof C21945q)) {
                            b = null;
                        }
                        C21945q qVar = (C21945q) b;
                        if (qVar == null || !qVar.mo46035j() || C23826bi.m58466g()) {
                            C23826bi.m58452a(7, 4, "");
                            if (!this.f59176e) {
                                C23826bi.m58451a(1, 2, (Object) "");
                                break;
                            }
                        } else {
                            C23826bi.m58470k().retryLogin();
                            return;
                        }
                    }
                }
                break;
        }
    }

    /* renamed from: a_ */
    public final void mo44975a_(int i) {
        if (i == 9) {
            finish();
        }
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        Serializable serializable;
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            serializable = bundle.getSerializable("age_gate_response");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof AgeGateResponse)) {
            serializable = null;
        }
        this.f59173a = (AgeGateResponse) serializable;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f59173a != null && bundle != null) {
            bundle.putSerializable("age_gate_response", this.f59173a);
        }
    }

    /* renamed from: b */
    public final void mo45579b(Bundle bundle) {
        this.f59176e = true;
        C21829b b = mo45951b();
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (this.f59173a != null) {
            bundle.putSerializable("age_gate_response", this.f59173a);
        }
        if (!TextUtils.isEmpty(C21635v.f58647b)) {
            bundle.putString("enter_from", C21635v.f58647b);
        }
        if (!TextUtils.isEmpty(C21635v.f58646a)) {
            bundle.putString("enter_method", C21635v.f58646a);
        }
        if (C23826bi.m58462c()) {
            bundle.putBoolean("only_login", true);
        }
        if (b != null) {
            b.mo45963b(1);
        }
        C22137r.m54940a(bundle).mo20a((C0011g<TResult, TContinuationResult>) new C21860b<TResult,TContinuationResult>(this, b), C0013i.f25b);
    }

    /* renamed from: a */
    public final void mo45578a(Bundle bundle) {
        boolean z;
        Bundle bundle2 = new Bundle(bundle);
        C21850i a = C21851a.m54529a(bundle2.getInt("next_page", C21850i.PHONE_EMAIL_SIGN_UP.getValue()));
        switch (C22019o.f59496b[a.ordinal()]) {
            case 1:
                if (bundle2.getInt("result_code", -99988) != -99988) {
                    setResult(bundle2.getInt("result_code", -99988));
                }
                finish();
                return;
            case 2:
                Intent intent = new Intent(this, MusLoginActivity.class);
                intent.putExtra("init_page", 13);
                intent.putExtra("age_gate_data", this.f59173a);
                intent.putExtras(bundle2);
                startActivity(intent);
                finish();
                return;
            default:
                int i = bundle2.getInt("current_page", -1);
                bundle2.putInt("previous_page", i);
                if (a == C21850i.PHONE_EMAIL_SIGN_UP && i == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Object a2 = C23826bi.m58450a(C22475af.class);
                C52711k.m112236a(a2, "ModuleStore.getService(I…oduleService::class.java)");
                int f = ((C22475af) a2).mo46779f();
                if (z && f != 0) {
                    a = C21850i.AGE_GATE_SIGN_UP;
                    Keva.getRepo("compliance_setting").storeBoolean("need_to_show_ftc_age_gate_but_no_showed", true);
                } else if (C21472c.m54111a() && a == C21850i.PHONE_EMAIL_SIGN_UP && i == -1) {
                    a = C21850i.TERMS_CONSENT_SIGN_UP;
                }
                bundle2.putInt("current_page", a.getValue());
                bundle2.remove("next_page");
                if (a == C21850i.THIRD_PARTY_AGE_GATE) {
                    bundle2.putString("platform", getIntent().getStringExtra("platform"));
                } else if (a == C21850i.AGE_GATE) {
                    bundle2.putBoolean("ftc_detect", true);
                }
                bundle2.putInt("age_gate_action", getIntent().getIntExtra("age_gate_action", 0));
                bundle2.putInt("age_gate_register_action", f);
                mo45950a(C22013k.m54758a(a), bundle2);
                return;
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        C20975a.m53339a((C20977b) this);
        this.f59174c = C21851a.m54529a(getIntent().getIntExtra("next_page", C21850i.PHONE_EMAIL_LOGIN.getValue()));
        this.f59175d = C21851a.m54529a(getIntent().getIntExtra("child_page", C21850i.NONE.getValue()));
        if (bundle == null) {
            C0195p<Bundle> pVar = ((ActionResultModel) C0214z.m440a((FragmentActivity) this).mo359a(ActionResultModel.class)).f59091b;
            Intent intent = getIntent();
            C52711k.m112236a((Object) intent, "intent");
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putString("enter_from", mo45952c());
            extras.putString("enter_method", mo45953d());
            extras.putString("enter_type", mo45954e());
            extras.putInt("next_page", this.f59174c.getValue());
            pVar.postValue(extras);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onCreate", false);
    }
}
