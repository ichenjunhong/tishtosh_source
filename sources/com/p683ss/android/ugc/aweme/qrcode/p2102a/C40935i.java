package com.p683ss.android.ugc.aweme.qrcode.p2102a;

import android.net.Uri;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.qrcode.p2102a.C40922a.C40923a;
import com.taobao.android.dexposed.ClassUtils;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.qrcode.a.i */
public final class C40935i extends C40922a {
    public C40935i(C40923a aVar) {
        C52711k.m112240b(aVar, "dependency");
        super(aVar);
    }

    /* renamed from: a */
    public final boolean mo83412a(String str, int i) {
        String str2 = str;
        C52711k.m112240b(str, "result");
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        C52711k.m112236a((Object) parse, "uri");
        String host = parse.getHost();
        CharSequence charSequence = host;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        C52711k.m112236a((Object) host, "host");
        if (C52830p.m112456b(charSequence, (CharSequence) "amemv.com", false, 2, (Object) null) || C52830p.m112456b(charSequence, (CharSequence) "douyin.com", false, 2, (Object) null) || C52830p.m112456b(charSequence, (CharSequence) "tiktok.com", false, 2, (Object) null) || C52830p.m112456b(charSequence, (CharSequence) "tiktokv.com", false, 2, (Object) null) || C52830p.m112456b(charSequence, (CharSequence) "musical.ly", false, 2, (Object) null)) {
            List pathSegments = parse.getPathSegments();
            if (pathSegments.size() > 1 && C52711k.m112239a((Object) (String) pathSegments.get(0), (Object) "v")) {
                C40923a aVar = this.f104147b;
                Object obj = pathSegments.get(1);
                C52711k.m112236a(obj, "pathSegments[1]");
                return aVar.mo83411a(1, (String) C52575l.m112140f(C52830p.m112452b((CharSequence) obj, new String[]{ClassUtils.PACKAGE_SEPARATOR}, false, 0, 6, (Object) null)), str, i, null);
            } else if (pathSegments.size() >= 4 && C52711k.m112239a((Object) (String) pathSegments.get(2), (Object) "video")) {
                return this.f104147b.mo83411a(1, (String) pathSegments.get(3), str, i, null);
            }
        }
        return false;
    }
}
