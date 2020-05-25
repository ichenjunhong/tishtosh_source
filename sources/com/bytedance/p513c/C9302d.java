package com.bytedance.p513c;

import android.database.Cursor;
import com.bytedance.p513c.p516c.C9301b;
import com.bytedance.p513c.p517d.C9313i;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.c.d */
public final class C9302d {

    /* renamed from: a */
    static long f25473a;

    /* renamed from: b */
    static TreeMap<String, String> f25474b = new TreeMap<>();

    /* renamed from: c */
    static ReentrantLock f25475c = new ReentrantLock();

    /* renamed from: d */
    static ReentrantLock f25476d = new ReentrantLock();

    /* renamed from: e */
    static List<JSONObject> f25477e = new LinkedList();

    /* renamed from: f */
    static LinkedBlockingQueue<String> f25478f = new LinkedBlockingQueue<>(500);

    /* renamed from: a */
    public static void m18450a(boolean z, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(LeakCanaryFileProvider.f132049i, str);
            m18449a(m18446a(z ? "turing_verify_bridge_2_sdk" : "turing_verify_bridge_2_fe", jSONObject).toString());
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    static boolean m18451a(String str, boolean z) {
        boolean z2 = false;
        if (str == null) {
            return false;
        }
        C9317h c = C9282a.m18401a().mo16873c();
        if (c != null) {
            z2 = c.mo16926a(str);
        }
        if (!z2) {
            if (z) {
                m18455b(C9313i.m18465a(str));
            } else {
                m18454b(str);
            }
        }
        return z2;
    }

    /* renamed from: b */
    public static boolean m18456b() {
        C9301b a = C9301b.m18436a();
        a.mo16911b();
        String str = null;
        if (a.f25471a != null && a.f25471a.isOpen()) {
            String[] strArr = {"event"};
            String[] strArr2 = {"time_stamp", C42311c.f106865i};
            Cursor query = a.f25471a.query("h5_storage", strArr2, "primary_key=?", strArr, null, null, null, "1");
            if (query != null) {
                if (!query.moveToFirst()) {
                    query.close();
                } else {
                    str = query.getString(1);
                    a.mo16907a(query.getLong(0));
                    query.close();
                    new StringBuilder("insertEvent : ").append(str);
                }
            }
        }
        if (str == null) {
            return false;
        }
        return m18451a(str, false);
    }

    /* renamed from: a */
    public static void m18447a() {
        try {
            f25476d.lockInterruptibly();
            f25477e.clear();
            f25476d.unlock();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static void m18454b(String str) {
        if (str != null) {
            C9301b.m18436a().mo16908a(str);
        }
    }

    /* renamed from: a */
    static String m18444a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("data", jSONArray);
            return C9313i.m18464a(1, "bytedcert.verifyReport", "call", jSONObject, null);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static void m18453b(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", i);
            m18449a(m18446a("turing_verify_orientation_change", jSONObject).toString());
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    static String m18443a(C9313i iVar) {
        m18450a(false, "bytedcert.getData");
        JSONArray a = m18445a(f25478f);
        if (a == null) {
            a = new JSONArray();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("data", a);
            return C9313i.m18466a(1, "callback", jSONObject, iVar).toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: b */
    static String m18452b(C9313i iVar) {
        m18450a(false, "bytedcert.getTouch");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("os_name", "android");
            f25476d.lockInterruptibly();
            JSONArray jSONArray = new JSONArray(f25477e);
            m18447a();
            f25476d.unlock();
            jSONObject.put("touch", jSONArray);
            return C9313i.m18466a(1, "callback", jSONObject, iVar).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    static JSONArray m18445a(LinkedBlockingQueue<String> linkedBlockingQueue) {
        LinkedList linkedList = new LinkedList();
        if (linkedBlockingQueue.drainTo(linkedList, 500) == 0) {
            return null;
        }
        return new JSONArray(linkedList);
    }

    /* renamed from: b */
    static void m18455b(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            m18454b(m18444a(jSONArray));
        }
    }

    /* renamed from: a */
    public static void m18448a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", i);
            m18449a(m18446a("turing_verify_orientation", jSONObject).toString());
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m18449a(String str) {
        f25478f.add(str);
        if (f25478f.size() > 100) {
            C9328j.m18487a().mo16941a(3, null);
        }
    }

    /* renamed from: a */
    public static JSONObject m18446a(String str, JSONObject jSONObject) {
        try {
            jSONObject.put("event", str);
            jSONObject.put("time", System.currentTimeMillis());
            f25475c.lockInterruptibly();
            for (Entry entry : f25474b.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
            f25475c.unlock();
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
