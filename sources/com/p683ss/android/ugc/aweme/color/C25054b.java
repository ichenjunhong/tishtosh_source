package com.p683ss.android.ugc.aweme.color;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52804a;

/* renamed from: com.ss.android.ugc.aweme.color.b */
public final class C25054b extends C1352v {

    /* renamed from: a */
    final TextView f66372a;

    /* renamed from: b */
    final View f66373b;

    /* renamed from: c */
    final TextView f66374c;

    public C25054b(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f66372a = (TextView) view.findViewById(R.id.text);
        this.f66373b = view.findViewById(R.id.e1q);
        this.f66374c = (TextView) view.findViewById(R.id.esf);
    }

    /* renamed from: a */
    static String m60900a(int i) {
        boolean z;
        String num = Integer.toString(i, C52804a.m112363a(16));
        C52711k.m112236a((Object) num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        if (num != null) {
            String upperCase = num.toUpperCase();
            C52711k.m112236a((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            if (upperCase.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "00";
            }
            if (upperCase.length() != 1) {
                return upperCase;
            }
            StringBuilder sb = new StringBuilder("0");
            sb.append(upperCase);
            return sb.toString();
        }
        throw new C52857u("null cannot be cast to non-null type java.lang.String");
    }
}
