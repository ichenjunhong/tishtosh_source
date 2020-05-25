package com.p683ss.android.ugc.aweme.shortvideo.reaction;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23208an;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.ReactConfig;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.f */
final /* synthetic */ class C44428f implements Runnable {

    /* renamed from: a */
    private final C44418b f112393a;

    C44428f(C44418b bVar) {
        this.f112393a = bVar;
    }

    public final void run() {
        C44418b bVar = this.f112393a;
        if (bVar.f112366a != null) {
            String uuid = UUID.randomUUID().toString();
            Long valueOf = Long.valueOf(System.currentTimeMillis() - bVar.f112380o);
            C26890h.m65011a("shoot", C23089d.m56640a().mo47829a("creation_id", uuid).mo47829a("shoot_way", "react").mo47829a("group_id", uuid).f61491a);
            C23208an.m56934a(bVar.f112371f);
            String str = bVar.f112374i;
            String str2 = bVar.f112373h;
            ReactionParams reactionParams = new ReactionParams();
            reactionParams.videoPath = bVar.f112375j;
            reactionParams.wavPath = bVar.f112376k;
            reactionParams.reactionViewId = bVar.f112367b.getAid();
            reactionParams.reactionOriginId = (bVar.f112369d == null ? bVar.f112367b : bVar.f112369d).getAid();
            reactionParams.reactionFromId = bVar.f112368c.getAid();
            reactionParams.reactionFromAuthor = bVar.f112368c.getAuthor();
            reactionParams.nonReacted = bVar.f112370e;
            AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C44429g(bVar, uuid, valueOf, new ReactConfig(str, str2, reactionParams, 1000)));
            return;
        }
        bVar.mo90297c();
    }
}
