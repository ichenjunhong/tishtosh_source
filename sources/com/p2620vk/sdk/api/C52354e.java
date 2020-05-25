package com.p2620vk.sdk.api;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import com.C2240a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p2620vk.sdk.C52322a;
import com.p2620vk.sdk.C52420c;
import com.p2620vk.sdk.C52421d;
import com.p2620vk.sdk.VKSdk;
import com.p2620vk.sdk.api.model.VKApiModel;
import com.p2620vk.sdk.api.p2622a.C52327a;
import com.p2620vk.sdk.api.p2622a.C52327a.C52330a;
import com.p2620vk.sdk.api.p2622a.C52327a.C52331b;
import com.p2620vk.sdk.api.p2622a.C52327a.C52332c;
import com.p2620vk.sdk.api.p2622a.C52333b;
import com.p2620vk.sdk.api.p2622a.C52333b.C52337a;
import com.p2620vk.sdk.api.p2622a.C52341d;
import com.p2620vk.sdk.api.p2622a.C52347f;
import com.p2620vk.sdk.api.p2622a.C52347f.C52348a;
import com.p2620vk.sdk.api.p2622a.C52349g;
import com.p2620vk.sdk.p2621a.C52324b;
import com.p2620vk.sdk.p2621a.C52325c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.e */
public final class C52354e extends C52420c {

    /* renamed from: c */
    public final Context f130357c;

    /* renamed from: d */
    public final String f130358d;

    /* renamed from: e */
    public final C52352c f130359e;

    /* renamed from: f */
    public C52327a f130360f;

    /* renamed from: g */
    public int f130361g;

    /* renamed from: h */
    public ArrayList<C52354e> f130362h;

    /* renamed from: i */
    public boolean f130363i;

    /* renamed from: j */
    public C52359a f130364j;

    /* renamed from: k */
    public boolean f130365k;

    /* renamed from: l */
    public int f130366l;

    /* renamed from: m */
    public boolean f130367m;

    /* renamed from: n */
    public boolean f130368n;

    /* renamed from: o */
    public boolean f130369o;

    /* renamed from: p */
    public WeakReference<C52360f> f130370p;

    /* renamed from: q */
    private C52352c f130371q;

    /* renamed from: r */
    private Class<? extends VKApiModel> f130372r;

    /* renamed from: s */
    private C52353d f130373s;

    /* renamed from: t */
    private String f130374t;

    /* renamed from: u */
    private Looper f130375u;

    /* renamed from: com.vk.sdk.api.e$a */
    public static abstract class C52359a {
        /* renamed from: a */
        public void mo109126a(C52351b bVar) {
        }

        /* renamed from: a */
        public void mo109127a(C52360f fVar) {
        }
    }

    /* renamed from: c */
    public final void mo109167c() {
        this.f130361g = 0;
        this.f130371q = null;
        this.f130360f = null;
        mo109166b();
    }

    /* renamed from: b */
    public final void mo109166b() {
        C52327a f = m111837f();
        this.f130360f = f;
        if (f != null) {
            if (this.f130375u == null) {
                this.f130375u = Looper.myLooper();
            }
            C52333b.m111807a(this.f130360f);
        }
    }

    /* renamed from: d */
    public final void mo109168d() {
        if (this.f130360f != null) {
            this.f130360f.mo109139a();
        } else {
            mo109162a(new C52351b(-102));
        }
    }

