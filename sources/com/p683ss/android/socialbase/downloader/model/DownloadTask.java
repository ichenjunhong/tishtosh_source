package com.p683ss.android.socialbase.downloader.model;

import android.util.SparseArray;
import com.p683ss.android.socialbase.downloader.depend.C19854m;
import com.p683ss.android.socialbase.downloader.depend.C19855n;
import com.p683ss.android.socialbase.downloader.depend.C19863r;
import com.p683ss.android.socialbase.downloader.depend.C19864s;
import com.p683ss.android.socialbase.downloader.depend.C19865t;
import com.p683ss.android.socialbase.downloader.depend.C19869v;
import com.p683ss.android.socialbase.downloader.depend.C19874y;
import com.p683ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.p683ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.C19886c;
import com.p683ss.android.socialbase.downloader.downloader.C19896h;
import com.p683ss.android.socialbase.downloader.downloader.C19897i;
import com.p683ss.android.socialbase.downloader.downloader.C19904n;
import com.p683ss.android.socialbase.downloader.downloader.C19908r;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo.C20043a;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.socialbase.downloader.p1212b.C19786g;
import com.p683ss.android.socialbase.downloader.p1212b.C19787h;
import com.p683ss.android.socialbase.downloader.p1215e.C19911a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.model.DownloadTask */
public class DownloadTask {
    private C19896h chunkAdjustCalculator;
    private C19897i chunkStrategy;
    private IDownloadDepend depend;
    private C19854m diskSpaceHandler;
    private DownloadInfo downloadInfo;
    private C20043a downloadInfoBuilder;
    private C19855n fileUriProvider;
    private C19863r forbiddenHandler;
    private C19864s interceptor;
    private final SparseArray<IDownloadListener> mainThreadListeners;
    private C19865t monitorDepend;
    private boolean needDelayForCacheSync;
    private C19874y notificationClickCallback;
    private C19869v notificationEventListener;
    private final SparseArray<IDownloadListener> notificationListeners;
    private C19908r retryDelayTimeCalculator;
    private final SparseArray<C19787h> singleListenerHashCodeMap;
    private final Map<C19787h, IDownloadListener> singleListenerMap;
    private final SparseArray<IDownloadListener> subThreadListeners;

    public C19896h getChunkAdjustCalculator() {
        return this.chunkAdjustCalculator;
    }

    public C19897i getChunkStrategy() {
        return this.chunkStrategy;
    }

    public IDownloadDepend getDepend() {
        return this.depend;
    }

    public C19854m getDiskSpaceHandler() {
        return this.diskSpaceHandler;
    }

    public DownloadInfo getDownloadInfo() {
        return this.downloadInfo;
    }

    public C19855n getFileUriProvider() {
        return this.fileUriProvider;
    }

    public C19863r getForbiddenHandler() {
        return this.forbiddenHandler;
    }

    public C19864s getInterceptor() {
        return this.interceptor;
    }

    public C19865t getMonitorDepend() {
        return this.monitorDepend;
    }

    public C19874y getNotificationClickCallback() {
        return this.notificationClickCallback;
    }

    public C19869v getNotificationEventListener() {
        return this.notificationEventListener;
    }

    public C19908r getRetryDelayTimeCalculator() {
        return this.retryDelayTimeCalculator;
    }

    public boolean isNeedDelayForCacheSync() {
        return this.needDelayForCacheSync;
    }

    public boolean canShowNotification() {
        if (this.downloadInfo != null) {
            return this.downloadInfo.canShowNotification();
        }
        return false;
    }

    public int getDownloadId() {
        if (this.downloadInfo == null) {
            return 0;
        }
        return this.downloadInfo.getId();
    }

    public void addListenerToDownloadingSameTask() {
        addListenerToDownloadingSameTask(C19787h.MAIN);
        addListenerToDownloadingSameTask(C19787h.SUB);
        C19911a.m48889a(this.monitorDepend, this.downloadInfo, new BaseException((int) BaseNotice.COMMENT_REPLY_WITH_VIDEO, "has another same task, add Listener to old task"), 0);
    }

    public DownloadTask() {
        this.singleListenerMap = new ConcurrentHashMap();
        this.singleListenerHashCodeMap = new SparseArray<>();
        this.needDelayForCacheSync = false;
        this.downloadInfoBuilder = new C20043a();
        this.mainThreadListeners = new SparseArray<>();
        this.subThreadListeners = new SparseArray<>();
        this.notificationListeners = new SparseArray<>();
    }

