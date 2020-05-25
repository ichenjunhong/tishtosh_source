package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.app.Activity;
import android.arch.lifecycle.C0195p;
import android.arch.lifecycle.C0214z;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.ActionResultModel;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.BaseAccountFlowActivity;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.C21851a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22013k;
import com.p683ss.android.ugc.aweme.main.service.C36698s;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity */
public final class BindOrModifyPhoneActivity extends BaseAccountFlowActivity {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59811a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BindOrModifyPhoneActivity.class), "originalBundle", "getOriginalBundle()Landroid/os/Bundle;"))};

    /* renamed from: e */
    public static final C22171a f59812e = new C22171a(null);

    /* renamed from: b */
    public boolean f59813b;

    /* renamed from: c */
    public Bundle f59814c;

    /* renamed from: d */
    public final C52668f f59815d = C52732g.m112285a(new C22172b(this));

    /* renamed from: f */
    private C21850i f59816f = C21850i.INPUT_PHONE_BIND;

    /* renamed from: com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity$a */
    public static final class C22171a {
        private C22171a() {
        }

        public /* synthetic */ C22171a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity$b */
    static final class C22172b extends C52712l implements C52670a<Bundle> {

        /* renamed from: a */
        final /* synthetic */ BindOrModifyPhoneActivity f59817a;

        C22172b(BindOrModifyPhoneActivity bindOrModifyPhoneActivity) {
            this.f59817a = bindOrModifyPhoneActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Intent intent = this.f59817a.getIntent();
            C52711k.m112236a((Object) intent, "intent");
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.remove("next_page");
            extras.remove("current_scene");
            return extras;
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarColor((int) R.color.in).statusBarDarkFont(true).init();
    }

    public final void finish() {
        super.finish();
        if (this.f59813b) {
            C23826bi.m58451a(7, 1, (Object) this.f59814c);
            return;
        }
        ((C36698s) C23826bi.m58450a(C36698s.class)).mo47889a(this);
        User i = C23826bi.m58468i();
        if (i != null && !i.isPhoneBinded()) {
            C23826bi.m58451a(7, 2, (Object) null);
        }
    }

    /* renamed from: b */
    public final void mo45579b(Bundle bundle) {
        C10691a.m21551c(getApplicationContext(), getString(R.string.hfw)).mo19066a();
        finish();
    }

    /* renamed from: a */
    public final void mo45578a(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        C21850i a = C21851a.m54529a(bundle2.getInt("next_page", C21850i.INPUT_PHONE_BIND.getValue()));
        bundle2.putInt("previous_page", bundle2.getInt("current_page", -1));
        bundle2.putInt("current_page", a.getValue());
        bundle2.remove("next_page");
        mo45950a(C22013k.m54758a(a), bundle2);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.in)));
        this.f59816f = C21851a.m54529a(getIntent().getIntExtra("next_page", C21850i.INPUT_PHONE_BIND.getValue()));
        if (getIntent().getIntExtra("current_scene", C21848h.NONE.getValue()) == C21848h.NONE.getValue()) {
            getIntent().putExtra("current_scene", C21848h.BIND_PHONE.getValue());
            getIntent().putExtra("enter_method", "first_bind_phone_click");
        }
        if (bundle == null) {
            C0195p<Bundle> pVar = ((ActionResultModel) C0214z.m440a((FragmentActivity) this).mo359a(ActionResultModel.class)).f59091b;
            Intent intent = getIntent();
            C52711k.m112236a((Object) intent, "intent");
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putString("enter_from", getIntent().getStringExtra("ENTER_REASON"));
            extras.putString("enter_method", getIntent().getStringExtra("enter_method"));
            extras.putString("enter_type", mo45954e());
            extras.putInt("next_page", this.f59816f.getValue());
            pVar.postValue(extras);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onCreate", false);
    }
}
