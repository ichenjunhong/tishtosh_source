package com.p683ss.android.ugc.aweme.comment.widget;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.widget.b */
public final class C25425b implements InputFilter {

    /* renamed from: a */
    private final int f67256a;

    public C25425b(int i) {
        this.f67256a = i;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.f67256a - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            if (!TextUtils.isEmpty(charSequence)) {
                C10691a.m21545b((Context) C32463a.m75161a(), C32463a.m75161a().getResources().getString(R.string.dd_, new Object[]{Integer.valueOf(this.f67256a)})).mo19066a();
            }
            return "";
        } else if (length >= i2 - i) {
            return null;
        } else {
            int i5 = length + i;
            if (Character.isHighSurrogate(charSequence.charAt(i5 - 1))) {
                i5--;
                if (i5 == i) {
                    C10691a.m21545b((Context) C32463a.m75161a(), C32463a.m75161a().getResources().getString(R.string.dd_, new Object[]{Integer.valueOf(this.f67256a)})).mo19066a();
                    return "";
                }
            }
            C10691a.m21545b((Context) C32463a.m75161a(), C32463a.m75161a().getResources().getString(R.string.dd_, new Object[]{Integer.valueOf(this.f67256a)})).mo19066a();
            return charSequence.subSequence(i, i5);
        }
    }
}
