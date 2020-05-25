package com.p683ss.android.ugc.aweme.tools.music.p2366e;

import com.google.p1057b.p1058a.C17410f;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.discover.model.CommerceChallengeTask;
import com.p683ss.android.ugc.aweme.discover.model.TaskAnchorInfo;
import com.p683ss.android.ugc.aweme.discover.model.TaskMentionedUser;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.music.e.a */
public final class C47195a implements C17410f<Challenge, AVChallenge> {

    /* renamed from: a */
    public static final C47196a f119155a = new C47196a(null);

    /* renamed from: com.ss.android.ugc.aweme.tools.music.e.a$a */
    public static final class C47196a {
        private C47196a() {
        }

        public /* synthetic */ C47196a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo33734a(Object obj) {
        return m102452a((Challenge) obj);
    }

    /* renamed from: a */
    public static AVChallenge m102452a(Challenge challenge) {
        List<TaskMentionedUser> list;
        AVChallenge aVChallenge = new AVChallenge();
        if (challenge == null) {
            C52711k.m112234a();
        }
        aVChallenge.cid = challenge.getCid();
        aVChallenge.challengeName = challenge.getChallengeName();
        aVChallenge.stickerId = challenge.getStickerId();
        aVChallenge.type = challenge.getType();
        aVChallenge.viewCount = challenge.getViewCount();
        aVChallenge.userCount = challenge.getUserCount();
        aVChallenge.isCommerce = challenge.isCommerce();
        CommerceChallengeTask commerceChallengeTask = challenge.getCommerceChallengeTask();
        TaskAnchorInfo taskAnchorInfo = null;
        if (commerceChallengeTask != null) {
            list = commerceChallengeTask.getMentionedUsers();
        } else {
            list = null;
        }
        aVChallenge.mentionedUsers = list;
        CommerceChallengeTask commerceChallengeTask2 = challenge.getCommerceChallengeTask();
        if (commerceChallengeTask2 != null && commerceChallengeTask2.getShouldAddAnchor()) {
            CommerceChallengeTask commerceChallengeTask3 = challenge.getCommerceChallengeTask();
            if (commerceChallengeTask3 != null) {
                taskAnchorInfo = commerceChallengeTask3.getAnchor();
            }
            aVChallenge.anchor = taskAnchorInfo;
        }
        return aVChallenge;
    }
}
