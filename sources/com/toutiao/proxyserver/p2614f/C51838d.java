package com.toutiao.proxyserver.p2614f;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.toutiao.proxyserver.C51880o;
import com.toutiao.proxyserver.C51895s;
import com.toutiao.proxyserver.C51918x;
import com.toutiao.proxyserver.net.C51873c;
import com.toutiao.proxyserver.net.C51874d;
import com.toutiao.proxyserver.net.C51877e;
import com.toutiao.proxyserver.p2610b.C51807a;
import com.toutiao.proxyserver.p2610b.C51809c;
import com.toutiao.proxyserver.p2612d.C51820c;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.toutiao.proxyserver.f.d */
public final class C51838d {

    /* renamed from: a */
    public static final Charset f129327a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final Handler f129328b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static final ExecutorService f129329c;

    /* renamed from: a */
    public static void m111178a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m111182a(String str) {
        return str != null && (str.startsWith("http://") || str.startsWith("https://"));
    }

    /* renamed from: a */
    public static List<String> m111172a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (m111182a(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m111174a(C51877e eVar, boolean z, boolean z2) throws C51918x {
        if (eVar == null) {
            C51820c.m111145d("TAG_PROXY_Response", "response null");
            throw new C51918x("response null", 10);
        } else if (!eVar.mo107382a()) {
            StringBuilder sb = new StringBuilder("response code: ");
            sb.append(eVar.f129420b);
            C51820c.m111145d("TAG_PROXY_Response", sb.toString());
            final JSONObject a = m111173a(eVar, eVar.f129419a);
            if (eVar.f129420b == 416) {
                final C51880o b = C51895s.m111279b();
                if (b != null) {
                    m111186b((Runnable) new Runnable() {
                        public final void run() {
                            b.mo95384a(a);
                        }
                    });
                }
            }
            StringBuilder sb2 = new StringBuilder("response code: ");
            sb2.append(eVar.f129420b);
            sb2.append(" Error extra: ");
            sb2.append(a.toString());
            throw new C51918x(sb2.toString(), eVar.f129420b);
        } else {
            String a2 = eVar.mo107380a("Content-Type");
            if (!m111189d(a2)) {
                StringBuilder sb3 = new StringBuilder("Content-Type: ");
                sb3.append(a2);
                sb3.append(", url: ");
                sb3.append(eVar.f129419a.f129407a);
                C51820c.m111145d("TAG_PROXY_Response", sb3.toString());
                String str = null;
                if (m111190e(a2)) {
                    str = m111171a(eVar.mo107386d());
                    int i = 500;
                    if (str.length() <= 500) {
                        i = str.length();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        str = str.substring(0, i - 1);
                    }
                }
                StringBuilder sb4 = new StringBuilder("Content-Type: ");
                sb4.append(a2);
                sb4.append(", extra:");
                sb4.append(str);
                sb4.append(", url: ");
                sb4.append(eVar.f129419a.f129407a);
                throw new C51918x(sb4.toString(), 11);
            }
            int a3 = m111166a(eVar);
            if (a3 > 0) {
                if (z) {
                    if (!"http/1.0".equalsIgnoreCase(eVar.mo107383b())) {
                        String a4 = eVar.mo107380a("Accept-Ranges");
                        if (eVar.f129420b != 206 && (a4 == null || !a4.contains("bytes"))) {
                            StringBuilder sb5 = new StringBuilder("Accept-Ranges: ");
                            sb5.append(a4);
                            sb5.append(", url: ");
                            sb5.append(eVar.f129419a.f129407a);
                            C51820c.m111145d("TAG_PROXY_Response", sb5.toString());
                            StringBuilder sb6 = new StringBuilder("Accept-Ranges: ");
                            sb6.append(a4);
                            sb6.append(", url: ");
                            sb6.append(eVar.f129419a.f129407a);
                            throw new C51918x(sb6.toString(), 14);
                        }
                    } else {
                        throw new C51918x("http/1.0 do not support range request.", 13);
                    }
                }
                if (z2 && eVar.mo107386d() == null) {
                    C51820c.m111145d("TAG_PROXY_Response", "response body null");
                    throw new C51918x("response body null", 10);
                }
                return;
            }
            StringBuilder sb7 = new StringBuilder("Content-Length: ");
            sb7.append(a3);
            C51820c.m111145d("TAG_PROXY_Response", sb7.toString());
            StringBuilder sb8 = new StringBuilder("Content-Length: ");
            sb8.append(a3);
            throw new C51918x(sb8.toString(), 12);
        }
    }

    /* renamed from: a */
    private static JSONObject m111173a(C51877e eVar, C51874d dVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Range", dVar.mo107374a("Range"));
            jSONObject.put("Vpwp-Type", dVar.mo107374a("Vpwp-Type"));
            jSONObject.put("Vpwp-Mp-Range", dVar.mo107374a("Vpwp-Mp-Range"));
            jSONObject.put("Content-Range", eVar.mo107380a("Content-Range"));
            jSONObject.put("Content-Type", eVar.mo107380a("Content-Type"));
            jSONObject.put("Content-Length", eVar.mo107380a("Content-Length"));
            jSONObject.put("url", eVar.f129419a.f129407a);
            String a = dVar.mo107374a("Vpwp-Key");
            jSONObject.put("Vpwp-Key", a);
            int b = m111183b(dVar.mo107374a("Vpwp-Flag"));
            if (b != 1) {
                b = 0;
            }
            C51809c cVar = C51895s.f129468c;
            if (cVar != null) {
                C51807a a2 = cVar.mo107300a(a, b);
                if (a2 != null) {
                    jSONObject.put("DB-Content-Type", a2.f129273b);
                    jSONObject.put("DB-Content-Length", a2.f129274c);
                    jSONObject.put("DB-extra", a2.f129276e);
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m111177a(Runnable runnable) {
        if (m111187b()) {
            f129329c.execute(runnable);
            C51820c.m111143c("TAG_PROXY_UTIL", "invoke in pool thread");
            return;
        }
        runnable.run();
        C51820c.m111143c("TAG_PROXY_UTIL", "invoke calling thread");
    }

    /* renamed from: a */
    public static void m111179a(List<C51873c> list) {
        if (list != null) {
            C51820c.m111141b("TAG_PROXY_PRE_FILTER", list.toString());
            m111180a(list, "Host");
            m111180a(list, "Keep-Alive");
            List<C51873c> b = m111185b(list, "Connection");
            if (b != null && !b.isEmpty()) {
                for (C51873c cVar : b) {
                    List<String> f = m111191f(cVar.f129406b);
                    if (f != null) {
                        for (String a : f) {
                            m111180a(list, a);
                        }
                    }
                }
            }
            m111180a(list, "Connection");
            List<C51873c> b2 = m111185b(list, "Proxy-Connection");
            if (b2 != null && !b2.isEmpty()) {
                for (C51873c cVar2 : b2) {
                    List<String> f2 = m111191f(cVar2.f129406b);
                    if (f2 != null) {
                        for (String a2 : f2) {
                            m111180a(list, a2);
                        }
                    }
                }
            }
            m111180a(list, "Proxy-Connection");
            C51820c.m111141b("TAG_PROXY_PRE_FILTER", list.toString());
        }
    }

    /* renamed from: a */
    private static void m111180a(List<C51873c> list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C51873c) it.next()).f129405a.equalsIgnoreCase(str)) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public static void m111181a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    private static boolean m111187b() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f129329c = threadPoolExecutor;
    }

    /* renamed from: a */
    public static int m111165a() {
        if (VERSION.SDK_INT >= 17) {
            return Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (file.exists()) {
                File[] listFiles = file.listFiles(new FilenameFilter() {

                    /* renamed from: a */
                    private Pattern f129330a = Pattern.compile("^cpu[0-9]+$");

                    public final boolean accept(File file, String str) {
                        return this.f129330a.matcher(str).matches();
                    }
                });
                if (listFiles != null) {
                    return Math.max(listFiles.length, 1);
                }
                return 1;
            }
        } catch (Throwable unused) {
        }
        return 1;
    }

    /* renamed from: a */
    public static void m111175a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static int m111183b(String str) {
        return m111167a(str, 0);
    }

    /* renamed from: b */
    public static void m111186b(Runnable runnable) {
        if (m111187b()) {
            runnable.run();
        } else {
            f129328b.post(runnable);
        }
    }

    /* renamed from: e */
    private static boolean m111190e(String str) {
        if (str == null || !str.startsWith("text/")) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:1|2|3|4|5) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0009 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m111176a(java.io.RandomAccessFile r1) {
        /*
            if (r1 == 0) goto L_0x000d
            java.io.FileDescriptor r0 = r1.getFD()     // Catch:{ Throwable -> 0x0009 }
            r0.sync()     // Catch:{ Throwable -> 0x0009 }
        L_0x0009:
            r1.close()     // Catch:{ Throwable -> 0x000d }
            return
        L_0x000d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.p2614f.C51838d.m111176a(java.io.RandomAccessFile):void");
    }

    /* renamed from: d */
    private static boolean m111189d(String str) {
        if (str == null || (!str.startsWith("video/") && !"application/octet-stream".equals(str) && !"binary/octet-stream".equals(str))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static String m111184b(List<C51873c> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (C51873c cVar : list) {
            sb.append(cVar.f129405a);
            sb.append(": ");
            sb.append(cVar.f129406b);
            sb.append("\r\n");
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m111188c(String str) {
        if (str == null) {
            return "";
        }
        int length = str.length();
        StringBuilder sb = null;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt > 31 || charAt == 9) && charAt < 127) {
                if (sb != null) {
                    sb.append(charAt);
                }
            } else if (sb == null) {
                sb = new StringBuilder(str.substring(0, i));
            }
        }
        if (sb == null) {
            return str;
        }
        return sb.toString();
    }

    /* renamed from: f */
    private static List<String> m111191f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!TextUtils.isEmpty(str2)) {
                String trim = str2.trim();
                if (!TextUtils.isEmpty(trim)) {
                    arrayList.add(trim);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static int m111166a(C51877e eVar) {
        if (eVar == null) {
            return -1;
        }
        if (eVar.f129420b == 200) {
            return m111167a(eVar.mo107380a("Content-Length"), -1);
        }
        if (eVar.f129420b == 206) {
            String a = eVar.mo107380a("Content-Range");
            if (!TextUtils.isEmpty(a)) {
                int lastIndexOf = a.lastIndexOf("/");
                if (lastIndexOf >= 0 && lastIndexOf < a.length() - 1) {
                    return m111167a(a.substring(lastIndexOf + 1), -1);
                }
            }
        }
        return -1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x002a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m111171a(java.io.InputStream r4) {
        /*
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r4)
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x000f:
            java.lang.String r2 = r0.readLine()     // Catch:{ IOException -> 0x002a, all -> 0x002e }
            if (r2 == 0) goto L_0x002a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x002a, all -> 0x002e }
            r3.<init>()     // Catch:{ IOException -> 0x002a, all -> 0x002e }
            r3.append(r2)     // Catch:{ IOException -> 0x002a, all -> 0x002e }
            java.lang.String r2 = "\n"
            r3.append(r2)     // Catch:{ IOException -> 0x002a, all -> 0x002e }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x002a, all -> 0x002e }
            r1.append(r2)     // Catch:{ IOException -> 0x002a, all -> 0x002e }
            goto L_0x000f
        L_0x002a:
            r4.close()     // Catch:{ IOException -> 0x0033 }
            goto L_0x0033
        L_0x002e:
            r0 = move-exception
            r4.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            throw r0
        L_0x0033:
            java.lang.String r4 = r1.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.p2614f.C51838d.m111171a(java.io.InputStream):java.lang.String");
    }

    /* renamed from: a */
    private static int m111167a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: b */
    private static List<C51873c> m111185b(List<C51873c> list, String str) {
        ArrayList arrayList = null;
        for (C51873c cVar : list) {
            if (cVar.f129405a.equalsIgnoreCase(str)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m111169a(C51807a aVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (i <= 0) {
            sb.append("HTTP/1.1 200 OK\r\n");
        } else {
            sb.append("HTTP/1.1 206 Partial Content\r\n");
        }
        sb.append("Accept-Ranges: bytes\r\n");
        sb.append("Content-Type: ");
        sb.append(aVar.f129273b);
        sb.append("\r\n");
        if (i <= 0) {
            sb.append("Content-Length: ");
            sb.append(aVar.f129274c);
            sb.append("\r\n");
        } else {
            sb.append("Content-Range: bytes ");
            sb.append(i);
            sb.append("-");
            sb.append(aVar.f129274c - 1);
            sb.append("/");
            sb.append(aVar.f129274c);
            sb.append("\r\n");
            sb.append("Content-Length: ");
            sb.append(aVar.f129274c - i);
            sb.append("\r\n");
        }
        sb.append("Connection: close\r\n");
        sb.append("\r\n");
        String sb2 = sb.toString();
        C51820c.m111141b("TAG_PROXY_WRITE_TO_MP", sb2);
        return sb2;
    }

    /* renamed from: a */
    public static String m111170a(C51877e eVar, int i) {
        if (eVar == null || !eVar.mo107382a()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(eVar.mo107383b().toUpperCase());
        sb.append(' ');
        sb.append(eVar.f129420b);
        sb.append(' ');
        sb.append(eVar.mo107384c());
        sb.append("\r\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(eVar.mo107383b().toUpperCase());
        sb2.append(" ");
        sb2.append(eVar.f129420b);
        sb2.append(" ");
        sb2.append(eVar.mo107384c());
        C51820c.m111141b("TAG_PROXY_headers", sb2.toString());
        List<C51873c> list = eVar.f129421c;
        m111179a(list);
        boolean z = true;
        for (C51873c cVar : list) {
            String str = cVar.f129405a;
            String str2 = cVar.f129406b;
            sb.append(str);
            sb.append(": ");
            sb.append(str2);
            sb.append("\r\n");
            if ("Content-Range".equalsIgnoreCase(str) || ("Accept-Ranges".equalsIgnoreCase(str) && "bytes".equalsIgnoreCase(str2))) {
                z = false;
            }
        }
        if (z) {
            int a = m111166a(eVar);
            if (a > 0) {
                sb.append("Content-Range: bytes ");
                sb.append(Math.max(i, 0));
                sb.append("-");
                sb.append(a - 1);
                sb.append("/");
                sb.append(a);
                sb.append("\r\n");
            }
        }
        sb.append("Connection: close\r\n");
        sb.append("\r\n");
        String sb3 = sb.toString();
        C51820c.m111141b("TAG_PROXY_WRITE_TO_MP", sb3);
        return sb3;
    }

    /* renamed from: a */
    public static C51807a m111168a(C51877e eVar, C51809c cVar, String str, int i) {
        String str2;
        C51807a a = cVar.mo107300a(str, i);
        if (a == null) {
            int a2 = m111166a(eVar);
            String a3 = eVar.mo107380a("Content-Type");
            if (a2 > 0 && !TextUtils.isEmpty(a3)) {
                String str3 = eVar.f129419a.f129407a;
                String b = m111184b(eVar.f129419a.f129409c);
                String b2 = m111184b(eVar.f129421c);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestUrl", str3);
                    jSONObject.put("requestHeaders", b);
                    jSONObject.put("responseHeaders", b2);
                    str2 = jSONObject.toString();
                } catch (Throwable unused) {
                    str2 = "";
                }
                C51807a aVar = new C51807a(str, a3, a2, i, str2);
                Map map = (Map) cVar.f129278a.get(aVar.f129275d);
                if (map != null) {
                    map.put(aVar.f129272a, aVar);
                }
                cVar.f129280c.execute(new Runnable(aVar) {

                    /* renamed from: a */
                    final /* synthetic */ C51807a f129282a;

                    public final void run() {
                        try {
                            if (C51809c.this.f129281d == null) {
                                C51809c.this.f129281d = C51809c.this.f129279b.getWritableDatabase().compileStatement("INSERT INTO video_http_header_t (key,mime,contentLength,flag,extra) VALUES(?,?,?,?,?)");
                            } else {
                                C51809c.this.f129281d.clearBindings();
                            }
                            C51809c.this.f129281d.bindString(1, this.f129282a.f129272a);
                            C51809c.this.f129281d.bindString(2, this.f129282a.f129273b);
                            C51809c.this.f129281d.bindLong(3, (long) this.f129282a.f129274c);
                            C51809c.this.f129281d.bindLong(4, (long) this.f129282a.f129275d);
                            C51809c.this.f129281d.bindString(5, this.f129282a.f129276e);
                            C51809c.this.f129281d.executeInsert();
                        } catch (Throwable unused) {
                        }
                    }

                    {
                        this.f129282a = r2;
                    }
                });
                return aVar;
            }
        }
        return a;
    }
}
