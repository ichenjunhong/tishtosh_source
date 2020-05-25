package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.util.C47634q;
import com.p683ss.android.ugc.aweme.util.C47640t;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.r */
public final class C42118r implements C42357g {

    /* renamed from: a */
    private final String f106577a;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.r$a */
    public static final class C42119a extends C47640t {

        /* renamed from: a */
        final /* synthetic */ Context f106578a;

        /* renamed from: a */
        public final void mo86129a(String str) {
            C52711k.m112240b(str, "file");
            super.mo86129a(str);
            C10691a.m21533a(this.f106578a, (int) R.string.dsw).mo19066a();
        }

        C42119a(Context context, Activity activity) {
            this.f106578a = context;
            super(activity);
        }
    }

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.an7;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.d_1;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "image_save";
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

    public C42118r(String str) {
        C52711k.m112240b(str, "imageUrl");
        this.f106577a = str;
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
        new C47634q(new WeakReference(context)).mo94933a(this.f106577a, new C42119a(context, C42149b.m92512a(context)));
    }
}
