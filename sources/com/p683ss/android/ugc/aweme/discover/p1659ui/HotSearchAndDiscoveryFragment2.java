package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0732g;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.router.SmartRouter;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1574a.C26003b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.C27936b;
import com.p683ss.android.ugc.aweme.discover.C27937c;
import com.p683ss.android.ugc.aweme.discover.abtest.SearchCarouselExperiment;
import com.p683ss.android.ugc.aweme.discover.helper.C28189b;
import com.p683ss.android.ugc.aweme.discover.helper.C28202j;
import com.p683ss.android.ugc.aweme.discover.model.AdDefaultSearchStruct;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel.HotSearchListObserver;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel.IHotSearchListListener;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel.SearchObserver;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel.SearchStateListener;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27721d;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28096d;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28105m;
import com.p683ss.android.ugc.aweme.discover.p1659ui.HotSearchWordsFlipperView.C28446a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.SearchScanView.C28457a;
import com.p683ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30314af;
import com.p683ss.android.ugc.aweme.main.C36663h;
import com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p683ss.android.ugc.aweme.search.C41429i;
import com.p683ss.android.ugc.aweme.search.C41431k;
import com.p683ss.android.ugc.aweme.search.model.C41434a;
import com.p683ss.android.ugc.aweme.search.model.C41437b;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.search.p2127g.C41425a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47863eu;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C53771m;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.HotSearchAndDiscoveryFragment2 */
public class HotSearchAndDiscoveryFragment2 extends C28527b {

    /* renamed from: w */
    static long f74757w;

    /* renamed from: A */
    private C28189b f74758A;

    /* renamed from: B */
    private String f74759B;

    /* renamed from: C */
    private String f74760C;

    /* renamed from: D */
    private BroadcastReceiver f74761D;

    /* renamed from: E */
    private SearchEnterViewModel f74762E;

    /* renamed from: F */
    private boolean f74763F;

    /* renamed from: G */
    private Context f74764G;
    LoftNestedRefreshLayout loftNestedRefreshLayout;
    ViewGroup mFragmentContainer;
    HotSearchWordsFlipperView mHotSearchFlipperView;
    ImageView mRightBackBtn;
    View mRightSearchView;
    View mSearchContainer;
    SearchScanView mSearchScanView;
    SearchScanView mSearchScanViewRight;
    ViewGroup mTopStatus;

    /* renamed from: r */
    C27721d f74765r;

    /* renamed from: s */
    protected long f74766s = -1;

    /* renamed from: t */
    public boolean f74767t;

    /* renamed from: u */
    public boolean f74768u;

    /* renamed from: v */
    public boolean f74769v;

    /* renamed from: x */
    public boolean f74770x;

    /* renamed from: y */
    public LogPbBean f74771y;

