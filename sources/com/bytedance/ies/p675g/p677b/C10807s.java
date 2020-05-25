package com.bytedance.ies.p675g.p677b;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10763e;
import com.bytedance.ies.p675g.p676a.C10766h;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.g.b.s */
public class C10807s implements C10763e, C10801p {

    /* renamed from: a */
    public final C10757a f29036a;

    /* renamed from: b */
    private final C10771a f29037b;

    /* renamed from: c */
    private final C10809u f29038c;

    /* renamed from: d */
    private final Map<String, C10778c> f29039d = new LinkedHashMap();

    /* renamed from: e */
    private final Set<String> f29040e = new CopyOnWriteArraySet();

    /* renamed from: a */
    public final void mo19587a() {
        this.f29036a.mo19452a();
    }

    /* renamed from: b */
    public final C10807s mo19588b(String str) {
        this.f29036a.mo19449a(str);
        return this;
    }

    /* renamed from: a */
    public final C10807s mo19583a(WebChromeClient webChromeClient) {
        this.f29036a.mo19446a(webChromeClient);
        return this;
    }

    /* renamed from: b */
    public final C10807s mo19589b(List<String> list) {
        this.f29036a.mo19451a(list);
        this.f29037b.f28959g.f28976b.mo19591a((Collection<String>) list);
        return this;
    }

    /* renamed from: a */
    public final C10807s mo19584a(WebViewClient webViewClient) {
        this.f29036a.mo19447a(webViewClient);
        return this;
    }

    /* renamed from: a */
    public final C10807s mo19586a(List<String> list) {
        this.f29036a.mo19457b(list);
        this.f29037b.f28959g.f28976b.mo19593b(list);
        for (String str : list) {
            C10778c cVar = (C10778c) this.f29039d.get(str);
            if (cVar != null) {
                cVar.f28971a = C10824z.PUBLIC;
            }
        }
        return this;
    }

    /* renamed from: a */
    public final void mo19568a(String str) {
        this.f29040e.remove(str);
        if (this.f29038c != null) {
            this.f29036a.mo19450a(str, (C10762d) this.f29038c);
        }
    }

    /* renamed from: a */
    public static C10807s m21932a(WebView webView, C10805r rVar) {
        return new C10807s(webView, rVar);
    }

    private C10807s(WebView webView, C10805r rVar) {
        this.f29037b = rVar.f29030b;
        C10757a a = C10757a.m21804a(webView);
        a.f28934h = true;
        this.f29036a = a;
        if (this.f29037b instanceof C10775ab) {
            this.f29038c = new C10809u((C10775ab) this.f29037b, this.f29040e);
        } else {
            this.f29038c = null;
        }
    }

    /* renamed from: a */
    public final C10807s mo19585a(String str, C10762d dVar) {
        if (this.f29038c != null) {
            this.f29036a.mo19450a(str, (C10762d) this.f29038c);
        }
        C10798m mVar = new C10798m(dVar);
        this.f29037b.f28959g.mo19531a(str, (C10778c) mVar);
        this.f29039d.put(str, mVar);
        return this;
    }

    /* renamed from: a */
    public final void mo19456a(List<String> list, C10766h hVar, JSONObject jSONObject) {
        this.f29036a.mo19456a(list, hVar, jSONObject);
    }
}
