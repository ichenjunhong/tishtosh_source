package com.p683ss.android.ugc.aweme.donation;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.donation.f */
public final class C29040f extends C26875a<C29048i, C29037c> {

    /* renamed from: a */
    public final DonateApi f75984a = ((DonateApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19925a().mo19930a(DonateApi.class));

    /* renamed from: b */
    public final String f75985b;

    /* renamed from: com.ss.android.ugc.aweme.donation.f$a */
    public static final class C29041a implements Callable<C29037c> {

        /* renamed from: a */
        final /* synthetic */ C29040f f75986a;

        /* renamed from: b */
        final /* synthetic */ int f75987b;

        public final /* synthetic */ Object call() {
            Object obj = this.f75986a.f75984a.getDonateDetail(this.f75986a.f75985b, this.f75987b).get();
            C52711k.m112236a(obj, "api.getDonateDetail(aid, cursor).get()");
            return (C29037c) obj;
        }

        C29041a(C29040f fVar, int i) {
            this.f75986a = fVar;
            this.f75987b = i;
        }
    }

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        return true;
    }

    public final List<C29048i> getItems() {
        C29037c cVar = (C29037c) this.mData;
        if (cVar != null) {
            List<C29048i> list = cVar.f75978b;
            if (list != null) {
                return C52575l.m112139e((Collection<? extends T>) list);
            }
        }
        return null;
    }

    public final boolean isHasMore() {
        Boolean bool;
        C29037c cVar = (C29037c) this.mData;
        if (cVar != null) {
            bool = cVar.f75980d;
        } else {
            bool = null;
        }
        return C52711k.m112239a((Object) bool, (Object) Boolean.valueOf(true));
    }

    public final void refreshList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        m68392a(0);
    }

    /* renamed from: a */
    private final void m68392a(int i) {
        C23566n.m57766a().mo48750a(this.mHandler, new C29041a(this, i), 0);
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        C52711k.m112240b(objArr, "params");
        Integer num = ((C29037c) getData()).f75979c;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        m68392a(i);
    }

    public C29040f(String str) {
        C52711k.m112240b(str, "aid");
        this.f75985b = str;
    }

    public final /* synthetic */ void handleData(Object obj) {
        C29037c cVar = (C29037c) obj;
        if (this.mListQueryType != 4) {
            super.handleData(cVar);
        } else if (cVar != null) {
            if (this.mData == null) {
                this.mData = cVar;
                return;
            }
            if (cVar.f75978b != null) {
                List<C29048i> list = ((C29037c) this.mData).f75978b;
                if (list == null) {
                    list = new ArrayList<>();
                }
                List e = C52575l.m112139e((Collection<? extends T>) list);
                e.addAll(cVar.f75978b);
                C29037c cVar2 = (C29037c) this.mData;
                C29037c cVar3 = new C29037c(cVar2.f75977a, e, cVar.f75979c, cVar.f75980d, cVar2.f75981e, cVar2.f75982f);
                this.mData = cVar3;
            }
        }
    }
}
