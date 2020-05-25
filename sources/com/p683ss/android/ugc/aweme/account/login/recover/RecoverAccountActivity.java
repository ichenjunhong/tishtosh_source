package com.p683ss.android.ugc.aweme.account.login.recover;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.router.SmartRouter;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22137r;
import com.p683ss.android.ugc.aweme.account.login.C21635v;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.BaseAccountFlowActivity;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.C21851a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22013k;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21945q;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a.C20977b;
import com.p683ss.android.ugc.aweme.p1256aa.C20846a;
import com.p683ss.android.ugc.aweme.p1256aa.C20847b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity */
public final class RecoverAccountActivity extends BaseAccountFlowActivity implements C20977b {

    /* renamed from: a */
    public static final C21401a f58070a = new C21401a(null);

    /* renamed from: b */
    private C21850i f58071b = C21850i.PHONE_EMAIL_USERNAME_RECOVER;

    /* renamed from: c */
    private C21850i f58072c = C21850i.NONE;

    /* renamed from: d */
    private boolean f58073d;

    /* renamed from: e */
    private String f58074e = "";

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity$a */
    public static final class C21401a {
        private C21401a() {
        }

        public /* synthetic */ C21401a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity$b */
    static final class C21402b<TTaskResult, TContinuationResult> implements C0011g<Bundle, C0013i<Bundle>> {

        /* renamed from: a */
        final /* synthetic */ RecoverAccountActivity f58075a;

