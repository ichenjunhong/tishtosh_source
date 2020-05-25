package com.p683ss.android.ugc.aweme.utils;

import com.p683ss.android.ugc.aweme.utils.C47871f.C47872a;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.h */
public final class C47926h {
    /* renamed from: a */
    public static final List<String> m103697a(List<String> list, C47804db dbVar) {
        C52711k.m112240b(list, "$this$getAdaptionPaths");
        C52711k.m112240b(dbVar, "type");
        return C47871f.m103560a(list, dbVar);
    }

    /* renamed from: a */
    public static final String m103696a(String str, C47804db dbVar) {
        C52711k.m112240b(str, "$this$getAdaptionPath");
        C52711k.m112240b(dbVar, "type");
        return C47872a.m103566a().mo95088b(str, dbVar);
    }

    /* renamed from: a */
    public static final String[] m103698a(String[] strArr, C47804db dbVar) {
        C52711k.m112240b(strArr, "$this$getAdaptionPaths");
        C52711k.m112240b(dbVar, "type");
        Object[] array = C47871f.m103560a(C52568f.m112068a(strArr), dbVar).toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
