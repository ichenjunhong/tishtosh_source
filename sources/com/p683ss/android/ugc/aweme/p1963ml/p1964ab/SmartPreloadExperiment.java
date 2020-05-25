package com.p683ss.android.ugc.aweme.p1963ml.p1964ab;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.p620a.C10180c;
import com.p683ss.android.ugc.aweme.setting.model.MLModel;

@C10178a(mo18163a = "playtime_ml")
@C10180c
/* renamed from: com.ss.android.ugc.aweme.ml.ab.SmartPreloadExperiment */
public interface SmartPreloadExperiment {
    @C10179b
    public static final MLModel MODEL = null;

    /* renamed from: com.ss.android.ugc.aweme.ml.ab.SmartPreloadExperiment$a */
    public static class C37101a {
        /* renamed from: a */
        public static MLModel m83332a() {
            try {
                return (MLModel) C10181b.m20511a().mo18170a(SmartPreloadExperiment.class, false, "playtime_ml", 31744, MLModel.class);
            } catch (Throwable unused) {
                return null;
            }
        }
    }
}
