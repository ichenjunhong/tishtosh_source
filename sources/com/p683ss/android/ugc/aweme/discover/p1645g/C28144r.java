package com.p683ss.android.ugc.aweme.discover.p1645g;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.discover.api.SearchApi;
import com.p683ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p683ss.android.ugc.aweme.discover.model.SearchMusicList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.g.r */
public final class C28144r extends C28127h<SearchMusic, SearchMusicList> {

    /* renamed from: b */
    public String f73912b;

    /* renamed from: com.ss.android.ugc.aweme.discover.g.r$a */
    class C28146a extends C28118b {

        /* renamed from: b */
        final String f73913b;

        /* renamed from: c */
        final int f73914c;

        /* renamed from: d */
        final int f73915d;

        /* renamed from: e */
        final int f73916e;

        /* renamed from: f */
        final String f73917f;

        /* renamed from: g */
        final int f73918g;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Object mo56525b() throws Exception {
            if (TextUtils.isEmpty(this.f73913b)) {
                return SearchApi.m66830b((long) this.f73914c, this.f73916e);
            }
            return SearchApi.m66831b(this.f73913b, (long) this.f73914c, this.f73916e, this.f73915d, C28144r.this.f73862i, this.f73917f, C28144r.this.mo56537d(), this.f73918g);
        }

        private C28146a(String str, int i, int i2, int i3, String str2, int i4) {
            this.f73913b = str;
            this.f73914c = i;
            this.f73915d = i2;
            this.f73916e = i3;
            this.f73917f = str2;
            this.f73918g = i4;
        }
    }

    public final int aK_() {
        return 1;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((SearchMusicList) this.mData).hasMore) {
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
            i = ((SearchMusicList) this.mData).cursor;
        }
        m67019a(str, i, 1, 20, this.f73864k, objArr[3].intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SearchMusicList searchMusicList) {
        boolean z;
        super.handleData(searchMusicList);
        List<SearchMusic> list = searchMusicList.searchMusicList;
        boolean z2 = false;
        if (searchMusicList == null || C9376b.m18558a((Collection<T>) list)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            for (SearchMusic requestId : list) {
                requestId.setRequestId(this.f73863j);
            }
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = searchMusicList;
                ((SearchMusicList) this.mData).musicList = new ArrayList();
                mo56532a_(list);
            } else if (i == 4) {
                mo56535b(list);
                SearchMusicList searchMusicList2 = (SearchMusicList) this.mData;
                if (searchMusicList.hasMore && ((SearchMusicList) this.mData).hasMore) {
                    z2 = true;
                }
                searchMusicList2.hasMore = z2;
                ((SearchMusicList) this.mData).cursor = searchMusicList.cursor;
            }
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchMusicList;
                mo56536c();
            }
            if (this.mData != null) {
                ((SearchMusicList) this.mData).hasMore = false;
            }
        }
    }

    public final void refreshList(Object... objArr) {
        if (objArr.length >= 5) {
            m67019a((String) objArr[1], 0, objArr[2].intValue(), objArr[3].intValue(), "", objArr[4].intValue());
            return;
        }
        m67019a((String) objArr[1], 0, objArr[2].intValue(), 20, "", objArr[3].intValue());
    }

    /* renamed from: a */
    private void m67019a(String str, int i, int i2, int i3, String str2, int i4) {
        String str3 = str;
        this.f73912b = str3;
        C28146a aVar = new C28146a(str3, i, i2, i3, str2, i4);
        aVar.f73843a = this.f73860g;
        this.f73861h = aVar;
        C23566n.m57766a().mo48750a(this.mHandler, aVar, 0);
    }
}
