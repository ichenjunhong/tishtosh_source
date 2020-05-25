package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifpanel;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.emoji.emojiPageV2.C29317a;
import com.p683ss.android.ugc.aweme.emoji.emojiPageV2.C29321c;
import com.p683ss.android.ugc.aweme.emoji.emojiPageV2.WrapStaggeredGridLayoutManager;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35306y;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.c */
public final class C33589c extends C29317a<C29285a> {

    /* renamed from: A */
    private final float f87055A = 8.0f;

    /* renamed from: B */
    private final int f87056B = ((int) C9432q.m18687b(this.f76720d, this.f87055A));

    /* renamed from: C */
    private final int f87057C = ((int) C9432q.m18687b(this.f76720d, this.f87063j));

    /* renamed from: D */
    private final int f87058D = ((int) C9432q.m18687b(this.f76720d, this.f87064k));

    /* renamed from: f */
    public boolean f87059f;

    /* renamed from: g */
    public final int f87060g = 6;

    /* renamed from: h */
    public final C0184k f87061h;

    /* renamed from: i */
    public final C26846a f87062i;

    /* renamed from: j */
    private final float f87063j = 16.0f;

    /* renamed from: k */
    private final float f87064k = 4.0f;

    /* renamed from: l */
    private final float f87065l = 109.0f;

    /* renamed from: m */
    private final float f87066m = 80.0f;

    /* renamed from: y */
    private final float f87067y = 126.0f;

    /* renamed from: z */
    private final float f87068z = 59.0f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.c$a */
    public static final class C33590a implements C35306y {
        C33590a() {
        }

        /* renamed from: a */
        public final void mo71037a() {
        }

        /* renamed from: b */
        public final void mo71038b() {
        }

        /* renamed from: c */
        public final boolean mo71039c() {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.c$b */
    public static final class C33591b extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C33589c f87069a;

        /* renamed from: b */
        final /* synthetic */ StaggeredGridLayoutManager f87070b;

        /* renamed from: c */
        final /* synthetic */ RecyclerView f87071c;

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            if (i == 0) {
                int[] a = this.f87070b.mo5240a((int[]) null);
                if (a[0] <= 1 && a[1] <= 1) {
                    this.f87070b.mo5245h();
                    this.f87071c.mo4881m();
                }
            }
        }

