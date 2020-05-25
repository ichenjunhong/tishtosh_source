package com.google.android.play.core.p1053e.p1055b;

import com.google.android.play.core.p1053e.C17353r;
import java.util.List;

/* renamed from: com.google.android.play.core.e.b.e */
final class C17335e implements C17353r {

    /* renamed from: a */
    private final /* synthetic */ List f48837a;

    /* renamed from: b */
    private final /* synthetic */ long f48838b;

    /* renamed from: c */
    private final /* synthetic */ boolean f48839c;

    /* renamed from: d */
    private final /* synthetic */ List f48840d;

    /* renamed from: e */
    private final /* synthetic */ C17330a f48841e;

    C17335e(C17330a aVar, List list, long j, boolean z, List list2) {
        this.f48841e = aVar;
        this.f48837a = list;
        this.f48838b = j;
        this.f48839c = z;
        this.f48840d = list2;
    }

    /* renamed from: a */
    public final void mo33627a(int i) {
        this.f48841e.m42432b(6, i);
    }

    /* renamed from: a */
    public final void mo33626a() {
        this.f48841e.f48825f.addAll(this.f48837a);
        this.f48841e.m42433b(5, 0, Long.valueOf(this.f48838b), null, null, null);
    }

    /* renamed from: b */
    public final void mo33628b() {
        if (!this.f48839c) {
            this.f48841e.mo33623a(this.f48840d, this.f48837a, this.f48838b, true);
        }
    }
}
