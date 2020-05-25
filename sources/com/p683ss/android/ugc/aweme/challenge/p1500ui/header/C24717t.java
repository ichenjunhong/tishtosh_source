package com.p683ss.android.ugc.aweme.challenge.p1500ui.header;

import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.ProfileStarRankView;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.t */
public final class C24717t implements C24708n {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f65457a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24717t.class), "starRankView", "getStarRankView()Lcom/ss/android/ugc/aweme/profile/ui/widget/ProfileStarRankView;"))};

    /* renamed from: b */
    public FrameLayout f65458b;

    /* renamed from: c */
    private final C52668f f65459c = C52732g.m112285a(new C24718a(this));

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.t$a */
    static final class C24718a extends C52712l implements C52670a<ProfileStarRankView> {

        /* renamed from: a */
        final /* synthetic */ C24717t f65460a;

        C24718a(C24717t tVar) {
            this.f65460a = tVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            FrameLayout frameLayout = (FrameLayout) this.f65460a.mo50601a().findViewById(R.id.e4v);
            if (frameLayout == null) {
                return null;
            }
            return (ProfileStarRankView) LayoutInflater.from(this.f65460a.mo50601a().getContext()).inflate(R.layout.bux, frameLayout, true).findViewById(R.id.c5x);
        }
    }

    /* renamed from: c */
    private ProfileStarRankView m60229c() {
        return (ProfileStarRankView) this.f65459c.getValue();
    }

    /* renamed from: a */
    public final void mo50577a(float f) {
    }

    /* renamed from: b */
    public final void mo50583b() {
    }

    /* renamed from: a */
    public final FrameLayout mo50601a() {
        FrameLayout frameLayout = this.f65458b;
        if (frameLayout == null) {
            C52711k.m112237a("rootView");
        }
        return frameLayout;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50579a(com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetail r9) {
        /*
            r8 = this;
            java.lang.String r0 = "data"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            com.ss.android.ugc.aweme.challenge.ab.a r0 = com.p683ss.android.ugc.aweme.challenge.p1495ab.C24531a.f64953a
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r9.challenge
            r1 = 0
            boolean r2 = com.p683ss.android.ugc.aweme.challenge.p1495ab.C24531a.m59939a(r1)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x001e
            if (r0 == 0) goto L_0x0019
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getStarUser()
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            if (r0 == 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 != 0) goto L_0x0022
            return
        L_0x0022:
            com.ss.android.ugc.aweme.profile.ui.widget.ProfileStarRankView r0 = r8.m60229c()
            if (r0 == 0) goto L_0x009b
            com.ss.android.ugc.aweme.discover.model.Challenge r2 = r9.challenge
            if (r2 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getStarUser()
            goto L_0x0032
        L_0x0031:
            r2 = r1
        L_0x0032:
            if (r2 == 0) goto L_0x0096
            com.ss.android.ugc.aweme.profile.model.HotSearchSprintStruct r5 = r2.getSprintSupportUserInfo()
            int r6 = r2.getStarBillboardRank()
            if (r6 <= 0) goto L_0x0096
            if (r5 == 0) goto L_0x0096
            com.ss.android.ugc.aweme.app.SharePrefCache r6 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r6 = r6.getHitRankActivityStatus()
            java.lang.Object r6 = r6.mo47782d()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 == 0) goto L_0x0065
            com.ss.android.ugc.aweme.app.SharePrefCache r6 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r6 = r6.getHitRankActivityProfileBackground()
            java.lang.Object r6 = r6.mo47782d()
            java.lang.String r6 = (java.lang.String) r6
            r0.setBackgroundImage(r6)
        L_0x0065:
            r0.setVisibility(r3)
            int r6 = r2.getStarBillboardRank()
            r0.setRank(r6)
            int r6 = r5.getSprint()
            r0.setHitRankPeopleNumber(r6)
            java.util.List r6 = r5.getHitRankPeoples()
            r0.setHitRankUsers(r6)
            android.view.ViewGroup r6 = r0.getStarRankView()
            com.ss.android.ugc.aweme.profile.ui.widget.e r7 = new com.ss.android.ugc.aweme.profile.ui.widget.e
            r7.<init>(r0, r2)
            r6.setOnClickListener(r7)
            android.view.ViewGroup r6 = r0.getHitRankView()
            com.ss.android.ugc.aweme.profile.ui.widget.f r7 = new com.ss.android.ugc.aweme.profile.ui.widget.f
            r7.<init>(r0, r5, r2)
            r6.setOnClickListener(r7)
            goto L_0x009b
        L_0x0096:
            r2 = 8
            r0.setVisibility(r2)
        L_0x009b:
            com.ss.android.ugc.aweme.profile.ui.widget.ProfileStarRankView r0 = r8.m60229c()
            if (r0 == 0) goto L_0x0118
            com.ss.android.ugc.aweme.discover.model.Challenge r2 = r9.challenge
            if (r2 == 0) goto L_0x00a9
            java.lang.String r1 = r2.getDesc()
        L_0x00a9:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x00b3
            int r1 = r1.length()
            if (r1 != 0) goto L_0x00b4
        L_0x00b3:
            r3 = 1
        L_0x00b4:
            com.ss.android.ugc.aweme.discover.model.Challenge r9 = r9.challenge
            r0.f103159d = r9
            r0.f103158c = r4
            r0.mo82695a()
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r9 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r0.f103156a
            com.facebook.drawee.h.b r1 = r1.getHierarchy()
            com.facebook.drawee.f.a r1 = (com.facebook.drawee.p940f.C13833a) r1
            com.facebook.drawee.f.e r1 = r1.f36079a
            if (r1 == 0) goto L_0x00e1
            if (r3 != 0) goto L_0x00e1
            float r9 = (float) r9
            r2 = 0
            r1.mo25933a(r9, r9, r2, r2)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r9 = r0.f103156a
            com.facebook.drawee.h.b r9 = r9.getHierarchy()
            com.facebook.drawee.f.a r9 = (com.facebook.drawee.p940f.C13833a) r9
            r9.mo25899a(r1)
        L_0x00e1:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r9 = r0.f103156a
            com.facebook.drawee.h.b r9 = r9.getHierarchy()
            com.facebook.drawee.f.a r9 = (com.facebook.drawee.p940f.C13833a) r9
            if (r3 == 0) goto L_0x00ef
            r1 = 2131954883(0x7f130cc3, float:1.9546278E38)
            goto L_0x00f2
        L_0x00ef:
            r1 = 2131954884(0x7f130cc4, float:1.954628E38)
        L_0x00f2:
            r9.mo25902b(r1)
            java.util.List<com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView> r9 = r0.f103157b
            java.util.Iterator r9 = r9.iterator()
        L_0x00fb:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0117
            java.lang.Object r0 = r9.next()
            com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView r0 = (com.p683ss.android.ugc.aweme.base.p1420ui.AvatarWithBorderView) r0
            if (r3 == 0) goto L_0x010d
            r1 = 2131821731(0x7f1104a3, float:1.9276213E38)
            goto L_0x0110
        L_0x010d:
            r1 = 2131821732(0x7f1104a4, float:1.9276215E38)
        L_0x0110:
            r0.setBorderColor(r1)
            r0.setBorderWidth(r4)
            goto L_0x00fb
        L_0x0117:
            return
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24717t.mo50579a(com.ss.android.ugc.aweme.challenge.model.ChallengeDetail):void");
    }

    /* renamed from: a */
    public final void mo50578a(FrameLayout frameLayout, C24706l lVar) {
        C52711k.m112240b(frameLayout, "root");
        C52711k.m112240b(lVar, "headerParam");
        this.f65458b = frameLayout;
    }
}
