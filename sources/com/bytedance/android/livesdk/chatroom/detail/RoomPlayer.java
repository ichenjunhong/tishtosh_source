package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import android.text.TextUtils;
import android.view.TextureView;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4189h;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8653c;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8654d;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.C8725y.C8726a;
import com.bytedance.android.p160b.C2831a;
import com.bytedance.android.p160b.C2831a.C2832a;

public class RoomPlayer implements C2831a {
    private static final int MASK = 65535;
    private static final int OFFSET = 16;
    private static final String TAG = "RoomPlayer";
    private boolean isBackground;
    private C5058a mAudioFocusController;
    private final C2832a mCallback;
    private final Context mContext;
    private int mDecodeStatus;
    private String mDefaultResolution;
    private C4189h mLivePlayController;
    private String mMediaErrorMessage;
    private String mPullStreamData;
    private C8726a mSrConfig;
    private boolean mStopOnPlayingOther;
    private final C8710m mStreamType;
    private String mStreamUrl;
    private final TextureView mTextureView;
    private boolean openSEI = true;
    private String sdkParams;

    public int getDecodeStatus() {
        return this.mDecodeStatus;
    }

    public String getMediaErrorMessage() {
        return this.mMediaErrorMessage;
    }

    public long getPlayerFirstFrameTime() {
        return 0;
    }

    public long getPlayerStartTime() {
        return 0;
    }

    public long getStartTime() {
        return 0;
    }

    public boolean hasWarmedUp() {
        return false;
    }

    public void recycle() {
    }

    public long getAudioLostFocusTime() {
        if (this.mAudioFocusController == null) {
            return -1;
        }
        return this.mAudioFocusController.f13533c;
    }

    public boolean isVideoHorizontal() {
        if (this.mLivePlayController == null || !this.mLivePlayController.mo9617a()) {
            return false;
        }
        return true;
    }

    public void onBackground() {
        this.isBackground = true;
        if (this.mAudioFocusController != null) {
            this.mAudioFocusController.mo10928a(true);
        }
    }

    public void onForeground() {
        this.isBackground = false;
        if (this.mAudioFocusController != null) {
            this.mAudioFocusController.mo10928a(false);
            this.mAudioFocusController.mo10925a(this.mContext);
        }
    }

    public boolean tryResumePlay() {
        if (!this.mStopOnPlayingOther) {
            return false;
        }
        this.mStopOnPlayingOther = false;
        if (!TextUtils.isEmpty(this.mPullStreamData)) {
            doStartPlayByMultiPullStreamData();
        } else if (TextUtils.isEmpty(this.mStreamUrl)) {
            return false;
        } else {
            doStartPlayByStreamUrl();
        }
        return true;
    }

    private void doStartPlayByMultiPullStreamData() {
        C8654d a;
        this.isBackground = false;
        this.mAudioFocusController.mo10925a(this.mContext);
        try {
            C4189h hVar = this.mLivePlayController;
            String str = this.mPullStreamData;
            String str2 = this.mDefaultResolution;
            TextureView textureView = this.mTextureView;
            int ordinal = this.mStreamType.ordinal();
            if (this.mSrConfig == null) {
                a = null;
            } else {
                a = C8654d.m17099a().mo15123a(this.mSrConfig.f23992a).mo15125b(this.mSrConfig.f23993b).mo15122a(this.mSrConfig.f23994c).mo15124a();
            }
            hVar.mo14269a(str, str2, textureView, ordinal, a, (C8653c) new C5077k(this));
        } catch (Exception e) {
            this.mCallback.mo7453a(e);
        }
    }

    private void doStartPlayByStreamUrl() {
        C8654d a;
        this.mAudioFocusController.mo10925a(this.mContext);
        try {
            C4189h hVar = this.mLivePlayController;
            String str = this.mStreamUrl;
            TextureView textureView = this.mTextureView;
            int ordinal = this.mStreamType.ordinal();
            if (this.mSrConfig == null) {
                a = null;
            } else {
                a = C8654d.m17099a().mo15123a(this.mSrConfig.f23992a).mo15125b(this.mSrConfig.f23993b).mo15122a(this.mSrConfig.f23994c).mo15124a();
            }
            hVar.mo14268a(str, textureView, ordinal, a, (C8653c) new C5076j(this), this.sdkParams);
        } catch (Exception e) {
            this.mCallback.mo7453a(e);
        }
    }

