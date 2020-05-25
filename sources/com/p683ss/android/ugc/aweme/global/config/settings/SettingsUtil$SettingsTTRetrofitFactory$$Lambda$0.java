package com.p683ss.android.ugc.aweme.global.config.settings;

import android.text.TextUtils;
import com.squareup.wire.WireDeserializeErrorListener;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.SettingsUtil$SettingsTTRetrofitFactory$$Lambda$0 */
final /* synthetic */ class SettingsUtil$SettingsTTRetrofitFactory$$Lambda$0 implements WireDeserializeErrorListener {
    static final WireDeserializeErrorListener $instance = new SettingsUtil$SettingsTTRetrofitFactory$$Lambda$0();

    private SettingsUtil$SettingsTTRetrofitFactory$$Lambda$0() {
    }

    public final void onError(Class cls, String str, Throwable th) {
        StringBuilder sb = new StringBuilder("errorFiled:");
        sb.append(str);
        sb.append(" e.message:");
        sb.append(th.getMessage());
        TextUtils.isEmpty(sb.toString());
        SettingsUtil.m75694a(cls.getCanonicalName(), str, th, "", 1);
    }
}
