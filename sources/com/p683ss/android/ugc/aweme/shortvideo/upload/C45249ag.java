package com.p683ss.android.ugc.aweme.shortvideo.upload;

import android.os.SystemClock;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.net.C44332b;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2248c.C45292c;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.ag */
public final class C45249ag {

    /* renamed from: e */
    public static final C45250a f114441e = new C45250a(null);

    /* renamed from: a */
    public final int f114442a = C39629l.m88232a().mo58583n().mo83104b(C40790a.UploadStatusReportGapS);

    /* renamed from: b */
    public C1690c f114443b;

    /* renamed from: c */
    public long f114444c = -1;

    /* renamed from: d */
    public boolean f114445d;

    /* renamed from: f */
    private final ConcurrentLinkedQueue<String> f114446f = new ConcurrentLinkedQueue<>();

    /* renamed from: g */
    private volatile boolean f114447g;

    /* renamed from: h */
    private final String f114448h;

    /* renamed from: i */
    private final boolean f114449i;

    /* renamed from: j */
    private final C45292c f114450j;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.ag$a */
    public static final class C45250a {
        private C45250a() {
        }

        public /* synthetic */ C45250a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.ag$b */
    public static final class C45251b<T> implements C1710e<Long> {

        /* renamed from: a */
        final /* synthetic */ C45249ag f114451a;

        public C45251b(C45249ag agVar) {
            this.f114451a = agVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Long l = (Long) obj;
            this.f114451a.mo91540a(null);
        }
    }

    /* renamed from: b */
    public final void mo91541b(C45319v vVar) {
        C52711k.m112240b(vVar, "resultState");
        if (this.f114442a > 0) {
            this.f114447g = true;
            if (this.f114443b != null) {
                C1690c cVar = this.f114443b;
                if (cVar == null) {
                    C52711k.m112234a();
                }
                if (!cVar.isDisposed()) {
                    C1690c cVar2 = this.f114443b;
                    if (cVar2 == null) {
                        C52711k.m112234a();
                    }
                    cVar2.dispose();
                }
            }
            mo91540a(vVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo91540a(C45319v vVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = "parallel_publish_result";
        C23089d a = C23089d.m56640a().mo47826a("mob_lost_assist", 1).mo47827a("mob_lost_gap", SystemClock.uptimeMillis() - this.f114444c).mo47826a("status", 20001).mo47828a("upload_is_success", (Object) vVar);
        String str6 = "retry_publish";
        if (this.f114449i) {
            str = "1";
        } else {
            str = "0";
        }
        C23089d a2 = a.mo47829a(str6, str);
        String str7 = "is_synthetic_success";
        if (this.f114450j.mo91554b()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C23089d a3 = a2.mo47829a(str7, str2).mo47826a("synthetic_error_code", this.f114450j.f114533e).mo47826a("publish_step", 32);
        String str8 = "is_click_publish";
        if (this.f114445d) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        C23089d a4 = a3.mo47829a(str8, str3);
        String str9 = "network_available";
        if (C44332b.m97107a(C39629l.m88233b())) {
            str4 = "1";
        } else {
            str4 = "0";
        }
        C23089d a5 = a4.mo47829a(str9, str4);
        String str10 = "upload_error_msg";
        ArrayList<String> arrayList = new ArrayList<>(this.f114446f);
        this.f114446f.clear();
        String str11 = "";
        for (String str12 : arrayList) {
            StringBuilder sb = new StringBuilder();
            sb.append(str11);
            sb.append(" | ");
            sb.append(str12);
            str11 = sb.toString();
        }
        C26890h.m65011a(str5, a5.mo47829a(str10, str11).mo47829a("publish_id", this.f114448h).f61491a);
    }

    /* renamed from: a */
    public final void mo91539a(int i, String str) {
        boolean z;
        if (this.f114442a > 0 && !this.f114447g) {
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (this.f114446f.size() >= 20) {
                    this.f114446f.poll();
                }
                ConcurrentLinkedQueue<String> concurrentLinkedQueue = this.f114446f;
                StringBuilder sb = new StringBuilder("[");
                sb.append(i);
                sb.append("][");
                sb.append(System.currentTimeMillis());
                sb.append(']');
                sb.append(str);
                concurrentLinkedQueue.offer(sb.toString());
            }
        }
    }

    public C45249ag(String str, boolean z, boolean z2, C45292c cVar) {
        C52711k.m112240b(str, "publishId");
        C52711k.m112240b(cVar, "publishPerformanceRecorder");
        this.f114448h = str;
        this.f114449i = z;
        this.f114445d = z2;
        this.f114450j = cVar;
    }
}
