package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.setting.model.RestrictAwemeModel;
import com.p683ss.android.ugc.aweme.setting.p2139h.C41613d;
import com.p683ss.android.ugc.aweme.setting.p2139h.C41616g;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42148a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.aj */
public final class C42064aj implements C41613d, C42357g {

    /* renamed from: a */
    public final C41616g f106465a = new C41616g(new RestrictAwemeModel(), this);

    /* renamed from: b */
    public final Aweme f106466b;

    /* renamed from: c */
    private final String f106467c;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.aj$a */
    static final class C42065a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42064aj f106468a;

        C42065a(C42064aj ajVar) {
            this.f106468a = ajVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f106468a.f106465a.mo85378a(this.f106468a.f106466b.getAid());
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.aj$b */
    static final class C42066b implements OnClickListener {

        /* renamed from: a */
        public static final C42066b f106469a = new C42066b();

        C42066b() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.acq;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.d8c;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "restrict";
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

    /* renamed from: h */
    public final void mo85375h() {
        C9432q.m18672a(C11010c.m22280a(), (int) R.string.d8h);
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
    public final void mo85374a(Exception exc) {
        C22971a.m56493a(C11010c.m22280a(), (Throwable) exc);
    }

    public C42064aj(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        this.f106466b = aweme;
        this.f106467c = str;
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        if (C42148a.m92511a((C42357g) this, context, this.f106466b, this.f106467c)) {
            new C10643a(context).mo18885a((int) R.string.d8a).mo18886a((int) R.string.d89, (OnClickListener) new C42065a(this)).mo18900b((int) R.string.wf, (OnClickListener) C42066b.f106469a).mo18897a().mo18882b();
        }
    }
}
