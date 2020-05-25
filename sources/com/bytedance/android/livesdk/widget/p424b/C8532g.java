package com.bytedance.android.livesdk.widget.p424b;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.p279af.C4604n;
import com.bytedance.android.livesdk.widget.p424b.C8511d.C8512a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.widget.b.g */
public final class C8532g implements C8511d {

    /* renamed from: b */
    public static final int f23406b = 1;

    /* renamed from: c */
    public static final int f23407c = 2;

    /* renamed from: d */
    public static final int f23408d = 3;

    /* renamed from: e */
    public static final C8533a f23409e = new C8533a(null);

    /* renamed from: f */
    private int f23410f;

    /* renamed from: g */
    private String f23411g = "";

    /* renamed from: h */
    private int f23412h;

    /* renamed from: com.bytedance.android.livesdk.widget.b.g$a */
    public static final class C8533a {
        private C8533a() {
        }

        /* renamed from: a */
        public static int m16802a() {
            return C8532g.f23406b;
        }

        /* renamed from: b */
        public static int m16803b() {
            return C8532g.f23407c;
        }

        /* renamed from: c */
        public static int m16804c() {
            return C8532g.f23408d;
        }

        public /* synthetic */ C8533a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo14946a() {
        return C8512a.m16780a();
    }

    /* renamed from: b */
    public final Spannable mo14947b() {
        SpannableString spannableString;
        String str;
        SpannableString spannableString2 = new SpannableString("");
        if (this.f23412h == f23406b) {
            String a = C3922z.m9903a((int) R.string.hq5);
            C52711k.m112236a((Object) a, "ResUtil.getString(R.stri….ttlive_information_fans)");
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C3922z.m9909b((int) R.color.b3x));
            SpannableString spannableString3 = new SpannableString(a);
            spannableString3.setSpan(foregroundColorSpan, 0, a.length(), 33);
            spannableString = spannableString3;
        } else if (this.f23412h == f23407c) {
            String a2 = C3922z.m9905a((int) R.string.hq1, this.f23411g);
            C52711k.m112236a((Object) a2, "ResUtil.getString(R.stri…ation_distance, distance)");
            int length = C3922z.m9903a((int) R.string.hq2).length() + 1;
            int length2 = this.f23411g.length() + length;
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(C3922z.m9909b((int) R.color.b3x));
            spannableString = new SpannableString(a2);
            spannableString.setSpan(foregroundColorSpan2, length, length2, 33);
        } else if (this.f23412h == f23408d) {
            long j = (long) this.f23410f;
            if (j < 10000) {
                str = String.valueOf(j);
            } else {
                StringBuilder sb = new StringBuilder();
                double d = (double) j;
                Double.isNaN(d);
                sb.append(C4604n.m11050a("%.1f", Double.valueOf((d * 1.0d) / 10000.0d)));
                sb.append("w");
                str = sb.toString();
            }
            String str2 = str.toString();
            String a3 = C3922z.m9905a((int) R.string.hq6, str2);
            C52711k.m112236a((Object) a3, "ResUtil.getString(R.stri…ion_popularity, countStr)");
            int length3 = C3922z.m9903a((int) R.string.hq7).length() + 1;
            int length4 = str2.length() + length3;
            ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(C3922z.m9909b((int) R.color.b3x));
            spannableString = new SpannableString(a3);
            spannableString.setSpan(foregroundColorSpan3, length3, length4, 33);
        } else {
            spannableString = spannableString2;
        }
        return spannableString;
    }

    public C8532g(int i) {
        this.f23412h = i;
    }

    public C8532g(int i, int i2) {
        this.f23412h = i;
        this.f23410f = i2;
    }

    public C8532g(int i, String str) {
        C52711k.m112240b(str, "distance");
        this.f23412h = i;
        this.f23411g = str;
    }
}
