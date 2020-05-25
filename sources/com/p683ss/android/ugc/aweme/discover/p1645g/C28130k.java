package com.p683ss.android.ugc.aweme.discover.p1645g;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.discover.api.SearchApi;
import com.p683ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p683ss.android.ugc.aweme.discover.model.SearchChallengeList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.g.k */
public final class C28130k extends C28127h<SearchChallenge, SearchChallengeList> {

    /* renamed from: b */
    public String f73868b;

    /* renamed from: com.ss.android.ugc.aweme.discover.g.k$a */
    class C28132a extends C28118b {

        /* renamed from: b */
        final String f73869b;

        /* renamed from: c */
        final int f73870c;

        /* renamed from: d */
        final int f73871d;

        /* renamed from: e */
        final int f73872e;

        /* renamed from: f */
        final String f73873f;

        /* renamed from: g */
        final int f73874g;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Object mo56525b() throws Exception {
            if (TextUtils.isEmpty(this.f73869b)) {
                return SearchApi.m66824a((long) this.f73870c, this.f73872e);
            }
            return SearchApi.m66825a(this.f73869b, (long) this.f73870c, this.f73872e, this.f73871d, C28130k.this.f73862i, this.f73873f, C28130k.this.mo56537d(), this.f73874g);
        }

        private C28132a(String str, int i, int i2, int i3, String str2, int i4) {
            this.f73869b = str;
            this.f73870c = i;
            this.f73871d = i2;
            this.f73872e = i3;
            this.f73873f = str2;
            this.f73874g = i4;
        }
    }

    public final int aK_() {
        return 2;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((SearchChallengeList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            i = 0;
        } else {
            i = ((SearchChallengeList) this.mData).cursor;
        }
        m66969a(str, i, 1, 20, this.f73864k, objArr[3].intValue());
    }

    public final void refreshList(Object... objArr) {
        if (objArr.length >= 5) {
            m66969a((String) objArr[1], 0, objArr[2].intValue(), objArr[3].intValue(), "", objArr[4].intValue());
            return;
        }
        m66969a((String) objArr[1], 0, objArr[2].intValue(), 20, "", objArr[3].intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SearchChallengeList searchChallengeList) {
        boolean z;
        super.handleData(searchChallengeList);
        List<SearchChallenge> list = searchChallengeList.challengeList;
        boolean z2 = false;
        if (searchChallengeList == null || C9376b.m18558a((Collection<T>) list)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            for (SearchChallenge searchChallenge : list) {
                if (searchChallenge.getChallenge() != null) {
                    searchChallenge.getChallenge().setRequestId(this.f73863j);
                }
                searchChallenge.setRequestId(searchChallengeList.getRequestId());
            }
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = searchChallengeList;
                ((SearchChallengeList) this.mData).challengeList = new ArrayList();
                mo56532a_(list);
            } else if (i == 4) {
                mo56535b(list);
                SearchChallengeList searchChallengeList2 = (SearchChallengeList) this.mData;
                if (searchChallengeList.hasMore && ((SearchChallengeList) this.mData).hasMore) {
                    z2 = true;
                }
                searchChallengeList2.hasMore = z2;
                ((SearchChallengeList) this.mData).cursor = searchChallengeList.cursor;
            }
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchChallengeList;
                mo56536c();
            }
            if (this.mData != null) {
                ((SearchChallengeList) this.mData).hasMore = false;
            }
        }
    }

    /* renamed from: a */
    private void m66969a(String str, int i, int i2, int i3, String str2, int i4) {
        String str3 = str;
        this.f73868b = str3;
        C28132a aVar = new C28132a(str3, i, i2, i3, str2, i4);
        aVar.f73843a = this.f73860g;
        this.f73861h = aVar;
        C23566n.m57766a().mo48750a(this.mHandler, aVar, 0);
    }
}
