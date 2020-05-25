package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import com.p683ss.android.ugc.tools.utils.C50202f;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.a */
public final class C45371a {

    /* renamed from: f */
    public static HashMap<String, C45371a> f114736f = new HashMap<>();

    /* renamed from: g */
    public static final C45372a f114737g = new C45372a(null);

    /* renamed from: a */
    C45373b f114738a;

    /* renamed from: b */
    int f114739b;

    /* renamed from: c */
    boolean f114740c;

    /* renamed from: d */
    public final Context f114741d;

    /* renamed from: e */
    public final String f114742e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.a$a */
    public static final class C45372a {
        private C45372a() {
        }

        public /* synthetic */ C45372a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m98925a(String str, String str2, C45373b bVar) {
            StringBuilder sb = new StringBuilder("av-performance\nmonitor instant value => \nscene = ");
            sb.append(str);
            sb.append(", action = ");
            sb.append(str2);
            sb.append("\ncurrent memory snapshot: ");
            sb.append("app memory usage = ");
            sb.append(bVar.f114743a);
            sb.append(" Mb, system memory usage = ");
            sb.append(bVar.f114744b);
            sb.append(" Mb, available memory = ");
            sb.append(bVar.f114745c);
            sb.append(" Mb. ");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder("\n");
            sb3.append(sb2);
            C45407ay.m98973d(sb3.toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.a$b */
    public static final class C45373b {

        /* renamed from: a */
        public long f114743a;

        /* renamed from: b */
        public long f114744b;

        /* renamed from: c */
        public long f114745c;
    }

    public C45371a(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "scene");
        this.f114741d = context;
        this.f114742e = str;
    }

    /* renamed from: b */
    public static final C45371a m98923b(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "scene");
        if (f114736f.get(str) == null) {
            f114736f.put(str, new C45371a(context, str));
        }
        Object obj = f114736f.get(str);
        if (obj == null) {
            C52711k.m112234a();
        }
        return (C45371a) obj;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C45373b mo91712a(Context context, String str) {
        if (context != null) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                MemoryInfo memoryInfo = new MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                C45373b bVar = new C45373b();
                C45380af a = C45380af.m98935a();
                C52711k.m112236a((Object) a, "MemoryUtil.getInstance()");
                bVar.f114743a = C50202f.m108357b(a.f114756f);
                bVar.f114744b = C50202f.m108356a(memoryInfo.totalMem - memoryInfo.availMem);
                bVar.f114745c = C50202f.m108356a(memoryInfo.availMem);
                C45372a.m98925a(this.f114742e, str, bVar);
                return bVar;
            }
        }
        return null;
    }
}
