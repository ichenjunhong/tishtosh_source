package com.p683ss.android.ugc.aweme.tools.mvtemplate;

import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.r */
public final class C47301r {

    /* renamed from: a */
    public static final C47302a f119399a = new C47302a(null);

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.r$a */
    public static final class C47302a {
        private C47302a() {
        }

        public /* synthetic */ C47302a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        static String m102660a(Effect effect) {
            if (effect == null) {
                return null;
            }
            List<String> tags = effect.getTags();
            if (C9414h.m18630a(tags)) {
                return null;
            }
            for (String str : tags) {
                C52711k.m112236a((Object) str, "tag");
                if (C52830p.m112411b(str, "challenge:", false, 2, null)) {
                    String substring = str.substring(10);
                    C52711k.m112236a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                    return substring;
                }
            }
            return null;
        }
    }
}
