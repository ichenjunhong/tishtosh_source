package com.p683ss.android.ugc.aweme.profile.util;

import android.content.Context;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.utils.C47918gj;

/* renamed from: com.ss.android.ugc.aweme.profile.util.z */
public final class C40575z implements C40574y {

    /* renamed from: a */
    public static final int f103513a = ((int) C9432q.m18687b(C11010c.m22280a(), 4.0f));

    /* renamed from: c */
    private static final int f103514c = ((int) C9432q.m18687b(C11010c.m22280a(), 20.0f));

    /* renamed from: d */
    private static final int f103515d = ((int) C9432q.m18687b(C11010c.m22280a(), 5.0f));

    /* renamed from: b */
    int f103516b;

    /* renamed from: e */
    private final Context f103517e;

    /* renamed from: f */
    private final LinearLayout f103518f;

    /* renamed from: g */
    private boolean f103519g;

    /* renamed from: h */
    private boolean f103520h;

    /* renamed from: i */
    private boolean f103521i;

    public C40575z(LinearLayout linearLayout) {
        this(linearLayout, Integer.MAX_VALUE);
    }

    public C40575z(LinearLayout linearLayout, int i) {
        this(linearLayout, i, false);
    }

    private C40575z(LinearLayout linearLayout, int i, boolean z) {
        this(linearLayout, i, false, true);
    }

    public C40575z(final LinearLayout linearLayout, final int i, boolean z, boolean z2) {
        this.f103516b = Integer.MAX_VALUE;
        this.f103521i = true;
        this.f103520h = z;
        this.f103521i = z2;
        this.f103517e = linearLayout.getContext();
        this.f103518f = linearLayout;
        this.f103516b = i;
        if (i < Integer.MAX_VALUE) {
            this.f103518f.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    int childCount = linearLayout.getChildCount() - 1;
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i >= linearLayout.getChildCount()) {
                            break;
                        }
                        i2 += ((TextView) linearLayout.getChildAt(i)).getMeasuredWidth();
                        if (i > 0) {
                            i2 += C40575z.f103513a;
                        }
                        if (i2 >= i) {
                            childCount = i - 1;
                            break;
                        }
                        i++;
                    }
                    while (true) {
                        childCount++;
                        if (childCount < linearLayout.getChildCount()) {
                            linearLayout.removeViewAt(childCount);
                        } else {
                            linearLayout.invalidate();
                            return;
                        }
                    }
                }
            });
            this.f103519g = C47918gj.m103682a(linearLayout.getContext());
        }
    }
}
