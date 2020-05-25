package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ai */
public final class C45385ai {

    /* renamed from: a */
    public static final C45385ai f114771a = new C45385ai();

    private C45385ai() {
    }

    /* renamed from: a */
    public static void m98942a(MentionEditText mentionEditText) {
        if (mentionEditText != null) {
            mentionEditText.mo95674e();
        }
    }

    /* renamed from: a */
    public static void m98941a(Context context, MentionEditText mentionEditText, String str) {
        ArrayList arrayList;
        if (!TextUtils.isEmpty(str)) {
            if (mentionEditText != null) {
                arrayList = mentionEditText.getStarAtlasExtraList();
            } else {
                arrayList = null;
            }
            if (C9376b.m18558a((Collection<T>) arrayList)) {
                if (context != null) {
                    Resources resources = context.getResources();
                    if (resources != null) {
                        int color = resources.getColor(R.color.zw);
                        if (mentionEditText != null) {
                            mentionEditText.setStarAtlasMentionTextColor(color);
                        }
                    }
                }
                if (mentionEditText != null) {
                    if (str == null) {
                        C52711k.m112234a();
                    }
                    mentionEditText.mo95670a(1, C52830p.m112401a(str, "#", "", false, 4, (Object) null), "", true);
                }
            }
        }
    }
}
