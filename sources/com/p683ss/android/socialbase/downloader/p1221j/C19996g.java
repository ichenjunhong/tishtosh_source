package com.p683ss.android.socialbase.downloader.p1221j;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import com.p683ss.android.socialbase.downloader.depend.C19827b;
import com.p683ss.android.socialbase.downloader.depend.C19828c;
import com.p683ss.android.socialbase.downloader.depend.C19828c.C19829a;
import com.p683ss.android.socialbase.downloader.depend.C19831d;
import com.p683ss.android.socialbase.downloader.depend.C19831d.C19832a;
import com.p683ss.android.socialbase.downloader.depend.C19834e;
import com.p683ss.android.socialbase.downloader.depend.C19834e.C19835a;
import com.p683ss.android.socialbase.downloader.depend.C19837f;
import com.p683ss.android.socialbase.downloader.depend.C19837f.C19838a;
import com.p683ss.android.socialbase.downloader.depend.C19840g;
import com.p683ss.android.socialbase.downloader.depend.C19840g.C19841a;
import com.p683ss.android.socialbase.downloader.depend.C19843h;
import com.p683ss.android.socialbase.downloader.depend.C19843h.C19844a;
import com.p683ss.android.socialbase.downloader.depend.C19847j;
import com.p683ss.android.socialbase.downloader.depend.C19847j.C19848a;
import com.p683ss.android.socialbase.downloader.depend.C19850k;
import com.p683ss.android.socialbase.downloader.depend.C19850k.C19851a;
import com.p683ss.android.socialbase.downloader.depend.C19853l;
import com.p683ss.android.socialbase.downloader.depend.C19854m;
import com.p683ss.android.socialbase.downloader.depend.C19855n;
import com.p683ss.android.socialbase.downloader.depend.C19856o;
import com.p683ss.android.socialbase.downloader.depend.C19856o.C19857a;
import com.p683ss.android.socialbase.downloader.depend.C19859p;
import com.p683ss.android.socialbase.downloader.depend.C19859p.C19860a;
import com.p683ss.android.socialbase.downloader.depend.C19862q;
import com.p683ss.android.socialbase.downloader.depend.C19863r;
import com.p683ss.android.socialbase.downloader.depend.C19864s;
import com.p683ss.android.socialbase.downloader.depend.C19865t;
import com.p683ss.android.socialbase.downloader.depend.C19866u;
import com.p683ss.android.socialbase.downloader.depend.C19866u.C19867a;
import com.p683ss.android.socialbase.downloader.depend.C19869v;
import com.p683ss.android.socialbase.downloader.depend.C19871x;
import com.p683ss.android.socialbase.downloader.depend.C19871x.C19872a;
import com.p683ss.android.socialbase.downloader.depend.C19874y;
import com.p683ss.android.socialbase.downloader.depend.C19875z;
import com.p683ss.android.socialbase.downloader.depend.C19875z.C19876a;
import com.p683ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.p683ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.C19897i;
import com.p683ss.android.socialbase.downloader.downloader.C19908r;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.C20045a;
import com.p683ss.android.socialbase.downloader.model.C20045a.C20046a;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.socialbase.downloader.p1212b.C19787h;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.j.g */
public final class C19996g {

