package com.p683ss.android.ugc.aweme.sticker.types.unlock;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.unlock.UnlockedStickerListResponse */
public class UnlockedStickerListResponse {
    @C17952c(mo34828a = "status_code")
    int code;
    @C17952c(mo34828a = "sticker_ids")
    List<String> idList;
    @C17952c(mo34828a = "status_msg")
    String message;
    @C17952c(mo34828a = "texts")
    List<LockStickerTextBean> textBeanList;

    public int getCode() {
        return this.code;
    }

    public List<String> getIdList() {
        return this.idList;
    }

    public String getMessage() {
        return this.message;
    }

    public List<LockStickerTextBean> getTextBeanList() {
        return this.textBeanList;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setIdList(List<String> list) {
        this.idList = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setTextBeanList(List<LockStickerTextBean> list) {
        this.textBeanList = list;
    }
}
