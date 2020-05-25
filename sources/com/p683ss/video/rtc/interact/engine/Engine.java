package com.p683ss.video.rtc.interact.engine;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.C2240a;
import com.p683ss.video.rtc.interact.audio.AudioClientFactory;
import com.p683ss.video.rtc.interact.audio.AudioSinkFactory;
import com.p683ss.video.rtc.interact.callback.EngineCallback;
import com.p683ss.video.rtc.interact.controller.AnchorController.StreamMixer;
import com.p683ss.video.rtc.interact.model.Config;
import com.p683ss.video.rtc.interact.model.Config.Character;
import com.p683ss.video.rtc.interact.model.LocalUserStatisticInfo;
import com.p683ss.video.rtc.interact.model.MixStreamInfo;
import com.p683ss.video.rtc.interact.model.ProcInfo;
import com.p683ss.video.rtc.interact.model.Region;
import com.p683ss.video.rtc.interact.model.TalkingState;
import com.p683ss.video.rtc.interact.statistic.LogReporter;
import com.p683ss.video.rtc.interact.statistic.ProcInfoStatistics;
import com.p683ss.video.rtc.interact.statistic.RemoteUserStats;
import com.p683ss.video.rtc.interact.statistic.RenderVideoFpsStatistics.RenderVideoFpsStatisticsReport;
import com.p683ss.video.rtc.interact.statistic.RenderVideoStallStatistics.IRenderVideoStallCallback;
import com.p683ss.video.rtc.interact.utils.log.LogUtil;
import com.p683ss.video.rtc.interact.video.VideoClientFactory;
import com.p683ss.video.rtc.interact.video.VideoClientStatisic;
import com.p683ss.video.rtc.interact.video.VideoSinkFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.video.rtc.interact.engine.Engine */
public abstract class Engine {
    public static final String TAG = "com.ss.video.rtc.interact.engine.Engine";
    protected static String mAppId;
    protected AudioClientFactory mAudioClientFactory;
    protected AudioSinkFactory mAudioSinkFactory;
    private List<Region> mCachedRegion;
    public EngineCallback mCallback;
    public Config mConfig;
    public Context mContext;
    public Map<String, Long> mFirstVideoFrameTimeStamp = new ConcurrentHashMap();
    private List<String> mGuestList;
    private long mLastRenderFps;
    private long mLastTimeUpdateSeiForTalk;
    public Runnable mLogReportRunnable;
    public LogReporter mLogReporter;
    public Handler mMainThreadHandler;
    public int mNetWorkQuality = 0;
    public ProcInfoStatistics mProcInfoStatistics;
    public long mPullStreamsDuration = 0;
    public int mReceiveAudioBitrate;
    public int mReceiveVideoBitrate;
    public Map<String, RemoteUserStats> mRemoteStateMap = new ConcurrentHashMap();
    public IRenderVideoStallCallback mRenderVideoStallCallback = new IRenderVideoStallCallback() {
        public void onRenderVideoStall(String str, int i) {
            String str2 = Engine.TAG;
            StringBuilder sb = new StringBuilder("onRemoteVideoFrozen interactId: ");
            sb.append(str);
            sb.append(" elapsed: ");
            sb.append(i);
            LogUtil.m110872i(str2, sb.toString());
            if (Engine.this.mLogReporter != null) {
                Engine.this.mLogReporter.onRemoteVideoFrozen(str, i);
            }
        }
    };
    protected Handler mReportHandler;
    protected HandlerThread mReportHandlerThread;
    public int mSendAudioBitrate;
    public int mSendAudioLoss;
    public int mSendAudioRTT;
    public int mSendEncoderOutputFrameRate;
    public int mSendVideoBitrate;
    public int mSendVideoFrameRate;
    public int mSendVideoLoss;
    public int mSendVideoRTT;
    public boolean mShouldReport;
    public String mStatUid = "";
    protected StreamMixer mStreamMixer = null;
    protected boolean mSwitchAppId = false;
    private Map<String, Boolean> mTalkStateMap = new HashMap();
    public int mTotalRenderFps;
    private int mUpdateTalkSeiInterval;
    public int mUserCount;
    public VideoClientFactory mVideoClientFactory;
    public VideoClientStatisic mVideoClientStatisic;
    public VideoSinkFactory mVideoSinkFactory;

