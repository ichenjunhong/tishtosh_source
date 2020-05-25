package com.p683ss.android.ugc.aweme.setting;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.p683ss.android.deviceregister.C19034d;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.services.C23160h;
import com.p683ss.android.ugc.aweme.setting.boe.C41588a;
import java.io.File;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.setting.i */
public final class C41623i {

    /* renamed from: a */
    public static String f105345a = "prod";

    /* renamed from: b */
    public static String f105346b = "prod";

    /* renamed from: c */
    public static final C41623i f105347c;

    /* renamed from: d */
    private static final String f105348d = f105348d;

    /* renamed from: e */
    private static final List<String> f105349e = C52575l.m112099b((Object[]) new String[]{f105348d, "test_sp"});

    /* renamed from: f */
    private static boolean f105350f = false;

    /* renamed from: g */
    private static boolean f105351g = false;

    /* renamed from: h */
    private static Keva f105352h = null;

    /* renamed from: i */
    private static JSONObject f105353i = null;

    /* renamed from: j */
    private static C41588a f105354j = null;

    /* renamed from: k */
    private static final String f105355k = f105355k;

    /* renamed from: com.ss.android.ugc.aweme.setting.i$a */
    static final class C41624a<TTaskResult, TContinuationResult> implements C0011g<TResult, TContinuationResult> {

        /* renamed from: a */
        public static final C41624a f105356a = new C41624a();

        C41624a() {
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            Process.killProcess(Process.myPid());
            return C52860x.f131107a;
        }
    }

    private C41623i() {
    }

    /* renamed from: a */
    public static boolean m91491a() {
        return f105351g;
    }

    /* renamed from: b */
    public static boolean m91496b() {
        return f105350f;
    }

    /* JADX INFO: used method not loaded: d.a.n.b(java.lang.Object[]):null, types can be incorrect */
    static {
        C41623i iVar = new C41623i();
        f105347c = iVar;
        C41588a a = C41588a.m91426a();
        C52711k.m112236a((Object) a, "BoeManager.inst()");
        f105354j = a;
        Keva repoFromSp = Keva.getRepoFromSp(AwemeApplication.m56199a(), "test_sp", 0);
        f105352h = repoFromSp;
        if (repoFromSp != null) {
            Keva keva = f105352h;
            if (keva == null) {
                C52711k.m112234a();
            }
            String string = keva.getString("key_ppe_lane", "prod");
            C52711k.m112236a((Object) string, "keva!!.getString(KEY_PPE_LANE, \"prod\")");
            m91494b(string);
            Keva keva2 = f105352h;
            if (keva2 == null) {
                C52711k.m112234a();
            }
            String string2 = keva2.getString("key_boe_lane", "prod");
            C52711k.m112236a((Object) string2, "keva!!.getString(KEY_BOE_LANE, \"prod\")");
            m91490a(string2);
            Keva keva3 = f105352h;
            if (keva3 == null) {
                C52711k.m112234a();
            }
            m91495b(keva3.getBoolean("key_enable_ppe", false));
            Keva keva4 = f105352h;
            if (keva4 == null) {
                C52711k.m112234a();
            }
            iVar.mo85384a(keva4.getBoolean("key_enable_boe", m91492a((Context) AwemeApplication.m56199a())));
        }
    }

    /* renamed from: a */
    public static void m91490a(String str) {
        C52711k.m112240b(str, "value");
        f105345a = str;
        Keva keva = f105352h;
        if (keva != null) {
            keva.storeString("key_boe_lane", str);
        }
    }

    /* renamed from: b */
    public static void m91494b(String str) {
        C52711k.m112240b(str, "value");
        f105346b = str;
        Keva keva = f105352h;
        if (keva != null) {
            keva.storeString("key_ppe_lane", str);
        }
    }

    /* renamed from: a */
    private static boolean m91492a(Context context) {
        if (context == null || f105353i != null) {
            return false;
        }
        String a = C23160h.m56753a(context.getApplicationContext(), "ttnet_config.json");
        if (!TextUtils.isEmpty(a)) {
            try {
                JSONObject jSONObject = new JSONObject(a);
                f105353i = jSONObject;
                return jSONObject.optBoolean("boe_proxy_enabled", false);
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m91495b(boolean z) {
        f105351g = z;
        Keva keva = f105352h;
        if (keva != null) {
            keva.storeBoolean("key_enable_ppe", z);
        }
        if (z) {
            f105354j.mo85367a(f105346b, true);
        }
    }

    /* renamed from: a */
    public static boolean m91493a(File file) {
        C52711k.m112240b(file, "sub");
        for (String str : f105349e) {
            String absolutePath = file.getAbsolutePath();
            C52711k.m112236a((Object) absolutePath, "sub.absolutePath");
            if (C52830p.m112456b((CharSequence) absolutePath, (CharSequence) str, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo85384a(boolean z) {
        f105350f = z;
        Keva keva = f105352h;
        if (keva != null) {
            keva.storeBoolean("key_enable_boe", z);
        }
        if (z) {
            f105354j.mo85367a(f105345a, false);
            m91495b(false);
        }
        String absolutePath = C11010c.m22280a().getFilesDir().getAbsolutePath();
        if (!TextUtils.isEmpty(absolutePath)) {
            StringBuilder sb = new StringBuilder();
            sb.append(absolutePath);
            sb.append("/");
            sb.append(f105348d);
            File file = new File(sb.toString());
            if (!z) {
                file.delete();
            } else if (!file.exists()) {
                file.createNewFile();
            }
        }
    }

    /* renamed from: a */
    public static void m91489a(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        C41588a aVar = f105354j;
        C41588a.m91427a(C41588a.m91429b().getCacheDir());
        StringBuilder sb = new StringBuilder("/data/data/");
        sb.append(C41588a.m91429b().getPackageName());
        sb.append("/shared_prefs");
        C41588a.m91427a(new File(sb.toString()));
        for (File a : C41588a.m91429b().getFilesDir().listFiles()) {
            C41588a.m91427a(a);
        }
        StringBuilder sb2 = new StringBuilder("/data/data/");
        sb2.append(C41588a.m91429b().getPackageName());
        sb2.append("/databases/");
        C41588a.m91427a(new File(sb2.toString()));
        C41588a.m91427a(C41588a.m91429b().getExternalCacheDir());
        C41588a.m91427a(C41588a.m91429b().getExternalFilesDir(""));
        C19034d.m46314a(context, "boe_switch");
        if (VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().removeAllCookies(null);
        }
        C10691a.m21537a(context, f105355k).mo19066a();
        C0013i.m12a(3000).mo19a((C0011g<TResult, TContinuationResult>) C41624a.f105356a);
    }
}
