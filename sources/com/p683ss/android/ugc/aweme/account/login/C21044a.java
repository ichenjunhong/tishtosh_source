package com.p683ss.android.ugc.aweme.account.login;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21841f;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21674q;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a.C20977b;
import com.p683ss.android.ugc.aweme.account.p1279l.C21022f;
import com.p683ss.android.ugc.aweme.account.views.C22312b;
import com.p683ss.android.ugc.aweme.base.p1409b.C23478b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.main.service.C36691l;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.a */
public abstract class C21044a extends C22312b implements C20977b, C21841f, C23478b {

    /* renamed from: a */
    protected Activity f57243a;

    /* renamed from: b */
    protected Bundle f57244b;

    /* renamed from: c */
    protected String f57245c;

    /* renamed from: d */
    protected String f57246d;

    /* renamed from: e */
    protected String f57247e;

    /* renamed from: f */
    protected boolean f57248f;

    /* renamed from: g */
    protected View f57249g;

    /* renamed from: h */
    public String f57250h;

    /* renamed from: i */
    private boolean f57251i;

    /* renamed from: j */
    private Dialog f57252j;

    /* renamed from: a */
    public final String mo45068a() {
        return this.f57245c;
    }

    /* renamed from: a */
    public void mo45070a(Context context) {
    }

    /* renamed from: b */
    public final String mo45072b() {
        return this.f57246d;
    }

    /* renamed from: c */
    public final String mo45073c() {
        return this.f57247e;
    }

    public void cancel() {
        super.cancel();
    }

    /* renamed from: d */
    public final Bundle mo45075d() {
        return this.f57244b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract Dialog mo45077e();

    public void show() {
        this.f57251i = false;
        try {
            if (getOwnerActivity() == null || !getOwnerActivity().isFinishing()) {
                super.show();
                C23826bi.m58452a(1, 1, "");
            }
        } catch (Exception unused) {
        }
    }

    public void dismiss() {
        this.f57251i = true;
        super.dismiss();
        C20975a.m53341b(this);
        if (this.f57248f) {
            this.f57248f = false;
            return;
        }
        C23826bi.m58452a(1, 4, "");
        new Handler().postDelayed(C21090b.f57337a, 200);
    }

    public void onStart() {
        super.onStart();
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setLayout(C9432q.m18670a(getContext()), -2);
        }
    }

    /* renamed from: a_ */
    public final void mo44975a_(int i) {
        if (i == 11 && !this.f57251i) {
            try {
                dismiss();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo45069a(com.p683ss.android.ugc.aweme.base.p1409b.C23476a r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.f62546a
            int r1 = r0.hashCode()
            r2 = 3529469(0x35dafd, float:4.94584E-39)
            r3 = 1
            if (r1 == r2) goto L_0x002b
            r2 = 103149417(0x625ef69, float:3.1208942E-35)
            if (r1 == r2) goto L_0x0021
            r2 = 1671672458(0x63a3b28a, float:6.039369E21)
            if (r1 == r2) goto L_0x0017
            goto L_0x0035
        L_0x0017:
            java.lang.String r1 = "dismiss"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 2
            goto L_0x0036
        L_0x0021:
            java.lang.String r1 = "login"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 0
            goto L_0x0036
        L_0x002b:
            java.lang.String r1 = "show"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x0035:
            r0 = -1
        L_0x0036:
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0059;
                case 1: goto L_0x003f;
                case 2: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0093
        L_0x003b:
            r4.cancel()
            goto L_0x0093
        L_0x003f:
            java.lang.String r0 = "user_agreement"
            java.lang.Object r5 = r5.mo48644a()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = com.bytedance.common.utility.C9431p.m18665a(r0, r5)
            if (r5 == 0) goto L_0x0093
            android.app.Dialog r5 = r4.mo45077e()
            r4.f57252j = r5
            android.app.Dialog r5 = r4.f57252j
            r5.show()
            goto L_0x0093
        L_0x0059:
            boolean r0 = r5.mo48645b()
            if (r0 != 0) goto L_0x0060
            return r1
        L_0x0060:
            android.content.Context r0 = r4.getContext()
            boolean r0 = com.p683ss.android.ugc.aweme.account.login.C21123c.m53601a(r0)
            if (r0 != 0) goto L_0x0079
            android.content.Context r5 = r4.getContext()
            r0 = 2132546921(0x7f1c1569, float:2.0747074E38)
            com.bytedance.ies.dmt.ui.d.a r5 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r5, r0)
            r5.mo19066a()
            return r1
        L_0x0079:
            boolean r0 = com.p683ss.android.ugc.aweme.account.utils.C22298e.m55182a()
            if (r0 == 0) goto L_0x008a
            r4.f57248f = r3
            boolean r0 = r4.isShowing()
            if (r0 == 0) goto L_0x008a
            r4.dismiss()
        L_0x008a:
            java.lang.Object r5 = r5.mo48644a()
            java.lang.String r5 = (java.lang.String) r5
            r4.mo45071a(r5)
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.C21044a.mo45069a(com.ss.android.ugc.aweme.base.b.a):java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo45071a(String str) {
        this.f57250h = str;
        if (this.f57244b != null) {
            new C21022f().mo44994a(this.f57244b.getString("enter_from")).mo44995b(C21056ad.m53523a(str)).mo44990b();
        }
        C21674q.f58706a.mo45930a(Boolean.valueOf(false), str, (C21841f) this, false);
        C36691l lVar = (C36691l) C23826bi.m58450a(C36691l.class);
        if (lVar != null) {
            StringBuilder sb = new StringBuilder("Mob.Event.LOGIN_SUBMIT_");
            sb.append(str);
            lVar.mo47884a(sb.toString());
            lVar.mo47885b("LOGIN");
        }
        Intent intent = new Intent(this.f57243a, AuthorizeActivity.class);
        if (this.f57244b != null) {
            intent.putExtras(this.f57244b);
        }
        intent.putExtra("platform", str);
        intent.putExtra("enter_from", this.f57245c);
        intent.putExtra("enter_method", this.f57246d);
        intent.putExtra("enter_type", this.f57247e);
        if (this.f57243a != null) {
            this.f57243a.startActivityForResult(intent, 1001);
        }
        m53487a(str, this.f57245c, this.f57246d);
    }

    public C21044a(Activity activity, Bundle bundle) {
        this(activity, bundle, false, true);
    }

    /* renamed from: a */
    public static void m53487a(String str, String str2, String str3) {
        C26890h.m65011a("login_choose_platform", new C20856a().mo44776a("enter_method", str3).mo44776a("enter_from", str2).mo44776a("platform", str).mo44774a("_perf_monitor", 1).f56798a);
    }

    private C21044a(Activity activity, Bundle bundle, boolean z, boolean z2) {
        super(activity, R.style.a3a, false, true);
        this.f57243a = activity;
        this.f57244b = bundle;
        mo45070a((Context) activity);
        if (this.f57244b != null) {
            this.f57245c = this.f57244b.getString("enter_from");
            this.f57246d = this.f57244b.getString("enter_method");
            this.f57247e = this.f57244b.getString("enter_type");
        }
    }
}
