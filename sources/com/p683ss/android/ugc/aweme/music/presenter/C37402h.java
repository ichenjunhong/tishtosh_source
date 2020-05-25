package com.p683ss.android.ugc.aweme.music.presenter;

import android.text.TextUtils;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.music.api.MusicApi;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.h */
public final class C37402h extends C26832a {
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 4) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                int intValue = ((Integer) objArr[0]).intValue();
                String str = (String) objArr[1];
                String str2 = (String) objArr[2];
                String str3 = (String) objArr[3];
                HashMap hashMap = new HashMap();
                hashMap.put("upload_type", String.valueOf(intValue));
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put("song_uri", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put("source_url", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    hashMap.put("title", str3);
                }
                NetUtil.putCommonParams(hashMap, true);
                MusicApi.f95243a.uploadLocalMusicInfo(hashMap).execute();
                return str3;
            }
        }, 0);
        return true;
    }
}
