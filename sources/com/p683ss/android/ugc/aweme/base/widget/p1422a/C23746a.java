package com.p683ss.android.ugc.aweme.base.widget.p1422a;

import com.p683ss.android.ugc.aweme.base.mvvm.impl.C23564b;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.widget.DividerView;

/* renamed from: com.ss.android.ugc.aweme.base.widget.a.a */
public class C23746a extends C23564b<DividerView> {

    /* renamed from: b */
    public static final int f63308b = C23728o.m58241a(0.5d);

    /* renamed from: a */
    public Class f63309a;

    /* renamed from: c */
    public int f63310c;

    /* renamed from: d */
    public int[] f63311d;

    /* renamed from: e */
    public int f63312e;

    /* renamed from: f */
    public int f63313f;

    /* renamed from: g */
    public C23747a f63314g;

    /* renamed from: com.ss.android.ugc.aweme.base.widget.a.a$a */
    public enum C23747a {
        VERTICAL,
        HORIZONTAL
    }

    private C23746a(int i) {
        this(i, null, 0, 0);
    }

    public C23746a(int i, C23747a aVar) {
        this(i);
        this.f63314g = aVar;
    }

    private C23746a(int i, int[] iArr, int i2, int i3) {
        this.f63314g = C23747a.VERTICAL;
        this.f63310c = i;
        this.f63311d = null;
        this.f63312e = i2;
        this.f63313f = i3;
    }
}
