package com.bytedance.android.livesdkapi.service;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.support.p030v4.app.C0649f;
import com.bytedance.android.livesdkapi.service.IReactNativeHost.Callback1;

public interface IReactNative {
    void createHalfScreenReactBoxDialog(String str, String str2, String str3, int i, int i2, int i3, int i4, String str4, Callback1<C0649f> callback1);

    void goRN(Context context, Uri uri);

    void initReactNative(Application application);
}
