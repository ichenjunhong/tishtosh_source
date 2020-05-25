package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.share.p2159h.C42039e;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.af */
public final class C42059af implements C42357g {

    /* renamed from: a */
    public static final C42060a f106458a = new C42060a(null);

    /* renamed from: b */
    private final Aweme f106459b;

    /* renamed from: c */
    private final C30313ae<C30332aw> f106460c;

    /* renamed from: d */
    private final String f106461d;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.af$a */
    public static final class C42060a {
        private C42060a() {
        }

        public /* synthetic */ C42060a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.dxo;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.d75;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "report";
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
        return R.drawable.d4t;
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
        C26890h.m65011a("report", new C23089d().mo47829a("author_id", this.f106459b.getAuthorUid()).mo47829a("enter_from", this.f106461d).mo47829a("group_id", C23198ae.m56877m(this.f106459b)).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(this.f106459b))).f61491a);
        if (C42039e.m92005a(this.f106459b)) {
            if (C31190f.m72831a(this.f106459b)) {
                C42069am.m92162a(context, this.f106459b, this.f106460c, null, null, null, 56, null);
                return;
            }
            C30313ae<C30332aw> aeVar = this.f106460c;
            if (aeVar != null) {
                aeVar.mo60714a(new C30332aw(1, this.f106459b));
            }
        }
    }

    public C42059af(Aweme aweme, C30313ae<C30332aw> aeVar, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "enterFrom");
        this.f106459b = aweme;
        this.f106460c = aeVar;
        this.f106461d = str;
    }
}
