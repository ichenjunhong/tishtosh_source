package com.p683ss.android.ugc.aweme.shortvideo.upload;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.h */
final /* synthetic */ class C45300h implements Callable {

    /* renamed from: a */
    private final C452861 f114552a;

    /* renamed from: b */
    private final int f114553b;

    /* renamed from: c */
    private final int f114554c;

    /* renamed from: d */
    private final float f114555d;

    C45300h(C452861 r1, int i, int i2, float f) {
        this.f114552a = r1;
        this.f114553b = i;
        this.f114554c = i2;
        this.f114555d = f;
    }

    public final Object call() {
        C452861 r0 = this.f114552a;
        int i = this.f114553b;
        int i2 = this.f114554c;
        float f = this.f114555d;
        List<String> list = C45284c.this.f114502b;
        StringBuilder sb = new StringBuilder("type:");
        sb.append(i);
        sb.append(" ext:");
        sb.append(i2);
        sb.append(" f:");
        sb.append(f);
        list.add(sb.toString());
        return null;
    }
}
