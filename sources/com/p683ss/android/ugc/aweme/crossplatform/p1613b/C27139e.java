package com.p683ss.android.ugc.aweme.crossplatform.p1613b;

import android.net.Uri;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.b.e */
public final class C27139e {

    /* renamed from: a */
    public static final C52668f f71599a = C52732g.m112285a(C27141b.f71603a);

    /* renamed from: b */
    public static final C27140a f71600b = new C27140a(null);

    /* renamed from: c */
    private final Map<Object, C27142f> f71601c = new LinkedHashMap();

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.b.e$a */
    public static final class C27140a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f71602a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27140a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/crossplatform/monitor/StayTimeMonitor;"))};

        private C27140a() {
        }

        /* renamed from: a */
        public static C27139e m65474a() {
            return (C27139e) C27139e.f71599a.getValue();
        }

        public /* synthetic */ C27140a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.b.e$b */
    static final class C27141b extends C52712l implements C52670a<C27139e> {

        /* renamed from: a */
        public static final C27141b f71603a = new C27141b();

        C27141b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C27139e();
        }
    }

    /* renamed from: a */
    private static String m65469a(Object obj) {
        String str = "";
        if (obj == null || !(obj instanceof WebView)) {
            return str;
        }
        return "h5";
    }

    /* renamed from: a */
    public final void mo55457a(Object obj, String str, int i) {
        if (str != null) {
            try {
                Uri parse = Uri.parse(str);
                if (parse != null) {
                    if (!C52711k.m112239a((Object) parse.getQueryParameter("_enable_stay_time_report"), (Object) "1")) {
                        parse = null;
                    }
                    if (parse != null) {
                        String queryParameter = parse.getQueryParameter("_enter_from");
                        if (queryParameter != null) {
                            String queryParameter2 = parse.getQueryParameter("_project_name");
                            if (queryParameter2 == null) {
                                queryParameter2 = "unknown";
                            }
                            if (obj != null) {
                                switch (i) {
                                    case 1:
                                        if (this.f71601c.containsKey(obj)) {
                                            Object obj2 = this.f71601c.get(obj);
                                            if (obj2 == null) {
                                                C52711k.m112234a();
                                            }
                                            C27142f fVar = (C27142f) obj2;
                                            if (fVar.f71606b) {
                                                fVar.f71606b = false;
                                                fVar.mo55459a();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        if (!this.f71601c.containsKey(obj)) {
                                            m65471a(obj, queryParameter2, queryParameter, m65469a(obj));
                                            break;
                                        } else {
                                            m65470a(obj, queryParameter2, queryParameter, obj);
                                            break;
                                        }
                                    case 3:
                                        if (this.f71601c.containsKey(obj)) {
                                            m65470a(obj, queryParameter2, queryParameter, obj);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo55458b(Object obj, String str, int i) {
        if (str != null) {
            try {
                Uri parse = Uri.parse(str);
                if (parse != null) {
                    if (!C52711k.m112239a((Object) parse.getQueryParameter("_enable_stay_time_report"), (Object) "1")) {
                        parse = null;
                    }
                    if (!(parse == null || parse.getQueryParameter("_enter_from") == null)) {
                        parse.getQueryParameter("_project_name");
                        if (obj != null) {
                            if (!this.f71601c.containsKey(obj)) {
                                obj = null;
                            }
                            if (obj != null) {
                                switch (i) {
                                    case 1:
                                        Object obj2 = this.f71601c.get(obj);
                                        if (obj2 == null) {
                                            C52711k.m112234a();
                                        }
                                        C27142f fVar = (C27142f) obj2;
                                        fVar.f71606b = true;
                                        fVar.mo55460b();
                                        break;
                                    case 2:
                                        this.f71601c.remove(obj);
                                        break;
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private final void m65471a(Object obj, String str, String str2, String str3) {
        Map<Object, C27142f> map = this.f71601c;
        C27142f fVar = new C27142f(new C27138d(str, str2, str3));
        fVar.mo55459a();
        map.put(obj, fVar);
    }

    /* renamed from: a */
    private final void m65470a(Object obj, String str, String str2, Object obj2) {
        Object obj3 = this.f71601c.get(obj);
        if (obj3 == null) {
            C52711k.m112234a();
        }
        C27142f fVar = (C27142f) obj3;
        boolean z = true;
        if (!(!C52711k.m112239a((Object) fVar.f71607c.f71596a, (Object) str)) && !(!C52711k.m112239a((Object) fVar.f71607c.f71597b, (Object) str2))) {
            z = false;
        }
        if (!z) {
            obj3 = null;
        }
        C27142f fVar2 = (C27142f) obj3;
        if (fVar2 != null) {
            fVar2.mo55460b();
            this.f71601c.remove(obj);
            m65471a(obj, str, str2, m65469a(obj2));
        }
    }
}
