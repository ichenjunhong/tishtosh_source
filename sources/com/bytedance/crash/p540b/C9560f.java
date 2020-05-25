package com.bytedance.crash.p540b;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.bytedance.crash.C9577e;
import com.bytedance.crash.p551k.C9650g;
import com.bytedance.crash.p551k.C9650g.C9651a;
import com.bytedance.crash.p555n.C9695g;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.b.f */
public final class C9560f {

    /* renamed from: a */
    public static boolean f26062a = true;

    /* renamed from: b */
    static int f26063b;

    /* renamed from: c */
    static List<C9566a> f26064c;

    /* renamed from: d */
    public static volatile AtomicLong f26065d = new AtomicLong(-1);

    /* renamed from: e */
    public static long f26066e = 100;

    /* renamed from: f */
    public static long f26067f;

    /* renamed from: g */
    static HandlerThread f26068g;

    /* renamed from: h */
    public static long f26069h;

    /* renamed from: i */
    public static long f26070i;

    /* renamed from: j */
    static Handler f26071j;

    /* renamed from: k */
    public static int f26072k;

    /* renamed from: l */
    public static boolean f26073l;

    /* renamed from: m */
    public static volatile String f26074m = null;

    /* renamed from: n */
    public static volatile boolean f26075n = false;

    /* renamed from: o */
    public static int f26076o = -1;

    /* renamed from: p */
    public static volatile long f26077p = 0;

    /* renamed from: q */
    public static long f26078q = -1;

    /* renamed from: r */
    public static long f26079r = -1;

    /* renamed from: s */
    private static C9650g f26080s = new C9650g(5);

    /* renamed from: t */
    private static int f26081t = -1;

    /* renamed from: u */
    private static MessageQueue f26082u = null;

    /* renamed from: v */
    private static Field f26083v = null;

    /* renamed from: w */
    private static Field f26084w = null;

    /* renamed from: com.bytedance.crash.b.f$a */
    public static class C9566a {

        /* renamed from: a */
        public int f26086a;

        /* renamed from: b */
        public int f26087b;

        /* renamed from: c */
        public long f26088c;

        /* renamed from: d */
        public long f26089d;

        /* renamed from: e */
        public long f26090e;

        /* renamed from: f */
        public boolean f26091f;

        /* renamed from: g */
        public String f26092g;

        public final String toString() {
            if (this.f26087b == 0) {
                StringBuilder sb = new StringBuilder("[[[ IDLE  ]]] cost ");
                sb.append(this.f26088c);
                sb.append(" tick , mDuration：");
                sb.append(this.f26089d);
                sb.append(",cpuTime:");
                sb.append(this.f26090e);
                return sb.toString();
            } else if (this.f26087b == 1) {
                StringBuilder sb2 = new StringBuilder("[[[ Long IDLE  ]]] cost ");
                sb2.append(this.f26088c);
                sb2.append(" tick , mDuration：");
                sb2.append(this.f26089d);
                sb2.append(",cpuTime:");
                sb2.append(this.f26090e);
                return sb2.toString();
            } else if (this.f26087b == 2) {
                StringBuilder sb3 = new StringBuilder("[[[  1 msg  ]]] cost ");
                sb3.append(this.f26088c);
                sb3.append(" tick , mDuration：");
                sb3.append(this.f26089d);
                sb3.append(",cpuTime:");
                sb3.append(this.f26090e);
                sb3.append(", msg:");
                sb3.append(this.f26092g);
                return sb3.toString();
            } else if (this.f26087b == 3) {
                StringBuilder sb4 = new StringBuilder("[[[ 1 msg + IDLE  ]]] cost ");
                sb4.append(this.f26088c);
                sb4.append(" tick , mDuration：");
                sb4.append(this.f26089d);
                sb4.append(",cpuTime:");
                sb4.append(this.f26090e);
                return sb4.toString();
            } else if (this.f26087b == 4) {
                StringBuilder sb5 = new StringBuilder("[[[ ");
                sb5.append(this.f26086a - 1);
                sb5.append(" msgs  ]]] cost less than 1 tick, [[[  last msg ]]] cost more than ");
                sb5.append(this.f26088c - 1);
                sb5.append("tick ,, mDuration：");
                sb5.append(this.f26089d);
                sb5.append("cpuTime:");
                sb5.append(this.f26090e);
                sb5.append(" msg:");
                sb5.append(this.f26092g);
                return sb5.toString();
            } else if (this.f26087b == 5) {
                StringBuilder sb6 = new StringBuilder("[[[ ");
                sb6.append(this.f26086a);
                sb6.append(" msgs ]]] cost less than 1 tick but [[[  IDLE ]]] cost more than");
                sb6.append(this.f26088c - 1);
                sb6.append(" ticks, , mDuration：");
                sb6.append(this.f26089d);
                sb6.append("cpuTime:");
                sb6.append(this.f26090e);
                return sb6.toString();
            } else if (this.f26087b == 6) {
                StringBuilder sb7 = new StringBuilder("[[[  1 msg  ]]] cost less than 1 tick , but [[[  IDLE ]]] cost more than");
                sb7.append(this.f26088c - 1);
                sb7.append(", , mDuration：");
                sb7.append(this.f26089d);
                sb7.append("cpuTime:");
                sb7.append(this.f26090e);
                return sb7.toString();
            } else if (this.f26087b == 7) {
                StringBuilder sb8 = new StringBuilder("[[[ ");
                sb8.append(this.f26086a);
                sb8.append(" msgs + IDLE  ]]] cost 1 tick , mDuration：");
                sb8.append(this.f26089d);
                sb8.append(" cost cpuTime:");
                sb8.append(this.f26090e);
                return sb8.toString();
            } else if (this.f26087b == 8) {
                StringBuilder sb9 = new StringBuilder("[[[ 1 msgs ]]] cost ");
                sb9.append(this.f26088c);
                sb9.append(" ticks , mDuration：");
                sb9.append(this.f26089d);
                sb9.append(" cost cpuTime:");
                sb9.append(this.f26090e);
                sb9.append(" msg:");
                sb9.append(this.f26092g);
                return sb9.toString();
            } else if (this.f26087b == 9) {
                StringBuilder sb10 = new StringBuilder("[[[ ");
                sb10.append(this.f26086a);
                sb10.append(" msgs ]]] cost 1 tick , mDuration：");
                sb10.append(this.f26089d);
                sb10.append(" cost cpuTime:");
                sb10.append(this.f26090e);
                return sb10.toString();
            } else {
                StringBuilder sb11 = new StringBuilder("=========   UNKNOW =========  Type:");
                sb11.append(this.f26087b);
                sb11.append(" cost ticks ");
                sb11.append(this.f26088c);
                sb11.append(" msgs:");
                sb11.append(this.f26086a);
                return sb11.toString();
            }
        }
    }

