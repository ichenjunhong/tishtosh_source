package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ab */
public class C42053ab implements C42357g {

    /* renamed from: a */
    public static final C42054a f106448a = new C42054a(null);

    /* renamed from: b */
    private final String f106449b;

    /* renamed from: c */
    private final boolean f106450c;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.ab$a */
    public static final class C42054a {
        private C42054a() {
        }

        public /* synthetic */ C42054a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.anx;
    }

    /* renamed from: a */
    public void mo49950a(Context context, SharePackage sharePackage) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.d2_;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "qr_code";
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
        return this.f106450c;
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

    private C42053ab(String str, boolean z) {
        C52711k.m112240b(str, "enterFrom");
        this.f106449b = str;
        this.f106450c = z;
    }

    public /* synthetic */ C42053ab(String str, boolean z, int i, C52707g gVar) {
        this("", true);
    }
}
