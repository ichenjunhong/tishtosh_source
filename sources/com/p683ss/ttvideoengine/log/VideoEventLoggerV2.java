package com.p683ss.ttvideoengine.log;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.C2240a;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.ttm.player.PlaybackParams;
import com.p683ss.ttvideoengine.Resolution;
import com.p683ss.ttvideoengine.data.VideoLoadWrapper;
import com.p683ss.ttvideoengine.metrics.IMediaMetrics;
import com.p683ss.ttvideoengine.metrics.MetricsFactory;
import com.p683ss.ttvideoengine.model.VideoModel;
import com.p683ss.ttvideoengine.net.DNSServerIP;
import com.p683ss.ttvideoengine.utils.EngineThreadPool;
import com.p683ss.ttvideoengine.utils.Error;
import com.p683ss.ttvideoengine.utils.PerformanceUtils;
import com.p683ss.ttvideoengine.utils.TTHelper;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import com.p683ss.ttvideoengine.utils.TimeService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.log.VideoEventLoggerV2 */
public class VideoEventLoggerV2 implements IVideoEventLogger {
    private int mAccumVPS;
    private int mApiVer = -1;
    private int mAsyncCodecId = -1;
    private int mAsyncInit;
    private String mAuth;
    private long mBitrate;
    private long mBlockBeginT;
    public int mBreakCount;
    private int mBufferDataSeconds;
    private String mCacheDir = "";
    private int mCacheFile;
    private Context mContext;
    public int mCurBufferCount;
    public long mCurDecoderBufferAccuT;
    public int mCurDecoderBufferCount;
    private int mCustomP2PCDNType = -1;
    private String mCustomStr;
    private EventLoggerSource mDataSource;
    private long mDecodeBufferingStartT;
    private int mDecoderType;
    private int mDisAbleV3Async;
    private int mDisableAccurateStart;
    private int mDuration;
    private int mEnabelMDL = -1;
    private int mEnableBash;
    private ArrayList mErrorInfo;
    private VideoEventOnePlay mEvent;
    private VideoEventBase mEventBase;
    private VideoEventOneError mEventOneError;
    private VideoEventOneEvent mEventOneEvent;
    private VideoEventOneOpera mEventOneOpera;
    private String mExtraInfo = "";
    private boolean mFetchComplete;
    private String mFileKey = "";
    private String mFilePath = "";
    private ArrayList mFirstDNSErrorInfo;
    private int mHeight;
    private String mInitialHost;
    private String mInitialIP;
    private String mInitialQuality = "";
    private String mInitialResolution = "";
    private String mInitialURL;
    private boolean mIsLocal;
    private int mIsStartPlayAutomatically;
    private boolean mLeave;
    private int mLeaveReason = -1002;
    private int mLoopCount;
    private Map mMainError;
    private String mMessage = "";
    public int mNetBufferIndex;
    private int mNetWorkTryCount = -1;
    private String mP2PSDKVersion = "";
    private String mP2PUrl = "";
    public long mPauseAccuT;
    private PerformanceUtils mPerformanceUtils;
    private int mPlayCount;
    private Map mPlayItem;
    private Map mPlaybackParams;
    private int mPreload;
    private Map mPreloadInfo;
    private String mProxyUrl = "";
    private ArrayList mRetryFetchErrorInfo;
    private int mSeekAccuT;
    private long mSeekBeginT;
    private int mSeekCount;
    private int mStartTime;
    private int mState;
    private String mSurfaceCode;
    private long mSurfaceSetTime;
    private int mSwitchResolutionCount;
    private int mVDS;
    private int mVPS;
    private ArrayList mVUArray;
    private VideoModel mVideoModel;
    private int mWidth;

    /* renamed from: com.ss.ttvideoengine.log.VideoEventLoggerV2$AyncGetLogDataRunnable */
    static class AyncGetLogDataRunnable implements Runnable {
        private Context rContext;
        private VideoEventOnePlay rEvent;
        VideoEventBase rEventBase;
        private Handler rHandler = new Handler(Looper.getMainLooper());
        VideoEventLoggerV2 rLogger;

        public void run() {
            if (this.rEvent != null) {
                this.rEvent.volume = (int) TTHelper.getVolume(this.rContext);
                if (TextUtils.isEmpty(this.rEvent.p2pLoadInfo)) {
                    this.rEvent.p2pLoadInfo = VideoLoadWrapper.getInstance().getLoadInfo(this.rEvent.p2pUrl);
                }
                if (this.rEventBase != null && this.rEventBase.mDisAbleV3Async == 0) {
                    this.rEventBase.updateMDLInfo();
                    this.rEventBase.mNetworkType = VideoEventBase.getNetworkType(this.rContext);
                }
                final JSONObject jsonObject = this.rEvent.toJsonObject();
                if (this.rHandler == null || this.rHandler.getLooper() == null) {
                    VideoEventManager.instance.addEvent(jsonObject);
                    return;
                }
                this.rHandler.post(new Runnable() {
                    public void run() {
                        VideoEventManager.instance.addEvent(jsonObject);
                    }
                });
                this.rLogger._clear();
            }
        }

        public AyncGetLogDataRunnable(Context context, VideoEventOnePlay videoEventOnePlay, VideoEventLoggerV2 videoEventLoggerV2, VideoEventBase videoEventBase) {
            this.rEvent = videoEventOnePlay;
            this.rContext = context;
            this.rLogger = videoEventLoggerV2;
            this.rEventBase = videoEventBase;
        }
    }

    public void accuBuffingTime(long j) {
    }

    public void didSentEvent(int i) {
    }

    public long getCurDecoderBufferAccuT() {
        return this.mCurDecoderBufferAccuT;
    }

    public int getCurDecoderBufferCount() {
        return this.mCurDecoderBufferCount;
    }

    public String getExtraInfo() {
        return this.mExtraInfo;
    }

    public void loopAgain() {
        this.mLoopCount++;
    }

    public String getTraceID() {
        if (this.mEvent != null) {
            return this.mEvent.traceID;
        }
        return null;
    }

    public void watchFinish() {
        if (this.mEvent != null) {
            this.mEvent.finish = 1;
        }
    }

    public void movieBufferDidReachEnd() {
        if (this.mEvent.bft <= 0) {
            this.mEvent.bft = System.currentTimeMillis();
        }
    }

    public void playbackBufferEnd() {
        if (this.mEvent.playbackBufferEndT <= 0) {
            this.mEvent.playbackBufferEndT = System.currentTimeMillis();
        }
    }

    public void prepareEnd() {
        if (this.mEvent.prepare_end_time <= 0) {
            this.mEvent.prepare_end_time = System.currentTimeMillis();
        }
    }

    public void prepareStart() {
        if (this.mEvent.prepare_start_time <= 0) {
            this.mEvent.prepare_start_time = System.currentTimeMillis();
        }
    }

    public void switchResolution() {
        if (this.mEvent != null) {
            this.mEvent.lastResolutionStartT = System.currentTimeMillis();
        }
        _recordExitReason(-2005, true);
    }