    public int download() {
        int i;
        this.downloadInfo = this.downloadInfoBuilder.mo41998a();
        C19886c a = C19886c.m48631a();
        C19904n a2 = a.mo41481a(this);
        if (a2 == null) {
            C19865t monitorDepend2 = getMonitorDepend();
            DownloadInfo downloadInfo2 = getDownloadInfo();
            BaseException baseException = new BaseException((int) BaseNotice.COMMENT_REPLY_WITH_VIDEO, "tryDownload but getDownloadHandler failed");
            if (getDownloadInfo() != null) {
                i = getDownloadInfo().getStatus();
            } else {
                i = 0;
            }
            C19911a.m48889a(monitorDepend2, downloadInfo2, baseException, i);
        } else if (isNeedDelayForCacheSync()) {
            a.f54637a.postDelayed(new Runnable(a2, this) {

                /* renamed from: a */
                final /* synthetic */ C19904n f54640a;

                /* renamed from: b */
                final /* synthetic */ DownloadTask f54641b;

                public final void run() {
                    this.f54640a.mo41582a(this.f54641b);
                }

                {
                    this.f54640a = r2;
                    this.f54641b = r3;
                }
            }, 500);
        } else {
            a2.mo41582a(this);
        }
        if (this.downloadInfo == null) {
            return 0;
        }
        return this.downloadInfo.getId();
    }

    public DownloadTask chunkAdjustCalculator(C19896h hVar) {
        this.chunkAdjustCalculator = hVar;
        return this;
    }

    public DownloadTask chunkStategy(C19897i iVar) {
        this.chunkStrategy = iVar;
        return this;
    }

    public DownloadTask depend(IDownloadDepend iDownloadDepend) {
        this.depend = iDownloadDepend;
        return this;
    }

    public DownloadTask diskSpaceHandler(C19854m mVar) {
        this.diskSpaceHandler = mVar;
        return this;
    }

    public DownloadTask fileUriProvider(C19855n nVar) {
        this.fileUriProvider = nVar;
        return this;
    }

    public DownloadTask forbiddenHandler(C19863r rVar) {
        this.forbiddenHandler = rVar;
        return this;
    }

    public DownloadTask interceptor(C19864s sVar) {
        this.interceptor = sVar;
        return this;
    }

    public DownloadTask monitorDepend(C19865t tVar) {
        this.monitorDepend = tVar;
        return this;
    }

    public DownloadTask notificationClickCallback(C19874y yVar) {
        this.notificationClickCallback = yVar;
        return this;
    }

    public DownloadTask notificationEventListener(C19869v vVar) {
        this.notificationEventListener = vVar;
        return this;
    }

    public DownloadTask retryDelayTimeCalculator(C19908r rVar) {
        this.retryDelayTimeCalculator = rVar;
        return this;
    }

    public void setNeedDelayForCacheSync(boolean z) {
        this.needDelayForCacheSync = z;
    }

    public void setNotificationEventListener(C19869v vVar) {
        this.notificationEventListener = vVar;
    }

    public DownloadTask(DownloadInfo downloadInfo2) {
        this();
        this.downloadInfo = downloadInfo2;
    }

    public DownloadTask addListenerToSameTask(boolean z) {
        this.downloadInfoBuilder.f55057K = z;
        return this;
    }

    public DownloadTask autoResumed(boolean z) {
        this.downloadInfoBuilder.f55080v = z;
        return this;
    }

    public DownloadTask backUpUrlRetryCount(int i) {
        this.downloadInfoBuilder.f55071m = i;
        return this;
    }

    public DownloadTask backUpUrls(List<String> list) {
        this.downloadInfoBuilder.f55076r = list;
        return this;
    }

    public DownloadTask downloadSetting(JSONObject jSONObject) {
        this.downloadInfoBuilder.f55058L = jSONObject;
        return this;
    }

    public DownloadTask enqueueType(C19786g gVar) {
        this.downloadInfoBuilder.f55052F = gVar;
        return this;
    }

    public DownloadTask extra(String str) {
        this.downloadInfoBuilder.f55065g = str;
        return this;
    }

    public DownloadTask extraHeaders(List<HttpHeader> list) {
        this.downloadInfoBuilder.f55066h = list;
        return this;
    }

