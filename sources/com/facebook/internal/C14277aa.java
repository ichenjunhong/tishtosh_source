package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.facebook.C14457k;
import com.facebook.C14533n;
import com.facebook.C14696t;
import com.facebook.C14697u;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C13501b;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.internal.aa */
public final class C14277aa {

    /* renamed from: a */
    private static int f37190a = 0;

    /* renamed from: b */
    private static long f37191b = -1;

    /* renamed from: c */
    private static long f37192c = -1;

    /* renamed from: d */
    private static long f37193d = -1;

    /* renamed from: e */
    private static String f37194e = "";

    /* renamed from: f */
    private static String f37195f = "";

    /* renamed from: g */
    private static String f37196g = "NoCarrier";

    /* renamed from: com.facebook.internal.aa$a */
    public interface C14280a {
        /* renamed from: a */
        void mo25330a(C14457k kVar);

        /* renamed from: a */
        void mo25331a(JSONObject jSONObject);
    }

    /* renamed from: com.facebook.internal.aa$b */
    public interface C14281b<T, K> {
        /* renamed from: a */
        K mo26483a(T t);
    }

    /* renamed from: com.facebook.internal.aa$c */
    public static class C14282c {

        /* renamed from: a */
        public List<String> f37199a;

        /* renamed from: b */
        public List<String> f37200b;

        /* renamed from: c */
        public List<String> f37201c;

        public C14282c(List<String> list, List<String> list2, List<String> list3) {
            this.f37199a = list;
            this.f37200b = list2;
            this.f37201c = list3;
        }
    }

    /* renamed from: a */
    public static <T> boolean m29277a(Collection<T> collection) {
        return collection == null || collection.size() == 0;
    }