    public boolean start() {
        if (this.mLivePlayController != null) {
            return true;
        }
        if (!TextUtils.isEmpty(this.mPullStreamData)) {
            this.mLivePlayController = ((C4139d) C4116c.m10249a(C4139d.class)).getLivePlayController();
            this.mLivePlayController.mo9624c(this.openSEI);
            this.mAudioFocusController = new C5058a(this.mLivePlayController);
            doStartPlayByMultiPullStreamData();
        } else if (TextUtils.isEmpty(this.mStreamUrl)) {
            return false;
        } else {
            this.mLivePlayController = ((C4139d) C4116c.m10249a(C4139d.class)).getLivePlayController();
            this.mLivePlayController.mo9624c(this.openSEI);
            this.mAudioFocusController = new C5058a(this.mLivePlayController);
            doStartPlayByStreamUrl();
        }
        return true;
    }

    public boolean startWithNewLivePlayer() {
        if (this.mLivePlayController != null) {
            return true;
        }
        if (TextUtils.isEmpty(this.mPullStreamData) && TextUtils.isEmpty(this.mStreamUrl)) {
            return false;
        }
        this.mLivePlayController = ((C4139d) C4116c.m10249a(C4139d.class)).getLivePlayController();
        this.mLivePlayController.mo14279g();
        this.mLivePlayController.mo9624c(true);
        this.mAudioFocusController = new C5058a(this.mLivePlayController);
        if (!TextUtils.isEmpty(this.mPullStreamData)) {
            doStartPlayByMultiPullStreamData();
        } else {
            doStartPlayByStreamUrl();
        }
        return true;
    }

    public void setSeiOpen(boolean z) {
        this.openSEI = z;
    }

