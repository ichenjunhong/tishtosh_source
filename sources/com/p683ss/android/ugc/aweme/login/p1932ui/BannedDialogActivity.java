package com.p683ss.android.ugc.aweme.login.p1932ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C22835a;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.commercialize.api.DouPlusRefundApi.C25641a;
import com.p683ss.android.ugc.aweme.commercialize.api.DouPlusRefundApi.IApi;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.login.model.C36304a;
import com.p683ss.android.ugc.aweme.login.model.C36305b;
import com.p683ss.android.ugc.aweme.login.model.C36305b.C36306a;
import com.p683ss.android.ugc.aweme.login.utils.BannedApi;
import com.p683ss.android.ugc.aweme.login.utils.BannedApi.RealApi;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity */
public final class BannedDialogActivity extends AmeSSActivity {

    /* renamed from: l */
    public static final long f92923l = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: m */
    public static boolean f92924m;

    /* renamed from: n */
    public static final C36311a f92925n = new C36311a(null);

    /* renamed from: a */
    public String f92926a;

    /* renamed from: b */
    public Integer f92927b = Integer.valueOf(-1);

    /* renamed from: c */
    public String f92928c;

    /* renamed from: d */
    public String f92929d;

    /* renamed from: e */
    public String f92930e;

    /* renamed from: f */
    public int f92931f;

    /* renamed from: g */
    public boolean f92932g = true;

    /* renamed from: h */
    public C36304a f92933h;

    /* renamed from: i */
    public boolean f92934i;

    /* renamed from: j */
    public C25641a f92935j;

    /* renamed from: k */
    public boolean f92936k;

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$a */
    public static final class C36311a {
        private C36311a() {
        }

        public /* synthetic */ C36311a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$b */
    public static final class C36312b implements C17824h<C36304a> {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f92937a;

        C36312b(BannedDialogActivity bannedDialogActivity) {
            this.f92937a = bannedDialogActivity;
        }

