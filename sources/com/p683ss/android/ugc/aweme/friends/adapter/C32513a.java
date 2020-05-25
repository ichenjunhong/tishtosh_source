package com.p683ss.android.ugc.aweme.friends.adapter;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p665a.C10635a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.friends.model.AtFriendsViewModel.Companion.AllFriends;
import com.p683ss.android.ugc.aweme.friends.model.HotSoonRelationNotice;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32507d;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.a */
public final class C32513a extends C1322a<C10635a<IMUser>> {

    /* renamed from: d */
    public static final C32516b f84626d = new C32516b(null);

    /* renamed from: a */
    public List<? extends IMUser> f84627a;

    /* renamed from: b */
    public AllFriends f84628b;

    /* renamed from: c */
    public int f84629c = -1;

    /* renamed from: com.ss.android.ugc.aweme.friends.adapter.a$a */
    public static class C32514a extends C10635a<IMUser> {

        /* renamed from: a */
        public TextView f84630a;

        /* renamed from: b */
        public TextView f84631b;

        /* renamed from: c */
        public AvatarImageWithVerify f84632c;

        /* renamed from: d */
        public TextView f84633d;

        /* renamed from: e */
        public TextView f84634e;

        /* renamed from: f */
        public ImageView f84635f;

        /* renamed from: g */
        public int f84636g = -1;

        /* renamed from: h */
        public final View f84637h;

        /* renamed from: i */
        public final C32513a f84638i;

        /* renamed from: com.ss.android.ugc.aweme.friends.adapter.a$a$a */
        static final class C32515a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C32514a f84639a;

            /* renamed from: b */
            final /* synthetic */ IMUser f84640b;

            /* renamed from: c */
            final /* synthetic */ User f84641c;

            C32515a(C32514a aVar, IMUser iMUser, User user) {
                this.f84639a = aVar;
                this.f84640b = iMUser;
                this.f84641c = user;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (this.f84639a.f84636g == 0) {
                    C26890h.m65014b("add_video_at", C23198ae.m56851a(C23089d.m56640a().mo47829a("search_keyword", "").mo47829a("log_pb", C29981aa.m70153a().mo60163b(this.f84640b.getUid())).mo47829a("to_user_id", this.f84640b.getUid()).f61491a));
                }
                IAccountUserService a = C20902b.m53242a();
                C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
                if (!TextUtils.equals(a.getCurUserId(), this.f84640b.getUid())) {
                    C26890h.onEvent(MobClick.obtain().setEventName("at_friend").setLabelName("friend_list").setValue(this.f84640b.getUid()));
                    C47718bf.m103288a(new C32507d(this.f84641c));
                    return;
                }
                View view2 = this.f84639a.itemView;
                C52711k.m112236a((Object) view2, "itemView");
                C10691a.m21542b(view2.getContext(), (int) R.string.cgz).mo19066a();
            }
        }

        /* renamed from: a */
        public final void mo18876a() {
        }

