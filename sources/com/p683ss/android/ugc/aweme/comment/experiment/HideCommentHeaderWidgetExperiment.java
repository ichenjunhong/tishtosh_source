package com.p683ss.android.ugc.aweme.comment.experiment;

import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;

@C10178a(mo18163a = "hide_comment_header_widget")
/* renamed from: com.ss.android.ugc.aweme.comment.experiment.HideCommentHeaderWidgetExperiment */
public final class HideCommentHeaderWidgetExperiment {
    @C10179b(mo18165a = true)
    public static final int DEFAULT = 0;
    public static final HideCommentHeaderWidgetExperiment INSTANCE = new HideCommentHeaderWidgetExperiment();
    @C10179b
    public static final int STYLE_HIDE_MICRO_APP = 1;
    @C10179b
    public static final int STYLE_HIDE_POI = 2;
    @C10179b
    public static final int STYLE_HIDE_SHOPPING_CART = 3;

    private HideCommentHeaderWidgetExperiment() {
    }
}
