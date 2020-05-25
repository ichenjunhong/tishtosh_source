package com.p683ss.android.ugc.aweme.discover.p1645g;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.discover.abtest.GuideSearchUIOptimization;
import com.p683ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.p683ss.android.ugc.aweme.discover.model.SearchMix;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.search.p2124d.C41412a;
import com.p683ss.android.ugc.aweme.search.p2124d.C41413b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.g.f */
public final class C28123f extends C28127h<Aweme, SearchMix> {

    /* renamed from: b */
    public String f73847b;

    /* renamed from: c */
    public String f73848c = "video_search";

    /* renamed from: com.ss.android.ugc.aweme.discover.g.f$a */
    class C28125a extends C28118b {

        /* renamed from: b */
        final String f73849b;

        /* renamed from: c */
        final int f73850c;

        /* renamed from: d */
        final int f73851d;

        /* renamed from: e */
        final int f73852e;

        /* renamed from: f */
        final String f73853f;

        /* renamed from: g */
        final int f73854g;

        /* renamed from: h */
        final C41412a f73855h;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Object mo56525b() throws Exception {
            return SearchApiNew.m66835b().searchFeedList(this.f73849b, (long) this.f73850c, this.f73852e, C28123f.this.f73848c, C28123f.this.mo56537d(), this.f73851d, C28123f.this.f73862i, this.f73853f, this.f73854g, C41413b.m91226a(this.f73855h), C28123f.this.f73859f.getSortType(), C28123f.this.f73859f.getPublishTime()).get();
        }

        private C28125a(String str, int i, int i2, int i3, String str2, int i4, C41412a aVar) {
            this.f73849b = str;
            this.f73850c = i;
            this.f73851d = i2;
            this.f73852e = i3;
            this.f73853f = str2;
            this.f73854g = i4;
            this.f73855h = aVar;
        }
    }

    public final int aK_() {
        return 4;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((SearchMix) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    /* renamed from: a_ */
    public final void mo56532a_(List<? extends Aweme> list) {
        super.mo56532a_(list);
    }

    public final void refreshList(Object... objArr) {
        if (objArr.length == 1) {
            m66938a(this.f73847b, 0, 0, 10, "", 1, this.f73859f);
            return;
        }
        m66938a((String) objArr[1], 0, objArr[2].intValue(), 10, "", objArr[3].intValue(), (C41412a) objArr[4]);
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        int i2;
        if (objArr.length == 1) {
            String str = this.f73847b;
            if (isDataEmpty()) {
                i2 = 0;
            } else {
                i2 = ((SearchMix) this.mData).cursor;
            }
            m66938a(str, i2, 1, 10, this.f73864k, 1, this.f73859f);
            return;
        }
        String str2 = (String) objArr[1];
        if (isDataEmpty()) {
            i = 0;
        } else {
            i = ((SearchMix) this.mData).cursor;
        }
        m66938a(str2, i, 1, 10, this.f73864k, objArr[3].intValue(), (C41412a) objArr[4]);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SearchMix searchMix) {
        boolean z;
        int i;
        boolean z2 = true;
        if (!(searchMix == null || C10193n.m20607a().mo18200a(GuideSearchUIOptimization.class, "search_new_gs_style", C10181b.m20511a().mo18175c().getSearchNewGsStyle(), 1) != 1 || searchMix.queryCorrectInfo == null)) {
            if (searchMix.guideSearchWordList != null) {
                searchMix.guideSearchWordList.clear();
            }
            if (mo56541h() != null) {
                mo56541h().clear();
            }
        }
        super.handleData(searchMix);
        if (searchMix == null || C9376b.m18558a((Collection<T>) searchMix.awemeList)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            ArrayList arrayList = new ArrayList();
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
                if (!(updateAweme == null || updateAweme.getAwemeRawAd() == null || TextUtils.isEmpty(updateAweme.getAwemeRawAd().getEAdInfo()))) {
                    arrayList.add(updateAweme.getAwemeRawAd().getEAdInfo());
                }
            }
            C9376b.m18558a((Collection<T>) arrayList);
            int i3 = this.mListQueryType;
            if (i3 != 1) {
                if (i3 == 4) {
                    mo56535b(list);
                    SearchMix searchMix2 = (SearchMix) this.mData;
                    if (!searchMix.hasMore || !((SearchMix) this.mData).hasMore) {
                        z2 = false;
                    }
                    searchMix2.hasMore = z2;
                    ((SearchMix) this.mData).cursor = searchMix.cursor;
                }
                return;
            }
            this.mData = searchMix;
            mo56532a_(list);
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchMix;
                mo56536c();
            }
            if (this.mData != null) {
                ((SearchMix) this.mData).hasMore = false;
            }
        }
    }

    /* renamed from: a */
    private void m66938a(String str, int i, int i2, int i3, String str2, int i4, C41412a aVar) {
        String str3 = str;
        this.f73847b = str3;
        this.f73859f = C41413b.m91227b(aVar);
        C28125a aVar2 = new C28125a(str3, i, i2, 10, str2, i4, aVar);
        aVar2.f73843a = this.f73860g;
        this.f73861h = aVar2;
        C23566n.m57766a().mo48750a(this.mHandler, aVar2, 0);
    }
}
