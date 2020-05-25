package com.p683ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.google.gson.C17971f;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.az */
public final class C42438az {

    /* renamed from: a */
    public Map<String, String> f107329a = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.az$a */
    public interface C42439a {

        /* renamed from: a */
        public static final C42439a f107330a = new C42439a() {
            /* renamed from: a */
            public final String mo86528a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b */
        public static final C42439a f107331b = new C42439a() {
            /* renamed from: a */
            public final String mo86528a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: a */
        String mo86528a(String str);
    }

    /* renamed from: a */
    public static C42438az m93209a() {
        return new C42438az();
    }

    /* renamed from: a */
    public final C42438az mo86523a(String str, int i) {
        return m93210a(str, String.valueOf(i), C42439a.f107330a);
    }

    /* renamed from: a */
    public final C42438az mo86524a(String str, long j) {
        return m93210a(str, String.valueOf(j), C42439a.f107330a);
    }

    /* renamed from: a */
    public final C42438az mo86525a(String str, Object obj) {
        if (obj != null) {
            mo86526a(str, new C17971f().mo34889b(obj));
        }
        return this;
    }

    /* renamed from: a */
    public final C42438az mo86526a(String str, String str2) {
        return m93210a(str, str2, C42439a.f107330a);
    }

    /* renamed from: a */
    public final C42438az mo86527a(String str, boolean z) {
        return m93210a(str, String.valueOf(z), C42439a.f107330a);
    }

    /* renamed from: a */
    private C42438az m93210a(String str, String str2, C42439a aVar) {
        this.f107329a.put(str, aVar.mo86528a(str2));
        return this;
    }
}
