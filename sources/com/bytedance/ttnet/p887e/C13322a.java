package com.bytedance.ttnet.p887e;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.http.p568a.C9834a;
import com.bytedance.frameworks.baselib.network.http.p574e.C9915j;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p830a.C12688d;
import com.bytedance.ttnet.p885c.C13297b;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;

/* renamed from: com.bytedance.ttnet.e.a */
public final class C13322a {

    /* renamed from: a */
    public static volatile boolean f34760a;

    /* renamed from: b */
    private static List<C13324b> f34761b = new ArrayList();

    /* renamed from: c */
    private static ReentrantReadWriteLock f34762c;

    /* renamed from: d */
    private static Lock f34763d;

    /* renamed from: e */
    private static Lock f34764e = f34762c.writeLock();

    /* renamed from: com.bytedance.ttnet.e.a$a */
    public static class C13323a {

        /* renamed from: a */
        public int f34765a;

        /* renamed from: b */
        public String f34766b;
    }

    /* renamed from: com.bytedance.ttnet.e.a$b */
    public static class C13324b {

        /* renamed from: a */
        Pattern f34767a;

        /* renamed from: a */
        public final boolean mo24930a(String str) {
            try {
                this.f34767a = Pattern.compile(str);
                return true;
            } catch (PatternSyntaxException unused) {
                return false;
            }
        }
    }

    /* renamed from: a */
    private static String m26826a() {
        return UUID.randomUUID().toString();
    }

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        f34762c = reentrantReadWriteLock;
        f34763d = reentrantReadWriteLock.readLock();
    }

    /* renamed from: a */
    private static void m26833a(boolean z) {
        f34760a = z;
    }

    /* renamed from: a */
    private static String m26827a(URI uri) {
        if (m26834b(uri)) {
            return m26826a();
        }
        return null;
    }

    /* renamed from: a */
    public static void m26829a(SharedPreferences sharedPreferences) {
        JSONArray jSONArray;
        int i = sharedPreferences.getInt("ttnet_response_verify_enabled", -1);
        String string = sharedPreferences.getString("ttnet_response_verify", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                jSONArray = new JSONArray(string);
            } catch (Throwable unused) {
            }
            m26828a(i, jSONArray);
        }
        jSONArray = null;
        m26828a(i, jSONArray);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private static boolean m26834b(URI uri) {
        boolean z;
        try {
            f34763d.lock();
            Iterator it = f34761b.iterator();
            do {
                z = false;
                if (it.hasNext()) {
                    C13324b bVar = (C13324b) it.next();
                    if (uri != null && !TextUtils.isEmpty(uri.getHost())) {
                        if (bVar.f34767a == null) {
                            continue;
                        } else {
                            String host = uri.getHost();
                            if (!TextUtils.isEmpty(uri.getPath())) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(host);
                                sb.append(uri.getPath());
                                host = sb.toString();
                            }
                            z = bVar.f34767a.matcher(host).matches();
                            continue;
                        }
                    }
                } else {
                    f34763d.unlock();
                    return false;
                }
            } while (!z);
            f34763d.unlock();
            return true;
        } catch (Throwable th) {
            f34763d.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    private static void m26832a(List<C13324b> list) {
        try {
            f34764e.lock();
            f34761b = list;
        } finally {
            f34764e.unlock();
        }
    }

    /* renamed from: a */
    public static void m26828a(int i, JSONArray jSONArray) {
        if (i > 0) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    String optString = jSONArray.optString(i2);
                    if (!TextUtils.isEmpty(optString)) {
                        C13324b bVar = new C13324b();
                        if (bVar.mo24930a(optString)) {
                            arrayList.add(bVar);
                        }
                    }
                }
                m26832a((List<C13324b>) arrayList);
            }
            m26833a(true);
            return;
        }
        m26833a(false);
    }

    /* renamed from: a */
    public static void m26831a(String str, List<C12685b> list) {
        try {
            String a = m26827a(C9915j.m19868a(str));
            if (!TextUtils.isEmpty(a)) {
                list.add(new C12685b("X-TT-VERIFY-ID", a));
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m26830a(C12686c cVar, C12688d dVar, C13297b bVar) throws IOException {
        String str;
        C12685b a = cVar.mo23856a("X-TT-VERIFY-ID");
        String str2 = null;
        if (a != null) {
            str = a.f33319b;
        } else {
            str = null;
        }
        C12685b a2 = dVar.mo23865a("X-TT-VERIFY-ID");
        if (a2 != null) {
            str2 = a2.f33319b;
        }
        if (str != null) {
            if (str2 == null) {
                bVar.f34689D = 1;
            } else if (str.equals(str2)) {
                bVar.f34689D = 2;
            } else {
                bVar.f34689D = 3;
                try {
                    dVar.f33350e.mo9554in().close();
                } catch (Throwable unused) {
                }
            }
            if (bVar.f34689D == 3) {
                throw new C9834a("Fail to verify cdn cache");
            }
        }
    }
}
