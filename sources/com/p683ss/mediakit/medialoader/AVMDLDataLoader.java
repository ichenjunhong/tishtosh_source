package com.p683ss.mediakit.medialoader;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.C2240a;
import com.bytedance.android.p161c.C2835a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p723j.C11511a;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.p2391v.C47964c;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.mediakit.net.AVMDLDNSParser;
import com.p683ss.mediakit.net.IPCache;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

/* renamed from: com.ss.mediakit.medialoader.AVMDLDataLoader */
public class AVMDLDataLoader implements Callback {
    private static AVMDLDataLoader mInstance;
    private static volatile boolean mIsLibraryLoaded;
    private AVMDLDataLoaderConfigure mConfigure;
    private long mEndTime;
    private long mHandle;
    private Handler mHandler;
    private AVMDLDataLoaderListener mLiveListener;
    public Handler mLogHandler;
    private Thread mMsgThread = null;
    private final ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    private long mSartTime;
    private volatile int mState = -1;
    private AVMDLDataLoaderListener mVodListener;
    private final WriteLock mWriteLock;

    /* renamed from: com.ss.mediakit.medialoader.AVMDLDataLoader$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                if (C18973a.m46144a(str)) {
                    C2835a.m8098a(C11010c.m22280a(), String.valueOf(C11010c.m22286g()));
                    StringBuilder sb = new StringBuilder();
                    C47964c.m103778e();
                    sb.append(C47964c.m103775a());
                    sb.append("/lib");
                    sb.append(str);
                    sb.append(".so");
                    String sb2 = sb.toString();
                    if (new File(sb2).exists()) {
                        C18973a.m46142a(str, 2);
                        System.load(sb2);
                        C18973a.m46141a(uptimeMillis, str);
                        return;
                    }
                    C18973a.m46142a(str, 3);
                }
            } catch (Throwable unused) {
            }
            C11511a.m23578a(str);
            C18973a.m46141a(uptimeMillis, str);
        }
    }

    private static native void _cancel(long j, String str);

    private static native void _cancelAll(long j);

    private static native void _clearAllCaches(long j);

    private static native void _clearCachesByUsedTime(long j, long j2);

    private static native void _clearNetinfoCache(long j);

    private static native void _close(long j);

    private final native long _create();

    private static native void _forceRemoveCacheFile(long j, String str);

    private static native long _getLongValue(long j, int i);

    private static native long _getLongValueByStr(long j, String str, int i);

    private static native long _getLongValueByStrStr(long j, String str, String str2, int i);

    private static native String _getStringValue(long j, int i);

    private static native String _getStringValueByStr(long j, String str, int i);

    private static native String _getStringValueByStrStr(long j, String str, String str2, int i);

    private static native void _makeFileAutoDeleteFlag(long j, String str, int i);

    private static native void _preConnectByHost(long j, String str, int i);

    private static native void _preloadResource(long j, String str, int i);

    private static native void _removeCacheFile(long j, String str);

    private static native void _setInt64Value(long j, int i, long j2);

    private static native void _setInt64ValueByStrKey(long j, int i, String str, long j2);

    private static native void _setIntValue(long j, int i, int i2);

    private static native void _setStringValue(long j, int i, String str);

    private static native int _start(long j);

    private static native void _stop(long j);

    public boolean isRunning() {
        if (this.mState == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p683ss.mediakit.medialoader.AVMDLDataLoader getInstance() {
        /*
            com.ss.mediakit.medialoader.AVMDLDataLoader r0 = mInstance
            if (r0 != 0) goto L_0x001b
            java.lang.Class<com.ss.mediakit.medialoader.AVMDLDataLoader> r0 = com.p683ss.mediakit.medialoader.AVMDLDataLoader.class
            monitor-enter(r0)
            com.ss.mediakit.medialoader.AVMDLDataLoader r1 = mInstance     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x0016
            r1 = 0
            com.ss.mediakit.medialoader.AVMDLDataLoader r2 = new com.ss.mediakit.medialoader.AVMDLDataLoader     // Catch:{ Exception -> 0x0014 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0014 }
            mInstance = r2     // Catch:{ Exception -> 0x0014 }
            goto L_0x0016
        L_0x0014:
            mInstance = r1     // Catch:{ all -> 0x0018 }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            goto L_0x001b
        L_0x0018:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r1
        L_0x001b:
            com.ss.mediakit.medialoader.AVMDLDataLoader r0 = mInstance
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.mediakit.medialoader.AVMDLDataLoader.getInstance():com.ss.mediakit.medialoader.AVMDLDataLoader");
    }

    private void hijack() {
        AVMDLLog.m110472d("ttmn", "----hijack start");
        AVMDLDNSParser.processHijack();
        AVMDLLog.m110472d("ttmn", "hijack clear net cache: ");
        clearNetinfoCache();
        AVMDLLog.m110472d("ttmn", "****hijack end");
    }

    public int start() {
        if (this.mState == 1) {
            return 0;
        }
        new Thread(new Runnable() {
            public void run() {
                AVMDLDataLoader.this.startInternal();
            }
        }).start();
        return 0;
    }

    public void stop() {
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                _stop(this.mHandle);
            }
        } catch (UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
    }

    private void initNativeHandle() {
        if (this.mHandle == 0) {
            try {
                this.mHandle = _create();
            } catch (Throwable unused) {
                this.mHandle = 0;
            }
            if (this.mHandle != 0 && this.mHandler == null) {
                if (Looper.myLooper() != null) {
                    this.mHandler = new Handler(this);
                    return;
                }
                this.mHandler = new Handler(Looper.getMainLooper(), this);
            }
        }
    }

    public void cancelAll() {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                if (this.mHandle != 0) {
                    _cancelAll(this.mHandle);
                }
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void clearAllCaches() {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                if (this.mHandle != 0) {
                    _clearAllCaches(this.mHandle);
                }
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void clearNetinfoCache() {
        if (this.mState == 1) {
            IPCache.getInstance().clear();
            this.mWriteLock.lock();
            try {
                _clearNetinfoCache(this.mHandle);
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public long getAllCacheSize() {
        long j = -1;
        if (this.mState != 1) {
            return -1;
        }
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                j = _getLongValue(this.mHandle, 100);
            }
        } catch (UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
        return j;
    }

    public String getLocalAddr() {
        String str = null;
        if (this.mState != 1) {
            return null;
        }
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                str = _getStringValue(this.mHandle, 4);
            }
        } catch (UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
        return str;
    }

    public void close() {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                if (this.mHandle != 0) {
                    _close(this.mHandle);
                    this.mHandle = 0;
                    this.mState = 5;
                    if (this.mHandler != null) {
                        this.mHandler.removeCallbacksAndMessages(null);
                        this.mHandler = null;
                    }
                    if (this.mLogHandler != null) {
                        this.mLogHandler.removeCallbacksAndMessages(null);
                        this.mLogHandler = null;
                    }
                }
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public void startInternal() {
        this.mWriteLock.lock();
        try {
            if (this.mState != 1) {
                initNativeHandle();
                initLogThread(this);
                if (this.mHandle != 0) {
                    setConfigureInternal(this.mConfigure);
                    if (_start(this.mHandle) >= 0) {
                        this.mState = 1;
                    }
                }
            }
            this.mWriteLock.unlock();
            if (this.mConfigure.mEnableBenchMarkIOSpeed > 0) {
                int testFileIOSpeed = testFileIOSpeed();
                AVMDLLog.m110472d("BENCHMARKIO", C2240a.m6772a("test io average speed:%d", new Object[]{Integer.valueOf(testFileIOSpeed)}));
                if (testFileIOSpeed > 0) {
                    setIntValue(1508, testFileIOSpeed);
                }
            }
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0091, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int testFileIOSpeed() {
        /*
            r17 = this;
            r1 = r17
            com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r1.mConfigure
            java.lang.String r0 = r0.mCacheDir
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = -1
            if (r0 == 0) goto L_0x000e
            return r2
        L_0x000e:
            com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r1.mConfigure
            java.lang.String r0 = r0.mCacheDir
            com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure r3 = r1.mConfigure
            java.lang.String r3 = r3.mCacheDir
            int r3 = r3.length()
            r4 = 1
            int r3 = r3 - r4
            char r0 = r0.charAt(r3)
            r3 = 47
            r5 = 0
            if (r0 != r3) goto L_0x0035
            java.lang.String r0 = "%siospeed"
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure r6 = r1.mConfigure
            java.lang.String r6 = r6.mCacheDir
            r3[r5] = r6
            java.lang.String r0 = com.C2240a.m6772a(r0, r3)
        L_0x0033:
            r3 = r0
            goto L_0x0044
        L_0x0035:
            java.lang.String r0 = "%s/iospeed"
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure r6 = r1.mConfigure
            java.lang.String r6 = r6.mCacheDir
            r3[r5] = r6
            java.lang.String r0 = com.C2240a.m6772a(r0, r3)
            goto L_0x0033
        L_0x0044:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r6 = r0.exists()
            if (r6 != 0) goto L_0x0052
            r0.mkdirs()
        L_0x0052:
            java.io.File r6 = new java.io.File
            java.lang.String r0 = "iospeed.cach"
            r6.<init>(r3, r0)
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x0062
            r6.delete()
        L_0x0062:
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00ce }
            java.lang.String r0 = "rw"
            r7.<init>(r6, r0)     // Catch:{ Exception -> 0x00ce }
            r2 = 0
            r10 = 0
            r12 = 0
        L_0x006e:
            r0 = 30
            if (r2 >= r0) goto L_0x00bb
            double r14 = r1.testFileIO(r3, r2, r7)     // Catch:{ Exception -> 0x0093, all -> 0x00c2 }
            java.lang.String r0 = "BENCHMARKIO"
            java.lang.String r8 = "num:%d result:%f"
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0091, all -> 0x00c2 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0091, all -> 0x00c2 }
            r9[r5] = r16     // Catch:{ Exception -> 0x0091, all -> 0x00c2 }
            java.lang.Double r16 = java.lang.Double.valueOf(r14)     // Catch:{ Exception -> 0x0091, all -> 0x00c2 }
            r9[r4] = r16     // Catch:{ Exception -> 0x0091, all -> 0x00c2 }
            java.lang.String r8 = com.C2240a.m6772a(r8, r9)     // Catch:{ Exception -> 0x0091, all -> 0x00c2 }
            com.p683ss.mediakit.medialoader.AVMDLLog.m110472d(r0, r8)     // Catch:{ Exception -> 0x0091, all -> 0x00c2 }
            goto L_0x00a9
        L_0x0091:
            r0 = move-exception
            goto L_0x0096
        L_0x0093:
            r0 = move-exception
            r14 = 0
        L_0x0096:
            java.lang.String r8 = "BENCHMARKIO"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c4, all -> 0x00c2 }
            java.lang.String r4 = "test fileio exception:"
            r9.<init>(r4)     // Catch:{ Exception -> 0x00c4, all -> 0x00c2 }
            r9.append(r0)     // Catch:{ Exception -> 0x00c4, all -> 0x00c2 }
            java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x00c4, all -> 0x00c2 }
            com.p683ss.mediakit.medialoader.AVMDLLog.m110472d(r8, r0)     // Catch:{ Exception -> 0x00c4, all -> 0x00c2 }
        L_0x00a9:
            r8 = 0
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b7
            r0 = 20
            if (r2 < r0) goto L_0x00b7
            double r12 = r12 + r14
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 + r8
        L_0x00b7:
            int r2 = r2 + 1
            r4 = 1
            goto L_0x006e
        L_0x00bb:
            r7.close()     // Catch:{ Exception -> 0x00c4, all -> 0x00c2 }
            r6.delete()     // Catch:{ Exception -> 0x00c4, all -> 0x00c2 }
            goto L_0x00c4
        L_0x00c2:
            r0 = move-exception
            throw r0
        L_0x00c4:
            r2 = 0
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cd
            double r12 = r12 / r10
            int r0 = (int) r12
            return r0
        L_0x00cd:
            return r5
        L_0x00ce:
            r0 = move-exception
            java.lang.String r3 = "BENCHMARKIO"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "create accefile exception:"
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.p683ss.mediakit.medialoader.AVMDLLog.m110472d(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.mediakit.medialoader.AVMDLDataLoader.testFileIOSpeed():int");
    }

    private void initLogThread(final Callback callback) {
        if (this.mMsgThread == null) {
            this.mMsgThread = new Thread() {
                public void run() {
                    if (Looper.myLooper() == null) {
                        Looper.prepare();
                    }
                    AVMDLDataLoader.this.mLogHandler = new Handler(callback);
                    Looper.loop();
                }
            };
            this.mMsgThread.setName("mdl_log_handler");
            this.mMsgThread.start();
        }
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 12 || i == 9) {
            return postMessage(this.mLiveListener, message);
        }
        return postMessage(this.mVodListener, message);
    }

    public void setConfigure(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) {
        this.mWriteLock.lock();
        try {
            if (this.mState != 1) {
                this.mConfigure = aVMDLDataLoaderConfigure;
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    private AVMDLDataLoader(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) throws Exception {
        initNativeHandle();
        this.mReadLock = this.mReadWritedLock.readLock();
        this.mWriteLock = this.mReadWritedLock.writeLock();
        if (this.mHandle != 0) {
            initLogThread(this);
            this.mConfigure = aVMDLDataLoaderConfigure;
            this.mState = 0;
            return;
        }
        throw new Exception("create native mdl fail");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|(7:11|12|13|14|15|17|18)|19|20|(3:22|23|24)(2:25|26)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x001e */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0025 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int init(boolean r3) {
        /*
            java.lang.Class<com.ss.mediakit.medialoader.AVMDLDataLoader> r0 = com.p683ss.mediakit.medialoader.AVMDLDataLoader.class
            monitor-enter(r0)
            boolean r1 = mIsLibraryLoaded     // Catch:{ all -> 0x0027 }
            r2 = 0
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)
            return r2
        L_0x000a:
            mIsLibraryLoaded = r3     // Catch:{ all -> 0x0027 }
            if (r3 != 0) goto L_0x001e
            com.bytedance.p556d.p557a.C9729a.m19499a()     // Catch:{ all -> 0x0027 }
            java.lang.String r3 = "ttopenssl"
            com.p683ss.mediakit.medialoader.AVMDLDataLoader._lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(r3)     // Catch:{ Throwable | UnsatisfiedLinkError -> 0x0016 }
        L_0x0016:
            java.lang.String r3 = "avmdl"
            com.p683ss.mediakit.medialoader.AVMDLDataLoader._lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(r3)     // Catch:{ Throwable | UnsatisfiedLinkError -> 0x001e }
            r3 = 1
            mIsLibraryLoaded = r3     // Catch:{ Throwable | UnsatisfiedLinkError -> 0x001e }
        L_0x001e:
            boolean r3 = mIsLibraryLoaded     // Catch:{ all -> 0x0027 }
            if (r3 != 0) goto L_0x0025
            r3 = -1
            monitor-exit(r0)
            return r3
        L_0x0025:
            monitor-exit(r0)
            return r2
        L_0x0027:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.mediakit.medialoader.AVMDLDataLoader.init(boolean):int");
    }

    public void cancel(String str) {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                if (this.mHandle != 0) {
                    _cancel(this.mHandle, str);
                }
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void forceRemoveFileCache(String str) {
        if (this.mState == 1 && !TextUtils.isEmpty(str)) {
            this.mWriteLock.lock();
            try {
                if (this.mHandle != 0) {
                    _forceRemoveCacheFile(this.mHandle, str);
                }
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public long getCacheSize(String str) {
        long j = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return -1;
        }
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                j = _getLongValueByStr(this.mHandle, str, 103);
            }
        } catch (UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
        return j;
    }

    public String getStringCacheInfo(String str) {
        String str2 = null;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return null;
        }
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                str2 = _getStringValueByStr(this.mHandle, str, BaseNotice.HASHTAG);
            }
        } catch (UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
        return str2;
    }

    public String getStringValue(int i) {
        String str = null;
        if (this.mState != 1) {
            return null;
        }
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                str = _getStringValue(this.mHandle, i);
            }
        } catch (UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
        return str;
    }

    public void removeFileCache(String str) {
        if (this.mState == 1 && !TextUtils.isEmpty(str)) {
            this.mWriteLock.lock();
            try {
                if (this.mHandle != 0) {
                    _removeCacheFile(this.mHandle, str);
                }
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void setListener(AVMDLDataLoaderListener aVMDLDataLoaderListener) {
        this.mWriteLock.lock();
        try {
            this.mVodListener = aVMDLDataLoaderListener;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void tryToClearCachesByUsedTime(long j) {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                if (this.mHandle != 0) {
                    _clearCachesByUsedTime(this.mHandle, j);
                }
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        r7.mWriteLock.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        throw r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061 A[ExcHandler: all (r8v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:7:0x0013] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p683ss.mediakit.medialoader.AVMDLFileInfo getCacheInfo(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = r7.mState
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0007
            return r1
        L_0x0007:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x000e
            return r1
        L_0x000e:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r7.mWriteLock
            r0.lock()
            long r3 = r7.mHandle     // Catch:{ UnsatisfiedLinkError -> 0x0068, all -> 0x0061 }
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0068
            long r3 = r7.mHandle     // Catch:{ UnsatisfiedLinkError -> 0x0068, all -> 0x0061 }
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r8 = _getStringValueByStr(r3, r8, r0)     // Catch:{ UnsatisfiedLinkError -> 0x0068, all -> 0x0061 }
            java.lang.String r0 = ","
            java.lang.String[] r8 = r8.split(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0068, all -> 0x0061 }
            int r0 = r8.length     // Catch:{ UnsatisfiedLinkError -> 0x0068, all -> 0x0061 }
            r3 = 3
            if (r0 < r3) goto L_0x0068
            com.ss.mediakit.medialoader.AVMDLFileInfo r0 = new com.ss.mediakit.medialoader.AVMDLFileInfo     // Catch:{ UnsatisfiedLinkError -> 0x0068, all -> 0x0061 }
            r0.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x0068, all -> 0x0061 }
            r1 = 2
            r1 = r8[r1]     // Catch:{ UnsatisfiedLinkError -> 0x0069, all -> 0x0061 }
            r0.mFilePath = r1     // Catch:{ UnsatisfiedLinkError -> 0x0069, all -> 0x0061 }
            r1 = 0
            r3 = r8[r1]     // Catch:{ UnsatisfiedLinkError -> 0x0069, all -> 0x0061 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ UnsatisfiedLinkError -> 0x0069, all -> 0x0061 }
            if (r3 != 0) goto L_0x004c
            r1 = r8[r1]     // Catch:{ UnsatisfiedLinkError -> 0x0069, all -> 0x0061 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ UnsatisfiedLinkError -> 0x0069, all -> 0x0061 }
            long r3 = r1.longValue()     // Catch:{ UnsatisfiedLinkError -> 0x0069, all -> 0x0061 }
            r0.mCacheSize = r3     // Catch:{ UnsatisfiedLinkError -> 0x0069, all -> 0x0061 }
        L_0x004c:
            r1 = r8[r2]     // Catch:{ UnsatisfiedLinkError -> 0x0069, all -> 0x0061 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ UnsatisfiedLinkError -> 0x0069, all -> 0x0061 }
            if (r1 != 0) goto L_0x0069
            r8 = r8[r2]     // Catch:{ UnsatisfiedLinkError -> 0x0069, all -> 0x0061 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ UnsatisfiedLinkError -> 0x0069, all -> 0x0061 }
            long r1 = r8.longValue()     // Catch:{ UnsatisfiedLinkError -> 0x0069, all -> 0x0061 }
            r0.mContentLenght = r1     // Catch:{ UnsatisfiedLinkError -> 0x0069, all -> 0x0061 }
            goto L_0x0069
        L_0x0061:
            r8 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r7.mWriteLock
            r0.unlock()
            throw r8
        L_0x0068:
            r0 = r1
        L_0x0069:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r8 = r7.mWriteLock
            r8.unlock()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.mediakit.medialoader.AVMDLDataLoader.getCacheInfo(java.lang.String):com.ss.mediakit.medialoader.AVMDLFileInfo");
    }

    public long getLongValue(int i) {
        long j = -1;
        if (i != 7218 && this.mState != 1) {
            StringBuilder sb = new StringBuilder("getLongValue key: ");
            sb.append(i);
            sb.append(" result: -1");
            AVMDLLog.m110472d("ttmn", sb.toString());
            return -1;
        } else if (this.mConfigure == null) {
            StringBuilder sb2 = new StringBuilder("getLongValue key: ");
            sb2.append(i);
            sb2.append(" result: -998");
            AVMDLLog.m110472d("ttmn", sb2.toString());
            return -998;
        } else {
            this.mWriteLock.lock();
            switch (i) {
                case 8100:
                    j = (long) this.mConfigure.mLiveLoaderEnable;
                    break;
                case 8101:
                    j = (long) this.mConfigure.mLiveP2pAllow;
                    break;
                default:
                    try {
                        if (this.mHandle != 0) {
                            j = _getLongValue(this.mHandle, i);
                            break;
                        }
                    } catch (UnsatisfiedLinkError unused) {
                        break;
                    } catch (Throwable th) {
                        this.mWriteLock.unlock();
                        throw th;
                    }
                    break;
            }
            this.mWriteLock.unlock();
            StringBuilder sb3 = new StringBuilder("getLongValue key: ");
            sb3.append(i);
            sb3.append(" result: ");
            sb3.append(j);
            AVMDLLog.m110472d("ttmn", sb3.toString());
            return j;
        }
    }

    private void setConfigureInternal(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) {
        if (this.mHandle != 0 && aVMDLDataLoaderConfigure != null) {
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mCacheDir)) {
                String createFilePathBaseDir = createFilePathBaseDir(aVMDLDataLoaderConfigure.mCacheDir, "loaderFactory");
                if (!TextUtils.isEmpty(createFilePathBaseDir)) {
                    _setStringValue(this.mHandle, 9, createFilePathBaseDir);
                }
                if (TextUtils.isEmpty(this.mConfigure.mNetCacheDir)) {
                    aVMDLDataLoaderConfigure.mNetCacheDir = createFilePathBaseDir(aVMDLDataLoaderConfigure.mCacheDir, "netCache");
                }
                _setStringValue(this.mHandle, 5510, aVMDLDataLoaderConfigure.mNetCacheDir);
                _setStringValue(this.mHandle, 0, aVMDLDataLoaderConfigure.mCacheDir);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mAppInfo)) {
                _setStringValue(this.mHandle, 10, aVMDLDataLoaderConfigure.mAppInfo);
            }
            _setIntValue(this.mHandle, 8001, aVMDLDataLoaderConfigure.mLiveP2pAllow);
            _setIntValue(this.mHandle, 8000, aVMDLDataLoaderConfigure.mLiveLoaderType);
            _setIntValue(this.mHandle, 8005, aVMDLDataLoaderConfigure.mLiveWatchDurationThreshold);
            _setIntValue(this.mHandle, 8006, aVMDLDataLoaderConfigure.mLiveCacheThresholdHttpToP2p);
            _setIntValue(this.mHandle, 8007, aVMDLDataLoaderConfigure.mLiveCacheThresholdP2pToHttp);
            _setIntValue(this.mHandle, 8008, aVMDLDataLoaderConfigure.mLiveMaxTrySwitchP2pTimes);
            _setIntValue(this.mHandle, 8009, aVMDLDataLoaderConfigure.mLiveWaitP2pReadyThreshold);
            _setIntValue(this.mHandle, 8010, aVMDLDataLoaderConfigure.mLiveMobileUploadAllow);
            _setIntValue(this.mHandle, 8011, aVMDLDataLoaderConfigure.mLiveMobileDownloadAllow);
            _setIntValue(this.mHandle, 1, aVMDLDataLoaderConfigure.mMaxCacheSize);
            _setIntValue(this.mHandle, 2, aVMDLDataLoaderConfigure.mRWTimeOut);
            _setIntValue(this.mHandle, 3, aVMDLDataLoaderConfigure.mOpenTimeOut);
            _setIntValue(this.mHandle, 5, aVMDLDataLoaderConfigure.mTryCount);
            _setIntValue(this.mHandle, 7, aVMDLDataLoaderConfigure.mMaxCacheSize);
            _setIntValue(this.mHandle, 8, aVMDLDataLoaderConfigure.mLoaderFactoryMaxMemorySize);
            _setIntValue(this.mHandle, 6, aVMDLDataLoaderConfigure.mLoaderType);
            _setIntValue(this.mHandle, 102, aVMDLDataLoaderConfigure.mPreloadParallelNum);
            _setIntValue(this.mHandle, 800, aVMDLDataLoaderConfigure.mIsCloseFileCache);
            if (aVMDLDataLoaderConfigure.mMaxCacheAge > 0) {
                _setIntValue(this.mHandle, 104, aVMDLDataLoaderConfigure.mMaxCacheAge);
            }
            _setIntValue(this.mHandle, OnRunningErrorCallback.TYPE_SHOT_SCREEN, aVMDLDataLoaderConfigure.mPreloadStrategy);
            _setIntValue(this.mHandle, 1040, aVMDLDataLoaderConfigure.mPreloadWaitListType);
            _setIntValue(this.mHandle, 105, aVMDLDataLoaderConfigure.mEnablePreloadReUse);
            _setIntValue(this.mHandle, 700, aVMDLDataLoaderConfigure.mEnableExternDNS);
            _setIntValue(this.mHandle, 701, aVMDLDataLoaderConfigure.mEnableSocketReuse);
            _setIntValue(this.mHandle, 702, aVMDLDataLoaderConfigure.mSocketIdleTimeOut);
            _setIntValue(this.mHandle, 800, aVMDLDataLoaderConfigure.mIsCloseFileCache);
            _setIntValue(this.mHandle, 8216, aVMDLDataLoaderConfigure.mLoaderFactoryP2PLevel);
            _setIntValue(this.mHandle, 1502, aVMDLDataLoaderConfigure.mTestSpeedTypeVersion);
            _setIntValue(this.mHandle, 1504, aVMDLDataLoaderConfigure.mCheckSumLevel);
            _setIntValue(this.mHandle, 1505, aVMDLDataLoaderConfigure.mEncryptVersion);
            _setIntValue(this.mHandle, 1507, aVMDLDataLoaderConfigure.mSpeedCoefficientValue);
            _setIntValue(this.mHandle, 900, aVMDLDataLoaderConfigure.mMaxIpCountEachDomain);
            _setIntValue(this.mHandle, 901, aVMDLDataLoaderConfigure.mEnableIpBucket);
            _setIntValue(this.mHandle, 902, aVMDLDataLoaderConfigure.mErrorStateTrustTime);
            _setIntValue(this.mHandle, 2508, aVMDLDataLoaderConfigure.mEnablePreconnect);
            _setIntValue(this.mHandle, 2509, aVMDLDataLoaderConfigure.mPreconnectNum);
            _setIntValue(this.mHandle, 2510, aVMDLDataLoaderConfigure.mEnableLoaderPreempt);
            _setIntValue(this.mHandle, 2511, aVMDLDataLoaderConfigure.mNextDownloadThreshold);
            _setIntValue(this.mHandle, 7216, aVMDLDataLoaderConfigure.mOnlyUseCdn);
            _setIntValue(this.mHandle, 3511, aVMDLDataLoaderConfigure.mAccessCheckLevel);
            _setIntValue(this.mHandle, 5511, aVMDLDataLoaderConfigure.mEnableSessionReuse);
            _setIntValue(this.mHandle, 5512, aVMDLDataLoaderConfigure.mMaxTlsVersion);
            if (aVMDLDataLoaderConfigure.mSocketSendBufferKB > 0) {
                _setIntValue(this.mHandle, 7220, aVMDLDataLoaderConfigure.mSocketSendBufferKB);
            }
            if (aVMDLDataLoaderConfigure.mRingBufferSizeKB > 0) {
                _setIntValue(this.mHandle, 7221, aVMDLDataLoaderConfigure.mRingBufferSizeKB);
            }
            _setIntValue(this.mHandle, 7222, aVMDLDataLoaderConfigure.mEnableFileCacheV2);
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mVdpABTestId)) {
                _setStringValue(this.mHandle, 7223, aVMDLDataLoaderConfigure.mVdpABTestId);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mVdpGroupId)) {
                _setStringValue(this.mHandle, 7224, aVMDLDataLoaderConfigure.mVdpGroupId);
            }
            _setIntValue(this.mHandle, 7225, aVMDLDataLoaderConfigure.mAlogEnable);
            AVMDLDNSParser.setIntValue(0, this.mConfigure.mDNSMainType);
            AVMDLDNSParser.setIntValue(1, this.mConfigure.mDNSBackType);
            AVMDLDNSParser.setIntValue(2, this.mConfigure.mDefaultExpiredTime);
            AVMDLDNSParser.setIntValue(3, this.mConfigure.mMainToBackUpDelayedTime);
        }
    }

    public void preConnectByHost(String str, int i) {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                _preConnectByHost(this.mHandle, str, i);
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void setIntValue(int i, int i2) {
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                _setIntValue(this.mHandle, i, i2);
            }
        } catch (UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
    }

    public void setListener(int i, AVMDLDataLoaderListener aVMDLDataLoaderListener) {
        this.mWriteLock.lock();
        if (i == 107) {
            try {
                this.mLiveListener = aVMDLDataLoaderListener;
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
        }
        this.mWriteLock.unlock();
    }

    private boolean postMessage(AVMDLDataLoaderListener aVMDLDataLoaderListener, Message message) {
        if (message.what == 701) {
            AVMDLLog.m110472d("ttmn", "receive hijack err: ");
            hijack();
            return true;
        } else if (aVMDLDataLoaderListener == null || message.obj == null) {
            return true;
        } else {
            AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo = (AVMDLDataLoaderNotifyInfo) message.obj;
            if (aVMDLDataLoaderNotifyInfo != null) {
                aVMDLDataLoaderListener.onNotify(aVMDLDataLoaderNotifyInfo);
            }
            return true;
        }
    }

    public String getStringValueByStr(String str, int i) {
        String str2 = null;
        if (this.mState != 1) {
            return null;
        }
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                str2 = _getStringValueByStr(this.mHandle, str, i);
            }
        } catch (UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
        return str2;
    }

    public void makeFileAutoDeleteFlag(String str, int i) {
        if (this.mState == 1 && !TextUtils.isEmpty(str)) {
            this.mWriteLock.lock();
            try {
                if (this.mHandle != 0) {
                    _makeFileAutoDeleteFlag(this.mHandle, str, i);
                }
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void preloadResource(String str, int i) {
        if (this.mState == 1 && !TextUtils.isEmpty(str) && i != 0) {
            this.mWriteLock.lock();
            try {
                if (this.mHandle != 0) {
                    _preloadResource(this.mHandle, str, i);
                }
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void setLongValue(int i, long j) {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                if (this.mHandle != 0) {
                    _setInt64Value(this.mHandle, i, j);
                }
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void setStringValue(int i, String str) {
        if (!TextUtils.isEmpty(str) && this.mState == 1) {
            this.mWriteLock.lock();
            try {
                if (this.mHandle != 0) {
                    _setStringValue(this.mHandle, i, str);
                }
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    private String createFilePathBaseDir(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        if (str.charAt(str.length() - 1) == '/') {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            str3 = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("/");
            sb2.append(str2);
            str3 = sb2.toString();
        }
        if (!TextUtils.isEmpty(str3)) {
            File file = new File(str3);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return str3;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|(8:11|12|13|14|15|17|18|(3:21|22|23))|24|25|(3:27|28|29)(2:30|31)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x002e A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int init(boolean r3, boolean r4) {
        /*
            java.lang.Class<com.ss.mediakit.medialoader.AVMDLDataLoader> r0 = com.p683ss.mediakit.medialoader.AVMDLDataLoader.class
            monitor-enter(r0)
            boolean r1 = mIsLibraryLoaded     // Catch:{ all -> 0x0030 }
            r2 = 0
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)
            return r2
        L_0x000a:
            mIsLibraryLoaded = r3     // Catch:{ all -> 0x0030 }
            if (r3 != 0) goto L_0x0027
            com.bytedance.p556d.p557a.C9729a.m19499a()     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = "ttopenssl"
            com.p683ss.mediakit.medialoader.AVMDLDataLoader._lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(r3)     // Catch:{ Throwable | UnsatisfiedLinkError -> 0x0016 }
        L_0x0016:
            java.lang.String r3 = "avmdl"
            com.p683ss.mediakit.medialoader.AVMDLDataLoader._lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(r3)     // Catch:{ Throwable | UnsatisfiedLinkError -> 0x001f }
            r3 = 1
            mIsLibraryLoaded = r3     // Catch:{ Throwable | UnsatisfiedLinkError -> 0x001f }
            goto L_0x0020
        L_0x001f:
        L_0x0020:
            if (r4 == 0) goto L_0x0027
            java.lang.String r3 = "avmdlp2p"
            com.p683ss.mediakit.medialoader.AVMDLDataLoader._lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(r3)     // Catch:{ Throwable | UnsatisfiedLinkError -> 0x0027 }
        L_0x0027:
            boolean r3 = mIsLibraryLoaded     // Catch:{ all -> 0x0030 }
            if (r3 != 0) goto L_0x002e
            r3 = -1
            monitor-exit(r0)
            return r3
        L_0x002e:
            monitor-exit(r0)
            return r2
        L_0x0030:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.mediakit.medialoader.AVMDLDataLoader.init(boolean, boolean):int");
    }

    public long getCacheSize(String str, String str2) {
        long j = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -1;
        }
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                j = _getLongValueByStrStr(this.mHandle, str, str2, 103);
            }
        } catch (UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
        return j;
    }

    public long getInt64Value(int i, long j) {
        if (i == 8003 || i == 8004) {
            if (this.mLiveListener != null) {
                return this.mLiveListener.getInt64Value(i, j);
            }
            StringBuilder sb = new StringBuilder("getInt64Value mLiveListener is nullptr, code: ");
            sb.append(i);
            AVMDLLog.m110473e("ttmn", sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("getInt64Value code: ");
        sb2.append(i);
        sb2.append(" defaultValue: ");
        sb2.append(j);
        AVMDLLog.m110472d("ttmn", sb2.toString());
        return j;
    }

    public String getStringCacheInfo(String str, String str2) {
        String str3 = null;
        if (this.mState != 1 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0) {
                str3 = _getStringValueByStrStr(this.mHandle, str, str2, BaseNotice.HASHTAG);
            }
        } catch (UnsatisfiedLinkError unused) {
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
        return str3;
    }

    public String getStringValueByStrkey(int i, long j, String str) {
        String str2 = null;
        if (this.mState != 1) {
            return null;
        }
        if (i != 1503) {
            if (i == 1506 && this.mVodListener != null && !TextUtils.isEmpty(str)) {
                str2 = this.mVodListener.getStringValue(i, j, str);
            }
        } else if (this.mVodListener != null && !TextUtils.isEmpty(str)) {
            str2 = this.mVodListener.getCheckSumInfo(str);
        }
        return str2;
    }

    public void onNotify(int i, long j, int i2) {
        if (this.mState == 1 && this.mHandler != null) {
            AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo = new AVMDLDataLoaderNotifyInfo();
            aVMDLDataLoaderNotifyInfo.what = i;
            aVMDLDataLoaderNotifyInfo.parameter = j;
            aVMDLDataLoaderNotifyInfo.code = (long) i2;
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.obj = aVMDLDataLoaderNotifyInfo;
            obtainMessage.what = i;
            obtainMessage.sendToTarget();
        }
    }

    public void setInt64ValueByStrKey(int i, String str, long j) {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                if (this.mHandle != 0) {
                    _setInt64ValueByStrKey(this.mHandle, i, str, j);
                }
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    private double testFileIO(String str, int i, RandomAccessFile randomAccessFile) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return -1.0d;
        }
        long currentTimeMillis = System.currentTimeMillis();
        randomAccessFile.seek((long) i);
        byte[] bArr = new byte[4096];
        for (int i2 = 0; i2 < 200; i2++) {
            Thread.sleep(5);
            randomAccessFile.write(bArr, 0, PreloadTask.BYTE_UNIT_NUMBER);
        }
        long currentTimeMillis2 = ((System.currentTimeMillis() - currentTimeMillis) - 1000) + 0;
        if (currentTimeMillis2 <= 0) {
            return -1.0d;
        }
        AVMDLLog.m110472d("BENCHMARKIO", C2240a.m6772a("size:%d costtime:%d", new Object[]{Integer.valueOf(819200), Long.valueOf(currentTimeMillis2)}));
        return (double) (819200 / currentTimeMillis2);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLogInfo(int r6, int r7, java.lang.String r8) {
        /*
            r5 = this;
            int r0 = r5.mState
            r1 = 1
            if (r0 != r1) goto L_0x00c3
            android.os.Handler r0 = r5.mLogHandler
            if (r0 != 0) goto L_0x000b
            goto L_0x00c3
        L_0x000b:
            com.ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo r0 = new com.ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo
            r0.<init>()
            r0.what = r6
            long r2 = (long) r7
            r0.code = r2
            r0.logInfo = r8
            r7 = 4
            if (r6 == r7) goto L_0x0021
            r8 = 14
            if (r6 == r8) goto L_0x0021
            r0.logToJson()
        L_0x0021:
            java.lang.String r8 = "ttmn"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onLogInfo what:"
            r2.<init>(r3)
            int r3 = r0.what
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.p683ss.mediakit.medialoader.AVMDLLog.m110472d(r8, r2)
            r8 = 0
            switch(r6) {
                case 0: goto L_0x00a9;
                case 1: goto L_0x00a4;
                case 6: goto L_0x00ae;
                case 7: goto L_0x009f;
                case 10: goto L_0x009a;
                case 11: goto L_0x0095;
                case 13: goto L_0x0090;
                case 14: goto L_0x008b;
                case 700: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x00ae
        L_0x003c:
            java.lang.String r2 = r0.logInfo     // Catch:{  }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{  }
            if (r2 != 0) goto L_0x00ae
            java.lang.String r2 = r0.logInfo     // Catch:{  }
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)     // Catch:{  }
            int r3 = r2.length     // Catch:{  }
            if (r3 != r7) goto L_0x00ae
            java.lang.String r7 = "unknown"
            r0.logType = r7     // Catch:{  }
            r7 = r2[r8]     // Catch:{  }
            java.lang.String r3 = "0"
            boolean r7 = r7.equals(r3)     // Catch:{  }
            if (r7 == 0) goto L_0x0062
            java.lang.String r7 = "video"
            r0.logType = r7     // Catch:{  }
            goto L_0x0070
        L_0x0062:
            r7 = r2[r8]     // Catch:{  }
            java.lang.String r3 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{  }
            if (r7 == 0) goto L_0x0070
            java.lang.String r7 = "audio"
            r0.logType = r7     // Catch:{  }
        L_0x0070:
            r7 = r2[r1]     // Catch:{  }
            r0.logInfo = r7     // Catch:{  }
            r7 = 2
            r7 = r2[r7]     // Catch:{ NumberFormatException -> 0x007e }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x007e }
            long r3 = (long) r7     // Catch:{ NumberFormatException -> 0x007e }
            r0.code = r3     // Catch:{ NumberFormatException -> 0x007e }
        L_0x007e:
            r7 = 3
            r7 = r2[r7]     // Catch:{ Exception -> 0x0089 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x0089 }
            long r2 = (long) r7     // Catch:{ Exception -> 0x0089 }
            r0.parameter = r2     // Catch:{ Exception -> 0x0089 }
            goto L_0x00ae
        L_0x0089:
            goto L_0x00ae
        L_0x008b:
            java.lang.String r7 = "alog_info"
            r0.logType = r7
            goto L_0x00ae
        L_0x0090:
            java.lang.String r7 = "pcdn_task"
            r0.logType = r7
            goto L_0x00ae
        L_0x0095:
            java.lang.String r7 = "own_live_loader_sample"
            r0.logType = r7
            goto L_0x00ae
        L_0x009a:
            java.lang.String r7 = "own_live_loader"
            r0.logType = r7
            goto L_0x00ae
        L_0x009f:
            java.lang.String r7 = "heart_beat"
            r0.logType = r7
            goto L_0x00ad
        L_0x00a4:
            java.lang.String r7 = "own_vdp"
            r0.logType = r7
            goto L_0x00ae
        L_0x00a9:
            java.lang.String r7 = "media_loader"
            r0.logType = r7
        L_0x00ad:
            r8 = 1
        L_0x00ae:
            if (r8 != r1) goto L_0x00b5
            org.json.JSONObject r7 = r0.jsonLog
            if (r7 != 0) goto L_0x00b5
            return
        L_0x00b5:
            android.os.Handler r7 = r5.mLogHandler
            android.os.Message r7 = r7.obtainMessage()
            r7.what = r6
            r7.obj = r0
            r7.sendToTarget()
            return
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.mediakit.medialoader.AVMDLDataLoader.onLogInfo(int, int, java.lang.String):void");
    }
}
