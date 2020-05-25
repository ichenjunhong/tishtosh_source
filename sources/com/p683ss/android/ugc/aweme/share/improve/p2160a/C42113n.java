package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42148a;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43911c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.n */
public final class C42113n implements C42357g {

    /* renamed from: a */
    private final Aweme f106571a;

    /* renamed from: b */
    private final String f106572b;

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.a3s;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.au4;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "duet";
    }

    /* renamed from: d */
    public final boolean mo49955d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo49956e() {
        return false;
    }

    /* renamed from: g */
    public final int mo49958g() {
        return R.drawable.d4r;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        if (((java.lang.Boolean) r0.mo47782d()).booleanValue() != false) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055 A[RETURN] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49957f() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f106571a
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47935p.m103709b(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0051
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f106571a
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r3 = "aweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            boolean r0 = r0.isSecret()
            if (r0 == 0) goto L_0x0023
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f106571a
            boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r0)
            if (r0 == 0) goto L_0x0051
        L_0x0023:
            boolean r0 = com.p683ss.android.ugc.aweme.language.C35837h.m80977b()
            if (r0 == 0) goto L_0x0042
            com.ss.android.ugc.aweme.app.v r0 = com.p683ss.android.ugc.aweme.app.C23183v.m56778a()
            com.ss.android.ugc.aweme.app.bf r0 = r0.mo47890A()
            java.lang.String r3 = "CommonSharePrefCache.inst().canDuet()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            java.lang.Object r0 = r0.mo47782d()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0051
        L_0x0042:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f106571a
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            boolean r0 = com.p683ss.android.ugc.aweme.music.p1978ui.C37609f.m84056a(r0)
            if (r0 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r0 = 0
            goto L_0x0052
        L_0x0051:
            r0 = 1
        L_0x0052:
            if (r0 != 0) goto L_0x0055
            return r2
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.improve.p2160a.C42113n.mo49957f():boolean");
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

    public C42113n(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        this.f106571a = aweme;
        this.f106572b = str;
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        if (C42148a.m92511a((C42357g) this, context, this.f106571a, this.f106572b)) {
            new C43911c().mo89465a(this.f106571a, C42149b.m92512a(context), this.f106572b);
        }
    }
}
