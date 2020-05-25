package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.util.JsonWriter;
import com.google.android.gms.common.util.C15514e;
import com.google.android.gms.common.util.C15517h;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import leakcanary.internal.LeakCanaryFileProvider;

@C16299uq
public final class aew {

    /* renamed from: a */
    static Object f40385a = new Object();

    /* renamed from: b */
    static boolean f40386b = false;

    /* renamed from: c */
    static boolean f40387c = false;

    /* renamed from: d */
    private static C15514e f40388d = C15517h.m32280d();

    /* renamed from: e */
    private static final Set<String> f40389e = new HashSet(Arrays.asList(new String[0]));

    /* renamed from: f */
    private final List<String> f40390f;

    public aew() {
        this(null);
    }

    public aew(String str) {
        List<String> list;
        if (!m32775b()) {
            list = new ArrayList<>();
        } else {
            String uuid = UUID.randomUUID().toString();
            if (str == null) {
                String[] strArr = new String[1];
                String str2 = "network_request_";
                String valueOf = String.valueOf(uuid);
                strArr[0] = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
                list = Arrays.asList(strArr);
            } else {
                String[] strArr2 = new String[2];
                String str3 = "ad_request_";
                String valueOf2 = String.valueOf(str);
                strArr2[0] = valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3);
                String str4 = "network_request_";
                String valueOf3 = String.valueOf(uuid);
                strArr2[1] = valueOf3.length() != 0 ? str4.concat(valueOf3) : new String(str4);
                list = Arrays.asList(strArr2);
            }
        }
        this.f40390f = list;
    }

    /* renamed from: a */
    public final void mo28767a(HttpURLConnection httpURLConnection, byte[] bArr) {
        HashMap hashMap;
        if (m32775b()) {
            if (httpURLConnection.getRequestProperties() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getRequestProperties());
            }
            m32774b(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr);
        }
    }

    /* renamed from: a */
    public final void mo28765a(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (m32775b()) {
            m32774b(str, str2, map, bArr);
        }
    }

    /* renamed from: b */
    private final void m32774b(String str, String str2, Map<String, ?> map, byte[] bArr) {
        m32771a("onNetworkRequest", (afb) new aex(str, str2, map, bArr));
    }

    /* renamed from: a */
    public final void mo28766a(HttpURLConnection httpURLConnection, int i) {
        String str;
        if (m32775b()) {
            mo28768a(httpURLConnection.getHeaderFields() == null ? null : new HashMap<>(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String str2 = "Can not get error message from error HttpURLConnection\n";
                    String valueOf = String.valueOf(e.getMessage());
                    afc.m32798e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    str = null;
                }
                mo28770b(str);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28768a(Map<String, ?> map, int i) {
        m32771a("onNetworkResponse", (afb) new aey(i, map));
    }

    /* renamed from: a */
    public final void mo28764a(String str) {
        if (m32775b() && str != null) {
            mo28769a(str.getBytes());
        }
    }

    /* renamed from: a */
    public final void mo28769a(byte[] bArr) {
        m32771a("onNetworkResponseBody", (afb) new aez(bArr));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo28770b(String str) {
        m32771a("onNetworkRequestError", (afb) new afa(str));
    }

    /* renamed from: a */
    static void m32770a(JsonWriter jsonWriter, Map<String, ?> map) throws IOException {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                String str = (String) entry.getKey();
                if (!f40389e.contains(str)) {
                    if (!(entry.getValue() instanceof List)) {
                        if (!(entry.getValue() instanceof String)) {
                            afc.m32794c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name(LeakCanaryFileProvider.f132049i).value(str);
                        jsonWriter.name("value").value((String) entry.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String str2 : (List) entry.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name(LeakCanaryFileProvider.f132049i).value(str);
                            jsonWriter.name("value").value(str2);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: a */
    private final void m32771a(String str, afb afb) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f40388d.mo28523a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.f40390f) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            afb.mo28771a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            afc.m32793b("unable to log", e);
        }
        m32776c(stringWriter.toString());
    }

    /* renamed from: c */
    private static synchronized void m32776c(String str) {
        synchronized (aew.class) {
            afc.m32796d("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String str2 = "GMA Debug CONTENT ";
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                afc.m32796d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                i = i2;
            }
            afc.m32796d("GMA Debug FINISH");
        }
    }

    /* renamed from: a */
    public static boolean m32772a() {
        boolean z;
        synchronized (f40385a) {
            z = f40386b;
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m32775b() {
        boolean z;
        synchronized (f40385a) {
            z = f40386b && f40387c;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m32773a(Context context) {
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44293ba)).booleanValue()) {
            return false;
        }
        try {
            if (Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            afc.m32795c("Fail to determine debug setting.", e);
            return false;
        }
    }
}
