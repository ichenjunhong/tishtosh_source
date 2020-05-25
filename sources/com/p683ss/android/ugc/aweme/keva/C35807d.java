package com.p683ss.android.ugc.aweme.keva;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.bytedance.keva.adapter.KevaSpFastAdapter;
import com.p683ss.android.ugc.aweme.p2271sp.C45673f;
import com.p683ss.android.ugc.aweme.p2271sp.SharedPreferencesManager;
import com.twitter.sdk.android.core.C52224q;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.keva.d */
public final class C35807d {

    /* renamed from: a */
    static boolean f91965a;

    /* renamed from: b */
    static HashSet<String> f91966b = new HashSet<>();

    /* renamed from: c */
    static final String[] f91967c;

    /* renamed from: d */
    static HashSet<String> f91968d = new HashSet<>();

    /* renamed from: e */
    static final String[] f91969e = {"Agoo_AppStore", "ACCS_SDK", "mipush_extra", "mipush", "umeng_general_config", "is_allow_oppo_push", "push_multi_process_config", "traffic_monitor_info", "applog_stats", "umeng_general_config", "wschannel_multi_process_config", "device-register-oaid", "device_register_oaid_refine", "device_register_migrate_detector", "com.ss.android.deviceregister.utils.Cdid", "rec_user", "ab_test_mock_config", "ACCS_COOKIE", "ACCS_LOAD_SO", "ACCS_SDK_CHANNEL", "anr_monitor_table", "app_setting", "aweme-abtest-hooker", "gaid_sp_name", "google_ads_flags", "image_opt_table", "KEY_NEED_UPLOAD_LAUNCHLOG", "mipush_account", "mipush_app_info", "plugin_meta_data", "pref_registered_pkg_names", "push_setting", "ss_app_config", "ss_location", "test_setting", "update_params", "use_https", "XMPushServiceConfig", "MiniAppCookiePersistence", "tma_jssdk_info", "mini_app_storage", "appbrand_file", "mipush_oc", "push_switch", "sync", "httpdns_config_cache", "sp_client_report_status", "effect_setting", "d_permit", "pushservice_umeng_common_config", "umeng_message_state", "Alvin2", "ContextData", "pushConfig", "MainTabPreferences", "sp_download_info", "TTWebView_Json_Config_Manager", "TeenageModeSetting", "extra_group", "ttlive_tabs_cache"};

    /* renamed from: f */
    private static int f91970f;

    /* renamed from: g */
    private static List<Class> f91971g;

    /* renamed from: h */
    private static File f91972h;

