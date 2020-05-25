package com.p683ss.android.ugc.aweme.notification.p2015e;

import com.p683ss.android.ugc.aweme.base.activity.C23452y;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31985b;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31988e;
import com.p683ss.android.ugc.aweme.friends.p1792ui.FansFollowUserBtn;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendSuggestedItemView;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendSuggestedItemView.C32671a;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2029f.C38383h;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.notification.e.b */
public final class C38180b extends C38383h {

    /* renamed from: d */
    public C23452y<User> f97244d;

    /* renamed from: e */
    public C31980a f97245e = new C31980a(this.f97247g, new C31988e(this) {

        /* renamed from: a */
        final /* synthetic */ C38180b f97248a;

        {
            this.f97248a = r1;
        }

        /* renamed from: a */
        public final void mo49741a(int i, User user) {
            C23452y<User> yVar = this.f97248a.f97244d;
            if (yVar != null) {
                yVar.mo48614a(C32671a.m75535e(), user, this.f97248a.getPosition(), this.f97248a.f97246f, null);
            }
        }
    });

    /* renamed from: f */
    public final RecommendSuggestedItemView f97246f;

    /* renamed from: g */
    private FansFollowUserBtn f97247g = this.f97246f.getMFollowUserBtn();

    /* renamed from: com.ss.android.ugc.aweme.notification.e.b$a */
    public static final class C38182a implements C31985b {

        /* renamed from: a */
        final /* synthetic */ C38180b f97249a;

        /* renamed from: b */
        final /* synthetic */ User f97250b;

        /* renamed from: a */
        public final void mo65178a(Exception exc) {
        }

        /* renamed from: a */
        public final void mo65177a(FollowStatus followStatus) {
            User user = this.f97250b;
            if (user != null) {
                if (followStatus != null) {
                    this.f97249a.f97246f.mo66238a(followStatus.followStatus);
                }
                this.f97249a.f97246f.mo66240b(user);
            }
        }

        public C38182a(C38180b bVar, User user) {
            this.f97249a = bVar;
            this.f97250b = user;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.e.b$b */
    public static final class C38183b extends C52712l implements C52682m<Integer, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C38180b f97251a;

        /* renamed from: b */
        final /* synthetic */ User f97252b;

        /* renamed from: c */
        final /* synthetic */ int f97253c;

        public C38183b(C38180b bVar, User user, int i) {
            this.f97251a = bVar;
            this.f97252b = user;
            this.f97253c = i;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            C52711k.m112240b((String) obj2, "extra");
            if (intValue == C32671a.m75532b()) {
                User user = this.f97252b;
                if (user != null) {
                    C31980a aVar = this.f97251a.f97245e;
                    if (aVar == null) {
                        C52711k.m112234a();
                    }
                    aVar.mo65174a(user.getUid(), user.getSecUid(), user.getFollowStatus(), user.getFollowerStatus());
                }
            } else {
                C23452y<User> yVar = this.f97251a.f97244d;
                if (yVar != null) {
                    yVar.mo48614a(intValue, this.f97252b, this.f97253c, this.f97251a.f97246f, null);
                }
            }
            return C52860x.f131107a;
        }
    }

    public C38180b(RecommendSuggestedItemView recommendSuggestedItemView) {
        C52711k.m112240b(recommendSuggestedItemView, "recommendView");
        super(recommendSuggestedItemView);
        this.f97246f = recommendSuggestedItemView;
    }
}
