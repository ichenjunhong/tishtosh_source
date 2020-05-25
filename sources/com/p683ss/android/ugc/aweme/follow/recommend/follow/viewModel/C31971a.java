package com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27379l;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.repo.C31907e;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel.C31949b;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.a */
public final class C31971a extends C26875a<Aweme, RecommendList> implements C27379l {

    /* renamed from: c */
    public static final C31972a f83468c = new C31972a(null);

    /* renamed from: a */
    public final RecommendFollowViewModel f83469a;

    /* renamed from: b */
    public final RecommendList f83470b;

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.a$a */
    public static final class C31972a {
        private C31972a() {
        }

        public /* synthetic */ C31972a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.a$b */
    public static final class C31973b implements C31949b {

        /* renamed from: a */
        final /* synthetic */ C31971a f83471a;

        /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.a$b$a */
        static final class C31974a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C31973b f83472a;

            /* renamed from: b */
            final /* synthetic */ RecommendList f83473b;

            C31974a(C31973b bVar, RecommendList recommendList) {
                this.f83472a = bVar;
                this.f83473b = recommendList;
            }

            public final void run() {
                this.f83472a.f83471a.mIsLoading = false;
                this.f83472a.f83471a.handleData(this.f83473b);
                List<C26874f> list = this.f83472a.f83471a.mNotifyListeners;
                if (list != null) {
                    for (C26874f fVar : list) {
                        if (fVar != null) {
                            fVar.mo44838b();
                        }
                    }
                }
            }
        }

        C31973b(C31971a aVar) {
            this.f83471a = aVar;
        }

        /* renamed from: a */
        public final void mo65158a(RecommendList recommendList) {
            C52711k.m112240b(recommendList, "data");
            this.f83471a.mHandler.post(new C31974a(this, recommendList));
        }

        /* renamed from: a */
        public final void mo65159a(Throwable th) {
            Throwable th2;
            C52711k.m112240b(th, "throwable");
            this.f83471a.mIsLoading = false;
            List<C26874f> list = this.f83471a.mNotifyListeners;
            if (list != null) {
                for (C26874f fVar : list) {
                    if (fVar != null) {
                        if (!(th instanceof Exception)) {
                            th2 = null;
                        } else {
                            th2 = th;
                        }
                        fVar.mo44840c_((Exception) th2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final List<Aweme> mo55861a() {
        return getItems();
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((RecommendList) this.mData).hasMore()) {
            return false;
        }
        return true;
    }

    public final List<Aweme> getItems() {
        List<Aweme> arrayList = new ArrayList<>();
        Object obj = this.mData;
        C52711k.m112236a(obj, "mData");
        for (C31907e eVar : ((RecommendList) obj).getRecommendFollowList()) {
            arrayList.addAll(eVar.f83353b);
        }
        return arrayList;
    }

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        if (objArr.length == 1) {
            return true;
        }
        return false;
    }

    public final void loadMoreList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        m74356a(true);
    }

    public final void refreshList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        m74356a(false);
    }

    /* renamed from: a */
    private final void m74356a(boolean z) {
        RecommendFollowViewModel recommendFollowViewModel = this.f83469a;
        recommendFollowViewModel.mo22527b(new C31950c(recommendFollowViewModel, z, new C31973b(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void handleData(RecommendList recommendList) {
        boolean z;
        if (recommendList == null || C9376b.m18558a((Collection<T>) recommendList.getRecommendFollowList()) || C9376b.m18558a((Collection<T>) recommendList.getUserList())) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (recommendList == null) {
                C52711k.m112234a();
            }
            for (C31907e eVar : recommendList.getRecommendFollowList()) {
                for (Aweme clone : eVar.f83353b) {
                    C23324d.m57378a().updateAweme(clone.clone());
                }
            }
            this.mData = recommendList;
            return;
        }
        if (this.mData != null) {
            ((RecommendList) this.mData).setHasMore(false);
        }
    }

    private C31971a(RecommendFollowViewModel recommendFollowViewModel, RecommendList recommendList) {
        this.f83469a = recommendFollowViewModel;
        this.f83470b = recommendList;
        this.mData = this.f83470b;
    }

    public /* synthetic */ C31971a(RecommendFollowViewModel recommendFollowViewModel, RecommendList recommendList, C52707g gVar) {
        this(recommendFollowViewModel, recommendList);
    }
}
