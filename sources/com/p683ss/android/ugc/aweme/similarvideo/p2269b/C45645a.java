package com.p683ss.android.ugc.aweme.similarvideo.p2269b;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.similarvideo.api.SimilarVideoSearchApi;
import com.p683ss.android.ugc.aweme.similarvideo.p2268a.C45644b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.similarvideo.b.a */
public final class C45645a extends C26875a<Aweme, C45644b> {

    /* renamed from: a */
    public String f115428a;

    /* renamed from: b */
    private String f115429b;

    /* renamed from: c */
    private ArrayList<Integer> f115430c = new ArrayList<>();

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C45644b) this.mData).f115424c;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((C45644b) this.mData).f115423b) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        if (objArr.length == 1) {
            m99391a(this.f115429b, 0, 10);
        } else {
            m99391a(objArr[1], 0, 10);
        }
    }

    public final void loadMoreList(Object... objArr) {
        int i = 0;
        if (objArr.length == 1) {
            String str = this.f115429b;
            if (!isDataEmpty()) {
                i = ((C45644b) this.mData).f115422a;
            }
            m99391a(str, i, 10);
            return;
        }
        String str2 = objArr[1];
        if (!isDataEmpty()) {
            i = ((C45644b) this.mData).f115422a;
        }
        m99391a(str2, i, 10);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        int i;
        C45644b bVar = (C45644b) obj;
        boolean z2 = false;
        if (bVar == null || C9376b.m18558a((Collection<T>) bVar.f115424c)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (this.mListQueryType == 1) {
                this.f115428a = bVar.getRequestId();
                C29981aa.m70153a().mo60162a(bVar.getRequestId(), bVar.f115425d);
            }
            this.f115430c.clear();
            ArrayList<Aweme> arrayList = bVar.f115424c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Aweme updateAweme = C23324d.m57378a().updateAweme((Aweme) bVar.f115424c.get(i2));
                if (this.mData == null || ((C45644b) this.mData).f115424c == null) {
                    i = 0;
                } else {
                    i = ((C45644b) this.mData).f115424c.size();
                }
                updateAweme.setRequestId(this.f115428a);
                IRequestIdService a = C23325e.m57379a();
                StringBuilder sb = new StringBuilder();
                sb.append(updateAweme.getAid());
                sb.append(16);
                a.setRequestIdAndIndex(sb.toString(), this.f115428a, i + i2);
                arrayList.set(i2, updateAweme);
                if (!(this.mListQueryType == 1 || this.mData == null || !m99392a(((C45644b) this.mData).f115424c, updateAweme))) {
                    this.f115430c.add(Integer.valueOf(i2));
                }
            }
            if (this.f115430c.size() != 0) {
                for (int size2 = this.f115430c.size() - 1; size2 >= 0; size2--) {
                    if (arrayList.size() > ((Integer) this.f115430c.get(size2)).intValue()) {
                        arrayList.remove(((Integer) this.f115430c.get(size2)).intValue());
                    }
                }
            }
            int i3 = this.mListQueryType;
            if (i3 != 1) {
                if (i3 == 4) {
                    ((C45644b) this.mData).f115424c.addAll(arrayList);
                    C45644b bVar2 = (C45644b) this.mData;
                    if (bVar.f115423b && ((C45644b) this.mData).f115423b) {
                        z2 = true;
                    }
                    bVar2.f115423b = z2;
                    ((C45644b) this.mData).f115422a = bVar.f115422a;
                }
                return;
            }
            this.mData = bVar;
            ((C45644b) this.mData).f115424c = arrayList;
        } else {
            if (this.mListQueryType == 1) {
                this.mData = bVar;
            }
            if (this.mData != null) {
                ((C45644b) this.mData).f115423b = false;
            }
        }
    }

    /* renamed from: a */
    private static boolean m99392a(Collection<Aweme> collection, Aweme aweme) {
        if (aweme == null || aweme.getAid() == null || collection == null || collection.isEmpty()) {
            return false;
        }
        String aid = aweme.getAid();
        for (Aweme aweme2 : collection) {
            if (aweme2 != null && aid.equals(aweme2.getAid())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m99391a(final String str, final int i, int i2) {
        this.f115429b = str;
        C23566n.m57766a().mo48750a(this.mHandler, new Callable(10) {
            public final Object call() throws Exception {
                return SimilarVideoSearchApi.m99390a(str, (long) i, 10);
            }
        }, 0);
    }
}
