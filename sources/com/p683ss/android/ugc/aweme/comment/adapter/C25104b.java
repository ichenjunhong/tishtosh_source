package com.p683ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.comment.model.CommentAtSummonFriendItem;
import com.p683ss.android.ugc.aweme.comment.p1528ui.CommentAtSearchLoadingView;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.b */
public final class C25104b extends C26840g<CommentAtSummonFriendItem> {

    /* renamed from: d */
    public static final C25105a f66520d = new C25105a(null);

    /* renamed from: a */
    public C25106b f66521a;

    /* renamed from: b */
    public int f66522b;

    /* renamed from: c */
    public boolean f66523c;

    /* renamed from: e */
    private CommentAtSearchLoadingView f66524e;

    /* renamed from: f */
    private final Aweme f66525f;

    /* renamed from: g */
    private final boolean f66526g;

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.b$a */
    public static final class C25105a {
        private C25105a() {
        }

        public /* synthetic */ C25105a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.b$b */
    public interface C25106b {
        /* renamed from: a */
        void mo51192a(int i, CommentAtSummonFriendItem commentAtSummonFriendItem);

        /* renamed from: a */
        void mo51193a(User user);
    }

    public final void am_() {
        super.am_();
        CommentAtSearchLoadingView commentAtSearchLoadingView = this.f66524e;
        if (commentAtSearchLoadingView != null) {
            commentAtSearchLoadingView.mo51808a(true);
        }
    }

