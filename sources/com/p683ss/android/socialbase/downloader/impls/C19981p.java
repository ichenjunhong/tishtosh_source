package com.p683ss.android.socialbase.downloader.impls;

import android.app.Notification;
import android.text.TextUtils;
import com.p683ss.android.socialbase.downloader.depend.C19826ac;
import com.p683ss.android.socialbase.downloader.depend.C19855n;
import com.p683ss.android.socialbase.downloader.depend.C19869v;
import com.p683ss.android.socialbase.downloader.depend.C19874y;
import com.p683ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.downloader.C19886c;
import com.p683ss.android.socialbase.downloader.downloader.C19901k;
import com.p683ss.android.socialbase.downloader.downloader.C19904n;
import com.p683ss.android.socialbase.downloader.downloader.C19906p;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadChunk;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.socialbase.downloader.p1212b.C19787h;
import com.p683ss.android.socialbase.downloader.p1214d.C19819a;
import com.p683ss.android.socialbase.downloader.p1215e.C19911a;
import com.p683ss.android.socialbase.downloader.p1219h.C19938a;
import com.p683ss.android.socialbase.downloader.p1221j.C19991b;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.io.File;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.impls.p */
public final class C19981p implements C19904n {

    /* renamed from: a */
    private final C19950a f54922a;

    /* renamed from: b */
    private final C19901k f54923b;

    /* renamed from: c */
    private final C19906p f54924c;

    /* renamed from: d */
    private final boolean f54925d;

    /* renamed from: d */
    public final void mo41601d() {
    }

    /* renamed from: a */
    public final void mo41579a(int i, boolean z) {
        if (this.f54922a != null) {
            this.f54922a.mo41709a(i, z);
        }
    }

    /* renamed from: a */
    public final void mo41583a(List<String> list) {
        if (this.f54922a != null) {
            this.f54922a.mo41707a(list);
        }
    }

    /* renamed from: a */
    public final boolean mo41585a(DownloadInfo downloadInfo) {
        boolean z;
        boolean z2 = false;
        if (downloadInfo == null) {
            return false;
        }
        int status = downloadInfo.getStatus();
        String savePath = downloadInfo.getSavePath();
        String name = downloadInfo.getName();
        if (status == -3) {
            if (TextUtils.isEmpty(savePath) || TextUtils.isEmpty(name)) {
                z = false;
            } else {
                z = new File(savePath, name).exists();
            }
            if (!z) {
                z2 = true;
            }
        }
        if (z2 && C19991b.m49327a(33554432)) {
            mo41590b(downloadInfo.getId(), true);
        }
        return z2;
    }

    /* renamed from: a */
    public final void mo41576a(int i, Notification notification) {
        if (this.f54924c != null) {
            this.f54924c.mo41463a(i, notification);
        }
    }

    /* renamed from: a */
    public final void mo41584a(boolean z, boolean z2) {
        if (this.f54924c != null) {
            this.f54924c.mo41469a(z2);
        }
    }

    /* renamed from: a */
    public final void mo41582a(DownloadTask downloadTask) {
        if (this.f54924c != null) {
            this.f54924c.mo41471b(downloadTask);
            return;
        }
        if (downloadTask != null) {
            C19911a.m48889a(downloadTask.getMonitorDepend(), downloadTask.getDownloadInfo(), new BaseException((int) BaseNotice.COMMENT_REPLY_WITH_VIDEO, "downloadServiceHandler is null"), downloadTask.getDownloadInfo() != null ? downloadTask.getDownloadInfo().getStatus() : 0);
        }
    }

    /* renamed from: a */
    public final void mo41578a(int i, List<DownloadChunk> list) {
        this.f54923b.mo41240a(i, list);
    }

    /* renamed from: a */
    public final void mo41581a(DownloadChunk downloadChunk) {
        this.f54923b.mo41242a(downloadChunk);
    }

