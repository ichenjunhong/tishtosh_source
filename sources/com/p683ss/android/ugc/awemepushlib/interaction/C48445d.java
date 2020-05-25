package com.p683ss.android.ugc.awemepushlib.interaction;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.p525e.C9402b;
import com.bytedance.common.utility.p526f.C9409b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.common.push.account.C10622a.C10624a;
import com.bytedance.ies.common.push.p660a.C10620a;
import com.bytedance.ies.ugc.aweme.ttsetting.C11036a;
import com.bytedance.ies.ugc.aweme.ttsetting.C11043b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.ies.ugc.statisticlogger.config.C11055b;
import com.bytedance.ies.ugc.statisticlogger.config.C11059c;
import com.bytedance.keva.Keva;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.message.C19481h;
import com.p683ss.android.newmedia.redbadge.C19611h;
import com.p683ss.android.newmedia.redbadge.p1200b.C19598a;
import com.p683ss.android.push.window.oppo.C19645c;
import com.p683ss.android.pushmanager.C19700f;
import com.p683ss.android.pushmanager.client.C19697g;
import com.p683ss.android.pushmanager.client.MessageAppManager;
import com.p683ss.android.pushmanager.p1205b.C19672a;
import com.p683ss.android.pushmanager.setting.C19710b;
import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.android.ugc.awemepushapi.AccountExperiment;
import com.p683ss.android.ugc.awemepushapi.C48426a;
import com.p683ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager;
import com.p683ss.android.ugc.awemepushlib.manager.C48479a;
import com.p683ss.android.ugc.awemepushlib.manager.C48480b;
import com.p683ss.android.ugc.awemepushlib.p2407b.C48430a;
import com.p683ss.android.ugc.awemepushlib.p2408c.C48432a;
import com.p683ss.android.ugc.awemepushlib.p2409di.C48435a;
import com.p683ss.android.ugc.awemepushlib.p2409di.C48436b;
import com.p683ss.android.ugc.awemepushlib.p2409di.C48438c;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1715j;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.d */
public class C48445d {

    /* renamed from: a */
    static volatile boolean f121812a = false;

    /* renamed from: b */
    public static volatile int f121813b = 0;

    /* renamed from: c */
    static Deque<Runnable> f121814c = new LinkedList();

    /* renamed from: d */
    private static String f121815d = "is_allow_oppo_push";

    /* renamed from: e */
    private static String f121816e = "ab_repo_cold_boot";

    /* renamed from: f */
    private static String f121817f = "enable_push_initialize_optimize";

    /* renamed from: g */
    private static volatile boolean f121818g;

