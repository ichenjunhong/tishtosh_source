package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2325c;

import android.text.TextUtils;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.c.a */
public final class C46492a {

    /* renamed from: a */
    public String f117321a;

    /* renamed from: b */
    public String f117322b;

    /* renamed from: c */
    public String f117323c;

    /* renamed from: d */
    public List<String> f117324d;

    /* renamed from: a */
    public final String mo93235a() {
        List<String> list = this.f117324d;
        if (list == null) {
            C52711k.m112234a();
        }
        if (list.isEmpty()) {
            return "";
        }
        if (TextUtils.isEmpty(this.f117322b)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<String> list2 = this.f117324d;
        if (list2 == null) {
            C52711k.m112234a();
        }
        sb.append((String) list2.get(0));
        String str = this.f117322b;
        if (str == null) {
            C52711k.m112234a();
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo93236b() {
        if (this.f117324d != null) {
            List<String> list = this.f117324d;
            if (list == null) {
                C52711k.m112234a();
            }
            if (list.isEmpty() || TextUtils.isEmpty(this.f117321a)) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            List<String> list2 = this.f117324d;
            if (list2 == null) {
                C52711k.m112234a();
            }
            sb.append((String) list2.get(0));
            String str = this.f117321a;
            if (str == null) {
                C52711k.m112234a();
            }
            sb.append(str);
            return sb.toString();
        }
        return null;
    }
}