    public DownloadTask force(boolean z) {
        this.downloadInfoBuilder.f55072n = z;
        return this;
    }

    public DownloadTask headConnectionAvailable(boolean z) {
        this.downloadInfoBuilder.f55053G = z;
        return this;
    }

    public DownloadTask ignoreDataVerify(boolean z) {
        this.downloadInfoBuilder.f55054H = z;
        return this;
    }

    public DownloadTask maxBytes(int i) {
        this.downloadInfoBuilder.f55067i = i;
        return this;
    }

    public DownloadTask maxProgressCount(int i) {
        this.downloadInfoBuilder.f55074p = i;
        return this;
    }

    public DownloadTask md5(String str) {
        this.downloadInfoBuilder.f55047A = str;
        return this;
    }

    public DownloadTask mimeType(String str) {
        this.downloadInfoBuilder.f55078t = str;
        return this;
    }

    public DownloadTask minProgressTimeMsInterval(int i) {
        this.downloadInfoBuilder.f55075q = i;
        return this;
    }

    public DownloadTask name(String str) {
        this.downloadInfoBuilder.mo41997a(str);
        return this;
    }

    public DownloadTask needChunkDowngradeRetry(boolean z) {
        this.downloadInfoBuilder.f55055I = z;
        return this;
    }

    public DownloadTask needDefaultHttpServiceBackUp(boolean z) {
        this.downloadInfoBuilder.f55082x = z;
        return this;
    }

    public DownloadTask needHttpsToHttpRetry(boolean z) {
        this.downloadInfoBuilder.f55079u = z;
        return this;
    }

    public DownloadTask needIndependentProcess(boolean z) {
        this.downloadInfoBuilder.f55051E = z;
        return this;
    }

    public DownloadTask needPostProgress(boolean z) {
        this.downloadInfoBuilder.f55073o = z;
        return this;
    }

    public DownloadTask needRetryDelay(boolean z) {
        this.downloadInfoBuilder.f55048B = z;
        return this;
    }

    public DownloadTask needReuseChunkRunnable(boolean z) {
        this.downloadInfoBuilder.f55083y = z;
        return this;
    }

    public DownloadTask needReuseFirstConnection(boolean z) {
        this.downloadInfoBuilder.f55050D = z;
        return this;
    }

    public DownloadTask newSaveTempFileEnable(boolean z) {
        this.downloadInfoBuilder.f55056J = z;
        return this;
    }

    public DownloadTask onlyWifi(boolean z) {
        this.downloadInfoBuilder.f55064f = z;
        return this;
    }

    public DownloadTask outIp(String[] strArr) {
        this.downloadInfoBuilder.f55068j = strArr;
        return this;
    }

    public DownloadTask outSize(int[] iArr) {
        this.downloadInfoBuilder.f55069k = iArr;
        return this;
    }

    public DownloadTask packageName(String str) {
        this.downloadInfoBuilder.f55084z = str;
        return this;
    }

    public DownloadTask retryCount(int i) {
        this.downloadInfoBuilder.f55070l = i;
        return this;
    }

    public DownloadTask retryDelayTimeArray(String str) {
        this.downloadInfoBuilder.f55049C = str;
        return this;
    }

    public DownloadTask savePath(String str) {
        this.downloadInfoBuilder.mo41999b(str);
        return this;
    }

    public DownloadTask showNotification(boolean z) {
        this.downloadInfoBuilder.f55077s = z;
        return this;
    }

    public DownloadTask showNotificationForAutoResumed(boolean z) {
        this.downloadInfoBuilder.f55081w = z;
        return this;
    }

    public DownloadTask tempPath(String str) {
        this.downloadInfoBuilder.f55063e = str;
        return this;
    }

    public DownloadTask title(String str) {
        this.downloadInfoBuilder.f55060b = str;
        return this;
    }

    public DownloadTask url(String str) {
        this.downloadInfoBuilder.f55061c = str;
        return this;
    }

    public IDownloadListener getSingleDownloadListener(C19787h hVar) {
        return (IDownloadListener) this.singleListenerMap.get(hVar);
    }

