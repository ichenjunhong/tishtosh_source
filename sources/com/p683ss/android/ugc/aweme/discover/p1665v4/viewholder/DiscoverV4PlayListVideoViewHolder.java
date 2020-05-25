package com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12200n;
import com.bytedance.lighten.p766a.p769c.C12168c;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.playlist.viewholder.BiColPlayListVideoViewHolder;
import com.p683ss.android.ugc.aweme.playlist.viewholder.BiColPlayListVideoViewHolder.C38932b;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4PlayListVideoViewHolder */
public class DiscoverV4PlayListVideoViewHolder<T> extends BiColPlayListVideoViewHolder<T> implements C38932b {

    /* renamed from: f */
    public final String f75657f;

    /* renamed from: g */
    public final String f75658g;

    /* renamed from: j */
    private DiscoverPlayListStructV4 f75659j;

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4PlayListVideoViewHolder$a */
    public static final class C28887a extends C12168c {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListVideoViewHolder f75660a;

        /* renamed from: a */
        public final void mo23094a(Uri uri, View view, C12200n nVar, Animatable animatable) {
        }

        C28887a(DiscoverV4PlayListVideoViewHolder discoverV4PlayListVideoViewHolder) {
            this.f75660a = discoverV4PlayListVideoViewHolder;
        }

        /* renamed from: a */
        public final void mo23095a(Uri uri, View view, Throwable th) {
            View view2 = this.f75660a.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            ((SmartImageView) view2.findViewById(R.id.b55)).setImageResource(R.color.c8);
        }
    }