    /* renamed from: f */
    private C52327a m111837f() {
        if (this.f130369o) {
            if (this.f130372r != null) {
                this.f130360f = new C52349g(m111836e(), this.f130372r);
            } else if (this.f130373s != null) {
                this.f130360f = new C52349g(m111836e(), this.f130373s);
            }
        }
        if (this.f130360f == null) {
            this.f130360f = new C52347f(m111836e());
        }
        if (this.f130360f instanceof C52341d) {
            C52341d dVar = (C52341d) this.f130360f;
            dVar.f130308a = new C52331b(new C52348a() {
                /* renamed from: a */
                public final /* synthetic */ void mo109144a(C52327a aVar, C52351b bVar) {
                    C52347f fVar = (C52347f) aVar;
                    if (bVar.f130350f == -102 || bVar.f130350f == -101 || fVar == null || fVar.f130332e == null || fVar.f130332e.f130326a != 200) {
                        if (C52354e.this.f130366l != 0) {
                            C52354e eVar = C52354e.this;
                            int i = eVar.f130361g + 1;
                            eVar.f130361g = i;
                            if (i >= C52354e.this.f130366l) {
                                C52354e.this.mo109162a(bVar);
                                return;
                            }
                        }
                        C52354e.this.mo109164a((Runnable) new Runnable() {
                            public final void run() {
                                C52354e.this.mo109166b();
                            }
                        }, 300);
                        return;
                    }
                    C52354e.this.mo109165a(fVar.mo109158f(), (Object) null);
                }

                /* JADX WARNING: Removed duplicated region for block: B:24:0x006d A[Catch:{ JSONException -> 0x0074 }, RETURN] */
                /* JADX WARNING: Removed duplicated region for block: B:25:0x006e A[Catch:{ JSONException -> 0x0074 }] */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ void mo109145a(com.p2620vk.sdk.api.p2622a.C52327a r6, java.lang.Object r7) {
                    /*
                        r5 = this;
                        com.vk.sdk.api.a.f r6 = (com.p2620vk.sdk.api.p2622a.C52347f) r6
                        org.json.JSONObject r7 = (org.json.JSONObject) r7
                        java.lang.String r6 = "error"
                        boolean r6 = r7.has(r6)
                        r0 = 0
                        if (r6 == 0) goto L_0x0075
                        com.vk.sdk.api.b r6 = new com.vk.sdk.api.b     // Catch:{ JSONException -> 0x0074 }
                        java.lang.String r1 = "error"
                        org.json.JSONObject r7 = r7.getJSONObject(r1)     // Catch:{ JSONException -> 0x0074 }
                        r6.<init>(r7)     // Catch:{ JSONException -> 0x0074 }
                        com.vk.sdk.api.e r7 = com.p2620vk.sdk.api.C52354e.this     // Catch:{ JSONException -> 0x0074 }
                        int r1 = r6.f130350f     // Catch:{ JSONException -> 0x0074 }
                        r2 = -101(0xffffffffffffff9b, float:NaN)
                        r3 = 1
                        if (r1 != r2) goto L_0x006a
                        com.vk.sdk.api.b r1 = r6.f130348d     // Catch:{ JSONException -> 0x0074 }
                        int r2 = r1.f130350f     // Catch:{ JSONException -> 0x0074 }
                        r4 = 5
                        if (r2 != r4) goto L_0x002f
                        android.content.Context r2 = com.p2620vk.sdk.C52421d.m111976a()     // Catch:{ JSONException -> 0x0074 }
                        com.p2620vk.sdk.VKSdk.m111764b(r2)     // Catch:{ JSONException -> 0x0074 }
                    L_0x002f:
                        int r2 = r1.f130350f     // Catch:{ JSONException -> 0x0074 }
                        r4 = 16
                        if (r2 != r4) goto L_0x0044
                        com.vk.sdk.a r0 = com.p2620vk.sdk.C52322a.m111781b()     // Catch:{ JSONException -> 0x0074 }
                        if (r0 == 0) goto L_0x0040
                        r0.f130302e = r3     // Catch:{ JSONException -> 0x0074 }
                        r0.mo109137c()     // Catch:{ JSONException -> 0x0074 }
                    L_0x0040:
                        r7.mo109167c()     // Catch:{ JSONException -> 0x0074 }
                        goto L_0x006b
                    L_0x0044:
                        boolean r2 = r7.f130365k     // Catch:{ JSONException -> 0x0074 }
                        if (r2 == 0) goto L_0x006a
                        r1.f130349e = r7     // Catch:{ JSONException -> 0x0074 }
                        com.vk.sdk.api.b r2 = r6.f130348d     // Catch:{ JSONException -> 0x0074 }
                        int r2 = r2.f130350f     // Catch:{ JSONException -> 0x0074 }
                        r4 = 14
                        if (r2 != r4) goto L_0x005c
                        r7.f130360f = r0     // Catch:{ JSONException -> 0x0074 }
                        android.content.Context r7 = r7.f130357c     // Catch:{ JSONException -> 0x0074 }
                        com.vk.sdk.VKServiceActivity$a r0 = com.p2620vk.sdk.VKServiceActivity.C52321a.Captcha     // Catch:{ JSONException -> 0x0074 }
                        com.p2620vk.sdk.VKServiceActivity.m111773a(r7, r1, r0)     // Catch:{ JSONException -> 0x0074 }
                        goto L_0x006b
                    L_0x005c:
                        int r0 = r1.f130350f     // Catch:{ JSONException -> 0x0074 }
                        r2 = 17
                        if (r0 != r2) goto L_0x006a
                        android.content.Context r7 = r7.f130357c     // Catch:{ JSONException -> 0x0074 }
                        com.vk.sdk.VKServiceActivity$a r0 = com.p2620vk.sdk.VKServiceActivity.C52321a.Validation     // Catch:{ JSONException -> 0x0074 }
                        com.p2620vk.sdk.VKServiceActivity.m111773a(r7, r1, r0)     // Catch:{ JSONException -> 0x0074 }
                        goto L_0x006b
                    L_0x006a:
                        r3 = 0
                    L_0x006b:
                        if (r3 == 0) goto L_0x006e
                        return
                    L_0x006e:
                        com.vk.sdk.api.e r7 = com.p2620vk.sdk.api.C52354e.this     // Catch:{ JSONException -> 0x0074 }
                        r7.mo109162a(r6)     // Catch:{ JSONException -> 0x0074 }
                        goto L_0x008a
                    L_0x0074:
                        return
                    L_0x0075:
                        com.vk.sdk.api.e r6 = com.p2620vk.sdk.api.C52354e.this
                        com.vk.sdk.api.e r1 = com.p2620vk.sdk.api.C52354e.this
                        com.vk.sdk.api.a.a r1 = r1.f130360f
                        boolean r1 = r1 instanceof com.p2620vk.sdk.api.p2622a.C52349g
                        if (r1 == 0) goto L_0x0087
                        com.vk.sdk.api.e r0 = com.p2620vk.sdk.api.C52354e.this
                        com.vk.sdk.api.a.a r0 = r0.f130360f
                        com.vk.sdk.api.a.g r0 = (com.p2620vk.sdk.api.p2622a.C52349g) r0
                        java.lang.Object r0 = r0.f130343h
                    L_0x0087:
                        r6.mo109165a(r7, r0)
                    L_0x008a:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2620vk.sdk.api.C52354e.C523551.mo109145a(com.vk.sdk.api.a.a, java.lang.Object):void");
                }
            }) {

                /* renamed from: a */
                final /* synthetic */ C52330a f130334a;

                /* renamed from: a */
                public final void mo109146a() {
                    if (C52341d.this.f130309b == C52332c.Finished && C52341d.this.f130331d == null) {
                        this.f130334a.mo109145a(C52341d.this, C52341d.this.mo109152c());
                    } else {
                        this.f130334a.mo109144a(C52341d.this, C52341d.this.mo109151a(C52341d.this.f130331d));
                    }
                }

                {
                    this.f130334a = r2;
                }
            };
        }
        return this.f130360f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("{");
        sb.append(this.f130358d);
        sb.append(" ");
        C52352c cVar = this.f130359e;
        for (String str : cVar.keySet()) {
            sb.append(str);
            sb.append("=");
            sb.append(cVar.get(str));
            sb.append(" ");
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: e */
    private C52337a m111836e() {
        String str;
        C52322a b = C52322a.m111781b();
        Locale locale = Locale.US;
        String str2 = "http%s://api.vk.com/method/%s";
        Object[] objArr = new Object[2];
        if (this.f130367m || (b != null && b.f130302e)) {
            str = "s";
        } else {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = this.f130358d;
        C52337a aVar = new C52337a(C2240a.m6773a(locale, str2, objArr));
        aVar.f130323e = new HashMap<String, String>() {
            private static final long serialVersionUID = 200199014417610665L;

            {
                put("Accept-Encoding", "gzip");
            }
        };
        if (this.f130371q == null) {
            this.f130371q = new C52352c(this.f130359e);
            C52322a b2 = C52322a.m111781b();
            if (b2 != null) {
                this.f130371q.put("access_token", b2.f130298a);
                if (b2.f130302e) {
                    this.f130367m = true;
                }
            }
            this.f130371q.put("v", VKSdk.m111768c());
            C52352c cVar = this.f130371q;
            String str3 = "lang";
            String str4 = this.f130374t;
            Resources system = Resources.getSystem();
            if (this.f130368n && system != null) {
                str4 = system.getConfiguration().locale.getLanguage();
                if (str4.equals("uk")) {
                    str4 = "ua";
                }
                if (!Arrays.asList(new String[]{"ru", "en", "ua", "es", "fi", "de", "it"}).contains(str4)) {
                    str4 = this.f130374t;
                }
            }
            cVar.put(str3, str4);
            if (this.f130367m) {
                this.f130371q.put(WebKitApi.SCHEME_HTTPS, "1");
            }
            if (!(b2 == null || b2.f130301d == null)) {
                String a = C2240a.m6773a(Locale.US, "/method/%s?%s", new Object[]{this.f130358d, C52324b.m111790a(this.f130371q)});
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append(b2.f130301d);
                this.f130371q.put("sig", C52325c.m111796b(sb.toString()));
            }
        }
        aVar.mo109150a(this.f130371q);
        return aVar;
    }

    public C52354e(String str) {
        this(str, null);
    }

    /* renamed from: a */
    private void m111835a(Runnable runnable) {
        mo109164a(runnable, 0);
    }

    /* renamed from: a */
    public final void mo109163a(C52359a aVar) {
        this.f130364j = aVar;
        mo109166b();
    }

    /* renamed from: a */
    public final void mo109162a(final C52351b bVar) {
        bVar.f130349e = this;
        final boolean z = this.f130363i;
        if (!z && this.f130364j != null) {
            this.f130364j.mo109126a(bVar);
        }
        m111835a((Runnable) new Runnable() {
            public final void run() {
                if (z && C52354e.this.f130364j != null) {
                    C52354e.this.f130364j.mo109126a(bVar);
                }
                if (C52354e.this.f130362h != null && C52354e.this.f130362h.size() > 0) {
                    Iterator it = C52354e.this.f130362h.iterator();
                    while (it.hasNext()) {
                        C52354e eVar = (C52354e) it.next();
                        if (eVar.f130364j != null) {
                            eVar.f130364j.mo109126a(bVar);
                        }
                    }
                }
            }
        });
    }

    private C52354e(String str, C52352c cVar) {
        this(str, null, null);
    }

    /* renamed from: a */
    public final void mo109164a(Runnable runnable, int i) {
        if (this.f130375u == null) {
            this.f130375u = Looper.getMainLooper();
        }
        if (i > 0) {
            new Handler(this.f130375u).postDelayed(runnable, (long) i);
        } else {
            new Handler(this.f130375u).post(runnable);
        }
    }

    /* renamed from: a */
    public final void mo109165a(JSONObject jSONObject, Object obj) {
        final C52360f fVar = new C52360f();
        fVar.f130384a = this;
        fVar.f130385b = jSONObject;
        fVar.f130387d = obj;
        this.f130370p = new WeakReference<>(fVar);
        if (this.f130360f instanceof C52341d) {
            fVar.f130386c = ((C52341d) this.f130360f).mo109154e();
        }
        final boolean z = this.f130363i;
        m111835a((Runnable) new Runnable() {
            public final void run() {
                if (C52354e.this.f130362h != null && C52354e.this.f130362h.size() > 0) {
                    Iterator it = C52354e.this.f130362h.iterator();
                    while (it.hasNext()) {
                        ((C52354e) it.next()).mo109166b();
                    }
                }
                if (z && C52354e.this.f130364j != null) {
                    C52354e.this.f130364j.mo109127a(fVar);
                }
            }
        });
        if (!z && this.f130364j != null) {
            this.f130364j.mo109127a(fVar);
        }
    }

    private C52354e(String str, C52352c cVar, Class<? extends VKApiModel> cls) {
        this.f130363i = true;
        this.f130357c = C52421d.m111976a();
        this.f130358d = str;
        if (cVar == null) {
            cVar = new C52352c();
        }
        this.f130359e = new C52352c(cVar);
        this.f130361g = 0;
        this.f130367m = true;
        this.f130366l = 1;
        this.f130374t = "en";
        this.f130368n = true;
        this.f130365k = true;
        this.f130372r = null;
        if (this.f130372r != null) {
            this.f130369o = true;
        }
    }
}
