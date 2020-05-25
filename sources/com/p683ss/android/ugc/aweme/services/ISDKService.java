package com.p683ss.android.ugc.aweme.services;

import android.content.Context;

/* renamed from: com.ss.android.ugc.aweme.services.ISDKService */
public interface ISDKService {

    /* renamed from: com.ss.android.ugc.aweme.services.ISDKService$SplitCallback */
    public interface SplitCallback {
        void onFail();

        void onSuccess(int i, int i2);
    }

    void split(Context context, int i, String str, String str2, String str3, String str4, boolean z, SplitCallback splitCallback);
}
