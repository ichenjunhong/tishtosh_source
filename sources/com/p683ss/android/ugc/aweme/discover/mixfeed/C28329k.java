package com.p683ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27369c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.mix.MixDetailApi;
import com.p683ss.android.ugc.aweme.mix.MixDetailApi.C36989a;
import com.p683ss.android.ugc.aweme.mix.MixList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C2206z;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.k */
public final class C28329k extends C27369c<Aweme, MixList> {

    /* renamed from: e */
    public static final C28330a f74328e = new C28330a(null);

    /* renamed from: b */
    public String f74329b = "";

    /* renamed from: c */
    public String f74330c = "";

    /* renamed from: d */
    public final IRequestIdService f74331d = C23325e.m57379a();

    /* renamed from: f */
    private final MixDetailApi f74332f = C36989a.m83212a();

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.k$a */
    public static final class C28330a {
        private C28330a() {
        }

        public /* synthetic */ C28330a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.k$b */
    static final class C28331b<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ C28329k f74333a;

        C28331b(C28329k kVar) {
            this.f74333a = kVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            MixList mixList = (MixList) obj;
            C52711k.m112240b(mixList, "it");
            List<Aweme> list = mixList.awemeList;
            if (list != null) {
                int i = 0;
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C52575l.m112100b();
                    }
                    Aweme aweme = (Aweme) next;
                    C52711k.m112236a((Object) aweme, "aweme");
                    aweme.setRequestId(this.f74333a.f74330c);
                    IRequestIdService iRequestIdService = this.f74333a.f74331d;
                    StringBuilder sb = new StringBuilder();
                    sb.append(aweme.getAid());
                    sb.append(9);
                    iRequestIdService.setRequestIdAndIndex(sb.toString(), this.f74333a.f74330c, i);
                    i = i2;
                }
            }
            return mixList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.k$c */
    public static final class C28332c implements C1683ag<MixList> {

        /* renamed from: a */
        final /* synthetic */ C28329k f74334a;

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        C28332c(C28329k kVar) {
            this.f74334a = kVar;
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            this.f74334a.mIsLoading = false;
            if (this.f74334a.mNotifyListeners != null) {
                for (C26874f c_ : this.f74334a.mNotifyListeners) {
                    c_.mo44840c_((Exception) th);
                }
            }
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            MixList mixList = (MixList) obj;
            C52711k.m112240b(mixList, "t");
            this.f74334a.mIsLoading = false;
            this.f74334a.handleData(mixList);
            if (this.f74334a.mNotifyListeners != null) {
                for (C26874f b : this.f74334a.mNotifyListeners) {
                    b.mo44838b();
                }
            }
        }
    }

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        return true;
    }

    public final boolean isHasMore() {
        MixList mixList = (MixList) this.mData;
        if (mixList == null || mixList.hasMore != 1) {
            return false;
        }
        return true;
    }

    public final List<Aweme> getItems() {
        MixList mixList = (MixList) this.mData;
        if (mixList != null) {
            List<Aweme> list = mixList.awemeList;
            if (list != null) {
                return list;
            }
        }
        return new ArrayList<>();
    }

    public final void refreshList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        m67255a(this.f74329b, 0);
    }

    public final void loadMoreList(Object... objArr) {
        long j;
        C52711k.m112240b(objArr, "params");
        String str = this.f74329b;
        MixList mixList = (MixList) this.mData;
        if (mixList != null) {
            j = mixList.cursor;
        } else {
            j = 0;
        }
        m67255a(str, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void handleData(MixList mixList) {
        if (mixList == null || C9376b.m18558a((Collection<T>) mixList.awemeList)) {
            if (this.mListQueryType == 1) {
                this.mData = mixList;
                MixList mixList2 = (MixList) this.mData;
                if (mixList2 != null) {
                    mixList2.hasMore = 0;
                }
            }
            if (!(this.mData == null || this.mListQueryType == 2)) {
                MixList mixList3 = (MixList) this.mData;
                if (mixList3 != null) {
                    mixList3.hasMore = 0;
                }
            }
        } else {
            if (this.mListQueryType != 1) {
                Iterator it = mixList.awemeList.iterator();
                while (it.hasNext()) {
                    Aweme aweme = (Aweme) it.next();
                    if (!isDataEmpty() && ((MixList) this.mData).awemeList.indexOf(aweme) >= 0) {
                        it.remove();
                    }
                }
            }
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = mixList;
            } else if (i == 4) {
                List<Aweme> list = ((MixList) this.mData).awemeList;
                List<Aweme> list2 = mixList.awemeList;
                C52711k.m112236a((Object) list2, "data.awemeList");
                list.addAll(list2);
                ((MixList) this.mData).hasMore &= mixList.hasMore;
            }
            if (((MixList) this.mData).cursor != 0) {
                ((MixList) this.mData).cursor = mixList.cursor;
            }
        }
    }

    /* renamed from: a */
    private final void m67255a(String str, long j) {
        C1680ad.m5960a((C2206z<? extends T>) this.f74332f.getMixListAweme(str, j, 15, 2)).mo6157b((C1711f<? super T, ? extends R>) new C28331b<Object,Object>(this)).mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6159b((C1683ag<? super T>) new C28332c<Object>(this));
    }
}
