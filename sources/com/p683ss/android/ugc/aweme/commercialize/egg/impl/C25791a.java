package com.p683ss.android.ugc.aweme.commercialize.egg.impl;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25773a;
import com.p683ss.android.ugc.aweme.feed.model.EditHint;
import com.p683ss.android.ugc.aweme.feed.model.ItemCommentEggData;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.a */
public final class C25791a {

    /* renamed from: a */
    public static C25773a f68203a;

    /* renamed from: b */
    public static List<C25773a> f68204b;

    /* renamed from: c */
    public static List<? extends EditHint> f68205c;

    /* renamed from: d */
    public static final C25791a f68206d = new C25791a();

    private C25791a() {
    }

    /* renamed from: a */
    public static void m62417a(C25773a aVar) {
        f68203a = aVar;
    }

    /* renamed from: a */
    public static boolean m62418a(ItemCommentEggData itemCommentEggData) {
        if (itemCommentEggData == null) {
            return false;
        }
        String[] strArr = {itemCommentEggData.getEggId(), itemCommentEggData.getFileType(), itemCommentEggData.getMaterialUrl(), itemCommentEggData.getRegex()};
        for (int i = 0; i < 4; i++) {
            if (TextUtils.isEmpty(strArr[i])) {
                return false;
            }
        }
        return true;
    }
}
