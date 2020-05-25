package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.search.AbsSearchAdView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import com.p683ss.android.ugc.aweme.discover.adapter.C27881bm;
import com.p683ss.android.ugc.aweme.discover.mixfeed.p1656c.C28313b;
import com.p683ss.android.ugc.aweme.discover.mob.C28372a;
import com.p683ss.android.ugc.aweme.discover.mob.C28381ab;
import com.p683ss.android.ugc.aweme.discover.mob.C28393ak;
import com.p683ss.android.ugc.aweme.discover.model.SearchMixUserData;
import com.p683ss.android.ugc.aweme.discover.model.SearchUser;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28590bp.C28592a;
import com.p683ss.android.ugc.aweme.following.p1770ui.adapter.C32112c;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.p1382aq.C23253w;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchMixUserCell */
public class SearchMixUserCell extends C28590bp<SearchMixUserData> implements C0183j {

    /* renamed from: h */
    public C41440e f74825h;

    /* renamed from: i */
    RecyclerView f74826i;

    /* renamed from: j */
    SearchMixUserData f74827j;

    /* renamed from: k */
    public int f74828k;

    /* renamed from: l */
    private final ViewGroup f74829l;

    /* renamed from: m */
    private final LinearLayout f74830m;

    /* renamed from: n */
    private final C28456a f74831n;

    /* renamed from: o */
    private C27881bm f74832o;

    /* renamed from: p */
    private View f74833p;

    /* renamed from: q */
    private AbsSearchAdView f74834q;

    /* renamed from: r */
    private ViewStub f74835r;

    /* renamed from: s */
    private View f74836s;

    /* renamed from: t */
    private View f74837t;

    /* renamed from: u */
    private boolean f74838u;

    /* renamed from: v */
    private C28313b f74839v;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchMixUserCell$a */
    class C28456a implements C32112c {
        private C28456a() {
        }

        /* renamed from: a */
        public final boolean mo56498a(User user) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            boolean a = SearchMixUserCell.this.mo58113a(user);
            if (a) {
                str = "aladdin_card";
            } else {
                str = "follow_button";
            }
            if (SearchMixUserCell.this.f74825h == null) {
                str2 = "";
            } else {
                str2 = SearchMixUserCell.this.f74825h.getKeyword();
            }
            if (SearchMixUserCell.this.mo58117c()) {
                str3 = "homepage_fresh_search";
            } else {
                str3 = "general_search";
            }
            MobClick obtain = MobClick.obtain();
            if (user.getFollowStatus() == 0) {
                str4 = "follow";
            } else {
                str4 = "follow_cancel";
            }
            C26890h.onEvent(obtain.setEventName(str4).setLabelName(str3).setValue(user.getUid()));
            if (user.getFollowStatus() == 0) {
                str5 = "follow";
            } else {
                str5 = "follow_cancel";
            }
            C23253w s = new C23253w(str5).mo48161b(str3).mo48163c(str).mo48165e("follow_button").mo48164d(str3).mo48166f(user.getUid()).mo48170t(String.valueOf(SearchMixUserCell.this.f74828k)).mo48169s(user.getRequestId());
            if (SearchMixUserCell.this.mo58117c()) {
                s.f62125O = str2;
            }
            s.mo48076e();
            SearchMixUserCell.this.mo58114b();
            if (a) {
                C28372a.m67321a("follow", user.getUid(), SearchMixUserCell.this.f75104b);
            }
            return true;
        }

