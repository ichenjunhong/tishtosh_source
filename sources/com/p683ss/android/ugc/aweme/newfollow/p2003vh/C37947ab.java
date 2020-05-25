package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p683ss.android.ugc.aweme.common.p1593e.C26872d;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31761a;
import com.p683ss.android.ugc.aweme.newfollow.p2000g.C37879b;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40438j.C40443b;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40448l;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.RecommendCommonUserView;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.RecommendCommonUserView.C40418a;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.ab */
public final class C37947ab extends C1352v implements C26872d<C40448l> {

    /* renamed from: a */
    public RecommendCommonUserView f96624a;

    /* renamed from: b */
    public String f96625b;

    /* renamed from: c */
    public String f96626c;

    /* renamed from: d */
    public String f96627d = "empty";

    /* renamed from: e */
    List<String> f96628e;

    /* renamed from: a */
    public final int mo77422a(User user) {
        if (user == null) {
            return 0;
        }
        Integer num = (Integer) this.f96624a.getPosInApiListMap().get(user.getUid());
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo50455a(C1352v vVar) {
        C40448l lVar = (C40448l) vVar;
        if (lVar != null) {
            User user = lVar.f103264d;
            if (user != null) {
                if (this.f96628e == null) {
                    this.f96628e = new ArrayList();
                }
                if (!this.f96628e.contains(user.getUid())) {
                    C37940g.m84832a().mo77415a(2, user.getUid());
                    C37879b.m84576a(user, "impression", mo77422a(user), this.f96626c);
                    this.f96628e.add(user.getUid());
                }
            }
        }
    }

    public C37947ab(RecommendCommonUserView recommendCommonUserView) {
        super(recommendCommonUserView);
        this.f96624a = recommendCommonUserView;
        C41589c.m91432a();
        C41589c.m91434f();
        this.f96624a.setLayoutParams(new LayoutParams(-1, (int) C9432q.m18687b(this.f96624a.getContext(), 300.0f)));
        View findViewById = this.f96624a.findViewById(R.id.caf);
        View findViewById2 = this.f96624a.findViewById(R.id.def);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) findViewById2.getLayoutParams();
        marginLayoutParams.topMargin = (int) C9432q.m18687b(this.f96624a.getContext(), 28.0f);
        findViewById2.setLayoutParams(marginLayoutParams);
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams2.bottomMargin = (int) C9432q.m18687b(this.f96624a.getContext(), 28.0f);
        findViewById.setLayoutParams(marginLayoutParams2);
        this.f96624a.setOnViewAttachedToWindowListener(this);
    }

    /* renamed from: a */
    public final void mo77423a(List<User> list, String str) {
        this.f96626c = str;
        this.f96624a.mo82704a(list, this.f96626c);
        this.f96624a.setOnItemOperationListener(new C40443b() {
            /* renamed from: b */
            public final void mo60646b(User user, int i) {
                C31761a aVar = new C31761a();
                aVar.f82954a = 1;
                aVar.f82955b = C37947ab.this.getAdapterPosition();
                C47718bf.m103288a(aVar);
            }

            /* renamed from: c */
            public final void mo60647c(User user, int i) {
                C37879b.m84576a(user, "follow", C37947ab.this.mo77422a(user), C37947ab.this.f96626c);
                C37879b.m84575a(user);
            }

            /* renamed from: d */
            public final void mo60648d(User user, int i) {
                C37879b.m84576a(user, "enter_profile", C37947ab.this.mo77422a(user), C37947ab.this.f96626c);
                C37879b.m84579a(C37947ab.this.f96626c, user);
            }

            /* renamed from: a */
            public final void mo60645a(User user, int i) {
                C31761a aVar = new C31761a();
                aVar.f82954a = 3;
                aVar.f82956c = user.getUid();
                C47718bf.m103288a(aVar);
                C37879b.m84576a(user, "delete", C37947ab.this.mo77422a(user), C37947ab.this.f96626c);
            }
        });
        this.f96624a.setOnLookMoreUserListener(new C40418a() {
            /* renamed from: a */
            public final void mo60649a(String str, boolean z) {
                String str2;
                Context context = C37947ab.this.f96624a.getContext();
                IBridgeService bridgeService_Monster = I18nBridgeService.getBridgeService_Monster();
                Context context2 = C37947ab.this.f96624a.getContext();
                if (TextUtils.equals("extra_follow_type_friend", C37947ab.this.f96625b)) {
                    str2 = "homepage_friends";
                } else {
                    str2 = "homepage_follow";
                }
                context.startActivity(bridgeService_Monster.getAddFriendsActivityIntent(context2, -1, 2, str, str2));
                C37879b.m84590c();
            }
        });
    }
}
