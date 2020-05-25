package com.p683ss.android.ugc.aweme.history;

import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.detail.p1625g.C27337a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.festival.christmas.api.ChristmasApi;
import com.p683ss.android.ugc.aweme.history.dao.C32959a;
import com.p683ss.android.ugc.aweme.net.C37776h;
import com.p683ss.android.ugc.aweme.p1336ak.p1337a.C22554a;
import com.p683ss.android.ugc.aweme.p1336ak.p1337a.p1338a.C22557b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.history.a */
public final class C32952a extends C26875a<Aweme, C27337a> {

    /* renamed from: e */
    public static final C32953a f85625e = new C32953a(null);

    /* renamed from: a */
    public List<C32959a> f85626a;

    /* renamed from: b */
    public Map<String, Long> f85627b = new LinkedHashMap();

    /* renamed from: c */
    public int f85628c = 1;

    /* renamed from: d */
    public String f85629d;

    /* renamed from: com.ss.android.ugc.aweme.history.a$a */
    public static final class C32953a {
        private C32953a() {
        }

        public /* synthetic */ C32953a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.history.a$b */
    static final class C32954b<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32952a f85630a;

        C32954b(C32952a aVar) {
            this.f85630a = aVar;
        }

        public final /* synthetic */ Object call() {
            this.f85630a.mo69842a(this.f85630a.mo69841a(this.f85630a.f85628c + 1));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.history.a$c */
    static final class C32955c<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C32952a f85631a;

        /* renamed from: b */
        final /* synthetic */ Object[] f85632b;

        C32955c(C32952a aVar, Object[] objArr) {
            this.f85631a = aVar;
            this.f85632b = objArr;
        }

        public final /* synthetic */ Object call() {
            this.f85631a.f85626a = ((C22557b) C22554a.f60691b.mo46901a(C22557b.class)).mo46902a(this.f85632b[0].toString());
            if (this.f85631a.f85626a != null) {
                C32952a aVar = this.f85631a;
                List<C32959a> list = this.f85631a.f85626a;
                if (list == null) {
                    C52711k.m112234a();
                }
                aVar.f85627b.clear();
                for (C32959a aVar2 : list) {
                    aVar.f85627b.put(aVar2.f85635b, Long.valueOf(aVar2.f85634a));
                }
            }
            this.f85631a.f85628c = 1;
            this.f85631a.mo69842a(this.f85631a.mo69841a(this.f85631a.f85628c));
            return C52860x.f131107a;
        }
    }

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        return true;
    }

    public final boolean isHasMore() {
        if (this.f85626a != null) {
            List<C32959a> list = this.f85626a;
            if (list == null) {
                C52711k.m112234a();
            }
            if (list.size() > this.f85628c * 20) {
                return true;
            }
        }
        return false;
    }

    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return new ArrayList<>();
        }
        Object obj = this.mData;
        C52711k.m112236a(obj, "mData");
        this.f85629d = ((C27337a) obj).f72086b;
        Object obj2 = this.mData;
        C52711k.m112236a(obj2, "mData");
        List<Aweme> list = ((C27337a) obj2).f72085a;
        if (list == null) {
            list = new ArrayList<>();
        }
        return new ArrayList<>(list);
    }

    /* renamed from: a */
    public final void mo69842a(String str) {
        C52711k.m112240b(str, "ids");
        ChristmasApi.m73109a().getAwemeDetail(str).mo19a((C0011g<TResult, TContinuationResult>) new C37776h<TResult,TContinuationResult>(this.mHandler, 0));
    }

    public final void loadMoreList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        C0013i.m18a((Callable<TResult>) new C32954b<TResult>(this), (Executor) C0013i.f24a);
    }

    public final void refreshList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        C0013i.m18a((Callable<TResult>) new C32955c<TResult>(this, objArr), (Executor) C0013i.f24a);
    }

    public final /* synthetic */ void handleData(Object obj) {
        List<Aweme> list;
        C27337a aVar = (C27337a) obj;
        int i = this.mListQueryType;
        if (i != 1) {
            if (i == 4) {
                if (this.mData == null) {
                    this.mData = aVar;
                    return;
                }
                this.f85628c++;
                if (aVar != null) {
                    list = aVar.f72085a;
                } else {
                    list = null;
                }
                if (list != null) {
                    Object obj2 = this.mData;
                    C52711k.m112236a(obj2, "mData");
                    List<Aweme> list2 = ((C27337a) obj2).f72085a;
                    List<Aweme> list3 = aVar.f72085a;
                    C52711k.m112236a((Object) list3, "data.items");
                    list2.addAll(list3);
                }
            }
            return;
        }
        this.mData = aVar;
    }

    /* renamed from: a */
    public final String mo69841a(int i) {
        if (this.f85626a == null) {
            return "";
        }
        int i2 = i * 20;
        List<C32959a> list = this.f85626a;
        if (list == null) {
            C52711k.m112234a();
        }
        if (i2 > list.size()) {
            List<C32959a> list2 = this.f85626a;
            if (list2 == null) {
                C52711k.m112234a();
            }
            i2 = list2.size();
        }
        List<C32959a> list3 = this.f85626a;
        if (list3 == null) {
            C52711k.m112234a();
        }
        List<C32959a> subList = list3.subList((i - 1) * 20, i2);
        StringBuilder sb = new StringBuilder("[");
        for (C32959a aVar : subList) {
            sb.append(aVar.f85635b);
            sb.append(",");
        }
        sb.append("]");
        String sb2 = sb.toString();
        C52711k.m112236a((Object) sb2, "builder.toString()");
        return sb2;
    }

    public final boolean sendRequest(Object... objArr) {
        boolean z;
        C52711k.m112240b(objArr, "params");
        if (checkParams(new Object[]{objArr})) {
            this.mIsLoading = true;
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        Integer num = objArr[0];
        if (num != null) {
            this.mListQueryType = num.intValue();
            int i = this.mListQueryType;
            if (i == 1) {
                refreshList(objArr[1]);
            } else if (i == 4) {
                loadMoreList(objArr);
            }
            return true;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Int");
    }
}
