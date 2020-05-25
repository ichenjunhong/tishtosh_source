package com.bytedance.android.live.broadcast.bgbroadcast;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.projection.MediaProjection;
import com.bytedance.android.live.broadcast.bgbroadcast.p199a.C3084a;
import com.bytedance.android.live.broadcast.bgbroadcast.p200b.C3109a;
import com.bytedance.android.live.broadcast.p212g.C3398b;
import com.bytedance.android.live.broadcast.p213h.p218d.C3446b;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdkapi.C8601a;
import com.bytedance.android.livesdkapi.C8601a.C8602a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;

public class BgBroadcastServiceImpl extends C8601a {
    private static final String TAG = "BgBroadcastService";
    private static MediaProjection sProjection;
    private C3081a mLiveStatus;
    private Room mRoom;
    private C3398b mStatusReport;
    private C3446b mStatusService;
    private C3082a mStrategy;
    private Service mStub;
    private C8602a mUiListener;

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl$a */
    enum C3081a {
        IDLE,
        LIVING,
        FINISHED
    }

    public static MediaProjection getProjection() {
        return sProjection;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void startAudio() {
        this.mStrategy.mo8384b();
    }

    public void stopAudio() {
        this.mStrategy.mo8385c();
    }

    public void stopService() {
        this.mStub.stopSelf();
    }

    public boolean isLiveFinished() {
        if (this.mLiveStatus == C3081a.FINISHED) {
            return true;
        }
        return false;
    }

    public void onDestroy() {
        if (this.mStatusReport != null) {
            this.mStatusReport.mo8750a();
        }
        stopStream(1, true);
        this.mRoom = null;
        if (C4116c.m10249a(C4193l.class) != null) {
            ((C4193l) C4116c.m10249a(C4193l.class)).setCurrentRoom(null);
        }
        this.mStatusService = null;
        this.mLiveStatus = C3081a.IDLE;
        if (this.mStrategy != null) {
            this.mStrategy.mo8386g();
            this.mStrategy = null;
        }
        this.mUiListener = null;
        sProjection = null;
    }

    public void startBgActivity() {
        if (this.mStub != null) {
            Intent intent = new Intent(this.mStub, ((IHostApp) C4116c.m10249a(IHostApp.class)).getHostActivity(6));
            intent.addFlags(268435456);
            C3922z.m9915e().startActivity(intent);
        }
    }

    public void onCreate() {
        if (C4116c.m10249a(C4193l.class) == null) {
            this.mStub.stopSelf();
            return;
        }
        this.mRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (!Room.isValid(this.mRoom)) {
            this.mStub.stopSelf();
            return;
        }
        this.mStatusReport = new C3398b(this.mRoom);
        this.mStatusReport.f9698a = new C3131l(this);
        this.mStatusService = new C3446b(this.mStatusReport);
        this.mLiveStatus = C3081a.IDLE;
        if (this.mRoom.isScreenshot) {
            this.mStrategy = new C3084a(this.mStub, this.mRoom, sProjection);
            sProjection = null;
        } else {
            this.mStrategy = new C3109a();
        }
        this.mStrategy.f9022a = new C3132m(this);
    }

    public static void setProjection(MediaProjection mediaProjection) {
        sProjection = mediaProjection;
    }

    public void bindService(Service service) {
        this.mStub = service;
    }

    public void setLiveStatusListener(C8602a aVar) {
        this.mUiListener = aVar;
    }

    public void unBindService(Service service) {
        this.mStub = null;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$onCreate$1$BgBroadcastServiceImpl(int i) {
        stopStream(i, false);
    }

    public void stopStream(int i) {
        stopStream(i, false);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$onCreate$0$BgBroadcastServiceImpl(int i) {
        if (i == 30001 || i == 50002 || i == 30003) {
            stopStream(1, false);
            if (this.mUiListener != null) {
                this.mUiListener.mo8469a();
            }
        }
    }

    public boolean startStream(boolean z) {
        if (this.mLiveStatus == C3081a.LIVING) {
            return true;
        }
        if (this.mStrategy == null || !this.mStrategy.mo8383a(z)) {
            return false;
        }
        this.mStatusService.mo8841a();
        this.mLiveStatus = C3081a.LIVING;
        return true;
    }

    public void setData(Intent intent, boolean z) {
        super.setData(intent, z);
        this.mStrategy.mo8381a(intent, z);
    }

    private void stopStream(int i, boolean z) {
        if (this.mLiveStatus == C3081a.LIVING) {
            this.mStrategy.mo8382a();
            this.mStatusService.mo8842a(i);
            this.mLiveStatus = C3081a.FINISHED;
        }
    }
}
