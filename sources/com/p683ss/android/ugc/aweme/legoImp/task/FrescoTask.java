package com.p683ss.android.ugc.aweme.legoImp.task;

import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.FrescoTask */
public class FrescoTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b A[Catch:{ Exception -> 0x00b1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run(android.content.Context r13) {
        /*
            r12 = this;
            com.p683ss.android.ugc.aweme.video.C48016e.m103936a(r13)
            r13 = 1
            com.p683ss.android.ugc.aweme.base.C23515d.f62614a = r13     // Catch:{ Exception -> 0x00b1 }
            com.ss.android.ugc.aweme.image.d r0 = com.p683ss.android.ugc.aweme.image.C35488d.m80206a()     // Catch:{ Exception -> 0x00b1 }
            com.facebook.common.p921e.C13697a.m27671a(r0)     // Catch:{ Exception -> 0x00b1 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00b1 }
            r1 = 18
            r2 = 0
            if (r0 != r1) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 == 0) goto L_0x001c
            com.ss.android.ugc.aweme.image.p r0 = com.p683ss.android.ugc.aweme.image.C35507p.C35509a.f91267a     // Catch:{ Exception -> 0x00b1 }
            goto L_0x001e
        L_0x001c:
            com.ss.android.ugc.aweme.image.u r0 = com.p683ss.android.ugc.aweme.image.C35515u.C35517a.f91283a     // Catch:{ Exception -> 0x00b1 }
        L_0x001e:
            java.io.File r1 = com.p683ss.android.ugc.aweme.shortvideo.util.C45469z.m99091c()     // Catch:{ Exception -> 0x00b1 }
            boolean r3 = com.bytedance.p829r.C12662c.m25456a()     // Catch:{ Exception -> 0x00b1 }
            r4 = 10485760(0xa00000, double:5.180654E-317)
            r6 = 41943040(0x2800000, double:2.0722615E-316)
            if (r3 == 0) goto L_0x0044
            if (r1 == 0) goto L_0x0038
            long r8 = r1.getFreeSpace()     // Catch:{ Exception -> 0x00b1 }
            r10 = 8
            long r8 = r8 / r10
            goto L_0x0039
        L_0x0038:
            r8 = r6
        L_0x0039:
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x0044
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0042
            goto L_0x0045
        L_0x0042:
            r4 = r8
            goto L_0x0045
        L_0x0044:
            r4 = r6
        L_0x0045:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b1 }
            r3.<init>()     // Catch:{ Exception -> 0x00b1 }
            com.ss.android.ugc.aweme.image.q r6 = com.p683ss.android.ugc.aweme.image.C35510q.f91268e     // Catch:{ Exception -> 0x00b1 }
            r3.add(r6)     // Catch:{ Exception -> 0x00b1 }
            com.ss.android.ugc.aweme.image.l$1 r6 = new com.ss.android.ugc.aweme.image.l$1     // Catch:{ Exception -> 0x00b1 }
            r6.<init>()     // Catch:{ Exception -> 0x00b1 }
            com.facebook.net.C14543c.f37779c = r6     // Catch:{ Exception -> 0x00b1 }
            android.content.Context r6 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Exception -> 0x00b1 }
            com.bytedance.lighten.a.r$a r7 = new com.bytedance.lighten.a.r$a     // Catch:{ Exception -> 0x00b1 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x00b1 }
            r7.f32178o = r13     // Catch:{ Exception -> 0x00b1 }
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ Exception -> 0x00b1 }
            r7.f32173j = r6     // Catch:{ Exception -> 0x00b1 }
            r7.f32174k = r13     // Catch:{ Exception -> 0x00b1 }
            r6 = 5
            r7.f32171h = r6     // Catch:{ Exception -> 0x00b1 }
            r7.f32166c = r1     // Catch:{ Exception -> 0x00b1 }
            r7.f32167d = r4     // Catch:{ Exception -> 0x00b1 }
            r7.f32165b = r0     // Catch:{ Exception -> 0x00b1 }
            com.ss.android.ugc.aweme.image.g r0 = new com.ss.android.ugc.aweme.image.g     // Catch:{ Exception -> 0x00b1 }
            r0.<init>()     // Catch:{ Exception -> 0x00b1 }
            r7.f32172i = r0     // Catch:{ Exception -> 0x00b1 }
            r7.f32179p = r3     // Catch:{ Exception -> 0x00b1 }
            r7.f32175l = r13     // Catch:{ Exception -> 0x00b1 }
            r7.f32176m = r2     // Catch:{ Exception -> 0x00b1 }
            com.bytedance.lighten.a.c.n r0 = com.p683ss.android.ugc.aweme.image.C35502m.f91254a     // Catch:{ Exception -> 0x00b1 }
            r7.f32177n = r0     // Catch:{ Exception -> 0x00b1 }
            com.bytedance.lighten.a.r r0 = new com.bytedance.lighten.a.r     // Catch:{ Exception -> 0x00b1 }
            r1 = 0
            r0.<init>(r7)     // Catch:{ Exception -> 0x00b1 }
            boolean r1 = com.bytedance.lighten.p766a.C12203q.f32144c     // Catch:{ Exception -> 0x00b1 }
            if (r1 != 0) goto L_0x009c
            com.bytedance.lighten.p766a.C12203q.f32144c = r13     // Catch:{ Exception -> 0x00b1 }
            com.bytedance.lighten.p766a.C12203q.f32143b = r0     // Catch:{ Exception -> 0x00b1 }
            android.content.Context r13 = r0.f32146a     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r13 = r13.getPackageName()     // Catch:{ Exception -> 0x00b1 }
            com.bytedance.lighten.p766a.C12203q.f32145d = r13     // Catch:{ Exception -> 0x00b1 }
            com.bytedance.lighten.a.o r13 = com.bytedance.lighten.p766a.C12203q.f32142a     // Catch:{ Exception -> 0x00b1 }
            r13.init(r0)     // Catch:{ Exception -> 0x00b1 }
        L_0x009c:
            com.facebook.drawee.p930a.p931a.C13771c.f35833b = r2     // Catch:{ Exception -> 0x00b1 }
            com.bytedance.lighten.loader.s r13 = com.bytedance.lighten.loader.C12254s.m24730a()     // Catch:{ Exception -> 0x00b1 }
            com.facebook.imagepipeline.e.i r13 = r13.f32358a     // Catch:{ Exception -> 0x00b1 }
            com.bytedance.lighten.loader.q r13 = com.bytedance.lighten.loader.C12250q.m24726a()
            com.ss.android.ugc.aweme.legoImp.task.FrescoTask$1 r0 = new com.ss.android.ugc.aweme.legoImp.task.FrescoTask$1
            r0.<init>()
            r13.mo23182a(r0)
            return
        L_0x00b1:
            r13 = move-exception
            java.lang.String r0 = "[Lighten][Fresco][Initializer][Throwable]"
            com.bytedance.p502b.p503a.p506b.p508b.C9220a.m18312a(r13, r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.legoImp.task.FrescoTask.run(android.content.Context):void");
    }
}
