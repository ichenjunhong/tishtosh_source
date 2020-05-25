package com.p683ss.android.ugc.aweme.main.story;

import com.p683ss.android.ugc.aweme.main.story.live.C36744d;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.main.story.c */
final /* synthetic */ class C36710c implements Callable {

    /* renamed from: a */
    private final C36707b f93841a;

    /* renamed from: b */
    private final String f93842b;

    /* renamed from: c */
    private final String f93843c;

    C36710c(C36707b bVar, String str, String str2) {
        this.f93841a = bVar;
        this.f93842b = str;
        this.f93843c = str2;
    }

    public final Object call() {
        C36707b bVar = this.f93841a;
        return (C36744d) C36707b.f93833d.fetchRecommendAvatars(bVar.f93834b, this.f93842b, this.f93843c).get();
    }
}
