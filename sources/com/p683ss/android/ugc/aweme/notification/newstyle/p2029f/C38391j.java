package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartRoundImageView;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38415g;
import com.p683ss.android.ugc.aweme.notification.p2018g.C38206a;
import com.p683ss.android.ugc.aweme.notification.util.C38443j;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.j */
public final class C38391j extends C38383h implements OnClickListener {

    /* renamed from: d */
    public static final C38392a f97691d = new C38392a(null);

    /* renamed from: e */
    private final View f97692e;

    /* renamed from: f */
    private final AvatarImageWithVerify f97693f;

    /* renamed from: g */
    private final TextView f97694g;

    /* renamed from: m */
    private final TextView f97695m;

    /* renamed from: n */
    private final View f97696n;

    /* renamed from: o */
    private final View f97697o;

    /* renamed from: p */
    private final TextView f97698p;

    /* renamed from: q */
    private final SmartRoundImageView f97699q;

    /* renamed from: r */
    private CommentNotice f97700r;

    /* renamed from: s */
    private BaseNotice f97701s;

    /* renamed from: t */
    private String f97702t;

    /* renamed from: u */
    private String f97703u;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.j$a */
    public static final class C38392a {
        private C38392a() {
        }

        public /* synthetic */ C38392a(C52707g gVar) {
            this();
        }
    }

