package com.bytedance.android.p173d.p176b;

import android.os.Process;
import com.bytedance.android.p173d.p176b.C2930i.C2934b.C2935a;

/* renamed from: com.bytedance.android.d.b.b */
public final class C2909b {

    /* renamed from: a */
    public static final String f8585a;

    /* renamed from: b */
    public static boolean f8586b = false;

    /* renamed from: c */
    public static C2935a f8587c = new C2935a() {
        /* renamed from: a */
        public final void mo7544a(int i, String str) {
        }

        /* renamed from: a */
        public final void mo7545a(int i, String str, Throwable th) {
        }
    };

    static {
        StringBuilder sb = new StringBuilder("TEST_KV@pid:");
        sb.append(Process.myPid());
        f8585a = sb.toString();
    }

    /* renamed from: a */
    static void m8284a(String str) {
        f8587c.mo7544a(2, m8289c(str));
    }

    /* renamed from: b */
    static void m8287b(String str) {
        f8587c.mo7544a(3, m8289c(str));
    }

    /* renamed from: a */
    public static void m8286a(Throwable th) {
        String str;
        if (!f8586b) {
            if (th.getMessage() == null) {
                str = "No message.";
            } else {
                str = th.getMessage();
            }
            m8285a(str, th);
            return;
        }
        throw new C2917g(th);
    }

    /* renamed from: c */
    private static String m8289c(String str) {
        StringBuilder sb = new StringBuilder("@Thread: {");
        sb.append(Process.myPid());
        sb.append(",");
        sb.append(Thread.currentThread().getName());
        sb.append("}, msg: ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    static void m8285a(String str, Throwable th) {
        f8587c.mo7545a(3, m8289c(str), th);
    }

    /* renamed from: b */
    static void m8288b(String str, Throwable th) {
        if (!f8586b) {
            m8285a(str, th);
            return;
        }
        throw new C2917g(str, th);
    }
}
