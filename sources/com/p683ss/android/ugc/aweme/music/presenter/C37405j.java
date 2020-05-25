package com.p683ss.android.ugc.aweme.music.presenter;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.experiment.ListParamOptExperiment;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.p683ss.android.ugc.aweme.music.api.MusicAwemeApi.MusicService;
import com.p683ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.j */
public final class C37405j extends C26875a<Aweme, MusicAwemeList> {

    /* renamed from: a */
    private int f95412a;

    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((MusicAwemeList) this.mData).items;
    }

    public final boolean isDataEmpty() {
        if ((this.mData == null || !((MusicAwemeList) this.mData).isHasMore()) && C9376b.m18558a((Collection<T>) getItems())) {
            return true;
        }
        return false;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((MusicAwemeList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 3) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean deleteItem(Object obj) {
        return C31190f.m72832a(getItems(), (Aweme) obj, this.mNotifyListeners);
    }

    public final void setItems(List<Aweme> list) {
        if (this.mData == null) {
            this.mData = new MusicAwemeList();
        }
        ((MusicAwemeList) this.mData).hasMore = 1;
        ((MusicAwemeList) this.mData).items = list;
    }

    /* renamed from: a */
    private static void m83732a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            String stackTraceString = Log.getStackTraceString(new Throwable());
            if (stackTraceString.length() > 1024) {
                stackTraceString = stackTraceString.substring(0, PreloadTask.BYTE_UNIT_NUMBER);
            }
            jSONObject.put("error_stack", stackTraceString);
            jSONObject.put("music_id", str);
        } catch (Exception unused) {
        }
        C23569o.m57779a("music_id_has_space", jSONObject);
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        long j;
        if (ListParamOptExperiment.m69615a()) {
            i = 21;
        } else {
            i = 20;
        }
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((MusicAwemeList) this.mData).cursor;
        }
        m83733a(str, j, i, objArr[2].intValue());
    }

    public final void refreshList(Object... objArr) {
        int i;
        if (ListParamOptExperiment.m69615a()) {
            i = 33;
        } else {
            i = 20;
        }
        m83733a((String) objArr[1], 0, i, objArr[2].intValue());
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        MusicAwemeList musicAwemeList = (MusicAwemeList) obj;
        C29981aa.m70153a().mo60162a(musicAwemeList.getRequestId(), musicAwemeList.logPb);
        if (musicAwemeList == null || (C9376b.m18558a((Collection<T>) musicAwemeList.items) && !musicAwemeList.isHasMore())) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (musicAwemeList.items != null) {
                int size = musicAwemeList.items.size();
                for (int i = 0; i < size; i++) {
                    Aweme updateAweme = C23324d.m57378a().updateAweme((Aweme) musicAwemeList.items.get(i));
                    IRequestIdService a = C23325e.m57379a();
                    StringBuilder sb = new StringBuilder();
                    sb.append(updateAweme.getAid());
                    sb.append(this.f95412a + 4000);
                    a.setRequestIdAndIndex(sb.toString(), musicAwemeList.getRequestId(), i);
                    musicAwemeList.items.set(i, updateAweme);
                }
            }
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = musicAwemeList;
            } else if (i2 == 4) {
                if (musicAwemeList.items != null) {
                    if (C9376b.m18558a((Collection<T>) ((MusicAwemeList) this.mData).items)) {
                        ((MusicAwemeList) this.mData).items = musicAwemeList.items;
                    } else {
                        C37396b.m83720a(((MusicAwemeList) this.mData).items, musicAwemeList.items, C37407k.f95418a);
                    }
                }
                ((MusicAwemeList) this.mData).cursor = musicAwemeList.cursor;
                ((MusicAwemeList) this.mData).hasMore = musicAwemeList.hasMore & ((MusicAwemeList) this.mData).hasMore;
            }
        } else {
            if (this.mData == null) {
                this.mData = new MusicAwemeList();
            }
            if (musicAwemeList == null) {
                ((MusicAwemeList) this.mData).hasMore = 0;
                return;
            }
            ((MusicAwemeList) this.mData).cursor = musicAwemeList.cursor;
            ((MusicAwemeList) this.mData).hasMore = musicAwemeList.hasMore;
        }
    }

    /* renamed from: a */
    private void m83733a(String str, long j, int i, int i2) {
        this.f95412a = i2;
        if (!TextUtils.isEmpty(str) && str.endsWith(" ")) {
            m83732a(str);
        }
        C23566n a = C23566n.m57766a();
        C9381g gVar = this.mHandler;
        final String str2 = str;
        final long j2 = j;
        final int i3 = i;
        final int i4 = i2;
        C374061 r2 = new Callable() {
            public final Object call() throws Exception {
                String str;
                String str2 = str2;
                long j = j2;
                int i = i3;
                int i2 = i4;
                if (i2 == 0) {
                    str = MusicAwemeApi.f95245b;
                } else {
                    str = MusicAwemeApi.f95246c;
                }
                String str3 = str;
                MusicService musicService = MusicAwemeApi.f95244a;
                if (str2 != null) {
                    str2 = str2.trim();
                }
                return (MusicAwemeList) musicService.queryMusicAwemeList(str3, str2, j, i, i2).get();
            }
        };
        a.mo48750a(gVar, r2, 0);
    }
}
