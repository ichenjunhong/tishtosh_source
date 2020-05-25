package com.p683ss.android.ugc.aweme.favorites.model;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.a */
public final class C29705a extends C26875a<Challenge, C29707b> {
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List<Challenge> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C29707b) this.mData).f77617a;
    }

    public C29705a() {
        C29707b bVar = new C29707b();
        bVar.f77617a = new ArrayList();
        bVar.mo59971a(true);
        this.mData = bVar;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((C29707b) this.mData).mo59972a()) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        m69748a(0, 12);
    }

    public final void loadMoreList(Object... objArr) {
        m69748a(((C29707b) this.mData).f77618b, 10);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        C29707b bVar = (C29707b) obj;
        boolean z2 = false;
        if (bVar == null || C9376b.m18558a((Collection<T>) bVar.f77617a)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = bVar;
            } else if (i == 4) {
                if (this.mData == null) {
                    this.mData = bVar;
                    return;
                }
                List<Challenge> list = ((C29707b) this.mData).f77617a;
                List<Challenge> list2 = bVar.f77617a;
                List<Challenge> list3 = ((C29707b) this.mData).f77617a;
                ArrayList arrayList = new ArrayList();
                for (Challenge challenge : list2) {
                    arrayList.add(challenge);
                    for (Challenge cid : list3) {
                        if (challenge.getCid().equals(cid.getCid())) {
                            arrayList.remove(challenge);
                        }
                    }
                }
                list.addAll(arrayList);
                ((C29707b) this.mData).f77618b = bVar.f77618b;
                C29707b bVar2 = (C29707b) this.mData;
                if (bVar.mo59972a() && ((C29707b) this.mData).mo59972a()) {
                    z2 = true;
                }
                bVar2.mo59971a(z2);
            }
        } else {
            if (this.mData != null) {
                if (this.mListQueryType == 1) {
                    ((C29707b) this.mData).f77617a.clear();
                }
                ((C29707b) this.mData).mo59971a(false);
            }
        }
    }

    /* renamed from: a */
    private void m69748a(final int i, final int i2) {
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return UserFavoritesApi.m69719a(i, i2);
            }
        }, 0);
    }
}
