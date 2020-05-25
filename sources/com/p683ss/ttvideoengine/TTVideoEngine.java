package com.p683ss.ttvideoengine;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.C2240a;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.vcloud.abrmodule.ABRAudioStream;
import com.bytedance.vcloud.abrmodule.ABRResult;
import com.bytedance.vcloud.abrmodule.ABRSpeedRecord;
import com.bytedance.vcloud.abrmodule.ABRVideoStream;
import com.bytedance.vcloud.abrmodule.DefaultNetSpeedPredictor;
import com.bytedance.vcloud.abrmodule.IABRInfoListener;
import com.bytedance.vcloud.abrmodule.IABRModule;
import com.bytedance.vcloud.abrmodule.IBufferInfo;
import com.bytedance.vcloud.abrmodule.IInitParams;
import com.bytedance.vcloud.abrmodule.INetSpeedPredictor;
import com.bytedance.vcloud.abrmodule.IPlayStateSupplier;
import com.bytedance.vcloud.abrmodule.ISpeedRecord;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import com.p683ss.android.ugc.p2454f.C48918e;
import com.p683ss.texturerender.TextureRenderLog;
import com.p683ss.texturerender.TextureRenderLog.OnLogListener;
import com.p683ss.texturerender.TextureRenderManager;
import com.p683ss.texturerender.VideoSurface;
import com.p683ss.texturerender.VideoSurface.OnDrawFrameListener;
import com.p683ss.ttm.player.ILibraryLoader;
import com.p683ss.ttm.player.IMediaDataSource;
import com.p683ss.ttm.player.MediaFormat;
import com.p683ss.ttm.player.MediaPlayer;
import com.p683ss.ttm.player.MediaPlayer.OnBufferingUpdateListener;
import com.p683ss.ttm.player.MediaPlayer.OnCompletionListener;
import com.p683ss.ttm.player.MediaPlayer.OnErrorListener;
import com.p683ss.ttm.player.MediaPlayer.OnInfoListener;
import com.p683ss.ttm.player.MediaPlayer.OnPreparedListener;
import com.p683ss.ttm.player.MediaPlayer.OnSeekCompleteListener;
import com.p683ss.ttm.player.MediaPlayer.OnVideoSizeChangedListener;
import com.p683ss.ttm.player.MediaPlayer.TrackInfo;
import com.p683ss.ttm.player.PlaybackParams;
import com.p683ss.ttm.player.TTPlayerConfiger;
import com.p683ss.ttm.player.TTPlayerLibraryLoader;
import com.p683ss.ttvideoengine.DataLoaderHelper.DataLoaderCacheInfo;
import com.p683ss.ttvideoengine.VideoModelCache.VideoModelCacheInfo;
import com.p683ss.ttvideoengine.data.P2PStragetyManager;
import com.p683ss.ttvideoengine.data.VideoLoadWrapper;
import com.p683ss.ttvideoengine.fetcher.FetcherMaker;
import com.p683ss.ttvideoengine.fetcher.VideoInfoFetcher;
import com.p683ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener;
import com.p683ss.ttvideoengine.log.EventLoggerSource;
import com.p683ss.ttvideoengine.log.ExternVideoLoggerListener;
import com.p683ss.ttvideoengine.log.IVideoEventLogger;
import com.p683ss.ttvideoengine.log.IVideoEventUploader;
import com.p683ss.ttvideoengine.log.VideoEventLogger;
import com.p683ss.ttvideoengine.log.VideoEventLoggerV2;
import com.p683ss.ttvideoengine.log.VideoEventManager;
import com.p683ss.ttvideoengine.metrics.IMediaMetrics;
import com.p683ss.ttvideoengine.model.P2PPlayUrlInfo;
import com.p683ss.ttvideoengine.model.VideoInfo;
import com.p683ss.ttvideoengine.model.VideoModel;
import com.p683ss.ttvideoengine.model.VideoRef;
import com.p683ss.ttvideoengine.net.DNSCompletionListener;
import com.p683ss.ttvideoengine.net.DNSParser;
import com.p683ss.ttvideoengine.net.NetUtils;
import com.p683ss.ttvideoengine.net.TTVNetClient;
import com.p683ss.ttvideoengine.preloader.TTAVPreloaderItem;
import com.p683ss.ttvideoengine.setting.TTVideoEngineSettingManager;
import com.p683ss.ttvideoengine.utils.EngineThreadPool;
import com.p683ss.ttvideoengine.utils.Error;
import com.p683ss.ttvideoengine.utils.PlayDuration;
import com.p683ss.ttvideoengine.utils.TTHelper;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import com.p683ss.ttvideoengine.utils.TimeService;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;
import p096cn.p097a.p098a.p099a.C2236f;

/* renamed from: com.ss.ttvideoengine.TTVideoEngine */
public class TTVideoEngine {
    private static boolean HTTP_DNS_FIRST = false;
    private static boolean ONLY_USE_MEDIALOADER = false;
    public static int PLAYER_MAX_ACCUMULATED_COUNT = 30;
    public static int PLAYER_TIME_BASE = 1000000;
    private static int PLAY_URL_EXPIRE_TIME = 2400;
    private static String mAppPath = null;
    private static Lock mCreatCacheFileLock = new ReentrantLock();
    private static boolean mForceUseLitePlayer = false;
    private static boolean mForceUsePluginPlayer = false;
    private static boolean mHasRegisterMdlProto = false;
    private static boolean mIsFirstOpenEngine = true;
    private static OnLogListener mTextureLogListener = null;
    private static int sABRAlgorithmType = 0;
    private static int[] sDNSType;
    public static INetSpeedPredictor sNetSpeedPredictor;
    private static boolean sTestSpeedEnabled = false;
    private static int sTestSpeedInterval = 500;
    public P2PPlayUrlInfo curP2PUrlInfo;
    private String currentHost;
    private Map<Integer, String> currentParams = null;
    public Resolution currentResolution;
    private VideoInfo currentVideoInfo;
    private Resolution lastResolution;
    public int mABRCurrentDownloadedAudioBitrate;
    private IABRModule mABRModule;
    public int mABRTimerIntervalMilliseconds = 500;
    private float mAEPreGain = 0.25f;
    private float mAEPredelay = 0.007f;
    private float mAERatio = 8.0f;
    private float mAEThreshold = -18.0f;
    private long mALogWriteAddr = 0;
    public String mAPIString;
    private int mAccumulatedErrorCount;
    private int mAccurateLayout = 0;
    private boolean mAllowedExpiredModel = false;
    private int mAsyncInitEnable;
    private boolean mAsyncPlayHitVMCache = false;
    private MediaPlayer mAsyncPlayer;
    private long mAudioProcessorAddr = 0;
    private int mAudioRangeSize = 409600;
    private int mAudioRangeTime = 10000;
    public String mAuthorization = "";
    private boolean mBashEnabled;
    private int mBestResolutionType = 0;
    private int mBufferDataMiliSeconds;
    private int mBufferTimeout = 30;
    private long mBufferingStartT;
    private int mBufferingType = -1;
    private boolean mCacheControlEnabled;
    private String mCacheDir = "";
    private int mCacheFileEnable;
    private CacheFilePathListener mCacheFilePathListener;
    private String mCachePath;
    private boolean mCheckHijack = false;
    private int mCleanWhenStop;
    private int mCodecId;
    private HashMap<Integer, Integer> mConfigParams = null;
    private int mConfigParamsOption = 1;
    public Context mContext;
    private String mCurrentQuality = "";
    private int mDNSExpiredTime;
    private DNSParser mDNSParser;
    private int mDashAbr = 0;
    public boolean mDashEnabled;
    public int mDataLoaderEnable;
    private DataSource mDataSource;
    public boolean mDecodedVideoFirstFrame = false;
    private int mDecoderType;
    private String mDecryptionKey = "";
    private String mDefaultCacheDir;
    private int mDefaultRenderType = 3;
    private int mDelayBufferingUpdate = 0;
    private String mDirectURL = "";
    private String mDirectUrlSrc = "";
    private int mDisableAccurateStart;
    private int mDisablePlayerTimeOut;
    private int mDrmDowngrade;
    private boolean mDrmRetry = true;
    private int mDrmType;
    public int mDuration;
    private int mEGLNeedWorkAround = 1;
    private int mEglVersion = 2;
    private int mEnableAsync = 0;
    private int mEnableFragRange = 0;
    private boolean mEnableHttps = false;
    private int mEnableIndexCache = 0;
    private int mEnableOppoControl;
    private int mEnableSeekInterrupt;
    private int mEnableSetPlayInfoToP2P = 1;
    private int mEnableSharp;
    private int mEnableVolumeBalance;
    private int mEnhancementType;
    public Error mError;
    public int mErrorCount;
    private int mExposeSignal;
    private String mExternLogKey;
    private ExternVideoLoggerListener mExternVideoLoggerListener;
    private String mFallbackAPI;
    private int mFallbackApiRetry = 0;
    private VideoInfoFetcher mFetcher;
    private String mFileKey;
    public boolean mFirstGetWidthHeight = true;
    private boolean mFirstHost = true;
    private boolean mFirstIP = true;
    private boolean mFirstQuality = true;
    private boolean mFirstResolution = true;
    private boolean mFirstURL = true;
    private int mForbidOSPlayer = 0;
    private int mForbidP2P;
    private int mForbidP2PWhenSeek = 0;
    private int mFrameDropNum = 2;
    private String mGroupID = "";
    private boolean mH265Enabled;
    public Handler mHandler;
    private int mHardwareDecodeEnablePlayer2;
    private int mHardwareDecodeEnablePlayer3;
    private int mHardwareDropNonRef;
    public boolean mHasFirstFrameShown;
    private HashMap<String, String> mHeaders;
    private boolean mHijackRetry = true;
    private int mHijackRetryBackupDNSType = 0;
    private int mHijackRetryCount = 0;
    private int mHijackRetryMainDNSType = 2;
    private boolean mHttpsEnabled;
    private VideoInfoCollector mInfoCollector = null;
    public boolean mIsDashSource;
    private boolean mIsDirectURL;
    public int mIsDisableShortSeek = 0;
    private boolean mIsFeedInfo;
    public boolean mIsFetchingInfo;
    public boolean mIsLocal;
    private boolean mIsMute;
    public boolean mIsPlayComplete;
    private boolean mIsPlayItem;
    public int mIsPreferNearestSample = 0;
    public boolean mIsPreloaderItem;
    public boolean mIsStartPlayAutomatically = true;
    private int mIsTTHlsDrm = 0;
    private boolean mIsUseBoe;
    private int mIsUsePlayerDNS = -1;
    private boolean mIsUseServerDns = false;
    private String mKeyseed;
    private int mKsyFrameWait = 1;
    public int mLastPlaybackTime;
    private int mLayoutType;
    private int mLimitMDLCacheSize;
    public int mLoadState;
    public int mLoadedProgress;
    private String mLocalURL = "";
    public IVideoEventLogger mLogger;
    private int mLoopCount;
    private int mLoopEndTime;
    private int mLoopReferVideo;
    private int mLoopStartTime;
    public boolean mLooping;
    private int mMaxAccumulatedCountSetByUser = PLAYER_MAX_ACCUMULATED_COUNT;
    private int mMaxBufferDataMilliSeconds = 5000;
    private int mMaxFileCacheSize = -1;
    private int mMaxFps = 31;
    private int mMediaCodecRender = 1;
    private int mMediaCodecSkipNonRef;
    private int mMediaCodecSyncMode;
    private IMediaDataSource mMediaDataSource;
    public MediaPlayer mMediaPlayer;
    private int mMovPreferNearestSample;
    private int mNeedAdaptiveWorkaround = 0;
    private TTVNetClient mNetClient;
    private TTNetworkStateCallback mNetWorkChangeCb = null;
    public int mNetworkTimeout = 5;
    private int mNetworkTryCount = -1;
    public int mNotifyBufferingDirectly;
    private int mOriginalRetry = 1;
    private int mOutputLog;
    private int mP2PCDNType;
    private long mPauseStartT;
    public boolean mPausedBeforePrepared;
    private long mPipeLength;
    private long mPipeOffset;
    public int mPlayAPIVersion;
    public PlayDuration mPlayDuration;
    private FileDescriptor mPlayFd;
    private TTVideoEnginePlayItem mPlayItem;
    public long mPlayStartTimestamp;
    public long mPlayTime = 0;
    private int mPlayType;
    public PlaybackParams mPlaybackParams;
    public int mPlaybackState;
    private int mPlayerCache;
    private int mPlayerDegradeMode;
    public boolean mPlayerFirstFrame = false;
    public int mPlayerType;
    private TTAVPreloaderItem mPreloaderItem;
    public boolean mPrepared;
    private int mQcomVppLevel = -1;
    private int mRadioModeEnable = 0;
    private int mRangeMode = 0;
    private int mRenderType = 3;
    private HashMap<String, Resolution> mResolutionMap;
    private boolean mRetryEnableHttps = false;
    public boolean mRetrying;
    private int mReuseSocket;
    private int mScaleType;
    private SeekCompletionListener mSeekCompletionListener;
    private int mSeekEndEnabled;
    private boolean mSeeking;
    private final long mSerial = System.currentTimeMillis();
    private int mSetTrackVolume;
    private long mSettingMask;
    public boolean mShouldPlay;
    private int mSkipAudioGraph;
    private int mSkipFfmpegFindStreamInfo;
    private int mSkipFindStreamInfo = 0;
    private int mSoloPlayEnable = 1;
    private String mSpadea = "";
    public int mStartTime;
    public boolean mStarted;
    public int mState;
    private StreamInfoListener mStreamInfoListener;
    private String mSubTag = "";
    private int mSuperRes;
    private int mSuperResFxaa;
    private int mSuperResStrengh = 5;
    private Surface mSurface;
    private SurfaceHolder mSurfaceHolder;
    public boolean mSwitchingResolution;
    private String mTTHlsDrmToken = "";
    private String mTag = "";
    private int mTestAction;
    public int mTestNetSpeed = -1;
    public int mTestNetSpeedDiff = 500;
    public Handler mTestNetSpeedHandler;
    public TestNetSpeedListener mTestNetSpeedListener;
    public Runnable mTestNetSpeedRunable;
    public boolean mTexNotifyFirstFrame = false;
    public boolean mTextureFirstFrame = false;
    private String mTextureRenderErrorMsg = null;
    public TextureRenderManager mTextureRenderer;
    private VideoSurface mTextureSurface;
    private int mTimeBarPercentage = 0;
    private String mTokenUrlTemplate = "";
    private URLInfo mURLInfo = new URLInfo();
    private String[] mURLs;
    private int mUnsupportSampleRatesInBinary;
    private int mUseAudioHWDec = 0;
    private int mUseCodecPool = 0;
    private boolean mUseDNSCache;
    private int mUseExternalDir;
    private int mUseMediacodecAudio;
    public boolean mUsePlayer3;
    private boolean mUsePlayerSpade = true;
    private int mUseQcomLowLatency;
    private int mUseQcomVpp;
    private int mUseTextureRender = 0;
    private boolean mUseVideoModelCache;
    private boolean mUserStopped;
    public ArrayList<String> mUsingDataLoaderPlayFilePaths = new ArrayList<>();
    private String mUsingDataLoaderPlayRawKey = null;
    public ArrayList<String> mUsingDataLoaderPlayTaskKeys = new ArrayList<>();
    public long mVVTime = 0;
    private VideoBufferListener mVideoBufferListener;
    public VideoEngineInfoListener mVideoEngineInfoListener;
    public VideoEngineInfos mVideoEngineInfos;
    public VideoEngineListener mVideoEngineListener;
    private String mVideoID;
    public VideoInfoListener mVideoInfoListener;
    public VideoModel mVideoModel;
    private VideoModelCache mVideoModelCache;
    public long mVideoPreloadSize = 0;
    private int mVideoRangeSize = 1048576;
    private int mVideoRangeTime = 5000;
    private VideoURLRouteListener mVideoRouteListener;
    private int mVoiceType = -1;
    private float mVolume = -1.0f;
    private Map<String, IpInfo> urlIPMap;
    public Map<Resolution, Integer> urlIndexMap;

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$IpInfo */
    class IpInfo {
        public String dns;

        /* renamed from: ip */
        public String f128649ip;
        public int isDNSCacheOpen;
        public int isServerDNSOpen;
        public String urlDesc;

        public IpInfo(String str, String str2, int i, int i2, String str3) {
            this.f128649ip = str;
            this.dns = str2;
            this.isDNSCacheOpen = i;
            this.isServerDNSOpen = i2;
            this.urlDesc = str3;
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$MyABRInfoListener */
    static class MyABRInfoListener implements IABRInfoListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyABRInfoListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public void onInfo(int i, int i2) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine != null && i == 1) {
                tTVideoEngine._onABRGetPredictResult();
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$MyBufferingUpdateListener */
    static class MyBufferingUpdateListener implements OnBufferingUpdateListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyBufferingUpdateListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                if (tTVideoEngine.mIsLocal) {
                    i = 100;
                }
                tTVideoEngine.mLoadedProgress = i;
                tTVideoEngine.setPlayInfo(2, (long) i);
                if (tTVideoEngine.mVideoEngineListener != null) {
                    tTVideoEngine.mVideoEngineListener.onBufferingUpdate(tTVideoEngine, i);
                }
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$MyCompletionListener */
    static class MyCompletionListener implements OnCompletionListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyCompletionListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                TTVideoEngineLog.m110647i("TTVideoEngine", "receive onCompletion");
                tTVideoEngine.mLogger.watchFinish();
                if (!tTVideoEngine.mLooping) {
                    tTVideoEngine.mIsPlayComplete = true;
                    tTVideoEngine._updatePlaybackState(0);
                    if (tTVideoEngine.mPlayDuration != null) {
                        tTVideoEngine.mPlayDuration.stop();
                        tTVideoEngine.mLogger.addWatchedDuration(tTVideoEngine.mPlayDuration.getPlayedDuration());
                    }
                    tTVideoEngine.mLogger.curPlayBackTime(tTVideoEngine.mDuration);
                    tTVideoEngine._updateLogger();
                    tTVideoEngine.mLogger.movieFinish(3);
                    tTVideoEngine.mHasFirstFrameShown = false;
                    tTVideoEngine.mSwitchingResolution = false;
                    tTVideoEngine.mLastPlaybackTime = 0;
                    tTVideoEngine.mRetrying = false;
                    tTVideoEngine.mStarted = false;
                } else {
                    tTVideoEngine.mLogger.loopAgain();
                }
                if (tTVideoEngine.mVideoEngineListener != null) {
                    tTVideoEngine.mVideoEngineListener.onCompletion(tTVideoEngine);
                }
                if (mediaPlayer.getPlayerType() == 0) {
                    tTVideoEngine.mPrepared = false;
                }
                tTVideoEngine.mStartTime = 0;
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$MyDNSCompletionListener */
    static class MyDNSCompletionListener implements DNSCompletionListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public void onCancelled() {
            TTVideoEngineLog.m110647i("TTVideoEngine", "dns cancelled");
        }

        public MyDNSCompletionListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public void onRetry(Error error) {
            if (error == null) {
                TTVideoEngineLog.m110646e("TTVideoEngine", C2240a.m6772a("fetcher should retry, error:%s", new Object[]{error.toString()}));
                TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
                if (tTVideoEngine != null) {
                    if (((Integer) tTVideoEngine.urlIndexMap.get(tTVideoEngine.currentResolution)).intValue() == 0) {
                        tTVideoEngine.mLogger.mainURLLocalDNSFailed(error);
                    }
                    tTVideoEngine.mLogger.firstDNSFailed(error);
                }
            }
        }

        public void onCompletion(JSONObject jSONObject, Error error) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                if (error != null) {
                    TTVideoEngineLog.m110646e("TTVideoEngine", C2240a.m6772a("dns failed:%s", new Object[]{error.toString()}));
                    if (((Integer) tTVideoEngine.urlIndexMap.get(tTVideoEngine.currentResolution)).intValue() == 0) {
                        tTVideoEngine.mLogger.mainURLHTTPDNSFailed(error);
                    }
                    tTVideoEngine._receivedError(error);
                    return;
                }
                String str = null;
                if (jSONObject != null) {
                    str = jSONObject.optString("ip");
                    long optLong = jSONObject.optLong("time");
                    if (tTVideoEngine.mLogger != null) {
                        tTVideoEngine.mLogger.setDNSEndTime(optLong);
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    tTVideoEngine._receivedError(new Error("", -9997, "DNS result empty"));
                    TTVideoEngineLog.m110646e("TTVideoEngine", "dns parse empty");
                    return;
                }
                tTVideoEngine._parseDNSComplete(str);
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$MyErrorListener */
    static class MyErrorListener implements OnErrorListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyErrorListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return false;
            }
            if (tTVideoEngine.mPlayDuration != null) {
                tTVideoEngine.mPlayDuration.stop();
            }
            tTVideoEngine._updatePlaybackState(3);
            tTVideoEngine._updateLoadState(3, -1);
            String stringOption = mediaPlayer.getStringOption(5002);
            String str = "kTTVideoErrorDomainVideoOwnPlayer";
            if (mediaPlayer.isOSPlayer()) {
                str = "kTTVideoErrorDomainVideoOSPlayer";
            }
            P2PStragetyManager.getInstance().setPlayErrororInterrupt(i);
            tTVideoEngine.mError = new Error(str, i, i2, stringOption);
            tTVideoEngine._receivedError(tTVideoEngine.mError);
            return true;
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$MyFetcherListener */
    static class MyFetcherListener implements FetcherListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyFetcherListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public void onLog(String str) {
            TTVideoEngineLog.m110647i("TTVideoEngine", "fetcher cancelled");
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                tTVideoEngine._logMessage(str);
            }
        }

        public void onRetry(Error error) {
            if (error != null) {
                TTVideoEngineLog.m110646e("TTVideoEngine", C2240a.m6772a("fetcher should retry, error:%s", new Object[]{error.toString()}));
                TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
                if (tTVideoEngine != null) {
                    tTVideoEngine.mLogger.needRetryToFetch(error, tTVideoEngine.mPlayAPIVersion);
                }
            }
        }