    /* renamed from: e */
    public static long m18978e() {
        return f26077p;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|14|15|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0055 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONArray m18975b() {
        /*
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.List r1 = m18979f()     // Catch:{ Throwable -> 0x0059 }
            if (r1 != 0) goto L_0x000c
            return r0
        L_0x000c:
            r2 = 0
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Throwable -> 0x0059 }
        L_0x0011:
            boolean r3 = r1.hasNext()     // Catch:{ Throwable -> 0x0059 }
            if (r3 == 0) goto L_0x0063
            java.lang.Object r3 = r1.next()     // Catch:{ Throwable -> 0x0059 }
            com.bytedance.crash.b.f$a r3 = (com.bytedance.crash.p540b.C9560f.C9566a) r3     // Catch:{ Throwable -> 0x0059 }
            if (r3 == 0) goto L_0x0011
            int r2 = r2 + 1
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0059 }
            r4.<init>()     // Catch:{ Throwable -> 0x0059 }
            java.lang.String r5 = "msg"
            java.lang.String r6 = r3.f26092g     // Catch:{ JSONException -> 0x0055 }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r5 = "cpuDuration"
            long r6 = r3.f26090e     // Catch:{ JSONException -> 0x0055 }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r5 = "duration"
            long r6 = r3.f26089d     // Catch:{ JSONException -> 0x0055 }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r5 = "tick"
            long r6 = r3.f26088c     // Catch:{ JSONException -> 0x0055 }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r5 = "type"
            int r6 = r3.f26087b     // Catch:{ JSONException -> 0x0055 }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r5 = "count"
            int r3 = r3.f26086a     // Catch:{ JSONException -> 0x0055 }
            r4.put(r5, r3)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r3 = "id"
            r4.put(r3, r2)     // Catch:{ JSONException -> 0x0055 }
        L_0x0055:
            r0.put(r4)     // Catch:{ Throwable -> 0x0059 }
            goto L_0x0011
        L_0x0059:
            r1 = move-exception
            com.bytedance.crash.f r2 = com.bytedance.crash.C9577e.m18999a()
            java.lang.String r3 = "NPTH_CATCH"
            r2.mo17384a(r3, r1)
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p540b.C9560f.m18975b():org.json.JSONArray");
    }

    /* renamed from: c */
    public static MessageQueue m18976c() {
        if (f26082u == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                f26082u = Looper.myQueue();
            } else if (VERSION.SDK_INT >= 23) {
                f26082u = mainLooper.getQueue();
            } else {
                try {
                    Field declaredField = mainLooper.getClass().getDeclaredField("mQueue");
                    declaredField.setAccessible(true);
                    f26082u = (MessageQueue) declaredField.get(mainLooper);
                } catch (Throwable unused) {
                }
            }
        }
        return f26082u;
    }

    /* renamed from: d */
    public static long m18977d() {
        if (f26076o < 0) {
            return 0;
        }
        try {
            int i = f26076o;
            StringBuilder sb = new StringBuilder("/proc/self/task/");
            sb.append(i);
            sb.append("/stat");
            String[] f = C9695g.m19368f(sb.toString());
            if (f == null) {
                return -1;
            }
            return (Long.parseLong(f[11]) * C9651a.m19248a()) + (Long.parseLong(f[12]) * C9651a.m19248a());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: f */
    private static List<C9566a> m18979f() {
        if (f26064c == null) {
            return null;
        }
        f26075n = true;
        ArrayList arrayList = new ArrayList();
        if (f26064c.size() == f26063b) {
            for (int i = f26081t; i < f26064c.size(); i++) {
                arrayList.add((C9566a) f26064c.get(i));
            }
            for (int i2 = 0; i2 < f26081t; i2++) {
                arrayList.add((C9566a) f26064c.get(i2));
            }
        } else {
            arrayList.addAll(f26064c);
        }
        f26075n = false;
        return arrayList;
    }

    /* renamed from: a */
    public static C9566a m18970a() {
        if (f26064c.size() == f26063b) {
            f26081t = (f26081t + 1) % f26063b;
            return (C9566a) f26064c.get(f26081t);
        }
        C9566a aVar = new C9566a();
        f26064c.add(aVar);
        f26081t++;
        return aVar;
    }

    /* renamed from: a */
    private static Message m18968a(Message message) {
        if (f26084w == null) {
            try {
                Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
                f26084w = declaredField;
                declaredField.setAccessible(true);
                return (Message) f26084w.get(message);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) f26084w.get(message);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    static Message m18969a(MessageQueue messageQueue) {
        if (f26083v == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                f26083v = declaredField;
                declaredField.setAccessible(true);
                return (Message) f26083v.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) f26083v.get(messageQueue);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m18972a(long j) {
        long j2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", f26074m);
            String str = "currentMessageCost";
            if (f26078q < 0) {
                j2 = (SystemClock.uptimeMillis() - f26067f) - (f26079r * f26066e);
            } else {
                j2 = (SystemClock.uptimeMillis() - f26067f) - (f26078q * f26066e);
            }
            jSONObject.put(str, j2);
            jSONObject.put("currentMessageCpu", m18978e() - f26069h);
            jSONObject.put("currentTick", f26065d.get());
        } catch (Throwable th) {
            C9577e.m18999a().mo17384a("NPTH_CATCH", th);
        }
        return jSONObject;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:14|15|16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        return r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x002a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONArray m18971a(int r6, long r7) {
        /*
            android.os.MessageQueue r6 = m18976c()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            if (r6 != 0) goto L_0x000c
            return r0
        L_0x000c:
            monitor-enter(r6)     // Catch:{ Throwable -> 0x0037 }
            android.os.Message r1 = m18969a(r6)     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0015
            monitor-exit(r6)     // Catch:{ all -> 0x0034 }
            return r0
        L_0x0015:
            r2 = 0
            r3 = 0
        L_0x0017:
            if (r1 == 0) goto L_0x0032
            r4 = 100
            if (r2 >= r4) goto L_0x0032
            int r2 = r2 + 1
            int r3 = r3 + 1
            org.json.JSONObject r4 = m18973a(r1, r7)     // Catch:{ all -> 0x0034 }
            java.lang.String r5 = "id"
            r4.put(r5, r3)     // Catch:{ JSONException -> 0x002a }
        L_0x002a:
            r0.put(r4)     // Catch:{ all -> 0x0034 }
            android.os.Message r1 = m18968a(r1)     // Catch:{ all -> 0x0034 }
            goto L_0x0017
        L_0x0032:
            monitor-exit(r6)     // Catch:{ all -> 0x0034 }
            return r0
        L_0x0034:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0034 }
            throw r7     // Catch:{ Throwable -> 0x0037 }
        L_0x0037:
            r6 = move-exception
            com.bytedance.crash.f r7 = com.bytedance.crash.C9577e.m18999a()
            java.lang.String r8 = "NPTH_CATCH"
            r7.mo17384a(r8, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p540b.C9560f.m18971a(int, long):org.json.JSONArray");
    }

    /* renamed from: a */
    private static JSONObject m18973a(Message message, long j) {
        JSONObject jSONObject = new JSONObject();
        if (message == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("when", message.getWhen() - j);
            if (message.getCallback() != null) {
                jSONObject.put("callback", String.valueOf(message.getCallback()));
            }
            jSONObject.put("what", message.what);
            if (message.getTarget() != null) {
                jSONObject.put("target", String.valueOf(message.getTarget()));
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            if (message.obj != null) {
                jSONObject.put("obj", message.obj);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m18974a(C9566a aVar, long j, long j2, long j3, int i, int i2, String str) {
        aVar.f26090e = j;
        aVar.f26088c = j3;
        aVar.f26089d = j2;
        aVar.f26091f = false;
        aVar.f26086a = i2;
        if (str != null) {
            aVar.f26092g = str;
        }
        aVar.f26087b = i;
    }
}