    private void _accumulateVPS() {
        if (this.mDataSource != null) {
            Map bytesInfo = this.mDataSource.bytesInfo();
            if (bytesInfo != null) {
                int intValue = ((Long) bytesInfo.get("vps")).intValue();
                if (this.mAccumVPS == 0) {
                    this.mAccumVPS += intValue - this.mVPS;
                    return;
                }
                this.mAccumVPS += intValue;
            }
        }
    }

    public void _clear() {
        this.mFetchComplete = false;
        this.mRetryFetchErrorInfo.clear();
        this.mFirstDNSErrorInfo.clear();
        this.mErrorInfo.clear();
        this.mMainError.clear();
        this.mState = 0;
        this.mBlockBeginT = 0;
        this.mAccumVPS = 0;
        this.mBitrate = 0;
    }

    public long getLeaveWaitTime() {
        if (this.mEvent == null || this.mEvent.f128681pt <= 0 || this.mEvent.f128680lt <= 0) {
            return 0;
        }
        return this.mEvent.f128680lt - this.mEvent.f128681pt;
    }

    public void seekCompleted() {
        if (this.mSeekBeginT > 0) {
            this.mSeekAccuT = (int) (((long) this.mSeekAccuT) + (SystemClock.elapsedRealtime() - this.mSeekBeginT));
            this.mSeekBeginT = 0;
            if (this.mEvent != null) {
                this.mEvent.lastSeekEndT = System.currentTimeMillis();
            }
        }
    }

    public void showedOneFrame() {
        if (this.mState != 4) {
            this.mState = 2;
            this.mLeave = false;
            if (this.mEvent.f128682vt <= 0) {
                this.mEvent.f128682vt = System.currentTimeMillis();
                if (this.mEventOneError != null) {
                    this.mEventOneError.showedFirstFrame();
                }
                if (this.mEventOneEvent != null) {
                    this.mEventOneEvent.showedFirstFrame();
                }
            }
            _recordExitReason(-2001, true);
        }
    }

    public void switchResolutionEnd() {
        if (this.mState == 4) {
            this.mEventOneOpera.endSeek("wait", 0);
        }
        if (this.mState == 3) {
            this.mState = 2;
        }
        if (this.mEvent != null) {
            this.mEvent.lastResolutionEndT = System.currentTimeMillis();
        }
        _recordExitReason(-2005, false);
    }

