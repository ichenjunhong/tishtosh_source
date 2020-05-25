package com.p683ss.ttvideoengine;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.C2240a;
import com.p683ss.ttvideoengine.model.VideoCacheInfo;
import com.p683ss.ttvideoengine.utils.TTHelper;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

/* renamed from: com.ss.ttvideoengine.VideoCacheManager */
public class VideoCacheManager {
    private static String TAG = "VideoCacheManager";
    private static volatile File dir;
    private final LinkedHashMap<String, File> cache;
    private volatile float cleanFactor;
    private ClearTask clearTask;
    private volatile boolean isInited;
    private final LinkedHashMap<String, VideoCacheInfo> keyCache;
    private final ReentrantReadWriteLock lock;
    private volatile long maxSize;
    private final ProtectKeyManager protectKeyManager;
    private final ReadLock readLock;
    private final WriteLock writeLock;

    /* renamed from: com.ss.ttvideoengine.VideoCacheManager$ClearTask */
    static class ClearTask {
        private Handler mHandler;
        private HandlerThread mHandlerThread;

        public ClearTask() {
            try {
                this.mHandlerThread = new HandlerThread("clearCacheThread");
                this.mHandlerThread.start();
                this.mHandler = new Handler(this.mHandlerThread.getLooper()) {
                    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
                        return;
                     */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void handleMessage(android.os.Message r2) {
                        /*
                            r1 = this;
                            if (r2 != 0) goto L_0x0003
                            return
                        L_0x0003:
                            java.lang.Object r0 = r2.obj     // Catch:{ Throwable -> 0x001a }
                            com.ss.ttvideoengine.VideoCacheManager r0 = (com.p683ss.ttvideoengine.VideoCacheManager) r0     // Catch:{ Throwable -> 0x001a }
                            int r2 = r2.what     // Catch:{ Throwable -> 0x001a }
                            switch(r2) {
                                case 0: goto L_0x0015;
                                case 1: goto L_0x0011;
                                case 2: goto L_0x000d;
                                default: goto L_0x000c;
                            }     // Catch:{ Throwable -> 0x001a }
                        L_0x000c:
                            goto L_0x0019
                        L_0x000d:
                            r0.cleanIfNecessary()     // Catch:{ Throwable -> 0x001a }
                            goto L_0x0019
                        L_0x0011:
                            r0.clear()     // Catch:{ Throwable -> 0x001a }
                            goto L_0x001a
                        L_0x0015:
                            r0.init()     // Catch:{ Throwable -> 0x001a }
                            goto L_0x001a
                        L_0x0019:
                            return
                        L_0x001a:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.VideoCacheManager.ClearTask.C514851.handleMessage(android.os.Message):void");
                    }
                };
            } catch (Throwable unused) {
                this.mHandlerThread = null;
                this.mHandler = null;
            }
        }

        public void postMessage(VideoCacheManager videoCacheManager, int i) {
            Message message = new Message();
            message.what = i;
            message.obj = videoCacheManager;
            this.mHandler.sendMessage(message);
        }
    }

    /* renamed from: com.ss.ttvideoengine.VideoCacheManager$ProtectKeyManager */
    static final class ProtectKeyManager {
        private final Map<String, Integer> protectKeys;

        private ProtectKeyManager() {
            this.protectKeys = new HashMap();
        }

        /* access modifiers changed from: 0000 */
        public final synchronized boolean containsKey(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return this.protectKeys.containsKey(str);
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void addProtectKey(java.lang.String r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x002d }
                if (r0 != 0) goto L_0x002b
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.protectKeys     // Catch:{ all -> 0x002d }
                java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x002d }
                r1 = 1
                if (r0 != 0) goto L_0x001d
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.protectKeys     // Catch:{ all -> 0x002d }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x002d }
                r0.put(r4, r1)     // Catch:{ all -> 0x002d }
                monitor-exit(r3)
                return
            L_0x001d:
                java.util.Map<java.lang.String, java.lang.Integer> r2 = r3.protectKeys     // Catch:{ all -> 0x002d }
                int r0 = r0.intValue()     // Catch:{ all -> 0x002d }
                int r0 = r0 + r1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x002d }
                r2.put(r4, r0)     // Catch:{ all -> 0x002d }
            L_0x002b:
                monitor-exit(r3)
                return
            L_0x002d:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.VideoCacheManager.ProtectKeyManager.addProtectKey(java.lang.String):void");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void removeProtectKey(java.lang.String r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x002f }
                if (r0 != 0) goto L_0x002d
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.protectKeys     // Catch:{ all -> 0x002f }
                java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002f }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x002f }
                if (r0 == 0) goto L_0x002d
                int r1 = r0.intValue()     // Catch:{ all -> 0x002f }
                r2 = 1
                if (r1 != r2) goto L_0x001f
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.protectKeys     // Catch:{ all -> 0x002f }
                r0.remove(r4)     // Catch:{ all -> 0x002f }
                monitor-exit(r3)
                return
            L_0x001f:
                java.util.Map<java.lang.String, java.lang.Integer> r1 = r3.protectKeys     // Catch:{ all -> 0x002f }
                int r0 = r0.intValue()     // Catch:{ all -> 0x002f }
                int r0 = r0 - r2
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x002f }
                r1.put(r4, r0)     // Catch:{ all -> 0x002f }
            L_0x002d:
                monitor-exit(r3)
                return
            L_0x002f:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.VideoCacheManager.ProtectKeyManager.removeProtectKey(java.lang.String):void");
        }
    }

