package com.p683ss.android.socialbase.downloader.impls;

import android.app.Notification;
import android.os.IBinder;
import android.os.RemoteException;
import com.p683ss.android.socialbase.downloader.depend.C19823ab;
import com.p683ss.android.socialbase.downloader.depend.C19823ab.C19824a;
import com.p683ss.android.socialbase.downloader.depend.C19826ac;
import com.p683ss.android.socialbase.downloader.depend.C19855n;
import com.p683ss.android.socialbase.downloader.depend.C19869v;
import com.p683ss.android.socialbase.downloader.depend.C19874y;
import com.p683ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.downloader.C19886c;
import com.p683ss.android.socialbase.downloader.downloader.C19898j;
import com.p683ss.android.socialbase.downloader.downloader.C19898j.C19899a;
import com.p683ss.android.socialbase.downloader.downloader.C19904n;
import com.p683ss.android.socialbase.downloader.downloader.C19905o;
import com.p683ss.android.socialbase.downloader.downloader.C19906p;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService;
import com.p683ss.android.socialbase.downloader.model.DownloadChunk;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.socialbase.downloader.p1212b.C19787h;
import com.p683ss.android.socialbase.downloader.p1214d.C19819a;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;
import com.p683ss.android.socialbase.downloader.p1221j.C19996g;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.impls.o */
public class C19979o implements C19904n, C19905o {

    /* renamed from: a */
    private static final String f54917a = "o";

    /* renamed from: b */
    private volatile C19898j f54918b;

    /* renamed from: c */
    private C19906p<IndependentProcessDownloadService> f54919c = C19884b.m48618o();

    /* renamed from: d */
    private C19904n f54920d = new C19981p();

    /* renamed from: b */
    public final void mo41591b(DownloadInfo downloadInfo) {
    }

    /* renamed from: h */
    public final void mo41623h() {
        this.f54918b = null;
    }