        C21402b(RecoverAccountActivity recoverAccountActivity) {
            this.f58075a = recoverAccountActivity;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            this.f58075a.finish();
            if (C23826bi.m58466g()) {
                C23826bi.m58451a(1, 1, (Object) "");
            }
            this.f58075a.mo45577a();
            C23826bi.m58461b(C23826bi.m58468i());
            C47718bf.m103288a(new C20846a());
            C47718bf.m103288a(new C20847b());
            return iVar;
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo45577a() {
        if (this.f58073d) {
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
        switch (C21442d.f58148b[this.f58071b.ordinal()]) {
            case 1:
                C23826bi.m58451a(15, 1, (Object) "");
                return;
            case 2:
            case 3:
                if (this.f58072c != C21850i.NONE) {
                    if (this.f58072c == C21850i.INPUT_PHONE_LOGIN || this.f58072c == C21850i.INPUT_EMAIL_LOGIN) {
                        C21829b b = mo45951b();
                        if (!(b instanceof C21945q)) {
                            b = null;
                        }
                        C21945q qVar = (C21945q) b;
                        if (qVar == null || !qVar.mo46035j() || C23826bi.m58466g()) {
                            mo45577a();
                        } else {
                            C23826bi.m58470k().retryLogin();
                        }
                        C23826bi.m58452a(7, 4, "");
                        break;
                    }
                } else if (C23826bi.m58466g()) {
                    mo45577a();
                    return;
                }
                break;
        }
    }

    /* renamed from: a_ */
    public final void mo44975a_(int i) {
        switch (i) {
            case 12:
            case 13:
                SmartRouter.buildRoute((Context) this, "aweme://main?tab=1").withParam("tab", 1).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME").addFlags(67108864).open();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo45578a(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        C21850i a = C21851a.m54529a(bundle2.getInt("next_page", C21850i.RECOVER_VERIFY_EMAIL_PHONE_THIRD_PARTY.getValue()));
        if (C21442d.f58147a[a.ordinal()] != 1) {
            bundle2.putInt("previous_page", bundle2.getInt("current_page", -1));
            bundle2.putInt("current_page", a.getValue());
            mo45950a(C22013k.m54758a(a), bundle2);
            return;
        }
        if (bundle2.getInt("result_code", -99988) != -99988) {
            setResult(bundle2.getInt("result_code", -99988));
        }
        finish();
    }

    /* renamed from: b */
    public final void mo45579b(Bundle bundle) {
        this.f58073d = true;
        if (bundle == null) {
            bundle = new Bundle();
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
        C22137r.m54940a(bundle).mo20a((C0011g<TResult, TContinuationResult>) new C21402b<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            java.lang.String r0 = "com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity"
            java.lang.String r1 = "onCreate"
            r2 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            super.onCreate(r6)
            android.view.Window r0 = r5.getWindow()
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            android.content.res.Resources r2 = r5.getResources()
            r3 = 2131821010(0x7f1101d2, float:1.9274751E38)
            int r2 = r2.getColor(r3)
            r1.<init>(r2)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0.setBackgroundDrawable(r1)
            r0 = r5
            com.ss.android.ugc.aweme.account.g.a$b r0 = (com.p683ss.android.ugc.aweme.account.p1274g.C20975a.C20977b) r0
            com.p683ss.android.ugc.aweme.account.p1274g.C20975a.m53339a(r0)
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "next_page"
            com.ss.android.ugc.aweme.account.login.v2.base.i r2 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.PHONE_EMAIL_USERNAME_RECOVER
            int r2 = r2.getValue()
            int r0 = r0.getIntExtra(r1, r2)
            com.ss.android.ugc.aweme.account.login.v2.base.i r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.C21851a.m54529a(r0)
            r5.f58071b = r0
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "child_page"
            com.ss.android.ugc.aweme.account.login.v2.base.i r2 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.NONE
            int r2 = r2.getValue()
            int r0 = r0.getIntExtra(r1, r2)
            com.ss.android.ugc.aweme.account.login.v2.base.i r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.C21851a.m54529a(r0)
            r5.f58072c = r0
            java.lang.String r0 = "find_account_page_show"
            com.ss.android.ugc.aweme.account.a.b.a r1 = new com.ss.android.ugc.aweme.account.a.b.a
            r1.<init>()
            java.lang.String r2 = "aid"
            r3 = 1180(0x49c, float:1.654E-42)
            com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo44774a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            android.content.Intent r0 = r5.getIntent()
            r1 = 0
            if (r0 == 0) goto L_0x007c
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x007c
            java.util.Set r0 = r0.keySet()
            goto L_0x007d
        L_0x007c:
            r0 = r1
        L_0x007d:
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            if (r0 == 0) goto L_0x00aa
            java.util.Iterator r0 = r0.iterator()
        L_0x0088:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00aa
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            android.content.Intent r4 = r5.getIntent()
            if (r4 == 0) goto L_0x00a5
            android.os.Bundle r4 = r4.getExtras()
            if (r4 == 0) goto L_0x00a5
            java.lang.String r4 = r4.getString(r3)
            goto L_0x00a6
        L_0x00a5:
            r4 = r1
        L_0x00a6:
            r2.appendQueryParameter(r3, r4)
            goto L_0x0088
        L_0x00aa:
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "urlBuilder.toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r5.f58074e = r0
            if (r6 != 0) goto L_0x0108
            r6 = r5
            android.support.v4.app.FragmentActivity r6 = (android.support.p030v4.app.FragmentActivity) r6
            android.arch.lifecycle.y r6 = android.arch.lifecycle.C0214z.m440a(r6)
            java.lang.Class<com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel> r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.ActionResultModel.class
            android.arch.lifecycle.x r6 = r6.mo359a(r0)
            com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel r6 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.ActionResultModel) r6
            android.arch.lifecycle.p<android.os.Bundle> r6 = r6.f59091b
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "intent"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.os.Bundle r0 = r0.getExtras()
            if (r0 != 0) goto L_0x00dc
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x00dc:
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = "find_account"
            r0.putString(r1, r2)
            java.lang.String r1 = "enter_method"
            java.lang.String r2 = "find_account"
            r0.putString(r1, r2)
            java.lang.String r1 = "enter_type"
            java.lang.String r2 = r5.mo45954e()
            r0.putString(r1, r2)
            java.lang.String r1 = "feedback_param"
            java.lang.String r2 = r5.f58074e
            r0.putString(r1, r2)
            java.lang.String r1 = "next_page"
            com.ss.android.ugc.aweme.account.login.v2.base.i r2 = r5.f58071b
            int r2 = r2.getValue()
            r0.putInt(r1, r2)
            r6.postValue(r0)
        L_0x0108:
            java.lang.String r6 = "com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity"
            java.lang.String r0 = "onCreate"
            r1 = 0
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r6, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity.onCreate(android.os.Bundle):void");
    }
}
