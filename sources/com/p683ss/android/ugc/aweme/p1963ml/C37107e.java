package com.p683ss.android.ugc.aweme.p1963ml;

import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.p1192ml.C19500e;
import com.p683ss.android.p1192ml.C19503f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1963ml.p1964ab.CommentPreloadExperiment.C37099a;
import com.p683ss.android.ugc.aweme.setting.model.MLModel;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.ml.e */
public final class C37107e extends C19500e {
    C37107e(C19503f fVar) {
        super(fVar);
    }

    /* renamed from: a */
    public final void mo76386a(Aweme aweme, Map<String, Object> map) {
        try {
            if (mo40665b()) {
                if (mo40670f()) {
                    MLModel a = C37099a.m83330a();
                    List a2 = this.f53850c.mo40659a(map, mo40667c(), mo40668d(), mo40669e(), null);
                    if (a != null) {
                        int i = 0;
                        if (((String) a2.get(0)).equalsIgnoreCase("true")) {
                            if (a.params != null && a.params.length > 0) {
                                i = a.params[0];
                            }
                            aweme.getPreload().commentPreload = i;
                        }
                    }
                }
            }
        } catch (Exception e) {
            C9220a.m18311a((Throwable) e);
        }
    }
}
