package com.p683ss.android.ugc.aweme.shortvideo.record.p2224b;

import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import p2628d.C52847n;
import p2628d.C52855s;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.b.a */
public final class C44451a {

    /* renamed from: a */
    public static final C44451a f112452a = new C44451a();

    private C44451a() {
    }

    /* renamed from: a */
    public static final boolean m97278a(StitchParams stitchParams) {
        if (stitchParams == null || stitchParams.getMusic() == null || !stitchParams.isPGCMusic() || stitchParams.getMusicStart() < 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p2628d.C52847n<java.lang.Long, java.lang.Long> m97276a(com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams r5, long r6, long r8, long r10) {
        /*
            java.lang.String r0 = "stitchParams"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r0 = r5.getVideoSegment()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo r0 = r0.getVideoFileInfo()
            if (r0 == 0) goto L_0x0018
            long r3 = r0.getDuration()
            goto L_0x0019
        L_0x0018:
            r3 = r1
        L_0x0019:
            r0 = 0
            long r6 = r6 - r3
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x002c
            int r5 = r5.getMusicStart()
            long r0 = (long) r5
            long r8 = r8 - r0
            long r8 = r8 - r3
            long r10 = r10 - r3
            long r8 = java.lang.Math.min(r8, r10)
            goto L_0x0033
        L_0x002c:
            int r5 = r5.getMusicStart()
            long r10 = (long) r5
            long r8 = r8 - r10
            long r8 = r8 - r3
        L_0x0033:
            r10 = 3000(0xbb8, double:1.482E-320)
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x003a
            goto L_0x003e
        L_0x003a:
            long r6 = java.lang.Math.min(r6, r8)
        L_0x003e:
            d.n r5 = new d.n
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            long r6 = r6 + r3
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r5.<init>(r8, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.record.p2224b.C44451a.m97276a(com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams, long, long, long):d.n");
    }

    /* renamed from: a */
    public static final C52855s<Long, Long, Long> m97277a(StitchParams stitchParams, String str, C42482c cVar, long j) {
        long j2;
        C52711k.m112240b(stitchParams, "stitchParams");
        long b = (long) C39618d.f101168i.mo80578b(str);
        if (cVar != null) {
            j2 = (long) cVar.getShootDuration();
        } else {
            j2 = b;
        }
        C52847n a = m97276a(stitchParams, j, b, j2);
        return new C52855s<>(Long.valueOf(b), Long.valueOf(((Number) a.component1()).longValue()), Long.valueOf(((Number) a.component2()).longValue()));
    }
}
