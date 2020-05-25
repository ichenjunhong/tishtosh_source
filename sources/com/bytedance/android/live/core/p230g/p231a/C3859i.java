package com.bytedance.android.live.core.p230g.p231a;

import android.view.View;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.core.g.a.i */
public final class C3859i {

    /* renamed from: com.bytedance.android.live.core.g.a.i$a */
    static class C3861a extends HashMap<String, Object> {
        private C3861a(String str, Object obj) {
            put(str, obj);
        }
    }

    /* renamed from: a */
    public static Object m9787a(View view) {
        return m9788a(view, "DraweeHolder");
    }

    /* renamed from: a */
    public static Object m9788a(View view, String str) {
        return m9792b(view, str, null);
    }

    /* renamed from: a */
    public static void m9789a(View view, Object obj) {
        m9790a(view, "DraweeHolder", obj);
    }

    /* renamed from: b */
    private static Object m9792b(View view, String str, Object obj) {
        if (view != null) {
            Object tag = view.getTag();
            if (tag instanceof C3861a) {
                Object obj2 = ((C3861a) tag).get(str);
                if (obj2 != null) {
                    return obj2;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m9790a(View view, String str, Object obj) {
        return m9791a(view, str, obj, true);
    }

    /* renamed from: a */
    private static boolean m9791a(View view, String str, Object obj, boolean z) {
        if (view == null) {
            return false;
        }
        Object tag = view.getTag();
        if (tag instanceof C3861a) {
            ((C3861a) tag).put(str, obj);
            return true;
        }
        view.setTag(new C3861a(str, obj));
        return true;
    }
}
