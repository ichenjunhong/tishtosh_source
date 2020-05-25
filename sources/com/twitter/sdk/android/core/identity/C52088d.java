package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import com.twitter.sdk.android.core.C52068b;
import com.twitter.sdk.android.core.C52231v;
import com.twitter.sdk.android.core.TwitterAuthConfig;

/* renamed from: com.twitter.sdk.android.core.identity.d */
final class C52088d extends C52082a {
    /* renamed from: a */
    public final boolean mo108785a(Activity activity) {
        Intent intent = new Intent(activity, OAuthActivity.class);
        intent.putExtra("auth_config", this.f129684b);
        activity.startActivityForResult(intent, this.f129683a);
        return true;
    }

    C52088d(TwitterAuthConfig twitterAuthConfig, C52068b<C52231v> bVar, int i) {
        super(twitterAuthConfig, bVar, i);
    }
}
