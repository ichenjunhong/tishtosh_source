package com.bytedance.android.livesdk.schema;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.schema.interfaces.C8263c;

/* renamed from: com.bytedance.android.livesdk.schema.e */
public final class C8255e implements C8263c {
    public final boolean canHandle(Uri uri) {
        return TextUtils.equals("sign", uri.getHost());
    }

    public final boolean handle(Context context, Uri uri) {
        TTLiveSDKContext.getHostService().mo10313f().mo14432b(context, uri.getQueryParameter("url"));
        return true;
    }
}
