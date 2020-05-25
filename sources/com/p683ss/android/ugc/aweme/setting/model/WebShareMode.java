package com.p683ss.android.ugc.aweme.setting.model;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.model.WebShareMode */
public final class WebShareMode {
    @C17952c(mo34828a = "aweme_id")
    public final String awemeId;
    @C17952c(mo34828a = "mode")
    public final int mode;
    @C17952c(mo34828a = "platform_id")
    public final String platformId;

    public static /* synthetic */ WebShareMode copy$default(WebShareMode webShareMode, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = webShareMode.platformId;
        }
        if ((i2 & 2) != 0) {
            str2 = webShareMode.awemeId;
        }
        if ((i2 & 4) != 0) {
            i = webShareMode.mode;
        }
        return webShareMode.copy(str, str2, i);
    }

    public final WebShareMode copy(String str, String str2, int i) {
        C52711k.m112240b(str, "platformId");
        return new WebShareMode(str, str2, i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WebShareMode) {
                WebShareMode webShareMode = (WebShareMode) obj;
                if (C52711k.m112239a((Object) this.platformId, (Object) webShareMode.platformId) && C52711k.m112239a((Object) this.awemeId, (Object) webShareMode.awemeId)) {
                    if (this.mode == webShareMode.mode) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.platformId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.awemeId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.mode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebShareMode(platformId=");
        sb.append(this.platformId);
        sb.append(", awemeId=");
        sb.append(this.awemeId);
        sb.append(", mode=");
        sb.append(this.mode);
        sb.append(")");
        return sb.toString();
    }

    public WebShareMode(String str, String str2, int i) {
        C52711k.m112240b(str, "platformId");
        this.platformId = str;
        this.awemeId = str2;
        this.mode = i;
    }
}
