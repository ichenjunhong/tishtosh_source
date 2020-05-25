package com.p683ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import com.p683ss.android.socialbase.downloader.depend.C19826ac;
import com.p683ss.android.socialbase.downloader.depend.C19855n;
import com.p683ss.android.socialbase.downloader.depend.C19869v;
import com.p683ss.android.socialbase.downloader.depend.C19874y;
import com.p683ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p683ss.android.socialbase.downloader.model.DownloadChunk;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.socialbase.downloader.p1212b.C19787h;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.downloader.n */
public interface C19904n {
    /* renamed from: a */
    int mo41567a(String str, String str2);

    /* renamed from: a */
    List<DownloadInfo> mo41568a(String str);

    /* renamed from: a */
    void mo41569a();

    /* renamed from: a */
    void mo41570a(int i);

    /* renamed from: a */
    void mo41571a(int i, int i2);

    /* renamed from: a */
    void mo41572a(int i, int i2, int i3, int i4);

    /* renamed from: a */
    void mo41573a(int i, int i2, int i3, long j);

    /* renamed from: a */
    void mo41574a(int i, int i2, long j);

    /* renamed from: a */
    void mo41575a(int i, int i2, IDownloadListener iDownloadListener, C19787h hVar, boolean z);

    /* renamed from: a */
    void mo41576a(int i, Notification notification);

    /* renamed from: a */
    void mo41577a(int i, C19869v vVar);

    /* renamed from: a */
    void mo41578a(int i, List<DownloadChunk> list);

    /* renamed from: a */
    void mo41579a(int i, boolean z);

    /* renamed from: a */
    void mo41580a(C19826ac acVar);

    /* renamed from: a */
    void mo41581a(DownloadChunk downloadChunk);

    /* renamed from: a */
    void mo41582a(DownloadTask downloadTask);

    /* renamed from: a */
    void mo41583a(List<String> list);

    /* renamed from: a */
    void mo41584a(boolean z, boolean z2);

    /* renamed from: a */
    boolean mo41585a(DownloadInfo downloadInfo);

    /* renamed from: b */
    DownloadInfo mo41586b(String str, String str2);

    /* renamed from: b */
    List<DownloadInfo> mo41587b(String str);

    /* renamed from: b */
    void mo41588b(int i, int i2, IDownloadListener iDownloadListener, C19787h hVar, boolean z);

    /* renamed from: b */
    void mo41589b(int i, List<DownloadChunk> list);

    /* renamed from: b */
    void mo41590b(int i, boolean z);

    /* renamed from: b */
    void mo41591b(DownloadInfo downloadInfo);

    /* renamed from: b */
    void mo41592b(DownloadTask downloadTask);

    /* renamed from: b */
    boolean mo41593b();

    /* renamed from: b */
    boolean mo41594b(int i);

    /* renamed from: c */
    List<DownloadInfo> mo41595c(String str);

    /* renamed from: c */
    void mo41596c(int i);

    /* renamed from: c */
    void mo41597c(int i, boolean z);

    /* renamed from: c */
    boolean mo41598c();

    /* renamed from: c */
    boolean mo41599c(DownloadInfo downloadInfo);

    /* renamed from: d */
    List<DownloadInfo> mo41600d(String str);

    /* renamed from: d */
    void mo41601d();

    /* renamed from: d */
    void mo41602d(int i);

    /* renamed from: e */
    long mo41603e(int i);

    /* renamed from: e */
    List<DownloadInfo> mo41604e(String str);

    /* renamed from: e */
    boolean mo41605e();

    /* renamed from: f */
    int mo41606f(int i);

    /* renamed from: f */
    void mo41607f();

    /* renamed from: g */
    boolean mo41608g();

    /* renamed from: g */
    boolean mo41609g(int i);

    /* renamed from: h */
    DownloadInfo mo41610h(int i);

    /* renamed from: i */
    List<DownloadChunk> mo41611i(int i);

    /* renamed from: j */
    void mo41612j(int i);

    /* renamed from: k */
    void mo41613k(int i);

    /* renamed from: l */
    boolean mo41614l(int i);

    /* renamed from: m */
    int mo41615m(int i);

    /* renamed from: n */
    boolean mo41616n(int i);

    /* renamed from: o */
    void mo41617o(int i);

    /* renamed from: p */
    boolean mo41618p(int i);

    /* renamed from: q */
    C19869v mo41619q(int i);

    /* renamed from: r */
    C19874y mo41620r(int i);

    /* renamed from: s */
    C19855n mo41621s(int i);
}
