package com.bytedance.android.p161c.p163b;

import com.bytedance.android.p161c.p172j.C2886h;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.c.b.a */
public final class C2845a {

    /* renamed from: d */
    private static List<Throwable> f8477d = new ArrayList();

    /* renamed from: a */
    public int f8478a;

    /* renamed from: b */
    public String f8479b;

    /* renamed from: c */
    public Throwable f8480c;

    public C2845a() {
    }

    /* renamed from: a */
    private static String m8133a() {
        String str = "";
        for (Throwable th : f8477d) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("\"");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(C2886h.m8189a(th));
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append("\",");
            str = sb5.toString();
        }
        return str;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("code=");
        sb.append(this.f8478a);
        sb.append(",msg=");
        sb.append(this.f8479b);
        sb.append(",stacktrace=[");
        if (this.f8480c == null) {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            str = C2886h.m8189a(this.f8480c);
        }
        sb.append(str);
        sb.append("],initError=[");
        sb.append(m8133a());
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m8134a(Throwable th) {
        f8477d.add(th);
    }

    public C2845a(int i, String str) {
        this.f8478a = i;
        this.f8479b = str;
    }

    public C2845a(int i, String str, Throwable th) {
        this.f8478a = i;
        this.f8479b = str;
        this.f8480c = th;
    }
}
