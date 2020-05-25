package com.p683ss.android.ugc.aweme.shortvideo.p2265y;

import com.google.p1057b.p1058a.C17410f;
import com.google.p1057b.p1060c.C17593ar;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.discover.model.TaskMentionedUser;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.y.a */
public final class C45625a implements C17410f<Challenge, AVChallenge> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo33734a(Object obj) {
        return m99357a((Challenge) obj);
    }

    /* renamed from: a */
    public static ArrayList<AVChallenge> m99358a(List<Challenge> list) {
        return C17593ar.m43275a((Iterable<? extends E>) C17593ar.m43278a(list, new C45625a()));
    }

    /* renamed from: a */
    public static AVChallenge m99357a(Challenge challenge) {
        List<TaskMentionedUser> list;
        AVChallenge aVChallenge = new AVChallenge();
        aVChallenge.cid = challenge.getCid();
        aVChallenge.challengeName = challenge.getChallengeName();
        aVChallenge.stickerId = challenge.getStickerId();
        aVChallenge.type = challenge.getType();
        aVChallenge.viewCount = challenge.getViewCount();
        aVChallenge.userCount = challenge.getUserCount();
        aVChallenge.isCommerce = challenge.isCommerce();
        if (challenge.getCommerceChallengeTask() == null) {
            list = null;
        } else {
            list = challenge.getCommerceChallengeTask().getMentionedUsers();
        }
        aVChallenge.mentionedUsers = list;
        return aVChallenge;
    }
}