    /* renamed from: com.ss.video.rtc.interact.engine.Engine$LogReportRunnable */
    class LogReportRunnable implements Runnable {
        public void run() {
            float f;
            int i;
            int i2;
            int calcRenderFrameRate = Engine.this.calcRenderFrameRate(Engine.this.mConfig.getLogReportInterval());
            if (Engine.this.mShouldReport) {
                if (Engine.this.mVideoClientStatisic != null) {
                    int inputHeight = Engine.this.mVideoClientStatisic.getInputHeight();
                    i = inputHeight;
                    i2 = Engine.this.mVideoClientStatisic.getInputWidth();
                    f = Engine.this.mVideoClientStatisic.getAvgVpsElapse();
                } else {
                    i2 = -1;
                    i = -1;
                    f = -1.0f;
                }
                Engine.this.mProcInfoStatistics.getAvgCpuUsage();
                short appCpuUsage = Engine.this.mProcInfoStatistics.getAppCpuUsage();
                short totalCpuUsage = Engine.this.mProcInfoStatistics.getTotalCpuUsage();
                long appUsedMemorySize = (long) Engine.this.mProcInfoStatistics.getAppUsedMemorySize();
                long sysUsedMemorySize = Engine.this.mProcInfoStatistics.getSysUsedMemorySize();
                ProcInfo procInfo = r7;
                ProcInfo procInfo2 = new ProcInfo();
                procInfo2.setAppCpuUsed(appCpuUsage);
                procInfo2.setTotalCpuUsed(totalCpuUsage);
                procInfo2.setAppUsedMemory((float) appUsedMemorySize);
                procInfo2.setSystemUsedMemory((float) sysUsedMemorySize);
                String remoteVideoRenderFps = Engine.this.getRemoteVideoRenderFps();
                String parseRemoteUserData = Engine.this.parseRemoteUserData();
                LocalUserStatisticInfo localUserStatisticInfo = r1;
                LocalUserStatisticInfo localUserStatisticInfo2 = new LocalUserStatisticInfo();
                localUserStatisticInfo2.setSendVencodeFps(Engine.this.mSendEncoderOutputFrameRate);
                localUserStatisticInfo2.setSendAudioLoss(Engine.this.mSendAudioLoss);
                localUserStatisticInfo2.setSendVideoLoss(Engine.this.mSendVideoLoss);
                localUserStatisticInfo2.setSendAudioRtt(Engine.this.mSendAudioRTT);
                localUserStatisticInfo2.setSendVideoRtt(Engine.this.mSendVideoRTT);
                Engine.this.mLogReporter.onInteractStatus(Engine.this.mSendAudioBitrate, Engine.this.mReceiveAudioBitrate, Engine.this.mSendVideoBitrate, Engine.this.mReceiveVideoBitrate, Engine.this.mSendVideoFrameRate, calcRenderFrameRate, i2, i, f, Engine.this.mUserCount, Engine.this.mSendEncoderOutputFrameRate, Engine.this.mStatUid, remoteVideoRenderFps, parseRemoteUserData, procInfo, localUserStatisticInfo, Engine.this.mNetWorkQuality);
                Engine.this.mSendAudioBitrate = 0;
                Engine.this.mReceiveAudioBitrate = 0;
                Engine.this.mSendVideoBitrate = 0;
                Engine.this.mReceiveVideoBitrate = 0;
                Engine.this.mSendVideoFrameRate = 0;
                Engine.this.mUserCount = 0;
                Engine.this.mStatUid = "";
            }
            Engine.this.mProcInfoStatistics.setCpuCheckPoint();
            Engine.this.mReportHandler.postDelayed(Engine.this.mLogReportRunnable, (long) (Engine.this.mConfig.getLogReportInterval() * 1000));
        }

