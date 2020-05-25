package com.p683ss.android.ugc.aweme.account.util;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.account.login.C21053aa;

/* renamed from: com.ss.android.ugc.aweme.account.util.ThirdLoginSetting */
public class ThirdLoginSetting {
    public static final String SAVE_KEY = "i18n_third_login_strategy";
    @C17952c(mo34828a = "show_num")
    private int directShowNumber;
    @C17952c(mo34828a = "order")
    private String order;

    public int getDirectShowNumber() {
        return this.directShowNumber;
    }

    public C21053aa[] getOrder() {
        if (TextUtils.isEmpty(this.order)) {
            return null;
        }
        String[] split = this.order.split(",");
        C21053aa[] aaVarArr = new C21053aa[split.length];
        for (int i = 0; i < split.length; i++) {
            aaVarArr[i] = C21053aa.valueOf(split[i].toUpperCase());
        }
        return aaVarArr;
    }
}
