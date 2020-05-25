package com.p683ss.android.ugc.aweme.music.presenter;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.choosemusic.p1513g.C24954a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.music.api.MusicApi;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.model.MusicList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.u */
public final class C37426u extends C26875a<Music, MusicList> {
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List<Music> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((MusicList) this.mData).items;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((MusicList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        m83766a(1, 20);
    }

    public final void loadMoreList(Object... objArr) {
        m83766a((long) ((MusicList) this.mData).radioCursor, 20);
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        MusicList musicList = (MusicList) obj;
        boolean z2 = false;
        if (musicList == null || C9376b.m18558a((Collection<T>) musicList.items)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = musicList;
            } else if (i == 4) {
                ((MusicList) this.mData).items.addAll(musicList.items);
                ((MusicList) this.mData).cursor = musicList.getCursor();
                ((MusicList) this.mData).radioCursor = musicList.radioCursor;
                MusicList musicList2 = (MusicList) this.mData;
                if (musicList.isHasMore() && ((MusicList) this.mData).isHasMore()) {
                    z2 = true;
                }
                musicList2.setHasMore(z2);
            }
        } else {
            if (this.mData != null) {
                ((MusicList) this.mData).setHasMore(false);
            }
        }
    }

    /* renamed from: a */
    private void m83766a(final long j, int i) {
        C23566n.m57766a().mo48750a(this.mHandler, new Callable(20) {
            public final Object call() throws Exception {
                long j = j;
                int i = 20;
                if (C24954a.m60699b()) {
                    return (MusicList) MusicApi.f95243a.fetchCommerceMusicHotList(j).get();
                }
                return (MusicList) MusicApi.f95243a.fetchMusicHotList(j).get();
            }
        }, 0);
    }
}
