package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.EncryptedVideoContent */
public final class EncryptedVideoContent implements Serializable {
    @C17952c(mo34828a = "skey")
    private String secretKey;
    @C17952c(mo34828a = "md5")
    private String sourceMD5;
    @C17952c(mo34828a = "tkey")
    private String tosKey;

    public final String getSecretKey() {
        return this.secretKey;
    }

    public final String getSourceMD5() {
        return this.sourceMD5;
    }

    public final String getTosKey() {
        return this.tosKey;
    }

    public final void setSecretKey(String str) {
        this.secretKey = str;
    }

    public final void setSourceMD5(String str) {
        this.sourceMD5 = str;
    }

    public final void setTosKey(String str) {
        this.tosKey = str;
    }
}
