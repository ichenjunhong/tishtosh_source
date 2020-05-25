package com.p683ss.android.ugc.aweme.recommend.widget;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32760i;
import com.p683ss.android.ugc.aweme.newfollow.C37836a;
import com.p683ss.android.ugc.aweme.recommend.p2111a.C41086a;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.recommend.widget.RecommendVerticalUserListView */
public class RecommendVerticalUserListView extends BaseRecommendCommonView {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f104545a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecommendVerticalUserListView.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/aweme/recommend/adapter/RecommendListAdapter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RecommendVerticalUserListView.class), "mRecommendListPresenter", "getMRecommendListPresenter()Lcom/ss/android/ugc/aweme/newfollow/IRecommendListPresenter;"))};

    /* renamed from: b */
    private final RecyclerView f104546b;

    /* renamed from: c */
    private final C52668f f104547c;

    /* renamed from: d */
    private final C52668f f104548d;

    /* renamed from: com.ss.android.ugc.aweme.recommend.widget.RecommendVerticalUserListView$a */
    static final class C41147a extends C52712l implements C52670a<C41086a> {

        /* renamed from: a */
        final /* synthetic */ RecommendVerticalUserListView f104549a;

        C41147a(RecommendVerticalUserListView recommendVerticalUserListView) {
            this.f104549a = recommendVerticalUserListView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C41086a a = this.f104549a.mo83666a();
            a.mo54798c(this.f104549a.mo83667b());
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.widget.RecommendVerticalUserListView$b */
    static final class C41148b extends C52712l implements C52670a<C37836a> {

        /* renamed from: a */
        final /* synthetic */ RecommendVerticalUserListView f104550a;

        C41148b(RecommendVerticalUserListView recommendVerticalUserListView) {
            this.f104550a = recommendVerticalUserListView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C37836a createRecommendListPresenter = I18nBridgeService.getBridgeService_Monster().createRecommendListPresenter();
            this.f104550a.getRecommendType();
            return createRecommendListPresenter;
        }
    }

    public RecommendVerticalUserListView(Context context) {
        this(context, null, 0, 6, null);
    }

    public RecommendVerticalUserListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final C37836a getMRecommendListPresenter() {
        return (C37836a) this.f104548d.getValue();
    }

    public int getContentLayoutResId() {
        return R.layout.byy;
    }

    public final C41086a getMAdapter() {
        return (C41086a) this.f104547c.getValue();
    }

    /* renamed from: a */
    public C41086a mo83666a() {
        return new C41086a(0);
    }

    public Activity getActivity() {
        return getMActivity();
    }

    /* renamed from: b */
    public boolean mo83667b() {
        DataCenter mDataCenter = getMDataCenter();
        if (mDataCenter != null) {
            Boolean bool = (Boolean) mDataCenter.mo48230b("config_show_footer", Boolean.valueOf(true));
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo83672c() {
        DataCenter mDataCenter = getMDataCenter();
        if (mDataCenter != null) {
            Boolean bool = (Boolean) mDataCenter.mo48230b("config_enable_scroll_vertically", Boolean.valueOf(true));
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo83673d() {
        DataCenter mDataCenter = getMDataCenter();
        if (mDataCenter != null) {
            Boolean bool = (Boolean) mDataCenter.mo48230b("config_enable_scroll_horizontal", Boolean.valueOf(true));
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    public final int getRecommendType() {
        DataCenter mDataCenter = getMDataCenter();
        if (mDataCenter != null) {
            Integer num = (Integer) mDataCenter.mo48230b("key_recommend_type", Integer.valueOf(2));
            if (num != null) {
                return num.intValue();
            }
        }
        return 2;
    }

    /* renamed from: a */
    public final void onChanged(C23274a aVar) {
        String str;
        super.onChanged(aVar);
        if (aVar != null) {
            str = aVar.f62242a;
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1814650973:
                    if (str.equals("action_list_refresh")) {
                        getMRecommendListPresenter();
                        return;
                    }
                    break;
                case -1620059355:
                    if (str.equals("action_click_dislike")) {
                        Object a = aVar.mo48246a();
                        if (!(a instanceof String)) {
                            a = null;
                        }
                        String str2 = (String) a;
                        if (str2 != null) {
                            C52711k.m112240b(str2, "uid");
                            int a2 = getMAdapter().mo83602a(str2);
                            if (a2 >= 0 && a2 < getMAdapter().mo48636c()) {
                                List a3 = getMAdapter().mo50673a();
                                if (a3 != null) {
                                    a3.remove(a2);
                                }
                                getMAdapter().notifyItemRemoved(a2);
                                if (getMAdapter().mo48636c() == 0) {
                                    DataCenter mDataCenter = getMDataCenter();
                                    if (mDataCenter != null) {
                                        mDataCenter.mo48228a("action_dislike_all", (Object) "");
                                        break;
                                    }
                                }
                            }
                            return;
                        }
                    }
                    break;
                case -1010710674:
                    if (str.equals("action_list_remove_user")) {
                        Object a4 = aVar.mo48246a();
                        if (!(a4 instanceof String)) {
                            a4 = null;
                        }
                        String str3 = (String) a4;
                        if (str3 != null) {
                            C52711k.m112240b(str3, "uid");
                            int a5 = getMAdapter().mo83602a(str3);
                            if (a5 != -1) {
                                List a6 = getMAdapter().mo50673a();
                                if (a6 != null) {
                                    a6.remove(a5);
                                }
                                getMAdapter().notifyItemRemoved(a5);
                                getMAdapter().notifyDataSetChanged();
                                break;
                            }
                        } else {
                            return;
                        }
                    }
                    break;
                case -488269483:
                    if (str.equals("action_list_bind_user")) {
                        getMAdapter().mo50303a((List) aVar.mo48246a());
                        return;
                    }
                    break;
                case 1831094742:
                    if (str.equals("action_list_load_more")) {
                        getMRecommendListPresenter();
                        return;
                    }
                    break;
            }
        }
    }

    public RecommendVerticalUserListView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f104546b = (RecyclerView) getMRootView().findViewById(R.id.c_1);
        this.f104547c = C52732g.m112285a(new C41147a(this));
        this.f104548d = C52732g.m112285a(new C41148b(this));
        RecyclerView recyclerView = this.f104546b;
        C52711k.m112236a((Object) recyclerView, "it");
        recyclerView.setLayoutManager(new RecommendVerticalUserListView$initView$$inlined$also$lambda$1(getContext(), this));
        recyclerView.setAdapter(getMAdapter());
        recyclerView.setItemAnimator(new C32760i());
        recyclerView.setNestedScrollingEnabled(false);
        DataCenter mDataCenter = getMDataCenter();
        if (mDataCenter != null) {
            C0199s sVar = this;
            mDataCenter.mo48226a("action_list_bind_user", sVar);
            mDataCenter.mo48226a("action_list_refresh", sVar);
            mDataCenter.mo48226a("action_list_load_more", sVar);
            mDataCenter.mo48226a("action_click_dislike", sVar);
            mDataCenter.mo48226a("action_list_remove_user", sVar);
        }
    }

    public /* synthetic */ RecommendVerticalUserListView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
