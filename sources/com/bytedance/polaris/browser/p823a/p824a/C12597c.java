package com.bytedance.polaris.browser.p823a.p824a;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p521a.C9369a;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.p502b.p503a.p504a.C9208a;
import com.bytedance.p502b.p503a.p504a.p505a.C9209a;
import com.bytedance.p502b.p503a.p504a.p505a.C9210b;
import com.bytedance.p502b.p503a.p504a.p505a.C9211c;
import com.bytedance.p502b.p503a.p504a.p505a.C9212d;
import com.bytedance.polaris.base.C12582d;
import com.bytedance.polaris.browser.PolarisBrowserActivity;
import com.bytedance.polaris.browser.p823a.C12608b;
import com.bytedance.polaris.browser.p823a.C12610d;
import com.bytedance.polaris.p821a.C12557c;
import com.bytedance.polaris.p821a.C12559e;
import com.bytedance.polaris.p821a.C12561g;
import com.bytedance.polaris.p821a.C12563i;
import com.bytedance.polaris.p826d.C12627c;
import com.bytedance.polaris.p826d.C12634f;
import com.bytedance.polaris.p826d.C12637g;
import com.bytedance.polaris.p826d.C12645k;
import com.bytedance.polaris.p826d.C12646l;
import com.bytedance.polaris.p826d.C12647m;
import com.bytedance.polaris.p826d.C12650p;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.browser.a.a.c */
public final class C12597c implements C9382a {

    /* renamed from: a */
    public boolean f33072a;

    /* renamed from: b */
    public final Map<String, C12608b> f33073b = new HashMap();

    /* renamed from: c */
    public C9208a f33074c = new C9208a();

    /* renamed from: d */
    private final C12598a f33075d;

    /* renamed from: e */
    private WeakReference<Activity> f33076e;

    /* renamed from: f */
    private Handler f33077f = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: com.bytedance.polaris.browser.a.a.c$a */
    public interface C12598a {
        /* renamed from: a */
        void mo23707a(String str, JSONObject jSONObject);

        /* renamed from: b */
        void mo23708b(String str, JSONObject jSONObject);
    }

    @C9209a(mo16570a = "openTreasureBox")
    public final void openTreasureBox() {
    }

    @C9209a(mo16570a = "signIn")
    public final void signIn() {
    }

    /* renamed from: a */
    private Context m25296a() {
        if (this.f33076e != null) {
            return (Activity) this.f33076e.get();
        }
        return null;
    }

    @C9209a(mo16570a = "taskSetting")
    public final void openSetting() {
        C12647m.onEventV3("task_setting_click");
        if (this.f33076e != null) {
            this.f33076e.get();
        }
        C12563i.m25221c();
    }

    @C9209a(mo16570a = "start_red_packet_activity")
    public final void startRedPacketActivity() {
        Activity j = C12563i.m25228j();
        if (j != null && !j.isFinishing() && VERSION.SDK_INT >= 17 && !j.isDestroyed()) {
        }
    }

