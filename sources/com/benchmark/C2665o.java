package com.benchmark;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.vesdk.VEBenchmark;

/* renamed from: com.benchmark.o */
public final class C2665o {

    /* renamed from: h */
    private static C2665o f8100h = new C2665o();

    /* renamed from: a */
    public String f8101a;

    /* renamed from: b */
    public String f8102b;

    /* renamed from: c */
    public String f8103c;

    /* renamed from: d */
    public String f8104d;

    /* renamed from: e */
    public String f8105e;

    /* renamed from: f */
    public String f8106f;

    /* renamed from: g */
    public String f8107g;

    /* renamed from: i */
    private int f8108i = -1;

    /* renamed from: a */
    public static C2665o m7657a() {
        return f8100h;
    }

    /* renamed from: c */
    public final void mo7219c() {
        if (this.f8108i == 0) {
            VEBenchmark.m108870a().mo98475b();
            this.f8108i = -1;
        }
    }

    /* renamed from: b */
    public final int mo7218b() {
        if (this.f8108i == 0) {
            return this.f8108i;
        }
        this.f8108i = VEBenchmark.m108870a().mo98472a(C11010c.m22280a(), this.f8102b);
        return this.f8108i;
    }

    private C2665o() {
        StringBuilder sb = new StringBuilder();
        sb.append(C11010c.m22280a().getFilesDir().getPath());
        sb.append("/benchmark/");
        this.f8101a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8101a);
        sb2.append("image.png");
        this.f8102b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f8101a);
        sb3.append("h264_video.mp4");
        this.f8103c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f8101a);
        sb4.append("h265_video.mp4");
        this.f8104d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f8101a);
        sb5.append("h264_video.yuv");
        this.f8105e = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f8101a);
        sb6.append("h265_video.yuv");
        this.f8106f = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(this.f8101a);
        sb7.append("h264_encode_video.mp4");
        this.f8107g = sb7.toString();
    }
}