        private LogReportRunnable() {
        }
    }

    public abstract void adjustPlaybackSignalVolume(int i);

    public abstract void adjustRecordingSignalVolume(int i);

    public abstract void enableAudio();

    public abstract void enableAudioVolumeIndication(int i);

    public abstract void enableLocalAudio(boolean z);

    public List<String> getGuestList() {
        return this.mGuestList;
    }

    /* access modifiers changed from: protected */
    public abstract String getVendor();

    public abstract ArrayList<RenderVideoFpsStatisticsReport> getVideoRenderFpsReport();

    public abstract void init();

    public abstract void mixStream(MixStreamInfo mixStreamInfo, boolean z);

    public abstract void muteAllRemoteAudioStreams(boolean z);

    public abstract void muteRemoteAudioStream(String str, boolean z);

    public abstract void pause();

    public abstract void resume();

    public abstract void start();

    public abstract void switchAudio(boolean z);

    public String getAnchor() {
        return this.mConfig.getInteractId();
    }

    public void stop() {
        this.mGuestList.clear();
    }

    public void destroy() {
        this.mReportHandler.removeCallbacks(this.mLogReportRunnable);
        this.mReportHandlerThread.quit();
    }

    public String getBackgroundColor() {
        if (this.mConfig.getMixStreamConfig() != null) {
            return this.mConfig.getMixStreamConfig().getBackgroundColorString();
        }
        return "#000000";
    }

    public int getOutputHeight() {
        if (this.mConfig.getMixStreamConfig() != null) {
            return this.mConfig.getMixStreamConfig().getVideoHeight();
        }
        return 0;
    }

    public int getOutputWidth() {
        if (this.mConfig.getMixStreamConfig() != null) {
            return this.mConfig.getMixStreamConfig().getVideoWidth();
        }
        return 0;
    }

    public void updateSEIForTalkingState() {
        if (this.mConfig != null && this.mConfig.isEnableMixStream()) {
            this.mMainThreadHandler.post(new Runnable() {
                public void run() {
                    Engine.this.mixStream(Engine.this.getMixStreamInfo(Engine.this.mStreamMixer));
                }
            });
        }
    }