    /* renamed from: i */
    private static HashMap<String, Boolean> f91973i = new HashMap<>();

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C11010c.m22280a().getPackageName());
        sb.append("_preferences");
        f91967c = new String[]{"default_config", "awesome_splash", "splash_ad_sp", "sp_symphony", "ttnetCookieStore", "key_language_sp_key", "applog_stats", "aweme-app", "av_settings.xml", "ab_test_config", "aweme_user", "com.ss.spipe_setting", "SP_EXPERIMENT_CACHE", "SP_CLIENT_EXPOSURE_CACHE", "SP_EXPERIMENT_EXPOSURE_CACHE", "CLIENT_EXPERIMENT_CACHE_TAG", sb.toString(), "rhea.sp"};
        Class[] clsArr = new Class[2];
        clsArr[0] = C52224q.class;
        clsArr[0] = C45673f.class;
        f91971g = Arrays.asList(clsArr);
    }

    /* renamed from: a */
    private static boolean m80938a(String str) {
        if ((str.length() & 7) <= f91970f) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.io.DataInputStream] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.DataOutputStream] */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r7v4, types: [java.io.DataOutputStream] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.io.DataInputStream] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.io.DataInputStream] */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v10, types: [java.io.DataOutputStream] */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v13, types: [java.io.DataOutputStream] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.io.DataInputStream] */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v1
      assigns: []
      uses: []
      mth insns count: 73
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0075 A[SYNTHETIC, Splitter:B:48:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x007c A[SYNTHETIC, Splitter:B:52:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0087 A[SYNTHETIC, Splitter:B:61:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x008e A[SYNTHETIC, Splitter:B:65:0x008e] */
    /* JADX WARNING: Unknown variable types count: 13 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m80936a(android.content.Context r7) {
        /*
            java.io.File r0 = r7.getFilesDir()
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x000d
            r0.mkdirs()
        L_0x000d:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "keva_port_batch_master"
            r1.<init>(r0, r2)
            r0 = 0
            r2 = 0
            boolean r3 = r1.exists()     // Catch:{ IOException -> 0x006f, all -> 0x006c }
            if (r3 == 0) goto L_0x003a
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch:{ IOException -> 0x006f, all -> 0x006c }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006f, all -> 0x006c }
            r3.<init>(r1)     // Catch:{ IOException -> 0x006f, all -> 0x006c }
            r0.<init>(r3)     // Catch:{ IOException -> 0x006f, all -> 0x006c }
            int r3 = r0.readInt()     // Catch:{ IOException -> 0x0037, all -> 0x0034 }
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r3 >> 2
            f91970f = r4     // Catch:{ IOException -> 0x0037, all -> 0x0034 }
            r6 = r3
            r3 = r0
            r0 = r6
            goto L_0x003b
        L_0x0034:
            r7 = move-exception
            r3 = r0
            goto L_0x0085
        L_0x0037:
            r7 = r2
            r2 = r0
            goto L_0x0070
        L_0x003a:
            r3 = r2
        L_0x003b:
            int r4 = f91970f     // Catch:{ IOException -> 0x0069, all -> 0x0067 }
            r5 = 8
            if (r4 >= r5) goto L_0x0059
            boolean r7 = com.p683ss.android.common.util.C18920g.m46048a(r7)     // Catch:{ IOException -> 0x0069, all -> 0x0067 }
            if (r7 == 0) goto L_0x0059
            java.io.DataOutputStream r7 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0069, all -> 0x0067 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0069, all -> 0x0067 }
            r4.<init>(r1)     // Catch:{ IOException -> 0x0069, all -> 0x0067 }
            r7.<init>(r4)     // Catch:{ IOException -> 0x0069, all -> 0x0067 }
            int r0 = r0 + 1
            r7.writeInt(r0)     // Catch:{ IOException -> 0x006a, all -> 0x0057 }
            goto L_0x005a
        L_0x0057:
            r0 = move-exception
            goto L_0x0083
        L_0x0059:
            r7 = r2
        L_0x005a:
            if (r3 == 0) goto L_0x0061
            r3.close()     // Catch:{ Throwable -> 0x0060 }
            goto L_0x0061
        L_0x0060:
        L_0x0061:
            if (r7 == 0) goto L_0x0080
            r7.close()     // Catch:{ Throwable -> 0x0066 }
        L_0x0066:
            return
        L_0x0067:
            r7 = move-exception
            goto L_0x0085
        L_0x0069:
            r7 = r2
        L_0x006a:
            r2 = r3
            goto L_0x0070
        L_0x006c:
            r7 = move-exception
            r3 = r2
            goto L_0x0085
        L_0x006f:
            r7 = r2
        L_0x0070:
            r1.delete()     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x007a
            r2.close()     // Catch:{ Throwable -> 0x0079 }
            goto L_0x007a
        L_0x0079:
        L_0x007a:
            if (r7 == 0) goto L_0x0080
            r7.close()     // Catch:{ Throwable -> 0x007f }
        L_0x007f:
            return
        L_0x0080:
            return
        L_0x0081:
            r0 = move-exception
            r3 = r2
        L_0x0083:
            r2 = r7
            r7 = r0
        L_0x0085:
            if (r3 == 0) goto L_0x008c
            r3.close()     // Catch:{ Throwable -> 0x008b }
            goto L_0x008c
        L_0x008b:
        L_0x008c:
            if (r2 == 0) goto L_0x0091
            r2.close()     // Catch:{ Throwable -> 0x0091 }
        L_0x0091:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.keva.C35807d.m80936a(android.content.Context):void");
    }

    /* renamed from: c */
    private static SharedPreferences m80941c(Context context, String str) {
        if (context == null) {
            return null;
        }
        SharedPreferences sharedPreferences = SharedPreferencesManager.getInstance().getSharedPreferences(context, str);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        return null;
    }

    /* renamed from: b */
    private static boolean m80940b(Context context, String str) {
        if (!f91965a || f91971g.contains(context.getClass()) || f91966b.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m80937a(Context context, String str) {
        synchronized (f91973i) {
            Boolean bool = (Boolean) f91973i.get(str);
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                return booleanValue;
            }
            if (f91972h == null) {
                File filesDir = context.getFilesDir();
                if (!filesDir.exists()) {
                    filesDir.mkdir();
                }
                f91972h = new File(filesDir.getParent(), "shared_prefs");
            }
            File file = f91972h;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".xml");
            boolean exists = new File(file, sb.toString()).exists();
            f91973i.put(str, Boolean.valueOf(exists));
            return exists;
        }
    }

    /* renamed from: a */
    public static SharedPreferences m80935a(Context context, String str, int i) {
        if (KevaPerfExperiment.INSTANCE.mo74472a(context, 2)) {
            return context.getSharedPreferences(str, i);
        }
        if (KevaPerfExperiment.INSTANCE.mo74472a(context, 3)) {
            return m80939b(context, str, i);
        }
        if (m80940b(context, str)) {
            return m80939b(context, str, i);
        }
        if (!m80938a(str) && !Keva.isRepoPorted(str) && m80937a(context, str)) {
            return m80939b(context, str, i);
        }
        if (f91968d.contains(str)) {
            i = 4;
        }
        return KevaSpFastAdapter.getSharedPreferences(context, str, i, !KevaPerfExperiment.INSTANCE.mo74472a(context, 1));
    }

    /* renamed from: b */
    private static SharedPreferences m80939b(Context context, String str, int i) {
        if (!TextUtils.equals("plugin_meta_data", str) && !TextUtils.equals("bmd_monitor", str) && !TextUtils.equals("multidex.version", str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C11010c.m22280a().getPackageName());
            sb.append("_preferences");
            if (!TextUtils.equals(sb.toString(), str)) {
                SharedPreferences c = m80941c(context, str);
                if (c != null) {
                    return c;
                }
                return context.getSharedPreferences(str, i);
            }
        }
        return context.getSharedPreferences(str, i);
    }
}