    /* renamed from: z */
    public C28446a f74772z;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo58051a() {
        return R.layout.b9i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo58060e() {
        return 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final String mo58063k() {
        return "discovery";
    }

    /* renamed from: t */
    private boolean m67510t() {
        if (!this.f74769v) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo58062g() {
        KeyboardUtils.m58184c(this.f74969b);
        m67512v();
    }

    public Context getContext() {
        if (this.f74764G != null) {
            return this.f74764G;
        }
        return super.getContext();
    }

    public void onPause() {
        super.onPause();
        this.f29769b_ = false;
        if (this.f74767t) {
            m67513w();
        }
        this.f74768u = false;
    }

    /* renamed from: u */
    private void m67511u() {
        if (C41429i.m91249i()) {
            this.f74976m.mo58511a(SearchEnterViewModel.m68266b(getActivity()));
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        C0732g.m2130a(getContext()).mo2402a(this.f74761D);
    }

    /* renamed from: s */
    public final void mo58067s() {
        if (getUserVisibleHint() && !C47863eu.m103535a() && this.f74767t && this.f74765r != null) {
            this.f74765r.aL_();
        }
    }

    /* renamed from: v */
    private void m67512v() {
        if (!mo58066r()) {
            if (getActivity() instanceof C36663h) {
                ((C36663h) getActivity()).onKeyBack();
            } else {
                getActivity().onBackPressed();
            }
        }
    }

    /* renamed from: w */
    private void m67513w() {
        if (this.f74766s > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f74766s;
            if (currentTimeMillis > 0) {
                C0013i.m18a((Callable<TResult>) new C28475ad<TResult>(currentTimeMillis), (Executor) C26890h.m65003a());
            }
            this.f74766s = -1;
        }
    }

    /* renamed from: x */
    private void m67514x() {
        this.f74758A.mo56600b();
        mo58058c(1);
        this.f74969b.setText("");
        this.f74969b.setCursorVisible(false);
        mo58202b(false);
        this.f74765r.mo56150b(mo58207p());
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo58064m() {
        if (mo58207p() == 1) {
            this.f74758A.mo56596a();
        }
        this.f74974k.mo58101a(false, false);
        mo58058c(3);
        this.f74765r.mo56150b(mo58207p());
        this.f74765r.onHiddenChanged(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo58061f() {
        mo58058c(1);
        C0679r a = getChildFragmentManager().mo2225a();
        this.f74765r = C27937c.f73358a.getDiscoverFragment();
        this.loftNestedRefreshLayout.mo53373a((C26003b) new C26003b() {
            /* renamed from: b */
            public final void mo53404b() {
            }

            /* renamed from: d */
            public final void mo53406d() {
            }

            /* renamed from: a */
            public final void mo53403a() {
                if (HotSearchAndDiscoveryFragment2.this.mTopStatus != null) {
                    HotSearchAndDiscoveryFragment2.this.mTopStatus.animate().alpha(0.0f).setDuration(200).setInterpolator(new LinearInterpolator()).withEndAction(new C28476ae(this)).start();
                }
                if (HotSearchAndDiscoveryFragment2.this.f74968a != null) {
                    HotSearchAndDiscoveryFragment2.this.f74968a.animate().alpha(0.0f).setDuration(200).setInterpolator(new LinearInterpolator()).withEndAction(new C28477af(this)).start();
                }
            }

            /* renamed from: c */
            public final void mo53405c() {
                if (!(HotSearchAndDiscoveryFragment2.this.mTopStatus == null || HotSearchAndDiscoveryFragment2.this.mTopStatus.getVisibility() == 0 || HotSearchAndDiscoveryFragment2.this.mTopStatus == null)) {
                    HotSearchAndDiscoveryFragment2.this.mTopStatus.animate().alpha(1.0f).setDuration(200).setInterpolator(new LinearInterpolator()).withStartAction(new C28478ag(this)).start();
                }
                if (HotSearchAndDiscoveryFragment2.this.f74968a != null && HotSearchAndDiscoveryFragment2.this.f74968a.getVisibility() != 0) {
                    HotSearchAndDiscoveryFragment2.this.f74968a.animate().alpha(1.0f).setDuration(200).setInterpolator(new LinearInterpolator()).withStartAction(new C28479ah(this)).start();
                }
            }
        });
        this.f74765r.mo53409a(this.loftNestedRefreshLayout);
        this.f74765r.mo56150b(mo58207p());
        a.mo2191b(R.id.ajf, (Fragment) this.f74765r);
        a.mo2195c();
        this.f74765r.mo56148a(false);
    }

    public void onResume() {
        super.onResume();
        if (this.f74767t) {
            this.f74766s = System.currentTimeMillis();
        }
        if (this.f74763F) {
            this.f74763F = false;
            m67514x();
        }
        if (getUserVisibleHint() && !C47863eu.m103535a() && this.f74767t) {
            String charSequence = this.f74969b.getHint().toString();
            if (!TextUtils.isEmpty(charSequence) && !TextUtils.equals(charSequence, mo58175h()) && this.f74771y != null) {
                C26890h.m65011a("search_default", C23089d.m56640a().mo47829a("action_type", "show").mo47829a("search_keyword", charSequence).mo47829a("log_pb", new C17971f().mo34889b(this.f74771y)).f61491a);
            }
            this.f74768u = true;
        }
        if (mo58207p() == 1) {
            m67511u();
        }
    }

    /* renamed from: r */
    public final boolean mo58066r() {
        if (!isViewValid()) {
            return false;
        }
        if (this.f74969b != null) {
            this.f74969b.setText("");
            this.f74969b.setCursorVisible(false);
            this.f74969b.clearFocus();
        }
        if (mo58207p() == 1) {
            return false;
        }
        if (this.f74758A != null) {
            this.f74758A.mo56600b();
        }
        mo58058c(1);
        mo58202b(true);
        this.f74765r.mo56150b(mo58207p());
        this.f74765r.onHiddenChanged(false);
        m67511u();
        C47718bf.m103288a(new C28096d(false));
        return true;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f74764G = context;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo58059c(View view) {
        KeyboardUtils.m58184c(this.f74974k);
        m67512v();
    }

    /* renamed from: c */
    public final void mo58058c(int i) {
        super.mo58058c(i);
        if (SearchStateViewModel.isSearchIntermediate(i)) {
            C47718bf.m103288a(new C30314af(8));
        } else {
            C47718bf.m103288a(new C30314af(0));
        }
    }

    @C53771m
    public void onSearchResultOpenedEvent(C28105m mVar) {
        if (mo58207p() != 1 && isViewValid()) {
            m67514x();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58052a(Bundle bundle) {
        if (bundle != null) {
            this.f74769v = bundle.getBoolean("i18n_tab_mode", false);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                this.f74762E = SearchEnterViewModel.m68265a(activity);
                this.f74762E.mo58512a(bundle);
                if (this.f74762E.f75785a == null) {
                    this.f74762E.f75785a = new C41434a();
                }
                this.f74762E.f75785a.setEnterSearchFrom("discovery");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58053a(View view) {
        if (!C47915gg.m103651b() && this.f74969b != null) {
            if (mo58207p() == 1) {
                C26890h.m65011a("enter_search", C23089d.m56640a().mo47829a("enter_from", "discovery").f61491a);
                C47718bf.m103288a(new C28096d(true));
            }
            this.f74969b.setCursorVisible(true);
            KeyboardUtils.m58183b(this.f74969b);
            if (TextUtils.isEmpty(this.f74969b.getText().toString())) {
                mo58064m();
            } else {
                mo58204n();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo58055b(C41440e eVar) {
        if (!C41425a.m91244a(eVar.getKeyword()) && getContext() != null && getActivity() != null) {
            Aweme a = AwemeChangeCallBack.m82601a(getActivity());
            String str = "";
            String str2 = "";
            if (a != null) {
                str = a.getAid();
                str2 = a.getAuthorUid();
            }
            C41431k.f105004a.launchSearchPage(new C41437b(getActivity(), eVar, C41434a.newBuilder().mo84113a(mo58063k()).mo84115b(str).mo84116c(str2).mo84114a()));
        }
    }

    public void setUserVisibleHint(boolean z) {
        boolean z2;
        super.setUserVisibleHint(z);
        boolean z3 = true;
        boolean z4 = !z;
        if (!(getActivity() == null || this.f74765r == null || mo58207p() != 1)) {
            this.f74765r.mo56148a(z4);
        }
        if (this.f74975l != null) {
            C0198r<Boolean> rVar = this.f74975l.isVisibleToUser;
            if (!z4) {
                z2 = true;
            } else {
                z2 = false;
            }
            rVar.setValue(Boolean.valueOf(z2));
        }
        if (z4) {
            z3 = false;
        }
        this.f74767t = z3;
        if (this.f74767t) {
            this.f74766s = System.currentTimeMillis();
            if (isViewValid()) {
                m67511u();
            }
        } else {
            m67513w();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo58056b(String str) {
        String str2;
        C28446a aVar;
        String str3;
        boolean z = true;
        if (TextUtils.isEmpty(str) && (mo58207p() == 1 || SearchStateViewModel.isSearchIntermediate(mo58207p()))) {
            str2 = this.f74969b.getHint().toString();
            if (!TextUtils.isEmpty(str2) && !mo58200a(str2)) {
                if (C41429i.m91249i()) {
                    if (this.f74980q == null) {
                        str3 = "";
                    } else {
                        str3 = this.f74980q.getId();
                    }
                    C26890h.m65011a("trending_words_click", C23089d.m56640a().mo47826a("words_position", 0).mo47829a("words_source", "recom_search").mo47829a("words_content", str2).mo47829a("group_id", str3).f61491a);
                } else {
                    C26890h.m65011a("hot_search_keyword", C23089d.m56640a().mo47829a("action_type", "click").mo47829a("key_word", str2).mo47829a("key_word_type", "general_word").mo47829a("enter_from", "default_search_keyword").f61491a);
                }
                aVar = this.f74772z;
                if (aVar != null && aVar.mo58080a() == 2) {
                    AwemeRawAd adData = aVar.f74785b.getAdData();
                    C27936b.m66691a(adData.getClickTrackUrlList(), adData.getCreativeId().longValue(), adData.getLogExtra());
                    C26077e.m63190a().mo53582a("result_ad").mo53593b("hot_search_keyword_click").mo53602g("default_search_keyword").mo53604i(aVar.f74785b.getAdData().getLogExtra()).mo53580a(aVar.f74785b.getAdData().getCreativeId()).mo53586a(getContext());
                }
                String str4 = null;
                if (z && !C41429i.m91249i()) {
                    str4 = this.f74977n;
                }
                super.mo58197a(str2, str4, z);
            }
        }
        str2 = str;
        z = false;
        aVar = this.f74772z;
        AwemeRawAd adData2 = aVar.f74785b.getAdData();
        C27936b.m66691a(adData2.getClickTrackUrlList(), adData2.getCreativeId().longValue(), adData2.getLogExtra());
        C26077e.m63190a().mo53582a("result_ad").mo53593b("hot_search_keyword_click").mo53602g("default_search_keyword").mo53604i(aVar.f74785b.getAdData().getLogExtra()).mo53580a(aVar.f74785b.getAdData().getCreativeId()).mo53586a(getContext());
        String str42 = null;
        str42 = this.f74977n;
        super.mo58197a(str2, str42, z);
    }

    /* renamed from: a */
    private void m67509a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            mo58197a(str, str2, true);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f74761D = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && HotSearchAndDiscoveryFragment2.this.getUserVisibleHint() && HotSearchAndDiscoveryFragment2.this.f29769b_ && !HotSearchAndDiscoveryFragment2.this.f74768u && HotSearchAndDiscoveryFragment2.this.f74767t) {
                    String charSequence = HotSearchAndDiscoveryFragment2.this.f74969b.getHint().toString();
                    if (!TextUtils.isEmpty(charSequence) && !TextUtils.equals(charSequence, HotSearchAndDiscoveryFragment2.this.mo58175h()) && HotSearchAndDiscoveryFragment2.this.f74771y != null) {
                        C26890h.m65011a("search_default", C23089d.m56640a().mo47829a("action_type", "show").mo47829a("search_keyword", charSequence).mo47829a("log_pb", new C17971f().mo34889b(HotSearchAndDiscoveryFragment2.this.f74771y)).f61491a);
                    }
                    HotSearchAndDiscoveryFragment2.this.f74768u = true;
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        C0732g.m2130a(getContext()).mo2403a(this.f74761D, intentFilter);
        m67509a(this.f74760C, this.f74759B);
        this.f74976m.f75770b.mo48247a(this, this, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo58057b(String str, String str2, LogPbBean logPbBean) {
        this.f74771y = logPbBean;
        mo58054a(str, str2, logPbBean);
    }

    /* renamed from: a */
    public final void mo58054a(String str, String str2, LogPbBean logPbBean) {
        if (!C41429i.m91249i() && getActivity() != null && !getActivity().isFinishing() && mo58207p() == 1 && !TextUtils.isEmpty(str) && !TextUtils.equals(str, mo58175h()) && !TextUtils.equals(this.f74969b.getHint().toString(), str)) {
            C26890h.m65011a("search_default", C23089d.m56640a().mo47829a("action_type", "show").mo47829a("search_keyword", str).mo47829a("log_pb", new C17971f().mo34889b(logPbBean)).f61491a);
            this.f74969b.setHint(str);
            this.f74977n = str2;
            this.f74772z = null;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SearchScanView searchScanView;
        ImageView imageView;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.f74769v) {
            this.mSearchScanView.setVisibility(8);
            this.mSearchScanViewRight.setVisibility(0);
            this.mSearchScanViewRight.mo58121a();
        } else {
            this.mSearchScanViewRight.setVisibility(8);
            this.mSearchScanView.setVisibility(0);
            this.mSearchScanView.mo58121a();
        }
        C284412 r2 = new C28457a() {
            /* renamed from: a */
            public final void mo58069a(View view) {
                HotSearchAndDiscoveryFragment2.this.mo58055b(new C41440e().setEnterFrom("normal_search").setSearchFrom(0));
            }

            /* renamed from: b */
            public final void mo58070b(View view) {
                C26890h.m65011a("qr_code_scan_enter", C23089d.m56640a().mo47829a("enter_from", "discovery").f61491a);
                Context context = HotSearchAndDiscoveryFragment2.this.getContext();
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - HotSearchAndDiscoveryFragment2.f74757w >= 1000) {
                    HotSearchAndDiscoveryFragment2.f74757w = currentTimeMillis;
                    SmartRouter.buildRoute(context, "//aweme/scan").withParam("finishAfterScan", false).open();
                }
            }
        };
        this.mSearchScanView.setOnInternalClickListener(r2);
        this.mSearchScanViewRight.setOnInternalClickListener(r2);
        if (C10181b.m20511a().mo18168a(SearchCarouselExperiment.class, true, "search_carousel", 31744, 0) != 1) {
            this.f74975l.hotSearchLiveData.observe(this, new HotSearchListObserver().setListener(new C28472aa(this)));
        } else {
            this.f74975l.hotSearchLiveData.observe(this, new HotSearchListObserver().setListener(new IHotSearchListListener() {
                public final void onShowOperatedSearchWord(String str, String str2, LogPbBean logPbBean) {
                    HotSearchAndDiscoveryFragment2.this.f74771y = logPbBean;
                    HotSearchAndDiscoveryFragment2.this.f74770x = true;
                    HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.dismiss();
                    HotSearchAndDiscoveryFragment2.this.mo58054a(str, str2, logPbBean);
                }

                public final void onHotSearchWordsFlipper(List<HotSearchItem> list, LogPbBean logPbBean, List<AdDefaultSearchStruct> list2) {
                    HotSearchAndDiscoveryFragment2.this.f74771y = logPbBean;
                    HotSearchAndDiscoveryFragment2.this.f74770x = false;
                    HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.setVisibility(0);
                    HotSearchAndDiscoveryFragment2.this.f74969b.setHint("");
                    HotSearchWordsFlipperView hotSearchWordsFlipperView = HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView;
                    if (C9376b.m18558a((Collection<T>) list)) {
                        hotSearchWordsFlipperView.setVisibility(8);
                        return;
                    }
                    if (hotSearchWordsFlipperView.isFlipping()) {
                        hotSearchWordsFlipperView.stopFlipping();
                    }
                    hotSearchWordsFlipperView.f74780a.clear();
                    for (HotSearchItem aVar : list) {
                        hotSearchWordsFlipperView.f74780a.add(new C28446a(aVar));
                    }
                    Collections.shuffle(hotSearchWordsFlipperView.f74780a);
                    if (list2 != null) {
                        for (AdDefaultSearchStruct adDefaultSearchStruct : list2) {
                            hotSearchWordsFlipperView.f74780a.add(Math.max(0, Math.min(adDefaultSearchStruct.getPosition() - 1, hotSearchWordsFlipperView.f74780a.size())), new C28446a(adDefaultSearchStruct));
                        }
                    }
                    hotSearchWordsFlipperView.removeAllViews();
                    for (int i = 0; i < hotSearchWordsFlipperView.f74780a.size(); i++) {
                        C28446a aVar2 = (C28446a) hotSearchWordsFlipperView.f74780a.get(i);
                        TextView textView = new TextView(hotSearchWordsFlipperView.getContext());
                        textView.setSingleLine();
                        textView.setText(aVar2.mo58081b());
                        textView.setTextSize(1, (float) hotSearchWordsFlipperView.f74781b);
                        textView.setEllipsize(TruncateAt.END);
                        textView.setTextColor(hotSearchWordsFlipperView.f74782c);
                        textView.setGravity(8388627);
                        hotSearchWordsFlipperView.addView(textView, new LayoutParams(-1, -1));
                    }
                    hotSearchWordsFlipperView.mo58073c();
                    hotSearchWordsFlipperView.startFlipping();
                }
            }));
            getLifecycle().mo324a(this.mHotSearchFlipperView);
            this.f74975l.searchState.observe(this, new SearchObserver().setListener(new SearchStateListener() {
                public final void onPageHidden() {
                    HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.mo58072b();
                }

                public final void onPageResume() {
                    HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.mo58071a();
                }

                public final void onContentVisible(boolean z) {
                    if (!HotSearchAndDiscoveryFragment2.this.f74770x) {
                        if (z) {
                            HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.mo58071a();
                            HotSearchAndDiscoveryFragment2.this.f74969b.setHint("");
                            return;
                        }
                        HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.dismiss();
                        if (TextUtils.isEmpty(HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.getCurrentDisplayedWord())) {
                            HotSearchAndDiscoveryFragment2.this.f74969b.setHint(HotSearchAndDiscoveryFragment2.this.mo58175h());
                            return;
                        }
                        HotSearchAndDiscoveryFragment2.this.f74969b.setHint(HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.getCurrentDisplayedWord());
                        HotSearchAndDiscoveryFragment2.this.f74977n = HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.getCurrentOperatedWord();
                        HotSearchAndDiscoveryFragment2.this.f74772z = HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.getCurrentItem();
                    }
                }
            }));
        }
        this.f74975l.isVisibleToUser.observe(this, new C0199s<Boolean>() {
            public final /* synthetic */ void onChanged(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.mo58071a();
                } else {
                    HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.mo58072b();
                }
            }
        });
        this.mRightBackBtn.setOnClickListener(new C28473ab(this));
        if (this.f74769v) {
            this.mRightBackBtn.setVisibility(8);
            this.f74972e.setVisibility(8);
        } else if (m67510t()) {
            this.mRightBackBtn.setVisibility(0);
            this.f74972e.setVisibility(8);
        } else {
            this.mRightBackBtn.setVisibility(8);
            this.f74972e.setVisibility(0);
        }
        if (this.f74769v) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mSearchContainer.getLayoutParams();
            int b = (int) C9432q.m18687b(getContext(), 16.0f);
            marginLayoutParams.leftMargin = b;
            if (VERSION.SDK_INT >= 17) {
                marginLayoutParams.setMarginStart(b);
            }
            this.mSearchContainer.setLayoutParams(marginLayoutParams);
        }
        Context context = getContext();
        ViewGroup viewGroup2 = this.mTopStatus;
        if (this.f74769v) {
            searchScanView = this.mSearchScanViewRight;
        } else {
            searchScanView = this.mSearchScanView;
        }
        SearchScanView searchScanView2 = searchScanView;
        ImageView imageView2 = this.f74972e;
        if (m67510t()) {
            imageView = this.mRightBackBtn;
        } else {
            imageView = this.f74972e;
        }
        C28202j jVar = new C28202j(context, viewGroup2, searchScanView2, imageView2, imageView, this.f74971d, this.mSearchContainer);
        this.f74758A = jVar;
        C28202j jVar2 = (C28202j) this.f74758A;
        jVar2.f74033d = !this.f74769v;
        jVar2.f74034e = m67510t();
        jVar2.f74035f = true;
        jVar2.f74036g = this.f74769v;
        if (C47915gg.m103651b()) {
            C23729p.m58257a(this.mRightSearchView, 8);
            if (this.f74969b != null) {
                this.f74969b.setCursorVisible(false);
                this.f74969b.setFocusable(false);
                this.f74969b.setFocusableInTouchMode(false);
                this.f74969b.setOnClickListener(C28474ac.f74880a);
            }
            if (!(this.mSearchContainer == null || getContext() == null)) {
                ViewGroup.LayoutParams layoutParams = this.mSearchContainer.getLayoutParams();
                if (layoutParams instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.rightMargin = (int) C9432q.m18687b(getContext(), 16.0f);
                    layoutParams2.leftMargin = (int) C9432q.m18687b(getContext(), 16.0f);
                    if (VERSION.SDK_INT >= 17) {
                        int b2 = (int) C9432q.m18687b(getContext(), 16.0f);
                        layoutParams2.setMarginEnd(b2);
                        layoutParams2.setMarginStart(b2);
                    }
                    this.mSearchContainer.setLayoutParams(layoutParams2);
                }
            }
        }
        if (onCreateView != null) {
            onCreateView.setBackground(null);
        }
        if (this.loftNestedRefreshLayout != null) {
            this.loftNestedRefreshLayout.setBackground(null);
        }
        if (this.mFragmentContainer != null) {
            this.mFragmentContainer.setBackground(null);
        }
        return onCreateView;
    }
}