    /* renamed from: com.ss.ttvideoengine.VideoCacheManager$VideoCacheManagerSingletonHolder */
    static class VideoCacheManagerSingletonHolder {
        public static final VideoCacheManager instance = new VideoCacheManager();

        private VideoCacheManagerSingletonHolder() {
        }
    }

    public static VideoCacheManager getInstance() {
        return VideoCacheManagerSingletonHolder.instance;
    }

    public void start() {
        this.clearTask.postMessage(this, 0);
    }

    /* access modifiers changed from: 0000 */
    public void cleanIfNecessary() {
        TTVideoEngineLog.m110644d(TAG, C2240a.m6772a("start clean file maxSize:%d", new Object[]{Long.valueOf(this.maxSize)}));
        trimSize(this.maxSize);
        TTVideoEngineLog.m110644d(TAG, C2240a.m6772a("end clean file maxSize:%d", new Object[]{Long.valueOf(this.maxSize)}));
    }

    /* access modifiers changed from: 0000 */
    public void clear() {
        TTVideoEngineLog.m110644d(TAG, C2240a.m6772a("start clear all cache", new Object[0]));
        trimSize(0);
        TTVideoEngineLog.m110644d(TAG, C2240a.m6772a("end clear all cache", new Object[0]));
    }

    private VideoCacheManager() {
        this.cache = new LinkedHashMap<>(0, 0.75f, true);
        this.keyCache = new LinkedHashMap<>(0, 0.75f, true);
        this.lock = new ReentrantReadWriteLock();
        this.readLock = this.lock.readLock();
        this.writeLock = this.lock.writeLock();
        this.maxSize = 209715200;
        this.cleanFactor = 0.3f;
        this.isInited = false;
        this.protectKeyManager = new ProtectKeyManager();
        this.clearTask = new ClearTask();
    }

