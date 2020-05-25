package com.p683ss.ttvideoengine.log;

import com.p683ss.ttm.player.PlaybackParams;
import com.p683ss.ttvideoengine.metrics.IMediaMetrics;
import com.p683ss.ttvideoengine.model.VideoModel;
import com.p683ss.ttvideoengine.utils.Error;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.ss.ttvideoengine.log.IVideoEventLogger */
public interface IVideoEventLogger {
    void accuBuffingTime(long j);

    void accuErrCount(int i);

    void accuPauseTime(long j);

    void addWatchedDuration(int i);

    void beginToPlay(String str, long j, String str2);

    void bufferDataSeconds(int i);

    IMediaMetrics buildMetrics(int i);

    void clockDiff(long j);

    void codecName(int i, int i2);

    void configResolution(String str, String str2);

    void containerFps(float f);

    void curAudioDecodeError(int i);

    void curPlayBackTime(int i);

    void curVideoDecodeError(int i);

    void curVideoDecoderFps(int i);

    void curVideoOutputFps(float f);

    void curVideoRenderError(int i);

    void decoderType(int i);

    void deviceStartTime(int i, long j);

    void devicedOpenedTime(int i, long j);

    void didSentEvent(int i);

    void dropCount(int i);

    void enableSharp(int i);

    void enableStartPlayAutomatically(boolean z);

    void engineState(int i);

    void externalCacheInfo(int i, String str, String str2, String str3);

    void fetchInfoComplete(VideoModel videoModel, Error error);

    void fetchedAndLeaveByUser(int i);

    void firstDNSFailed(Error error);

    long getCurDecoderBufferAccuT();

    int getCurDecoderBufferCount();

    String getExtraInfo();

    long getLeaveWaitTime();

    String getStringOption(int i);

    String getTraceID();

    void hwCodecException(int i);

    void hwCodecName(String str);

    void loadState(int i);

    void logFirstError(Error error);

    void logMessage(String str);

    void logPluginException(String str);

    void loopAgain();

    void mainURLCDNFailed(Error error, String str);

    void mainURLHTTPDNSFailed(Error error);

    void mainURLLocalDNSFailed(Error error);

    void movieBufferDidReachEnd();

    void movieFinish(int i);

    void movieFinish(int i, String str);

    void movieFinish(Error error, int i);

    void movieShouldRetry(Error error, int i, int i2);

    void movieStallEnd(int i);

    void movieStalled(int i, int i2);

    void needRetryToFetch(Error error, int i);

    void playBackState(int i);

    void playbackBufferEnd();

    void playerDidFailed(Error error, String str);

    void prepareEnd();

    void prepareStart();

    void recordBlockReason(int i, boolean z);

    void renderSeekCompleted(int i);

    void reset();

    void seekCompleted();

    void seekTo(int i, int i2, boolean z);

    void setAbrInfo(Map map);

    void setAudioBufferLength(long j);

    void setCheckHijack(int i);

    void setCurHost(String str);

    void setCurIP(String str);

    void setCurQuality(String str);

    void setCurResolution(String str);

    void setCurURL(String str);

    void setCustomP2PCDNType(int i);

    void setCustomStr(String str);

    void setDNSEndTime(long j);

    void setDNSParseTime(long j, int i);

    void setDNSStartTime(long j);

    void setDecodeFirstAudioFrameTime(long j);

    void setDecodeFirstVideoFrameTime(long j);

    void setDisableAccurateStart(int i);

    void setDnsMode(int i);

    void setDrmTokenUrl(String str);

    void setDrmType(int i);

    void setDuration(int i);

    void setEnableBash(int i);

    void setEnableMDL(int i);

    void setEncryptKey(String str);

    void setExternLog(String str);

    void setFeed(VideoModel videoModel);

    void setFramesDropNum(int i);

    void setGenerateP2PInfoEndTime(long j);

    void setGenerateP2PInfoStartTime(long j);

    void setGetP2PUrlT(long j);

    void setHijackCode(int i);

    void setHijackRetry(int i);

    void setInitialHost(String str);

    void setInitialIP(String str);

    void setInitialQuality(String str);

    void setInitialResolution(String str);

    void setInitialURL(String str);

    void setIntOption(int i, int i2);

    void setIsVideoModelCache(int i);

    void setLongOption(int i, long j);

    void setMediaCodecRender(int i);

    void setNetWorkTryCount(int i);

    void setNetworkSpeedFrom(double d, int i);

    void setP2PCDNType(int i);

    void setP2PSDKVersion(String str);

    void setP2PUrl(String str);

    void setPlayAPIVersion(int i, String str);

    void setPlayItem(Map map);

    void setPlayType(int i);

    void setPlaybackParams(PlaybackParams playbackParams);

    void setPlayerCreatedT(long j);

    void setPlayerHostAddr(String str);

    void setPreloadInfo(Map map);

    void setProxyUrl(String str);

    void setReceiveFirstAudioFrameTime(long j);

    void setReceiveFirstVideoFrameTime(long j);

    void setReuseSocket(int i);

    void setSettingLog(int i, int i2);

    void setSourceType(int i, String str);

    void setStartPlayHeight(int i);

    void setStartPlayWidth(int i);

    void setStartTime(int i);

    void setSubTag(String str);

    void setSurface(String str);

    void setTag(String str);

    void setTextureRenderError(String str);

    void setTraceID(String str);

    void setTranConnectTime(long j);

    void setTranFirstPacketTime(long j);

    void setVUArray(ArrayList arrayList);

    void setVideoBufferLength(long j);

    void setVideoCacheSize(long j);

    void showedOneFrame();

    void stop(int i);

    void switchResolution();

    void switchResolution(String str, String str2);

    void switchResolutionEnd();

    void tryErrCount(int i);

    void updateVideoInfo(VideoModel videoModel);

    void useAsyncInit(int i, int i2);

    void useCacheFile(int i);

    void useCodecPool(int i);

    void useHardwareDecode(int i);

    void usePreload(int i);

    void useSuperRes(int i);

    void useTextureRender(int i);

    void validateVideoMetaInfoFail(Error error);

    void watchFinish();
}
