package com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1838b;

import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11202k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34279d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.b.b */
public final class C34214b {

    /* renamed from: a */
    public static final C34214b f88387a = new C34214b();

    private C34214b() {
    }

    /* renamed from: a */
    private static void m78053a(Context context) {
        C52711k.m112240b(context, "context");
        C10691a.m21542b(context, (int) R.string.bl6).mo19066a();
    }

    /* renamed from: a */
    public static final void m78054a(Context context, C11202k kVar) {
        boolean z;
        C52711k.m112240b(context, "context");
        if (kVar != null) {
            CharSequence charSequence = kVar.f30207e;
            boolean z2 = false;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C34279d dVar = (C34279d) C35277o.m79760a(kVar.f30207e, C34279d.class);
                if (dVar != null) {
                    CharSequence statusMsg = dVar.getStatusMsg();
                    if (statusMsg == null || statusMsg.length() == 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        C10691a.m21545b(context, dVar.getStatusMsg()).mo19066a();
                        return;
                    }
                }
                m78053a(context);
                return;
            }
        }
        m78053a(context);
    }

    /* renamed from: a */
    public static final void m78055a(Context context, String str, Runnable runnable) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C11180b a = new C11190e(str).mo20685a();
            C52711k.m112236a((Object) a, "ConversationModel(conversationId).conversation");
            if (a.isMember() && !C34213a.m78052a(str)) {
                runnable.run();
                return;
            }
        }
        C10691a.m21542b(context, (int) R.string.blq).mo19066a();
    }
}
