package com.p683ss.android.ugc.aweme.newfollow.p2001h;

import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.p621b.p622a.C10201a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p125a.C2667b;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.experiment.DongtaiStrategyExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.flowfeed.p1753b.C31753a;
import com.p683ss.android.ugc.aweme.flowfeed.p1757f.C31769a;
import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31781d;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.forward.p1775c.C32385a;
import com.p683ss.android.ugc.aweme.forward.p1777e.C32401a;
import com.p683ss.android.ugc.aweme.newfollow.p1995b.C37852b;
import com.p683ss.android.ugc.aweme.newfollow.p2000g.C37879b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.newfollow.h.g */
public class C37887g extends C31769a<C37882b, C37888h> {

    /* renamed from: o */
    public C37896n f96445o;

    /* renamed from: p */
    public String f96446p;

    /* renamed from: q */
    public String f96447q;

    /* renamed from: j */
    public final String mo51789j() {
        return this.f96446p;
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ Fragment mo64727q() {
        return this.f96445o;
    }

    /* renamed from: s */
    public final C37882b mo54803n() {
        return (C37882b) this.f70700f;
    }

    /* renamed from: t */
    private boolean m84636t() {
        if ("personal_homepage".equals(this.f96446p)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final void mo64726p() {
        if (this.f82969i == null) {
            this.f82969i = C31781d.m73923b().mo64674a(this.f96445o, hashCode(), this);
        }
        this.f82969i.mo51248h();
    }

    /* renamed from: b */
    public final void mo44838b() {
        super.mo44838b();
        boolean z = false;
        if (!m84636t()) {
            C2667b.m7667b("profile", "dongtai", 0);
        }
        if (this.f70700f != null && this.f70701g != null && ((C37888h) this.f70701g).isViewValid()) {
            int i = ((C37882b) this.f70700f).mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    C37888h hVar = (C37888h) this.f70701g;
                    List items = ((C37882b) this.f70700f).getItems();
                    if (((C37882b) this.f70700f).isHasMore() && !((C37882b) this.f70700f).isNewDataEmpty()) {
                        z = true;
                    }
                    hVar.mo64883b(items, z);
                }
            } else if (((C37882b) this.f70700f).isDataEmpty()) {
                ArrayList arrayList = new ArrayList();
                if (C10181b.m20511a().mo18168a(DongtaiStrategyExperiment.class, true, "dongtai_strategy", 31744, 0) != 1 || !m84636t()) {
                    ((C37888h) this.f70701g).mo64861a(3);
                    return;
                }
                FollowFeed followFeed = new FollowFeed();
                followFeed.setFeedType(65287);
                arrayList.add(0, followFeed);
                ((C37882b) this.f70700f).setItems(arrayList);
                ((C37888h) this.f70701g).mo64876a((List<D>) arrayList, ((C37882b) this.f70700f).isHasMore());
            } else {
                List items2 = ((C37882b) this.f70700f).getItems();
                if (C10181b.m20511a().mo18168a(DongtaiStrategyExperiment.class, true, "dongtai_strategy", 31744, 0) == 1 && m84636t()) {
                    FollowFeed followFeed2 = new FollowFeed();
                    followFeed2.setFeedType(65287);
                    items2.add(0, followFeed2);
                }
                ((C37888h) this.f70701g).mo64876a(items2, ((C37882b) this.f70700f).isHasMore());
            }
        }
    }

    C37887g(C37896n nVar) {
        this.f96445o = nVar;
    }

    /* renamed from: g */
    public final String mo60874g(boolean z) {
        return this.f96445o.f96471e;
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        super.mo44840c_(exc);
        if (!m84636t()) {
            C2667b.m7664a("profile", "dongtai", 0, C10201a.m20660a(C11010c.m22280a(), (Throwable) exc));
        }
    }

    /* renamed from: a */
    private boolean m84635a(User user) {
        if (m84636t() || TextUtils.equals(this.f96447q, C20902b.m53242a().getCurUserId()) || user == null || TextUtils.equals(this.f96447q, user.getUid())) {
            return false;
        }
        return true;
    }

    @C53771m
    public void onEvent(C32385a aVar) {
        String str;
        if (aVar != null) {
            if (aVar.f84279d == 1) {
                if (aVar.f84280e == hashCode()) {
                    String g = mo60874g(true);
                    Aweme aweme = aVar.f84278c;
                    String str2 = "list";
                    if (this.f82972l) {
                        str = "click_repost_button";
                    } else {
                        str = "click_comment";
                    }
                    C32401a.m74901a(g, aweme, str2, str, true);
                    if (this.f82969i != null) {
                        this.f82969i.mo51249j();
                    }
                }
                if (this.f96445o != null && this.f96445o.mo77336e()) {
                    ((C37888h) this.f70701g).mo64873a(aVar.f84277b, aVar.f84276a);
                }
            } else if (aVar.f84279d == 2) {
                ((C37888h) this.f70701g).mo64881b(aVar.f84277b);
            }
            this.f82973m = true;
        }
    }

    @C53771m
    public void onVideoEvent(C30332aw awVar) {
        if (this.f70701g != null && ((C37888h) this.f70701g).isViewValid()) {
            int i = awVar.f79228a;
            if (i != 2) {
                if (i == 13) {
                    ((C37888h) this.f70701g).mo64872a((String) awVar.f79229b);
                } else if (i != 15) {
                    if (i == 21 && (awVar.f79229b instanceof Aweme)) {
                        Aweme aweme = (Aweme) awVar.f79229b;
                        ((C37888h) this.f70701g).mo64866a(aweme, awVar.f79232e);
                        ((C37888h) this.f70701g).mo64867a(aweme, !awVar.f79238k, awVar.f79232e, awVar.f79233f);
                    }
                } else if (this.f96445o != null && this.f96445o.mo77336e()) {
                    ((C37888h) this.f70701g).mo77329b((Aweme) awVar.f79229b);
                }
            } else if (this.f96445o != null && this.f96445o.mo77336e()) {
                String str = (String) awVar.f79229b;
                if (!TextUtils.isEmpty(str)) {
                    ((C37888h) this.f70701g).mo64881b(str);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo64668b(View view, View view2, Aweme aweme, User user) {
        if (m84635a(user) && C37852b.m84506b(aweme, user, mo64728r(), mo60874g(true))) {
            C37879b.m84584b(aweme, mo60874g(true));
            C37879b.m84573a(aweme, user.getUid(), LeakCanaryFileProvider.f132049i, mo60874g(true), "list");
        }
    }

    /* renamed from: a */
    public final void mo64660a(View view, View view2, Aweme aweme, User user) {
        if (m84635a(user) && C37852b.m84503a(aweme, user, mo64728r(), mo60874g(true)) && !C31753a.m73740a(user)) {
            C37879b.m84584b(aweme, mo60874g(true));
            C37879b.m84573a(aweme, user.getUid(), "head", mo60874g(true), "list");
        }
    }
}