    /* renamed from: a */
    public final void mo41579a(int i, boolean z) {
        if (this.f54918b == null) {
            this.f54920d.mo41579a(i, z);
            return;
        }
        try {
            this.f54918b.mo41523a(i, z);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final void mo41583a(List<String> list) {
        if (this.f54918b == null) {
            this.f54920d.mo41583a(list);
            return;
        }
        try {
            this.f54918b.mo41527a(list);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo41585a(DownloadInfo downloadInfo) {
        if (this.f54918b == null) {
            return this.f54920d.mo41585a(downloadInfo);
        }
        try {
            this.f54918b.mo41529a(downloadInfo);
        } catch (RemoteException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public final void mo41576a(int i, Notification notification) {
        if (this.f54918b == null) {
            C19819a.m48486b(f54917a, "startForeground, aidlService is null");
            return;
        }
        String str = f54917a;
        StringBuilder sb = new StringBuilder("aidlService.startForeground, id = ");
        sb.append(i);
        C19819a.m48484a(str, sb.toString());
        try {
            this.f54918b.mo41520a(i, notification);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final void mo41584a(boolean z, boolean z2) {
        if (this.f54918b == null) {
            C19819a.m48486b(f54917a, "stopForeground, aidlService is null");
            return;
        }
        C19819a.m48484a(f54917a, "aidlService.stopForeground");
        try {
            this.f54918b.mo41528a(z2);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final void mo41582a(DownloadTask downloadTask) {
        if (!(downloadTask == null || this.f54919c == null)) {
            this.f54919c.mo41471b(downloadTask);
        }
    }

    /* renamed from: a */
    public final void mo41578a(int i, List<DownloadChunk> list) {
        if (this.f54918b != null) {
            try {
                this.f54918b.mo41533b(i, list);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo41581a(DownloadChunk downloadChunk) {
        if (this.f54918b == null) {
            this.f54920d.mo41581a(downloadChunk);
            return;
        }
        try {
            this.f54918b.mo41525a(downloadChunk);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final void mo41580a(C19826ac acVar) {
        C19823ab abVar;
        if (this.f54918b != null) {
            try {
                C19898j jVar = this.f54918b;
                if (acVar == null) {
                    abVar = null;
                } else {
                    abVar = new C19824a(acVar) {

                        /* renamed from: a */
                        final /* synthetic */ C19826ac f54998a;

                        {
                            this.f54998a = r1;
                        }

                        /* renamed from: a */
                        public final void mo41313a(int i, int i2) {
                            this.f54998a.mo41317a(i, i2);
                        }
                    };
                }
                jVar.mo41524a(abVar);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo41577a(int i, C19869v vVar) {
        if (this.f54918b != null) {
            try {
                this.f54918b.mo41521a(i, C19996g.m49395a(vVar));
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo41622a(IBinder iBinder) {
        this.f54918b = C19899a.m48725a(iBinder);
        if (C19994e.m49347a()) {
            mo41580a((C19826ac) new C19826ac() {
                /* renamed from: a */
                public final void mo41317a(int i, int i2) {
                    if (i2 == 1) {
                        Downloader.getInstance(C19884b.m48627x()).pause(i);
                        List i3 = C19971l.m49132a(false).mo41611i(i);
                        if (i3 != null) {
                            C19971l.m49132a(true).mo41578a(i, C19994e.m49339a(i3));
                        }
                        return;
                    }
                    if (i2 == 2) {
                        Downloader.getInstance(C19884b.m48627x()).cancel(i);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public final boolean mo41598c() {
        return C19884b.m48628y();
    }

    /* renamed from: g */
    public final boolean mo41608g() {
        if (this.f54918b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo41569a() {
        if (this.f54918b != null) {
            try {
                this.f54918b.mo41513a();
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: d */
    public final void mo41601d() {
        if (this.f54919c != null) {
            this.f54919c.mo41477f();
        }
    }

    public C19979o() {
        this.f54919c.mo41466a((C19905o) this);
    }

    /* renamed from: f */
    public final void mo41607f() {
        if (this.f54918b == null) {
            this.f54920d.mo41607f();
            return;
        }
        try {
            this.f54918b.mo41543d();
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: e */
    public final boolean mo41605e() {
        if (this.f54918b == null) {
            return this.f54920d.mo41605e();
        }
        try {
            return this.f54918b.mo41541c();
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo41593b() {
        if (this.f54918b == null) {
            C19819a.m48486b(f54917a, "isServiceForeground, aidlService is null");
            return false;
        }
        C19819a.m48484a(f54917a, "aidlService.isServiceForeground");
        try {
            return this.f54918b.mo41547e();
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final void mo41596c(int i) {
        if (this.f54918b != null) {
            try {
                this.f54918b.mo41539c(i);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: e */
    public final long mo41603e(int i) {
        if (this.f54918b == null) {
            return 0;
        }
        try {
            return this.f54918b.mo41545e(i);
        } catch (RemoteException unused) {
            return 0;
        }
    }

    /* renamed from: f */
    public final int mo41606f(int i) {
        if (this.f54918b == null) {
            return 0;
        }
        try {
            return this.f54918b.mo41548f(i);
        } catch (RemoteException unused) {
            return 0;
        }
    }

    /* renamed from: g */
    public final boolean mo41609g(int i) {
        if (this.f54918b == null) {
            return false;
        }
        try {
            return this.f54918b.mo41549g(i);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: k */
    public final void mo41613k(int i) {
        if (this.f54919c != null) {
            this.f54919c.mo41462a(i);
        }
    }

    /* renamed from: l */
    public final boolean mo41614l(int i) {
        if (this.f54918b == null) {
            return false;
        }
        try {
            return this.f54918b.mo41553k(i);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final List<DownloadInfo> mo41568a(String str) {
        if (this.f54918b == null) {
            return this.f54920d.mo41568a(str);
        }
        try {
            return this.f54918b.mo41512a(str);
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final List<DownloadInfo> mo41587b(String str) {
        if (this.f54918b == null) {
            return this.f54920d.mo41587b(str);
        }
        try {
            return this.f54918b.mo41531b(str);
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final List<DownloadInfo> mo41595c(String str) {
        if (this.f54918b == null) {
            return this.f54920d.mo41595c(str);
        }
        try {
            return this.f54918b.mo41538c(str);
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final List<DownloadInfo> mo41600d(String str) {
        if (this.f54918b == null) {
            return this.f54920d.mo41600d(str);
        }
        try {
            return this.f54918b.mo41546e(str);
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final List<DownloadInfo> mo41604e(String str) {
        if (this.f54918b != null) {
            try {
                return this.f54918b.mo41542d(str);
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    /* renamed from: h */
    public final DownloadInfo mo41610h(int i) {
        if (this.f54918b == null) {
            return this.f54920d.mo41610h(i);
        }
        try {
            return this.f54918b.mo41550h(i);
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public final List<DownloadChunk> mo41611i(int i) {
        if (this.f54918b == null) {
            return this.f54920d.mo41611i(i);
        }
        try {
            return this.f54918b.mo41551i(i);
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public final void mo41612j(int i) {
        if (this.f54918b == null) {
            this.f54920d.mo41612j(i);
            return;
        }
        try {
            this.f54918b.mo41552j(i);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: m */
    public final int mo41615m(int i) {
        if (this.f54918b == null) {
            return C19886c.m48631a().mo41484b(i);
        }
        try {
            return this.f54918b.mo41555m(i);
        } catch (RemoteException unused) {
            return -1;
        }
    }

    /* renamed from: n */
    public final boolean mo41616n(int i) {
        if (this.f54918b == null) {
            return this.f54920d.mo41616n(i);
        }
        try {
            return this.f54918b.mo41556n(i);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: o */
    public final void mo41617o(int i) {
        if (this.f54918b == null) {
            this.f54920d.mo41617o(i);
            return;
        }
        try {
            this.f54918b.mo41557o(i);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: p */
    public final boolean mo41618p(int i) {
        if (this.f54918b == null) {
            return this.f54920d.mo41618p(i);
        }
        try {
            return this.f54918b.mo41558p(i);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: q */
    public final C19869v mo41619q(int i) {
        if (this.f54918b != null) {
            try {
                return C19996g.m49396a(this.f54918b.mo41559q(i));
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    /* renamed from: r */
    public final C19874y mo41620r(int i) {
        if (this.f54918b != null) {
            try {
                return C19996g.m49398a(this.f54918b.mo41560r(i));
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    /* renamed from: s */
    public final C19855n mo41621s(int i) {
        if (this.f54918b != null) {
            try {
                return C19996g.m49394a(this.f54918b.mo41561s(i));
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo41570a(int i) {
        if (this.f54918b != null) {
            try {
                this.f54918b.mo41514a(i);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: d */
    public final void mo41602d(int i) {
        if (this.f54918b != null) {
            try {
                this.f54918b.mo41544d(i);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: c */
    public final boolean mo41599c(DownloadInfo downloadInfo) {
        if (this.f54918b == null) {
            return this.f54920d.mo41599c(downloadInfo);
        }
        try {
            return this.f54918b.mo41537b(downloadInfo);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void mo41592b(DownloadTask downloadTask) {
        if (!(downloadTask == null || this.f54919c == null)) {
            this.f54919c.mo41474c(downloadTask);
        }
    }

    /* renamed from: b */
    public final boolean mo41594b(int i) {
        if (this.f54918b == null) {
            return false;
        }
        try {
            return this.f54918b.mo41536b(i);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final int mo41567a(String str, String str2) {
        return C19884b.m48597a(str, str2);
    }

    /* renamed from: b */
    public final DownloadInfo mo41586b(String str, String str2) {
        return mo41610h(mo41567a(str, str2));
    }

    /* renamed from: c */
    public final void mo41597c(int i, boolean z) {
        if (this.f54918b != null) {
            try {
                this.f54918b.mo41540c(i, z);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo41571a(int i, int i2) {
        if (this.f54918b != null) {
            try {
                this.f54918b.mo41515a(i, i2);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo41589b(int i, List<DownloadChunk> list) {
        if (this.f54918b == null) {
            this.f54920d.mo41589b(i, list);
            return;
        }
        try {
            this.f54918b.mo41522a(i, list);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: b */
    public final void mo41590b(int i, boolean z) {
        if (this.f54918b == null) {
            this.f54920d.mo41590b(i, z);
            return;
        }
        try {
            this.f54918b.mo41534b(i, z);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final void mo41574a(int i, int i2, long j) {
        if (this.f54918b == null) {
            this.f54920d.mo41574a(i, i2, j);
            return;
        }
        try {
            this.f54918b.mo41518a(i, i2, j);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final void mo41572a(int i, int i2, int i3, int i4) {
        if (this.f54918b == null) {
            this.f54920d.mo41572a(i, i2, i3, i4);
            return;
        }
        try {
            this.f54918b.mo41516a(i, i2, i3, i4);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public final void mo41573a(int i, int i2, int i3, long j) {
        if (this.f54918b == null) {
            this.f54920d.mo41573a(i, i2, i3, j);
            return;
        }
        try {
            this.f54918b.mo41517a(i, i2, i3, j);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: b */
    public final void mo41588b(int i, int i2, IDownloadListener iDownloadListener, C19787h hVar, boolean z) {
        boolean z2;
        if (this.f54918b != null) {
            try {
                C19898j jVar = this.f54918b;
                if (hVar == C19787h.SUB) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                jVar.mo41519a(i, i2, C19996g.m49393a(iDownloadListener, z2), hVar.ordinal(), z);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo41575a(int i, int i2, IDownloadListener iDownloadListener, C19787h hVar, boolean z) {
        boolean z2;
        if (this.f54918b != null) {
            try {
                C19898j jVar = this.f54918b;
                if (hVar == C19787h.SUB) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                jVar.mo41532b(i, i2, C19996g.m49393a(iDownloadListener, z2), hVar.ordinal(), z);
            } catch (RemoteException unused) {
            }
        }
    }
}
