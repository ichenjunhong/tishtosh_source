package com.p683ss.android.ugc.aweme.shortvideo.model;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.shortvideo.api.MusicChoicesApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.MusicListModel */
public class MusicListModel extends C26832a<MusicList> {
    public boolean checkParams(Object... objArr) {
        return true;
    }

    public boolean sendRequest(Object... objArr) {
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public Object call() throws Exception {
                return MusicChoicesApi.m93191a();
            }
        }, 0);
        return true;
    }
}
