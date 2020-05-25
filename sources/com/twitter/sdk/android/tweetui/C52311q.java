package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.internal.scribe.C52144aa;
import com.twitter.sdk.android.core.internal.scribe.C52158e.C52159a;
import com.twitter.sdk.android.core.models.C52209m;
import java.util.ArrayList;

/* renamed from: com.twitter.sdk.android.tweetui.q */
final class C52311q implements C52310p {

    /* renamed from: a */
    final C52312r f130266a;

    C52311q(C52312r rVar) {
        this.f130266a = rVar;
    }

    /* renamed from: a */
    public final void mo109119a(C52209m mVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C52144aa.fromTweet(mVar));
        this.f130266a.mo109122a(new C52159a().mo108873a("tfw").mo108875b("android").mo108876c("tweet").mo108878e("actions").mo108879f("share").mo108874a(), arrayList);
    }

    /* renamed from: b */
    public final void mo109120b(C52209m mVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C52144aa.fromTweet(mVar));
        this.f130266a.mo109122a(new C52159a().mo108873a("tfw").mo108875b("android").mo108876c("tweet").mo108878e("actions").mo108879f("favorite").mo108874a(), arrayList);
    }

    /* renamed from: c */
    public final void mo109121c(C52209m mVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C52144aa.fromTweet(mVar));
        this.f130266a.mo109122a(new C52159a().mo108873a("tfw").mo108875b("android").mo108876c("tweet").mo108878e("actions").mo108879f("unfavorite").mo108874a(), arrayList);
    }
}
