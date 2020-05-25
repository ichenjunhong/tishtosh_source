package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent */
public class BaseContent implements Serializable {
    @C17952c(mo34828a = "ext")
    SystemContent extContent;
    @C17952c(mo34828a = "is_card")
    public boolean isCard;
    private long mSendStartTime;
    protected String msgHint = "";
    @C17952c(mo34828a = "prev_id")
    Long prevId;
    @C17952c(mo34828a = "root_id")
    Long rootId;
    @C17952c(mo34828a = "aweType")
    int type;

    public SharePackage generateSharePackage() {
        return null;
    }

    public int getType() {
        return this.type;
    }

    public boolean isValid() {
        return true;
    }

    public void tryInit() {
    }

    public SystemContent getExtContent() {
        setSystem(this.extContent);
        return this.extContent;
    }

    public String getMsgHint() {
        tryInit();
        return this.msgHint;
    }

    public Long getSendStartTime() {
        return Long.valueOf(this.mSendStartTime);
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setExtContent(SystemContent systemContent) {
        setSystem(systemContent);
        this.extContent = systemContent;
    }

    public void setSendStartTime(Long l) {
        this.mSendStartTime = l.longValue();
    }

    public void setSystem(SystemContent systemContent) {
        if (systemContent != null) {
            systemContent.setType(100);
        }
    }

    public static void wrapForward(BaseContent baseContent, long j) {
        if (baseContent != null && j > 0) {
            baseContent.prevId = Long.valueOf(j);
            if (baseContent.rootId == null || baseContent.rootId.longValue() <= 0) {
                baseContent.rootId = Long.valueOf(j);
            }
        }
    }

    public String wrapMsgHint(boolean z, boolean z2, String str) {
        return getMsgHint();
    }
}
