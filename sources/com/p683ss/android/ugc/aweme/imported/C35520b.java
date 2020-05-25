package com.p683ss.android.ugc.aweme.imported;

import android.text.InputFilter;
import android.text.Spanned;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.imported.b */
public final class C35520b implements InputFilter {

    /* renamed from: a */
    public final int f91294a;

    /* renamed from: b */
    public final C35521a f91295b;

    /* renamed from: com.ss.android.ugc.aweme.imported.b$a */
    public interface C35521a {
    }

    public C35520b(int i, C35521a aVar) {
        this.f91294a = i;
        this.f91295b = aVar;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        C52711k.m112240b(charSequence, "source");
        C52711k.m112240b(spanned, "dest");
        if (i3 == i4 && C52711k.m112239a((Object) charSequence, (Object) "")) {
            return null;
        }
        if (i3 < this.f91294a) {
            return spanned.subSequence(i3, i4);
        }
        return charSequence;
    }
}
