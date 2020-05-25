package com.p683ss.android.ugc.aweme.app.p1376f;

import android.text.TextUtils;
import com.google.gson.C17971f;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.app.f.d */
public final class C23089d {

    /* renamed from: a */
    public Map<String, String> f61491a = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.app.f.d$a */
    public interface C23090a {

        /* renamed from: a */
        public static final C23090a f61492a = new C23090a() {
            /* renamed from: a */
            public final String mo47832a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b */
        public static final C23090a f61493b = new C23090a() {
            /* renamed from: a */
            public final String mo47832a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: a */
        String mo47832a(String str);
    }

    /* renamed from: a */
    public static C23089d m56640a() {
        return new C23089d();
    }

    /* renamed from: b */
    public final C23089d mo47831b() {
        mo47829a("_staging_flag", "1");
        return this;
    }

    /* renamed from: a */
    public final C23089d mo47830a(HashMap<? extends String, ? extends String> hashMap) {
        if (hashMap != null) {
            this.f61491a.putAll(hashMap);
        }
        return this;
    }

    /* renamed from: a */
    public final C23089d mo47826a(String str, int i) {
        return m56641a(str, String.valueOf(i), C23090a.f61492a);
    }

    /* renamed from: a */
    public final C23089d mo47827a(String str, long j) {
        return m56641a(str, String.valueOf(j), C23090a.f61492a);
    }

    /* renamed from: a */
    public final C23089d mo47828a(String str, Object obj) {
        if (obj != null) {
            mo47829a(str, new C17971f().mo34889b(obj));
        }
        return this;
    }

    /* renamed from: a */
    public final C23089d mo47829a(String str, String str2) {
        return m56641a(str, str2, C23090a.f61492a);
    }

    /* renamed from: a */
    private C23089d m56641a(String str, String str2, C23090a aVar) {
        this.f61491a.put(str, aVar.mo47832a(str2));
        return this;
    }
}
