package com.p683ss.android.anywheredoor_api;

import android.content.Context;
import com.bytedance.retrofit2.p833c.C12727a;

/* renamed from: com.ss.android.anywheredoor_api.IAnyWhereInnerService */
public interface IAnyWhereInnerService {
    C12727a getNetworkInterceptor();

    void openAnyWhereDoorPage(Context context);

    boolean switchEnable(Context context, boolean z);

    boolean switchNetworkCounter(Context context, boolean z);
}
