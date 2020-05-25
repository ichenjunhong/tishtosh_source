package com.p683ss.android.ugc.aweme.music.p1977e;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.discover.model.Position;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.e.h */
public final class C37384h {
    /* renamed from: a */
    public static SpannableString m83711a(Context context, String str, List<Position> list, int i) {
        if (str == null) {
            str = "";
        }
        if (context == null || TextUtils.isEmpty(str) || C9376b.m18558a((Collection<T>) list)) {
            return new SpannableString(str);
        }
        SpannableString spannableString = new SpannableString(str);
        for (Position position : list) {
            if (position != null) {
                int begin = position.getBegin() + 0;
                int end = position.getEnd() + 1 + 0;
                int length = str.length();
                int max = Math.max(0, begin);
                if (!TextUtils.isEmpty(spannableString) && max <= end && max < spannableString.length() && end <= spannableString.length()) {
                    spannableString.setSpan(new StyleSpan(0), max, end, 17);
                    spannableString.setSpan(new StyleSpan(1), end, length, 17);
                }
            }
        }
        return spannableString;
    }
}
