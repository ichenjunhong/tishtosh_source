package com.p683ss.android.ugc.aweme.filter.repository.internal.p1749b;

import android.net.Uri;
import com.p683ss.android.ugc.aweme.effectplatform.C29240a;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31550d;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31491d;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31494g;
import com.p683ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.p683ss.android.ugc.aweme.utils.C47909ga;
import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.b.a */
public final class C31547a {

    /* renamed from: a */
    private static final C31550d f82511a = new C31550d("", "", "");

    /* renamed from: a */
    public static final C31550d m73408a() {
        return f82511a;
    }

    /* renamed from: a */
    public static final C31491d m73406a(int i) {
        C31491d dVar = new C31491d(i, C31494g.FILTER_STATE_UNKNOWN, "", "", "");
        return dVar;
    }

    /* renamed from: c */
    private static int m73411c(Effect effect) {
        C52711k.m112240b(effect, "$this$getFilterId");
        try {
            return Integer.parseInt(effect.getEffectId());
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: b */
    private static String m73410b(Effect effect) {
        C52711k.m112240b(effect, "$this$getFilterEnName");
        List<String> tags = effect.getTags();
        if (tags == null || tags.isEmpty()) {
            return null;
        }
        for (String str : tags) {
            C52711k.m112236a((Object) str, "tag");
            if (C52830p.m112411b(str, "pinyin:", false, 2, null)) {
                String substring = str.substring(7);
                C52711k.m112236a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                return substring;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final C31493f m73407a(Effect effect) {
        C52711k.m112240b(effect, "effect");
        int c = m73411c(effect);
        String name = effect.getName();
        C52711k.m112236a((Object) name, "effect.name");
        String b = m73410b(effect);
        ToolsUrlModel a = C47909ga.m103632a(C29240a.m68865a(effect.getFileUrl()));
        List tags = effect.getTags();
        C52711k.m112236a((Object) tags, "effect.tags");
        UrlModel iconUrl = effect.getIconUrl();
        C52711k.m112236a((Object) iconUrl, "effect.iconUrl");
        C31493f fVar = new C31493f(c, name, b, a, tags, Uri.parse((String) iconUrl.getUrlList().get(0)));
        return fVar;
    }

    /* renamed from: a */
    public static final void m73409a(C31491d dVar, C31459g gVar) {
        C52711k.m112240b(dVar, "filterInfo");
        C52711k.m112240b(gVar, "filterBean");
        gVar.f82331h = dVar.f82399c;
        gVar.f82332i = dVar.f82400d;
        gVar.f82330g = dVar.f82401e;
    }
}
