package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14963ax;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hd */
final /* synthetic */ class C15935hd implements C15948hq {

    /* renamed from: a */
    static final C15948hq f45028a = new C15935hd();

    private C15935hd() {
    }

    /* renamed from: a */
    public final void mo27606a(Object obj, Map map) {
        String str;
        C16037ky kyVar = (C16037ky) obj;
        String str2 = (String) map.get("u");
        if (str2 == null) {
            abv.m32798e("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str2);
        try {
            beh z = ((ang) kyVar).mo29200z();
            if (z != null && z.mo30081a(parse)) {
                parse = z.mo30078a(parse, ((amy) kyVar).getContext(), ((ani) kyVar).getView(), ((amy) kyVar).mo28938d());
            }
        } catch (bei unused) {
            String str3 = "Unable to append parameter to URL: ";
            String valueOf = String.valueOf(str2);
            abv.m32798e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        amy amy = (amy) kyVar;
        Context context = amy.getContext();
        if (C14963ax.m30849s().mo28557a(context)) {
            String f = C14963ax.m30849s().mo28566f(context);
            if (f != null) {
                if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44248ai)).booleanValue()) {
                    String str4 = (String) caf.m37099d().mo30717a(C15740bx.f44249aj);
                    String uri = parse.toString();
                    if (uri.contains(str4)) {
                        C14963ax.m30849s().mo28561c(context, f);
                        str = uri.replace(str4, f);
                        new aeg(amy.getContext(), ((anh) kyVar).mo28944k().f46237a, str).mo28619g();
                    }
                } else if (TextUtils.isEmpty(parse.getQueryParameter("fbs_aeid"))) {
                    parse = aav.m32438a(parse.toString(), "fbs_aeid", f);
                    C14963ax.m30849s().mo28561c(context, f);
                }
            }
        }
        str = parse.toString();
        new aeg(amy.getContext(), ((anh) kyVar).mo28944k().f46237a, str).mo28619g();
    }
}
