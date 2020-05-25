package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import com.C2240a;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.common.p1037d.C15377d;
import com.google.android.gms.common.util.C15516g;
import com.google.android.gms.common.util.C15521l;
import com.google.android.gms.common.util.C15524o;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
public final class acd {

    /* renamed from: a */
    public static final Handler f40245a = new abw(Looper.getMainLooper());

    /* renamed from: b */
    String f40246b;

    /* renamed from: c */
    public boolean f40247c = false;

    /* renamed from: d */
    private AtomicReference<Pattern> f40248d = new AtomicReference<>(null);

    /* renamed from: e */
    private AtomicReference<Pattern> f40249e = new AtomicReference<>(null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f40250f = true;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Object f40251g = new Object();

    /* renamed from: h */
    private boolean f40252h = false;

    /* renamed from: a */
    public final void mo28667a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        ace.m32632a(httpURLConnection, "User-Agent", mo28670b(context, str));
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public static boolean m32589a(Context context) {
        boolean z;
        Context a = C16380xq.m39015a(context);
        Intent intent = new Intent();
        intent.setClassName(a, "com.google.android.gms.ads.AdActivity");
        boolean z2 = false;
        try {
            ResolveInfo resolveActivity = a.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity == null || resolveActivity.activityInfo == null) {
                abv.m32798e("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            } else {
                String str = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
                if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
                    abv.m32798e(C2240a.m6772a(str, new Object[]{"keyboard"}));
                    z = false;
                } else {
                    z = true;
                }
                if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
                    abv.m32798e(C2240a.m6772a(str, new Object[]{"keyboardHidden"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 128) == 0) {
                    abv.m32798e(C2240a.m6772a(str, new Object[]{"orientation"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & UnReadVideoExperiment.BROWSE_RECORD_LIST) == 0) {
                    abv.m32798e(C2240a.m6772a(str, new Object[]{"screenLayout"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & UnReadVideoExperiment.LIKE_USER_LIST) == 0) {
                    abv.m32798e(C2240a.m6772a(str, new Object[]{"uiMode"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & PreloadTask.BYTE_UNIT_NUMBER) == 0) {
                    abv.m32798e(C2240a.m6772a(str, new Object[]{"screenSize"}));
                    z = false;
                }
                if ((resolveActivity.activityInfo.configChanges & 2048) == 0) {
                    abv.m32798e(C2240a.m6772a(str, new Object[]{"smallestScreenSize"}));
                } else {
                    z2 = z;
                }
            }
            return z2;
        } catch (Exception e) {
            abv.m32795c("Could not verify that com.google.android.gms.ads.AdActivity is declared in AndroidManifest.xml", e);
            C14963ax.m30834d().mo28588a((Throwable) e, "AdUtil.hasAdActivity");
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m32590a(Context context, String str) {
        Context a = C16380xq.m39015a(context);
        return C15377d.m31951a(a).mo28317a(str, a.getPackageName()) == 0;
    }

    /* renamed from: a */
    public static void m32584a(Context context, String str, List<String> list) {
        for (String aeg : list) {
            new aeg(context, str, aeg).mo28618c();
        }
    }

    /* renamed from: a */
    public static void m32583a(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        m32584a(context, str, (List<String>) arrayList);
    }

    /* renamed from: a */
    public final void mo28668a(Context context, List<String> list) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!TextUtils.isEmpty(bdh.m35441a(activity))) {
                if (list == null) {
                    abv.m32494a("Cannot ping urls: empty list.");
                } else if (!C15817cv.m37169a(context)) {
                    abv.m32494a("Cannot ping url because custom tabs is not supported");
                } else {
                    C15817cv cvVar = new C15817cv();
                    cvVar.f44796d = new aci(this, list, cvVar, context);
                    cvVar.mo30911a(activity);
                }
            }
        }
    }

    /* renamed from: a */
    public static String m32577a(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder(VideoCacheReadBuffersizeExperiment.DEFAULT);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    /* renamed from: b */
    public final boolean mo28672b(Context context) {
        if (this.f40252h) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new acl(this, null), intentFilter);
        this.f40252h = true;
        return true;
    }

    /* renamed from: a */
    public final void mo28665a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(mo28670b(context, str));
    }

    /* renamed from: d */
    private static String m32607d() {
        StringBuilder sb = new StringBuilder(UnReadVideoExperiment.BROWSE_RECORD_LIST);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0038, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0042 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0025 A[Catch:{ Exception -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056 A[Catch:{ Exception -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b A[Catch:{ Exception -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a4 A[Catch:{ Exception -> 0x00b3 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo28670b(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f40251g
            monitor-enter(r0)
            java.lang.String r1 = r4.f40246b     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x000b
            java.lang.String r5 = r4.f40246b     // Catch:{ all -> 0x00cf }
            monitor-exit(r0)     // Catch:{ all -> 0x00cf }
            return r5
        L_0x000b:
            if (r6 != 0) goto L_0x0013
            java.lang.String r5 = m32607d()     // Catch:{ all -> 0x00cf }
            monitor-exit(r0)     // Catch:{ all -> 0x00cf }
            return r5
        L_0x0013:
            com.google.android.gms.internal.ads.acm r1 = com.google.android.gms.ads.internal.C14963ax.m30832b()     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = r1.mo28687a(r5)     // Catch:{ Exception -> 0x001d }
            r4.f40246b = r1     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            java.lang.String r1 = r4.f40246b     // Catch:{ all -> 0x00cf }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x006b
            boolean r1 = com.google.android.gms.internal.ads.aes.m32760b()     // Catch:{ all -> 0x00cf }
            if (r1 != 0) goto L_0x0065
            r1 = 0
            r4.f40246b = r1     // Catch:{ all -> 0x00cf }
            android.os.Handler r1 = f40245a     // Catch:{ all -> 0x00cf }
            com.google.android.gms.internal.ads.acj r2 = new com.google.android.gms.internal.ads.acj     // Catch:{ all -> 0x00cf }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x00cf }
            r1.post(r2)     // Catch:{ all -> 0x00cf }
        L_0x0038:
            java.lang.String r1 = r4.f40246b     // Catch:{ all -> 0x00cf }
            if (r1 != 0) goto L_0x006b
            java.lang.Object r1 = r4.f40251g     // Catch:{ InterruptedException -> 0x0042 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0042 }
            goto L_0x0038
        L_0x0042:
            java.lang.String r1 = m32607d()     // Catch:{ all -> 0x00cf }
            r4.f40246b = r1     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "Interrupted, use default user agent: "
            java.lang.String r2 = r4.f40246b     // Catch:{ all -> 0x00cf }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00cf }
            int r3 = r2.length()     // Catch:{ all -> 0x00cf }
            if (r3 == 0) goto L_0x005b
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x00cf }
            goto L_0x0061
        L_0x005b:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x00cf }
            r2.<init>(r1)     // Catch:{ all -> 0x00cf }
            r1 = r2
        L_0x0061:
            com.google.android.gms.internal.ads.abv.m32798e(r1)     // Catch:{ all -> 0x00cf }
            goto L_0x0038
        L_0x0065:
            java.lang.String r1 = m32601c(r5)     // Catch:{ all -> 0x00cf }
            r4.f40246b = r1     // Catch:{ all -> 0x00cf }
        L_0x006b:
            java.lang.String r1 = r4.f40246b     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00cf }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00cf }
            int r2 = r2.length()     // Catch:{ all -> 0x00cf }
            int r2 = r2 + 10
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00cf }
            int r3 = r3.length()     // Catch:{ all -> 0x00cf }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r3.<init>(r2)     // Catch:{ all -> 0x00cf }
            r3.append(r1)     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = " (Mobile; "
            r3.append(r1)     // Catch:{ all -> 0x00cf }
            r3.append(r6)     // Catch:{ all -> 0x00cf }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00cf }
            r4.f40246b = r6     // Catch:{ all -> 0x00cf }
            com.google.android.gms.common.d.b r5 = com.google.android.gms.common.p1037d.C15377d.m31951a(r5)     // Catch:{ Exception -> 0x00b3 }
            boolean r5 = r5.mo28319a()     // Catch:{ Exception -> 0x00b3 }
            if (r5 == 0) goto L_0x00bd
            java.lang.String r5 = r4.f40246b     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r6 = ";aia"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ Exception -> 0x00b3 }
            r4.f40246b = r5     // Catch:{ Exception -> 0x00b3 }
            goto L_0x00bd
        L_0x00b3:
            r5 = move-exception
            com.google.android.gms.internal.ads.abh r6 = com.google.android.gms.ads.internal.C14963ax.m30834d()     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.mo28588a(r5, r1)     // Catch:{ all -> 0x00cf }
        L_0x00bd:
            java.lang.String r5 = r4.f40246b     // Catch:{ all -> 0x00cf }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00cf }
            java.lang.String r6 = ")"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x00cf }
            r4.f40246b = r5     // Catch:{ all -> 0x00cf }
            java.lang.String r5 = r4.f40246b     // Catch:{ all -> 0x00cf }
            monitor-exit(r0)     // Catch:{ all -> 0x00cf }
            return r5
        L_0x00cf:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00cf }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.acd.mo28670b(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    protected static String m32601c(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return m32607d();
        }
    }

    /* renamed from: a */
    public final JSONObject mo28664a(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m32588a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String str2 = "Could not convert map to JSON: ";
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    /* renamed from: a */
    public final JSONObject mo28663a(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return m32580a(bundle);
        } catch (JSONException e) {
            abv.m32793b("Error converting Bundle to JSON", e);
            return null;
        }
    }

    /* renamed from: a */
    private final JSONObject m32580a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m32588a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private final JSONArray m32579a(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object a : collection) {
            m32587a(jSONArray, a);
        }
        return jSONArray;
    }

    /* renamed from: a */
    private final void m32587a(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(m32580a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(mo28664a((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(m32579a((Collection) obj));
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            JSONArray jSONArray2 = new JSONArray();
            for (Object a : objArr) {
                m32587a(jSONArray2, a);
            }
            jSONArray.put(jSONArray2);
        } else {
            jSONArray.put(obj);
        }
    }

    /* renamed from: a */
    private final void m32588a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONObject.put(str, m32580a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, mo28664a((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = TEVideoRecorder.FACE_BEAUTY_NULL;
            }
            jSONObject.put(str, m32579a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m32579a((Collection<?>) Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: a */
    private static int m32569a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return (c - 'A') + 10;
        }
        if (c >= 'a' && c <= 'f') {
            return (c - 'a') + 10;
        }
        throw new IllegalArgumentException("Invalid Hex.");
    }

    /* renamed from: a */
    public static Map<String, String> m32578a(Uri uri) {
        if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44403de)).booleanValue()) {
            if (uri == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
            return hashMap;
        } else if (uri == null) {
            return null;
        } else {
            HashMap hashMap2 = new HashMap(20);
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery == null) {
                return hashMap2;
            }
            int length = encodedQuery.length();
            StringBuilder sb = new StringBuilder(100);
            StringBuilder sb2 = new StringBuilder(length);
            StringBuilder sb3 = sb;
            int i = 0;
            while (i < length) {
                char charAt = encodedQuery.charAt(i);
                if (charAt == '+') {
                    sb3.append(' ');
                } else if (charAt != '=') {
                    switch (charAt) {
                        case '%':
                            byte[] bArr = new byte[((length - i) / 3)];
                            int i2 = 0;
                            while (i < length - 2 && charAt == '%') {
                                try {
                                    bArr[i2] = (byte) ((m32569a(encodedQuery.charAt(i + 1)) << 4) + m32569a(encodedQuery.charAt(i + 2)));
                                    i2++;
                                } catch (IllegalArgumentException unused) {
                                }
                                i += 3;
                                if (i < length) {
                                    charAt = encodedQuery.charAt(i);
                                }
                            }
                            try {
                                sb3.append(new String(bArr, 0, i2, "UTF-8"));
                            } catch (UnsupportedEncodingException unused2) {
                            }
                            if (charAt == '%') {
                                break;
                            } else {
                                sb3.append(charAt);
                                break;
                            }
                            break;
                        case '&':
                            if (sb.length() > 0 && sb3 != sb) {
                                hashMap2.put(sb.toString(), sb2.toString());
                                sb.setLength(0);
                                sb2.setLength(0);
                            }
                            sb3 = sb;
                            break;
                        default:
                            sb3.append(charAt);
                            break;
                    }
                } else if (sb3 != sb2) {
                    sb3 = sb2;
                } else {
                    sb3.append(charAt);
                }
                i++;
            }
            if (sb.length() > 0 && sb3 != sb) {
                hashMap2.put(sb.toString(), sb2.toString());
            }
            return hashMap2;
        }
    }

    /* renamed from: a */
    public static String m32575a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public static int m32570a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Could not parse value:");
            sb.append(valueOf);
            abv.m32798e(sb.toString());
            return 0;
        }
    }

    /* renamed from: b */
    public static String m32597b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: e */
    private static int[] m32609e() {
        return new int[]{0, 0};
    }

    /* renamed from: a */
    public static int[] m32594a(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            View findViewById = window.findViewById(16908290);
            if (findViewById != null) {
                return new int[]{findViewById.getWidth(), findViewById.getHeight()};
            }
        }
        return m32609e();
    }

    /* renamed from: b */
    public static int[] m32599b(Activity activity) {
        int[] a = m32594a(activity);
        return new int[]{aes.m32758b((Context) activity, a[0]), aes.m32758b((Context) activity, a[1])};
    }

    /* renamed from: c */
    public static int[] m32604c(Activity activity) {
        int[] iArr;
        Window window = activity.getWindow();
        if (window != null) {
            View findViewById = window.findViewById(16908290);
            if (findViewById != null) {
                iArr = new int[]{findViewById.getTop(), findViewById.getBottom()};
                return new int[]{aes.m32758b((Context) activity, iArr[0]), aes.m32758b((Context) activity, iArr[1])};
            }
        }
        iArr = m32609e();
        return new int[]{aes.m32758b((Context) activity, iArr[0]), aes.m32758b((Context) activity, iArr[1])};
    }

    /* renamed from: a */
    public static DisplayMetrics m32572a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: d */
    public static Builder m32606d(Context context) {
        return new Builder(context);
    }

    /* renamed from: e */
    public static C15721bh m32608e(Context context) {
        return new C15721bh(context);
    }

    /* renamed from: n */
    private static String m32616n(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return null;
            }
            List runningTasks = activityManager.getRunningTasks(1);
            if (runningTasks != null && !runningTasks.isEmpty()) {
                RunningTaskInfo runningTaskInfo = (RunningTaskInfo) runningTasks.get(0);
                if (!(runningTaskInfo == null || runningTaskInfo.topActivity == null)) {
                    return runningTaskInfo.topActivity.getClassName();
                }
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static String m32576a(Context context, View view, zzyz zzyz) {
        if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44244ae)).booleanValue()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", zzyz.f46342e);
            jSONObject2.put("height", zzyz.f46339b);
            jSONObject.put("size", jSONObject2);
            jSONObject.put("activity", m32616n(context));
            if (!zzyz.f46341d) {
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        int i = -1;
                        if (parent instanceof ViewGroup) {
                            i = ((ViewGroup) parent).indexOfChild(view);
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", parent.getClass().getName());
                        jSONObject3.put("index_of_child", i);
                        jSONArray.put(jSONObject3);
                    }
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("parents", jSONArray);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            abv.m32795c("Fail to get view hierarchy json", e);
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m32610f(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    Iterator it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) it.next();
                        if (Process.myPid() == runningAppProcessInfo.pid) {
                            if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && m32617o(context)) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m32611g(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    Iterator it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) it.next();
                        if (Process.myPid() == runningAppProcessInfo.pid) {
                            if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && m32617o(context)) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: o */
    private static boolean m32617o(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return false;
        }
        return powerManager.isScreenOn();
    }

    /* renamed from: a */
    public final void mo28666a(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            bundle.putString("device", m32597b());
            bundle.putString("eids", TextUtils.join(",", C15740bx.m36940a()));
        }
        aes.m32754a(context, str, str2, bundle, z, new ack(this, context, str));
    }

    /* renamed from: b */
    public final void mo28671b(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44304bl)).booleanValue()) {
            mo28666a(context, str, str2, bundle, z);
        }
    }

    /* renamed from: a */
    public static void m32586a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            acb.m32566a(runnable);
        }
    }

    /* renamed from: a */
    static Bitmap m32571a(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0) {
                if (height != 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.RGB_565);
                    Canvas canvas = new Canvas(createBitmap);
                    view.layout(0, 0, width, height);
                    view.draw(canvas);
                    return createBitmap;
                }
            }
            abv.m32798e("Width or height of view is zero");
            return null;
        } catch (RuntimeException e) {
            abv.m32793b("Fail to capture the webview", e);
            return null;
        }
    }

    /* renamed from: b */
    static Bitmap m32595b(View view) {
        Bitmap bitmap = null;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            }
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        } catch (RuntimeException e) {
            abv.m32793b("Fail to capture the web view", e);
        }
        return bitmap;
    }

    /* renamed from: h */
    public static Bitmap m32612h(Context context) {
        Bitmap bitmap = null;
        if (!(context instanceof Activity)) {
            return null;
        }
        try {
            Window window = ((Activity) context).getWindow();
            if (window != null) {
                bitmap = m32595b(window.getDecorView().getRootView());
            }
        } catch (RuntimeException e) {
            abv.m32793b("Fail to capture screen shot", e);
        }
        return bitmap;
    }

    /* renamed from: a */
    public static void m32581a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public final boolean mo28669a(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return m32591a(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m32613i(context));
    }

    /* renamed from: i */
    static KeyguardManager m32613i(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    /* renamed from: a */
    public static boolean m32591a(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z;
        boolean z2;
        if (!C14963ax.m30831a().f40250f) {
            if (keyguardManager == null) {
                z2 = false;
            } else {
                z2 = keyguardManager.inKeyguardRestrictedInputMode();
            }
            if (z2 && !m32603c(view)) {
                z = false;
                if (view.getVisibility() == 0 && view.isShown()) {
                    if ((powerManager != null || powerManager.isScreenOn()) && z) {
                        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44298bf)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        z = true;
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44298bf)).booleanValue()) {
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m32603c(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 == 0) goto L_0x0012
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0012
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x0013
        L_0x0012:
            r2 = r0
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.acd.m32603c(android.view.View):boolean");
    }

    /* renamed from: d */
    public static int m32605d(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    /* renamed from: j */
    public static boolean m32614j(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            abv.m32793b("Error loading class.", th);
            C14963ax.m30834d().mo28588a(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    /* renamed from: c */
    public static Bundle m32600c() {
        Bundle bundle = new Bundle();
        try {
            if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44192F)).booleanValue()) {
                MemoryInfo memoryInfo = new MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                bundle.putParcelable("debug_memory_info", memoryInfo);
            }
            Runtime runtime = Runtime.getRuntime();
            bundle.putLong("runtime_free_memory", runtime.freeMemory());
            bundle.putLong("runtime_max_memory", runtime.maxMemory());
            bundle.putLong("runtime_total_memory", runtime.totalMemory());
            bundle.putInt("web_view_count", C14963ax.m30834d().f40169g.get());
        } catch (Exception e) {
            abv.m32795c("Unable to gather memory stats", e);
        }
        return bundle;
    }

    /* renamed from: a */
    public static void m32582a(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            m32598b(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            abv.m32792b(sb.toString());
        } catch (ActivityNotFoundException e) {
            abv.m32793b("No browser is found.", e);
        }
    }

    /* renamed from: b */
    public static void m32598b(Context context, Intent intent) {
        if (intent != null && C15524o.m32296d()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    /* renamed from: c */
    public static String m32602c(Context context, String str) {
        try {
            FileInputStream openFileInput = context.openFileInput(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C15521l.m32289a(openFileInput, byteArrayOutputStream, true, PreloadTask.BYTE_UNIT_NUMBER);
            return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
        } catch (IOException unused) {
            abv.m32792b("Error reading from internal storage.");
            return "";
        }
    }

    /* renamed from: b */
    public final boolean mo28673b(String str) {
        return m32593a(str, this.f40248d, (String) caf.m37099d().mo30717a(C15740bx.f44246ag));
    }

    /* renamed from: c */
    public final boolean mo28674c(String str) {
        return m32593a(str, this.f40249e, (String) caf.m37099d().mo30717a(C15740bx.f44247ah));
    }

    /* renamed from: a */
    private static boolean m32593a(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static WebResourceResponse m32596b(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", C14963ax.m30831a().mo28670b(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new adr(context).mo28736a(str2, (Map<String, String>) hashMap).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            abv.m32795c("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.webkit.WebResourceResponse m32573a(java.net.HttpURLConnection r10) throws java.io.IOException {
        /*
            java.lang.String r0 = r10.getContentType()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000f
            java.lang.String r0 = ""
        L_0x000d:
            r4 = r0
            goto L_0x001c
        L_0x000f:
            java.lang.String r1 = ";"
            java.lang.String[] r0 = r0.split(r1)
            r0 = r0[r2]
            java.lang.String r0 = r0.trim()
            goto L_0x000d
        L_0x001c:
            java.lang.String r0 = r10.getContentType()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x005b
            java.lang.String r1 = ";"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r3 = 1
            if (r1 == r3) goto L_0x005b
            r1 = 1
        L_0x0031:
            int r5 = r0.length
            if (r1 >= r5) goto L_0x005b
            r5 = r0[r1]
            java.lang.String r5 = r5.trim()
            java.lang.String r6 = "charset"
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto L_0x0058
            r5 = r0[r1]
            java.lang.String r5 = r5.trim()
            java.lang.String r6 = "="
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            if (r6 <= r3) goto L_0x0058
            r0 = r5[r3]
            java.lang.String r0 = r0.trim()
            goto L_0x005d
        L_0x0058:
            int r1 = r1 + 1
            goto L_0x0031
        L_0x005b:
            java.lang.String r0 = ""
        L_0x005d:
            r5 = r0
            java.util.Map r0 = r10.getHeaderFields()
            java.util.HashMap r8 = new java.util.HashMap
            int r1 = r0.size()
            r8.<init>(r1)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0073:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00ad
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            if (r3 == 0) goto L_0x0073
            java.lang.Object r3 = r1.getValue()
            if (r3 == 0) goto L_0x0073
            java.lang.Object r3 = r1.getValue()
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0073
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r8.put(r3, r1)
            goto L_0x0073
        L_0x00ad:
            com.google.android.gms.internal.ads.acm r3 = com.google.android.gms.ads.internal.C14963ax.m30832b()
            int r6 = r10.getResponseCode()
            java.lang.String r7 = r10.getResponseMessage()
            r0 = r10
            java.net.URLConnection r0 = (java.net.URLConnection) r0
            boolean r1 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r0)
            if (r1 == 0) goto L_0x00ce
            java.net.URL r1 = r0.getURL()
            java.lang.String r0 = r0.getContentType()
            r2 = 0
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r1, r2, r2, r0)
        L_0x00ce:
            java.io.InputStream r9 = r10.getInputStream()
            android.webkit.WebResourceResponse r10 = r3.mo28685a(r4, r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.acd.m32573a(java.net.HttpURLConnection):android.webkit.WebResourceResponse");
    }

    /* renamed from: a */
    public static void m32585a(Context context, Throwable th) {
        if (context != null) {
            boolean z = false;
            try {
                z = ((Boolean) caf.m37099d().mo30717a(C15740bx.f44476f)).booleanValue();
            } catch (IllegalStateException unused) {
            }
            if (z) {
                C15516g.m32278a(context, th);
            }
        }
    }

    /* renamed from: k */
    public final String mo28675k(Context context) {
        if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44399da)).booleanValue()) {
            return "";
        }
        try {
            return (String) acb.m32567a((Callable<T>) new acf<T>(this, context)).get();
        } catch (InterruptedException unused) {
            Thread.interrupted();
            return "";
        } catch (ExecutionException unused2) {
            return "";
        }
    }

    /* renamed from: l */
    public final Bundle mo28676l(Context context) {
        if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44400db)).booleanValue()) {
            return null;
        }
        try {
            return (Bundle) acb.m32567a((Callable<T>) new acg<T>(this, context)).get();
        } catch (InterruptedException unused) {
            Thread.interrupted();
            return null;
        } catch (ExecutionException unused2) {
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m32615m(Context context) {
        if (!(context instanceof Activity)) {
            return false;
        }
        Window window = ((Activity) context).getWindow();
        if (window == null || window.getDecorView() == null) {
            return false;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        window.getDecorView().getGlobalVisibleRect(rect, null);
        window.getDecorView().getWindowVisibleDisplayFrame(rect2);
        if (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) {
            return false;
        }
        return true;
    }
}