    public List<TalkingState> getTalkingStateList() {
        LinkedList linkedList = new LinkedList();
        if (this.mTalkStateMap != null) {
            for (Entry entry : this.mTalkStateMap.entrySet()) {
                linkedList.add(new TalkingState((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
            }
        }
        return linkedList;
    }

    public String getRemoteVideoRenderFps() {
        JSONArray jSONArray = new JSONArray();
        ArrayList videoRenderFpsReport = getVideoRenderFpsReport();
        if (videoRenderFpsReport == null) {
            return "";
        }
        Iterator it = videoRenderFpsReport.iterator();
        while (it.hasNext()) {
            RenderVideoFpsStatisticsReport renderVideoFpsStatisticsReport = (RenderVideoFpsStatisticsReport) it.next();
            if (renderVideoFpsStatisticsReport != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("fps", renderVideoFpsStatisticsReport.getFps());
                    jSONObject.put("uid", renderVideoFpsStatisticsReport.getInteractId());
                    jSONObject.put("direction", "down");
                    jSONArray.put(jSONObject);
                    RemoteUserStats remoteUserStatsByUID = getRemoteUserStatsByUID(String.valueOf(renderVideoFpsStatisticsReport.getInteractId()));
                    if (remoteUserStatsByUID != null) {
                        remoteUserStatsByUID.setVideoRenderFps(renderVideoFpsStatisticsReport.getFps());
                    }
                } catch (JSONException unused) {
                }
            }
        }
        return jSONArray.toString();
    }

    public String parseRemoteUserData() {
        JSONArray jSONArray = new JSONArray();
        try {
            for (RemoteUserStats remoteUserStats : this.mRemoteStateMap.values()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("user_id", remoteUserStats.getUid());
                jSONObject.put("recv_video_bitrate", remoteUserStats.getVideoBitrate());
                jSONObject.put("recv_vdecode_fps", remoteUserStats.getVideoDecodeFps());
                jSONObject.put("recv_vrender_fps", remoteUserStats.getVideoRenderFps());
                jSONObject.put("recv_video_loss", remoteUserStats.getVideoLossRate());
                jSONObject.put("recv_audio_bitrate", remoteUserStats.getAudioBitrate());
                jSONObject.put("recv_audio_delay", remoteUserStats.getAudioDelay());
                jSONObject.put("recv_audio_loss", remoteUserStats.getAudioLossRate());
                jSONObject.put("recv_audio_rtt", remoteUserStats.getAudioRTT());
                jSONObject.put("recv_video_rtt", remoteUserStats.getVideoRTT());
                jSONObject.put("recv_audio_volume", remoteUserStats.getAudioVoiceVolume());
                jSONArray.put(jSONObject);
            }
        } catch (JSONException unused) {
        }
        return jSONArray.toString();
    }

    public void setMixStreamer(StreamMixer streamMixer) {
        this.mStreamMixer = streamMixer;
    }

    public void mixStream(MixStreamInfo mixStreamInfo) {
        if (mixStreamInfo != null) {
            mixStream(mixStreamInfo, true);
        }
    }

    /* access modifiers changed from: protected */
    public String createSei(MixStreamInfo mixStreamInfo) {
        this.mCachedRegion = mixStreamInfo.getRegions();
        return mixStreamInfo.getAppData().toString();
    }

    public RemoteUserStats getRemoteUserStatsByUID(String str) {
        return (RemoteUserStats) this.mRemoteStateMap.get(str);
    }

    public int calcRenderFrameRate(int i) {
        long j = ((long) this.mTotalRenderFps) - this.mLastRenderFps;
        this.mLastRenderFps = (long) this.mTotalRenderFps;
        return Math.round(((float) j) / ((float) i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void releaseRtcEngineResource(com.p683ss.video.rtc.interact.model.Config.Vendor r4) {
        /*
            java.lang.String r0 = TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "releaseRtcEngineResource vendor:"
            r1.<init>(r2)
            java.lang.String r2 = r4.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.p683ss.video.rtc.interact.utils.log.LogUtil.m110872i(r0, r1)
            int[] r0 = com.p683ss.video.rtc.interact.engine.Engine.C516933.$SwitchMap$com$ss$video$rtc$interact$model$Config$Vendor     // Catch:{ Exception -> 0x004e }
            int r4 = r4.ordinal()     // Catch:{ Exception -> 0x004e }
            r4 = r0[r4]     // Catch:{ Exception -> 0x004e }
            r0 = 0
            r1 = 0
            switch(r4) {
                case 1: goto L_0x0039;
                case 2: goto L_0x0025;
                default: goto L_0x0024;
            }     // Catch:{ Exception -> 0x004e }
        L_0x0024:
            goto L_0x004d
        L_0x0025:
            java.lang.String r4 = "com.ss.video.rtc.engine.RtcEngine"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ Exception -> 0x004e }
            java.lang.String r2 = "destroy"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x004e }
            java.lang.reflect.Method r4 = r4.getMethod(r2, r3)     // Catch:{ Exception -> 0x004e }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x004e }
            r4.invoke(r0, r1)     // Catch:{ Exception -> 0x004e }
            goto L_0x004d
        L_0x0039:
            java.lang.String r4 = "io.agora.rtc.RtcEngine"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ Exception -> 0x004e }
            java.lang.String r2 = "destroy"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x004e }
            java.lang.reflect.Method r4 = r4.getMethod(r2, r3)     // Catch:{ Exception -> 0x004e }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x004e }
            r4.invoke(r0, r1)     // Catch:{ Exception -> 0x004e }
            goto L_0x004e
        L_0x004d:
            return
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.video.rtc.interact.engine.Engine.releaseRtcEngineResource(com.ss.video.rtc.interact.model.Config$Vendor):void");
    }

    public MixStreamInfo getMixStreamInfo(StreamMixer streamMixer) {
        if (streamMixer == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (String str : getGuestList()) {
            linkedList.add(str.toString());
        }
        if (streamMixer == null) {
            return null;
        }
        return streamMixer.mixStream(getOutputWidth(), getOutputHeight(), getAnchor().toString(), linkedList, getTalkingStateList());
    }

    public void recordGuestJoined(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        this.mLogReporter.onEngineAPICall("recordGuestJoined", C2240a.m6772a(" interactId:%s", new Object[]{sb.toString()}));
        if (this.mConfig.getCharacter() == Character.ANCHOR) {
            Iterator it = this.mGuestList.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(str)) {
                    it.remove();
                }
            }
            this.mGuestList.add(str);
        }
    }

    public void recordGuestLeaved(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        this.mLogReporter.onEngineAPICall("recordGuestLeaved", C2240a.m6772a(" interactId:%s", new Object[]{sb.toString()}));
        this.mTalkStateMap.remove(String.valueOf(str));
        if (this.mConfig.getCharacter() == Character.ANCHOR) {
            Iterator it = this.mGuestList.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(str)) {
                    it.remove();
                }
            }
        }
    }

    public void onTalkStateUpdated(String[] strArr, boolean[] zArr) {
        this.mCallback.onTalkStateUpdated(strArr, zArr);
        if (this.mConfig.getCharacter() == Character.ANCHOR && this.mConfig.isAutoUpdateSeiForTalk()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.mLastTimeUpdateSeiForTalk >= ((long) this.mUpdateTalkSeiInterval)) {
                int length = strArr.length;
                boolean z = false;
                for (int i = 0; i < length; i++) {
                    String str = strArr[i];
                    boolean z2 = zArr[i];
                    if (!this.mTalkStateMap.containsKey(str) || ((Boolean) this.mTalkStateMap.get(str)).booleanValue() != z2) {
                        z = true;
                    }
                    this.mTalkStateMap.put(str, Boolean.valueOf(z2));
                }
                if (z) {
                    updateSEIForTalkingState();
                    LogUtil.m110870d(TAG, "update sei for talk");
                    this.mLastTimeUpdateSeiForTalk = currentTimeMillis;
                }
            }
        }
    }

    public Engine(Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, VideoSinkFactory videoSinkFactory, AudioSinkFactory audioSinkFactory, EngineCallback engineCallback) {
        Handler handler;
        this.mConfig = config;
        this.mVideoClientFactory = videoClientFactory;
        this.mAudioClientFactory = audioClientFactory;
        this.mVideoSinkFactory = videoSinkFactory;
        this.mAudioSinkFactory = audioSinkFactory;
        this.mContext = config.getContext();
        this.mCallback = engineCallback;
        this.mLogReporter = new LogReporter(engineCallback, config);
        this.mLogReportRunnable = new LogReportRunnable();
        this.mProcInfoStatistics = new ProcInfoStatistics(this.mContext.getApplicationContext());
        this.mUpdateTalkSeiInterval = config.getUpdateTalkSeiInterval();
        this.mProcInfoStatistics.init();
        this.mGuestList = new ArrayList();
        if (config.getHandler() != null) {
            handler = config.getHandler();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        this.mMainThreadHandler = handler;
        this.mReportHandlerThread = new HandlerThread("report-thread");
        this.mReportHandlerThread.start();
        this.mReportHandler = new Handler(this.mReportHandlerThread.getLooper());
        this.mReportHandler.postDelayed(this.mLogReportRunnable, (long) (this.mConfig.getLogReportInterval() * 1000));
    }
}
