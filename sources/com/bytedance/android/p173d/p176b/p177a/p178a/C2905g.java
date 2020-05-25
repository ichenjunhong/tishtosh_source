package com.bytedance.android.p173d.p176b.p177a.p178a;

import com.bytedance.android.p173d.p176b.p177a.C2898a;
import java.util.List;

/* renamed from: com.bytedance.android.d.b.a.a.g */
public final class C2905g {
    /* renamed from: a */
    public static int m8262a(int i, String str) {
        int b = C2898a.m8238b(str);
        return b + C2898a.m8241e(b) + C2898a.m8241e((i << 3) | 0);
    }

    /* renamed from: a */
    public static int m8263a(int i, List<String> list) {
        int i2 = 0;
        for (String a : list) {
            i2 += m8262a(10, a);
        }
        return i2;
    }

    /* renamed from: a */
    public static void m8264a(C2898a aVar, int i, String str) {
        aVar.mo7529b((i << 3) | 2);
        aVar.mo7529b(C2898a.m8238b(str));
        aVar.mo7527a(str);
    }

    /* renamed from: a */
    public static void m8265a(C2898a aVar, int i, List<String> list) {
        for (String a : list) {
            m8264a(aVar, 10, a);
        }
    }
}
