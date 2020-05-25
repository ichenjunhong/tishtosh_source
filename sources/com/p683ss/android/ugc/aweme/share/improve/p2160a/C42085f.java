package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.f */
public final class C42085f implements C42357g {

    /* renamed from: a */
    private final User f106509a;

    /* renamed from: b */
    private final Handler f106510b;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.f$a */
    static final class C42086a<V> implements Callable<Object> {

        /* renamed from: a */
        public static final C42086a f106511a = new C42086a();

        C42086a() {
        }

        public final Object call() {
            return new Object();
        }
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "block_user";
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
    public final int mo49948a() {
        if (this.f106509a.isBlock) {
            return R.drawable.dxq;
        }
        return R.drawable.dxa;
    }

    /* renamed from: b */
    public final int mo49953b() {
        if (!this.f106509a.isBlock) {
            return R.string.t7;
        }
        return R.string.f69;
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

    public C42085f(User user, Handler handler) {
        C52711k.m112240b(user, "user");
        C52711k.m112240b(handler, "handler");
        this.f106509a = user;
        this.f106510b = handler;
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        int i;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        C26890h.m65011a("click_block", C23089d.m56640a().mo47829a("enter_from", "others_homepage").mo47829a("to_user_id", this.f106509a.getUid()).f61491a);
        C23566n a = C23566n.m57766a();
        Handler handler = this.f106510b;
        Callable callable = C42086a.f106511a;
        if (this.f106509a.isBlock) {
            i = 55;
        } else {
            i = 54;
        }
        a.mo48750a(handler, callable, i);
    }
}
