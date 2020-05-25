package com.p683ss.android.sdk.webview;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10764f;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10790j;
import com.bytedance.ies.p675g.p677b.C10791k.C10795c;
import com.bytedance.ies.p675g.p677b.C10797l;
import com.bytedance.ies.p675g.p677b.C10799n;
import com.bytedance.ies.p675g.p677b.C10805r;
import com.bytedance.ies.p675g.p677b.C10807s;
import com.google.gson.C17971f;
import com.p683ss.android.sdk.webview.p1210b.C19744e;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.sdk.webview.e */
public final class C19750e {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f54414a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C19750e.class), "gson", "getGson()Lcom/google/gson/Gson;"))};

    /* renamed from: g */
    public static final C19752b f54415g = new C19752b(null);

    /* renamed from: b */
    public C10757a f54416b;

    /* renamed from: c */
    public C10805r f54417c;

    /* renamed from: d */
    public boolean f54418d;

    /* renamed from: e */
    public C19773r f54419e;

    /* renamed from: f */
    public final WebView f54420f;

    /* renamed from: h */
    private WebViewClient f54421h;

    /* renamed from: i */
    private WebChromeClient f54422i;

    /* renamed from: j */
    private C19734a f54423j;

    /* renamed from: k */
    private boolean f54424k;

    /* renamed from: l */
    private C10807s f54425l;

    /* renamed from: m */
    private C10805r f54426m;

    /* renamed from: n */
    private C19766m f54427n;

    /* renamed from: o */
    private final C52668f f54428o = C52732g.m112285a(C19753c.f54430a);

    /* renamed from: com.ss.android.sdk.webview.e$a */
    public enum C19751a {
        PUBLIC,
        PRIVATE
    }

    /* renamed from: com.ss.android.sdk.webview.e$b */
    public static final class C19752b {
        private C19752b() {
        }

        public /* synthetic */ C19752b(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C19750e m48266a(WebView webView) {
            C52711k.m112240b(webView, "webView");
            return new C19750e(webView);
        }
    }

    /* renamed from: com.ss.android.sdk.webview.e$c */
    static final class C19753c extends C52712l implements C52670a<C17971f> {

        /* renamed from: a */
        public static final C19753c f54430a = new C19753c();

        C19753c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C17971f();
        }
    }

    /* renamed from: com.ss.android.sdk.webview.e$d */
    public static final class C19754d implements C10797l {

        /* renamed from: a */
        final /* synthetic */ C19750e f54431a;

        C19754d(C19750e eVar) {
            this.f54431a = eVar;
        }

        /* renamed from: a */
        public final <T> String mo10596a(T t) {
            String b = this.f54431a.mo41179a().mo34889b(t);
            C52711k.m112236a((Object) b, "gson.toJson(value)");
            return b;
        }

        /* renamed from: a */
        public final <T> T mo10595a(String str, Type type) {
            C52711k.m112240b(str, "data");
            C52711k.m112240b(type, "type");
            return this.f54431a.mo41179a().mo34885a(str, type);
        }
    }

    /* renamed from: com.ss.android.sdk.webview.e$e */
    public static final class C19755e implements C10799n {

        /* renamed from: a */
        final /* synthetic */ C19750e f54432a;

        /* renamed from: b */
        final /* synthetic */ C52682m f54433b;

        /* renamed from: c */
        final /* synthetic */ List f54434c;

        /* renamed from: d */
        final /* synthetic */ C52686q f54435d;

        /* renamed from: com.ss.android.sdk.webview.e$e$a */
        static final class C19756a<V> implements Callable<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C19755e f54436a;

            /* renamed from: b */
            final /* synthetic */ String f54437b;

            /* renamed from: c */
            final /* synthetic */ String f54438c;

            /* renamed from: d */
            final /* synthetic */ int f54439d;

            C19756a(C19755e eVar, String str, String str2, int i) {
                this.f54436a = eVar;
                this.f54437b = str;
                this.f54438c = str2;
                this.f54439d = i;
            }

            public final /* synthetic */ Object call() {
                Context context = this.f54436a.f54432a.f54420f.getContext();
                StringBuilder sb = new StringBuilder();
                sb.append(this.f54437b);
                sb.append(" failed to visit func: ");
                sb.append(this.f54438c);
                sb.append(", reason: ");
                sb.append(this.f54439d);
                sb.append(";\n                                                可以进入DebugSettings->JSB 测试设置添加安全域名进行调试\n                                            ");
                String sb2 = sb.toString();
                String str = "|";
                C52711k.m112240b(sb2, "$this$trimMargin");
                C52711k.m112240b(str, "marginPrefix");
                C19759g.m48274a(Toast.makeText(context, C52830p.m112388a(sb2, "", str), 1));
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public final void mo19566a(String str, String str2) {
            C19751a aVar;
            if (str2 != null) {
                C52682m mVar = this.f54433b;
                if (this.f54434c.contains(str2)) {
                    aVar = C19751a.PUBLIC;
                } else {
                    aVar = C19751a.PRIVATE;
                }
                mVar.invoke(str2, aVar);
            }
        }

        /* renamed from: a */
        public final void mo19567a(String str, String str2, int i) {
            C19751a aVar;
            if (str2 != null) {
                C52686q qVar = this.f54435d;
                if (this.f54434c.contains(str2)) {
                    aVar = C19751a.PUBLIC;
                } else {
                    aVar = C19751a.PRIVATE;
                }
                qVar.invoke(str2, aVar, Integer.valueOf(i));
            }
            if (this.f54432a.f54418d) {
                C0013i.m18a((Callable<TResult>) new C19756a<TResult>(this, str, str2, i), C0013i.f25b);
            }
        }

        C19755e(C19750e eVar, C52682m mVar, List list, C52686q qVar) {
            this.f54432a = eVar;
            this.f54433b = mVar;
            this.f54434c = list;
            this.f54435d = qVar;
        }
    }

    /* renamed from: com.ss.android.sdk.webview.e$f */
    public static final class C19757f implements C10795c {

        /* renamed from: a */
        final /* synthetic */ C19750e f54440a;

        C19757f(C19750e eVar) {
            this.f54440a = eVar;
        }

        /* renamed from: a */
        public final boolean mo19564a(String str) {
            if (str == null || this.f54440a.f54419e == null || str == null) {
                return false;
            }
            Uri parse = Uri.parse(str);
            HashMap<String, HashMap<String, String>> hashMap = C19773r.f54462c;
            C52711k.m112236a((Object) parse, "uri");
            return hashMap.containsKey(parse.getHost());
        }

        /* renamed from: a */
        public final boolean mo19565a(String str, String str2) {
            C52711k.m112240b(str2, "method");
            boolean z = false;
            if (str == null) {
                return false;
            }
            if (this.f54440a.f54419e != null) {
                if (str == null) {
                    Boolean.valueOf(false);
                }
                if (str2 == null) {
                    Boolean.valueOf(false);
                }
                Uri parse = Uri.parse(str);
                HashMap<String, HashMap<String, String>> hashMap = C19773r.f54462c;
                C52711k.m112236a((Object) parse, "uri");
                HashMap hashMap2 = (HashMap) hashMap.get(parse.getHost());
                if (hashMap2 != null) {
                    C52711k.m112236a((Object) hashMap2, "this");
                    z = !hashMap2.containsKey(String.valueOf(str2));
                }
            }
            return z;
        }
    }

    /* renamed from: a */
    public final C17971f mo41179a() {
        return (C17971f) this.f54428o.getValue();
    }

    /* renamed from: a */
    public final C19750e mo41183a(C19766m mVar) {
        this.f54427n = mVar;
        return this;
    }

    /* renamed from: b */
    public final C19750e mo41187b(boolean z) {
        this.f54418d = false;
        return this;
    }

    /* renamed from: a */
    public final C19750e mo41180a(WebChromeClient webChromeClient) {
        C52711k.m112240b(webChromeClient, "webChromeClient");
        this.f54422i = webChromeClient;
        return this;
    }

    public C19750e(WebView webView) {
        C52711k.m112240b(webView, "webView");
        this.f54420f = webView;
    }

    /* renamed from: a */
    public final C19750e mo41181a(WebViewClient webViewClient) {
        C52711k.m112240b(webViewClient, "webViewClient");
        this.f54421h = webViewClient;
        return this;
    }

    /* renamed from: a */
    public final C19750e mo41182a(C19734a aVar) {
        C52711k.m112240b(aVar, "jsMessageHandler");
        this.f54423j = aVar;
        return this;
    }

    /* renamed from: a */
    public final C19750e mo41186a(boolean z) {
        this.f54424k = z;
        return this;
    }

    /* renamed from: a */
    public final C19750e mo41185a(String str, C10762d dVar) {
        if (this.f54425l != null) {
            C10807s sVar = this.f54425l;
            if (sVar == null) {
                C52711k.m112234a();
            }
            sVar.mo19585a(str, dVar);
        } else {
            C10757a aVar = this.f54416b;
            if (aVar != null) {
                aVar.mo19450a(str, dVar);
            }
        }
        return this;
    }

    /* renamed from: a */
    public final C19750e mo41184a(C52682m<? super String, ? super C19751a, C52860x> mVar, C52686q<? super String, ? super C19751a, ? super Integer, C52860x> qVar) {
        C10790j jVar;
        C52711k.m112240b(mVar, "invokeHandler");
        C52711k.m112240b(qVar, "rejectHandler");
        C19734a aVar = this.f54423j;
        if (aVar == null) {
            C52711k.m112234a();
        }
        List b = aVar.mo41157b();
        C52711k.m112236a((Object) b, "jsMessageHandler!!.addPublicFunc()");
        if (this.f54424k) {
            C10805r rVar = this.f54426m;
            if (rVar == null) {
                jVar = C10805r.m21921a(this.f54420f);
            } else {
                jVar = C10805r.m21922a(rVar);
            }
            C10790j a = jVar.mo19545a(true).mo19543a("ToutiaoJSBridge").mo19547b((Collection<String>) b).mo19541a((C10797l) new C19754d(this));
            C19734a aVar2 = this.f54423j;
            if (aVar2 == null) {
                C52711k.m112234a();
            }
            this.f54417c = a.mo19544a((Collection<String>) aVar2.mo41160c()).mo19548b(false).mo19549c(true).mo19542a((C10799n) new C19755e(this, mVar, b, qVar)).mo19540a((C10795c) new C19757f(this)).mo19546a();
            this.f54419e = new C19773r(this.f54417c);
            C19773r rVar2 = this.f54419e;
            if (rVar2 != null) {
                rVar2.f54464a = this.f54427n;
            }
            C10805r rVar3 = this.f54417c;
            if (rVar3 != null) {
                rVar3.mo19579a("openConfig", (C10782e<?, ?>) new C19744e<Object,Object>(this.f54419e));
            }
            this.f54425l = C10807s.m21932a(this.f54420f, this.f54417c);
            C10807s sVar = this.f54425l;
            if (sVar == null) {
                C52711k.m112234a();
            }
            this.f54416b = sVar.f29036a;
        } else {
            this.f54416b = C10757a.m21804a(this.f54420f);
        }
        C10757a aVar3 = this.f54416b;
        if (aVar3 == null) {
            C52711k.m112234a();
        }
        if (this.f54423j == null) {
            C52711k.m112234a();
        }
        C10757a a2 = aVar3.mo19449a(C19734a.m48231a());
        C19734a aVar4 = this.f54423j;
        if (aVar4 == null) {
            C52711k.m112234a();
        }
        C10757a a3 = a2.mo19448a((C10764f) aVar4);
        C19734a aVar5 = this.f54423j;
        if (aVar5 == null) {
            C52711k.m112234a();
        }
        C10757a a4 = a3.mo19451a(aVar5.mo41160c());
        C52711k.m112236a((Object) a4, "iesJsBridge!!.setBridgeS…essageHandler!!.safeHost)");
        a4.mo19457b(b);
        WebChromeClient webChromeClient = this.f54422i;
        if (webChromeClient != null) {
            C10757a aVar6 = this.f54416b;
            if (aVar6 != null) {
                aVar6.mo19446a(webChromeClient);
            }
        }
        WebViewClient webViewClient = this.f54421h;
        if (webViewClient != null) {
            C10757a aVar7 = this.f54416b;
            if (aVar7 != null) {
                aVar7.mo19447a(webViewClient);
            }
        }
        return this;
    }
}
