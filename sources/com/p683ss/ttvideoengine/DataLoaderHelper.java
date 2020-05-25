package com.p683ss.ttvideoengine;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.C2240a;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.p2454f.C48918e;
import com.p683ss.mediakit.medialoader.AVMDLDataLoader;
import com.p683ss.mediakit.medialoader.AVMDLDataLoaderConfigure;
import com.p683ss.mediakit.medialoader.AVMDLDataLoaderListener;
import com.p683ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo;
import com.p683ss.mediakit.net.AVMDLDNSParser;
import com.p683ss.ttvideoengine.VideoModelCache.VideoModelCacheInfo;
import com.p683ss.ttvideoengine.data.P2PStragetyManager;
import com.p683ss.ttvideoengine.fetcher.VideoInfoFetcher;
import com.p683ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener;
import com.p683ss.ttvideoengine.model.VideoInfo;
import com.p683ss.ttvideoengine.model.VideoModel;
import com.p683ss.ttvideoengine.model.VideoRef;
import com.p683ss.ttvideoengine.net.NetUtils;
import com.p683ss.ttvideoengine.net.TTVNetClient;
import com.p683ss.ttvideoengine.utils.DataLoaderCDNLog;
import com.p683ss.ttvideoengine.utils.Error;
import com.p683ss.ttvideoengine.utils.TTHelper;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.DataLoaderHelper */
public class DataLoaderHelper implements AVMDLDataLoaderListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private volatile boolean isProxyLibraryLoaded;
    private DataLoaderTaskQueue mAllPlayTasks;
    private DataLoaderTaskQueue mAllPreloadTasks;
    private HashMap<String, ArrayList<TTVideoEngine>> mAllUsingEngies;
    private AVMDLDataLoaderConfigure mConfigure;
    private Context mContext;
    private boolean mEnableMdlProtocol;
    private int mEnableNetworkChangedListen;
    private int mEnableReportSpeed;
    private final ReentrantLock mEngineLock;
    private Exception mException;
    private DataLoaderTaskQueue mExecuteTasks;
    private DataLoaderHeartBeat mHeartBeat;
    private int mHeartBeatInterval;
    private AVMDLDataLoader mInnerDataLoader;
    private boolean mInvalidMdlProcotol;
    public DataLoaderListener mListener;
    private final ReentrantLock mLock;
    private int mMdlDataSourceId;
    private long mMdlProtocolHandle;
    private VideoModelCache mModelCache;
    private int mNeedDLLoadP2PLib;
    private DataLoaderTaskQueue mPreloadTasks;
    private volatile LibraryLoaderProxy mProxy;
    private volatile int mState;
    private TestSpeedListener mTestSpeedListener;
    private String mVersionInfo;

    /* renamed from: com.ss.ttvideoengine.DataLoaderHelper$DataLoaderCacheFileInfo */
    public class DataLoaderCacheFileInfo {
        public long mCacheSizeFromZero;
        public String mLocalFilePath;
        public long mMediaSize;

        public DataLoaderCacheFileInfo() {
        }
    }

    /* renamed from: com.ss.ttvideoengine.DataLoaderHelper$DataLoaderCacheInfo */
    public class DataLoaderCacheInfo {
        public long mCacheSizeFromZero;
        public String mLocalFilePath;
        public long mMediaSize;

        public DataLoaderCacheInfo() {
        }
    }

    /* renamed from: com.ss.ttvideoengine.DataLoaderHelper$DataLoaderHeartBeat */
    class DataLoaderHeartBeat {
        private MyHeartBeatTask mHbTask;
        private Timer mHbTimer;

        /* renamed from: com.ss.ttvideoengine.DataLoaderHelper$DataLoaderHeartBeat$MyHeartBeatTask */
        class MyHeartBeatTask extends TimerTask {
            private AVMDLDataLoader mDataLoader;

            public void run() {
                try {
                    if (this.mDataLoader != null) {
                        this.mDataLoader.onLogInfo(7, 0, this.mDataLoader.getStringValue(1011));
                    }
                } catch (Exception e) {
                    TTVideoEngineLog.m110645d(e);
                }
            }

            public MyHeartBeatTask(AVMDLDataLoader aVMDLDataLoader) {
                this.mDataLoader = aVMDLDataLoader;
            }
        }

        public void stop() {
            if (this.mHbTimer != null) {
                this.mHbTimer.cancel();
            }
        }

        private DataLoaderHeartBeat() {
        }

        public void start(AVMDLDataLoader aVMDLDataLoader, int i) {
            if (this.mHbTask == null && this.mHbTimer == null && i > 0) {
                this.mHbTask = new MyHeartBeatTask(aVMDLDataLoader);
                this.mHbTimer = new Timer();
                long j = (long) i;
                this.mHbTimer.schedule(this.mHbTask, j, j);
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskItem */
    public class DataLoaderTaskItem {
        public String mApiString;
        public String mDecryptionKey;
        public boolean mDidCanceled;
        public VideoInfoFetcher mFetcher;
        public String mKey;
        public TaskListener mListener;
        public long mPreloadSize;
        public int mPriorityLevel;
        public String mProxyUrl;
        public Resolution mResolution = Resolution.Undefine;
        public VideoModel mResponseData;
        public Error mResponseError;
        public PreloaderURLItem mURLItem;
        public PreloaderVidItem mVidItem;
        public String mVideoId;
        public VideoInfo mVideoInfo;
        public PreloaderVideoModelItem mVideoModelItem;

        /* renamed from: com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskItem$MyFetcherListener */
        class MyFetcherListener implements FetcherListener {
            private final WeakReference<DataLoaderTaskItem> mTaskItemRef;

            public void onLog(String str) {
            }

            public void onRetry(Error error) {
            }

            public MyFetcherListener(DataLoaderTaskItem dataLoaderTaskItem) {
                this.mTaskItemRef = new WeakReference<>(dataLoaderTaskItem);
            }

            public void onCompletion(VideoModel videoModel, Error error) {
                DataLoaderTaskItem dataLoaderTaskItem = (DataLoaderTaskItem) this.mTaskItemRef.get();
                if (dataLoaderTaskItem != null) {
                    dataLoaderTaskItem.mResponseData = videoModel;
                    dataLoaderTaskItem.mResponseError = error;
                    if (dataLoaderTaskItem.mListener != null) {
                        dataLoaderTaskItem.mListener.taskFinished(dataLoaderTaskItem);
                    }
                }
            }

            public void onStatusException(int i, String str) {
                DataLoaderTaskItem dataLoaderTaskItem = (DataLoaderTaskItem) this.mTaskItemRef.get();
                if (!(dataLoaderTaskItem == null || dataLoaderTaskItem.mListener == null)) {
                    dataLoaderTaskItem.mListener.taskFinished(dataLoaderTaskItem);
                }
            }
        }

        public void setFetchListener() {
            if (this.mFetcher != null) {
                this.mFetcher.setListener(new MyFetcherListener(this));
            }
        }

        public IPreLoaderItemCallBackListener getCallBackListener() {
            if (this.mURLItem != null) {
                return this.mURLItem.getCallBackListener();
            }
            if (this.mVidItem != null) {
                return this.mVidItem.getCallBackListener();
            }
            if (this.mVideoModelItem != null) {
                return this.mVideoModelItem.getCallBackListener();
            }
            return null;
        }

        public void setListener(TaskListener taskListener) {
            this.mListener = taskListener;
        }

        public DataLoaderTaskItem() {
        }

        public void setUp(String str, Resolution resolution, long j) {
            this.mKey = str;
            this.mResolution = resolution;
            this.mPreloadSize = j;
        }
    }

    /* renamed from: com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskProgressInfo */
    public class DataLoaderTaskProgressInfo {
        public long mCacheSizeFromZero;
        public String mDecryptionKey;
        public String mKey;
        public String mLocalFilePath;
        public long mMediaSize;
        public Resolution mResolution = Resolution.Undefine;
        public int mTaskType;
        public VideoInfo mUsingVideoInfo;
        public String mVideoId;

        public DataLoaderTaskProgressInfo() {
        }
    }

    /* renamed from: com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskQueue */
    class DataLoaderTaskQueue {
        private final ReentrantLock mLock;
        private long mMaxCount;
        private final ArrayList<DataLoaderTaskItem> mTaskItems;

        public long count() {
            this.mLock.lock();
            long size = (long) this.mTaskItems.size();
            this.mLock.unlock();
            return size;
        }

        public void removeAll() {
            try {
                this.mLock.lock();
                this.mTaskItems.clear();
            } finally {
                this.mLock.unlock();
            }
        }

        public ArrayList<DataLoaderTaskItem> toArray() {
            try {
                this.mLock.lock();
                ArrayList<DataLoaderTaskItem> arrayList = new ArrayList<>();
                arrayList.addAll(this.mTaskItems);
                return arrayList;
            } finally {
                this.mLock.unlock();
            }
        }

        private Boolean _enoughItems() {
            boolean z = false;
            if (this.mMaxCount < 1) {
                return Boolean.valueOf(false);
            }
            if (((long) this.mTaskItems.size()) >= this.mMaxCount) {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        public DataLoaderTaskItem backItem() {
            this.mLock.lock();
            if (this.mTaskItems.size() == 0) {
                this.mLock.unlock();
                return null;
            }
            DataLoaderTaskItem dataLoaderTaskItem = (DataLoaderTaskItem) this.mTaskItems.get(this.mTaskItems.size() - 1);
            this.mLock.unlock();
            return dataLoaderTaskItem;
        }

        public DataLoaderTaskItem frontItem() {
            this.mLock.lock();
            if (this.mTaskItems.size() == 0) {
                this.mLock.unlock();
                return null;
            }
            DataLoaderTaskItem dataLoaderTaskItem = (DataLoaderTaskItem) this.mTaskItems.get(0);
            this.mLock.unlock();
            return dataLoaderTaskItem;
        }

        public DataLoaderTaskItem popBackItem() {
            this.mLock.lock();
            if (this.mTaskItems.size() == 0) {
                this.mLock.unlock();
                return null;
            }
            DataLoaderTaskItem dataLoaderTaskItem = (DataLoaderTaskItem) this.mTaskItems.get(this.mTaskItems.size() - 1);
            this.mTaskItems.remove(dataLoaderTaskItem);
            this.mLock.unlock();
            return dataLoaderTaskItem;
        }

        public DataLoaderTaskItem popFrontItem() {
            this.mLock.lock();
            if (this.mTaskItems.size() == 0) {
                this.mLock.unlock();
                return null;
            }
            DataLoaderTaskItem dataLoaderTaskItem = (DataLoaderTaskItem) this.mTaskItems.get(0);
            this.mTaskItems.remove(dataLoaderTaskItem);
            this.mLock.unlock();
            return dataLoaderTaskItem;
        }

        public void setMaxCount(long j) {
            this.mMaxCount = j;
        }

        private DataLoaderTaskQueue() {
            this.mLock = new ReentrantLock();
            this.mTaskItems = new ArrayList<>();
            this.mMaxCount = 0;
        }

        public boolean containItem(String str) {
            int i = 0;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Boolean valueOf = Boolean.valueOf(false);
            this.mLock.lock();
            while (true) {
                if (i >= this.mTaskItems.size()) {
                    break;
                } else if (((DataLoaderTaskItem) this.mTaskItems.get(i)).mKey.equals(str)) {
                    valueOf = Boolean.valueOf(true);
                    break;
                } else {
                    i++;
                }
            }
            this.mLock.unlock();
            return valueOf.booleanValue();
        }

        /* access modifiers changed from: 0000 */
        public boolean enqueueItem(DataLoaderTaskItem dataLoaderTaskItem) {
            Boolean bool;
            if (dataLoaderTaskItem == null || TextUtils.isEmpty(dataLoaderTaskItem.mKey)) {
                return false;
            }
            Boolean.valueOf(false);
            this.mLock.lock();
            if (_enoughItems().booleanValue()) {
                bool = Boolean.valueOf(false);
            } else {
                this.mTaskItems.add(dataLoaderTaskItem);
                bool = Boolean.valueOf(true);
            }
            this.mLock.unlock();
            return bool.booleanValue();
        }

        public DataLoaderTaskItem itemForKey(String str) {
            DataLoaderTaskItem dataLoaderTaskItem = null;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            this.mLock.lock();
            int i = 0;
            while (true) {
                if (i >= this.mTaskItems.size()) {
                    break;
                }
                DataLoaderTaskItem dataLoaderTaskItem2 = (DataLoaderTaskItem) this.mTaskItems.get(i);
                if (dataLoaderTaskItem2.mKey.equals(str)) {
                    dataLoaderTaskItem = dataLoaderTaskItem2;
                    break;
                }
                i++;
            }
            this.mLock.unlock();
            return dataLoaderTaskItem;
        }

        public DataLoaderTaskItem popItem(String str) {
            DataLoaderTaskItem dataLoaderTaskItem = null;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            this.mLock.lock();
            int i = 0;
            while (true) {
                if (i >= this.mTaskItems.size()) {
                    break;
                }
                DataLoaderTaskItem dataLoaderTaskItem2 = (DataLoaderTaskItem) this.mTaskItems.get(i);
                if (dataLoaderTaskItem2.mKey.equals(str)) {
                    dataLoaderTaskItem = dataLoaderTaskItem2;
                    break;
                }
                i++;
            }
            if (dataLoaderTaskItem != null) {
                this.mTaskItems.remove(dataLoaderTaskItem);
            }
            this.mLock.unlock();
            return dataLoaderTaskItem;
        }
    }

    /* renamed from: com.ss.ttvideoengine.DataLoaderHelper$Holder */
    static class Holder {
        public static DataLoaderHelper instance = new DataLoaderHelper();

        private Holder() {
        }
    }

    /* renamed from: com.ss.ttvideoengine.DataLoaderHelper$MyTaskListener */
    class MyTaskListener implements TaskListener {
        private final WeakReference<DataLoaderHelper> mDataLoader;

        public void taskFinished(DataLoaderTaskItem dataLoaderTaskItem) {
            DataLoaderHelper dataLoaderHelper = (DataLoaderHelper) this.mDataLoader.get();
            if (dataLoaderHelper != null && dataLoaderTaskItem != null) {
                if (!(dataLoaderTaskItem.mResponseData == null || dataLoaderTaskItem.getCallBackListener() == null)) {
                    PreLoaderItemCallBackInfo preLoaderItemCallBackInfo = new PreLoaderItemCallBackInfo(4);
                    preLoaderItemCallBackInfo.fetchVideoModel = dataLoaderTaskItem.mResponseData;
                    dataLoaderTaskItem.getCallBackListener().preloadItemInfo(preLoaderItemCallBackInfo);
                    dataLoaderTaskItem.mResolution = dataLoaderTaskItem.mVidItem.mResolution;
                }
                if (!(dataLoaderTaskItem == null || dataLoaderTaskItem.mVidItem == null || dataLoaderTaskItem.mVidItem.getFetchEndListener() == null)) {
                    dataLoaderTaskItem.mVidItem.getFetchEndListener().fetchEnd(dataLoaderTaskItem.mResponseData, dataLoaderTaskItem.mResponseError);
                    dataLoaderTaskItem.mResolution = dataLoaderTaskItem.mVidItem.mResolution;
                }
                if (dataLoaderTaskItem.mVidItem != null && !dataLoaderTaskItem.mVidItem.getOnlyFetchVideoModel()) {
                    dataLoaderHelper._exectTask(dataLoaderTaskItem);
                }
                if (dataLoaderTaskItem.mResponseError != null) {
                    if (dataLoaderHelper.mListener != null) {
                        dataLoaderHelper.mListener.dataLoaderError(dataLoaderTaskItem.mVideoId, 1, dataLoaderTaskItem.mResponseError);
                    }
                    if (dataLoaderTaskItem.getCallBackListener() != null) {
                        PreLoaderItemCallBackInfo preLoaderItemCallBackInfo2 = new PreLoaderItemCallBackInfo(3);
                        preLoaderItemCallBackInfo2.preloadError = dataLoaderTaskItem.mResponseError;
                        dataLoaderTaskItem.getCallBackListener().preloadItemInfo(preLoaderItemCallBackInfo2);
                    }
                }
            }
        }

        public MyTaskListener(DataLoaderHelper dataLoaderHelper) {
            this.mDataLoader = new WeakReference<>(dataLoaderHelper);
        }
    }

    /* renamed from: com.ss.ttvideoengine.DataLoaderHelper$TaskListener */
    interface TaskListener {
        void taskFinished(DataLoaderTaskItem dataLoaderTaskItem);
    }

    public static DataLoaderHelper getDataLoader() {
        return Holder.instance;
    }

    public long getInt64Value(int i, long j) {
        return 0;
    }

    public void setNetworkClient(TTVNetClient tTVNetClient) {
    }

    public void addTask(String str, String str2, VideoModel videoModel, Resolution resolution, long j) {
        PreloaderVideoModelItem preloaderVideoModelItem = new PreloaderVideoModelItem(videoModel, resolution, j, (PreloaderFilePathListener) null);
        addTask(preloaderVideoModelItem);
    }

    public void addTask(String str, String str2, String str3, long j) {
        if (TextUtils.isEmpty(str3)) {
            TTVideoEngineLog.m110646e("DataLoaderHelper", "url invalid.");
            return;
        }
        PreloaderURLItem preloaderURLItem = new PreloaderURLItem(str, str2, j, new String[]{str3});
        addTask(preloaderURLItem);
    }

    public void addTask(String str, String str2, String[] strArr, long j) {
        if (strArr == null || strArr.length == 0) {
            TTVideoEngineLog.m110646e("DataLoaderHelper", "urls invalid.");
            return;
        }
        PreloaderURLItem preloaderURLItem = new PreloaderURLItem(str, str2, j, strArr);
        addTask(preloaderURLItem);
    }

    public void addTask(String[] strArr, String str, long j, String str2) {
        if (strArr == null || strArr.length == 0) {
            TTVideoEngineLog.m110646e("DataLoaderHelper", "urls invalid.");
            return;
        }
        this.mLock.lock();
        try {
            String keyFromFilePath = TTHelper.keyFromFilePath(this.mContext, str2);
            PreloaderURLItem preloaderURLItem = new PreloaderURLItem(str, j, strArr, str2);
            preloaderURLItem.setKey(keyFromFilePath);
            addTask(preloaderURLItem);
        } finally {
            this.mLock.unlock();
        }
    }

    private boolean loadLibrary() {
        if (this.mProxy == null) {
            return true;
        }
        if (this.mProxy != null && !this.isProxyLibraryLoaded) {
            this.isProxyLibraryLoaded = this.mProxy.loadLibrary("avmdl");
        }
        return this.isProxyLibraryLoaded;
    }

    public boolean isRunning() {
        boolean z;
        this.mLock.lock();
        try {
            if (this.mState == 0) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.mLock.unlock();
        }
    }

    private void _tryToSetDefaultCacheDir() {
        if (this.mContext != null && TextUtils.isEmpty(this.mConfigure.mCacheDir)) {
            String appFilesPath = TTHelper.getAppFilesPath(this.mContext);
            StringBuilder sb = new StringBuilder();
            sb.append(appFilesPath);
            sb.append(File.separator);
            sb.append("mdlcache");
            String sb2 = sb.toString();
            File file = new File(sb2);
            if (!file.exists()) {
                file.mkdir();
            }
            this.mConfigure.mCacheDir = sb2;
        }
    }

    public void cancelAllTasks() {
        if (this.mInnerDataLoader == null || this.mState != 0) {
            TTVideoEngineLog.m110646e("DataLoaderHelper", "need start mdl first");
            return;
        }
        this.mLock.lock();
        try {
            cancelAllTasksInternal();
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
        this.mLock.unlock();
    }

    public void clearAllCaches() {
        if (this.mState == 0) {
            this.mLock.lock();
            try {
                if (this.mInnerDataLoader == null) {
                    TTVideoEngineLog.m110646e("DataLoaderHelper", "mInnerDataLoader == null");
                    this.mLock.unlock();
                    return;
                }
                this.mInnerDataLoader.clearAllCaches();
                this.mLock.unlock();
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    public void clearNetinfoCache() {
        this.mLock.lock();
        try {
            if (this.mInnerDataLoader == null) {
                this.mLock.unlock();
                return;
            }
            this.mInnerDataLoader.clearNetinfoCache();
            this.mLock.unlock();
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    public void close() {
        this.mLock.lock();
        try {
            if (this.mState == 1) {
                TTVideoEngineLog.m110646e("DataLoaderHelper", "DataLoader not started, not need close");
                return;
            }
            this.mListener = null;
            this.mInnerDataLoader.close();
            cancelAllTasksInternal();
            this.mState = 1;
            this.mLock.unlock();
        } finally {
            this.mLock.unlock();
        }
    }

    public long getAllCacheSize() {
        long j = 0;
        if (this.mState != 0) {
            return 0;
        }
        if (this.mLock.tryLock()) {
            try {
                if (this.mInnerDataLoader == null) {
                    TTVideoEngineLog.m110646e("DataLoaderHelper", "mInnerDataLoader == null");
                }
                long allCacheSize = this.mInnerDataLoader.getAllCacheSize();
                this.mLock.unlock();
                j = allCacheSize;
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
        return j;
    }

    private DataLoaderHelper() {
        this.mState = 1;
        this.mPreloadTasks = new DataLoaderTaskQueue();
        this.mExecuteTasks = new DataLoaderTaskQueue();
        this.mAllPreloadTasks = new DataLoaderTaskQueue();
        this.mAllPlayTasks = new DataLoaderTaskQueue();
        this.mAllUsingEngies = new HashMap<>();
        this.mEngineLock = new ReentrantLock();
        this.mInnerDataLoader = null;
        this.mConfigure = null;
        this.mContext = null;
        this.mModelCache = null;
        this.mException = null;
        this.mVersionInfo = null;
        this.mHeartBeat = null;
        this.mNeedDLLoadP2PLib = 0;
        this.mMdlProtocolHandle = -1;
        this.mInvalidMdlProcotol = true;
        this.mMdlDataSourceId = 0;
        this.mEnableMdlProtocol = false;
        this.mLock = new ReentrantLock();
        this.mHeartBeatInterval = 0;
        this.mEnableReportSpeed = 0;
        this.mEnableNetworkChangedListen = 0;
        this.mModelCache = VideoModelCache.getInstance();
        this.mState = 1;
        this.mConfigure = AVMDLDataLoaderConfigure.getDefaultonfigure();
    }

    private boolean initInternal() {
        boolean z;
        boolean z2;
        if (this.mInnerDataLoader != null) {
            return true;
        }
        if (!loadLibrary()) {
            TTVideoEngineLog.m110646e("DataLoaderHelper", C2240a.m6772a("library load fail", new Object[0]));
            return false;
        }
        if (this.mProxy != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.mNeedDLLoadP2PLib != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (AVMDLDataLoader.init(z, z2) != 0) {
            TTVideoEngineLog.m110646e("DataLoaderHelper", C2240a.m6772a("library has not been loaded", new Object[0]));
            return false;
        }
        TTVideoEngineLog.m110646e("P2PLIB", C2240a.m6772a("loadertype:%d NeedDLLoadP2PLib:%d", new Object[]{Integer.valueOf(this.mConfigure.mLoaderType), Integer.valueOf(this.mNeedDLLoadP2PLib)}));
        if (this.mNeedDLLoadP2PLib == 0 && this.mConfigure.mLoaderType > 0 && this.mListener != null) {
            TTVideoEngineLog.m110646e("P2PLIB", "try to load p2p lib");
            TTVideoEngineLog.m110646e("P2PLIB", C2240a.m6772a("load p2p lib result:%d", new Object[]{Integer.valueOf(this.mListener.loadLibrary("avmdlp2p") ? 1 : 0)}));
        }
        try {
            this.mInnerDataLoader = AVMDLDataLoader.getInstance();
            this.mInnerDataLoader.setConfigure(this.mConfigure);
            this.mInnerDataLoader.setListener(this);
            this.mHeartBeat = new DataLoaderHeartBeat();
            return true;
        } catch (Exception e) {
            TTVideoEngineLog.m110645d(e);
            return false;
        }
    }

    public void cancelAllTasksInternal() {
        ArrayList arrayList = new ArrayList();
        if (this.mExecuteTasks.count() > 0) {
            while (true) {
                DataLoaderTaskItem popBackItem = this.mExecuteTasks.popBackItem();
                if (popBackItem == null) {
                    break;
                } else if (popBackItem.mPriorityLevel >= 10000) {
                    arrayList.add(popBackItem);
                } else {
                    if (popBackItem.mFetcher != null) {
                        popBackItem.mFetcher.cancel();
                    }
                    _notifyPreloadCancel(popBackItem);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                this.mExecuteTasks.enqueueItem((DataLoaderTaskItem) arrayList.get(i));
            }
            arrayList.clear();
        }
        if (this.mPreloadTasks.count() > 0) {
            while (true) {
                DataLoaderTaskItem popBackItem2 = this.mPreloadTasks.popBackItem();
                if (popBackItem2 == null) {
                    break;
                } else if (popBackItem2.mPriorityLevel >= 10000) {
                    arrayList.add(popBackItem2);
                } else {
                    if (popBackItem2.mFetcher != null) {
                        popBackItem2.mFetcher.cancel();
                    }
                    _notifyPreloadCancel(popBackItem2);
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                this.mPreloadTasks.enqueueItem((DataLoaderTaskItem) arrayList.get(i2));
            }
            arrayList.clear();
        }
        if (this.mAllPreloadTasks.count() > 0) {
            boolean z = false;
            while (true) {
                DataLoaderTaskItem popBackItem3 = this.mAllPreloadTasks.popBackItem();
                if (popBackItem3 == null) {
                    break;
                } else if (popBackItem3.mPriorityLevel >= 10000) {
                    arrayList.add(popBackItem3);
                } else {
                    _notifyPreloadCancel(popBackItem3);
                    z = true;
                }
            }
            if (z) {
                this.mInnerDataLoader.cancelAll();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                this.mAllPreloadTasks.enqueueItem((DataLoaderTaskItem) arrayList.get(i3));
            }
            arrayList.clear();
        }
    }

    private void _startExecuteTask() {
        String str;
        VideoModelCacheInfo videoModelCacheInfo;
        if (this.mInnerDataLoader == null) {
            TTVideoEngineLog.m110646e("DataLoaderHelper", "need load mdl first.");
            return;
        }
        DataLoaderTaskItem backItem = this.mPreloadTasks.backItem();
        if (backItem != null && this.mExecuteTasks.enqueueItem(backItem)) {
            this.mPreloadTasks.popBackItem();
            if (backItem.mResponseData == null && backItem.mURLItem == null) {
                HashMap hashMap = new HashMap();
                if (backItem.mVidItem != null && backItem.mVidItem.mH265Enable) {
                    hashMap.put("codec_type", "1");
                }
                if (backItem.mVidItem != null && backItem.mVidItem.mDashEnable) {
                    hashMap.put("format_type", "dash");
                }
                if (backItem.mVidItem != null && backItem.mVidItem.mHttpsEnable) {
                    hashMap.put("ssl", "1");
                }
                String str2 = null;
                if (backItem.mVidItem == null || backItem.mVidItem.mListener == null) {
                    str = null;
                } else {
                    str2 = backItem.mVidItem.mListener.apiString(hashMap, backItem.mVideoId, backItem.mVidItem.mApiVersion);
                    str = backItem.mVidItem.mListener.authString(backItem.mVideoId, backItem.mVidItem.mApiVersion);
                    if (backItem.mVidItem.mBoeEnable) {
                        backItem.mApiString = TTHelper.buildBoeUrl(str2);
                    } else {
                        backItem.mApiString = str2;
                    }
                }
                if (this.mListener != null && TextUtils.isEmpty(backItem.mApiString)) {
                    str2 = this.mListener.apiStringForFetchVideoModel(hashMap, backItem.mVideoId, backItem.mResolution);
                    str = this.mListener.authStringForFetchVideoModel(backItem.mVideoId, backItem.mResolution);
                    backItem.mApiString = str2;
                }
                synchronized (PreloaderVidItem.class) {
                    videoModelCacheInfo = this.mModelCache.get(backItem.mVideoId, str2);
                }
                if (videoModelCacheInfo == null || videoModelCacheInfo.isExpired) {
                    if (backItem.mVidItem != null) {
                        backItem.mFetcher = new VideoInfoFetcher(this.mContext, backItem.mVidItem.getNetClient());
                        backItem.setFetchListener();
                        backItem.mFetcher.setResolutionMap(backItem.mVidItem.mResolutionMap);
                        backItem.mFetcher.setVideoID(backItem.mVidItem.mVideoId);
                        backItem.mFetcher.setUseVideoModelCache(true);
                        backItem.mFetcher.fetchInfo(str2, str, backItem.mVidItem.mApiVersion);
                    }
                    return;
                }
                backItem.mResponseData = videoModelCacheInfo.model;
                TTVideoEngineLog.m110647i("DataLoaderHelper", C2240a.m6772a("get videoModel ,key is %s; videoId = %s", new Object[]{backItem.mKey, backItem.mVideoId}));
                _exectTask(backItem);
                return;
            }
            _exectTask(backItem);
        }
    }

    public void start() throws Exception {
        this.mLock.lock();
        try {
            if (this.mState == 0) {
                TTVideoEngineLog.m110646e("DataLoaderHelper", "DataLoader has started not need start");
                this.mLock.unlock();
            } else if (initInternal()) {
                this.mExecuteTasks.setMaxCount(4);
                if (this.mConfigure == null) {
                    this.mConfigure = AVMDLDataLoaderConfigure.getDefaultonfigure();
                }
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(AppInfo.mAppChannel)) {
                    jSONObject.put("app_channel", AppInfo.mAppChannel);
                }
                if (!TextUtils.isEmpty(AppInfo.mAppName)) {
                    jSONObject.put("app_name", AppInfo.mAppName);
                }
                if (!TextUtils.isEmpty(AppInfo.mDeviceId)) {
                    jSONObject.put("device_id", AppInfo.mDeviceId);
                }
                if (!TextUtils.isEmpty(AppInfo.mAppVersion)) {
                    jSONObject.put("app_version", AppInfo.mAppVersion);
                }
                if (AppInfo.mAppID >= 0) {
                    jSONObject.put("app_id", AppInfo.mAppID);
                }
                if (jSONObject.has("app_id")) {
                    this.mConfigure.mAppInfo = jSONObject.toString();
                }
                this.mInnerDataLoader.setConfigure(this.mConfigure);
                if (this.mInnerDataLoader.start() >= 0) {
                    this.mMdlProtocolHandle = this.mInnerDataLoader.getLongValue(7218);
                    if (this.mMdlProtocolHandle == -1) {
                        this.mInvalidMdlProcotol = true;
                    }
                    StringBuilder sb = new StringBuilder("start: get mdlprotocolHandle: ");
                    sb.append(this.mMdlProtocolHandle);
                    TTVideoEngineLog.m110647i("DataLoaderHelper", sb.toString());
                    this.mHeartBeat.start(this.mInnerDataLoader, this.mHeartBeatInterval);
                    this.mState = 0;
                    this.mInnerDataLoader.setIntValue(7219, TTNetWorkListener.getInstance(this.mContext).getCurrentAccessType());
                    TTVideoEngineLog.m110644d("DataLoaderHelper", "DataLoader start.");
                    this.mLock.unlock();
                    return;
                }
                throw new Exception("start data loader fail");
            } else {
                throw new Exception("init data loader fail");
            }
        } catch (JSONException e) {
            TTVideoEngineLog.m110645d(e);
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    public void _removePlayTask(String str) {
        this.mAllPlayTasks.popItem(str);
    }

    public long getCacheFileSize(String str) {
        return getCacheSize(str);
    }

    public void cancelTaskByFilePath(String str) {
        cancelTask(TTHelper.keyFromFilePath(this.mContext, str));
    }

    private void _notifyPreloadCancel(DataLoaderTaskItem dataLoaderTaskItem) {
        if (dataLoaderTaskItem != null && !dataLoaderTaskItem.mDidCanceled) {
            dataLoaderTaskItem.mDidCanceled = true;
            if (dataLoaderTaskItem.getCallBackListener() != null) {
                dataLoaderTaskItem.getCallBackListener().preloadItemInfo(new PreLoaderItemCallBackInfo(5));
            }
        }
    }

    public DataLoaderCacheFileInfo cacheFileInfo(String str) {
        DataLoaderCacheInfo cacheInfo = getCacheInfo(str);
        if (cacheInfo == null) {
            return null;
        }
        DataLoaderCacheFileInfo dataLoaderCacheFileInfo = new DataLoaderCacheFileInfo();
        dataLoaderCacheFileInfo.mMediaSize = cacheInfo.mMediaSize;
        dataLoaderCacheFileInfo.mCacheSizeFromZero = cacheInfo.mCacheSizeFromZero;
        dataLoaderCacheFileInfo.mLocalFilePath = cacheInfo.mLocalFilePath;
        return dataLoaderCacheFileInfo;
    }

    public String getCheckSumInfo(String str) {
        try {
            if (this.mListener == null || TextUtils.isEmpty(str)) {
                return null;
            }
            return this.mListener.getCheckSumInfo(str);
        } catch (Exception e) {
            TTVideoEngineLog.m110645d(e);
            return null;
        }
    }

    public void setContext(Context context) {
        this.mLock.lock();
        try {
            this.mContext = context;
        } finally {
            this.mLock.unlock();
        }
    }

    public void setListener(DataLoaderListener dataLoaderListener) {
        this.mLock.lock();
        try {
            this.mListener = dataLoaderListener;
        } finally {
            this.mLock.unlock();
        }
    }

    public void setLoadProxy(LibraryLoaderProxy libraryLoaderProxy) {
        this.mLock.lock();
        if (libraryLoaderProxy != null) {
            try {
                this.mProxy = libraryLoaderProxy;
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
        this.mLock.unlock();
    }

    public void setTestSpeedListener(TestSpeedListener testSpeedListener) {
        this.mLock.lock();
        try {
            this.mTestSpeedListener = testSpeedListener;
        } finally {
            this.mLock.unlock();
        }
    }

    private String[] addMdlFlag(String[] strArr) {
        if (strArr == null || strArr.length == 0 || P2PStragetyManager.getInstance().isAllowP2p() == 1) {
            return strArr;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (!TextUtils.isEmpty(strArr[i])) {
                strArr[i] = TTHelper.appendQueryString(strArr[i], "p2p=0");
            }
        }
        return strArr;
    }

    private void reportSpeed(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        if (this.mEnableReportSpeed != 0) {
            long j = aVMDLDataLoaderNotifyInfo.code;
            long j2 = aVMDLDataLoaderNotifyInfo.parameter;
            if (j > 0 && j2 > 0) {
                double d = (double) j;
                Double.isNaN(d);
                double d2 = 8.0d * d;
                double d3 = (double) j2;
                Double.isNaN(d3);
                C48918e.m105713a().mo96742a(d2 / (d3 / 1000.0d), d, j2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public String _headerString(HashMap<String, String> hashMap) {
        if (hashMap == null || hashMap.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : hashMap.keySet()) {
            sb.append(str);
            sb.append(": ");
            sb.append((String) hashMap.get(str));
            sb.append("\r\n");
        }
        return sb.toString();
    }

    public void addTask(PreloaderURLItem preloaderURLItem) {
        if (preloaderURLItem == null) {
            TTVideoEngineLog.m110646e("DataLoaderHelper", "url item invalid");
            return;
        }
        this.mLock.lock();
        try {
            _addTask(preloaderURLItem.getKey(), preloaderURLItem.getVideoId(), preloaderURLItem.getPreloadSize(), null, null, preloaderURLItem);
        } finally {
            this.mLock.unlock();
        }
    }

    public void disableAutoTrim(String str) {
        if (!TextUtils.isEmpty(str) && this.mInnerDataLoader != null) {
            this.mLock.lock();
            try {
                this.mInnerDataLoader.makeFileAutoDeleteFlag(str, 1);
            } finally {
                this.mLock.unlock();
            }
        }
    }

    public void enableAutoTrim(String str) {
        if (!TextUtils.isEmpty(str) && this.mInnerDataLoader != null) {
            this.mLock.lock();
            try {
                this.mInnerDataLoader.makeFileAutoDeleteFlag(str, 0);
            } finally {
                this.mLock.unlock();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void forceRemoveCacheFile(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mLock.lock();
            try {
                if (this.mInnerDataLoader == null) {
                    TTVideoEngineLog.m110646e("DataLoaderHelper", "mInnerDataLoader == null");
                    this.mLock.unlock();
                    return;
                }
                this.mInnerDataLoader.forceRemoveFileCache(str);
                this.mLock.unlock();
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    public DataLoaderCacheInfo getCacheInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.mLock.lock();
        try {
            if (this.mInnerDataLoader != null) {
                if (this.mState == 0) {
                    DataLoaderCacheInfo _processCacheInfo = _processCacheInfo(this.mInnerDataLoader.getStringCacheInfo(str));
                    this.mLock.unlock();
                    return _processCacheInfo;
                }
            }
            return null;
        } catch (Throwable th) {
            TTVideoEngineLog.m110645d(th);
            return null;
        } finally {
            this.mLock.unlock();
        }
    }

    public DataLoaderCacheInfo getCacheInfoByFilePath(String str) {
        this.mLock.lock();
        try {
            if (this.mInnerDataLoader == null) {
                return null;
            }
            DataLoaderCacheInfo _processCacheInfo = _processCacheInfo(this.mInnerDataLoader.getStringCacheInfo(TTHelper.keyFromFilePath(this.mContext, str), str));
            this.mLock.unlock();
            return _processCacheInfo;
        } catch (Throwable th) {
            TTVideoEngineLog.m110645d(th);
            return null;
        } finally {
            this.mLock.unlock();
        }
    }

    public long getCacheSize(String str) {
        long j = 0;
        if (this.mState != 0) {
            return 0;
        }
        this.mLock.lock();
        try {
            if (this.mInnerDataLoader == null) {
                return 0;
            }
            long cacheSize = this.mInnerDataLoader.getCacheSize(str);
            if (cacheSize > 0) {
                j = cacheSize;
            }
            this.mLock.unlock();
            return j;
        } catch (Throwable unused) {
            return 0;
        } finally {
            this.mLock.unlock();
        }
    }

    public long getCacheSizeByFilePath(String str) {
        this.mLock.lock();
        long j = 0;
        try {
            if (this.mInnerDataLoader == null) {
                return 0;
            }
            long cacheSize = this.mInnerDataLoader.getCacheSize(TTHelper.keyFromFilePath(this.mContext, str), str);
            if (cacheSize > 0) {
                j = cacheSize;
            }
            this.mLock.unlock();
            return j;
        } catch (Throwable th) {
            TTVideoEngineLog.m110645d(th);
            return 0;
        } finally {
            this.mLock.unlock();
        }
    }

    public long getLongValue(int i) {
        this.mLock.lock();
        long j = -1;
        if (i == 1003) {
            try {
                if (this.mEnableMdlProtocol) {
                    j = this.mMdlProtocolHandle;
                }
                return j;
            } finally {
                this.mLock.unlock();
            }
        } else {
            this.mLock.unlock();
            return -1;
        }
    }

    public String getPlayLog(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.mLock.lock();
        try {
            if (this.mInnerDataLoader != null) {
                str2 = this.mInnerDataLoader.getStringValueByStr(str, 1010);
            }
        } catch (Exception e) {
            TTVideoEngineLog.m110645d(e);
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
        this.mLock.unlock();
        return str2;
    }

    public void preConnect(String str) {
        if (this.mState == 0 && !TextUtils.isEmpty(str)) {
            this.mLock.lock();
            try {
                Uri parse = Uri.parse(str);
                if (!(parse == null || this.mInnerDataLoader == null)) {
                    this.mInnerDataLoader.preConnectByHost(parse.getHost(), parse.getPort());
                }
            } finally {
                this.mLock.unlock();
            }
        }
    }

    public void removeCacheFile(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mLock.lock();
            try {
                if (this.mInnerDataLoader == null) {
                    TTVideoEngineLog.m110646e("DataLoaderHelper", "mInnerDataLoader == null");
                    this.mLock.unlock();
                    return;
                }
                this.mInnerDataLoader.removeFileCache(str);
                this.mLock.unlock();
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    public void tryToClearCachesByUsedTime(long j) {
        this.mLock.lock();
        try {
            if (this.mInnerDataLoader == null) {
                this.mLock.unlock();
                return;
            }
            this.mInnerDataLoader.tryToClearCachesByUsedTime(j);
            this.mLock.unlock();
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    private void _cacheEndNotifyEngine(DataLoaderTaskItem dataLoaderTaskItem) {
        boolean z;
        ArrayList array = this.mAllPlayTasks.toArray();
        int i = 0;
        while (true) {
            if (i >= array.size()) {
                z = true;
                break;
            }
            DataLoaderTaskItem dataLoaderTaskItem2 = (DataLoaderTaskItem) array.get(i);
            if (!TextUtils.isEmpty(dataLoaderTaskItem2.mVideoId) && !TextUtils.isEmpty(dataLoaderTaskItem.mVideoId) && dataLoaderTaskItem2.mVideoId.equals(dataLoaderTaskItem.mVideoId)) {
                z = false;
                break;
            }
            i++;
        }
        if (z) {
            ArrayList _getEnginesByRawKey = _getEnginesByRawKey(dataLoaderTaskItem.mVideoId);
            if (_getEnginesByRawKey != null && _getEnginesByRawKey.size() != 0) {
                for (int i2 = 0; i2 < _getEnginesByRawKey.size(); i2++) {
                    ((TTVideoEngine) _getEnginesByRawKey.get(i2)).notifyCacheEnd();
                }
            }
        }
    }

    private ArrayList<TTVideoEngine> _getEnginesByRawKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            this.mEngineLock.lock();
            ArrayList arrayList = (ArrayList) this.mAllUsingEngies.get(str);
            if (arrayList != null) {
                ArrayList<TTVideoEngine> arrayList2 = new ArrayList<>();
                arrayList2.addAll(arrayList);
                StringBuilder sb = new StringBuilder("get engine ref,rawKey = ");
                sb.append(str);
                sb.append(" engine ref count: ");
                sb.append(arrayList2.size());
                TTVideoEngineLog.m110647i("DataLoaderHelper", sb.toString());
                return arrayList2;
            }
            this.mEngineLock.unlock();
            return null;
        } finally {
            this.mEngineLock.unlock();
        }
    }

    private DataLoaderCacheInfo _processCacheInfo(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(",");
        if (split.length < 4) {
            return null;
        }
        DataLoaderCacheInfo dataLoaderCacheInfo = new DataLoaderCacheInfo();
        dataLoaderCacheInfo.mLocalFilePath = split[3];
        if (!TextUtils.isEmpty(split[0])) {
            dataLoaderCacheInfo.mCacheSizeFromZero = Long.valueOf(split[0]).longValue();
        }
        if (!TextUtils.isEmpty(split[1])) {
            dataLoaderCacheInfo.mMediaSize = Long.valueOf(split[1]).longValue();
        }
        TTVideoEngineLog.m110644d("DataLoaderHelper", "get cache info.");
        return dataLoaderCacheInfo;
    }

    private String[] _removeRepeatUrls(String[] strArr) {
        if (strArr == null || strArr.length <= 1) {
            return strArr;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            String str = strArr[i];
            Boolean valueOf = Boolean.valueOf(true);
            int size = arrayList.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                } else if (((String) arrayList.get(size)).equals(str)) {
                    valueOf = Boolean.valueOf(false);
                    break;
                } else {
                    size--;
                }
            }
            if (valueOf.booleanValue()) {
                arrayList.add(str);
            }
        }
        String[] strArr2 = new String[arrayList.size()];
        arrayList.toArray(strArr2);
        return strArr2;
    }

    private boolean _supportProxy(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("http://127.0.0.1") || lowerCase.startsWith("http://localhost") || lowerCase.startsWith("mdl://") || lowerCase.startsWith("file://") || lowerCase.startsWith("/") || lowerCase.endsWith(".mpd") || lowerCase.contains(".mpd?") || lowerCase.contains(".m3u8?") || lowerCase.endsWith(".m3u8")) {
            return false;
        }
        return true;
    }

    public String _getProxyUrl(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("mdl://")) {
                return str;
            }
            int indexOf = str.indexOf("?");
            if (indexOf == -1) {
                return null;
            }
            String localAddr = this.mInnerDataLoader.getLocalAddr();
            if (TextUtils.isEmpty(localAddr)) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("http://");
            stringBuffer.append(localAddr);
            stringBuffer.append(str.substring(indexOf));
            String stringBuffer2 = stringBuffer.toString();
            StringBuilder sb = new StringBuilder("_proxyUrl: ");
            sb.append(stringBuffer2);
            TTVideoEngineLog.m110646e("DataLoaderHelper", sb.toString());
            str = stringBuffer2;
            return str;
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder("get proxy url failed: ");
            sb2.append(str);
            TTVideoEngineLog.m110646e("DataLoaderHelper", sb2.toString());
        }
    }

    public void addTask(PreloaderVidItem preloaderVidItem) {
        if (preloaderVidItem == null || this.mState != 0) {
            return;
        }
        if (TextUtils.isEmpty(preloaderVidItem.mVideoId)) {
            TTVideoEngineLog.m110646e("DataLoaderHelper", "videoId invalid.");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(preloaderVidItem.mVideoId);
        sb.append("_");
        sb.append(preloaderVidItem.mResolution.toString(0));
        sb.append(preloaderVidItem.mH265Enable);
        sb.append(preloaderVidItem.mDashEnable);
        String sb2 = sb.toString();
        this.mLock.lock();
        try {
            _addTask(sb2, preloaderVidItem.mVideoId, preloaderVidItem.mPreloadSize, preloaderVidItem, null, null);
        } finally {
            this.mLock.unlock();
        }
    }

    public void cancelTask(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.mInnerDataLoader == null || this.mState != 0) {
                TTVideoEngineLog.m110646e("DataLoaderHelper", "need start mdl first");
                return;
            }
            this.mLock.lock();
            try {
                DataLoaderTaskItem popItem = this.mPreloadTasks.popItem(str);
                if (popItem != null) {
                    _notifyPreloadCancel(popItem);
                } else {
                    DataLoaderTaskItem popItem2 = this.mExecuteTasks.popItem(str);
                    if (popItem2 != null) {
                        if (popItem2.mFetcher != null) {
                            popItem2.mFetcher.cancel();
                        }
                        _notifyPreloadCancel(popItem2);
                    } else {
                        DataLoaderTaskItem popItem3 = this.mAllPreloadTasks.popItem(str);
                        if (popItem3 != null) {
                            this.mInnerDataLoader.cancel(str);
                            _notifyPreloadCancel(popItem3);
                        }
                    }
                }
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
            this.mLock.unlock();
        }
    }

    public String getStringValue(int i) {
        this.mLock.lock();
        if (i == 0) {
            String str = this.mConfigure.mCacheDir;
            this.mLock.unlock();
            return str;
        } else if (i == 6) {
            try {
                if (this.mVersionInfo == null && this.mInnerDataLoader != null) {
                    this.mVersionInfo = this.mInnerDataLoader.getStringValue(11);
                }
                String str2 = this.mVersionInfo;
                this.mLock.unlock();
                return str2;
            } catch (Exception e) {
                TTVideoEngineLog.m110645d(e);
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
        this.mLock.unlock();
        return null;
    }

    public void addTask(PreloaderVideoModelItem preloaderVideoModelItem) {
        String str;
        if (preloaderVideoModelItem == null || preloaderVideoModelItem.mVideoModel == null || preloaderVideoModelItem.mResolution == null) {
            TTVideoEngineLog.m110646e("DataLoaderHelper", "addTask videoModel input invalid");
            return;
        }
        VideoInfo videoInfo = preloaderVideoModelItem.mVideoModel.getVideoInfo(preloaderVideoModelItem.mResolution, true);
        if (videoInfo != null) {
            str = videoInfo.getValueStr(15);
        } else {
            str = null;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            TTVideoEngineLog.m110646e("DataLoaderHelper", "key invalid.");
            return;
        }
        String videoRefStr = preloaderVideoModelItem.mVideoModel.getVideoRefStr(2);
        if (TextUtils.isEmpty(videoRefStr)) {
            TTVideoEngineLog.m110646e("DataLoaderHelper", "videoId invalid.");
            return;
        }
        this.mLock.lock();
        try {
            _addTask(str2, videoRefStr, preloaderVideoModelItem.mPreloadSize, null, preloaderVideoModelItem, null);
        } finally {
            this.mLock.unlock();
        }
    }

    public void cancelTaskByVideoId(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.mInnerDataLoader == null || this.mState != 0) {
                TTVideoEngineLog.m110646e("DataLoaderHelper", "need start mdl first");
                return;
            }
            ArrayList arrayList = new ArrayList();
            this.mLock.lock();
            try {
                if (this.mPreloadTasks.count() > 0) {
                    ArrayList array = this.mPreloadTasks.toArray();
                    for (int i = 0; i < array.size(); i++) {
                        DataLoaderTaskItem dataLoaderTaskItem = (DataLoaderTaskItem) array.get(i);
                        if (!TextUtils.isEmpty(dataLoaderTaskItem.mVideoId) && str.equals(dataLoaderTaskItem.mVideoId)) {
                            arrayList.add(dataLoaderTaskItem.mKey);
                        }
                    }
                }
                if (this.mExecuteTasks.count() > 0) {
                    ArrayList array2 = this.mExecuteTasks.toArray();
                    for (int i2 = 0; i2 < array2.size(); i2++) {
                        DataLoaderTaskItem dataLoaderTaskItem2 = (DataLoaderTaskItem) array2.get(i2);
                        if (!TextUtils.isEmpty(dataLoaderTaskItem2.mVideoId) && str.equals(dataLoaderTaskItem2.mVideoId)) {
                            arrayList.add(dataLoaderTaskItem2.mKey);
                        }
                    }
                }
                if (this.mAllPreloadTasks.count() > 0) {
                    ArrayList array3 = this.mAllPreloadTasks.toArray();
                    for (int i3 = 0; i3 < array3.size(); i3++) {
                        DataLoaderTaskItem dataLoaderTaskItem3 = (DataLoaderTaskItem) array3.get(i3);
                        if (!TextUtils.isEmpty(dataLoaderTaskItem3.mVideoId) && str.equals(dataLoaderTaskItem3.mVideoId)) {
                            arrayList.add(dataLoaderTaskItem3.mKey);
                        }
                    }
                }
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
            this.mLock.unlock();
            if (arrayList.size() > 0) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    cancelTask((String) arrayList.get(i4));
                }
            }
        }
    }

    public void _exectTask(DataLoaderTaskItem dataLoaderTaskItem) {
        DataLoaderTaskItem dataLoaderTaskItem2 = dataLoaderTaskItem;
        if (dataLoaderTaskItem2 == null) {
            _startExecuteTask();
        } else if (this.mInnerDataLoader == null) {
            TTVideoEngineLog.m110646e("DataLoaderHelper", "need load mdl first.");
        } else {
            Map<Integer, String> map = null;
            if (!(dataLoaderTaskItem2.mVidItem == null || dataLoaderTaskItem2.mVidItem.mParams == null)) {
                map = dataLoaderTaskItem2.mVidItem.mParams;
            }
            if (!(dataLoaderTaskItem2.mVideoModelItem == null || dataLoaderTaskItem2.mVideoModelItem.mParams == null)) {
                map = dataLoaderTaskItem2.mVideoModelItem.mParams;
            }
            this.mExecuteTasks.popItem(dataLoaderTaskItem2.mKey);
            if (dataLoaderTaskItem2.mResponseData != null) {
                ArrayList arrayList = new ArrayList();
                if (!dataLoaderTaskItem2.mResponseData.isDashSource()) {
                    VideoInfo videoInfo = dataLoaderTaskItem2.mResponseData.getVideoInfo(dataLoaderTaskItem2.mResolution, map, true);
                    if (videoInfo != null) {
                        arrayList.add(videoInfo);
                        _preloadUrlInfo(videoInfo, dataLoaderTaskItem2);
                    }
                } else if (dataLoaderTaskItem2.mResponseData.getDynamicType().equals("segment_base")) {
                    VideoInfo videoInfo2 = dataLoaderTaskItem2.mResponseData.getVideoInfo(dataLoaderTaskItem2.mResolution, VideoRef.TYPE_VIDEO, map, true);
                    VideoInfo videoInfo3 = dataLoaderTaskItem2.mResponseData.getVideoInfo(dataLoaderTaskItem2.mResolution, VideoRef.TYPE_AUDIO, map, true);
                    long j = dataLoaderTaskItem2.mPreloadSize;
                    long j2 = dataLoaderTaskItem2.mPreloadSize;
                    if (!(videoInfo2 == null || videoInfo3 == null)) {
                        int valueInt = videoInfo2.getValueInt(3);
                        int valueInt2 = videoInfo3.getValueInt(3);
                        if (valueInt > 0 && valueInt2 > 0) {
                            float f = (float) (valueInt + valueInt2);
                            j = (long) (((float) dataLoaderTaskItem2.mPreloadSize) * (((float) valueInt) / f));
                            j2 = (long) (((float) dataLoaderTaskItem2.mPreloadSize) * (((float) valueInt2) / f));
                        }
                    }
                    if (videoInfo2 != null) {
                        arrayList.add(videoInfo2);
                        dataLoaderTaskItem2.mPreloadSize = j;
                        _preloadUrlInfo(videoInfo2, dataLoaderTaskItem2);
                    }
                    if (videoInfo3 != null) {
                        arrayList.add(videoInfo3);
                        dataLoaderTaskItem2.mPreloadSize = j2;
                        _preloadUrlInfo(videoInfo3, dataLoaderTaskItem2);
                    }
                }
                if (arrayList.size() == 0) {
                    TTVideoEngineLog.m110647i("DataLoaderHelper", "invalid videoModel");
                    _startExecuteTask();
                    return;
                }
                if (!(dataLoaderTaskItem2.mVidItem == null || dataLoaderTaskItem2.mVidItem.mListener == null)) {
                    dataLoaderTaskItem2.mVidItem.mListener.onUsingUrlInfos(arrayList);
                }
                if (dataLoaderTaskItem.getCallBackListener() != null) {
                    PreLoaderItemCallBackInfo preLoaderItemCallBackInfo = new PreLoaderItemCallBackInfo(1);
                    preLoaderItemCallBackInfo.usingUrlInfos = arrayList;
                    dataLoaderTaskItem.getCallBackListener().preloadItemInfo(preLoaderItemCallBackInfo);
                }
            } else if (dataLoaderTaskItem2.mURLItem != null && dataLoaderTaskItem2.mURLItem.getUrls() != null && dataLoaderTaskItem2.mURLItem.getUrls().length > 0) {
                String _headerString = _headerString(dataLoaderTaskItem2.mURLItem.customHeaders());
                String str = dataLoaderTaskItem2.mKey;
                String[] urls = dataLoaderTaskItem2.mURLItem.getUrls();
                dataLoaderTaskItem2.mProxyUrl = preloadProxyQuery(str, dataLoaderTaskItem2.mVideoId, 0, urls, dataLoaderTaskItem2.mURLItem.getFilePath(), null, dataLoaderTaskItem2.mURLItem.getPriorityLevel(), _headerString);
                if (!TextUtils.isEmpty(dataLoaderTaskItem2.mProxyUrl)) {
                    this.mInnerDataLoader.preloadResource(dataLoaderTaskItem2.mProxyUrl, (int) dataLoaderTaskItem2.mPreloadSize);
                    this.mAllPreloadTasks.popItem(str);
                    this.mAllPreloadTasks.enqueueItem(dataLoaderTaskItem2);
                    TTVideoEngineLog.m110647i("DataLoaderHelper", C2240a.m6772a("exect preload task ,key is %s; videoId = %s", new Object[]{dataLoaderTaskItem2.mKey, dataLoaderTaskItem2.mVideoId}));
                }
            } else if (!(dataLoaderTaskItem2.mURLItem == null || dataLoaderTaskItem2.mURLItem.getProvider() == null)) {
                String str2 = dataLoaderTaskItem2.mKey;
                dataLoaderTaskItem2.mProxyUrl = proxyQuery(str2, dataLoaderTaskItem2.mVideoId, 1);
                if (!TextUtils.isEmpty(dataLoaderTaskItem2.mProxyUrl)) {
                    this.mInnerDataLoader.preloadResource(dataLoaderTaskItem2.mProxyUrl, (int) dataLoaderTaskItem2.mPreloadSize);
                    this.mAllPreloadTasks.popItem(str2);
                    this.mAllPreloadTasks.enqueueItem(dataLoaderTaskItem2);
                }
                TTVideoEngineLog.m110647i("DataLoaderHelper", C2240a.m6772a("exect preload task by provider mode, key is %s; videoId = %s proxyurl:%s", new Object[]{dataLoaderTaskItem2.mKey, dataLoaderTaskItem2.mVideoId, dataLoaderTaskItem2.mProxyUrl}));
            }
            _startExecuteTask();
        }
    }

    public void onNotify(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        if (aVMDLDataLoaderNotifyInfo != null) {
            int i = aVMDLDataLoaderNotifyInfo.what;
            if (i != 14) {
                if (i != 700) {
                    switch (i) {
                        case 0:
                            if (this.mListener != null) {
                                this.mListener.onLogInfo(0, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                return;
                            }
                            break;
                        case 1:
                            if (this.mListener != null) {
                                this.mListener.onLogInfo(1, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                return;
                            }
                            break;
                        case 2:
                            if (this.mListener != null) {
                                this.mListener.onNotify(2, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                            }
                            reportSpeed(aVMDLDataLoaderNotifyInfo);
                            return;
                        case 3:
                            StringBuilder sb = new StringBuilder("KeyIsFileCacheProgress log = ");
                            sb.append(aVMDLDataLoaderNotifyInfo.logInfo);
                            sb.append(" code = ");
                            sb.append((int) aVMDLDataLoaderNotifyInfo.code);
                            TTVideoEngineLog.m110644d("DataLoaderHelper", sb.toString());
                            DataLoaderTaskProgressInfo _progressInfoString = _progressInfoString(aVMDLDataLoaderNotifyInfo.logInfo, false);
                            if (!(this.mListener == null || _progressInfoString == null)) {
                                this.mListener.onTaskProgress(_progressInfoString);
                            }
                            return;
                        case 4:
                            StringBuilder sb2 = new StringBuilder("KeyIsPreloadEnd log = ");
                            sb2.append(aVMDLDataLoaderNotifyInfo.logInfo);
                            sb2.append(" code = ");
                            sb2.append((int) aVMDLDataLoaderNotifyInfo.code);
                            TTVideoEngineLog.m110647i("DataLoaderHelper", sb2.toString());
                            DataLoaderTaskProgressInfo _progressInfoString2 = _progressInfoString(aVMDLDataLoaderNotifyInfo.logInfo, true);
                            if (!(this.mListener == null || _progressInfoString2 == null)) {
                                this.mListener.onTaskProgress(_progressInfoString2);
                            }
                            return;
                        case 5:
                            if (this.mListener != null) {
                                this.mListener.onNotify(20, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo);
                                return;
                            }
                            break;
                        case 6:
                            try {
                                JSONObject process = DataLoaderCDNLog.process(aVMDLDataLoaderNotifyInfo.jsonLog);
                                if (process != null) {
                                    this.mListener.onNotifyCDNLog(process);
                                    TTVideoEngineLog.m110644d("avmdlcdnlog", C2240a.m6772a("receive log %s json:%s", new Object[]{process, aVMDLDataLoaderNotifyInfo.jsonLog.toString()}));
                                }
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        case 7:
                            if (this.mListener != null) {
                                this.mListener.onLogInfo(3, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                            }
                            StringBuilder sb3 = new StringBuilder("heart beat msg: ");
                            sb3.append(aVMDLDataLoaderNotifyInfo.logInfo);
                            TTVideoEngineLog.m110644d("DataLoaderHelper", sb3.toString());
                            return;
                        case 8:
                            if (aVMDLDataLoaderNotifyInfo.logInfo != null) {
                                StringBuilder sb4 = new StringBuilder("log = ");
                                sb4.append(aVMDLDataLoaderNotifyInfo.logInfo);
                                sb4.append("code = ");
                                sb4.append(aVMDLDataLoaderNotifyInfo.code);
                                sb4.append("logtype = ");
                                sb4.append(aVMDLDataLoaderNotifyInfo.parameter);
                                TTVideoEngineLog.m110647i("DataLoaderHelper", sb4.toString());
                                String[] split = aVMDLDataLoaderNotifyInfo.logInfo.split(",");
                                if (split.length > 0) {
                                    String str = split[0];
                                    DataLoaderTaskItem itemForKey = this.mAllPreloadTasks.itemForKey(str);
                                    if (itemForKey != null && aVMDLDataLoaderNotifyInfo.code == -1002) {
                                        this.mAllPreloadTasks.popItem(str);
                                        if (this.mListener != null) {
                                            DataLoaderTaskProgressInfo dataLoaderTaskProgressInfo = new DataLoaderTaskProgressInfo();
                                            dataLoaderTaskProgressInfo.mTaskType = 2;
                                            dataLoaderTaskProgressInfo.mKey = itemForKey.mKey;
                                            if (!(itemForKey.mURLItem == null || itemForKey.mURLItem.getFilePath() == null)) {
                                                dataLoaderTaskProgressInfo.mLocalFilePath = itemForKey.mURLItem.getFilePath();
                                                dataLoaderTaskProgressInfo.mKey = null;
                                            }
                                            dataLoaderTaskProgressInfo.mVideoId = itemForKey.mVideoId;
                                            this.mListener.onTaskProgress(dataLoaderTaskProgressInfo);
                                            break;
                                        }
                                    }
                                } else {
                                    return;
                                }
                            }
                            break;
                        default:
                            switch (i) {
                                case 10:
                                    if (this.mListener != null) {
                                        this.mListener.onLogInfo(4, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                        StringBuilder sb5 = new StringBuilder("live loader log msg: ");
                                        sb5.append(aVMDLDataLoaderNotifyInfo.logInfo);
                                        TTVideoEngineLog.m110644d("DataLoaderHelper", sb5.toString());
                                        return;
                                    }
                                    break;
                                case 11:
                                    if (this.mListener != null) {
                                        this.mListener.onLogInfo(5, aVMDLDataLoaderNotifyInfo.logType, aVMDLDataLoaderNotifyInfo.jsonLog);
                                        StringBuilder sb6 = new StringBuilder("live loader log sample msg: ");
                                        sb6.append(aVMDLDataLoaderNotifyInfo.logInfo);
                                        TTVideoEngineLog.m110644d("DataLoaderHelper", sb6.toString());
                                        return;
                                    }
                                    break;
                            }
                    }
                } else if (this.mTestSpeedListener != null) {
                    this.mTestSpeedListener.onNotify(2, aVMDLDataLoaderNotifyInfo.code, aVMDLDataLoaderNotifyInfo.parameter, aVMDLDataLoaderNotifyInfo.logInfo, aVMDLDataLoaderNotifyInfo.logType);
                    return;
                }
                return;
            }
            StringBuilder sb7 = new StringBuilder("alog info, logType: ");
            sb7.append(aVMDLDataLoaderNotifyInfo.logType);
            sb7.append("logInfo: ");
            sb7.append(aVMDLDataLoaderNotifyInfo.logInfo);
            TTVideoEngineLog.m110647i("DataLoaderHelper", sb7.toString());
        }
    }

    private String[] _addP2pFlag(DataLoaderTaskItem dataLoaderTaskItem, String[] strArr) {
        boolean z;
        if (dataLoaderTaskItem.mVidItem != null) {
            z = dataLoaderTaskItem.mVidItem.mForbidP2p;
        } else if (dataLoaderTaskItem.mVideoModelItem != null) {
            z = dataLoaderTaskItem.mVideoModelItem.mForbidP2p;
        } else {
            z = false;
        }
        if (!z) {
            return strArr;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (!TextUtils.isEmpty(strArr[i])) {
                strArr[i] = TTHelper.appendQueryString(strArr[i], "p2p=0");
            }
        }
        return strArr;
    }

    public void setStringValue(int i, String str) {
        this.mLock.lock();
        if (i == 0) {
            this.mConfigure.mCacheDir = str;
        } else if (i != 102) {
            switch (i) {
                case 1106:
                    this.mConfigure.mVdpABTestId = str;
                    break;
                case 1107:
                    try {
                        this.mConfigure.mVdpGroupId = str;
                        break;
                    } catch (Exception e) {
                        TTVideoEngineLog.m110645d(e);
                        break;
                    } catch (Throwable th) {
                        this.mLock.unlock();
                        throw th;
                    }
            }
        } else {
            this.mConfigure.mNetCacheDir = str;
        }
        this.mLock.unlock();
    }

    public void _addEngine(TTVideoEngine tTVideoEngine, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.mEngineLock.lock();
                ArrayList arrayList = (ArrayList) this.mAllUsingEngies.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.mAllUsingEngies.put(str, arrayList);
                }
                if (!arrayList.contains(tTVideoEngine)) {
                    arrayList.add(tTVideoEngine);
                    StringBuilder sb = new StringBuilder("add engine ref,rawKey = ");
                    sb.append(str);
                    sb.append(" engine ref count: ");
                    sb.append(arrayList.size());
                    TTVideoEngineLog.m110647i("DataLoaderHelper", sb.toString());
                }
            } finally {
                this.mEngineLock.unlock();
            }
        }
    }

    public void _removeEngine(TTVideoEngine tTVideoEngine, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.mEngineLock.lock();
                ArrayList arrayList = (ArrayList) this.mAllUsingEngies.get(str);
                if (arrayList != null) {
                    arrayList.remove(tTVideoEngine);
                    StringBuilder sb = new StringBuilder("remove engine ref,rawKey = ");
                    sb.append(str);
                    sb.append(" engine ref count: ");
                    sb.append(arrayList.size());
                    TTVideoEngineLog.m110647i("DataLoaderHelper", sb.toString());
                    if (arrayList.size() == 0) {
                        this.mAllUsingEngies.remove(str);
                    }
                }
            } finally {
                this.mEngineLock.unlock();
            }
        }
    }

    public void setLongValue(int i, long j) {
        this.mLock.lock();
        if (this.mInnerDataLoader == null) {
            this.mLock.unlock();
            return;
        }
        int i2 = -1;
        if (i != 62) {
            switch (i) {
                case 22:
                    i2 = 7210;
                    break;
                case 23:
                    i2 = 7211;
                    break;
                case 24:
                    i2 = 7212;
                    break;
                case 25:
                    i2 = 7213;
                    break;
                case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                    i2 = 7214;
                    break;
                case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                    i2 = 7215;
                    break;
            }
        } else {
            i2 = 1100;
        }
        try {
            this.mInnerDataLoader.setLongValue(i2, j);
        } catch (Exception unused) {
            String str = "DataLoaderHelper";
            StringBuilder sb = new StringBuilder("setLongValue failed, key: ");
            sb.append(i);
            sb.append(", value: ");
            sb.append(j);
            TTVideoEngineLog.m110646e(str, sb.toString());
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
        this.mLock.unlock();
    }

    private DataLoaderTaskProgressInfo _progressInfoString(String str, boolean z) {
        DataLoaderTaskItem dataLoaderTaskItem;
        DataLoaderTaskQueue dataLoaderTaskQueue;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        if (split.length < 4) {
            return null;
        }
        try {
            long longValue = Long.valueOf(split[0]).longValue();
            long longValue2 = Long.valueOf(split[1]).longValue();
            if (longValue2 <= 0 && !z) {
                return null;
            }
            String str2 = split[2];
            String str3 = split[3];
            DataLoaderTaskProgressInfo dataLoaderTaskProgressInfo = new DataLoaderTaskProgressInfo();
            dataLoaderTaskProgressInfo.mCacheSizeFromZero = longValue;
            dataLoaderTaskProgressInfo.mMediaSize = longValue2;
            dataLoaderTaskProgressInfo.mKey = str2;
            dataLoaderTaskProgressInfo.mLocalFilePath = str3;
            if (z) {
                dataLoaderTaskItem = this.mAllPreloadTasks.itemForKey(str2);
                if (dataLoaderTaskItem == null) {
                    return null;
                }
                dataLoaderTaskQueue = this.mAllPreloadTasks;
                dataLoaderTaskProgressInfo.mTaskType = 2;
            } else {
                dataLoaderTaskItem = this.mAllPlayTasks.itemForKey(str2);
                if (dataLoaderTaskItem == null) {
                    return null;
                }
                DataLoaderTaskQueue dataLoaderTaskQueue2 = this.mAllPlayTasks;
                dataLoaderTaskProgressInfo.mTaskType = 1;
                dataLoaderTaskQueue = dataLoaderTaskQueue2;
            }
            if (dataLoaderTaskItem == null) {
                return null;
            }
            dataLoaderTaskProgressInfo.mVideoId = dataLoaderTaskItem.mVideoId;
            dataLoaderTaskProgressInfo.mResolution = dataLoaderTaskItem.mResolution;
            dataLoaderTaskProgressInfo.mDecryptionKey = dataLoaderTaskItem.mDecryptionKey;
            dataLoaderTaskProgressInfo.mUsingVideoInfo = dataLoaderTaskItem.mVideoInfo;
            if (longValue2 == longValue) {
                dataLoaderTaskQueue.popItem(str2);
                if (!z) {
                    _cacheEndNotifyEngine(dataLoaderTaskItem);
                }
            }
            if (dataLoaderTaskQueue == this.mAllPreloadTasks && longValue >= dataLoaderTaskItem.mPreloadSize) {
                dataLoaderTaskQueue.popItem(str2);
            }
            if (dataLoaderTaskItem.getCallBackListener() != null && dataLoaderTaskQueue == this.mAllPreloadTasks) {
                PreLoaderItemCallBackInfo preLoaderItemCallBackInfo = new PreLoaderItemCallBackInfo(2);
                preLoaderItemCallBackInfo.preloadDataInfo = dataLoaderTaskProgressInfo;
                dataLoaderTaskItem.getCallBackListener().preloadItemInfo(preLoaderItemCallBackInfo);
            }
            return dataLoaderTaskProgressInfo;
        } catch (Exception e) {
            TTVideoEngineLog.m110645d(e);
            return null;
        }
    }

    public void updateDnsInfo(JSONObject jSONObject, long j) {
        String str;
        String str2;
        if (jSONObject == null) {
            TTVideoEngineLog.m110646e("DataLoaderHelper", "ip direct info invalid");
        } else if (NetUtils.netUpdateTimeMs == -1 || 1000 * j >= NetUtils.netUpdateTimeMs) {
            this.mLock.lock();
            try {
                Iterator keys = jSONObject.keys();
                String str3 = "";
                do {
                    str2 = (String) keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(str2);
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(optJSONArray.optString(i));
                        str = sb.toString();
                        if (i < optJSONArray.length() - 1) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(",");
                            str = sb2.toString();
                        }
                    }
                    AVMDLDNSParser.updateDNSInfo(str2, str, j);
                    str3 = "";
                    if (!keys.hasNext()) {
                        break;
                    }
                } while (!TextUtils.isEmpty(str2));
            } catch (Exception e) {
                TTVideoEngineLog.m110646e("DataLoaderHelper", e.toString());
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
            this.mLock.unlock();
        } else {
            TTVideoEngineLog.m110646e("DataLoaderHelper", "network did change, dnsinfo is invalid");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void _preloadUrlInfo(com.p683ss.ttvideoengine.model.VideoInfo r13, com.p683ss.ttvideoengine.DataLoaderHelper.DataLoaderTaskItem r14) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x016a
            if (r14 != 0) goto L_0x0006
            goto L_0x016a
        L_0x0006:
            com.ss.ttvideoengine.PreloaderVidItem r0 = r14.mVidItem
            r1 = 0
            if (r0 == 0) goto L_0x0013
            com.ss.ttvideoengine.PreloaderVidItem r0 = r14.mVidItem
            int r0 = r0.getPriorityLevel()
        L_0x0011:
            r10 = r0
            goto L_0x001f
        L_0x0013:
            com.ss.ttvideoengine.PreloaderVideoModelItem r0 = r14.mVideoModelItem
            if (r0 == 0) goto L_0x001e
            com.ss.ttvideoengine.PreloaderVideoModelItem r0 = r14.mVideoModelItem
            int r0 = r0.getPriorityLevel()
            goto L_0x0011
        L_0x001e:
            r10 = 0
        L_0x001f:
            r0 = 16
            java.lang.String[] r0 = r13.getValueStrArr(r0)
            r2 = 15
            java.lang.String r2 = r13.getValueStr(r2)
            if (r0 == 0) goto L_0x0162
            int r3 = r0.length
            if (r3 > 0) goto L_0x0032
            goto L_0x0162
        L_0x0032:
            java.lang.String[] r7 = r12._addP2pFlag(r14, r0)
            com.ss.ttvideoengine.PreloaderVidItem r0 = r14.mVidItem
            r3 = 0
            if (r0 == 0) goto L_0x0071
            com.ss.ttvideoengine.PreloaderVidItem r0 = r14.mVidItem
            com.ss.ttvideoengine.PreloaderFilePathListener r0 = r0.getFilePathListener()
            if (r0 == 0) goto L_0x0071
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0071
            com.ss.ttvideoengine.PreloaderVidItem r0 = r14.mVidItem
            com.ss.ttvideoengine.PreloaderFilePathListener r0 = r0.getFilePathListener()
            java.lang.String r4 = r14.mVideoId
            java.lang.String r0 = r0.cacheFilePath(r4, r13)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x0061
            boolean r4 = r0.contains(r2)
            if (r4 != 0) goto L_0x0062
        L_0x0061:
            r0 = r3
        L_0x0062:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x006e
            android.content.Context r2 = r12.mContext
            java.lang.String r2 = com.p683ss.ttvideoengine.utils.TTHelper.keyFromFilePath(r2, r0)
        L_0x006e:
            r8 = r0
            r0 = r2
            goto L_0x00ab
        L_0x0071:
            com.ss.ttvideoengine.PreloaderVideoModelItem r0 = r14.mVideoModelItem
            if (r0 == 0) goto L_0x00a9
            com.ss.ttvideoengine.PreloaderVideoModelItem r0 = r14.mVideoModelItem
            com.ss.ttvideoengine.PreloaderFilePathListener r0 = r0.getFilePathListener()
            if (r0 == 0) goto L_0x00a9
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00a9
            com.ss.ttvideoengine.PreloaderVideoModelItem r0 = r14.mVideoModelItem
            com.ss.ttvideoengine.PreloaderFilePathListener r0 = r0.getFilePathListener()
            java.lang.String r4 = r14.mVideoId
            java.lang.String r0 = r0.cacheFilePath(r4, r13)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x009b
            boolean r4 = r0.contains(r2)
            if (r4 != 0) goto L_0x009c
        L_0x009b:
            r0 = r3
        L_0x009c:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x006e
            android.content.Context r2 = r12.mContext
            java.lang.String r2 = com.p683ss.ttvideoengine.utils.TTHelper.keyFromFilePath(r2, r0)
            goto L_0x006e
        L_0x00a9:
            r0 = r2
            r8 = r3
        L_0x00ab:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r3 = 28
            java.lang.String r3 = r13.getValueStr(r3)
            if (r3 != 0) goto L_0x00ba
            java.lang.String r3 = ""
        L_0x00ba:
            r4 = 29
            java.lang.String r4 = r13.getValueStr(r4)
            if (r4 != 0) goto L_0x00c4
            java.lang.String r4 = ""
        L_0x00c4:
            r5 = 3
            int r5 = r13.getValueInt(r5)
            java.lang.String r6 = "fileId="
            r2.append(r6)
            r2.append(r3)
            java.lang.String r3 = "&bitrate="
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = "&pcrc="
            r2.append(r3)
            java.lang.String r3 = com.p683ss.ttvideoengine.utils.TTHelper.encodeUrl(r4)
            r2.append(r3)
            java.lang.String r4 = r14.mVideoId
            r5 = 0
            java.lang.String r9 = r2.toString()
            r11 = 0
            r2 = r12
            r3 = r0
            java.lang.String r2 = r2.preloadProxyQuery(r3, r4, r5, r7, r8, r9, r10, r11)
            r14.mProxyUrl = r2
            java.lang.String r2 = r14.mProxyUrl
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0161
            com.ss.mediakit.medialoader.AVMDLDataLoader r2 = r12.mInnerDataLoader
            java.lang.String r3 = r14.mProxyUrl
            long r4 = r14.mPreloadSize
            int r4 = (int) r4
            r2.preloadResource(r3, r4)
            r14.mVideoInfo = r13
            r2 = 5
            java.lang.String r2 = r13.getValueStr(r2)
            r14.mDecryptionKey = r2
            r14.mKey = r0
            com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskItem r2 = new com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskItem
            r2.<init>()
            r2.mKey = r0
            java.lang.String r3 = r14.mVideoId
            r2.mVideoId = r3
            long r3 = r14.mPreloadSize
            r2.mPreloadSize = r3
            com.ss.ttvideoengine.Resolution r13 = r13.getResolution()
            r2.mResolution = r13
            java.lang.String r13 = r14.mDecryptionKey
            r2.mDecryptionKey = r13
            com.ss.ttvideoengine.model.VideoInfo r13 = r14.mVideoInfo
            r2.mVideoInfo = r13
            com.ss.ttvideoengine.PreloaderVidItem r13 = r14.mVidItem
            r2.mVidItem = r13
            com.ss.ttvideoengine.PreloaderVideoModelItem r13 = r14.mVideoModelItem
            r2.mVideoModelItem = r13
            boolean r13 = r14.mDidCanceled
            r2.mDidCanceled = r13
            int r13 = r14.mPriorityLevel
            r2.mPriorityLevel = r13
            com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskQueue r13 = r12.mAllPreloadTasks
            r13.popItem(r0)
            com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskQueue r13 = r12.mAllPreloadTasks
            r13.enqueueItem(r2)
            java.lang.String r13 = "DataLoaderHelper"
            java.lang.String r0 = "exect preload task ,key is %s; videoId = %s"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r14.mKey
            r2[r1] = r3
            r1 = 1
            java.lang.String r14 = r14.mVideoId
            r2[r1] = r14
            java.lang.String r14 = com.C2240a.m6772a(r0, r2)
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110647i(r13, r14)
        L_0x0161:
            return
        L_0x0162:
            java.lang.String r13 = "DataLoaderHelper"
            java.lang.String r14 = "urls info invalid"
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110646e(r13, r14)
            return
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.DataLoaderHelper._preloadUrlInfo(com.ss.ttvideoengine.model.VideoInfo, com.ss.ttvideoengine.DataLoaderHelper$DataLoaderTaskItem):void");
    }

    public void addTask(String str, PreloaderVidItem preloaderVidItem) {
        if (this.mState == 0) {
            if (preloaderVidItem == null || TextUtils.isEmpty(preloaderVidItem.mVideoId)) {
                TTVideoEngineLog.m110646e("DataLoaderHelper", "videoId invalid.");
                return;
            }
            TTVideoEngineLog.m110647i("DataLoaderHelper", C2240a.m6772a("addTask key is %s; videoId = %s", new Object[]{str, preloaderVidItem.mVideoId}));
            this.mLock.lock();
            try {
                _addTask(str, preloaderVidItem.mVideoId, preloaderVidItem.mPreloadSize, preloaderVidItem, null, null);
            } finally {
                this.mLock.unlock();
            }
        }
    }

    public void setIntValue(int i, int i2) {
        this.mLock.lock();
        switch (i) {
            case 1:
                this.mConfigure.mMaxCacheSize = i2;
                break;
            case 2:
                this.mConfigure.mRWTimeOut = i2;
                break;
            case 3:
                this.mConfigure.mOpenTimeOut = i2;
                break;
            case 4:
                this.mConfigure.mTryCount = i2;
                break;
            case 5:
                this.mConfigure.mLoaderType = i2;
                break;
            default:
                switch (i) {
                    case 7:
                        this.mConfigure.mEnableExternDNS = i2;
                        break;
                    case 8:
                        this.mConfigure.mEnableSocketReuse = i2;
                        break;
                    case 9:
                        this.mConfigure.mSocketIdleTimeOut = i2;
                        break;
                    default:
                        switch (i) {
                            case 11:
                                this.mConfigure.mPreloadParallelNum = i2;
                                break;
                            case 12:
                                this.mConfigure.mPreloadStrategy = i2;
                                break;
                            case 13:
                                this.mConfigure.mCheckSumLevel = i2;
                                break;
                            case 14:
                                this.mConfigure.mTestSpeedTypeVersion = i2;
                                break;
                            case 15:
                                this.mNeedDLLoadP2PLib = i2;
                                break;
                            case 16:
                                this.mConfigure.mLoaderFactoryP2PLevel = i2;
                                break;
                            default:
                                switch (i) {
                                    case 60:
                                        this.mConfigure.mEnablePreloadReUse = i2;
                                        break;
                                    case BaseNotice.TCM /*61*/:
                                        this.mHeartBeatInterval = i2;
                                        break;
                                    default:
                                        switch (i) {
                                            case 63:
                                                this.mConfigure.mMaxIpCountEachDomain = i2;
                                                break;
                                            case UnReadVideoExperiment.RELATION_LIST /*64*/:
                                                this.mConfigure.mEnableIpBucket = i2;
                                                break;
                                            case 65:
                                                this.mConfigure.mErrorStateTrustTime = i2;
                                                break;
                                            case 66:
                                                this.mConfigure.mOnlyUseCdn = i2;
                                                break;
                                            default:
                                                boolean z = false;
                                                switch (i) {
                                                    case 90:
                                                        this.mConfigure.mDNSMainType = i2;
                                                        AVMDLDNSParser.setIntValue(0, i2);
                                                        break;
                                                    case 91:
                                                        this.mConfigure.mDNSBackType = i2;
                                                        AVMDLDNSParser.setIntValue(1, i2);
                                                        break;
                                                    case 92:
                                                        this.mConfigure.mMainToBackUpDelayedTime = i2;
                                                        AVMDLDNSParser.setIntValue(3, i2);
                                                        break;
                                                    case 93:
                                                        this.mConfigure.mEnableBenchMarkIOSpeed = i2;
                                                        break;
                                                    case 94:
                                                        this.mConfigure.mSpeedCoefficientValue = i2;
                                                        break;
                                                    case 95:
                                                        P2PStragetyManager.getInstance().enableP2PStragetyConntrol = i2;
                                                        break;
                                                    case 96:
                                                        P2PStragetyManager.getInstance().minPlayNum = i2;
                                                        break;
                                                    case 97:
                                                        P2PStragetyManager.getInstance().maxLeaveWaitTme = i2;
                                                        break;
                                                    case 98:
                                                        P2PStragetyManager.getInstance().maxBufferingTime = i2;
                                                        break;
                                                    case 99:
                                                        P2PStragetyManager.getInstance().expiredT = i2;
                                                        break;
                                                    case 100:
                                                        this.mConfigure.mMaxTlsVersion = i2;
                                                        break;
                                                    case BaseNotice.HASHTAG /*101*/:
                                                        this.mConfigure.mEnableSessionReuse = i2;
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 500:
                                                                this.mConfigure.mLiveP2pAllow = i2;
                                                                break;
                                                            case 501:
                                                                this.mConfigure.mLiveLoaderType = i2;
                                                                break;
                                                            case 502:
                                                                this.mConfigure.mLiveLoaderEnable = i2;
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 505:
                                                                        this.mConfigure.mLiveWatchDurationThreshold = i2;
                                                                        break;
                                                                    case 506:
                                                                        this.mConfigure.mLiveCacheThresholdHttpToP2p = i2;
                                                                        break;
                                                                    case 507:
                                                                        this.mConfigure.mLiveCacheThresholdP2pToHttp = i2;
                                                                        break;
                                                                    case 508:
                                                                        this.mConfigure.mLiveMaxTrySwitchP2pTimes = i2;
                                                                        break;
                                                                    case 509:
                                                                        this.mConfigure.mLiveWaitP2pReadyThreshold = i2;
                                                                        break;
                                                                    case 510:
                                                                        this.mConfigure.mLiveMobileUploadAllow = i2;
                                                                        break;
                                                                    case 511:
                                                                        this.mConfigure.mLiveMobileDownloadAllow = i2;
                                                                        break;
                                                                    case UnReadVideoExperiment.LIKE_USER_LIST /*512*/:
                                                                        this.mConfigure.mAlogEnable = i2;
                                                                        if (this.mInnerDataLoader != null) {
                                                                            this.mInnerDataLoader.setIntValue(7225, i2);
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        switch (i) {
                                                                            case 1000:
                                                                                if (this.mEnableNetworkChangedListen == 1) {
                                                                                    clearNetinfoCache();
                                                                                    if (this.mInnerDataLoader != null) {
                                                                                        this.mInnerDataLoader.setIntValue(7217, 1);
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1001:
                                                                                this.mConfigure.mEnablePreconnect = i2;
                                                                                break;
                                                                            case BaseNotice.CHECK_PROFILE /*1002*/:
                                                                                this.mConfigure.mPreconnectNum = i2;
                                                                                break;
                                                                            case BaseNotice.COMMENT_REPLY_WITH_VIDEO /*1003*/:
                                                                                this.mEnableNetworkChangedListen = i2;
                                                                                break;
                                                                            case 1004:
                                                                                if (i2 != 0) {
                                                                                    z = true;
                                                                                }
                                                                                this.mInvalidMdlProcotol = z;
                                                                                StringBuilder sb = new StringBuilder("setIntValue: mInvalidMdlProcotol: ");
                                                                                sb.append(this.mInvalidMdlProcotol);
                                                                                TTVideoEngineLog.m110647i("DataLoaderHelper", sb.toString());
                                                                                break;
                                                                            case 1005:
                                                                                if (i2 == 1) {
                                                                                    z = true;
                                                                                }
                                                                                this.mEnableMdlProtocol = z;
                                                                                StringBuilder sb2 = new StringBuilder("config DATALOADER_KEY_SET_MDL_PROTOCOL_ENABLE: ");
                                                                                sb2.append(this.mEnableMdlProtocol);
                                                                                TTVideoEngineLog.m110647i("DataLoaderHelper", sb2.toString());
                                                                                break;
                                                                            case 1006:
                                                                                this.mConfigure.mRingBufferSizeKB = i2;
                                                                                break;
                                                                            case 1007:
                                                                                this.mConfigure.mEnableFileCacheV2 = i2;
                                                                                break;
                                                                            default:
                                                                                switch (i) {
                                                                                    case 1100:
                                                                                        this.mEnableReportSpeed = i2;
                                                                                        break;
                                                                                    case 1101:
                                                                                        this.mConfigure.mEnableLoaderPreempt = i2;
                                                                                        break;
                                                                                    case 1102:
                                                                                        this.mConfigure.mAccessCheckLevel = i2;
                                                                                        break;
                                                                                    case 1103:
                                                                                        this.mConfigure.mNextDownloadThreshold = i2;
                                                                                        break;
                                                                                    case 1104:
                                                                                        if (this.mInnerDataLoader != null) {
                                                                                            this.mInnerDataLoader.setIntValue(7219, i2);
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case 1105:
                                                                                        this.mConfigure.mSocketSendBufferKB = i2;
                                                                                        break;
                                                                                    default:
                                                                                        switch (i) {
                                                                                            case 30:
                                                                                                this.mConfigure.mEncryptVersion = i2;
                                                                                                break;
                                                                                            case 50:
                                                                                                this.mConfigure.mIsCloseFileCache = i2;
                                                                                                break;
                                                                                            case 55:
                                                                                                this.mConfigure.mMaxCacheAge = i2;
                                                                                                break;
                                                                                            case 80:
                                                                                                try {
                                                                                                    this.mConfigure.mPreloadWaitListType = i2;
                                                                                                    break;
                                                                                                } catch (Exception unused) {
                                                                                                    break;
                                                                                                } catch (Throwable th) {
                                                                                                    this.mLock.unlock();
                                                                                                    throw th;
                                                                                                }
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
        this.mLock.unlock();
    }

    public void addTask(VideoModel videoModel, Resolution resolution, long j) {
        addTask(videoModel, resolution, null, j);
    }

    private String proxyQuery(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || i == 0) {
            return null;
        }
        String encodeUrl = TTHelper.encodeUrl(str);
        if (TextUtils.isEmpty(encodeUrl)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        String encodeUrl2 = TTHelper.encodeUrl(str2);
        if (!TextUtils.isEmpty(encodeUrl2)) {
            str = encodeUrl2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("?rk=");
        stringBuffer.append(str);
        stringBuffer.append("&k=");
        stringBuffer.append(encodeUrl);
        stringBuffer.append("&pv=");
        stringBuffer.append(1);
        return stringBuffer.toString();
    }

    public void setPlayInfo(int i, String str, long j) {
        if (this.mState != 0) {
            TTVideoEngineLog.m110644d("DataLoaderHelper", "dataloader not started, not allow set play info");
            return;
        }
        this.mLock.lock();
        int i2 = -1;
        switch (i) {
            case 22:
                i2 = 7210;
                break;
            case 23:
                i2 = 7211;
                break;
            case 24:
                i2 = 7212;
                break;
            case 25:
                i2 = 7213;
                break;
            case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                i2 = 7214;
                break;
            case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                i2 = 7215;
                break;
        }
        try {
            this.mInnerDataLoader.setInt64ValueByStrKey(i2, str, j);
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
        this.mLock.unlock();
    }

    public String getStringValue(int i, long j, String str) {
        DataLoaderTaskItem dataLoaderTaskItem;
        if (i != 1506) {
            return null;
        }
        if (this.mAllPreloadTasks != null) {
            dataLoaderTaskItem = this.mAllPreloadTasks.itemForKey(str);
        } else {
            dataLoaderTaskItem = null;
        }
        if (dataLoaderTaskItem == null || dataLoaderTaskItem.mURLItem == null || dataLoaderTaskItem.mURLItem.getProvider() == null) {
            return null;
        }
        String key = dataLoaderTaskItem.mURLItem.getProvider().getKey();
        String str2 = key;
        String proxyQuery = proxyQuery(str2, key, dataLoaderTaskItem.mURLItem.getProvider().getPreloadSize(), dataLoaderTaskItem.mURLItem.getProvider().getUrls(), null, null);
        TTVideoEngineLog.m110647i("DataLoaderHelper", C2240a.m6772a("get proxxy url from url: %s", new Object[]{proxyQuery}));
        return proxyQuery;
    }

    public void addTask(VideoModel videoModel, Resolution resolution, Map<Integer, String> map, long j) {
        PreloaderVideoModelItem preloaderVideoModelItem = new PreloaderVideoModelItem(videoModel, resolution, j, (PreloaderFilePathListener) null);
        preloaderVideoModelItem.mParams = map;
        addTask(preloaderVideoModelItem);
    }

    public void addTask(String str, String str2, long j, DataLoaderResourceProvider dataLoaderResourceProvider) {
        if (dataLoaderResourceProvider == null) {
            TTVideoEngineLog.m110646e("DataLoaderHelper", "provider invalid.");
            return;
        }
        PreloaderURLItem preloaderURLItem = new PreloaderURLItem(str, str2, j, dataLoaderResourceProvider);
        addTask(preloaderURLItem);
    }

    public void addTask(String str, String str2, long j, String str3) {
        if (TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m110646e("DataLoaderHelper", "url invalid.");
            return;
        }
        addTask(new String[]{str}, str2, j, str3);
    }

    public String getDataLoaderUrl(String str, String str2, String[] strArr, Resolution resolution, String str3) {
        return _proxyUrl(str, str2, 0, strArr, resolution, str3, null, null, null);
    }

    public String proxyUrl(String str, String str2, String[] strArr, Resolution resolution, String str3) {
        return _proxyUrl(str, str2, 0, strArr, resolution, str3, null, null, null);
    }

    private String proxyQuery(String str, String str2, long j, String[] strArr, String str3, String str4) {
        return preloadProxyQuery(str, str2, j, strArr, str3, str4, 0, null);
    }

    private void _addTask(String str, String str2, long j, PreloaderVidItem preloaderVidItem, PreloaderVideoModelItem preloaderVideoModelItem, PreloaderURLItem preloaderURLItem) {
        if (TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m110646e("DataLoaderHelper", "key invalid.");
        } else if (this.mInnerDataLoader == null || this.mState != 0) {
            TTVideoEngineLog.m110646e("DataLoaderHelper", "need load mdl first.");
        } else if (!this.mExecuteTasks.containItem(str) && !this.mPreloadTasks.containItem(str)) {
            Resolution resolution = Resolution.Undefine;
            if (preloaderVidItem != null && preloaderVidItem.mResolution != null) {
                resolution = preloaderVidItem.mResolution;
            } else if (!(preloaderVideoModelItem == null || preloaderVideoModelItem.mResolution == null)) {
                resolution = preloaderVideoModelItem.mResolution;
            }
            DataLoaderTaskItem dataLoaderTaskItem = new DataLoaderTaskItem();
            dataLoaderTaskItem.setUp(str, resolution, j);
            dataLoaderTaskItem.mVideoId = str2;
            dataLoaderTaskItem.mVidItem = preloaderVidItem;
            dataLoaderTaskItem.mVideoModelItem = preloaderVideoModelItem;
            dataLoaderTaskItem.mURLItem = preloaderURLItem;
            if (preloaderURLItem != null) {
                dataLoaderTaskItem.mPriorityLevel = preloaderURLItem.getPriorityLevel();
            }
            if (preloaderVideoModelItem != null) {
                dataLoaderTaskItem.mResponseData = preloaderVideoModelItem.mVideoModel;
                dataLoaderTaskItem.mPriorityLevel = preloaderVideoModelItem.getPriorityLevel();
            }
            if (dataLoaderTaskItem.mVidItem != null) {
                dataLoaderTaskItem.setListener(new MyTaskListener(this));
                dataLoaderTaskItem.mPriorityLevel = dataLoaderTaskItem.mVidItem.getPriorityLevel();
            }
            this.mPreloadTasks.enqueueItem(dataLoaderTaskItem);
            _startExecuteTask();
        }
    }

    private String preloadProxyQuery(String str, String str2, long j, String[] strArr, String str3, String str4, int i, String str5) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return null;
        }
        if (j <= 0) {
            j = 0;
        }
        for (String _supportProxy : strArr) {
            if (!_supportProxy(_supportProxy)) {
                return null;
            }
        }
        String[] _removeRepeatUrls = _removeRepeatUrls(strArr);
        String encodeUrl = TTHelper.encodeUrl(str);
        if (TextUtils.isEmpty(encodeUrl)) {
            return null;
        }
        String[] addMdlFlag = addMdlFlag(_removeRepeatUrls);
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        String encodeUrl2 = TTHelper.encodeUrl(str);
        if (TextUtils.isEmpty(encodeUrl2)) {
            encodeUrl2 = "videoId";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("?rk=");
        stringBuffer.append(encodeUrl2);
        stringBuffer.append("&k=");
        stringBuffer.append(encodeUrl);
        if (j > 0) {
            stringBuffer.append("&s=");
            stringBuffer.append(j);
        }
        if (i > 0) {
            stringBuffer.append("&l=");
            stringBuffer.append(i);
        }
        if (!TextUtils.isEmpty(str3)) {
            String encodeUrl3 = TTHelper.encodeUrl(str3);
            if (!TextUtils.isEmpty(encodeUrl3)) {
                stringBuffer.append("&p=");
                stringBuffer.append(encodeUrl3);
            }
        }
        if (!TextUtils.isEmpty(str5)) {
            String encodeUrl4 = TTHelper.encodeUrl(str5);
            if (!TextUtils.isEmpty(encodeUrl4)) {
                stringBuffer.append("&h=");
                stringBuffer.append(encodeUrl4);
            }
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        for (int i2 = 0; i2 < addMdlFlag.length; i2++) {
            String encodeUrl5 = TTHelper.encodeUrl(addMdlFlag[i2]);
            StringBuffer stringBuffer3 = new StringBuffer();
            if (!TextUtils.isEmpty(encodeUrl5)) {
                stringBuffer3.append("&u");
                stringBuffer3.append(i2);
                stringBuffer3.append("=");
                stringBuffer3.append(encodeUrl5);
            }
            if (stringBuffer.length() + stringBuffer2.length() + stringBuffer3.length() + 32 > 3096) {
                break;
            }
            stringBuffer2.append(stringBuffer3);
        }
        if (stringBuffer2.length() <= 0) {
            return null;
        }
        stringBuffer.append(stringBuffer2);
        if (!TextUtils.isEmpty(str4) && stringBuffer.length() + str4.length() + 33 <= 3096) {
            stringBuffer.append("&");
            stringBuffer.append(str4);
        }
        return stringBuffer.toString();
    }

    public String _proxyUrl(String str, String str2, long j, String[] strArr, Resolution resolution, String str3, VideoInfo videoInfo, String str4, String str5) {
        String str6 = str;
        String[] strArr2 = strArr;
        if (this.mState != 0 || TextUtils.isEmpty(str) || strArr2 == null || strArr2.length <= 0) {
            return null;
        }
        String[] addMdlFlag = addMdlFlag(strArr2);
        for (int i = 0; i < addMdlFlag.length; i++) {
            if (!_supportProxy(addMdlFlag[i])) {
                return addMdlFlag[i];
            }
        }
        if (this.mInnerDataLoader == null) {
            TTVideoEngineLog.m110646e("DataLoaderHelper", "start mdl first");
            return null;
        }
        this.mLock.lock();
        try {
            String localAddr = this.mInnerDataLoader.getLocalAddr();
            if (TextUtils.isEmpty(localAddr)) {
                return null;
            }
            String proxyQuery = proxyQuery(str, str2, j, addMdlFlag, str4, str5);
            if (TextUtils.isEmpty(proxyQuery)) {
                this.mLock.unlock();
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            StringBuilder sb = new StringBuilder("proxy url, mInvalidMdlProcotol: ");
            sb.append(this.mInvalidMdlProcotol);
            TTVideoEngineLog.m110647i("DataLoaderHelper", sb.toString());
            if (!this.mInvalidMdlProcotol) {
                if (this.mEnableMdlProtocol) {
                    stringBuffer.append("mdl://");
                    stringBuffer.append("id");
                    int i2 = this.mMdlDataSourceId;
                    this.mMdlDataSourceId = i2 + 1;
                    stringBuffer.append(i2);
                    stringBuffer.append("/");
                    stringBuffer.append(proxyQuery);
                    String stringBuffer2 = stringBuffer.toString();
                    StringBuilder sb2 = new StringBuilder("_proxyUrl: ");
                    sb2.append(stringBuffer2);
                    TTVideoEngineLog.m110647i("DataLoaderHelper", sb2.toString());
                    this.mLock.unlock();
                    this.mAllPlayTasks.popItem(str);
                    DataLoaderTaskItem dataLoaderTaskItem = new DataLoaderTaskItem();
                    dataLoaderTaskItem.mKey = str6;
                    dataLoaderTaskItem.mVideoId = str2;
                    dataLoaderTaskItem.mProxyUrl = stringBuffer2;
                    dataLoaderTaskItem.mResolution = resolution;
                    dataLoaderTaskItem.mDecryptionKey = str3;
                    dataLoaderTaskItem.mVideoInfo = videoInfo;
                    this.mAllPlayTasks.enqueueItem(dataLoaderTaskItem);
                    return stringBuffer2;
                }
            }
            stringBuffer.append("http://");
            stringBuffer.append(localAddr);
            stringBuffer.append(proxyQuery);
            String stringBuffer22 = stringBuffer.toString();
            StringBuilder sb22 = new StringBuilder("_proxyUrl: ");
            sb22.append(stringBuffer22);
            TTVideoEngineLog.m110647i("DataLoaderHelper", sb22.toString());
            this.mLock.unlock();
            this.mAllPlayTasks.popItem(str);
            DataLoaderTaskItem dataLoaderTaskItem2 = new DataLoaderTaskItem();
            dataLoaderTaskItem2.mKey = str6;
            dataLoaderTaskItem2.mVideoId = str2;
            dataLoaderTaskItem2.mProxyUrl = stringBuffer22;
            dataLoaderTaskItem2.mResolution = resolution;
            dataLoaderTaskItem2.mDecryptionKey = str3;
            dataLoaderTaskItem2.mVideoInfo = videoInfo;
            this.mAllPlayTasks.enqueueItem(dataLoaderTaskItem2);
            return stringBuffer22;
        } finally {
            this.mLock.unlock();
        }
    }
}
