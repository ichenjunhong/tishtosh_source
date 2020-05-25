package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4189h;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8653c;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8654d;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8656e;
import com.bytedance.android.p160b.C2831a.C2832a;
import com.bytedance.android.p160b.C2833b;
import com.bytedance.android.p160b.C2833b.C2834a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomPlayer2 implements C2833b {
    private static final int MASK = 65535;
    private static final int OFFSET = 16;
    private static final String TAG = "RoomPlayer";
    public boolean isBackground;
    public C5058a mAudioFocusController;
    private WeakReference<C2832a> mCallbackRef;
    private C2834a mConfig;
    public int mDecodeStatus;
    public boolean mHasAttached = false;
    private boolean mHasWarmedUp = false;
    public C4189h mLivePlayController;
    private Handler mMainHandler = new Handler(Looper.getMainLooper());
    public String mMediaErrorMessage;
    public List<C5057a> mPendingCallbacks = new ArrayList();
    private Runnable mPendingMessageRunnable = new Runnable() {
        public final void run() {
            if (RoomPlayer2.this.mPendingCallbacks != null && RoomPlayer2.this.mPendingCallbacks.size() > 0) {
                for (C5057a aVar : RoomPlayer2.this.mPendingCallbacks) {
                    RoomPlayer2.this.mPlayMessageListener.mo10922a(aVar.f13529a, aVar.f13530b);
                }
                RoomPlayer2.this.mPendingCallbacks.clear();
            }
        }
    };
    public C8653c mPlayMessageListener = new C8656e() {
        /* renamed from: a */
        public final void mo10921a() {
            RoomPlayer2.this.playerStartTime = System.currentTimeMillis();
        }

        /* renamed from: b */
        public final void mo10923b() {
            RoomPlayer2.this.playerFirstFrameTime = System.currentTimeMillis();
        }

        /* renamed from: a */
        public final void mo10922a(C8652b bVar, Object obj) {
            if (RoomPlayer2.this.mAudioFocusController != null && RoomPlayer2.this.mLivePlayController != null) {
                C2832a callback = RoomPlayer2.this.getCallback();
                if (callback == null) {
                    if (!RoomPlayer2.this.mHasAttached) {
                        RoomPlayer2.this.mPendingCallbacks.add(new C5057a(bVar, obj));
                    }
                    return;
                }
                switch (C50563.f13528a[bVar.ordinal()]) {
                    case 1:
                        callback.mo7455j();
                        return;
                    case 2:
                        callback.mo7455j();
                        if (obj != null) {
                            RoomPlayer2.this.mMediaErrorMessage = obj.toString();
                        }
                        if (RoomPlayer2.this.mDecodeStatus != 1) {
                            RoomPlayer2.this.mDecodeStatus = 2;
                            callback.mo7452a(C8652b.MEDIA_ERROR.ordinal(), RoomPlayer2.this.mMediaErrorMessage);
                            return;
                        }
                        break;
                    case 3:
                        ((C4193l) C4116c.m10249a(C4193l.class)).cacheObj2Obj(callback, RoomPlayer2.this.mLivePlayController);
                        RoomPlayer2.this.mDecodeStatus = 1;
                        if (!RoomPlayer2.this.isBackground) {
                            RoomPlayer2.this.mAudioFocusController.mo10926a(RoomPlayer2.this.getTagContext(), RoomPlayer2.this.mPlayerTag);
                        }
                        callback.mo7456k();
                        return;
                    case 4:
                        RoomPlayer2.this.mStopOnPlayingOther = true;
                        RoomPlayer2.this.mAudioFocusController.mo10927a(RoomPlayer2.this.mPlayerTag);
                        return;
                    case 5:
                        RoomPlayer2.this.mStopOnPlayingOther = true;
                        return;
                    case 6:
                        callback.mo7454a(obj);
                        return;
                    case 7:
                        callback.mo7457l();
                        return;
                    case 8:
                        callback.mo7458m();
                        return;
                    case 9:
                        int parseInt = Integer.parseInt((String) obj);
                        callback.mo7451a(RoomPlayer2.MASK & parseInt, parseInt >> 16);
                        return;
                    case 10:
                        callback.mo7459n();
                        break;
                }
            }
        }
    };
    public String mPlayerTag;
    public boolean mStopOnPlayingOther;
    private WeakReference<Context> mTagContextRef;
    private WeakReference<TextureView> mTextureViewRef;
    public long playerFirstFrameTime;
    public long playerStartTime;
    private long roomId;
    private long startTime;

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2$3 */
    static /* synthetic */ class C50563 {

        /* renamed from: a */
        static final /* synthetic */ int[] f13528a = new int[C8652b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.bytedance.android.livesdkapi.depend.live.h$b[] r0 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13528a = r0
                int[] r0 = f13528a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.android.livesdkapi.depend.live.h$b r1 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.COMPLETE_PLAY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f13528a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.android.livesdkapi.depend.live.h$b r1 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.MEDIA_ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f13528a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.android.livesdkapi.depend.live.h$b r1 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.DISPLAYED_PLAY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f13528a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bytedance.android.livesdkapi.depend.live.h$b r1 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.STOP_WHEN_PLAYING_OTHER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f13528a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.bytedance.android.livesdkapi.depend.live.h$b r1 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.STOP_WHEN_JOIN_INTERACT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f13528a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.bytedance.android.livesdkapi.depend.live.h$b r1 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.INTERACT_SEI     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f13528a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.bytedance.android.livesdkapi.depend.live.h$b r1 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.BUFFERING_START     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f13528a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.bytedance.android.livesdkapi.depend.live.h$b r1 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.BUFFERING_END     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f13528a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.bytedance.android.livesdkapi.depend.live.h$b r1 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.VIDEO_SIZE_CHANGED     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f13528a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.bytedance.android.livesdkapi.depend.live.h$b r1 = com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b.PLAYER_DETACHED     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2.C50563.<clinit>():void");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2$a */
    static class C5057a {

        /* renamed from: a */
        C8652b f13529a;

        /* renamed from: b */
        Object f13530b;

        C5057a(C8652b bVar, Object obj) {
            this.f13529a = bVar;
            this.f13530b = obj;
        }
    }

    public int getDecodeStatus() {
        return this.mDecodeStatus;
    }

    public String getMediaErrorMessage() {
        return this.mMediaErrorMessage;
    }

    public long getPlayerFirstFrameTime() {
        return this.playerFirstFrameTime;
    }

    public long getPlayerStartTime() {
        return this.playerStartTime;
    }

    public String getPlayerTag() {
        return this.mPlayerTag;
    }

    public long getRoomId() {
        return this.roomId;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public boolean hasWarmedUp() {
        return this.mHasWarmedUp;
    }

    public void setSeiOpen(boolean z) {
    }

    public void recycle() {
        C5078l.m11603a().mo10973a((C2833b) this);
    }

    public boolean warmUp() {
        this.mHasWarmedUp = true;
        return start();
    }

    private TextureView getTextureView() {
        if (this.mTextureViewRef == null) {
            return null;
        }
        return (TextureView) this.mTextureViewRef.get();
    }

    public long getAudioLostFocusTime() {
        if (this.mAudioFocusController == null) {
            return -1;
        }
        return this.mAudioFocusController.f13533c;
    }

    public C2832a getCallback() {
        if (this.mCallbackRef == null) {
            return null;
        }
        return (C2832a) this.mCallbackRef.get();
    }

    public Context getTagContext() {
        if (this.mTagContextRef == null) {
            return null;
        }
        return (Context) this.mTagContextRef.get();
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

    public boolean tryResumePlay() {
        if (!this.mStopOnPlayingOther) {
            return false;
        }
        this.mStopOnPlayingOther = false;
        return doStart();
    }

    public void onForeground() {
        this.isBackground = false;
        if (this.mAudioFocusController != null) {
            this.mAudioFocusController.mo10928a(false);
            this.mAudioFocusController.mo10926a(getTagContext(), this.mPlayerTag);
        }
    }

    private boolean doStart() {
        boolean z;
        boolean z2;
        if (this.mConfig.f8444i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.startTime = System.currentTimeMillis();
            this.playerStartTime = 0;
            this.playerFirstFrameTime = 0;
            this.isBackground = false;
            doStartPlayByMultiPullStreamData();
        } else {
            if (this.mConfig.f8444i == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            this.startTime = System.currentTimeMillis();
            this.playerStartTime = 0;
            this.playerFirstFrameTime = 0;
            this.isBackground = false;
            doStartPlayByStreamUrl();
        }
        return true;
    }

    public boolean startWithNewLivePlayer() {
        boolean z;
        if (this.mLivePlayController != null) {
            return true;
        }
        if (this.mConfig.f8444i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        this.mLivePlayController = ((C4139d) C4116c.m10249a(C4139d.class)).getLivePlayController();
        this.mLivePlayController.mo14279g();
        this.mLivePlayController.mo9624c(true);
        this.mAudioFocusController = new C5058a(this.mLivePlayController);
        return doStart();
    }

    private void doStartPlayByMultiPullStreamData() {
        if (this.mConfig != null) {
            C8654d dVar = null;
            try {
                if (this.mConfig.f8442g != null) {
                    dVar = C8654d.m17099a().mo15123a(this.mConfig.f8442g.f23992a).mo15125b(this.mConfig.f8442g.f23993b).mo15122a(this.mConfig.f8442g.f23994c).mo15124a();
                }
                this.mLivePlayController.mo9612a(this.mConfig.f8437b, this.mConfig.f8438c, getTextureView(), this.mConfig.f8441f.ordinal(), dVar, this.mPlayMessageListener, this.mPlayerTag);
            } catch (Exception e) {
                C2832a callback = getCallback();
                if (callback != null) {
                    callback.mo7453a(e);
                }
            }
        }
    }

    private void doStartPlayByStreamUrl() {
        if (this.mConfig != null) {
            C8654d dVar = null;
            try {
                if (this.mConfig.f8442g != null) {
                    dVar = C8654d.m17099a().mo15123a(this.mConfig.f8442g.f23992a).mo15125b(this.mConfig.f8442g.f23993b).mo15122a(this.mConfig.f8442g.f23994c).mo15124a();
                }
                this.mLivePlayController.mo9611a(this.mConfig.f8439d, getTextureView(), this.mConfig.f8441f.ordinal(), dVar, this.mPlayMessageListener, this.mConfig.f8440e, this.mPlayerTag);
            } catch (Exception e) {
                C2832a callback = getCallback();
                if (callback != null) {
                    callback.mo7453a(e);
                }
            }
        }
    }

    public void release() {
        this.mAudioFocusController = null;
        this.mLivePlayController = null;
        this.mDecodeStatus = 0;
        this.mMediaErrorMessage = null;
        this.mStopOnPlayingOther = false;
        this.isBackground = false;
        this.mPendingCallbacks.clear();
        this.mHasAttached = false;
        this.mHasWarmedUp = false;
        this.startTime = 0;
        this.playerStartTime = 0;
        this.playerFirstFrameTime = 0;
        this.mPlayerTag = null;
        this.roomId = 0;
        this.mConfig = null;
        if (this.mTagContextRef != null) {
            this.mTagContextRef.clear();
            this.mTagContextRef = null;
        }
        if (this.mCallbackRef != null) {
            this.mCallbackRef.clear();
            this.mCallbackRef = null;
        }
        if (this.mTextureViewRef != null) {
            this.mTextureViewRef.clear();
            this.mTextureViewRef = null;
        }
    }

    public boolean start() {
        if (this.mConfig == null || this.mLivePlayController != null) {
            return true;
        }
        this.mLivePlayController = ((C4139d) C4116c.m10249a(C4139d.class)).getLivePlayController();
        this.mLivePlayController.mo9624c(this.mConfig.f8443h);
        if (this.mHasWarmedUp) {
            HashMap hashMap = new HashMap();
            hashMap.put("has_warmed_up", "1");
            this.mLivePlayController.mo9613a((Map<String, String>) hashMap);
        }
        this.mAudioFocusController = new C5058a(this.mLivePlayController);
        return doStart();
    }

    public void setAnchorInteractMode(boolean z) {
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo9615a(z);
        }
    }

    public void setMute(boolean z) {
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo9616a(z, this.mPlayerTag);
        }
    }

    public void setScreenOrientation(boolean z) {
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo9621b(z);
        }
    }

    public void stopWhenJoinInteract(Context context) {
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo9626d(this.mPlayerTag);
        }
    }

    public void stopWhenPlayingOther(Context context) {
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo9620b(this.mPlayerTag);
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
        if (this.mPlayerTag != null) {
            if (this.mAudioFocusController != null) {
                if (z) {
                    this.mAudioFocusController.mo10927a(this.mPlayerTag);
                } else {
                    this.mAudioFocusController.mo10924a();
                }
                this.mAudioFocusController = null;
            }
            if (this.mLivePlayController != null) {
                this.mLivePlayController.mo9623c(this.mPlayerTag);
                if (z) {
                    this.mLivePlayController.mo9610a(this.mPlayerTag);
                }
                this.mLivePlayController = null;
            }
            this.mDecodeStatus = 0;
            this.mMediaErrorMessage = null;
            this.mStopOnPlayingOther = false;
            this.mMainHandler.removeCallbacks(this.mPendingMessageRunnable);
        }
    }

    RoomPlayer2(long j, C2834a aVar) {
        initialize(j, aVar);
    }

    public void initialize(long j, C2834a aVar) {
        this.roomId = j;
        this.mConfig = aVar;
        StringBuilder sb = new StringBuilder();
        sb.append(this.roomId);
        sb.append("_");
        sb.append(SystemClock.uptimeMillis());
        this.mPlayerTag = sb.toString();
    }

    public void attach(Context context, TextureView textureView, C2832a aVar) {
        this.mTagContextRef = new WeakReference<>(context);
        this.mCallbackRef = new WeakReference<>(aVar);
        this.mTextureViewRef = new WeakReference<>(textureView);
        if (this.mLivePlayController != null) {
            this.mLivePlayController.mo9609a(textureView, this.mPlayerTag);
        }
        if (this.mAudioFocusController != null) {
            this.mAudioFocusController.mo10926a(context, this.mPlayerTag);
        }
        this.mHasAttached = true;
        if (aVar != null) {
            this.mMainHandler.post(this.mPendingMessageRunnable);
        }
    }
}
