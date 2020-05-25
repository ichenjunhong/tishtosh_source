package com.p683ss.android.ugc.aweme.common.p1594f;

import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.ss.android.ugc.aweme.common.f.f */
public final class C26880f extends RuntimeException {
    public final int insertPosition;
    public final int listSize;

    public C26880f(int i, int i2) {
        StringBuilder sb = new StringBuilder("decide to insert position:");
        sb.append(i);
        sb.append(",but listSize limit:");
        sb.append(i2);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        super(sb.toString());
        this.insertPosition = i;
        this.listSize = i2;
    }
}
