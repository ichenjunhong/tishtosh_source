package com.p683ss.android.ugc.aweme.sec;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.p513c.C9282a;
import com.bytedance.p723j.C11511a;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.sec.captcha.C41472a;
import com.p683ss.android.ugc.aweme.sec.captcha.SecCaptcha;
import com.p683ss.android.ugc.aweme.sec.captcha.SecCaptcha.C41471c;
import com.p683ss.android.ugc.aweme.sec.p2128a.C41464a;
import com.p683ss.android.ugc.aweme.sec.p2129b.C41466a;
import com.p683ss.android.ugc.aweme.secapi.C41483a;
import com.p683ss.android.ugc.aweme.secapi.C41484b;
import com.p683ss.sys.ces.out.ISdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sec.a */
public final class C41462a {

    /* renamed from: a */
    static boolean f105096a;

    /* renamed from: b */
    static ISdk f105097b;

    /* renamed from: c */
    static SecCaptcha f105098c;

    /* renamed from: d */
    static C41464a f105099d;

    /* renamed from: e */
    public static final C41462a f105100e = new C41462a();

    /* renamed from: f */
    private static ArrayList<String> f105101f = new ArrayList<>();

    /* renamed from: g */
    private static String f105102g;

    /* renamed from: h */
    private static String f105103h;

    /* renamed from: i */
    private static String f105104i;

    /* renamed from: j */
    private static String f105105j;

    /* renamed from: k */
    private static boolean f105106k;

    /* renamed from: l */
    private static boolean f105107l;

    /* renamed from: com.ss.android.ugc.aweme.sec.a$a */
    static final class C41463a<TTaskResult, TContinuationResult> implements C0011g<Void, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C41484b f105108a;

        /* renamed from: b */
        final /* synthetic */ boolean f105109b;

        /* renamed from: c */
        final /* synthetic */ String f105110c;

        /* renamed from: d */
        final /* synthetic */ int f105111d;

        /* renamed from: e */
        final /* synthetic */ String f105112e;

        /* renamed from: f */
        final /* synthetic */ String f105113f;

        /* renamed from: g */
        final /* synthetic */ Context f105114g;

