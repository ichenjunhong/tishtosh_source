package com.p683ss.android.common.applog;

import android.content.Context;
import android.util.Pair;
import com.bytedance.common.utility.C9423k;
import com.bytedance.common.utility.C9423k.C9424a;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.core.p577a.C9925b;
import com.p683ss.android.common.C18846a;
import com.p683ss.android.ugc.aweme.app.p1373d.C23062a;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.ss.android.common.applog.NetUtil */
public class NetUtil {
    private static volatile String APP_LOG_ENCRYPT_COUNT = "app_log_encrypt_switch_count";
    private static Object mLock = new Object();
    private static IAliYunHandler sAliYunHandler;
    private static C18846a sAppContext;
    public static IAppParam sAppParam;
    private static final ConcurrentHashMap<String, String> sCustomParam = new ConcurrentHashMap<>();
    private static volatile int sEncryptFaildCount;
    private static volatile IExtraParams sExtraparams;
    private static volatile boolean sIsReadConfigFromSP;
    private static volatile boolean sIsWriteConfigSP;

    /* renamed from: com.ss.android.common.applog.NetUtil$IAppParam */
    public interface IAppParam {
        void getSSIDs(Context context, Map<String, String> map);
    }

    /* renamed from: com.ss.android.common.applog.NetUtil$IExtraParams */
    public interface IExtraParams {
        HashMap<String, String> getExtrparams();
    }

