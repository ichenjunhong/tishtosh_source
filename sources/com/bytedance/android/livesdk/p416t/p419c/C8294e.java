package com.bytedance.android.livesdk.p416t.p419c;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.t.c.e */
public final class C8294e implements C8292c {

    /* renamed from: b */
    private static final Map<String, C8292c> f22638b;

    /* renamed from: a */
    C8292c f22639a;

    /* renamed from: com.bytedance.android.livesdk.t.c.e$a */
    static final class C8295a {

        /* renamed from: a */
        public static final C8292c f22640a = new C8294e();
    }

    /* renamed from: c */
    public static C8292c m16435c() {
        return C8295a.f22640a;
    }

    /* renamed from: b */
    public final boolean mo14474b() {
        return m16436d().mo14474b();
    }

    /* renamed from: a */
    public final boolean mo14473a() {
        return m16436d().mo14473a();
    }

    /* renamed from: d */
    private C8292c m16436d() {
        if (this.f22639a == null) {
            this.f22639a = new C8290a();
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str)) {
                String upperCase = str.toUpperCase();
                if (f22638b.containsKey(upperCase)) {
                    this.f22639a = (C8292c) f22638b.get(upperCase);
                }
            }
        }
        return this.f22639a;
    }

    static {
        HashMap hashMap = new HashMap();
        f22638b = hashMap;
        hashMap.put("VIVO", new C8297g());
        f22638b.put("MEIZU", new C8293d());
        f22638b.put("HUAWEI", new C8291b());
        f22638b.put("XIAOMI", new C8298h());
        f22638b.put("OPPO", new C8296f());
    }

    /* renamed from: a */
    public final Intent mo14472a(Context context) {
        return m16436d().mo14472a(context);
    }
}
