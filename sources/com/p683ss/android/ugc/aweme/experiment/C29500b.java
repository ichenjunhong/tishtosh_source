package com.p683ss.android.ugc.aweme.experiment;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.RelationLabelHelper;

/* renamed from: com.ss.android.ugc.aweme.experiment.b */
public final class C29500b {

    /* renamed from: a */
    public static final C29500b f77281a = new C29500b();

    private C29500b() {
    }

    /* renamed from: a */
    private static boolean m69637a() {
        return FeedNewFollowLabelStyleExperiment.m69588a();
    }

    /* renamed from: b */
    private static boolean m69639b() {
        return FeedNewInteractiveLabelStyleExperiment.m69589a();
    }

    /* renamed from: a */
    public static final boolean m69638a(Aweme aweme) {
        if (FeedNewLabelStyleExperiment.m69590a() || ((m69637a() && RelationLabelHelper.hasNewFollowRelationLabel(aweme)) || (m69639b() && RelationLabelHelper.hasNewInteractiveRelationLabel(aweme)))) {
            return true;
        }
        return false;
    }
}
