package com.bytedance.android.livesdk.browser.p292f;

import android.net.Uri;
import android.net.Uri.Builder;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.livesdk.p270ab.C4507h.C4510b;
import com.bytedance.android.livesdk.p270ab.C4507h.C4510b.C4511a;
import java.util.LinkedList;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.bytedance.android.livesdk.browser.f.d */
public class C4750d {

    /* renamed from: a */
    private List<C4748b> f12955a;

    /* renamed from: com.bytedance.android.livesdk.browser.f.d$a */
    public static final class C4752a implements C4510b<C4750d> {
        /* renamed from: a */
        public final C4511a<C4750d> mo10307a(C4511a<C4750d> aVar) {
            return aVar.mo10337a(new C4750d()).mo10336a();
        }
    }

    private C4750d() {
        this.f12955a = new LinkedList();
        this.f12955a.add(new C4753e());
        this.f12955a.add(new C4749c());
        this.f12955a.add(new C4747a());
    }

    /* renamed from: a */
    public static String m11316a(String str) {
        Builder buildUpon = Uri.parse("liveresource://file").buildUpon();
        buildUpon.scheme("liveresource").appendQueryParameter(LeakCanaryFileProvider.f132050j, str);
        return buildUpon.build().toString();
    }

    /* renamed from: a */
    public final WebResourceResponse mo10587a(String str, WebView webView) {
        Uri parse = Uri.parse(str);
        for (C4748b a : this.f12955a) {
            WebResourceResponse a2 = a.mo10586a(parse, webView);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }
}
