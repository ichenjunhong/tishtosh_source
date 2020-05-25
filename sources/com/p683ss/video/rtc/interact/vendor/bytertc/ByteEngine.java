package com.p683ss.video.rtc.interact.vendor.bytertc;

import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import com.C2240a;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import com.p683ss.video.rtc.engine.RtcEngine;
import com.p683ss.video.rtc.engine.VideoCanvas;
import com.p683ss.video.rtc.engine.handler.IRtcEngineAudioDeviceEventHandler;
import com.p683ss.video.rtc.engine.handler.IRtcEngineEventHandler;
import com.p683ss.video.rtc.engine.handler.IRtcEngineEventHandler.LocalAudioStats;
import com.p683ss.video.rtc.engine.handler.IRtcEngineEventHandler.LocalVideoStats;
import com.p683ss.video.rtc.engine.handler.IRtcEngineEventHandler.RemoteAudioStats;
import com.p683ss.video.rtc.engine.handler.IRtcEngineEventHandler.RemoteVideoStats;
import com.p683ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel;
import com.p683ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcStats;
import com.p683ss.video.rtc.engine.live.LiveTranscoding.Layout;
import com.p683ss.video.rtc.engine.live.LiveTranscoding.Layout.Builder;
import com.p683ss.video.rtc.engine.loader.RtcNativeLibraryLoader;
import com.p683ss.video.rtc.engine.utils.ExtVideoFrame;
import com.p683ss.video.rtc.interact.audio.AudioClientFactory;
import com.p683ss.video.rtc.interact.audio.AudioSinkFactory;
import com.p683ss.video.rtc.interact.callback.EngineCallback;
import com.p683ss.video.rtc.interact.engine.Engine;
import com.p683ss.video.rtc.interact.model.CommonType.VideoQuality;
import com.p683ss.video.rtc.interact.model.Config;
import com.p683ss.video.rtc.interact.model.Config.Character;
import com.p683ss.video.rtc.interact.model.Config.Type;
import com.p683ss.video.rtc.interact.model.Config.ViewType;
import com.p683ss.video.rtc.interact.model.MixStreamInfo;
import com.p683ss.video.rtc.interact.model.Region;
import com.p683ss.video.rtc.interact.statistic.LogReporter;
import com.p683ss.video.rtc.interact.statistic.RemoteUserStats;
import com.p683ss.video.rtc.interact.statistic.RenderVideoFpsStatistics.RenderVideoFpsStatisticsReport;
import com.p683ss.video.rtc.interact.utils.loader.LibraryLoaderHelper;
import com.p683ss.video.rtc.interact.utils.log.IInteractLogger.LogLevel;
import com.p683ss.video.rtc.interact.utils.log.LogUtil;
import com.p683ss.video.rtc.interact.video.VideoClientFactory;
import com.p683ss.video.rtc.interact.video.VideoSinkFactory;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.video.rtc.interact.vendor.bytertc.ByteEngine */
public class ByteEngine extends Engine {
    protected static String mAppId;
    public ByteAudioClient mAudioClient;
    private IRtcEngineAudioDeviceEventHandler mAudioDeviceEventHandler = new IRtcEngineAudioDeviceEventHandler() {
        public void onAudioDevicePlayoutStart() {
            ByteAudioSink byteAudioSink = ByteEngine.this.mAudioSink;
            if (byteAudioSink != null) {
                byteAudioSink.onAudioDevicePlayoutStart();
            }
        }

        public void onAudioDevicePlayoutStop() {
            ByteAudioSink byteAudioSink = ByteEngine.this.mAudioSink;
            if (byteAudioSink != null) {
                byteAudioSink.onAudioDevicePlayoutStop();
            }
        }

        public void onAudioDeviceRecordStart() {
            ByteAudioClient byteAudioClient = ByteEngine.this.mAudioClient;
            if (byteAudioClient != null) {
                byteAudioClient.onAudioDeviceRecordStart();
            }
        }

        public void onAudioDeviceRecordStop() {
            ByteAudioClient byteAudioClient = ByteEngine.this.mAudioClient;
            if (byteAudioClient != null) {
                byteAudioClient.onAudioDeviceRecordStop();
            }
        }
    };
    public ByteAudioSink mAudioSink;
    public Map<String, ByteVideoSink> mByteVideoSinkMap = new ConcurrentHashMap();
    public final Object mLeaveChannelNotifier = new Object();
    public RtcEngine mRtcEngine;
    private final IRtcEngineEventHandler mRtcEngineEventHandler = new IRtcEngineEventHandler() {
        public void onConnectionBanned() {
            ByteEngine.this.mLogReporter.onConnectFailed(-2, "onConnectionBanned");
            ByteEngine.this.mCallback.onError("byte onConnectionBanned");
            LogUtil.m110871e("ByteRtcEngine", "byte onConnectionBanned");
        }

        public void onConnectionInterrupted() {
            ByteEngine.this.mLogReporter.onConnectFailed(-1, "onConnectionInterrupted");
            ByteEngine.this.mCallback.onConnectionInterrupted();
            LogUtil.m110874w("ByteRtcEngine", "byte onConnectionInterrupted");
        }

        public void onConnectionLost() {
            ByteEngine.this.mLogReporter.onConnectionLost();
            ByteEngine.this.mCallback.onConnectionLost();
            LogUtil.m110874w("ByteRtcEngine", "byte onConnectionLost");
        }

        public void onFirstLocalAudioFrame(int i) {
            StringBuilder sb = new StringBuilder("onFirstLocalAudioFrame: elapsed ");
            sb.append(i);
            LogUtil.m110870d("ByteRtcEngine", sb.toString());
            ByteEngine.this.mCallback.onFirstLocalAudioFrame(i);
        }

        public void onLeaveChannel(RtcStats rtcStats) {
            LogUtil.m110870d("ByteRtcEngine", "onLeaveChannel");
            synchronized (ByteEngine.this.mLeaveChannelNotifier) {
                ByteEngine.this.mLeaveChannelNotifier.notifyAll();
            }
        }

        public void onLocalAudioStats(LocalAudioStats localAudioStats) {
            ByteEngine.this.mSendAudioLoss = (int) (localAudioStats.audioLossRate * 100.0f);
            ByteEngine.this.mSendAudioRTT = localAudioStats.rtt;
        }

        public void onLocalVideoStats(LocalVideoStats localVideoStats) {
            ByteEngine.this.mSendVideoFrameRate = localVideoStats.sentFrameRate;
            ByteEngine.this.mSendEncoderOutputFrameRate = localVideoStats.encoderOutputFrameRate;
            ByteEngine.this.mSendVideoLoss = (int) (localVideoStats.videoLossRate * 100.0f);
            ByteEngine.this.mSendVideoRTT = localVideoStats.rtt;
        }

        public void onStreamPublishSucceed(String str) {
            StringBuilder sb = new StringBuilder("onStreamPublishSucceed: streamId ");
            sb.append(str);
            LogUtil.m110870d("ByteRtcEngine", sb.toString());
            ByteEngine.this.mCallback.onStreamPublishSucceed();
        }

        public void onRemoteAudioStats(RemoteAudioStats remoteAudioStats) {
            RemoteUserStats remoteUserStatsByUID = ByteEngine.this.getRemoteUserStatsByUID(remoteAudioStats.uid);
            if (remoteUserStatsByUID != null) {
                remoteUserStatsByUID.setAudioBitrate((int) remoteAudioStats.receivedKBitrate);
                remoteUserStatsByUID.setAudioLossRate((int) remoteAudioStats.audioLossRate);
                remoteUserStatsByUID.setAudioDelay((int) remoteAudioStats.e2eDelay);
                remoteUserStatsByUID.setAudioRTT(remoteAudioStats.rtt);
            }
        }

        public void onRemoteVideoStats(RemoteVideoStats remoteVideoStats) {
            RemoteUserStats remoteUserStatsByUID = ByteEngine.this.getRemoteUserStatsByUID(remoteVideoStats.uid);
            if (remoteUserStatsByUID != null) {
                remoteUserStatsByUID.setVideoBitrate((int) remoteVideoStats.receivedKBitrate);
                remoteUserStatsByUID.setVideoDecodeFps(remoteVideoStats.decoderOutputFrameRate);
                remoteUserStatsByUID.setVideoLossRate((int) (remoteVideoStats.videoLossRate * 100.0f));
                remoteUserStatsByUID.setVideoRTT(remoteVideoStats.rtt);
            }
        }

        public void onRtcStats(RtcStats rtcStats) {
            ByteEngine.this.mCallback.onPushStreamQuality((long) rtcStats.txVideoKBitRate, (long) rtcStats.txAudioKBitRate);
            ByteEngine.this.mSendAudioBitrate = rtcStats.txAudioKBitRate;
            ByteEngine.this.mReceiveAudioBitrate = rtcStats.rxAudioKBitRate;
            ByteEngine.this.mSendVideoBitrate = rtcStats.txVideoKBitRate;
            ByteEngine.this.mReceiveVideoBitrate = rtcStats.rxVideoKBitRate;
            ByteEngine.this.mUserCount = rtcStats.users;
        }

        public void onWarning(int i) {
            ByteEngine.this.mLogReporter.onWarningOccurs(i, String.valueOf(ByteEngine.this.mConfig.getInteractId()));
            EngineCallback engineCallback = ByteEngine.this.mCallback;
            StringBuilder sb = new StringBuilder("byte onWarning, code: ");
            sb.append(i);
            engineCallback.onWarn(sb.toString());
            StringBuilder sb2 = new StringBuilder("byte warning: ");
            sb2.append(i);
            LogUtil.m110874w("ByteRtcEngine", sb2.toString());
        }

        public void onError(int i) {
            ByteEngine.this.mLogReporter.onErrorOccurs(i, String.valueOf(ByteEngine.this.mConfig.getInteractId()), ByteEngine.this.mConfig.getByteToken());
            if (i == -1000) {
                EngineCallback engineCallback = ByteEngine.this.mCallback;
                StringBuilder sb = new StringBuilder("token error channelName:");
                sb.append(ByteEngine.this.mConfig.getChannelName());
                sb.append(" ,interactID:");
                sb.append(ByteEngine.this.mConfig.getInteractId());
                engineCallback.onStartFailed(i, sb.toString());
            }
            EngineCallback engineCallback2 = ByteEngine.this.mCallback;
            StringBuilder sb2 = new StringBuilder("byte onError, code: ");
            sb2.append(i);
            engineCallback2.onError(sb2.toString());
            if (i == -1000) {
                ByteEngine.this.mCallback.onStartFailed(i, "token error");
            }
            StringBuilder sb3 = new StringBuilder("byte error: ");
            sb3.append(i);
            LogUtil.m110871e("ByteRtcEngine", sb3.toString());
        }

        public void onLogReport(String str, JSONObject jSONObject) {
            ByteEngine.this.mCallback.onLogReport(str, jSONObject);
        }

        public void onUserMuteVideo(String str, boolean z) {
            LogReporter logReporter = ByteEngine.this.mLogReporter;
            String str2 = "onUserMuteVideo";
            int i = 1;
            if (!z) {
                i = 0;
            }
            logReporter.onMediaStateChanged(str2, i, str);
        }

        public void onStreamPublished(String str, int i) {
            StringBuilder sb = new StringBuilder("IRtcEngineEventHandler.onRtmpStreamingStateChanged: url ");
            sb.append(str);
            ByteEngine.this.mLogReporter.onStreamStateChange(i, sb.toString(), 0);
        }

        public void onUserMuteAudio(String str, boolean z) {
            LogReporter logReporter = ByteEngine.this.mLogReporter;
            String str2 = "onUserMuteAudio";
            int i = 1;
            if (!z) {
                i = 0;
            }
            logReporter.onMediaStateChanged(str2, i, str);
            ByteEngine.this.mCallback.onUserMuteAudio(str, z);
        }

        public void onUserEnableAudio(String str, boolean z) {
            LogReporter logReporter = ByteEngine.this.mLogReporter;
            String str2 = "onUserEnableAudio";
            int i = 1;
            if (!z) {
                i = 0;
            }
            logReporter.onMediaStateChanged(str2, i, str);
            if (ByteEngine.this.mCallback != null && !ByteEngine.this.mConfig.getInteractId().equals(str)) {
                ByteEngine.this.mCallback.onUserEnableAudio(str, z);
            }
        }

        public void onUserEnableLocalAudio(String str, boolean z) {
            LogReporter logReporter = ByteEngine.this.mLogReporter;
            String str2 = "onUserEnableLocalAudio";
            int i = 1;
            if (!z) {
                i = 0;
            }
            logReporter.onMediaStateChanged(str2, i, str);
            if (ByteEngine.this.mCallback != null && !ByteEngine.this.mConfig.getInteractId().equals(str)) {
                ByteEngine.this.mCallback.onUserEnableLocalAudio(str, z);
            }
        }

        public void onUserEnableLocalVideo(String str, boolean z) {
            LogReporter logReporter = ByteEngine.this.mLogReporter;
            String str2 = "onUserEnableLocalVideo";
            int i = 1;
            if (!z) {
                i = 0;
            }
            logReporter.onMediaStateChanged(str2, i, str);
            if (ByteEngine.this.mCallback != null && !ByteEngine.this.mConfig.getInteractId().equals(str)) {
                ByteEngine.this.mCallback.onUserEnableLocalVideo(str, z);
            }
        }

        public void onUserEnableVideo(String str, boolean z) {
            LogReporter logReporter = ByteEngine.this.mLogReporter;
            String str2 = "onUserEnableVideo";
            int i = 1;
            if (!z) {
                i = 0;
            }
            logReporter.onMediaStateChanged(str2, i, str);
            if (ByteEngine.this.mCallback != null && !ByteEngine.this.mConfig.getInteractId().equals(str)) {
                ByteEngine.this.mCallback.onUserEnableVideo(str, z);
            }
        }

        public void onFirstRemoteAudioFrame(String str, long j) {
            StringBuilder sb = new StringBuilder("onFirstRemoteAudioFrame: ");
            sb.append(str);
            LogUtil.m110870d("ByteRtcEngine", sb.toString());
            if (ByteEngine.this.mConfig.getInteractId() == null || !ByteEngine.this.mConfig.getInteractId().equals(str)) {
                ByteEngine.this.mCallback.onFirstRemoteAudioFrame(str, (int) j);
                LogReporter logReporter = ByteEngine.this.mLogReporter;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                logReporter.onFirstRemoteFrame(true, sb2.toString());
            }
        }

        public void onUserOffline(String str, int i) {
            StringBuilder sb = new StringBuilder("onUserOffline: ");
            sb.append(str);
            LogUtil.m110870d("ByteRtcEngine", sb.toString());
            if (str != null && ByteEngine.this.mFirstVideoFrameTimeStamp.containsKey(str)) {
                long currentTimeMillis = System.currentTimeMillis() - ((Long) ByteEngine.this.mFirstVideoFrameTimeStamp.get(str)).longValue();
                ByteEngine.this.mPullStreamsDuration += currentTimeMillis;
                ByteEngine.this.mFirstVideoFrameTimeStamp.remove(str);
            }
            ByteEngine.this.recordGuestLeaved(str);
            ByteEngine.this.mCallback.onUserLeaved(str, i);
            ByteEngine.this.mLogReporter.onRemoteUserOnlineOffline(false, str);
            synchronized (ByteEngine.this.mByteVideoSinkMap) {
                ByteVideoSink byteVideoSink = (ByteVideoSink) ByteEngine.this.mByteVideoSinkMap.remove(str);
                if (byteVideoSink != null) {
                    byteVideoSink.release();
                }
            }
            ByteEngine.this.mRemoteStateMap.remove(str);
        }

        /* JADX WARNING: type inference failed for: r8v22, types: [java.lang.String] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onAudioVolumeIndication(com.p683ss.video.rtc.engine.handler.IRtcEngineEventHandler.AudioVolumeInfo[] r11, int r12) {
            /*
                r10 = this;
                int r0 = r11.length
                java.lang.String[] r1 = new java.lang.String[r0]
                boolean[] r2 = new boolean[r0]
                int[] r3 = new int[r0]
                com.ss.video.rtc.interact.vendor.bytertc.ByteEngine r4 = com.p683ss.video.rtc.interact.vendor.bytertc.ByteEngine.this
                com.ss.video.rtc.interact.model.Config r4 = r4.mConfig
                int r4 = r4.getVolumeThreshold()
                r5 = 0
                r6 = 0
            L_0x0011:
                if (r6 >= r0) goto L_0x0080
                r7 = r11[r6]
                java.lang.String r8 = r7.uid     // Catch:{ NumberFormatException -> 0x0073 }
                int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0073 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NumberFormatException -> 0x0073 }
                int r9 = r8.intValue()
                if (r9 != 0) goto L_0x002d
                com.ss.video.rtc.interact.vendor.bytertc.ByteEngine r8 = com.p683ss.video.rtc.interact.vendor.bytertc.ByteEngine.this
                com.ss.video.rtc.interact.model.Config r8 = r8.mConfig
                java.lang.String r8 = r8.getInteractId()
            L_0x002d:
                java.lang.String r8 = java.lang.String.valueOf(r8)
                r1[r6] = r8
                int r8 = r7.volume
                if (r8 < r4) goto L_0x0039
                r8 = 1
                goto L_0x003a
            L_0x0039:
                r8 = 0
            L_0x003a:
                r2[r6] = r8
                int r8 = r7.volume
                r3[r6] = r8
                com.ss.video.rtc.interact.vendor.bytertc.ByteEngine r8 = com.p683ss.video.rtc.interact.vendor.bytertc.ByteEngine.this
                com.ss.video.rtc.interact.model.Config r8 = r8.mConfig
                java.lang.String r8 = r8.getInteractId()
                if (r8 == 0) goto L_0x007d
                com.ss.video.rtc.interact.vendor.bytertc.ByteEngine r8 = com.p683ss.video.rtc.interact.vendor.bytertc.ByteEngine.this
                com.ss.video.rtc.interact.model.Config r8 = r8.mConfig
                java.lang.String r8 = r8.getInteractId()
                java.lang.String r9 = r7.uid
                boolean r8 = r8.equals(r9)
                if (r8 != 0) goto L_0x007d
                com.ss.video.rtc.interact.vendor.bytertc.ByteEngine r8 = com.p683ss.video.rtc.interact.vendor.bytertc.ByteEngine.this
                java.lang.String r9 = r7.uid
                com.ss.video.rtc.interact.statistic.RemoteUserStats r8 = r8.getRemoteUserStatsByUID(r9)
                if (r8 == 0) goto L_0x007d
                int r7 = r7.volume
                float r7 = (float) r7
                r9 = 1132396544(0x437f0000, float:255.0)
                float r7 = r7 / r9
                r9 = 1120403456(0x42c80000, float:100.0)
                float r7 = r7 * r9
                int r7 = (int) r7
                r8.setAudioVoiceVolume(r7)
                goto L_0x007d
            L_0x0073:
                r7 = move-exception
                java.lang.String r8 = "ByteRtcEngine"
                java.lang.String r7 = r7.toString()
                com.p683ss.video.rtc.interact.utils.log.LogUtil.m110871e(r8, r7)
            L_0x007d:
                int r6 = r6 + 1
                goto L_0x0011
            L_0x0080:
                com.ss.video.rtc.interact.vendor.bytertc.ByteEngine r11 = com.p683ss.video.rtc.interact.vendor.bytertc.ByteEngine.this
                r11.onTalkStateUpdated(r1, r2)
                com.ss.video.rtc.interact.vendor.bytertc.ByteEngine r11 = com.p683ss.video.rtc.interact.vendor.bytertc.ByteEngine.this
                com.ss.video.rtc.interact.callback.EngineCallback r11 = r11.mCallback
                r11.onAudioVolumeIndication(r1, r3, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.video.rtc.interact.vendor.bytertc.ByteEngine.C517072.onAudioVolumeIndication(com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$AudioVolumeInfo[], int):void");
        }

        public void onUserJoined(String str, int i) {
            StringBuilder sb = new StringBuilder("onUserJoined: ");
            sb.append(str);
            LogUtil.m110870d("ByteRtcEngine", sb.toString());
            if (ByteEngine.this.mConfig.getInteractId() == null || !ByteEngine.this.mConfig.getInteractId().equals(str)) {
                ByteEngine.this.recordGuestJoined(str);
                ByteVideoSink byteVideoSink = new ByteVideoSink(str, ByteEngine.this.mVideoSinkFactory, ByteEngine.this.mRenderVideoStallCallback, ByteEngine.this.mLogReporter.getLogReportCallback(), ByteEngine.this.mMainThreadHandler);
                synchronized (ByteEngine.this.mByteVideoSinkMap) {
                    if (!ByteEngine.this.mByteVideoSinkMap.containsKey(str)) {
                        ByteEngine.this.mByteVideoSinkMap.put(str, byteVideoSink);
                        ByteEngine.this.mCallback.onUserJoined(str, i);
                        ByteEngine.this.mLogReporter.onRemoteUserOnlineOffline(true, str);
                        ByteEngine.this.mRemoteStateMap.put(str, new RemoteUserStats(str));
                        return;
                    }
                    byteVideoSink.release();
                    StringBuilder sb2 = new StringBuilder("Already received onUserJoined of ");
                    sb2.append(str);
                    LogUtil.m110871e("ByteRtcEngine", sb2.toString());
                }
            }
        }

        public void onRejoinChannelSuccess(String str, String str2, int i) {
            LogUtil.m110870d("ByteRtcEngine", "onRejoinChannelSuccess");
            ByteEngine.this.mCallback.onReconnected(i);
        }

        public void onLoggerMessage(RtcLogLevel rtcLogLevel, String str, Throwable th) {
            String str2 = "ByteEngineLog";
            switch (C517104.f128981x11981ef6[rtcLogLevel.ordinal()]) {
                case 1:
                    LogUtil.localLog(LogLevel.verbose, str2, str, th);
                    return;
                case 2:
                    LogUtil.localLog(LogLevel.info, str2, str, th);
                    return;
                case 3:
                    LogUtil.localLog(LogLevel.debug, str2, str, th);
                    return;
                case 4:
                    LogUtil.localLog(LogLevel.warning, str2, str, th);
                    return;
                case 5:
                    LogUtil.localLog(LogLevel.error, str2, str, th);
                    break;
            }
        }

        public void onProviderEvent(int i, String str, String str2) {
            String str3;
            switch (i) {
                case 1:
                    str3 = "rtc_joinchannel";
                    break;
                case 2:
                    str3 = "rtc_add_stream";
                    break;
                case 3:
                    str3 = "rtc_start_puborsub";
                    break;
                case 4:
                    str3 = "rtc_recv_answer";
                    break;
                case 5:
                    str3 = "rtc_ice_complete";
                    break;
                default:
                    str3 = "unknown";
                    break;
            }
            if (ByteEngine.this.mLogReporter != null) {
                ByteEngine.this.mLogReporter.onProviderEvent(str3, str, str2);
            }
        }

        public void onJoinChannelSuccess(String str, String str2, int i) {
            LogUtil.m110870d("ByteRtcEngine", "onJoinChannelSuccess");
            ByteEngine.this.mCallback.onStartSuccess(i);
            ByteEngine.this.mShouldReport = true;
            ByteEngine.this.mLogReporter.onJoinChannelSuccess();
            if (ByteEngine.this.mConfig.getType() == Type.VIDEO && ByteEngine.this.mVideoClient != null) {
                ByteEngine.this.mVideoClient.stop();
                ByteEngine.this.mVideoClient.start();
            }
            ByteEngine.this.mByteVideoSinkMap.clear();
            if (ByteEngine.this.mAudioClient != null) {
                ByteEngine.this.mAudioClient.start();
            }
            if (ByteEngine.this.mAudioSink != null) {
                ByteEngine.this.mAudioSink.start();
            }
        }

        public void onNetworkQuality(String str, int i, int i2) {
            if (str.equals(ByteEngine.this.mConfig.getInteractId())) {
                ByteEngine.this.mNetWorkQuality = i;
            }
            if (i < 0 || i > 6) {
                i = 0;
            }
            if (i2 < 0 || i2 > 6) {
                i2 = 0;
            }
            ByteEngine.this.mCallback.onNetworkQuality(str, i, i2);
            StringBuilder sb = new StringBuilder("onNetworkQuality: uid ");
            sb.append(str);
            sb.append(", txQuality ");
            sb.append(i);
            sb.append(", rxQuality ");
            sb.append(i2);
            LogUtil.m110872i("ByteRtcEngine", sb.toString());
        }

        public void onAudioQuality(String str, int i, short s, short s2) {
            ByteEngine.this.mCallback.onStreamDelay(s);
        }

        public void onFirstRemoteVideoFrame(final String str, int i, int i2, final int i3) {
            StringBuilder sb = new StringBuilder("onFirstRemoteVideoFrame: ");
            sb.append(str);
            LogUtil.m110870d("ByteRtcEngine", sb.toString());
            if (!ByteEngine.this.mFirstVideoFrameTimeStamp.containsKey(str)) {
                ByteEngine.this.mFirstVideoFrameTimeStamp.put(str, Long.valueOf(System.currentTimeMillis()));
            }
            if (ByteEngine.this.mConfig.getInteractId() == null || !ByteEngine.this.mConfig.getInteractId().equals(str)) {
                ByteEngine.this.mMainThreadHandler.post(new Runnable() {
                    public void run() {
                        ByteVideoSink byteVideoSink;
                        if (ByteEngine.this.mVideoSinkFactory != null) {
                            synchronized (ByteEngine.this.mByteVideoSinkMap) {
                                byteVideoSink = (ByteVideoSink) ByteEngine.this.mByteVideoSinkMap.get(str);
                            }
                            if (byteVideoSink == null) {
                                StringBuilder sb = new StringBuilder("Received user ");
                                sb.append(str);
                                sb.append("'s first video frame but didn't receive the onUserJoined.");
                                LogUtil.m110871e("ByteRtcEngine", sb.toString());
                                return;
                            }
                            ByteEngine.this.mRtcEngine.setupRemoteVideoRender(byteVideoSink, str);
                            if (ByteEngine.this.mConfig.getViewType() == ViewType.SURFACE_VIEW) {
                                SurfaceView surfaceView = byteVideoSink.getSurfaceView();
                                if (surfaceView != null) {
                                    surfaceView.setZOrderMediaOverlay(false);
                                }
                                ByteEngine.this.mCallback.onFirstRemoteVideoFrame(str, surfaceView, i3);
                            } else {
                                if (ByteEngine.this.mConfig.getViewType() == ViewType.TEXTURE_VIEW) {
                                    ByteEngine.this.mCallback.onFirstRemoteVideoFrame(str, byteVideoSink.getTextureView(), i3);
                                }
                            }
                        } else if (ByteEngine.this.mConfig.getViewType() == ViewType.SURFACE_VIEW) {
                            SurfaceView surfaceView2 = new SurfaceView(ByteEngine.this.mContext);
                            surfaceView2.setZOrderMediaOverlay(false);
                            ByteEngine.this.mRtcEngine.setupRemoteVideo(new VideoCanvas(surfaceView2, 1, str));
                            ByteEngine.this.mCallback.onFirstRemoteVideoFrame(str, surfaceView2, i3);
                        } else {
                            TextureView textureView = new TextureView(ByteEngine.this.mContext);
                            ByteEngine.this.mRtcEngine.setupRemoteVideo(new VideoCanvas(textureView, 1, str));
                            ByteEngine.this.mCallback.onFirstRemoteVideoFrame(str, textureView, i3);
                        }
                    }
                });
                LogReporter logReporter = ByteEngine.this.mLogReporter;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                logReporter.onFirstRemoteFrame(false, sb2.toString());
            }
        }
    };
    public ByteVideoClient mVideoClient;

    /* renamed from: com.ss.video.rtc.interact.vendor.bytertc.ByteEngine$4 */
    static /* synthetic */ class C517104 {

        /* renamed from: $SwitchMap$com$ss$video$rtc$engine$handler$IRtcEngineEventHandler$RtcLogLevel */
        static final /* synthetic */ int[] f128981x11981ef6 = new int[RtcLogLevel.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcLogLevel[] r0 = com.p683ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f128981x11981ef6 = r0
                int[] r0 = f128981x11981ef6     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcLogLevel r1 = com.p683ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_TRACE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f128981x11981ef6     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcLogLevel r1 = com.p683ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_INFO     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f128981x11981ef6     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcLogLevel r1 = com.p683ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_DEBUG     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f128981x11981ef6     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcLogLevel r1 = com.p683ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_WARNING     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f128981x11981ef6     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.ss.video.rtc.engine.handler.IRtcEngineEventHandler$RtcLogLevel r1 = com.p683ss.video.rtc.engine.handler.IRtcEngineEventHandler.RtcLogLevel.RTC_LOG_LEVEL_ERROR     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.video.rtc.interact.vendor.bytertc.ByteEngine.C517104.<clinit>():void");
        }
    }

    public String getVendor() {
        return "byte";
    }

    public void enableAudio() {
        this.mLogReporter.onEngineAPICall("enableAudio", "");
        this.mRtcEngine.enableAudio();
    }

    static {
        String[] strArr = {"bytertc"};
        for (int i = 0; i <= 0; i++) {
            try {
                LibraryLoaderHelper.loadLibrary(strArr[0]);
            } catch (Throwable unused) {
            }
        }
    }

    public void destroy() {
        this.mLogReporter.onEngineAPICall("destroy", null);
        this.mCallback.onDestroySuccess();
        super.destroy();
    }

    public void pause() {
        this.mLogReporter.onEngineAPICall("pause", null);
        if (this.mRtcEngine != null && !this.mConfig.isEnableAudioOnBackground()) {
            this.mRtcEngine.enableLocalAudio(false);
        }
    }

    public void resume() {
        this.mLogReporter.onEngineAPICall("resume", null);
        if (this.mRtcEngine != null && !this.mConfig.isEnableAudioOnBackground()) {
            this.mRtcEngine.enableLocalAudio(true);
        }
    }

    public ArrayList<RenderVideoFpsStatisticsReport> getVideoRenderFpsReport() {
        ArrayList<RenderVideoFpsStatisticsReport> arrayList = new ArrayList<>();
        for (ByteVideoSink byteVideoSink : this.mByteVideoSinkMap.values()) {
            if (byteVideoSink != null) {
                arrayList.add(byteVideoSink.getVideoFpsReport());
            }
        }
        return arrayList;
    }

    public void stop() {
        this.mLogReporter.onEngineAPICall("stop", null);
        if (this.mConfig.getCharacter() == Character.ANCHOR && this.mConfig.isEnableMixStream() && !this.mConfig.isClientMixStream()) {
            this.mRtcEngine.disableLiveTranscoding();
        }
        if (this.mConfig.getType() == Type.VIDEO) {
            this.mVideoClient.stop();
            this.mVideoClient.release();
            this.mVideoClient = null;
        }
        if (this.mAudioClient != null) {
            this.mAudioClient.stop();
            this.mAudioClient.release();
            this.mAudioClient = null;
        }
        if (this.mAudioSink != null) {
            this.mAudioSink.stop();
            this.mAudioSink.release();
            this.mAudioSink = null;
        }
        synchronized (this.mByteVideoSinkMap) {
            for (ByteVideoSink byteVideoSink : this.mByteVideoSinkMap.values()) {
                StringBuilder sb = new StringBuilder("before ");
                sb.append(byteVideoSink);
                sb.append(" release");
                LogUtil.m110874w("ByteRtcEngine", sb.toString());
                byteVideoSink.release();
            }
            this.mByteVideoSinkMap.clear();
        }
        this.mRtcEngine.disableAudio();
        this.mRtcEngine.enableLocalAudio(false);
        this.mSwitchAppId = false;
        this.mLogReporter.onLeavingChannel(this.mPullStreamsDuration);
        int leaveChannel = this.mRtcEngine.leaveChannel();
        if (leaveChannel == 0) {
            try {
                synchronized (this.mLeaveChannelNotifier) {
                    this.mLeaveChannelNotifier.wait(1000);
                }
            } catch (InterruptedException unused) {
            }
        }
        this.mLogReporter.onLeaveChannelReturn();
        this.mShouldReport = false;
        super.stop();
        if (leaveChannel == 0) {
            this.mCallback.onStopSuccess();
            return;
        }
        EngineCallback engineCallback = this.mCallback;
        StringBuilder sb2 = new StringBuilder("result: ");
        sb2.append(leaveChannel);
        engineCallback.onStopFailed(10007, sb2.toString());
        super.destroy();
    }

    public void init() {
        this.mLogReporter.onEngineAPICall("init", null);
        try {
            String byteAppId = this.mConfig.getByteAppId();
            if (mAppId != null && !mAppId.equals(byteAppId)) {
                RtcEngine.destroy();
                this.mSwitchAppId = true;
            }
            mAppId = byteAppId;
            RtcEngine.setRtcNativeLibraryLoader(new RtcNativeLibraryLoader() {
                public boolean load(String str) {
                    return true;
                }
            });
            RtcEngine.setDeviceId(this.mConfig.getDeviceId());
            RtcEngine.useDefaultSignalingServer(this.mConfig.isUseDefaultSignalingServerFirstFromRtcExt());
            this.mRtcEngine = RtcEngine.create(this.mContext, this.mConfig.getByteAppId(), this.mRtcEngineEventHandler, this.mConfig.getSharedEGLContext14());
            RtcEngine.setRtcEngineEventHandler(this.mRtcEngineEventHandler);
            this.mRtcEngine.setDefaultAudioRouteToSpeakerPhone(true);
            if (this.mRtcEngine == null) {
                LogUtil.m110872i("ByteRtcEngine", "Create ByteEngine failed.");
                return;
            }
            StringBuilder sb = new StringBuilder("------ ByteRtc SDK version: ");
            sb.append(RtcEngine.getSdkVersion());
            LogUtil.m110872i("ByteRtcEngine", sb.toString());
            this.mLogReporter.setThirdPartyRtcVersion(RtcEngine.getSdkVersion());
            int channelProfile = this.mRtcEngine.setChannelProfile(1);
            if (channelProfile < 0) {
                EngineCallback engineCallback = this.mCallback;
                StringBuilder sb2 = new StringBuilder("result: ");
                sb2.append(channelProfile);
                sb2.append(", channel profile: 1");
                engineCallback.onInitFailed(30001, sb2.toString());
                return;
            }
            int clientRole = this.mRtcEngine.setClientRole(1);
            if (clientRole < 0) {
                EngineCallback engineCallback2 = this.mCallback;
                StringBuilder sb3 = new StringBuilder("result: ");
                sb3.append(clientRole);
                sb3.append(", role: 1");
                engineCallback2.onInitFailed(30002, sb3.toString());
                return;
            }
            VideoQuality videoQuality = this.mConfig.getVideoQuality();
            int videoResolution = this.mRtcEngine.setVideoResolution(videoQuality.getWidth(), videoQuality.getHeight(), videoQuality.getFps(), videoQuality.getBitrate());
            if (videoResolution < 0) {
                EngineCallback engineCallback3 = this.mCallback;
                StringBuilder sb4 = new StringBuilder("result: ");
                sb4.append(videoResolution);
                engineCallback3.onInitFailed(10003, sb4.toString());
                return;
            }
            if (this.mConfig.getVolumeCallbackInterval() > 0) {
                int enableAudioVolumeIndication = this.mRtcEngine.enableAudioVolumeIndication(this.mConfig.getVolumeCallbackInterval(), 3);
                if (enableAudioVolumeIndication < 0) {
                    EngineCallback engineCallback4 = this.mCallback;
                    StringBuilder sb5 = new StringBuilder("result: ");
                    sb5.append(enableAudioVolumeIndication);
                    sb5.append(", interval: ");
                    sb5.append(this.mConfig.getVolumeCallbackInterval());
                    engineCallback4.onInitFailed(30004, sb5.toString());
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.mConfig.getLogFile())) {
                this.mRtcEngine.setLogFile(this.mConfig.getLogFile());
            }
            this.mCallback.onInitSuccess();
        } catch (Exception e) {
            LogUtil.m110871e("ByteRtcEngine", e.toString());
            this.mCallback.onInitFailed(VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT, e.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r9 = this;
            com.ss.video.rtc.interact.statistic.LogReporter r0 = r9.mLogReporter
            java.lang.String r1 = "start"
            r2 = 0
            r0.onEngineAPICall(r1, r2)
            com.ss.video.rtc.interact.audio.AudioClientFactory r0 = r9.mAudioClientFactory
            r1 = 1
            if (r0 != 0) goto L_0x0011
            com.ss.video.rtc.interact.audio.AudioSinkFactory r0 = r9.mAudioSinkFactory
            if (r0 == 0) goto L_0x0091
        L_0x0011:
            com.ss.video.rtc.interact.audio.AudioClientFactory r0 = r9.mAudioClientFactory
            if (r0 == 0) goto L_0x02b1
            com.ss.video.rtc.interact.model.Config r0 = r9.mConfig
            boolean r0 = r0.isClientMixStream()
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "ByteRtcEngine"
            java.lang.String r2 = "You have set an external audio source, but forget to enable external audio render, the interact sdk will helps you to render it."
            com.p683ss.video.rtc.interact.utils.log.LogUtil.m110874w(r0, r2)
        L_0x0024:
            com.ss.video.rtc.interact.audio.AudioClientFactory r0 = r9.mAudioClientFactory
            com.ss.video.rtc.interact.audio.AudioClient r0 = r0.create()
            if (r0 == 0) goto L_0x02a9
            int r2 = r0.getSampleRate()
            int r3 = r0.getChannelCount()
            com.ss.video.rtc.interact.audio.AudioClientFactory r4 = r9.mAudioClientFactory
            r4.destroy(r0)
            com.ss.video.rtc.interact.audio.AudioSinkFactory r0 = r9.mAudioSinkFactory
            if (r0 == 0) goto L_0x005e
            com.ss.video.rtc.interact.audio.AudioSinkFactory r0 = r9.mAudioSinkFactory
            com.ss.video.rtc.interact.audio.AudioSink r0 = r0.create()
            if (r0 == 0) goto L_0x005e
            int r4 = r0.getSampleRate()
            int r5 = r0.getChannelCount()
            com.ss.video.rtc.interact.audio.AudioSinkFactory r6 = r9.mAudioSinkFactory
            r6.destroy(r0)
            if (r2 == r4) goto L_0x005f
            com.ss.video.rtc.interact.callback.EngineCallback r0 = r9.mCallback
            r1 = 30008(0x7538, float:4.205E-41)
            java.lang.String r2 = "Audio sample rate of external capture and external render should equal."
            r0.onStartFailed(r1, r2)
            return
        L_0x005e:
            r5 = r3
        L_0x005f:
            com.ss.video.rtc.engine.RtcEngine r0 = r9.mRtcEngine
            r0.setExternalAudioDevice(r1, r2, r3, r5)
            com.ss.video.rtc.engine.RtcEngine r0 = r9.mRtcEngine
            com.ss.video.rtc.engine.handler.IRtcEngineAudioDeviceEventHandler r3 = r9.mAudioDeviceEventHandler
            r0.setAudioDeviceEventHandler(r3)
            com.ss.video.rtc.interact.vendor.bytertc.ByteAudioClient r0 = new com.ss.video.rtc.interact.vendor.bytertc.ByteAudioClient
            com.ss.video.rtc.interact.audio.AudioClientFactory r3 = r9.mAudioClientFactory
            com.ss.video.rtc.engine.RtcEngine r4 = r9.mRtcEngine
            r0.<init>(r3, r4)
            r9.mAudioClient = r0
            com.ss.video.rtc.interact.audio.AudioSinkFactory r0 = r9.mAudioSinkFactory
            if (r0 == 0) goto L_0x0086
            com.ss.video.rtc.interact.vendor.bytertc.ByteAudioSink r0 = new com.ss.video.rtc.interact.vendor.bytertc.ByteAudioSink
            com.ss.video.rtc.interact.audio.AudioSinkFactory r2 = r9.mAudioSinkFactory
            com.ss.video.rtc.engine.RtcEngine r3 = r9.mRtcEngine
            r0.<init>(r2, r3)
            r9.mAudioSink = r0
            goto L_0x0091
        L_0x0086:
            com.ss.video.rtc.interact.vendor.bytertc.ByteAudioSink r0 = new com.ss.video.rtc.interact.vendor.bytertc.ByteAudioSink
            com.ss.video.rtc.engine.RtcEngine r3 = r9.mRtcEngine
            r4 = 10
            r0.<init>(r3, r2, r5, r4)
            r9.mAudioSink = r0
        L_0x0091:
            com.ss.video.rtc.interact.model.Config r0 = r9.mConfig
            com.ss.video.rtc.interact.model.Config$Type r0 = r0.getType()
            com.ss.video.rtc.interact.model.Config$Type r2 = com.p683ss.video.rtc.interact.model.Config.Type.VIDEO
            if (r0 != r2) goto L_0x00c9
            com.ss.video.rtc.interact.vendor.bytertc.ByteVideoClient r0 = new com.ss.video.rtc.interact.vendor.bytertc.ByteVideoClient
            com.ss.video.rtc.interact.video.VideoClientFactory r2 = r9.mVideoClientFactory
            com.ss.video.rtc.interact.model.Config r3 = r9.mConfig
            com.ss.video.rtc.interact.model.CommonType$FrameFormat r3 = r3.getFrameFormat()
            com.ss.video.rtc.interact.model.Config r4 = r9.mConfig
            com.ss.video.rtc.interact.model.CommonType$VideoQuality r4 = r4.getVideoQuality()
            com.ss.video.rtc.interact.vendor.bytertc.ByteEngine$$Lambda$0 r5 = new com.ss.video.rtc.interact.vendor.bytertc.ByteEngine$$Lambda$0
            r5.<init>(r9)
            r0.<init>(r2, r3, r4, r5)
            r9.mVideoClient = r0
            com.ss.video.rtc.interact.vendor.bytertc.ByteVideoClient r0 = r9.mVideoClient
            r9.mVideoClientStatisic = r0
            com.ss.video.rtc.engine.RtcEngine r0 = r9.mRtcEngine
            r0.setExternalVideoSource(r1, r1, r1)
            com.ss.video.rtc.engine.RtcEngine r0 = r9.mRtcEngine
            r0.enableVideo()
            com.ss.video.rtc.interact.vendor.bytertc.ByteVideoClient r0 = r9.mVideoClient
            r0.prepare()
            goto L_0x00ce
        L_0x00c9:
            com.ss.video.rtc.engine.RtcEngine r0 = r9.mRtcEngine
            r0.disableVideo()
        L_0x00ce:
            com.ss.video.rtc.engine.RtcEngine r0 = r9.mRtcEngine
            r0.startPreview()
            com.ss.video.rtc.interact.model.Config r0 = r9.mConfig
            com.ss.video.rtc.interact.model.Config$Character r0 = r0.getCharacter()
            com.ss.video.rtc.interact.model.Config$Character r2 = com.p683ss.video.rtc.interact.model.Config.Character.ANCHOR
            if (r0 != r2) goto L_0x01d0
            com.ss.video.rtc.interact.model.Config r0 = r9.mConfig
            boolean r0 = r0.isEnableMixStream()
            if (r0 == 0) goto L_0x01d0
            com.ss.video.rtc.interact.model.Config r0 = r9.mConfig
            boolean r0 = r0.isClientMixStream()
            if (r0 != 0) goto L_0x01d0
            com.ss.video.rtc.interact.model.Config r0 = r9.mConfig
            com.ss.video.rtc.interact.model.Config$MixStreamConfig r0 = r0.getMixStreamConfig()
            if (r0 == 0) goto L_0x01d0
            com.ss.video.rtc.engine.live.LiveTranscoding r0 = com.p683ss.video.rtc.engine.live.LiveTranscoding.getDefualtLiveTranscode()
            com.ss.video.rtc.interact.model.Config r2 = r9.mConfig
            com.ss.video.rtc.interact.model.Config$MixStreamConfig r2 = r2.getMixStreamConfig()
            com.ss.video.rtc.engine.live.LiveTranscoding$VideoConfig r3 = r0.getVideo()
            int r4 = r2.getVideoBitrate()
            int r4 = r4 * 1000
            com.ss.video.rtc.engine.live.LiveTranscoding$VideoConfig r3 = r3.setBitRate(r4)
            int r4 = r2.getVideoFrameRate()
            com.ss.video.rtc.engine.live.LiveTranscoding$VideoConfig r3 = r3.setFps(r4)
            int r4 = r2.getVideoWidth()
            com.ss.video.rtc.engine.live.LiveTranscoding$VideoConfig r3 = r3.setWidth(r4)
            int r4 = r2.getVideoHeight()
            com.ss.video.rtc.engine.live.LiveTranscoding$VideoConfig r3 = r3.setHeight(r4)
            com.ss.video.rtc.interact.model.Config$VideoCodec r4 = r2.getVideoCodec()
            com.ss.video.rtc.interact.model.Config$VideoCodec r5 = com.p683ss.video.rtc.interact.model.Config.VideoCodec.H264
            if (r4 != r5) goto L_0x0130
            java.lang.String r4 = "H264"
            goto L_0x0132
        L_0x0130:
            java.lang.String r4 = "H265"
        L_0x0132:
            com.ss.video.rtc.engine.live.LiveTranscoding$VideoConfig r3 = r3.setCodec(r4)
            float r4 = r2.getVideoGop()
            int r5 = r2.getVideoFrameRate()
            float r5 = (float) r5
            float r4 = r4 * r5
            int r4 = (int) r4
            r3.setGop(r4)
            com.ss.video.rtc.engine.live.LiveTranscoding$AudioConfig r3 = r0.getAudio()
            int r4 = r2.getAudioChannels()
            com.ss.video.rtc.engine.live.LiveTranscoding$AudioConfig r3 = r3.setChannels(r4)
            int r4 = r2.getAudioSampleRateValue()
            com.ss.video.rtc.engine.live.LiveTranscoding$AudioConfig r3 = r3.setSampleRate(r4)
            com.ss.video.rtc.interact.model.Config$AudioProfile r4 = r2.getAudioProfile()
            com.ss.video.rtc.interact.model.Config$AudioProfile r5 = com.p683ss.video.rtc.interact.model.Config.AudioProfile.HE
            if (r4 != r5) goto L_0x0164
            com.ss.video.rtc.engine.live.LiveTranscoding$AACProfile r4 = com.p683ss.video.rtc.engine.live.LiveTranscoding.AACProfile.HEV1
            goto L_0x0166
        L_0x0164:
            com.ss.video.rtc.engine.live.LiveTranscoding$AACProfile r4 = com.p683ss.video.rtc.engine.live.LiveTranscoding.AACProfile.LC
        L_0x0166:
            com.ss.video.rtc.engine.live.LiveTranscoding$AudioConfig r3 = r3.setAacProfile(r4)
            int r4 = r2.getAudioBitrate()
            int r4 = r4 * 1000
            r3.setBitRate(r4)
            r2.updateStreamUrlPriority()
            r2.updatePushCount()
            java.lang.String r2 = r2.getStreamUrl()
            r0.setUrl(r2)
            com.ss.video.rtc.engine.live.LiveTranscoding$Layout$Builder r2 = new com.ss.video.rtc.engine.live.LiveTranscoding$Layout$Builder
            r2.<init>()
            com.ss.video.rtc.engine.live.LiveTranscoding$Layout$Region r3 = new com.ss.video.rtc.engine.live.LiveTranscoding$Layout$Region
            r3.<init>()
            com.ss.video.rtc.interact.model.Config r4 = r9.mConfig
            java.lang.String r4 = r4.getInteractId()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            com.ss.video.rtc.engine.live.LiveTranscoding$Layout$Region r4 = r3.uid(r4)
            r5 = 0
            com.ss.video.rtc.engine.live.LiveTranscoding$Layout$Region r4 = r4.position(r5, r5)
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.ss.video.rtc.engine.live.LiveTranscoding$Layout$Region r4 = r4.size(r5, r5)
            r7 = 0
            com.ss.video.rtc.engine.live.LiveTranscoding$Layout$Region r4 = r4.zorder(r7)
            com.ss.video.rtc.engine.live.LiveTranscoding$Layout$Region r4 = r4.alpha(r5)
            r4.renderMode(r1)
            r2.addRegoin(r3)
            com.ss.video.rtc.engine.live.LiveTranscoding$Layout r2 = r2.builder()
            r0.setLayout(r2)
            com.ss.video.rtc.engine.RtcEngine r2 = r9.mRtcEngine
            r2.enableLiveTranscoding(r0)
            com.ss.video.rtc.interact.statistic.LogReporter r2 = r9.mLogReporter
            if (r2 == 0) goto L_0x01d0
            com.ss.video.rtc.interact.statistic.LogReporter r2 = r9.mLogReporter
            com.ss.video.rtc.engine.live.LiveTranscoding$Layout r0 = r0.getLayout()
            java.lang.String r0 = r0.toString()
            r2.onRtcUpdateLayout(r0)
        L_0x01d0:
            com.ss.video.rtc.interact.model.Config r0 = r9.mConfig
            java.lang.String r0 = r0.getByteToken()
            if (r0 != 0) goto L_0x01db
            java.lang.String r0 = ""
            goto L_0x01e1
        L_0x01db:
            com.ss.video.rtc.interact.model.Config r0 = r9.mConfig
            java.lang.String r0 = r0.getByteToken()
        L_0x01e1:
            com.ss.video.rtc.interact.model.Config r2 = r9.mConfig
            java.lang.String r2 = r2.getChannelName()
            if (r2 == 0) goto L_0x01f7
            com.ss.video.rtc.interact.model.Config r2 = r9.mConfig
            java.lang.String r2 = r2.getChannelName()
            java.lang.String r3 = "0"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0239
        L_0x01f7:
            com.ss.video.rtc.interact.callback.EngineCallback r2 = r9.mCallback
            if (r2 == 0) goto L_0x0239
            com.ss.video.rtc.interact.callback.EngineCallback r2 = r9.mCallback
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "join channel parameters error channel name:"
            r3.<init>(r4)
            com.ss.video.rtc.interact.model.Config r4 = r9.mConfig
            java.lang.String r4 = r4.getChannelName()
            r3.append(r4)
            java.lang.String r4 = " ,interactID:"
            r3.append(r4)
            com.ss.video.rtc.interact.model.Config r4 = r9.mConfig
            java.lang.String r4 = r4.getInteractId()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = -8000(0xffffffffffffe0c0, float:NaN)
            r2.onStartFailed(r4, r3)
            com.ss.video.rtc.interact.statistic.LogReporter r2 = r9.mLogReporter
            com.ss.video.rtc.interact.model.Config r3 = r9.mConfig
            java.lang.String r3 = r3.getInteractId()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            com.ss.video.rtc.interact.model.Config r5 = r9.mConfig
            java.lang.String r5 = r5.getByteToken()
            r2.onErrorOccurs(r4, r3, r5)
        L_0x0239:
            com.ss.video.rtc.interact.model.Config r2 = r9.mConfig
            boolean r2 = r2.getForceGlobalAPIServer()
            if (r2 == 0) goto L_0x0244
            com.p683ss.video.rtc.engine.RtcEngine.ForceGlobalAPIServer(r1)
        L_0x0244:
            com.ss.video.rtc.engine.RtcEngine r2 = r9.mRtcEngine
            com.ss.video.rtc.interact.model.Config r1 = r9.mConfig
            java.lang.String r4 = r1.getChannelName()
            r5 = 0
            com.ss.video.rtc.interact.model.Config r1 = r9.mConfig
            java.lang.String r1 = r1.getInteractId()
            java.lang.String r6 = java.lang.String.valueOf(r1)
            com.ss.video.rtc.interact.model.Config r1 = r9.mConfig
            long r7 = r1.getUserId()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r3 = r0
            int r1 = r2.joinChannel(r3, r4, r5, r6, r7)
            com.ss.video.rtc.interact.statistic.LogReporter r2 = r9.mLogReporter
            com.ss.video.rtc.interact.model.Config r3 = r9.mConfig
            java.lang.String r3 = r3.getByteAppId()
            boolean r4 = r9.mSwitchAppId
            r2.onJoiningChannel(r1, r0, r3, r4)
            com.ss.video.rtc.interact.statistic.LogReporter r0 = r9.mLogReporter
            r0.onPublishStream(r1)
            java.lang.String r0 = "ByteRtcEngine"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "channel name: "
            r2.<init>(r3)
            com.ss.video.rtc.interact.model.Config r3 = r9.mConfig
            java.lang.String r3 = r3.getChannelName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.p683ss.video.rtc.interact.utils.log.LogUtil.m110870d(r0, r2)
            if (r1 >= 0) goto L_0x02a8
            com.ss.video.rtc.interact.callback.EngineCallback r0 = r9.mCallback
            r2 = 30006(0x7536, float:4.2047E-41)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "result: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.onStartFailed(r2, r1)
        L_0x02a8:
            return
        L_0x02a9:
            android.util.AndroidRuntimeException r0 = new android.util.AndroidRuntimeException
            java.lang.String r1 = "AudioClientFactory.create() returns null."
            r0.<init>(r1)
            throw r0
        L_0x02b1:
            java.lang.String r0 = "ByteRtcEngine"
            java.lang.String r1 = "If you want to play audio externally, you should also input audio by yourself !!!"
            com.p683ss.video.rtc.interact.utils.log.LogUtil.m110871e(r0, r1)
            android.util.AndroidRuntimeException r0 = new android.util.AndroidRuntimeException
            java.lang.String r1 = "You need to set an AudioClientFactory !!!"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.video.rtc.interact.vendor.bytertc.ByteEngine.start():void");
    }

    public void enableLocalAudio(boolean z) {
        StringBuilder sb = new StringBuilder("enable:");
        sb.append(z);
        this.mLogReporter.onEngineAPICall("enableLocalAudio", sb.toString());
        this.mRtcEngine.enableLocalAudio(z);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ boolean lambda$start$0$ByteEngine(ExtVideoFrame extVideoFrame) {
        if (!this.mRtcEngine.pushExternalVideoFrame(extVideoFrame)) {
            LogUtil.m110871e("ByteRtcEngine", "push external video frame failed");
            return false;
        }
        this.mLogReporter.onFirstLocalExternalVideoFrame();
        this.mTotalRenderFps++;
        return true;
    }

    public void muteAllRemoteAudioStreams(boolean z) {
        this.mLogReporter.onEngineAPICall("muteAllRemoteAudioStreams", C2240a.m6772a(" mute:%b", new Object[]{Boolean.valueOf(z)}));
        this.mRtcEngine.muteAllRemoteAudioStreams(z);
    }

    public void switchAudio(boolean z) {
        this.mLogReporter.onEngineAPICall("switchAudio", C2240a.m6772a("enable:%b", new Object[]{Boolean.valueOf(z)}));
        this.mRtcEngine.muteLocalAudioStream(!z);
    }

    public void adjustPlaybackSignalVolume(int i) {
        this.mLogReporter.onEngineAPICall("adjustPlaybackSignalVolume", C2240a.m6773a(Locale.getDefault(), " volume: %d", new Object[]{Integer.valueOf(i)}));
        this.mRtcEngine.adjustPlaybackSignalVolume(i);
    }

    public void adjustRecordingSignalVolume(int i) {
        this.mLogReporter.onEngineAPICall("adjustRecordingSignalVolume", C2240a.m6773a(Locale.getDefault(), " volume: %d", new Object[]{Integer.valueOf(i)}));
        this.mRtcEngine.adjustRecordingSignalVolume(i);
    }

    public void enableAudioVolumeIndication(int i) {
        this.mLogReporter.onEngineAPICall("enableAudioVolumeIndication", C2240a.m6773a(Locale.getDefault(), " interval: %dms", new Object[]{Integer.valueOf(i)}));
        this.mRtcEngine.enableAudioVolumeIndication(i, 3);
    }

    public void muteRemoteAudioStream(String str, boolean z) {
        StringBuilder sb = new StringBuilder("interactId:");
        sb.append(str);
        sb.append("mute:");
        sb.append(z);
        this.mLogReporter.onEngineAPICall("muteRemoteAudioStream", sb.toString());
        this.mRtcEngine.muteRemoteAudioStream(str, z);
        if (z) {
            this.mRtcEngine.AdjustRemoteAudioVolume(str, 0);
        } else {
            this.mRtcEngine.AdjustRemoteAudioVolume(str, 100);
        }
    }

    public void mixStream(MixStreamInfo mixStreamInfo, boolean z) {
        int i;
        if (this.mConfig.isEnableMixStream() && !this.mConfig.isClientMixStream()) {
            Builder builder = new Builder();
            builder.backgroundColor(getBackgroundColor());
            int i2 = 0;
            for (Region region : mixStreamInfo.getRegions()) {
                if (region.getInteractId() == null) {
                    LogUtil.m110871e("ByteRtcEngine", "region interact id is null");
                } else {
                    Layout.Region region2 = new Layout.Region();
                    Layout.Region alpha = region2.uid(String.valueOf(region.getInteractId())).position(region.getX(), region.getY()).size(region.getWidth(), region.getHeight()).renderMode(1).alpha(1.0d);
                    if (region.isMuteAudio()) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                    Layout.Region contentControl = alpha.contentControl(i);
                    int i3 = i2 + 1;
                    contentControl.zorder(i2);
                    builder.addRegoin(region2);
                    i2 = i3;
                }
            }
            String createSei = createSei(mixStreamInfo);
            LogUtil.m110872i("ByteRtcEngine", createSei);
            builder.appData(createSei);
            Layout builder2 = builder.builder();
            this.mRtcEngine.setVideoCompositingLayout(builder.builder());
            if (this.mLogReporter != null) {
                this.mLogReporter.onRtcUpdateLayout(builder2.toString());
            }
        }
    }

    public ByteEngine(Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, VideoSinkFactory videoSinkFactory, AudioSinkFactory audioSinkFactory, EngineCallback engineCallback) {
        super(config, videoClientFactory, audioClientFactory, videoSinkFactory, audioSinkFactory, engineCallback);
    }
}
