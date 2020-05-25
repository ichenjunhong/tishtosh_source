package com.p683ss.android.ugc.aweme.p1807im.sdk.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.d */
public final class C34547d extends BaseResponse implements Serializable {
    @C17952c(mo34828a = "stickers")

    /* renamed from: a */
    private List<? extends C29366a> f89069a;

    public final List<C29366a> getEmojiList() {
        return this.f89069a;
    }

    public final void setEmojiList(List<? extends C29366a> list) {
        this.f89069a = list;
    }
}