    /* renamed from: h */
    private static ExecutorService f121819h = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49847a());

    /* renamed from: i */
    private static C48435a f121820i;

    /* renamed from: j */
    private static C48436b f121821j;

    /* renamed from: k */
    private static volatile int f121822k = 0;

    /* renamed from: a */
    public static C48435a m104842a() {
        if (f121820i == null) {
            f121820i = new C48435a();
        }
        return f121820i;
    }

    /* renamed from: b */
    public static C48436b m104850b() {
        if (f121821j == null) {
            f121821j = new C48436b();
        }
        return f121821j;
    }

    /* renamed from: e */
    private static void m104858e() {
        MessageAppManager.inst().setMonitorImpl(new C19672a() {
            /* renamed from: a */
            public final void mo41021a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
                C9951d.m19999a(str, jSONObject, jSONObject2, jSONObject3);
            }
        });
    }

    /* renamed from: f */
    private static void m104859f() {
        C19645c.m48007a(C11010c.m22280a(), m104850b());
    }

    /* renamed from: d */
    public static void m104856d() {
        if (!f121818g) {
            synchronized (C48445d.class) {
                if (!f121818g) {
                    m104860g();
                    f121818g = true;
                }
            }
        }
    }

    /* renamed from: c */
    static void m104854c() {
        if (!f121812a && f121822k != 0) {
            while (f121814c.size() > 0) {
                ((Runnable) f121814c.pop()).run();
            }
            f121812a = true;
        }
    }

    /* renamed from: g */
    private static void m104860g() {
        try {
            C9409b b = C9409b.m18608a(Class.forName("android.app.ActivityThread")).mo17054b("currentActivityThread");
            if (b != null) {
                Class cls = Class.forName("android.app.ActivityThread$H");
                C9409b a = C9409b.m18608a(Class.forName("android.app.ActivityThread$H"));
                int intValue = ((Integer) a.mo17051a("SCHEDULE_CRASH", (Class<?>[]) new Class[0]).f25654a).intValue();
                int intValue2 = ((Integer) a.mo17051a("RECEIVER", (Class<?>[]) new Class[0]).f25654a).intValue();
                int intValue3 = ((Integer) a.mo17051a("CREATE_SERVICE", (Class<?>[]) new Class[0]).f25654a).intValue();
                int intValue4 = ((Integer) a.mo17051a("BIND_SERVICE", (Class<?>[]) new Class[0]).f25654a).intValue();
                int intValue5 = ((Integer) a.mo17051a("SERVICE_ARGS", (Class<?>[]) new Class[0]).f25654a).intValue();
                Handler handler = (Handler) b.mo17051a("mH", (Class<?>[]) new Class[]{cls}).f25654a;
                if (handler != null) {
                    C9409b a2 = C9409b.m18609a((Object) handler);
                    C48467r rVar = new C48467r(intValue, intValue2, intValue3, intValue4, intValue5, (Callback) a2.mo17051a("mCallback", (Class<?>[]) new Class[]{Callback.class}).f25654a);
                    a2.mo17050a("mCallback", (Object) rVar);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    static void m104843a(int i) {
        f121822k = i;
        switch (i) {
            case 2:
            case 3:
                f121819h.execute(C48465p.f121839a);
                break;
            case 4:
                m104854c();
                return;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m104844a(Context context) {
        C48479a a = C48479a.m104895a();
        SharedPreferences a2 = C35807d.m80935a(context, "push_setting", 0);
        a.mo95942b(context);
        a.mo95945c();
        C19645c.m48006a(context).mo40965a(a2);
    }

    /* renamed from: b */
    private static void m104851b(Context context) {
        AccountManager accountManager = AccountManager.get(context);
        String packageName = context.getPackageName();
        String string = context.getString(context.getApplicationInfo().labelRes);
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(packageName)) {
            try {
                accountManager.removeAccount(new Account(string, packageName), null, null);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private static void m104853b(boolean z) {
        if (z) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() {
                public final void run() {
                    C48445d.m104856d();
                }
            });
            f121819h.execute(new Runnable() {
                public final void run() {
                    C48445d.m104856d();
                }
            });
            return;
        }
        m104860g();
    }

    /* renamed from: a */
    public static void m104847a(Runnable runnable) {
        f121819h.execute(new C48464o(runnable));
    }

    /* renamed from: a */
    private static boolean m104849a(boolean z) {
        if (!z) {
            return false;
        }
        Keva repo = Keva.getRepo(f121816e);
        if (repo == null || !repo.getBoolean(f121817f, false)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static void m104852b(final Context context, boolean z) {
        if (z) {
            f121819h.execute(new Runnable() {
                public final void run() {
                    C19697g.m48105a();
                    C19697g.m48107a(context, true);
                }
            });
            return;
        }
        C19697g.m48105a();
        C19697g.m48107a(context, true);
    }

    /* renamed from: c */
    private static void m104855c(Context context, boolean z) {
        if (!z) {
            C48479a.m104895a().mo95936a(C23859b.m58575b().mo49472b(context, f121815d, true));
        }
    }

    /* renamed from: d */
    private static void m104857d(final Context context, boolean z) {
        if (z) {
            f121819h.execute(new Runnable() {
                public final void run() {
                    AccountService.createIAccountServicebyMonsterPlugin().addLoginOrLogoutListener(new C48469t(context));
                }
            });
        } else {
            AccountService.createIAccountServicebyMonsterPlugin().addLoginOrLogoutListener(new C48466q(context));
        }
    }

    /* renamed from: a */
    public static void m104845a(Context context, boolean z) {
        if (C10181b.m20511a().mo18168a(AccountExperiment.class, false, "account_service_type", 31744, 3) == 1) {
            m104851b(context);
            return;
        }
        if (C10181b.m20511a().mo18168a(AccountExperiment.class, false, "account_service_type", 31744, 3) == 2) {
            if (z) {
                new C10624a(context).mo18853a().mo18852a();
            }
        } else if (C10181b.m20511a().mo18168a(AccountExperiment.class, false, "account_service_type", 31744, 3) != 3) {
            new C10624a(context).mo18853a().mo18852a();
        } else if (z) {
            new C10624a(context).mo18853a().mo18852a();
        } else {
            m104851b(context);
        }
    }

    /* renamed from: a */
    public static void m104846a(final Context context, final boolean z, C48426a aVar, boolean z2) {
        f121814c.addFirst(new Runnable() {
            public final void run() {
                try {
                    boolean z = z;
                    Context context = context;
                    C19481h.m47692a(context, 2);
                    MessageAppManager.inst().initOnApplication(context, new C48438c(), C18920g.m46051b(context));
                    if (z) {
                        C19697g.m48105a();
                        C19697g.m48108b(context, C48479a.m104895a().mo95940a(context));
                        if (VERSION.SDK_INT >= 24) {
                            try {
                                C19710b.m48173a().f54262b.mo41080a().mo41075a("allow_push_daemon_monitor", false).mo41076a();
                            } catch (Exception unused) {
                            }
                        }
                    }
                } catch (Throwable th) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("location", "constructInitPush");
                        jSONObject.put("errorDesc", th.getMessage());
                        C48444c.m104841a("aweme_nofatal_track", jSONObject);
                    } catch (JSONException unused2) {
                    }
                }
            }
        });
        C48470u.m104868a();
        C48441a.m104826a(aVar);
        C19700f.m48126a(m104842a());
        C10620a.f28146a.f28147b = new C48430a();
        MessageAppManager.inst().initPushSetting(context);
        MessageAppManager.inst().setDebuggable(false);
        boolean a = m104849a(z);
        if (z) {
            m104852b(context, a);
            C48479a.m104895a().mo95951f(context);
            m104859f();
            m104855c(context, a);
            AwemeRedBadgerManager.m104871a().mo95928b();
            C11016e.m22304b().mo6545f(C48454e.f121828a);
            C11016e.m22308c().mo6545f(C48455f.f121829a);
            C11016e.m22310e().mo6545f(C48460k.f121834a);
            C11036a.m22354a((C11043b) new C11043b() {
                /* renamed from: a */
                public final void mo19949a(Throwable th) {
                }

                /* renamed from: a */
                public final void mo19950a(JSONObject jSONObject) {
                    C48445d.m104847a((Runnable) new C48468s(jSONObject, context));
                }

                /* renamed from: a */
                static final /* synthetic */ void m104861a(JSONObject jSONObject, Context context) {
                    int i;
                    boolean z;
                    System.out.println();
                    C48479a a = C48479a.m104895a();
                    a.mo95950f();
                    Editor c = a.mo95944c(context);
                    if (c != null) {
                        C19645c.m48006a(context).mo40964a(c);
                        C9402b.m18594a(c);
                    }
                    C48479a.m104895a();
                    if (jSONObject != null) {
                        int optInt = jSONObject.optInt("allow_settings_notify_enable", C48479a.m104895a().f121877b ? 1 : 0);
                        if (optInt != C48479a.m104895a().f121886k && optInt >= 0) {
                            C48479a.m104895a().f121886k = C48479a.m104895a().f121886k;
                            boolean e = C48479a.m104895a().mo95949e(context);
                            C48479a.m104895a().mo95951f(context);
                            C19697g.m48105a();
                            boolean o = C19710b.m48173a().mo41105o();
                            C19710b.m48173a().f54262b.mo41080a().mo41075a("allow_settings_notify_enable", e).mo41076a();
                            if (!o && e) {
                                MessageAppManager.inst().registerAllThirdPush(context);
                                MessageAppManager.inst().registerSelfPush(context);
                            }
                            if (e && C48479a.m104895a().mo95940a(context)) {
                                Map a2 = C48444c.m104835a();
                                if (!C48432a.m104796a(a2)) {
                                    C48432a.m104792a((Runnable) new C48480b(context, a2));
                                }
                            }
                            C19697g.m48105a();
                            C19697g.m48108b(context, C48479a.m104895a().mo95940a(context));
                        }
                        String str = "shut_push_on_stop_service";
                        boolean z2 = false;
                        if (C48479a.m104895a().mo95941b() == 1) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        int optInt2 = jSONObject.optInt(str, i);
                        if (optInt2 != C48479a.m104895a().f121888m && optInt2 >= 0) {
                            C48479a.m104895a().f121888m = optInt2;
                        }
                        int optInt3 = jSONObject.optInt("push_clear_switch", 1);
                        if (optInt3 != C48479a.m104895a().f121885j && optInt3 >= 0) {
                            C48479a.m104895a().f121885j = optInt3;
                        }
                        int optInt4 = jSONObject.optInt("allow_off_alive", 0);
                        if (optInt4 >= 0) {
                            C19710b a3 = C19710b.m48173a();
                            if (optInt4 > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            a3.mo41090a(z);
                        }
                        String optString = jSONObject.optString("uninstall_question_url", C48441a.m104825a().getDefaultUninstallQuestionUrl());
                        if (optString != null && !optString.equals(C48479a.m104895a().mo95946d())) {
                            C48479a.m104895a().f121876a = optString;
                        }
                        AwemeRedBadgerManager.m104871a();
                        boolean a4 = C19598a.m47924a(context).mo40841a();
                        String b = C19598a.m47924a(context).mo40842b();
                        if (jSONObject.optInt("is_desktop_red_badge_show", 0) > 0) {
                            z2 = true;
                        }
                        if (z2 != a4) {
                            C19598a.m47924a(context).f53996a.mo41080a().mo41075a("is_desktop_red_badge_show", z2).mo41076a();
                        }
                        String optString2 = jSONObject.optString("desktop_red_badge_args", "");
                        if (optString2 != null && !optString2.equals(b)) {
                            C19598a.m47924a(context).f53996a.mo41080a().mo41074a("desktop_red_badge_args", optString2).mo41076a();
                        }
                        if (!C19598a.m47924a(context).mo40841a() && C48445d.f121813b == 0) {
                            C19611h.m47955a().mo40865a(context);
                        }
                        C19645c a5 = C19645c.m48006a(context);
                        String optString3 = jSONObject.optString("tt_push_pop_window_rule", "");
                        if (optString3 != null && !optString3.equals(a5.f54120g)) {
                            a5.f54120g = optString3;
                        }
                        C19697g.m48105a();
                        C19697g.m48106a(context, C48479a.m104895a().mo95946d());
                        C19697g.m48105a();
                        C19697g.m48108b(context, C48479a.m104895a().mo95940a(context));
                    }
                }
            });
            C11055b.m22383a().mo6522a((C1715j<? super T>) new C1715j<C11059c>() {
                /* renamed from: a */
                public final /* synthetic */ boolean mo6207a(Object obj) throws Exception {
                    return C11059c.Local.equals((C11059c) obj);
                }
            }).mo6545f((C1710e<? super T>) new C48461l<Object>(context));
            m104857d(context, a);
            m104847a((Runnable) new C48462m(context));
            m104858e();
        }
        m104853b(a);
        if (z) {
            f121819h.execute(new C48463n(z2));
        } else {
            m104843a(4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bc, code lost:
        if (r5.contains("com.adm") == false) goto L_0x00c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ boolean m104848a(int r5, int r6, int r7, int r8, int r9, android.os.Handler.Callback r10, android.os.Message r11) {
        /*
            r0 = 0
            if (r11 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r11.what
            java.lang.Object r2 = r11.obj
            r3 = 1
            if (r1 != r5) goto L_0x0034
            int r5 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r5 >= r1) goto L_0x0034
            boolean r5 = r2 instanceof java.lang.String
            if (r5 == 0) goto L_0x0034
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r5 = "Bad notification posted from package"
            boolean r5 = r2.contains(r5)
            if (r5 == 0) goto L_0x0034
            java.lang.String r5 = "type_badnotification_error"
            com.ss.android.ugc.aweme.app.f.c r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
            java.lang.String r4 = "message"
            com.ss.android.ugc.aweme.app.f.c r1 = r1.mo47824a(r4, r2)
            org.json.JSONObject r1 = r1.mo47825b()
            com.p683ss.android.ugc.awemepushlib.interaction.C48444c.m104841a(r5, r1)
            r5 = 1
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            if (r5 == 0) goto L_0x0038
            return r3
        L_0x0038:
            boolean r5 = f121812a
            if (r5 != 0) goto L_0x00c2
            if (r11 != 0) goto L_0x0040
            goto L_0x00c2
        L_0x0040:
            int r5 = r11.what
            if (r5 == r6) goto L_0x004a
            if (r5 == r7) goto L_0x004a
            if (r5 == r9) goto L_0x004a
            if (r5 != r8) goto L_0x00c2
        L_0x004a:
            java.lang.String r5 = r11.toString()     // Catch:{ Exception -> 0x00be }
            java.lang.String r6 = "com.xiaomi"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L_0x00be
            java.lang.String r6 = "com.taobao"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L_0x00be
            java.lang.String r6 = "org.android.agoo"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L_0x00be
            java.lang.String r6 = "com.aliyun"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L_0x00be
            java.lang.String r6 = "com.alibaba"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L_0x00be
            java.lang.String r6 = "com.umeng.message"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L_0x00be
            java.lang.String r6 = "com.huawei"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L_0x00be
            java.lang.String r6 = "com.coloros.mcssdk"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L_0x00be
            java.lang.String r6 = "com.meizu"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L_0x00be
            java.lang.String r6 = "com.vivo"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L_0x00be
            java.lang.String r6 = "com.ss.android.newmedia.message"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L_0x00be
            java.lang.String r6 = "com.amazon"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L_0x00be
            java.lang.String r6 = "com.fcm"
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L_0x00be
            java.lang.String r6 = "com.adm"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x00c2
        L_0x00be:
            r5 = 3
            m104843a(r5)
        L_0x00c2:
            if (r10 != 0) goto L_0x00c5
            return r0
        L_0x00c5:
            boolean r5 = r10.handleMessage(r11)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.awemepushlib.interaction.C48445d.m104848a(int, int, int, int, int, android.os.Handler$Callback, android.os.Message):boolean");
    }
}
