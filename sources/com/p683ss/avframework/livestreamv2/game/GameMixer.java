package com.p683ss.avframework.livestreamv2.game;

import com.p683ss.avframework.buffer.VideoFrame;
import com.p683ss.avframework.mixer.VideoMixer;
import com.p683ss.avframework.mixer.VideoMixer.VideoMixerDescription;
import com.p683ss.avframework.mixer.VideoMixer.VideoMixerTexture;

/* renamed from: com.ss.avframework.livestreamv2.game.GameMixer */
public class GameMixer extends VideoMixer {
    private VideoMixerDescription mCameraMixerDescription;
    private int mCameraTrackIdx;
    private VideoMixerDescription mGameMixerDescription;
    private int mGameTrackIdx;

    public int getCameraIndex() {
        return this.mCameraTrackIdx;
    }

    public VideoMixerDescription getDescription(int i) {
        return null;
    }

    public int getGameIndex() {
        return this.mGameTrackIdx;
    }

    public void updateDescription(int i, VideoMixerDescription videoMixerDescription) {
    }

    public VideoMixerDescription getCameraMixerDescription() {
        VideoMixerDescription videoMixerDescription = new VideoMixerDescription();
        videoMixerDescription.copy(this.mCameraMixerDescription);
        return videoMixerDescription;
    }

    public VideoMixerDescription getGameMixerDescription() {
        VideoMixerDescription videoMixerDescription = new VideoMixerDescription();
        videoMixerDescription.copy(this.mGameMixerDescription);
        return videoMixerDescription;
    }

    public synchronized void release() {
        setEnable(false);
        removeTrack(this.mCameraTrackIdx);
        removeTrack(this.mGameTrackIdx);
        this.mGameTrackIdx = -1;
        this.mCameraTrackIdx = -1;
        super.release();
    }

    public GameMixer() {
        this.mGameTrackIdx = -1;
        this.mCameraTrackIdx = -1;
        this.mGameTrackIdx = createTrack();
        this.mCameraTrackIdx = createTrack();
        this.mGameMixerDescription = VideoMixerDescription.FILL();
        this.mCameraMixerDescription = VideoMixerDescription.RIGHT_HALF();
        this.mGameMixerDescription.setVisibility(true);
        this.mGameMixerDescription.setzOrder(0);
        this.mGameMixerDescription.setMirror(true, true);
        this.mGameMixerDescription.setMode(2);
        this.mCameraMixerDescription.left = 0.75f;
        this.mCameraMixerDescription.right = 1.0f;
        this.mCameraMixerDescription.top = 0.0f;
        this.mCameraMixerDescription.bottom = 0.25f;
        this.mCameraMixerDescription.setVisibility(true);
        this.mCameraMixerDescription.setzOrder(1);
        this.mCameraMixerDescription.setMirror(true, true);
        this.mCameraMixerDescription.setMode(2);
        updateDescriptionWithProcessMirror(this.mCameraTrackIdx, this.mCameraMixerDescription);
        updateDescriptionWithProcessMirror(this.mGameTrackIdx, this.mGameMixerDescription);
    }

    public void mixCameraFrame(VideoFrame videoFrame) {
        mixFrame(this.mCameraTrackIdx, videoFrame);
    }

    public void mixGameFrame(VideoMixerTexture videoMixerTexture) {
        mixFrame(this.mGameTrackIdx, videoMixerTexture);
    }

    public void updateCameraMixerDescription(VideoMixerDescription videoMixerDescription) {
        this.mCameraMixerDescription.copy(videoMixerDescription);
        updateDescriptionWithProcessMirror(this.mCameraTrackIdx, videoMixerDescription);
    }

    public void updateGameMixerDescription(VideoMixerDescription videoMixerDescription) {
        this.mGameMixerDescription.copy(videoMixerDescription);
        updateDescriptionWithProcessMirror(this.mGameTrackIdx, videoMixerDescription);
    }

    private void updateDescriptionWithProcessMirror(int i, VideoMixerDescription videoMixerDescription) {
        VideoMixerDescription videoMixerDescription2 = new VideoMixerDescription();
        videoMixerDescription2.copy(videoMixerDescription);
        if (videoMixerDescription2.isMirror(true)) {
            float f = videoMixerDescription2.bottom;
            videoMixerDescription2.bottom = 1.0f - videoMixerDescription2.top;
            videoMixerDescription2.top = 1.0f - f;
        }
        super.updateDescription(i, videoMixerDescription2);
    }
}