        public void onStatusException(int i, String str) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                TTVideoEngineLog.m110646e("TTVideoEngine", C2240a.m6772a("video status exception:%d", new Object[]{Integer.valueOf(i)}));
                tTVideoEngine.mIsFetchingInfo = false;
                if (tTVideoEngine.mLogger != null) {
                    tTVideoEngine.mLogger.movieFinish(i, str);
                }
                if (tTVideoEngine.mVideoEngineListener != null) {
                    tTVideoEngine.mVideoEngineListener.onVideoStatusException(i);
                }
            }
        }

        public void onCompletion(VideoModel videoModel, Error error) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                tTVideoEngine.mIsFetchingInfo = false;
                if (videoModel == null || error != null) {
                    TTVideoEngineLog.m110646e("TTVideoEngine", C2240a.m6772a("fetch info failed:%s", new Object[]{error.toString()}));
                    if (error != null) {
                        tTVideoEngine._logFetchedFailed(error);
                        tTVideoEngine._receivedError(error);
                        return;
                    }
                    tTVideoEngine._logFetchedFailed(new Error("kTTVideoErrorDomainFetchingInfo", -9997, "fetch empty"));
                    tTVideoEngine._receivedError(new Error("kTTVideoErrorDomainFetchingInfo", -9997, "fetch empty"));
                    return;
                }
                tTVideoEngine.mVideoModel = videoModel;
                TTVideoEngineLog.m110647i("TTVideoEngine", "fetch info success");
                tTVideoEngine._logFetchedVideoInfo(videoModel);
                tTVideoEngine.mIsDashSource = videoModel.isDashSource();
                tTVideoEngine.mDashEnabled = tTVideoEngine.mIsDashSource;
                if (!tTVideoEngine.mIsPreloaderItem) {
                    if (tTVideoEngine.mVideoInfoListener != null) {
                        if (tTVideoEngine.mVideoInfoListener.onFetchedVideoInfo(videoModel)) {
                            tTVideoEngine.mLogger.fetchedAndLeaveByUser(1);
                            return;
                        }
                        tTVideoEngine.mLogger.fetchedAndLeaveByUser(0);
                    }
                    tTVideoEngine._parseIPAddress(videoModel);
                }
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$MyInfoListener */
    static class MyInfoListener implements OnInfoListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyInfoListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return false;
            }
            switch (i) {
                case 3:
                    TTVideoEngineLog.m110647i("TTVideoEngine", "player callback render start");
                    if (tTVideoEngine.mTextureRenderer != null) {
                        tTVideoEngine.mPlayerFirstFrame = true;
                        if (tTVideoEngine.mTextureFirstFrame) {
                            TTVideoEngineLog.m110647i("TTVideoEngine", "render start by player after texture");
                            tTVideoEngine._renderStart();
                            break;
                        }
                    } else {
                        TTVideoEngineLog.m110647i("TTVideoEngine", "render start by player");
                        tTVideoEngine._renderStart();
                        break;
                    }
                    break;
                case 701:
                    tTVideoEngine._bufferStart(i2);
                    break;
                case 702:
                    tTVideoEngine._bufferEnd(i2);
                    break;
                case 801:
                    tTVideoEngine._seekComplete(false);
                    break;
                case 251658244:
                    tTVideoEngine._streamChanged(i2);
                    break;
                case 251658248:
                    tTVideoEngine._renderSeekComplete(i2);
                    break;
                case 251658249:
                    tTVideoEngine._videoBitrateChanged(i2);
                    break;
            }
            return false;
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$MyInitParams */
    static class MyInitParams implements IInitParams {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public int getTrackType() {
            return 0;
        }

        public long getStartTime() {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return -1;
            }
            return tTVideoEngine.mPlayStartTimestamp;
        }

        public float getProbeInterval() {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return 500.0f;
            }
            return (float) tTVideoEngine.mABRTimerIntervalMilliseconds;
        }

        public MyInitParams(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$MyLoggerDataSource */
    static class MyLoggerDataSource implements EventLoggerSource {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public String getMediaLoaderInfo() {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine != null && tTVideoEngine.mDataLoaderEnable != 0) {
                return DataLoaderHelper.getDataLoader().getPlayLog(tTVideoEngine.mLogger.getTraceID());
            }
            StringBuilder sb = new StringBuilder("videoEngine is:");
            sb.append(tTVideoEngine);
            sb.append(", dataloader enable:");
            sb.append(tTVideoEngine.mDataLoaderEnable);
            TTVideoEngineLog.m110646e("TTVideoEngine", sb.toString());
            return null;
        }

        public Map bytesInfo() {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return null;
            }
            MediaPlayer mediaPlayer = tTVideoEngine.mMediaPlayer;
            if (mediaPlayer == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("vds", Long.valueOf(mediaPlayer.getLongOption(45, 0)));
            hashMap.put("vps", Long.valueOf(mediaPlayer.getLongOption(46, 0)));
            hashMap.put("download_speed", Long.valueOf(mediaPlayer.getLongOption(63, -1)));
            hashMap.put("vlen", Long.valueOf(mediaPlayer.getLongOption(72, 0)));
            hashMap.put("alen", Long.valueOf(mediaPlayer.getLongOption(73, 0)));
            return hashMap;
        }

        public Map versionInfo() {
            String str;
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            if (tTVideoEngine.mUsePlayer3) {
                str = C2236f.m6766a(14, "");
            } else {
                str = TTPlayerConfiger.getValue(14, "");
            }
            if (tTVideoEngine.mPlayerType == 0 || tTVideoEngine.mPlayerType == 1) {
                hashMap.put("sv", "5.6");
                if (tTVideoEngine.mUsePlayer3) {
                    hashMap.put("pv", "3.3");
                } else {
                    hashMap.put("pv", "3.0");
                }
                hashMap.put("pc", str);
                hashMap.put("sdk_version", BuildConfig.VERSION_NAME);
            } else if (tTVideoEngine.mPlayerType == 2) {
                hashMap.put("sv", "5.6");
                hashMap.put("pv", "1.0");
                hashMap.put("pc", "0");
                hashMap.put("sdk_version", BuildConfig.VERSION_NAME);
            } else {
                hashMap.put("sv", "5.6");
                hashMap.put("pv", "4.0");
                hashMap.put("pc", str);
                hashMap.put("sdk_version", BuildConfig.VERSION_NAME);
            }
            return hashMap;
        }

        public MyLoggerDataSource(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public int getLogValueInt(int i) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return 0;
            }
            if (i == 30) {
                return tTVideoEngine.mPlayAPIVersion;
            }
            switch (i) {
                case 21:
                    return tTVideoEngine.mPlaybackState;
                case 22:
                    return tTVideoEngine.mLoadState;
                case 23:
                    return tTVideoEngine.mState;
                case 24:
                    if (tTVideoEngine.mMediaPlayer == null) {
                        return 0;
                    }
                    return tTVideoEngine.convertCodecName(tTVideoEngine.mMediaPlayer.getIntOption(157, -1));
                case 25:
                    if (tTVideoEngine.mMediaPlayer == null) {
                        return 0;
                    }
                    return tTVideoEngine.mMediaPlayer.getIntOption(158, -1);
                case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                    return (int) tTVideoEngine.getVolume();
                case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                    if (tTVideoEngine.mMediaPlayer == null) {
                        return -1;
                    }
                    if (tTVideoEngine.mMediaPlayer.isMute()) {
                        return 1;
                    }
                    return 0;
                default:
                    switch (i) {
                        case 34:
                            return tTVideoEngine.mIsPreferNearestSample;
                        case MessageCenter.MSG_TYPE_FACE_VERIFY /*35*/:
                            return tTVideoEngine.mNetworkTimeout;
                        case 36:
                            return tTVideoEngine.mIsDisableShortSeek;
                        default:
                            switch (i) {
                                case 42:
                                    if (tTVideoEngine.mMediaPlayer == null) {
                                        return 0;
                                    }
                                    return tTVideoEngine.mMediaPlayer.getIntOption(221, -1);
                                case 43:
                                    if (tTVideoEngine.mMediaPlayer == null) {
                                        return 0;
                                    }
                                    return tTVideoEngine.mMediaPlayer.getIntOption(222, -1);
                                case 44:
                                    if (tTVideoEngine.mMediaPlayer == null) {
                                        return 0;
                                    }
                                    return tTVideoEngine.mMediaPlayer.getIntOption(245, -1);
                                default:
                                    switch (i) {
                                        case 48:
                                            P2PStragetyManager.getInstance().setLeaveWaitTime(tTVideoEngine.mLogger.getLeaveWaitTime());
                                            return 0;
                                        case 49:
                                            if (tTVideoEngine.mMediaPlayer == null) {
                                                return 0;
                                            }
                                            return tTVideoEngine.mMediaPlayer.getIntOption(44, -1);
                                        default:
                                            return 0;
                                    }
                            }
                    }
            }
        }

        public long getLogValueLong(int i) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null || tTVideoEngine.mMediaPlayer == null) {
                return 0;
            }
            if (i == 7) {
                return tTVideoEngine.mMediaPlayer.getLongOption(68, 0);
            }
            if (i == 45) {
                return tTVideoEngine.mMediaPlayer.getLongOption(152, -1);
            }
            switch (i) {
                case 10:
                    return tTVideoEngine.mMediaPlayer.getLongOption(69, 0);
                case 11:
                    return tTVideoEngine.mMediaPlayer.getLongOption(70, 0);
                case 12:
                    return tTVideoEngine.mMediaPlayer.getLongOption(75, 0);
                case 13:
                    return tTVideoEngine.mMediaPlayer.getLongOption(76, 0);
                case 14:
                    return tTVideoEngine.mMediaPlayer.getLongOption(77, 0);
                case 15:
                    return tTVideoEngine.mMediaPlayer.getLongOption(78, 0);
                case 16:
                    return tTVideoEngine.mMediaPlayer.getLongOption(156, -1);
                case 17:
                    return tTVideoEngine.mMediaPlayer.getLongOption(155, -1);
                case 18:
                    return tTVideoEngine.mMediaPlayer.getLongOption(163, -1);
                case 19:
                    return tTVideoEngine.mMediaPlayer.getLongOption(162, -1);
                default:
                    switch (i) {
                        case 38:
                            return tTVideoEngine.mMediaPlayer.getLongOption(307, -1);
                        case 39:
                            return tTVideoEngine.mMediaPlayer.getLongOption(308, -1);
                        case 40:
                            return tTVideoEngine.mPlayTime;
                        case BaseNotice.LIKE /*41*/:
                            return tTVideoEngine.mVVTime;
                        default:
                            return 0;
                    }
            }
        }

        public String getLogValueStr(int i) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return "";
            }
            if (i != 20) {
                if (i == 29) {
                    return tTVideoEngine.mAuthorization;
                }
                if (i == 37) {
                    return DataLoaderHelper.getDataLoader().getStringValue(6);
                }
                if (i != 46) {
                    switch (i) {
                        case 0:
                            if (tTVideoEngine.mMediaPlayer != null) {
                                int intOption = tTVideoEngine.mMediaPlayer.getIntOption(141, -1);
                                if (intOption == 0) {
                                    return "h264";
                                }
                                if (intOption == 1) {
                                    return "h265";
                                }
                            }
                            break;
                        case 1:
                            if (tTVideoEngine.mMediaPlayer != null) {
                                switch (tTVideoEngine.mMediaPlayer.getIntOption(139, -1)) {
                                    case 0:
                                        return "opengl";
                                    case 1:
                                        return "nativewindow";
                                }
                            }
                            break;
                        case 2:
                            MediaPlayer mediaPlayer = tTVideoEngine.mMediaPlayer;
                            if (mediaPlayer != null) {
                                return mediaPlayer.getStringOption(5002);
                            }
                            break;
                        case 3:
                            return tTVideoEngine.mAPIString;
                        case 4:
                            if (tTVideoEngine.getNetClientSetByUser() == null) {
                                return "own";
                            }
                            return "user";
                        case 5:
                            if (tTVideoEngine.mMediaPlayer != null) {
                                return tTVideoEngine.mMediaPlayer.getStringOption(71);
                            }
                            break;
                        default:
                            switch (i) {
                                case 31:
                                    try {
                                        return Build.BOARD;
                                    } catch (Exception e) {
                                        TTVideoEngineLog.m110645d(e);
                                        return "";
                                    }
                                case 32:
                                    try {
                                        if (VERSION.SDK_INT >= 8) {
                                            return Build.HARDWARE;
                                        }
                                        return "";
                                    } catch (Exception e2) {
                                        TTVideoEngineLog.m110645d(e2);
                                        return "";
                                    }
                                case 33:
                                    if (tTVideoEngine.mMediaPlayer != null) {
                                        return tTVideoEngine.mMediaPlayer.getStringOption(200);
                                    }
                                    break;
                            }
                    }
                } else if (tTVideoEngine.mLogger != null) {
                    return tTVideoEngine.mLogger.getExtraInfo();
                } else {
                    return "";
                }
            } else if (tTVideoEngine.curP2PUrlInfo != null) {
                return VideoLoadWrapper.getInstance().getLoadInfo(tTVideoEngine.curP2PUrlInfo.mUrl);
            }
            return "";
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$MyOnVideoSizeChangedListener */
    static class MyOnVideoSizeChangedListener implements OnVideoSizeChangedListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyOnVideoSizeChangedListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (!(tTVideoEngine == null || tTVideoEngine.mVideoEngineListener == null)) {
                tTVideoEngine.mVideoEngineListener.onVideoSizeChanged(tTVideoEngine, i, i2);
                if (!tTVideoEngine.mSwitchingResolution && tTVideoEngine.mFirstGetWidthHeight) {
                    tTVideoEngine.mFirstGetWidthHeight = false;
                    tTVideoEngine.mLogger.setStartPlayWidth(i);
                    tTVideoEngine.mLogger.setStartPlayHeight(i2);
                }
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$MyPlayStateSupplier */
    static class MyPlayStateSupplier implements IPlayStateSupplier {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public Queue<ISpeedRecord> getTimelineNetworkSpeed() {
            return null;
        }

        public Map<String, IBufferInfo> getAudioBufferInfo() {
            return new HashMap();
        }

        public Map<String, IBufferInfo> getVideoBufferInfo() {
            return new HashMap();
        }

        public int getCurrentDownloadAudioBitrate() {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return -1;
            }
            return tTVideoEngine.mABRCurrentDownloadedAudioBitrate;
        }

        public int getCurrentDownloadVideoBitrate() {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null || tTVideoEngine.mMediaPlayer == null) {
                return -1;
            }
            return tTVideoEngine.mMediaPlayer.getIntOption(601, -1);
        }

        public int getMaxCacheAudioTime() {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
            }
            MediaPlayer mediaPlayer = tTVideoEngine.mMediaPlayer;
            if (mediaPlayer == null) {
                return VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
            }
            int intOption = mediaPlayer.getIntOption(24, -1);
            if (intOption > 0) {
                return intOption * 1000;
            }
            return VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
        }

        public int getMaxCacheVideoTime() {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
            }
            MediaPlayer mediaPlayer = tTVideoEngine.mMediaPlayer;
            if (mediaPlayer == null) {
                return VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
            }
            int intOption = mediaPlayer.getIntOption(24, -1);
            if (intOption > 0) {
                return intOption * 1000;
            }
            return VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
        }

        public float getPlaySpeed() {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null || tTVideoEngine.mPlaybackParams == null) {
                return 1.0f;
            }
            return tTVideoEngine.mPlaybackParams.getSpeed();
        }

        public int getPlayerAudioCacheTime() {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return -1;
            }
            MediaPlayer mediaPlayer = tTVideoEngine.mMediaPlayer;
            if (mediaPlayer == null) {
                return -1;
            }
            return (int) mediaPlayer.getLongOption(73, -1);
        }

        public int getPlayerVideoCacheTime() {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine == null) {
                return -1;
            }
            MediaPlayer mediaPlayer = tTVideoEngine.mMediaPlayer;
            if (mediaPlayer == null) {
                return -1;
            }
            return (int) mediaPlayer.getLongOption(72, -1);
        }

        public float getNetworkSpeed() {
            if (TTVideoEngine.sNetSpeedPredictor == null) {
                return -1.0f;
            }
            float speed = TTVideoEngine.sNetSpeedPredictor.getSpeed();
            TTVideoEngineLog.m110644d("TTVideoEngine", C2240a.m6772a("[ABR] get network speed:%f", new Object[]{Float.valueOf(speed)}));
            return speed;
        }

        public MyPlayStateSupplier(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$MyPreparedListener */
    static class MyPreparedListener implements OnPreparedListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MyPreparedListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine != null && tTVideoEngine.mMediaPlayer != null) {
                TTVideoEngineLog.m110647i("TTVideoEngine", "reveive onPrepared");
                tTVideoEngine.mErrorCount = 0;
                tTVideoEngine.mError = null;
                if (tTVideoEngine.mMediaPlayer != null) {
                    tTVideoEngine.mDuration = tTVideoEngine.mMediaPlayer.getDuration();
                }
                tTVideoEngine.mPrepared = true;
                if (tTVideoEngine.mLogger != null) {
                    tTVideoEngine.mLogger.prepareEnd();
                    tTVideoEngine.mLogger.setDuration(tTVideoEngine.mDuration);
                }
                if (tTVideoEngine.mVideoEngineListener != null) {
                    tTVideoEngine.mVideoEngineListener.onPrepared(tTVideoEngine);
                }
                if (tTVideoEngine.mMediaPlayer == null) {
                    TTVideoEngineLog.m110646e("TTVideoEngine", "onPrepared mediaplayer is null!");
                    return;
                }
                if (tTVideoEngine.mMediaPlayer != null && ((!tTVideoEngine.mPausedBeforePrepared && tTVideoEngine.mShouldPlay) || (!tTVideoEngine.mIsStartPlayAutomatically && tTVideoEngine.mNotifyBufferingDirectly == 0))) {
                    tTVideoEngine.mMediaPlayer.start();
                }
                if (tTVideoEngine.mMediaPlayer != null && tTVideoEngine.mSwitchingResolution && !tTVideoEngine.mShouldPlay) {
                    tTVideoEngine.mMediaPlayer.start();
                    tTVideoEngine.mMediaPlayer.pause();
                }
                if (tTVideoEngine.mPlaybackParams != null && tTVideoEngine.isSystemPlayer() && VERSION.SDK_INT >= 23) {
                    if (tTVideoEngine.mMediaPlayer != null) {
                        tTVideoEngine.mMediaPlayer.setPlaybackParams(tTVideoEngine.mPlaybackParams);
                    }
                    tTVideoEngine.mLogger.setPlaybackParams(tTVideoEngine.mPlaybackParams);
                }
                if (tTVideoEngine.mMediaPlayer != null && tTVideoEngine.mMediaPlayer.getIntOption(62, -100) == 0 && !tTVideoEngine.mPausedBeforePrepared && tTVideoEngine.mShouldPlay) {
                    tTVideoEngine._renderStart();
                }
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$MyReleaseRunnable */
    static class MyReleaseRunnable implements Runnable {
        private MediaPlayer mPlayer;

        public void run() {
            if (this.mPlayer != null) {
                try {
                    TTVideoEngineLog.m110647i("TTVideoEngine", "MyReleaseRunnable release");
                    this.mPlayer.release();
                    this.mPlayer = null;
                } catch (Exception e) {
                    TTVideoEngineLog.m110646e("TTVideoEngine", e.toString());
                }
            }
        }

        public MyReleaseRunnable(MediaPlayer mediaPlayer) {
            this.mPlayer = mediaPlayer;
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$MySeekCompletionListener */
    static class MySeekCompletionListener implements OnSeekCompleteListener {
        private final WeakReference<TTVideoEngine> mVideoEngineRef;

        public MySeekCompletionListener(TTVideoEngine tTVideoEngine) {
            this.mVideoEngineRef = new WeakReference<>(tTVideoEngine);
        }

        public void onSeekComplete(MediaPlayer mediaPlayer) {
            TTVideoEngine tTVideoEngine = (TTVideoEngine) this.mVideoEngineRef.get();
            if (tTVideoEngine != null) {
                tTVideoEngine._seekComplete(true);
            }
        }
    }

    /* renamed from: com.ss.ttvideoengine.TTVideoEngine$URLInfo */
    class URLInfo {
        public String hostURL;
        public String ipURL;
        public boolean isIp;

        public String getCurrentURL() {
            if (this.isIp) {
                return this.ipURL;
            }
            return this.hostURL;
        }

        public void reset() {
            this.hostURL = null;
            this.ipURL = null;
            this.isIp = false;
        }

        private URLInfo() {
        }

        public void setHostURL(String str) {
            this.hostURL = str;
            this.isIp = false;
        }

        public void setIpURL(String str) {
            this.ipURL = str;
            this.isIp = true;
        }
    }

    public static int[] getDNSType() {
        return sDNSType;
    }

    public static String getEngineVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public static boolean isExpiredIpEnable() {
        return false;
    }

    public static boolean isForceUseLitePlayer() {
        return mForceUseLitePlayer;
    }

    public static boolean isForceUsePluginPlayer() {
        return mForceUsePluginPlayer;
    }

    public static boolean isHttpDnsFirst() {
        return HTTP_DNS_FIRST;
    }

    public static boolean isUsingTTNETHttpDns() {
        return false;
    }

    public static void setExpiredIpEnable(boolean z) {
    }

    public static void setUsingTTNETHttpDns(boolean z) {
    }

    public int getBufferingType() {
        return this.mBufferingType;
    }

    public boolean getCacheControlEnabled() {
        return this.mCacheControlEnabled;
    }

    public Resolution getCurrentResolution() {
        return this.currentResolution;
    }

    public int getDuration() {
        return this.mDuration;
    }

    public int getLoadState() {
        return this.mLoadState;
    }

    public int getLoadedProgress() {
        return this.mLoadedProgress;
    }

    public int getPlaybackState() {
        return this.mPlaybackState;
    }

    public VideoModel getVideoModel() {
        return this.mVideoModel;
    }

    public boolean isDashSource() {
        return this.mIsDashSource;
    }

    public boolean isShouldPlay() {
        return this.mShouldPlay;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public static void addTask(String str, String str2, String str3, long j) {
        DataLoaderHelper.getDataLoader().addTask(str, str2, str3, j);
    }

    public static void addTask(String str, String str2, String[] strArr, long j) {
        DataLoaderHelper.getDataLoader().addTask(str, str2, strArr, j);
    }

    public static void addTask(String[] strArr, String str, long j, String str2) {
        DataLoaderHelper.getDataLoader().addTask(strArr, str, j, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x04e9  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0574  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x057f  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x07ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void _playInternal(java.lang.String r19, java.util.HashMap r20) {
        /*
            r18 = this;
            r1 = r18
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 4
            r3 = 0
            r4 = 3
            if (r0 == 0) goto L_0x0028
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            int r0 = r0.getPlayerType()
            if (r0 == 0) goto L_0x0021
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            int r0 = r0.getPlayerType()
            if (r0 == r4) goto L_0x0021
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            int r0 = r0.getPlayerType()
            if (r0 != r2) goto L_0x0028
        L_0x0021:
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r0.release()
            r1.mMediaPlayer = r3
        L_0x0028:
            com.ss.ttvideoengine.TTVideoEngine$URLInfo r0 = r1.mURLInfo
            java.lang.String r0 = r0.hostURL
            r1._logFirstURL(r0)
            r18._settingCongureWithPlayer()
            com.ss.ttvideoengine.model.VideoModel r0 = r1.mVideoModel
            r5 = r19
            boolean r0 = r1.isSupportFileCache(r5, r0)
            int r6 = r1.mUseTextureRender
            if (r6 == 0) goto L_0x0045
            com.ss.texturerender.TextureRenderManager r6 = r1.mTextureRenderer
            if (r6 != 0) goto L_0x0045
            r18.setupTextureRender()
        L_0x0045:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r1.mConfigParams
            r7 = 100
            r8 = 2
            r9 = 0
            r10 = 1
            if (r6 == 0) goto L_0x0096
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r1.mConfigParams
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            int r12 = r1.mPlayerType
            if (r12 == r8) goto L_0x005a
            r12 = 1
            goto L_0x005b
        L_0x005a:
            r12 = 0
        L_0x005b:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r6.put(r11, r12)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r1.mConfigParams
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            int r12 = r1.mPlayerType
            if (r12 != r10) goto L_0x006e
            r12 = 1
            goto L_0x006f
        L_0x006e:
            r12 = 0
        L_0x006f:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r6.put(r11, r12)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r1.mConfigParams
            r11 = 11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r12 = r1.mForbidOSPlayer
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r6.put(r11, r12)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r1.mConfigParams
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            int r12 = r1.mConfigParamsOption
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r6.put(r11, r12)
        L_0x0096:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r11 = 133(0x85, float:1.86E-43)
            r12 = -1
            r13 = 14
            if (r6 != 0) goto L_0x0591
            com.ss.ttm.player.MediaPlayer r6 = r1.mAsyncPlayer
            if (r6 == 0) goto L_0x00aa
            com.ss.ttm.player.MediaPlayer r6 = r1.mAsyncPlayer
            r1.mMediaPlayer = r6
            r1.mAsyncPlayer = r3
            goto L_0x00b0
        L_0x00aa:
            com.ss.ttm.player.MediaPlayer r6 = r18._createPlayer()
            r1.mMediaPlayer = r6
        L_0x00b0:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r14 = -9993(0xffffffffffffd8f7, float:NaN)
            if (r6 != 0) goto L_0x00c3
            com.ss.ttvideoengine.utils.Error r0 = new com.ss.ttvideoengine.utils.Error
            java.lang.String r2 = "kTTVideoErrorDomainVideoOwnPlayer"
            java.lang.String r3 = "create player failed"
            r0.<init>(r2, r14, r3)
            r1._notifyError(r0)
            return
        L_0x00c3:
            boolean r6 = r1.mDashEnabled
            if (r6 != 0) goto L_0x00cf
            boolean r6 = r1.mH265Enabled
            if (r6 != 0) goto L_0x00cf
            boolean r6 = r1.mHttpsEnabled
            if (r6 == 0) goto L_0x00e8
        L_0x00cf:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            if (r6 == 0) goto L_0x00e8
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            boolean r6 = r6.isOSPlayer()
            if (r6 == 0) goto L_0x00e8
            com.ss.ttvideoengine.utils.Error r0 = new com.ss.ttvideoengine.utils.Error
            java.lang.String r2 = "kTTVideoErrorDomainVideoOwnPlayer"
            java.lang.String r3 = "create own player failed"
            r0.<init>(r2, r14, r3)
            r1._receivedError(r0)
            return
        L_0x00e8:
            boolean r6 = r1.mDashEnabled
            if (r6 != 0) goto L_0x00f4
            boolean r6 = r1.mH265Enabled
            if (r6 != 0) goto L_0x00f4
            boolean r6 = r1.mHttpsEnabled
            if (r6 == 0) goto L_0x0117
        L_0x00f4:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            if (r6 == 0) goto L_0x0117
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            int r6 = r6.getPlayerType()
            if (r6 == r4) goto L_0x0108
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            int r6 = r6.getPlayerType()
            if (r6 != r2) goto L_0x0117
        L_0x0108:
            com.ss.ttvideoengine.utils.Error r0 = new com.ss.ttvideoengine.utils.Error
            java.lang.String r2 = "kTTVideoErrorDomainVideoOwnPlayer"
            r3 = -9989(0xffffffffffffd8fb, float:NaN)
            java.lang.String r4 = "create own plugin player failed"
            r0.<init>(r2, r3, r4)
            r1._receivedError(r0)
            return
        L_0x0117:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            int r6 = r6.getPlayerType()
            switch(r6) {
                case 0: goto L_0x012d;
                case 1: goto L_0x012a;
                case 2: goto L_0x0127;
                case 3: goto L_0x0124;
                case 4: goto L_0x0121;
                default: goto L_0x0120;
            }
        L_0x0120:
            goto L_0x012f
        L_0x0121:
            r1.mPlayerType = r2
            goto L_0x012f
        L_0x0124:
            r1.mPlayerType = r4
            goto L_0x012f
        L_0x0127:
            r1.mPlayerType = r10
            goto L_0x012f
        L_0x012a:
            r1.mPlayerType = r9
            goto L_0x012f
        L_0x012d:
            r1.mPlayerType = r8
        L_0x012f:
            int r6 = r1.mCacheFileEnable
            if (r6 != r10) goto L_0x0159
            if (r0 == 0) goto L_0x0159
            int r6 = r1.mDataLoaderEnable
            if (r6 > 0) goto L_0x0159
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r6.setIntOption(r13, r10)
            java.lang.String r6 = r18.getDefaultCacheFileDirPath()
            java.lang.String r14 = r1.mDefaultCacheDir
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x014c
            java.lang.String r6 = r1.mDefaultCacheDir
        L_0x014c:
            com.ss.ttm.player.MediaPlayer r14 = r1.mMediaPlayer
            r15 = 34
            r14.setStringOption(r15, r6)
            com.ss.ttvideoengine.log.IVideoEventLogger r6 = r1.mLogger
            r6.useCacheFile(r10)
            goto L_0x015e
        L_0x0159:
            com.ss.ttvideoengine.log.IVideoEventLogger r6 = r1.mLogger
            r6.useCacheFile(r9)
        L_0x015e:
            com.ss.ttvideoengine.log.IVideoEventLogger r6 = r1.mLogger
            if (r6 == 0) goto L_0x0169
            com.ss.ttvideoengine.log.IVideoEventLogger r6 = r1.mLogger
            boolean r14 = r1.mIsStartPlayAutomatically
            r6.enableStartPlayAutomatically(r14)
        L_0x0169:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r14 = 185(0xb9, float:2.59E-43)
            int r15 = r1.mSoloPlayEnable
            r6.setIntOption(r14, r15)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            boolean r14 = r1.mIsStartPlayAutomatically
            r14 = r14 ^ r10
            r15 = 196(0xc4, float:2.75E-43)
            r6.setIntOption(r15, r14)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r14 = 201(0xc9, float:2.82E-43)
            int r7 = r1.mIsDisableShortSeek
            r6.setIntOption(r14, r7)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r7 = 94
            int r14 = r1.mSetTrackVolume
            r6.setIntOption(r7, r14)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r7 = 95
            int r14 = r1.mMovPreferNearestSample
            r6.setIntOption(r7, r14)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r7 = 96
            int r14 = r1.mSkipFfmpegFindStreamInfo
            r6.setIntOption(r7, r14)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            int r7 = r1.mDisableAccurateStart
            r6.setIntOption(r11, r7)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r7 = 81
            int r11 = r1.mBufferTimeout
            r6.setIntOption(r7, r11)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r7 = 9
            int r11 = r1.mNetworkTimeout
            int r14 = PLAYER_TIME_BASE
            int r11 = r11 * r14
            r6.setIntOption(r7, r11)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r7 = 197(0xc5, float:2.76E-43)
            int r11 = r1.mOriginalRetry
            r6.setIntOption(r7, r11)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r7 = 253(0xfd, float:3.55E-43)
            int r11 = r1.mAccurateLayout
            r6.setIntOption(r7, r11)
            com.ss.ttvideoengine.log.IVideoEventLogger r6 = r1.mLogger
            int r7 = r1.mBufferTimeout
            r6.setSettingLog(r10, r7)
            int r6 = r1.mEGLNeedWorkAround
            if (r6 != 0) goto L_0x01e3
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r7 = 183(0xb7, float:2.56E-43)
            int r11 = r1.mEGLNeedWorkAround
            r6.setIntOption(r7, r11)
        L_0x01e3:
            boolean r6 = r1.mDashEnabled
            if (r6 == 0) goto L_0x022d
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r7 = 132(0x84, float:1.85E-43)
            r6.setIntOption(r7, r10)
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r7 = 172(0xac, float:2.41E-43)
            int r11 = r1.mDashAbr
            r6.setIntOption(r7, r11)
            com.bytedance.vcloud.abrmodule.IABRModule r6 = r1.mABRModule
            if (r6 == 0) goto L_0x022d
            int r6 = r1.mDashAbr
            if (r6 <= 0) goto L_0x022d
            com.bytedance.vcloud.abrmodule.IABRModule r6 = r1.mABRModule
            com.bytedance.vcloud.abrmodule.ABRResult r6 = r6.getStartupBitrate()
            if (r6 == 0) goto L_0x0226
            com.bytedance.vcloud.abrmodule.ABRResultElement r6 = r6.get(r9)
            if (r6 == 0) goto L_0x0226
            long r6 = r6.getBitrate()
            int r6 = (int) r6
            java.lang.String r7 = "TTVideoEngine"
            java.lang.String r11 = "[ABR] predict start bitrate:%dbps"
            java.lang.Object[] r14 = new java.lang.Object[r10]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r6)
            r14[r9] = r16
            java.lang.String r11 = com.C2240a.m6772a(r11, r14)
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110644d(r7, r11)
            goto L_0x0227
        L_0x0226:
            r6 = -1
        L_0x0227:
            com.bytedance.vcloud.abrmodule.IABRModule r7 = r1.mABRModule
            r7.start()
            goto L_0x022e
        L_0x022d:
            r6 = -1
        L_0x022e:
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 67
            int r14 = r1.mDecoderType
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            boolean r11 = r1.mIsStartPlayAutomatically
            r11 = r11 ^ r10
            r7.setIntOption(r15, r11)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 86
            int r14 = r1.mBufferDataMiliSeconds
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 110(0x6e, float:1.54E-43)
            int r14 = r1.mMaxBufferDataMilliSeconds
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 111(0x6f, float:1.56E-43)
            int r14 = r1.mUnsupportSampleRatesInBinary
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 159(0x9f, float:2.23E-43)
            int r14 = r1.mFrameDropNum
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 195(0xc3, float:2.73E-43)
            int r14 = r1.mLoopReferVideo
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 79
            int r14 = r1.mTestNetSpeed
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 66
            int r14 = r1.mTestNetSpeedDiff
            r7.setIntOption(r11, r14)
            com.ss.ttvideoengine.log.IVideoEventLogger r7 = r1.mLogger
            int r11 = r1.mDecoderType
            r7.decoderType(r11)
            int r7 = r1.mPlayerCache
            if (r7 == 0) goto L_0x0296
            boolean r7 = r1.mCacheControlEnabled
            if (r7 == 0) goto L_0x0296
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 24
            int r14 = r1.mPlayerCache
            r7.setIntOption(r11, r14)
        L_0x0296:
            float r7 = r1.mVolume
            r11 = 0
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 < 0) goto L_0x02a4
            float r7 = r1.mVolume
            float r11 = r1.mVolume
            r1._setPlayerVolume(r7, r11)
        L_0x02a4:
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 159(0x9f, float:2.23E-43)
            int r14 = r1.mFrameDropNum
            r7.setIntOption(r11, r14)
            com.ss.ttvideoengine.log.IVideoEventLogger r7 = r1.mLogger
            if (r7 == 0) goto L_0x02b8
            com.ss.ttvideoengine.log.IVideoEventLogger r7 = r1.mLogger
            int r11 = r1.mFrameDropNum
            r7.setFramesDropNum(r11)
        L_0x02b8:
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 83
            int r14 = r1.mTestAction
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 37
            int r14 = r1.mEnhancementType
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 38
            int r14 = r1.mScaleType
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 36
            int r14 = r1.mLayoutType
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 56
            int r14 = r1.mRenderType
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 301(0x12d, float:4.22E-43)
            int r14 = r1.mExposeSignal
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 211(0xd3, float:2.96E-43)
            int r14 = r1.mNotifyBufferingDirectly
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 247(0xf7, float:3.46E-43)
            int r14 = r1.mDisablePlayerTimeOut
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 248(0xf8, float:3.48E-43)
            int r14 = r1.mEnableSeekInterrupt
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 134(0x86, float:1.88E-43)
            int r14 = r1.mMaxFps
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 192(0xc0, float:2.69E-43)
            int r14 = r1.mKsyFrameWait
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 165(0xa5, float:2.31E-43)
            int r14 = r1.mSuperRes
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            int r7 = r7.getPlayerType()
            if (r7 == r10) goto L_0x033d
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            int r7 = r7.getPlayerType()
            if (r7 == r8) goto L_0x033d
            boolean r7 = r1.mUsePlayer3
            if (r7 == 0) goto L_0x033b
            r1.mHardwareDecodeEnablePlayer3 = r9
            goto L_0x033d
        L_0x033b:
            r1.mHardwareDecodeEnablePlayer2 = r9
        L_0x033d:
            boolean r7 = r1.mUsePlayer3
            if (r7 == 0) goto L_0x036e
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 59
            int r14 = r1.mHardwareDecodeEnablePlayer3
            r7.setIntOption(r11, r14)
            com.ss.ttvideoengine.log.IVideoEventLogger r7 = r1.mLogger
            int r11 = r1.mHardwareDecodeEnablePlayer3
            r7.useHardwareDecode(r11)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 803(0x323, float:1.125E-42)
            int r14 = r1.mUseAudioHWDec
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 49
            int r14 = r1.mDefaultRenderType
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 802(0x322, float:1.124E-42)
            int r14 = r1.mVoiceType
            r7.setIntOption(r11, r14)
            goto L_0x03f0
        L_0x036e:
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 263(0x107, float:3.69E-43)
            int r14 = r1.mDelayBufferingUpdate
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 261(0x105, float:3.66E-43)
            int r14 = r1.mRadioModeEnable
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 59
            int r14 = r1.mHardwareDecodeEnablePlayer2
            r7.setIntOption(r11, r14)
            com.ss.ttvideoengine.log.IVideoEventLogger r7 = r1.mLogger
            int r11 = r1.mHardwareDecodeEnablePlayer2
            r7.useHardwareDecode(r11)
            int r7 = r1.mEnableVolumeBalance
            if (r7 != r10) goto L_0x03c1
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 302(0x12e, float:4.23E-43)
            int r14 = r1.mEnableVolumeBalance
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 303(0x12f, float:4.25E-43)
            float r14 = r1.mAEPreGain
            r7.setFloatOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 304(0x130, float:4.26E-43)
            float r14 = r1.mAEThreshold
            r7.setFloatOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 306(0x132, float:4.29E-43)
            float r14 = r1.mAEPredelay
            r7.setFloatOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 305(0x131, float:4.27E-43)
            float r14 = r1.mAERatio
            r7.setFloatOption(r11, r14)
        L_0x03c1:
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 166(0xa6, float:2.33E-43)
            int r14 = r1.mSuperResFxaa
            r7.setIntOption(r11, r14)
            com.ss.ttvideoengine.log.IVideoEventLogger r7 = r1.mLogger
            if (r7 == 0) goto L_0x03d5
            com.ss.ttvideoengine.log.IVideoEventLogger r7 = r1.mLogger
            int r11 = r1.mSuperRes
            r7.useSuperRes(r11)
        L_0x03d5:
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 167(0xa7, float:2.34E-43)
            int r14 = r1.mSuperResStrengh
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 199(0xc7, float:2.79E-43)
            int r14 = r1.mSkipAudioGraph
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 256(0x100, float:3.59E-43)
            int r14 = r1.mEglVersion
            r7.setIntOption(r11, r14)
        L_0x03f0:
            boolean r7 = r1.mUsePlayer3
            if (r7 != 0) goto L_0x0468
            int r7 = r1.mHardwareDecodeEnablePlayer2
            if (r7 != r10) goto L_0x0468
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 254(0xfe, float:3.56E-43)
            int r14 = r1.mNeedAdaptiveWorkaround
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 400(0x190, float:5.6E-43)
            int r14 = r1.mUseCodecPool
            r7.setIntOption(r11, r14)
            com.ss.ttvideoengine.log.IVideoEventLogger r7 = r1.mLogger
            int r11 = r1.mUseCodecPool
            r7.useCodecPool(r11)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 182(0xb6, float:2.55E-43)
            int r14 = r1.mCodecId
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 181(0xb5, float:2.54E-43)
            int r14 = r1.mAsyncInitEnable
            r7.setIntOption(r11, r14)
            com.ss.ttvideoengine.log.IVideoEventLogger r7 = r1.mLogger
            int r11 = r1.mAsyncInitEnable
            int r14 = r1.mCodecId
            r7.useAsyncInit(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 90
            int r14 = r1.mMediaCodecSyncMode
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 215(0xd7, float:3.01E-43)
            int r14 = r1.mUseQcomLowLatency
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 216(0xd8, float:3.03E-43)
            int r14 = r1.mMediaCodecSkipNonRef
            r7.setIntOption(r11, r14)
            int r7 = r1.mUseQcomVpp
            if (r7 != r10) goto L_0x045d
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 212(0xd4, float:2.97E-43)
            int r14 = r1.mUseQcomVpp
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 213(0xd5, float:2.98E-43)
            int r14 = r1.mQcomVppLevel
            r7.setIntOption(r11, r14)
        L_0x045d:
            int r7 = r1.mEnableOppoControl
            if (r7 != r10) goto L_0x0468
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 184(0xb8, float:2.58E-43)
            r7.setIntOption(r11, r10)
        L_0x0468:
            int r7 = r1.mEnableSharp
            if (r7 != r10) goto L_0x0473
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 189(0xbd, float:2.65E-43)
            r7.setIntOption(r11, r10)
        L_0x0473:
            int r7 = r1.mTimeBarPercentage
            if (r7 != r10) goto L_0x047e
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 312(0x138, float:4.37E-43)
            r7.setIntOption(r11, r10)
        L_0x047e:
            long r14 = r1.mALogWriteAddr
            r16 = 0
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x048f
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 231(0xe7, float:3.24E-43)
            long r14 = r1.mALogWriteAddr
            r7.setLongOption(r11, r14)
        L_0x048f:
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 223(0xdf, float:3.12E-43)
            int r14 = r1.mOutputLog
            r7.setIntOption(r11, r14)
            long r14 = r1.mAudioProcessorAddr
            r16 = 0
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x04a9
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 251(0xfb, float:3.52E-43)
            long r14 = r1.mAudioProcessorAddr
            r7.setLongOption(r11, r14)
        L_0x04a9:
            int r7 = r1.mHardwareDropNonRef
            if (r7 <= 0) goto L_0x04b6
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 252(0xfc, float:3.53E-43)
            int r14 = r1.mHardwareDropNonRef
            r7.setIntOption(r11, r14)
        L_0x04b6:
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 88
            int r14 = r1.mMediaCodecRender
            r7.setIntOption(r11, r14)
            com.ss.ttvideoengine.log.IVideoEventLogger r7 = r1.mLogger
            if (r7 == 0) goto L_0x04ca
            com.ss.ttvideoengine.log.IVideoEventLogger r7 = r1.mLogger
            int r11 = r1.mSuperRes
            r7.useSuperRes(r11)
        L_0x04ca:
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 166(0xa6, float:2.33E-43)
            int r14 = r1.mSuperResFxaa
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 167(0xa7, float:2.34E-43)
            int r14 = r1.mSuperResStrengh
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 199(0xc7, float:2.79E-43)
            int r14 = r1.mSkipAudioGraph
            r7.setIntOption(r11, r14)
            com.ss.ttvideoengine.log.IVideoEventLogger r7 = r1.mLogger
            if (r7 == 0) goto L_0x04f0
            com.ss.ttvideoengine.log.IVideoEventLogger r7 = r1.mLogger
            int r11 = r1.mMediaCodecRender
            r7.setMediaCodecRender(r11)
        L_0x04f0:
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 97
            int r14 = r1.mUseMediacodecAudio
            r7.setIntOption(r11, r14)
            int r7 = r1.mEnableVolumeBalance
            if (r7 != r10) goto L_0x052a
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 302(0x12e, float:4.23E-43)
            int r14 = r1.mEnableVolumeBalance
            r7.setIntOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 303(0x12f, float:4.25E-43)
            float r14 = r1.mAEPreGain
            r7.setFloatOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 304(0x130, float:4.26E-43)
            float r14 = r1.mAEThreshold
            r7.setFloatOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 306(0x132, float:4.29E-43)
            float r14 = r1.mAEPredelay
            r7.setFloatOption(r11, r14)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r11 = 305(0x131, float:4.27E-43)
            float r14 = r1.mAERatio
            r7.setFloatOption(r11, r14)
        L_0x052a:
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            com.ss.ttvideoengine.TTVideoEngine$MyPreparedListener r11 = new com.ss.ttvideoengine.TTVideoEngine$MyPreparedListener
            r11.<init>(r1)
            r7.setOnPreparedListener(r11)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            com.ss.ttvideoengine.TTVideoEngine$MyBufferingUpdateListener r11 = new com.ss.ttvideoengine.TTVideoEngine$MyBufferingUpdateListener
            r11.<init>(r1)
            r7.setOnBufferingUpdateListener(r11)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            com.ss.ttvideoengine.TTVideoEngine$MyCompletionListener r11 = new com.ss.ttvideoengine.TTVideoEngine$MyCompletionListener
            r11.<init>(r1)
            r7.setOnCompletionListener(r11)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            com.ss.ttvideoengine.TTVideoEngine$MyErrorListener r11 = new com.ss.ttvideoengine.TTVideoEngine$MyErrorListener
            r11.<init>(r1)
            r7.setOnErrorListener(r11)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            com.ss.ttvideoengine.TTVideoEngine$MySeekCompletionListener r11 = new com.ss.ttvideoengine.TTVideoEngine$MySeekCompletionListener
            r11.<init>(r1)
            r7.setOnSeekCompleteListener(r11)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            com.ss.ttvideoengine.TTVideoEngine$MyInfoListener r11 = new com.ss.ttvideoengine.TTVideoEngine$MyInfoListener
            r11.<init>(r1)
            r7.setOnInfoListener(r11)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            com.ss.ttvideoengine.TTVideoEngine$MyOnVideoSizeChangedListener r11 = new com.ss.ttvideoengine.TTVideoEngine$MyOnVideoSizeChangedListener
            r11.<init>(r1)
            r7.setOnVideoSizeChangedListener(r11)
            android.view.SurfaceHolder r7 = r1.mSurfaceHolder
            if (r7 == 0) goto L_0x057b
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            android.view.SurfaceHolder r11 = r1.mSurfaceHolder
            r7.setDisplay(r11)
        L_0x057b:
            android.view.Surface r7 = r1.mSurface
            if (r7 == 0) goto L_0x0584
            android.view.Surface r7 = r1.mSurface
            r1.setSurfaceHook(r7)
        L_0x0584:
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r7.setScreenOnWhilePlaying(r10)
            boolean r7 = r1.mIsMute
            r1._setPlayerMute(r7)
            r1.mPrepared = r9
            goto L_0x05e6
        L_0x0591:
            com.ss.ttvideoengine.utils.Error r6 = r1.mError
            if (r6 != 0) goto L_0x0599
            boolean r6 = r1.mSwitchingResolution
            if (r6 == 0) goto L_0x05e5
        L_0x0599:
            java.lang.String r6 = "TTVideoEngine"
            java.lang.String r7 = "mediaPlayer reset, surface holder empty:%b ,surace empty:%b"
            java.lang.Object[] r14 = new java.lang.Object[r8]
            android.view.SurfaceHolder r15 = r1.mSurfaceHolder
            if (r15 != 0) goto L_0x05a5
            r15 = 1
            goto L_0x05a6
        L_0x05a5:
            r15 = 0
        L_0x05a6:
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            r14[r9] = r15
            android.view.Surface r15 = r1.mSurface
            if (r15 != 0) goto L_0x05b2
            r15 = 1
            goto L_0x05b3
        L_0x05b2:
            r15 = 0
        L_0x05b3:
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            r14[r10] = r15
            java.lang.String r7 = com.C2240a.m6772a(r7, r14)
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110647i(r6, r7)
            r18._updateLogger()
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r6.reset()
            android.view.SurfaceHolder r6 = r1.mSurfaceHolder
            if (r6 == 0) goto L_0x05d3
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            android.view.SurfaceHolder r7 = r1.mSurfaceHolder
            r6.setDisplay(r7)
        L_0x05d3:
            android.view.Surface r6 = r1.mSurface
            if (r6 == 0) goto L_0x05dc
            android.view.Surface r6 = r1.mSurface
            r1.setSurfaceHook(r6)
        L_0x05dc:
            r1.mPrepared = r9
            r1.mError = r3
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            r6.setIntOption(r11, r9)
        L_0x05e5:
            r6 = -1
        L_0x05e6:
            int r7 = r1.mDataLoaderEnable
            if (r7 <= 0) goto L_0x0600
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r11 = r1.mUsingDataLoaderPlayTaskKeys
            r7.<init>(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r14 = r1.mUsingDataLoaderPlayFilePaths
            r11.<init>(r14)
            com.ss.ttvideoengine.TTVideoEngine$6 r14 = new com.ss.ttvideoengine.TTVideoEngine$6
            r14.<init>(r11, r7)
            com.p683ss.ttvideoengine.utils.EngineThreadPool.addExecuteTask(r14)
        L_0x0600:
            boolean r7 = r1.mPrepared
            if (r7 != 0) goto L_0x0691
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            int r7 = r7.getPlayerType()
            if (r7 == r10) goto L_0x0624
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            int r7 = r7.getPlayerType()
            if (r7 == r8) goto L_0x0624
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            int r7 = r7.getPlayerType()
            if (r7 == r4) goto L_0x0624
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            int r7 = r7.getPlayerType()
            if (r7 != r2) goto L_0x0691
        L_0x0624:
            boolean r2 = r1.mIsPreloaderItem
            r7 = 17
            if (r2 == 0) goto L_0x064f
            com.ss.ttvideoengine.preloader.TTAVPreloaderItem r2 = r1.mPreloaderItem
            if (r2 == 0) goto L_0x064f
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r0.setIntOption(r13, r10)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            com.ss.ttvideoengine.preloader.TTAVPreloaderItem r2 = r1.mPreloaderItem
            java.lang.String r2 = r2.mFileKey
            r0.setStringOption(r7, r2)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            com.ss.ttvideoengine.preloader.TTAVPreloaderItem r2 = r1.mPreloaderItem
            java.lang.String r2 = r2.mFilePath
            r0.setCacheFile(r2, r10)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 18
            r7 = 20
            r0.setIntOption(r2, r7)
            goto L_0x0691
        L_0x064f:
            int r2 = r1.mCacheFileEnable
            if (r2 != r10) goto L_0x0691
            int r2 = r1.mUseExternalDir
            if (r2 != r10) goto L_0x0691
            if (r0 == 0) goto L_0x0691
            int r0 = r1.mDataLoaderEnable
            if (r0 > 0) goto L_0x0691
            java.lang.String r0 = r18.getFilePath()
            java.lang.String r2 = r18.getMediaFileKey()
            if (r0 == 0) goto L_0x0688
            if (r2 == 0) goto L_0x0688
            com.ss.ttm.player.MediaPlayer r8 = r1.mMediaPlayer
            r8.setIntOption(r13, r10)
            com.ss.ttm.player.MediaPlayer r8 = r1.mMediaPlayer
            r8.setStringOption(r7, r2)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r7.setCacheFile(r0, r10)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            r8 = 19
            int r11 = r1.mMaxFileCacheSize
            r7.setIntOption(r8, r11)
            com.ss.ttvideoengine.VideoCacheManager r7 = com.p683ss.ttvideoengine.VideoCacheManager.getInstance()
            r7.addCacheInfo(r2, r0)
        L_0x0688:
            com.ss.ttvideoengine.log.IVideoEventLogger r7 = r1.mLogger
            int r8 = r1.mCacheFileEnable
            java.lang.String r11 = r1.mCacheDir
            r7.externalCacheInfo(r8, r11, r0, r2)
        L_0x0691:
            boolean r0 = r1.mIsLocal
            if (r0 != 0) goto L_0x0766
            boolean r0 = r1.mIsDirectURL
            if (r0 != 0) goto L_0x0766
            boolean r0 = r1.mIsPlayItem
            if (r0 != 0) goto L_0x0766
            boolean r0 = r1.mIsPreloaderItem
            if (r0 != 0) goto L_0x0766
            com.ss.ttvideoengine.model.VideoInfo r0 = r1.currentVideoInfo
            if (r0 == 0) goto L_0x0766
            com.ss.ttvideoengine.model.VideoInfo r0 = r1.currentVideoInfo
            int r0 = r0.getMediatype()
            com.ss.ttvideoengine.model.VideoInfo r2 = r1.currentVideoInfo
            int r2 = r2.getValueInt(r4)
            com.ss.ttvideoengine.model.VideoInfo r7 = r1.currentVideoInfo
            boolean r7 = r1._isDashSource(r7)
            r1.mIsDashSource = r7
            com.ss.ttvideoengine.model.VideoInfo r7 = r1.currentVideoInfo
            r8 = 31
            java.lang.String r7 = r7.getValueStr(r8)
            boolean r8 = r1.mCheckHijack
            if (r8 == 0) goto L_0x06cd
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x06cd
            r8 = 1
            goto L_0x06ce
        L_0x06cd:
            r8 = 0
        L_0x06ce:
            boolean r11 = r1.mIsDashSource
            if (r11 == 0) goto L_0x06f4
            if (r6 <= 0) goto L_0x06d5
            r2 = r6
        L_0x06d5:
            com.ss.ttm.player.MediaPlayer r6 = r1.mMediaPlayer
            int r11 = com.p683ss.ttvideoengine.model.VideoRef.TYPE_VIDEO
            if (r0 != r11) goto L_0x06de
            r11 = 130(0x82, float:1.82E-43)
            goto L_0x06e0
        L_0x06de:
            r11 = 131(0x83, float:1.84E-43)
        L_0x06e0:
            r6.setIntOption(r11, r2)
            if (r8 == 0) goto L_0x06ff
            com.ss.ttm.player.MediaPlayer r2 = r1.mMediaPlayer
            int r6 = com.p683ss.ttvideoengine.model.VideoRef.TYPE_VIDEO
            if (r0 != r6) goto L_0x06ee
            r0 = 202(0xca, float:2.83E-43)
            goto L_0x06f0
        L_0x06ee:
            r0 = 203(0xcb, float:2.84E-43)
        L_0x06f0:
            r2.setStringOption(r0, r7)
            goto L_0x06ff
        L_0x06f4:
            if (r8 == 0) goto L_0x06fd
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 202(0xca, float:2.83E-43)
            r0.setStringOption(r2, r7)
        L_0x06fd:
            r1.mDashEnabled = r9
        L_0x06ff:
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 246(0xf6, float:3.45E-43)
            int r6 = r1.mHijackRetryCount
            if (r6 <= 0) goto L_0x0709
            r6 = 0
            goto L_0x070a
        L_0x0709:
            r6 = 1
        L_0x070a:
            r0.setIntOption(r2, r6)
            com.ss.ttvideoengine.log.IVideoEventLogger r0 = r1.mLogger
            r0.setCheckHijack(r8)
            com.ss.ttvideoengine.log.IVideoEventLogger r0 = r1.mLogger
            boolean r2 = r1.mHijackRetry
            r0.setHijackRetry(r2)
            boolean r0 = r1.mUsePlayer3
            if (r0 != 0) goto L_0x076a
            int r0 = r1.mHardwareDecodeEnablePlayer2
            if (r0 != r10) goto L_0x076a
            int r0 = r1.mCodecId
            com.ss.ttvideoengine.model.VideoInfo r2 = r1.currentVideoInfo
            r6 = 8
            java.lang.String r2 = r2.getValueStr(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto L_0x0744
            java.lang.String r6 = "h264"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x073b
            r0 = 0
            goto L_0x0744
        L_0x073b:
            java.lang.String r6 = "h265"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0744
            r0 = 1
        L_0x0744:
            java.lang.String r2 = "TTVideoEngine"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "videoInfo codec id = "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110647i(r2, r6)
            com.ss.ttm.player.MediaPlayer r2 = r1.mMediaPlayer
            r6 = 182(0xb6, float:2.55E-43)
            r2.setIntOption(r6, r0)
            com.ss.ttvideoengine.log.IVideoEventLogger r2 = r1.mLogger
            int r6 = r1.mAsyncInitEnable
            r2.useAsyncInit(r6, r0)
            goto L_0x076a
        L_0x0766:
            r1.mDashEnabled = r9
            r1.mIsDashSource = r9
        L_0x076a:
            boolean r0 = r1.mPrepared
            if (r0 != 0) goto L_0x084a
            boolean r0 = r1.mIsLocal
            r2 = 64
            r6 = -9987(0xffffffffffffd8fd, float:NaN)
            if (r0 != 0) goto L_0x077a
            boolean r0 = r1.mIsDirectURL
            if (r0 == 0) goto L_0x07a5
        L_0x077a:
            java.lang.String r0 = r1.mDecryptionKey
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x07a5
            com.ss.ttvideoengine.log.IVideoEventLogger r0 = r1.mLogger
            java.lang.String r7 = r1.mDecryptionKey
            r0.setEncryptKey(r7)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            int r0 = r0.getPlayerType()
            if (r0 != 0) goto L_0x079e
            com.ss.ttvideoengine.utils.Error r0 = new com.ss.ttvideoengine.utils.Error
            java.lang.String r2 = "kTTVideoErrorDomainVideoOSPlayer"
            java.lang.String r3 = "OS player can't dec encryted video"
            r0.<init>(r2, r6, r3)
            r1._receivedError(r0)
            return
        L_0x079e:
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            java.lang.String r7 = r1.mDecryptionKey
            r0.setStringOption(r2, r7)
        L_0x07a5:
            boolean r0 = r1.mDashEnabled
            if (r0 == 0) goto L_0x07b4
            com.ss.ttvideoengine.model.VideoModel r0 = r1.mVideoModel
            if (r0 == 0) goto L_0x07e8
            com.ss.ttvideoengine.model.VideoModel r0 = r1.mVideoModel
            java.lang.String r0 = r0.getSpadea()
            goto L_0x07e9
        L_0x07b4:
            boolean r0 = r1.mIsLocal
            if (r0 != 0) goto L_0x07dd
            boolean r0 = r1.mIsPlayItem
            if (r0 != 0) goto L_0x07dd
            boolean r0 = r1.mIsPreloaderItem
            if (r0 != 0) goto L_0x07dd
            boolean r0 = r1.mIsDirectURL
            if (r0 != 0) goto L_0x07dd
            com.ss.ttvideoengine.model.VideoInfo r0 = r1.currentVideoInfo
            if (r0 == 0) goto L_0x07dd
            com.ss.ttvideoengine.model.VideoInfo r0 = r1.currentVideoInfo
            r7 = 5
            java.lang.String r0 = r0.getValueStr(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x07dd
            com.ss.ttvideoengine.model.VideoInfo r0 = r1.currentVideoInfo
            r7 = 5
            java.lang.String r0 = r0.getValueStr(r7)
            goto L_0x07e9
        L_0x07dd:
            java.lang.String r0 = r1.mSpadea
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x07e8
            java.lang.String r0 = r1.mSpadea
            goto L_0x07e9
        L_0x07e8:
            r0 = r3
        L_0x07e9:
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 != 0) goto L_0x084a
            com.ss.ttvideoengine.log.IVideoEventLogger r7 = r1.mLogger
            r7.setEncryptKey(r0)
            com.ss.ttm.player.MediaPlayer r7 = r1.mMediaPlayer
            int r7 = r7.getPlayerType()
            if (r7 != 0) goto L_0x0809
            com.ss.ttvideoengine.utils.Error r0 = new com.ss.ttvideoengine.utils.Error
            java.lang.String r2 = "kTTVideoErrorDomainVideoOSPlayer"
            java.lang.String r3 = "OS player can't dec encryted video"
            r0.<init>(r2, r6, r3)
            r1._receivedError(r0)
            return
        L_0x0809:
            boolean r6 = r1.mUsePlayerSpade
            if (r6 != 0) goto L_0x0843
            byte[] r0 = com.p683ss.ttvideoengine.utils.TTHelper.base64DecodeToBytes(r0)
            java.lang.String r6 = "encryption null"
            java.lang.String r0 = com.p683ss.ttvideoengine.JniUtils.getEncryptionKeyWithCheck(r0)     // Catch:{ Throwable -> 0x0818 }
            goto L_0x081f
        L_0x0818:
            r0 = move-exception
            r6 = r0
            java.lang.String r6 = r6.toString()
            r0 = r3
        L_0x081f:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x083d
            com.ss.ttvideoengine.utils.Error r0 = new com.ss.ttvideoengine.utils.Error
            com.ss.ttm.player.MediaPlayer r2 = r1.mMediaPlayer
            boolean r2 = r2.isOSPlayer()
            if (r2 == 0) goto L_0x0832
            java.lang.String r2 = "kTTVideoErrorDomainVideoOSPlayer"
            goto L_0x0834
        L_0x0832:
            java.lang.String r2 = "kTTVideoErrorDomainVideoOwnPlayer"
        L_0x0834:
            r3 = -9988(0xffffffffffffd8fc, float:NaN)
            r0.<init>(r2, r3, r12, r6)
            r1._receivedError(r0)
            return
        L_0x083d:
            com.ss.ttm.player.MediaPlayer r3 = r1.mMediaPlayer
            r3.setStringOption(r2, r0)
            goto L_0x084a
        L_0x0843:
            com.ss.ttm.player.MediaPlayer r2 = r1.mMediaPlayer
            r3 = 144(0x90, float:2.02E-43)
            r2.setStringOption(r3, r0)
        L_0x084a:
            java.lang.String r0 = "TTVideoEngine"
            java.lang.String r2 = "set screen on"
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110644d(r0, r2)     // Catch:{ Throwable -> 0x09fc }
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer     // Catch:{ Throwable -> 0x09fc }
            r0.setScreenOnWhilePlaying(r10)     // Catch:{ Throwable -> 0x09fc }
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer     // Catch:{ Throwable -> 0x09fc }
            boolean r2 = r1.mLooping     // Catch:{ Throwable -> 0x09fc }
            r0.setLooping(r2)     // Catch:{ Throwable -> 0x09fc }
            java.io.FileDescriptor r0 = r1.mPlayFd     // Catch:{ Throwable -> 0x09fc }
            if (r0 == 0) goto L_0x086d
            com.ss.ttm.player.MediaPlayer r5 = r1.mMediaPlayer     // Catch:{ Throwable -> 0x09fc }
            java.io.FileDescriptor r6 = r1.mPlayFd     // Catch:{ Throwable -> 0x09fc }
            long r7 = r1.mPipeOffset     // Catch:{ Throwable -> 0x09fc }
            long r9 = r1.mPipeLength     // Catch:{ Throwable -> 0x09fc }
            r5.setDataSource(r6, r7, r9)     // Catch:{ Throwable -> 0x09fc }
            goto L_0x087c
        L_0x086d:
            com.ss.ttm.player.IMediaDataSource r0 = r1.mMediaDataSource     // Catch:{ Throwable -> 0x09fc }
            if (r0 == 0) goto L_0x0879
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer     // Catch:{ Throwable -> 0x09fc }
            com.ss.ttm.player.IMediaDataSource r2 = r1.mMediaDataSource     // Catch:{ Throwable -> 0x09fc }
            r0.setDataSource(r2)     // Catch:{ Throwable -> 0x09fc }
            goto L_0x087c
        L_0x0879:
            r18._setDataSource(r19, r20)     // Catch:{ Throwable -> 0x09fc }
        L_0x087c:
            boolean r0 = r18.isSystemPlayer()
            if (r0 != 0) goto L_0x095c
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            int r2 = r1.mStartTime
            r3 = 100
            r0.setIntOption(r3, r2)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 154(0x9a, float:2.16E-43)
            int r3 = r1.mReuseSocket
            r0.setIntOption(r2, r3)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 137(0x89, float:1.92E-43)
            int r3 = r1.mLoopStartTime
            r0.setIntOption(r2, r3)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 138(0x8a, float:1.93E-43)
            int r3 = r1.mLoopEndTime
            r0.setIntOption(r2, r3)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 193(0xc1, float:2.7E-43)
            int r3 = r1.mLoopCount
            r0.setIntOption(r2, r3)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 143(0x8f, float:2.0E-43)
            int r3 = r1.mSeekEndEnabled
            r0.setIntOption(r2, r3)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 206(0xce, float:2.89E-43)
            int r3 = r1.mDrmType
            r0.setIntOption(r2, r3)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 208(0xd0, float:2.91E-43)
            int r3 = r1.mDrmDowngrade
            r0.setIntOption(r2, r3)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 241(0xf1, float:3.38E-43)
            int r3 = r1.mEnableIndexCache
            r0.setIntOption(r2, r3)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 242(0xf2, float:3.39E-43)
            int r3 = r1.mEnableFragRange
            r0.setIntOption(r2, r3)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 262(0x106, float:3.67E-43)
            int r3 = r1.mEnableAsync
            r0.setIntOption(r2, r3)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 258(0x102, float:3.62E-43)
            int r3 = r1.mRangeMode
            r0.setIntOption(r2, r3)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 243(0xf3, float:3.4E-43)
            int r3 = r1.mVideoRangeSize
            r0.setIntOption(r2, r3)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 244(0xf4, float:3.42E-43)
            int r3 = r1.mAudioRangeSize
            r0.setIntOption(r2, r3)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 259(0x103, float:3.63E-43)
            int r3 = r1.mVideoRangeTime
            r0.setIntOption(r2, r3)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 260(0x104, float:3.64E-43)
            int r3 = r1.mAudioRangeTime
            r0.setIntOption(r2, r3)
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 250(0xfa, float:3.5E-43)
            int r3 = r1.mIsTTHlsDrm
            r0.setIntOption(r2, r3)
            java.lang.String r0 = r1.mVideoID
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x092c
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 205(0xcd, float:2.87E-43)
            java.lang.String r3 = r1.mVideoID
            r0.setStringOption(r2, r3)
        L_0x092c:
            java.lang.String r0 = r1.mTokenUrlTemplate
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x093d
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 207(0xcf, float:2.9E-43)
            java.lang.String r3 = r1.mTokenUrlTemplate
            r0.setStringOption(r2, r3)
        L_0x093d:
            java.lang.String r0 = r1.mTTHlsDrmToken
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x094e
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            r2 = 249(0xf9, float:3.49E-43)
            java.lang.String r3 = r1.mTTHlsDrmToken
            r0.setStringOption(r2, r3)
        L_0x094e:
            com.ss.ttvideoengine.log.IVideoEventLogger r0 = r1.mLogger
            int r2 = r1.mDrmType
            r0.setDrmType(r2)
            com.ss.ttvideoengine.log.IVideoEventLogger r0 = r1.mLogger
            java.lang.String r2 = r1.mTokenUrlTemplate
            r0.setDrmTokenUrl(r2)
        L_0x095c:
            boolean r0 = r1.mSwitchingResolution
            if (r0 != 0) goto L_0x0964
            boolean r0 = r1.mRetrying
            if (r0 == 0) goto L_0x096d
        L_0x0964:
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            int r2 = r1.mLastPlaybackTime
            r3 = 100
            r0.setIntOption(r3, r2)
        L_0x096d:
            java.lang.String r0 = r1.mDirectURL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x098b
            java.lang.String r0 = r1.mLocalURL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x098b
            com.ss.ttvideoengine.Resolution r0 = r1.currentResolution
            java.lang.String r0 = r1._resolutionToString(r0)
            r1._logFirstResolution(r0)
            java.lang.String r0 = r1.mCurrentQuality
            r1._logFirstQuality(r0)
        L_0x098b:
            boolean r0 = r1.mPrepared
            if (r0 != 0) goto L_0x09ec
            com.ss.ttm.player.PlaybackParams r0 = r1.mPlaybackParams
            if (r0 == 0) goto L_0x09a7
            boolean r0 = r18.isSystemPlayer()
            if (r0 != 0) goto L_0x09a7
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer
            com.ss.ttm.player.PlaybackParams r2 = r1.mPlaybackParams
            r0.setPlaybackParams(r2)
            com.ss.ttvideoengine.log.IVideoEventLogger r0 = r1.mLogger
            com.ss.ttm.player.PlaybackParams r2 = r1.mPlaybackParams
            r0.setPlaybackParams(r2)
        L_0x09a7:
            android.view.Surface r0 = r1.mSurface
            if (r0 != 0) goto L_0x09af
            com.ss.texturerender.VideoSurface r0 = r1.mTextureSurface
            if (r0 == 0) goto L_0x09b4
        L_0x09af:
            android.view.Surface r0 = r1.mSurface
            r1.setSurfaceHook(r0)
        L_0x09b4:
            com.ss.ttvideoengine.log.IVideoEventLogger r0 = r1.mLogger     // Catch:{ Exception -> 0x09cc }
            if (r0 == 0) goto L_0x09bd
            com.ss.ttvideoengine.log.IVideoEventLogger r0 = r1.mLogger     // Catch:{ Exception -> 0x09cc }
            r0.prepareStart()     // Catch:{ Exception -> 0x09cc }
        L_0x09bd:
            com.ss.ttm.player.MediaPlayer r0 = r1.mMediaPlayer     // Catch:{ Exception -> 0x09cc }
            r0.prepareAsync()     // Catch:{ Exception -> 0x09cc }
            com.ss.ttvideoengine.VideoEngineListener r0 = r1.mVideoEngineListener
            if (r0 == 0) goto L_0x09f9
            com.ss.ttvideoengine.VideoEngineListener r0 = r1.mVideoEngineListener
            r0.onPrepare(r1)
            goto L_0x09f9
        L_0x09cc:
            r0 = move-exception
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r0)
            com.ss.ttvideoengine.utils.Error r2 = new com.ss.ttvideoengine.utils.Error
            com.ss.ttm.player.MediaPlayer r3 = r1.mMediaPlayer
            boolean r3 = r3.isOSPlayer()
            if (r3 == 0) goto L_0x09dd
            java.lang.String r3 = "kTTVideoErrorDomainVideoOSPlayer"
            goto L_0x09df
        L_0x09dd:
            java.lang.String r3 = "kTTVideoErrorDomainVideoOwnPlayer"
        L_0x09df:
            r4 = -9992(0xffffffffffffd8f8, float:NaN)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r4, r0)
            r1._receivedError(r2)
            return
        L_0x09ec:
            com.ss.ttvideoengine.log.IVideoEventLogger r0 = r1.mLogger
            r0.prepareStart()
            com.ss.ttvideoengine.log.IVideoEventLogger r0 = r1.mLogger
            r0.prepareEnd()
            r18._resumeVideo()
        L_0x09f9:
            r1.mState = r4
            return
        L_0x09fc:
            r0 = move-exception
            com.ss.ttvideoengine.utils.Error r2 = new com.ss.ttvideoengine.utils.Error
            com.ss.ttm.player.MediaPlayer r3 = r1.mMediaPlayer
            boolean r3 = r3.isOSPlayer()
            if (r3 == 0) goto L_0x0a0a
            java.lang.String r3 = "kTTVideoErrorDomainVideoOSPlayer"
            goto L_0x0a0c
        L_0x0a0a:
            java.lang.String r3 = "kTTVideoErrorDomainVideoOwnPlayer"
        L_0x0a0c:
            r4 = -9992(0xffffffffffffd8f8, float:NaN)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r4, r0)
            r1._receivedError(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.TTVideoEngine._playInternal(java.lang.String, java.util.HashMap):void");
    }

    public static void cancelAllPreloadTasks() {
        DataLoaderHelper.getDataLoader().cancelAllTasks();
    }

    public static void clearAllCaches() {
        DataLoaderHelper.getDataLoader().clearAllCaches();
    }

    public static void closeDataLoader() {
        DataLoaderHelper.getDataLoader().close();
    }

    public EventLoggerSource getVideoEngineDataSource() {
        return new MyLoggerDataSource(this);
    }

    public float getVolume() {
        return TTHelper.getVolume(this.mContext);
    }

    private void _dataLoaderAddEngineRef() {
        DataLoaderHelper.getDataLoader()._addEngine(this, this.mUsingDataLoaderPlayRawKey);
    }

    private int _getPlayerTime() {
        if (this.mMediaPlayer == null) {
            return 0;
        }
        return this.mMediaPlayer.getCurrentPosition();
    }

    private void _resetUsingDataLoaderField() {
        this.mUsingDataLoaderPlayTaskKeys.clear();
        this.mUsingDataLoaderPlayFilePaths.clear();
        this.mUsingDataLoaderPlayRawKey = null;
    }

    public static boolean dataLoaderIsRunning() {
        return DataLoaderHelper.getDataLoader().isRunning();
    }

    public synchronized void createPlayer() {
        if (this.mAsyncPlayer == null) {
            this.mAsyncPlayer = _createPlayer();
        }
    }

    public String getCurrentPlayPath() {
        if (this.mIsLocal) {
            return this.mLocalURL;
        }
        return this.mURLInfo.hostURL;
    }

    public TTVNetClient getNetClientSetByUser() {
        if (this.mNetClient != null) {
            return this.mNetClient;
        }
        if (TTVideoEngineConfig.gNetClient != null) {
            return TTVideoEngineConfig.gNetClient;
        }
        return null;
    }

    public int getVideoHeight() {
        if (this.mMediaPlayer == null) {
            return 0;
        }
        return this.mMediaPlayer.getVideoHeight();
    }

    public int getVideoWidth() {
        if (this.mMediaPlayer == null) {
            return 0;
        }
        return this.mMediaPlayer.getVideoWidth();
    }

    public int getWatchedDuration() {
        if (this.mPlayDuration != null) {
            return this.mPlayDuration.getPlayedDuration();
        }
        return 0;
    }

    public boolean isMute() {
        if (this.mMediaPlayer != null) {
            return this.mMediaPlayer.isMute();
        }
        return this.mIsMute;
    }

    public void pauseByInterruption() {
        TTVideoEngineLog.m110647i("TTVideoEngine", "pause by interruption");
        _pauseByInterruption();
    }

    private void _initUsingHandle() {
        if (this.mHandler == null) {
            this.mHandler = new Handler(TTHelper.getLooper()) {
                public void handleMessage(Message message) {
                    super.handleMessage(message);
                    if (message.what == 10) {
                        String str = (String) message.obj;
                        long j = (long) message.arg1;
                        if (TTVideoEngine.this.mState != 5) {
                            if (TTVideoEngine.this.mUsingDataLoaderPlayFilePaths != null && TTVideoEngine.this.mUsingDataLoaderPlayFilePaths.contains(str)) {
                                TTVideoEngine.this.mVideoPreloadSize = j;
                                if (TTVideoEngine.this.mLogger != null) {
                                    TTVideoEngine.this.mLogger.setVideoCacheSize(j);
                                }
                                if (!(TTVideoEngine.this.mVideoEngineInfoListener == null || TTVideoEngine.this.mVideoEngineInfos == null)) {
                                    TTVideoEngine.this.mVideoEngineInfos.setKey("mdlfilepathhitcachesize");
                                    TTVideoEngine.this.mVideoEngineInfos.mUsingMDLPlayFilePath = str;
                                    TTVideoEngine.this.mVideoEngineInfos.mHitCacheSize = j;
                                    TTVideoEngine.this.mVideoEngineInfoListener.onVideoEngineInfos(TTVideoEngine.this.mVideoEngineInfos);
                                }
                            } else if (TTVideoEngine.this.mUsingDataLoaderPlayTaskKeys != null && TTVideoEngine.this.mUsingDataLoaderPlayTaskKeys.contains(str)) {
                                TTVideoEngine.this.mVideoPreloadSize = j;
                                if (TTVideoEngine.this.mLogger != null) {
                                    TTVideoEngine.this.mLogger.setVideoCacheSize(j);
                                }
                                if (!(TTVideoEngine.this.mVideoEngineInfoListener == null || TTVideoEngine.this.mVideoEngineInfos == null)) {
                                    TTVideoEngine.this.mVideoEngineInfos.setKey("mdlhitcachesize");
                                    TTVideoEngine.this.mVideoEngineInfos.mUsingMDLPlayTaskKey = str;
                                    TTVideoEngine.this.mVideoEngineInfos.mHitCacheSize = j;
                                    TTVideoEngine.this.mVideoEngineInfoListener.onVideoEngineInfos(TTVideoEngine.this.mVideoEngineInfos);
                                }
                            }
                        }
                    }
                }
            };
        }
    }

    private void _resetUrlIndexMap() {
        Resolution[] allResolutions = Resolution.getAllResolutions();
        for (Resolution put : allResolutions) {
            this.urlIndexMap.put(put, Integer.valueOf(0));
        }
    }

    private void createCacheFileDirectory() {
        File file = new File(this.mDefaultCacheDir);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static synchronized void releaseTextureRender() {
        synchronized (TTVideoEngine.class) {
            try {
                TextureRenderManager.getManager().release();
            } catch (NullPointerException unused) {
            }
        }
    }

    public float getMaxVolume() {
        int i;
        if (this.mContext == null) {
            return 0.0f;
        }
        AudioManager audioManager = (AudioManager) this.mContext.getSystemService("audio");
        if (audioManager != null) {
            i = audioManager.getStreamMaxVolume(3);
        } else {
            i = 0;
        }
        if (i < 0) {
            i = 0;
        }
        return (float) i;
    }

    public boolean isSystemPlayer() {
        if (this.mMediaPlayer != null) {
            return this.mMediaPlayer.isOSPlayer();
        }
        if (this.mPlayerType == 2) {
            return true;
        }
        return false;
    }

    public void pause() {
        TTVideoEngineLog.m110647i("TTVideoEngine", "pause");
        this.mShouldPlay = false;
        _pause();
        this.mPauseStartT = SystemClock.elapsedRealtime();
        if (this.mPlayDuration != null) {
            this.mPlayDuration.stop();
        }
    }

    public Resolution[] supportedResolutionTypes() {
        if (this.mIsPreloaderItem && this.mPreloaderItem != null) {
            return this.mPreloaderItem.supportResolutions();
        }
        if (this.mVideoModel != null) {
            return this.mVideoModel.getSupportResolutions();
        }
        return new Resolution[0];
    }

    private void _dataLoaderRemoveEngineRef() {
        DataLoaderHelper.getDataLoader()._removeEngine(this, this.mUsingDataLoaderPlayRawKey);
        if (this.mUsingDataLoaderPlayTaskKeys != null) {
            for (int i = 0; i < this.mUsingDataLoaderPlayTaskKeys.size(); i++) {
                DataLoaderHelper.getDataLoader()._removePlayTask((String) this.mUsingDataLoaderPlayTaskKeys.get(i));
            }
        }
        _resetUsingDataLoaderField();
    }

    private Map _getCommentInfo() {
        if (this.mMediaPlayer == null) {
            return null;
        }
        String stringOption = this.mMediaPlayer.getStringOption(47);
        HashMap hashMap = new HashMap();
        if (stringOption != null) {
            for (String split : stringOption.replaceAll(" ", "").split(",")) {
                String[] split2 = split.split(":");
                if (split2.length == 2) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        return hashMap;
    }

    private void _logFirstFrame() {
        if (!this.mHasFirstFrameShown) {
            this.mHasFirstFrameShown = true;
            if (this.mLogger != null) {
                this.mVVTime = System.currentTimeMillis();
                this.mLogger.showedOneFrame();
            }
        }
        this.mLogger.setNetworkSpeedFrom(C48918e.m105713a().mo96744b(), 0);
    }

    private void _pause() {
        TTVideoEngineLog.m110647i("TTVideoEngine", "_pause");
        if (!this.mPrepared) {
            this.mPausedBeforePrepared = true;
            _updatePlaybackState(2);
            return;
        }
        if (this.mMediaPlayer != null) {
            TTVideoEngineLog.m110647i("TTVideoEngine", "player will pause");
            if (this.mTextureSurface != null) {
                this.mTextureSurface.pause(true);
            }
            this.mMediaPlayer.pause();
            _updatePlaybackState(2);
        }
        if (this.mABRModule != null) {
            this.mABRModule.stop();
        }
    }

    private void _pauseByInterruption() {
        TTVideoEngineLog.m110647i("TTVideoEngine", "_pause ");
        if (!this.mPrepared) {
            this.mPausedBeforePrepared = true;
            return;
        }
        if (this.mMediaPlayer != null) {
            TTVideoEngineLog.m110647i("TTVideoEngine", "player will pause by interruption");
            this.mMediaPlayer.pause();
            this.mPlaybackState = 2;
        }
    }

    private void _settingCongureWithPlayer() {
        if ((this.mSettingMask & 4) == 0) {
            this.mBufferTimeout = TTVideoEngineSettingManager.getInstance(this.mContext).settingModel.mBufferTimeOut;
            TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("==========mBufferTimeout:%d", new Object[]{Integer.valueOf(this.mBufferTimeout)}));
        }
    }

    private boolean _shouldPrepare() {
        if ((this.mPlaybackState == 0 || this.mPlaybackState == 3) && !this.mPrepared) {
            return true;
        }
        if (this.mMediaPlayer == null || this.mMediaPlayer.getPlayerType() != 0 || this.mPrepared) {
            return false;
        }
        return true;
    }

    private void _tryNextURL() {
        this.urlIndexMap.put(this.currentResolution, Integer.valueOf(((Integer) this.urlIndexMap.get(this.currentResolution)).intValue() + 1));
        _parseIPAddress(this.mVideoModel);
    }

    private boolean deleteCacheFile() {
        String filePath = getFilePath();
        if (filePath == null || filePath.length() == 0) {
            return true;
        }
        File file = new File(filePath);
        try {
            if (file.isFile() && file.delete()) {
                return true;
            }
        } catch (Throwable th) {
            TTVideoEngineLog.m110645d(th);
        }
        return false;
    }

    private String getDefaultCacheFileDirPath() {
        String appFilesPath = TTHelper.getAppFilesPath(this.mContext);
        if (appFilesPath == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(appFilesPath);
        sb.append(File.separator);
        sb.append("mediattmp");
        return sb.toString();
    }

    public JSONObject getPlayErrorInfo() {
        String str;
        try {
            if (this.mMediaPlayer != null) {
                if (this.mMediaPlayer.getIntOption(5000, 0) != 0) {
                    new StringBuilder();
                    JSONObject jSONObject = new JSONObject();
                    new StringBuilder();
                    String stringOption = this.mMediaPlayer.getStringOption(5001);
                    if (this.mMediaPlayer.getIntOption(26, 1) == 1) {
                        str = "breakpad crash";
                    } else {
                        str = "simple crash";
                    }
                    jSONObject.put(str, stringOption);
                    return jSONObject;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void notifyCacheEnd() {
        if (this.mVideoEngineInfoListener != null && this.mVideoEngineInfos != null) {
            StringBuilder sb = new StringBuilder("notify cache end. source id: ");
            sb.append(this.mUsingDataLoaderPlayRawKey);
            TTVideoEngineLog.m110647i("TTVideoEngine", sb.toString());
            this.mVideoEngineInfos.setKey("mdlcacheend");
            this.mVideoEngineInfoListener.onVideoEngineInfos(this.mVideoEngineInfos);
        }
    }

    public void prepare() {
        TTVideoEngineLog.m110647i("TTVideoEngine", "prepare");
        this.mIsStartPlayAutomatically = false;
        this.mShouldPlay = true;
        this.mUserStopped = false;
        this.mAccumulatedErrorCount = 0;
        if (this.mVideoModel != null) {
            this.mVideoModel.setUpResolution(this.mResolutionMap);
        }
        _play();
        this.mIsPlayComplete = false;
    }

    public void start() {
        TTVideoEngineLog.m110647i("TTVideoEngine", "start");
        this.mShouldPlay = true;
        this.mUserStopped = false;
        this.mAccumulatedErrorCount = 0;
        _play();
        this.mIsPlayComplete = false;
        if (this.mPauseStartT != 0 && this.mLogger != null) {
            this.mLogger.accuPauseTime(SystemClock.elapsedRealtime() - this.mPauseStartT);
        }
    }

    private void _ShutdownOldSource() {
        this.mIsLocal = false;
        this.mIsDirectURL = false;
        this.mIsPreloaderItem = false;
        this.mIsPlayItem = false;
        this.mIsFeedInfo = false;
        if (this.mMediaPlayer != null && this.mMediaPlayer.getPlayerType() == 0) {
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
        }
        _reset();
        _resetUrlIndexMap();
        FetcherMaker.remove(this.mVideoID);
        this.mState = 0;
        this.currentVideoInfo = null;
        this.mVideoModel = null;
        this.mDirectURL = null;
        this.mLocalURL = null;
        this.mVideoID = null;
        this.mPlayFd = null;
        this.mDirectURL = null;
        this.mTextureFirstFrame = false;
        this.mPlayerFirstFrame = false;
        this.mTexNotifyFirstFrame = false;
        this.mPrepared = false;
        this.mHasFirstFrameShown = false;
        this.mPlayDuration.reset();
        this.mIsPlayComplete = false;
        this.mDecodedVideoFirstFrame = false;
        this.mPlayStartTimestamp = 0;
    }

    private void _play() {
        TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("_play, mState:%d", new Object[]{Integer.valueOf(this.mState)}));
        this.mStarted = true;
        this.mPausedBeforePrepared = false;
        switch (this.mState) {
            case 0:
            case 4:
                _prepareToPlay();
                return;
            case 1:
                if (this.mVideoModel == null) {
                    if (!this.mIsFetchingInfo) {
                        _prepareToPlay();
                    }
                    return;
                }
                if (!this.mIsPreloaderItem || this.mPreloaderItem == null) {
                    _logBeginToPlay(this.mVideoID);
                } else {
                    _logBeginToPlay(this.mPreloaderItem.mVideoID);
                }
                _parseIPAddress(this.mVideoModel);
                return;
            case 3:
                _replayOrResume();
                break;
        }
    }

    private void _reset() {
        TTVideoEngineLog.m110647i("TTVideoEngine", "reset");
        this.mShouldPlay = false;
        this.mIsFetchingInfo = false;
        this.mHeaders.clear();
        _stop(true, 6);
        if (this.mMediaPlayer != null) {
            if (this.mHardwareDecodeEnablePlayer2 == 1) {
                setSurfaceHook(null);
            }
            if (this.mTextureSurface != null) {
                this.mTextureSurface.pause(false);
            }
            this.mMediaPlayer.reset();
            this.mPrepared = false;
        }
        this.mHasFirstFrameShown = false;
        this.mHttpsEnabled = false;
        this.mRetryEnableHttps = false;
        this.mKeyseed = null;
        this.mFallbackAPI = null;
        this.mHijackRetryCount = 0;
        this.mLogger.reset();
    }

    private void _resumeVideo() {
        TTVideoEngineLog.m110647i("TTVideoEngine", "resumed video");
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.setScreenOnWhilePlaying(true);
            if (this.mPrepared) {
                if (this.mTextureSurface != null) {
                    this.mTextureSurface.pause(false);
                }
                this.mMediaPlayer.setIntOption(100, this.mStartTime);
                this.mMediaPlayer.start();
                if (this.mPlayDuration != null) {
                    this.mPlayDuration.start();
                }
                if (this.mMediaPlayer.getIntOption(62, -100) != 0 || (this.mPlaybackState != 0 && !this.mIsPlayComplete)) {
                    _updatePlaybackState(1);
                } else {
                    _renderStart();
                }
                if (this.mABRModule != null) {
                    this.mABRModule.start();
                }
                return;
            }
            this.mPausedBeforePrepared = false;
        }
    }

    private boolean _validateVideo() {
        if (this.mPlayAPIVersion >= 2) {
            return true;
        }
        try {
            String videoRefStr = this.mVideoModel.getVideoRefStr(105);
            boolean z = false;
            if (!TextUtils.isEmpty(videoRefStr) && !"0".equals(videoRefStr) && !isSystemPlayer()) {
                z = !this.mVideoID.equals(_getCommentInfo().get("vid"));
            }
            if (z) {
                this.mLogger.validateVideoMetaInfoFail(new Error("kTTVideoErrorDomainVideoOwnPlayer", -9991, "header meta validate failed"));
            }
        } catch (NullPointerException unused) {
        }
        return true;
    }

    private void createDefaultCacheFileDirectory() {
        if (mCreatCacheFileLock.tryLock()) {
            try {
                if (!mIsFirstOpenEngine) {
                    mCreatCacheFileLock.unlock();
                    return;
                }
                mIsFirstOpenEngine = false;
                String defaultCacheFileDirPath = getDefaultCacheFileDirPath();
                File file = new File(defaultCacheFileDirPath);
                if (!file.exists()) {
                    file.mkdirs();
                } else if (file.list() != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(defaultCacheFileDirPath);
                    sb.append("tem");
                    final File file2 = new File(sb.toString());
                    file.renameTo(file2);
                    file.mkdirs();
                    EngineThreadPool.addExecuteTask(new Runnable() {
                        public void run() {
                            TTHelper.recursionDeleteFile(file2);
                        }
                    });
                }
                EngineThreadPool.addExecuteTask(new Runnable() {
                    public void run() {
                        TTHelper.deleteBeforeDirFiles(TTVideoEngine.this.mContext);
                    }
                });
                mCreatCacheFileLock.unlock();
            } catch (Throwable th) {
                mCreatCacheFileLock.unlock();
                throw th;
            }
        }
    }

    private String getFilePath() {
        String str;
        if (this.mIsLocal || this.mIsPlayItem || this.mIsPreloaderItem) {
            return null;
        }
        if (this.mIsDirectURL) {
            return this.mFileKey;
        }
        if (TextUtils.isEmpty(this.mCacheDir) || (this.currentVideoInfo != null && TextUtils.isEmpty(this.currentVideoInfo.getValueStr(15)))) {
            return null;
        }
        String mediaFileKey = getMediaFileKey();
        if (TextUtils.isEmpty(mediaFileKey)) {
            return null;
        }
        if (this.mCacheDir.charAt(this.mCacheDir.length() - 1) == '/') {
            str = C2240a.m6772a("%s%s.ttmp", new Object[]{this.mCacheDir, mediaFileKey});
        } else {
            str = C2240a.m6772a("%s/%s.ttmp", new Object[]{this.mCacheDir, mediaFileKey});
        }
        return str;
    }

    public void _onABRGetPredictResult() {
        if (this.mABRModule != null) {
            ABRResult nextSegmentBitrate = this.mABRModule.getNextSegmentBitrate();
            if (nextSegmentBitrate != null) {
                int size = nextSegmentBitrate.size();
                if (size != 0 && size > 0) {
                    int bitrate = (int) nextSegmentBitrate.get(0).getBitrate();
                    TTVideoEngineLog.m110644d("TTVideoEngine", C2240a.m6772a("[ABR] predict next segment bitrate:%dbps", new Object[]{Integer.valueOf(bitrate)}));
                    if (this.mMediaPlayer != null) {
                        this.mMediaPlayer.setIntOption(600, bitrate);
                    }
                }
            }
        }
    }

    public int getCurrentPlaybackTime() {
        int i;
        if (this.mSwitchingResolution) {
            i = this.mLastPlaybackTime;
        } else {
            i = _getPlayerTime();
        }
        setPlayInfo(1, (long) i);
        if (this.mMediaPlayer == null || this.mP2PCDNType == 0) {
            return i;
        }
        long longOption = this.mMediaPlayer.getLongOption(73, -1);
        long longOption2 = this.mMediaPlayer.getLongOption(72, -1);
        if (longOption >= 0 && longOption2 >= 0) {
            longOption = Math.min(longOption, longOption2);
        } else if (longOption < 0) {
            if (longOption2 < 0) {
                return i;
            }
            longOption = longOption2;
        }
        setPlayInfo(5, longOption);
        return i;
    }

    public void play() {
        TTVideoEngineLog.m110647i("TTVideoEngine", "play");
        if (this.mState == 5) {
            TTVideoEngineLog.m110646e("TTVideoEngine", "already released, return");
            return;
        }
        _initUsingHandle();
        this.mShouldPlay = true;
        this.mUserStopped = false;
        this.mAccumulatedErrorCount = 0;
        if (this.mVideoModel != null) {
            this.mVideoModel.setUpResolution(this.mResolutionMap);
        }
        _play();
        this.mIsPlayComplete = false;
        if (!(this.mPauseStartT == 0 || this.mLogger == null)) {
            this.mLogger.accuPauseTime(SystemClock.elapsedRealtime() - this.mPauseStartT);
        }
    }

    public void stop() {
        TTVideoEngineLog.m110647i("TTVideoEngine", "stop");
        this.mShouldPlay = false;
        this.mIsFetchingInfo = false;
        this.mTextureFirstFrame = false;
        this.mTexNotifyFirstFrame = false;
        _stop(true, 0);
        if (this.mCleanWhenStop > 0) {
            if (this.mMediaPlayer != null) {
                this.mMediaPlayer.reset();
                this.mPrepared = false;
            }
            if (this.mMediaPlayer != null && this.mMediaPlayer.getPlayerType() == 0) {
                this.mMediaPlayer.release();
                this.mMediaPlayer = null;
            }
            if (this.mAsyncPlayer != null) {
                this.mAsyncPlayer.release();
                this.mAsyncPlayer = null;
            }
            this.mState = 0;
        }
        if (this.mTestNetSpeedHandler != null) {
            this.mTestNetSpeedHandler.removeCallbacks(this.mTestNetSpeedRunable);
        }
        _dataLoaderRemoveEngineRef();
    }

    private void _fetchVideoInfo() {
        String str;
        this.mState = 1;
        _resetUrlIndexMap();
        String _getAPIString = _getAPIString();
        if (this.mIsUseBoe) {
            _getAPIString = TTHelper.buildBoeUrl(_getAPIString);
        }
        this.mAPIString = _getAPIString;
        TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("start to fetch video info:%s", new Object[]{_getAPIString}));
        if (this.mVideoModelCache != null && !TextUtils.isEmpty(this.mVideoID) && this.mUseVideoModelCache) {
            boolean isNetAvailable = NetUtils.isNetAvailable(this.mContext);
            if ((this.mErrorCount <= 1 && isNetAvailable) || !isNetAvailable) {
                VideoModelCacheInfo videoModelCacheInfo = this.mVideoModelCache.get(this.mVideoID, this.mAPIString);
                if (videoModelCacheInfo != null && (!videoModelCacheInfo.isExpired || (videoModelCacheInfo.isExpired && !isNetAvailable && DataLoaderHelper.getDataLoader().isRunning() && this.mDataLoaderEnable > 0))) {
                    TTVideoEngineLog.m110647i("TTVideoEngine", "using videomodel cache");
                    this.mLogger.setIsVideoModelCache(1);
                    this.mVideoModel = videoModelCacheInfo.model;
                    _logFetchedVideoInfo(this.mVideoModel);
                    if (this.mVideoInfoListener == null || !this.mVideoInfoListener.onFetchedVideoInfo(this.mVideoModel)) {
                        if (this.mAsyncPlayHitVMCache && this.mHandler != null) {
                            try {
                                this.mHandler.post(new Runnable() {
                                    public void run() {
                                        TTVideoEngine.this._parseIPAddress(TTVideoEngine.this.mVideoModel);
                                    }
                                });
                                return;
                            } catch (Exception e) {
                                TTVideoEngineLog.m110646e("TTVideoEngine", e.toString());
                            }
                        }
                        _parseIPAddress(this.mVideoModel);
                        return;
                    }
                    return;
                }
            }
        }
        if (this.mUseVideoModelCache) {
            this.mLogger.setIsVideoModelCache(0);
        }
        this.mIsFetchingInfo = true;
        this.mFetcher = new VideoInfoFetcher(this.mContext, getNetClientSetByUser(), this.mTag);
        this.mFetcher.setVideoID(this.mVideoID);
        this.mFetcher.setUseVideoModelCache(this.mUseVideoModelCache);
        this.mFetcher.setPlayType(this.mPlayType);
        this.mFetcher.setListener(new MyFetcherListener(this));
        VideoInfoFetcher videoInfoFetcher = this.mFetcher;
        if (this.mPlayAPIVersion == 2) {
            str = null;
        } else {
            str = this.mAuthorization;
        }
        videoInfoFetcher.fetchInfo(_getAPIString, str, this.mPlayAPIVersion, this.mKeyseed);
        this.mFetcher.setResolutionMap(this.mResolutionMap);
    }

    private String _getAPIString() {
        String str;
        boolean z;
        int i;
        if (!TextUtils.isEmpty(this.mFallbackAPI)) {
            try {
                i = JniUtils.getDecodeMethod();
            } catch (Exception unused) {
                i = 0;
            }
            String a = C2240a.m6772a("%s&method=%d", new Object[]{this.mFallbackAPI, Integer.valueOf(i)});
            TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("api string from fallback api:%s", new Object[]{a}));
            return a;
        } else if (this.mDataSource == null) {
            return null;
        } else {
            HashMap hashMap = new HashMap();
            if (this.mUsePlayer3) {
                z = MediaPlayerWrapperVer3.tryLoadPlayerPlugin();
                str = C2236f.m6766a(14, "");
            } else {
                z = MediaPlayerWrapper.tryLoadPlayerPlugin();
                str = TTPlayerConfiger.getValue(14, "");
            }
            if (z) {
                if (this.mDashEnabled) {
                    hashMap.put("format_type", "dash");
                }
                if (this.mH265Enabled) {
                    hashMap.put("codec_type", "1");
                }
            } else {
                this.mHardwareDecodeEnablePlayer3 = 0;
                this.mHardwareDecodeEnablePlayer2 = 0;
            }
            if (this.mEnableHttps || this.mRetryEnableHttps) {
                this.mHttpsEnabled = true;
                hashMap.put("ssl", "1");
            } else {
                this.mHttpsEnabled = false;
            }
            hashMap.put("player_version", str);
            int i2 = this.mP2PCDNType;
            if (i2 > 0 && VideoLoadWrapper.getInstance().init() != 0) {
                i2 = 0;
            }
            hashMap.put("cdn_type", String.valueOf(i2));
            TTVideoEngineLog.m110647i("TTVideoEngine", hashMap.toString());
            return this.mDataSource.apiForFetcher(hashMap, this.mPlayAPIVersion);
        }
    }

    private void _replayOrResume() {
        String str;
        if (!_shouldPrepare()) {
            if (this.mIsPlayComplete) {
                _logBeginToPlay(this.mVideoID);
                if (this.mPlayDuration != null) {
                    this.mPlayDuration.clear();
                }
            }
            _resumeVideo();
        } else if (this.mIsLocal || this.mIsDirectURL || this.mPlayFd != null || this.mMediaDataSource != null) {
            _logBeginToPlay(null);
            if (this.mIsLocal) {
                str = this.mLocalURL;
            } else {
                str = this.mDirectURL;
            }
            _singleURLParseAndPlay(str, this.mHeaders);
        } else if (this.mIsPreloaderItem) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (this.mPreloaderItem.mUrlTime > 0 && currentTimeMillis - this.mPreloaderItem.mUrlTime > ((long) PLAY_URL_EXPIRE_TIME)) {
                _fetchVideoInfo();
            }
            _logBeginToPlay(this.mPreloaderItem.mVideoID);
            this.mLogger.usePreload(1);
            _singleURLParseAndPlay(this.mPreloaderItem.mUrl, this.mHeaders);
        } else if (this.mIsPlayItem) {
            _logBeginToPlay(this.mVideoID);
            _singleURLParseAndPlay(this.mPlayItem.playURL, this.mHeaders);
        } else {
            _logBeginToPlay(this.mVideoID);
            if (this.urlIPMap != null) {
                IpInfo ipInfo = (IpInfo) this.urlIPMap.get(this.mURLInfo.hostURL);
                if (ipInfo != null) {
                    ipInfo.dns = "FromCache";
                    this.urlIPMap.put(this.mURLInfo.hostURL, ipInfo);
                    _updateVU();
                }
            }
            _playInternal(this.mURLInfo.getCurrentURL(), this.mHeaders);
        }
    }

    private void _updateLogTime() {
        if (this.mLogger != null && this.mMediaPlayer != null) {
            this.mLogger.setDNSParseTime(this.mMediaPlayer.getLongOption(68, 0), 1);
            this.mLogger.setTranConnectTime(this.mMediaPlayer.getLongOption(69, 0));
            this.mLogger.setTranFirstPacketTime(this.mMediaPlayer.getLongOption(70, 0));
            this.mLogger.setReceiveFirstVideoFrameTime(this.mMediaPlayer.getLongOption(75, 0));
            this.mLogger.setReceiveFirstAudioFrameTime(this.mMediaPlayer.getLongOption(76, 0));
            this.mLogger.setDecodeFirstVideoFrameTime(this.mMediaPlayer.getLongOption(77, 0));
            this.mLogger.setDecodeFirstAudioFrameTime(this.mMediaPlayer.getLongOption(78, 0));
            this.mLogger.setPlayerHostAddr(this.mMediaPlayer.getStringOption(71));
            this.mLogger.deviceStartTime(1, this.mMediaPlayer.getLongOption(156, -1));
            this.mLogger.deviceStartTime(0, this.mMediaPlayer.getLongOption(155, -1));
            this.mLogger.devicedOpenedTime(1, this.mMediaPlayer.getLongOption(163, -1));
            this.mLogger.devicedOpenedTime(0, this.mMediaPlayer.getLongOption(162, -1));
        }
    }

    private void _updateVU() {
        ArrayList arrayList = new ArrayList();
        for (Entry entry : this.urlIPMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (!(str == null || value == null)) {
                if (value instanceof IpInfo) {
                    IpInfo ipInfo = (IpInfo) value;
                    HashMap hashMap = new HashMap();
                    hashMap.put("url", str);
                    hashMap.put("ip", ipInfo.f128649ip);
                    hashMap.put("dns", ipInfo.dns);
                    hashMap.put("dns_cache_open", Integer.valueOf(ipInfo.isDNSCacheOpen));
                    hashMap.put("server_dns_open", Integer.valueOf(ipInfo.isServerDNSOpen));
                    hashMap.put("url_desc", ipInfo.urlDesc);
                    if (this.mIsDirectURL && !TextUtils.isEmpty(this.mGroupID)) {
                        hashMap.put("gid", this.mGroupID);
                    }
                    arrayList.add(hashMap);
                } else {
                    throw new RuntimeException(value.getClass().getName());
                }
            }
        }
        this.mLogger.setVUArray(arrayList);
    }

    private String getMediaFileKey() {
        CharSequence charSequence;
        String str;
        long j;
        CharSequence charSequence2;
        String str2;
        if (this.mIsLocal || this.mIsPlayItem || this.mIsPreloaderItem) {
            return null;
        }
        if (this.mIsDirectURL) {
            return this.mFileKey;
        }
        if (this.mVideoModel == null) {
            return null;
        }
        if (this.currentVideoInfo != null) {
            charSequence2 = this.currentVideoInfo.getValueStr(26);
            j = this.currentVideoInfo.getValueLong(12);
            str = this.currentVideoInfo.getValueStr(5);
            charSequence = this.currentVideoInfo.getValueStr(15);
        } else {
            charSequence2 = null;
            str = null;
            charSequence = null;
            j = 0;
        }
        if (TextUtils.isEmpty(charSequence2) || TextUtils.isEmpty(str) || TextUtils.isEmpty(charSequence) || j == 0) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = C2240a.m6772a("%s_%s_%s_%d_%s", new Object[]{this.mVideoID, charSequence2, charSequence, Long.valueOf(j), TTHelper.customBase64Encode(str)});
        } else {
            str2 = C2240a.m6772a("%s_%s_%s_%d", new Object[]{this.mVideoID, charSequence2, charSequence, Long.valueOf(j)});
        }
        return str2;
    }

    private void setupTextureRender() {
        if (this.mLogger != null) {
            this.mLogger.useTextureRender(this.mUseTextureRender);
        }
        this.mTextureRenderer = TextureRenderManager.getManager();
        TTVideoEngineLog.m110647i("TTVideoEngine", "get texture renderer start");
        if (this.mTextureRenderer == null) {
            this.mUseTextureRender = 0;
            TTVideoEngineLog.m110646e("TTVideoEngine", "couldn't get rendererManager");
            return;
        }
        if (mTextureLogListener == null) {
            C514762 r0 = new OnLogListener() {
                public int log(String str, String str2) {
                    TTVideoEngineLog.m110647i(str, str2);
                    return 0;
                }
            };
            mTextureLogListener = r0;
            TextureRenderLog.setOnLogListener(r0);
        }
        this.mTextureSurface = this.mTextureRenderer.genAvaiableSurface();
        if (this.mTextureSurface == null) {
            this.mUseTextureRender = 0;
            this.mTextureRenderErrorMsg = this.mTextureRenderer.getTextureError();
            StringBuilder sb = new StringBuilder("genOffscreenSurface failed = ");
            sb.append(this.mTextureRenderErrorMsg);
            TTVideoEngineLog.m110646e("TTVideoEngine", sb.toString());
            return;
        }
        this.mTextureSurface.setOnDrawFrameListener(new OnDrawFrameListener() {
            public void onDraw(long j) {
                if (!TTVideoEngine.this.mTextureFirstFrame && TTVideoEngine.this.mDecodedVideoFirstFrame) {
                    TTVideoEngineLog.m110644d("TTVideoEngine", "recive first frame render from texture");
                    TTVideoEngine.this.mTextureFirstFrame = true;
                }
                if (TTVideoEngine.this.mPlayerFirstFrame && !TTVideoEngine.this.mTexNotifyFirstFrame && TTVideoEngine.this.mShouldPlay) {
                    StringBuilder sb = new StringBuilder("render start by texture, state =");
                    sb.append(TTVideoEngine.this.mPlaybackState);
                    TTVideoEngineLog.m110644d("TTVideoEngine", sb.toString());
                    TTVideoEngine.this._renderStart();
                }
            }
        });
        StringBuilder sb2 = new StringBuilder("get a surface = ");
        sb2.append(this.mTextureSurface);
        TTVideoEngineLog.m110647i("TTVideoEngine", sb2.toString());
    }

    public void _renderStart() {
        TTVideoEngineLog.m110647i("TTVideoEngine", "start to render");
        if (this.mShouldPlay) {
            _updatePlaybackState(1);
        }
        this.mTexNotifyFirstFrame = true;
        _logFirstFrame();
        _updateLoadState(1, -1);
        if (this.mPlayDuration != null) {
            this.mPlayDuration.start();
        }
        if (this.mTestNetSpeed >= 0 && this.mMediaPlayer != null && this.mTestNetSpeedDiff > 0) {
            this.mTestNetSpeedHandler = new Handler();
            this.mTestNetSpeedRunable = new Runnable() {
                public void run() {
                    if (TTVideoEngine.this.mMediaPlayer != null) {
                        long longOption = TTVideoEngine.this.mMediaPlayer.getLongOption(63, 0);
                        if (longOption >= 0 && TTVideoEngine.this.mTestNetSpeedListener != null) {
                            TTVideoEngine.this.mTestNetSpeedListener.onSpeedReceive(longOption);
                        }
                        if ((TTVideoEngine.this.mTestNetSpeed == 1 || (TTVideoEngine.this.mTestNetSpeed == 0 && longOption < 0)) && TTVideoEngine.this.mTestNetSpeedDiff > 0) {
                            TTVideoEngine.this.mTestNetSpeedHandler.postDelayed(TTVideoEngine.this.mTestNetSpeedRunable, (long) TTVideoEngine.this.mTestNetSpeedDiff);
                        }
                    }
                }
            };
            this.mTestNetSpeedHandler.postDelayed(this.mTestNetSpeedRunable, (long) (this.mTestNetSpeedDiff + (this.mTestNetSpeedDiff / 2)));
        }
        if (this.mMediaPlayer != null) {
            _updateLogTime();
        }
        if (this.mSwitchingResolution || this.mRetrying) {
            if (this.mLastPlaybackTime != 0 && isSystemPlayer()) {
                _seekTo(this.mLastPlaybackTime, this.mSwitchingResolution);
            }
            this.mRetrying = false;
        }
        if (this.mStartTime != 0 && isSystemPlayer()) {
            _seekTo(this.mStartTime, this.mSwitchingResolution);
        }
        this.mStartTime = 0;
        if (this.mSwitchingResolution && !isSystemPlayer()) {
            this.mSwitchingResolution = false;
            if (this.mLogger != null) {
                this.mLogger.switchResolutionEnd();
            }
        }
        this.mErrorCount = 0;
        this.mBestResolutionType = 0;
        if (this.mVideoEngineListener != null) {
            TTVideoEngineLog.m110647i("TTVideoEngine", "notify render start");
            this.mVideoEngineListener.onRenderStart(this);
        }
        setPlayInfo(0, 0);
    }

    public void _updateLogger() {
        if (this.mLogger != null && this.mMediaPlayer != null) {
            this.mLogger.curVideoOutputFps(this.mMediaPlayer.getFloatOption(NormalGiftView.MASK_TRANSLATE_VALUE, 0.0f));
            this.mLogger.containerFps(this.mMediaPlayer.getFloatOption(151, 0.0f));
            this.mLogger.curVideoDecoderFps(this.mMediaPlayer.getIntOption(186, -1));
            this.mLogger.clockDiff(this.mMediaPlayer.getLongOption(152, -1));
            this.mLogger.dropCount(this.mMediaPlayer.getIntOption(153, -1));
            this.mLogger.enableSharp(this.mMediaPlayer.getIntOption(189, -1));
            this.mLogger.curVideoDecodeError(this.mMediaPlayer.getIntOption(221, -1));
            this.mLogger.curAudioDecodeError(this.mMediaPlayer.getIntOption(222, -1));
            this.mLogger.curVideoRenderError(this.mMediaPlayer.getIntOption(245, -1));
            if ((this.mHardwareDecodeEnablePlayer2 > 0 && !this.mUsePlayer3) || (this.mHardwareDecodeEnablePlayer3 > 0 && this.mUsePlayer3)) {
                this.mLogger.hwCodecName(this.mMediaPlayer.getStringOption(187));
                this.mLogger.hwCodecException(this.mMediaPlayer.getIntOption(188, -1));
            }
            if (this.mPlaybackState != 0) {
                this.mLogger.setAudioBufferLength(this.mMediaPlayer.getLongOption(73, -1));
                this.mLogger.setVideoBufferLength(this.mMediaPlayer.getLongOption(72, -1));
            }
            this.mLogger.setTextureRenderError(this.mTextureRenderErrorMsg);
            this.mLogger.setLongOption(50, this.mMediaPlayer.getLongOption(171, -1));
        }
    }

    public void release() {
        TTVideoEngineLog.m110647i("TTVideoEngine", "release");
        FetcherMaker.remove(this.mVideoID);
        if (this.mInfoCollector != null) {
            this.mInfoCollector.unregistEngine(this.mSerial);
        }
        this.mShouldPlay = false;
        if (!(this.mLogger == null || this.mExternVideoLoggerListener == null)) {
            this.mLogger.setExternLog(this.mExternVideoLoggerListener.getLog(this.mExternLogKey));
        }
        _stop(false, 1);
        if (this.mTextureRenderer != null) {
            if (this.mTextureSurface != null) {
                this.mTextureSurface.release();
                this.mTextureSurface = null;
            }
            this.mTextureRenderer = null;
            TTVideoEngineLog.m110647i("TTVideoEngine", "mTextureRenderer become to null");
        }
        if (this.mABRModule != null) {
            this.mABRModule.release();
            this.mABRModule = null;
        }
        if (this.mMediaPlayer != null) {
            try {
                this.mMediaPlayer.release();
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.mMediaPlayer = null;
                throw th;
            }
            this.mMediaPlayer = null;
        }
        this.mPreloaderItem = null;
        this.mIsPreloaderItem = false;
        this.mCachePath = null;
        this.mFileKey = null;
        TTNetWorkListener.getInstance(this.mContext).stopListen(this.mNetWorkChangeCb);
        _dataLoaderRemoveEngineRef();
        this.mState = 5;
    }

    public void releaseAsync() {
        TTVideoEngineLog.m110647i("TTVideoEngine", "releaseAsync");
        if (isSystemPlayer()) {
            release();
            return;
        }
        FetcherMaker.remove(this.mVideoID);
        if (this.mInfoCollector != null) {
            this.mInfoCollector.unregistEngine(this.mSerial);
        }
        _updateLogger();
        this.mShouldPlay = false;
        _stop(false, 2);
        if (!(this.mLogger == null || this.mExternVideoLoggerListener == null)) {
            this.mLogger.setExternLog(this.mExternVideoLoggerListener.getLog(this.mExternLogKey));
        }
        if (this.mABRModule != null) {
            this.mABRModule.release();
            this.mABRModule = null;
        }
        if (this.mMediaPlayer != null && !this.mUsePlayer3) {
            if (this.mSurfaceHolder != null) {
                this.mMediaPlayer.setDisplay(null);
            }
            if (this.mSurface != null) {
                setSurfaceHook(null);
            }
            if (this.mTextureSurface != null) {
                this.mTextureSurface.release();
                this.mTextureSurface = null;
            }
        }
        if (this.mAsyncPlayer != null) {
            this.mAsyncPlayer.release();
            this.mAsyncPlayer = null;
        }
        this.mPreloaderItem = null;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        this.mMediaPlayer = null;
        this.mCachePath = null;
        this.mFileKey = null;
        if (mediaPlayer != null) {
            EngineThreadPool.addExecuteTask(new MyReleaseRunnable(mediaPlayer));
        }
        TTNetWorkListener.getInstance(this.mContext).stopListen(this.mNetWorkChangeCb);
        _dataLoaderRemoveEngineRef();
        this.mState = 5;
    }

    public boolean supportHevcPlayback() {
        if (this.mMediaPlayer == null) {
            return true;
        }
        try {
            int currentPosition = this.mMediaPlayer.getCurrentPosition();
            int duration = this.mMediaPlayer.getDuration();
            long longOption = this.mMediaPlayer.getLongOption(72, -1);
            if (this.mMediaPlayer.getIntOption(157, -1) == 5 && this.mPlaybackState == 1 && this.mLoadState == 1 && currentPosition >= 1000 && duration - currentPosition >= 1000 && longOption >= 500) {
                int intOption = this.mMediaPlayer.getIntOption(160, 100);
                long longOption2 = this.mMediaPlayer.getLongOption(152, -1);
                int intOption2 = this.mMediaPlayer.getIntOption(153, -1);
                float floatOption = this.mMediaPlayer.getFloatOption(151, 0.0f);
                if (floatOption > ((float) this.mMaxFps)) {
                    floatOption /= 2.0f;
                }
                int i = (((int) floatOption) * this.mFrameDropNum) / (this.mFrameDropNum + 1);
                if (longOption2 <= -350 && intOption2 >= (i * 2) / 3 && intOption > 2) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    private MediaPlayer _createPlayer() {
        MediaPlayer mediaPlayer;
        int i;
        if (this.mConfigParams != null) {
            HashMap<Integer, Integer> hashMap = this.mConfigParams;
            Integer valueOf = Integer.valueOf(1);
            int i2 = 0;
            if (this.mPlayerType != 2) {
                i = 1;
            } else {
                i = 0;
            }
            hashMap.put(valueOf, Integer.valueOf(i));
            HashMap<Integer, Integer> hashMap2 = this.mConfigParams;
            Integer valueOf2 = Integer.valueOf(2);
            if (this.mPlayerType == 1) {
                i2 = 1;
            }
            hashMap2.put(valueOf2, Integer.valueOf(i2));
            this.mConfigParams.put(Integer.valueOf(11), Integer.valueOf(this.mForbidOSPlayer));
            this.mConfigParams.put(Integer.valueOf(100), Integer.valueOf(this.mConfigParamsOption));
        }
        StringBuilder sb = new StringBuilder("_playInternal MediaPlayerWrapper.create, use player v3: ");
        sb.append(this.mUsePlayer3);
        TTVideoEngineLog.m110647i("TTVideoEngine", sb.toString());
        if (this.mUsePlayer3) {
            mediaPlayer = MediaPlayerWrapperVer3.create(this.mContext, this.mPlayerDegradeMode);
        } else {
            mediaPlayer = null;
        }
        if (mediaPlayer == null) {
            mediaPlayer = MediaPlayerWrapper.create(this.mContext, this.mPlayerDegradeMode, this.mConfigParams);
        }
        if (mediaPlayer == null) {
            return null;
        }
        if (!mHasRegisterMdlProto && mediaPlayer.getPlayerType() == 1) {
            long longValue = DataLoaderHelper.getDataLoader().getLongValue(BaseNotice.COMMENT_REPLY_WITH_VIDEO);
            if (longValue != -1) {
                DataLoaderHelper.getDataLoader().setIntValue(1004, (int) mediaPlayer.setLongOption(500, longValue));
            }
            mHasRegisterMdlProto = true;
            StringBuilder sb2 = new StringBuilder("get handle: ");
            sb2.append(longValue);
            TTVideoEngineLog.m110647i("TTVideoEngine", sb2.toString());
        }
        if (this.mUsePlayer3) {
            MediaPlayerWrapperVer3 mediaPlayerWrapperVer3 = (MediaPlayerWrapperVer3) mediaPlayer;
            if (mediaPlayerWrapperVer3.hasException() && this.mLogger != null) {
                this.mLogger.logPluginException(mediaPlayerWrapperVer3.getExceptionStr());
            }
        } else {
            MediaPlayerWrapper mediaPlayerWrapper = (MediaPlayerWrapper) mediaPlayer;
            if (mediaPlayerWrapper.hasException() && this.mLogger != null) {
                this.mLogger.logPluginException(mediaPlayerWrapper.getExceptionStr());
            }
        }
        if (this.mLogger != null) {
            this.mLogger.setPlayerCreatedT(System.currentTimeMillis());
        }
        TTVideoEngineLog.m110647i("TTVideoEngine", "_playInternal MediaPlayerWrapper.create done ");
        return mediaPlayer;
    }

    private void _prepareToPlay() {
        String str;
        String str2;
        boolean z;
        String str3;
        if (this.mPlayDuration != null) {
            this.mPlayDuration.clear();
        }
        if (this.mPlayStartTimestamp == 0) {
            this.mPlayStartTimestamp = System.currentTimeMillis();
            P2PStragetyManager.getInstance().onePlay();
        }
        if (this.mIsLocal || this.mIsDirectURL || this.mPlayFd != null || this.mMediaDataSource != null) {
            _logBeginToPlay(null);
            if (this.mIsLocal) {
                str = this.mLocalURL;
            } else {
                str = this.mDirectURL;
            }
            _logFirstURL(str);
            if (this.mIsLocal) {
                str2 = this.mLocalURL;
            } else {
                str2 = this.mDirectURL;
            }
            _singleURLParseAndPlay(str2, this.mHeaders);
        } else if (this.mIsPreloaderItem) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (this.mPreloaderItem.mUrlTime <= 0 || currentTimeMillis - this.mPreloaderItem.mUrlTime <= ((long) PLAY_URL_EXPIRE_TIME)) {
                z = false;
            } else {
                z = true;
            }
            HashMap hashMap = new HashMap();
            String str4 = "expire";
            if (z) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            hashMap.put(str4, str3);
            String str5 = "";
            if (this.mPreloaderItem.mUrl != null) {
                str5 = this.mPreloaderItem.mUrl;
            }
            hashMap.put("url", str5);
            if (z) {
                _fetchVideoInfo();
            }
            _logFirstURL(this.mPreloaderItem.mUrl);
            _logBeginToPlay(this.mPreloaderItem.mVideoID);
            this.mLogger.setPreloadInfo(hashMap);
            this.mLogger.usePreload(1);
            _singleURLParseAndPlay(this.mPreloaderItem.mUrl, this.mHeaders);
        } else if (this.mIsPlayItem) {
            _logBeginToPlay(this.mVideoID);
            _logFirstURL(this.mPlayItem.playURL);
            _singleURLParseAndPlay(this.mPlayItem.playURL, this.mHeaders);
        } else if (this.mIsFeedInfo) {
            _logBeginToPlay(this.mVideoID);
            _parseIPAddress(this.mVideoModel);
        } else {
            _logBeginToPlay(this.mVideoID);
            _fetchVideoInfo();
        }
        this.mLogger.setTag(this.mTag);
        this.mLogger.setSubTag(this.mSubTag);
        if (this.mMediaPlayer != null && this.mP2PCDNType != 0) {
            setPlayInfo(5, 0);
        }
    }

    public static void onlyUseMediaLoader(boolean z) {
        ONLY_USE_MEDIALOADER = z;
    }

    public static void setDefaultABRAlgorithm(int i) {
        sABRAlgorithmType = i;
    }

    public static void setForceUseLitePlayer(boolean z) {
        mForceUseLitePlayer = z;
    }

    public static void setForceUsePluginPlayer(boolean z) {
        mForceUsePluginPlayer = z;
    }

    public static void setGlobalNetworkClient(TTVNetClient tTVNetClient) {
        TTVideoEngineConfig.gNetClient = tTVNetClient;
    }

    public static void setHTTPDNSFirst(boolean z) {
        HTTP_DNS_FIRST = z;
    }

    public static void setPlayerLibraryLoader(ILibraryLoader iLibraryLoader) {
        TTPlayerLibraryLoader.setLibraryLoader(iLibraryLoader);
    }

    public boolean getLooping(boolean z) {
        return this.mLooping;
    }

    public void setCacheControlEnabled(boolean z) {
        this.mCacheControlEnabled = z;
    }

    public void setCacheFilePathListener(CacheFilePathListener cacheFilePathListener) {
        this.mCacheFilePathListener = cacheFilePathListener;
    }

    public void setDataSource(DataSource dataSource) {
        this.mDataSource = dataSource;
    }

    public void setGroupID(String str) {
        this.mGroupID = str;
    }

    public void setListener(VideoEngineListener videoEngineListener) {
        this.mVideoEngineListener = videoEngineListener;
    }

    public void setNetworkClient(TTVNetClient tTVNetClient) {
        this.mNetClient = tTVNetClient;
    }

    public void setStreamInfoListener(StreamInfoListener streamInfoListener) {
        this.mStreamInfoListener = streamInfoListener;
    }

    public void setSubTag(String str) {
        this.mSubTag = str;
    }

    public void setTTHlsDrmToken(String str) {
        this.mTTHlsDrmToken = str;
    }

    public void setTag(String str) {
        this.mTag = str;
    }

    public void setTokenUrlTemplate(String str) {
        this.mTokenUrlTemplate = str;
    }

    public void setVideoBufferListener(VideoBufferListener videoBufferListener) {
        this.mVideoBufferListener = videoBufferListener;
    }

    public void setVideoInfoListener(VideoInfoListener videoInfoListener) {
        this.mVideoInfoListener = videoInfoListener;
    }

    public void setVideoURLRouteListener(VideoURLRouteListener videoURLRouteListener) {
        this.mVideoRouteListener = videoURLRouteListener;
    }

    public static void addTask(PreloaderURLItem preloaderURLItem) {
        DataLoaderHelper.getDataLoader().addTask(preloaderURLItem);
    }

    public static void cancelPreloadTask(String str) {
        DataLoaderHelper.getDataLoader().cancelTask(str);
    }

    public static void cancelPreloadTaskByFilePath(String str) {
        DataLoaderHelper.getDataLoader().cancelTaskByFilePath(str);
    }

    public static void cancelPreloadTaskByVideoId(String str) {
        DataLoaderHelper.getDataLoader().cancelTaskByVideoId(str);
    }

    public static void disableAutoTrim(String str) {
        DataLoaderHelper.getDataLoader().disableAutoTrim(str);
    }

    public static void enableAutoTrim(String str) {
        DataLoaderHelper.getDataLoader().enableAutoTrim(str);
    }

    public static void preConnect(String str) {
        DataLoaderHelper.getDataLoader().preConnect(str);
    }

    public static void removeCacheFile(String str) {
        DataLoaderHelper.getDataLoader().removeCacheFile(str);
    }

    public static void setDataLoaderListener(DataLoaderListener dataLoaderListener) {
        DataLoaderHelper.getDataLoader().setListener(dataLoaderListener);
    }

    public static void setDataLoaderNetworkClient(TTVNetClient tTVNetClient) {
        DataLoaderHelper.getDataLoader().setNetworkClient(tTVNetClient);
    }

    public static void setVideoEventUploader(IVideoEventUploader iVideoEventUploader) {
        VideoEventManager.instance.setUploader(iVideoEventUploader);
    }

    public void _logFetchedFailed(Error error) {
        this.mLogger.fetchInfoComplete(null, error);
    }

    public void _logFetchedVideoInfo(VideoModel videoModel) {
        this.mLogger.fetchInfoComplete(videoModel, null);
    }

    public void _logMessage(String str) {
        this.mLogger.logMessage(str);
    }

    private boolean _usePlayerDNS(boolean z) {
        if (this.mIsUsePlayerDNS == 1) {
            return true;
        }
        if (this.mIsUsePlayerDNS != 0 && z) {
            return true;
        }
        return false;
    }

    public static void addTask(PreloaderVidItem preloaderVidItem) {
        DataLoaderHelper.getDataLoader().addTask(preloaderVidItem);
    }

    public static long getCacheFileSize(String str) {
        return DataLoaderHelper.getDataLoader().getCacheSize(str);
    }

    public static long getCacheFileSizeByFilePath(String str) {
        return DataLoaderHelper.getDataLoader().getCacheSizeByFilePath(str);
    }

    public static DataLoaderCacheInfo getCacheInfo(String str) {
        return DataLoaderHelper.getDataLoader().getCacheInfo(str);
    }

    public static DataLoaderCacheInfo getCacheInfoByFilePath(String str) {
        return DataLoaderHelper.getDataLoader().getCacheInfoByFilePath(str);
    }

    public static String getStringValue(int i) {
        return DataLoaderHelper.getDataLoader().getStringValue(i);
    }

    public static void setThreadPoolExecutor(ThreadPoolExecutor threadPoolExecutor) {
        TTVideoEngineLog.m110647i("TTVideoEngine", "set threadpool");
        EngineThreadPool.setExecutorInstance(threadPoolExecutor);
    }

    public IMediaMetrics getMetrics(int i) {
        if (this.mLogger == null) {
            return null;
        }
        return this.mLogger.buildMetrics(i);
    }

    public void setDecryptionKey(String str) {
        TTVideoEngineLog.m110647i("TTVideoEngine", "setDecryptionKey");
        this.mDecryptionKey = str;
    }

    public void setDefaultFileCacheDir(String str) {
        if (str != null && str.length() != 0) {
            this.mDefaultCacheDir = str;
            createCacheFileDirectory();
        }
    }

    public void setFileCacheDir(String str) {
        if (str != null && str.length() != 0) {
            this.mCacheDir = str;
        }
    }

    public void setLiveID(String str) {
        setVideoID(str);
        this.mLogger.setPlayType(1);
        this.mPlayType = 1;
    }

    public void setResolutionMap(HashMap<String, Resolution> hashMap) {
        if (hashMap != null && hashMap.size() > 0) {
            this.mResolutionMap = hashMap;
        }
    }

    public void setVideoEngineInfoListener(VideoEngineInfoListener videoEngineInfoListener) {
        this.mVideoEngineInfos = new VideoEngineInfos();
        this.mVideoEngineInfoListener = videoEngineInfoListener;
    }

    private boolean _isDashSource(VideoInfo videoInfo) {
        String valueStr = videoInfo.getValueStr(6);
        if (TextUtils.isEmpty(valueStr) || (!valueStr.equals("dash") && !valueStr.equals("mpd"))) {
            return false;
        }
        return true;
    }

    private void _logBeginToPlay(String str) {
        if (this.mLogger != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.mPlayTime = currentTimeMillis;
            this.mLogger.setDnsMode(this.mIsUsePlayerDNS);
            this.mLogger.beginToPlay(str, currentTimeMillis, AppInfo.mDeviceId);
        }
    }

    private void _logFirstHost(String str) {
        if (this.mFirstHost) {
            this.mFirstHost = false;
            this.mLogger.setInitialHost(str);
        }
        this.mLogger.setCurHost(str);
    }

    private void _logFirstIP(String str) {
        if (this.mFirstIP) {
            this.mFirstIP = false;
            this.mLogger.setInitialIP(str);
        }
        this.mLogger.setCurIP(str);
    }

    private void _logFirstQuality(String str) {
        if (this.mFirstQuality) {
            this.mFirstQuality = false;
            this.mLogger.setInitialQuality(str);
        }
        this.mLogger.setCurQuality(str);
    }

    private void _logFirstResolution(String str) {
        if (this.mFirstResolution) {
            this.mFirstResolution = false;
            this.mLogger.setInitialResolution(str);
        }
        this.mLogger.setCurResolution(str);
    }

    private void _logFirstURL(String str) {
        if (this.mFirstURL) {
            this.mFirstURL = false;
            this.mLogger.setInitialURL(str);
        }
        this.mLogger.setCurURL(str);
    }

    private String _resolutionToString(Resolution resolution) {
        if (this.mVideoModel != null) {
            VideoRef videoRef = this.mVideoModel.getVideoRef();
            if (videoRef != null) {
                return videoRef.resolutionToString(resolution);
            }
        }
        return resolution.toString(VideoRef.TYPE_VIDEO);
    }

    public static void addTask(PreloaderVideoModelItem preloaderVideoModelItem) {
        DataLoaderHelper.getDataLoader().addTask(preloaderVideoModelItem);
    }

    public static String computeMD5(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return new BigInteger(1, instance.digest()).toString(16);
        } catch (Exception unused) {
            return str;
        }
    }

    public static void startDataLoader(Context context) throws Exception {
        DataLoaderHelper.getDataLoader().setContext(context);
        try {
            DataLoaderHelper.getDataLoader().start();
        } catch (Exception e) {
            throw e;
        }
    }

    public void configResolution(Resolution resolution) {
        if (resolution != null) {
            TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("config reolution:%s", new Object[]{_resolutionToString(resolution)}));
            _configResolution(resolution, null);
        }
    }

    public void setDataSource(IMediaDataSource iMediaDataSource) {
        _ShutdownOldSource();
        this.mMediaDataSource = iMediaDataSource;
        if (this.mLogger != null) {
            this.mLogger.setSourceType(7, null);
        }
    }

    public void setEncodedKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m110647i("TTVideoEngine", "setEncodedKey");
            this.mSpadea = str;
        }
    }

    public void setIsMute(boolean z) {
        TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("setIsMute:%s", new Object[]{Boolean.valueOf(z)}));
        this.mIsMute = z;
        _setPlayerMute(z);
    }

    public void setStartTime(int i) {
        StringBuilder sb = new StringBuilder("setStartTime:");
        sb.append(i);
        TTVideoEngineLog.m110647i("TTVideoEngine", sb.toString());
        this.mStartTime = i;
        this.mLogger.setStartTime(this.mStartTime);
    }

    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        this.mSurfaceHolder = surfaceHolder;
        if (!(surfaceHolder == null || this.mLogger == null)) {
            this.mLogger.setSurface(surfaceHolder.toString());
        }
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.setDisplay(surfaceHolder);
        }
    }

    private boolean _isUrlExpired(VideoInfo videoInfo) {
        if (videoInfo != null && !this.mAllowedExpiredModel && videoInfo.getValueLong(30) > 0 && TimeService.isUpdated() && TimeService.currentTimeMillis() - (videoInfo.getValueLong(30) * 1000) > -30000) {
            return true;
        }
        return false;
    }

    private void _notifyError(Error error) {
        if (!(this.mExternVideoLoggerListener == null || this.mLogger == null)) {
            this.mLogger.setExternLog(this.mExternVideoLoggerListener.getLog(this.mExternLogKey));
        }
        if (this.mLogger != null) {
            if (this.mPlayDuration != null) {
                this.mLogger.addWatchedDuration(this.mPlayDuration.getPlayedDuration());
            }
            this.mLogger.movieFinish(error, this.mPlayAPIVersion);
        }
        this.mStarted = false;
        if (this.mVideoEngineListener != null) {
            this.mVideoEngineListener.onError(error);
        }
        this.mErrorCount = 0;
        this.mAccumulatedErrorCount = 0;
    }

    private void _setPlayerMute(boolean z) {
        float f;
        if (this.mMediaPlayer != null) {
            if (this.mMediaPlayer.isOSPlayer()) {
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                try {
                    this.mMediaPlayer.setVolume(f, f);
                } catch (Exception e) {
                    TTVideoEngineLog.m110645d(e);
                }
            } else {
                this.mMediaPlayer.setIsMute(z);
            }
        }
    }

    private String[] addMdlFlag(String[] strArr) {
        if (P2PStragetyManager.getInstance().isAllowP2p() == 1 && this.mForbidP2P == 0) {
            return strArr;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (!TextUtils.isEmpty(strArr[i])) {
                strArr[i] = TTHelper.appendQueryString(strArr[i], "p2p=0");
            }
        }
        return strArr;
    }

    private boolean isSupportBash(VideoModel videoModel) {
        if (videoModel != null) {
            String dynamicType = videoModel.getDynamicType();
            String videoRefStr = videoModel.getVideoRefStr(8);
            if (!TextUtils.isEmpty(dynamicType) && !TextUtils.isEmpty(videoRefStr) && dynamicType.equals("segment_base")) {
                return true;
            }
        }
        return false;
    }

    private static void removeCacheFile(VideoModel videoModel) {
        if (videoModel != null) {
            VideoRef videoRef = videoModel.getVideoRef();
            if (videoRef != null) {
                List<VideoInfo> videoInfoList = videoRef.getVideoInfoList();
                if (videoInfoList != null && videoInfoList.size() > 0) {
                    for (VideoInfo valueStr : videoInfoList) {
                        DataLoaderHelper.getDataLoader().forceRemoveCacheFile(valueStr.getValueStr(15));
                    }
                }
            }
        }
    }

    private void setSurfaceHook(Surface surface) {
        MediaPlayer mediaPlayer;
        if (this.mAsyncPlayer != null) {
            mediaPlayer = this.mAsyncPlayer;
        } else {
            mediaPlayer = this.mMediaPlayer;
        }
        if (mediaPlayer != null) {
            if (!(this.mTextureSurface == null || this.mTextureRenderer == null)) {
                this.mTextureSurface.updateRenderSurface(surface);
            }
            if (this.mTextureSurface != null) {
                surface = this.mTextureSurface;
            }
            mediaPlayer.setSurface(surface);
        }
    }

    public void _bufferStart(int i) {
        TTVideoEngineLog.m110647i("TTVideoEngine", "buffering start");
        if (this.mPlayDuration != null) {
            this.mPlayDuration.stop();
        }
        if (this.mVideoBufferListener != null) {
            this.mVideoBufferListener.onBufferStart(i);
        }
        setPlayInfo(3, 1);
        _updateLoadState(2, i);
    }

    public void _streamChanged(int i) {
        TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("stream %d changed", new Object[]{Integer.valueOf(i)}));
        if (this.mPrepared && this.mPlaybackState != 0 && this.mLoadState != 0) {
            if (i == 0 && !this.mDecodedVideoFirstFrame) {
                this.mDecodedVideoFirstFrame = true;
            }
            if (this.mVideoEngineListener != null) {
                this.mVideoEngineListener.onStreamChanged(this, i);
            }
        }
    }

    public void _updatePlaybackState(int i) {
        if (this.mPlaybackState != i) {
            TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("playback state changed, prev:%d, current:%d", new Object[]{Integer.valueOf(this.mPlaybackState), Integer.valueOf(i)}));
            this.mPlaybackState = i;
            if (this.mVideoEngineListener != null) {
                this.mVideoEngineListener.onPlaybackStateChanged(this, this.mPlaybackState);
            }
        }
    }

    public int convertCodecName(int i) {
        if (!this.mUsePlayer3) {
            return i;
        }
        switch (i) {
            case 2:
                return 3;
            case 4:
                return 1;
            case 5:
                return 7;
            case 6:
                return 2;
            case 8:
                return 5;
            case 9:
                return 6;
            default:
                return 0;
        }
    }

    public float getFloatOption(int i) {
        float f;
        switch (i) {
            case 70:
                if (this.mMediaPlayer != null) {
                    f = this.mMediaPlayer.getFloatOption(151, 0.0f);
                    break;
                } else {
                    return 0.0f;
                }
            case 71:
                try {
                    if (this.mMediaPlayer != null) {
                        f = this.mMediaPlayer.getFloatOption(NormalGiftView.MASK_TRANSLATE_VALUE, 0.0f);
                        break;
                    } else {
                        return 0.0f;
                    }
                } catch (Throwable th) {
                    TTVideoEngineLog.m110645d(th);
                    return 0.0f;
                }
            default:
                return 0.0f;
        }
        return f;
    }

    /* access modifiers changed from: 0000 */
    public int parseP2PCDNType(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int indexOf = str.indexOf("cdn_type=");
        if (indexOf != -1) {
            int i = indexOf + 9;
            if (i < str.length()) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    return 0;
                }
                return Character.getNumericValue(charAt);
            }
        }
        return 0;
    }

    public void setCustomStr(String str) {
        if (this.mLogger != null && !TextUtils.isEmpty(str)) {
            if (str.length() > 512) {
                str = str.substring(0, UnReadVideoExperiment.LIKE_USER_LIST);
                TTVideoEngineLog.m110647i("TTVideoEngine", "customStr too long to be truncated!");
            }
            this.mLogger.setCustomStr(str);
        }
    }

    public void setLooping(boolean z) {
        TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("setLooping:%s", new Object[]{Boolean.valueOf(z)}));
        this.mLooping = z;
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.setLooping(this.mLooping);
        }
        TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("set looping value:%d", new Object[]{Integer.valueOf(z ? 1 : 0)}));
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        this.mPlaybackParams = playbackParams;
        if (this.mMediaPlayer != null && (!isSystemPlayer() || (VERSION.SDK_INT >= 23 && this.mPrepared))) {
            this.mMediaPlayer.setPlaybackParams(playbackParams);
            this.mLogger.setPlaybackParams(this.mPlaybackParams);
        }
    }

    public void setSurface(Surface surface) {
        StringBuilder sb = new StringBuilder("setsurface = ");
        sb.append(surface);
        TTVideoEngineLog.m110647i("TTVideoEngine", sb.toString());
        this.mSurface = surface;
        if (!(surface == null || this.mLogger == null || this.mHasFirstFrameShown)) {
            this.mLogger.setSurface(surface.toString());
        }
        if (this.mMediaPlayer != null) {
            setSurfaceHook(this.mSurface);
        }
    }

    public void setUnSupportSampleRates(int[] iArr) {
        if (!isSystemPlayer()) {
            int length = iArr.length;
            if (length > 0) {
                int length2 = MediaPlayer.MEDIA_PLAYER_SUPPORT_SAMPLERATES.length;
                this.mUnsupportSampleRatesInBinary = 0;
                for (int i = 0; i < length; i++) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        } else if (MediaPlayer.MEDIA_PLAYER_SUPPORT_SAMPLERATES[i2] == iArr[i]) {
                            this.mUnsupportSampleRatesInBinary = (1 << i2) | this.mUnsupportSampleRatesInBinary;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (this.mMediaPlayer != null) {
                    this.mMediaPlayer.setIntOption(111, this.mUnsupportSampleRatesInBinary);
                }
            }
        }
    }

    public void _renderSeekComplete(int i) {
        TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("render seek complete:%d", new Object[]{Integer.valueOf(i)}));
        if (this.mLogger != null) {
            this.mLogger.renderSeekCompleted(i);
            this.mLogger.showedOneFrame();
        }
        if (this.mVideoEngineInfoListener != null) {
            StringBuilder sb = new StringBuilder("render seek complete call back ");
            sb.append(i);
            TTVideoEngineLog.m110647i("TTVideoEngine", sb.toString());
            this.mVideoEngineInfos.setKey("renderSeekComplete");
            this.mVideoEngineInfos.setObject(Integer.valueOf(i));
            this.mVideoEngineInfoListener.onVideoEngineInfos(this.mVideoEngineInfos);
        }
    }

    public void _seekComplete(boolean z) {
        TTVideoEngineLog.m110647i("TTVideoEngine", "seek complete");
        if (this.mPlayDuration != null) {
            this.mPlayDuration.start();
        }
        if (this.mSeeking) {
            this.mSeeking = false;
            if (this.mLogger != null) {
                this.mLogger.seekCompleted();
                this.mLogger.showedOneFrame();
            }
        }
        if (this.mSwitchingResolution) {
            this.mSwitchingResolution = false;
            if (this.mLogger != null) {
                this.mLogger.switchResolutionEnd();
            }
        }
        if (this.mSeekCompletionListener != null) {
            this.mSeekCompletionListener.onCompletion(z);
            this.mSeekCompletionListener = null;
        }
        if (this.mMediaPlayer != null && this.mP2PCDNType != 0) {
            long longOption = this.mMediaPlayer.getLongOption(73, -1);
            long longOption2 = this.mMediaPlayer.getLongOption(72, -1);
            if (longOption >= 0 && longOption2 >= 0) {
                longOption = Math.min(longOption, longOption2);
            } else if (longOption < 0) {
                if (longOption2 >= 0) {
                    longOption = longOption2;
                } else {
                    return;
                }
            }
            setPlayInfo(5, longOption);
        }
    }

    public void _videoBitrateChanged(int i) {
        Resolution resolution = Resolution.Undefine;
        if (this.mVideoModel != null && this.mVideoModel.getVideoRef() != null) {
            Resolution[] allResolutions = Resolution.getAllResolutions();
            int i2 = 0;
            while (true) {
                if (i2 >= allResolutions.length) {
                    break;
                }
                VideoInfo videoInfo = this.mVideoModel.getVideoInfo(allResolutions[i2], VideoRef.TYPE_VIDEO, null);
                if (videoInfo != null && videoInfo.getValueInt(3) == i) {
                    resolution = allResolutions[i2];
                    this.lastResolution = this.currentResolution;
                    this.currentResolution = resolution;
                    break;
                }
                i2++;
            }
        }
        TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("video bitrate changed:%d, resoluton:%s", new Object[]{Integer.valueOf(i), resolution.toString(VideoRef.TYPE_VIDEO)}));
        if (this.mStreamInfoListener != null) {
            this.mStreamInfoListener.onVideoStreamBitrateChanged(resolution, i);
        }
    }

    public long getLongOption(int i) {
        long j;
        if (i != 81) {
            if (i != 315) {
                if (i != 461) {
                    switch (i) {
                        case 60:
                            if (this.mMediaPlayer != null) {
                                return this.mMediaPlayer.getLongOption(171, 0);
                            }
                            break;
                        case BaseNotice.TCM /*61*/:
                            if (this.mMediaPlayer != null) {
                                return this.mMediaPlayer.getLongOption(73, 0);
                            }
                            break;
                        case BaseNotice.CREATOR /*62*/:
                            try {
                                if (this.mMediaPlayer != null) {
                                    return this.mMediaPlayer.getLongOption(72, 0);
                                }
                            } catch (Throwable th) {
                                th = th;
                                j = -1;
                                TTVideoEngineLog.m110645d(th);
                                return j;
                            }
                            break;
                    }
                } else {
                    return this.mVideoPreloadSize;
                }
            } else if (this.mMediaPlayer != null) {
                return this.mMediaPlayer.getLongOption(46, 0);
            }
        } else if (this.mMediaPlayer != null) {
            j = this.mMediaPlayer.getLongOption(240, 0);
            String str = "TTVideoEngine";
            try {
                StringBuilder sb = new StringBuilder("get value of KeyIsLastBufferSizeU64: ");
                sb.append(j);
                TTVideoEngineLog.m110647i(str, sb.toString());
                return j;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return -1;
    }

    public void setDirectURL(String str) {
        if (str != null && !str.equals(this.mDirectURL)) {
            TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("set direct url:%s", new Object[]{str}));
            _ShutdownOldSource();
            this.mState = 0;
            this.mFirstURL = true;
            this.mFirstIP = true;
            this.mFirstHost = true;
            this.mUserStopped = false;
            this.mLastPlaybackTime = 0;
            this.mAPIString = null;
        }
        this.mStarted = false;
        this.mIsDirectURL = true;
        this.mDirectURL = str;
        this.mDirectUrlSrc = str;
        this.mBufferingStartT = 0;
        this.mCachePath = null;
        this.mFileKey = null;
        this.currentResolution = Resolution.Undefine;
        this.mLogger.configResolution(_resolutionToString(this.currentResolution), "");
        this.mLogger.setSourceType(1, "");
    }

    public void setLocalURL(String str) {
        if (str != null && !str.equals(this.mLocalURL)) {
            TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("set local url:%s", new Object[]{str}));
            _ShutdownOldSource();
            this.mState = 0;
            this.mUserStopped = false;
            this.mLastPlaybackTime = 0;
            this.mFirstURL = true;
            this.mAPIString = null;
        }
        this.mStarted = false;
        this.mIsLocal = true;
        this.mLocalURL = str;
        this.mBufferingStartT = 0;
        this.mLogger.setSourceType(0, "");
        this.mCachePath = null;
        this.mFileKey = null;
        this.currentResolution = Resolution.Undefine;
        this.mLogger.configResolution(_resolutionToString(this.currentResolution), "");
    }

    public void setVideoID(String str) {
        if (str != null && !str.equals(this.mVideoID)) {
            TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("set video id:%s", new Object[]{str}));
            _ShutdownOldSource();
            this.mIsLocal = false;
            this.mFirstURL = true;
            this.mFirstIP = true;
            this.mFirstHost = true;
            this.mState = 0;
            this.mUserStopped = false;
            this.mLastPlaybackTime = 0;
            this.mAPIString = null;
        }
        this.mStarted = false;
        this.mVideoID = str;
        this.mBufferingStartT = 0;
        this.mLogger.setSourceType(5, str);
        this.urlIPMap.clear();
        this.mCachePath = null;
        this.mFileKey = null;
    }

    private void _parseDNS(String str) {
        TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("hostnameURL:%s", new Object[]{str}));
        this.mState = 2;
        if (this.mLogger != null) {
            this.mLogger.setDNSStartTime(System.currentTimeMillis());
        }
        try {
            this.mDNSParser = new DNSParser(this.mContext, new URL(str).getHost(), getNetClientSetByUser());
            this.mDNSParser.setCompletionListener(new MyDNSCompletionListener(this));
            if (this.mErrorCount != 0) {
                this.mDNSParser.setForceReparse();
            }
            this.mDNSParser.setIsUseDNSCache(this.mUseDNSCache);
            if (this.mDNSExpiredTime > 0) {
                this.mDNSParser.setDNSExpiredTimeInS(this.mDNSExpiredTime);
            }
            if (this.mIsUseServerDns && this.mVideoModel != null) {
                this.mDNSParser.setIsUseServerDNS(this.mIsUseServerDns);
                this.mDNSParser.setDnsInfo(this.mVideoModel.getDnsInfo(), Long.valueOf(this.mVideoModel.getVideoRefLong(216)));
            }
            this.mDNSParser.start();
        } catch (Exception e) {
            TTVideoEngineLog.m110645d(e);
        }
    }

    public void _bufferEnd(int i) {
        TTVideoEngineLog.m110647i("TTVideoEngine", "buffering end");
        if (this.mPlayDuration != null) {
            this.mPlayDuration.start();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.mBufferingStartT > 0 && elapsedRealtime >= this.mBufferingStartT) {
            if (this.mLogger != null) {
                this.mLogger.movieStallEnd(i);
                if (i == 0) {
                    this.mLogger.accuBuffingTime(elapsedRealtime - this.mBufferingStartT);
                    P2PStragetyManager.getInstance().setBufferingTime(elapsedRealtime - this.mBufferingStartT);
                }
            }
            if (this.curP2PUrlInfo != null && !TextUtils.isEmpty(this.curP2PUrlInfo.mUrl)) {
                VideoLoadWrapper.getInstance().videoStalled(this.curP2PUrlInfo.mUrl, (int) (elapsedRealtime - this.mBufferingStartT));
            }
            this.mBufferingStartT = 0;
        } else if (this.mNotifyBufferingDirectly == 1 && this.mLogger != null) {
            this.mLogger.playbackBufferEnd();
        }
        this.mBufferingType = -1;
        if (this.mVideoBufferListener != null) {
            this.mVideoBufferListener.onBufferEnd(i);
        }
        setPlayInfo(4, 1);
        _updateLoadState(1, i);
    }

    public void _parseDNSComplete(String str) {
        if (this.mLogger != null) {
            this.mLogger.setDNSParseTime(System.currentTimeMillis(), 0);
        }
        String host = Uri.parse(this.mURLInfo.hostURL).getHost();
        String replaceFirst = this.mURLInfo.hostURL.replaceFirst(host, str);
        TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("dns success, host:%s, ip:%s", new Object[]{host, str}));
        String str2 = "";
        if (this.mDNSParser != null) {
            str2 = this.mDNSParser.getTypeStr();
        }
        String str3 = str2;
        IpInfo ipInfo = (IpInfo) this.urlIPMap.get(this.mURLInfo.hostURL);
        if (ipInfo != null) {
            ipInfo.f128649ip = str;
            ipInfo.dns = str3;
        } else {
            Map<String, IpInfo> map = this.urlIPMap;
            String str4 = this.mURLInfo.hostURL;
            boolean isUseDNSCache = this.mDNSParser.getIsUseDNSCache();
            boolean isUseServerDNS = this.mDNSParser.getIsUseServerDNS();
            IpInfo ipInfo2 = new IpInfo(str, str3, isUseDNSCache ? 1 : 0, isUseServerDNS ? 1 : 0, "");
            map.put(str4, ipInfo2);
        }
        _updateVU();
        _logFirstURL(this.mURLInfo.hostURL);
        _logFirstHost(host);
        _logFirstIP(str);
        _playVideo(host, replaceFirst);
    }

    public String getStringOption(int i) {
        String str = "";
        if (i != 80) {
            if (i != 82) {
                if (i != 462) {
                    if (i == 477) {
                        try {
                            if (this.mLogger != null) {
                                str = this.mLogger.getStringOption(47);
                            }
                        } catch (Throwable th) {
                            th = th;
                            TTVideoEngineLog.m110645d(th);
                            return str;
                        }
                    }
                } else if (this.urlIPMap != null) {
                    for (Entry entry : this.urlIPMap.entrySet()) {
                        String str2 = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (!(str2 == null || value == null)) {
                            if (value instanceof IpInfo) {
                                IpInfo ipInfo = (IpInfo) value;
                                HashMap hashMap = new HashMap();
                                hashMap.put("ip", ipInfo.f128649ip);
                                hashMap.put("dns", ipInfo.dns);
                                hashMap.put("dns_cache_open", Integer.valueOf(ipInfo.isDNSCacheOpen));
                                hashMap.put("server_dns_open", Integer.valueOf(ipInfo.isServerDNSOpen));
                                hashMap.put("url_desc", ipInfo.urlDesc);
                                str = hashMap.toString();
                            } else {
                                String str3 = "exception!";
                                try {
                                    throw new RuntimeException(value.getClass().getName());
                                } catch (Throwable th2) {
                                    Throwable th3 = th2;
                                    str = str3;
                                    th = th3;
                                    TTVideoEngineLog.m110645d(th);
                                    return str;
                                }
                            }
                        }
                    }
                }
            } else if (mForceUsePluginPlayer) {
                return MediaPlayerWrapper.getPluginVersion();
            } else {
                return TTPlayerConfiger.getValue(14, "");
            }
        } else if (this.mMediaPlayer != null) {
            return this.mMediaPlayer.getStringOption(142);
        }
        return str;
    }

    public void setPlayItem(TTVideoEnginePlayItem tTVideoEnginePlayItem) {
        String str;
        if (tTVideoEnginePlayItem != null) {
            boolean isExpired = tTVideoEnginePlayItem.isExpired();
            HashMap hashMap = new HashMap();
            String str2 = "expire";
            if (isExpired) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put(str2, str);
            String str3 = "";
            if (tTVideoEnginePlayItem.playURL != null) {
                str3 = tTVideoEnginePlayItem.playURL;
            }
            hashMap.put("url", str3);
            this.mLogger.setPlayItem(hashMap);
            if (TextUtils.isEmpty(tTVideoEnginePlayItem.playURL) || isExpired) {
                setVideoID(tTVideoEnginePlayItem.vid);
                return;
            }
            _ShutdownOldSource();
            if (!tTVideoEnginePlayItem.equals(this.mPlayItem)) {
                if (this.mPlayItem != null) {
                    _reset();
                }
                this.mIsPlayItem = true;
                this.mFirstURL = true;
                this.mFirstIP = true;
                this.mFirstHost = true;
                this.mState = 0;
                this.mUserStopped = false;
                this.mLastPlaybackTime = 0;
                this.mAPIString = null;
            }
            this.mStarted = false;
            this.mPlayItem = tTVideoEnginePlayItem;
            this.mBufferingStartT = 0;
            if (tTVideoEnginePlayItem.resolution != null) {
                this.currentResolution = tTVideoEnginePlayItem.resolution;
            }
            this.mVideoID = tTVideoEnginePlayItem.vid;
            this.mLogger.setSourceType(2, tTVideoEnginePlayItem.vid);
            this.urlIPMap.clear();
            this.mCachePath = null;
            this.mFileKey = null;
        }
    }

    public void setPreloaderItem(TTAVPreloaderItem tTAVPreloaderItem) {
        if (tTAVPreloaderItem == null) {
            this.mIsPreloaderItem = false;
        } else if (TextUtils.isEmpty(tTAVPreloaderItem.mUrl)) {
            setVideoID(tTAVPreloaderItem.mVideoID);
        } else {
            switch (tTAVPreloaderItem.mResolution) {
                case 0:
                    this.currentResolution = Resolution.Standard;
                    break;
                case 1:
                    this.currentResolution = Resolution.High;
                    break;
                case 2:
                    this.currentResolution = Resolution.SuperHigh;
                    break;
                case 3:
                    this.currentResolution = Resolution.ExtremelyHigh;
                    break;
                case 4:
                    this.currentResolution = Resolution.FourK;
                    break;
                default:
                    setVideoID(tTAVPreloaderItem.mVideoID);
                    return;
            }
            _ShutdownOldSource();
            if (this.mPreloaderItem != null && !this.mPreloaderItem.equals(tTAVPreloaderItem)) {
                _reset();
                this.mIsLocal = false;
                this.mFirstURL = true;
                this.mFirstIP = true;
                this.mFirstHost = true;
                this.mState = 0;
                this.mUserStopped = false;
                this.mLastPlaybackTime = 0;
                this.mFetcher = null;
                this.mAPIString = null;
            }
            this.mStarted = false;
            this.mIsPreloaderItem = true;
            this.mPreloaderItem = tTAVPreloaderItem;
            this.mBufferingStartT = 0;
            this.urlIPMap.clear();
            this.mVideoID = tTAVPreloaderItem.mVideoID;
            this.mLogger.setSourceType(3, this.mVideoID);
            this.mCachePath = null;
            this.mFileKey = null;
            TTVideoEngineLog.m110647i("TTVideoEngine", "set preloaderitem");
        }
    }

    public void setVideoModel(VideoModel videoModel) {
        if (videoModel != null) {
            String videoRefStr = videoModel.getVideoRefStr(2);
            if (!TextUtils.isEmpty(videoRefStr)) {
                if (videoModel != null && !videoModel.equals(this.mVideoModel)) {
                    _ShutdownOldSource();
                    this.mIsLocal = false;
                    this.mFirstURL = true;
                    this.mFirstIP = true;
                    this.mFirstHost = true;
                    this.mState = 0;
                    this.mUserStopped = false;
                    this.mLastPlaybackTime = 0;
                    this.mFetcher = null;
                    this.mAPIString = null;
                }
                this.mStarted = false;
                this.mVideoModel = videoModel;
                this.mKeyseed = this.mVideoModel.getVideoRefStr(218);
                this.mFallbackAPI = this.mVideoModel.getVideoRefStr(217);
                this.mVideoModel.setUpResolution(this.mResolutionMap);
                this.mVideoID = videoRefStr;
                FetcherMaker.store(this.mVideoID, this.mKeyseed, this.mFallbackAPI);
                this.mIsFeedInfo = true;
                this.mBufferingStartT = 0;
                this.mLogger.setSourceType(4, this.mVideoID);
                this.mLogger.setFeed(videoModel);
                this.mCachePath = null;
                this.mFileKey = null;
                TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("set video model, fallback api:%s, keyseed:%s", new Object[]{this.mFallbackAPI, this.mKeyseed}));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007d, code lost:
        if (r5 < 0) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007f, code lost:
        r1 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getIntOption(int r5) {
        /*
            r4 = this;
            r0 = 4
            r1 = -1
            if (r5 == r0) goto L_0x0112
            r0 = 26
            if (r5 == r0) goto L_0x010f
            r0 = 29
            if (r5 == r0) goto L_0x010c
            r0 = 33
            if (r5 == r0) goto L_0x0109
            r0 = 160(0xa0, float:2.24E-43)
            if (r5 == r0) goto L_0x0106
            r0 = 313(0x139, float:4.39E-43)
            if (r5 == r0) goto L_0x0103
            r0 = 416(0x1a0, float:5.83E-43)
            if (r5 == r0) goto L_0x0100
            r0 = 3
            r2 = 0
            switch(r5) {
                case 40: goto L_0x00f5;
                case 41: goto L_0x00e9;
                case 42: goto L_0x00dc;
                case 43: goto L_0x00cb;
                case 44: goto L_0x00be;
                case 45: goto L_0x00b0;
                case 46: goto L_0x00a2;
                case 47: goto L_0x009e;
                case 48: goto L_0x0085;
                case 49: goto L_0x0067;
                case 50: goto L_0x0063;
                case 51: goto L_0x005f;
                case 52: goto L_0x0051;
                case 53: goto L_0x0045;
                case 54: goto L_0x0041;
                case 55: goto L_0x003d;
                case 56: goto L_0x0039;
                default: goto L_0x0021;
            }
        L_0x0021:
            switch(r5) {
                case 301: goto L_0x0035;
                case 302: goto L_0x0031;
                default: goto L_0x0024;
            }
        L_0x0024:
            switch(r5) {
                case 424: goto L_0x002d;
                case 425: goto L_0x0029;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x0116
        L_0x0029:
            int r5 = r4.mHijackRetryBackupDNSType     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x002d:
            int r5 = r4.mHijackRetryMainDNSType     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x0031:
            int r5 = r4.mForbidP2P     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x0035:
            int r5 = r4.mP2PCDNType     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x0039:
            int r5 = r4.mLoadState     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x003d:
            int r5 = r4.mPlaybackState     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x0041:
            int r5 = r4.mBufferingType     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x0045:
            com.ss.ttvideoengine.utils.PlayDuration r5 = r4.mPlayDuration     // Catch:{ Throwable -> 0x0118 }
            if (r5 == 0) goto L_0x0116
            com.ss.ttvideoengine.utils.PlayDuration r5 = r4.mPlayDuration     // Catch:{ Throwable -> 0x0118 }
            int r5 = r5.getPlayedDuration()     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x0051:
            boolean r5 = r4.mSwitchingResolution     // Catch:{ Throwable -> 0x0118 }
            if (r5 == 0) goto L_0x0059
            int r5 = r4.mLastPlaybackTime     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x0059:
            int r5 = r4._getPlayerTime()     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x005f:
            int r5 = r4.mLoadedProgress     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x0063:
            int r5 = r4.mDuration     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x0067:
            android.content.Context r5 = r4.mContext     // Catch:{ Throwable -> 0x0118 }
            if (r5 == 0) goto L_0x0116
            android.content.Context r5 = r4.mContext     // Catch:{ Throwable -> 0x0118 }
            java.lang.String r3 = "audio"
            java.lang.Object r5 = r5.getSystemService(r3)     // Catch:{ Throwable -> 0x0118 }
            android.media.AudioManager r5 = (android.media.AudioManager) r5     // Catch:{ Throwable -> 0x0118 }
            if (r5 == 0) goto L_0x007c
            int r5 = r5.getStreamVolume(r0)     // Catch:{ Throwable -> 0x0118 }
            goto L_0x007d
        L_0x007c:
            r5 = -1
        L_0x007d:
            if (r5 >= 0) goto L_0x0082
        L_0x007f:
            r1 = 0
            goto L_0x0116
        L_0x0082:
            r1 = r5
            goto L_0x0116
        L_0x0085:
            android.content.Context r5 = r4.mContext     // Catch:{ Throwable -> 0x0118 }
            if (r5 == 0) goto L_0x0116
            android.content.Context r5 = r4.mContext     // Catch:{ Throwable -> 0x0118 }
            java.lang.String r3 = "audio"
            java.lang.Object r5 = r5.getSystemService(r3)     // Catch:{ Throwable -> 0x0118 }
            android.media.AudioManager r5 = (android.media.AudioManager) r5     // Catch:{ Throwable -> 0x0118 }
            if (r5 == 0) goto L_0x009a
            int r5 = r5.getStreamMaxVolume(r0)     // Catch:{ Throwable -> 0x0118 }
            goto L_0x009b
        L_0x009a:
            r5 = -1
        L_0x009b:
            if (r5 >= 0) goto L_0x0082
            goto L_0x007f
        L_0x009e:
            int r5 = r4.mPlayerType     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x00a2:
            com.ss.ttm.player.MediaPlayer r5 = r4.mMediaPlayer     // Catch:{ Throwable -> 0x0118 }
            if (r5 == 0) goto L_0x0116
            com.ss.ttm.player.MediaPlayer r5 = r4.mMediaPlayer     // Catch:{ Throwable -> 0x0118 }
            r0 = 140(0x8c, float:1.96E-43)
            int r5 = r5.getIntOption(r0, r1)     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x00b0:
            com.ss.ttm.player.MediaPlayer r5 = r4.mMediaPlayer     // Catch:{ Throwable -> 0x0118 }
            if (r5 == 0) goto L_0x0116
            com.ss.ttm.player.MediaPlayer r5 = r4.mMediaPlayer     // Catch:{ Throwable -> 0x0118 }
            r0 = 141(0x8d, float:1.98E-43)
            int r5 = r5.getIntOption(r0, r1)     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x00be:
            com.ss.ttm.player.MediaPlayer r5 = r4.mMediaPlayer     // Catch:{ Throwable -> 0x0118 }
            if (r5 == 0) goto L_0x0116
            com.ss.ttm.player.MediaPlayer r5 = r4.mMediaPlayer     // Catch:{ Throwable -> 0x0118 }
            r0 = 158(0x9e, float:2.21E-43)
            int r5 = r5.getIntOption(r0, r1)     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x00cb:
            com.ss.ttm.player.MediaPlayer r5 = r4.mMediaPlayer     // Catch:{ Throwable -> 0x0118 }
            if (r5 == 0) goto L_0x00d7
            com.ss.ttm.player.MediaPlayer r5 = r4.mMediaPlayer     // Catch:{ Throwable -> 0x0118 }
            r0 = 157(0x9d, float:2.2E-43)
            int r2 = r5.getIntOption(r0, r1)     // Catch:{ Throwable -> 0x0118 }
        L_0x00d7:
            int r5 = r4.convertCodecName(r2)     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x00dc:
            com.ss.ttm.player.MediaPlayer r5 = r4.mMediaPlayer     // Catch:{ Throwable -> 0x0118 }
            if (r5 == 0) goto L_0x0116
            com.ss.ttm.player.MediaPlayer r5 = r4.mMediaPlayer     // Catch:{ Throwable -> 0x0118 }
            r0 = 153(0x99, float:2.14E-43)
            int r5 = r5.getIntOption(r0, r1)     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x00e9:
            com.ss.ttvideoengine.log.IVideoEventLogger r5 = r4.mLogger     // Catch:{ Throwable -> 0x0118 }
            if (r5 == 0) goto L_0x0116
            com.ss.ttvideoengine.log.IVideoEventLogger r5 = r4.mLogger     // Catch:{ Throwable -> 0x0118 }
            long r2 = r5.getCurDecoderBufferAccuT()     // Catch:{ Throwable -> 0x0118 }
            int r1 = (int) r2     // Catch:{ Throwable -> 0x0118 }
            goto L_0x0116
        L_0x00f5:
            com.ss.ttvideoengine.log.IVideoEventLogger r5 = r4.mLogger     // Catch:{ Throwable -> 0x0118 }
            if (r5 == 0) goto L_0x0116
            com.ss.ttvideoengine.log.IVideoEventLogger r5 = r4.mLogger     // Catch:{ Throwable -> 0x0118 }
            int r5 = r5.getCurDecoderBufferCount()     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x0100:
            int r5 = r4.mEnableSetPlayInfoToP2P     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x0103:
            boolean r5 = r4.mCheckHijack     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x0106:
            int r5 = r4.mDataLoaderEnable     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x0109:
            boolean r5 = r4.mBashEnabled     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x010c:
            int r5 = r4.mDashAbr     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x010f:
            int r5 = r4.mReuseSocket     // Catch:{ Throwable -> 0x0118 }
            goto L_0x011d
        L_0x0112:
            int r5 = r4.mLayoutType     // Catch:{ Throwable -> 0x0118 }
            goto L_0x0082
        L_0x0116:
            r5 = r1
            goto L_0x011d
        L_0x0118:
            r5 = move-exception
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r5)
            r5 = -1
        L_0x011d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.TTVideoEngine.getIntOption(int):int");
    }

    public void _receivedError(Error error) {
        boolean z;
        int i;
        this.mAllowedExpiredModel = false;
        _updateLogTime();
        if (this.mUserStopped) {
            this.mState = 0;
            return;
        }
        int i2 = this.mPlayAPIVersion;
        int _getPlayerTime = _getPlayerTime();
        if (!this.mRetrying) {
            if (this.mStartTime != 0) {
                this.mLastPlaybackTime = this.mStartTime;
                this.mStartTime = 0;
            } else if (!isSystemPlayer() || (isSystemPlayer() && this.mPrepared)) {
                if (this.mDuration <= 0 || _getPlayerTime - this.mDuration <= -1000) {
                    this.mLastPlaybackTime = _getPlayerTime;
                } else {
                    this.mLastPlaybackTime = 0;
                }
            }
        }
        if (this.mMediaPlayer == null || !(this.mMediaPlayer.isOSPlayer() || this.mMediaPlayer.getPlayerType() == 3 || this.mMediaPlayer.getPlayerType() == 4)) {
            z = false;
        } else {
            z = true;
        }
        if (this.mMediaPlayer != null && (this.mMediaPlayer.getPlayerType() == 0 || this.mMediaPlayer.getPlayerType() == 2)) {
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
            this.mIsStartPlayAutomatically = true;
        }
        this.mErrorCount++;
        this.mAccumulatedErrorCount++;
        this.mState = 4;
        TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("videoEngine failed:%s", new Object[]{error.toString()}));
        if (error.code == -9987) {
            TTVideoEngineLog.m110646e("TTVideoEngine", "can't decrypt video");
            _notifyError(error);
        } else if (error.code == -9988) {
            TTVideoEngineLog.m110646e("TTVideoEngine", "decode encryptionkey error, not need to retry");
            _notifyError(error);
        } else {
            if (error.code == -9990) {
                if (this.mPlayAPIVersion != 2 || TextUtils.isEmpty(this.mAuthorization)) {
                    TTVideoEngineLog.m110646e("TTVideoEngine", "invalid request, no need to retry");
                    _notifyError(error);
                    return;
                }
                this.mPlayAPIVersion = 1;
            }
            if (this.mErrorCount >= 3) {
                TTVideoEngineLog.m110646e("TTVideoEngine", "videoEngine retry failed");
                this.mLogger.tryErrCount(this.mErrorCount);
                _notifyError(error);
            } else if (this.mAccumulatedErrorCount >= this.mMaxAccumulatedCountSetByUser) {
                TTVideoEngineLog.m110646e("TTVideoEngine", "videoEngine retry failed:reach maxAccumulatedErrorCount");
                this.mLogger.accuErrCount(this.mAccumulatedErrorCount);
                _notifyError(error);
            } else {
                if (error.code == -9969 && this.mPlayAPIVersion == 2) {
                    if (TextUtils.isEmpty(this.mAuthorization)) {
                        _notifyError(error);
                        StringBuilder sb = new StringBuilder("PLAY_API_VERSION_");
                        sb.append(this.mPlayAPIVersion);
                        sb.append(" authorize fail and auth of PLAY_API_VERSION_");
                        sb.append(this.mPlayAPIVersion - 1);
                        sb.append(" is empty");
                        TTVideoEngineLog.m110646e("TTVideoEngine", sb.toString());
                        return;
                    }
                    this.mPlayAPIVersion = 1;
                }
                if ((error.domain.equals("kTTVideoErrorDomainVideoOSPlayer") || error.code == -499975) && this.mURLInfo.getCurrentURL().startsWith("mdl")) {
                    if (this.mIsDirectURL && this.mDirectURL.startsWith("mdl")) {
                        DataLoaderHelper.getDataLoader().setIntValue(1004, -1);
                        this.mDirectURL = DataLoaderHelper.getDataLoader()._getProxyUrl(this.mDirectURL);
                        StringBuilder sb2 = new StringBuilder("mdl failed: mIsDirectURL: ");
                        sb2.append(this.mIsDirectURL);
                        sb2.append(", mDirectUrlSrc: ");
                        sb2.append(this.mDirectUrlSrc);
                        TTVideoEngineLog.m110647i("TTVideoEngine", sb2.toString());
                    } else if (this.mURLInfo.getCurrentURL().startsWith("mdl")) {
                        DataLoaderHelper.getDataLoader().setIntValue(1004, -1);
                        this.mURLInfo.setHostURL(DataLoaderHelper.getDataLoader()._getProxyUrl(this.mURLInfo.getCurrentURL()));
                        StringBuilder sb3 = new StringBuilder("mdl failed: urlInfo: ");
                        sb3.append(this.mURLInfo.getCurrentURL());
                        TTVideoEngineLog.m110647i("TTVideoEngine", sb3.toString());
                    } else if (error.domain.equals("kTTVideoErrorDomainVideoOSPlayer")) {
                        DataLoaderHelper.getDataLoader().setIntValue(1004, -1);
                    }
                }
                this.mRetrying = true;
                int retryStrategy = error.getRetryStrategy();
                if ((this.mH265Enabled || this.mDashEnabled || this.mHttpsEnabled) && z) {
                    this.mH265Enabled = false;
                    this.mDashEnabled = false;
                    this.mEnableHttps = false;
                    this.mRetryEnableHttps = false;
                    retryStrategy = 1;
                }
                if (error.code == -499972) {
                    if (!this.mHijackRetry) {
                        _notifyError(error);
                        return;
                    }
                    this.mLogger.setHijackCode(error.code);
                    if (!this.mHijackRetry) {
                        _notifyError(error);
                        return;
                    }
                    sDNSType = new int[]{this.mHijackRetryMainDNSType, this.mHijackRetryBackupDNSType};
                    removeCacheFile(this.mVideoModel);
                    DataLoaderHelper.getDataLoader().clearNetinfoCache();
                    DataLoaderHelper.getDataLoader().setIntValue(90, this.mHijackRetryMainDNSType);
                    DataLoaderHelper.getDataLoader().setIntValue(91, this.mHijackRetryBackupDNSType);
                    if (this.mHijackRetryCount != 0 || z || this.mVideoModel == null || !this.mVideoModel.getVideoRefBool(106)) {
                        this.mHijackRetryCount = 0;
                        _notifyError(error);
                        return;
                    }
                    this.mHijackRetryCount++;
                    this.mRetryEnableHttps = true;
                    retryStrategy = 2;
                }
                if (error.code == -499699 || error.code == -499698) {
                    if (!this.mDrmRetry) {
                        _notifyError(error);
                        return;
                    } else {
                        this.mDrmType = 0;
                        retryStrategy = 3;
                    }
                }
                if (this.mErrorCount == 2) {
                    if (this.mPlayAPIVersion == 2 && !TextUtils.isEmpty(this.mAuthorization)) {
                        this.mPlayAPIVersion = 1;
                    }
                    retryStrategy = 1;
                }
                if (this.mIsLocal || this.mIsDirectURL) {
                    retryStrategy = 3;
                }
                if (this.mIsPlayItem) {
                    this.mIsPlayItem = false;
                    retryStrategy = 1;
                }
                TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("retry strategy:%d", new Object[]{Integer.valueOf(i)}));
                if (i2 != this.mPlayAPIVersion) {
                    StringBuilder sb4 = new StringBuilder("APIVersion rollback from PLAY_API_VERSION_");
                    sb4.append(i2);
                    sb4.append(" to PLAY_API_VERSION_");
                    sb4.append(this.mPlayAPIVersion);
                    sb4.append(" errorCount:");
                    sb4.append(this.mErrorCount);
                    TTVideoEngineLog.m110647i("TTVideoEngine", sb4.toString());
                }
                String str = this.mURLInfo.hostURL;
                if (!TextUtils.isEmpty(str) && str.startsWith("mem://bash")) {
                    str = C2240a.m6772a("mem://bash/url_index:%d", new Object[]{this.urlIndexMap.get(this.currentResolution)});
                }
                if (!error.domain.equals("kTTVideoErrorDomainHTTPDNS") && !error.domain.equals("kTTVideoErrorDomainLocalDNS") && i == 2 && ((Integer) this.urlIndexMap.get(this.currentResolution)).intValue() == 0) {
                    this.mLogger.mainURLCDNFailed(error, str);
                }
                if (i == 3 && !this.mIsLocal) {
                    IVideoEventLogger iVideoEventLogger = this.mLogger;
                    if (this.mIsDirectURL) {
                        str = this.mDirectURL;
                    }
                    iVideoEventLogger.playerDidFailed(error, str);
                    if (error.code == -2139062143) {
                        this.mMediaPlayer = null;
                    }
                }
                if (this.mIsPreloaderItem) {
                    if (this.mVideoModel != null) {
                        i = 2;
                    } else {
                        if (this.mFetcher != null) {
                            this.mFetcher.cancel();
                        }
                        i = 1;
                    }
                    this.mIsPreloaderItem = false;
                }
                if (i != 0) {
                    this.mLogger.movieShouldRetry(error, i, i2);
                }
                if (i == 1 && this.mVideoRouteListener != null) {
                    this.mVideoRouteListener.onFailed(error, this.mAPIString);
                }
                _retry(i, error);
            }
        }
    }

    public void _parseIPAddress(VideoModel videoModel) {
        String[] strArr;
        boolean z;
        VideoInfo videoInfo;
        Error error;
        String[] strArr2;
        char c;
        int i;
        int i2;
        String[] strArr3;
        String str;
        String str2;
        int i3;
        String str3;
        String[] strArr4;
        Object obj;
        int i4;
        String str4;
        String str5;
        VideoModel videoModel2 = videoModel;
        if (videoModel2 == null) {
            _receivedError(new Error("kTTVideoErrorDomainFetchingInfo", -9997, "_parseIPAddress:VideoModel is empty"));
            return;
        }
        this.currentResolution = findBestResolution(videoModel2, this.currentResolution, this.mBestResolutionType);
        StringBuilder sb = new StringBuilder("find best resolution type: ");
        sb.append(this.mBestResolutionType);
        sb.append(" resolution: ");
        sb.append(_resolutionToString(this.currentResolution));
        TTVideoEngineLog.m110647i("TTVideoEngine", sb.toString());
        String[] codecs = videoModel.getCodecs();
        if (this.mH265Enabled) {
            this.mH265Enabled = false;
            if (codecs != null || codecs.length > 0) {
                int length = codecs.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    String str6 = codecs[i5];
                    if (!TextUtils.isEmpty(str6) && str6.equals("h265")) {
                        this.mH265Enabled = true;
                        break;
                    }
                    i5++;
                }
            }
        }
        String[] allVideoURLs = videoModel2.allVideoURLs(this.currentResolution, this.currentParams);
        Resolution[] allResolutions = Resolution.getAllResolutions();
        VideoInfo videoInfo2 = videoModel2.getVideoInfo(this.currentResolution, this.currentParams);
        if (_isUrlExpired(videoInfo2)) {
            allVideoURLs = null;
            videoInfo2 = null;
        }
        if (allResolutions.length > 0) {
            int length2 = allResolutions.length - 1;
            int i6 = 0;
            while (true) {
                if (i6 >= allResolutions.length) {
                    break;
                } else if (allResolutions[i6].getIndex() == this.currentResolution.getIndex()) {
                    length2 = i6;
                    break;
                } else {
                    i6++;
                }
            }
            videoInfo = videoInfo2;
            int i7 = length2;
            z = false;
            while (true) {
                if (strArr != null && strArr.length != 0) {
                    break;
                }
                Resolution resolution = allResolutions[i7];
                String[] allVideoURLs2 = videoModel2.allVideoURLs(resolution, null);
                if (allVideoURLs2 == null || allVideoURLs2.length == 0) {
                    strArr = allVideoURLs2;
                } else {
                    videoInfo = videoModel2.getVideoInfo(resolution, null);
                    if (!_isUrlExpired(videoInfo)) {
                        this.currentResolution = resolution;
                        this.mLogger.configResolution(_resolutionToString(this.currentResolution), "");
                        strArr = allVideoURLs2;
                        break;
                    }
                    strArr = null;
                    videoInfo = null;
                    z = true;
                }
                i7 = ((i7 + allResolutions.length) - 1) % allResolutions.length;
                if (i7 == length2) {
                    break;
                }
            }
        } else {
            videoInfo = videoInfo2;
            z = false;
        }
        this.currentVideoInfo = videoInfo;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        String dynamicType = videoModel.getDynamicType();
        int i8 = 2;
        int i9 = 15;
        int i10 = 3;
        if (!this.mDashEnabled || TextUtils.isEmpty(dynamicType) || !dynamicType.equals("segment_base") || this.mDashAbr <= 0 || this.mABRModule == null) {
            this.mDashAbr = 0;
        } else {
            for (VideoInfo videoInfo3 : videoModel.getVideoInfoList()) {
                if (videoInfo3.getMediatype() == VideoRef.TYPE_VIDEO) {
                    ABRVideoStream aBRVideoStream = new ABRVideoStream();
                    String valueStr = videoInfo3.getValueStr(i9);
                    aBRVideoStream.setStreamId(valueStr);
                    aBRVideoStream.setBandWidth(videoInfo3.getValueInt(3));
                    aBRVideoStream.setCodec(videoInfo3.getValueStr(8));
                    aBRVideoStream.setWidth(videoInfo3.getValueInt(1));
                    aBRVideoStream.setHeight(videoInfo3.getValueInt(2));
                    aBRVideoStream.setFrameRate(-1);
                    aBRVideoStream.setSegmentDuration(5000);
                    if (!TextUtils.isEmpty(valueStr)) {
                        hashMap.put(valueStr, aBRVideoStream);
                    }
                } else {
                    ABRAudioStream aBRAudioStream = new ABRAudioStream();
                    String valueStr2 = videoInfo3.getValueStr(15);
                    aBRAudioStream.setStreamId(valueStr2);
                    aBRAudioStream.setBandWidth(videoInfo3.getValueInt(3));
                    aBRAudioStream.setCodec(videoInfo3.getValueStr(8));
                    aBRAudioStream.setSampleRate(-1);
                    aBRAudioStream.setSegmentDuration(5000);
                    if (!TextUtils.isEmpty(valueStr2)) {
                        hashMap2.put(valueStr2, aBRAudioStream);
                    }
                }
                i9 = 15;
            }
            if (this.mABRModule != null) {
                this.mABRModule.setMediaInfo(hashMap, hashMap2);
            }
        }
        if (!(this.mVideoEngineInfoListener == null || this.mVideoEngineInfos == null)) {
            ArrayList arrayList = new ArrayList();
            if (!this.mDashEnabled || TextUtils.isEmpty(dynamicType) || !dynamicType.equals("segment_base")) {
                arrayList.add(this.currentVideoInfo);
                this.mVideoEngineInfos.setKey("usingUrlInfos");
                this.mVideoEngineInfos.setUrlInfos(arrayList);
                this.mVideoEngineInfoListener.onVideoEngineInfos(this.mVideoEngineInfos);
            } else {
                VideoInfo _videoInfoForResolution = _videoInfoForResolution(this.currentResolution, VideoRef.TYPE_VIDEO, this.currentParams);
                VideoInfo _videoInfoForResolution2 = _videoInfoForResolution(this.currentResolution, VideoRef.TYPE_AUDIO, this.currentParams);
                if (_videoInfoForResolution != null) {
                    arrayList.add(_videoInfoForResolution);
                }
                if (_videoInfoForResolution2 != null) {
                    arrayList.add(_videoInfoForResolution2);
                    this.mABRCurrentDownloadedAudioBitrate = _videoInfoForResolution2.getValueInt(3);
                }
                this.mVideoEngineInfos.setKey("usingUrlInfos");
                this.mVideoEngineInfos.setUrlInfos(arrayList);
                this.mVideoEngineInfoListener.onVideoEngineInfos(this.mVideoEngineInfos);
            }
        }
        int i11 = 16;
        if (this.currentVideoInfo != null) {
            this.mCurrentQuality = this.currentVideoInfo.getValueStr(18);
            if (this.mBashEnabled && isSupportBash(videoModel)) {
                strArr = this.currentVideoInfo.getValueStrArr(16);
            }
        }
        String[] strArr5 = strArr;
        int intValue = ((Integer) this.urlIndexMap.get(this.currentResolution)).intValue();
        if (strArr5 == null || strArr5.length == 0) {
            if (z) {
                error = new Error("kTTVideoErrorDomainFetchingInfo", -9959);
            } else {
                error = new Error("kTTVideoErrorDomainFetchingInfo", -9997);
            }
        } else if (strArr5.length <= intValue) {
            error = new Error("kTTVideoErrorDomainFetchingInfo", -9996);
        } else {
            error = null;
        }
        if (error != null) {
            _receivedError(error);
            return;
        }
        if (this.mDataLoaderEnable <= 0 || !DataLoaderHelper.getDataLoader().isRunning()) {
            i = intValue;
            strArr2 = strArr5;
            i2 = 3;
            c = 2;
        } else {
            _resetUsingDataLoaderField();
            String _generatePlayUrl = _generatePlayUrl(strArr5[intValue], null);
            if (TextUtils.isEmpty(_generatePlayUrl)) {
                _receivedError(new Error("kTTVideoErrorDomainFetchingInfo", -9967));
                return;
            }
            if (this.mIsUseServerDns) {
                DataLoaderHelper.getDataLoader().updateDnsInfo(videoModel.getDnsInfo(), videoModel2.getVideoRefLong(216));
            }
            ArrayList<VideoInfo> arrayList2 = new ArrayList<>();
            if (!videoModel.isDashSource()) {
                arrayList2.add(this.currentVideoInfo);
            } else if (_generatePlayUrl.startsWith("mem://bash") && videoModel.getVideoRef() != null) {
                for (VideoInfo add : videoModel.getVideoRef().getVideoInfoList()) {
                    arrayList2.add(add);
                }
            }
            String str7 = _generatePlayUrl;
            String str8 = null;
            for (VideoInfo videoInfo4 : arrayList2) {
                if (videoInfo4 != null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    String valueStr3 = videoInfo4.getValueStr(28);
                    if (valueStr3 == null) {
                        valueStr3 = "";
                    }
                    String valueStr4 = videoInfo4.getValueStr(29);
                    if (valueStr4 == null) {
                        valueStr4 = "";
                    }
                    stringBuffer.append("fileId=");
                    stringBuffer.append(valueStr3);
                    stringBuffer.append("&bitrate=");
                    stringBuffer.append(videoInfo4.getValueInt(i10));
                    stringBuffer.append("&pcrc=");
                    stringBuffer.append(TTHelper.encodeUrl(valueStr4));
                    String valueStr5 = videoInfo4.getValueStr(5);
                    String videoRefStr = videoModel2.getVideoRefStr(i8);
                    String valueStr6 = videoInfo4.getValueStr(15);
                    if (TextUtils.isEmpty(valueStr6) || this.mCacheFilePathListener == null) {
                        str3 = null;
                    } else {
                        String cacheFilePath = this.mCacheFilePathListener.cacheFilePath(videoRefStr, videoInfo4);
                        if (!cacheFilePath.contains(valueStr6)) {
                            cacheFilePath = null;
                        }
                        if (!TextUtils.isEmpty(cacheFilePath)) {
                            valueStr6 = TTHelper.keyFromFilePath(this.mContext, cacheFilePath);
                        }
                        str3 = cacheFilePath;
                    }
                    String[] valueStrArr = videoInfo4.getValueStrArr(i11);
                    if (valueStrArr == null || valueStrArr.length <= 0) {
                        str5 = str7;
                        str4 = str8;
                        i4 = intValue;
                        strArr4 = strArr5;
                        obj = null;
                    } else {
                        String[] addMdlFlag = addMdlFlag((String[]) valueStrArr.clone());
                        if (this.mRetryEnableHttps) {
                            for (int i12 = 0; i12 < addMdlFlag.length; i12++) {
                                addMdlFlag[i12] = TTHelper.buildHttpsUrl(addMdlFlag[i12]);
                            }
                        }
                        long j = (long) this.mLimitMDLCacheSize;
                        str5 = str7;
                        long j2 = j;
                        str4 = str8;
                        String[] strArr6 = valueStrArr;
                        obj = null;
                        strArr4 = strArr5;
                        i4 = intValue;
                        String _mdlUrl = _mdlUrl(valueStr6, videoRefStr, j2, addMdlFlag, this.currentResolution, valueStr5, videoInfo4, str3, stringBuffer.toString());
                        if (!TextUtils.isEmpty(_mdlUrl)) {
                            if (str5.startsWith("mem://bash")) {
                                for (int i13 = 0; i13 < strArr6.length; i13++) {
                                    if (strArr6[i13] != null) {
                                        str5 = str5.replace(strArr6[i13].replace("/", "\\/"), _mdlUrl);
                                    }
                                }
                                str7 = str5;
                                str8 = str7;
                            } else {
                                str8 = _mdlUrl;
                                str7 = str5;
                            }
                            intValue = i4;
                            Object obj2 = obj;
                            strArr5 = strArr4;
                            i10 = 3;
                            i8 = 2;
                            videoModel2 = videoModel;
                            i11 = 16;
                        }
                    }
                    str7 = str5;
                    str8 = str4;
                    intValue = i4;
                    Object obj22 = obj;
                    strArr5 = strArr4;
                    i10 = 3;
                    i8 = 2;
                    videoModel2 = videoModel;
                    i11 = 16;
                } else {
                    String str9 = str7;
                    String str10 = str8;
                    videoModel2 = videoModel;
                    i11 = 16;
                }
            }
            String str11 = str8;
            i = intValue;
            strArr2 = strArr5;
            i2 = 3;
            c = 2;
            if (!TextUtils.isEmpty(str11)) {
                this.mURLInfo.setHostURL(str11);
                IVideoEventLogger iVideoEventLogger = this.mLogger;
                if (str11.startsWith("mem://bash")) {
                    i3 = 1;
                    str2 = C2240a.m6772a("mem://bash/url_index:%d", new Object[]{this.urlIndexMap.get(this.currentResolution)});
                } else {
                    i3 = 1;
                    str2 = str11;
                }
                iVideoEventLogger.setProxyUrl(str2);
                this.mLogger.setEnableMDL(i3);
                HashMap<String, String> hashMap3 = this.mHeaders;
                hashMap3.remove("Host");
                _playInternal(str11, hashMap3);
                return;
            }
        }
        if (this.mPlayerType == i2 || this.mPlayerType == 4) {
            strArr3 = strArr2;
            for (int i14 = 0; i14 < strArr3.length; i14++) {
                strArr3[i14] = TTHelper.buildHttpUrl(strArr3[i14]);
            }
        } else {
            strArr3 = strArr2;
        }
        Object[] objArr = new Object[i2];
        objArr[0] = _resolutionToString(this.currentResolution);
        objArr[1] = TextUtils.join(",", strArr3);
        objArr[c] = Integer.valueOf(i);
        TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("current resolution:%s, urls:%s, index:%d", objArr));
        if (this.mPlayerCache == 0 && this.currentVideoInfo != null) {
            this.mPlayerCache = this.currentVideoInfo.getValueInt(13);
        }
        this.mURLInfo.setHostURL(strArr3[i]);
        if (this.mURLInfo.hostURL == null) {
            _receivedError(new Error("kTTVideoErrorDomainFetchingInfo", -9967, "mURLInfo.hostURL is empty"));
            return;
        }
        this.mURLs = strArr3;
        Map<String, IpInfo> map = this.urlIPMap;
        String str12 = this.mURLInfo.hostURL;
        String str13 = "";
        String str14 = "";
        boolean z2 = this.mUseDNSCache;
        boolean z3 = this.mIsUseServerDns;
        if (i == 0) {
            str = "main";
        } else {
            str = "backup";
        }
        IpInfo ipInfo = new IpInfo(str13, str14, z2 ? 1 : 0, z3 ? 1 : 0, str);
        map.put(str12, ipInfo);
        _updateVU();
        if (_usePlayerDNS(false)) {
            _playInternal(this.mURLInfo.hostURL, this.mHeaders);
        } else {
            _parseDNS(this.mURLInfo.hostURL);
        }
    }

    public static Resolution findBestResolution(VideoModel videoModel, int i) {
        return findBestResolution(videoModel, Resolution.Standard, i);
    }

    public static void setIntValue(int i, int i2) {
        DataLoaderHelper.getDataLoader().setIntValue(i, i2);
    }

    public static void setStringValue(int i, String str) {
        DataLoaderHelper.getDataLoader().setStringValue(i, str);
    }

    public void setDirectURL(String str, String str2) {
        setDirectURL(str);
        this.mCachePath = str2;
        this.mFileKey = str2;
    }

    public void setExternLogListener(ExternVideoLoggerListener externVideoLoggerListener, String str) {
        this.mExternVideoLoggerListener = externVideoLoggerListener;
        this.mExternLogKey = str;
    }

    public void setQcomVpp(boolean z, int i) {
        this.mUseQcomVpp = z ? 1 : 0;
        this.mQcomVppLevel = i;
    }

    public void setTestSpeedEnable(int i, TestNetSpeedListener testNetSpeedListener) {
        this.mTestNetSpeed = i;
        if (this.mMediaPlayer != null) {
            this.mMediaPlayer.setIntOption(79, i);
        }
        this.mTestNetSpeedListener = testNetSpeedListener;
    }

    public void configParams(Resolution resolution, Map<Integer, String> map) {
        if (resolution != null) {
            TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("config params,resolution:%s", new Object[]{_resolutionToString(resolution)}));
            _configResolution(resolution, map);
        }
    }

    public void seekTo(int i, SeekCompletionListener seekCompletionListener) {
        TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("seek to time:%d", new Object[]{Integer.valueOf(i)}));
        this.mSeekCompletionListener = seekCompletionListener;
        _seekTo(i, false);
    }

    public void setDirectUrlUseDataLoader(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setDirectUrlUseDataLoader(new String[]{str}, str2);
        }
    }

    public void setDirectUrlUseDataLoaderByFilePath(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setDirectUrlUseDataLoaderByFilePath(new String[]{str}, str2);
        }
    }

    public void setFloatOption(int i, float f) {
        switch (i) {
            case 325:
                this.mAEPreGain = f;
                return;
            case 326:
                this.mAEThreshold = f;
                return;
            case 327:
                this.mAERatio = f;
                return;
            case 328:
                this.mAEPredelay = f;
                break;
        }
    }

    private void _playVideo(String str, String str2) {
        TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("start to play video, host:%s, ip:%s", new Object[]{str, str2}));
        this.mURLInfo.setIpURL(str2);
        if (!TextUtils.isEmpty(str)) {
            this.currentHost = str;
            this.mHeaders.put("Host", C2240a.m6772a(" %s", new Object[]{str}));
        }
        _playInternal(this.mURLInfo.ipURL, this.mHeaders);
    }

    private void _setPlayerVolume(float f, float f2) {
        if (this.mMediaPlayer != null) {
            if (this.mSetTrackVolume == 0 && this.mMediaPlayer.isOSPlayer()) {
                float f3 = 1.0f;
                if (f != 0.0f) {
                    f2 = 1.0f;
                } else {
                    f3 = f;
                }
                AudioManager audioManager = (AudioManager) this.mContext.getSystemService("audio");
                if (audioManager != null) {
                    audioManager.setStreamVolume(3, (int) f, 0);
                }
                f = f3;
            }
            this.mMediaPlayer.setVolume(f, f2);
        }
    }

    public static Resolution findDefaultResolution(VideoModel videoModel, Resolution resolution) {
        if (videoModel == null || resolution == null) {
            return Resolution.Standard;
        }
        int length = Resolution.getAllResolutions().length;
        Resolution[] supportResolutions = videoModel.getSupportResolutions();
        if (supportResolutions == null || supportResolutions.length == 0) {
            return resolution;
        }
        int length2 = supportResolutions.length;
        int i = 0;
        Resolution resolution2 = resolution;
        while (true) {
            if (i >= length2) {
                break;
            }
            Resolution resolution3 = supportResolutions[i];
            if (resolution3 != null) {
                int abs = Math.abs(resolution3.ordinal() - resolution.ordinal());
                if (abs < length) {
                    if (abs == 0) {
                        resolution2 = resolution3;
                        break;
                    }
                    resolution2 = resolution3;
                    length = abs;
                } else {
                    continue;
                }
            }
            i++;
        }
        return resolution2;
    }

    public static Resolution findMaxCacheResolution(VideoModel videoModel, Resolution resolution) {
        if (videoModel == null || resolution == null) {
            return Resolution.Standard;
        }
        long j = 0;
        Resolution[] supportResolutions = videoModel.getSupportResolutions();
        if (supportResolutions == null || supportResolutions.length == 0) {
            return resolution;
        }
        for (Resolution resolution2 : supportResolutions) {
            long cacheFileSize = getCacheFileSize(videoModel, resolution2);
            if (cacheFileSize > j) {
                resolution = resolution2;
                j = cacheFileSize;
            }
        }
        return resolution;
    }

    public static Resolution findMaxQualityResolution(VideoModel videoModel, Resolution resolution) {
        if (videoModel == null || resolution == null) {
            return Resolution.Standard;
        }
        Resolution[] supportResolutions = videoModel.getSupportResolutions();
        if (supportResolutions == null || supportResolutions.length == 0) {
            return resolution;
        }
        for (Resolution resolution2 : supportResolutions) {
            if (getCacheFileSize(videoModel, resolution2) > 0 && resolution2.ordinal() > resolution.ordinal()) {
                resolution = resolution2;
            }
        }
        return resolution;
    }

    public static long getCacheFileSize(VideoModel videoModel, Resolution resolution) {
        long j = 0;
        if (videoModel == null || resolution == null) {
            return 0;
        }
        VideoInfo videoInfo = videoModel.getVideoInfo(resolution, VideoRef.TYPE_VIDEO, null, false);
        if (videoInfo != null) {
            j = 0 + DataLoaderHelper.getDataLoader().getCacheFileSize(videoInfo.getValueStr(15));
        }
        VideoInfo videoInfo2 = videoModel.getVideoInfo(resolution, VideoRef.TYPE_AUDIO, null, true);
        if (videoInfo2 != null) {
            return j + DataLoaderHelper.getDataLoader().getCacheFileSize(videoInfo2.getValueStr(15));
        }
        return j;
    }

    private boolean isSupportFileCache(String str, VideoModel videoModel) {
        if (videoModel != null && (videoModel.isDashSource() || videoModel.isLiveSource())) {
            return false;
        }
        if (TextUtils.isEmpty(str) || (str.indexOf(".m3u8") <= 0 && str.indexOf(".mpd") <= 0)) {
            return true;
        }
        return false;
    }

    public static void setDNSType(int i, int i2) {
        sDNSType = new int[]{i, i2};
        StringBuilder sb = new StringBuilder("setDNSType main:");
        sb.append(i);
        sb.append(" backup:");
        sb.append(i2);
        TTVideoEngineLog.m110647i("TTVideoEngine", sb.toString());
    }

    public static void setSettingConfig(Context context, Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap = (HashMap) map;
        }
        hashMap.put("ttm_version", Integer.valueOf(TTHelper.versionStringToInt(BuildConfig.VERSION_NAME)));
        hashMap.put("avplayerVersion", Integer.valueOf(TTHelper.versionStringToInt(TTPlayerConfiger.getValue(14, ""))));
        TTVideoEngineSettingManager instance = TTVideoEngineSettingManager.getInstance(context);
        instance.loadFetchConfig(hashMap);
        instance.startFetchSettingisForce(false);
    }

    public static void startSpeedPredictor(int i, int i2) {
        if (sNetSpeedPredictor == null) {
            sTestSpeedEnabled = true;
            if (i2 > 0) {
                sTestSpeedInterval = i2;
            }
            TTVideoEngineLog.m110644d("TTVideoEngine", C2240a.m6772a("[ABR] 开启测速，测速算法类型:%d，测速间隔:%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
            sNetSpeedPredictor = new DefaultNetSpeedPredictor(0);
            DataLoaderHelper.getDataLoader().setTestSpeedListener(new TestSpeedListener() {
                public final void onNotify(int i, long j, long j2, String str, String str2) {
                    int i2;
                    if (i == 2) {
                        ABRSpeedRecord aBRSpeedRecord = new ABRSpeedRecord();
                        aBRSpeedRecord.setSteamId(str);
                        aBRSpeedRecord.setBytes(j);
                        aBRSpeedRecord.setTime(j2);
                        if (TextUtils.isEmpty(str2) || !str2.equals("audio")) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        aBRSpeedRecord.setTrackType(i2 ^ 1);
                        aBRSpeedRecord.setTimestamp(System.currentTimeMillis());
                        TTVideoEngine.sNetSpeedPredictor.update(aBRSpeedRecord);
                    }
                }
            });
        }
    }

    public void setCustomHeader(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            HashMap<String, String> hashMap = this.mHeaders;
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, 1).toUpperCase());
            sb.append(str.substring(1));
            hashMap.put(sb.toString(), str2);
        }
    }

    public void setLongOption(int i, long j) {
        if (i != 217) {
            if (i == 440) {
                this.mAudioProcessorAddr = j;
                if (this.mMediaPlayer != null) {
                    this.mMediaPlayer.setLongOption(251, j);
                }
            }
            return;
        }
        this.mALogWriteAddr = j;
        DataLoaderHelper.getDataLoader().setLongValue(62, j);
    }

    public void setPlayAPIVersion(int i, String str) {
        TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("setPlayAPIVersion:%d", new Object[]{Integer.valueOf(i)}));
        this.mPlayAPIVersion = i;
        this.mAuthorization = str;
        if (this.mLogger != null) {
            this.mLogger.setPlayAPIVersion(i, str);
        }
    }

    public void setVolume(float f, float f2) {
        StringBuilder sb = new StringBuilder("setVolume left:");
        sb.append(f);
        sb.append(" right:");
        sb.append(f2);
        TTVideoEngineLog.m110647i("TTVideoEngine", sb.toString());
        this.mVolume = f;
        _setPlayerVolume(f, f2);
    }

    private void _configResolution(Resolution resolution, Map<Integer, String> map) {
        if (resolution != Resolution.Auto) {
            setIntOption(29, 0);
            if (this.mState == 0 || this.mState == 1 || this.mIsPlayComplete) {
                this.lastResolution = resolution;
                this.currentResolution = resolution;
                this.currentParams = map;
                if (TextUtils.isEmpty(this.mDirectURL) && TextUtils.isEmpty(this.mLocalURL)) {
                    this.mLogger.configResolution(_resolutionToString(resolution), _resolutionToString(resolution));
                }
            } else if (this.mState == 3) {
                _switchToResolution(resolution, map);
            }
        } else {
            setIntOption(29, 1);
        }
    }

    private void _retry(int i, Error error) {
        String str;
        String str2;
        switch (i) {
            case 0:
                _notifyError(error);
                return;
            case 1:
                _fetchVideoInfo();
                return;
            case 2:
                _tryNextURL();
                return;
            case 3:
                if (!this.mIsLocal && !this.mIsDirectURL) {
                    if (!this.mIsPreloaderItem && !this.mIsPlayItem) {
                        _playInternal(this.mURLInfo.getCurrentURL(), this.mHeaders);
                        break;
                    } else {
                        if (this.mIsPreloaderItem) {
                            str2 = this.mPreloaderItem.mUrl;
                        } else {
                            str2 = this.mPlayItem.playURL;
                        }
                        _singleURLParseAndPlay(str2, this.mHeaders);
                        return;
                    }
                } else {
                    if (this.mIsLocal) {
                        str = this.mLocalURL;
                    } else {
                        str = this.mDirectURL;
                    }
                    _singleURLParseAndPlay(str, this.mHeaders);
                    return;
                }
                break;
        }
    }

    private void _seekTo(int i, boolean z) {
        int i2;
        TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("_seekTo:%d", new Object[]{Integer.valueOf(i)}));
        if (this.mMediaPlayer == null || !this.mStarted) {
            _seekComplete(false);
            return;
        }
        if (!this.mSeeking && this.mPlayDuration != null) {
            this.mPlayDuration.stop();
        }
        if (z) {
            i2 = this.mLastPlaybackTime;
        } else {
            i2 = _getPlayerTime();
        }
        if (this.mForbidP2PWhenSeek > 0 && this.curP2PUrlInfo != null && this.curP2PUrlInfo.mP2PCDNType > 0 && !TextUtils.isEmpty(this.curP2PUrlInfo.mUrl)) {
            TTVideoEngineLog.m110647i("TTVideoEngine", "forbid proxy p2p when seek");
            VideoLoadWrapper.getInstance().forbidP2P(this.curP2PUrlInfo.mUrl);
        }
        this.mSeeking = true;
        this.mMediaPlayer.seekTo(i);
        setPlayInfo(1, (long) i);
        this.mLogger.seekTo(i2, i, z);
    }

    private void _selectTrack(int i, int i2) {
        int i3;
        int i4;
        if (this.mMediaPlayer != null) {
            TrackInfo[] trackInfo = this.mMediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                if (i2 == VideoRef.TYPE_VIDEO) {
                    i3 = 1;
                } else {
                    i3 = 2;
                }
                int i5 = 0;
                while (true) {
                    if (i5 >= trackInfo.length) {
                        i4 = -1;
                        break;
                    }
                    TrackInfo trackInfo2 = trackInfo[i5];
                    if (trackInfo2.getTrackType() == i3) {
                        MediaFormat format = trackInfo2.getFormat();
                        if (format.getInteger("bitrate") == i) {
                            i4 = format.getInteger("track-id");
                            break;
                        }
                    }
                    i5++;
                }
                if (i4 != -1) {
                    this.mMediaPlayer.selectTrack(i4);
                }
            }
        }
    }

    private void _singleURLParseAndPlay(String str, HashMap hashMap) {
        this.mURLInfo.setHostURL(str);
        if (_usePlayerDNS(true) || this.mIsLocal) {
            _playInternal(str, hashMap);
        } else if (TTHelper.isIP(str) || str.indexOf(WebKitApi.SCHEME_HTTP) != 0) {
            _playInternal(str, hashMap);
        } else {
            Map<String, IpInfo> map = this.urlIPMap;
            String str2 = this.mURLInfo.hostURL;
            boolean z = this.mUseDNSCache;
            boolean z2 = this.mIsUseServerDns;
            IpInfo ipInfo = new IpInfo("", "", z ? 1 : 0, z2 ? 1 : 0, "single");
            map.put(str2, ipInfo);
            this.mURLs = new String[]{str};
            _updateVU();
            _parseDNS(str);
        }
    }

    public static void setAppInfo(Context context, Map map) {
        if (map != null && map.size() != 0) {
            AppInfo.mContext = context;
            AppInfo.mAppName = (String) map.get("appname");
            Object obj = map.get("appid");
            if (obj != null) {
                AppInfo.mAppID = ((Integer) obj).intValue();
            }
            AppInfo.mAppChannel = (String) map.get("appchannel");
            AppInfo.mAppVersion = (String) map.get("appversion");
            AppInfo.mDeviceId = (String) map.get("deviceid");
        }
    }

    public void _updateLoadState(int i, int i2) {
        if (this.mLoadState != i) {
            TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("load state changed, prev:%d, current:%d", new Object[]{Integer.valueOf(this.mLoadState), Integer.valueOf(i)}));
            if (i == 2 && this.mHasFirstFrameShown && !this.mSeeking && this.mLoadState != 3) {
                int _getPlayerTime = _getPlayerTime();
                this.mBufferingType = i2;
                if (this.mLogger != null) {
                    this.mLogger.movieStalled(i2, _getPlayerTime);
                }
                this.mBufferingStartT = SystemClock.elapsedRealtime();
            }
            this.mLoadState = i;
            if (this.mVideoEngineListener == null) {
                return;
            }
            if (this.mShouldPlay || i != 3) {
                this.mVideoEngineListener.onLoadStateChanged(this, this.mLoadState);
            }
        }
    }

    public void setAsyncInit(boolean z, int i) {
        MediaPlayer mediaPlayer;
        if (this.mAsyncPlayer != null) {
            mediaPlayer = this.mAsyncPlayer;
        } else {
            mediaPlayer = this.mMediaPlayer;
        }
        this.mAsyncInitEnable = z ? 1 : 0;
        if (this.mVideoModel != null) {
            i = -1;
        }
        this.mCodecId = i;
        TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("setAsyncInit enable:%b codecid:%d", new Object[]{Integer.valueOf(this.mAsyncInitEnable), Integer.valueOf(this.mCodecId)}));
        if (mediaPlayer != null && this.mHardwareDecodeEnablePlayer2 == 1) {
            mediaPlayer.setIntOption(181, this.mAsyncInitEnable);
            mediaPlayer.setIntOption(182, this.mCodecId);
            this.mLogger.useAsyncInit(this.mAsyncInitEnable, this.mCodecId);
        }
    }

    public void setDirectUrlUseDataLoader(String[] strArr, String str) {
        if (strArr == null || strArr.length == 0 || TextUtils.isEmpty(strArr[0])) {
            TTVideoEngineLog.m110646e("TTVideoEngine", "invalid urls list, it is empty");
        } else if (TextUtils.isEmpty(str) || this.mDataLoaderEnable == 0) {
            setDirectURL(strArr[0]);
        } else {
            _resetUsingDataLoaderField();
            String _mdlUrl = _mdlUrl(str, this.mVideoID, (long) this.mLimitMDLCacheSize, strArr, Resolution.Undefine, this.mDecryptionKey, null, null, null);
            if (TextUtils.isEmpty(_mdlUrl)) {
                setDirectURL(strArr[0]);
            } else {
                setDirectURL(_mdlUrl);
            }
        }
    }

    public void setDirectUrlUseDataLoaderByFilePath(String[] strArr, String str) {
        if (strArr == null || strArr.length == 0 || TextUtils.isEmpty(strArr[0])) {
            TTVideoEngineLog.m110646e("TTVideoEngine", "invalid urls list, it is empty");
        } else if (TextUtils.isEmpty(str) || this.mDataLoaderEnable == 0) {
            setDirectURL(strArr[0]);
        } else {
            _resetUsingDataLoaderField();
            String _mdlUrl = _mdlUrl(TTHelper.keyFromFilePath(this.mContext, str), this.mVideoID, (long) this.mLimitMDLCacheSize, strArr, Resolution.Undefine, this.mDecryptionKey, null, str, null);
            if (TextUtils.isEmpty(_mdlUrl)) {
                setDirectURL(strArr[0]);
            } else {
                setDirectURL(_mdlUrl);
            }
        }
    }

    private String _generatePlayUrl(String str, HashMap hashMap) {
        String str2;
        if (this.mBashEnabled && isSupportBash(this.mVideoModel) && !TextUtils.isEmpty(str) && !str.startsWith("mem://bash")) {
            String a = C2240a.m6772a("mem://bash/url_index:%d/check_hijack:%d/%s", new Object[]{this.urlIndexMap.get(this.currentResolution), Integer.valueOf(this.mCheckHijack ? 1 : 0), this.mVideoModel.getVideoRefStr(8)});
            if (hashMap != null && hashMap.containsKey("Host")) {
                String obj = hashMap.get("Host").toString();
                try {
                    str2 = new URI(str).getHost();
                } catch (URISyntaxException e) {
                    TTVideoEngineLog.m110645d(e);
                    str2 = null;
                }
                if (!TextUtils.isEmpty(obj) && !TextUtils.isEmpty(str2)) {
                    str = a.replaceAll(obj.trim(), str2);
                }
            }
            str = a;
        }
        if (this.mForbidP2P == 1) {
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.remove("X-Tt-CDN");
            hashMap.put("X-Tt-CDN", "0");
        }
        this.mLogger.setEnableBash(str.startsWith("mem://bash") ? 1 : 0);
        return str;
    }

    private void _setDataSource(String str, HashMap hashMap) throws IOException {
        String _generatePlayUrl = _generatePlayUrl(str, hashMap);
        if (this.mRetryEnableHttps) {
            _generatePlayUrl = TTHelper.buildHttpsUrl(_generatePlayUrl);
        }
        long currentTimeMillis = System.currentTimeMillis();
        P2PPlayUrlInfo generateP2PInfo = generateP2PInfo(_generatePlayUrl, hashMap);
        if (generateP2PInfo.mP2PCDNType > 0) {
            this.mMediaPlayer.setIntOption(310, this.mNetworkTryCount);
            if (this.mLogger != null) {
                this.mLogger.setNetWorkTryCount(this.mNetworkTryCount);
            }
        }
        this.curP2PUrlInfo = generateP2PInfo;
        long currentTimeMillis2 = System.currentTimeMillis();
        if (this.mLogger != null) {
            this.mLogger.setCustomP2PCDNType(this.mP2PCDNType);
            this.mLogger.setP2PCDNType(generateP2PInfo.mP2PCDNType);
            if (generateP2PInfo.mP2PCDNType > 0) {
                this.mLogger.setGenerateP2PInfoStartTime(currentTimeMillis);
                this.mLogger.setGenerateP2PInfoEndTime(currentTimeMillis2);
                this.mLogger.setP2PUrl(generateP2PInfo.mUrl);
                this.mLogger.setP2PSDKVersion(generateP2PInfo.mSDKVersion);
            }
        }
        if (!this.mPrepared) {
            if (TextUtils.isEmpty(this.mLogger.getTraceID())) {
                String genTrackID = TTHelper.genTrackID(AppInfo.mDeviceId, System.currentTimeMillis());
                if (!TextUtils.isEmpty(genTrackID)) {
                    generateP2PInfo.mHeaders.put("X-Tt-Traceid", genTrackID);
                    this.mHeaders.put("X-Tt-Traceid", genTrackID);
                    this.mLogger.setTraceID(genTrackID);
                    StringBuilder sb = new StringBuilder("X-Tt-Traceid:");
                    sb.append(genTrackID);
                    TTVideoEngineLog.m110647i("TTVideoEngine", sb.toString());
                }
            }
            if (this.mFallbackApiRetry != 0) {
                this.mHeaders.put("X-Tt-Fapi", String.valueOf(this.mFallbackApiRetry));
            }
            if (sTestSpeedEnabled) {
                this.mHeaders.put("X-SpeedTest-TimeInternal", String.valueOf(sTestSpeedInterval));
            }
        }
        if (generateP2PInfo.mHeaders != null) {
            StringBuilder sb2 = new StringBuilder("setDataSource X-Tt-Traceid:");
            sb2.append(generateP2PInfo.mHeaders.get("X-Tt-Traceid"));
            TTVideoEngineLog.m110647i("TTVideoEngine", sb2.toString());
        }
        this.mMediaPlayer.setDataSource(this.mContext, Uri.parse(generateP2PInfo.mUrl), (Map<String, String>) generateP2PInfo.mHeaders);
    }

    private void _stop(boolean z, int i) {
        TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("_stop, mState:%d", new Object[]{Integer.valueOf(this.mState)}));
        switch (this.mState) {
            case 0:
                this.mUserStopped = true;
                break;
            case 1:
                this.mUserStopped = true;
                if (this.mFetcher != null) {
                    this.mFetcher.cancel();
                    break;
                }
                break;
            case 2:
                this.mUserStopped = true;
                if (this.mDNSParser != null) {
                    this.mDNSParser.cancel();
                    break;
                }
                break;
            case 3:
                this.mUserStopped = true;
                break;
        }
        _updateLogger();
        if (this.mMediaPlayer != null && this.mPrepared && z) {
            this.mMediaPlayer.stop();
        }
        if (this.mPlayDuration != null) {
            this.mPlayDuration.stop();
        }
        if (this.mLogger != null) {
            if (this.mMediaPlayer != null) {
                this.mLogger.curPlayBackTime(this.mMediaPlayer.getCurrentPosition());
                if (this.mState == 3) {
                    this.mLogger.setHijackCode(this.mMediaPlayer.getIntOption(204, -1));
                }
                this.mLogger.setNetworkSpeedFrom(C48918e.m105713a().mo96744b(), 1);
                HashMap hashMap = new HashMap();
                hashMap.put("abr_probe_count", Integer.valueOf(this.mMediaPlayer.getIntOption(179, 0)));
                hashMap.put("abr_switch_count", Integer.valueOf(this.mMediaPlayer.getIntOption(173, 0)));
                hashMap.put("abr_average_bitrate", Integer.valueOf(this.mMediaPlayer.getIntOption(174, 0)));
                hashMap.put("abr_average_play_speed", Integer.valueOf(this.mMediaPlayer.getIntOption(175, 0)));
                this.mLogger.setAbrInfo(hashMap);
            }
            if (!(this.mPlaybackState == 0 || this.mPlayDuration == null)) {
                this.mLogger.addWatchedDuration(this.mPlayDuration.getPlayedDuration());
            }
            this.mLogger.stop(i);
        }
        _updatePlaybackState(0);
    }

    public static void addTask(String str, PreloaderVidItem preloaderVidItem) {
        DataLoaderHelper.getDataLoader().addTask(str, preloaderVidItem);
    }

    private P2PPlayUrlInfo generateP2PInfo(String str, HashMap hashMap) {
        P2PPlayUrlInfo p2PPlayUrlInfo = new P2PPlayUrlInfo(str, hashMap, 0);
        if (this.mP2PCDNType == 0 || TextUtils.isEmpty(str) || str.startsWith("http://127.0.0.1") || str.startsWith("mem://")) {
            return p2PPlayUrlInfo;
        }
        int parseP2PCDNType = parseP2PCDNType(str);
        if (parseP2PCDNType != 1) {
            return p2PPlayUrlInfo;
        }
        String str2 = "";
        if (hashMap != null && hashMap.containsKey("Host")) {
            String obj = hashMap.get("Host").toString();
            try {
                str2 = new URI(str).getHost();
            } catch (URISyntaxException e) {
                TTVideoEngineLog.m110645d(e);
            }
            if (!TextUtils.isEmpty(obj) && !TextUtils.isEmpty(str2)) {
                str = str.replaceFirst(str2, obj.trim());
                if (!TextUtils.isEmpty(str2)) {
                    StringBuilder sb = new StringBuilder("xycip=");
                    sb.append(str2);
                    str = TTHelper.appendQueryString(str, sb.toString());
                }
            }
        }
        if (this.mForbidP2P == 1) {
            str = TTHelper.appendQueryString(str, "xyp2p=0");
        }
        String reWriteUrl = VideoLoadWrapper.getInstance().getReWriteUrl(TTHelper.appendQueryString(str, "xynp=1&xyer=1"), 1);
        if (this.mLogger != null) {
            this.mLogger.setGetP2PUrlT(System.currentTimeMillis());
        }
        if (!TextUtils.isEmpty(reWriteUrl) && (reWriteUrl.startsWith("http://127.0.0.1") || reWriteUrl.startsWith("https://127.0.0.1"))) {
            if (hashMap != null) {
                hashMap.remove("Host");
            }
            p2PPlayUrlInfo.mP2PCDNType = parseP2PCDNType;
            p2PPlayUrlInfo.mUrl = reWriteUrl;
            p2PPlayUrlInfo.mHeaders = hashMap;
            p2PPlayUrlInfo.mSDKVersion = VideoLoadWrapper.getInstance().getSDKVersion();
        }
        return p2PPlayUrlInfo;
    }

    public TTVideoEngine(Context context, int i) {
        boolean z;
        boolean z2;
        JniUtils.loadLibrary();
        TTVideoEngineLog.m110647i("TTVideoEngine", "init");
        this.mContext = context;
        this.mIsMute = false;
        this.mFirstURL = true;
        this.mFirstIP = true;
        this.mFirstHost = true;
        this.currentResolution = Resolution.Standard;
        this.urlIndexMap = new HashMap();
        _resetUrlIndexMap();
        this.urlIPMap = new HashMap();
        this.mHeaders = new HashMap<>();
        this.mConfigParams = new HashMap<>();
        this.mPlayerType = i;
        this.mTextureFirstFrame = false;
        this.mPlayerFirstFrame = false;
        this.mDataLoaderEnable = ONLY_USE_MEDIALOADER ? 1 : 0;
        TTPlayerConfiger.setValue(6, false);
        if (i != 2) {
            z = true;
        } else {
            z = false;
        }
        TTPlayerConfiger.setValue(1, z);
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        TTPlayerConfiger.setValue(2, z2);
        TTPlayerConfiger.setValue(11, false);
        TTPlayerConfiger.setValue(4, false);
        if (i == 3) {
            setForceUseLitePlayer(true);
        }
        if (VideoEventManager.instance.getLoggerVersion() == 2) {
            this.mLogger = new VideoEventLoggerV2(context, new MyLoggerDataSource(this));
        } else {
            this.mLogger = new VideoEventLogger(context, new MyLoggerDataSource(this));
        }
        this.mLogger.configResolution(_resolutionToString(this.currentResolution), "");
        if (!ONLY_USE_MEDIALOADER) {
            createDefaultCacheFileDirectory();
        }
        this.mPlayDuration = new PlayDuration();
        if (!TimeService.isUpdated()) {
            TimeService.updateTimeFromNTP(this.mContext);
        }
        this.mInfoCollector = VideoInfoCollector.getInstance();
        if (this.mInfoCollector != null) {
            this.mInfoCollector.registEngine(this.mSerial, this);
        }
        this.mNetWorkChangeCb = new TTNetworkStateCallback() {
            public void onAccessChanged(int i, int i2) {
                StringBuilder sb = new StringBuilder("access changed, from: ");
                sb.append(i);
                sb.append(" to: ");
                sb.append(i2);
                TTVideoEngineLog.m110644d("TTVideoEngine", sb.toString());
                TTVideoEngine.setIntValue(1000, 1);
                TTVideoEngine.setIntValue(1104, i2);
            }
        };
        TTNetWorkListener.getInstance(context).startListen(this.mNetWorkChangeCb);
    }

    private void _switchToResolution(Resolution resolution, Map<Integer, String> map) {
        int i;
        if (this.currentResolution == resolution && ((this.currentParams == null && map == null) || (this.currentParams != null && this.currentParams.equals(map)))) {
            TTVideoEngineLog.m110646e("TTVideoEngine", C2240a.m6772a("switch to the same resolution:%s, drop", new Object[]{_resolutionToString(resolution)}));
        } else if (this.mVideoModel != null) {
            this.lastResolution = this.currentResolution;
            this.currentResolution = resolution;
            this.currentParams = map;
            TTVideoEngineLog.m110647i("TTVideoEngine", C2240a.m6772a("will switch to resolution:%s, from resolution:%s", new Object[]{_resolutionToString(this.currentResolution), _resolutionToString(this.lastResolution)}));
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    StringBuilder sb = new StringBuilder("will switch to params, Key = ");
                    sb.append(entry.getKey());
                    sb.append(",Value = ");
                    sb.append((String) entry.getValue());
                    TTVideoEngineLog.m110647i("TTVideoEngine", sb.toString());
                }
            }
            this.mLogger.switchResolution(_resolutionToString(this.currentResolution), _resolutionToString(this.lastResolution));
            if (this.mDashEnabled) {
                String str = null;
                int i2 = VideoRef.TYPE_VIDEO;
                if (this.mVideoModel.getVideoRef() != null) {
                    if (map == null) {
                        map = new HashMap<>();
                    }
                    if (map != null && this.mH265Enabled && this.mVideoModel.getVideoRefBool(204)) {
                        map.put(Integer.valueOf(8), "h265");
                    } else if (map != null && this.mVideoModel.getVideoRefBool(203)) {
                        map.put(Integer.valueOf(8), "h264");
                    }
                    VideoInfo _videoInfoForResolution = _videoInfoForResolution(this.currentResolution, this.mVideoModel.getVideoRefInt(7), map);
                    if (_videoInfoForResolution != null) {
                        str = _videoInfoForResolution.getValueStr(6);
                        int valueInt = _videoInfoForResolution.getValueInt(3);
                        int mediatype = _videoInfoForResolution.getMediatype();
                        i = valueInt;
                        i2 = mediatype;
                    } else {
                        i = 0;
                    }
                    String dynamicType = this.mVideoModel.getDynamicType();
                    if (!TextUtils.isEmpty(dynamicType) && dynamicType.equals("segment_base") && this.mVideoEngineInfoListener != null && this.mVideoEngineInfos != null) {
                        ArrayList arrayList = new ArrayList();
                        VideoInfo _videoInfoForResolution2 = _videoInfoForResolution(this.currentResolution, VideoRef.TYPE_VIDEO, map);
                        VideoInfo _videoInfoForResolution3 = _videoInfoForResolution(this.currentResolution, VideoRef.TYPE_AUDIO, map);
                        if (_videoInfoForResolution2 != null) {
                            arrayList.add(_videoInfoForResolution2);
                        }
                        if (_videoInfoForResolution3 != null) {
                            arrayList.add(_videoInfoForResolution3);
                        }
                        this.mVideoEngineInfos.setKey("usingUrlInfos");
                        this.mVideoEngineInfos.setUrlInfos(arrayList);
                        this.mVideoEngineInfoListener.onVideoEngineInfos(this.mVideoEngineInfos);
                    }
                } else {
                    i = 0;
                }
                if (TextUtils.isEmpty(str) || (!str.equals("dash") && !str.equals("mpd"))) {
                    this.mDashEnabled = false;
                    this.mIsDashSource = false;
                } else if (!(this.mMediaPlayer == null || isSystemPlayer() || this.mPlaybackState == 2)) {
                    if (this.mUsePlayer3) {
                        _selectTrack(i, i2);
                        return;
                    } else {
                        this.mMediaPlayer.switchStream(i, i2);
                        return;
                    }
                }
            }
            if (!this.mSwitchingResolution) {
                this.mSwitchingResolution = true;
                this.mLogger.switchResolution();
                if (!this.mDashEnabled && this.mPlayDuration != null) {
                    this.mPlayDuration.stop();
                }
                this.mLastPlaybackTime = _getPlayerTime();
            }
            if (this.mMediaPlayer != null) {
                this.mMediaPlayer.pause();
            }
            _parseIPAddress(this.mVideoModel);
        }
    }

    public void setPlayInfo(int i, long j) {
        String str;
        if (this.mEnableSetPlayInfoToP2P == 0 || this.mForbidP2P == 1 || this.mP2PCDNType <= 0) {
            TTVideoEngineLog.m110649t("TTVideoEngine", "not enable set playinfo");
            return;
        }
        int i2 = 3;
        int i3 = -1;
        if (this.curP2PUrlInfo != null && this.curP2PUrlInfo.mP2PCDNType > 0 && !TextUtils.isEmpty(this.curP2PUrlInfo.mUrl)) {
            switch (i) {
                case 0:
                    i2 = 2;
                    break;
                case 2:
                    break;
                default:
                    i2 = -1;
                    break;
            }
            if (i == 1) {
                TTVideoEngineLog.m110649t("PROXY-XY-SETPLAYINFO", C2240a.m6772a("set play info into xyproxy p2p  key is play pos value:%d", new Object[]{Long.valueOf(j)}));
                VideoLoadWrapper.getInstance().setPlayPos(this.curP2PUrlInfo.mUrl, j);
            } else {
                TTVideoEngineLog.m110649t("PROXY-XY-SETPLAYINFO", C2240a.m6772a("set play info into xyproxy p2p key:%d value:%d", new Object[]{Integer.valueOf(i2), Long.valueOf(j)}));
                VideoLoadWrapper.getInstance().setPlayInfo(this.curP2PUrlInfo.mUrl, i2, j);
            }
        } else if (this.mDataLoaderEnable > 0) {
            if (this.mLogger == null) {
                str = null;
            } else {
                str = this.mLogger.getTraceID();
            }
            if (TextUtils.isEmpty(str)) {
                TTVideoEngineLog.m110649t("TTVideoEngine", "trace id null, not allow setplayinfo");
                return;
            }
            switch (i) {
                case 0:
                    i3 = 22;
                    break;
                case 1:
                    i3 = 23;
                    break;
                case 2:
                    i3 = 24;
                    break;
                case 3:
                    i3 = 25;
                    break;
                case 4:
                    i3 = 26;
                    break;
                case 5:
                    if (this.mMediaPlayer != null) {
                        if (j == -1) {
                            long longOption = this.mMediaPlayer.getLongOption(73, -1);
                            long longOption2 = this.mMediaPlayer.getLongOption(72, -1);
                            if (longOption >= 0 && longOption2 >= 0) {
                                longOption = Math.min(longOption, longOption2);
                            } else if (longOption2 >= 0) {
                                j = longOption2;
                            }
                            j = longOption;
                        }
                        i3 = 27;
                        break;
                    } else {
                        TTVideoEngineLog.m110649t("MDL-SETPLAYINFO", "mediaplayer is null not allow set PLAY_INFO_CURRENT_BUFFER");
                        return;
                    }
            }
            DataLoaderHelper.getDataLoader().setPlayInfo(i3, str, j);
            TTVideoEngineLog.m110649t("MDL-SETPLAYINFO", C2240a.m6772a("set play info into mdl key:%d value:%d traceid:%s", new Object[]{Integer.valueOf(i3), Long.valueOf(j), str}));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:147:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x058b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setIntOption(int r9, int r10) {
        /*
            r8 = this;
            r0 = 59
            r1 = 24
            r2 = 11
            r3 = 2
            r4 = 0
            r5 = 1
            switch(r9) {
                case 0: goto L_0x0605;
                case 1: goto L_0x05f7;
                case 2: goto L_0x05e9;
                case 3: goto L_0x05dc;
                case 4: goto L_0x05ce;
                case 5: goto L_0x05c0;
                case 6: goto L_0x05b8;
                case 7: goto L_0x0594;
                case 8: goto L_0x0585;
                case 9: goto L_0x0576;
                default: goto L_0x000c;
            }
        L_0x000c:
            switch(r9) {
                case 11: goto L_0x055b;
                case 12: goto L_0x0548;
                default: goto L_0x000f;
            }
        L_0x000f:
            switch(r9) {
                case 14: goto L_0x0544;
                case 15: goto L_0x0540;
                case 16: goto L_0x052f;
                case 17: goto L_0x0526;
                case 18: goto L_0x051d;
                case 19: goto L_0x0519;
                case 20: goto L_0x0505;
                case 21: goto L_0x04f0;
                case 22: goto L_0x04e5;
                case 23: goto L_0x04da;
                case 24: goto L_0x04cb;
                case 25: goto L_0x04bc;
                case 26: goto L_0x04a8;
                case 27: goto L_0x04a4;
                case 28: goto L_0x04a0;
                case 29: goto L_0x0452;
                case 30: goto L_0x042d;
                case 31: goto L_0x0420;
                case 32: goto L_0x0411;
                case 33: goto L_0x0408;
                case 34: goto L_0x03f9;
                default: goto L_0x0012;
            }
        L_0x0012:
            switch(r9) {
                case 36: goto L_0x03ea;
                case 37: goto L_0x03e1;
                default: goto L_0x0015;
            }
        L_0x0015:
            switch(r9) {
                case 100: goto L_0x03d8;
                case 101: goto L_0x03d4;
                default: goto L_0x0018;
            }
        L_0x0018:
            switch(r9) {
                case 110: goto L_0x03d0;
                case 111: goto L_0x03c7;
                default: goto L_0x001b;
            }
        L_0x001b:
            r0 = 86
            switch(r9) {
                case 117: goto L_0x03c1;
                case 118: goto L_0x03b4;
                default: goto L_0x0020;
            }
        L_0x0020:
            switch(r9) {
                case 160: goto L_0x03b0;
                case 161: goto L_0x03ac;
                default: goto L_0x0023;
            }
        L_0x0023:
            switch(r9) {
                case 183: goto L_0x039b;
                case 184: goto L_0x038c;
                default: goto L_0x0026;
            }
        L_0x0026:
            r2 = 95
            switch(r9) {
                case 198: goto L_0x037d;
                case 199: goto L_0x0379;
                case 200: goto L_0x0368;
                case 201: goto L_0x034f;
                case 202: goto L_0x0340;
                case 203: goto L_0x0333;
                case 204: goto L_0x0324;
                case 205: goto L_0x0315;
                case 206: goto L_0x030a;
                case 207: goto L_0x02f6;
                case 208: goto L_0x02e7;
                default: goto L_0x002b;
            }
        L_0x002b:
            switch(r9) {
                case 210: goto L_0x02d8;
                case 211: goto L_0x02c9;
                case 212: goto L_0x02ba;
                case 213: goto L_0x02ab;
                case 214: goto L_0x029c;
                case 215: goto L_0x028d;
                case 216: goto L_0x027e;
                default: goto L_0x002e;
            }
        L_0x002e:
            switch(r9) {
                case 301: goto L_0x027a;
                case 302: goto L_0x0276;
                default: goto L_0x0031;
            }
        L_0x0031:
            switch(r9) {
                case 310: goto L_0x0267;
                case 311: goto L_0x025a;
                case 312: goto L_0x0251;
                case 313: goto L_0x0248;
                case 314: goto L_0x0244;
                default: goto L_0x0034;
            }
        L_0x0034:
            switch(r9) {
                case 320: goto L_0x022c;
                case 321: goto L_0x021d;
                case 322: goto L_0x020e;
                case 323: goto L_0x01ff;
                case 324: goto L_0x01f0;
                default: goto L_0x0037;
            }
        L_0x0037:
            switch(r9) {
                case 329: goto L_0x01ec;
                case 330: goto L_0x01dd;
                case 331: goto L_0x01cc;
                case 332: goto L_0x01b6;
                case 333: goto L_0x01a0;
                default: goto L_0x003a;
            }
        L_0x003a:
            switch(r9) {
                case 400: goto L_0x0197;
                case 401: goto L_0x0193;
                case 402: goto L_0x018f;
                case 403: goto L_0x0186;
                default: goto L_0x003d;
            }
        L_0x003d:
            switch(r9) {
                case 410: goto L_0x017d;
                case 411: goto L_0x0176;
                case 412: goto L_0x0171;
                case 413: goto L_0x015e;
                case 414: goto L_0x014b;
                case 415: goto L_0x013c;
                case 416: goto L_0x0138;
                case 417: goto L_0x0129;
                case 418: goto L_0x0125;
                case 419: goto L_0x0121;
                case 420: goto L_0x011d;
                case 421: goto L_0x0119;
                case 422: goto L_0x0115;
                case 423: goto L_0x0111;
                case 424: goto L_0x010d;
                case 425: goto L_0x0109;
                default: goto L_0x0040;
            }
        L_0x0040:
            switch(r9) {
                case 430: goto L_0x00f6;
                case 431: goto L_0x00f2;
                default: goto L_0x0043;
            }
        L_0x0043:
            switch(r9) {
                case 470: goto L_0x00e9;
                case 471: goto L_0x00e5;
                case 472: goto L_0x022c;
                case 473: goto L_0x00e1;
                case 474: goto L_0x00dd;
                case 475: goto L_0x00d9;
                case 476: goto L_0x00c8;
                default: goto L_0x0046;
            }
        L_0x0046:
            switch(r9) {
                case 478: goto L_0x00c4;
                case 479: goto L_0x00b7;
                case 480: goto L_0x00a4;
                case 481: goto L_0x0091;
                default: goto L_0x0049;
            }
        L_0x0049:
            switch(r9) {
                case 120: goto L_0x0082;
                case 250: goto L_0x0073;
                case 427: goto L_0x006a;
                case 450: goto L_0x0061;
                case 460: goto L_0x0052;
                case 500: goto L_0x004e;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x0610
        L_0x004e:
            r8.mABRTimerIntervalMilliseconds = r10
            goto L_0x0610
        L_0x0052:
            r8.mHardwareDropNonRef = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 252(0xfc, float:3.53E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x0061:
            if (r10 <= 0) goto L_0x0065
            r0 = 1
            goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            r8.mAllowedExpiredModel = r0
            goto L_0x0610
        L_0x006a:
            if (r10 != r5) goto L_0x006e
            r0 = 1
            goto L_0x006f
        L_0x006e:
            r0 = 0
        L_0x006f:
            r8.mHijackRetry = r0
            goto L_0x0610
        L_0x0073:
            r8.mIsTTHlsDrm = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 250(0xfa, float:3.5E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x0082:
            r8.mMediaCodecSyncMode = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 90
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x0091:
            r8.mDelayBufferingUpdate = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            boolean r0 = r8.mUsePlayer3
            if (r0 != 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 263(0x107, float:3.69E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x00a4:
            r8.mRadioModeEnable = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            boolean r0 = r8.mUsePlayer3
            if (r0 != 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 261(0x105, float:3.66E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x00b7:
            com.ss.ttvideoengine.log.IVideoEventLogger r0 = r8.mLogger
            if (r0 == 0) goto L_0x0610
            com.ss.ttvideoengine.log.IVideoEventLogger r0 = r8.mLogger
            r1 = 10
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x00c4:
            r8.mEnableAsync = r10
            goto L_0x0610
        L_0x00c8:
            r8.mEglVersion = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 256(0x100, float:3.59E-43)
            int r2 = r8.mEglVersion
            r0.setIntOption(r1, r2)
            goto L_0x0610
        L_0x00d9:
            r8.mAudioRangeTime = r10
            goto L_0x0610
        L_0x00dd:
            r8.mVideoRangeTime = r10
            goto L_0x0610
        L_0x00e1:
            r8.mRangeMode = r10
            goto L_0x0610
        L_0x00e5:
            r8.mFallbackApiRetry = r10
            goto L_0x0610
        L_0x00e9:
            if (r10 != r5) goto L_0x00ed
            r0 = 1
            goto L_0x00ee
        L_0x00ed:
            r0 = 0
        L_0x00ee:
            com.p683ss.ttvideoengine.TTVideoEngineConfig.openPerformanceUtils = r0
            goto L_0x0610
        L_0x00f2:
            r8.mAccurateLayout = r10
            goto L_0x0610
        L_0x00f6:
            r8.mVoiceType = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            boolean r0 = r8.mUsePlayer3
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 802(0x322, float:1.124E-42)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x0109:
            r8.mHijackRetryBackupDNSType = r10
            goto L_0x0610
        L_0x010d:
            r8.mHijackRetryMainDNSType = r10
            goto L_0x0610
        L_0x0111:
            r8.mAudioRangeSize = r10
            goto L_0x0610
        L_0x0115:
            r8.mVideoRangeSize = r10
            goto L_0x0610
        L_0x0119:
            r8.mEnableFragRange = r10
            goto L_0x0610
        L_0x011d:
            r8.mEnableIndexCache = r10
            goto L_0x0610
        L_0x0121:
            r8.mBestResolutionType = r10
            goto L_0x0610
        L_0x0125:
            r8.mForbidP2PWhenSeek = r10
            goto L_0x0610
        L_0x0129:
            r8.mSoloPlayEnable = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 185(0xb9, float:2.59E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x0138:
            r8.mEnableSetPlayInfoToP2P = r10
            goto L_0x0610
        L_0x013c:
            r8.mSetTrackVolume = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 94
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x014b:
            r8.mDefaultRenderType = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            boolean r0 = r8.mUsePlayer3
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 49
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x015e:
            r8.mUseAudioHWDec = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            boolean r0 = r8.mUsePlayer3
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 803(0x323, float:1.125E-42)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x0171:
            p096cn.p097a.p098a.p099a.C2236f.m6769b(r1, r10)
            goto L_0x0610
        L_0x0176:
            r0 = 25
            p096cn.p097a.p098a.p099a.C2236f.m6769b(r0, r10)
            goto L_0x0610
        L_0x017d:
            if (r10 != r5) goto L_0x0181
            r0 = 1
            goto L_0x0182
        L_0x0181:
            r0 = 0
        L_0x0182:
            r8.mAsyncPlayHitVMCache = r0
            goto L_0x0610
        L_0x0186:
            if (r10 != r5) goto L_0x018a
            r0 = 1
            goto L_0x018b
        L_0x018a:
            r0 = 0
        L_0x018b:
            r8.mIsUseServerDns = r0
            goto L_0x0610
        L_0x018f:
            r8.mSeekEndEnabled = r10
            goto L_0x0610
        L_0x0193:
            r8.mEnableOppoControl = r10
            goto L_0x0610
        L_0x0197:
            if (r10 != r5) goto L_0x019b
            r0 = 1
            goto L_0x019c
        L_0x019b:
            r0 = 0
        L_0x019c:
            r8.mIsUseBoe = r0
            goto L_0x0610
        L_0x01a0:
            r8.mNeedAdaptiveWorkaround = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mAsyncPlayer
            if (r0 == 0) goto L_0x01a9
            com.ss.ttm.player.MediaPlayer r0 = r8.mAsyncPlayer
            goto L_0x01ab
        L_0x01a9:
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
        L_0x01ab:
            if (r0 == 0) goto L_0x0610
            r1 = 254(0xfe, float:3.56E-43)
            int r2 = r8.mNeedAdaptiveWorkaround
            r0.setIntOption(r1, r2)
            goto L_0x0610
        L_0x01b6:
            r8.mUseCodecPool = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mAsyncPlayer
            if (r0 == 0) goto L_0x01bf
            com.ss.ttm.player.MediaPlayer r0 = r8.mAsyncPlayer
            goto L_0x01c1
        L_0x01bf:
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
        L_0x01c1:
            if (r0 == 0) goto L_0x0610
            r1 = 400(0x190, float:5.6E-43)
            int r2 = r8.mUseCodecPool
            r0.setIntOption(r1, r2)
            goto L_0x0610
        L_0x01cc:
            r8.mEnableSeekInterrupt = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 248(0xf8, float:3.48E-43)
            int r2 = r8.mEnableSeekInterrupt
            r0.setIntOption(r1, r2)
            goto L_0x0610
        L_0x01dd:
            r8.mDisablePlayerTimeOut = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 247(0xf7, float:3.46E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x01ec:
            r8.mEnableVolumeBalance = r10
            goto L_0x0610
        L_0x01f0:
            r8.mUseQcomLowLatency = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 215(0xd7, float:3.01E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x01ff:
            r8.mMediaCodecSkipNonRef = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 216(0xd8, float:3.03E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x020e:
            r8.mNotifyBufferingDirectly = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 211(0xd3, float:2.96E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x021d:
            r8.mExposeSignal = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 301(0x12d, float:4.22E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x022c:
            r8.mOutputLog = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0239
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 223(0xdf, float:3.12E-43)
            r0.setIntOption(r1, r10)
        L_0x0239:
            com.ss.ttvideoengine.DataLoaderHelper r0 = com.p683ss.ttvideoengine.DataLoaderHelper.getDataLoader()
            r1 = 512(0x200, float:7.175E-43)
            r0.setIntValue(r1, r10)
            goto L_0x0610
        L_0x0244:
            r8.mTimeBarPercentage = r10
            goto L_0x0610
        L_0x0248:
            if (r10 != r5) goto L_0x024c
            r0 = 1
            goto L_0x024d
        L_0x024c:
            r0 = 0
        L_0x024d:
            r8.mCheckHijack = r0
            goto L_0x0610
        L_0x0251:
            if (r10 != r5) goto L_0x0255
            r0 = 1
            goto L_0x0256
        L_0x0255:
            r0 = 0
        L_0x0256:
            r8.mEnableHttps = r0
            goto L_0x0610
        L_0x025a:
            r8.mIsPreferNearestSample = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r0.setIntOption(r2, r10)
            goto L_0x0610
        L_0x0267:
            r8.mNetworkTryCount = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 230(0xe6, float:3.22E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x0276:
            r8.mForbidP2P = r10
            goto L_0x0610
        L_0x027a:
            r8.mP2PCDNType = r10
            goto L_0x0610
        L_0x027e:
            r8.mUseMediacodecAudio = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 97
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x028d:
            r8.mMediaCodecRender = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 88
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x029c:
            r8.mSkipAudioGraph = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 199(0xc7, float:2.79E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x02ab:
            r8.mLoopReferVideo = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 195(0xc3, float:2.73E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x02ba:
            r8.mSuperResStrengh = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 167(0xa7, float:2.34E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x02c9:
            r8.mSuperResFxaa = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 166(0xa6, float:2.33E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x02d8:
            r8.mSuperRes = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 165(0xa5, float:2.31E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x02e7:
            r8.mKsyFrameWait = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 192(0xc0, float:2.69E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x02f6:
            int r0 = r8.mFrameDropNum
            if (r0 >= 0) goto L_0x02fb
            return
        L_0x02fb:
            r8.mFrameDropNum = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 159(0x9f, float:2.23E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x030a:
            com.ss.ttvideoengine.log.IVideoEventLogger r0 = r8.mLogger
            if (r0 == 0) goto L_0x0610
            com.ss.ttvideoengine.log.IVideoEventLogger r0 = r8.mLogger
            r0.didSentEvent(r10)
            goto L_0x0610
        L_0x0315:
            r8.mMaxFps = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 134(0x86, float:1.88E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x0324:
            r8.mSkipFfmpegFindStreamInfo = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 96
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x0333:
            r8.mMovPreferNearestSample = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r0.setIntOption(r2, r10)
            goto L_0x0610
        L_0x0340:
            r8.mMaxBufferDataMilliSeconds = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 110(0x6e, float:1.54E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x034f:
            r8.mTestNetSpeedDiff = r10
            int r0 = r8.mTestNetSpeedDiff
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L_0x0359
            r8.mTestNetSpeedDiff = r1
        L_0x0359:
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 66
            int r2 = r8.mTestNetSpeedDiff
            r0.setIntOption(r1, r2)
            goto L_0x0610
        L_0x0368:
            int r1 = r10 * 1000
            r8.mBufferDataMiliSeconds = r1
            com.ss.ttm.player.MediaPlayer r1 = r8.mMediaPlayer
            if (r1 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r1 = r8.mMediaPlayer
            int r2 = r8.mBufferDataMiliSeconds
            r1.setIntOption(r0, r2)
            goto L_0x0610
        L_0x0379:
            r8.mUseTextureRender = r10
            goto L_0x0610
        L_0x037d:
            r8.mIsDisableShortSeek = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 201(0xc9, float:2.82E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x038c:
            r8.mOriginalRetry = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 197(0xc5, float:2.76E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x039b:
            r8.mEGLNeedWorkAround = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            if (r10 != 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 183(0xb7, float:2.56E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x03ac:
            r8.mLimitMDLCacheSize = r10
            goto L_0x0610
        L_0x03b0:
            r8.mDataLoaderEnable = r10
            goto L_0x0610
        L_0x03b4:
            r8.mBufferDataMiliSeconds = r10
            com.ss.ttm.player.MediaPlayer r1 = r8.mMediaPlayer
            if (r1 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r1 = r8.mMediaPlayer
            r1.setIntOption(r0, r10)
            goto L_0x0610
        L_0x03c1:
            r0 = 4
            com.p683ss.ttm.player.TTPlayerConfiger.setValue(r0, r10)
            goto L_0x0610
        L_0x03c7:
            if (r10 != r5) goto L_0x03cb
            r0 = 1
            goto L_0x03cc
        L_0x03cb:
            r0 = 0
        L_0x03cc:
            r8.mUsePlayerSpade = r0
            goto L_0x0610
        L_0x03d0:
            r8.mIsUsePlayerDNS = r10
            goto L_0x0610
        L_0x03d4:
            r8.mEnableSharp = r10
            goto L_0x0610
        L_0x03d8:
            if (r10 == 0) goto L_0x03dc
            r0 = 1
            goto L_0x03dd
        L_0x03dc:
            r0 = 0
        L_0x03dd:
            r8.mIsStartPlayAutomatically = r0
            goto L_0x0610
        L_0x03e1:
            if (r10 != r5) goto L_0x03e5
            r0 = 1
            goto L_0x03e6
        L_0x03e5:
            r0 = 0
        L_0x03e6:
            r8.mDrmRetry = r0
            goto L_0x0610
        L_0x03ea:
            r8.mDrmDowngrade = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 208(0xd0, float:2.91E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x03f9:
            r8.mDrmType = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 206(0xce, float:2.89E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x0408:
            if (r10 != r5) goto L_0x040c
            r0 = 1
            goto L_0x040d
        L_0x040c:
            r0 = 0
        L_0x040d:
            r8.mBashEnabled = r0
            goto L_0x0610
        L_0x0411:
            r8.mLoopCount = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 193(0xc1, float:2.7E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x0420:
            r8.mHardwareDecodeEnablePlayer3 = r10
            com.ss.ttm.player.MediaPlayer r1 = r8.mMediaPlayer
            if (r1 == 0) goto L_0x0585
            com.ss.ttm.player.MediaPlayer r1 = r8.mMediaPlayer
            r1.setIntOption(r0, r10)
            goto L_0x0585
        L_0x042d:
            if (r10 != r5) goto L_0x044e
            r8.mUsePlayer3 = r5
            r0 = 6
            p096cn.p097a.p098a.p099a.C2236f.m6768a(r0, r4)
            int r0 = r8.mPlayerType
            if (r0 == r3) goto L_0x043b
            r0 = 1
            goto L_0x043c
        L_0x043b:
            r0 = 0
        L_0x043c:
            p096cn.p097a.p098a.p099a.C2236f.m6768a(r5, r0)
            int r0 = r8.mPlayerType
            if (r0 != r5) goto L_0x0445
            r0 = 1
            goto L_0x0446
        L_0x0445:
            r0 = 0
        L_0x0446:
            p096cn.p097a.p098a.p099a.C2236f.m6768a(r3, r0)
            p096cn.p097a.p098a.p099a.C2236f.m6768a(r2, r4)
            goto L_0x0610
        L_0x044e:
            r8.mUsePlayer3 = r4
            goto L_0x0610
        L_0x0452:
            r8.mDashAbr = r10
            int r0 = r8.mDashAbr
            if (r0 <= 0) goto L_0x0493
            com.bytedance.vcloud.abrmodule.IABRModule r0 = r8.mABRModule
            if (r0 != 0) goto L_0x0493
            java.lang.String r0 = "TTVideoEngine"
            java.lang.String r1 = "[ABR] 开启ABR，算法类型:%d"
            java.lang.Object[] r2 = new java.lang.Object[r5]
            int r6 = sABRAlgorithmType
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r4] = r6
            java.lang.String r1 = com.C2240a.m6772a(r1, r2)
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110644d(r0, r1)
            com.bytedance.vcloud.abrmodule.DefaultABRModule r0 = new com.bytedance.vcloud.abrmodule.DefaultABRModule
            int r1 = sABRAlgorithmType
            r0.<init>(r1)
            r8.mABRModule = r0
            com.bytedance.vcloud.abrmodule.IABRModule r0 = r8.mABRModule
            com.ss.ttvideoengine.TTVideoEngine$MyABRInfoListener r1 = new com.ss.ttvideoengine.TTVideoEngine$MyABRInfoListener
            r1.<init>(r8)
            r0.setInfoListener(r1)
            com.bytedance.vcloud.abrmodule.IABRModule r0 = r8.mABRModule
            com.ss.ttvideoengine.TTVideoEngine$MyInitParams r1 = new com.ss.ttvideoengine.TTVideoEngine$MyInitParams
            r1.<init>(r8)
            com.ss.ttvideoengine.TTVideoEngine$MyPlayStateSupplier r2 = new com.ss.ttvideoengine.TTVideoEngine$MyPlayStateSupplier
            r2.<init>(r8)
            r0.init(r1, r2)
        L_0x0493:
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 172(0xac, float:2.41E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x04a0:
            r8.mMaxAccumulatedCountSetByUser = r10
            goto L_0x0610
        L_0x04a4:
            r8.mCleanWhenStop = r10
            goto L_0x0610
        L_0x04a8:
            r8.mReuseSocket = r10
            com.ss.ttvideoengine.log.IVideoEventLogger r0 = r8.mLogger
            r0.setReuseSocket(r10)
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 154(0x9a, float:2.16E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x04bc:
            r8.mLoopEndTime = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 138(0x8a, float:1.93E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x04cb:
            r8.mLoopStartTime = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 137(0x89, float:1.92E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x04da:
            com.ss.ttvideoengine.VideoModelCache r0 = r8.mVideoModelCache
            if (r0 == 0) goto L_0x0610
            com.ss.ttvideoengine.VideoModelCache r0 = r8.mVideoModelCache
            r0.setCacheNb(r10)
            goto L_0x0610
        L_0x04e5:
            com.ss.ttvideoengine.VideoModelCache r0 = r8.mVideoModelCache
            if (r0 == 0) goto L_0x0610
            com.ss.ttvideoengine.VideoModelCache r0 = r8.mVideoModelCache
            r0.setTimeOutInSec(r10)
            goto L_0x0610
        L_0x04f0:
            if (r10 != r5) goto L_0x0501
            r8.mUseVideoModelCache = r5
            com.ss.ttvideoengine.VideoModelCache r0 = com.p683ss.ttvideoengine.VideoModelCache.getInstance()
            r8.mVideoModelCache = r0
            android.content.Context r0 = r8.mContext
            com.p683ss.ttvideoengine.database.VideoModelDBManager.getInstance(r0)
            goto L_0x0610
        L_0x0501:
            r8.mUseVideoModelCache = r4
            goto L_0x0610
        L_0x0505:
            r8.mDisableAccurateStart = r10
            com.ss.ttvideoengine.log.IVideoEventLogger r0 = r8.mLogger
            r0.setDisableAccurateStart(r10)
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 133(0x85, float:1.86E-43)
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x0519:
            r8.mDNSExpiredTime = r10
            goto L_0x0610
        L_0x051d:
            if (r10 != r5) goto L_0x0521
            r0 = 1
            goto L_0x0522
        L_0x0521:
            r0 = 0
        L_0x0522:
            r8.mUseDNSCache = r0
            goto L_0x0610
        L_0x0526:
            if (r10 != r5) goto L_0x052a
            r0 = 1
            goto L_0x052b
        L_0x052a:
            r0 = 0
        L_0x052b:
            r8.mDashEnabled = r0
            goto L_0x0610
        L_0x052f:
            r8.mTestAction = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 83
            int r2 = r8.mTestAction
            r0.setIntOption(r1, r2)
            goto L_0x0610
        L_0x0540:
            r8.mUseExternalDir = r10
            goto L_0x0610
        L_0x0544:
            r8.mMaxFileCacheSize = r10
            goto L_0x0610
        L_0x0548:
            r8.mNetworkTimeout = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 9
            int r2 = PLAYER_TIME_BASE
            int r2 = r2 * r10
            r0.setIntOption(r1, r2)
            goto L_0x0610
        L_0x055b:
            r8.mBufferTimeout = r10
            long r0 = r8.mSettingMask
            r6 = 4
            long r0 = r0 | r6
            r8.mSettingMask = r0
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 81
            r0.setIntOption(r1, r10)
            com.ss.ttvideoengine.log.IVideoEventLogger r0 = r8.mLogger
            r0.setSettingLog(r5, r10)
            goto L_0x0610
        L_0x0576:
            r8.mDecoderType = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 67
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x0585:
            r8.mCacheFileEnable = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 14
            r0.setIntOption(r1, r5)
            goto L_0x0610
        L_0x0594:
            com.ss.ttm.player.MediaPlayer r1 = r8.mAsyncPlayer
            if (r1 == 0) goto L_0x059b
            com.ss.ttm.player.MediaPlayer r1 = r8.mAsyncPlayer
            goto L_0x059d
        L_0x059b:
            com.ss.ttm.player.MediaPlayer r1 = r8.mMediaPlayer
        L_0x059d:
            java.lang.String r2 = "TTVideoEngine"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "hardware enable = "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110647i(r2, r6)
            r8.mHardwareDecodeEnablePlayer2 = r10
            if (r1 == 0) goto L_0x0610
            r1.setIntOption(r0, r10)
            goto L_0x0610
        L_0x05b8:
            if (r10 == 0) goto L_0x05bc
            r0 = 1
            goto L_0x05bd
        L_0x05bc:
            r0 = 0
        L_0x05bd:
            r8.mH265Enabled = r0
            goto L_0x0610
        L_0x05c0:
            r8.mRenderType = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 56
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x05ce:
            r8.mLayoutType = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 36
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x05dc:
            r8.mForbidOSPlayer = r10
            com.p683ss.ttm.player.TTPlayerConfiger.setValue(r2, r10)
            boolean r0 = r8.mUsePlayer3
            if (r0 == 0) goto L_0x0610
            p096cn.p097a.p098a.p099a.C2236f.m6769b(r2, r10)
            goto L_0x0610
        L_0x05e9:
            r8.mScaleType = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 38
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x05f7:
            r8.mEnhancementType = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r1 = 37
            r0.setIntOption(r1, r10)
            goto L_0x0610
        L_0x0605:
            r8.mPlayerCache = r10
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            if (r0 == 0) goto L_0x0610
            com.ss.ttm.player.MediaPlayer r0 = r8.mMediaPlayer
            r0.setIntOption(r1, r10)
        L_0x0610:
            java.lang.String r0 = "TTVideoEngine"
            java.lang.String r1 = "set int option key:%d value:%d"
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2[r4] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r2[r5] = r9
            java.lang.String r9 = com.C2240a.m6772a(r1, r2)
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110647i(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.TTVideoEngine.setIntOption(int, int):void");
    }

    public static Resolution findBestResolution(VideoModel videoModel, Resolution resolution, int i) {
        Resolution findDefaultResolution = findDefaultResolution(videoModel, resolution);
        switch (i) {
            case 1:
                return findMaxCacheResolution(videoModel, findDefaultResolution);
            case 2:
                return findMaxQualityResolution(videoModel, findDefaultResolution);
            default:
                return findDefaultResolution;
        }
    }

    public static void addTask(VideoModel videoModel, Resolution resolution, long j) {
        DataLoaderHelper.getDataLoader().addTask(videoModel, resolution, j);
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) {
        _ShutdownOldSource();
        this.mPlayFd = fileDescriptor;
        this.mPipeOffset = j;
        this.mPipeLength = j2;
        if (this.mLogger != null) {
            this.mLogger.setSourceType(6, null);
        }
    }

    private VideoInfo _videoInfoForResolution(Resolution resolution, int i, Map<Integer, String> map) {
        VideoInfo videoInfo;
        if (this.mVideoModel == null || this.mVideoModel.getVideoRef() == null) {
            return null;
        }
        VideoInfo videoInfo2 = this.mVideoModel.getVideoInfo(resolution, i, map);
        Resolution[] allResolutions = Resolution.getAllResolutions();
        if (allResolutions.length <= 0) {
            return videoInfo2;
        }
        int length = allResolutions.length - 1;
        int i2 = 0;
        while (true) {
            if (i2 >= allResolutions.length) {
                break;
            } else if (allResolutions[i2].getIndex() == resolution.getIndex()) {
                length = i2;
                break;
            } else {
                i2++;
            }
        }
        int i3 = length;
        while (true) {
            if (videoInfo2 != null) {
                break;
            }
            Resolution resolution2 = allResolutions[i3];
            videoInfo = this.mVideoModel.getVideoInfo(resolution2, i, null);
            if (videoInfo != null && i == this.mVideoModel.getVideoRefInt(7)) {
                this.currentResolution = resolution2;
                this.mLogger.configResolution(_resolutionToString(this.currentResolution), "");
                break;
            }
            i3 = ((i3 + allResolutions.length) - 1) % allResolutions.length;
            if (i3 == length) {
                break;
            }
            videoInfo2 = videoInfo;
        }
        videoInfo2 = videoInfo;
        return videoInfo2;
    }

    public static void addTask(VideoModel videoModel, Resolution resolution, Map<Integer, String> map, long j) {
        DataLoaderHelper.getDataLoader().addTask(videoModel, resolution, map, j);
    }

    public static void addTask(String str, String str2, long j, DataLoaderResourceProvider dataLoaderResourceProvider) {
        DataLoaderHelper.getDataLoader().addTask(str, str2, j, dataLoaderResourceProvider);
    }

    public static void addTask(String str, String str2, long j, String str3) {
        DataLoaderHelper.getDataLoader().addTask(str, str2, j, str3);
    }

    public static String proxyUrl(String str, String str2, String[] strArr, Resolution resolution, String str3) {
        return DataLoaderHelper.getDataLoader().proxyUrl(str, str2, strArr, resolution, str3);
    }

    public static void addTask(String str, String str2, VideoModel videoModel, Resolution resolution, long j) {
        DataLoaderHelper.getDataLoader().addTask(str, str2, videoModel, resolution, j);
    }

    private String _mdlUrl(String str, String str2, long j, String[] strArr, Resolution resolution, String str3, VideoInfo videoInfo, String str4, String str5) {
        String str6;
        String _proxyUrl = DataLoaderHelper.getDataLoader()._proxyUrl(str, str2, j, strArr, resolution, str3, videoInfo, str4, str5);
        if (!TextUtils.isEmpty(_proxyUrl)) {
            this.mLogger.setEnableMDL(1);
            this.mLogger.setProxyUrl(_proxyUrl);
            if (TextUtils.isEmpty(str2)) {
                str6 = str;
            } else {
                str6 = str2;
            }
            this.mUsingDataLoaderPlayRawKey = str6;
            if (!TextUtils.isEmpty(str4)) {
                this.mUsingDataLoaderPlayFilePaths.add(str4);
            }
            if (!TextUtils.isEmpty(str)) {
                String str7 = str;
                this.mUsingDataLoaderPlayTaskKeys.add(str);
            }
            _dataLoaderAddEngineRef();
        }
        return _proxyUrl;
    }
}
