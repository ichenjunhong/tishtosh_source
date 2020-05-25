package com.p683ss.avframework.livestreamv2.core;

import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.avframework.livestreamv2.LiveStream;
import com.p683ss.avframework.livestreamv2.LiveStreamBuilder;
import com.p683ss.avframework.livestreamv2.log.ILogUploader;
import com.p683ss.avframework.livestreamv2.log.LiveStreamLogService;
import com.p683ss.avframework.utils.Monitor;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.core.LiveStreamGameLogService */
public class LiveStreamGameLogService extends LiveStreamLogService {
    private WeakReference<LayerControl> mLayerControlWeakReference;
    private Monitor mMonitor;

    public JSONObject createCommonLog() {
        String str = "";
        if (this.mLiveStream != null) {
            str = this.mLiveStream.getVersion();
        }
        try {
            return new JSONObject().put("product_line", CustomActionPushReceiver.f104061f).put(C42311c.f106863g, "2.0.0").put("live_sdk_version", str).put("report_version", 5).put("timestamp", System.currentTimeMillis()).put("mode", "game").put("project_key", this.mProjectKey);
        } catch (JSONException unused) {
            return null;
        }
    }

    public void report() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        LiveStreamBuilder liveStreamBuilder;
        int i11;
        int i12;
        Object obj;
        if (this.mLiveStream != null && this.mLogUploader != null) {
            try {
                JSONObject createCommonLog = createCommonLog();
                LiveStreamBuilder liveStreamBuilder2 = this.mLiveStream.getLiveStreamBuilder();
                if (liveStreamBuilder2 != null) {
                    i10 = liveStreamBuilder2.getVideoWidth();
                    i9 = liveStreamBuilder2.getVideoHeight();
                    i8 = liveStreamBuilder2.getVideoCaptureWidth();
                    i7 = liveStreamBuilder2.getVideoCaptureHeight();
                    i6 = liveStreamBuilder2.getAudioCaptureChannel();
                    i5 = liveStreamBuilder2.getAudioCaptureSampleHZ();
                    i4 = liveStreamBuilder2.getAudioCaptureDevice();
                    i3 = liveStreamBuilder2.getVideoCaptureDevice();
                    i2 = liveStreamBuilder2.getAudioSampleHZ();
                    i = liveStreamBuilder2.getAudioChannel();
                } else {
                    i10 = 0;
                    i9 = 0;
                    i8 = 0;
                    i7 = 0;
                    i6 = 0;
                    i5 = 0;
                    i4 = 0;
                    i3 = 0;
                    i2 = 0;
                    i = 0;
                }
                LayerControl layerControl = (LayerControl) this.mLayerControlWeakReference.get();
                if (layerControl != null) {
                    liveStreamBuilder = liveStreamBuilder2;
                    double realRenderFps = (double) layerControl.getRealRenderFps();
                    Double.isNaN(realRenderFps);
                    i11 = (int) (realRenderFps + 0.5d);
                    if (layerControl.isDirectRenderMode()) {
                        i12 = 1;
                    } else {
                        i12 = 2;
                    }
                } else {
                    liveStreamBuilder = liveStreamBuilder2;
                    i12 = 0;
                    i11 = 0;
                }
                JSONObject put = createCommonLog.put("event_key", "game_stream").put("render_fps", i11).put("preview_fps", i11).put("stream_type", i12).put("video_capture_width", i8).put("video_capture_height", i7).put("width", i10).put("height", i9).put("audio_capture_sample", i5).put("audio_capture_channel", i6).put("video_capture_type", i3).put("audio_capture_type", i4).put("audio_channel", i).put("audio_sample_rate", i2).put("memory", this.mMonitor.getAppRSSKB()).put("cpu", this.mMonitor.getAppPrecentageOnCPU()).put("live_status", this.mLiveStream.status());
                String str = "is_live_audio_capture";
                int i13 = -1;
                if (liveStreamBuilder != null) {
                    obj = Boolean.valueOf(liveStreamBuilder.isUsingLiveStreamAudioCapture());
                } else {
                    obj = Integer.valueOf(-1);
                }
                JSONObject put2 = put.put(str, obj);
                String str2 = "is_vecamera_v2";
                if (liveStreamBuilder != null) {
                    if (liveStreamBuilder.isVECamera2API()) {
                        i13 = 1;
                    } else {
                        i13 = 0;
                    }
                }
                put2.put(str2, i13);
                this.mLogUploader.uploadLog(createCommonLog);
            } catch (Exception unused) {
            }
            if (this.mStarted) {
                this.mHandler.sendEmptyMessageDelayed(BaseNotice.HASHTAG, this.mInterval);
            }
        }
    }

    public void setupLayerControl(LayerControl layerControl) {
        this.mLayerControlWeakReference = new WeakReference<>(layerControl);
    }

    public void onGamePreload(String str) {
        if (this.mLiveStream != null && this.mLogUploader != null) {
            try {
                JSONObject createCommonLog = createCommonLog();
                createCommonLog.put("event_key", "game_preload").put("message", str);
                this.mLogUploader.uploadLog(createCommonLog);
            } catch (Exception unused) {
            }
        }
    }

    public void onGameStart(String str) {
        if (this.mLiveStream != null && this.mLogUploader != null) {
            try {
                JSONObject createCommonLog = createCommonLog();
                createCommonLog.put("event_key", "game_start").put("message", str);
                this.mLogUploader.uploadLog(createCommonLog);
            } catch (Exception unused) {
            }
        }
    }

    public void onGameStop(String str) {
        if (this.mLiveStream != null && this.mLogUploader != null) {
            try {
                JSONObject createCommonLog = createCommonLog();
                createCommonLog.put("event_key", "game_stop").put("message", str);
                this.mLogUploader.uploadLog(createCommonLog);
            } catch (Exception unused) {
            }
        }
    }

    public void onSwitchGameStream(String str) {
        if (this.mLiveStream != null && this.mLogUploader != null) {
            try {
                JSONObject createCommonLog = createCommonLog();
                createCommonLog.put("event_key", "video_pipeline_changed").put("message", str);
                this.mLogUploader.uploadLog(createCommonLog);
            } catch (Exception unused) {
            }
        }
    }

    public LiveStreamGameLogService(LiveStream liveStream, ILogUploader iLogUploader) {
        super(liveStream, iLogUploader);
    }

    public LiveStreamGameLogService(LiveStream liveStream, ILogUploader iLogUploader, long j) {
        super(liveStream, iLogUploader, j);
        this.mMonitor = new Monitor();
    }

    public void onGameError(String str, String str2, Throwable th) {
        String str3;
        if (this.mLiveStream != null && this.mLogUploader != null) {
            try {
                JSONObject createCommonLog = createCommonLog();
                JSONObject put = createCommonLog.put("event_key", "game_error");
                String str4 = "message";
                StringBuilder sb = new StringBuilder("gameId:");
                sb.append(str);
                sb.append(",msg:");
                sb.append(str2);
                sb.append(",cause:");
                sb.append(th);
                if (sb.toString() != null) {
                    str3 = th.getMessage();
                } else {
                    str3 = "";
                }
                put.put(str4, str3);
                this.mLogUploader.uploadLog(createCommonLog);
            } catch (Exception unused) {
            }
        }
    }
}
