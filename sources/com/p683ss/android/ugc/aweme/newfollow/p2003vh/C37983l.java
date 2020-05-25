package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.content.Context;
import android.content.Intent;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C22835a;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1407a.C23457c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1593e.C26872d;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import com.p683ss.android.ugc.aweme.newfollow.p1996c.C37855b;
import com.p683ss.android.ugc.aweme.newfollow.p2000g.C37879b;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.RecommendUserActivity;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40438j.C40443b;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40448l;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.RecommendCommonUserView;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.RecommendCommonUserView.C40418a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39981o;
import com.p683ss.android.ugc.aweme.profile.presenter.C39993z;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.l */
public final class C37983l extends C1352v implements C26872d<C40448l>, C39981o {

    /* renamed from: a */
    public Context f96695a;

    /* renamed from: b */
    public DmtDefaultView f96696b;

    /* renamed from: c */
    public RecommendCommonUserView f96697c;

    /* renamed from: d */
    public C39993z f96698d;

    /* renamed from: e */
    public C37855b f96699e;

    /* renamed from: f */
    public String f96700f;

    /* renamed from: g */
    public String f96701g = "";

    /* renamed from: h */
    public boolean f96702h;

    /* renamed from: i */
    private List<String> f96703i;

    /* renamed from: b */
    public final void mo60638b(RecommendList recommendList) {
    }

    /* renamed from: a */
    public final int mo77450a(User user) {
        if (user != null) {
            return this.f96698d.mo81913a(user.getUid());
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo60635a(Exception exc) {
        if (exc instanceof C23457c) {
            this.f96697c.setVisibility(8);
        } else {
            C22971a.m56493a(this.f96695a, (Throwable) exc);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo50455a(C1352v vVar) {
        C40448l lVar = (C40448l) vVar;
        if (lVar != null) {
            User user = lVar.f103264d;
            if (user != null) {
                if (this.f96703i == null) {
                    this.f96703i = new ArrayList();
                }
                if (!this.f96703i.contains(user.getUid())) {
                    C37940g.m84832a().mo77415a(2, user.getUid());
                    C37879b.m84576a(user, "impression", mo77450a(user), this.f96700f);
                    this.f96703i.add(user.getUid());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo60634a(RecommendList recommendList) {
        if (recommendList == null || recommendList.getUserList() == null || recommendList.getUserList().size() < 3) {
            this.f96697c.setVisibility(8);
            return;
        }
        this.f96700f = recommendList.getRid();
        boolean z = true;
        this.f96697c.setPageType(1);
        RecommendCommonUserView recommendCommonUserView = this.f96697c;
        if (recommendList.getUserList().size() < 10) {
            z = false;
        }
        recommendCommonUserView.setShowLookMore(z);
        this.f96697c.mo82704a(recommendList.getUserList(), this.f96700f);
        this.f96697c.setOnItemOperationListener(new C40443b() {
            /* renamed from: b */
            public final void mo60646b(User user, int i) {
                C37983l.this.f96697c.post(new Runnable() {
                    public final void run() {
                        C37983l.this.f96697c.setVisibility(8);
                    }
                });
            }

            /* renamed from: a */
            public final void mo60645a(User user, int i) {
                C37879b.m84576a(user, "delete", C37983l.this.mo77450a(user), C37983l.this.f96700f);
                if (C37983l.this.f96698d != null) {
                    C37983l.this.f96698d.mo81921a(user);
                }
            }

            /* renamed from: c */
            public final void mo60647c(User user, int i) {
                C37879b.m84576a(user, "follow", C37983l.this.mo77450a(user), C37983l.this.f96700f);
                C37879b.m84575a(user);
            }

            /* renamed from: d */
            public final void mo60648d(User user, int i) {
                C37879b.m84576a(user, "enter_profile", C37983l.this.mo77450a(user), C37983l.this.f96700f);
                C37879b.m84579a(C37983l.this.f96700f, user);
            }
        });
        this.f96697c.setOnLookMoreUserListener(new C40418a() {
            /* renamed from: a */
            public final void mo60649a(String str, boolean z) {
                Context context = C37983l.this.f96695a;
                String curUserId = C20902b.m53242a().getCurUserId();
                String str2 = "homepage_follow";
                Intent intent = new Intent(context, RecommendUserActivity.class);
                intent.putExtra("uid", curUserId);
                intent.putExtra(C22835a.f61196a, "");
                intent.putExtra("type", 2);
                intent.putExtra("enter_from", "");
                intent.putExtra("extra_previous_page", str2);
                intent.putExtra("request_id", str);
                context.startActivity(intent);
                C26890h.m65011a("enter_find_friends_list", C23089d.m56640a().mo47829a("enter_from", str2).f61491a);
                C37879b.m84590c();
            }
        });
        this.f96697c.setVisibility(0);
    }

    public C37983l(View view, Context context, String str) {
        super(view);
        this.f96701g = str;
        this.f96695a = context;
        this.f96696b = (DmtDefaultView) view.findViewById(R.id.a3z);
        this.f96697c = (RecommendCommonUserView) view.findViewById(R.id.drl);
        this.f96697c.setBackgroundResource(R.color.arz);
        this.f96697c.setOnViewAttachedToWindowListener(this);
    }
}
