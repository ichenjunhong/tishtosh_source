package com.bytedance.android.livesdk.rank.p413f;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3909r.C3910a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.event.C5193m;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;
import p2663f.p2664a.p2665a.C53035c;

/* renamed from: com.bytedance.android.livesdk.rank.f.a */
public final class C8167a extends C53035c<C8219f, C8168a> {

    /* renamed from: com.bytedance.android.livesdk.rank.f.a$a */
    public static final class C8168a extends C1352v {

        /* renamed from: com.bytedance.android.livesdk.rank.f.a$a$a */
        public static final class C8169a implements C3910a {

            /* renamed from: a */
            final /* synthetic */ C8168a f22304a;

            /* renamed from: a */
            public final void mo9270a(ImageModel imageModel) {
                C52711k.m112240b(imageModel, "imageModel");
            }

            /* renamed from: a */
            public final void mo9272a(ImageModel imageModel, Exception exc) {
                C52711k.m112240b(imageModel, "imageModel");
                C52711k.m112240b(exc, "e");
            }

            C8169a(C8168a aVar) {
                this.f22304a = aVar;
            }

            /* renamed from: a */
            public final void mo9271a(ImageModel imageModel, int i, int i2, boolean z) {
                C52711k.m112240b(imageModel, "imageModel");
                View view = this.f22304a.itemView;
                C52711k.m112236a((Object) view, "itemView");
                ImageView imageView = (ImageView) view.findViewById(R.id.ap8);
                C52711k.m112236a((Object) imageView, "itemView.honor");
                LayoutParams layoutParams = imageView.getLayoutParams();
                int a = C3922z.m9899a(30.0f);
                layoutParams.width = a;
                layoutParams.height = (i2 * a) / i;
                View view2 = this.f22304a.itemView;
                C52711k.m112236a((Object) view2, "itemView");
                ImageView imageView2 = (ImageView) view2.findViewById(R.id.ap8);
                C52711k.m112236a((Object) imageView2, "itemView.honor");
                imageView2.setLayoutParams(layoutParams);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.f.a$a$b */
        static final class C8170b implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C8219f f22305a;

            C8170b(C8219f fVar) {
                this.f22305a = fVar;
            }

            public final void onClick(View view) {
                if (this.f22305a.f22442a != null) {
                    C4495a.m10823a().mo10301a((Object) new UserProfileEvent(this.f22305a.f22442a));
                    Map hashMap = new HashMap();
                    hashMap.put("event_belong", CustomActionPushReceiver.f104061f);
                    hashMap.put("room_id", String.valueOf(this.f22305a.mo14364a()));
                    User user = this.f22305a.f22442a;
                    C52711k.m112236a((Object) user, "item.user");
                    hashMap.put("user_id", String.valueOf(user.getId()));
                    hashMap.put("event_type", "click");
                    hashMap.put("event_module", "popup");
                    hashMap.put("event_page", "live_detail");
                    C8049c.m15979a().mo14202a("hourly_richest_click", hashMap, new Object[0]);
                }
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.f.a$a$c */
        static final class C8171c implements OnClickListener {

            /* renamed from: a */
            public static final C8171c f22306a = new C8171c();

            C8171c() {
            }

            public final void onClick(View view) {
                C4495a.m10823a().mo10301a((Object) new C5193m(true));
            }
        }

        public C8168a(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "parent");
        View inflate = layoutInflater.inflate(R.layout.app, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C8168a(inflate);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0094  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo14350a(android.support.p043v7.widget.RecyclerView.C1352v r17, java.lang.Object r18) {
        /*
            r16 = this;
            r0 = r17
            com.bytedance.android.livesdk.rank.f.a$a r0 = (com.bytedance.android.livesdk.rank.p413f.C8167a.C8168a) r0
            r1 = r18
            com.bytedance.android.livesdk.rank.model.f r1 = (com.bytedance.android.livesdk.rank.model.C8219f) r1
            java.lang.String r2 = "holder"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            java.lang.String r2 = "item"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            java.lang.String r2 = "item"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            android.view.View r2 = r0.itemView
            java.lang.String r3 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r3 = 2132018319(0x7f14048f, float:1.9674941E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.bytedance.android.live.base.model.user.User r4 = r1.f22442a
            java.lang.String r5 = "item.user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.bytedance.android.live.base.model.ImageModel r4 = r4.getAvatarThumb()
            android.view.View r5 = r0.itemView
            java.lang.String r6 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            android.view.View r5 = r5.findViewById(r3)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            java.lang.String r6 = "itemView.contributor_avatar"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            int r5 = r5.getWidth()
            android.view.View r6 = r0.itemView
            java.lang.String r7 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            android.view.View r6 = r6.findViewById(r3)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            java.lang.String r7 = "itemView.contributor_avatar"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            int r6 = r6.getHeight()
            r7 = 2131956070(0x7f131166, float:1.9548685E38)
            com.bytedance.android.livesdk.chatroom.p310f.C5213c.m11826b(r2, r4, r5, r6, r7)
            com.bytedance.android.live.base.model.user.User r2 = r1.f22442a
            r4 = 0
            if (r2 == 0) goto L_0x0074
            com.bytedance.android.live.base.model.user.m r2 = r2.getUserHonor()
            if (r2 == 0) goto L_0x0074
            com.bytedance.android.live.base.model.ImageModel r2 = r2.mo8156k()
            goto L_0x0075
        L_0x0074:
            r2 = r4
        L_0x0075:
            r5 = 8
            r6 = 2132019502(0x7f14092e, float:1.967734E38)
            if (r2 == 0) goto L_0x0094
            android.view.View r7 = r0.itemView
            java.lang.String r8 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            android.view.View r6 = r7.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            com.bytedance.android.livesdk.rank.f.a$a$a r7 = new com.bytedance.android.livesdk.rank.f.a$a$a
            r7.<init>(r0)
            com.bytedance.android.live.core.g.r$a r7 = (com.bytedance.android.live.core.p230g.C3909r.C3910a) r7
            com.bytedance.android.livesdk.chatroom.p310f.C5213c.m11819a(r6, r2, r7)
            goto L_0x00a9
        L_0x0094:
            android.view.View r2 = r0.itemView
            java.lang.String r7 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r7)
            android.view.View r2 = r2.findViewById(r6)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            java.lang.String r6 = "itemView.honor"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r6)
            r2.setVisibility(r5)
        L_0x00a9:
            android.view.View r2 = r0.itemView
            java.lang.String r6 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r6)
            r6 = 2132018320(0x7f140490, float:1.9674943E38)
            android.view.View r2 = r2.findViewById(r6)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r6 = "itemView.contributor_name"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r6)
            com.bytedance.android.live.base.model.user.User r6 = r1.f22442a
            if (r6 == 0) goto L_0x00c6
            java.lang.String r4 = r6.getNickName()
        L_0x00c6:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2.setText(r4)
            com.bytedance.android.live.base.model.user.User r2 = r1.f22442a
            r4 = 2132022907(0x7f14167b, float:1.9684247E38)
            if (r2 == 0) goto L_0x0117
            com.bytedance.android.live.base.model.user.User r2 = r1.f22442a
            java.lang.String r6 = "item.user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r6)
            com.bytedance.android.live.base.model.ImageModel r2 = r2.getMedal()
            if (r2 == 0) goto L_0x0117
            com.bytedance.android.live.base.model.user.User r2 = r1.f22442a
            java.lang.String r6 = "item.user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r6)
            com.bytedance.android.live.base.model.ImageModel r2 = r2.getMedal()
            java.lang.String r6 = "item.user.medal"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r6)
            java.util.List r2 = r2.getUrls()
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
            if (r2 != 0) goto L_0x0117
            android.view.View r2 = r0.itemView
            java.lang.String r5 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            android.view.View r2 = r2.findViewById(r4)
            com.bytedance.android.live.core.widget.HSImageView r2 = (com.bytedance.android.live.core.widget.HSImageView) r2
            com.bytedance.android.live.base.model.user.User r4 = r1.f22442a
            java.lang.String r5 = "item.user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.bytedance.android.live.base.model.ImageModel r4 = r4.getMedal()
            com.bytedance.android.livesdk.chatroom.p310f.C5213c.m11814a(r2, r4)
            goto L_0x012c
        L_0x0117:
            android.view.View r2 = r0.itemView
            java.lang.String r6 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r6)
            android.view.View r2 = r2.findViewById(r4)
            com.bytedance.android.live.core.widget.HSImageView r2 = (com.bytedance.android.live.core.widget.HSImageView) r2
            java.lang.String r4 = "itemView.special_medal"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            r2.setVisibility(r5)
        L_0x012c:
            boolean r2 = com.bytedance.android.livesdkapi.p430b.C8607a.f23572a
            r4 = 17
            r5 = 2131822526(0x7f1107be, float:1.9277826E38)
            if (r2 != 0) goto L_0x0183
            r2 = 2132551423(0x7f1c26ff, float:2.0756205E38)
            java.lang.String r2 = com.bytedance.android.live.core.p230g.C3922z.m9903a(r2)
            long r6 = r1.f22443b
            java.lang.String r6 = com.bytedance.android.live.core.p230g.C3890e.m9835c(r6)
            r7 = 2132551421(0x7f1c26fd, float:2.07562E38)
            java.lang.String r7 = com.bytedance.android.live.core.p230g.C3922z.m9903a(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = r8.toString()
            android.text.SpannableString r8 = new android.text.SpannableString
            r9 = r6
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r8.<init>(r9)
            android.text.style.ForegroundColorSpan r9 = new android.text.style.ForegroundColorSpan
            int r5 = com.bytedance.android.live.core.p230g.C3922z.m9909b(r5)
            r9.<init>(r5)
            int r2 = r2.length()
            int r5 = r6.length()
            if (r7 != 0) goto L_0x0179
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0179:
            int r6 = r7.length()
            int r5 = r5 - r6
            r8.setSpan(r9, r2, r5, r4)
            r7 = r8
            goto L_0x01cc
        L_0x0183:
            r2 = 2132551420(0x7f1c26fc, float:2.0756199E38)
            java.lang.String r2 = com.bytedance.android.live.core.p230g.C3922z.m9903a(r2)
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            long r8 = r1.f22443b
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6[r7] = r8
            java.lang.String r2 = com.bytedance.android.livesdk.p279af.C4604n.m11050a(r2, r6)
            long r6 = r1.f22443b
            java.lang.String r6 = java.lang.String.valueOf(r6)
            android.text.SpannableString r7 = new android.text.SpannableString
            r14 = r2
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            r7.<init>(r14)
            android.text.style.ForegroundColorSpan r15 = new android.text.style.ForegroundColorSpan
            int r5 = com.bytedance.android.live.core.p230g.C3922z.m9909b(r5)
            r15.<init>(r5)
            java.lang.String r5 = "origin"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            r8 = r14
            r9 = r6
            int r2 = p2628d.p2650m.C52830p.m112419a(r8, r9, r10, r11, r12, r13)
            int r5 = p2628d.p2650m.C52830p.m112419a(r8, r9, r10, r11, r12, r13)
            int r6 = r6.length()
            int r5 = r5 + r6
            r7.setSpan(r15, r2, r5, r4)
        L_0x01cc:
            android.view.View r2 = r0.itemView
            java.lang.String r4 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            r4 = 2132019071(0x7f14077f, float:1.9676467E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r4 = "itemView.fire_number"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r2.setText(r7)
            android.view.View r2 = r0.itemView
            java.lang.String r4 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.bytedance.android.livesdk.rank.f.a$a$b r3 = new com.bytedance.android.livesdk.rank.f.a$a$b
            r3.<init>(r1)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
            android.view.View r0 = r0.itemView
            java.lang.String r1 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r1 = 2132019478(0x7f140916, float:1.9677292E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.android.livesdk.rank.f.a$a$c r1 = com.bytedance.android.livesdk.rank.p413f.C8167a.C8168a.C8171c.f22306a
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.rank.p413f.C8167a.mo14350a(android.support.v7.widget.RecyclerView$v, java.lang.Object):void");
    }
}
