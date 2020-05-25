package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27149c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ad */
public final class C42056ad implements C42357g {

    /* renamed from: a */
    private final C27149c f106453a;

    /* renamed from: b */
    private final C10757a f106454b;

    /* renamed from: c */
    private final WebView f106455c;

    public C42056ad() {
        this(null, null, null, 7, null);
    }

    public C42056ad(C27149c cVar) {
        this(cVar, null, null, 6, null);
    }

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.ao1;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.d6_;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "refresh";
    }

    /* renamed from: d */
    public final boolean mo49955d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo49956e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo49957f() {
        return true;
    }

    /* renamed from: g */
    public final int mo49958g() {
        return C42358a.m93000a(this);
    }

    /* renamed from: a */
    public final void mo49949a(Context context) {
        C52711k.m112240b(context, "context");
        C42358a.m93001a((C42357g) this, context);
    }

    /* renamed from: a */
    public final void mo49951a(ImageView imageView) {
        C52711k.m112240b(imageView, "iconView");
        C42358a.m93002a((C42357g) this, imageView);
    }

    /* renamed from: a */
    public final void mo49952a(TextView textView) {
        C52711k.m112240b(textView, "textView");
        C42358a.m93003a((C42357g) this, textView);
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        if (this.f106453a != null) {
            this.f106453a.mo54150f();
            return;
        }
        if (this.f106454b != null) {
            WebView webView = this.f106454b.f28930d;
            if (webView != null) {
                webView.reload();
            }
        } else {
            WebView webView2 = this.f106455c;
            if (webView2 != null) {
                webView2.reload();
            }
        }
    }

    private C42056ad(C27149c cVar, C10757a aVar, WebView webView) {
        this.f106453a = cVar;
        this.f106454b = aVar;
        this.f106455c = webView;
    }

    public /* synthetic */ C42056ad(C27149c cVar, C10757a aVar, WebView webView, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            cVar = null;
        }
        if ((i & 2) != 0) {
            aVar = null;
        }
        if ((i & 4) != 0) {
            webView = null;
        }
        this(cVar, aVar, webView);
    }
}
