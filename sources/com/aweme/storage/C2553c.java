package com.aweme.storage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Build.VERSION;
import com.aweme.storage.C2576o.C2577a;
import com.bytedance.p829r.C12661b;
import com.bytedance.p829r.C12662c;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.aweme.storage.c */
public final class C2553c {

    /* renamed from: a */
    public static volatile boolean f7932a;

    /* renamed from: b */
    static boolean f7933b;

    /* renamed from: c */
    static C2548a f7934c;

    /* renamed from: d */
    static C2566i f7935d;

    /* renamed from: e */
    private static volatile boolean f7936e;

    /* renamed from: f */
    private static List<C2576o> f7937f;

    /* renamed from: g */
    private static C2565h f7938g;

    /* renamed from: h */
    private static long f7939h;

    /* renamed from: i */
    private static C2567j f7940i;

    /* renamed from: b */
    private static void m7471b() {
        if (f7937f != null && !f7937f.isEmpty()) {
            for (C2576o oVar : f7937f) {
                if (oVar != null) {
                    oVar.mo7081a();
                }
            }
        }
    }

    /* renamed from: a */
    private static void m7464a() {
        Set set;
        String[] strArr;
        C2548a aVar = f7934c;
        if (aVar != null && aVar.f7913b != null && aVar.f7913b.length > 0) {
            if (f7935d == null) {
                set = null;
            } else {
                set = f7935d.mo7074a();
            }
            for (String str : aVar.f7913b) {
                if (set != null && !set.contains(str)) {
                    File file = new File(str);
                    if (file.exists()) {
                        if (file.isFile()) {
                            file.delete();
                        } else {
                            C2562f.m7499b(file);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m7469a(String str) {
        new StringBuilder("checkSpace ").append(str);
    }

    /* renamed from: a */
    public static void m7465a(Context context) {
        if (context != null && !f7932a) {
            final Context applicationContext = context.getApplicationContext();
            C0013i.m18a((Callable<TResult>) new Callable<Object>() {
                public final Object call() throws Exception {
                    C2553c.m7472b(applicationContext);
                    return null;
                }
            }, (Executor) C24076h.m58902c());
        }
    }

    /* renamed from: c */
    static boolean m7473c(Context context) {
        if (f7940i != null && f7940i.f7963g && C2562f.m7494a(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    static void m7474d(Context context) {
        if (f7935d != null) {
            f7935d.mo7075a(m7473c(context));
        }
        m7464a();
        if (f7935d != null && f7935d.mo7076b()) {
            m7476f(context);
        }
    }

    /* renamed from: e */
    static void m7475e(Context context) {
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            C0013i.m18a((Callable<TResult>) new Callable<Object>() {
                public final Object call() throws Exception {
                    if (applicationContext == null) {
                        return null;
                    }
                    C35807d.m80935a(applicationContext, "clean_storage_pref", 0).edit().putLong("key_clean_date", System.currentTimeMillis()).commit();
                    C2553c.f7932a = false;
                    return null;
                }
            }, (Executor) C24076h.m58902c());
        }
    }

    /* renamed from: b */
    public static void m7472b(Context context) {
        if (VERSION.SDK_INT >= 26) {
            try {
                CompatJobService.m7451a(context);
            } catch (Exception unused) {
                try {
                    new JSONObject().put("model", Build.MODEL);
                } catch (JSONException unused2) {
                }
            }
        } else {
            C2558d.m7480a(context, new Intent(context, JobService.class));
        }
    }

    /* renamed from: g */
    private static long m7477g(Context context) {
        long j = 0;
        try {
            String str = context.getApplicationInfo().publicSourceDir;
            if (str != null) {
                File file = new File(str);
                if (file.exists()) {
                    j = file.length();
                }
            }
            if (VERSION.SDK_INT >= 21) {
                String[] strArr = context.getApplicationInfo().splitPublicSourceDirs;
                if (strArr != null && strArr.length > 0) {
                    for (String file2 : strArr) {
                        File file3 = new File(file2);
                        if (file3.exists()) {
                            j += file3.length();
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return j;
    }

    /* renamed from: h */
    private static void m7478h(Context context) {
        if (context != null && f7938g != null) {
            ArrayList<File> arrayList = new ArrayList<>();
            File cacheDir = context.getCacheDir();
            if (cacheDir != null) {
                m7468a(cacheDir.getParentFile(), (List<File>) arrayList);
            }
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                externalCacheDir = externalCacheDir.getParentFile();
                m7468a(externalCacheDir, (List<File>) arrayList);
            }
            if (arrayList.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    StringBuilder sb = new StringBuilder();
                    for (File file : arrayList) {
                        if (!externalCacheDir.getName().endsWith(".so")) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(file.getAbsolutePath());
                            sb2.append(":");
                            sb2.append((file.length() / 1024) / 1024);
                            sb2.append("#");
                            sb.append(sb2.toString());
                        }
                    }
                    jSONObject.put("files", sb.toString());
                } catch (Exception unused) {
                }
                new StringBuilder("large files \n").append(jSONObject.toString());
                f7938g.mo7072a("large_files_v2", jSONObject);
            }
        }
    }

    /* renamed from: i */
    private static void m7479i(Context context) {
        f7939h = 0;
        if (f7933b && context != null) {
            ArrayList<C2560a> arrayList = new ArrayList<>();
            File cacheDir = context.getCacheDir();
            if (cacheDir != null) {
                File parentFile = cacheDir.getParentFile();
                StringBuilder sb = new StringBuilder();
                sb.append(cacheDir.getAbsolutePath());
                sb.append(File.separator);
                sb.append("ptree.txt");
                m7467a(parentFile, sb.toString(), C2561b.p, arrayList);
            }
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                File parentFile2 = externalCacheDir.getParentFile();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(externalCacheDir.getAbsolutePath());
                sb2.append(File.separator);
                sb2.append("etree.txt");
                m7467a(parentFile2, sb2.toString(), C2561b.e, arrayList);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                for (C2560a aVar : arrayList) {
                    new StringBuilder("black: ").append(aVar.mo7069b());
                    f7939h += aVar.f7948a;
                    String b = aVar.mo7069b();
                    if (b != null) {
                        jSONObject.put(b.replace("/", "_"), (aVar.f7948a / 1024) / 1024);
                    }
                }
            } catch (Exception unused) {
            }
            C2549b.m7463a(context, arrayList);
            if (f7938g != null) {
                f7938g.mo7073a("black_storage", null, jSONObject, null);
            }
        }
    }

    /* renamed from: f */
    private static void m7476f(Context context) {
        boolean z;
        List<String> list;
        if (f7938g != null) {
            try {
                m7479i(context);
                m7471b();
                JSONObject jSONObject = new JSONObject();
                long a = C2562f.m7492a(context.getCacheDir().getParent());
                long a2 = C2562f.m7492a(context.getExternalCacheDir().getParent());
                long j = 0;
                File b = C12662c.m25457b(context);
                if (b != null) {
                    j = C2562f.m7492a(b.getParent());
                }
                jSONObject.put("private_size", a);
                jSONObject.put("external_size", a2);
                jSONObject.put("sdcard_size", j);
                jSONObject.put("total_size", a + a2);
                jSONObject.put("device_size", C2562f.m7490a());
                jSONObject.put("available_size", C2562f.m7497b());
                jSONObject.put("apk_size", m7477g(context));
                String str = "strategy_enabled";
                int i = 1;
                if (!C12662c.m25456a() || C12661b.m25446a(context) == null || !C12661b.m25446a(context).mo23793a()) {
                    z = false;
                } else {
                    z = true;
                }
                jSONObject.put(str, z);
                ArrayList arrayList = new ArrayList();
                m7470a(jSONObject, (List<String>) arrayList);
                jSONObject.put("black_size", f7939h);
                f7938g.mo7072a("storage_usage", jSONObject);
                if (f7940i == null) {
                    list = null;
                } else {
                    list = f7940i.f7959c;
                }
                List<Entry> a3 = C2563g.m7501a(context, list, arrayList);
                if (a3 != null && a3.size() > 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Entry entry : a3) {
                        StringBuilder sb = new StringBuilder("black ");
                        sb.append((String) entry.getKey());
                        sb.append(" ");
                        sb.append(entry.getValue());
                        StringBuilder sb2 = new StringBuilder("top_dir");
                        int i2 = i + 1;
                        sb2.append(i);
                        jSONObject2.put(sb2.toString(), entry.getKey());
                        i = i2;
                    }
                    f7938g.mo7072a("black", jSONObject2);
                }
                m7478h(context);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m7466a(final Context context, C2567j jVar) {
        long j;
        long j2;
        int i;
        long j3;
        if (!f7936e) {
            f7936e = true;
            f7940i = jVar;
            f7934c = jVar.f7961e;
            f7935d = jVar.f7957a;
            f7938g = jVar.f7958b;
            f7937f = jVar.f7960d;
            C2559e.f7947c = jVar.f7959c;
            if (f7934c == null || f7934c.f7915d <= 0) {
                j = 3145728;
            } else {
                j = ((long) f7934c.f7915d) * 1024;
            }
            C2559e.f7945a = j;
            if (f7934c == null || f7934c.f7920i <= 0) {
                j2 = 1048576;
            } else {
                j2 = ((long) f7934c.f7920i) * 1024;
            }
            C2559e.f7946b = j2;
            C2549b.f7924d = jVar.f7962f;
            C2549b.f7927g = jVar.f7958b;
            C2549b.f7926f = jVar.f7957a;
            int i2 = 10;
            if (f7934c == null || f7934c.f7917f <= 0) {
                i = 10;
            } else {
                i = f7934c.f7917f;
            }
            C2549b.f7921a = i;
            if (f7934c == null || f7934c.f7916e <= 0) {
                j3 = 2592000000L;
            } else {
                j3 = ((long) f7934c.f7916e) * FbUploadTokenTime.group0;
            }
            C2549b.f7922b = j3;
            if (f7934c != null && f7934c.f7918g > 0) {
                i2 = f7934c.f7918g;
            }
            C2549b.f7923c = i2;
            C0013i.m18a((Callable<TResult>) new Callable<Object>() {
                public final Object call() {
                    Context context = context;
                    if (context != null) {
                        SharedPreferences a = C35807d.m80935a(context, "clean_storage_pref", 0);
                        int i = a.getInt("key_start_time", 0);
                        if (i > 5) {
                            C2553c.f7933b = true;
                        } else {
                            a.edit().putInt("key_start_time", i + 1).apply();
                        }
                    }
                    Context context2 = context;
                    if (!C2549b.f7928h) {
                        C2549b.f7928h = true;
                        if (context2 != null) {
                            List<C2575n> a2 = C2549b.m7462a(context2);
                            if (a2 != null && a2.size() > 0) {
                                C2549b.f7925e = new ArrayList(a2.size());
                                for (C2575n nVar : a2) {
                                    if (!(nVar == null || nVar.f7973b == null)) {
                                        new StringBuilder("new observer ").append(nVar.f7973b);
                                        if (new File(nVar.f7973b).exists()) {
                                            C2551a aVar = new C2551a(context2, nVar, 547);
                                            C2549b.f7925e.add(aVar);
                                            aVar.startWatching();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return null;
                }
            }, (Executor) C24076h.m58902c());
        }
    }

    /* renamed from: a */
    private static void m7468a(File file, List<File> list) {
        if (file != null && file.exists() && list != null) {
            int i = 0;
            if (file.isFile()) {
                if (file != null) {
                    long j = 50;
                    if (f7934c != null && f7934c.f7919h > 0) {
                        j = (long) f7934c.f7919h;
                    }
                    if (file.length() > j * 1024 * 1024) {
                        i = 1;
                    }
                }
                if (i != 0) {
                    list.add(file);
                }
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                while (i < length) {
                    m7468a(listFiles[i], list);
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m7470a(JSONObject jSONObject, List<String> list) {
        if (f7937f != null && !f7937f.isEmpty()) {
            for (C2576o oVar : f7937f) {
                if (oVar != null) {
                    try {
                        jSONObject.put(oVar.f7978b, oVar.f7979c);
                        new StringBuilder("watch ").append(oVar.f7977a);
                        if (oVar.f7980d != null && !oVar.f7980d.isEmpty()) {
                            for (C2577a aVar : oVar.f7980d) {
                                if (aVar != null) {
                                    jSONObject.put(aVar.f7982b, aVar.f7983c);
                                    if (aVar.f7984d != null) {
                                        new StringBuilder("watch ").append(aVar.f7984d.getAbsolutePath());
                                        list.add(aVar.f7984d.getAbsolutePath());
                                    }
                                }
                            }
                        }
                        list.add(oVar.f7977a);
                    } catch (JSONException unused) {
                    }
                }
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x005e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0064 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x006a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m7467a(java.io.File r2, java.lang.String r3, com.aweme.storage.C2559e.C2561b r4, java.util.List<com.aweme.storage.C2559e.C2560a> r5) {
        /*
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            r1 = 0
            com.aweme.storage.e$a r2 = com.aweme.storage.C2559e.m7481a(r2, r1, r4)
            if (r2 != 0) goto L_0x0010
            return
        L_0x0010:
            boolean r4 = r0.exists()
            if (r4 != 0) goto L_0x001c
            r0.createNewFile()     // Catch:{ IOException -> 0x001a }
            goto L_0x0026
        L_0x001a:
            goto L_0x0026
        L_0x001c:
            com.aweme.storage.e$a r4 = com.aweme.storage.C2559e.m7482a(r3)
            if (r4 != 0) goto L_0x0023
            return
        L_0x0023:
            com.aweme.storage.C2559e.m7483a(r4, r2, r5)
        L_0x0026:
            if (r2 == 0) goto L_0x006f
            if (r3 != 0) goto L_0x002b
            goto L_0x006f
        L_0x002b:
            org.json.JSONObject r2 = r2.mo7070c()
            java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0069, IOException -> 0x0063, Exception -> 0x005d, all -> 0x0058 }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0069, IOException -> 0x0063, Exception -> 0x005d, all -> 0x0058 }
            boolean r3 = r4.exists()     // Catch:{ FileNotFoundException -> 0x0069, IOException -> 0x0063, Exception -> 0x005d, all -> 0x0058 }
            if (r3 != 0) goto L_0x003d
            r4.createNewFile()     // Catch:{ FileNotFoundException -> 0x0069, IOException -> 0x0063, Exception -> 0x005d, all -> 0x0058 }
        L_0x003d:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0069, IOException -> 0x0063, Exception -> 0x005d, all -> 0x0058 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0069, IOException -> 0x0063, Exception -> 0x005d, all -> 0x0058 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x006a, IOException -> 0x0064, Exception -> 0x005e, all -> 0x0055 }
            byte[] r2 = r2.getBytes()     // Catch:{ FileNotFoundException -> 0x006a, IOException -> 0x0064, Exception -> 0x005e, all -> 0x0055 }
            r3.write(r2)     // Catch:{ FileNotFoundException -> 0x006a, IOException -> 0x0064, Exception -> 0x005e, all -> 0x0055 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x006a, IOException -> 0x0064, Exception -> 0x005e, all -> 0x0055 }
            r3.close()     // Catch:{ Exception -> 0x0054 }
            return
        L_0x0054:
            return
        L_0x0055:
            r2 = move-exception
            r1 = r3
            goto L_0x0059
        L_0x0058:
            r2 = move-exception
        L_0x0059:
            r1.close()     // Catch:{ Exception -> 0x005c }
        L_0x005c:
            throw r2
        L_0x005d:
            r3 = r1
        L_0x005e:
            r3.close()     // Catch:{ Exception -> 0x0062 }
            return
        L_0x0062:
            return
        L_0x0063:
            r3 = r1
        L_0x0064:
            r3.close()     // Catch:{ Exception -> 0x0068 }
            return
        L_0x0068:
            return
        L_0x0069:
            r3 = r1
        L_0x006a:
            r3.close()     // Catch:{ Exception -> 0x006e }
            return
        L_0x006e:
            return
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aweme.storage.C2553c.m7467a(java.io.File, java.lang.String, com.aweme.storage.e$b, java.util.List):void");
    }
}
