package com.bytedance.android.live.core.p230g;

import com.bytedance.android.live.C2942b;
import com.google.gson.C18086p;
import com.google.gson.C18087q;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.android.live.core.g.t */
public final class C3913t {

    /* renamed from: a */
    private static C18087q f10929a = new C18087q();

    /* renamed from: a */
    public static String m9891a(Object obj) throws C18086p {
        if (obj == null) {
            return "";
        }
        try {
            return C2942b.m8369a().mo34889b(obj);
        } catch (Throwable th) {
            throw new C18086p(th);
        }
    }

    /* renamed from: a */
    public static <T> T m9890a(String str, Type type) {
        if (str == null) {
            return null;
        }
        try {
            return C2942b.m8369a().mo34885a(str, type);
        } catch (Exception unused) {
            return null;
        }
    }
}
