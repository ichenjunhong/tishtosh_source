package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import com.twitter.sdk.android.core.C52068b;
import com.twitter.sdk.android.core.C52077i;
import com.twitter.sdk.android.core.C52220o;
import com.twitter.sdk.android.core.C52229t;
import com.twitter.sdk.android.core.C52231v;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;

/* renamed from: com.twitter.sdk.android.core.identity.a */
public abstract class C52082a {

    /* renamed from: a */
    protected final int f129683a;

    /* renamed from: b */
    public final TwitterAuthConfig f129684b;

    /* renamed from: c */
    public final C52068b<C52231v> f129685c;

    /* renamed from: a */
    public abstract boolean mo108785a(Activity activity);

    C52082a(TwitterAuthConfig twitterAuthConfig, C52068b<C52231v> bVar, int i) {
        this.f129684b = twitterAuthConfig;
        this.f129685c = bVar;
        this.f129683a = i;
    }

    /* renamed from: a */
    public final boolean mo108784a(int i, int i2, Intent intent) {
        if (this.f129683a != i) {
            return false;
        }
        C52068b<C52231v> bVar = this.f129685c;
        if (bVar != null) {
            if (i2 == -1) {
                String stringExtra = intent.getStringExtra("tk");
                String stringExtra2 = intent.getStringExtra("ts");
                String stringExtra3 = intent.getStringExtra("screen_name");
                bVar.mo23366a(new C52077i<>(new C52231v(new TwitterAuthToken(stringExtra, stringExtra2), intent.getLongExtra("user_id", 0), stringExtra3), null));
            } else if (intent == null || !intent.hasExtra("auth_error")) {
                bVar.mo23367a((C52229t) new C52220o("Authorize failed."));
            } else {
                bVar.mo23367a((C52229t) (C52220o) intent.getSerializableExtra("auth_error"));
            }
        }
        return true;
    }
}
