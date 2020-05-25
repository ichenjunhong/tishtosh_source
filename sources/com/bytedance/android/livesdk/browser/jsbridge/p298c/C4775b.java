package com.bytedance.android.livesdk.browser.jsbridge.p298c;

import android.content.Context;
import com.bytedance.android.live.core.p230g.C3886c;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.b */
final /* synthetic */ class C4775b implements C1710e {

    /* renamed from: a */
    private final C4773a f12988a;

    /* renamed from: b */
    private final String f12989b;

    C4775b(C4773a aVar, String str) {
        this.f12988a = aVar;
        this.f12989b = str;
    }

    public final void accept(Object obj) {
        C4773a aVar = this.f12988a;
        String str = this.f12989b;
        String str2 = (String) obj;
        Context context = aVar.f12986a;
        if (str != null) {
            try {
                if (str.isEmpty()) {
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                C3886c.m9822a(sb.toString());
                C4575an.m10981a((int) R.string.e35);
            } catch (Exception e) {
                C4773a.class.getSimpleName();
                e.getMessage();
                return;
            }
        }
        str = context.getString(R.string.e5g);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        C3886c.m9822a(sb2.toString());
        C4575an.m10981a((int) R.string.e35);
    }
}
