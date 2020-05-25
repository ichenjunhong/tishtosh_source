package com.bytedance.android.live.core.p230g.p232b;

import android.content.res.Configuration;
import android.os.Build;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.p230g.p232b.p233a.C3877d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.live.core.g.b.b */
public final class C3882b {

    /* renamed from: a */
    static Map<String, C3885d> f10895a = new HashMap<String, C3885d>() {
        {
            put("HUAWEI", new C3877d());
        }
    };

    /* renamed from: a */
    public static int m9816a() {
        return m9817a(C3922z.m9901a().getConfiguration());
    }

    /* renamed from: b */
    public static boolean m9818b() {
        C3885d dVar = (C3885d) f10895a.get(Build.MANUFACTURER.toUpperCase().trim());
        if (dVar == null) {
            return false;
        }
        return dVar.mo9250a();
    }

    /* renamed from: a */
    private static int m9817a(Configuration configuration) {
        C3885d dVar = (C3885d) f10895a.get(Build.MANUFACTURER.toUpperCase().trim());
        if (dVar == null) {
            return -1;
        }
        return dVar.mo9249a(configuration);
    }
}
