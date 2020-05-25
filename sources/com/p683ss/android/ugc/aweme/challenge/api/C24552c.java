package com.p683ss.android.ugc.aweme.challenge.api;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;

/* renamed from: com.ss.android.ugc.aweme.challenge.api.c */
public final class C24552c extends C23459a {
    @C17952c(mo34828a = "challenge")

    /* renamed from: d */
    Challenge f65006d;

    public final Challenge getChallenge() {
        return this.f65006d;
    }

    public final String getErrorMsg() {
        return this.f62522a;
    }

    public final String getPrompt() {
        return this.f62523b;
    }

    public C24552c(int i) {
        super(i);
    }

    public final void setChallenge(Challenge challenge) {
        this.f65006d = challenge;
    }

    public final C24552c setErrorMsg(String str) {
        this.f62522a = str;
        return this;
    }

    public final C24552c setPrompt(String str) {
        this.f62523b = str;
        return this;
    }
}
