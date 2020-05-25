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

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ae */
public final class C42057ae implements C42357g {

    /* renamed from: a */
    private final Handler f106456a;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.ae$a */
    static final class C42058a<V> implements Callable<Object> {

        /* renamed from: a */
        public static final C42058a f106457a = new C42058a();

        C42058a() {
        }

        public final Object call() {
            return new Object();
        }
    }

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.dxn;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.d6q;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "remove_follower";
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

    public C42057ae(Handler handler) {
        C52711k.m112240b(handler, "handler");
        this.f106456a = handler;
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
        C23566n.m57766a().mo48750a(this.f106456a, C42058a.f106457a, 56);
    }
}
