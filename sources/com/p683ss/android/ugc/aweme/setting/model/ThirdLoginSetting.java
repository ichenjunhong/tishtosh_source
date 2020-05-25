package com.p683ss.android.ugc.aweme.setting.model;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.login.C27966g;

/* renamed from: com.ss.android.ugc.aweme.setting.model.ThirdLoginSetting */
public class ThirdLoginSetting {
    public static final String SAVE_KEY = "i18n_third_login_strategy";
    @C17952c(mo34828a = "show_num")
    public int directShowNumber;
    @C17952c(mo34828a = "order")
    private String order;

    public C27966g[] getOrder() {
        if (TextUtils.isEmpty(this.order)) {
            return null;
        }
        String[] split = this.order.split(",");
        C27966g[] gVarArr = new C27966g[split.length];
        for (int i = 0; i < split.length; i++) {
            gVarArr[i] = C27966g.valueOf(split[i].toUpperCase());
        }
        return gVarArr;
    }
}
