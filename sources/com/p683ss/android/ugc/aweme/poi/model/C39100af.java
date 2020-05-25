package com.p683ss.android.ugc.aweme.poi.model;

import com.bytedance.common.utility.C9431p;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.af */
public final class C39100af implements Serializable {
    @C17952c(mo34828a = "avatar_url")
    public String avatar;
    @C17952c(mo34828a = "claim_url")
    public String claimUrl;
    @C17952c(mo34828a = "crypto_owner_id")
    public String cryptedId;
    @C17952c(mo34828a = "enterprise_verify_reason")
    public String enterpriseVerifyReason;
    @C17952c(mo34828a = "owner_id")

    /* renamed from: id */
    public String f99739id;
    @C17952c(mo34828a = "owner_name")
    public String name;
    @C17952c(mo34828a = "open_day")
    public String openDay;
    @C17952c(mo34828a = "open_time")
    public String openTime;
    @C17952c(mo34828a = "signature")
    public String signature;

    public final String getUserSecId() {
        return this.cryptedId;
    }

    public final String appendBusinessTime(String[] strArr, String str) {
        if (C9431p.m18664a(this.openDay) || strArr == null) {
            return this.openTime;
        }
        StringBuilder sb = new StringBuilder();
        String[] split = this.openDay.split(",");
        if (split.length > strArr.length) {
            return this.openTime;
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < split.length; i3++) {
            if ("1".equalsIgnoreCase(split[i3])) {
                if (i < 0) {
                    sb.append(strArr[i3]);
                    i = i3;
                }
                if (i3 >= split.length - 1) {
                    i2 = i3;
                } else {
                    i2 = i3;
                }
            }
            if (i != i2) {
                sb.append(str);
                sb.append(strArr[i2]);
            }
            sb.append(",");
            i = -1;
            i2 = -1;
        }
        if (sb.length() > 0) {
            if (sb.lastIndexOf(",") == sb.length() - 1) {
                sb.replace(sb.lastIndexOf(","), sb.length(), " ");
            } else {
                sb.append(" ");
            }
        }
        if (!C9431p.m18664a(this.openTime)) {
            sb.append(this.openTime);
        }
        return sb.toString();
    }
}
