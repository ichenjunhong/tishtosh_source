package com.bytedance.android.livesdk.widget.p424b;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.widget.p424b.C8511d.C8512a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.widget.b.a */
public final class C8504a implements C8511d {

    /* renamed from: b */
    private int f23334b;

    /* renamed from: a */
    public final int mo14946a() {
        return C8512a.f23352b;
    }

    /* renamed from: b */
    public final Spannable mo14947b() {
        String valueOf = String.valueOf(this.f23334b);
        if (this.f23334b >= 99) {
            StringBuilder sb = new StringBuilder();
            sb.append(valueOf);
            sb.append("+");
            valueOf = sb.toString();
        }
        String a = C3922z.m9905a((int) R.string.hpz, valueOf);
        int length = C3922z.m9903a((int) R.string.hq0).length() + 1;
        int length2 = valueOf.length() + length;
        SpannableString spannableString = new SpannableString(a);
        spannableString.setSpan(new ForegroundColorSpan(C3922z.m9909b((int) R.color.b3x)), length, length2, 33);
        return spannableString;
    }

    public C8504a(int i) {
        this.f23334b = i;
    }
}
