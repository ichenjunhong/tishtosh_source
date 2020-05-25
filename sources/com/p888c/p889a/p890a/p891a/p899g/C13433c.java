package com.p888c.p889a.p890a.p891a.p899g;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.p888c.p889a.p890a.p891a.p893b.C13396d;
import com.p888c.p889a.p890a.p891a.p893b.C13403k;
import com.p888c.p889a.p890a.p891a.p893b.C13404l;
import com.p888c.p889a.p890a.p891a.p895c.C13411d;
import com.p888c.p889a.p890a.p891a.p895c.C13412e;
import com.p888c.p889a.p890a.p891a.p897e.C13422b;
import com.p888c.p889a.p890a.p891a.p897e.C13425d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.g.c */
public final class C13433c extends C13430a {

    /* renamed from: e */
    WebView f34991e;

    /* renamed from: f */
    private Long f34992f;

    /* renamed from: g */
    private Map<String, C13403k> f34993g;

    /* renamed from: h */
    private final String f34994h;

    public C13433c(Map<String, C13403k> map, String str) {
        this.f34993g = map;
        this.f34994h = str;
    }

    /* renamed from: a */
    public final void mo25127a(C13404l lVar, C13396d dVar) {
        JSONObject jSONObject = new JSONObject();
        Map b = dVar.mo25095b();
        for (String str : b.keySet()) {
            C13422b.m27062a(jSONObject, str, (C13403k) b.get(str));
        }
        mo25128a(lVar, dVar, jSONObject);
    }

    /* renamed from: b */
    public final void mo25131b() {
        super.mo25131b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private WebView f34996b = C13433c.this.f34991e;

            public final void run() {
                this.f34996b.destroy();
            }
        }, Math.max(4000 - (this.f34992f == null ? 4000 : TimeUnit.MILLISECONDS.convert(C13425d.m27069a() - this.f34992f.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f34991e = null;
    }

    /* renamed from: a */
    public final void mo25124a() {
        super.mo25124a();
        this.f34991e = new WebView(C13411d.m27033a().f34962a);
        this.f34991e.getSettings().setJavaScriptEnabled(true);
        mo25126a(this.f34991e);
        C13412e.m27037a(this.f34991e, this.f34994h);
        for (String str : this.f34993g.keySet()) {
            String externalForm = ((C13403k) this.f34993g.get(str)).f34933b.toExternalForm();
            C13412e.m27034a();
            WebView webView = this.f34991e;
            if (externalForm != null && !TextUtils.isEmpty(str)) {
                C13412e.m27037a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str));
            }
        }
        this.f34992f = Long.valueOf(C13425d.m27069a());
    }
}