    @C9209a(mo16570a = "close")
    private void closePage() {
        Activity activity;
        try {
            if (this.f33076e != null) {
                activity = (Activity) this.f33076e.get();
            } else {
                activity = null;
            }
            if (activity != null && (activity instanceof Activity)) {
                Activity activity2 = activity;
                if (activity2 instanceof PolarisBrowserActivity) {
                    boolean z = false;
                    if (VERSION.SDK_INT >= 17) {
                        z = activity2.isDestroyed();
                    }
                    if (!activity2.isFinishing() && !z) {
                        activity2.finish();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    @C9209a(mo16570a = "open_system_permission_setting")
    private void openSystemPermissionSettings() {
        try {
            if (C12646l.m25408a(C12563i.m25215a())) {
                C12599d.m25304a(Toast.makeText(C12563i.m25215a(), R.string.cv7, 1));
            } else {
                C12599d.m25304a(Toast.makeText(C12563i.m25215a(), R.string.cum, 1));
            }
        } catch (Throwable unused) {
        }
    }

    @C9209a(mo16570a = "open_notifi_setting")
    public final void openNotificationSetting() {
        Activity activity;
        if (this.f33076e != null) {
            activity = (Activity) this.f33076e.get();
        } else {
            activity = null;
        }
        if (activity != null) {
            Context applicationContext = activity.getApplicationContext();
            if (applicationContext != null && !C12645k.m25405b(applicationContext) && !C12645k.m25406c(applicationContext)) {
                C12645k.m25407d(applicationContext);
            }
        }
    }

    @C9209a(mo16570a = "update_task_list")
    public final void updateTaskList(@C9212d(mo16572a = "data") JSONObject jSONObject) {
        C12559e g = C12563i.m25225g();
        if (g != null) {
            g.mo23615a(jSONObject);
        }
    }

    @C9209a(mo16570a = "getVersion")
    public final boolean getPolarisVersion(@C9211c JSONObject jSONObject) {
        if (jSONObject == null) {
            return true;
        }
        try {
            jSONObject.put("polaris_version", "tt_2.0.0.62.alpha6");
            jSONObject.put("polaris_version_code", 203);
            jSONObject.put("host_version", C12563i.m25225g().mo23617b());
        } catch (Exception unused) {
        }
        return true;
    }

    @C9209a(mo16570a = "get_status_bar_height")
    public final boolean getStatusBarHeight(@C9211c JSONObject jSONObject) {
        try {
            jSONObject.put("height", C12637g.m25392a((Context) C12563i.m25215a(), false));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void handleMsg(Message message) {
        if (message != null && message.what == 14 && (message.obj instanceof JSONObject)) {
            m25297a(String.valueOf(message.arg2), message.arg1, (JSONObject) message.obj);
        }
    }

    @C9209a(mo16570a = "scanQrcode")
    public final void openScan(@C9210b String str) {
        try {
            C12563i.m25221c();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_plugin_install", 0);
            m25297a(str, 0, jSONObject);
        } catch (Exception unused) {
        }
    }

    @C9209a(mo16570a = "openThirdPage")
    public final void openThirdPage(@C9212d(mo16572a = "url") String str) {
        Activity activity;
        if (!C9431p.m18664a(str)) {
            if (this.f33076e == null) {
                activity = null;
            } else {
                activity = (Activity) this.f33076e.get();
            }
            C12557c c = C12563i.m25221c();
            if (c != null) {
                c.mo23603a((Context) activity, str);
            }
        }
    }

    @C9209a(mo16570a = "appCommonParams")
    public final boolean addCommonParams(@C9211c JSONObject jSONObject) {
        if (jSONObject == null) {
            return true;
        }
        HashMap hashMap = new HashMap();
        C12650p.m25422a((Map<String, String>) hashMap, false);
        try {
            for (Entry entry : hashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        } catch (JSONException unused) {
        }
        return true;
    }

    @C9209a(mo16570a = "checkClipboard")
    public final boolean checkClipboard(@C9211c JSONObject jSONObject) {
        Activity activity;
        if (this.f33076e != null) {
            activity = (Activity) this.f33076e.get();
        } else {
            activity = null;
        }
        String str = "";
        if (this.f33076e != null) {
            str = C12627c.f33187a.mo23730a(activity);
        }
        try {
            jSONObject.put("text", str);
        } catch (Exception unused) {
        }
        return true;
    }

    @C9209a(mo16570a = "feedbackVideo")
    public final void feedbackVideo(@C9212d(mo16572a = "group_id") String str) {
        Activity activity;
        C12557c c = C12563i.m25221c();
        if (this.f33076e == null) {
            activity = null;
        } else {
            activity = (Activity) this.f33076e.get();
        }
        if (c != null && activity != null) {
            StringBuilder sb = new StringBuilder("sslocal://detail?groupid=");
            sb.append(str);
            c.mo23603a((Context) activity, sb.toString());
        }
    }

    @C9209a(mo16570a = "is_notifi_enabled")
    public final boolean isNotificationEnabled(@C9211c JSONObject jSONObject) {
        Activity activity;
        int i;
        try {
            if (this.f33076e != null) {
                activity = (Activity) this.f33076e.get();
            } else {
                activity = null;
            }
            if (activity != null) {
                String str = "is_notifi_enabled";
                int a = C12645k.m25403a(activity.getApplicationContext());
                if (a == 0) {
                    i = 0;
                } else if (a == 1) {
                    i = 1;
                } else {
                    i = -1;
                }
                jSONObject.put(str, i);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @C9209a(mo16570a = "feedback")
    public final void openFeedback(@C9212d(mo16572a = "question_id") String str) {
        Context context;
        int i;
        C12557c c = C12563i.m25221c();
        if (this.f33076e == null) {
            context = null;
        } else {
            context = (Activity) this.f33076e.get();
        }
        if (context == null) {
            context = C12563i.m25215a();
        }
        if (c != null) {
            try {
                i = Integer.parseInt(str);
            } catch (Exception unused) {
                i = -1;
            }
            c.mo23601a(context, i);
        }
    }

    @C9209a(mo16570a = "openPage")
    public final void openPolarisPage(@C9212d(mo16572a = "url") String str) {
        Activity activity;
        if (!C9431p.m18664a(str)) {
            if (this.f33076e == null) {
                activity = null;
            } else {
                activity = (Activity) this.f33076e.get();
            }
            if (C12563i.m25218a(str)) {
                C12557c c = C12563i.m25221c();
                if (c != null) {
                    c.mo23605c(activity, str);
                }
                return;
            }
            C12557c c2 = C12563i.m25221c();
            if (c2 != null) {
                c2.mo23603a((Context) activity, str);
            }
        }
    }

    @C9209a(mo16570a = "pre_load_image_urls")
    public final void preloadImageUrls(@C9212d(mo16572a = "image_urls") JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() >= 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                    C12634f a = C12634f.m25386a();
                    a.mo23731a((List<String>) arrayList);
                    if (!a.f33205a) {
                        C9393e.submitRunnable(C12634f.f33203b);
                        a.f33205a = true;
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    @C9209a(mo16570a = "statusBar")
    public final boolean changeStatusBarColor(@C9212d(mo16572a = "color") String str) {
        try {
            Activity j = C12563i.m25228j();
            if (j == null || j.isFinishing()) {
                return false;
            }
            if (VERSION.SDK_INT >= 17 && j.isDestroyed()) {
                return false;
            }
            if (!(j instanceof PolarisBrowserActivity)) {
                C12559e g = C12563i.m25225g();
                if (g != null) {
                    g.mo23620e();
                }
                return false;
            }
            if ("white".equals(str)) {
                C12637g.m25393a(j.getWindow(), false);
            } else if ("black".equals(str)) {
                C12637g.m25393a(j.getWindow(), true);
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo23682b(String str, JSONObject jSONObject) {
        if (this.f33075d != null) {
            this.f33075d.mo23708b(str, jSONObject);
        }
    }

    @C9209a(mo16570a = "awardToast")
    public final void awardToast(@C9212d(mo16572a = "text") String str, @C9212d(mo16572a = "show_short") boolean z) {
        Activity activity;
        if (this.f33076e != null) {
            activity = (Activity) this.f33076e.get();
        } else {
            activity = null;
        }
        if (!TextUtils.isEmpty(str) && activity != null) {
            C12563i.m25221c();
        }
    }

    @C9209a(mo16570a = "copyToClipboard")
    public final boolean copyToClipboard(@C9212d(mo16572a = "content") String str, @C9211c JSONObject jSONObject) {
        int i;
        Context a = m25296a();
        if (a == null || C9431p.m18664a(str)) {
            i = 0;
        } else {
            C9369a.m18549a(a, "", str);
            i = 1;
        }
        try {
            jSONObject.put("code", i);
        } catch (JSONException unused) {
        }
        return true;
    }

    @C9209a(mo16570a = "get_ab_setting")
    public final boolean getABSetting(@C9212d(mo16572a = "ab_setting_key") String str, @C9211c JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            JSONObject jSONObject2 = C12582d.m25254a().f33025a;
            if (jSONObject2 == null) {
                return true;
            }
            Object opt = jSONObject2.opt(str);
            if (opt != null) {
                jSONObject.put(str, opt);
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    private void m25298a(String str, C12608b bVar) {
        if (!C9431p.m18664a(str)) {
            this.f33073b.put(str, bVar);
        }
    }

    @C9209a(mo16570a = "page_state_change")
    public final void pageStateChange(@C9212d(mo16572a = "type") String str, @C9212d(mo16572a = "status") int i) {
        if (!TextUtils.isEmpty(str)) {
            char c = 65535;
            if (str.hashCode() == 1508898352 && str.equals("task_action")) {
                c = 0;
            }
            if (c == 0 && i == 1) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", "1");
                    jSONObject.put("from_tab", this.f33072a);
                    mo23682b("visible", jSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    @C9209a(mo16570a = "toast")
    public final void toast(@C9212d(mo16572a = "text") String str, @C9212d(mo16572a = "icon_type") String str2) {
        int i;
        Context a = m25296a();
        if (a != null) {
            try {
                if (!C9431p.m18664a(str)) {
                    if (!C9431p.m18664a(str2)) {
                        if ("icon_success".equals(str2)) {
                            i = R.drawable.b6t;
                        } else {
                            i = R.drawable.b6s;
                        }
                        C12563i.m25225g().mo23612a(a, str, a.getResources().getDrawable(i));
                        return;
                    }
                    C12563i.m25225g().mo23612a(a, str, (Drawable) null);
                }
            } catch (Exception unused) {
            }
        }
    }

    public C12597c(Activity activity, C12598a aVar) {
        this.f33076e = new WeakReference<>(activity);
        this.f33075d = aVar;
        m25298a("send_sms", (C12608b) new C12601f(this.f33076e));
        C12595b bVar = new C12595b(this.f33076e, this);
        m25298a("login", (C12608b) bVar);
        m25298a("is_login", (C12608b) bVar);
        m25298a("internal_visible", (C12608b) new C12607i(this.f33076e, this));
        m25298a("share", (C12608b) new C12603h(this.f33076e, this));
        m25298a("shareImage", (C12608b) new C12591a(this.f33076e, this));
        this.f33074c.mo16568a(this);
    }

    /* renamed from: a */
    public final void mo23678a(String str, JSONObject jSONObject) {
        if (this.f33075d != null) {
            this.f33075d.mo23707a(str, jSONObject);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.put(r4, java.lang.Integer.valueOf(0));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0042 */
    @com.bytedance.p502b.p503a.p504a.p505a.C9209a(mo16570a = "check_apps_installed")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void checkAppsInstalled(@com.bytedance.p502b.p503a.p504a.p505a.C9212d(mo16572a = "pkg_list") org.json.JSONArray r7, @com.bytedance.p502b.p503a.p504a.p505a.C9210b java.lang.String r8) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x005a
            int r1 = r7.length()     // Catch:{ Throwable -> 0x005f }
            if (r1 > 0) goto L_0x000a
            goto L_0x005a
        L_0x000a:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Throwable -> 0x005f }
            r1.<init>()     // Catch:{ Throwable -> 0x005f }
            android.app.Application r2 = com.bytedance.polaris.p821a.C12563i.m25215a()     // Catch:{ Throwable -> 0x005f }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ Throwable -> 0x005f }
            r3 = 0
        L_0x0018:
            int r4 = r7.length()     // Catch:{ Throwable -> 0x005f }
            if (r3 >= r4) goto L_0x004c
            java.lang.String r4 = r7.getString(r3)     // Catch:{ Throwable -> 0x0049 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x0049 }
            if (r5 == 0) goto L_0x0029
            goto L_0x0049
        L_0x0029:
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            android.content.pm.PackageInfo r5 = r2.getPackageInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x0042 }
            if (r5 == 0) goto L_0x003a
            r5 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NameNotFoundException -> 0x0042 }
            r1.put(r4, r5)     // Catch:{ NameNotFoundException -> 0x0042 }
            goto L_0x0049
        L_0x003a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x0042 }
            r1.put(r4, r5)     // Catch:{ NameNotFoundException -> 0x0042 }
            goto L_0x0049
        L_0x0042:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x0049 }
            r1.put(r4, r5)     // Catch:{ Throwable -> 0x0049 }
        L_0x0049:
            int r3 = r3 + 1
            goto L_0x0018
        L_0x004c:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Throwable -> 0x005f }
            r7.<init>(r1)     // Catch:{ Throwable -> 0x005f }
            java.lang.String r1 = "code"
            r7.put(r1, r0)     // Catch:{ Throwable -> 0x005f }
            r6.mo23678a(r8, r7)     // Catch:{ Throwable -> 0x005f }
            return
        L_0x005a:
            r7 = 0
            r6.m25297a(r8, r0, r7)     // Catch:{ Throwable -> 0x005f }
            return
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.browser.p823a.p824a.C12597c.checkAppsInstalled(org.json.JSONArray, java.lang.String):void");
    }

    /* renamed from: a */
    public final boolean mo23679a(C12610d dVar, JSONObject jSONObject) {
        boolean z = false;
        if (dVar == null) {
            return false;
        }
        if (!this.f33073b.keySet().contains(dVar.f33101c)) {
            z = this.f33074c.mo16569a(dVar.f33101c, dVar.f33102d, dVar.f33100b, jSONObject);
        } else {
            C12608b bVar = (C12608b) this.f33073b.get(dVar.f33101c);
            if (bVar != null) {
                z = bVar.mo23675a(dVar, jSONObject);
            }
        }
        return z;
    }

    /* renamed from: a */
    private void m25297a(String str, int i, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("code", i);
                if (jSONObject != null) {
                    jSONObject2.put("data", jSONObject);
                }
            } catch (JSONException unused) {
            }
            mo23678a(str, jSONObject2);
        }
    }

    @C9209a(mo16570a = "safeHttpRequest")
    public final void safeHttpRequest(@C9212d(mo16572a = "method") String str, @C9212d(mo16572a = "url") String str2, @C9212d(mo16572a = "params") String str3, @C9212d(mo16572a = "body_content_type") String str4, @C9210b String str5) {
        C12600e eVar = new C12600e(this.f33077f, this.f33076e, str2, str, str3, str4, str5);
        eVar.start();
    }

    @C9209a(mo16570a = "unite_share")
    public final void uniteShare(@C9212d(mo16572a = "platform") String str, @C9212d(mo16572a = "channel") String str2, @C9212d(mo16572a = "text") String str3, @C9212d(mo16572a = "title") String str4, @C9212d(mo16572a = "description") String str5, @C9212d(mo16572a = "url") String str6, @C9212d(mo16572a = "extra") JSONObject jSONObject, @C9212d(mo16572a = "image") String str7, @C9210b String str8) {
        String str9 = str8;
        try {
            C12561g e = C12563i.m25223e();
            if (e == null) {
                m25297a(str9, 0, null);
                return;
            }
            e.mo23624a((Activity) this.f33076e.get(), str, str2, str3, str4, str5, str6, jSONObject, str7);
            m25297a(str9, 1, null);
        } catch (Throwable unused) {
        }
    }
}
