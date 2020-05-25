package com.p683ss.android.ugc.aweme.account.p1260a.p1262b;

import android.text.TextUtils;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.a.b.a */
public final class C20856a {

    /* renamed from: a */
    public Map<String, String> f56798a = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.account.a.b.a$a */
    public interface C20857a {

        /* renamed from: a */
        public static final C20857a f56799a = new C20857a() {
            /* renamed from: a */
            public final String mo44777a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b */
        public static final C20857a f56800b = new C20857a() {
            /* renamed from: a */
            public final String mo44777a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: a */
        String mo44777a(String str);
    }

    /* renamed from: a */
    public static C20856a m53173a() {
        return new C20856a();
    }

    /* renamed from: a */
    public final C20856a mo44774a(String str, int i) {
        return m53174a(str, String.valueOf(i), C20857a.f56799a);
    }

    /* renamed from: a */
    public final C20856a mo44775a(String str, long j) {
        return m53174a(str, String.valueOf(j), C20857a.f56799a);
    }

    /* renamed from: a */
    public final C20856a mo44776a(String str, String str2) {
        return m53174a(str, str2, C20857a.f56799a);
    }

    /* renamed from: a */
    private C20856a m53174a(String str, String str2, C20857a aVar) {
        this.f56798a.put(str, aVar.mo44777a(str2));
        return this;
    }
}
