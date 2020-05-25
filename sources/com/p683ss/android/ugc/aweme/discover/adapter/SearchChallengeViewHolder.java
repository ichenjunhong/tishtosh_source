package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.base.utils.C23710a;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.challenge.api.C24551b;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeToDetailParam;
import com.p683ss.android.ugc.aweme.commercialize.model.C26113ag;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26403au;
import com.p683ss.android.ugc.aweme.discover.abtest.ChallengeDialogAb;
import com.p683ss.android.ugc.aweme.discover.alading.C28037g;
import com.p683ss.android.ugc.aweme.discover.alading.C28038h;
import com.p683ss.android.ugc.aweme.discover.mob.C28381ab;
import com.p683ss.android.ugc.aweme.discover.mob.C28393ak;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d;
import com.p683ss.android.ugc.aweme.p1382aq.C23250t;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.search.C41405b;
import com.p683ss.android.ugc.aweme.search.performance.C41443a;
import com.p683ss.android.ugc.aweme.search.performance.C41457i;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchChallengeViewHolder */
public class SearchChallengeViewHolder extends C27849b {

    /* renamed from: c */
    C28038h f72942c;
    ViewStub cardViewStub;

    /* renamed from: d */
    public Challenge f72943d;

    /* renamed from: e */
    boolean f72944e;

    /* renamed from: f */
    public String f72945f;

    /* renamed from: g */
    public String f72946g;

    /* renamed from: h */
    C27772a f72947h;

    /* renamed from: i */
    public int f72948i = -1;

    /* renamed from: j */
    private C28037g f72949j;

    /* renamed from: k */
    private ViewGroup f72950k;

