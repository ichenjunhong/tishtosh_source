package com.p683ss.android.ugc.aweme.tools.extract;

import android.graphics.Bitmap.CompressFormat;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20426a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.C46476a;
import com.p683ss.android.ugc.aweme.tools.extract.C47038j.C47039a;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.m */
public final class C47044m extends C47027a {

    /* renamed from: e */
    public final C20426a f118798e;

    /* renamed from: f */
    public long f118799f;

    /* renamed from: g */
    public boolean f118800g = C39618d.f101151O.mo83117a(C40796a.IsExportHqFrame);

    /* renamed from: h */
    public AtomicBoolean f118801h = new AtomicBoolean(false);

    /* renamed from: i */
    private ScheduledExecutorService f118802i;

    /* renamed from: f */
    public final String mo94328f() {
        return "extract_shot";
    }

    /* renamed from: a */
    public final void mo94316a() {
        super.mo94316a();
        if (this.f118802i != null) {
            this.f118802i.shutdown();
        }
    }

    /* renamed from: a */
    public final void mo94320a(boolean z) {
        super.mo94320a(z);
    }

    /* renamed from: a */
    public final Runnable mo94335a(final int i) {
        return new Runnable() {
            public final void run() {
                boolean z;
                String a;
                long currentTimeMillis = System.currentTimeMillis();
                if (C47044m.this.f118775b) {
                    if (i == 2 || i == 4) {
                        C47044m.this.f118801h.set(true);
                    }
                    if (!C47044m.this.f118801h.get() || !C47044m.this.f118800g || C46476a.m100895c()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        C47040k kVar = C47044m.this.f118776c;
                        StringBuilder sb = new StringBuilder();
                        sb.append(kVar.f118792a);
                        sb.append(File.separator);
                        sb.append("extract-frame-");
                        sb.append(System.currentTimeMillis());
                        sb.append("_hq.jpg");
                        a = sb.toString();
                    } else {
                        a = C47044m.this.f118776c.mo78585a();
                    }
                    String str = a;
                    C47044m.this.f118799f = System.currentTimeMillis();
                    int[] iArr = z ? new int[]{Math.min(C39618d.f101176q.getVideoWidth(), 720), Math.min(C39618d.f101176q.getVideoHeight(), 1280)} : C47037i.f118791a;
                    C47044m.this.f118801h.set(false);
                    C20426a aVar = C47044m.this.f118798e;
                    int i = iArr[0];
                    int i2 = iArr[1];
                    boolean c = C46476a.m100895c();
                    CompressFormat compressFormat = CompressFormat.JPEG;
                    C47046n nVar = new C47046n(this, str, currentTimeMillis, i);
                    aVar.mo43296a(str, i, i2, c, compressFormat, (C52671b<? super Integer, C52860x>) nVar);
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ Object mo94338a(Integer num, String str) throws Exception {
                if (num.intValue() == 0) {
                    C47044m.this.f118774a.addFrameAtLastSegment(str);
                }
                return null;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ C52860x mo94337a(String str, long j, int i, Integer num) {
                int i2;
                int currentTimeMillis = (int) (System.currentTimeMillis() - C47044m.this.f118799f);
                C0013i.m18a((Callable<TResult>) new C47047o<TResult>(this, num, str), C0013i.f25b);
                C47702b.f120193a.mo94984a("tool_performance_record_fetch_frames", C42438az.m93209a().mo86524a("duration", System.currentTimeMillis() - j).f107329a);
                C47044m mVar = C47044m.this;
                Runnable a = C47044m.this.mo94335a(i + 1);
                if (currentTimeMillis > 2000) {
                    i2 = 0;
                } else {
                    i2 = 2000 - currentTimeMillis;
                }
                mVar.mo94336a(a, i2);
                return C52860x.f131107a;
            }
        };
    }

    public C47044m(C20426a aVar) {
        this.f118798e = aVar;
    }

    /* renamed from: a */
    public final void mo94318a(C47039a aVar) {
        int i;
        super.mo94318a(aVar);
        if (m102125b()) {
            if (this.f118774a != null) {
                i = this.f118774a.getAllFrames().size();
            } else {
                i = 0;
            }
            mo94336a(mo94335a(i), 0);
        }
    }

    /* renamed from: a */
    public final void mo94336a(Runnable runnable, int i) {
        if (this.f118802i == null || this.f118802i.isShutdown()) {
            this.f118802i = C47048p.m102171a();
        }
        this.f118802i.schedule(runnable, (long) i, TimeUnit.MILLISECONDS);
    }
}
