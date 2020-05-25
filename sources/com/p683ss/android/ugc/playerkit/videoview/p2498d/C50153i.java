package com.p683ss.android.ugc.playerkit.videoview.p2498d;

import com.p683ss.android.linkselector.LinkSelector;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.video.experiment.VideoCDNUrlTimeoutExperiment;
import com.p683ss.android.ugc.playerkit.C50105b;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c;
import com.p683ss.android.ugc.playerkit.p2494c.C50121j;
import com.p683ss.android.ugc.playerkit.videoview.p2495a.C50133a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.playerkit.videoview.d.i */
public final class C50153i implements C50145c {

    /* renamed from: a */
    private long f125665a = VideoCDNUrlTimeoutExperiment.DEFAULT_TIMEOUT;

    /* renamed from: b */
    private List<C50149g> f125666b;

    /* renamed from: a */
    private static String[] m108210a(String[] strArr) {
        if (strArr.length == 0) {
            return strArr;
        }
        String str = null;
        int i = 0;
        while (true) {
            if (i >= strArr.length) {
                i = 0;
                break;
            } else if (strArr[i].contains("aweme/v1/play")) {
                str = strArr[i];
                break;
            } else {
                i++;
            }
        }
        if (str == null) {
            return strArr;
        }
        String a = LinkSelector.m46790a().mo39174a(str);
        if (C50105b.m108063a(a, str)) {
            return strArr;
        }
        for (int i2 = i; i2 < strArr.length; i2++) {
            if (C50105b.m108063a(a, strArr[i2])) {
                strArr[i2] = str;
                strArr[i] = a;
                return strArr;
            }
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        if (i == 0) {
            System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
            strArr2[0] = a;
        } else {
            System.arraycopy(strArr, 0, strArr2, 0, i);
            System.arraycopy(strArr, i, strArr2, i + 1, strArr.length - i);
            strArr2[i] = a;
        }
        return strArr2;
    }

    public C50153i(List<C50149g> list, long j) {
        if (list == null || list.isEmpty()) {
            list = Collections.singletonList(C50149g.f125661b);
        }
        this.f125666b = list;
        this.f125665a = j;
    }

    /* renamed from: a */
    public final C50121j mo97945a(VideoUrlModel videoUrlModel, C50116c cVar, boolean z) {
        C50133a b = mo97946b(videoUrlModel, cVar, z);
        C50121j jVar = new C50121j();
        C50146d dVar = new C50146d(videoUrlModel, b.f125639c, b.f125637a);
        C50147e a = new C50152h(this.f125666b, dVar, 0).mo97948a(dVar);
        jVar.f125595a = a.f125659a;
        jVar.f125601g = a.f125660b;
        jVar.f125597c = b.f125638b;
        jVar.f125598d = b.f125640d;
        jVar.f125596b = videoUrlModel.getRatio();
        jVar.f125599e = b.f125639c;
        if (b.f125640d != null) {
            jVar.f125600f = b.f125641e;
        } else {
            jVar.f125600f = videoUrlModel.getFileCheckSum();
        }
        return jVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cd  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.playerkit.videoview.p2495a.C50133a mo97946b(com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel r10, com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c r11, boolean r12) {
        /*
            r9 = this;
            com.ss.android.ugc.playerkit.videoview.a.a r0 = new com.ss.android.ugc.playerkit.videoview.a.a
            r0.<init>()
            java.lang.String r1 = r10.getBitRatedRatioUri()
            r0.f125639c = r1
            java.lang.String r1 = r10.getFileCheckSum()
            r0.f125641e = r1
            java.util.List r1 = r10.getUrlList()
            int r1 = r1.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.util.List r2 = r10.getUrlList()
            r2.toArray(r1)
            com.ss.android.ugc.playerkit.c.a r2 = com.p683ss.android.ugc.playerkit.p2494c.C50109a.m108068s()
            boolean r2 = r2.mo95428i()
            if (r2 == 0) goto L_0x0030
            java.lang.String[] r1 = m108210a(r1)
        L_0x0030:
            com.ss.android.ugc.playerkit.c.a r2 = com.p683ss.android.ugc.playerkit.p2494c.C50109a.m108068s()
            boolean r2 = r2.mo95430k()
            r3 = 0
            if (r2 == 0) goto L_0x00a4
            com.ss.android.ugc.playerkit.videoview.c r2 = com.p683ss.android.ugc.playerkit.videoview.C50140c.INSTANCE
            com.ss.android.ugc.playerkit.videoview.d.a r2 = r2.getBitrateManager()
            com.ss.android.ugc.d.a.a.a.a.c r2 = r2.mo95438a(r10)
            if (r2 == 0) goto L_0x00a4
            java.util.List r4 = r2.urlList()
            if (r4 == 0) goto L_0x00a4
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x00a4
            int r5 = r2.isH265()
            if (r5 != 0) goto L_0x0071
            java.lang.String[] r11 = new java.lang.String[r3]
            java.lang.Object[] r11 = r4.toArray(r11)
            r1 = r11
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r11 = r2.getUrlKey()
            r0.f125639c = r11
            r0.f125640d = r2
            java.lang.String r11 = r2.getChecksum()
            r0.f125641e = r11
            goto L_0x00a4
        L_0x0071:
            com.ss.android.ugc.playerkit.c.e$c r5 = com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c.TT
            boolean r5 = r5.equals(r11)
            if (r5 != 0) goto L_0x0081
            com.ss.android.ugc.playerkit.c.e$c r5 = com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c.TT_HARDWARE
            boolean r11 = r5.equals(r11)
            if (r11 == 0) goto L_0x00a4
        L_0x0081:
            if (r12 != 0) goto L_0x00a4
            java.lang.String[] r11 = new java.lang.String[r3]
            java.lang.Object[] r11 = r4.toArray(r11)
            r1 = r11
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r11 = r2.isH265()
            r12 = 1
            if (r11 != r12) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r12 = 0
        L_0x0095:
            java.lang.String r11 = r2.getUrlKey()
            r0.f125639c = r11
            r0.f125640d = r2
            java.lang.String r11 = r2.getChecksum()
            r0.f125641e = r11
            goto L_0x00a5
        L_0x00a4:
            r12 = 0
        L_0x00a5:
            com.ss.android.ugc.playerkit.c.a r11 = com.p683ss.android.ugc.playerkit.p2494c.C50109a.m108068s()
            boolean r11 = r11.mo95429j()
            if (r11 == 0) goto L_0x00c4
            r11 = 0
        L_0x00b0:
            int r2 = r1.length
            if (r11 >= r2) goto L_0x00c4
            com.ss.android.ugc.playerkit.videoview.c r2 = com.p683ss.android.ugc.playerkit.videoview.C50140c.INSTANCE
            com.ss.android.ugc.playerkit.videoview.d.b r2 = r2.getHttpsHelper()
            r4 = r1[r11]
            java.lang.String r2 = r2.mo95439a(r4)
            r1[r11] = r2
            int r11 = r11 + 1
            goto L_0x00b0
        L_0x00c4:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r2 = 0
        L_0x00ca:
            int r4 = r1.length
            if (r2 >= r4) goto L_0x0106
            r4 = r1[r2]
            if (r4 == 0) goto L_0x0103
            r4 = r1[r2]
            java.lang.String r5 = "aweme/v1/play"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x00ef
            com.ss.android.ugc.playerkit.videoview.c r4 = com.p683ss.android.ugc.playerkit.videoview.C50140c.INSTANCE
            com.ss.android.ugc.playerkit.videoview.d.f r4 = r4.getPlayUrlBuilder()
            r5 = r1[r2]
            com.ss.android.common.util.i r4 = r4.mo95440a(r5)
            java.lang.String r4 = r4.mo38774a()
            r11.add(r4)
            goto L_0x0103
        L_0x00ef:
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r6 = r10.getCreateTime()
            long r4 = r4 - r6
            long r6 = r9.f125665a
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0103
            r4 = r1[r2]
            r11.add(r4)
        L_0x0103:
            int r2 = r2 + 1
            goto L_0x00ca
        L_0x0106:
            java.lang.String[] r10 = new java.lang.String[r3]
            java.lang.Object[] r10 = r11.toArray(r10)
            java.lang.String[] r10 = (java.lang.String[]) r10
            r0.f125637a = r10
            r0.f125638b = r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.playerkit.videoview.p2498d.C50153i.mo97946b(com.ss.android.ugc.aweme.feed.model.VideoUrlModel, com.ss.android.ugc.playerkit.c.e$c, boolean):com.ss.android.ugc.playerkit.videoview.a.a");
    }
}