    public final void ao_() {
        super.ao_();
        CommentAtSearchLoadingView commentAtSearchLoadingView = this.f66524e;
        if (commentAtSearchLoadingView != null) {
            commentAtSearchLoadingView.mo51808a(false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* renamed from: a_ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.p043v7.widget.RecyclerView.C1352v mo49730a_(android.view.ViewGroup r11) {
        /*
            r10 = this;
            android.support.v7.widget.RecyclerView$v r0 = super.mo49730a_(r11)
            android.view.View r1 = r0.itemView
            if (r1 == 0) goto L_0x0072
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtStatusView) r1
            r2 = 0
            if (r11 == 0) goto L_0x001e
            android.content.Context r4 = r11.getContext()
            if (r4 == 0) goto L_0x001e
            com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLoadingView r9 = new com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLoadingView
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x001f
        L_0x001e:
            r9 = r2
        L_0x001f:
            r10.f66524e = r9
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r3 = r1.mo19207c()
            com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLoadingView r4 = r10.f66524e
            android.view.View r4 = (android.view.View) r4
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r3 = r3.mo19228a(r4)
            r1.setBuilder(r3)
            r3 = 2
            android.view.View r1 = r1.mo19205b(r3)
            if (r1 == 0) goto L_0x006a
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r11 == 0) goto L_0x0048
            android.content.Context r11 = r11.getContext()
            if (r11 == 0) goto L_0x0048
            r2 = 2132546266(0x7f1c12da, float:2.0745745E38)
            java.lang.String r2 = r11.getString(r2)
        L_0x0048:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            android.content.Context r11 = r1.getContext()
            java.lang.String r2 = "errorView.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r2)
            android.content.res.Resources r11 = r11.getResources()
            r2 = 2131821046(0x7f1101f6, float:1.9274824E38)
            int r11 = r11.getColor(r2)
            r1.setTextColor(r11)
            java.lang.String r11 = "footer"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r11)
            return r0
        L_0x006a:
            d.u r11 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            r11.<init>(r0)
            throw r11
        L_0x0072:
            d.u r11 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.adapter.C25104b.mo49730a_(android.view.ViewGroup):android.support.v7.widget.RecyclerView$v");
    }

    public C25104b(Aweme aweme, boolean z) {
        this.f66525f = aweme;
        this.f66526g = z;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.b1v, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C25107c(inflate);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48222a(android.support.p043v7.widget.RecyclerView.C1352v r12, int r13) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x025a
            com.ss.android.ugc.aweme.comment.adapter.c r12 = (com.p683ss.android.ugc.aweme.comment.adapter.C25107c) r12
            java.util.List r0 = r11.f70670n
            java.lang.Object r13 = r0.get(r13)
            java.lang.String r0 = "mItems[position]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r0)
            com.ss.android.ugc.aweme.comment.model.CommentAtSummonFriendItem r13 = (com.p683ss.android.ugc.aweme.comment.model.CommentAtSummonFriendItem) r13
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f66525f
            com.ss.android.ugc.aweme.comment.adapter.b$b r1 = r11.f66521a
            int r2 = r11.f66522b
            boolean r3 = r11.f66526g
            if (r3 == 0) goto L_0x001d
            boolean r3 = r11.f66523c
        L_0x001d:
            java.lang.String r3 = "item"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r3)
            com.ss.android.ugc.aweme.comment.model.CommentAtUser r3 = r13.mUser
            if (r3 == 0) goto L_0x0259
            r12.f66527a = r1
            r12.f66528b = r13
            r12.f66529c = r0
            android.text.SpannableString r0 = new android.text.SpannableString
            com.ss.android.ugc.aweme.comment.model.CommentAtUser r1 = r13.mUser
            java.lang.String r1 = r1.nickname
            if (r1 != 0) goto L_0x0037
            java.lang.String r1 = ""
            goto L_0x003b
        L_0x0037:
            com.ss.android.ugc.aweme.comment.model.CommentAtUser r1 = r13.mUser
            java.lang.String r1 = r1.nickname
        L_0x003b:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.<init>(r1)
            android.view.View r1 = r12.itemView
            java.lang.String r3 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            r3 = 2132022518(0x7f1414f6, float:1.9683458E38)
            android.view.View r1 = r1.findViewById(r3)
            com.ss.android.ugc.aweme.comment.ui.CommentAtAvaterWithVerify r1 = (com.p683ss.android.ugc.aweme.comment.p1528ui.CommentAtAvaterWithVerify) r1
            com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView r1 = r1.getAvatarImageView()
            com.facebook.drawee.h.b r1 = r1.getHierarchy()
            com.facebook.drawee.f.a r1 = (com.facebook.drawee.p940f.C13833a) r1
            r4 = 2131821011(0x7f1101d3, float:1.9274753E38)
            com.facebook.drawee.e.q$b r5 = com.facebook.drawee.p939e.C13816q.C13818b.f36067g
            r1.mo25892a(r4, r5)
            android.view.View r1 = r12.itemView
            java.lang.String r4 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            android.view.View r1 = r1.findViewById(r3)
            com.ss.android.ugc.aweme.comment.ui.CommentAtAvaterWithVerify r1 = (com.p683ss.android.ugc.aweme.comment.p1528ui.CommentAtAvaterWithVerify) r1
            com.ss.android.ugc.aweme.utils.UserVerify r10 = new com.ss.android.ugc.aweme.utils.UserVerify
            com.ss.android.ugc.aweme.comment.model.CommentAtUser r4 = r13.mUser
            java.lang.String r6 = r4.customVerify
            com.ss.android.ugc.aweme.comment.model.CommentAtUser r4 = r13.mUser
            java.lang.Integer r8 = r4.verificationType
            com.ss.android.ugc.aweme.comment.model.CommentAtUser r4 = r13.mUser
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r4.avatarThumb
            com.ss.android.ugc.aweme.comment.model.CommentAtUser r4 = r13.mUser
            java.lang.String r9 = r4.weiboVerify
            com.ss.android.ugc.aweme.comment.model.CommentAtUser r4 = r13.mUser
            java.lang.String r7 = r4.enterpriseVerifyReason
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r1.setUserData(r10)
            java.util.List<com.ss.android.ugc.aweme.challenge.model.Segment> r1 = r13.segments
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x00eb
            java.util.List<com.ss.android.ugc.aweme.challenge.model.Segment> r1 = r13.segments
            java.util.Iterator r1 = r1.iterator()
        L_0x0098:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00eb
            java.lang.Object r6 = r1.next()
            com.ss.android.ugc.aweme.challenge.model.Segment r6 = (com.p683ss.android.ugc.aweme.challenge.model.Segment) r6
            if (r6 == 0) goto L_0x0098
            int r7 = r6.begin
            int r6 = r6.end
            int r6 = r6 + r4
            r8 = r0
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 == 0) goto L_0x00b5
            goto L_0x0098
        L_0x00b5:
            int r7 = java.lang.Math.max(r5, r7)
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0098
            if (r7 > r6) goto L_0x0098
            int r8 = r0.length()
            if (r7 >= r8) goto L_0x0098
            int r8 = r0.length()
            if (r6 <= r8) goto L_0x00ce
            goto L_0x0098
        L_0x00ce:
            android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan
            android.view.View r9 = r12.itemView
            java.lang.String r10 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131821030(0x7f1101e6, float:1.9274792E38)
            int r9 = r9.getColor(r10)
            r8.<init>(r9)
            r9 = 17
            r0.setSpan(r8, r7, r6, r9)
            goto L_0x0098
        L_0x00eb:
            android.view.View r1 = r12.itemView
            java.lang.String r6 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r6)
            android.view.View r1 = r1.findViewById(r3)
            com.ss.android.ugc.aweme.comment.ui.CommentAtAvaterWithVerify r1 = (com.p683ss.android.ugc.aweme.comment.p1528ui.CommentAtAvaterWithVerify) r1
            r1.mo48964b()
            android.view.View r1 = r12.itemView
            java.lang.String r3 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            android.content.Context r1 = r1.getContext()
            com.ss.android.ugc.aweme.comment.model.CommentAtUser r3 = r13.mUser
            java.lang.String r3 = r3.customVerify
            com.ss.android.ugc.aweme.comment.model.CommentAtUser r6 = r13.mUser
            java.lang.String r6 = r6.enterpriseVerifyReason
            android.view.View r7 = r12.itemView
            java.lang.String r8 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            r8 = 2132023951(0x7f141a8f, float:1.9686364E38)
            android.view.View r7 = r7.findViewById(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r7
            com.p683ss.android.ugc.aweme.utils.C47916gh.m103675a(r1, r3, r6, r7)
            android.view.View r1 = r12.itemView
            java.lang.String r3 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            r3 = 2132023858(0x7f141a32, float:1.9686176E38)
            android.view.View r1 = r1.findViewById(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            java.lang.String r3 = "itemView.tv_im"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            r3 = 8
            r1.setVisibility(r3)
            android.view.View r1 = r12.itemView
            java.lang.String r6 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r6)
            r6 = 2132024098(0x7f141b22, float:1.9686662E38)
            android.view.View r1 = r1.findViewById(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            java.lang.String r7 = "itemView.tv_sign"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r7)
            r1.setVisibility(r5)
            android.view.View r1 = r12.itemView
            java.lang.String r7 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r7)
            android.view.View r1 = r1.findViewById(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            java.lang.String r7 = "itemView.tv_name"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r7)
            android.graphics.Typeface r7 = android.graphics.Typeface.DEFAULT
            r1.setTypeface(r7)
            com.ss.android.ugc.aweme.comment.model.CommentAtUser r1 = r13.mUser
            if (r1 == 0) goto L_0x0177
            java.lang.Integer r1 = r1.followStatus
            if (r1 == 0) goto L_0x0177
            int r1 = r1.intValue()
            goto L_0x0178
        L_0x0177:
            r1 = 0
        L_0x0178:
            boolean r1 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103645a(r1)
            r7 = 2132023816(0x7f141a08, float:1.968609E38)
            if (r1 == 0) goto L_0x01d0
            if (r2 != r4) goto L_0x01d0
            android.view.View r1 = r12.itemView
            java.lang.String r2 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            android.view.View r1 = r1.findViewById(r7)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            java.lang.String r2 = "itemView.tv_following"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " · "
            r2.<init>(r3)
            android.view.View r3 = r12.itemView
            java.lang.String r4 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            android.content.Context r3 = r3.getContext()
            r4 = 2132544796(0x7f1c0d1c, float:2.0742764E38)
            java.lang.String r3 = r3.getString(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            android.view.View r1 = r12.itemView
            java.lang.String r2 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            android.view.View r1 = r1.findViewById(r7)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            java.lang.String r2 = "itemView.tv_following"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.setVisibility(r5)
            goto L_0x01e5
        L_0x01d0:
            android.view.View r1 = r12.itemView
            java.lang.String r2 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            android.view.View r1 = r1.findViewById(r7)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            java.lang.String r2 = "itemView.tv_following"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.setVisibility(r3)
        L_0x01e5:
            android.view.View r1 = r12.itemView
            java.lang.String r2 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            android.view.View r1 = r1.findViewById(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            java.lang.String r2 = "itemView.tv_sign"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.comment.model.CommentAtUser r2 = r13.mUser
            java.lang.String r2 = com.p683ss.android.ugc.aweme.comment.adapter.C25107c.m61016a(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            android.view.View r1 = r12.itemView
            java.lang.String r2 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            android.view.View r1 = r1.findViewById(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            java.lang.String r2 = "itemView.tv_name"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            com.ss.android.ugc.aweme.services.IMainService r1 = com.p683ss.android.ugc.aweme.services.MainServiceImpl.createIMainServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.services.IMainService r1 = (com.p683ss.android.ugc.aweme.services.IMainService) r1
            java.lang.String r2 = "Comment"
            boolean r1 = r1.shouldChangeToHandle(r2)
            if (r1 == 0) goto L_0x0259
            android.view.View r1 = r12.itemView
            java.lang.String r2 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            android.view.View r1 = r1.findViewById(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            java.lang.String r2 = "itemView.tv_sign"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.setText(r0)
            android.view.View r12 = r12.itemView
            java.lang.String r0 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r0)
            android.view.View r12 = r12.findViewById(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r12
            java.lang.String r0 = "itemView.tv_name"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r0)
            com.ss.android.ugc.aweme.comment.model.CommentAtUser r13 = r13.mUser
            java.lang.String r13 = com.p683ss.android.ugc.aweme.comment.adapter.C25107c.m61016a(r13)
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            r12.setText(r13)
        L_0x0259:
            return
        L_0x025a:
            d.u r12 = new d.u
            java.lang.String r13 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.adapter.CommentAtSearchViewHolder"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.adapter.C25104b.mo48222a(android.support.v7.widget.RecyclerView$v, int):void");
    }
}