        /* renamed from: a */
        public final void mo56497a(User user, int i) {
            String str;
            int i2;
            String a;
            String str2;
            boolean a2 = SearchMixUserCell.this.mo58113a(user);
            if (SearchMixUserCell.this.f74825h == null) {
                str = "";
            } else {
                str = SearchMixUserCell.this.f74825h.getKeyword();
            }
            if (SearchMixUserCell.this.mo58117c()) {
                i2 = C41440e.FROM_NEARBY;
            } else {
                i2 = 3;
            }
            View view = SearchMixUserCell.this.f75104b;
            String requestId = user.getRequestId();
            String uid = user.getUid();
            if (a2) {
                a = "aladdin_card";
            } else {
                a = C28393ak.m67382a(str);
            }
            String str3 = a;
            int i3 = SearchMixUserCell.this.f74828k;
            C28381ab.m67350a(view, uid, i3);
            int i4 = 0;
            C28393ak.m67385a(i, str, requestId, (C23231d) ((C23249s) ((C23249s) ((C23249s) new C23249s().mo47942a(true)).mo48137c(C28393ak.m67381a(i2)).mo48145t(requestId).mo47944b(false)).mo47943b(String.valueOf(i3))).mo48144s(uid), i2, str3);
            C28393ak.m67384a(i2, requestId, uid);
            SmartRoute withParam = SmartRouter.buildRoute(SearchMixUserCell.this.f75103a, "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "general_search").withParam("enter_from_request_id", user.getRequestId()).withParam("extra_previous_page_position", "main_head");
            String str4 = "enter_method";
            if (a2) {
                str2 = "aladdin_card";
            } else {
                str2 = C28393ak.m67382a(str);
            }
            SmartRoute withParam2 = withParam.withParam(str4, str2);
            String str5 = "general_search_card_type";
            SearchMixUserCell searchMixUserCell = SearchMixUserCell.this;
            String uid2 = user.getUid();
            if (searchMixUserCell.f74827j != null && searchMixUserCell.f74827j.users != null) {
                Iterator it = searchMixUserCell.f74827j.users.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SearchUser searchUser = (SearchUser) it.next();
                    if (TextUtils.equals(searchUser.user.getUid(), uid2)) {
                        i4 = searchUser.cardType();
                        break;
                    }
                }
            }
            withParam2.withParam(str5, i4).open();
            if (a2) {
                C28372a.m67321a("user_information", user.getUid(), SearchMixUserCell.this.f75104b);
            }
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        C47718bf.m103291d(this);
    }

