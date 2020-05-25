package com.p683ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9432q;
import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.tools.view.widget.d */
public final class C50275d {

    /* renamed from: a */
    public static C17432q<Integer> f126140a;

    /* renamed from: b */
    public static C50276a f126141b;

    /* renamed from: c */
    private int f126142c;

    /* renamed from: d */
    private int f126143d;

    /* renamed from: e */
    private int f126144e = 0;

    /* renamed from: f */
    private int f126145f;

    /* renamed from: g */
    private String f126146g;

    /* renamed from: h */
    private Context f126147h;

    /* renamed from: com.ss.android.ugc.tools.view.widget.d$a */
    public interface C50276a {
        /* renamed from: a */
        void mo58596a(Context context, String str, int i, int i2, int i3, int i4);
    }

    /* renamed from: b */
    private static int m108537b() {
        if (f126140a == null) {
            return 1;
        }
        return ((Integer) f126140a.get()).intValue();
    }

    /* renamed from: a */
    public final void mo98174a() {
        try {
            if (this.f126147h != null && !TextUtils.isEmpty(this.f126146g) && C18920g.m46055c(this.f126147h, this.f126147h.getPackageName())) {
                m108536a(this.f126147h, this.f126146g, this.f126142c, this.f126145f, this.f126143d, this.f126144e);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static C50275d m108538b(Context context, int i) {
        return m108535a(context, context.getString(i), 1, m108537b());
    }

    /* renamed from: c */
    public static C50275d m108541c(Context context, int i) {
        return m108540b(context, context.getString(i), 1, m108537b());
    }

    /* renamed from: a */
    public static C50275d m108530a(Context context, int i) {
        C50275d dVar = new C50275d(context, context.getString(i), 1, 1, m108537b(), 0);
        return dVar;
    }

    /* renamed from: b */
    public static C50275d m108539b(Context context, String str) {
        return m108540b(context, str, 1, m108537b());
    }

    /* renamed from: a */
    public static C50275d m108533a(Context context, String str) {
        return m108535a(context, str, 1, m108537b());
    }

    /* renamed from: a */
    public static C50275d m108531a(Context context, int i, int i2) {
        return m108532a(context, i, 0, m108537b());
    }

    /* renamed from: a */
    public static C50275d m108534a(Context context, String str, int i) {
        return m108535a(context, str, 1, m108537b());
    }

    /* renamed from: a */
    private static C50275d m108532a(Context context, int i, int i2, int i3) {
        C50275d dVar = new C50275d(context, context.getString(i), i2, 2, i3, 0);
        return dVar;
    }

    /* renamed from: b */
    private static C50275d m108540b(Context context, String str, int i, int i2) {
        C50275d dVar = new C50275d(context, str, 1, 3, i2, 0);
        return dVar;
    }

    /* renamed from: a */
    private static C50275d m108535a(Context context, String str, int i, int i2) {
        C50275d dVar = new C50275d(context, str, i, 2, i2, 0);
        return dVar;
    }

    private C50275d(Context context, String str, int i, int i2, int i3, int i4) {
        this.f126146g = str;
        this.f126142c = i;
        this.f126145f = i2;
        this.f126147h = context;
        this.f126143d = i3;
    }

    /* renamed from: a */
    private static void m108536a(Context context, String str, int i, int i2, int i3, int i4) {
        if (f126141b != null) {
            f126141b.mo58596a(context, str, i, i2, i3, i4);
            return;
        }
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, C42311c.f106865i);
        if (C39629l.m88232a().mo58590u().mo74222c().booleanValue()) {
            C9432q.m18676a(context, str);
        } else if (i2 == 1) {
            C50277e a = C50277e.m108544a(context);
            a.f126152d = i3;
            a.mo98175a(i4);
            if (a.mo98178a()) {
                a.f126150b.setBackgroundColor(a.f126149a.getResources().getColor(R.color.b2j));
            } else {
                a.f126150b.setBackgroundResource(R.drawable.dyi);
            }
            a.f126151c.setImageResource(R.drawable.dyp);
            a.mo98176a(str, i);
        } else if (i2 == 2) {
            C50277e a2 = C50277e.m108544a(context);
            a2.f126152d = i3;
            a2.mo98175a(i4);
            if (a2.mo98178a()) {
                a2.f126150b.setBackgroundColor(a2.f126149a.getResources().getColor(R.color.b2i));
            } else {
                a2.f126150b.setBackgroundResource(R.drawable.dyh);
            }
            a2.f126151c.setImageResource(R.drawable.dyq);
            a2.mo98176a(str, i);
        } else {
            if (i2 == 3) {
                C50277e a3 = C50277e.m108544a(context);
                a3.f126152d = i3;
                a3.mo98175a(i4);
                if (a3.mo98178a()) {
                    a3.f126150b.setBackgroundColor(a3.f126149a.getResources().getColor(R.color.b2h));
                } else {
                    a3.f126150b.setBackgroundResource(R.drawable.dyg);
                }
                a3.f126151c.setVisibility(8);
                a3.mo98176a(str, i);
            }
        }
    }
}
