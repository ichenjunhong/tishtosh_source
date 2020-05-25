package com.bytedance.ies.bullet.kit.web.p649b;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p677b.C10797l;
import com.bytedance.ies.p675g.p677b.C10805r;
import com.bytedance.ies.p675g.p677b.C10807s;
import com.google.gson.C17971f;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
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

/* renamed from: com.bytedance.ies.bullet.kit.web.b.c */
public final class C10494c implements C10492a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f27883a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C10494c.class), "gson", "getGson()Lcom/google/gson/Gson;"))};

    /* renamed from: k */
    public static final C10495a f27884k = new C10495a(null);

    /* renamed from: b */
    public WebViewClient f27885b;

    /* renamed from: c */
    public WebChromeClient f27886c;

    /* renamed from: d */
    public List<String> f27887d = new ArrayList();

    /* renamed from: e */
    public List<String> f27888e = new ArrayList();

    /* renamed from: f */
    public List<String> f27889f = new ArrayList();

    /* renamed from: g */
    public String f27890g = "bytedance";

    /* renamed from: h */
    public C10757a f27891h;

    /* renamed from: i */
    public C10807s f27892i;

    /* renamed from: j */
    public C10805r f27893j;

    /* renamed from: l */
    private boolean f27894l;

    /* renamed from: m */
    private String f27895m = "ToutiaoJSBridge";

    /* renamed from: n */
    private final C52668f f27896n = C52732g.m112285a(C10497c.f27899a);

    /* renamed from: o */
    private final WebView f27897o;

    /* renamed from: com.bytedance.ies.bullet.kit.web.b.c$a */
    public static final class C10495a {
        private C10495a() {
        }

        public /* synthetic */ C10495a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C10494c m21106a(WebView webView) {
            C52711k.m112240b(webView, "webView");
            return new C10494c(webView);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.b.c$b */
    public static final class C10496b implements C10797l {

        /* renamed from: a */
        final /* synthetic */ C10494c f27898a;

        C10496b(C10494c cVar) {
            this.f27898a = cVar;
        }

        /* renamed from: a */
        public final <T> String mo10596a(T t) {
            String b = this.f27898a.mo18622a().mo34889b(t);
            C52711k.m112236a((Object) b, "gson.toJson(value)");
            return b;
        }

        /* renamed from: a */
        public final <T> T mo10595a(String str, Type type) {
            C52711k.m112240b(str, "data");
            C52711k.m112240b(type, "type");
            return this.f27898a.mo18622a().mo34885a(str, type);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.b.c$c */
    static final class C10497c extends C52712l implements C52670a<C17971f> {

        /* renamed from: a */
        public static final C10497c f27899a = new C10497c();

        C10497c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C17971f();
        }
    }

    /* renamed from: a */
    public final C17971f mo18622a() {
        return (C17971f) this.f27896n.getValue();
    }

    /* renamed from: b */
    public final C10494c mo18623b() {
        this.f27893j = C10805r.m21921a(this.f27897o).mo19545a(true).mo19543a(this.f27895m).mo19547b((Collection<String>) this.f27888e).mo19541a((C10797l) new C10496b(this)).mo19544a((Collection<String>) this.f27887d).mo19548b(this.f27894l).mo19549c(true).mo19546a();
        this.f27892i = C10807s.m21932a(this.f27897o, this.f27893j);
        C10807s sVar = this.f27892i;
        if (sVar == null) {
            C52711k.m112234a();
        }
        this.f27891h = sVar.f29036a;
        return this;
    }

    /* renamed from: a */
    public final C10494c mo18621a(boolean z) {
        this.f27894l = z;
        return this;
    }

    /* renamed from: b */
    public final C10494c mo18624b(String str) {
        C52711k.m112240b(str, "jsObjectName");
        this.f27895m = str;
        return this;
    }

    /* renamed from: c */
    public final C10494c mo18627c(String str) {
        C52711k.m112240b(str, "bridgeScheme");
        this.f27890g = str;
        return this;
    }

    /* renamed from: a */
    public final C10494c mo18620a(List<String> list) {
        C52711k.m112240b(list, "safeHost");
        this.f27887d.addAll(list);
        return this;
    }

    /* renamed from: b */
    public final C10494c mo18625b(List<String> list) {
        C52711k.m112240b(list, "publicFunc");
        this.f27888e.addAll(list);
        return this;
    }

    /* renamed from: c */
    public final C10494c mo18628c(List<String> list) {
        C52711k.m112240b(list, "protectedFunc");
        this.f27889f.addAll(list);
        return this;
    }

    public C10494c(WebView webView) {
        C52711k.m112240b(webView, "webView");
        this.f27897o = webView;
    }

    /* renamed from: a */
    public final boolean mo18619a(String str) {
        C10757a aVar = this.f27891h;
        if (aVar == null || !aVar.mo19459b(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo18626b(String str, JSONObject jSONObject) {
        C10757a aVar = this.f27891h;
        if (aVar != null) {
            aVar.mo19455a(str, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo18618a(String str, JSONObject jSONObject) {
        C10757a aVar = this.f27891h;
        if (aVar != null) {
            aVar.mo19458b(str, jSONObject);
        }
    }
}
