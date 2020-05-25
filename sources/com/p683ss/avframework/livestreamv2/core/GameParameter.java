package com.p683ss.avframework.livestreamv2.core;

import android.app.Activity;
import com.p683ss.avframework.mixer.VideoMixer.VideoMixerDescription;
import com.p683ss.avframework.utils.TEBundle;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.core.GameParameter */
public class GameParameter extends TEBundle {
    private WeakReference<Activity> mActivityWeakReference;
    private VideoMixerDescription mCameraLayerDescription;
    private VideoMixerDescription mGameLayerDescription;
    private JSONObject mLaunchOpt;
    private final String mSchemaKey = "schema";

    public VideoMixerDescription getCameraLayerDescritionOnPublish() {
        return this.mCameraLayerDescription;
    }

    public VideoMixerDescription getGameLayerDescritionOnPublish() {
        return this.mGameLayerDescription;
    }

    public JSONObject getLaunchOpt() {
        return this.mLaunchOpt;
    }

    public GameParameter() {
    }

    public long getPublishBitrate() {
        return getLong("rtmp_init_video_bitrate");
    }

    public int getPublishFps() {
        return getInt("video_fps");
    }

    public long getPublishMaxBitrate() {
        return getLong("rtmp_max_video_bitrate");
    }

    public long getPublishMinBitrate() {
        return getLong("rtmp_min_video_bitrate");
    }

    public boolean isPublishLeftRightWindow() {
        return getBool("game-publish-win-lrw");
    }

    public Activity getActivity() {
        if (this.mActivityWeakReference == null) {
            return null;
        }
        return (Activity) this.mActivityWeakReference.get();
    }

    public String getSchema() {
        if (contains("schema")) {
            return getString("schema");
        }
        return null;
    }

    public boolean isTest() {
        if (contains("game-test")) {
            return getBool("game-test");
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(",activity(");
        sb.append(this.mActivityWeakReference);
        sb.append("),launchOpt:");
        if (this.mLaunchOpt != null) {
            str = this.mLaunchOpt.toString();
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public GameParameter setCameraLayerDescritionOnPublish(VideoMixerDescription videoMixerDescription) {
        this.mCameraLayerDescription = videoMixerDescription;
        return this;
    }

    public GameParameter setGameLayerDescritionOnPublish(VideoMixerDescription videoMixerDescription) {
        this.mGameLayerDescription = videoMixerDescription;
        return this;
    }

    public GameParameter setLaunchOpt(JSONObject jSONObject) {
        this.mLaunchOpt = jSONObject;
        return this;
    }

    public GameParameter setActivity(Activity activity) {
        this.mActivityWeakReference = new WeakReference<>(activity);
        return this;
    }

    public GameParameter setPublishBitrate(long j) {
        setLong("rtmp_init_video_bitrate", j);
        return this;
    }

    public GameParameter setPublishFps(int i) {
        setInt("video_fps", i);
        return this;
    }

    public void setPublishLeftRightWindowMode(boolean z) {
        setBool("game-publish-win-lrw", z);
    }

    public GameParameter setPublishMaxBitrate(long j) {
        setLong("rtmp_max_video_bitrate", j);
        return this;
    }

    public GameParameter setPublishMinBitrate(long j) {
        setLong("rtmp_min_video_bitrate", j);
        return this;
    }

    public GameParameter setSchema(String str) {
        if (str != null) {
            setString("schema", str);
        }
        return this;
    }

    public GameParameter setTest(boolean z) {
        setBool("game-test", z);
        return this;
    }

    public GameParameter(GameParameter gameParameter) {
        super((TEBundle) gameParameter);
        if (gameParameter.getCameraLayerDescritionOnPublish() != null) {
            this.mCameraLayerDescription = new VideoMixerDescription();
            this.mCameraLayerDescription.copy(gameParameter.getCameraLayerDescritionOnPublish());
        }
        if (gameParameter.getGameLayerDescritionOnPublish() != null) {
            this.mGameLayerDescription = new VideoMixerDescription();
            this.mGameLayerDescription.copy(gameParameter.getGameLayerDescritionOnPublish());
        }
    }
}
