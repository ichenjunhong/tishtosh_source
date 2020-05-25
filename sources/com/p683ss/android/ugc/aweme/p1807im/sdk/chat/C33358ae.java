package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.bytedance.keva.Keva;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SystemContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33829cu;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ae */
public final class C33358ae {

    /* renamed from: a */
    public static final String f86504a = f86504a;

    /* renamed from: b */
    public static final String f86505b = f86505b;

    /* renamed from: c */
    public static final C33358ae f86506c = new C33358ae();

    /* renamed from: d */
    private static final String f86507d = f86507d;

    private C33358ae() {
    }

    /* renamed from: a */
    public static SystemContent m76518a(String str) {
        C52711k.m112240b(str, "uid");
        Keva repo = Keva.getRepo(f86504a);
        C52711k.m112236a((Object) repo, "Keva.getRepo(KEVA_KEY)");
        StringBuilder sb = new StringBuilder();
        sb.append(f86505b);
        sb.append(str);
        sb.append(C35265e.m79730b());
        String sb2 = sb.toString();
        boolean z = false;
        String[] stringArray = repo.getStringArray(sb2, new String[0]);
        C52711k.m112236a((Object) stringArray, "keva.getStringArray(PRE_…Util.getUid(), arrayOf())");
        new StringBuilder("getSpContent ");
        if (stringArray.length == 0) {
            z = true;
        }
        if (!z) {
            try {
                return (SystemContent) C35277o.m79760a(stringArray[2], SystemContent.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m76519a(Context context, SystemContent systemContent, String str, int i) {
        C52711k.m112240b(context, "ctx");
        C52711k.m112240b(systemContent, C42311c.f106865i);
        if (!TextUtils.isEmpty(str)) {
            C33829cu cuVar = new C33829cu(LayoutInflater.from(context).inflate(R.layout.bez, new FrameLayout(context), false), 91);
            C11207p pVar = new C11207p();
            pVar.setMsgType(1007);
            if (str == null) {
                C52711k.m112234a();
            }
            pVar.setSender(Long.parseLong(str));
            cuVar.mo71870a(pVar, systemContent, i);
        }
    }
}
