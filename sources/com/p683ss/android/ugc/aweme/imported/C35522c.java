package com.p683ss.android.ugc.aweme.imported;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.imported.c */
public final class C35522c implements InputFilter {

    /* renamed from: a */
    public boolean f91296a;

    /* renamed from: b */
    private final int f91297b = NormalGiftView.MASK_TRANSLATE_VALUE;

    public C35522c(int i) {
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.f91297b - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            if (!TextUtils.isEmpty(charSequence)) {
                C10691a.m21545b((Context) C32463a.m75161a(), C32463a.m75161a().getResources().getString(R.string.dd_, new Object[]{Integer.valueOf(this.f91297b)})).mo19066a();
                this.f91296a = true;
            }
            return "";
        } else if (length >= i2 - i) {
            return null;
        } else {
            int i5 = length + i;
            if (Character.isHighSurrogate(charSequence.charAt(i5 - 1))) {
                i5--;
                if (i5 == i) {
                    C10691a.m21545b((Context) C32463a.m75161a(), C32463a.m75161a().getResources().getString(R.string.dd_, new Object[]{Integer.valueOf(this.f91297b)})).mo19066a();
                    this.f91296a = true;
                    return "";
                }
            }
            C10691a.m21545b((Context) C32463a.m75161a(), C32463a.m75161a().getResources().getString(R.string.dd_, new Object[]{Integer.valueOf(this.f91297b)})).mo19066a();
            this.f91296a = true;
            return charSequence.subSequence(i, i5);
        }
    }
}
