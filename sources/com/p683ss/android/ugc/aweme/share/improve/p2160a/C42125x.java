package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.x */
public final class C42125x implements C42357g {

    /* renamed from: a */
    private final Handler f106582a;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.x$a */
    static final class C42126a<V> implements Callable<Object> {

        /* renamed from: a */
        public static final C42126a f106583a = new C42126a();

        C42126a() {
        }

        public final Object call() {
            return new Object();
        }
    }

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.dxk;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.dd9;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "message";
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

    public C42125x(Handler handler) {
        C52711k.m112240b(handler, "handler");
        this.f106582a = handler;
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
        C23566n.m57766a().mo48750a(this.f106582a, C42126a.f106583a, 53);
    }
}
