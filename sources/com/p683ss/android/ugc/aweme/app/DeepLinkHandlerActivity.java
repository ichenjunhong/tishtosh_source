package com.p683ss.android.ugc.aweme.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.p030v4.app.C0636b;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p846b.C13003d;
import com.bytedance.sdk.account.p844a.p848d.C13017f;
import com.p683ss.android.sdk.activity.SSActivity;
import com.p683ss.android.ugc.aweme.AccountUserService;
import com.p683ss.android.ugc.aweme.app.C22835a.C22863g;
import com.p683ss.android.ugc.aweme.app.experiment.DeeplinkRetargetExperiment;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23093e;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.login.C27967h;
import com.p683ss.android.ugc.aweme.main.C36640eh;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel;
import com.p683ss.android.ugc.aweme.utils.ActivityStack;
import com.p683ss.android.ugc.aweme.utils.C47859eq;
import com.p683ss.android.ugc.aweme.utils.p2387a.C47659c;
import com.p683ss.android.ugc.aweme.video.C48038j;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity */
public class DeepLinkHandlerActivity extends SSActivity {

    /* renamed from: a */
    protected C23093e f61151a = new C23093e();

    /* renamed from: b */
    protected Uri f61152b;

    /* renamed from: c */
    protected boolean f61153c = false;

    /* renamed from: d */
    protected boolean f61154d = false;

    /* renamed from: e */
    protected boolean f61155e = false;

    /* renamed from: f */
    private boolean f61156f = false;

    /* renamed from: g */
    private boolean f61157g = false;

    /* renamed from: h */
    private boolean f61158h = false;

    /* renamed from: i */
    private ArrayList<String> f61159i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<Intent> f61160j = new ArrayList<>();

    /* renamed from: m */
    private Intent f61161m = null;

    /* renamed from: n */
    private Intent f61162n = null;

    /* renamed from: o */
    private boolean f61163o = false;

    /* renamed from: p */
    private boolean f61164p = false;

    /* renamed from: q */
    private AccountUserService f61165q = new AccountUserService();