    /* renamed from: a */
    public final void mo41577a(int i, C19869v vVar) {
        if (this.f54922a != null) {
            C19950a aVar = this.f54922a;
            synchronized (aVar.f54855a) {
                DownloadTask downloadTask = (DownloadTask) aVar.f54855a.get(i);
                if (downloadTask != null) {
                    downloadTask.setNotificationEventListener(vVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo41580a(C19826ac acVar) {
        if (acVar != null) {
            synchronized (C19884b.f54611b) {
                C19884b.f54611b.add(acVar);
            }
        }
    }

    public C19981p() {
        this(false);
    }

    /* renamed from: e */
    public final boolean mo41605e() {
        return this.f54923b.mo41255c();
    }

    /* renamed from: f */
    public final void mo41607f() {
        this.f54923b.mo41248b();
    }

    /* renamed from: a */
    public final void mo41569a() {
        if (this.f54922a != null) {
            this.f54922a.mo41711b();
        }
    }

    /* renamed from: g */
    public final boolean mo41608g() {
        if (!this.f54925d || this.f54924c == null || !this.f54924c.mo41470a()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo41598c() {
        return C19884b.m48628y();
    }

    /* renamed from: b */
    public final boolean mo41593b() {
        if (this.f54924c != null) {
            return this.f54924c.mo41472b();
        }
        return false;
    }

    /* renamed from: k */
    public final void mo41613k(int i) {
        C19819a.m48483a(i);
    }

    /* renamed from: i */
    public final List<DownloadChunk> mo41611i(int i) {
        return this.f54923b.mo41253c(i);
    }

    /* renamed from: n */
    public final boolean mo41616n(int i) {
        return this.f54923b.mo41261e(i);
    }

    /* renamed from: o */
    public final void mo41617o(int i) {
        this.f54923b.mo41258d(i);
    }

    /* renamed from: p */
    public final boolean mo41618p(int i) {
        return this.f54923b.mo41262f(i);
    }

    /* renamed from: a */
    public final List<DownloadInfo> mo41568a(String str) {
        if (this.f54922a != null) {
            return this.f54922a.mo41701a(str);
        }
        return null;
    }

    /* renamed from: c */
    public final List<DownloadInfo> mo41595c(String str) {
        if (this.f54923b != null) {
            return this.f54923b.mo41254c(str);
        }
        return null;
    }

    /* renamed from: d */
    public final List<DownloadInfo> mo41600d(String str) {
        if (this.f54923b != null) {
            return this.f54923b.mo41257d(str);
        }
        return null;
    }

    /* renamed from: e */
    public final List<DownloadInfo> mo41604e(String str) {
        if (this.f54922a != null) {
            return this.f54922a.mo41710b(str);
        }
        return null;
    }

    /* renamed from: g */
    public final boolean mo41609g(int i) {
        if (this.f54922a != null) {
            return this.f54922a.mo41708a(i);
        }
        return false;
    }

    /* renamed from: h */
    public final DownloadInfo mo41610h(int i) {
        if (this.f54922a != null) {
            return this.f54922a.mo41717d(i);
        }
        return null;
    }

    /* renamed from: j */
    public final void mo41612j(int i) {
        if (this.f54922a != null) {
            this.f54922a.mo41726m(i);
        }
    }

    /* renamed from: l */
    public final boolean mo41614l(int i) {
        if (this.f54922a != null) {
            return this.f54922a.mo41724k(i);
        }
        return false;
    }

    /* renamed from: m */
    public final int mo41615m(int i) {
        return C19886c.m48631a().mo41480a(i);
    }

    /* renamed from: q */
    public final C19869v mo41619q(int i) {
        if (this.f54922a != null) {
            return this.f54922a.mo41722i(i);
        }
        return null;
    }

    /* renamed from: s */
    public final C19855n mo41621s(int i) {
        if (this.f54922a != null) {
            return this.f54922a.mo41723j(i);
        }
        return null;
    }

    /* renamed from: b */
    public final List<DownloadInfo> mo41587b(String str) {
        if (this.f54923b != null) {
            return this.f54923b.mo41247b(str);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo41596c(int i) {
        if (this.f54922a != null) {
            this.f54922a.mo41719f(i);
        }
    }

    /* renamed from: d */
    public final void mo41602d(int i) {
        if (this.f54922a != null) {
            this.f54922a.mo41720g(i);
        }
    }

    /* renamed from: f */
    public final int mo41606f(int i) {
        if (this.f54922a == null) {
            return 0;
        }
        DownloadInfo d = this.f54922a.mo41717d(i);
        if (d == null) {
            return 0;
        }
        return d.getStatus();
    }

    /* renamed from: r */
    public final C19874y mo41620r(int i) {
        C19874y yVar;
        if (this.f54922a != null) {
            yVar = this.f54922a.mo41721h(i);
        } else {
            yVar = null;
        }
        if (yVar == null) {
            return C19884b.f54610a;
        }
        return yVar;
    }

    public C19981p(boolean z) {
        this.f54922a = C19884b.m48620q();
        this.f54923b = C19884b.m48616m();
        if (!z) {
            this.f54924c = C19884b.m48617n();
        } else {
            this.f54924c = C19884b.m48618o();
        }
        this.f54925d = C19938a.m48933b().mo41661a("judge_service_alive", false);
    }

    /* renamed from: a */
    public final void mo41570a(int i) {
        if (this.f54922a != null) {
            this.f54922a.mo41718e(i);
        }
    }

    /* renamed from: e */
    public final long mo41603e(int i) {
        if (this.f54923b == null) {
            return 0;
        }
        DownloadInfo b = this.f54923b.mo41245b(i);
        if (b == null) {
            return 0;
        }
        int chunkCount = b.getChunkCount();
        if (chunkCount <= 1) {
            return b.getCurBytes();
        }
        List c = this.f54923b.mo41253c(i);
        if (c == null || c.size() != chunkCount) {
            return 0;
        }
        return C19994e.m49360b(c);
    }

    /* renamed from: c */
    public final boolean mo41599c(DownloadInfo downloadInfo) {
        return this.f54923b.mo41244a(downloadInfo);
    }

    /* renamed from: b */
    public final void mo41591b(DownloadInfo downloadInfo) {
        this.f54923b.mo41251b(downloadInfo);
    }

    /* renamed from: b */
    public final void mo41592b(DownloadTask downloadTask) {
        if (this.f54924c != null) {
            this.f54924c.mo41474c(downloadTask);
        }
    }

    /* renamed from: b */
    public final boolean mo41594b(int i) {
        if (this.f54922a != null) {
            return this.f54922a.mo41727n(i);
        }
        return false;
    }

    /* renamed from: a */
    public final int mo41567a(String str, String str2) {
        return C19884b.m48597a(str, str2);
    }

    /* renamed from: b */
    public final void mo41589b(int i, List<DownloadChunk> list) {
        this.f54923b.mo41249b(i, list);
    }

    /* renamed from: c */
    public final void mo41597c(int i, boolean z) {
        C19886c.m48631a().mo41483a(i, z);
    }

    /* renamed from: b */
    public final DownloadInfo mo41586b(String str, String str2) {
        return mo41610h(C19884b.m48597a(str, str2));
    }

    /* renamed from: a */
    public final void mo41571a(int i, int i2) {
        if (C19884b.m48607d() != null) {
            for (C19826ac acVar : C19884b.m48607d()) {
                if (acVar != null) {
                    acVar.mo41317a(i2, i);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo41590b(int i, boolean z) {
        if (this.f54922a != null) {
            this.f54922a.mo41714b(i, z);
        }
    }

    /* renamed from: a */
    public final void mo41574a(int i, int i2, long j) {
        this.f54923b.mo41239a(i, i2, j);
    }

    /* renamed from: a */
    public final void mo41572a(int i, int i2, int i3, int i4) {
        this.f54923b.mo41237a(i, i2, i3, i4);
    }

    /* renamed from: a */
    public final void mo41573a(int i, int i2, int i3, long j) {
        this.f54923b.mo41238a(i, i2, i3, j);
    }

    /* renamed from: b */
    public final void mo41588b(int i, int i2, IDownloadListener iDownloadListener, C19787h hVar, boolean z) {
        if (this.f54922a != null) {
            this.f54922a.mo41703a(i, i2, iDownloadListener, hVar, z);
        }
    }

    /* renamed from: a */
    public final void mo41575a(int i, int i2, IDownloadListener iDownloadListener, C19787h hVar, boolean z) {
        if (this.f54922a != null) {
            this.f54922a.mo41713b(i, i2, iDownloadListener, hVar, z);
        }
    }
}
