package com.bytedance.android.livesdk.gift.assets;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.gift.assets.f */
public final class C7209f {

    /* renamed from: a */
    private static final Map<String, C7211h> f19589a = new HashMap();

    /* renamed from: a */
    public static C7211h m14962a(String str) {
        if (!f19589a.containsKey(str) || f19589a.get(str) == null) {
            f19589a.put(str, new C7203c(str));
        }
        return (C7211h) f19589a.get(str);
    }
}
