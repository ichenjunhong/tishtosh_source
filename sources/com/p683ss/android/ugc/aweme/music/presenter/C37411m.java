package com.p683ss.android.ugc.aweme.music.presenter;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.choosemusic.p1513g.C24954a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.music.api.MusicApi;
import com.p683ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p683ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.m */
public final class C37411m extends C26875a<Music, CollectedMusicList> {
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List<Music> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((CollectedMusicList) this.mData).items;
    }

    public C37411m() {
        CollectedMusicList collectedMusicList = new CollectedMusicList();
        collectedMusicList.items = new ArrayList();
        collectedMusicList.setHasMore(true);
        this.mData = collectedMusicList;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((CollectedMusicList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        m83736a(0, 12);
    }

    public final void loadMoreList(Object... objArr) {
        m83736a(((CollectedMusicList) this.mData).cursor, 10);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        CollectedMusicList collectedMusicList = (CollectedMusicList) obj;
        boolean z2 = false;
        if (collectedMusicList == null || C9376b.m18558a((Collection<T>) collectedMusicList.items)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = collectedMusicList;
            } else if (i == 4) {
                if (this.mData == null) {
                    this.mData = collectedMusicList;
                    return;
                }
                List<Music> list = ((CollectedMusicList) this.mData).items;
                List<Music> list2 = collectedMusicList.items;
                List<Music> list3 = ((CollectedMusicList) this.mData).items;
                ArrayList arrayList = new ArrayList();
                for (Music music : list2) {
                    arrayList.add(music);
                    for (Music mid : list3) {
                        if (music.getMid().equals(mid.getMid())) {
                            arrayList.remove(music);
                        }
                    }
                }
                list.addAll(arrayList);
                ((CollectedMusicList) this.mData).cursor = collectedMusicList.cursor;
                CollectedMusicList collectedMusicList2 = (CollectedMusicList) this.mData;
                if (collectedMusicList.isHasMore() && ((CollectedMusicList) this.mData).isHasMore()) {
                    z2 = true;
                }
                collectedMusicList2.setHasMore(z2);
            }
        } else {
            if (this.mData != null) {
                ((CollectedMusicList) this.mData).setHasMore(false);
            }
        }
    }

    /* renamed from: a */
    private void m83736a(final int i, final int i2) {
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                int i = i;
                int i2 = i2;
                if (C24954a.m60699b()) {
                    return (CollectedMusicList) MusicApi.f95243a.fetchUserCollectedMusicList(i, i2, "commerce").get();
                }
                return (CollectedMusicList) MusicApi.f95243a.fetchUserCollectedMusicList(i, i2, "").get();
            }
        }, 0);
    }
}