    public void setAnchorInteractMode(boolean z) {
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo9615a(z);
        }
    }

    public void setMute(boolean z) {
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo14270a(z, this.mContext);
        }
    }

    public void setScreenOrientation(boolean z) {
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo9621b(z);
        }
    }

    public void stopWhenJoinInteract(Context context) {
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo9619b(context);
        }
    }

    public void stopWhenPlayingOther(Context context) {
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo14278f(context);
        }
    }

    public void switchResolution(String str) {
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo14276e(str);
        }
    }

    public void getVideoSize(int[] iArr) {
        if (this.mLivePlayController != null && iArr != null) {
            int h = this.mLivePlayController.mo14280h();
            iArr[0] = MASK & h;
            iArr[1] = h >> 16;
        }
    }

    public void stop(boolean z) {
        if (this.mAudioFocusController != null) {
            if (z) {
                this.mAudioFocusController.mo10930b(this.mContext);
            } else {
                this.mAudioFocusController.mo10924a();
            }
            this.mAudioFocusController = null;
        }
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo9608a(this.mContext);
            if (z) {
                this.mLivePlayController.mo14275e(this.mContext);
            }
            this.mLivePlayController = null;
        }
        this.mDecodeStatus = 0;
        this.mMediaErrorMessage = null;
        this.mStopOnPlayingOther = false;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$doStartPlayByMultiPullStreamData$1$RoomPlayer(C8652b bVar, Object obj) {
        if (this.mAudioFocusController != null && this.mLivePlayController != null) {
            switch (bVar) {
                case COMPLETE_PLAY:
                    this.mCallback.mo7455j();
                    return;
                case MEDIA_ERROR:
                    this.mCallback.mo7455j();
                    if (obj != null) {
                        this.mMediaErrorMessage = obj.toString();
                    }
                    if (this.mDecodeStatus != 1) {
                        this.mDecodeStatus = 2;
                        this.mCallback.mo7452a(C8652b.MEDIA_ERROR.ordinal(), this.mMediaErrorMessage);
                        return;
                    }
                    break;
                case DISPLAYED_PLAY:
                    ((C4193l) C4116c.m10249a(C4193l.class)).cacheObj2Obj(this.mCallback, this.mLivePlayController);
                    this.mDecodeStatus = 1;
                    if (!this.isBackground) {
                        this.mAudioFocusController.mo10925a(this.mContext);
                    }
                    this.mCallback.mo7456k();
                    return;
                case STOP_WHEN_PLAYING_OTHER:
                    this.mStopOnPlayingOther = true;
                    this.mAudioFocusController.mo10930b(this.mContext);
                    return;
                case STOP_WHEN_JOIN_INTERACT:
                    this.mStopOnPlayingOther = true;
                    return;
                case INTERACT_SEI:
                    this.mCallback.mo7454a(obj);
                    return;
                case BUFFERING_START:
                    this.mCallback.mo7457l();
                    return;
                case BUFFERING_END:
                    this.mCallback.mo7458m();
                    return;
                case VIDEO_SIZE_CHANGED:
                    int parseInt = Integer.parseInt((String) obj);
                    this.mCallback.mo7451a(MASK & parseInt, parseInt >> 16);
                    return;
                case PLAYER_DETACHED:
                    this.mCallback.mo7459n();
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$doStartPlayByStreamUrl$0$RoomPlayer(C8652b bVar, Object obj) {
        if (this.mAudioFocusController != null && this.mLivePlayController != null) {
            switch (bVar) {
                case COMPLETE_PLAY:
                    this.mCallback.mo7455j();
                    return;
                case MEDIA_ERROR:
                    this.mCallback.mo7455j();
                    if (obj != null) {
                        this.mMediaErrorMessage = obj.toString();
                    }
                    if (this.mDecodeStatus != 1) {
                        this.mDecodeStatus = 2;
                        this.mCallback.mo7452a(C8652b.MEDIA_ERROR.ordinal(), this.mMediaErrorMessage);
                        return;
                    }
                    break;
                case DISPLAYED_PLAY:
                    ((C4193l) C4116c.m10249a(C4193l.class)).cacheObj2Obj(this.mCallback, this.mLivePlayController);
                    this.mDecodeStatus = 1;
                    this.mAudioFocusController.mo10925a(this.mContext);
                    this.mCallback.mo7456k();
                    return;
                case STOP_WHEN_PLAYING_OTHER:
                    this.mStopOnPlayingOther = true;
                    this.mAudioFocusController.mo10930b(this.mContext);
                    return;
                case STOP_WHEN_JOIN_INTERACT:
                    this.mStopOnPlayingOther = true;
                    return;
                case INTERACT_SEI:
                    this.mCallback.mo7454a(obj);
                    return;
                case BUFFERING_START:
                    this.mCallback.mo7457l();
                    return;
                case BUFFERING_END:
                    this.mCallback.mo7458m();
                    return;
                case VIDEO_SIZE_CHANGED:
                    int parseInt = Integer.parseInt((String) obj);
                    this.mCallback.mo7451a(MASK & parseInt, parseInt >> 16);
                    break;
            }
        }
    }

    public RoomPlayer(String str, C8710m mVar, C8726a aVar, TextureView textureView, C2832a aVar2, Context context, String str2) {
        this.mStreamUrl = str;
        this.mSrConfig = aVar;
        this.mStreamType = mVar;
        this.mTextureView = textureView;
        this.mCallback = aVar2;
        this.mContext = context;
        this.sdkParams = str2;
    }

    public RoomPlayer(String str, String str2, C8710m mVar, C8726a aVar, TextureView textureView, C2832a aVar2, Context context) {
        this.mPullStreamData = str;
        this.mDefaultResolution = str2;
        this.mSrConfig = aVar;
        this.mStreamType = mVar;
        this.mTextureView = textureView;
        this.mCallback = aVar2;
        this.mContext = context;
    }
}