        public final void onFailure(Throwable th) {
            C52711k.m112240b(th, "t");
            this.f92937a.f92933h = null;
            this.f92937a.f92934i = true;
            this.f92937a.mo75203a();
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            this.f92937a.f92933h = (C36304a) obj;
            this.f92937a.f92934i = true;
            this.f92937a.mo75203a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$c */
    public static final class C36313c implements C17824h<C25641a> {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f92938a;

        C36313c(BannedDialogActivity bannedDialogActivity) {
            this.f92938a = bannedDialogActivity;
        }

        public final void onFailure(Throwable th) {
            C52711k.m112240b(th, "t");
            this.f92938a.f92935j = null;
            this.f92938a.f92936k = true;
            this.f92938a.mo75203a();
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            this.f92938a.f92935j = (C25641a) obj;
            this.f92938a.f92936k = true;
            this.f92938a.mo75203a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$d */
    static final class C36314d implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f92939a;

        C36314d(BannedDialogActivity bannedDialogActivity) {
            this.f92939a = bannedDialogActivity;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (this.f92939a.f92932g) {
                this.f92939a.mo75207d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$e */
    static final class C36315e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f92940a;

        C36315e(BannedDialogActivity bannedDialogActivity) {
            this.f92940a = bannedDialogActivity;
        }

        public final void onClick(View view) {
            String str;
            boolean z;
            ClickInstrumentation.onClick(view);
            BannedDialogActivity bannedDialogActivity = this.f92940a;
            C25641a aVar = bannedDialogActivity.f92935j;
            if (aVar != null) {
                str = aVar.getFullUrl();
            } else {
                str = null;
            }
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                bannedDialogActivity.mo75204a("ban_click_refund");
                Intent intent = new Intent(bannedDialogActivity, CrossPlatformActivity.class);
                intent.putExtra("url", str);
                intent.putExtra("use_ordinary_web", false);
                bannedDialogActivity.startActivityForResult(intent, 17);
                bannedDialogActivity.f92932g = false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$f */
    static final class C36316f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f92941a;

        C36316f(BannedDialogActivity bannedDialogActivity) {
            this.f92941a = bannedDialogActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f92941a.mo75205b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$g */
    static final class C36317g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f92942a;

        C36317g(BannedDialogActivity bannedDialogActivity) {
            this.f92942a = bannedDialogActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f92942a.mo75206c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$h */
    static final class C36318h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f92943a;

        /* renamed from: b */
        final /* synthetic */ C36304a f92944b;

        C36318h(BannedDialogActivity bannedDialogActivity, C36304a aVar) {
            this.f92943a = bannedDialogActivity;
            this.f92944b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f92943a.mo75206c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$i */
    static final class C36319i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f92945a;

        /* renamed from: b */
        final /* synthetic */ C36304a f92946b;

        C36319i(BannedDialogActivity bannedDialogActivity, C36304a aVar) {
            this.f92945a = bannedDialogActivity;
            this.f92946b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f92945a.mo75206c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$j */
    static final class C36320j implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f92947a;

        /* renamed from: b */
        final /* synthetic */ C36304a f92948b;

        C36320j(BannedDialogActivity bannedDialogActivity, C36304a aVar) {
            this.f92947a = bannedDialogActivity;
            this.f92948b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f92947a.mo75205b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$k */
    static final class C36321k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f92949a;

        /* renamed from: b */
        final /* synthetic */ C36304a f92950b;

        C36321k(BannedDialogActivity bannedDialogActivity, C36304a aVar) {
            this.f92949a = bannedDialogActivity;
            this.f92950b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f92949a.mo75205b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$l */
    static final class C36322l implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ BannedDialogActivity f92951a;

        /* renamed from: b */
        final /* synthetic */ C36304a f92952b;

        C36322l(BannedDialogActivity bannedDialogActivity, C36304a aVar) {
            this.f92951a = bannedDialogActivity;
            this.f92952b = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (this.f92951a.f92932g) {
                this.f92951a.mo75207d();
            }
        }
    }

    public final void onBackPressed() {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.BannedDialogActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.BannedDialogActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.BannedDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        f92924m = false;
    }

    /* renamed from: e */
    private boolean m81951e() {
        C25641a aVar = this.f92935j;
        if (aVar != null && aVar.canRefund) {
            C25641a aVar2 = this.f92935j;
            if (aVar2 != null && aVar2.hasUrl()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private C36306a m81952f() {
        if (m81951e()) {
            C36304a aVar = this.f92933h;
            if (aVar != null) {
                C36305b bVar = aVar.f92909a;
                if (bVar != null) {
                    return bVar.f92912c;
                }
            }
            return null;
        }
        C36304a aVar2 = this.f92933h;
        if (aVar2 != null) {
            C36305b bVar2 = aVar2.f92909a;
            if (bVar2 != null) {
                return bVar2.f92913d;
            }
        }
        return null;
    }

    /* renamed from: g */
    private C36306a m81953g() {
        if (m81951e()) {
            C36304a aVar = this.f92933h;
            if (aVar != null) {
                C36305b bVar = aVar.f92909a;
                if (bVar != null) {
                    return bVar.f92913d;
                }
            }
            return null;
        }
        C36304a aVar2 = this.f92933h;
        if (aVar2 != null) {
            C36305b bVar2 = aVar2.f92909a;
            if (bVar2 != null) {
                return bVar2.f92912c;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void mo75207d() {
        if (!isFinishing()) {
            finish();
            overridePendingTransition(0, 0);
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            if (g.isLogin()) {
                C20854a.m53162b().logout("user_banned", "user_banned");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75205b() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.login.model.a r0 = r5.f92933h
            com.ss.android.ugc.aweme.login.model.b$a r1 = r5.m81953g()
            if (r1 == 0) goto L_0x000b
            java.lang.String r1 = r1.f92915b
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            r2 = 0
            if (r0 == 0) goto L_0x0016
            com.ss.android.ugc.aweme.login.model.b r0 = r0.f92909a
            if (r0 == 0) goto L_0x0016
            int r0 = r0.f92911b
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            java.lang.String r3 = "ban_click_appeal"
            r5.mo75204a(r3)
            com.ss.android.ugc.aweme.login.model.b$a r3 = r5.m81953g()
            r4 = 16
            if (r3 != 0) goto L_0x0039
            android.content.Intent r0 = new android.content.Intent
            r1 = r5
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<com.ss.android.ugc.aweme.feedback.FeedbackActivity> r3 = com.p683ss.android.ugc.aweme.feedback.FeedbackActivity.class
            r0.<init>(r1, r3)
            java.lang.String r1 = "enter_from"
            java.lang.String r3 = "banned_dialog_do_appeal"
            r0.putExtra(r1, r3)
            r5.startActivityForResult(r0, r4)
            goto L_0x006f
        L_0x0039:
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0071
            if (r0 <= 0) goto L_0x005b
            android.content.Intent r0 = new android.content.Intent
            r3 = r5
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity> r4 = com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.class
            r0.<init>(r3, r4)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.setData(r1)
            r1 = 17
            r5.startActivityForResult(r0, r1)
            goto L_0x006f
        L_0x005b:
            android.content.Intent r0 = new android.content.Intent
            r1 = r5
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<com.ss.android.ugc.aweme.feedback.FeedbackActivity> r3 = com.p683ss.android.ugc.aweme.feedback.FeedbackActivity.class
            r0.<init>(r1, r3)
            java.lang.String r1 = "enter_from"
            java.lang.String r3 = "banned_dialog_do_appeal"
            r0.putExtra(r1, r3)
            r5.startActivityForResult(r0, r4)
        L_0x006f:
            r5.f92932g = r2
        L_0x0071:
            boolean r0 = r5.f92932g
            if (r0 == 0) goto L_0x0078
            r5.mo75207d()
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.login.p1932ui.BannedDialogActivity.mo75205b():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75206c() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.login.model.b$a r0 = r6.m81952f()
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = r0.f92915b
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            com.ss.android.ugc.aweme.login.model.a r1 = r6.f92933h
            r2 = 0
            if (r1 == 0) goto L_0x0016
            com.ss.android.ugc.aweme.login.model.b r1 = r1.f92909a
            if (r1 == 0) goto L_0x0016
            int r1 = r1.f92911b
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = 1
            if (r3 == 0) goto L_0x0026
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r3 = 0
            goto L_0x0027
        L_0x0026:
            r3 = 1
        L_0x0027:
            if (r3 != 0) goto L_0x0092
            java.lang.String r3 = "ban_click_appeal"
            r6.mo75204a(r3)
            if (r1 <= 0) goto L_0x0079
            android.content.Intent r1 = new android.content.Intent
            r3 = r6
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity> r5 = com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.class
            r1.<init>(r3, r5)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r3 = r6.f92926a
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x0050
            int r3 = r3.length()
            if (r3 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r4 = 0
        L_0x0050:
            if (r4 == 0) goto L_0x0065
            java.lang.String r3 = "uid"
            com.ss.android.ugc.aweme.IAccountUserService r4 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r5 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.String r4 = r4.getLastUid()
            r0.appendQueryParameter(r3, r4)
            goto L_0x006c
        L_0x0065:
            java.lang.String r3 = "sec_uid"
            java.lang.String r4 = r6.f92926a
            r0.appendQueryParameter(r3, r4)
        L_0x006c:
            android.net.Uri r0 = r0.build()
            r1.setData(r0)
            r0 = 17
            r6.startActivityForResult(r1, r0)
            goto L_0x008f
        L_0x0079:
            android.content.Intent r0 = new android.content.Intent
            r1 = r6
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<com.ss.android.ugc.aweme.feedback.FeedbackActivity> r3 = com.p683ss.android.ugc.aweme.feedback.FeedbackActivity.class
            r0.<init>(r1, r3)
            java.lang.String r1 = "enter_from"
            java.lang.String r3 = "banned_dialog_do_cancel"
            r0.putExtra(r1, r3)
            r1 = 16
            r6.startActivityForResult(r0, r1)
        L_0x008f:
            r6.f92932g = r2
            goto L_0x0097
        L_0x0092:
            java.lang.String r0 = "ban_click_cancel"
            r6.mo75204a(r0)
        L_0x0097:
            boolean r0 = r6.f92932g
            if (r0 == 0) goto L_0x009e
            r6.mo75207d()
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.login.p1932ui.BannedDialogActivity.mo75206c():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x013a, code lost:
        if (r6 == false) goto L_0x0143;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0096  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75203a() {
        /*
            r8 = this;
            boolean r0 = r8.f92934i
            if (r0 == 0) goto L_0x01ba
            boolean r0 = r8.f92936k
            if (r0 != 0) goto L_0x000a
            goto L_0x01ba
        L_0x000a:
            boolean r0 = r8.m81951e()
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00ea
            r8.f92931f = r2
            java.lang.String r0 = "login_failure_ban"
            r8.mo75204a(r0)
            boolean r0 = r8.isFinishing()
            if (r0 != 0) goto L_0x00e9
            r0 = r8
            android.content.Context r0 = (android.content.Context) r0
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r0)
            r5 = 2132214502(0x7f1702e6, float:2.0072848E38)
            android.view.View r4 = r4.inflate(r5, r1, r3)
            if (r4 == 0) goto L_0x00e1
            com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView r4 = (com.p683ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView) r4
            com.ss.android.ugc.aweme.login.model.a r5 = r8.f92933h
            if (r5 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.login.model.b r5 = r5.f92909a
            if (r5 == 0) goto L_0x003d
            java.lang.String r5 = r5.f92910a
            goto L_0x003e
        L_0x003d:
            r5 = r1
        L_0x003e:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L_0x004b
            int r6 = r5.length()
            if (r6 != 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r6 = 0
            goto L_0x004c
        L_0x004b:
            r6 = 1
        L_0x004c:
            if (r6 != 0) goto L_0x005a
            android.widget.TextView r6 = r4.getTitleView()
            java.lang.String r7 = "content.titleView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            r6.setText(r5)
        L_0x005a:
            com.ss.android.ugc.aweme.login.model.b$a r5 = r8.m81952f()
            if (r5 == 0) goto L_0x0063
            java.lang.String r5 = r5.f92914a
            goto L_0x0064
        L_0x0063:
            r5 = r1
        L_0x0064:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L_0x0071
            int r6 = r5.length()
            if (r6 != 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r6 = 0
            goto L_0x0072
        L_0x0071:
            r6 = 1
        L_0x0072:
            if (r6 != 0) goto L_0x0080
            android.widget.TextView r6 = r4.getCancelView()
            java.lang.String r7 = "content.cancelView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            r6.setText(r5)
        L_0x0080:
            com.ss.android.ugc.aweme.login.model.b$a r5 = r8.m81953g()
            if (r5 == 0) goto L_0x0088
            java.lang.String r1 = r5.f92914a
        L_0x0088:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x0094
            int r5 = r1.length()
            if (r5 != 0) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r2 = 0
        L_0x0094:
            if (r2 != 0) goto L_0x00a2
            android.widget.TextView r2 = r4.getAppealView()
            java.lang.String r5 = "content.appealView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            r2.setText(r1)
        L_0x00a2:
            android.support.v7.app.b$a r1 = new android.support.v7.app.b$a
            r2 = 2132607876(0x7f1d0384, float:2.0870705E38)
            r1.<init>(r0, r2)
            r0 = r4
            android.view.View r0 = (android.view.View) r0
            android.support.v7.app.b$a r0 = r1.mo3762a(r0)
            android.support.v7.app.b r0 = r0.mo3772b()
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$d r1 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$d
            r1.<init>(r8)
            android.content.DialogInterface$OnDismissListener r1 = (android.content.DialogInterface.OnDismissListener) r1
            r0.setOnDismissListener(r1)
            r0.setCancelable(r3)
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$e r1 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$e
            r1.<init>(r8)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r4.f70129b = r1
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$f r1 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$f
            r1.<init>(r8)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r4.f70130c = r1
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$g r1 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$g
            r1.<init>(r8)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r4.f70131d = r1
            r0.show()
            goto L_0x00e9
        L_0x00e1:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView"
            r0.<init>(r1)
            throw r0
        L_0x00e9:
            return
        L_0x00ea:
            java.lang.String r0 = "login_failure_ban"
            r8.mo75204a(r0)
            boolean r0 = r8.isFinishing()
            if (r0 != 0) goto L_0x01b9
            com.ss.android.ugc.aweme.login.model.a r0 = r8.f92933h
            com.bytedance.ies.uikit.dialog.b$a r4 = new com.bytedance.ies.uikit.dialog.b$a
            r5 = r8
            android.content.Context r5 = (android.content.Context) r5
            r4.<init>(r5)
            java.lang.Integer r5 = r8.f92927b
            if (r5 != 0) goto L_0x0104
            goto L_0x0114
        L_0x0104:
            int r5 = r5.intValue()
            r6 = 1093(0x445, float:1.532E-42)
            if (r5 != r6) goto L_0x0114
            r5 = 2132543807(0x7f1c093f, float:2.0740758E38)
            java.lang.String r5 = r8.getString(r5)
            goto L_0x0143
        L_0x0114:
            if (r0 == 0) goto L_0x011d
            com.ss.android.ugc.aweme.login.model.b r5 = r0.f92909a
            if (r5 == 0) goto L_0x011d
            java.lang.String r5 = r5.f92910a
            goto L_0x011e
        L_0x011d:
            r5 = r1
        L_0x011e:
            java.lang.Integer r6 = r8.f92927b
            if (r6 != 0) goto L_0x0123
            goto L_0x012b
        L_0x0123:
            int r6 = r6.intValue()
            r7 = 1091(0x443, float:1.529E-42)
            if (r6 == r7) goto L_0x013c
        L_0x012b:
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x0139
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0137
            goto L_0x0139
        L_0x0137:
            r6 = 0
            goto L_0x013a
        L_0x0139:
            r6 = 1
        L_0x013a:
            if (r6 == 0) goto L_0x0143
        L_0x013c:
            r5 = 2132541628(0x7f1c00bc, float:2.0736338E38)
            java.lang.String r5 = r8.getString(r5)
        L_0x0143:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.mo20146b(r5)
            com.ss.android.ugc.aweme.login.model.b$a r5 = r8.m81952f()
            if (r5 == 0) goto L_0x0151
            java.lang.String r5 = r5.f92914a
            goto L_0x0152
        L_0x0151:
            r5 = r1
        L_0x0152:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L_0x015f
            int r6 = r5.length()
            if (r6 != 0) goto L_0x015d
            goto L_0x015f
        L_0x015d:
            r6 = 0
            goto L_0x0160
        L_0x015f:
            r6 = 1
        L_0x0160:
            if (r6 == 0) goto L_0x0170
            r5 = 2132542529(0x7f1c0441, float:2.0738165E38)
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$h r6 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$h
            r6.<init>(r8, r0)
            android.content.DialogInterface$OnClickListener r6 = (android.content.DialogInterface.OnClickListener) r6
            r4.mo20136a(r5, r6)
            goto L_0x017a
        L_0x0170:
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$i r6 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$i
            r6.<init>(r8, r0)
            android.content.DialogInterface$OnClickListener r6 = (android.content.DialogInterface.OnClickListener) r6
            r4.mo20140a(r5, r6)
        L_0x017a:
            com.ss.android.ugc.aweme.login.model.b$a r5 = r8.m81953g()
            if (r5 == 0) goto L_0x0182
            java.lang.String r1 = r5.f92914a
        L_0x0182:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x018e
            int r5 = r1.length()
            if (r5 != 0) goto L_0x018d
            goto L_0x018e
        L_0x018d:
            r2 = 0
        L_0x018e:
            if (r2 == 0) goto L_0x019e
            r1 = 2132542008(0x7f1c0238, float:2.0737109E38)
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$j r2 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$j
            r2.<init>(r8, r0)
            android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2
            r4.mo20145b(r1, r2)
            goto L_0x01a8
        L_0x019e:
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$k r2 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$k
            r2.<init>(r8, r0)
            android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2
            r4.mo20147b(r1, r2)
        L_0x01a8:
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$l r1 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$l
            r1.<init>(r8, r0)
            android.content.DialogInterface$OnDismissListener r1 = (android.content.DialogInterface.OnDismissListener) r1
            com.bytedance.ies.uikit.dialog.a$a r0 = r4.f29899a
            r0.f29874q = r1
            r4.mo20141a(r3)
            r4.mo20148b()
        L_0x01b9:
            return
        L_0x01ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.login.p1932ui.BannedDialogActivity.mo75203a():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo75204a(String str) {
        C26890h.m65011a(str, new C23089d().mo47826a("dou_balance_show", this.f92931f).mo47829a("enter_type", this.f92928c).mo47829a("enter_method", this.f92929d).mo47828a("error_code", (Object) this.f92927b).mo47829a("platform", this.f92930e).f61491a);
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        C17832m mVar;
        String str;
        boolean z2 = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.BannedDialogActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView((int) R.layout.lo);
        C11065a.m22394b(this);
        f92924m = true;
        if (getIntent().hasExtra(C22835a.f61196a)) {
            this.f92926a = getIntent().getStringExtra(C22835a.f61196a);
        }
        if (getIntent().hasExtra("banned_code")) {
            this.f92927b = Integer.valueOf(getIntent().getIntExtra("banned_code", -1));
        }
        if (getIntent().hasExtra("enter_type")) {
            this.f92928c = getIntent().getStringExtra("enter_type");
        }
        if (getIntent().hasExtra("enter_method")) {
            this.f92929d = getIntent().getStringExtra("enter_method");
        }
        if (getIntent().hasExtra("platfrom")) {
            this.f92930e = getIntent().getStringExtra("platfrom");
        }
        CharSequence charSequence = this.f92926a;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            mVar = ((RealApi) BannedApi.f92961a.create(RealApi.class)).getBannedToastInfo(g.getLastUid());
        } else {
            mVar = ((RealApi) BannedApi.f92961a.create(RealApi.class)).getBannedToastInfoBySecUid(this.f92926a);
        }
        C17825i.m43740a(mVar, new C36312b(this), C0013i.f25b);
        CharSequence charSequence2 = this.f92926a;
        if (!(charSequence2 == null || charSequence2.length() == 0)) {
            z2 = false;
        }
        if (!z2) {
            str = this.f92926a;
        } else {
            str = null;
        }
        C17825i.m43740a(((IApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(IApi.class)).check(str), new C36313c(this), C0013i.f25b);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.BannedDialogActivity", "onCreate", false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 16 || i == 17) {
            this.f92932g = true;
            mo75207d();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }
}
