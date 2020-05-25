package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.selectmsg;

import com.bytedance.p702im.core.p706c.C11207p;
import java.util.HashMap;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.selectmsg.b */
public final class C33707b {

    /* renamed from: a */
    public static HashMap<String, List<C11207p>> f87417a;

    /* renamed from: b */
    public static HashMap<String, Integer> f87418b;

    /* renamed from: c */
    public static final C33707b f87419c = new C33707b();

    private C33707b() {
    }

    /* renamed from: a */
    public static final void m77192a(String str) {
        HashMap<String, List<C11207p>> hashMap = f87417a;
        if (hashMap != null) {
            hashMap.remove(str);
        }
    }

    /* renamed from: a */
    public static final void m77193a(String str, Integer num) {
        if (f87418b == null) {
            f87418b = new HashMap<>();
        }
        HashMap<String, Integer> hashMap = f87418b;
        if (hashMap == null) {
            C52711k.m112234a();
        }
        hashMap.put(str, num);
    }
}