        C41463a(C41484b bVar, boolean z, String str, int i, String str2, String str3, Context context) {
            this.f105108a = bVar;
            this.f105109b = z;
            this.f105110c = str;
            this.f105111d = i;
            this.f105112e = str2;
            this.f105113f = str3;
            this.f105114g = context;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            String str;
            String str2;
            long currentTimeMillis = System.currentTimeMillis();
            String a = this.f105108a.mo77260a();
            if (a == null) {
                a = "";
            }
            String str3 = a;
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder("initSCCheckUtil getSessionTime = ");
            sb.append(currentTimeMillis2 - currentTimeMillis);
            C41466a.m91277a("SecCaptcha", sb.toString());
            long currentTimeMillis3 = System.currentTimeMillis();
            ISdk a2 = C41462a.m91271a();
            if (a2 != null) {
                a2.setSession(str3);
            }
            long currentTimeMillis4 = System.currentTimeMillis();
            StringBuilder sb2 = new StringBuilder("init setSessionTime = ");
            sb2.append(currentTimeMillis4 - currentTimeMillis3);
            C41466a.m91277a("DmtSec", sb2.toString());
            if (AppLog.getServerDeviceId() != null) {
                str = AppLog.getServerDeviceId();
            } else {
                str = "";
            }
            String str4 = str;
            if (AppLog.getInstallId() != null) {
                str2 = AppLog.getInstallId();
            } else {
                str2 = "";
            }
            String str5 = str2;
            if (this.f105109b) {
                String str6 = SecApiImpl.TAG;
                StringBuilder sb3 = new StringBuilder("initCaptchaParams:did = ");
                sb3.append(str4);
                sb3.append("  iid = ");
                sb3.append(str5);
                sb3.append("  sid = ");
                sb3.append(str3);
                C32458a.m75141a(4, str6, sb3.toString());
                String str7 = this.f105110c;
                int i = this.f105111d;
                String str8 = this.f105112e;
                C52711k.m112236a((Object) str5, "iid");
                C52711k.m112236a((Object) str4, "did");
                C41472a aVar = new C41472a(str7, i, str8, str5, str4, this.f105113f, str3, 0, 128, null);
                long currentTimeMillis5 = System.currentTimeMillis();
                C41462a aVar2 = C41462a.f105100e;
                Context applicationContext = this.f105114g.getApplicationContext();
                C52711k.m112236a((Object) applicationContext, "context.applicationContext");
                C41462a.f105098c = new SecCaptcha(applicationContext, aVar, this.f105108a);
                long currentTimeMillis6 = System.currentTimeMillis();
                StringBuilder sb4 = new StringBuilder("init createSecCaptchaTime = ");
                sb4.append(currentTimeMillis6 - currentTimeMillis5);
                C41466a.m91277a("DmtSec", sb4.toString());
            }
            C41462a aVar3 = C41462a.f105100e;
            C41462a.f105096a = true;
            C32458a.m75141a(4, SecApiImpl.TAG, "secInitSuccessFlag");
            C41462a.m91275b();
            return C52860x.f131107a;
        }
    }

    private C41462a() {
    }

    /* renamed from: a */
    public static ISdk m91271a() {
        return f105097b;
    }

    static {
        C11511a.m23578a("cms");
    }

    /* renamed from: b */
    public static final void m91275b() {
        if (f105106k || f105107l) {
            String str = f105102g;
            if (str == null) {
                C52711k.m112237a("currentDid");
            }
            String str2 = f105103h;
            if (str2 == null) {
                C52711k.m112237a("currentIid");
            }
            if (f105106k) {
                str = f105104i;
                if (str == null) {
                    C52711k.m112237a("targetDid");
                }
                f105106k = false;
            }
            if (f105107l) {
                str2 = f105105j;
                if (str2 == null) {
                    C52711k.m112237a("targetIid");
                }
                f105107l = false;
            }
            m91274a(str, str2);
        }
        synchronized (f105100e) {
            ArrayList<String> arrayList = f105101f;
            if (!(!f105101f.isEmpty())) {
                arrayList = null;
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    C52711k.m112236a((Object) str3, "report");
                    m91273a(str3);
                }
            }
        }
    }

    /* renamed from: a */
    public static final synchronized void m91273a(String str) {
        synchronized (C41462a.class) {
            C52711k.m112240b(str, "scene");
            StringBuilder sb = new StringBuilder("report .... scene = ");
            sb.append(str);
            sb.append(", initSuccess = ");
            sb.append(f105096a);
            C41466a.m91277a("DmtSec", sb.toString());
            if (f105096a) {
                long currentTimeMillis = System.currentTimeMillis();
                C41464a aVar = f105099d;
                if (aVar == null) {
                    C52711k.m112237a("report");
                }
                C52711k.m112240b(str, "scene");
                C52711k.m112240b(aVar, "report");
                C52711k.m112240b(str, "scene");
                StringBuilder sb2 = new StringBuilder("report .... scene = ");
                sb2.append(str);
                C41466a.m91277a("DataReport", sb2.toString());
                ISdk iSdk = aVar.f105115a;
                if (iSdk != null) {
                    iSdk.reportNow(str);
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                StringBuilder sb3 = new StringBuilder("report time = ");
                sb3.append(currentTimeMillis2 - currentTimeMillis);
                C41466a.m91277a("DmtSec", sb3.toString());
                return;
            }
            f105101f.add(str);
        }
    }

    /* renamed from: a */
    public static final void m91274a(String str, String str2) {
        C52711k.m112240b(str, "deviceId");
        C52711k.m112240b(str2, "iid");
        if (f105096a) {
            f105102g = str;
            f105103h = str2;
            long currentTimeMillis = System.currentTimeMillis();
            ISdk iSdk = f105097b;
            if (iSdk != null) {
                iSdk.setParams(str, str2);
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder("updateDeviceIdAndInstallId setParamsTime = ");
            sb.append(currentTimeMillis2 - currentTimeMillis);
            sb.append(", deviceId = ");
            sb.append(str);
            sb.append(", iid = ");
            sb.append(str2);
            C41466a.m91277a("DmtSec", sb.toString());
            SecCaptcha secCaptcha = f105098c;
            if (secCaptcha == null) {
                C52711k.m112237a("captcha");
            }
            secCaptcha.mo84214a(str, str2);
            return;
        }
        f105105j = str2;
        f105104i = str;
        f105107l = true;
        f105106k = true;
    }

    /* renamed from: a */
    public static final void m91272a(int i, Activity activity, C41483a aVar) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(aVar, "listener");
        if (f105096a) {
            long currentTimeMillis = System.currentTimeMillis();
            SecCaptcha secCaptcha = f105098c;
            if (secCaptcha == null) {
                C52711k.m112237a("captcha");
            }
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(aVar, "listener");
            if (TextUtils.isEmpty(secCaptcha.f105129h.f105138d) && AppLog.getInstallId() != null) {
                C41472a aVar2 = secCaptcha.f105129h;
                String installId = AppLog.getInstallId();
                C52711k.m112236a((Object) installId, "AppLog.getInstallId()");
                aVar2.mo84217a(installId);
                secCaptcha.mo84214a(secCaptcha.f105129h.f105139e, secCaptcha.f105129h.f105138d);
            }
            if (activity.isFinishing()) {
                C32458a.m75141a(4, SecApiImpl.TAG, "popCaptcha-activity-finishing");
            } else {
                secCaptcha.f105124c = new WeakReference<>(activity);
                secCaptcha.f105125d = aVar;
                activity.runOnUiThread(new C41471c(secCaptcha, activity));
                secCaptcha.mo84213a().mo16889a(i);
                String str = secCaptcha.f105127f;
                String b = secCaptcha.f105130i.mo77261b();
                if (b == null) {
                    b = "";
                }
                if (!C52711k.m112239a((Object) str, (Object) b)) {
                    String b2 = secCaptcha.f105130i.mo77261b();
                    if (b2 == null) {
                        b2 = "";
                    }
                    secCaptcha.f105127f = b2;
                    String a = secCaptcha.f105130i.mo77260a();
                    if (a == null) {
                        a = "";
                    }
                    secCaptcha.f105126e = a;
                }
                secCaptcha.mo84213a().mo16892b(secCaptcha.f105129h.f105139e);
                secCaptcha.mo84213a().mo16891a(secCaptcha.f105129h.f105138d);
                secCaptcha.mo84213a().mo16893c(secCaptcha.f105127f);
                secCaptcha.mo84213a().mo16894d(secCaptcha.f105126e);
                String c = secCaptcha.f105130i.mo77262c();
                if (c != null) {
                    secCaptcha.mo84213a().mo16895e(c);
                }
                secCaptcha.f105123b = C9282a.m18401a().mo16870a(secCaptcha.mo84213a());
                if (secCaptcha.f105123b != null) {
                    C9282a.m18402a(false);
                }
                C9282a aVar3 = secCaptcha.f105123b;
                if (aVar3 != null) {
                    aVar3.mo16871a(activity, 2, secCaptcha);
                }
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder("popCaptcha time = ");
            sb.append(currentTimeMillis2 - currentTimeMillis);
            C41466a.m91277a("DmtSec", sb.toString());
        }
    }
}
