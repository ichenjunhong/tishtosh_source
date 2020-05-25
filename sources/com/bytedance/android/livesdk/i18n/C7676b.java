package com.bytedance.android.livesdk.i18n;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.i18n.b */
public final class C7676b {

    /* renamed from: f */
    private static C7676b f21147f;

    /* renamed from: a */
    public String f21148a = "";

    /* renamed from: b */
    public long f21149b;

    /* renamed from: c */
    public Map<String, String> f21150c = new HashMap();

    /* renamed from: d */
    public I18nUpdateManager f21151d;

    /* renamed from: e */
    public C7679c f21152e;

    /* renamed from: g */
    private C7674a f21153g = new C7674a() {
        /* renamed from: a */
        public final void mo14035a(String str, long j, Map<String, String> map) {
            if (TextUtils.isEmpty(str) || !TextUtils.equals(str, C7676b.this.f21148a)) {
                TextUtils.isEmpty(str);
            } else if (j == C7676b.this.f21149b) {
                if (C7676b.this.f21150c != null && C7676b.this.f21150c.isEmpty()) {
                    C7676b.this.f21152e.mo14042b();
                }
            } else if (map == null || map.isEmpty()) {
                if (C7676b.this.f21150c != null && C7676b.this.f21150c.isEmpty()) {
                    C7676b.this.f21152e.mo14042b();
                }
            } else {
                C7676b.this.f21149b = j;
                C7676b.this.f21150c = map;
                C7676b.this.f21152e.mo14041a(j, map);
            }
        }
    };

    /* renamed from: h */
    private C7680a f21154h = new C7680a() {
        /* renamed from: a */
        public final void mo14039a(String str, Exception exc) {
            if (TextUtils.isEmpty(str) || !TextUtils.equals(C7676b.this.f21148a, str)) {
                TextUtils.isEmpty(str);
            }
            C7676b.this.f21151d.mo14031a(C7676b.this.f21149b);
        }

        /* renamed from: a */
        public final void mo14038a(String str, C7681b bVar) {
            if (TextUtils.isEmpty(str) || !TextUtils.equals(C7676b.this.f21148a, str)) {
                TextUtils.isEmpty(str);
                C7676b.this.f21151d.mo14031a(C7676b.this.f21149b);
            } else if (bVar.f21168b != C7676b.this.f21149b) {
                if (bVar.f21169c == null || bVar.f21169c.isEmpty()) {
                    C7676b.this.f21151d.mo14031a(C7676b.this.f21149b);
                    return;
                }
                C7676b.this.f21149b = bVar.f21168b;
                C7676b.this.f21150c = bVar.f21169c;
                C7676b.this.f21151d.mo14031a(C7676b.this.f21149b);
            }
        }
    };

    /* renamed from: a */
    public static C7676b m15696a() {
        if (f21147f == null) {
            f21147f = new C7676b();
        }
        return f21147f;
    }

    private C7676b() {
    }

    /* renamed from: a */
    public final String mo14036a(String str) {
        if (this.f21150c.containsKey(str)) {
            return (String) this.f21150c.get(str);
        }
        if (this.f21151d != null) {
            this.f21151d.mo14031a(this.f21149b);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo14037a(Locale locale) {
        if (locale != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage());
            sb.append("_");
            sb.append(locale.getCountry().toLowerCase());
            String sb2 = sb.toString();
            if (!TextUtils.equals(sb2, this.f21148a)) {
                if (this.f21151d != null) {
                    I18nUpdateManager i18nUpdateManager = this.f21151d;
                    i18nUpdateManager.f21133b.removeCallbacksAndMessages(null);
                    if (i18nUpdateManager.f21139h != null && !i18nUpdateManager.f21139h.isDisposed()) {
                        i18nUpdateManager.f21139h.dispose();
                    }
                    i18nUpdateManager.f21134c = null;
                }
                if (this.f21152e != null) {
                    C7679c cVar = this.f21152e;
                    if (cVar.f21163g != null && !cVar.f21163g.isDisposed()) {
                        cVar.f21163g.dispose();
                    }
                    if (cVar.f21164h != null && !cVar.f21164h.isDisposed()) {
                        cVar.f21164h.dispose();
                    }
                    cVar.f21160d = null;
                }
                this.f21150c.clear();
                this.f21149b = 0;
                this.f21152e = new C7679c(sb2, this.f21154h);
                this.f21151d = new I18nUpdateManager(sb2, this.f21153g);
                if (TextUtils.isEmpty(this.f21148a)) {
                    this.f21152e.mo14042b();
                } else {
                    this.f21151d.mo14031a(this.f21149b);
                }
                this.f21148a = sb2;
            }
        }
    }
}
