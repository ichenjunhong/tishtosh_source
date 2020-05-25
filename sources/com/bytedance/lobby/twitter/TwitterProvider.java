package com.bytedance.lobby.twitter;

import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.lobby.C12311a;
import com.bytedance.lobby.C12324c;
import com.bytedance.lobby.internal.BaseProvider;
import com.twitter.sdk.android.core.C52190l;
import com.twitter.sdk.android.core.C52221p.C52223a;
import com.twitter.sdk.android.core.TwitterAuthConfig;

class TwitterProvider<T> extends BaseProvider<T> {

    /* renamed from: c */
    private static final boolean f32567c = C12311a.f32450a;

    /* renamed from: d */
    private Application f32568d;

    /* renamed from: d */
    public final void mo23331d() {
        String str = this.f32525b.f32488c;
        String str2 = "";
        Bundle bundle = this.f32525b.f32489d;
        if (bundle != null) {
            str2 = bundle.getString("twitter_consumer_secret");
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C52223a aVar = new C52223a(this.f32568d);
            aVar.f130041a = Boolean.valueOf(f32567c);
            C52190l.m111618a(aVar.mo108939a(new TwitterAuthConfig(this.f32525b.f32488c, str2)).mo108940a());
        } else if (f32567c) {
            throw new NullPointerException("Cannot initialize Twitter SDK with an incomplete consumer credentials.");
        }
    }

    TwitterProvider(Application application, C12324c cVar) {
        super(application, cVar);
        this.f32568d = application;
    }
}
