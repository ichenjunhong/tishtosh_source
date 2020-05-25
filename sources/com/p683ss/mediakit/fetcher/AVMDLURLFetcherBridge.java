package com.p683ss.mediakit.fetcher;

import android.text.TextUtils;
import com.C2240a;
import com.p683ss.mediakit.medialoader.AVMDLLog;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.mediakit.fetcher.AVMDLURLFetcherBridge */
public class AVMDLURLFetcherBridge implements AVMDLURLFetcherListener {
    private static AVMDLFetcherMakerInterface fetcherMaker;
    public String fileKey;
    private long handle = 0;
    boolean isFinish;
    private Lock lock = new ReentrantLock();
    String newURL;
    public String oldURL;
    public String rawKey;

    private static native void _notifyFetcherResult(long j, String str, String str2, String str3);

    /* access modifiers changed from: 0000 */
    public boolean isFinish() {
        return this.isFinish;
    }

    /* JADX INFO: finally extract failed */
    public String getResult() {
        this.lock.lock();
        try {
            String str = this.newURL;
            this.lock.unlock();
            StringBuilder sb = new StringBuilder("****get result:");
            sb.append(str);
            AVMDLLog.m110472d("AVMDLURLFetcherBridge", sb.toString());
            return str;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void release() {
        AVMDLLog.m110472d("AVMDLURLFetcherBridge", C2240a.m6772a("----start release fetcher:%s", new Object[]{this}));
        this.lock.lock();
        try {
            this.handle = 0;
            this.lock.unlock();
            AVMDLLog.m110472d("AVMDLURLFetcherBridge", C2240a.m6772a("remove fetcher rawkey:%s", new Object[]{this.rawKey, this.fileKey}));
            AVMDLLog.m110472d("AVMDLURLFetcherBridge", C2240a.m6772a("****end call release:%s", new Object[]{this}));
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public static void setFetcherMaker(AVMDLFetcherMakerInterface aVMDLFetcherMakerInterface) {
        if (aVMDLFetcherMakerInterface != null) {
            fetcherMaker = aVMDLFetcherMakerInterface;
        }
    }

    public void onCompletion(int i, String str, String str2, String[] strArr) {
        this.lock.lock();
        try {
            if (!this.isFinish) {
                if (strArr != null && strArr.length > 0) {
                    this.newURL = strArr[0];
                }
                AVMDLLog.m110472d("AVMDLURLFetcherBridge", C2240a.m6772a("receive completion code:%d result:%s", new Object[]{Integer.valueOf(i), this.newURL}));
                this.isFinish = true;
                if (this.handle != 0) {
                    AVMDLLog.m110472d("AVMDLURLFetcherBridge", C2240a.m6772a("start notify result", new Object[0]));
                    _notifyFetcherResult(this.handle, str, str2, this.newURL);
                    AVMDLLog.m110472d("AVMDLURLFetcherBridge", C2240a.m6772a("end notify result", new Object[0]));
                }
            } else {
                AVMDLLog.m110472d("AVMDLURLFetcherBridge", C2240a.m6772a("has fetch finished not need cur completion code:%d result:%s expiredTime:%lld", new Object[]{Integer.valueOf(i), this.newURL}));
            }
        } finally {
            this.lock.unlock();
        }
    }

    public int start(long j, String str, String str2, String str3) {
        int i;
        StringBuilder sb = new StringBuilder("----start fetch rawkey:");
        sb.append(str);
        AVMDLLog.m110472d("AVMDLURLFetcherBridge", sb.toString());
        if (fetcherMaker == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            AVMDLLog.m110472d("AVMDLURLFetcherBridge", "****end fetch fail,fetcherMaker is null or rawky or filekey or originurl is null");
            return -1;
        }
        this.lock.lock();
        this.handle = j;
        try {
            this.rawKey = str;
            this.fileKey = str2;
            this.oldURL = str3;
            AVMDLURLFetcherInterface fetcher = fetcherMaker.getFetcher(str, str2, str3);
            if (fetcher == null) {
                AVMDLLog.m110472d("AVMDLURLFetcherBridge", "****fail, get fetcher is null");
                return -1;
            }
            int start = fetcher.start(str, str2, str3, this);
            if (start > 0) {
                String[] uRLs = fetcher.getURLs();
                if (uRLs != null) {
                    if (uRLs.length != 0) {
                        if (this.handle != 0) {
                            this.newURL = uRLs[0];
                            AVMDLLog.m110472d("AVMDLURLFetcherBridge", C2240a.m6772a("start notify result", new Object[0]));
                            _notifyFetcherResult(this.handle, str, str2, uRLs[0]);
                            AVMDLLog.m110472d("AVMDLURLFetcherBridge", C2240a.m6772a("end notify result", new Object[0]));
                            i = 1;
                            this.lock.unlock();
                            AVMDLLog.m110472d("AVMDLURLFetcherBridge", C2240a.m6772a("****call start end, result:%d", new Object[]{Integer.valueOf(i)}));
                            return i;
                        }
                    }
                }
                AVMDLLog.m110472d("AVMDLURLFetcherBridge", C2240a.m6772a("****end fail start ret:%d, but getURLs null", new Object[]{Integer.valueOf(start)}));
                this.lock.unlock();
                return -2;
            } else if (start < 0) {
                AVMDLLog.m110472d("AVMDLURLFetcherBridge", C2240a.m6772a("****end fail start ret:%d, not need wait result", new Object[]{Integer.valueOf(start)}));
                this.lock.unlock();
                return -3;
            }
            i = 0;
            this.lock.unlock();
            AVMDLLog.m110472d("AVMDLURLFetcherBridge", C2240a.m6772a("****call start end, result:%d", new Object[]{Integer.valueOf(i)}));
            return i;
        } finally {
            this.lock.unlock();
        }
    }
}
