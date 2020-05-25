package com.facebook.net;

import com.bytedance.common.utility.C9431p;
import java.util.HashMap;

/* renamed from: com.facebook.net.i */
public final class C14559i {

    /* renamed from: a */
    private final HashMap<String, Integer> f37832a = new HashMap<>();

    /* renamed from: a */
    public final int mo26795a(String str) {
        if (!C9431p.m18664a(str) && this.f37832a.containsKey(str)) {
            return ((Integer) this.f37832a.get(str)).intValue();
        }
        return -1;
    }
}
