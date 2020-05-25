package com.p683ss.android.ugc.aweme.discover.p1645g;

import android.support.p030v4.p038f.C0793j;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.discover.api.SearchApi;
import com.p683ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p683ss.android.ugc.aweme.discover.model.SearchMix;
import com.p683ss.android.ugc.aweme.discover.model.SearchPoi;
import com.p683ss.android.ugc.aweme.discover.model.SearchUser;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.music.model.Music;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.g.o */
public final class C28137o extends C28127h<Aweme, SearchMix> {

    /* renamed from: b */
    public String f73889b;

    /* renamed from: c */
    private String f73890c;

    public final int aK_() {
        return 3;
    }

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((SearchMix) this.mData).awemeList;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((SearchMix) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        int i2;
        if (objArr.length == 1) {
            String str = this.f73889b;
            if (isDataEmpty()) {
                i2 = 0;
            } else {
                i2 = ((SearchMix) this.mData).cursor;
            }
            m67005a(str, i2, 1, 10, this.f73864k, 1);
            return;
        }
        String str2 = (String) objArr[1];
        if (isDataEmpty()) {
            i = 0;
        } else {
            i = ((SearchMix) this.mData).cursor;
        }
        m67005a(str2, i, 1, 10, this.f73864k, objArr[3].intValue());
    }

    public final void refreshList(Object... objArr) {
        boolean a = C0793j.m2264a(objArr[2], Integer.valueOf(1));
        if (objArr.length == 6) {
            m67004a((String) objArr[1], 0, 10, a, objArr[3].doubleValue(), objArr[4].doubleValue(), "", objArr[5].intValue());
            return;
        }
        m67004a((String) objArr[1], 0, 10, a ? 1 : 0, ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT, "", 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SearchMix searchMix) {
        boolean z;
        int i;
        super.handleData(searchMix);
        boolean z2 = false;
        if (searchMix == null || C9376b.m18558a((Collection<T>) searchMix.awemeList)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (1 == this.mListQueryType) {
                this.f73890c = C29981aa.m70153a().mo60160a(searchMix.logPb);
            }
            if (searchMix.poiList != null) {
                for (SearchPoi searchPoi : searchMix.poiList) {
                    searchPoi.logPb = this.f73890c;
                }
            }
            List<Aweme> list = searchMix.awemeList;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Aweme updateAweme = C23324d.m57378a().updateAweme((Aweme) searchMix.awemeList.get(i2));
                if (this.mData == null || ((SearchMix) this.mData).awemeList == null) {
                    i = 0;
                } else {
                    i = ((SearchMix) this.mData).awemeList.size();
                }
                updateAweme.setRequestId(this.f73863j);
                IRequestIdService a = C23325e.m57379a();
                StringBuilder sb = new StringBuilder();
                sb.append(updateAweme.getAid());
                sb.append(9);
                a.setRequestIdAndIndex(sb.toString(), this.f73863j, i + i2);
                list.set(i2, updateAweme);
            }
            List<SearchUser> list2 = searchMix.users;
            if (!C9376b.m18558a((Collection<T>) list2)) {
                for (SearchUser searchUser : list2) {
                    searchUser.user.setRequestId(this.f73863j);
                }
            }
            List<SearchChallenge> list3 = searchMix.challengeList;
            if (!C9376b.m18558a((Collection<T>) list3)) {
                for (SearchChallenge searchChallenge : list3) {
                    if (searchChallenge.getChallenge() != null) {
                        searchChallenge.getChallenge().setRequestId(this.f73863j);
                    }
                }
            }
            List<Music> list4 = searchMix.musicLists;
            if (!C9376b.m18558a((Collection<T>) list4)) {
                for (Music requestId : list4) {
                    requestId.setRequestId(this.f73863j);
                }
            }
            int i3 = this.mListQueryType;
            if (i3 != 1) {
                if (i3 == 4) {
                    ((SearchMix) this.mData).awemeList.addAll(list);
                    SearchMix searchMix2 = (SearchMix) this.mData;
                    if (searchMix.hasMore && ((SearchMix) this.mData).hasMore) {
                        z2 = true;
                    }
                    searchMix2.hasMore = z2;
                    ((SearchMix) this.mData).cursor = searchMix.cursor;
                }
                return;
            }
            this.mData = searchMix;
            ((SearchMix) this.mData).awemeList = list;
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchMix;
            }
            if (this.mData != null) {
                ((SearchMix) this.mData).hasMore = false;
            }
        }
    }

    /* renamed from: a */
    private void m67005a(String str, int i, int i2, int i3, String str2, int i4) {
        C23566n a = C23566n.m57766a();
        C9381g gVar = this.mHandler;
        final String str3 = str;
        final int i5 = i;
        final String str4 = str2;
        final int i6 = i4;
        C281392 r0 = new Callable(10, 1) {
            public final Object call() throws Exception {
                return SearchApi.m66827a(str3, (long) i5, 10, "general_search", 1, C28137o.this.f73862i, str4, i6);
            }
        };
        a.mo48750a(gVar, r0, 0);
    }

    /* renamed from: a */
    private void m67004a(String str, int i, int i2, int i3, double d, double d2, String str2, int i4) {
        final String str3 = str;
        this.f73889b = str3;
        C23566n a = C23566n.m57766a();
        C9381g gVar = this.mHandler;
        final int i5 = i3;
        final double d3 = d;
        final double d4 = d2;
        final String str4 = str2;
        final int i6 = i4;
        C281381 r0 = new Callable(0, 10) {
            public final Object call() throws Exception {
                return SearchApi.m66826a(str3, (long) 0, 10, i5, C28137o.this.f73862i, d3, d4, str4, i6);
            }
        };
        a.mo48750a(gVar, r0, 0);
    }
}
