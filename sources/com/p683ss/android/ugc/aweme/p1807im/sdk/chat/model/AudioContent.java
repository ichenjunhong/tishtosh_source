package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.AudioContent */
public class AudioContent extends BaseContent {
    private static String VOICE_HINT = "";
    @C17952c(mo34828a = "duration")
    long duration;
    @C17952c(mo34828a = "md5")
    String md5;
    @C17952c(mo34828a = "resource_url")
    UrlModel url;

    public long getDuration() {
        return this.duration;
    }

    public String getMd5() {
        return this.md5;
    }

    public UrlModel getUrl() {
        return this.url;
    }

    public String getMsgHint() {
        super.getMsgHint();
        return VOICE_HINT;
    }

    public void tryInit() {
        if (TextUtils.isEmpty(VOICE_HINT)) {
            Context a = C11010c.m22280a();
            if (a != null) {
                VOICE_HINT = a.getString(R.string.bnj);
            }
        }
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setUrl(UrlModel urlModel) {
        this.url = urlModel;
    }
}