    public C38391j(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.bu1);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f97692e = findViewById;
        View findViewById2 = view.findViewById(R.id.bt7);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f97693f = (AvatarImageWithVerify) findViewById2;
        View findViewById3 = view.findViewById(R.id.bto);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.notification_name)");
        this.f97694g = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bsc);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.notification_content)");
        this.f97695m = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.btz);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.…fication_reply_container)");
        this.f97696n = findViewById5;
        View findViewById6 = view.findViewById(R.id.cbi);
        C52711k.m112236a((Object) findViewById6, "itemView.findViewById(R.id.reply_divider)");
        this.f97697o = findViewById6;
        View findViewById7 = view.findViewById(R.id.bu0);
        C52711k.m112236a((Object) findViewById7, "itemView.findViewById(R.…tification_reply_content)");
        this.f97698p = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.bsd);
        C52711k.m112236a((Object) findViewById8, "itemView.findViewById(R.id.notification_cover)");
        this.f97699q = (SmartRoundImageView) findViewById8;
        C38415g.m85729b(this.f97692e);
        C38446k.m85764a(this.f97693f);
        C38446k.m85764a(this.f97699q);
        C38415g.m85728a((View) this.f97699q);
        OnClickListener onClickListener = this;
        this.f97699q.setOnClickListener(onClickListener);
        this.f97692e.setOnClickListener(onClickListener);
        this.f97693f.setOnClickListener(onClickListener);
        this.f97693f.setRequestImgSize(C47788ct.m103417a(BaseNotice.HASHTAG));
        ((C13833a) this.f97699q.getHierarchy()).mo25902b((int) R.color.c8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0067, code lost:
        r0.putString(com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c.f106865i, r4);
        r0.putSerializable("avatar_thumb", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003f, code lost:
        r4 = r3.f97110c;
        p2628d.p2639f.p2641b.C52711k.m112236a((java.lang.Object) r4, "context");
        r4 = r4.getResources().getString(com.ss.android.ugc.trill.R.string.bfv);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0052, code lost:
        r4 = r3.f97110c;
        p2628d.p2639f.p2641b.C52711k.m112236a((java.lang.Object) r4, "context");
        r4 = r4.getResources().getString(com.ss.android.ugc.trill.R.string.bfx);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0064, code lost:
        if (r4 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0066, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78306b(int r4) {
        /*
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "from_where"
            r0.putInt(r1, r4)
            java.lang.String r4 = "username"
            android.widget.TextView r1 = r3.f97694g
            java.lang.CharSequence r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r0.putString(r4, r1)
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r4 = r3.f97700r
            if (r4 == 0) goto L_0x0073
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r4.getComment()
            java.lang.String r2 = "it.comment"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getUser()
            java.lang.String r2 = "it.comment.user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getAvatarThumb()
            int r4 = r4.getCommentType()
            switch(r4) {
                case 0: goto L_0x0052;
                case 1: goto L_0x0052;
                case 2: goto L_0x003f;
                default: goto L_0x003a;
            }
        L_0x003a:
            switch(r4) {
                case 11: goto L_0x0052;
                case 12: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            r4 = 0
            goto L_0x0064
        L_0x003f:
            android.content.Context r4 = r3.f97110c
            java.lang.String r2 = "context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r2)
            android.content.res.Resources r4 = r4.getResources()
            r2 = 2132545253(0x7f1c0ee5, float:2.074369E38)
            java.lang.String r4 = r4.getString(r2)
            goto L_0x0064
        L_0x0052:
            android.content.Context r4 = r3.f97110c
            java.lang.String r2 = "context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r2)
            android.content.res.Resources r4 = r4.getResources()
            r2 = 2132545255(0x7f1c0ee7, float:2.0743694E38)
            java.lang.String r4 = r4.getString(r2)
        L_0x0064:
            if (r4 != 0) goto L_0x0067
            return
        L_0x0067:
            java.lang.String r2 = "content"
            r0.putString(r2, r4)
            java.lang.String r4 = "avatar_thumb"
            java.io.Serializable r1 = (java.io.Serializable) r1
            r0.putSerializable(r4, r1)
        L_0x0073:
            r4 = 1
            r3.f97676i = r4
            r3.f97677j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38391j.mo78306b(int):void");
    }

    public final void onClick(View view) {
        int i;
        CommentNotice commentNotice;
        int i2;
        ClickInstrumentation.onClick(view);
        if (!C38393k.m85699a(C11010c.m22280a())) {
            C10691a.m21542b(this.f97110c, (int) R.string.cg1).mo19066a();
            return;
        }
        CommentNotice commentNotice2 = this.f97700r;
        if (commentNotice2 != null) {
            String str = "click";
            String str2 = "comment";
            BaseNotice baseNotice = this.f97701s;
            if (baseNotice != null) {
                i = baseNotice.clientOrder;
            } else {
                i = -1;
            }
            BaseNotice baseNotice2 = this.f97701s;
            BaseNotice baseNotice3 = this.f97701s;
            Integer num = null;
            if (baseNotice3 != null) {
                commentNotice = baseNotice3.getCommentNotice();
            } else {
                commentNotice = null;
            }
            mo78088a(str, str2, i, baseNotice2, true, m85180a(commentNotice), this.f97703u, this.f97702t);
            if (view != null) {
                num = Integer.valueOf(view.getId());
            }
            if (num != null && num.intValue() == R.id.bt7) {
                Comment comment = commentNotice2.getComment();
                C52711k.m112236a((Object) comment, "it.comment");
                User user = comment.getUser();
                C52711k.m112236a((Object) user, "it.comment.user");
                String uid = user.getUid();
                C52711k.m112236a((Object) uid, "it.comment.user.uid");
                Comment comment2 = commentNotice2.getComment();
                C52711k.m112236a((Object) comment2, "it.comment");
                User user2 = comment2.getUser();
                C52711k.m112236a((Object) user2, "it.comment.user");
                String secUid = user2.getSecUid();
                C52711k.m112236a((Object) secUid, "it.comment.user.secUid");
                C38383h.m85681a((C38383h) this, uid, secUid, this.f97701s, false, (String) null, 24, (Object) null);
            } else {
                if ((num != null && num.intValue() == R.id.bu1) || (num != null && num.intValue() == R.id.bsd)) {
                    if (m85186a(commentNotice2.getCommentType())) {
                        Context context = view.getContext();
                        C52711k.m112236a((Object) context, "v.context");
                        String forwardId = commentNotice2.getForwardId();
                        C52711k.m112236a((Object) forwardId, "it.forwardId");
                        String str3 = "message";
                        Comment comment3 = commentNotice2.getComment();
                        C52711k.m112236a((Object) comment3, "it.comment");
                        String cid = comment3.getCid();
                        C52711k.m112236a((Object) cid, "it.comment.cid");
                        Aweme aweme = commentNotice2.getAweme();
                        if (aweme != null) {
                            i2 = aweme.getEnterpriseType();
                        } else {
                            i2 = 0;
                        }
                        if (C38206a.f97273b.isFollowFeedEnterFullScreenDetail()) {
                            C41302w a = C41302w.m91042a();
                            if (context != null) {
                                Activity activity = (Activity) context;
                                StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                                sb.append(forwardId);
                                a.mo83858a(activity, C41311y.m91065a(sb.toString()).mo83868a("profile_enterprise_type", i2).mo83870a("cid", cid).mo83870a("refer", str3).mo83870a("video_from", "from_launch_forward").mo83871a());
                            } else {
                                throw new C52857u("null cannot be cast to non-null type android.app.Activity");
                            }
                        } else {
                            C41302w a2 = C41302w.m91042a();
                            if (context != null) {
                                Activity activity2 = (Activity) context;
                                StringBuilder sb2 = new StringBuilder("aweme://aweme/detail/");
                                sb2.append(forwardId);
                                a2.mo83858a(activity2, C41311y.m91065a(sb2.toString()).mo83870a("refer", str3).mo83870a("cid", cid).mo83871a());
                            } else {
                                throw new C52857u("null cannot be cast to non-null type android.app.Activity");
                            }
                        }
                    } else {
                        if (this.f97676i) {
                            C38443j.m85761a(this.f97677j, getAdapterPosition());
                        }
                        Aweme aweme2 = commentNotice2.getAweme();
                        C52711k.m112236a((Object) aweme2, "it.aweme");
                        String aid = aweme2.getAid();
                        C52711k.m112236a((Object) aid, "it.aweme.aid");
                        Comment comment4 = commentNotice2.getComment();
                        C52711k.m112236a((Object) comment4, "it.comment");
                        mo78305a(aid, comment4.getCid());
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0216, code lost:
        if (r0 == null) goto L_0x0218;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0369  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78310a(com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r22, boolean r23, java.lang.String r24, java.lang.String r25) {
        /*
            r21 = this;
            r9 = r21
            r10 = r22
            r11 = r25
            java.lang.String r0 = "notice"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            java.lang.String r0 = "enterFrom"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r22.getCommentNotice()
            if (r0 == 0) goto L_0x0398
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r22.getCommentNotice()
            java.lang.String r1 = "notice.commentNotice"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.getComment()
            if (r0 != 0) goto L_0x0027
            goto L_0x0398
        L_0x0027:
            r12 = r24
            r9.f97702t = r12
            r9.f97701s = r10
            r9.f97703u = r11
            java.lang.String r1 = "show"
            java.lang.String r2 = "comment"
            int r3 = r10.clientOrder
            r5 = 1
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r22.getCommentNotice()
            java.lang.String r6 = m85180a(r0)
            r0 = r21
            r4 = r22
            r7 = r25
            r8 = r24
            r0.mo78088a(r1, r2, r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r22.getCommentNotice()
            r9.f97700r = r0
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r13 = r9.f97700r
            if (r13 == 0) goto L_0x0397
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r13.getComment()
            java.lang.String r1 = "it.comment"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            com.ss.android.ugc.aweme.utils.UserVerify r7 = new com.ss.android.ugc.aweme.utils.UserVerify
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r0.getAvatarThumb()
            java.lang.String r3 = r0.getCustomVerify()
            java.lang.String r4 = r0.getEnterpriseVerifyReason()
            int r1 = r0.getVerificationType()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            java.lang.String r6 = r0.getWeiboVerify()
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r0 = r9.f97693f
            r0.setUserData(r7)
            com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r0 = r9.f97693f
            r0.mo48964b()
            android.widget.TextView r1 = r9.f97694g
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r13.getComment()
            java.lang.String r2 = "it.comment"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            com.ss.android.ugc.aweme.profile.model.User r2 = r0.getUser()
            java.lang.String r0 = "it.comment.user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r0)
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r3 = r9.f97701s
            r0 = r21
            r4 = r24
            r5 = r25
            r0.mo78303a(r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.getAweme()
            if (r0 == 0) goto L_0x00f5
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.getAweme()
            java.lang.String r1 = "it.aweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L_0x00f5
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.getAweme()
            java.lang.String r1 = "it.aweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            java.lang.String r1 = "it.aweme.video"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getOriginCover()
            com.ss.android.ugc.aweme.base.k r0 = com.p683ss.android.ugc.aweme.base.C23608p.m57874a(r0)
            com.bytedance.lighten.a.t r0 = com.bytedance.lighten.p766a.C12203q.m24645a(r0)
            r1 = 500(0x1f4, float:7.0E-43)
            int[] r1 = com.p683ss.android.ugc.aweme.utils.C47788ct.m103417a(r1)
            com.bytedance.lighten.a.t r0 = r0.mo23125b(r1)
            java.lang.String r1 = "Notice"
            com.bytedance.lighten.a.t r0 = r0.mo23118a(r1)
            com.ss.android.ugc.aweme.base.ui.SmartRoundImageView r1 = r9.f97699q
            com.bytedance.lighten.a.k r1 = (com.bytedance.lighten.p766a.C12197k) r1
            com.bytedance.lighten.a.t r0 = r0.mo23116a(r1)
            r0.mo23121a()
        L_0x00f5:
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>()
            java.lang.String r0 = "contentBuilder"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r9.f97700r
            r1 = 1
            r12 = 7
            r2 = 0
            if (r0 == 0) goto L_0x01c9
            int r3 = r0.getCommentType()
            r4 = 5
            r5 = 2132547182(0x7f1c166e, float:2.0747603E38)
            if (r3 == r4) goto L_0x01be
            r4 = 58
            if (r3 == r12) goto L_0x01a0
            r6 = 14
            if (r3 == r6) goto L_0x0194
            switch(r3) {
                case 0: goto L_0x01be;
                case 1: goto L_0x01be;
                default: goto L_0x011b;
            }
        L_0x011b:
            r6 = 2132547185(0x7f1c1671, float:2.0747609E38)
            switch(r3) {
                case 9: goto L_0x0176;
                case 10: goto L_0x0176;
                case 11: goto L_0x0194;
                case 12: goto L_0x012e;
                default: goto L_0x0121;
            }
        L_0x0121:
            android.content.Context r0 = r9.f97110c
            java.lang.String r0 = r0.getString(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r11.append(r0)
            goto L_0x01ca
        L_0x012e:
            com.ss.android.ugc.aweme.comment.model.Comment r3 = r0.getReplyComment()
            r4 = 0
            if (r3 == 0) goto L_0x0140
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getUser()
            if (r3 == 0) goto L_0x0140
            java.lang.String r3 = r3.getUid()
            goto L_0x0141
        L_0x0140:
            r3 = r4
        L_0x0141:
            if (r3 == 0) goto L_0x016a
            android.content.Context r3 = r9.f97110c
            r5 = 2132548401(0x7f1c1b31, float:2.0750075E38)
            java.lang.Object[] r6 = new java.lang.Object[r1]
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.getReplyComment()
            if (r0 == 0) goto L_0x015a
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            if (r0 == 0) goto L_0x015a
            java.lang.String r4 = r0.getUid()
        L_0x015a:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r6[r2] = r0
            java.lang.String r0 = r3.getString(r5, r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r11.append(r0)
            goto L_0x01ca
        L_0x016a:
            android.content.Context r0 = r9.f97110c
            java.lang.String r0 = r0.getString(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r11.append(r0)
            goto L_0x01ca
        L_0x0176:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r3 = r9.f97110c
            r5 = 2132544856(0x7f1c0d58, float:2.0742885E38)
            java.lang.String r3 = r3.getString(r5)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r11.append(r0)
            goto L_0x01ca
        L_0x0194:
            android.content.Context r0 = r9.f97110c
            java.lang.String r0 = r0.getString(r5)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r11.append(r0)
            goto L_0x01ca
        L_0x01a0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r3 = r9.f97110c
            r5 = 2132543083(0x7f1c066b, float:2.073929E38)
            java.lang.String r3 = r3.getString(r5)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r11.append(r0)
            goto L_0x01ca
        L_0x01be:
            android.content.Context r0 = r9.f97110c
            java.lang.String r0 = r0.getString(r5)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r11.append(r0)
        L_0x01c9:
            r1 = 0
        L_0x01ca:
            if (r1 == 0) goto L_0x0346
            java.lang.String r0 = "contentBuilder"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)     // Catch:{ Exception -> 0x0346 }
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r0 = r9.f97700r     // Catch:{ Exception -> 0x0346 }
            if (r0 == 0) goto L_0x034d
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r0.getReplyComment()     // Catch:{ Exception -> 0x0346 }
            if (r1 == 0) goto L_0x034d
            android.view.View r3 = r9.f97696n     // Catch:{ Exception -> 0x0346 }
            r3.setVisibility(r2)     // Catch:{ Exception -> 0x0346 }
            int r3 = r0.getCommentType()     // Catch:{ Exception -> 0x0346 }
            r4 = 12
            if (r3 != r4) goto L_0x02ed
            com.ss.android.ugc.aweme.framework.services.IUserService r3 = com.p683ss.android.ugc.aweme.services.BaseUserService.getBaseUserService_Monster()     // Catch:{ Exception -> 0x0346 }
            java.lang.String r4 = "ServiceManager.get().get…IUserService::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)     // Catch:{ Exception -> 0x0346 }
            com.ss.android.ugc.aweme.framework.services.IUserService r3 = (com.p683ss.android.ugc.aweme.framework.services.IUserService) r3     // Catch:{ Exception -> 0x0346 }
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getCurrentUser()     // Catch:{ Exception -> 0x0346 }
            android.widget.TextView r4 = r9.f97698p     // Catch:{ Exception -> 0x0346 }
            if (r3 == 0) goto L_0x0224
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0346 }
            r5.<init>()     // Catch:{ Exception -> 0x0346 }
            java.lang.String r3 = com.p683ss.android.ugc.aweme.notification.newstyle.C38415g.m85724a(r3)     // Catch:{ Exception -> 0x0346 }
            r5.append(r3)     // Catch:{ Exception -> 0x0346 }
            java.lang.String r3 = ": "
            r5.append(r3)     // Catch:{ Exception -> 0x0346 }
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.getLevel1Comment()     // Catch:{ Exception -> 0x0346 }
            if (r0 == 0) goto L_0x0218
            java.lang.String r0 = r0.getText()     // Catch:{ Exception -> 0x0346 }
            if (r0 != 0) goto L_0x021a
        L_0x0218:
            java.lang.String r0 = ""
        L_0x021a:
            r5.append(r0)     // Catch:{ Exception -> 0x0346 }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x0346 }
        L_0x0221:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x0346 }
            goto L_0x0234
        L_0x0224:
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r0.getLevel1Comment()     // Catch:{ Exception -> 0x0346 }
            if (r0 == 0) goto L_0x0231
            java.lang.String r0 = r0.getText()     // Catch:{ Exception -> 0x0346 }
            if (r0 == 0) goto L_0x0231
            goto L_0x0221
        L_0x0231:
            java.lang.String r0 = ""
            goto L_0x0221
        L_0x0234:
            r4.setText(r0)     // Catch:{ Exception -> 0x0346 }
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.getUser()     // Catch:{ Exception -> 0x0346 }
            if (r0 == 0) goto L_0x032c
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.getUser()     // Catch:{ Exception -> 0x0346 }
            java.lang.String r3 = "user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)     // Catch:{ Exception -> 0x0346 }
            java.lang.String r0 = r0.getUid()     // Catch:{ Exception -> 0x0346 }
            if (r0 == 0) goto L_0x0250
            int r2 = r0.length()     // Catch:{ Exception -> 0x0346 }
        L_0x0250:
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.getUser()     // Catch:{ Exception -> 0x0346 }
            java.lang.String r3 = "user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)     // Catch:{ Exception -> 0x0346 }
            java.lang.String r0 = r0.getUid()     // Catch:{ Exception -> 0x0346 }
            r3 = -1
            if (r0 == 0) goto L_0x0285
            r15 = r11
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15     // Catch:{ Exception -> 0x0346 }
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.getUser()     // Catch:{ Exception -> 0x0346 }
            java.lang.String r4 = "user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)     // Catch:{ Exception -> 0x0346 }
            java.lang.String r0 = r0.getUid()     // Catch:{ Exception -> 0x0346 }
            java.lang.String r4 = "user.uid"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)     // Catch:{ Exception -> 0x0346 }
            r17 = 0
            r18 = 0
            r19 = 4
            r20 = 0
            r16 = r0
            int r0 = p2628d.p2650m.C52830p.m112419a(r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0346 }
            r15 = r0
            goto L_0x0286
        L_0x0285:
            r15 = -1
        L_0x0286:
            if (r15 == r3) goto L_0x032c
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.getUser()     // Catch:{ Exception -> 0x0346 }
            java.lang.String r3 = "user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)     // Catch:{ Exception -> 0x0346 }
            java.lang.String r0 = com.p683ss.android.ugc.aweme.notification.newstyle.C38415g.m85724a(r0)     // Catch:{ Exception -> 0x0346 }
            int r2 = r2 + r15
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x0346 }
            r11.replace(r15, r2, r3)     // Catch:{ Exception -> 0x0346 }
            android.widget.TextView r8 = r9.f97695m     // Catch:{ Exception -> 0x0346 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0346 }
            int r7 = r15 + r0
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getUser()     // Catch:{ Exception -> 0x0346 }
            java.lang.String r0 = "user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r0)     // Catch:{ Exception -> 0x0346 }
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r3 = r9.f97701s     // Catch:{ Exception -> 0x0346 }
            java.lang.String r5 = r9.f97702t     // Catch:{ Exception -> 0x0346 }
            java.lang.String r6 = r9.f97703u     // Catch:{ Exception -> 0x0346 }
            java.lang.String r0 = "textView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)     // Catch:{ Exception -> 0x0346 }
            java.lang.String r0 = "builder"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)     // Catch:{ Exception -> 0x0346 }
            java.lang.String r0 = "user"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r0)     // Catch:{ Exception -> 0x0346 }
            r2 = 0
            r4 = 0
            r16 = 8
            r17 = 0
            r0 = r21
            r12 = r7
            r7 = r16
            r14 = r8
            r8 = r17
            com.ss.android.ugc.aweme.notification.util.h r0 = r0.m85679a(r1, r2, r3, true, r5, r6)     // Catch:{ Exception -> 0x0346 }
            r1 = 33
            r11.setSpan(r0, r15, r12, r1)     // Catch:{ Exception -> 0x0346 }
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan     // Catch:{ Exception -> 0x0346 }
            int r2 = r21.mo78307h()     // Catch:{ Exception -> 0x0346 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0346 }
            r11.setSpan(r0, r15, r12, r1)     // Catch:{ Exception -> 0x0346 }
            android.text.method.MovementMethod r0 = com.p683ss.android.ugc.aweme.notification.p2031ui.C38425a.m85737a()     // Catch:{ Exception -> 0x0346 }
            r14.setMovementMethod(r0)     // Catch:{ Exception -> 0x0346 }
            goto L_0x032c
        L_0x02ed:
            com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService r0 = com.p683ss.android.ugc.aweme.comment.p1526k.C25242m.m61365a()     // Catch:{ Exception -> 0x0346 }
            com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService r0 = (com.p683ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService) r0     // Catch:{ Exception -> 0x0346 }
            android.widget.TextView r3 = r9.f97698p     // Catch:{ Exception -> 0x0346 }
            com.ss.android.ugc.aweme.profile.model.User r4 = r1.getUser()     // Catch:{ Exception -> 0x0346 }
            if (r4 == 0) goto L_0x0323
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0346 }
            r4.<init>()     // Catch:{ Exception -> 0x0346 }
            com.ss.android.ugc.aweme.profile.model.User r5 = r1.getUser()     // Catch:{ Exception -> 0x0346 }
            java.lang.String r6 = "user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)     // Catch:{ Exception -> 0x0346 }
            java.lang.String r5 = com.p683ss.android.ugc.aweme.notification.newstyle.C38415g.m85724a(r5)     // Catch:{ Exception -> 0x0346 }
            r4.append(r5)     // Catch:{ Exception -> 0x0346 }
            java.lang.String r5 = ": "
            r4.append(r5)     // Catch:{ Exception -> 0x0346 }
            java.lang.String r0 = r0.getDisplayText(r1, r2)     // Catch:{ Exception -> 0x0346 }
            r4.append(r0)     // Catch:{ Exception -> 0x0346 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0346 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x0346 }
            goto L_0x0329
        L_0x0323:
            java.lang.String r0 = r0.getDisplayText(r1, r2)     // Catch:{ Exception -> 0x0346 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x0346 }
        L_0x0329:
            r3.setText(r0)     // Catch:{ Exception -> 0x0346 }
        L_0x032c:
            android.widget.TextView r0 = r9.f97698p     // Catch:{ Exception -> 0x0346 }
            java.lang.CharSequence r0 = r0.getText()     // Catch:{ Exception -> 0x0346 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0346 }
            if (r0 != 0) goto L_0x033e
            android.widget.TextView r0 = r9.f97698p     // Catch:{ Exception -> 0x0346 }
            com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b.m69342a(r0)     // Catch:{ Exception -> 0x0346 }
            goto L_0x034d
        L_0x033e:
            android.view.View r0 = r9.f97696n     // Catch:{ Exception -> 0x0346 }
            r1 = 8
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x0346 }
            goto L_0x034d
        L_0x0346:
            android.view.View r0 = r9.f97696n
            r1 = 8
            r0.setVisibility(r1)
        L_0x034d:
            java.lang.String r0 = " "
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r11.append(r0)
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r13.getComment()
            java.lang.String r1 = "it.comment"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.String r0 = r0.getText()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x037b
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r13.getComment()
            java.lang.String r1 = "it.comment"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.String r0 = r0.getText()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r11.append(r0)
        L_0x037b:
            android.widget.TextView r0 = r9.f97695m
            android.content.Context r1 = r9.f97110c
            int r1 = com.bytedance.common.utility.C9432q.m18670a(r1)
            android.content.Context r2 = r9.f97110c
            r3 = 1125384192(0x43140000, float:148.0)
            float r2 = com.bytedance.common.utility.C9432q.m18687b(r2, r3)
            int r2 = (int) r2
            int r1 = r1 - r2
            r2 = 7
            com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38389i.m85696a(r0, r11, r10, r2, r1)
            android.widget.TextView r0 = r9.f97695m
            com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b.m69342a(r0)
            return
        L_0x0397:
            return
        L_0x0398:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38391j.mo78310a(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice, boolean, java.lang.String, java.lang.String):void");
    }
}
