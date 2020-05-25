package com.bytedance.android.livesdk.widget.p423a;

import android.graphics.Typeface;
import java.io.File;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.widget.a.e */
final /* synthetic */ class C8498e implements C1711f {

    /* renamed from: a */
    static final C1711f f23321a = new C8498e();

    private C8498e() {
    }

    public final Object apply(Object obj) {
        File file = (File) obj;
        return new C8494b(file.getName().replace(".ttf", ""), Typeface.createFromFile(file));
    }
}
