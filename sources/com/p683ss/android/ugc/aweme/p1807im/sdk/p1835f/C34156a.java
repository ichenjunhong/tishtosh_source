package com.p683ss.android.ugc.aweme.p1807im.sdk.p1835f;

import android.text.TextUtils;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.common.C26883g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.f.a */
public abstract class C34156a {

    /* renamed from: a */
    public final String f88268a;

    /* renamed from: b */
    public final Map<String, String> f88269b = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.f.a$a */
    interface C34158a {

        /* renamed from: a */
        public static final C34158a f88271a = new C34158a() {
            /* renamed from: a */
            public final String mo72129a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b */
        public static final C34158a f88272b = new C34158a() {
            /* renamed from: a */
            public final String mo72129a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: a */
        String mo72129a(String str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo72127b();

    /* renamed from: a */
    public final void mo72125a() {
        mo72127b();
        C18842a.m45932a(new Runnable() {
            public final void run() {
                try {
                    C26883g.m64995a(C34156a.this.f88268a, C34156a.this.f88269b);
                } catch (Throwable unused) {
                }
            }
        });
    }

    C34156a(String str) {
        this.f88268a = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo72126a(String str, String str2, C34158a aVar) {
        this.f88269b.put(str, aVar.mo72129a(str2));
    }
}
