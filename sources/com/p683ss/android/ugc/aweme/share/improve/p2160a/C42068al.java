package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.al */
public class C42068al implements C42357g {

    /* renamed from: a */
    private final Aweme f106472a;

    /* renamed from: b */
    private final String f106473b;

    /* renamed from: c */
    private final boolean f106474c;

    /* renamed from: a */
    public int mo49948a() {
        return R.drawable.ao5;
    }

    /* renamed from: b */
    public int mo49953b() {
        return R.string.d8s;
    }

    /* renamed from: c */
    public String mo49954c() {
        return "reuse_sticker";
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
    public int mo49958g() {
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

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49950a(android.content.Context r6, com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage r7) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            java.lang.String r0 = "sharePackage"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            java.lang.String r7 = "prop_reuse"
            com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean.sCurPropSource = r7
            boolean r7 = r5.f106474c
            if (r7 != 0) goto L_0x003d
            java.lang.String r7 = "prop_reuse_icon"
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r1 = "prop_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r5.f106472a
            java.lang.String r2 = r2.getStickerIDs()
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "action_type"
            java.lang.String r2 = "click"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r5.f106472a
            java.lang.String r2 = r2.getAid()
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r7, r0)
        L_0x003d:
            boolean r7 = r5.f106474c
            if (r7 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.share.ab r7 = new com.ss.android.ugc.aweme.share.ab
            java.lang.String r0 = "green_screen"
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.f106472a
            java.lang.String r1 = r1.getAid()
            r7.<init>(r6, r0, r1)
            goto L_0x0054
        L_0x004f:
            com.ss.android.ugc.aweme.share.ab r7 = new com.ss.android.ugc.aweme.share.ab
            r7.<init>(r6)
        L_0x0054:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f106472a
            java.lang.String r0 = r0.getStickerIDs()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00dd
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f106472a
            java.lang.String r0 = r0.getStickerIDs()
            java.lang.String r1 = "aweme.stickerIDs"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = ","
            d.m.l r2 = new d.m.l
            r2.<init>(r1)
            r1 = 0
            java.util.List r0 = r2.split(r0, r1)
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x00b4
            int r2 = r0.size()
            java.util.ListIterator r2 = r0.listIterator(r2)
        L_0x008e:
            boolean r3 = r2.hasPrevious()
            if (r3 == 0) goto L_0x00b4
            java.lang.Object r3 = r2.previous()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            r4 = 1
            if (r3 != 0) goto L_0x00a5
            r3 = 1
            goto L_0x00a6
        L_0x00a5:
            r3 = 0
        L_0x00a6:
            if (r3 != 0) goto L_0x008e
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            int r2 = r2.nextIndex()
            int r2 = r2 + r4
            java.util.List r0 = p2628d.p2629a.C52575l.m112129b(r0, r2)
            goto L_0x00b8
        L_0x00b4:
            java.util.List r0 = p2628d.p2629a.C52575l.m112097a()
        L_0x00b8:
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            if (r0 == 0) goto L_0x00d5
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r2 = r0.length
        L_0x00c5:
            if (r1 >= r2) goto L_0x00dd
            r3 = r0[r1]
            boolean r4 = r6.contains(r3)
            if (r4 != 0) goto L_0x00d2
            r6.add(r3)
        L_0x00d2:
            int r1 = r1 + 1
            goto L_0x00c5
        L_0x00d5:
            d.u r6 = new d.u
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<T>"
            r6.<init>(r7)
            throw r6
        L_0x00dd:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f106472a
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            r7.mo86049a(r0)
            java.lang.String r0 = "prop_reuse"
            r7.f106174n = r0
            r7.mo86051a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.improve.p2160a.C42068al.mo49950a(android.content.Context, com.ss.android.ugc.aweme.sharer.ui.SharePackage):void");
    }

    public C42068al(Aweme aweme, String str, boolean z) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        this.f106472a = aweme;
        this.f106473b = str;
        this.f106474c = z;
    }

    public /* synthetic */ C42068al(Aweme aweme, String str, boolean z, int i, C52707g gVar) {
        this(aweme, str, false);
    }
}