    public DownloadTask mainThreadListener(IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return this;
        }
        return mainThreadListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
    }

    public DownloadTask notificationListener(IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return this;
        }
        return notificationListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
    }

    public DownloadTask subThreadListener(IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return this;
        }
        return subThreadListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
    }

    public int getDownloadListenerSize(C19787h hVar) {
        int size;
        SparseArray downloadListeners = getDownloadListeners(hVar);
        if (downloadListeners == null) {
            return 0;
        }
        synchronized (downloadListeners) {
            size = downloadListeners.size();
        }
        return size;
    }

    public SparseArray<IDownloadListener> getDownloadListeners(C19787h hVar) {
        if (hVar == C19787h.MAIN) {
            return this.mainThreadListeners;
        }
        if (hVar == C19787h.SUB) {
            return this.subThreadListeners;
        }
        if (hVar == C19787h.NOTIFICATION) {
            return this.notificationListeners;
        }
        return null;
    }

    private void addListenerToDownloadingSameTask(C19787h hVar) {
        SparseArray downloadListeners = getDownloadListeners(hVar);
        synchronized (downloadListeners) {
            for (int i = 0; i < downloadListeners.size(); i++) {
                IDownloadListener iDownloadListener = (IDownloadListener) downloadListeners.get(downloadListeners.keyAt(i));
                if (iDownloadListener != null) {
                    C19886c.m48631a().mo41486b(getDownloadId(), iDownloadListener, hVar, false);
                }
            }
        }
    }

    public void copyInterfaceFromNewTask(DownloadTask downloadTask) {
        this.chunkAdjustCalculator = downloadTask.chunkAdjustCalculator;
        this.chunkStrategy = downloadTask.chunkStrategy;
        this.singleListenerMap.clear();
        this.singleListenerMap.putAll(downloadTask.singleListenerMap);
        synchronized (this.mainThreadListeners) {
            this.mainThreadListeners.clear();
            addAll(downloadTask.mainThreadListeners, this.mainThreadListeners);
        }
        synchronized (this.subThreadListeners) {
            this.subThreadListeners.clear();
            addAll(downloadTask.subThreadListeners, this.subThreadListeners);
        }
        synchronized (this.notificationListeners) {
            this.notificationListeners.clear();
            addAll(downloadTask.notificationListeners, this.notificationListeners);
        }
        this.notificationEventListener = downloadTask.notificationEventListener;
        this.interceptor = downloadTask.interceptor;
        this.depend = downloadTask.depend;
        this.monitorDepend = downloadTask.monitorDepend;
        this.forbiddenHandler = downloadTask.forbiddenHandler;
        this.diskSpaceHandler = downloadTask.diskSpaceHandler;
        this.retryDelayTimeCalculator = downloadTask.retryDelayTimeCalculator;
        this.notificationClickCallback = downloadTask.notificationClickCallback;
        this.fileUriProvider = downloadTask.fileUriProvider;
    }

    public void copyListenerFromPendingTask(DownloadTask downloadTask) {
        for (Entry entry : downloadTask.singleListenerMap.entrySet()) {
            if (entry != null && !this.singleListenerMap.containsKey(entry.getKey())) {
                this.singleListenerMap.put(entry.getKey(), entry.getValue());
            }
        }
        try {
            if (downloadTask.mainThreadListeners.size() != 0) {
                synchronized (this.mainThreadListeners) {
                    removeAll(this.mainThreadListeners, downloadTask.mainThreadListeners);
                    addAll(downloadTask.mainThreadListeners, this.mainThreadListeners);
                }
            }
            if (downloadTask.subThreadListeners.size() != 0) {
                synchronized (this.subThreadListeners) {
                    removeAll(this.subThreadListeners, downloadTask.subThreadListeners);
                    addAll(downloadTask.subThreadListeners, this.subThreadListeners);
                }
            }
            if (downloadTask.notificationListeners.size() != 0) {
                synchronized (this.notificationListeners) {
                    removeAll(this.notificationListeners, downloadTask.notificationListeners);
                    addAll(downloadTask.notificationListeners, this.notificationListeners);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void addAll(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray != null && sparseArray2 != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                sparseArray2.put(keyAt, sparseArray.get(keyAt));
            }
        }
    }

    private void copyListeners(SparseArray<IDownloadListener> sparseArray, SparseArray<IDownloadListener> sparseArray2) {
        sparseArray.clear();
        for (int i = 0; i < sparseArray2.size(); i++) {
            int keyAt = sparseArray2.keyAt(i);
            IDownloadListener iDownloadListener = (IDownloadListener) sparseArray2.get(keyAt);
            if (iDownloadListener != null) {
                sparseArray.put(keyAt, iDownloadListener);
            }
        }
    }

    private void removeAll(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray != null && sparseArray2 != null) {
            int size = sparseArray2.size();
            for (int i = 0; i < size; i++) {
                sparseArray.remove(sparseArray2.keyAt(i));
            }
        }
    }

    public IDownloadListener getDownloadListenerByIndex(C19787h hVar, int i) {
        SparseArray downloadListeners = getDownloadListeners(hVar);
        if (downloadListeners == null || i < 0) {
            return null;
        }
        synchronized (downloadListeners) {
            if (i >= downloadListeners.size()) {
                return null;
            }
            IDownloadListener iDownloadListener = (IDownloadListener) downloadListeners.get(downloadListeners.keyAt(i));
            return iDownloadListener;
        }
    }

    public DownloadTask mainThreadListenerWithHashCode(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.mainThreadListeners) {
                this.mainThreadListeners.put(i, iDownloadListener);
            }
            this.singleListenerMap.put(C19787h.MAIN, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                this.singleListenerHashCodeMap.put(i, C19787h.MAIN);
            }
        }
        return this;
    }

    public DownloadTask notificationListenerWithHashCode(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.notificationListeners) {
                this.notificationListeners.put(i, iDownloadListener);
            }
            this.singleListenerMap.put(C19787h.NOTIFICATION, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                this.singleListenerHashCodeMap.put(i, C19787h.NOTIFICATION);
            }
        }
        return this;
    }

    public void setDownloadListeners(SparseArray<IDownloadListener> sparseArray, C19787h hVar) {
        if (sparseArray != null) {
            try {
                if (hVar == C19787h.MAIN) {
                    synchronized (this.mainThreadListeners) {
                        copyListeners(this.mainThreadListeners, sparseArray);
                    }
                } else if (hVar == C19787h.SUB) {
                    synchronized (this.subThreadListeners) {
                        copyListeners(this.subThreadListeners, sparseArray);
                    }
                } else if (hVar == C19787h.NOTIFICATION) {
                    synchronized (this.notificationListeners) {
                        copyListeners(this.notificationListeners, sparseArray);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public DownloadTask subThreadListenerWithHashCode(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.subThreadListeners) {
                this.subThreadListeners.put(i, iDownloadListener);
            }
            this.singleListenerMap.put(C19787h.SUB, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                this.singleListenerHashCodeMap.put(i, C19787h.SUB);
            }
        }
        return this;
    }

    public void addDownloadListener(int i, IDownloadListener iDownloadListener, C19787h hVar, boolean z) {
        if (iDownloadListener != null) {
            if (z && this.singleListenerMap != null) {
                this.singleListenerMap.put(hVar, iDownloadListener);
                synchronized (this.singleListenerHashCodeMap) {
                    this.singleListenerHashCodeMap.put(i, hVar);
                }
            }
            SparseArray downloadListeners = getDownloadListeners(hVar);
            if (downloadListeners != null) {
                synchronized (downloadListeners) {
                    downloadListeners.put(i, iDownloadListener);
                }
            }
        }
    }

    public void removeDownloadListener(int i, IDownloadListener iDownloadListener, C19787h hVar, boolean z) {
        SparseArray downloadListeners = getDownloadListeners(hVar);
        if (downloadListeners == null) {
            if (z && this.singleListenerMap.containsKey(hVar)) {
                this.singleListenerMap.remove(hVar);
            }
            return;
        }
        synchronized (downloadListeners) {
            if (z) {
                try {
                    if (this.singleListenerMap.containsKey(hVar)) {
                        iDownloadListener = (IDownloadListener) this.singleListenerMap.get(hVar);
                        this.singleListenerMap.remove(hVar);
                    }
                    if (iDownloadListener != null) {
                        int indexOfValue = downloadListeners.indexOfValue(iDownloadListener);
                        if (indexOfValue >= 0 && indexOfValue < downloadListeners.size()) {
                            downloadListeners.removeAt(indexOfValue);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                downloadListeners.remove(i);
                synchronized (this.singleListenerHashCodeMap) {
                    C19787h hVar2 = (C19787h) this.singleListenerHashCodeMap.get(i);
                    if (hVar2 != null && this.singleListenerMap.containsKey(hVar2)) {
                        this.singleListenerMap.remove(hVar2);
                        this.singleListenerHashCodeMap.remove(i);
                    }
                }
            }
        }
    }
}