    /* renamed from: com.ss.android.common.applog.NetUtil$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_I18nLancet_putCommonParams(Map map, boolean z) {
            if (map != null) {
                NetUtil.putCommonParams$___twin___(map, z);
                map.put("version_code", String.valueOf(C23062a.f61433b));
            }
        }
    }

    public static int checkHttpRequestException(Throwable th, String[] strArr) {
        return 1;
    }

    public static void putCommonParams(Map map, boolean z) {
        _lancet.com_ss_android_ugc_aweme_lancet_I18nLancet_putCommonParams(map, z);
    }

    public static String getAliyunUuid() {
        if (sAliYunHandler != null) {
            return sAliYunHandler.getCloudUUID();
        }
        return null;
    }

    public static void setAliYunHanlder(IAliYunHandler iAliYunHandler) {
        sAliYunHandler = iAliYunHandler;
    }

    public static void setAppContext(C18846a aVar) {
        sAppContext = aVar;
    }

    public static void setAppParam(IAppParam iAppParam) {
        sAppParam = iAppParam;
    }

    public static void setEncryptSPName(String str) {
        if (!C9431p.m18664a(str)) {
            APP_LOG_ENCRYPT_COUNT = str;
        }
    }

    public static void setExtraparams(IExtraParams iExtraParams) {
        if (sExtraparams == null && iExtraParams != null) {
            sExtraparams = iExtraParams;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void addFailedCount(android.content.Context r4) {
        /*
            boolean r0 = sIsReadConfigFromSP
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.Object r0 = mLock
            monitor-enter(r0)
            java.lang.String r1 = APP_LOG_ENCRYPT_COUNT     // Catch:{ Throwable -> 0x002c }
            r2 = 0
            android.content.SharedPreferences r4 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r4, r1, r2)     // Catch:{ Throwable -> 0x002c }
            java.lang.String r1 = "app_log_encrypt_faild_count"
            int r1 = r4.getInt(r1, r2)     // Catch:{ Throwable -> 0x002c }
            sEncryptFaildCount = r1     // Catch:{ Throwable -> 0x002c }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ Throwable -> 0x002c }
            java.lang.String r1 = "app_log_encrypt_faild_count"
            int r2 = sEncryptFaildCount     // Catch:{ Throwable -> 0x002c }
            r3 = 1
            int r2 = r2 + r3
            r4.putInt(r1, r2)     // Catch:{ Throwable -> 0x002c }
            r4.apply()     // Catch:{ Throwable -> 0x002c }
            sIsReadConfigFromSP = r3     // Catch:{ Throwable -> 0x002c }
            goto L_0x002c
        L_0x002a:
            r4 = move-exception
            goto L_0x002e
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.common.applog.NetUtil.addFailedCount(android.content.Context):void");
    }

    public static boolean isBadId(String str) {
        if (C9431p.m18664a(str) || str.equalsIgnoreCase("unknown") || str.equalsIgnoreCase("None")) {
            return true;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = true;
                break;
            } else if (str.charAt(i) != '0') {
                break;
            } else {
                i++;
            }
        }
        return z;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void minusFailedCount(android.content.Context r4) {
        /*
            boolean r0 = sIsWriteConfigSP
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.Object r0 = mLock
            monitor-enter(r0)
            java.lang.String r1 = APP_LOG_ENCRYPT_COUNT     // Catch:{ Throwable -> 0x0030 }
            r2 = 0
            android.content.SharedPreferences r4 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r4, r1, r2)     // Catch:{ Throwable -> 0x0030 }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ Throwable -> 0x0030 }
            int r1 = sEncryptFaildCount     // Catch:{ Throwable -> 0x0030 }
            r3 = 2
            if (r1 <= r3) goto L_0x001e
            int r1 = sEncryptFaildCount     // Catch:{ Throwable -> 0x0030 }
            int r1 = r1 - r3
            sEncryptFaildCount = r1     // Catch:{ Throwable -> 0x0030 }
            goto L_0x0020
        L_0x001e:
            sEncryptFaildCount = r2     // Catch:{ Throwable -> 0x0030 }
        L_0x0020:
            java.lang.String r1 = "app_log_encrypt_faild_count"
            int r2 = sEncryptFaildCount     // Catch:{ Throwable -> 0x0030 }
            r4.putInt(r1, r2)     // Catch:{ Throwable -> 0x0030 }
            r4.apply()     // Catch:{ Throwable -> 0x0030 }
            r4 = 1
            sIsWriteConfigSP = r4     // Catch:{ Throwable -> 0x0030 }
            goto L_0x0030
        L_0x002e:
            r4 = move-exception
            goto L_0x0032
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.common.applog.NetUtil.minusFailedCount(android.content.Context):void");
    }

    public static String addCommonParams(String str, boolean z) {
        C18846a aVar = sAppContext;
        if (C9431p.m18664a(str) || aVar == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        appendCommonParams(sb, z);
        return sb.toString();
    }

    public static void addCustomParams(String str, String str2) {
        if (!C9431p.m18664a(str) && !C9431p.m18664a(str2)) {
            sCustomParam.put(str, str2);
        }
    }

    public static void appendCommonParams(StringBuilder sb, boolean z) {
        if (sAppContext != null && sb != null) {
            if (sb.toString().indexOf(63) < 0) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            putCommonParams(linkedHashMap, z);
            ArrayList arrayList = new ArrayList();
            for (Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
            sb.append(C9425l.m18648a((List<Pair<String, String>>) arrayList, "UTF-8"));
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x01ee */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01f2 A[Catch:{ Throwable -> 0x0239 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void putCommonParams$___twin___(java.util.Map<java.lang.String, java.lang.String> r5, boolean r6) {
        /*
            com.ss.android.common.a r0 = sAppContext
            if (r5 == 0) goto L_0x023a
            if (r0 != 0) goto L_0x0008
            goto L_0x023a
        L_0x0008:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            android.content.Context r3 = r0.mo20030d()     // Catch:{ Exception -> 0x003b }
            java.lang.String r3 = com.p683ss.android.common.util.C18920g.m46051b(r3)     // Catch:{ Exception -> 0x003b }
            if (r3 == 0) goto L_0x0022
            java.lang.String r4 = com.p683ss.android.common.util.C18920g.f52126a     // Catch:{ Exception -> 0x003b }
            boolean r3 = r3.endsWith(r4)     // Catch:{ Exception -> 0x003b }
            if (r3 == 0) goto L_0x0022
            r3 = 1
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            if (r3 == 0) goto L_0x0037
            com.ss.android.common.applog.NetUtil$IAppParam r3 = sAppParam     // Catch:{ Exception -> 0x003b }
            if (r3 == 0) goto L_0x0032
            com.ss.android.common.applog.NetUtil$IAppParam r3 = sAppParam     // Catch:{ Exception -> 0x003b }
            android.content.Context r4 = r0.mo20030d()     // Catch:{ Exception -> 0x003b }
            r3.getSSIDs(r4, r1)     // Catch:{ Exception -> 0x003b }
        L_0x0032:
            boolean r3 = com.bytedance.common.utility.C9415i.m18635b()     // Catch:{ Exception -> 0x003b }
            goto L_0x003e
        L_0x0037:
            com.p683ss.android.deviceregister.C19034d.m46318a(r1)     // Catch:{ Exception -> 0x003b }
            goto L_0x003e
        L_0x003b:
            com.p683ss.android.deviceregister.C19034d.m46318a(r1)
        L_0x003e:
            java.lang.String r3 = "install_id"
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r3)
            if (r4 != 0) goto L_0x0051
            java.lang.String r4 = "iid"
            r5.put(r4, r3)
        L_0x0051:
            java.lang.String r3 = "device_id"
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r3)
            if (r4 != 0) goto L_0x0064
            java.lang.String r4 = "device_id"
            r5.put(r4, r3)
        L_0x0064:
            android.content.Context r3 = r0.mo20030d()
            if (r3 == 0) goto L_0x0079
            java.lang.String r3 = com.bytedance.common.utility.C9425l.m18654e(r3)
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r3)
            if (r4 != 0) goto L_0x0079
            java.lang.String r4 = "ac"
            r5.put(r4, r3)
        L_0x0079:
            java.lang.String r3 = r0.mo20027a()
            if (r3 == 0) goto L_0x0084
            java.lang.String r4 = "channel"
            r5.put(r4, r3)
        L_0x0084:
            java.lang.String r3 = "aid"
            int r4 = r0.mo20028b()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r5.put(r3, r4)
            java.lang.String r3 = r0.mo20036j()
            if (r3 == 0) goto L_0x009c
            java.lang.String r4 = "app_name"
            r5.put(r4, r3)
        L_0x009c:
            java.lang.String r3 = "version_code"
            int r4 = r0.mo20037k()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r5.put(r3, r4)
            java.lang.String r3 = "version_name"
            java.lang.String r4 = r0.mo20035i()
            r5.put(r3, r4)
            java.lang.String r3 = "device_platform"
            java.lang.String r4 = "android"
            r5.put(r3, r4)
            java.lang.String r3 = r0.mo20032f()
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r3)
            if (r4 != 0) goto L_0x00c8
            java.lang.String r4 = "ab_version"
            r5.put(r4, r3)
        L_0x00c8:
            r3 = 0
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r3)
            if (r4 != 0) goto L_0x00d4
            java.lang.String r4 = "ab_client"
            r5.put(r4, r3)
        L_0x00d4:
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r3)
            if (r4 != 0) goto L_0x00df
            java.lang.String r4 = "ab_group"
            r5.put(r4, r3)
        L_0x00df:
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r3)
            if (r4 != 0) goto L_0x00ea
            java.lang.String r4 = "ab_feature"
            r5.put(r4, r3)
        L_0x00ea:
            if (r6 == 0) goto L_0x00f3
            java.lang.String r6 = "ssmix"
            java.lang.String r3 = "a"
            r5.put(r6, r3)
        L_0x00f3:
            java.lang.String r6 = "device_type"
            java.lang.String r3 = android.os.Build.MODEL
            r5.put(r6, r3)
            java.lang.String r6 = "device_brand"
            java.lang.String r3 = android.os.Build.BRAND
            r5.put(r6, r3)
            java.lang.String r6 = "language"
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r3 = r3.getLanguage()
            r5.put(r6, r3)
            java.lang.String r6 = "os_api"
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r5.put(r6, r3)
            java.lang.String r6 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x012e }
            if (r6 == 0) goto L_0x0129
            int r3 = r6.length()     // Catch:{ Exception -> 0x012e }
            r4 = 10
            if (r3 <= r4) goto L_0x0129
            java.lang.String r6 = r6.substring(r2, r4)     // Catch:{ Exception -> 0x012e }
        L_0x0129:
            java.lang.String r2 = "os_version"
            r5.put(r2, r6)     // Catch:{ Exception -> 0x012e }
        L_0x012e:
            java.lang.String r6 = r0.mo20034h()
            boolean r2 = isBadId(r6)
            if (r2 != 0) goto L_0x013d
            java.lang.String r2 = "uuid"
            r5.put(r2, r6)
        L_0x013d:
            java.lang.String r6 = "openudid"
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r6)
            if (r1 != 0) goto L_0x0150
            java.lang.String r1 = "openudid"
            r5.put(r1, r6)
        L_0x0150:
            com.ss.android.common.applog.IAliYunHandler r6 = sAliYunHandler
            if (r6 == 0) goto L_0x0165
            com.ss.android.common.applog.IAliYunHandler r6 = sAliYunHandler
            java.lang.String r6 = r6.getCloudUUID()
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x0165
            java.lang.String r1 = "aliyun_uuid"
            r5.put(r1, r6)
        L_0x0165:
            java.lang.String r6 = "manifest_version_code"
            int r1 = r0.mo20031e()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r5.put(r6, r1)
            android.content.Context r6 = r0.mo20030d()
            java.lang.String r6 = com.bytedance.common.utility.C9432q.m18693c(r6)
            boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r6)
            if (r1 != 0) goto L_0x0185
            java.lang.String r1 = "resolution"
            r5.put(r1, r6)
        L_0x0185:
            android.content.Context r6 = r0.mo20030d()
            int r6 = com.bytedance.common.utility.C9432q.m18694d(r6)
            if (r6 <= 0) goto L_0x0198
            java.lang.String r1 = "dpi"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r5.put(r1, r6)
        L_0x0198:
            java.lang.String r6 = "update_version_code"
            int r0 = r0.mo20033g()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5.put(r6, r0)
            java.lang.String r6 = "_rticket"
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5.put(r6, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r6 = sCustomParam     // Catch:{ Exception -> 0x01ee }
            boolean r6 = r6.isEmpty()     // Catch:{ Exception -> 0x01ee }
            if (r6 != 0) goto L_0x01ee
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r6 = sCustomParam     // Catch:{ Exception -> 0x01ee }
            java.util.Set r6 = r6.entrySet()     // Catch:{ Exception -> 0x01ee }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x01ee }
        L_0x01c4:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x01ee }
            if (r0 == 0) goto L_0x01ee
            java.lang.Object r0 = r6.next()     // Catch:{ Exception -> 0x01ee }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Exception -> 0x01ee }
            if (r0 == 0) goto L_0x01c4
            java.lang.Object r1 = r0.getKey()     // Catch:{ Exception -> 0x01ee }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x01ee }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x01ee }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x01ee }
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r1)     // Catch:{ Exception -> 0x01ee }
            if (r2 != 0) goto L_0x01c4
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Exception -> 0x01ee }
            if (r2 != 0) goto L_0x01c4
            r5.put(r1, r0)     // Catch:{ Exception -> 0x01ee }
            goto L_0x01c4
        L_0x01ee:
            com.ss.android.common.applog.NetUtil$IExtraParams r6 = sExtraparams     // Catch:{ Throwable -> 0x0239 }
            if (r6 == 0) goto L_0x0238
            com.ss.android.common.applog.NetUtil$IExtraParams r6 = sExtraparams     // Catch:{ Throwable -> 0x0239 }
            java.util.HashMap r6 = r6.getExtrparams()     // Catch:{ Throwable -> 0x0239 }
            if (r6 == 0) goto L_0x0238
            boolean r0 = r6.isEmpty()     // Catch:{ Throwable -> 0x0239 }
            if (r0 != 0) goto L_0x0238
            java.util.Set r6 = r6.entrySet()     // Catch:{ Throwable -> 0x0239 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Throwable -> 0x0239 }
        L_0x0208:
            boolean r0 = r6.hasNext()     // Catch:{ Throwable -> 0x0239 }
            if (r0 == 0) goto L_0x0238
            java.lang.Object r0 = r6.next()     // Catch:{ Throwable -> 0x0239 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Throwable -> 0x0239 }
            if (r0 == 0) goto L_0x0208
            java.lang.Object r1 = r0.getKey()     // Catch:{ Throwable -> 0x0239 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x0239 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Throwable -> 0x0239 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x0239 }
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r1)     // Catch:{ Throwable -> 0x0239 }
            if (r2 != 0) goto L_0x0208
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Throwable -> 0x0239 }
            if (r2 != 0) goto L_0x0208
            boolean r2 = r5.containsKey(r1)     // Catch:{ Throwable -> 0x0239 }
            if (r2 != 0) goto L_0x0208
            r5.put(r1, r0)     // Catch:{ Throwable -> 0x0239 }
            goto L_0x0208
        L_0x0238:
            return
        L_0x0239:
            return
        L_0x023a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.common.applog.NetUtil.putCommonParams$___twin___(java.util.Map, boolean):void");
    }

    public static String sendEncryptLog(String str, byte[] bArr, Context context, boolean z) throws Exception {
        if (C9431p.m18664a(str) || bArr == null || bArr.length <= 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(VideoCacheReadBuffersizeExperiment.DEFAULT);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            addFailedCount(context);
            boolean z2 = false;
            if (sEncryptFaildCount < 3) {
                z2 = true;
                byteArray = C9925b.m19906a(byteArray, byteArray.length);
                minusFailedCount(context);
            }
            if (byteArray == null || !z2) {
                throw new RuntimeException("encrypt failed");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("&tt_data=a");
            String sb2 = sb.toString();
            if (z) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append("&config_retry=b");
                sb2 = sb3.toString();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/octet-stream;tt-data=a");
            return C9423k.m18637a().mo17023a(sb2, byteArray, (Map<String, String>) hashMap, (C9424a) null);
        } catch (Throwable th) {
            gZIPOutputStream.close();
            throw th;
        }
    }
}