    /* access modifiers changed from: 0000 */
    public void init() {
        TTVideoEngineLog.m110647i(TAG, C2240a.m6772a("start init videocachemanager", new Object[0]));
        this.writeLock.lock();
        try {
            if (!this.isInited && isValidDir(dir)) {
                File[] listFiles = dir.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    final HashMap hashMap = new HashMap(listFiles.length);
                    ArrayList arrayList = new ArrayList(listFiles.length);
                    for (File file : listFiles) {
                        if (file.isFile()) {
                            arrayList.add(file);
                            hashMap.put(file, Long.valueOf(file.lastModified()));
                        }
                    }
                    Collections.sort(arrayList, new Comparator<File>() {
                        public int compare(File file, File file2) {
                            long longValue = ((Long) hashMap.get(file)).longValue() - ((Long) hashMap.get(file2)).longValue();
                            if (longValue < 0) {
                                return -1;
                            }
                            if (longValue > 0) {
                                return 1;
                            }
                            return 0;
                        }
                    });
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        File file2 = (File) it.next();
                        TTVideoEngineLog.m110647i(TAG, C2240a.m6772a("add file:%s", new Object[]{file2.getName()}));
                        this.cache.put(getKey(file2), file2);
                        String[] extractKeys = extractKeys(file2);
                        if (isValidKeys(extractKeys)) {
                            String a = C2240a.m6772a("%s_%s", new Object[]{extractKeys[0], extractKeys[1]});
                            String a2 = C2240a.m6772a("%s_%s_%s_%s", new Object[]{extractKeys[0], extractKeys[1], extractKeys[2], extractKeys[3]});
                            String str = null;
                            if (extractKeys.length == 5) {
                                str = extractKeys[4];
                            }
                            String canonicalPath = file2.getCanonicalPath();
                            if (str != null && str.length() > 0) {
                                String customBase64Encode = TTHelper.customBase64Encode(str);
                                if (customBase64Encode != null && !customBase64Encode.equals(str)) {
                                    canonicalPath = canonicalPath.replace(str, customBase64Encode);
                                    file2.renameTo(new File(canonicalPath));
                                    str = customBase64Encode;
                                }
                            }
                            this.keyCache.put(a, new VideoCacheInfo(canonicalPath, a2, a2, str));
                        }
                    }
                }
                this.isInited = true;
            }
        } catch (Throwable th) {
            this.writeLock.unlock();
            throw th;
        }
        this.writeLock.unlock();
        TTVideoEngineLog.m110644d(TAG, C2240a.m6772a("end init videocachemanager", new Object[0]));
    }

    public void setMaxSize(long j) {
        this.maxSize = j;
    }

    private String getKey(File file) {
        return file.getName();
    }

    public static void setDir(File file) {
        if (file != null) {
            dir = file;
        }
    }

    private String[] extractKeys(File file) {
        String name = file.getName();
        if (name == null) {
            return null;
        }
        return extractKeys(name);
    }

    private String[] extractKeys(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if (split == null || split.length <= 0) {
            return null;
        }
        return split[0].split("_");
    }

    /* access modifiers changed from: 0000 */
    public boolean isValidDir(File file) {
        if (file == null || !file.exists() || !file.isDirectory() || !file.canRead() || !file.canWrite()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean isValidKeys(String[] strArr) {
        if (strArr == null || (strArr.length != 4 && strArr.length != 5)) {
            return false;
        }
        for (String str : strArr) {
            if (str == null) {
                return false;
            }
        }
        return true;
    }

    public void addProtectKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m110647i(TAG, C2240a.m6772a("start add protect key:%s", new Object[]{str}));
            this.protectKeyManager.addProtectKey(str);
            TTVideoEngineLog.m110644d(TAG, C2240a.m6772a("end add protect key:%s", new Object[]{str}));
        }
    }

    public boolean isCacheInfoExist(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.readLock.tryLock()) {
            try {
                z = this.keyCache.containsKey(str);
            } catch (Throwable th) {
                TTVideoEngineLog.m110645d(th);
            } finally {
                this.readLock.unlock();
            }
            return z;
        }
        z = false;
        return z;
    }

    public void removeProtectKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m110647i(TAG, C2240a.m6772a("start remove protect key:%s", new Object[]{str}));
            this.protectKeyManager.removeProtectKey(str);
            TTVideoEngineLog.m110644d(TAG, C2240a.m6772a("end remove protect key:%s", new Object[]{str}));
        }
    }

    public VideoCacheInfo getCacheInfo(String str) {
        VideoCacheInfo videoCacheInfo = null;
        if (str == null) {
            return null;
        }
        if (this.readLock.tryLock()) {
            try {
                VideoCacheInfo videoCacheInfo2 = (VideoCacheInfo) this.keyCache.get(str);
                if (videoCacheInfo2 != null) {
                    try {
                        videoCacheInfo2.spadeaKey = TTHelper.customBase64Decode(videoCacheInfo2.spadeaKey);
                        String[] extractKeys = extractKeys(videoCacheInfo2.fileName);
                        if (!isValidKeys(extractKeys) || !checkMD5(videoCacheInfo2.filePath, extractKeys[2], Long.parseLong(extractKeys[3]))) {
                            TTVideoEngineLog.m110644d(TAG, C2240a.m6772a("get info err", new Object[]{str}));
                            this.readLock.unlock();
                        }
                    } catch (Throwable th) {
                        th = th;
                        videoCacheInfo = videoCacheInfo2;
                        try {
                            TTVideoEngineLog.m110645d(th);
                            this.readLock.unlock();
                            return videoCacheInfo;
                        } catch (Throwable th2) {
                            this.readLock.unlock();
                            throw th2;
                        }
                    }
                }
                videoCacheInfo = videoCacheInfo2;
            } catch (Throwable th3) {
                th = th3;
                TTVideoEngineLog.m110645d(th);
                this.readLock.unlock();
                return videoCacheInfo;
            }
            this.readLock.unlock();
        }
        return videoCacheInfo;
    }

    private void trimSize(long j) {
        long j2 = j;
        HashSet hashSet = new HashSet();
        TTVideoEngineLog.m110644d(TAG, C2240a.m6772a("start trim", new Object[0]));
        this.writeLock.lock();
        long j3 = 0;
        try {
            for (Entry value : this.cache.entrySet()) {
                j3 += ((File) value.getValue()).length();
            }
            TTVideoEngineLog.m110644d(TAG, C2240a.m6772a("current file size:%d,maxsize:%d", new Object[]{Long.valueOf(j3), Long.valueOf(j)}));
            if (j3 <= j2) {
                this.writeLock.unlock();
                return;
            }
            long j4 = (long) (((float) j2) * this.cleanFactor);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            for (Entry entry : this.cache.entrySet()) {
                File file = (File) entry.getValue();
                if (file == null || !file.exists()) {
                    hashSet2.add(entry.getKey());
                } else if (!this.protectKeyManager.containsKey(getKey(file))) {
                    long length = file.length();
                    StringBuilder sb = new StringBuilder();
                    sb.append(file.getAbsolutePath());
                    sb.append("-tmp");
                    File file2 = new File(sb.toString());
                    if (file.renameTo(file2)) {
                        hashSet.add(file2);
                        j3 -= length;
                        hashSet2.add(entry.getKey());
                        String[] extractKeys = extractKeys(file);
                        if (isValidKeys(extractKeys)) {
                            hashSet3.add(C2240a.m6772a("%s_%s", new Object[]{extractKeys[0], extractKeys[1]}));
                        }
                    }
                }
                if (j3 <= j4) {
                    break;
                }
            }
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                this.cache.remove((String) it.next());
            }
            Iterator it2 = hashSet3.iterator();
            while (it2.hasNext()) {
                this.keyCache.remove((String) it2.next());
            }
            this.writeLock.unlock();
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                File file3 = (File) it3.next();
                try {
                    try {
                        TTVideoEngineLog.m110644d(TAG, C2240a.m6772a("delete file name:%s", new Object[]{file3.getName()}));
                        file3.delete();
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    TTVideoEngineLog.m110645d(th);
                }
            }
            TTVideoEngineLog.m110644d(TAG, C2240a.m6772a("end trim", new Object[0]));
        } catch (Throwable th3) {
            this.writeLock.unlock();
            throw th3;
        }
    }

    public void addCacheInfo(String str, String str2) {
        if (this.writeLock.tryLock()) {
            try {
                String[] extractKeys = extractKeys(str);
                if (isValidKeys(extractKeys)) {
                    String a = C2240a.m6772a("%s_%s", new Object[]{extractKeys[0], extractKeys[1]});
                    String a2 = C2240a.m6772a("%s_%s_%s_%s", new Object[]{extractKeys[0], extractKeys[1], extractKeys[2], extractKeys[3]});
                    String str3 = null;
                    if (extractKeys.length == 5) {
                        str3 = extractKeys[4];
                    }
                    VideoCacheInfo videoCacheInfo = new VideoCacheInfo(str2, a2, a2, str3);
                    if (!this.keyCache.containsKey(a)) {
                        this.keyCache.put(a, videoCacheInfo);
                    }
                }
            } catch (Throwable th) {
                this.writeLock.unlock();
                throw th;
            }
            this.writeLock.unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x009b A[SYNTHETIC, Splitter:B:50:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a6 A[SYNTHETIC, Splitter:B:56:0x00a6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean checkCacheFileIntegrity(java.lang.String r9, java.lang.String r10, long r11) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r9)
            boolean r9 = r0.exists()
            r1 = 0
            if (r9 == 0) goto L_0x00af
            boolean r9 = r0.isFile()
            if (r9 != 0) goto L_0x0014
            goto L_0x00af
        L_0x0014:
            long r2 = r0.length()
            int r9 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x001d
            return r1
        L_0x001d:
            r2 = 10240(0x2800, double:5.059E-320)
            int r9 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x0025
            int r9 = (int) r11
            goto L_0x0027
        L_0x0025:
            r9 = 10240(0x2800, float:1.4349E-41)
        L_0x0027:
            r2 = 0
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch:{ Exception -> 0x0095 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0095 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0095 }
            byte[] r0 = new byte[r9]     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            r5 = r11
            r11 = 0
        L_0x0037:
            if (r11 != 0) goto L_0x0052
            long r7 = (long) r9     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 >= 0) goto L_0x0040
            int r12 = (int) r5     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            goto L_0x0041
        L_0x0040:
            r12 = r9
        L_0x0041:
            int r12 = r4.read(r0, r1, r12)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            r3.update(r0, r1, r12)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            long r7 = (long) r12     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 > 0) goto L_0x004f
            r11 = 1
            goto L_0x0037
        L_0x004f:
            r12 = 0
            long r5 = r5 - r7
            goto L_0x0037
        L_0x0052:
            byte[] r9 = r3.digest()     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            java.lang.String r12 = ""
            r11.<init>(r12)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            r12 = 0
        L_0x005e:
            int r0 = r9.length     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            if (r12 >= r0) goto L_0x0079
            byte r0 = r9[r12]     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            int r2 = r0.length()     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            r3 = 2
            if (r2 >= r3) goto L_0x0073
            r11.append(r1)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
        L_0x0073:
            r11.append(r0)     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            int r12 = r12 + 1
            goto L_0x005e
        L_0x0079:
            java.lang.String r9 = r11.toString()     // Catch:{ Exception -> 0x008f, all -> 0x008d }
            r4.close()     // Catch:{ Throwable -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r11 = move-exception
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r11)
        L_0x0085:
            if (r9 == 0) goto L_0x008c
            boolean r9 = r9.equals(r10)
            return r9
        L_0x008c:
            return r1
        L_0x008d:
            r9 = move-exception
            goto L_0x00a4
        L_0x008f:
            r9 = move-exception
            r2 = r4
            goto L_0x0096
        L_0x0092:
            r9 = move-exception
            r4 = r2
            goto L_0x00a4
        L_0x0095:
            r9 = move-exception
        L_0x0096:
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r9)     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x00a3
            r2.close()     // Catch:{ Throwable -> 0x009f }
            goto L_0x00a3
        L_0x009f:
            r9 = move-exception
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r9)
        L_0x00a3:
            return r1
        L_0x00a4:
            if (r4 == 0) goto L_0x00ae
            r4.close()     // Catch:{ Throwable -> 0x00aa }
            goto L_0x00ae
        L_0x00aa:
            r10 = move-exception
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r10)
        L_0x00ae:
            throw r9
        L_0x00af:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.VideoCacheManager.checkCacheFileIntegrity(java.lang.String, java.lang.String, long):boolean");
    }

    /* access modifiers changed from: 0000 */
    public boolean checkMD5(String str, String str2, long j) {
        String str3 = str;
        String str4 = str2;
        if (!(str3 == null || str4 == null)) {
            long j2 = 0;
            if (j > 0) {
                File file = new File(str3);
                if (!file.exists() || file.length() < j) {
                    TTVideoEngineLog.m110646e(TAG, C2240a.m6772a("file not exist or filesize not engough:%s length:%d filesize:%d", new Object[]{str3, Long.valueOf(file.length()), Long.valueOf(j)}));
                    return false;
                }
                byte[] bArr = new byte[16384];
                try {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    FileInputStream fileInputStream = new FileInputStream(file);
                    while (true) {
                        long j3 = j - j2;
                        if (j3 > 16384) {
                            j3 = 16384;
                        }
                        int i = (int) j3;
                        if (i == 0) {
                            break;
                        }
                        int read = fileInputStream.read(bArr, 0, i);
                        if (read < 0) {
                            TTVideoEngineLog.m110646e(TAG, C2240a.m6772a("read data err:%s", new Object[]{str3}));
                            break;
                        }
                        j2 += (long) read;
                        instance.update(bArr, 0, read);
                    }
                    fileInputStream.close();
                    BigInteger bigInteger = new BigInteger(1, instance.digest());
                    String a = C2240a.m6772a("%032x", new Object[]{bigInteger});
                    TTVideoEngineLog.m110647i(TAG, C2240a.m6772a("cache md5:%s compute md5:%s", new Object[]{str4, bigInteger.toString(16)}));
                    if (!str4.equals(a)) {
                        return false;
                    }
                    TTVideoEngineLog.m110647i(TAG, "md5 match right");
                    return true;
                } catch (Exception e) {
                    TTVideoEngineLog.m110645d(e);
                    return false;
                }
            }
        }
        return false;
    }
}
