package com.p683ss.android.ugc.aweme.tutorial.p2374a;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.tutorial.api.TutorialAwemeListApi;
import com.p683ss.android.ugc.aweme.tutorial.api.TutorialAwemeListApi.TutorialAwemeListRequest;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tutorial.a.b */
public final class C47374b extends C26875a<Aweme, C47377d> {

    /* renamed from: com.ss.android.ugc.aweme.tutorial.a.b$a */
    static final class C47375a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ String f119552a;

        /* renamed from: b */
        final /* synthetic */ long f119553b;

        /* renamed from: c */
        final /* synthetic */ int f119554c;

        C47375a(String str, long j, int i) {
            this.f119552a = str;
            this.f119553b = j;
            this.f119554c = i;
        }

        public final /* synthetic */ Object call() {
            String str = this.f119552a;
            long j = this.f119553b;
            int i = this.f119554c;
            C52711k.m112240b(str, "tutorialId");
            Object obj = ((TutorialAwemeListRequest) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(TutorialAwemeListApi.f119567a, null).create(TutorialAwemeListRequest.class)).getTutorialAwemeList(str, j, i).get();
            C52711k.m112236a(obj, "api.getTutorialAwemeList…lId, cursor, count).get()");
            return (C47377d) obj;
        }
    }

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        return true;
    }

    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C47377d) this.mData).f119557a;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((C47377d) this.mData).f119559c) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        String str = objArr[1];
        if (str != null) {
            m102760a(str, 0, 20);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.String");
    }

    public final void loadMoreList(Object... objArr) {
        long j;
        C52711k.m112240b(objArr, "params");
        String str = objArr[1];
        if (str != null) {
            String str2 = str;
            if (isDataEmpty()) {
                j = 0;
            } else {
                j = ((C47377d) this.mData).f119558b;
            }
            m102760a(str2, j, 20);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.String");
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        C47377d dVar = (C47377d) obj;
        if (dVar == null || C9376b.m18558a((Collection<T>) dVar.f119557a)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (dVar == null) {
                C52711k.m112234a();
            }
            int size = dVar.f119557a.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = dVar.f119557a.get(i);
                C52711k.m112236a(obj2, "data.awemeList[i]");
                Aweme updateAweme = C23324d.m57378a().updateAweme((Aweme) obj2);
                C52711k.m112236a((Object) updateAweme, "ServiceManager.get().get….java).updateAweme(aweme)");
                dVar.f119557a.set(i, updateAweme);
            }
            int i2 = this.mListQueryType;
            if (i2 != 1) {
                if (i2 == 4) {
                    ((C47377d) this.mData).f119557a.addAll(dVar.f119557a);
                    ((C47377d) this.mData).f119558b = dVar.f119558b;
                    ((C47377d) this.mData).f119559c = dVar.f119559c & ((C47377d) this.mData).f119559c;
                }
                return;
            }
            this.mData = dVar;
            return;
        }
        C47377d dVar2 = (C47377d) this.mData;
        if (dVar2 != null) {
            dVar2.f119559c = false;
        }
    }

    /* renamed from: a */
    private final void m102760a(String str, long j, int i) {
        C23566n.m57766a().mo48750a(this.mHandler, new C47375a(str, j, 20), 0);
    }
}
