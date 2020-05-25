package com.p683ss.android.ugc.aweme.property;

import com.p683ss.android.ugc.aweme.property.C40761aa.C40762a;
import com.p683ss.android.ugc.aweme.utils.C47655a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.property.c */
public class C40776c {

    /* renamed from: b */
    public final String f103884b = this.f103888f.f103946a;

    /* renamed from: c */
    public final String f103885c;

    /* renamed from: d */
    public final String f103886d;

    /* renamed from: e */
    public final C40762a f103887e;

    /* renamed from: f */
    public final C40816u f103888f;

    /* renamed from: b */
    public final String mo83094b() {
        boolean z;
        CharSequence charSequence = this.f103888f.f103947b;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f103885c;
        }
        return this.f103888f.f103947b;
    }

    /* renamed from: a */
    public final String mo83093a() {
        if (!C47655a.m103155b(mo83094b().charAt(0))) {
            return "zzzzzzzzzzzzzzz";
        }
        String b = C47655a.m103154b(String.valueOf(mo83094b().charAt(0)));
        C52711k.m112236a((Object) b, "AVCharacterUtil.hanziToP…chineseKey[0].toString())");
        return b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ItemBean(property=");
        sb.append(this.f103887e.key());
        sb.append(", abMoreMessage=");
        sb.append(this.f103888f);
        sb.append(')');
        return sb.toString();
    }

    public C40776c(C40762a aVar, C40816u uVar) {
        C52711k.m112240b(aVar, "property");
        C52711k.m112240b(uVar, "AbMoreMessage");
        this.f103887e = aVar;
        this.f103888f = uVar;
        String key = this.f103887e.key();
        C52711k.m112236a((Object) key, "property.key()");
        this.f103885c = key;
        StringBuilder sb = new StringBuilder("\n        Key:");
        sb.append(this.f103887e.key());
        sb.append("\n        中文名:");
        sb.append(this.f103888f.f103947b);
        sb.append("\n        Owner:");
        sb.append(this.f103888f.f103946a);
        sb.append("\n        参数意义:");
        sb.append(this.f103888f.f103948c);
        sb.append("\n        开始时间:");
        sb.append(this.f103888f.f103949d);
        sb.append("\n        其他补充:");
        sb.append(this.f103888f.f103951f);
        sb.append("\n    ");
        String sb2 = sb.toString();
        C52711k.m112240b(sb2, "$this$trimIndent");
        this.f103886d = C52830p.m112387a(sb2, "");
    }
}
