package com.p683ss.android.socialbase.downloader.impls;

import android.app.Notification;
import android.os.RemoteException;
import com.p683ss.android.socialbase.downloader.depend.C19823ab;
import com.p683ss.android.socialbase.downloader.depend.C19826ac;
import com.p683ss.android.socialbase.downloader.depend.C19834e;
import com.p683ss.android.socialbase.downloader.depend.C19840g;
import com.p683ss.android.socialbase.downloader.depend.C19866u;
import com.p683ss.android.socialbase.downloader.depend.C19871x;
import com.p683ss.android.socialbase.downloader.downloader.C19886c;
import com.p683ss.android.socialbase.downloader.downloader.C19898j.C19899a;
import com.p683ss.android.socialbase.downloader.downloader.C19904n;
import com.p683ss.android.socialbase.downloader.model.C20045a;
import com.p683ss.android.socialbase.downloader.model.DownloadChunk;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;
import com.p683ss.android.socialbase.downloader.p1221j.C19996g;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.impls.m */
public class C19973m extends C19899a {

    /* renamed from: a */
    private static final String f54902a = "m";

    /* renamed from: b */
    private final C19904n f54903b = new C19981p(true);

    /* renamed from: a */
    public final void mo41526a(C20045a aVar) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41592b(C19996g.m49399a(aVar));
        }
    }

    /* renamed from: a */
    public final void mo41523a(int i, boolean z) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41579a(i, z);
        }
    }

    /* renamed from: a */
    public final void mo41527a(List<String> list) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41583a(list);
        }
    }

    /* renamed from: a */
    public final void mo41519a(int i, int i2, C19840g gVar, int i3, boolean z) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41588b(i, i2, C19996g.m49391a(gVar), C19994e.m49361b(i3), z);
        }
    }

    /* renamed from: a */
    public final boolean mo41529a(DownloadInfo downloadInfo) throws RemoteException {
        if (this.f54903b == null) {
            return false;
        }
        return this.f54903b.mo41585a(downloadInfo);
    }

    /* renamed from: a */
    public final void mo41520a(int i, Notification notification) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41576a(i, notification);
        }
    }

    /* renamed from: a */
    public final void mo41528a(boolean z) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41584a(true, z);
        }
    }

    /* renamed from: a */
    public final void mo41525a(DownloadChunk downloadChunk) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41581a(downloadChunk);
        }
    }

    /* renamed from: a */
    public final void mo41522a(int i, List<DownloadChunk> list) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41589b(i, list);
        }
    }

    /* renamed from: a */
    public final void mo41524a(C19823ab abVar) throws RemoteException {
        C19826ac acVar;
        if (this.f54903b != null) {
            C19904n nVar = this.f54903b;
            if (abVar == null) {
                acVar = null;
            } else {
                acVar = new C19826ac(abVar) {

                    /* renamed from: a */
                    final /* synthetic */ C19823ab f54999a;

                    {
                        this.f54999a = r1;
                    }

                    /* renamed from: a */
                    public final void mo41317a(int i, int i2) {
                        try {
                            this.f54999a.mo41313a(i, i2);
                        } catch (RemoteException unused) {
                        }
                    }
                };
            }
            nVar.mo41580a(acVar);
        }
    }

    /* renamed from: a */
    public final void mo41521a(int i, C19866u uVar) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41577a(i, C19996g.m49396a(uVar));
        }
    }

    /* renamed from: d */
    public final void mo41543d() throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41607f();
        }
    }

    /* renamed from: a */
    public final void mo41513a() throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41569a();
        }
    }

    /* renamed from: c */
    public final boolean mo41541c() throws RemoteException {
        if (this.f54903b == null) {
            return false;
        }
        return this.f54903b.mo41605e();
    }

    /* renamed from: e */
    public final boolean mo41547e() throws RemoteException {
        if (this.f54903b == null) {
            return false;
        }
        return this.f54903b.mo41593b();
    }

    /* renamed from: b */
    public final boolean mo41535b() throws RemoteException {
        if (this.f54903b == null) {
            return false;
        }
        return this.f54903b.mo41598c();
    }

    /* renamed from: c */
    public final List<DownloadInfo> mo41538c(String str) throws RemoteException {
        if (this.f54903b == null) {
            return null;
        }
        return this.f54903b.mo41595c(str);
    }

    /* renamed from: d */
    public final List<DownloadInfo> mo41542d(String str) throws RemoteException {
        if (this.f54903b == null) {
            return null;
        }
        return this.f54903b.mo41604e(str);
    }

    /* renamed from: e */
    public final long mo41545e(int i) throws RemoteException {
        if (this.f54903b == null) {
            return 0;
        }
        return this.f54903b.mo41603e(i);
    }

    /* renamed from: f */
    public final int mo41548f(int i) throws RemoteException {
        if (this.f54903b == null) {
            return 0;
        }
        return this.f54903b.mo41606f(i);
    }

    /* renamed from: g */
    public final boolean mo41549g(int i) throws RemoteException {
        if (this.f54903b == null) {
            return false;
        }
        return this.f54903b.mo41609g(i);
    }

    /* renamed from: h */
    public final DownloadInfo mo41550h(int i) throws RemoteException {
        if (this.f54903b == null) {
            return null;
        }
        return this.f54903b.mo41610h(i);
    }

    /* renamed from: i */
    public final List<DownloadChunk> mo41551i(int i) throws RemoteException {
        if (this.f54903b == null) {
            return null;
        }
        return this.f54903b.mo41611i(i);
    }

    /* renamed from: j */
    public final void mo41552j(int i) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41612j(i);
        }
    }

    /* renamed from: k */
    public final boolean mo41553k(int i) throws RemoteException {
        if (this.f54903b == null) {
            return false;
        }
        return this.f54903b.mo41614l(i);
    }

    /* renamed from: l */
    public final void mo41554l(int i) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41613k(i);
        }
    }

    /* renamed from: m */
    public final int mo41555m(int i) throws RemoteException {
        return C19886c.m48631a().mo41484b(i);
    }

    /* renamed from: n */
    public final boolean mo41556n(int i) throws RemoteException {
        if (this.f54903b == null) {
            return false;
        }
        return this.f54903b.mo41616n(i);
    }

    /* renamed from: o */
    public final void mo41557o(int i) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41617o(i);
        }
    }

    /* renamed from: p */
    public final boolean mo41558p(int i) throws RemoteException {
        if (this.f54903b == null) {
            return false;
        }
        return this.f54903b.mo41618p(i);
    }

    /* renamed from: a */
    public final List<DownloadInfo> mo41512a(String str) throws RemoteException {
        if (this.f54903b == null) {
            return null;
        }
        return this.f54903b.mo41568a(str);
    }

    /* renamed from: b */
    public final List<DownloadInfo> mo41531b(String str) throws RemoteException {
        if (this.f54903b == null) {
            return null;
        }
        return this.f54903b.mo41587b(str);
    }

    /* renamed from: c */
    public final void mo41539c(int i) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41596c(i);
        }
    }

    /* renamed from: e */
    public final List<DownloadInfo> mo41546e(String str) throws RemoteException {
        if (this.f54903b == null) {
            return null;
        }
        return this.f54903b.mo41600d(str);
    }

    /* renamed from: q */
    public final C19866u mo41559q(int i) throws RemoteException {
        if (this.f54903b == null) {
            return null;
        }
        return C19996g.m49395a(this.f54903b.mo41619q(i));
    }

    /* renamed from: r */
    public final C19871x mo41560r(int i) throws RemoteException {
        if (this.f54903b == null) {
            return null;
        }
        return C19996g.m49397a(this.f54903b.mo41620r(i));
    }

    /* renamed from: s */
    public final C19834e mo41561s(int i) throws RemoteException {
        if (this.f54903b == null) {
            return null;
        }
        return C19996g.m49392a(this.f54903b.mo41621s(i));
    }

    /* renamed from: d */
    public final void mo41544d(int i) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41602d(i);
        }
    }

    /* renamed from: a */
    public final void mo41514a(int i) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41570a(i);
        }
    }

    /* renamed from: b */
    public final boolean mo41536b(int i) throws RemoteException {
        if (this.f54903b == null) {
            return false;
        }
        return this.f54903b.mo41594b(i);
    }

    /* renamed from: b */
    public final boolean mo41537b(DownloadInfo downloadInfo) throws RemoteException {
        if (this.f54903b == null) {
            return false;
        }
        return this.f54903b.mo41599c(downloadInfo);
    }

    /* renamed from: c */
    public final void mo41540c(int i, boolean z) throws RemoteException {
        C19886c.m48631a().mo41487b(i, z);
    }

    /* renamed from: a */
    public final int mo41511a(String str, String str2) throws RemoteException {
        if (this.f54903b == null) {
            return 0;
        }
        return this.f54903b.mo41567a(str, str2);
    }

    /* renamed from: b */
    public final DownloadInfo mo41530b(String str, String str2) throws RemoteException {
        if (this.f54903b == null) {
            return null;
        }
        return this.f54903b.mo41586b(str, str2);
    }

    /* renamed from: b */
    public final void mo41533b(int i, List<DownloadChunk> list) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41578a(i, list);
        }
    }

    /* renamed from: a */
    public final void mo41515a(int i, int i2) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41571a(i, i2);
        }
    }

    /* renamed from: b */
    public final void mo41534b(int i, boolean z) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41590b(i, z);
        }
    }

    /* renamed from: a */
    public final void mo41518a(int i, int i2, long j) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41574a(i, i2, j);
        }
    }

    /* renamed from: a */
    public final void mo41516a(int i, int i2, int i3, int i4) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41572a(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public final void mo41517a(int i, int i2, int i3, long j) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41573a(i, i2, i3, j);
        }
    }

    /* renamed from: b */
    public final void mo41532b(int i, int i2, C19840g gVar, int i3, boolean z) throws RemoteException {
        if (this.f54903b != null) {
            this.f54903b.mo41575a(i, i2, C19996g.m49391a(gVar), C19994e.m49361b(i3), z);
        }
    }
}
