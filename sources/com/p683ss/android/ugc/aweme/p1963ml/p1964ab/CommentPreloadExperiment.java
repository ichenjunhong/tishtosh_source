package com.p683ss.android.ugc.aweme.p1963ml.p1964ab;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.p620a.C10180c;
import com.p683ss.android.ugc.aweme.setting.model.MLModel;

@C10178a(mo18163a = "comment_preload")
@C10180c
/* renamed from: com.ss.android.ugc.aweme.ml.ab.CommentPreloadExperiment */
public interface CommentPreloadExperiment {
    @C10179b
    public static final MLModel MODEL = null;

    /* renamed from: com.ss.android.ugc.aweme.ml.ab.CommentPreloadExperiment$a */
    public static class C37099a {
        /* renamed from: a */
        public static MLModel m83330a() {
            try {
                return (MLModel) C10181b.m20511a().mo18170a(CommentPreloadExperiment.class, false, "comment_preload", 31744, MLModel.class);
            } catch (Throwable unused) {
                return null;
            }
        }
    }
}