    /* renamed from: r */
    private MultiAccountViewModel f61166r = new MultiAccountViewModel();

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f61155e = false;
    }

    public void onStart() {
        super.onStart();
        finish();
    }

    public Resources getResources() {
        C47859eq.m103530a(this, this.f54332l);
        return super.getResources();
    }

    /* renamed from: a */
    protected static boolean m56213a() {
        return C23137q.m56698a().mo47855c();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity", "onResume", true);
        if (C47859eq.m103531b(this)) {
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity", "onResume", false);
            return;
        }
        super.onResume();
        C47859eq.m103529a(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity", "onResume", false);
    }

    public void setTheme(int i) {
        try {
            super.setTheme(i);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:300|(1:302)(1:303)|304|305|306|307|308|(1:310)|311|(1:313)(1:314)|315|(1:317)(1:318)|319|320) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:307:0x06ac */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x039c A[Catch:{ Exception -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x039e A[Catch:{ Exception -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0410 A[Catch:{ Exception -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x041b A[Catch:{ Exception -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0427 A[Catch:{ Exception -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0432 A[Catch:{ Exception -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x043e A[Catch:{ Exception -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0486 A[Catch:{ Exception -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0489 A[Catch:{ Exception -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04bf A[Catch:{ Exception -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x04cf A[Catch:{ Exception -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x05e5  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x05f2 A[SYNTHETIC, Splitter:B:285:0x05f2] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0692  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0695  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x06b8 A[Catch:{ Exception -> 0x06dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x06c0 A[Catch:{ Exception -> 0x06dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x06c3 A[Catch:{ Exception -> 0x06dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x06ce A[Catch:{ Exception -> 0x06dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x06d1 A[Catch:{ Exception -> 0x06dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x06fd  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0706 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0774  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0790  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x079b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r0 = "com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity"
            java.lang.String r2 = "onCreate"
            r3 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r2, r3)
            super.onCreate(r23)
            com.bytedance.ies.ugc.p694a.C11016e.m22301a(r22)
            r1.f54331k = r3
            boolean r0 = com.p683ss.android.ugc.aweme.preinstall.PreinstallUtils.m88376a(r22)
            r2 = 0
            if (r0 == 0) goto L_0x0031
            super.onCreate(r23)
            com.p683ss.android.ugc.aweme.preinstall.PreinstallUtils.m88377b(r22)
            r22.finish()
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            java.lang.String r0 = "com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity"
            java.lang.String r3 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r3, r2)
            return
        L_0x0031:
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService.getBridgeService_Monster()
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = (com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService) r0
            boolean r0 = r0.isStartJourneyActivity(r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity"
            java.lang.String r3 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r3, r2)
            return
        L_0x0045:
            android.content.Intent r4 = r22.getIntent()
            if (r4 != 0) goto L_0x004d
        L_0x004b:
            r0 = 0
            goto L_0x0081
        L_0x004d:
            java.lang.String r0 = r4.getAction()
            boolean r5 = com.bytedance.common.utility.C9431p.m18664a(r0)
            if (r5 != 0) goto L_0x0071
            java.lang.String r5 = "com.ss.android.sdk."
            int r0 = r0.indexOf(r5)
            if (r0 != 0) goto L_0x0071
            java.lang.String r0 = "open_url"
            java.lang.String r0 = r4.getStringExtra(r0)
            boolean r5 = com.bytedance.common.utility.C9431p.m18664a(r0)
            if (r5 != 0) goto L_0x0071
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.f61152b = r0
        L_0x0071:
            android.net.Uri r0 = r1.f61152b
            if (r0 != 0) goto L_0x007b
            android.net.Uri r0 = r4.getData()
            r1.f61152b = r0
        L_0x007b:
            android.net.Uri r0 = r1.f61152b
            if (r0 != 0) goto L_0x0080
            goto L_0x004b
        L_0x0080:
            r0 = 1
        L_0x0081:
            if (r0 != 0) goto L_0x00a3
            boolean r0 = r22.isFinishing()
            if (r0 != 0) goto L_0x008c
            r22.finish()
        L_0x008c:
            java.lang.String r0 = "from_tile_service"
            boolean r0 = r4.getBooleanExtra(r0, r2)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = ""
            java.lang.String r3 = "abs uri==null"
            com.p683ss.android.ugc.aweme.util.C47638r.m103133a(r0, r2, r3)
        L_0x009b:
            java.lang.String r0 = "com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity"
            java.lang.String r3 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r3, r2)
            return
        L_0x00a3:
            boolean r0 = com.p683ss.android.ugc.aweme.p2375u.C47404a.m102782a()
            r5 = 0
            if (r0 == 0) goto L_0x00be
            java.lang.String r0 = "ws"
            java.lang.String r0 = r4.getStringExtra(r0)
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 != 0) goto L_0x00be
            com.ss.android.ugc.aweme.qrcode.a.c r6 = new com.ss.android.ugc.aweme.qrcode.a.c
            r6.<init>(r5)
            com.p683ss.android.ugc.aweme.qrcode.p2102a.C40925c.m90511a(r0)
        L_0x00be:
            android.net.Uri r6 = r4.getData()
            if (r6 == 0) goto L_0x00d3
            java.lang.String r0 = "is_zlink"
            boolean r0 = r4.getBooleanExtra(r0, r2)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r7 = com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService.getBridgeService_Monster()
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r7 = (com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService) r7
            r7.zlinkCallUri(r6, r3, r3, r0)
        L_0x00d3:
            java.lang.String r0 = "dl_from"
            java.lang.String r0 = r4.getStringExtra(r0)
            java.lang.String r7 = "af"
            boolean r0 = android.text.TextUtils.equals(r0, r7)
            r1.f61156f = r0
            java.lang.String r0 = "dl_from"
            java.lang.String r0 = r4.getStringExtra(r0)
            java.lang.String r7 = "facebook"
            boolean r0 = android.text.TextUtils.equals(r0, r7)
            r1.f61157g = r0
            boolean r0 = r1.f61157g
            if (r0 != 0) goto L_0x00fa
            boolean r0 = r1.f61156f
            if (r0 == 0) goto L_0x00f8
            goto L_0x00fa
        L_0x00f8:
            r0 = 0
            goto L_0x00fb
        L_0x00fa:
            r0 = 1
        L_0x00fb:
            com.p683ss.android.ugc.aweme.app.C23041b.m56556a(r0)
            java.lang.String r0 = "is_from_self"
            boolean r0 = com.p683ss.android.newmedia.message.C19569a.m47873a(r4, r0, r2)
            r1.f61153c = r0
            java.lang.String r0 = "from_notification"
            boolean r0 = com.p683ss.android.newmedia.message.C19569a.m47873a(r4, r0, r2)
            r1.f61154d = r0
            com.ss.android.ugc.aweme.app.AwemeAppData r0 = com.p683ss.android.ugc.aweme.app.AwemeAppData.m47851a()
            boolean r7 = r1.f61154d
            r0.f61129g = r7
            com.ss.android.ugc.aweme.app.z r7 = new com.ss.android.ugc.aweme.app.z
            r7.<init>(r1, r4)
            boolean r0 = r1.f61154d
            android.net.Uri r8 = r1.f61152b
            com.ss.android.ugc.awemepushapi.IPushApi r9 = com.p683ss.android.p1159di.push.C19073a.m46451a()
            android.content.Context r10 = r7.f61651a
            android.content.Intent r11 = r7.f61652b
            r9.notifyOnDeeplink(r0, r10, r11, r8)
            com.ss.android.ugc.aweme.app.l r0 = new com.ss.android.ugc.aweme.app.l
            com.ss.android.ugc.aweme.app.f.e r8 = r1.f61151a
            r0.<init>(r8)
            boolean r8 = r1.f61154d
            if (r8 != 0) goto L_0x01c2
            android.net.Uri r8 = r1.f61152b
            java.lang.String r9 = "gd_label"
            java.lang.String r9 = r8.getQueryParameter(r9)
            java.lang.String r10 = "params_url"
            java.lang.String r10 = r8.getQueryParameter(r10)
            java.lang.String r11 = "utm_source"
            java.lang.String r11 = r8.getQueryParameter(r11)
            android.content.Intent r12 = r22.getIntent()
            if (r12 == 0) goto L_0x0159
            java.lang.String r13 = "al_applink_data"
            boolean r12 = r12.hasExtra(r13)
            if (r12 == 0) goto L_0x0159
            r12 = 1
            goto L_0x015a
        L_0x0159:
            r12 = 0
        L_0x015a:
            if (r12 == 0) goto L_0x016a
            com.ss.android.ugc.aweme.app.f.e r12 = r0.f61538a
            java.lang.String r13 = "link_direct"
            r12.mo47833a(r13)
            com.ss.android.ugc.aweme.app.f.e r12 = r0.f61538a
            java.lang.String r13 = "fb"
            r12.mo47834b(r13)
        L_0x016a:
            boolean r12 = android.text.TextUtils.isEmpty(r9)
            if (r12 != 0) goto L_0x0175
            com.ss.android.ugc.aweme.app.f.e r12 = r0.f61538a
            r12.mo47833a(r9)
        L_0x0175:
            boolean r9 = android.text.TextUtils.isEmpty(r11)
            if (r9 != 0) goto L_0x0184
            com.ss.android.ugc.aweme.app.f.e r0 = r0.f61538a
            java.lang.String r9 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r9)
            r0.f61497d = r11
        L_0x0184:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x01c0
            java.lang.String r0 = java.net.URLDecoder.decode(r10)
            java.lang.String r9 = "params_url"
            java.util.Set r10 = r8.getQueryParameterNames()
            android.net.Uri$Builder r11 = r8.buildUpon()
            android.net.Uri$Builder r11 = r11.clearQuery()
            java.util.Iterator r10 = r10.iterator()
        L_0x01a0:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x01bc
            java.lang.Object r12 = r10.next()
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = r12.equals(r9)
            if (r13 == 0) goto L_0x01b4
            r13 = r0
            goto L_0x01b8
        L_0x01b4:
            java.lang.String r13 = r8.getQueryParameter(r12)
        L_0x01b8:
            r11.appendQueryParameter(r12, r13)
            goto L_0x01a0
        L_0x01bc:
            android.net.Uri r8 = r11.build()
        L_0x01c0:
            r1.f61152b = r8
        L_0x01c2:
            int r0 = r1.f54331k
            com.p683ss.android.ugc.aweme.base.activity.C23424c.m57556a(r1, r0)
            boolean r0 = com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
            if (r0 == 0) goto L_0x01e0
            com.ss.android.ugc.aweme.app.q r0 = com.p683ss.android.ugc.aweme.app.C23137q.m56698a()
            boolean r0 = r0.mo47855c()
            if (r0 != 0) goto L_0x01de
            android.content.Intent r0 = com.p683ss.android.ugc.aweme.utils.p2387a.C47659c.m103160a(r22)
            r1.startActivity(r0)
        L_0x01de:
            r0 = 1
            goto L_0x01e1
        L_0x01e0:
            r0 = 0
        L_0x01e1:
            if (r0 == 0) goto L_0x01eb
            java.lang.String r0 = "com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity"
            java.lang.String r3 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r3, r2)
            return
        L_0x01eb:
            android.content.Intent r0 = r22.getIntent()
            java.lang.String r8 = "pre_o_urls"
            java.util.ArrayList r8 = r0.getStringArrayListExtra(r8)
            r1.f61159i = r8
            if (r0 == 0) goto L_0x0203
            java.lang.String r9 = "rule_id"
            java.lang.String r9 = r0.getStringExtra(r9)     // Catch:{ Exception -> 0x0200 }
            goto L_0x0205
        L_0x0200:
            r0 = move-exception
            goto L_0x05c2
        L_0x0203:
            java.lang.String r9 = ""
        L_0x0205:
            if (r0 == 0) goto L_0x020c
            android.net.Uri r10 = r0.getData()     // Catch:{ Exception -> 0x0200 }
            goto L_0x020d
        L_0x020c:
            r10 = r5
        L_0x020d:
            com.ss.android.ugc.aweme.AccountUserService r11 = r1.f61165q     // Catch:{ Exception -> 0x0200 }
            java.util.List r11 = r11.allUidList()     // Catch:{ Exception -> 0x0200 }
            com.ss.android.ugc.aweme.AccountUserService r12 = r1.f61165q     // Catch:{ Exception -> 0x0200 }
            java.lang.String r12 = r12.getCurUserId()     // Catch:{ Exception -> 0x0200 }
            if (r10 == 0) goto L_0x0222
            java.lang.String r13 = "multi_account_push_uid"
            java.lang.String r10 = r10.getQueryParameter(r13)     // Catch:{ Exception -> 0x0200 }
            goto L_0x0223
        L_0x0222:
            r10 = r5
        L_0x0223:
            boolean r13 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x0200 }
            com.ss.android.ugc.aweme.IAccountUserService r14 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()     // Catch:{ Exception -> 0x0200 }
            boolean r14 = r14.isLogin()     // Catch:{ Exception -> 0x0200 }
            boolean r12 = android.text.TextUtils.equals(r10, r12)     // Catch:{ Exception -> 0x0200 }
            boolean r11 = r11.contains(r10)     // Catch:{ Exception -> 0x0200 }
            boolean r15 = com.p683ss.android.ugc.aweme.language.C35837h.m80977b()     // Catch:{ Exception -> 0x0200 }
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            if (r15 == 0) goto L_0x0267
            if (r13 != 0) goto L_0x0267
            if (r14 == 0) goto L_0x0267
            if (r12 != 0) goto L_0x0267
            r1.f61164p = r3     // Catch:{ Exception -> 0x0200 }
            com.ss.android.ugc.aweme.services.IExternalService r12 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()     // Catch:{ Exception -> 0x0200 }
            com.ss.android.ugc.aweme.services.IExternalService r12 = (com.p683ss.android.ugc.aweme.services.IExternalService) r12     // Catch:{ Exception -> 0x0200 }
            com.ss.android.ugc.aweme.services.video.IAVPublishService r12 = r12.publishService()     // Catch:{ Exception -> 0x0200 }
            boolean r12 = r12.isPublishing()     // Catch:{ Exception -> 0x0200 }
            if (r12 == 0) goto L_0x0264
            android.os.Handler r9 = new android.os.Handler     // Catch:{ Exception -> 0x0200 }
            r9.<init>()     // Catch:{ Exception -> 0x0200 }
            java.lang.Runnable r10 = com.p683ss.android.ugc.aweme.app.C23185w.f61646a     // Catch:{ Exception -> 0x0200 }
            r9.post(r10)     // Catch:{ Exception -> 0x0200 }
        L_0x0261:
            r9 = 0
            goto L_0x039a
        L_0x0264:
            r1.m56212a(r11, r0)     // Catch:{ Exception -> 0x0200 }
        L_0x0267:
            if (r0 == 0) goto L_0x0273
            java.lang.String r11 = "second_jump"
            boolean r11 = r0.getBooleanExtra(r11, r2)     // Catch:{ Exception -> 0x0200 }
            if (r11 == 0) goto L_0x0273
            r11 = 1
            goto L_0x0274
        L_0x0273:
            r11 = 0
        L_0x0274:
            java.util.ArrayList<java.lang.String> r12 = r1.f61159i     // Catch:{ Exception -> 0x0200 }
            boolean r12 = com.bytedance.common.utility.p522b.C9376b.m18558a(r12)     // Catch:{ Exception -> 0x0200 }
            if (r12 != 0) goto L_0x02ec
            com.ss.android.ugc.aweme.IAccountUserService r12 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()     // Catch:{ Exception -> 0x0200 }
            boolean r12 = r12.isLogin()     // Catch:{ Exception -> 0x0200 }
            if (r12 == 0) goto L_0x02b1
            boolean r12 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x0200 }
            if (r12 != 0) goto L_0x02b1
            com.ss.android.ugc.aweme.AccountUserService r12 = r1.f61165q     // Catch:{ Exception -> 0x0200 }
            java.lang.String r12 = r12.getCurUserId()     // Catch:{ Exception -> 0x0200 }
            boolean r10 = android.text.TextUtils.equals(r10, r12)     // Catch:{ Exception -> 0x0200 }
            if (r10 != 0) goto L_0x02b1
            boolean r10 = m56213a()     // Catch:{ Exception -> 0x0200 }
            if (r10 == 0) goto L_0x02aa
            java.util.ArrayList<java.lang.String> r9 = r1.f61159i     // Catch:{ Exception -> 0x0200 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0200 }
            java.lang.String r10 = "abs isAppHot == true"
            com.p683ss.android.ugc.aweme.util.C47638r.m103133a(r9, r2, r10)     // Catch:{ Exception -> 0x0200 }
            goto L_0x0261
        L_0x02aa:
            android.content.Intent r10 = com.p683ss.android.ugc.aweme.utils.p2387a.C47659c.m103160a(r22)     // Catch:{ Exception -> 0x0200 }
            r1.f61161m = r10     // Catch:{ Exception -> 0x0200 }
            goto L_0x02ec
        L_0x02b1:
            boolean r10 = m56213a()     // Catch:{ Exception -> 0x0200 }
            if (r10 == 0) goto L_0x02b9
            if (r11 == 0) goto L_0x02ec
        L_0x02b9:
            java.util.ArrayList<java.lang.String> r10 = r1.f61159i     // Catch:{ Exception -> 0x0200 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x0200 }
        L_0x02bf:
            boolean r11 = r10.hasNext()     // Catch:{ Exception -> 0x0200 }
            if (r11 == 0) goto L_0x02ec
            java.lang.Object r11 = r10.next()     // Catch:{ Exception -> 0x0200 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x0200 }
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch:{ Exception -> 0x0200 }
            android.content.Intent r12 = r1.f61162n     // Catch:{ Exception -> 0x0200 }
            if (r12 == 0) goto L_0x02d5
            r12 = 1
            goto L_0x02d6
        L_0x02d5:
            r12 = 0
        L_0x02d6:
            android.content.Intent r11 = r1.mo47293a(r11, r12, r2)     // Catch:{ Exception -> 0x0200 }
            if (r11 == 0) goto L_0x02bf
            java.lang.String r12 = "is_have_intents"
            r11.putExtra(r12, r3)     // Catch:{ Exception -> 0x0200 }
            java.lang.String r12 = "rule_id"
            r11.putExtra(r12, r9)     // Catch:{ Exception -> 0x0200 }
            java.util.ArrayList<android.content.Intent> r12 = r1.f61160j     // Catch:{ Exception -> 0x0200 }
            r12.add(r2, r11)     // Catch:{ Exception -> 0x0200 }
            goto L_0x02bf
        L_0x02ec:
            android.content.Intent r10 = r1.f61161m     // Catch:{ Exception -> 0x0200 }
            if (r10 != 0) goto L_0x02ff
            android.net.Uri r10 = r1.f61152b     // Catch:{ Exception -> 0x0200 }
            android.content.Intent r11 = r1.f61162n     // Catch:{ Exception -> 0x0200 }
            if (r11 == 0) goto L_0x02f8
            r11 = 1
            goto L_0x02f9
        L_0x02f8:
            r11 = 0
        L_0x02f9:
            android.content.Intent r10 = r1.mo47293a(r10, r11, r3)     // Catch:{ Exception -> 0x0200 }
            r1.f61161m = r10     // Catch:{ Exception -> 0x0200 }
        L_0x02ff:
            android.content.Intent r10 = r1.f61161m     // Catch:{ Exception -> 0x0200 }
            if (r10 != 0) goto L_0x0330
            boolean r9 = r1.f61163o     // Catch:{ Exception -> 0x0200 }
            if (r9 != 0) goto L_0x0319
            android.net.Uri r9 = r1.f61152b     // Catch:{ Exception -> 0x0200 }
            if (r9 != 0) goto L_0x030e
            java.lang.String r9 = ""
            goto L_0x0314
        L_0x030e:
            android.net.Uri r9 = r1.f61152b     // Catch:{ Exception -> 0x0200 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0200 }
        L_0x0314:
            java.lang.String r10 = "abs intent == null"
            com.p683ss.android.ugc.aweme.util.C47638r.m103133a(r9, r2, r10)     // Catch:{ Exception -> 0x0200 }
        L_0x0319:
            boolean r9 = m56213a()     // Catch:{ Exception -> 0x0200 }
            if (r9 != 0) goto L_0x0261
            boolean r9 = r1.f61155e     // Catch:{ Exception -> 0x0200 }
            if (r9 == 0) goto L_0x0261
            android.content.Intent r9 = com.p683ss.android.ugc.aweme.utils.p2387a.C47659c.m103160a(r22)     // Catch:{ Exception -> 0x0200 }
            r1.f61161m = r9     // Catch:{ Exception -> 0x0200 }
            android.content.Intent r9 = r1.f61161m     // Catch:{ Exception -> 0x0200 }
            android.support.p030v4.app.C0636b.m2094a(r1, r9, r5)     // Catch:{ Exception -> 0x0200 }
            goto L_0x0261
        L_0x0330:
            android.content.Intent r10 = r1.f61161m     // Catch:{ Exception -> 0x0200 }
            java.lang.String r11 = "from_notification"
            boolean r12 = r1.f61154d     // Catch:{ Exception -> 0x0200 }
            r10.putExtra(r11, r12)     // Catch:{ Exception -> 0x0200 }
            android.content.Intent r10 = r1.f61161m     // Catch:{ Exception -> 0x0200 }
            java.lang.String r11 = "rule_id"
            r10.putExtra(r11, r9)     // Catch:{ Exception -> 0x0200 }
            boolean r9 = r1.f61153c     // Catch:{ Exception -> 0x0200 }
            if (r9 != 0) goto L_0x0349
            android.content.Intent r9 = r1.f61161m     // Catch:{ Exception -> 0x0200 }
            r9.addFlags(r8)     // Catch:{ Exception -> 0x0200 }
        L_0x0349:
            java.util.ArrayList<android.content.Intent> r9 = r1.f61160j     // Catch:{ Exception -> 0x0200 }
            int r9 = r9.size()     // Catch:{ Exception -> 0x0200 }
            if (r9 <= 0) goto L_0x0399
            android.content.Intent r9 = r1.f61161m     // Catch:{ Exception -> 0x0200 }
            android.content.ComponentName r9 = r9.getComponent()     // Catch:{ Exception -> 0x0200 }
            if (r9 == 0) goto L_0x038b
            java.lang.Class<com.ss.android.ugc.aweme.main.MainActivity> r9 = com.p683ss.android.ugc.aweme.main.MainActivity.class
            java.lang.String r9 = r9.getName()     // Catch:{ Exception -> 0x0200 }
            android.content.Intent r10 = r1.f61161m     // Catch:{ Exception -> 0x0200 }
            android.content.ComponentName r10 = r10.getComponent()     // Catch:{ Exception -> 0x0200 }
            java.lang.String r10 = r10.getClassName()     // Catch:{ Exception -> 0x0200 }
            boolean r9 = android.text.TextUtils.equals(r9, r10)     // Catch:{ Exception -> 0x0200 }
            if (r9 != 0) goto L_0x0385
            java.lang.Class<com.ss.android.ugc.aweme.splash.SplashActivity> r9 = com.p683ss.android.ugc.aweme.splash.SplashActivity.class
            java.lang.String r9 = r9.getName()     // Catch:{ Exception -> 0x0200 }
            android.content.Intent r10 = r1.f61161m     // Catch:{ Exception -> 0x0200 }
            android.content.ComponentName r10 = r10.getComponent()     // Catch:{ Exception -> 0x0200 }
            java.lang.String r10 = r10.getClassName()     // Catch:{ Exception -> 0x0200 }
            boolean r9 = android.text.TextUtils.equals(r9, r10)     // Catch:{ Exception -> 0x0200 }
            if (r9 == 0) goto L_0x038b
        L_0x0385:
            java.util.ArrayList<android.content.Intent> r9 = r1.f61160j     // Catch:{ Exception -> 0x0200 }
            r9.clear()     // Catch:{ Exception -> 0x0200 }
            goto L_0x0399
        L_0x038b:
            android.content.Intent r9 = r1.f61161m     // Catch:{ Exception -> 0x0200 }
            java.lang.String r10 = "is_have_intents"
            r9.putExtra(r10, r3)     // Catch:{ Exception -> 0x0200 }
            java.util.ArrayList<android.content.Intent> r9 = r1.f61160j     // Catch:{ Exception -> 0x0200 }
            android.content.Intent r10 = r1.f61161m     // Catch:{ Exception -> 0x0200 }
            r9.add(r10)     // Catch:{ Exception -> 0x0200 }
        L_0x0399:
            r9 = 1
        L_0x039a:
            if (r9 != 0) goto L_0x039e
            goto L_0x05d1
        L_0x039e:
            android.net.Uri r9 = r1.f61152b     // Catch:{ Exception -> 0x0200 }
            android.content.Intent r10 = r1.f61161m     // Catch:{ Exception -> 0x0200 }
            if (r10 != 0) goto L_0x03a6
            goto L_0x04e0
        L_0x03a6:
            if (r9 != 0) goto L_0x03aa
            goto L_0x04e0
        L_0x03aa:
            r11 = r1
            android.app.Activity r11 = (android.app.Activity) r11     // Catch:{ Exception -> 0x0200 }
            int r12 = r11.getTaskId()     // Catch:{ Exception -> 0x0200 }
            com.ss.android.ugc.aweme.app.j.a r13 = com.p683ss.android.ugc.aweme.app.p1380j.C23108a.f61530c     // Catch:{ Exception -> 0x0200 }
            com.bytedance.keva.Keva r13 = r13.mo47848a()     // Catch:{ Exception -> 0x0200 }
            java.lang.String r14 = "LAST_ACTIVITY_TASK_ID"
            int r13 = r13.getInt(r14, r2)     // Catch:{ Exception -> 0x0200 }
            if (r12 != r13) goto L_0x03c5
            boolean r12 = com.bytedance.ies.ugc.p694a.C11016e.m22311f()     // Catch:{ Exception -> 0x0200 }
            if (r12 == 0) goto L_0x04e0
        L_0x03c5:
            com.ss.android.ugc.aweme.app.j.a r12 = com.p683ss.android.ugc.aweme.app.p1380j.C23108a.f61530c     // Catch:{ Exception -> 0x0200 }
            com.bytedance.keva.Keva r12 = r12.mo47848a()     // Catch:{ Exception -> 0x0200 }
            java.lang.String r13 = "LAST_ACTIVITY_TASK_ID"
            int r11 = r11.getTaskId()     // Catch:{ Exception -> 0x0200 }
            r12.storeInt(r13, r11)     // Catch:{ Exception -> 0x0200 }
            com.bytedance.ies.abmock.n r11 = com.bytedance.ies.abmock.C10193n.m20607a()     // Catch:{ Exception -> 0x0200 }
            java.lang.Class<com.ss.android.ugc.aweme.settings.VendorBackUrlKey> r12 = com.p683ss.android.ugc.aweme.settings.VendorBackUrlKey.class
            java.lang.String r13 = "vendor_key_back_url"
            com.bytedance.ies.abmock.b r14 = com.bytedance.ies.abmock.C10181b.m20511a()     // Catch:{ Exception -> 0x0200 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r14 = r14.mo18175c()     // Catch:{ Exception -> 0x0200 }
            java.lang.String r14 = r14.getVendorKeyBackUrl()     // Catch:{ Exception -> 0x0200 }
            java.lang.String r15 = ""
            java.lang.String r11 = r11.mo18203a(r12, r13, r14, r15)     // Catch:{ Exception -> 0x0200 }
            java.lang.String r12 = "SettingsManager.getInsta…orBackUrlKey::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)     // Catch:{ Exception -> 0x0200 }
            boolean r12 = com.p683ss.android.ugc.aweme.utils.C47682ar.m103195a(r11)     // Catch:{ Exception -> 0x0200 }
            if (r12 == 0) goto L_0x03fe
            java.lang.String r11 = r9.getQueryParameter(r11)     // Catch:{ Exception -> 0x0200 }
            goto L_0x03ff
        L_0x03fe:
            r11 = r5
        L_0x03ff:
            r12 = r11
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch:{ Exception -> 0x0200 }
            if (r12 == 0) goto L_0x040d
            int r12 = r12.length()     // Catch:{ Exception -> 0x0200 }
            if (r12 != 0) goto L_0x040b
            goto L_0x040d
        L_0x040b:
            r12 = 0
            goto L_0x040e
        L_0x040d:
            r12 = 1
        L_0x040e:
            if (r12 == 0) goto L_0x0416
            java.lang.String r11 = "backurl"
            java.lang.String r11 = r9.getQueryParameter(r11)     // Catch:{ Exception -> 0x0200 }
        L_0x0416:
            r12 = r11
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch:{ Exception -> 0x0200 }
            if (r12 == 0) goto L_0x0424
            int r12 = r12.length()     // Catch:{ Exception -> 0x0200 }
            if (r12 != 0) goto L_0x0422
            goto L_0x0424
        L_0x0422:
            r12 = 0
            goto L_0x0425
        L_0x0424:
            r12 = 1
        L_0x0425:
            if (r12 == 0) goto L_0x042d
            java.lang.String r11 = "back_url"
            java.lang.String r11 = r9.getQueryParameter(r11)     // Catch:{ Exception -> 0x0200 }
        L_0x042d:
            r12 = r11
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch:{ Exception -> 0x0200 }
            if (r12 == 0) goto L_0x043b
            int r12 = r12.length()     // Catch:{ Exception -> 0x0200 }
            if (r12 != 0) goto L_0x0439
            goto L_0x043b
        L_0x0439:
            r12 = 0
            goto L_0x043c
        L_0x043b:
            r12 = 1
        L_0x043c:
            if (r12 != 0) goto L_0x04e0
            java.util.ArrayList<java.lang.String> r12 = com.p683ss.android.ugc.aweme.app.p1380j.C23108a.f61529b     // Catch:{ Exception -> 0x0200 }
            boolean r12 = r12.isEmpty()     // Catch:{ Exception -> 0x0200 }
            if (r12 == 0) goto L_0x0457
            java.util.ArrayList<java.lang.String> r12 = com.p683ss.android.ugc.aweme.app.p1380j.C23108a.f61529b     // Catch:{ Exception -> 0x0200 }
            java.lang.String r13 = "__BACKURL__"
            r12.add(r13)     // Catch:{ Exception -> 0x0200 }
            java.lang.String r13 = "__BACK_URL__"
            r12.add(r13)     // Catch:{ Exception -> 0x0200 }
            java.lang.String r13 = "__HWPPSBACKURL__"
            r12.add(r13)     // Catch:{ Exception -> 0x0200 }
        L_0x0457:
            java.util.ArrayList<java.lang.String> r12 = com.p683ss.android.ugc.aweme.app.p1380j.C23108a.f61529b     // Catch:{ Exception -> 0x0200 }
            boolean r12 = r12.contains(r11)     // Catch:{ Exception -> 0x0200 }
            if (r12 == 0) goto L_0x0461
            goto L_0x04e0
        L_0x0461:
            java.lang.String r12 = "btn_name"
            java.lang.String r12 = r9.getQueryParameter(r12)     // Catch:{ Exception -> 0x0200 }
            r13 = r12
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13     // Catch:{ Exception -> 0x0200 }
            if (r13 == 0) goto L_0x0475
            int r13 = r13.length()     // Catch:{ Exception -> 0x0200 }
            if (r13 != 0) goto L_0x0473
            goto L_0x0475
        L_0x0473:
            r13 = 0
            goto L_0x0476
        L_0x0475:
            r13 = 1
        L_0x0476:
            if (r13 != 0) goto L_0x0480
            java.lang.String r13 = "__BTN_NAME__"
            boolean r13 = p2628d.p2639f.p2641b.C52711k.m112239a(r12, r13)     // Catch:{ Exception -> 0x0200 }
            if (r13 == 0) goto L_0x0494
        L_0x0480:
            boolean r12 = com.p683ss.android.ugc.aweme.utils.p2390d.C47801c.m103435d()     // Catch:{ Exception -> 0x0200 }
            if (r12 == 0) goto L_0x0489
            java.lang.String r12 = "返回vivo"
            goto L_0x0494
        L_0x0489:
            boolean r12 = com.p683ss.android.ugc.aweme.utils.p2390d.C47801c.m103434c()     // Catch:{ Exception -> 0x0200 }
            if (r12 == 0) goto L_0x0492
            java.lang.String r12 = ""
            goto L_0x0494
        L_0x0492:
            java.lang.String r12 = "返回"
        L_0x0494:
            java.lang.String r13 = "package"
            java.lang.String r9 = r9.getQueryParameter(r13)     // Catch:{ Exception -> 0x0200 }
            android.net.Uri r13 = android.net.Uri.parse(r11)     // Catch:{ Exception -> 0x0200 }
            android.content.Intent r14 = new android.content.Intent     // Catch:{ Exception -> 0x0200 }
            r14.<init>()     // Catch:{ Exception -> 0x0200 }
            r14.setData(r13)     // Catch:{ Exception -> 0x0200 }
            java.lang.String r13 = "android.intent.action.VIEW"
            r14.setAction(r13)     // Catch:{ Exception -> 0x0200 }
            java.lang.String r13 = "android.intent.category.BROWSABLE"
            r14.addCategory(r13)     // Catch:{ Exception -> 0x0200 }
            r14.addFlags(r8)     // Catch:{ Exception -> 0x0200 }
            r14.setComponent(r5)     // Catch:{ Exception -> 0x0200 }
            r14.setSelector(r5)     // Catch:{ Exception -> 0x0200 }
            boolean r8 = com.p683ss.android.ugc.aweme.utils.C47682ar.m103195a(r9)     // Catch:{ Exception -> 0x0200 }
            if (r8 == 0) goto L_0x04c2
            r14.setPackage(r9)     // Catch:{ Exception -> 0x0200 }
        L_0x04c2:
            r8 = r1
            android.app.Activity r8 = (android.app.Activity) r8     // Catch:{ Exception -> 0x0200 }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ Exception -> 0x0200 }
            android.content.ComponentName r8 = r14.resolveActivity(r8)     // Catch:{ Exception -> 0x0200 }
            if (r8 == 0) goto L_0x04e0
            java.lang.String r8 = "VENDOR_BACK_INTENT_FOR_INTENT_KEY"
            android.os.Parcelable r14 = (android.os.Parcelable) r14     // Catch:{ Exception -> 0x0200 }
            r10.putExtra(r8, r14)     // Catch:{ Exception -> 0x0200 }
            java.lang.String r8 = "VENDOR_BACK_URL_FOR_INTENT_KEY"
            r10.putExtra(r8, r11)     // Catch:{ Exception -> 0x0200 }
            java.lang.String r8 = "VENDOR_BTN_NAME_FOR_INTENT_KEY"
            r10.putExtra(r8, r12)     // Catch:{ Exception -> 0x0200 }
        L_0x04e0:
            boolean r8 = r1.f61164p     // Catch:{ Exception -> 0x0200 }
            if (r8 != 0) goto L_0x05a2
            android.content.Intent r8 = r1.f61161m     // Catch:{ Exception -> 0x0200 }
            android.content.Intent r9 = r1.f61162n     // Catch:{ Exception -> 0x0200 }
            java.util.ArrayList<android.content.Intent> r10 = r1.f61160j     // Catch:{ Exception -> 0x0200 }
            android.content.Intent r11 = r22.getIntent()     // Catch:{ Exception -> 0x0200 }
            if (r11 == 0) goto L_0x04fb
            android.content.Intent r11 = r22.getIntent()     // Catch:{ Exception -> 0x0200 }
            java.lang.String r12 = "rule_id"
            java.lang.String r11 = r11.getStringExtra(r12)     // Catch:{ Exception -> 0x0200 }
            goto L_0x04fd
        L_0x04fb:
            java.lang.String r11 = ""
        L_0x04fd:
            android.content.ComponentName r12 = r8.getComponent()     // Catch:{ Exception -> 0x0200 }
            java.lang.String r12 = r12.getClassName()     // Catch:{ Exception -> 0x0200 }
            java.lang.Class<com.ss.android.ugc.aweme.detail.ui.DetailActivity> r13 = com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity.class
            java.lang.String r13 = r13.getName()     // Catch:{ Exception -> 0x0200 }
            boolean r12 = android.text.TextUtils.equals(r12, r13)     // Catch:{ Exception -> 0x0200 }
            r1.f61158h = r12     // Catch:{ Exception -> 0x0200 }
            boolean r12 = r1.f61158h     // Catch:{ Exception -> 0x0200 }
            if (r12 == 0) goto L_0x0545
            com.bytedance.ies.abmock.b r16 = com.bytedance.ies.abmock.C10181b.m20511a()     // Catch:{ Exception -> 0x0200 }
            java.lang.Class<com.ss.android.ugc.aweme.detail.experiment.DetailEnterAnimationTimeExperiment> r17 = com.p683ss.android.ugc.aweme.detail.experiment.DetailEnterAnimationTimeExperiment.class
            r18 = 1
            java.lang.String r19 = "detail_animation_time"
            r20 = 31744(0x7c00, float:4.4483E-41)
            r21 = 0
            int r12 = r16.mo18168a(r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0200 }
            r13 = 2131034214(0x7f050066, float:1.767894E38)
            if (r12 != r3) goto L_0x0533
            r13 = 2131034161(0x7f050031, float:1.7678832E38)
            r12 = 2131034212(0x7f050064, float:1.7678935E38)
            goto L_0x0540
        L_0x0533:
            r14 = 2
            if (r12 != r14) goto L_0x053d
            r13 = 2131034162(0x7f050032, float:1.7678834E38)
            r12 = 2131034160(0x7f050030, float:1.767883E38)
            goto L_0x0540
        L_0x053d:
            r12 = 2131034214(0x7f050066, float:1.767894E38)
        L_0x0540:
            android.support.v4.app.c r12 = android.support.p030v4.app.C0643c.m1727a(r1, r13, r12)     // Catch:{ Exception -> 0x0200 }
            goto L_0x0546
        L_0x0545:
            r12 = r5
        L_0x0546:
            if (r12 == 0) goto L_0x054d
            android.os.Bundle r12 = r12.mo2171a()     // Catch:{ Exception -> 0x0200 }
            goto L_0x054e
        L_0x054d:
            r12 = r5
        L_0x054e:
            if (r9 == 0) goto L_0x0586
            int r0 = r10.size()     // Catch:{ Exception -> 0x0200 }
            if (r0 <= r3) goto L_0x055c
            java.lang.String r0 = "next_steps"
            r9.putExtra(r0, r10)     // Catch:{ Exception -> 0x0200 }
            goto L_0x0561
        L_0x055c:
            java.lang.String r0 = "next_step"
            r9.putExtra(r0, r8)     // Catch:{ Exception -> 0x0200 }
        L_0x0561:
            java.lang.String r0 = "rule_id"
            r9.putExtra(r0, r11)     // Catch:{ Exception -> 0x0200 }
            boolean r0 = m56213a()     // Catch:{ Exception -> 0x0200 }
            if (r0 == 0) goto L_0x0570
            r1.startActivity(r9, r12)     // Catch:{ Exception -> 0x0200 }
            goto L_0x05a2
        L_0x0570:
            r8 = 2
            android.content.Intent[] r0 = new android.content.Intent[r8]     // Catch:{ Exception -> 0x0200 }
            android.content.Intent r8 = com.p683ss.android.ugc.aweme.utils.p2387a.C47659c.m103160a(r22)     // Catch:{ Exception -> 0x0200 }
            r0[r2] = r8     // Catch:{ Exception -> 0x0200 }
            r8 = r0[r2]     // Catch:{ Exception -> 0x0200 }
            java.lang.String r10 = "rule_id"
            r8.putExtra(r10, r11)     // Catch:{ Exception -> 0x0200 }
            r0[r3] = r9     // Catch:{ Exception -> 0x0200 }
            android.support.p030v4.app.C0636b.m2095a(r1, r0, r12)     // Catch:{ Exception -> 0x0200 }
            goto L_0x05a2
        L_0x0586:
            int r9 = r10.size()     // Catch:{ Exception -> 0x0200 }
            if (r9 <= r3) goto L_0x059c
            int r0 = r10.size()     // Catch:{ Exception -> 0x0200 }
            android.content.Intent[] r0 = new android.content.Intent[r0]     // Catch:{ Exception -> 0x0200 }
            java.lang.Object[] r0 = r10.toArray(r0)     // Catch:{ Exception -> 0x0200 }
            android.content.Intent[] r0 = (android.content.Intent[]) r0     // Catch:{ Exception -> 0x0200 }
            android.support.p030v4.app.C0636b.m2095a(r1, r0, r12)     // Catch:{ Exception -> 0x0200 }
            goto L_0x05a2
        L_0x059c:
            m56210a(r8, r0)     // Catch:{ Exception -> 0x0200 }
            android.support.p030v4.app.C0636b.m2094a(r1, r8, r12)     // Catch:{ Exception -> 0x0200 }
        L_0x05a2:
            com.ss.android.ugc.aweme.app.k r0 = com.p683ss.android.ugc.aweme.app.C23111k.m56679a()     // Catch:{ Exception -> 0x0200 }
            r0.f61536a = r2     // Catch:{ Exception -> 0x0200 }
            android.net.Uri r0 = r1.f61152b     // Catch:{ Exception -> 0x0200 }
            java.util.ArrayList<java.lang.String> r8 = r1.f61159i     // Catch:{ Exception -> 0x0200 }
            java.lang.String r0 = m56209a(r0, r8)     // Catch:{ Exception -> 0x0200 }
            java.lang.String r8 = ""
            com.p683ss.android.ugc.aweme.util.C47638r.m103133a(r0, r3, r8)     // Catch:{ Exception -> 0x0200 }
            com.ss.android.ugc.aweme.app.g r0 = new com.ss.android.ugc.aweme.app.g     // Catch:{ Exception -> 0x0200 }
            r0.<init>()     // Catch:{ Exception -> 0x0200 }
            android.net.Uri r3 = r1.f61152b     // Catch:{ Exception -> 0x0200 }
            boolean r8 = r1.f61154d     // Catch:{ Exception -> 0x0200 }
            r0.mo47837a(r3, r8)     // Catch:{ Exception -> 0x0200 }
            goto L_0x05d1
        L_0x05c2:
            android.net.Uri r3 = r1.f61152b
            java.util.ArrayList<java.lang.String> r8 = r1.f61159i
            java.lang.String r3 = m56209a(r3, r8)
            java.lang.String r0 = r0.getMessage()
            com.p683ss.android.ugc.aweme.util.C47638r.m103133a(r3, r2, r0)
        L_0x05d1:
            com.ss.android.ugc.aweme.an.a r0 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            r0.mo46914a()
            com.ss.android.ugc.aweme.an.a r0 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            r0.mo46919b()
            boolean r0 = com.p683ss.android.ugc.aweme.language.C35837h.m80977b()
            if (r0 == 0) goto L_0x05e8
            com.p683ss.android.ugc.aweme.share.p2150b.C41992b.m91956a(r2)
        L_0x05e8:
            android.net.Uri r0 = r1.f61152b
            java.lang.String r3 = "appParam"
            java.lang.String r0 = r0.getQueryParameter(r3)
            if (r0 == 0) goto L_0x066a
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x05f8 }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x05f8 }
            goto L_0x05f9
        L_0x05f8:
            r3 = r5
        L_0x05f9:
            if (r3 == 0) goto L_0x066a
            java.lang.String r0 = "__type__"
            java.lang.String r0 = r3.optString(r0)
            java.lang.String r8 = "position"
            java.lang.String r8 = r3.optString(r8)
            java.lang.String r9 = "iid"
            java.lang.String r9 = r3.optString(r9)
            java.lang.String r10 = "wxshare_count"
            java.lang.String r10 = r3.optString(r10)
            java.lang.String r11 = "parent_group_id"
            java.lang.String r11 = r3.optString(r11)
            java.lang.String r12 = "webid"
            java.lang.String r3 = r3.optString(r12)
            com.ss.android.ugc.aweme.common.j r12 = new com.ss.android.ugc.aweme.common.j
            r12.<init>()
            java.lang.String r13 = "__type__"
            r12.mo54849a(r13, r0)
            java.lang.String r0 = "position"
            r12.mo54849a(r0, r8)
            java.lang.String r0 = "iid"
            r12.mo54849a(r0, r9)
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r10)
            if (r0 != 0) goto L_0x063e
            java.lang.String r0 = "wxshare_count"
            r12.mo54849a(r0, r10)
        L_0x063e:
            java.lang.String r0 = "parent_group_id"
            r12.mo54849a(r0, r11)
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r3)
            if (r0 != 0) goto L_0x064e
            java.lang.String r0 = "webid"
            r12.mo54849a(r0, r3)
        L_0x064e:
            com.ss.android.ugc.aweme.common.MobClick r0 = new com.ss.android.ugc.aweme.common.MobClick
            r0.<init>()
            java.lang.String r3 = "open_url"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r3)
            java.lang.String r3 = "scheme"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r3)
            org.json.JSONObject r3 = r12.mo54850a()
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r3)
            com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r0)
        L_0x066a:
            android.net.Uri r0 = r1.f61152b
            boolean r3 = r1.f61154d
            java.lang.String r8 = "label"
            java.lang.String r8 = r0.getQueryParameter(r8)
            java.lang.String r9 = "push_id"
            java.lang.String r9 = r0.getQueryParameter(r9)
            java.lang.String r10 = "gd_label"
            r0.getQueryParameter(r10)
            if (r8 != 0) goto L_0x0683
            if (r3 == 0) goto L_0x06e2
        L_0x0683:
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            java.lang.String r11 = r0.getLastPathSegment()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x0695
            java.lang.String r0 = "0"
            goto L_0x0699
        L_0x0695:
            java.lang.String r0 = r0.getLastPathSegment()
        L_0x0699:
            java.lang.String r11 = "network_type"
            android.content.Context r12 = r7.f61651a     // Catch:{ JSONException -> 0x06ac }
            com.ss.android.common.util.NetworkUtils$h r12 = com.p683ss.android.common.util.NetworkUtils.getNetworkType(r12)     // Catch:{ JSONException -> 0x06ac }
            java.lang.String r12 = com.p683ss.android.common.util.NetworkUtils.getNetworkAccessType(r12)     // Catch:{ JSONException -> 0x06ac }
            java.lang.String r12 = r12.toUpperCase()     // Catch:{ JSONException -> 0x06ac }
            r10.put(r11, r12)     // Catch:{ JSONException -> 0x06ac }
        L_0x06ac:
            com.ss.android.ugc.aweme.common.MobClick r11 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()     // Catch:{ Exception -> 0x06dd }
            java.lang.String r12 = "push"
            com.ss.android.ugc.aweme.common.MobClick r11 = r11.setEventName(r12)     // Catch:{ Exception -> 0x06dd }
            if (r8 != 0) goto L_0x06ba
            java.lang.String r8 = ""
        L_0x06ba:
            com.ss.android.ugc.aweme.common.MobClick r8 = r11.setLabelName(r8)     // Catch:{ Exception -> 0x06dd }
            if (r9 != 0) goto L_0x06c3
            java.lang.String r11 = ""
            goto L_0x06c4
        L_0x06c3:
            r11 = r9
        L_0x06c4:
            com.ss.android.ugc.aweme.common.MobClick r8 = r8.setValue(r11)     // Catch:{ Exception -> 0x06dd }
            boolean r11 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x06dd }
            if (r11 == 0) goto L_0x06d1
            java.lang.String r11 = "0"
            goto L_0x06d2
        L_0x06d1:
            r11 = r0
        L_0x06d2:
            com.ss.android.ugc.aweme.common.MobClick r8 = r8.setExtValueString(r11)     // Catch:{ Exception -> 0x06dd }
            com.ss.android.ugc.aweme.common.MobClick r8 = r8.setJsonObject(r10)     // Catch:{ Exception -> 0x06dd }
            com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r8)     // Catch:{ Exception -> 0x06dd }
        L_0x06dd:
            android.content.Intent r8 = r7.f61652b
            com.p683ss.android.ugc.aweme.app.C22920ab.m56372a(r3, r9, r0, r10, r8)
        L_0x06e2:
            com.ss.android.ugc.aweme.an.a r0 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            long r8 = r0.f60707h
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r8
            java.lang.String r0 = "aweme_app_performance"
            java.lang.String r3 = "main_page_time"
            float r8 = (float) r10
            com.p683ss.android.ugc.aweme.app.C23131p.m57778a(r0, r3, r8)
            java.lang.String r0 = "user_id"
            java.lang.String r0 = r4.getStringExtra(r0)
            if (r0 == 0) goto L_0x0706
            com.ss.android.ugc.aweme.app.f.e r0 = r1.f61151a
            java.lang.String r3 = "user_id"
            java.lang.String r3 = r4.getStringExtra(r3)
            goto L_0x0731
        L_0x0706:
            if (r6 == 0) goto L_0x0734
            java.lang.String r0 = "params_url"
            java.lang.String r0 = r6.getQueryParameter(r0)
            if (r0 == 0) goto L_0x0734
            com.ss.android.ugc.aweme.app.f.e r0 = r1.f61151a
            java.lang.String r3 = "params_url"
            java.lang.String r3 = r6.getQueryParameter(r3)
            java.lang.String r3 = java.net.URLDecoder.decode(r3)
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r4 = "user_id"
            java.lang.String r4 = r3.getQueryParameter(r4)
            if (r4 != 0) goto L_0x072b
            java.lang.String r3 = ""
            goto L_0x0731
        L_0x072b:
            java.lang.String r4 = "user_id"
            java.lang.String r3 = r3.getQueryParameter(r4)
        L_0x0731:
            r0.mo47836d(r3)
        L_0x0734:
            android.net.Uri r0 = r1.f61152b
            com.ss.android.ugc.aweme.app.f.e r3 = r1.f61151a
            boolean r4 = r1.f61154d
            android.content.Context r4 = r7.f61651a
            com.ss.android.e.b r4 = com.p683ss.android.p1162e.C19140b.m46665a(r4)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r6 = "launch_method"
            java.lang.String r8 = r3.f61494a
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r6, r8)
            java.lang.String r6 = "page_source"
            java.lang.String r8 = r3.f61495b
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r6, r8)
            java.lang.String r6 = "enter_to"
            java.lang.String r8 = r3.f61496c
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r6, r8)
            java.lang.String r6 = "platform"
            java.lang.String r8 = r3.f61497d
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r6, r8)
            java.lang.String r6 = "from_user_id"
            java.lang.String r8 = r3.f61498e
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r6, r8)
            java.lang.String r3 = r3.f61496c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x077b
            java.lang.String r3 = "needlaunchlog"
            java.lang.String r6 = "true"
            r0.appendQueryParameter(r3, r6)
        L_0x077b:
            android.net.Uri r0 = r0.build()
            r4.mo39082a(r0)
            android.net.Uri r0 = r1.f61152b
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = com.p683ss.android.ugc.aweme.commercialize.p1549b.C25652a.C25653a.f67876a
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L_0x0798
            com.ss.android.ugc.aweme.app.aa r3 = new com.ss.android.ugc.aweme.app.aa
            r3.<init>(r7, r0)
            p001a.C0013i.m16a(r3)
        L_0x0798:
            if (r0 != 0) goto L_0x079b
            goto L_0x07b7
        L_0x079b:
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "uri.toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.String r4 = com.p683ss.android.ugc.aweme.commercialize.utils.p1581b.C26411a.f69663a
            r6 = 2
            boolean r3 = p2628d.p2650m.C52830p.m112411b(r3, r4, r2, r6, r5)
            if (r3 == 0) goto L_0x07b7
            com.ss.android.ugc.aweme.commercialize.utils.b.a$a r3 = new com.ss.android.ugc.aweme.commercialize.utils.b.a$a
            r3.<init>(r0)
            java.util.concurrent.Callable r3 = (java.util.concurrent.Callable) r3
            p001a.C0013i.m16a(r3)
        L_0x07b7:
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService.getBridgeService_Monster()
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = (com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService) r0
            android.net.Uri r3 = r1.f61152b
            r0.initMiniAppInDeeplink(r1, r3)
            com.p683ss.android.ugc.aweme.app.C23041b.m56556a(r2)
            java.lang.String r0 = "com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity"
            java.lang.String r3 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.app.DeepLinkHandlerActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo41130a(int i, int i2) {
        if (!this.f61158h) {
            super.mo41130a(i, i2);
        }
    }

    /* renamed from: a */
    private void m56211a(String str, final Bundle bundle) {
        MultiAccountViewModel.m90021a(str, bundle, new C13003d() {
            public final /* synthetic */ void onSuccess(C12990b bVar) {
                C13017f fVar = (C13017f) bVar;
                C26890h.m65011a("switch_account_result", C23089d.m56640a().mo47826a("status", 1).f61491a);
            }

            public final /* synthetic */ void onError(C12990b bVar, int i) {
                Activity activity;
                C13017f fVar = (C13017f) bVar;
                if (!DeepLinkHandlerActivity.m56213a()) {
                    C27967h.m66729a(bundle);
                    return;
                }
                if (AwemeAppData.m47851a() != null) {
                    activity = C11016e.m22312g();
                } else {
                    activity = null;
                }
                if (activity != null) {
                    C10691a.m21542b((Context) activity, (int) R.string.azh).mo19066a();
                }
                C26890h.m65011a("switch_account_result", C23089d.m56640a().mo47826a("status", 0).mo47826a("fail_info", i).f61491a);
            }
        });
    }

    /* renamed from: a */
    private static String m56209a(Uri uri, ArrayList<String> arrayList) {
        if (uri != null) {
            return uri.toString();
        }
        if (!C9376b.m18558a((Collection<T>) arrayList)) {
            return arrayList.toString();
        }
        return "";
    }

    /* renamed from: a */
    private static void m56210a(Intent intent, Intent intent2) {
        boolean z;
        try {
            z = C32816h.m75716b().getEnableParamsOverrideDeeplinkhandleractivity().booleanValue();
        } catch (C10174a unused) {
            z = false;
        }
        if (z) {
            Uri data = intent2.getData();
            if (data != null && data.isHierarchical() && !intent.getBooleanExtra("safeTemplate", false)) {
                for (String str : data.getQueryParameterNames()) {
                    intent.putExtra(str, data.getQueryParameter(str));
                }
            }
        }
    }

    /* renamed from: b */
    private void m56214b(boolean z, Intent intent) {
        Uri uri;
        String str;
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        if (uri != null) {
            str = uri.getQueryParameter("multi_account_push_uid");
        } else {
            str = null;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("push_intent", intent);
        bundle.putBoolean("mFromNotification", this.f61154d);
        bundle.putBoolean("cancelRestoreOnMain", true);
        if (z) {
            bundle.putBoolean("switch_jump", true);
            m56211a(str, bundle);
            return;
        }
        Intent intent2 = new Intent(C32463a.m75161a(), PushLoginActivity.class);
        intent2.putExtra("multi_account_push_uid", str);
        intent2.putExtra("multi_account", bundle);
        if (m56213a()) {
            startActivity(intent2);
            return;
        }
        C0636b.m2095a((Context) this, new Intent[]{C47659c.m103160a(this), intent2}, (Bundle) null);
    }

    /* renamed from: a */
    private void m56212a(boolean z, Intent intent) {
        Activity previousActivity = ActivityStack.getPreviousActivity();
        if (previousActivity != null) {
            String canonicalName = previousActivity.getClass().getCanonicalName();
            ArrayList arrayList = new ArrayList();
            arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
            arrayList.add("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity");
            arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity");
            if (arrayList.contains(canonicalName) || (previousActivity instanceof C48038j)) {
                Builder builder = new Builder(previousActivity, R.style.s8);
                builder.setMessage(R.string.d1y);
                builder.setNegativeButton(R.string.wf, C23186x.f61647a);
                builder.setPositiveButton(R.string.ah2, new C23187y(this, z, intent));
                AlertDialog create = builder.create();
                create.setCanceledOnTouchOutside(false);
                create.setCancelable(false);
                try {
                    create.show();
                } catch (Exception unused) {
                }
                arrayList.clear();
                return;
            }
            arrayList.clear();
        }
        m56214b(z, intent);
    }

    /* renamed from: a */
    public Intent mo47293a(Uri uri, boolean z, boolean z2) {
        boolean z3;
        String str;
        String str2;
        String scheme = uri.getScheme();
        Intent intent = null;
        if (scheme == null) {
            return null;
        }
        String host = uri.getHost();
        if (host == null) {
            return null;
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        String str3 = path;
        String stringExtra = getIntent().getStringExtra("from_token");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "";
        }
        String str4 = stringExtra;
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("from_token", str4);
        if (TextUtils.isEmpty(uri.getQueryParameter("enter_from"))) {
            if (TextUtils.equals("token", getIntent().getStringExtra("enter_from"))) {
                buildUpon.appendQueryParameter("enter_from", "token");
            } else {
                String str5 = "enter_from";
                if (this.f61154d) {
                    str2 = "push";
                } else {
                    str2 = "deeplink";
                }
                buildUpon.appendQueryParameter(str5, str2);
            }
        }
        Uri build = buildUpon.build();
        List deeplinkCommands = I18nBridgeService.getBridgeService_Monster().getDeeplinkCommands();
        if (!TextUtils.equals(build.getQueryParameter("gd_label"), "retarget") || C10181b.m20511a().mo18168a(DeeplinkRetargetExperiment.class, true, "deeplink_retarget_enable", 31744, 0) != 1) {
            Iterator it = deeplinkCommands.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = false;
                    break;
                }
                C22863g gVar = (C22863g) it.next();
                C52711k.m112240b(build, "uri");
                C52711k.m112240b(scheme, "scheme");
                C52711k.m112240b(host, "host");
                C52711k.m112240b(str3, LeakCanaryFileProvider.f132050j);
                if (gVar.mo47678a(scheme, host, str3)) {
                    this.f61151a.mo47835c(gVar.mo47674a(build));
                    intent = gVar.mo47679a(this, build, host, str3, str4, this.f61154d, z);
                    if (intent == null) {
                        gVar.mo47676a((Activity) this, build, this.f61154d);
                    }
                    if (!TextUtils.isEmpty(gVar.mo47677a())) {
                        C22835a.m56224a(build, gVar.mo47677a());
                    } else if (intent != null) {
                        C22835a.m56224a(build, intent.getComponent().getClassName());
                    }
                    z3 = true;
                }
            }
            if (!z3) {
                intent = SmartRouter.buildRoute((Context) this, build.toString()).withParam("is_from_push", this.f61154d).withParam("token_request_id", getIntent().getStringExtra("token_request_id")).buildIntent("push");
                if (intent != null) {
                    C23093e eVar = this.f61151a;
                    if (build.getHost() != null) {
                        str = build.getHost();
                    } else {
                        str = "";
                    }
                    eVar.mo47835c(str);
                    z3 = true;
                }
            }
            if (intent != null && !m56213a() && !intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB")) {
                String a = C36640eh.m82544a(build.getQueryParameter("tab_index"));
                if ((!"aweme".equals(host) || !"click_push_newvideo".equals(build.getQueryParameter("gd_label")) || !TextUtils.equals(a, "DISCOVER")) && !TextUtils.isEmpty(a)) {
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", a);
                }
                intent.putExtra("is_from_push", true);
            }
            if (intent != null) {
                String queryParameter = build.getQueryParameter("backurl");
                if (!TextUtils.isEmpty(queryParameter)) {
                    intent.putExtra("backurl", queryParameter);
                }
            }
            C23111k.m56679a().f61536a = false;
            if (!(build == null || intent == null)) {
                String queryParameter2 = build.getQueryParameter("trigger_by");
                if (queryParameter2 != null) {
                    intent.putExtra("trigger_by", queryParameter2);
                }
            }
            if (!(intent == null || build.getQueryParameter("gd_label") == null || !build.getQueryParameter("gd_label").startsWith("click_wap"))) {
                intent.putExtra("ads_app_activity_by_wap_click", true);
            }
            if (!z3) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C23060d.f61428b, build.toString());
                    C23131p.m56692a("service_monitor", "no_matched_deep_link", jSONObject);
                } catch (Exception unused) {
                }
            }
            if (!z3 && z2) {
                this.f61155e = true;
                this.f61151a.mo47835c("default_homepage");
            }
            return intent;
        }
        this.f61155e = true;
        this.f61163o = true;
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo47302a(boolean z, Intent intent, DialogInterface dialogInterface, int i) {
        m56214b(z, intent);
    }
}
