package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.C15515f;
import java.util.Collections;
import java.util.Set;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.rd */
public final class C16205rd extends C16217rp {

    /* renamed from: r */
    private static final Set<String> f45463r;

    /* renamed from: a */
    String f45464a = "top-right";

    /* renamed from: b */
    boolean f45465b = true;

    /* renamed from: c */
    int f45466c = -1;

    /* renamed from: d */
    int f45467d;

    /* renamed from: e */
    int f45468e;

    /* renamed from: f */
    int f45469f = -1;

    /* renamed from: g */
    final Object f45470g = new Object();

    /* renamed from: h */
    final ama f45471h;

    /* renamed from: i */
    final Activity f45472i;

    /* renamed from: j */
    anp f45473j;

    /* renamed from: k */
    ImageView f45474k;

    /* renamed from: l */
    LinearLayout f45475l;

    /* renamed from: m */
    C16218rq f45476m;

    /* renamed from: n */
    PopupWindow f45477n;

    /* renamed from: o */
    RelativeLayout f45478o;

    /* renamed from: p */
    ViewGroup f45479p;

    /* renamed from: s */
    private int f45480s;

    /* renamed from: t */
    private int f45481t;

    public C16205rd(ama ama, C16218rq rqVar) {
        super(ama, "resize");
        this.f45471h = ama;
        this.f45472i = ama.mo28938d();
        this.f45476m = rqVar;
    }