        C33591b(C33589c cVar, StaggeredGridLayoutManager staggeredGridLayoutManager, RecyclerView recyclerView) {
            this.f87069a = cVar;
            this.f87070b = staggeredGridLayoutManager;
            this.f87071c = recyclerView;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            int[] d = this.f87070b.mo5243d(new int[3]);
            if (d.length > 2) {
                int max = Math.max(d[0], d[2]);
                if (!this.f87069a.f87059f && i2 > 0 && this.f87070b.mo5013A() - max <= this.f87069a.f87060g) {
                    this.f87069a.f87059f = true;
                    C26846a aVar = this.f87069a.f87062i;
                    if (aVar != null) {
                        aVar.ar_();
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public final int mo59264j() {
        return R.layout.b9z;
    }

    /* renamed from: a */
    public final void mo59260a(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "rv");
        LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            ((RelativeLayout.LayoutParams) layoutParams).setMargins(this.f87057C, this.f87058D, this.f87057C, this.f87058D);
            StaggeredGridLayoutManager wrapStaggeredGridLayoutManager = new WrapStaggeredGridLayoutManager(this.f76719c, 1);
            recyclerView.setLayoutManager(wrapStaggeredGridLayoutManager);
            recyclerView.setItemAnimator(null);
            recyclerView.mo4801a((C1340m) new C33591b(this, wrapStaggeredGridLayoutManager, recyclerView));
            recyclerView.mo4798a((C1331h) new C29321c(this.f76719c, this.f87056B));
            recyclerView.setAdapter(this);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    public C33589c(C0184k kVar, C26846a aVar) {
        C52711k.m112240b(kVar, "owner");
        super(kVar);
        this.f87061h = kVar;
        this.f87062i = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59261a(com.p683ss.android.ugc.aweme.emoji.emojiPageV2.C29317a.C29318a r6, int r7) {
        /*
            r5 = this;
            java.util.List r0 = r5.mo50673a()
            if (r0 == 0) goto L_0x00ee
            java.util.List r0 = r5.mo50673a()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00ee
            if (r6 == 0) goto L_0x00ee
            java.util.List r0 = r5.mo50673a()
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r1 = "data[position]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.emoji.a.a r0 = (com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a) r0
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r6.f76722a
            if (r1 == 0) goto L_0x00ee
            com.ss.android.ugc.aweme.emoji.f.a r1 = r0.f76668d
            r2 = 0
            if (r1 == 0) goto L_0x0035
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getAnimateUrl()
            if (r1 == 0) goto L_0x0035
            java.util.List r1 = r1.getUrlList()
            goto L_0x0036
        L_0x0035:
            r1 = r2
        L_0x0036:
            java.util.Collection r1 = (java.util.Collection) r1
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0045
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r1 = 0
            goto L_0x0046
        L_0x0045:
            r1 = 1
        L_0x0046:
            if (r1 != 0) goto L_0x00ee
            com.ss.android.ugc.aweme.emoji.f.a r0 = r0.f76668d
            if (r0 == 0) goto L_0x0050
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r0.getAnimateUrl()
        L_0x0050:
            int r7 = r7 % 3
            if (r7 != 0) goto L_0x006b
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r7 = r6.f76722a
            if (r7 != 0) goto L_0x005b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x005b:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.content.Context r0 = r5.f76720d
            float r1 = r5.f87066m
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r1)
            int r0 = (int) r0
            r7.height = r0
            goto L_0x009d
        L_0x006b:
            if (r7 != r4) goto L_0x0084
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r7 = r6.f76722a
            if (r7 != 0) goto L_0x0074
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0074:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.content.Context r0 = r5.f76720d
            float r1 = r5.f87067y
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r1)
            int r0 = (int) r0
            r7.height = r0
            goto L_0x009d
        L_0x0084:
            r0 = 2
            if (r7 != r0) goto L_0x009d
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r7 = r6.f76722a
            if (r7 != 0) goto L_0x008e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x008e:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.content.Context r0 = r5.f76720d
            float r1 = r5.f87068z
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r1)
            int r0 = (int) r0
            r7.height = r0
        L_0x009d:
            if (r2 == 0) goto L_0x00ab
            android.content.Context r7 = r5.f76720d
            float r0 = r5.f87065l
            float r7 = com.bytedance.common.utility.C9432q.m18687b(r7, r0)
            int r7 = (int) r7
            r2.setWidth(r7)
        L_0x00ab:
            if (r2 == 0) goto L_0x00bd
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r7 = r6.f76722a
            if (r7 != 0) goto L_0x00b4
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00b4:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            int r7 = r7.height
            r2.setHeight(r7)
        L_0x00bd:
            if (r2 != 0) goto L_0x00c2
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00c2:
            java.util.List r7 = r2.getUrlList()
            java.lang.Object r7 = r7.get(r3)
            java.lang.String.valueOf(r7)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r7 = r6.f76722a
            com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.c$a r0 = new com.ss.android.ugc.aweme.im.sdk.chat.input.gifpanel.c$a
            r0.<init>()
            com.ss.android.ugc.aweme.im.sdk.utils.y r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35306y) r0
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35234bi.m79642a(r7, r2, r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = r6.f76722a
            if (r6 != 0) goto L_0x00e0
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00e0:
            android.content.Context r7 = r5.f76720d
            r0 = 2132544391(0x7f1c0b87, float:2.0741942E38)
            java.lang.String r7 = r7.getString(r0)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.setContentDescription(r7)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifpanel.C33589c.mo59261a(com.ss.android.ugc.aweme.emoji.emojiPageV2.a$a, int):void");
    }
}
