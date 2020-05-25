package com.p683ss.android.pushmanager.p1205b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.p827q.p828a.C12659a;
import com.p683ss.android.pushmanager.p1205b.p1206a.C19674b;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.b.b */
public final class C19676b {

    /* renamed from: a */
    public static volatile AtomicBoolean f54174a = new AtomicBoolean(false);

    /* renamed from: b */
    public static long f54175b;

    /* renamed from: c */
    public static volatile AtomicBoolean f54176c = new AtomicBoolean(false);

    /* renamed from: d */
    private static C9382a f54177d = new C9382a() {
        public final void handleMsg(Message message) {
            if (message != null) {
                switch (message.what) {
                    case 1:
                        C19676b.m48067a(1, System.currentTimeMillis() - C19676b.f54175b);
                        return;
                    case 2:
                        C19676b.m48067a(2, System.currentTimeMillis() - C19676b.f54175b);
                        break;
                }
            }
        }
    };

    /* renamed from: e */
    private static Handler f54178e;

    /* renamed from: a */
    public static Handler m48066a() {
        if (f54178e == null) {
            f54178e = new C9381g(C19678c.m48072b(), f54177d);
        }
        return f54178e;
    }

    /* renamed from: b */
    private static void m48068b(int i, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i);
        } catch (JSONException unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("delta", j);
        } catch (JSONException unused2) {
        }
        C19678c.m48069a("push_monitor_applog_timeout", jSONObject, jSONObject2, null);
    }

    /* renamed from: a */
    public static void m48067a(int i, long j) {
        m48068b(i, j);
        if (C12659a.m25441a() && i == 2) {
            throw new C19674b("Push 初始化超时");
        }
    }
}
