package com.p683ss.android.ugc.aweme.feedback.reply;

import com.p683ss.android.ugc.aweme.feedback.reply.FeedbackNewestReplyApi.C31290a;
import java.util.concurrent.Callable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feedback.reply.b */
final /* synthetic */ class C31293b implements Callable {

    /* renamed from: a */
    private final C31290a f82041a;

    C31293b(C31290a aVar) {
        this.f82041a = aVar;
    }

    public final Object call() {
        T t = FeedbackNewestReplyApi.f82035a.getNewestReply().execute().f33552b;
        C52711k.m112236a((Object) t, "api.getNewestReply().execute().body()");
        return (C31294c) t;
    }
}
