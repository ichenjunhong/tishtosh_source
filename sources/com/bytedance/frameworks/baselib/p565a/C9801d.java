package com.bytedance.frameworks.baselib.p565a;

import android.content.Context;
import java.io.UnsupportedEncodingException;

/* renamed from: com.bytedance.frameworks.baselib.a.d */
public final class C9801d {

    /* renamed from: a */
    public static C9803b f26667a = new C9802a();

    /* renamed from: b */
    public static boolean f26668b;

    /* renamed from: com.bytedance.frameworks.baselib.a.d$a */
    public static class C9802a implements C9803b {
        /* renamed from: a */
        public final boolean mo16513a(Context context) {
            return false;
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.a.d$b */
    public interface C9803b {
        /* renamed from: a */
        boolean mo16513a(Context context);
    }

    /* renamed from: a */
    public static byte[] m19625a(String str) {
        byte[] bArr;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    bArr = str.getBytes("UTF-8");
                    return bArr;
                }
            } catch (UnsupportedEncodingException unused) {
                return str.getBytes();
            }
        }
        bArr = null;
        return bArr;
    }
}
