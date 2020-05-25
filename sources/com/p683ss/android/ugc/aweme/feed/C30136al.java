package com.p683ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.bytedance.jedi.arch.C11939z;
import java.util.List;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.feed.al */
public final class C30136al {

    /* renamed from: a */
    public static final C30136al f78658a = new C30136al();

    private C30136al() {
    }

    /* renamed from: a */
    public static C11939z<String, Long, Integer> m70721a(String str) {
        Object obj;
        Object obj2;
        if (str != null) {
            CharSequence charSequence = str;
            boolean z = true;
            List b = C52830p.m112452b(charSequence, new String[]{"&&"}, false, 0, 6, (Object) null);
            if (b.size() == 3) {
                try {
                    long parseLong = Long.parseLong((String) b.get(1));
                    if (System.currentTimeMillis() - parseLong <= 25200000) {
                        z = false;
                    }
                    if (!z) {
                        obj = Long.valueOf(parseLong);
                        obj2 = Integer.valueOf(Integer.parseInt((String) b.get(2)));
                        if (!(obj == null || obj2 == null || TextUtils.isEmpty((CharSequence) b.get(0)))) {
                            return new C11939z<>(b.get(0), obj, obj2);
                        }
                    }
                } catch (Exception unused) {
                }
                obj = null;
                try {
                    obj2 = Integer.valueOf(Integer.parseInt((String) b.get(2)));
                } catch (Exception unused2) {
                    obj2 = null;
                }
                return new C11939z<>(b.get(0), obj, obj2);
            }
        }
        return null;
    }
}
