package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.p923g.C13705d;
import com.facebook.common.p923g.C13706e;
import com.facebook.imagepipeline.p976p.C14237b;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.facebook.imagepipeline.memory.ab */
public final class C14064ab {

    /* renamed from: a */
    public final C14068ad f36742a;

    /* renamed from: b */
    public final C14069ae f36743b;

    /* renamed from: c */
    public final C14068ad f36744c;

    /* renamed from: d */
    public final C13705d f36745d;

    /* renamed from: e */
    public final C14068ad f36746e;

    /* renamed from: f */
    public final C14069ae f36747f;

    /* renamed from: g */
    public final C14068ad f36748g;

    /* renamed from: h */
    public final C14069ae f36749h;

    /* renamed from: i */
    public final String f36750i;

    /* renamed from: j */
    public final int f36751j;

    /* renamed from: k */
    public final int f36752k;

    /* renamed from: com.facebook.imagepipeline.memory.ab$a */
    public static class C14066a {

        /* renamed from: a */
        public C14068ad f36753a;

        /* renamed from: b */
        public C14069ae f36754b;

        /* renamed from: c */
        public C14068ad f36755c;

        /* renamed from: d */
        public C13705d f36756d;

        /* renamed from: e */
        public C14068ad f36757e;

        /* renamed from: f */
        public C14069ae f36758f;

        /* renamed from: g */
        public C14068ad f36759g;

        /* renamed from: h */
        public C14069ae f36760h;

        /* renamed from: i */
        public String f36761i;

        /* renamed from: j */
        public int f36762j;

        /* renamed from: k */
        public int f36763k;

        private C14066a() {
        }

        /* renamed from: a */
        public final C14064ab mo26318a() {
            return new C14064ab(this);
        }
    }

    /* renamed from: a */
    public static C14066a m28770a() {
        return new C14066a();
    }

    private C14064ab(C14066a aVar) {
        C14068ad adVar;
        C14069ae aeVar;
        C14068ad adVar2;
        C13705d dVar;
        C14068ad adVar3;
        C14069ae aeVar2;
        C14068ad adVar4;
        C14069ae aeVar3;
        String str;
        int i;
        int i2;
        if (C14237b.m29187b()) {
            C14237b.m29186a("PoolConfig()");
        }
        if (aVar.f36753a == null) {
            adVar = C14082k.m28814a();
        } else {
            adVar = aVar.f36753a;
        }
        this.f36742a = adVar;
        if (aVar.f36754b == null) {
            aeVar = C14099y.m28869a();
        } else {
            aeVar = aVar.f36754b;
        }
        this.f36743b = aeVar;
        int i3 = 4194304;
        if (aVar.f36755c == null) {
            adVar2 = new C14068ad(4194304, C14083l.f36805a * 4194304, C14083l.m28815a(131072, 4194304, C14083l.f36805a), 131072, 4194304, C14083l.f36805a);
        } else {
            adVar2 = aVar.f36755c;
        }
        this.f36744c = adVar2;
        if (aVar.f36756d == null) {
            dVar = C13706e.m27726a();
        } else {
            dVar = aVar.f36756d;
        }
        this.f36745d = dVar;
        if (aVar.f36757e == null) {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sparseIntArray.put(PreloadTask.BYTE_UNIT_NUMBER, 5);
            sparseIntArray.put(2048, 5);
            sparseIntArray.put(4096, 5);
            sparseIntArray.put(VideoCacheReadBuffersizeExperiment.DEFAULT, 5);
            sparseIntArray.put(16384, 5);
            sparseIntArray.put(32768, 5);
            sparseIntArray.put(65536, 5);
            sparseIntArray.put(131072, 5);
            sparseIntArray.put(262144, 2);
            sparseIntArray.put(524288, 2);
            sparseIntArray.put(1048576, 2);
            int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
            if (min < 16777216) {
                i = 3145728;
            } else if (min < 33554432) {
                i = 6291456;
            } else {
                i = 12582912;
            }
            int min2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
            if (min2 < 16777216) {
                i2 = min2 / 2;
            } else {
                i2 = (min2 / 4) * 3;
            }
            adVar3 = new C14068ad(i, i2, sparseIntArray);
        } else {
            adVar3 = aVar.f36757e;
        }
        this.f36746e = adVar3;
        if (aVar.f36758f == null) {
            aeVar2 = C14099y.m28869a();
        } else {
            aeVar2 = aVar.f36758f;
        }
        this.f36747f = aeVar2;
        if (aVar.f36759g == null) {
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            sparseIntArray2.put(16384, 5);
            adVar4 = new C14068ad(81920, 1048576, sparseIntArray2);
        } else {
            adVar4 = aVar.f36759g;
        }
        this.f36748g = adVar4;
        if (aVar.f36760h == null) {
            aeVar3 = C14099y.m28869a();
        } else {
            aeVar3 = aVar.f36760h;
        }
        this.f36749h = aeVar3;
        if (aVar.f36761i == null) {
            str = "legacy";
        } else {
            str = aVar.f36761i;
        }
        this.f36750i = str;
        this.f36751j = aVar.f36762j;
        if (aVar.f36763k > 0) {
            i3 = aVar.f36763k;
        }
        this.f36752k = i3;
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
    }
}
