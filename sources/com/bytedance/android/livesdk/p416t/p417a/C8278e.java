package com.bytedance.android.livesdk.p416t.p417a;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.t.a.e */
public final class C8278e implements C8277d {

    /* renamed from: a */
    private Map<String, C8277d> f22621a = new HashMap();

    /* renamed from: b */
    private C8277d f22622b;

    /* renamed from: com.bytedance.android.livesdk.t.a.e$a */
    static final class C8279a {

        /* renamed from: a */
        public static final C8278e f22623a = new C8278e();
    }

    /* renamed from: a */
    public static C8278e m16398a() {
        return C8279a.f22623a;
    }

    C8278e() {
        this.f22621a.put("android.permission.CAMERA", new C8275b());
        this.f22621a.put("android.permission.RECORD_AUDIO", new C8274a());
        this.f22621a.put("android.permission.READ_CONTACTS", new C8280f());
        this.f22622b = new C8276c();
    }

    /* renamed from: a */
    public final boolean mo14459a(Context context, String str) {
        if (this.f22621a.containsKey(str)) {
            return ((C8277d) this.f22621a.get(str)).mo14459a(context, str);
        }
        return this.f22622b.mo14459a(context, str);
    }

    /* renamed from: a */
    public final boolean mo14460a(Context context, String[] strArr) {
        for (String a : strArr) {
            if (!mo14459a(context, a)) {
                return false;
            }
        }
        return true;
    }
}