    /* renamed from: a */
    public final void mo31354a(boolean z) {
        synchronized (this.f45470g) {
            if (this.f45477n != null) {
                C16206re.m38718a(this.f45477n);
                this.f45478o.removeView(this.f45471h.getView());
                if (this.f45479p != null) {
                    this.f45479p.removeView(this.f45474k);
                    this.f45479p.addView(this.f45471h.getView());
                    this.f45471h.mo29153a(this.f45473j);
                }
                if (z) {
                    mo31367b("default");
                    if (this.f45476m != null) {
                        this.f45476m.mo27599K();
                    }
                }
                this.f45477n = null;
                this.f45478o = null;
                this.f45479p = null;
                this.f45475l = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010b, code lost:
        if ((r5 + 50) <= r1[1]) goto L_0x010e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0120  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] mo31355a() {
        /*
            r9 = this;
            android.app.Activity r0 = r9.f45472i
            int[] r0 = com.google.android.gms.internal.ads.acd.m32599b(r0)
            android.app.Activity r1 = r9.f45472i
            int[] r1 = com.google.android.gms.internal.ads.acd.m32604c(r1)
            r2 = 0
            r3 = r0[r2]
            r4 = 1
            r0 = r0[r4]
            int r5 = r9.f45469f
            r6 = 2
            r7 = 50
            if (r5 < r7) goto L_0x0116
            int r5 = r9.f45469f
            if (r5 <= r3) goto L_0x001f
            goto L_0x0116
        L_0x001f:
            int r5 = r9.f45466c
            if (r5 < r7) goto L_0x0110
            int r5 = r9.f45466c
            if (r5 <= r0) goto L_0x0029
            goto L_0x0110
        L_0x0029:
            int r5 = r9.f45466c
            if (r5 != r0) goto L_0x0038
            int r0 = r9.f45469f
            if (r0 != r3) goto L_0x0038
            java.lang.String r0 = "Cannot resize to a full-screen ad."
            com.google.android.gms.internal.ads.abv.m32798e(r0)
            goto L_0x011b
        L_0x0038:
            boolean r0 = r9.f45465b
            if (r0 == 0) goto L_0x010e
            java.lang.String r0 = r9.f45464a
            r5 = -1
            int r8 = r0.hashCode()
            switch(r8) {
                case -1364013995: goto L_0x0079;
                case -1012429441: goto L_0x006f;
                case -655373719: goto L_0x0065;
                case 1163912186: goto L_0x005b;
                case 1288627767: goto L_0x0051;
                case 1755462605: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x0083
        L_0x0047:
            java.lang.String r8 = "top-center"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0083
            r0 = 1
            goto L_0x0084
        L_0x0051:
            java.lang.String r8 = "bottom-center"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0083
            r0 = 4
            goto L_0x0084
        L_0x005b:
            java.lang.String r8 = "bottom-right"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0083
            r0 = 5
            goto L_0x0084
        L_0x0065:
            java.lang.String r8 = "bottom-left"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0083
            r0 = 3
            goto L_0x0084
        L_0x006f:
            java.lang.String r8 = "top-left"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0083
            r0 = 0
            goto L_0x0084
        L_0x0079:
            java.lang.String r8 = "center"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0083
            r0 = 2
            goto L_0x0084
        L_0x0083:
            r0 = -1
        L_0x0084:
            switch(r0) {
                case 0: goto L_0x00f5;
                case 1: goto L_0x00e4;
                case 2: goto L_0x00cd;
                case 3: goto L_0x00be;
                case 4: goto L_0x00a9;
                case 5: goto L_0x0096;
                default: goto L_0x0087;
            }
        L_0x0087:
            int r0 = r9.f45480s
            int r5 = r9.f45467d
            int r0 = r0 + r5
            int r5 = r9.f45469f
            int r0 = r0 + r5
            int r0 = r0 - r7
            int r5 = r9.f45481t
            int r8 = r9.f45468e
            int r5 = r5 + r8
            goto L_0x00ff
        L_0x0096:
            int r0 = r9.f45480s
            int r5 = r9.f45467d
            int r0 = r0 + r5
            int r5 = r9.f45469f
            int r0 = r0 + r5
            int r0 = r0 - r7
            int r5 = r9.f45481t
            int r8 = r9.f45468e
            int r5 = r5 + r8
            int r8 = r9.f45466c
            int r5 = r5 + r8
            int r5 = r5 - r7
            goto L_0x00ff
        L_0x00a9:
            int r0 = r9.f45480s
            int r5 = r9.f45467d
            int r0 = r0 + r5
            int r5 = r9.f45469f
            int r5 = r5 / r6
            int r0 = r0 + r5
            int r0 = r0 + -25
            int r5 = r9.f45481t
            int r8 = r9.f45468e
            int r5 = r5 + r8
            int r8 = r9.f45466c
            int r5 = r5 + r8
            int r5 = r5 - r7
            goto L_0x00ff
        L_0x00be:
            int r0 = r9.f45480s
            int r5 = r9.f45467d
            int r0 = r0 + r5
            int r5 = r9.f45481t
            int r8 = r9.f45468e
            int r5 = r5 + r8
            int r8 = r9.f45466c
            int r5 = r5 + r8
            int r5 = r5 - r7
            goto L_0x00ff
        L_0x00cd:
            int r0 = r9.f45480s
            int r5 = r9.f45467d
            int r0 = r0 + r5
            int r5 = r9.f45469f
            int r5 = r5 / r6
            int r0 = r0 + r5
            int r0 = r0 + -25
            int r5 = r9.f45481t
            int r8 = r9.f45468e
            int r5 = r5 + r8
            int r8 = r9.f45466c
            int r8 = r8 / r6
            int r5 = r5 + r8
            int r5 = r5 + -25
            goto L_0x00ff
        L_0x00e4:
            int r0 = r9.f45480s
            int r5 = r9.f45467d
            int r0 = r0 + r5
            int r5 = r9.f45469f
            int r5 = r5 / r6
            int r0 = r0 + r5
            int r0 = r0 + -25
            int r5 = r9.f45481t
            int r8 = r9.f45468e
            int r5 = r5 + r8
            goto L_0x00ff
        L_0x00f5:
            int r0 = r9.f45480s
            int r5 = r9.f45467d
            int r0 = r0 + r5
            int r5 = r9.f45481t
            int r8 = r9.f45468e
            int r5 = r5 + r8
        L_0x00ff:
            if (r0 < 0) goto L_0x011b
            int r0 = r0 + r7
            if (r0 > r3) goto L_0x011b
            r0 = r1[r2]
            if (r5 < r0) goto L_0x011b
            int r5 = r5 + r7
            r0 = r1[r4]
            if (r5 <= r0) goto L_0x010e
            goto L_0x011b
        L_0x010e:
            r0 = 1
            goto L_0x011c
        L_0x0110:
            java.lang.String r0 = "Height is too small or too large."
            com.google.android.gms.internal.ads.abv.m32798e(r0)
            goto L_0x011b
        L_0x0116:
            java.lang.String r0 = "Width is too small or too large."
            com.google.android.gms.internal.ads.abv.m32798e(r0)
        L_0x011b:
            r0 = 0
        L_0x011c:
            if (r0 != 0) goto L_0x0120
            r0 = 0
            return r0
        L_0x0120:
            boolean r0 = r9.f45465b
            if (r0 == 0) goto L_0x0135
            int[] r0 = new int[r6]
            int r1 = r9.f45480s
            int r3 = r9.f45467d
            int r1 = r1 + r3
            r0[r2] = r1
            int r1 = r9.f45481t
            int r2 = r9.f45468e
            int r1 = r1 + r2
            r0[r4] = r1
            return r0
        L_0x0135:
            android.app.Activity r0 = r9.f45472i
            int[] r0 = com.google.android.gms.internal.ads.acd.m32599b(r0)
            android.app.Activity r1 = r9.f45472i
            int[] r1 = com.google.android.gms.internal.ads.acd.m32604c(r1)
            r0 = r0[r2]
            int r3 = r9.f45480s
            int r5 = r9.f45467d
            int r3 = r3 + r5
            int r5 = r9.f45481t
            int r7 = r9.f45468e
            int r5 = r5 + r7
            if (r3 >= 0) goto L_0x0151
            r0 = 0
            goto L_0x015b
        L_0x0151:
            int r7 = r9.f45469f
            int r7 = r7 + r3
            if (r7 <= r0) goto L_0x015a
            int r3 = r9.f45469f
            int r0 = r0 - r3
            goto L_0x015b
        L_0x015a:
            r0 = r3
        L_0x015b:
            r3 = r1[r2]
            if (r5 >= r3) goto L_0x0162
            r5 = r1[r2]
            goto L_0x016f
        L_0x0162:
            int r3 = r9.f45466c
            int r3 = r3 + r5
            r7 = r1[r4]
            if (r3 <= r7) goto L_0x016f
            r1 = r1[r4]
            int r3 = r9.f45466c
            int r5 = r1 - r3
        L_0x016f:
            int[] r1 = new int[r6]
            r1[r2] = r0
            r1[r4] = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16205rd.mo31355a():int[]");
    }

    /* renamed from: a */
    public final void mo31353a(int i, int i2, boolean z) {
        synchronized (this.f45470g) {
            this.f45480s = i;
            this.f45481t = i2;
            if (this.f45477n != null && z) {
                int[] a = mo31355a();
                if (a != null) {
                    this.f45477n.update(aes.m32748a((Context) this.f45472i, a[0]), aes.m32748a((Context) this.f45472i, a[1]), this.f45477n.getWidth(), this.f45477n.getHeight());
                    mo31352a(a[0], a[1]);
                } else {
                    mo31354a(true);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo31352a(int i, int i2) {
        mo31364a(i, i2 - acd.m32604c(this.f45472i)[0], this.f45469f, this.f45466c);
    }

    /* renamed from: b */
    public final boolean mo31357b() {
        boolean z;
        synchronized (this.f45470g) {
            z = this.f45477n != null;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo31356b(int i, int i2) {
        this.f45480s = i;
        this.f45481t = i2;
    }

    static {
        String[] strArr = {"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"};
        Set a = C15515f.m32276a(7, false);
        Collections.addAll(a, strArr);
        f45463r = Collections.unmodifiableSet(a);
    }
}
