package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.text.InputFilter;
import android.text.Spanned;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.af */
public final class C33359af implements InputFilter {

    /* renamed from: a */
    private final int f86508a;

    public C33359af(int i) {
        this.f86508a = i;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.f86508a - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            C9432q.m18676a(C11010c.m22280a(), C11010c.m22280a().getResources().getString(R.string.bkj));
            return "";
        } else if (length >= i2 - i) {
            return null;
        } else {
            int i5 = length + i;
            if (Character.isHighSurrogate(charSequence.charAt(i5 - 1))) {
                i5--;
                if (i5 == i) {
                    C9432q.m18676a(C11010c.m22280a(), C11010c.m22280a().getResources().getString(R.string.bkj));
                    return "";
                }
            }
            return charSequence.subSequence(i, i5);
        }
    }
}
