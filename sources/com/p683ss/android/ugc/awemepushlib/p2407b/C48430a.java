package com.p683ss.android.ugc.awemepushlib.p2407b;

import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.common.push.p660a.C10620a.C10621a;
import com.bytedance.ies.uikit.base.C11081c;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import com.p683ss.android.ugc.awemepushlib.p2409di.ies.MessageHandler;

/* renamed from: com.ss.android.ugc.awemepushlib.b.a */
public final class C48430a implements C10621a {
    /* renamed from: a */
    public final void mo18841a(Context context) {
        try {
            if (C11081c.m22429a() == null) {
                Intent intent = new Intent(context, MessageHandler.class);
                if (context == null || !(context instanceof Context) || !C40895d.m90464a(context, intent)) {
                    context.startService(intent);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
