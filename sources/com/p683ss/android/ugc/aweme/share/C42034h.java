package com.p683ss.android.ugc.aweme.share;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.p1632di.C27650cj;
import com.p683ss.android.ugc.aweme.share.p2159h.C42040f;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.utils.C47891fl;
import p064c.p065a.C2193n;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.share.h */
public abstract class C42034h implements ShareExtService {
    /* renamed from: a */
    public static ShareExtService m91999a() {
        if (C27991b.f73527w == null) {
            synchronized (ShareExtService.class) {
                if (C27991b.f73527w == null) {
                    C27991b.f73527w = C27650cj.m66323b();
                }
            }
        }
        return (ShareExtService) C27991b.f73527w;
    }

    public String getLaseSavedCommand(Context context) {
        C52711k.m112240b(context, "context");
        String str = "";
        if (context == null || context.getApplicationContext() == null) {
            return "";
        }
        SharedPreferences a = C35807d.m80935a(context.getApplicationContext(), "share_command", 0);
        if (a != null) {
            str = a.getString("command", "");
        }
        return str;
    }

    public C2193n<String> shortUrl(String str) {
        boolean z;
        String str2;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str2 = str;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            C2193n<String> a = C2193n.m6560a("");
            C52711k.m112236a((Object) a, "Maybe.just(\"\")");
            return a;
        }
        C42040f fVar = C42040f.f106427a;
        if (str == null) {
            C52711k.m112234a();
        }
        return fVar.mo86110a(str);
    }

    public void markLocalCommand(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "command");
        if (context != null && context.getApplicationContext() != null) {
            C35807d.m80935a(context.getApplicationContext(), "share_command", 0).edit().putString("command", str).apply();
        }
    }

    public void copyContentToClipBoard(Context context, String str, String str2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, C42311c.f106865i);
        Object systemService = context.getSystemService("clipboard");
        if (systemService != null) {
            CharSequence charSequence = str;
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(charSequence, charSequence));
            if ((!C52830p.m112402a(charSequence)) && C47891fl.m103593a(str2)) {
                C10691a.m21537a(context, str2).mo19066a();
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.content.ClipboardManager");
    }
}