        public C32514a(View view, C32513a aVar) {
            C52711k.m112240b(view, "container");
            C52711k.m112240b(aVar, "adapter");
            super(view);
            this.f84637h = view;
            this.f84638i = aVar;
            View findViewById = this.f84637h.findViewById(R.id.ck5);
            C52711k.m112236a((Object) findViewById, "container.findViewById(R.id.sectionLabel)");
            this.f84630a = (TextView) findViewById;
            View findViewById2 = this.f84637h.findViewById(R.id.atd);
            C52711k.m112236a((Object) findViewById2, "container.findViewById(R.id.indexLabel)");
            this.f84631b = (TextView) findViewById2;
            View findViewById3 = this.f84637h.findViewById(R.id.hi);
            C52711k.m112236a((Object) findViewById3, "container.findViewById(R.id.avatar)");
            this.f84632c = (AvatarImageWithVerify) findViewById3;
            View findViewById4 = this.f84637h.findViewById(R.id.bpp);
            C52711k.m112236a((Object) findViewById4, "container.findViewById(R.id.name)");
            this.f84633d = (TextView) findViewById4;
            View findViewById5 = this.f84637h.findViewById(R.id.a4e);
            C52711k.m112236a((Object) findViewById5, "container.findViewById(R.id.desc)");
            this.f84634e = (TextView) findViewById5;
            View findViewById6 = this.f84637h.findViewById(R.id.cb1);
            C52711k.m112236a((Object) findViewById6, "container.findViewById(R.id.relation)");
            this.f84635f = (ImageView) findViewById6;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e0, code lost:
            if (android.text.TextUtils.equals(r13, r1) == false) goto L_0x00e2;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo18877a(java.lang.Object r12, int r13) {
            /*
                r11 = this;
                com.ss.android.ugc.aweme.im.service.model.IMUser r12 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser) r12
                java.lang.String r0 = "user"
                p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
                android.view.View r0 = r11.itemView
                java.lang.String r1 = "itemView"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                android.view.View r1 = r11.itemView
                java.lang.String r2 = "itemView"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                android.content.Context r1 = r1.getContext()
                android.graphics.drawable.Drawable r1 = com.bytedance.ies.dmt.p664ui.common.C10678c.m21505e(r1)
                r0.setBackground(r1)
                com.ss.android.ugc.aweme.friends.adapter.a r0 = r11.f84638i
                java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> r0 = r0.f84627a
                r1 = 0
                if (r13 <= 0) goto L_0x0035
                if (r0 != 0) goto L_0x002c
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x002c:
                int r2 = r13 + -1
                java.lang.Object r0 = r0.get(r2)
                com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser) r0
                goto L_0x0036
            L_0x0035:
                r0 = r1
            L_0x0036:
                android.widget.TextView r2 = r11.f84630a
                r3 = 0
                r2.setVisibility(r3)
                com.ss.android.ugc.aweme.friends.adapter.a r2 = r11.f84638i
                com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion$AllFriends r2 = r2.f84628b
                r4 = 8
                if (r2 == 0) goto L_0x00f3
                java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r5 = r2.recentFriends
                int r5 = r5.size()
                java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r6 = r2.mutualFriends
                int r6 = r6.size()
                int r5 = r5 + r6
                if (r13 != 0) goto L_0x0067
                android.widget.TextView r2 = r11.f84630a
                r2.setVisibility(r3)
                android.widget.TextView r2 = r11.f84630a
                java.lang.String r6 = ""
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                r2.setText(r6)
                android.widget.TextView r2 = r11.f84630a
                r2.setCompoundDrawables(r1, r1, r1, r1)
                goto L_0x00c5
            L_0x0067:
                java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r6 = r2.recentFriends
                int r6 = r6.size()
                if (r13 != r6) goto L_0x00a4
                java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r6 = r2.mutualFriends
                java.util.Collection r6 = (java.util.Collection) r6
                boolean r6 = r6.isEmpty()
                r6 = r6 ^ 1
                if (r6 == 0) goto L_0x00a4
                android.widget.TextView r2 = r11.f84630a
                r6 = 2132549929(0x7f1c2129, float:2.0753174E38)
                r2.setText(r6)
                android.widget.TextView r2 = r11.f84630a
                android.view.View r6 = r11.f84637h
                android.content.res.Resources r6 = r6.getResources()
                r7 = 2131953297(0x7f130691, float:1.954306E38)
                android.graphics.drawable.Drawable r6 = r6.getDrawable(r7)
                java.lang.String r7 = "container.resources.getD…rawable.ic_im_friends_32)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
                r2.setCompoundDrawables(r1, r1, r6, r1)
                int r7 = android.os.Build.VERSION.SDK_INT
                r8 = 17
                if (r7 < r8) goto L_0x00c5
                r2.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r1, r6, r1)
                goto L_0x00c5
            L_0x00a4:
                if (r13 != r5) goto L_0x00c0
                java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r2 = r2.allFollowingFriends
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = r2.isEmpty()
                r2 = r2 ^ 1
                if (r2 == 0) goto L_0x00c0
                android.widget.TextView r2 = r11.f84630a
                r6 = 2132542051(0x7f1c0263, float:2.0737196E38)
                r2.setText(r6)
                android.widget.TextView r2 = r11.f84630a
                r2.setCompoundDrawables(r1, r1, r1, r1)
                goto L_0x00c5
            L_0x00c0:
                android.widget.TextView r2 = r11.f84630a
                r2.setVisibility(r4)
            L_0x00c5:
                android.widget.TextView r2 = r11.f84631b
                r2.setVisibility(r3)
                if (r13 < r5) goto L_0x00ee
                if (r13 == r5) goto L_0x00e2
                java.lang.String r13 = r12.getInitialLetter()
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                if (r0 == 0) goto L_0x00da
                java.lang.String r1 = r0.getInitialLetter()
            L_0x00da:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r13 = android.text.TextUtils.equals(r13, r1)
                if (r13 != 0) goto L_0x00ee
            L_0x00e2:
                android.widget.TextView r13 = r11.f84631b
                java.lang.String r0 = r12.getInitialLetter()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r13.setText(r0)
                goto L_0x00f3
            L_0x00ee:
                android.widget.TextView r13 = r11.f84631b
                r13.setVisibility(r4)
            L_0x00f3:
                com.ss.android.ugc.aweme.profile.model.User r13 = com.p683ss.android.ugc.aweme.friends.adapter.C32513a.C32516b.m75260a(r12)
                com.ss.android.ugc.aweme.utils.UserVerify r0 = new com.ss.android.ugc.aweme.utils.UserVerify
                com.ss.android.ugc.aweme.base.model.UrlModel r6 = r13.getAvatarThumb()
                java.lang.String r7 = r13.getCustomVerify()
                java.lang.String r8 = r13.getEnterpriseVerifyReason()
                int r1 = r13.getVerificationType()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
                java.lang.String r10 = r13.getWeiboVerify()
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10)
                com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r1 = r11.f84632c
                r1.setUserData(r0)
                android.widget.TextView r0 = r11.f84634e
                r0.setVisibility(r3)
                android.widget.TextView r0 = r11.f84633d
                java.lang.String r1 = r12.getNickName()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                android.widget.TextView r0 = r11.f84634e
                java.lang.String r1 = r12.getSignature()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                com.ss.android.ugc.aweme.services.IMainService r0 = com.p683ss.android.ugc.aweme.services.MainServiceImpl.createIMainServicebyMonsterPlugin()
                com.ss.android.ugc.aweme.services.IMainService r0 = (com.p683ss.android.ugc.aweme.services.IMainService) r0
                java.lang.String r1 = "Message"
                boolean r0 = r0.shouldChangeToHandle(r1)
                if (r0 == 0) goto L_0x0177
                java.lang.String r0 = r12.getUniqueId()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x015d
                java.lang.String r0 = r12.getShortId()
                if (r0 != 0) goto L_0x0158
                java.lang.String r0 = ""
                goto L_0x0161
            L_0x0158:
                java.lang.String r0 = r12.getShortId()
                goto L_0x0161
            L_0x015d:
                java.lang.String r0 = r12.getUniqueId()
            L_0x0161:
                java.lang.String r0 = java.lang.String.valueOf(r0)
                android.widget.TextView r1 = r11.f84633d
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r1.setText(r0)
                android.widget.TextView r0 = r11.f84634e
                java.lang.String r1 = r12.getNickName()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
            L_0x0177:
                android.widget.TextView r0 = r11.f84634e
                java.lang.CharSequence r0 = r0.getText()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0188
                android.widget.TextView r0 = r11.f84634e
                r0.setVisibility(r4)
            L_0x0188:
                com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify r0 = r11.f84632c
                r0.mo48964b()
                android.view.View r0 = r11.itemView
                java.lang.String r1 = "itemView"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                android.content.Context r0 = r0.getContext()
                java.lang.String r1 = r12.getCustomVerify()
                java.lang.String r2 = r12.getEnterpriseVerifyReason()
                android.widget.TextView r5 = r11.f84633d
                com.p683ss.android.ugc.aweme.utils.C47916gh.m103675a(r0, r1, r2, r5)
                int r0 = r12.getFollowStatus()
                r1 = 2
                if (r0 != r1) goto L_0x01ba
                android.widget.ImageView r0 = r11.f84635f
                r0.setVisibility(r3)
                android.widget.ImageView r0 = r11.f84635f
                r1 = 2131953098(0x7f1305ca, float:1.9542657E38)
                r0.setImageResource(r1)
                goto L_0x01bf
            L_0x01ba:
                android.widget.ImageView r0 = r11.f84635f
                r0.setVisibility(r4)
            L_0x01bf:
                android.view.View r0 = r11.f84637h
                com.ss.android.ugc.aweme.friends.adapter.a$a$a r1 = new com.ss.android.ugc.aweme.friends.adapter.a$a$a
                r1.<init>(r11, r12, r13)
                android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
                r0.setOnClickListener(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.friends.adapter.C32513a.C32514a.mo18877a(java.lang.Object, int):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.adapter.a$b */
    public static final class C32516b {
        private C32516b() {
        }

        public /* synthetic */ C32516b(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static User m75260a(IMUser iMUser) {
            C52711k.m112240b(iMUser, "imUser");
            User user = new User();
            user.setUid(iMUser.getUid());
            user.setNickname(iMUser.getNickName());
            user.setSignature(iMUser.getSignature());
            user.setAvatarThumb(iMUser.getAvatarThumb());
            user.setUniqueId(iMUser.getUniqueId());
            user.setShortId(iMUser.getShortId());
            user.setFollowStatus(iMUser.getFollowStatus());
            user.setCustomVerify(iMUser.getCustomVerify());
            user.setWeiboVerify(iMUser.getWeiboVerify());
            user.setEnterpriseVerifyReason(iMUser.getEnterpriseVerifyReason());
            user.setVerificationType(iMUser.getVerificationType());
            user.setRemarkName(iMUser.getRemarkName());
            user.isBlock = iMUser.isBlock();
            user.setRegion("");
            return user;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.adapter.a$c */
    public static final class C32517c extends C10635a<IMUser> {

        /* renamed from: a */
        private final DmtTextView f84642a;

        /* renamed from: a */
        public final void mo18876a() {
        }

        public C32517c(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.dcu);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.tv_notice)");
            this.f84642a = (DmtTextView) findViewById;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo18877a(Object obj, int i) {
            IMUser iMUser = (IMUser) obj;
            C52711k.m112240b(iMUser, "user");
            if (!(iMUser instanceof HotSoonRelationNotice)) {
                iMUser = null;
            }
            HotSoonRelationNotice hotSoonRelationNotice = (HotSoonRelationNotice) iMUser;
            if (hotSoonRelationNotice != null) {
                String notice = hotSoonRelationNotice.getNotice();
                if (notice != null) {
                    this.f84642a.setText(notice);
                }
            }
        }
    }

    public final int getItemCount() {
        List<? extends IMUser> list = this.f84627a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final int getItemViewType(int i) {
        IMUser iMUser;
        List<? extends IMUser> list = this.f84627a;
        if (list != null) {
            iMUser = (IMUser) list.get(i);
        } else {
            iMUser = null;
        }
        if (iMUser instanceof HotSoonRelationNotice) {
            return 1;
        }
        return 0;
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C10635a aVar;
        C10635a aVar2 = (C10635a) vVar;
        C52711k.m112240b(aVar2, "holder");
        if (!(aVar2 instanceof C32514a)) {
            aVar = null;
        } else {
            aVar = aVar2;
        }
        C32514a aVar3 = (C32514a) aVar;
        if (aVar3 != null) {
            aVar3.f84636g = this.f84629c;
        }
        List<? extends IMUser> list = this.f84627a;
        if (list == null) {
            C52711k.m112234a();
        }
        aVar2.mo18877a(list.get(i), i);
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C10635a aVar;
        C52711k.m112240b(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bic, viewGroup, false);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…on_notice, parent, false)");
            aVar = new C32517c(inflate);
        } else {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.s5, viewGroup, false);
            C52711k.m112236a((Object) inflate2, "LayoutInflater.from(pare…at_friend, parent, false)");
            aVar = new C32514a(inflate2, this);
        }
        return aVar;
    }
}
