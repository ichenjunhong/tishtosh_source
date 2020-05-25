package com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.C31300c.C31301a;
import com.p683ss.android.ugc.aweme.runtime.behavior.C41319c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.j */
public abstract class C31338j extends C31304a {

    /* renamed from: a */
    public static final C31339a f82095a = new C31339a(null);

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.j$a */
    public static final class C31339a {
        private C31339a() {
        }

        public /* synthetic */ C31339a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final long mo64211b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    /* renamed from: d */
    public final List<AwemeToolFeedbackInfo> mo64223d() {
        long currentTimeMillis = System.currentTimeMillis() - mo64211b();
        List a = C31301a.m73024a().mo64184a("record_start", currentTimeMillis);
        List<C41319c> a2 = C31301a.m73024a().mo64184a("record_error", currentTimeMillis);
        List a3 = C31301a.m73024a().mo64184a("record_success", currentTimeMillis);
        List a4 = C31301a.m73024a().mo64184a("camera_start", currentTimeMillis);
        List<C41319c> a5 = C31301a.m73024a().mo64184a("camera_error", currentTimeMillis);
        List a6 = C31301a.m73024a().mo64184a("camera_success", currentTimeMillis);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C41319c cVar : a2) {
            arrayList2.add(new AwemeToolFeedbackECode(cVar.f104782d, null, 2, null));
        }
        AwemeToolFeedbackInfo awemeToolFeedbackInfo = new AwemeToolFeedbackInfo("录制", a.size(), a3.size(), 0, arrayList2);
        arrayList.add(awemeToolFeedbackInfo);
        ArrayList arrayList3 = new ArrayList();
        for (C41319c cVar2 : a5) {
            arrayList3.add(new AwemeToolFeedbackECode(cVar2.f104782d, null, 2, null));
        }
        AwemeToolFeedbackInfo awemeToolFeedbackInfo2 = new AwemeToolFeedbackInfo("相机启动", a4.size(), a6.size(), 0, arrayList3);
        arrayList.add(awemeToolFeedbackInfo2);
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r2.equals("record_start") != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r2.equals("record_error") != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r2.equals("record_success") != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r2.equals("camera_start") != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r2.equals("camera_error") != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r2.equals("camera_success") != false) goto L_0x0042;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo64210a(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "type"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -2122358630: goto L_0x003a;
                case -2109385996: goto L_0x0031;
                case -785402647: goto L_0x0028;
                case -603764626: goto L_0x001f;
                case -590791992: goto L_0x0016;
                case 134640149: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0044
        L_0x000d:
            java.lang.String r0 = "record_success"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0044
            goto L_0x0042
        L_0x0016:
            java.lang.String r0 = "camera_start"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0044
            goto L_0x0042
        L_0x001f:
            java.lang.String r0 = "camera_error"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0044
            goto L_0x0042
        L_0x0028:
            java.lang.String r0 = "camera_success"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0044
            goto L_0x0042
        L_0x0031:
            java.lang.String r0 = "record_start"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0044
            goto L_0x0042
        L_0x003a:
            java.lang.String r0 = "record_error"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0044
        L_0x0042:
            r2 = 1
            return r2
        L_0x0044:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31338j.mo64210a(java.lang.String):boolean");
    }
}
