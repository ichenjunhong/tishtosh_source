package com.benchmark.p124bl;

import com.benchmark.C2605a;
import com.benchmark.C2665o;
import java.util.concurrent.Callable;

/* renamed from: com.benchmark.bl.g */
final /* synthetic */ class C2639g implements Callable {

    /* renamed from: a */
    private final String f8072a;

    /* renamed from: b */
    private final String f8073b;

    /* renamed from: c */
    private final String f8074c;

    C2639g(String str, String str2, String str3) {
        this.f8072a = str;
        this.f8073b = str2;
        this.f8074c = str3;
    }

    public final Object call() {
        String str = this.f8072a;
        String str2 = this.f8073b;
        String str3 = this.f8074c;
        boolean a = C2605a.m7551a(C2665o.m7657a().f8102b, str);
        boolean a2 = C2605a.m7551a(C2665o.m7657a().f8103c, str2);
        boolean a3 = C2605a.m7551a(C2665o.m7657a().f8104d, str3);
        if (!a) {
            a = C2605a.m7552a(str, C2665o.m7657a().f8101a, "image.png");
        }
        if (!a2) {
            a2 = C2605a.m7552a(str2, C2665o.m7657a().f8101a, "h264_video.mp4");
        }
        if (!a3) {
            a3 = C2605a.m7552a(str3, C2665o.m7657a().f8101a, "h265_video.mp4");
        }
        return Boolean.valueOf(a && a2 && a3);
    }
}
