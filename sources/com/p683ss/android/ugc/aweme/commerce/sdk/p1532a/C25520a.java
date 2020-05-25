package com.p683ss.android.ugc.aweme.commerce.sdk.p1532a;

import android.text.TextUtils;
import android.util.Log;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.common.C26883g;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commerce.sdk.a.a */
public abstract class C25520a {

    /* renamed from: c */
    public static final C25521a f67495c = new C25521a(null);

    /* renamed from: a */
    public final HashMap<String, String> f67496a = new HashMap<>();

    /* renamed from: b */
    public final String f67497b;

    /* renamed from: d */
    private final HashMap<String, String> f67498d = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.a.a$a */
    public static final class C25521a {
        private C25521a() {
        }

        public /* synthetic */ C25521a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.a.a$b */
    public interface C25522b {

        /* renamed from: a */
        public static final C25523a f67499a = C25523a.f67500a;

        /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.a.a$b$a */
        public static final class C25523a {

            /* renamed from: a */
            static final /* synthetic */ C25523a f67500a = new C25523a();

            /* renamed from: b */
            private static final C25522b f67501b = new C25524a();

            /* renamed from: c */
            private static final C25522b f67502c = new C25525b();

            /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.a.a$b$a$a */
            public static final class C25524a implements C25522b {
                C25524a() {
                }

                /* renamed from: a */
                public final String mo52241a(String str) {
                    C52711k.m112240b(str, "param");
                    if (TextUtils.isEmpty(str) || C52711k.m112239a((Object) TEVideoRecorder.FACE_BEAUTY_NULL, (Object) str)) {
                        return "";
                    }
                    return str;
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.a.a$b$a$b */
            public static final class C25525b implements C25522b {
                C25525b() {
                }

                /* renamed from: a */
                public final String mo52241a(String str) {
                    C52711k.m112240b(str, "param");
                    if (TextUtils.isEmpty(str) || C52711k.m112239a((Object) TEVideoRecorder.FACE_BEAUTY_NULL, (Object) str) || C52711k.m112239a((Object) "0", (Object) str)) {
                        return "";
                    }
                    return str;
                }
            }

            private C25523a() {
            }

            /* renamed from: a */
            public static C25522b m62068a() {
                return f67501b;
            }
        }

        /* renamed from: a */
        String mo52241a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.sdk.a.a$c */
    static final class C25526c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C25520a f67503a;

        C25526c(C25520a aVar) {
            this.f67503a = aVar;
        }

        public final Object call() {
            try {
                C26883g.m64995a(this.f67503a.f67497b, this.f67503a.f67496a);
                return C52860x.f131107a;
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("post event failed: ");
                sb.append(this.f67503a.f67497b);
                return Integer.valueOf(Log.w("MetricsEvent", sb.toString(), th));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo52240b();

    /* renamed from: a */
    public final void mo52238a() {
        mo52239a("data_type", "commerce_data", C25523a.m62068a());
        mo52240b();
        this.f67496a.putAll(this.f67498d);
        C0013i.m16a((Callable<TResult>) new C25526c<TResult>(this));
    }

    public C25520a(String str) {
        C52711k.m112240b(str, "event");
        this.f67497b = str;
    }

    /* renamed from: a */
    public final void mo52239a(String str, String str2, C25522b bVar) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(bVar, "rule");
        if (str2 != null) {
            this.f67496a.put(str, bVar.mo52241a(str2));
        }
    }
}
