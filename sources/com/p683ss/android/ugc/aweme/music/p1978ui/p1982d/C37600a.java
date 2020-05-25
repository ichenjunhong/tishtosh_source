package com.p683ss.android.ugc.aweme.music.p1978ui.p1982d;

import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.model.OriginalMusicList;
import com.p683ss.android.ugc.aweme.music.service.MusicDetailService;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.music.ui.d.a */
public final class C37600a extends C26875a<Music, OriginalMusicList> {
    public final List<Music> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((OriginalMusicList) this.mData).musicList;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((OriginalMusicList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 3) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        m84043a(objArr[1], objArr[2], ((OriginalMusicList) this.mData).cursor, 10);
    }

    public final void refreshList(Object... objArr) {
        m84043a(objArr[1], objArr[2], 0, 10);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        OriginalMusicList originalMusicList = (OriginalMusicList) obj;
        boolean z2 = false;
        if (originalMusicList == null || C9376b.m18558a((Collection<T>) originalMusicList.musicList)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = originalMusicList;
            } else if (i == 4) {
                ((OriginalMusicList) this.mData).musicList.addAll(originalMusicList.musicList);
                ((OriginalMusicList) this.mData).cursor = originalMusicList.cursor;
                OriginalMusicList originalMusicList2 = (OriginalMusicList) this.mData;
                if (originalMusicList.hasMore && ((OriginalMusicList) this.mData).hasMore) {
                    z2 = true;
                }
                originalMusicList2.hasMore = z2;
            }
        } else {
            if (this.mData != null) {
                ((OriginalMusicList) this.mData).hasMore = false;
            }
        }
    }

    /* renamed from: a */
    private void m84043a(String str, String str2, int i, int i2) {
        C23566n a = C23566n.m57766a();
        C9381g gVar = this.mHandler;
        final String str3 = str;
        final String str4 = str2;
        final int i3 = i;
        C376011 r1 = new Callable(10) {
            public final Object call() throws Exception {
                return MusicDetailService.createIMusicDetailServicebyMonsterPlugin().fetchOriginalMusicList(str3, str4, i3, 10);
            }
        };
        a.mo48750a(gVar, r1, 0);
    }
}