    /* renamed from: a */
    public static Handler f54965a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static C20045a m49400a(final DownloadTask downloadTask) {
        if (downloadTask == null) {
            return null;
        }
        return new C20046a() {
            /* renamed from: a */
            public final DownloadInfo mo41760a() throws RemoteException {
                return downloadTask.getDownloadInfo();
            }

            /* renamed from: b */
            public final C19828c mo41761b() throws RemoteException {
                C19897i chunkStrategy = downloadTask.getChunkStrategy();
                if (chunkStrategy == null) {
                    return null;
                }
                return new C19829a(chunkStrategy) {

                    /* renamed from: a */
                    final /* synthetic */ C19897i f55016a;

                    {
                        this.f55016a = r1;
                    }

                    /* renamed from: a */
                    public final int mo41319a(long j) throws RemoteException {
                        return this.f55016a.mo41510a(j);
                    }
                };
            }

            /* renamed from: c */
            public final C19866u mo41763c() throws RemoteException {
                return C19996g.m49395a(downloadTask.getNotificationEventListener());
            }

            /* renamed from: d */
            public final C19871x mo41764d() throws RemoteException {
                return C19996g.m49397a(downloadTask.getNotificationClickCallback());
            }

            /* renamed from: e */
            public final C19837f mo41765e() throws RemoteException {
                C19864s interceptor = downloadTask.getInterceptor();
                if (interceptor == null) {
                    return null;
                }
                return new C19838a(interceptor) {

                    /* renamed from: a */
                    final /* synthetic */ C19864s f55017a;

                    /* renamed from: a */
                    public final boolean mo41331a() throws RemoteException {
                        return this.f55017a.mo41377a();
                    }

                    {
                        this.f55017a = r1;
                    }
                };
            }

            /* renamed from: f */
            public final C19831d mo41766f() throws RemoteException {
                IDownloadDepend depend = downloadTask.getDepend();
                if (depend == null) {
                    return null;
                }
                return new C19832a(depend) {

                    /* renamed from: a */
                    final /* synthetic */ IDownloadDepend f55014a;

                    {
                        this.f55014a = r1;
                    }

                    /* renamed from: a */
                    public final void mo41323a(DownloadInfo downloadInfo, BaseException baseException, int i) throws RemoteException {
                        this.f55014a.monitorLogSend(downloadInfo, baseException, i);
                    }
                };
            }

            /* renamed from: g */
            public final C19859p mo41767g() throws RemoteException {
                C19863r forbiddenHandler = downloadTask.getForbiddenHandler();
                if (forbiddenHandler == null) {
                    return null;
                }
                return new C19860a(forbiddenHandler) {

                    /* renamed from: a */
                    final /* synthetic */ C19863r f55010a;

                    {
                        this.f55010a = r1;
                    }

                    /* renamed from: a */
                    public final boolean mo41372a(C19856o oVar) throws RemoteException {
                        C19862q qVar;
                        C19863r rVar = this.f55010a;
                        if (oVar == null) {
                            qVar = null;
                        } else {
                            qVar = new C19862q(oVar) {

                                /* renamed from: a */
                                final /* synthetic */ C19856o f55012a;

                                /* renamed from: a */
                                public final boolean mo41310a() {
                                    try {
                                        return this.f55012a.mo41368a();
                                    } catch (RemoteException unused) {
                                        return false;
                                    }
                                }

                                {
                                    this.f55012a = r1;
                                }

                                /* renamed from: a */
                                public final void mo41309a(List<String> list) {
                                    try {
                                        this.f55012a.mo41367a(list);
                                    } catch (RemoteException unused) {
                                    }
                                }
                            };
                        }
                        return rVar.mo41376a(qVar);
                    }
                };
            }

            /* renamed from: h */
            public final C19875z mo41768h() throws RemoteException {
                C19908r retryDelayTimeCalculator = downloadTask.getRetryDelayTimeCalculator();
                if (retryDelayTimeCalculator == null) {
                    return null;
                }
                return new C19876a(retryDelayTimeCalculator) {

                    /* renamed from: a */
                    final /* synthetic */ C19908r f55009a;

                    {
                        this.f55009a = r1;
                    }

                    /* renamed from: a */
                    public final long mo41396a(int i, int i2) throws RemoteException {
                        return this.f55009a.mo41627a(i, i2);
                    }
                };
            }

            /* renamed from: i */
            public final C19850k mo41769i() throws RemoteException {
                C19854m diskSpaceHandler = downloadTask.getDiskSpaceHandler();
                if (diskSpaceHandler == null) {
                    return null;
                }
                return new C19851a(diskSpaceHandler) {

                    /* renamed from: a */
                    final /* synthetic */ C19854m f55013a;

                    {
                        this.f55013a = r1;
                    }

                    /* renamed from: a */
                    public final boolean mo41360a(long j, long j2, C19847j jVar) throws RemoteException {
                        C19853l lVar;
                        C19854m mVar = this.f55013a;
                        if (jVar == null) {
                            lVar = null;
                        } else {
                            lVar = new C19853l(jVar) {

                                /* renamed from: a */
                                final /* synthetic */ C19847j f55003a;

                                /* renamed from: a */
                                public final void mo41364a() {
                                    try {
                                        this.f55003a.mo41356a();
                                    } catch (RemoteException unused) {
                                    }
                                }

                                {
                                    this.f55003a = r1;
                                }
                            };
                        }
                        return mVar.mo41365a(j, j2, lVar);
                    }
                };
            }

            /* renamed from: j */
            public final C19843h mo41770j() throws RemoteException {
                C19865t monitorDepend = downloadTask.getMonitorDepend();
                if (monitorDepend == null) {
                    return null;
                }
                return new C19844a(monitorDepend) {

                    /* renamed from: a */
                    final /* synthetic */ C19865t f55015a;

                    /* renamed from: a */
                    public final String mo41350a() throws RemoteException {
                        return this.f55015a.mo41379b();
                    }

                    /* renamed from: b */
                    public final int[] mo41352b() throws RemoteException {
                        if (this.f55015a instanceof C19827b) {
                            return ((C19827b) this.f55015a).mo41318a();
                        }
                        return null;
                    }

                    {
                        this.f55015a = r1;
                    }

                    /* renamed from: a */
                    public final void mo41351a(String str) throws RemoteException {
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                this.f55015a.mo41378a(new JSONObject(str));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                };
            }

            /* renamed from: k */
            public final C19834e mo41771k() throws RemoteException {
                return C19996g.m49392a(downloadTask.getFileUriProvider());
            }

            /* renamed from: a */
            public final int mo41758a(int i) throws RemoteException {
                return downloadTask.getDownloadListenerSize(C19994e.m49361b(i));
            }

            /* renamed from: b */
            public final C19840g mo41762b(int i) throws RemoteException {
                boolean z;
                IDownloadListener singleDownloadListener = downloadTask.getSingleDownloadListener(C19994e.m49361b(i));
                if (i == C19787h.SUB.ordinal()) {
                    z = false;
                } else {
                    z = true;
                }
                return C19996g.m49393a(singleDownloadListener, z);
            }

            /* renamed from: a */
            public final C19840g mo41759a(int i, int i2) throws RemoteException {
                boolean z;
                IDownloadListener downloadListenerByIndex = downloadTask.getDownloadListenerByIndex(C19994e.m49361b(i), i2);
                if (i == C19787h.SUB.ordinal()) {
                    z = false;
                } else {
                    z = true;
                }
                return C19996g.m49393a(downloadListenerByIndex, z);
            }
        };
    }

    /* renamed from: a */
    public static DownloadTask m49399a(C20045a aVar) {
        C19897i iVar;
        C19864s sVar;
        IDownloadDepend iDownloadDepend;
        C19865t tVar;
        C19863r rVar;
        C19854m mVar;
        C19908r rVar2;
        if (aVar == null) {
            return null;
        }
        try {
            DownloadTask downloadTask = new DownloadTask(aVar.mo41760a());
            final C19828c b = aVar.mo41761b();
            if (b == null) {
                iVar = null;
            } else {
                iVar = new C19897i() {
                    /* renamed from: a */
                    public final int mo41510a(long j) {
                        try {
                            return b.mo41319a(j);
                        } catch (RemoteException unused) {
                            return 0;
                        }
                    }
                };
            }
            DownloadTask notificationEventListener = downloadTask.chunkStategy(iVar).notificationEventListener(m49396a(aVar.mo41763c()));
            final C19837f e = aVar.mo41765e();
            if (e == null) {
                sVar = null;
            } else {
                sVar = new C19864s() {
                    /* renamed from: a */
                    public final boolean mo41377a() {
                        try {
                            return e.mo41331a();
                        } catch (RemoteException unused) {
                            return false;
                        }
                    }
                };
            }
            DownloadTask interceptor = notificationEventListener.interceptor(sVar);
            final C19831d f = aVar.mo41766f();
            if (f == null) {
                iDownloadDepend = null;
            } else {
                iDownloadDepend = new IDownloadDepend() {
                    public final void monitorLogSend(DownloadInfo downloadInfo, BaseException baseException, int i) {
                        if (downloadInfo != null) {
                            try {
                                f.mo41323a(downloadInfo, baseException, i);
                            } catch (RemoteException unused) {
                            }
                        }
                    }
                };
            }
            DownloadTask depend = interceptor.depend(iDownloadDepend);
            final C19843h j = aVar.mo41770j();
            if (j == null) {
                tVar = null;
            } else {
                tVar = new C19827b() {
                    /* renamed from: b */
                    public final String mo41379b() {
                        try {
                            return j.mo41350a();
                        } catch (RemoteException unused) {
                            return "";
                        }
                    }

                    /* renamed from: a */
                    public final int[] mo41318a() {
                        try {
                            return j.mo41352b();
                        } catch (RemoteException unused) {
                            return null;
                        }
                    }

                    /* renamed from: a */
                    public final void mo41378a(JSONObject jSONObject) {
                        if (jSONObject != null) {
                            try {
                                j.mo41351a(jSONObject.toString());
                            } catch (RemoteException unused) {
                            }
                        }
                    }
                };
            }
            DownloadTask monitorDepend = depend.monitorDepend(tVar);
            final C19859p g = aVar.mo41767g();
            if (g == null) {
                rVar = null;
            } else {
                rVar = new C19863r() {
                    /* renamed from: a */
                    public final boolean mo41376a(C19862q qVar) {
                        C19856o oVar;
                        try {
                            C19859p pVar = g;
                            if (qVar == null) {
                                oVar = null;
                            } else {
                                oVar = new C19857a(qVar) {

                                    /* renamed from: a */
                                    final /* synthetic */ C19862q f54997a;

                                    /* renamed from: a */
                                    public final boolean mo41368a() {
                                        return this.f54997a.mo41310a();
                                    }

                                    {
                                        this.f54997a = r1;
                                    }

                                    /* renamed from: a */
                                    public final void mo41367a(List<String> list) {
                                        this.f54997a.mo41309a(list);
                                    }
                                };
                            }
                            return pVar.mo41372a(oVar);
                        } catch (RemoteException unused) {
                            return false;
                        }
                    }
                };
            }
            DownloadTask forbiddenHandler = monitorDepend.forbiddenHandler(rVar);
            final C19850k i = aVar.mo41769i();
            if (i == null) {
                mVar = null;
            } else {
                mVar = new C19854m() {
                    /* renamed from: a */
                    public final boolean mo41365a(long j, long j2, C19853l lVar) {
                        C19847j jVar;
                        try {
                            C19850k kVar = i;
                            if (lVar == null) {
                                jVar = null;
                            } else {
                                jVar = new C19848a(lVar) {

                                    /* renamed from: a */
                                    final /* synthetic */ C19853l f55001a;

                                    /* renamed from: a */
                                    public final void mo41356a() throws RemoteException {
                                        this.f55001a.mo41364a();
                                    }

                                    {
                                        this.f55001a = r1;
                                    }
                                };
                            }
                            return kVar.mo41360a(j, j2, jVar);
                        } catch (RemoteException unused) {
                            return false;
                        }
                    }
                };
            }
            DownloadTask notificationClickCallback = forbiddenHandler.diskSpaceHandler(mVar).fileUriProvider(m49394a(aVar.mo41771k())).notificationClickCallback(m49398a(aVar.mo41764d()));
            final C19875z h = aVar.mo41768h();
            if (h == null) {
                rVar2 = null;
            } else {
                rVar2 = new C19908r() {
                    /* renamed from: a */
                    public final long mo41627a(int i, int i2) {
                        try {
                            return h.mo41396a(i, i2);
                        } catch (RemoteException unused) {
                            return 0;
                        }
                    }
                };
            }
            notificationClickCallback.retryDelayTimeCalculator(rVar2);
            C19840g b2 = aVar.mo41762b(C19787h.MAIN.ordinal());
            if (b2 != null) {
                downloadTask.mainThreadListenerWithHashCode(b2.hashCode(), m49391a(b2));
            }
            C19840g b3 = aVar.mo41762b(C19787h.SUB.ordinal());
            if (b3 != null) {
                downloadTask.subThreadListenerWithHashCode(b3.hashCode(), m49391a(b3));
            }
            C19840g b4 = aVar.mo41762b(C19787h.NOTIFICATION.ordinal());
            if (b4 != null) {
                downloadTask.notificationListenerWithHashCode(b4.hashCode(), m49391a(b4));
            }
            m49401a(downloadTask, aVar, C19787h.MAIN);
            m49401a(downloadTask, aVar, C19787h.SUB);
            m49401a(downloadTask, aVar, C19787h.NOTIFICATION);
            return downloadTask;
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m49401a(DownloadTask downloadTask, C20045a aVar, C19787h hVar) throws RemoteException {
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < aVar.mo41758a(hVar.ordinal()); i++) {
            C19840g a = aVar.mo41759a(hVar.ordinal(), i);
            if (a != null) {
                sparseArray.put(a.mo41335a(), m49391a(a));
            }
        }
        downloadTask.setDownloadListeners(sparseArray, hVar);
    }

    /* renamed from: a */
    public static IDownloadListener m49391a(final C19840g gVar) {
        if (gVar == null) {
            return null;
        }
        return new IDownloadListener() {
            public final void onCanceled(DownloadInfo downloadInfo) {
                try {
                    gVar.mo41344f(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onFirstStart(DownloadInfo downloadInfo) {
                try {
                    gVar.mo41345g(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onFirstSuccess(DownloadInfo downloadInfo) {
                try {
                    gVar.mo41346h(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onPause(DownloadInfo downloadInfo) {
                try {
                    gVar.mo41342d(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onPrepare(DownloadInfo downloadInfo) {
                try {
                    gVar.mo41336a(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onProgress(DownloadInfo downloadInfo) {
                try {
                    gVar.mo41340c(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onStart(DownloadInfo downloadInfo) {
                try {
                    gVar.mo41338b(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onSuccessed(DownloadInfo downloadInfo) {
                try {
                    gVar.mo41343e(downloadInfo);
                } catch (RemoteException unused) {
                }
            }

            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    gVar.mo41337a(downloadInfo, baseException);
                } catch (RemoteException unused) {
                }
            }

            public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    gVar.mo41339b(downloadInfo, baseException);
                } catch (RemoteException unused) {
                }
            }

            public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                try {
                    gVar.mo41341c(downloadInfo, baseException);
                } catch (RemoteException unused) {
                }
            }
        };
    }

    /* renamed from: a */
    public static C19834e m49392a(final C19855n nVar) {
        if (nVar == null) {
            return null;
        }
        return new C19835a() {
            /* renamed from: a */
            public final Uri mo41327a(String str, String str2) throws RemoteException {
                return nVar.mo41366a(str, str2);
            }
        };
    }

    /* renamed from: a */
    public static C19855n m49394a(final C19834e eVar) {
        if (eVar == null) {
            return null;
        }
        return new C19855n() {
            /* renamed from: a */
            public final Uri mo41366a(String str, String str2) {
                try {
                    return eVar.mo41327a(str, str2);
                } catch (RemoteException unused) {
                    return null;
                }
            }
        };
    }

    /* renamed from: a */
    public static C19866u m49395a(final C19869v vVar) {
        if (vVar == null) {
            return null;
        }
        return new C19867a() {
            /* renamed from: a */
            public final String mo41380a() throws RemoteException {
                return vVar.mo41386a();
            }

            /* renamed from: a */
            public final boolean mo41382a(boolean z) throws RemoteException {
                return vVar.mo41388a(z);
            }

            /* renamed from: a */
            public final void mo41381a(int i, DownloadInfo downloadInfo, String str, String str2) throws RemoteException {
                vVar.mo41387a(i, downloadInfo, str, str2);
            }
        };
    }

    /* renamed from: a */
    public static C19869v m49396a(final C19866u uVar) {
        if (uVar == null) {
            return null;
        }
        return new C19869v() {
            /* renamed from: a */
            public final String mo41386a() {
                try {
                    return uVar.mo41380a();
                } catch (RemoteException unused) {
                    return null;
                }
            }

            /* renamed from: a */
            public final boolean mo41388a(boolean z) {
                try {
                    return uVar.mo41382a(z);
                } catch (RemoteException unused) {
                    return false;
                }
            }

            /* renamed from: a */
            public final void mo41387a(int i, DownloadInfo downloadInfo, String str, String str2) {
                try {
                    uVar.mo41381a(i, downloadInfo, str, str2);
                } catch (RemoteException unused) {
                }
            }
        };
    }

    /* renamed from: a */
    public static C19871x m49397a(final C19874y yVar) {
        if (yVar == null) {
            return null;
        }
        return new C19872a() {
            /* renamed from: a */
            public final boolean mo41389a(DownloadInfo downloadInfo) throws RemoteException {
                return yVar.mo41394a(downloadInfo);
            }

            /* renamed from: b */
            public final boolean mo41390b(DownloadInfo downloadInfo) throws RemoteException {
                return yVar.mo41395b(downloadInfo);
            }
        };
    }

    /* renamed from: a */
    public static C19874y m49398a(final C19871x xVar) {
        if (xVar == null) {
            return null;
        }
        return new C19874y() {
            /* renamed from: a */
            public final boolean mo41394a(DownloadInfo downloadInfo) {
                try {
                    return xVar.mo41389a(downloadInfo);
                } catch (RemoteException unused) {
                    return false;
                }
            }

            /* renamed from: b */
            public final boolean mo41395b(DownloadInfo downloadInfo) {
                try {
                    return xVar.mo41390b(downloadInfo);
                } catch (RemoteException unused) {
                    return false;
                }
            }
        };
    }

    /* renamed from: a */
    public static C19840g m49393a(final IDownloadListener iDownloadListener, final boolean z) {
        if (iDownloadListener == null) {
            return null;
        }
        return new C19841a() {
            /* renamed from: a */
            public final int mo41335a() throws RemoteException {
                return iDownloadListener.hashCode();
            }

            /* renamed from: a */
            public final void mo41336a(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    C19996g.f54965a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onPrepare(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onPrepare(downloadInfo);
                }
            }

            /* renamed from: b */
            public final void mo41338b(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    C19996g.f54965a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onStart(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onStart(downloadInfo);
                }
            }

            /* renamed from: c */
            public final void mo41340c(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    C19996g.f54965a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onProgress(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onProgress(downloadInfo);
                }
            }

            /* renamed from: d */
            public final void mo41342d(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    C19996g.f54965a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onPause(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onPause(downloadInfo);
                }
            }

            /* renamed from: e */
            public final void mo41343e(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    C19996g.f54965a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onSuccessed(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onSuccessed(downloadInfo);
                }
            }

            /* renamed from: f */
            public final void mo41344f(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    C19996g.f54965a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onCanceled(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onCanceled(downloadInfo);
                }
            }

            /* renamed from: g */
            public final void mo41345g(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    C19996g.f54965a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onFirstStart(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onFirstStart(downloadInfo);
                }
            }

            /* renamed from: h */
            public final void mo41346h(final DownloadInfo downloadInfo) throws RemoteException {
                if (z) {
                    C19996g.f54965a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onFirstSuccess(downloadInfo);
                        }
                    });
                } else {
                    iDownloadListener.onFirstSuccess(downloadInfo);
                }
            }

            /* renamed from: a */
            public final void mo41337a(final DownloadInfo downloadInfo, final BaseException baseException) throws RemoteException {
                if (z) {
                    C19996g.f54965a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onFailed(downloadInfo, baseException);
                        }
                    });
                } else {
                    iDownloadListener.onFailed(downloadInfo, baseException);
                }
            }

            /* renamed from: b */
            public final void mo41339b(final DownloadInfo downloadInfo, final BaseException baseException) throws RemoteException {
                if (z) {
                    C19996g.f54965a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onRetry(downloadInfo, baseException);
                        }
                    });
                } else {
                    iDownloadListener.onRetry(downloadInfo, baseException);
                }
            }

            /* renamed from: c */
            public final void mo41341c(final DownloadInfo downloadInfo, final BaseException baseException) throws RemoteException {
                if (z) {
                    C19996g.f54965a.post(new Runnable() {
                        public final void run() {
                            iDownloadListener.onRetryDelay(downloadInfo, baseException);
                        }
                    });
                } else {
                    iDownloadListener.onRetryDelay(downloadInfo, baseException);
                }
            }
        };
    }
}