    /* renamed from: a */
    public static boolean m29276a(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: a */
    public static String m29253a(String str, String str2) {
        return m29276a(str) ? str2 : str;
    }

    /* renamed from: a */
    public static <T> Collection<T> m29257a(T... tArr) {
        return Collections.unmodifiableCollection(Arrays.asList(tArr));
    }

    /* renamed from: a */
    static String m29254a(String str, byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b >> 4) & 15));
                sb.append(Integer.toHexString((b >> 0) & 15));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m29265a(Bundle bundle, String str, String str2) {
        if (!m29276a(str2)) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: a */
    public static void m29264a(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            m29265a(bundle, str, uri.toString());
        }
    }

    /* renamed from: a */
    public static boolean m29274a(Bundle bundle, String str, Object obj) {
        if (obj == null) {
            bundle.remove(str);
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else if (obj instanceof JSONArray) {
            bundle.putString(str, obj.toString());
        } else if (!(obj instanceof JSONObject)) {
            return false;
        } else {
            bundle.putString(str, obj.toString());
        }
        return true;
    }

    /* renamed from: a */
    public static void m29267a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m29271a(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    /* renamed from: a */
    public static Map<String, String> m29262a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            String optString = jSONObject.optString(str);
            if (optString != null) {
                hashMap.put(str, optString);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private static void m29263a(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=");
                if (split2.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(split2[0].trim());
                    sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                    instance.setCookie(str, sb.toString());
                }
            }
            instance.removeExpiredCookie();
        }
    }

    /* renamed from: a */
    public static void m29270a(String str, String str2, Throwable th) {
        if (C14533n.m29769c()) {
            m29276a(str);
        }
    }

    /* renamed from: a */
    public static <T> boolean m29275a(T t, T t2) {
        if (t == null) {
            return t2 == null;
        }
        return t.equals(t2);
    }

    /* renamed from: a */
    public static void m29268a(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File a : listFiles) {
                        m29268a(a);
                    }
                }
            }
            file.delete();
        }
    }

    /* renamed from: a */
    public static List<String> m29260a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m29273a(JSONObject jSONObject, C14295b bVar, String str, boolean z) throws JSONException {
        if (!(bVar == null || bVar.f37239a == null)) {
            jSONObject.put("attribution", bVar.f37239a);
        }
        if (!(bVar == null || bVar.mo26512a() == null)) {
            jSONObject.put("advertiser_id", bVar.mo26512a());
            jSONObject.put("advertiser_tracking_enabled", !bVar.f37241c);
        }
        if (!(bVar == null || bVar.f37240b == null)) {
            jSONObject.put("installer_package", bVar.f37240b);
        }
        jSONObject.put("anon_id", str);
        jSONObject.put("application_tracking_enabled", !z);
    }

    /* renamed from: a */
    public static void m29272a(JSONObject jSONObject, Context context) throws JSONException {
        int i;
        Locale locale;
        int i2;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        m29294e(context);
        String packageName = context.getPackageName();
        String str = "";
        int i3 = 0;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            i = packageInfo.versionCode;
            try {
                str = packageInfo.versionName;
            } catch (NameNotFoundException unused) {
            }
        } catch (NameNotFoundException unused2) {
            i = -1;
        }
        jSONArray.put(packageName);
        jSONArray.put(i);
        jSONArray.put(str);
        jSONArray.put(VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused3) {
            locale = Locale.getDefault();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        sb.append("_");
        sb.append(locale.getCountry());
        jSONArray.put(sb.toString());
        jSONArray.put(f37194e);
        jSONArray.put(f37196g);
        double d = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                i2 = displayMetrics.widthPixels;
                try {
                    try {
                        d = (double) displayMetrics.density;
                    } catch (Exception unused4) {
                    }
                    i3 = displayMetrics.heightPixels;
                } catch (Exception unused5) {
                }
                jSONArray.put(i2);
                jSONArray.put(i3);
                jSONArray.put(new DecimalFormat("#.##").format(d));
                jSONArray.put(m29285c());
                jSONArray.put(f37192c);
                jSONArray.put(f37193d);
                jSONArray.put(f37195f);
                jSONObject.put("extinfo", jSONArray.toString());
            }
        } catch (Exception unused6) {
        }
        i2 = 0;
        jSONArray.put(i2);
        jSONArray.put(i3);
        jSONArray.put(new DecimalFormat("#.##").format(d));
        jSONArray.put(m29285c());
        jSONArray.put(f37192c);
        jSONArray.put(f37193d);
        jSONArray.put(f37195f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    /* renamed from: a */
    public static Method m29255a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Method m29256a(String str, String str2, Class<?>... clsArr) {
        try {
            return m29255a(Class.forName(str), str2, clsArr);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <T, K> List<K> m29259a(List<T> list, C14281b<T, K> bVar) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T a : list) {
            Object a2 = bVar.mo26483a(a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Date m29258a(Bundle bundle, String str, Date date) {
        long j;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            j = ((Long) obj).longValue();
        } else if (!(obj instanceof String)) {
            return null;
        } else {
            try {
                j = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (j == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date(date.getTime() + (j * 1000));
    }

    /* renamed from: a */
    public static void m29266a(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    /* renamed from: a */
    public static Map<String, String> m29261a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m29269a(final String str, final C14280a aVar) {
        JSONObject a = C14365x.m29467a(str);
        if (a != null) {
            aVar.mo25331a(a);
            return;
        }
        C142781 r0 = new C13501b() {
            /* renamed from: a */
            public final void mo25316a(C14696t tVar) {
                if (tVar.f38086d != null) {
                    aVar.mo25330a(tVar.f38086d.f35211n);
                    return;
                }
                C14365x.f37364a.put(str, tVar.f38084b);
                aVar.mo25331a(tVar.f38084b);
            }
        };
        GraphRequest d = m29289d(str);
        d.mo25313a((C13501b) r0);
        d.mo25314b();
    }

    /* renamed from: e */
    private static boolean m29295e() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: a */
    public static String m29249a() {
        Context g = C14533n.m29773g();
        if (g == null) {
            return null;
        }
        try {
            return g.getPackageManager().getPackageInfo(g.getPackageName(), 0).versionName;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static int m29285c() {
        if (f37190a > 0) {
            return f37190a;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() {
                public final boolean accept(File file, String str) {
                    return Pattern.matches("cpu[0-9]+", str);
                }
            });
            if (listFiles != null) {
                f37190a = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f37190a <= 0) {
            f37190a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f37190a;
    }

    /* renamed from: d */
    private static void m29290d() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            f37194e = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            f37195f = timeZone.getID();
        } catch (AssertionError unused) {
        } catch (Exception unused2) {
        }
    }

    /* renamed from: f */
    private static void m29296f() {
        try {
            if (m29295e()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f37193d = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            f37193d = m29245a((double) f37193d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    private static void m29298g() {
        try {
            if (m29295e()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f37192c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            f37192c = m29245a((double) f37192c);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static Locale m29281b() {
        try {
            return C14533n.m29773g().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return Locale.getDefault();
        }
    }

    /* renamed from: a */
    private static long m29245a(double d) {
        return Math.round(d / 1.073741824E9d);
    }

    /* renamed from: b */
    public static String m29278b(String str) {
        if (str == null) {
            return null;
        }
        return m29279b("SHA-256", str);
    }

    /* renamed from: c */
    public static String m29287c(Context context) {
        if (context == null) {
            return TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        return context.getClass().getSimpleName();
    }

    /* renamed from: d */
    public static GraphRequest m29289d(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
        bundle.putString("access_token", str);
        GraphRequest graphRequest = new GraphRequest(null, "me", bundle, C14697u.GET, null);
        return graphRequest;
    }

    /* renamed from: f */
    private static void m29297f(Context context) {
        if (f37196g.equals("NoCarrier")) {
            try {
                f37196g = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static <T> List<T> m29280b(T... tArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            T t = tArr[i];
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m29293e(android.net.Uri r9) {
        /*
            r0 = 0
            android.content.Context r1 = com.facebook.C14533n.m29773g()     // Catch:{ all -> 0x0027 }
            android.content.ContentResolver r2 = r1.getContentResolver()     // Catch:{ all -> 0x0027 }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r9
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = "_size"
            int r0 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x0025 }
            r9.moveToFirst()     // Catch:{ all -> 0x0025 }
            long r0 = r9.getLong(r0)     // Catch:{ all -> 0x0025 }
            if (r9 == 0) goto L_0x0024
            r9.close()
        L_0x0024:
            return r0
        L_0x0025:
            r0 = move-exception
            goto L_0x002b
        L_0x0027:
            r9 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
        L_0x002b:
            if (r9 == 0) goto L_0x0030
            r9.close()
        L_0x0030:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C14277aa.m29293e(android.net.Uri):long");
    }

    /* renamed from: c */
    public static Bundle m29286c(String str) {
        Bundle bundle = new Bundle();
        if (!m29276a(str)) {
            for (String split : str.split("&")) {
                String[] split2 = split.split("=");
                try {
                    if (split2.length == 2) {
                        bundle.putString(URLDecoder.decode(split2[0], "UTF-8"), URLDecoder.decode(split2[1], "UTF-8"));
                    } else if (split2.length == 1) {
                        bundle.putString(URLDecoder.decode(split2[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
        return bundle;
    }

    /* renamed from: d */
    public static boolean m29291d(Context context) {
        if (VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        if (Build.DEVICE == null || !Build.DEVICE.matches(".+_cheets|cheets_.+")) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static void m29294e(Context context) {
        if (f37191b == -1 || System.currentTimeMillis() - f37191b >= 1800000) {
            f37191b = System.currentTimeMillis();
            m29290d();
            m29297f(context);
            m29298g();
            m29296f();
        }
    }

    /* renamed from: b */
    public static Set<String> m29282b(JSONArray jSONArray) throws JSONException {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.getString(i));
        }
        return hashSet;
    }

    /* renamed from: c */
    public static boolean m29288c(Uri uri) {
        if (uri == null || !C42311c.f106865i.equalsIgnoreCase(uri.getScheme())) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m29292d(Uri uri) {
        if (uri == null || !"file".equalsIgnoreCase(uri.getScheme())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m29250a(Context context) {
        C14283ab.m29306a((Object) context, "context");
        C14533n.m29760a(context);
        return C14533n.m29777k();
    }

    /* renamed from: b */
    public static void m29283b(Context context) {
        m29263a(context, "facebook.com");
        m29263a(context, ".facebook.com");
        m29263a(context, "https://facebook.com");
        m29263a(context, "https://.facebook.com");
    }

    /* renamed from: a */
    public static String m29251a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.toString();
    }

    /* renamed from: b */
    public static boolean m29284b(Uri uri) {
        if (uri == null || (!WebKitApi.SCHEME_HTTP.equalsIgnoreCase(uri.getScheme()) && !WebKitApi.SCHEME_HTTPS.equalsIgnoreCase(uri.getScheme()) && !"fbstaging".equalsIgnoreCase(uri.getScheme()))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m29252a(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            String sb2 = sb.toString();
                            m29267a((Closeable) bufferedInputStream);
                            m29267a((Closeable) inputStreamReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m29267a((Closeable) bufferedInputStream);
                    m29267a((Closeable) inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                m29267a((Closeable) bufferedInputStream);
                m29267a((Closeable) inputStreamReader);
                throw th;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
            m29267a((Closeable) bufferedInputStream);
            m29267a((Closeable) inputStreamReader);
            throw th;
        }
    }

    /* renamed from: b */
    public static String m29279b(String str, String str2) {
        return m29254a(str, str2.getBytes());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m29244a(java.io.InputStream r6, java.io.OutputStream r7) throws java.io.IOException {
        /*
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0023 }
            r1.<init>(r6)     // Catch:{ all -> 0x0023 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0021 }
            r2 = 0
            r3 = 0
        L_0x000c:
            int r4 = r1.read(r0)     // Catch:{ all -> 0x0021 }
            r5 = -1
            if (r4 == r5) goto L_0x0018
            r7.write(r0, r2, r4)     // Catch:{ all -> 0x0021 }
            int r3 = r3 + r4
            goto L_0x000c
        L_0x0018:
            r1.close()
            if (r6 == 0) goto L_0x0020
            r6.close()
        L_0x0020:
            return r3
        L_0x0021:
            r7 = move-exception
            goto L_0x0025
        L_0x0023:
            r7 = move-exception
            r1 = r0
        L_0x0025:
            if (r1 == 0) goto L_0x002a
            r1.close()
        L_0x002a:
            if (r6 == 0) goto L_0x002f
            r6.close()
        L_0x002f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C14277aa.m29244a(java.io.InputStream, java.io.OutputStream):int");
    }

    /* renamed from: a */
    public static Object m29247a(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        } catch (InvocationTargetException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static Uri m29246a(String str, String str2, Bundle bundle) {
        Builder builder = new Builder();
        builder.scheme(WebKitApi.SCHEME_HTTPS);
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        return builder.build();
    }

    /* renamed from: a */
    public static Object m29248a(JSONObject jSONObject, String str, String str2) throws JSONException {
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new C14457k("Got an unexpected non-JSON object.");
    }
}
