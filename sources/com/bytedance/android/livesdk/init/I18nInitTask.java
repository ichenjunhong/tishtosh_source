package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.p179a.C2941a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.i18n.C7676b;
import com.bytedance.android.livesdk.p392l.C7734a;
import java.util.Arrays;
import java.util.List;

@C2941a(mo7578a = 1)
public class I18nInitTask extends C7734a {
    public List<Integer> preTasks() {
        return Arrays.asList(new Integer[]{Integer.valueOf(4)});
    }

    public void run() {
        C7676b.m15696a().mo14037a(TTLiveSDKContext.getHostService().mo10308a().currentLocale());
    }
}