    /* renamed from: l */
    private String f72951l;
    public TextView mTvChallengeName;
    public TextView mTvPartCnt;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchChallengeViewHolder$a */
    public interface C27772a {
        /* renamed from: a */
        void mo56213a(Challenge challenge, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchChallengeViewHolder$b */
    protected static class C27773b implements OnAttachStateChangeListener, Runnable {

        /* renamed from: a */
        private final View f72954a;

        /* renamed from: b */
        private final String f72955b;

        /* renamed from: c */
        private C26113ag f72956c;

        /* renamed from: d */
        private boolean f72957d;

        /* renamed from: e */
        private boolean f72958e;

        public final void run() {
            if (this.f72957d) {
                if (this.f72956c != null) {
                    if (!C23729p.m58267b(this.f72954a)) {
                        this.f72958e = false;
                    } else if (!this.f72958e) {
                        this.f72958e = true;
                    }
                }
                this.f72954a.postDelayed(this, 500);
            }
        }

        public final void onViewAttachedToWindow(View view) {
            this.f72957d = true;
            this.f72958e = false;
            run();
        }

        public final void onViewDetachedFromWindow(View view) {
            this.f72957d = false;
            this.f72958e = false;
            this.f72954a.removeCallbacks(this);
        }

        /* renamed from: a */
        private void m66474a(C26113ag agVar) {
            if (this.f72956c != agVar) {
                if (agVar == null) {
                    this.f72956c = null;
                    return;
                }
                this.f72956c = agVar;
                this.f72958e = false;
                run();
            }
        }

        private C27773b(View view, String str) {
            this.f72954a = view;
            this.f72955b = str;
        }

        /* renamed from: a */
        public static void m66473a(View view, String str) {
            C27773b bVar = new C27773b(view, str);
            view.addOnAttachStateChangeListener(bVar);
            view.setTag(R.id.cix, bVar);
        }

        /* renamed from: a */
        public static void m66472a(View view, C26113ag agVar) {
            Object tag = view.getTag(R.id.cix);
            if (tag instanceof C27773b) {
                ((C27773b) tag).m66474a(agVar);
            }
        }
    }

    /* renamed from: d */
    public final View mo56209d() {
        return this.itemView;
    }

    /* renamed from: e */
    public final Map<String, String> mo56210e() {
        Map<String, String> e = super.mo56210e();
        e.put("token_type", "hot_challenge");
        e.put("hashtags_name", this.f72943d.getChallengeName());
        e.put("search_result_id", this.f72943d.getCid());
        e.put("is_aladdin", "1");
        return e;
    }

    /* renamed from: f */
    public final Map<String, String> mo56211f() {
        Map<String, String> f = super.mo56211f();
        f.put("token_type", "hot_challenge");
        f.put("hashtags_name", this.f72943d.getChallengeName());
        f.put("search_result_id", this.f72943d.getCid());
        f.put("search_result_id", this.f72943d.getCid());
        f.put("is_aladdin", "1");
        return f;
    }

    /* renamed from: a */
    public final void mo56208a(Map<String, String> map) {
        super.mo56208a(map);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo56206a(SearchChallenge searchChallenge) {
        if (searchChallenge.hasAwemeList()) {
            if (this.f72950k == null) {
                this.cardViewStub.setLayoutInflater(new C41443a(this.cardViewStub.getContext()));
                this.f72950k = (ViewGroup) this.cardViewStub.inflate();
                this.f72949j = new C28037g(this.f72950k);
            }
            if (this.f72950k != null) {
                if (this.f72942c == null) {
                    this.f72942c = C41405b.m91221a(this.f72949j, searchChallenge);
                }
                this.f72942c.mo56415a(searchChallenge);
                if (this.f72950k != null) {
                    this.f72950k.setVisibility(0);
                    this.f72950k.setPadding(0, (int) C9432q.m18687b(mo56271b(), 4.0f), 0, 0);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("token_type", "hot_challenge");
                if (searchChallenge != null) {
                    hashMap.put("search_result_id", searchChallenge.getChallenge().getCid());
                    hashMap.put("hashtags_name", searchChallenge.getChallenge().getChallengeName());
                    hashMap.put("rank", "0");
                }
                mo56208a((Map<String, String>) hashMap);
                this.f72944e = true;
                return;
            }
            return;
        }
        if (this.f72950k != null) {
            this.f72950k.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo56207a(SearchChallenge searchChallenge, String str) {
        if (searchChallenge != null) {
            this.f72945f = str;
            if (searchChallenge.getChallenge() != null) {
                this.f72943d = searchChallenge.getChallenge();
            }
            this.mTvPartCnt.setText(this.itemView.getContext().getString(R.string.zk, new Object[]{C33095b.m76068a(this.f72943d.getDisplayCount())}));
            this.mTvChallengeName.setText(C23710a.m58189a(this.mTvChallengeName.getContext(), this.f72943d.getChallengeName(), searchChallenge.getPosition()));
            C27773b.m66472a(this.itemView, searchChallenge.getAdData());
            mo56206a(searchChallenge);
        }
    }

    public SearchChallengeViewHolder(final View view, C27772a aVar, String str) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f72947h = aVar;
        this.f72951l = str;
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                String str;
                ClickInstrumentation.onClick(view);
                if (!C32800a.m75679a(view)) {
                    C26403au.m63862a(SearchChallengeViewHolder.this.f72943d);
                    int adapterPosition = SearchChallengeViewHolder.this.getAdapterPosition();
                    String uuid = UUID.randomUUID().toString();
                    if (SearchChallengeViewHolder.this.f72947h != null) {
                        SearchChallengeViewHolder.this.f72947h.mo56213a(SearchChallengeViewHolder.this.f72943d, adapterPosition);
                    } else if (SearchChallengeViewHolder.this.f73167b.f73038a) {
                        View view2 = view;
                        String b = SearchChallengeViewHolder.this.mo56269a().mo56235b();
                        String cid = SearchChallengeViewHolder.this.f72943d.getCid();
                        String a = C28393ak.m67382a(SearchChallengeViewHolder.this.f72945f);
                        int i = SearchChallengeViewHolder.this.f72948i;
                        C28381ab.m67350a(view2, cid, adapterPosition);
                        String a2 = C28381ab.f74518i.mo56813a(3);
                        C28393ak.m67385a(adapterPosition, b, a2, (C23231d) ((C23250t) ((C23250t) ((C23250t) new C23250t().mo47942a(true)).mo48154t(cid).mo48155u(uuid).mo48150f(C28393ak.m67381a(3)).mo47943b(String.valueOf(i))).mo47944b(false)).mo48156v(a2), 3, a);
                        C28393ak.m67390b(3, cid, b);
                    } else {
                        View view3 = view;
                        String b2 = SearchChallengeViewHolder.this.mo56269a().mo56235b();
                        String requestId = SearchChallengeViewHolder.this.f72943d.getRequestId();
                        String cid2 = SearchChallengeViewHolder.this.f72943d.getCid();
                        String a3 = C28393ak.m67382a(SearchChallengeViewHolder.this.f72945f);
                        C28381ab.m67350a(view3, cid2, adapterPosition);
                        C28393ak.m67385a(adapterPosition, b2, requestId, (C23231d) ((C23250t) ((C23250t) ((C23250t) new C23250t().mo47942a(true)).mo48154t(cid2).mo48155u(uuid).mo48150f(C28393ak.m67381a(2)).mo47943b(String.valueOf(adapterPosition))).mo47944b(false)).mo48156v(requestId), 2, a3);
                        C28393ak.m67390b(2, cid2, b2);
                    }
                    if (C10181b.m20511a().mo18168a(ChallengeDialogAb.class, true, "show_challenge_dialog_in_search", 31744, 0) == 1) {
                        ChallengeDetailParam challengeToParam = ChallengeToDetailParam.INSTANCE.challengeToParam(SearchChallengeViewHolder.this.f72943d);
                        challengeToParam.setCommerce(C26403au.m63866b(SearchChallengeViewHolder.this.f72943d));
                        challengeToParam.setEnterFrom(SearchChallengeViewHolder.this.f72946g);
                        challengeToParam.setProcessId(uuid);
                        C24551b.f65004a.startDialogStyleChallenge((FragmentActivity) C23729p.m58270d(view), challengeToParam);
                        return;
                    }
                    SmartRoute withParam = SmartRouter.buildRoute(view.getContext(), "//challenge/detail").withParam("id", SearchChallengeViewHolder.this.f72943d.getCid()).withParam("enter_from", SearchChallengeViewHolder.this.f72946g).withParam("process_id", uuid);
                    String str2 = "is_commerce";
                    if (C26403au.m63866b(SearchChallengeViewHolder.this.f72943d)) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    withParam.withParam(str2, str).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", SearchChallengeViewHolder.this.f72943d.getSubType()).open();
                    if (SearchChallengeViewHolder.this.f72944e) {
                        SearchChallengeViewHolder.this.mo56272b(SearchChallengeViewHolder.this.mo56211f());
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static SearchChallengeViewHolder m66464a(ViewGroup viewGroup, C27772a aVar, String str) {
        View a = C41457i.f105090b.mo84196a(viewGroup, R.layout.bsb);
        C27773b.m66473a(a, str);
        return new SearchChallengeViewHolder(a, aVar, str);
    }
}
