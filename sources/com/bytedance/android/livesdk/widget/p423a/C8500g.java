package com.bytedance.android.livesdk.widget.p423a;

import android.graphics.Typeface;
import com.bytedance.android.live.core.p224c.C3831a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.widget.a.g */
final /* synthetic */ class C8500g implements C1710e {

    /* renamed from: a */
    private final C84923 f23323a;

    /* renamed from: b */
    private final String f23324b;

    C8500g(C84923 r1, String str) {
        this.f23323a = r1;
        this.f23324b = str;
    }

    public final void accept(Object obj) {
        C84923 r0 = this.f23323a;
        String str = this.f23324b;
        Typeface typeface = (Typeface) obj;
        StringBuilder sb = new StringBuilder("font download succeed: ");
        sb.append(str);
        C3831a.m9707a("LiveFontManager", sb.toString());
        C8489a.this.f23307a.onNext(new C8494b(str, typeface));
    }
}