    private void _getVidInfo() {
        if (!(this.mVideoModel == null || this.mEventOneError.mErrorType == Integer.MIN_VALUE)) {
            Resolution[] supportResolutions = this.mVideoModel.getSupportResolutions();
            if (supportResolutions != null) {
                int videoRefInt = this.mVideoModel.getVideoRefInt(7);
                HashMap hashMap = new HashMap();
                for (Resolution resolution : supportResolutions) {
                    hashMap.put(resolution.toString(videoRefInt), this.mVideoModel.allVideoURLs(resolution));
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("url", hashMap);
                this.mEvent.vidInfo = hashMap2;
            }
        }
    }

    public void reset() {
        this.mIsLocal = false;
        this.mLeave = true;
        this.mRetryFetchErrorInfo.clear();
        this.mFirstDNSErrorInfo.clear();
        this.mErrorInfo.clear();
        this.mVUArray.clear();
        this.mMainError.clear();
        this.mPreloadInfo = null;
        this.mPlayItem = null;
        this.mCustomStr = null;
        this.mInitialURL = null;
        this.mInitialHost = null;
        this.mInitialIP = null;
        this.mInitialResolution = null;
        this.mInitialQuality = null;
        this.mProxyUrl = null;
        this.mMessage = "";
        this.mCacheFile = 0;
        this.mCacheDir = "";
        this.mFilePath = "";
        this.mFileKey = "";
        this.mBufferDataSeconds = 0;
        this.mDecoderType = 0;
        this.mPreload = 0;
        this.mPlaybackParams = null;
        this.mDuration = 0;
        this.mStartTime = 0;
        this.mCurBufferCount = 0;
        this.mNetBufferIndex = 0;
        this.mCurDecoderBufferCount = 0;
        this.mBreakCount = 0;
        this.mPauseAccuT = 0;
        this.mCurDecoderBufferAccuT = 0;
        this.mSeekCount = 0;
        this.mSwitchResolutionCount = 0;
        this.mVDS = 0;
        this.mVPS = 0;
        this.mAccumVPS = 0;
    }

    private void _sendEvent() {
        if (this.mEvent != null && this.mEvent.f128681pt > 0) {
            if (this.mDataSource != null) {
                Map bytesInfo = this.mDataSource.bytesInfo();
                if (bytesInfo != null) {
                    int intValue = ((Long) bytesInfo.get("vps")).intValue();
                    int intValue2 = ((Long) bytesInfo.get("vds")).intValue();
                    if (this.mAccumVPS == 0) {
                        this.mEvent.vps = intValue - this.mVPS;
                        this.mVPS = intValue;
                    } else {
                        this.mEvent.vps = this.mAccumVPS + intValue;
                        this.mVPS = this.mEvent.vps;
                    }
                    this.mEvent.vds = intValue2 - this.mVDS;
                    this.mVDS = intValue2;
                    this.mEvent.download_speed = ((Long) bytesInfo.get("download_speed")).longValue();
                }
                this.mEvent.render_type = this.mDataSource.getLogValueStr(1);
                logMessage(this.mDataSource.getLogValueStr(2));
                this.mEvent.apiString = this.mDataSource.getLogValueStr(3);
                this.mEvent.netClient = this.mDataSource.getLogValueStr(4);
                if (TextUtils.isEmpty(this.mEvent.p2pLoadInfo)) {
                    this.mEvent.p2pLoadInfo = this.mDataSource.getLogValueStr(20);
                }
                this.mEvent.loadState = this.mDataSource.getLogValueInt(22);
                this.mEvent.playBackState = this.mDataSource.getLogValueInt(21);
                this.mEvent.engineState = this.mDataSource.getLogValueInt(23);
                this.mEvent.isPreferNearestSample = this.mDataSource.getLogValueInt(34);
                this.mEvent.networkTimeout = this.mDataSource.getLogValueInt(35);
                this.mEvent.isDisableShortSeek = this.mDataSource.getLogValueInt(36);
                if (this.mEvent.internalIP == null) {
                    String logValueStr = this.mDataSource.getLogValueStr(5);
                    if (logValueStr == null) {
                        logValueStr = "";
                    }
                    this.mEvent.internalIP = logValueStr;
                }
                String logValueStr2 = this.mDataSource.getLogValueStr(33);
                if (!TextUtils.isEmpty(logValueStr2)) {
                    this.mEvent.loaderType = logValueStr2;
                }
                String logValueStr3 = this.mDataSource.getLogValueStr(37);
                if (!TextUtils.isEmpty(logValueStr3)) {
                    this.mEvent.mdlVersin = logValueStr3;
                }
                if (this.mEvent.dnsT <= 0) {
                    this.mEvent.dnsModule = 1;
                    this.mEvent.dnsT = this.mDataSource.getLogValueLong(7);
                }
                if (this.mEvent.tranConnectT <= 0) {
                    long logValueLong = this.mDataSource.getLogValueLong(10);
                    if (logValueLong > this.mEvent.f128681pt) {
                        this.mEvent.tranConnectT = logValueLong;
                    }
                }
                if (this.mEvent.tranFirstPacketT <= 0) {
                    long logValueLong2 = this.mDataSource.getLogValueLong(11);
                    if (logValueLong2 > this.mEvent.f128681pt) {
                        this.mEvent.tranFirstPacketT = logValueLong2;
                    }
                }
                if (this.mEvent.receiveFirstVideoFrameT <= 0) {
                    this.mEvent.receiveFirstVideoFrameT = this.mDataSource.getLogValueLong(12);
                }
                if (this.mEvent.receiveFirstAudioFrameT <= 0) {
                    this.mEvent.receiveFirstAudioFrameT = this.mDataSource.getLogValueLong(13);
                }
                if (this.mEvent.decodeFirstVideoFrameT <= 0) {
                    this.mEvent.decodeFirstVideoFrameT = this.mDataSource.getLogValueLong(14);
                }
                if (this.mEvent.decodeFirstAudioFrameT <= 0) {
                    this.mEvent.decodeFirstAudioFrameT = this.mDataSource.getLogValueLong(15);
                }
                if (this.mEvent.videoDeviceStartTime <= 0) {
                    this.mEvent.videoDeviceStartTime = this.mDataSource.getLogValueLong(17);
                }
                if (this.mEvent.audioDeviceStartTime <= 0) {
                    this.mEvent.audioDeviceStartTime = this.mDataSource.getLogValueLong(16);
                }
                if (this.mEvent.videoDeviceOpenedTime <= 0) {
                    this.mEvent.videoDeviceOpenedTime = this.mDataSource.getLogValueLong(19);
                }
                if (this.mEvent.audioDeviceOpenedTime <= 0) {
                    this.mEvent.audioDeviceOpenedTime = this.mDataSource.getLogValueLong(18);
                }
                if (this.mEvent.playPreparedT <= 0) {
                    this.mEvent.playPreparedT = this.mDataSource.getLogValueLong(38);
                }
                if (this.mEvent.playStartedT <= 0) {
                    this.mEvent.playStartedT = this.mDataSource.getLogValueLong(39);
                }
                this.mEvent.volume = this.mDataSource.getLogValueInt(26);
                this.mEvent.mute = this.mDataSource.getLogValueInt(27);
                this.mEvent.apiverFinal = this.mDataSource.getLogValueInt(30);
                this.mEvent.chipBoardName = this.mDataSource.getLogValueStr(31);
                this.mEvent.chipHardwareName = this.mDataSource.getLogValueStr(32);
            }
            if (this.mDuration > 0) {
                this.mEventBase.f128671vd = this.mDuration;
            }
            this.mEvent.leave_reason = this.mLeaveReason;
            this.mEvent.apiver = this.mApiVer;
            this.mEvent.auth = this.mAuth;
            this.mEvent.startTime = this.mStartTime;
            this.mEvent.reuseSocket = this.mEventBase.mReuseSocket;
            this.mEvent.disableAccurateStart = this.mDisableAccurateStart;
            this.mEvent.f128683vu = this.mVUArray;
            this.mEvent.f128679lf = this.mEventBase.mLastResolution;
            this.mEvent.f128676df = this.mEventBase.mCurrentResolution;
            this.mEvent.merror = this.mMainError;
            this.mEvent.cacheFile = this.mCacheFile;
            this.mEvent.cacheDir = this.mCacheDir;
            this.mEvent.filePath = this.mFilePath;
            this.mEvent.filekey = this.mFileKey;
            this.mEvent.isStartPlayAutomatically = this.mIsStartPlayAutomatically;
            this.mEvent.bufferSeconds = this.mBufferDataSeconds;
            this.mEvent.decoderType = this.mDecoderType;
            this.mEvent.preload = this.mPreload;
            this.mEvent.loopcount = this.mLoopCount;
            this.mEvent.width = this.mWidth;
            this.mEvent.height = this.mHeight;
            this.mEvent.p2pUrl = this.mP2PUrl;
            this.mEvent.p2pSDKVersion = this.mP2PSDKVersion;
            this.mEvent.customP2PCDNType = this.mCustomP2PCDNType;
            this.mEvent.asyncInit = this.mAsyncInit;
            this.mEvent.asyncCodecId = this.mAsyncCodecId;
            this.mEvent.playCount = this.mPlayCount;
            this.mEvent.dns_server_ip = DNSServerIP.getDNSServerIP();
            this.mEvent.f128674bc = this.mCurBufferCount;
            this.mEvent.dbc = this.mCurDecoderBufferCount;
            this.mEvent.f128675br = this.mBreakCount;
            this.mEvent.pauseAccuT = this.mPauseAccuT;
            this.mEvent.bitrate = this.mBitrate;
            if (this.mSurfaceSetTime > 0) {
                this.mEvent.surfaceSetTime = this.mSurfaceSetTime;
            }
            this.mEvent.surfaceCode = this.mSurfaceCode;
            if (this.mEventOneEvent != null) {
                this.mEvent.bufferAccuT = this.mEventOneEvent.mAccuCostTime;
            }
            this.mEvent.decoderBufferAccuT = this.mCurDecoderBufferAccuT;
            this.mEvent.seekCount = this.mSeekCount;
            this.mEvent.switchResolutionCount = this.mSwitchResolutionCount;
            float memoryData = this.mPerformanceUtils.getMemoryData();
            if (memoryData > 0.0f) {
                this.mEvent.memoryUse = memoryData;
            }
            float cpuData = this.mPerformanceUtils.getCpuData();
            if (cpuData > 0.0f) {
                this.mEvent.cpuUse = cpuData;
            }
            HashMap hashMap = new HashMap();
            int i = 0;
            while (i < this.mRetryFetchErrorInfo.size() && i < 3) {
                hashMap.put(C2240a.m6772a("fetchretry%d", new Object[]{Integer.valueOf(i)}), this.mRetryFetchErrorInfo.get(i));
                i++;
            }
            int i2 = 0;
            while (i2 < this.mFirstDNSErrorInfo.size() && i2 < 3) {
                hashMap.put(C2240a.m6772a("ldns%d", new Object[]{Integer.valueOf(i2)}), ((Error) this.mFirstDNSErrorInfo.get(i2)).toMap());
                i2++;
            }
            for (int i3 = 0; i3 < this.mErrorInfo.size(); i3++) {
                if (i3 < 2 || i3 == this.mErrorInfo.size() - 1) {
                    hashMap.put(C2240a.m6772a("error%d", new Object[]{Integer.valueOf(i3)}), this.mErrorInfo.get(i3));
                }
            }
            if (!TextUtils.isEmpty(this.mMessage)) {
                hashMap.put("log", this.mMessage);
            }
            this.mMessage = "";
            this.mEvent.f128678ex = hashMap;
            this.mExtraInfo = hashMap.toString();
            if (this.mPreloadInfo != null) {
                this.mEvent.mPreloadInfo = this.mPreloadInfo;
            }
            if (this.mPlayItem != null) {
                this.mEvent.mPlayItem = this.mPlayItem;
            }
            if (this.mCustomStr != null) {
                this.mEvent.mCustomStr = this.mCustomStr;
            }
            if (this.mInitialURL != null) {
                this.mEvent.mInitialURL = this.mInitialURL;
            }
            if (this.mInitialHost != null) {
                this.mEvent.mInitialHost = this.mInitialHost;
            }
            if (this.mInitialIP != null) {
                this.mEvent.mInitialIP = this.mInitialIP;
            }
            if (this.mInitialResolution != null) {
                this.mEvent.mInitialResolution = this.mInitialResolution;
            }
            if (this.mInitialQuality != null) {
                this.mEvent.mInitialQuality = this.mInitialQuality;
            }
            if (this.mProxyUrl != null) {
                this.mEvent.proxy_url = this.mProxyUrl;
            }
            if (this.mPlaybackParams != null) {
                this.mEvent.playbackparams = this.mPlaybackParams;
            }
            this.mEvent.enableBash = this.mEnableBash;
            this.mEvent.enableMDL = this.mEnabelMDL;
            this.mEvent.netWorkTryCount = this.mNetWorkTryCount;
            if (this.mEvent.lastSeekEndT < this.mEvent.lastSeekStartT) {
                this.mEvent.lastSeekEndT = -2147483648L;
            }
            if (this.mEvent.lastResolutionEndT < this.mEvent.lastResolutionStartT) {
                this.mEvent.lastResolutionEndT = -2147483648L;
            }
            _getVidInfo();
            if (this.mBlockBeginT > 0) {
                this.mEvent.leave_block_t = (int) (SystemClock.elapsedRealtime() - this.mBlockBeginT);
            }
            if (this.mSeekAccuT > 0) {
                this.mEvent.seek_accu_t = this.mSeekAccuT;
            }
            if (TimeService.isUpdated()) {
                this.mEvent.server_local_diff = TimeService.currentTimeMillis() - System.currentTimeMillis();
            }
            EngineThreadPool.addExecuteTask(new AyncGetLogDataRunnable(this.mContext, this.mEvent, this, this.mEventBase));
            this.mLeave = true;
            this.mCurBufferCount = 0;
            this.mNetBufferIndex = 0;
            this.mCurDecoderBufferCount = 0;
            this.mBreakCount = 0;
            this.mPauseAccuT = 0;
            this.mCurDecoderBufferAccuT = 0;
            this.mLoopCount = 0;
            this.mSwitchResolutionCount = 0;
            this.mSeekCount = 0;
            this.mSeekBeginT = 0;
            this.mSeekAccuT = 0;
            this.mPerformanceUtils.stop();
        }
    }

    public void bufferDataSeconds(int i) {
        this.mBufferDataSeconds = i;
    }

    public void decoderType(int i) {
        this.mDecoderType = i;
    }

    public void setCustomP2PCDNType(int i) {
        this.mCustomP2PCDNType = i;
    }

    public void setCustomStr(String str) {
        this.mCustomStr = str;
    }

    public void setDisableAccurateStart(int i) {
        this.mDisableAccurateStart = i;
    }

    public void setEnableBash(int i) {
        this.mEnableBash = i;
    }

    public void setEnableMDL(int i) {
        this.mEnabelMDL = i;
    }

    public void setInitialQuality(String str) {
        this.mInitialQuality = str;
    }

    public void setInitialResolution(String str) {
        this.mInitialResolution = str;
    }

    public void setNetWorkTryCount(int i) {
        this.mNetWorkTryCount = i;
    }

    public void setPlayItem(Map map) {
        this.mPlayItem = map;
    }

    public void setPreloadInfo(Map map) {
        this.mPreloadInfo = map;
    }

    public void setProxyUrl(String str) {
        this.mProxyUrl = str;
    }

    public void setStartPlayHeight(int i) {
        this.mHeight = i;
    }

    public void setStartPlayWidth(int i) {
        this.mWidth = i;
    }

    public void setStartTime(int i) {
        this.mStartTime = i;
    }

    public void setVUArray(ArrayList arrayList) {
        this.mVUArray = arrayList;
    }

    public void useCacheFile(int i) {
        this.mCacheFile = i;
    }

    public void usePreload(int i) {
        this.mPreload = i;
    }

    public void addWatchedDuration(int i) {
        this.mEvent.watchduration = i;
    }

    public IMediaMetrics buildMetrics(int i) {
        return MetricsFactory.createMetrics(i, this.mEvent);
    }

    public void fetchedAndLeaveByUser(int i) {
        this.mEvent.fetchedAndLeaveByUser = i;
    }

    public void firstDNSFailed(Error error) {
        this.mFirstDNSErrorInfo.add(error);
    }

    public void setDrmTokenUrl(String str) {
        this.mEventBase.mDrmTokenUrl = str;
    }

    public void setDrmType(int i) {
        this.mEventBase.mDrmType = i;
    }

    public void setDuration(int i) {
        this.mDuration = i;
        this.mEventBase.f128671vd = i;
    }

    public void setFeed(VideoModel videoModel) {
        if (videoModel != null) {
            updateVideoInfo(videoModel);
        }
    }

    public void setP2PCDNType(int i) {
        this.mEventBase.setP2PCDNType(i);
    }

    public void setP2PSDKVersion(String str) {
        if (str != null) {
            this.mP2PSDKVersion = str;
        }
    }

    public void setP2PUrl(String str) {
        if (str != null) {
            this.mP2PUrl = str;
        }
    }

    public void setPlayType(int i) {
        this.mEventBase.mPlayType = i;
    }

    public void setReuseSocket(int i) {
        this.mEventBase.mReuseSocket = i;
    }

    public void useHardwareDecode(int i) {
        this.mEventBase.useVideoHW(i);
    }

    public void accuErrCount(int i) {
        if (this.mEvent != null) {
            this.mEvent.accuErrCount = i;
        }
    }

    public void clockDiff(long j) {
        if (this.mEvent != null) {
            this.mEvent.clockDiff = j;
        }
    }

    public void containerFps(float f) {
        if (this.mEvent != null) {
            this.mEvent.containerFps = f;
        }
    }

    public void curAudioDecodeError(int i) {
        if (this.mEvent != null && i > 0) {
            this.mEvent.curAudioDecodeError = i;
        }
    }

    public void curPlayBackTime(int i) {
        if (this.mEvent != null) {
            this.mEvent.curPlayBackTime = (long) i;
        }
    }

    public void curVideoDecodeError(int i) {
        if (this.mEvent != null && i > 0) {
            this.mEvent.curVideoDecodeError = i;
        }
    }

    public void curVideoDecoderFps(int i) {
        if (this.mEvent != null) {
            this.mEvent.curVideoDecoderFps = i;
        }
    }

    public void curVideoOutputFps(float f) {
        if (this.mEvent != null) {
            this.mEvent.curVideoOutputFps = f;
        }
    }

    public void curVideoRenderError(int i) {
        if (this.mEvent != null && i >= 0) {
            this.mEvent.curVideoRenderError = i;
        }
    }

    public void dropCount(int i) {
        if (this.mEvent != null) {
            this.mEvent.dropCount = i;
        }
    }

    public void enableSharp(int i) {
        if (this.mEvent != null) {
            this.mEvent.enableSharp = i;
        }
    }

    public void enableStartPlayAutomatically(boolean z) {
        if (z) {
            this.mIsStartPlayAutomatically = 1;
        } else {
            this.mIsStartPlayAutomatically = 0;
        }
    }

    public void engineState(int i) {
        if (this.mEvent != null) {
            this.mEvent.engineState = i;
        }
    }

    public void hwCodecException(int i) {
        if (this.mEvent != null) {
            this.mEvent.hwCodecException = i;
        }
    }

    public void hwCodecName(String str) {
        if (this.mEvent != null) {
            this.mEvent.hwCodecName = str;
        }
    }

    public void loadState(int i) {
        if (this.mEvent != null) {
            this.mEvent.loadState = i;
        }
    }

    public void mainURLHTTPDNSFailed(Error error) {
        if (error != null) {
            this.mMainError.put("httpdns", error.toMap());
        }
    }

    public void mainURLLocalDNSFailed(Error error) {
        if (error != null) {
            this.mMainError.put("localdns", error.toMap());
        }
    }

    public void playBackState(int i) {
        if (this.mEvent != null) {
            this.mEvent.playBackState = i;
        }
    }

    public void setAbrInfo(Map map) {
        if (this.mEvent != null) {
            this.mEvent.abrInfo = map;
        }
    }

    public void setAudioBufferLength(long j) {
        if (this.mEvent != null) {
            this.mEvent.audioBufferLength = (int) j;
        }
    }

    public void setCheckHijack(int i) {
        if (this.mEvent != null) {
            this.mEvent.checkHijack = i;
        }
    }

    public void setCurQuality(String str) {
        if (this.mEventBase != null) {
            this.mEventBase.setCurQuality(str);
        }
    }

    public void setCurResolution(String str) {
        if (this.mEventBase != null) {
            this.mEventBase.setCurResolution(str);
        }
    }

    public void setEncryptKey(String str) {
        if (this.mEvent != null) {
            this.mEvent.encryptKey = str;
        }
    }

    public void setFramesDropNum(int i) {
        if (this.mEvent != null) {
            this.mEvent.mFramesSetDropNum = i;
        }
    }

    public void setHijackRetry(int i) {
        if (this.mEvent != null) {
            this.mEvent.hijackRetry = i;
        }
    }

    public void setInitialHost(String str) {
        this.mInitialHost = str;
        if (this.mEventBase != null) {
            this.mEventBase.mInitialHost = str;
        }
    }

    public void setInitialIP(String str) {
        this.mInitialIP = str;
        if (this.mEventBase != null) {
            this.mEventBase.mInitialIP = str;
        }
    }

    public void setInitialURL(String str) {
        this.mInitialURL = str;
        if (this.mEventBase != null) {
            this.mEventBase.mInitialURL = str;
        }
    }

    public void setIsVideoModelCache(int i) {
        if (this.mEvent != null) {
            this.mEvent.useVideoModelCache = i;
        }
    }

    public void setMediaCodecRender(int i) {
        if (this.mEvent != null) {
            this.mEvent.mediaCodecRender = i;
        }
    }

    public void setSurface(String str) {
        this.mSurfaceCode = str;
        this.mSurfaceSetTime = System.currentTimeMillis();
    }

    public void setTraceID(String str) {
        if (this.mEvent != null) {
            this.mEvent.traceID = str;
        }
        this.mEventBase.mTraceID = str;
    }

    public void setVideoBufferLength(long j) {
        if (this.mEvent != null) {
            this.mEvent.videoBufferLength = (int) j;
        }
    }

    public void setVideoCacheSize(long j) {
        if (this.mEvent != null) {
            this.mEvent.vpls = j;
        }
    }

    public void tryErrCount(int i) {
        if (this.mEvent != null) {
            this.mEvent.errCount = i;
        }
    }

    public void updateVideoInfo(VideoModel videoModel) {
        if (videoModel != null) {
            this.mEventBase.setVideoInfo(videoModel);
            this.mVideoModel = videoModel;
        }
    }

    public void useCodecPool(int i) {
        if (this.mEvent != null) {
            this.mEvent.codecPool = i;
        }
    }

    public void useSuperRes(int i) {
        if (this.mEvent != null) {
            this.mEvent.superRes = i;
        }
    }

    public void useTextureRender(int i) {
        if (this.mEvent != null) {
            this.mEvent.textureRender = i;
        }
    }

    public void validateVideoMetaInfoFail(Error error) {
        this.mEvent.hijack = 1;
        this.mErrorInfo.add(error);
    }

    public void accuPauseTime(long j) {
        if (this.mEvent != null && j > 0) {
            this.mPauseAccuT += j;
        }
    }

    public String getStringOption(int i) {
        String str = "";
        if (i != 47) {
            return str;
        }
        try {
            return this.mEventBase.mSourceTypeStr;
        } catch (Throwable th) {
            TTVideoEngineLog.m110645d(th);
            return str;
        }
    }

    public void logMessage(String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.mMessage);
            sb.append(str);
            this.mMessage = sb.toString();
        }
    }

    public void logPluginException(String str) {
        if (this.mEvent != null) {
            this.mEvent.pluginException = 1;
            if (!TextUtils.isEmpty(str)) {
                this.mEvent.ownPlayerCreateException = str;
            }
        }
    }

    public void renderSeekCompleted(int i) {
        _recordExitReason(-2002, false);
        this.mState = 2;
        this.mEventOneOpera.endSeek("wait", i);
    }

    public void setCurHost(String str) {
        if (this.mEventBase != null && str != null && !str.isEmpty()) {
            this.mEventBase.setCurHost(str);
        }
    }

    public void setCurIP(String str) {
        if (this.mEventBase != null && str != null && !str.isEmpty()) {
            this.mEventBase.setCurIP(str);
        }
    }

    public void setCurURL(String str) {
        if (this.mEventBase != null && str != null && !str.isEmpty()) {
            this.mEventBase.setCurURL(str);
        }
    }

    public void setDNSEndTime(long j) {
        if (this.mEvent != null && this.mEvent.dns_end_t <= 0) {
            this.mEvent.dns_end_t = j;
            _recordExitReason(-1005, true);
        }
    }

    public void setDecodeFirstAudioFrameTime(long j) {
        if (this.mEvent != null && this.mEvent.decodeFirstAudioFrameT <= 0) {
            this.mEvent.decodeFirstAudioFrameT = j;
        }
    }

    public void setDecodeFirstVideoFrameTime(long j) {
        if (this.mEvent != null && this.mEvent.decodeFirstVideoFrameT <= 0) {
            this.mEvent.decodeFirstVideoFrameT = j;
        }
    }

    public void setExternLog(String str) {
        if (this.mEvent != null && !TextUtils.isEmpty(str)) {
            this.mEvent.externLogFromApp = str;
        }
    }

    public void setGenerateP2PInfoEndTime(long j) {
        if (this.mEvent != null && this.mEvent.generateP2PInfoEndTime <= 0) {
            this.mEvent.generateP2PInfoEndTime = j;
        }
    }

    public void setGenerateP2PInfoStartTime(long j) {
        if (this.mEvent != null && this.mEvent.generateP2PInfoStartTime <= 0) {
            this.mEvent.generateP2PInfoStartTime = j;
        }
    }

    public void setGetP2PUrlT(long j) {
        if (this.mEvent != null && this.mEvent.getP2PUrlTime <= 0) {
            this.mEvent.getP2PUrlTime = j;
        }
    }

    public void setHijackCode(int i) {
        if (!(this.mEvent == null || i == -1)) {
            if (this.mEvent.firstHijackCode == -1) {
                this.mEvent.firstHijackCode = i;
                return;
            }
            this.mEvent.lastHijackCode = i;
        }
    }

    public void setPlayerCreatedT(long j) {
        if (this.mEvent != null && this.mEvent.player_created_t <= 0) {
            this.mEvent.player_created_t = j;
        }
    }

    public void setPlayerHostAddr(String str) {
        if (this.mEvent != null && !TextUtils.isEmpty(str)) {
            this.mEvent.internalIP = str;
        }
    }

    public void setReceiveFirstAudioFrameTime(long j) {
        if (this.mEvent != null && this.mEvent.receiveFirstAudioFrameT <= 0) {
            this.mEvent.receiveFirstAudioFrameT = j;
        }
    }

    public void setReceiveFirstVideoFrameTime(long j) {
        if (this.mEvent != null && this.mEvent.receiveFirstVideoFrameT <= 0) {
            this.mEvent.receiveFirstVideoFrameT = j;
        }
    }

    public void setSubTag(String str) {
        if (this.mEventBase != null && str != null && !str.isEmpty()) {
            this.mEventBase.mSubTag = str;
        }
    }

    public void setTag(String str) {
        if (this.mEventBase != null && str != null && !str.isEmpty()) {
            this.mEventBase.mTag = str;
        }
    }

    public void setTextureRenderError(String str) {
        if (this.mEvent != null && !TextUtils.isEmpty(str)) {
            this.mEvent.textureRenderError = str;
        }
    }

    public void setTranConnectTime(long j) {
        if (this.mEvent != null && this.mEvent.tranConnectT <= 0) {
            this.mEvent.tranConnectT = j;
        }
    }

    public void setTranFirstPacketTime(long j) {
        if (this.mEvent != null && this.mEvent.tranFirstPacketT <= 0) {
            this.mEvent.tranFirstPacketT = j;
        }
    }

    private void _setDefaultExitReason(int i) {
        if (i == 6 || i == 0) {
            this.mLeaveReason = -1005;
        } else if (i == 1 || i == 4 || i == 2 || i == 3 || i == 7) {
            this.mLeaveReason = -1004;
        } else {
            if (i == 5) {
                this.mLeaveReason = -1002;
            }
        }
    }

    public void logFirstError(Error error) {
        if (this.mEvent != null && this.mEvent.first_errc == Integer.MIN_VALUE && this.mEvent.first_errt == Integer.MIN_VALUE && this.mEvent.first_errc_internal == Integer.MIN_VALUE) {
            this.mEvent.first_errt = error.getType();
            this.mEvent.first_errc = error.code;
            this.mEvent.first_errc_internal = error.internalCode;
        }
    }

    public void movieFinish(int i) {
        if (i != 5) {
            if (this.mState == 4) {
                this.mEventOneOpera.endSeek("wait", 0);
            }
            if (this.mState == 3) {
                this.mEventOneEvent.movieStallEnd("wait");
            }
            this.mEventBase.movieFinish();
        }
        if (this.mLeave) {
            this.mEvent.f128680lt = System.currentTimeMillis();
        } else {
            this.mEvent.f128677et = System.currentTimeMillis();
        }
        _upload(i);
    }

    public void setDNSStartTime(long j) {
        if (this.mEvent != null && this.mEvent.dns_start_t <= 0) {
            this.mEvent.dns_start_t = j;
            if (this.mEvent.dnsModule == 1) {
                this.mEvent.dnsModule = 0;
                _recordExitReason(-1004, true);
            }
        }
    }

    public void setDnsMode(int i) {
        if (i == 1 || ((i != 0 && this.mEventBase.mSourceTypeStr.equals("dir_url")) || this.mEnabelMDL == 1)) {
            this.mEvent.dnsModule = 1;
        } else {
            this.mEvent.dnsModule = 0;
        }
    }

    private void _upload(int i) {
        this.mEvent.leave_method = i;
        _sendEvent();
        this.mDataSource.getLogValueInt(48);
        this.mEventBase = new VideoEventBase(this.mDataSource);
        this.mEventBase.mContext = this.mContext;
        this.mEvent = new VideoEventOnePlay(this.mEventBase);
        this.mEventOneOpera = new VideoEventOneOpera(this.mEventBase);
        this.mEventOneEvent = new VideoEventOneEvent(this.mEventBase, this.mEventOneOpera);
        this.mEventOneError = new VideoEventOneError(this.mEventBase);
        this.mEventBase.mDisAbleV3Async = this.mDisAbleV3Async;
        this.mEventOneError.mDisAbleV3Async = this.mDisAbleV3Async;
        this.mEventOneEvent.mDisAbleV3Async = this.mDisAbleV3Async;
        this.mEventOneOpera.mDisAbleV3Async = this.mDisAbleV3Async;
    }

    public void movieStallEnd(int i) {
        if (i == 0 && this.mState == 3) {
            this.mState = 2;
            this.mEventOneEvent.movieStallEnd("wait");
        }
        if (this.mEvent != null) {
            if (i == 0) {
                if (this.mState != 4) {
                    _recordExitReason(-2003, false);
                }
            } else if (i == 1) {
                _recordExitReason(-2004, false);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.mEvent.firstBufferEndT <= 0) {
                this.mEvent.firstBufferEndT = currentTimeMillis;
            }
            if (i == 1 && this.mDecodeBufferingStartT > 0 && currentTimeMillis >= this.mDecodeBufferingStartT) {
                this.mCurDecoderBufferAccuT += currentTimeMillis - this.mDecodeBufferingStartT;
                this.mDecodeBufferingStartT = 0;
            }
            this.mEvent.lastBufferEndT = currentTimeMillis;
        }
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        if (this.mEvent != null) {
            this.mPlaybackParams = new HashMap();
            this.mPlaybackParams.put("AFMode", Integer.valueOf(playbackParams.getAudioFallbackMode()));
            this.mPlaybackParams.put("pitch", Float.valueOf(playbackParams.getPitch()));
            this.mPlaybackParams.put("speed", Float.valueOf(playbackParams.getSpeed()));
            this.mEventBase.mPlaySpeed = playbackParams.getSpeed();
        }
    }

    public void stop(int i) {
        if (this.mState == 4) {
            this.mEventOneOpera.endSeek("exit", 0);
        }
        if (this.mState == 3) {
            this.mEventOneEvent.movieStallEnd("exit");
        }
        this.mState = 0;
        if (!this.mLeave || this.mEvent.f128681pt <= 0) {
            this.mEvent.f128677et = System.currentTimeMillis();
        } else if (this.mEvent.f128680lt <= 0) {
            this.mEvent.f128680lt = System.currentTimeMillis();
        }
        this.mEventBase.movieFinish();
        _upload(i);
    }

    public void configResolution(String str, String str2) {
        this.mEventBase.configResolution(str, str2);
    }

    public void setLongOption(int i, long j) {
        if (i == 50) {
            this.mBitrate = j;
        }
    }

    public void setPlayAPIVersion(int i, String str) {
        this.mApiVer = i;
        this.mAuth = str;
    }

    public void useAsyncInit(int i, int i2) {
        this.mAsyncInit = i;
        this.mAsyncCodecId = i2;
    }

    public void setSettingLog(int i, int i2) {
        if (this.mEvent != null && i == 1) {
            this.mEvent.mBufferTimeout = i2;
        }
    }

    public void codecName(int i, int i2) {
        if (this.mEvent != null) {
            switch (i) {
                case 0:
                    this.mEventBase.videoCodecNameId = i2;
                    return;
                case 1:
                    this.mEventBase.audioCodecNameId = i2;
                    break;
            }
        }
    }

    public void mainURLCDNFailed(Error error, String str) {
        if (error != null) {
            HashMap map = error.toMap();
            if (str == null) {
                str = "";
            }
            map.put("url", str);
            this.mMainError.put("cdn", map);
        }
    }

    public void needRetryToFetch(Error error, int i) {
        HashMap map = error.toMap();
        map.put("apiver", Integer.valueOf(i));
        this.mRetryFetchErrorInfo.add(map);
    }

    public void playerDidFailed(Error error, String str) {
        if (error != null) {
            HashMap map = error.toMap();
            if (str == null) {
                str = "";
            }
            map.put("url", str);
            this.mMainError.put("player", map);
        }
    }

    public void recordBlockReason(int i, boolean z) {
        if (this.mEvent != null) {
            if (z) {
                this.mLeaveReason = i;
                this.mBlockBeginT = SystemClock.elapsedRealtime();
                return;
            }
            this.mLeaveReason = DynamicTabYellowPointVersion.DEFAULT;
            this.mBlockBeginT = 0;
        }
    }

    public void setDNSParseTime(long j, int i) {
        if (this.mEvent != null && this.mEvent.dnsT <= 0) {
            this.mEvent.dnsT = j;
            this.mEvent.dnsModule = i;
        }
    }

    public void setIntOption(int i, int i2) {
        if (i == 10) {
            this.mDisAbleV3Async = i2;
            this.mEventBase.mDisAbleV3Async = i2;
            this.mEventOneError.mDisAbleV3Async = i2;
            this.mEventOneEvent.mDisAbleV3Async = i2;
            this.mEventOneOpera.mDisAbleV3Async = i2;
        }
    }

    public void setNetworkSpeedFrom(double d, int i) {
        if (this.mEvent != null) {
            switch (i) {
                case 0:
                    this.mEvent.firstFrameSpeed = d;
                    return;
                case 1:
                    this.mEvent.playEndSpeed = d;
                    break;
            }
        }
    }

    public void setSourceType(int i, String str) {
        if (i == 0) {
            this.mIsLocal = true;
        }
        this.mEventBase.setSourceType(i, str);
        this.mPlayCount = 0;
        _setDefaultExitReason(i);
    }

    public void deviceStartTime(int i, long j) {
        if (this.mEvent != null) {
            switch (i) {
                case 0:
                    if (this.mEvent.videoDeviceStartTime <= 0) {
                        this.mEvent.videoDeviceStartTime = j;
                        return;
                    }
                    break;
                case 1:
                    if (this.mEvent.audioDeviceStartTime <= 0) {
                        this.mEvent.audioDeviceStartTime = j;
                        break;
                    }
                    break;
            }
        }
    }

    public void devicedOpenedTime(int i, long j) {
        if (this.mEvent != null) {
            switch (i) {
                case 0:
                    if (this.mEvent.videoDeviceOpenedTime <= 0) {
                        this.mEvent.videoDeviceOpenedTime = j;
                        return;
                    }
                    break;
                case 1:
                    if (this.mEvent.audioDeviceOpenedTime <= 0) {
                        this.mEvent.audioDeviceOpenedTime = j;
                        break;
                    }
                    break;
            }
        }
    }

    public void fetchInfoComplete(VideoModel videoModel, Error error) {
        if (error != null) {
            this.mMainError.put("api", error.toMap());
            return;
        }
        if (videoModel != null) {
            updateVideoInfo(videoModel);
            this.mEvent.f128673at = System.currentTimeMillis();
            this.mFetchComplete = true;
            if (this.mEvent.dnsModule == 1) {
                _recordExitReason(-1005, true);
            } else if (this.mEvent.dnsModule == 0) {
                _recordExitReason(-1004, true);
            }
        }
    }

    public void switchResolution(String str, String str2) {
        if (this.mState == 4) {
            this.mEventOneOpera.endSeek("switch", 0);
        }
        if (this.mState == 3) {
            this.mEventOneEvent.movieStallEnd("switch");
        }
        this.mEvent.f128677et = System.currentTimeMillis();
        if (str != str2) {
            this.mSwitchResolutionCount++;
        }
        this.mEventBase.configResolution(str, str2);
    }

    public void _recordExitReason(int i, boolean z) {
        if (this.mEvent != null) {
            if (z) {
                this.mLeaveReason = i;
                if (i == -1002 || i == -1003 || i == -1004 || i == -1005) {
                    if (this.mBlockBeginT == 0) {
                        this.mBlockBeginT = SystemClock.elapsedRealtime();
                    }
                } else if (i == -2003 || i == -2002) {
                    this.mBlockBeginT = SystemClock.elapsedRealtime();
                } else {
                    this.mBlockBeginT = 0;
                }
            } else {
                this.mLeaveReason = -2001;
                this.mBlockBeginT = 0;
            }
        }
    }

    public void movieFinish(int i, String str) {
        if (this.mState == 4) {
            this.mEventOneOpera.endSeek("error", 0);
        }
        if (this.mState == 3) {
            this.mEventOneEvent.movieStallEnd("error");
        }
        this.mState = 5;
        this.mEventBase.movieFinish();
        this.mEventOneError.errorHappened(i, str);
        this.mEvent.vsc = i;
        this.mEvent.vscMessage = str;
        movieFinish(5);
    }

    public void movieStalled(int i, int i2) {
        StringBuilder sb = new StringBuilder("movieStalled, type: ");
        sb.append(i);
        TTVideoEngineLog.m110647i("VideoEventLoggerV2", sb.toString());
        if (!(i != 0 || this.mState == 3 || this.mState == 4)) {
            this.mState = 3;
            VideoEventOneEvent videoEventOneEvent = this.mEventOneEvent;
            int i3 = this.mNetBufferIndex;
            this.mNetBufferIndex = i3 + 1;
            videoEventOneEvent.movieStalled(i2, i3);
        }
        if (this.mVUArray.size() <= 1) {
            switch (i) {
                case 0:
                    this.mCurBufferCount++;
                    break;
                case 1:
                    this.mCurDecoderBufferCount++;
                    break;
            }
        }
        if (this.mEvent != null) {
            if (i == 0) {
                if (this.mState != 4) {
                    _recordExitReason(-2003, true);
                }
            } else if (i == 1) {
                _recordExitReason(-2004, true);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.mEvent.firstBufferStartT <= 0) {
                this.mEvent.firstBufferStartT = currentTimeMillis;
            }
            if (i == 1) {
                this.mDecodeBufferingStartT = currentTimeMillis;
            }
            this.mEvent.lastBufferStartT = currentTimeMillis;
        }
    }

    public VideoEventLoggerV2(Context context, EventLoggerSource eventLoggerSource) {
        this.mDataSource = eventLoggerSource;
        this.mEventBase = new VideoEventBase(this.mDataSource);
        this.mEvent = new VideoEventOnePlay(this.mEventBase);
        this.mEventOneError = new VideoEventOneError(this.mEventBase);
        this.mEventOneOpera = new VideoEventOneOpera(this.mEventBase);
        this.mEventOneEvent = new VideoEventOneEvent(this.mEventBase, this.mEventOneOpera);
        this.mRetryFetchErrorInfo = new ArrayList();
        this.mFirstDNSErrorInfo = new ArrayList();
        this.mErrorInfo = new ArrayList();
        this.mVUArray = new ArrayList();
        this.mMainError = new HashMap();
        this.mLeave = true;
        this.mFetchComplete = false;
        this.mContext = context;
        this.mEventBase.mContext = context;
        this.mPerformanceUtils = new PerformanceUtils(context);
    }

    public void movieFinish(Error error, int i) {
        if (this.mState == 4) {
            this.mEventOneOpera.endSeek("error", 0);
        }
        if (this.mState == 3) {
            this.mEventOneEvent.movieStallEnd("error");
        }
        this.mState = 5;
        HashMap map = error.toMap();
        map.put("strategy", Integer.valueOf(0));
        map.put("apiver", Integer.valueOf(i));
        this.mErrorInfo.add(map);
        if (this.mLeave) {
            this.mEvent.f128680lt = System.currentTimeMillis();
        } else {
            if ((error.domain.equals("kTTVideoErrorDomainVideoOwnPlayer") || error.domain.equals("kTTVideoErrorDomainVideoOSPlayer")) && this.mVUArray.size() <= 1) {
                this.mBreakCount++;
            }
            this.mEvent.f128677et = System.currentTimeMillis();
        }
        logFirstError(error);
        this.mEventBase.movieFinish();
        if (this.mEventOneError != null) {
            this.mEventOneError.errorHappened(error);
        }
        this.mEvent.errt = error.getType();
        this.mEvent.errc = error.code;
        _upload(4);
    }

    public void seekTo(int i, int i2, boolean z) {
        if (!z) {
            if (this.mState == 3) {
                this.mEventOneEvent.movieStallEnd("seek");
            }
            if (this.mState == 4) {
                this.mEventOneOpera.endSeek("seek", 0);
            }
            this.mSeekCount++;
            this.mState = 4;
            this.mEventOneOpera.beginSeek(i, i2, this.mSeekCount);
            this.mSeekBeginT = System.currentTimeMillis();
            if (this.mEvent != null) {
                this.mEvent.lastSeekStartT = this.mSeekBeginT;
                this.mEvent.lastSeekPosition = i2;
            }
            this.mSeekBeginT = SystemClock.elapsedRealtime();
        }
        _recordExitReason(-2002, true);
    }

    public void beginToPlay(String str, long j, String str2) {
        _clear();
        this.mState = 1;
        this.mEvent = new VideoEventOnePlay(this.mEventBase);
        this.mEventBase.beginToPlay(str, str2);
        this.mEvent.f128681pt = j;
        this.mLeave = true;
        this.mPerformanceUtils.start();
        this.mEvent.prepare_start_time = 0;
        this.mEvent.prepare_end_time = 0;
        this.mEvent.dnsT = 0;
        this.mEvent.tranConnectT = 0;
        this.mEvent.tranFirstPacketT = 0;
        this.mEvent.receiveFirstVideoFrameT = 0;
        this.mEvent.receiveFirstAudioFrameT = 0;
        this.mEvent.decodeFirstVideoFrameT = 0;
        this.mEvent.decodeFirstAudioFrameT = 0;
        this.mEvent.videoDeviceStartTime = 0;
        this.mEvent.audioDeviceStartTime = 0;
        this.mEvent.videoDeviceOpenedTime = 0;
        this.mEvent.audioDeviceOpenedTime = 0;
        this.mPlayCount++;
        this.mEvent.lastSeekStartT = -2147483648L;
        this.mEvent.lastSeekEndT = -2147483648L;
        this.mEvent.lastBufferStartT = -2147483648L;
        this.mEvent.lastBufferEndT = -2147483648L;
        this.mEvent.lastResolutionStartT = -2147483648L;
        this.mEvent.lastResolutionEndT = -2147483648L;
        this.mEvent.lastSeekPosition = DynamicTabYellowPointVersion.DEFAULT;
        if (this.mEventBase.mSourceTypeStr.equals("vid")) {
            _recordExitReason(-1002, true);
        } else if (this.mEventBase.mSourceTypeStr.equals("local_url")) {
            _recordExitReason(-1005, true);
        } else if (this.mEvent.dnsModule == 0) {
            _recordExitReason(-1003, true);
        } else {
            if (this.mEvent.dnsModule == 1) {
                _recordExitReason(-1005, true);
            }
        }
    }

    public void movieShouldRetry(Error error, int i, int i2) {
        if ((error.domain.equals("kTTVideoErrorDomainVideoOwnPlayer") || error.domain.equals("kTTVideoErrorDomainVideoOSPlayer")) && this.mVUArray.size() <= 1) {
            this.mBreakCount++;
        }
        HashMap map = error.toMap();
        map.put("strategy", Integer.valueOf(i));
        map.put("apiver", Integer.valueOf(i2));
        this.mErrorInfo.add(map);
        logFirstError(error);
        _accumulateVPS();
        if (this.mEventOneError != null) {
            this.mEventOneError.movieShouldRetry(error, i, i2);
        }
        if (this.mState == 3) {
            this.mEventOneEvent.movieShouldRetry();
        }
        if (this.mState == 4) {
            this.mEventOneOpera.movieShouldRetry();
        }
        if (this.mLeave) {
            switch (i) {
                case 1:
                    this.mEvent.f128673at = 0;
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    return;
            }
            this.mEvent.dns_start_t = 0;
            this.mEvent.dns_end_t = 0;
            this.mEvent.dnsT = 0;
            if (this.mEvent.dnsModule == 1) {
                this.mEvent.dns_start_t = 0;
                this.mEvent.dns_end_t = 0;
                this.mEvent.dnsT = 0;
            }
            this.mEvent.prepare_start_time = 0;
            this.mEvent.prepare_end_time = 0;
            this.mEvent.tranConnectT = 0;
            this.mEvent.tranFirstPacketT = 0;
            this.mEvent.receiveFirstAudioFrameT = 0;
            this.mEvent.receiveFirstVideoFrameT = 0;
            this.mEvent.decodeFirstAudioFrameT = 0;
            this.mEvent.decodeFirstVideoFrameT = 0;
            this.mEvent.videoDeviceStartTime = 0;
            this.mEvent.videoDeviceOpenedTime = 0;
            this.mEvent.audioDeviceStartTime = 0;
            this.mEvent.audioDeviceOpenedTime = 0;
        }
    }

    public void externalCacheInfo(int i, String str, String str2, String str3) {
        this.mCacheFile = i;
        if (str != null) {
            this.mCacheDir = str;
        }
        if (str2 != null) {
            this.mFilePath = str2;
        }
        if (str3 != null) {
            this.mFileKey = str3;
        }
    }
}
