package com.p683ss.android.ugc.aweme.services;

import android.content.Context;
import com.p683ss.android.common.config.AppConfig;
import com.p683ss.android.ugc.aweme.utils.C47912gd;
import com.p683ss.android.ugc.awemepushapi.C48426a;

/* renamed from: com.ss.android.ugc.aweme.services.MainServiceForPush */
public class MainServiceForPush implements C48426a {
    public String getDefaultUninstallQuestionUrl() {
        return C47912gd.m103637a().toString();
    }

    public String filterUrl(Context context, String str) {
        return AppConfig.getInstance(context).filterUrl(str);
    }
}
