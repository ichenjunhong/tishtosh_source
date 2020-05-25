package com.p683ss.android.ugc.aweme.tutorial.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.tutorial.p2374a.C47377d;
import p2628d.p2639f.p2641b.C52707g;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.tutorial.api.TutorialAwemeListApi */
public final class TutorialAwemeListApi {

    /* renamed from: a */
    public static final String f119567a = Api.f61282b;

    /* renamed from: b */
    public static final C47379a f119568b = new C47379a(null);

    /* renamed from: com.ss.android.ugc.aweme.tutorial.api.TutorialAwemeListApi$TutorialAwemeListRequest */
    public interface TutorialAwemeListRequest {
        @C53075f(mo110603a = "/aweme/v1/tutorial/aweme/")
        C17832m<C47377d> getTutorialAwemeList(@C53089t(mo110619a = "tutorial_id") String str, @C53089t(mo110619a = "cursor") long j, @C53089t(mo110619a = "count") int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.api.TutorialAwemeListApi$a */
    public static final class C47379a {
        private C47379a() {
        }

        public /* synthetic */ C47379a(C52707g gVar) {
            this();
        }
    }
}