    /* renamed from: t */
    public final boolean mo58381t() {
        return DiscoverV4PlayListDataCenter.Companion.getINSTANCE().isPageShow(this.f75657f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0253, code lost:
        return;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58380s() {
        /*
            r7 = this;
            super.mo58380s()
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r7.f75659j
            if (r0 != 0) goto L_0x000c
            java.lang.String r1 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x000c:
            r0.playListType()
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r7.f75659j
            if (r0 != 0) goto L_0x0018
            java.lang.String r1 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0018:
            int r0 = r0.type
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x0035
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.mo78991v()
            r3 = 1097859072(0x41700000, float:15.0)
            r0.setTextSize(r2, r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.mo78991v()
            java.lang.String r3 = "mTvTitle"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            r3 = 0
            r0.setEllipsize(r3)
            goto L_0x004c
        L_0x0035:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.mo78991v()
            r3 = 1101004800(0x41a00000, float:20.0)
            r0.setTextSize(r2, r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.mo78991v()
            java.lang.String r3 = "mTvTitle"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            r0.setEllipsize(r3)
        L_0x004c:
            java.lang.String r0 = r7.f75657f
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter$Companion r3 = com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter.Companion
            java.lang.String r3 = r3.getTRENDING_PLAYLIST()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            r3 = 8
            r4 = 2132019544(0x7f140958, float:1.9677426E38)
            if (r0 == 0) goto L_0x0268
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r7.f75659j
            if (r0 != 0) goto L_0x006c
            java.lang.String r5 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x006c:
            java.lang.String r0 = r0.reason
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r5 = 0
            if (r0 != 0) goto L_0x00a9
            android.view.View r0 = r7.itemView
            java.lang.String r6 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r6)
            android.view.View r0 = r0.findViewById(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0
            if (r0 == 0) goto L_0x0089
            r0.setVisibility(r5)
        L_0x0089:
            android.view.View r0 = r7.itemView
            java.lang.String r6 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r6)
            android.view.View r0 = r0.findViewById(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0
            if (r0 == 0) goto L_0x00bb
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r4 = r7.f75659j
            if (r4 != 0) goto L_0x00a1
            java.lang.String r6 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x00a1:
            java.lang.String r4 = r4.reason
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.setText(r4)
            goto L_0x00bb
        L_0x00a9:
            android.view.View r0 = r7.itemView
            java.lang.String r6 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r6)
            android.view.View r0 = r0.findViewById(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0
            if (r0 == 0) goto L_0x00bb
            r0.setVisibility(r3)
        L_0x00bb:
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r7.f75659j
            if (r0 != 0) goto L_0x00c4
            java.lang.String r4 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x00c4:
            int r0 = r0.type
            r4 = 2132020253(0x7f140c1d, float:1.9678864E38)
            if (r0 <= r1) goto L_0x0254
            android.view.View r0 = r7.itemView
            java.lang.String r1 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.view.View r0 = r0.findViewById(r4)
            com.bytedance.lighten.loader.SmartImageView r0 = (com.bytedance.lighten.loader.SmartImageView) r0
            if (r0 == 0) goto L_0x00dd
            r0.setVisibility(r5)
        L_0x00dd:
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r7.f75659j
            if (r0 != 0) goto L_0x00e6
            java.lang.String r1 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00e6:
            java.lang.String r0 = r0.title
            boolean r0 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b.m60182a(r0)
            if (r0 == 0) goto L_0x0188
            android.view.View r0 = r7.itemView
            java.lang.String r1 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.content.Context r0 = r0.getContext()
            r1 = 1103626240(0x41c80000, float:25.0)
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r1)
            android.text.style.LeadingMarginSpan$Standard r1 = new android.text.style.LeadingMarginSpan$Standard
            int r0 = p2628d.p2643g.C52733a.m112277a(r0)
            r1.<init>(r0, r5)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r3 = r7.f75659j
            if (r3 != 0) goto L_0x0113
            java.lang.String r6 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0113:
            java.lang.String r3 = r3.title
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.<init>(r3)
            int r3 = r0.length()
            r6 = 17
            r0.setSpan(r1, r5, r3, r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.mo78991v()
            java.lang.String r3 = "mTvTitle"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            android.view.View r0 = r7.itemView
            android.content.Context r0 = r0.getContext()
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47918gj.m103682a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.mo78991v()
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L_0x0180
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r1 = (android.view.View) r1
            android.support.p030v4.view.C1056u.m3049c(r1, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.mo78991v()
            r3 = 3
            if (r0 != 0) goto L_0x0155
            r5 = 3
            goto L_0x0156
        L_0x0155:
            r5 = 5
        L_0x0156:
            r1.setGravity(r5)
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r6) goto L_0x0188
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.mo78991v()
            if (r0 != 0) goto L_0x0164
            goto L_0x0165
        L_0x0164:
            r3 = 4
        L_0x0165:
            r1.setTextDirection(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.mo78991v()
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L_0x0178
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.setLayoutDirection(r0)
            goto L_0x0188
        L_0x0178:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
            r0.<init>(r1)
            throw r0
        L_0x0180:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
            r0.<init>(r1)
            throw r0
        L_0x0188:
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r7.f75659j
            if (r0 != 0) goto L_0x0191
            java.lang.String r1 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0191:
            int r0 = r0.type
            switch(r0) {
                case 3: goto L_0x01c7;
                case 4: goto L_0x01af;
                case 5: goto L_0x0198;
                default: goto L_0x0196;
            }
        L_0x0196:
            goto L_0x0253
        L_0x0198:
            android.view.View r0 = r7.itemView
            java.lang.String r1 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.view.View r0 = r0.findViewById(r4)
            com.bytedance.lighten.loader.SmartImageView r0 = (com.bytedance.lighten.loader.SmartImageView) r0
            if (r0 == 0) goto L_0x0253
            r1 = 2131953222(0x7f130646, float:1.9542909E38)
            r0.setImageResource(r1)
            goto L_0x027b
        L_0x01af:
            android.view.View r0 = r7.itemView
            java.lang.String r1 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.view.View r0 = r0.findViewById(r4)
            com.bytedance.lighten.loader.SmartImageView r0 = (com.bytedance.lighten.loader.SmartImageView) r0
            if (r0 == 0) goto L_0x01c6
            r1 = 2131953217(0x7f130641, float:1.9542899E38)
            r0.setImageResource(r1)
            goto L_0x027b
        L_0x01c6:
            return
        L_0x01c7:
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r7.f75659j
            if (r0 != 0) goto L_0x01d0
            java.lang.String r1 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x01d0:
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.creator
            if (r0 == 0) goto L_0x027b
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r7.f75659j
            if (r0 != 0) goto L_0x01dd
            java.lang.String r1 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x01dd:
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.creator
            if (r0 != 0) goto L_0x01e4
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01e4:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getAvatarThumb()
            com.ss.android.ugc.aweme.base.k r0 = com.p683ss.android.ugc.aweme.base.C23608p.m57874a(r0)
            com.bytedance.lighten.a.t r0 = com.bytedance.lighten.p766a.C12203q.m24645a(r0)
            com.bytedance.lighten.a.t r0 = r0.mo23119a(r2)
            com.bytedance.lighten.a.e$a r1 = com.bytedance.lighten.p766a.C12187e.m24632a()
            android.view.View r3 = r7.itemView
            java.lang.String r5 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            android.content.Context r3 = r3.getContext()
            java.lang.String r5 = "itemView.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131823004(0x7f11099c, float:1.9278795E38)
            int r3 = r3.getColor(r5)
            r5 = 1056964608(0x3f000000, float:0.5)
            com.bytedance.lighten.a.e$a r1 = r1.mo23104a(r3, r5)
            com.bytedance.lighten.a.e$a r1 = r1.mo23105a(r2)
            com.bytedance.lighten.a.e r1 = r1.mo23106a()
            java.lang.String r2 = "CircleOptions.newBuilder…\n                .build()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.bytedance.lighten.a.t r0 = r0.mo23115a(r1)
            java.lang.String r1 = "PlayListVideoViewHolder"
            com.bytedance.lighten.a.t r0 = r0.mo23118a(r1)
            r1 = 2131820742(0x7f1100c6, float:1.9274208E38)
            com.bytedance.lighten.a.t r0 = r0.mo23110a(r1)
            android.view.View r1 = r7.itemView
            java.lang.String r2 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            android.view.View r1 = r1.findViewById(r4)
            com.bytedance.lighten.loader.SmartImageView r1 = (com.bytedance.lighten.loader.SmartImageView) r1
            com.bytedance.lighten.a.t r0 = r0.mo23116a(r1)
            com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4PlayListVideoViewHolder$a r1 = new com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4PlayListVideoViewHolder$a
            r1.<init>(r7)
            com.bytedance.lighten.a.c.j r1 = (com.bytedance.lighten.p766a.p769c.C12175j) r1
            r0.mo23122a(r1)
            return
        L_0x0253:
            return
        L_0x0254:
            android.view.View r0 = r7.itemView
            java.lang.String r1 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.view.View r0 = r0.findViewById(r4)
            com.bytedance.lighten.loader.SmartImageView r0 = (com.bytedance.lighten.loader.SmartImageView) r0
            if (r0 == 0) goto L_0x0267
            r0.setVisibility(r3)
            goto L_0x027b
        L_0x0267:
            return
        L_0x0268:
            android.view.View r0 = r7.itemView
            java.lang.String r1 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.view.View r0 = r0.findViewById(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0
            if (r0 == 0) goto L_0x027b
            r0.setVisibility(r3)
            return
        L_0x027b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder.DiscoverV4PlayListVideoViewHolder.mo58380s():void");
    }

    /* renamed from: a */
    public final void mo50643a(DmtTextView dmtTextView) {
        C52711k.m112240b(dmtTextView, "textView");
        DiscoverPlayListStructV4 discoverPlayListStructV4 = this.f75659j;
        if (discoverPlayListStructV4 == null) {
            C52711k.m112237a("data");
        }
        dmtTextView.setText(discoverPlayListStructV4.title);
    }

    /* renamed from: a */
    public void mo22662a(T t) {
        Aweme aweme;
        if (t != null) {
            this.f75659j = (DiscoverPlayListStructV4) t;
            DiscoverPlayListStructV4 discoverPlayListStructV4 = this.f75659j;
            if (discoverPlayListStructV4 == null) {
                C52711k.m112237a("data");
            }
            List<Aweme> list = discoverPlayListStructV4.awemes;
            if (list != null) {
                aweme = (Aweme) C52575l.m112140f(list);
            } else {
                aweme = null;
            }
            mo78995a(aweme);
            super.mo22662a(t);
            this.f99199t = this;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50641a(int r10) {
        /*
            r9 = this;
            java.lang.String r1 = "discovery"
            java.lang.String r2 = r9.f75657f
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r9.f75659j
            if (r0 != 0) goto L_0x000d
            java.lang.String r3 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x000d:
            java.lang.String r3 = r0.playListType()
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r9.f75659j
            if (r0 != 0) goto L_0x001a
            java.lang.String r4 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x001a:
            java.lang.String r4 = r0.cellID
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r9.f75659j
            if (r0 != 0) goto L_0x0025
            java.lang.String r5 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0025:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r0.awemes
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = p2628d.p2629a.C52575l.m112140f(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r0.getAid()
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            r5 = r0
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r9.f75659j
            if (r0 != 0) goto L_0x0041
            java.lang.String r6 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0041:
            com.ss.android.ugc.aweme.feed.model.LogPbBean r7 = r0.logPb
            com.ss.android.ugc.aweme.discover.mob.g r8 = new com.ss.android.ugc.aweme.discover.mob.g
            r0 = r8
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.concurrent.ExecutorService r10 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            p001a.C0013i.m18a(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder.DiscoverV4PlayListVideoViewHolder.mo50641a(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50644b(int r10) {
        /*
            r9 = this;
            java.lang.String r1 = "discovery"
            java.lang.String r2 = r9.f75657f
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r9.f75659j
            if (r0 != 0) goto L_0x000d
            java.lang.String r3 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x000d:
            java.lang.String r3 = r0.playListType()
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r9.f75659j
            if (r0 != 0) goto L_0x001a
            java.lang.String r4 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x001a:
            java.lang.String r4 = r0.cellID
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r9.f75659j
            if (r0 != 0) goto L_0x0025
            java.lang.String r5 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0025:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r0.awemes
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = p2628d.p2629a.C52575l.m112140f(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r0.getAid()
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            r5 = r0
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r9.f75659j
            if (r0 != 0) goto L_0x0041
            java.lang.String r6 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0041:
            com.ss.android.ugc.aweme.feed.model.LogPbBean r7 = r0.logPb
            com.ss.android.ugc.aweme.discover.mob.h r8 = new com.ss.android.ugc.aweme.discover.mob.h
            r0 = r8
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.concurrent.ExecutorService r10 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            p001a.C0013i.m18a(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder.DiscoverV4PlayListVideoViewHolder.mo50644b(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50645c(int r9) {
        /*
            r8 = this;
            boolean r0 = r8.f99196q
            if (r0 == 0) goto L_0x0055
            boolean r0 = r8.f99197r
            if (r0 == 0) goto L_0x0055
            boolean r0 = r8.mo58381t()
            if (r0 == 0) goto L_0x0055
            java.lang.String r1 = "discovery_tab"
            java.lang.String r2 = r8.f75657f
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r8.f75659j
            if (r0 != 0) goto L_0x001b
            java.lang.String r3 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x001b:
            java.lang.String r3 = r0.playListType()
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r8.f75659j
            if (r0 != 0) goto L_0x0028
            java.lang.String r4 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0028:
            java.lang.String r4 = r0.cellID
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r8.f75659j
            if (r0 != 0) goto L_0x0033
            java.lang.String r5 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0033:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r0.awemes
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = p2628d.p2629a.C52575l.m112140f(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = r0.getAid()
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            r6 = r0
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r8.f75659j
            if (r0 != 0) goto L_0x004f
            java.lang.String r5 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x004f:
            com.ss.android.ugc.aweme.feed.model.LogPbBean r7 = r0.logPb
            r5 = r9
            com.p683ss.android.ugc.aweme.discover.mob.C28396b.m67409a(r1, r2, r3, r4, r5, r6, r7)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder.DiscoverV4PlayListVideoViewHolder.mo50645c(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r9) {
        /*
            r8 = this;
            java.lang.String r0 = "discovery_tab"
            java.lang.String r1 = r8.f75657f
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r9 = r8.f75659j
            if (r9 != 0) goto L_0x000d
            java.lang.String r2 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x000d:
            java.lang.String r2 = r9.playListType()
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r9 = r8.f75659j
            if (r9 != 0) goto L_0x001a
            java.lang.String r3 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x001a:
            java.lang.String r3 = r9.cellID
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r9 = r8.f75659j
            if (r9 != 0) goto L_0x0025
            java.lang.String r4 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0025:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r9 = r9.awemes
            r7 = 0
            if (r9 == 0) goto L_0x0038
            java.lang.Object r9 = p2628d.p2629a.C52575l.m112140f(r9)
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r9
            if (r9 == 0) goto L_0x0038
            java.lang.String r9 = r9.getAid()
            r4 = r9
            goto L_0x0039
        L_0x0038:
            r4 = r7
        L_0x0039:
            int r5 = r8.f31643i
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r9 = r8.f75659j
            if (r9 != 0) goto L_0x0044
            java.lang.String r6 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0044:
            com.ss.android.ugc.aweme.feed.model.LogPbBean r6 = r9.logPb
            com.p683ss.android.ugc.aweme.discover.mob.C28396b.m67411a(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r9 = r8.f75659j
            if (r9 != 0) goto L_0x0052
            java.lang.String r0 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0052:
            java.lang.String r9 = r9.refUrl
            boolean r9 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b.m60182a(r9)
            r0 = 2
            if (r9 == 0) goto L_0x009a
            com.ss.android.ugc.aweme.router.w r9 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            java.lang.String r1 = "RouterManager.getInstance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r1)
            com.ss.android.ugc.aweme.router.u r9 = r9.f104758d
            java.lang.String r1 = "use_webview_title"
            r9.mo83856c(r1)
            com.ss.android.ugc.aweme.router.w r9 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r1 = r8.f75659j
            if (r1 != 0) goto L_0x0078
            java.lang.String r2 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0078:
            java.lang.String r1 = r1.refUrl
            d.n[] r0 = new p2628d.C52847n[r0]
            r2 = 0
            java.lang.String r3 = "use_webview_title"
            java.lang.String r4 = "true"
            d.n r3 = p2628d.C52856t.m112465a(r3, r4)
            r0[r2] = r3
            r2 = 1
            java.lang.String r3 = "title"
            java.lang.String r4 = " "
            d.n r3 = p2628d.C52856t.m112465a(r3, r4)
            r0[r2] = r3
            java.util.HashMap r0 = p2628d.p2629a.C52550ab.m112057c(r0)
            r9.mo83862a(r1, r0)
            return
        L_0x009a:
            java.lang.String r9 = r8.f75658g
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r1 = r8.f75659j
            if (r1 != 0) goto L_0x00a5
            java.lang.String r2 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00a5:
            int r1 = r1.type
            if (r1 == r0) goto L_0x00ca
            java.lang.String r0 = r8.f75657f
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter$Companion r1 = com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter.Companion
            java.lang.String r1 = r1.getTRENDING_PLAYLIST()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x00ca
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r9 = r8.f75659j
            if (r9 != 0) goto L_0x00c4
            java.lang.String r0 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00c4:
            java.lang.String r9 = r9.title
            java.lang.String r9 = java.lang.String.valueOf(r9)
        L_0x00ca:
            r6 = r9
            android.view.View r9 = r8.itemView
            java.lang.String r0 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r0)
            android.content.Context r0 = r9.getContext()
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r9 = r8.f75659j
            if (r9 != 0) goto L_0x00df
            java.lang.String r1 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00df:
            int r1 = r9.type
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r9 = r8.f75659j
            if (r9 != 0) goto L_0x00ea
            java.lang.String r2 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00ea:
            java.lang.String r2 = r9.cellID
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r9 = r8.f75659j
            if (r9 != 0) goto L_0x00f5
            java.lang.String r3 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00f5:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r9 = r9.awemes
            if (r9 == 0) goto L_0x0105
            java.lang.Object r9 = p2628d.p2629a.C52575l.m112140f(r9)
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r9
            if (r9 == 0) goto L_0x0105
            java.lang.String r7 = r9.getAid()
        L_0x0105:
            r3 = r7
            int r4 = r8.f31643i
            java.lang.String r5 = r8.f75657f
            com.p683ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity.m66410a(r0, r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder.DiscoverV4PlayListVideoViewHolder.onClick(android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50642a(long r12, int r14) {
        /*
            r11 = this;
            java.lang.String r1 = "discovery_tab"
            java.lang.String r2 = r11.f75657f
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r11.f75659j
            if (r0 != 0) goto L_0x000d
            java.lang.String r3 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x000d:
            java.lang.String r3 = r0.playListType()
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r11.f75659j
            if (r0 != 0) goto L_0x001a
            java.lang.String r4 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x001a:
            java.lang.String r4 = r0.cellID
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r11.f75659j
            if (r0 != 0) goto L_0x0025
            java.lang.String r5 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0025:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r0.awemes
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = p2628d.p2629a.C52575l.m112140f(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r0.getAid()
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            r5 = r0
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r0 = r11.f75659j
            if (r0 != 0) goto L_0x0041
            java.lang.String r6 = "data"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0041:
            com.ss.android.ugc.aweme.feed.model.LogPbBean r9 = r0.logPb
            com.ss.android.ugc.aweme.discover.mob.i r10 = new com.ss.android.ugc.aweme.discover.mob.i
            r0 = r10
            r6 = r12
            r8 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9)
            java.util.concurrent.ExecutorService r12 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            p001a.C0013i.m18a(r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder.DiscoverV4PlayListVideoViewHolder.mo50642a(long, int):void");
    }

    public DiscoverV4PlayListVideoViewHolder(View view, int i, String str, String str2) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(str, "tabName");
        C52711k.m112240b(str2, "tabText");
        super(view, i);
        this.f75657f = str;
        this.f75658g = str2;
    }
}
