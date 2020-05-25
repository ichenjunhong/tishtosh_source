package com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.C31300c.C31301a;
import com.p683ss.android.ugc.aweme.runtime.behavior.C41319c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.c */
public final class C31307c extends C31304a {

    /* renamed from: a */
    public static final C31308a f82063a = new C31308a(null);

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.c$a */
    public static final class C31308a {
        private C31308a() {
        }

        public /* synthetic */ C31308a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo64209a() {
        return "abnor_download";
    }

    /* renamed from: b */
    public final long mo64211b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    /* renamed from: c */
    public final String mo64212c() {
        long currentTimeMillis = System.currentTimeMillis() - mo64211b();
        List a = C31301a.m73024a().mo64184a("download_start", currentTimeMillis);
        List a2 = C31301a.m73024a().mo64184a("download_cancel", currentTimeMillis);
        List a3 = C31301a.m73024a().mo64184a("download_success", currentTimeMillis);
        List<C41319c> a4 = C31301a.m73024a().mo64184a("download_error", currentTimeMillis);
        List a5 = C31301a.m73024a().mo64184a("water_mark_start", currentTimeMillis);
        List a6 = C31301a.m73024a().mo64184a("water_mark_cancel", currentTimeMillis);
        List a7 = C31301a.m73024a().mo64184a("water_mark_success", currentTimeMillis);
        List a8 = C31301a.m73024a().mo64184a("water_mark_error", currentTimeMillis);
        StringBuilder sb = new StringBuilder();
        if (!a.isEmpty()) {
            StringBuilder sb2 = new StringBuilder("下载次数: ");
            sb2.append(a.size());
            sb2.append("次;");
            sb.append(sb2.toString());
        }
        if (!a2.isEmpty()) {
            StringBuilder sb3 = new StringBuilder("下载取消: ");
            sb3.append(a2.size());
            sb3.append("次;");
            sb.append(sb3.toString());
        }
        if (!a3.isEmpty()) {
            StringBuilder sb4 = new StringBuilder("下载成功: ");
            sb4.append(a3.size());
            sb4.append("次;");
            sb.append(sb4.toString());
        }
        if (!a4.isEmpty()) {
            StringBuilder sb5 = new StringBuilder("下载错误: ");
            sb5.append(a4.size());
            sb5.append("次(ECode:");
            sb.append(sb5.toString());
            boolean z = true;
            for (C41319c cVar : a4) {
                if (!z) {
                    sb.append(",");
                }
                sb.append(cVar.f104782d);
                z = false;
            }
            sb.append(");");
        }
        if (!a5.isEmpty()) {
            StringBuilder sb6 = new StringBuilder("水印次数: ");
            sb6.append(a5.size());
            sb6.append("次;");
            sb.append(sb6.toString());
        }
        if (!a6.isEmpty()) {
            StringBuilder sb7 = new StringBuilder("水印取消: ");
            sb7.append(a6.size());
            sb7.append("次;");
            sb.append(sb7.toString());
        }
        if (!a7.isEmpty()) {
            StringBuilder sb8 = new StringBuilder("水印成功: ");
            sb8.append(a7.size());
            sb8.append("次;");
            sb.append(sb8.toString());
        }
        if (!a8.isEmpty()) {
            StringBuilder sb9 = new StringBuilder("水印错误: ");
            sb9.append(a8.size());
            sb9.append("次;");
            sb.append(sb9.toString());
        }
        String sb10 = sb.toString();
        C52711k.m112236a((Object) sb10, "result.toString()");
        return sb10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r2.equals("download_error") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r2.equals("download_cancel") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r2.equals("download_success") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r2.equals("water_mark_cancel") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r2.equals("water_mark_success") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r2.equals("water_mark_start") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r2.equals("water_mark_error") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r2.equals("download_start") != false) goto L_0x0054;
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
                case -1826452220: goto L_0x004c;
                case -210589876: goto L_0x0043;
                case 71186961: goto L_0x003a;
                case 974485393: goto L_0x0031;
                case 987458027: goto L_0x0028;
                case 1051818558: goto L_0x001f;
                case 1064791192: goto L_0x0016;
                case 1092137657: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0056
        L_0x000d:
            java.lang.String r0 = "water_mark_success"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0056
            goto L_0x0054
        L_0x0016:
            java.lang.String r0 = "water_mark_start"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0056
            goto L_0x0054
        L_0x001f:
            java.lang.String r0 = "water_mark_error"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0056
            goto L_0x0054
        L_0x0028:
            java.lang.String r0 = "download_start"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0056
            goto L_0x0054
        L_0x0031:
            java.lang.String r0 = "download_error"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0056
            goto L_0x0054
        L_0x003a:
            java.lang.String r0 = "download_cancel"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0056
            goto L_0x0054
        L_0x0043:
            java.lang.String r0 = "download_success"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0056
            goto L_0x0054
        L_0x004c:
            java.lang.String r0 = "water_mark_cancel"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0056
        L_0x0054:
            r2 = 1
            return r2
        L_0x0056:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31307c.mo64210a(java.lang.String):boolean");
    }
}
