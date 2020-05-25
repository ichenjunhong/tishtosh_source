package com.p683ss.android.ugc.aweme.app;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;

/* renamed from: com.ss.android.ugc.aweme.app.ag */
public final class C22929ag implements C22955an {
    /* renamed from: a */
    public final boolean mo47703a(Context context, String str) {
        if (context instanceof FragmentActivity) {
            return TextUtils.equals(HomePageDataViewModel.m75866a((FragmentActivity) context).mo69848a(), str);
        }
        return false;
    }
}
