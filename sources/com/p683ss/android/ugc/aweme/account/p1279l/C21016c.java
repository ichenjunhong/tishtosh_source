package com.p683ss.android.ugc.aweme.account.p1279l;

import android.text.TextUtils;
import com.p683ss.android.common.p1146d.C18894a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.common.C26883g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.l.c */
public abstract class C21016c {

    /* renamed from: a */
    protected final String f57143a;

    /* renamed from: b */
    private final Map<String, String> f57144b = new HashMap();

    /* renamed from: c */
    private boolean f57145c = false;

    /* renamed from: d */
    private Map<String, String> f57146d = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.account.l.c$a */
    public interface C21017a {

        /* renamed from: a */
        public static final C21017a f57147a = new C21017a() {
            /* renamed from: a */
            public final String mo44992a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b */
        public static final C21017a f57148b = new C21017a() {
            /* renamed from: a */
            public final String mo44992a(String str) {
                if (TextUtils.isEmpty(str) || TEVideoRecorder.FACE_BEAUTY_NULL.equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: a */
        String mo44992a(String str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo44985a();

    /* renamed from: b */
    public final void mo44990b() {
        mo44985a();
        this.f57144b.putAll(this.f57146d);
        C18842a.m45932a(new C21020d(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo44991c() {
        try {
            if (this.f57145c) {
                C18894a.m46006a(this.f57143a, C21021e.m53411a(this.f57144b));
                return;
            }
            C26883g.m64995a(this.f57143a, this.f57144b);
        } catch (Throwable unused) {
        }
    }

    C21016c(String str) {
        this.f57143a = str;
    }

    /* renamed from: a */
    public final void mo44989a(String str, String str2, C21017a aVar) {
        this.f57144b.put(str, aVar.mo44992a(str2));
    }
}