    /* renamed from: c */
    public final boolean mo58117c() {
        if (this.f74825h == null || this.f74825h.getSearchFrom() != C41440e.FROM_NEARBY) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo58114b() {
        if (this.f74827j != null && this.f74827j.f74687ad != null) {
            if (this.f74827j.f74687ad.adType == 3 || this.f74827j.f74687ad.adType == 4) {
                C26077e.m63190a().mo53582a("result_ad").mo53593b("follow").mo53602g("follow_button").mo53604i(this.f74827j.f74687ad.logExtra).mo53580a(Long.valueOf(this.f74827j.f74687ad.f68945id)).mo53586a(this.f75103a);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo58115b(View view) {
        this.f75109g.mo56765a();
    }

    /* renamed from: a */
    private void m67564a(int i) {
        if (this.f74837t != null) {
            this.f74837t.setVisibility(i);
        }
    }

    /* renamed from: c */
    private void m67566c(int i) {
        LayoutParams layoutParams = this.f74836s.getLayoutParams();
        layoutParams.height = i;
        this.f74836s.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public final void mo58116b(boolean z) {
        this.f74838u = z;
        if (z) {
            this.f75106d.setText(R.string.hvw);
        }
    }

    /* renamed from: b */
    private void m67565b(int i) {
        if (this.f74838u) {
            LayoutParams layoutParams = this.f74833p.getLayoutParams();
            layoutParams.height = i;
            this.f74833p.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final boolean mo58113a(User user) {
        if (this.f74827j.users != null) {
            for (SearchUser searchUser : this.f74827j.users) {
                if (searchUser.isAladdin() && searchUser.user.getUid().contains(user.getUid())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo58112a(SearchMixUserData searchMixUserData, C41440e eVar, boolean z) {
        float f;
        List<SearchUser> list;
        this.f74827j = searchMixUserData;
        if (!C9376b.m18558a((Collection<T>) this.f74827j.users)) {
            this.f74825h = eVar;
            this.f74832o.f73082e = new C27797ad(true, this.f74825h);
            this.f74832o.f73083f = eVar.getKeyword();
            this.f74832o.f73246h = searchMixUserData.f74687ad;
            this.f74832o.mo54798c(false);
            if (searchMixUserData.hasTopUser) {
                this.f74832o.mo50303a(Collections.singletonList((SearchUser) searchMixUserData.users.get(0)));
                this.f75107e.setVisibility(8);
                List<SearchUser> list2 = searchMixUserData.users;
                if (!(this.f74829l == null || this.f74830m == null)) {
                    if (list2 == null || list2.size() <= 1) {
                        this.f74829l.setVisibility(8);
                    } else {
                        if (list2.size() > 6) {
                            list = list2.subList(1, 7);
                        } else {
                            list = list2.subList(1, list2.size());
                        }
                        this.f74830m.removeAllViews();
                        for (SearchUser searchUser : list) {
                            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f75103a).inflate(R.layout.bta, this.f74830m, false);
                            C23515d.m57669a((RemoteImageView) (AvatarImageView) viewGroup.findViewById(R.id.i_), searchUser.user.getAvatarThumb());
                            this.f74830m.addView(viewGroup);
                        }
                        LayoutInflater.from(this.f75103a).inflate(R.layout.btb, this.f74830m, true);
                        this.f74829l.setOnClickListener(new OnClickListener() {
                            public final void onClick(View view) {
                                ClickInstrumentation.onClick(view);
                                SearchMixUserCell.this.f75109g.mo56765a();
                            }
                        });
                    }
                }
            } else {
                this.f74832o.mo50303a(searchMixUserData.users);
                if (this.f74829l != null) {
                    this.f74829l.setVisibility(8);
                }
                mo58284a(z);
            }
            boolean z2 = searchMixUserData.hasTopUser;
            if (!this.f74838u) {
                View view = this.f74837t;
                float f2 = 8.0f;
                if (this.f74828k == 0) {
                    f = 0.0f;
                } else {
                    f = 8.0f;
                }
                C9432q.m18677a(view, f);
                View view2 = this.f74833p;
                if (z2) {
                    f2 = 0.0f;
                }
                C9432q.m18677a(view2, f2);
            }
            this.f75105c.setVisibility(0);
            this.f74833p.setVisibility(0);
            this.f74836s.setVisibility(8);
            m67564a(0);
            m67565b(0);
            if (searchMixUserData.f74687ad != null) {
                if (searchMixUserData.f74687ad.adType == -1 || searchMixUserData.f74687ad.adType == 0 || searchMixUserData.f74687ad.adType == 1 || searchMixUserData.f74687ad.adType == 2) {
                    if (this.f74834q == null) {
                        this.f74834q = (AbsSearchAdView) this.f74835r.inflate();
                    } else {
                        this.f74834q.setVisibility(0);
                    }
                    this.f74834q.setup(searchMixUserData.f74687ad);
                    if (searchMixUserData.f74687ad.adType == 1) {
                        this.f74833p.setVisibility(8);
                    } else if (this.f74829l == null || this.f74829l.getVisibility() == 8) {
                        this.f74834q.mo53833a();
                        this.f74833p.setVisibility(8);
                    } else {
                        this.f74834q.mo53834b();
                    }
                } else {
                    if (this.f74834q != null) {
                        this.f74834q.setVisibility(8);
                    }
                    if (searchMixUserData.f74687ad.adType == 3) {
                        this.f75105c.setVisibility(8);
                        m67566c((int) C9432q.m18687b(C11010c.m22280a(), 14.0f));
                        this.f74836s.setVisibility(0);
                        m67564a(8);
                        m67565b(1);
                    } else if (searchMixUserData.f74687ad.adType == 4) {
                        m67566c((int) C9432q.m18687b(C11010c.m22280a(), 10.0f));
                        this.f74836s.setVisibility(0);
                        this.f74833p.setVisibility(8);
                    }
                }
            } else if (this.f74834q != null) {
                this.f74834q.setVisibility(8);
            }
        }
    }

    public SearchMixUserCell(View view, Context context, C28592a aVar, C28313b bVar) {
        super(view, context, aVar);
        this.f75105c.setText(R.string.f9l);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.cjl);
        if (viewGroup != null) {
            this.f74829l = viewGroup;
        } else {
            this.f74829l = (ViewGroup) view.findViewById(R.id.cjj);
            this.f74829l.setOnClickListener(new C28603bx(this));
        }
        this.f74830m = (LinearLayout) view.findViewById(R.id.cjk);
        this.f74833p = view.findViewById(R.id.ax6);
        this.f74836s = view.findViewById(R.id.dx3);
        this.f74837t = view.findViewById(R.id.d33);
        this.f74835r = (ViewStub) view.findViewById(R.id.ci7);
        ViewStub viewStub = this.f74835r;
        C25945k.m62909a().getSearchCommercializeService();
        viewStub.setLayoutResource(R.layout.a6x);
        this.f74831n = new C28456a();
        this.f74826i = new RecyclerView(this.f75103a);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this.f75103a);
        wrapLinearLayoutManager.mo4731b(1);
        this.f74826i.setLayoutManager(wrapLinearLayoutManager);
        if (this.f74826i.getItemAnimator() != null) {
            this.f74826i.getItemAnimator().f4731l = 0;
        }
        this.f74826i.setNestedScrollingEnabled(false);
        this.f75108f.addView(this.f74826i);
        this.f74839v = bVar;
        this.f74832o = new C27881bm(this.f74831n);
        this.f74826i.setAdapter(this.f74832o);
    }
}
