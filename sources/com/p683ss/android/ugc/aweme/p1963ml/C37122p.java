package com.p683ss.android.ugc.aweme.p1963ml;

import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.p1192ml.C19500e;
import com.p683ss.android.p1192ml.C19503f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.player.C38847b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.ml.p */
public final class C37122p extends C19500e {

    /* renamed from: e */
    public volatile String f94771e;

    /* renamed from: f */
    public volatile float f94772f = -1.0f;

    C37122p(C19503f fVar) {
        super(fVar);
    }

    /* renamed from: a */
    public final void mo76395a(Aweme aweme, Map<String, Object> map) {
        String str;
        float f;
        try {
            if (mo40665b() && mo40670f() && map != null) {
                if (map.size() != 0) {
                    HashMap hashMap = new HashMap();
                    List a = this.f53850c.mo40659a(map, mo40667c(), mo40668d(), mo40669e(), hashMap);
                    if (a == null || a.size() <= 0) {
                        str = null;
                    } else {
                        str = (String) a.get(0);
                    }
                    this.f94771e = str;
                    C38847b.f98942b.mo78828a(this.f94771e);
                    if (this.f94771e == null || !hashMap.containsKey(this.f94771e)) {
                        f = -1.0f;
                    } else {
                        f = ((Float) hashMap.get(this.f94771e)).floatValue();
                    }
                    this.f94772f = f;
                    C38847b.f98942b.mo78827a(this.f94772f);
                }
            }
        } catch (Exception e) {
            C9220a.m18311a((Throwable) e);
        }
    }
}
