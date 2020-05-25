package com.bytedance.android.livesdk.chatroom.p306bl;

import android.arch.lifecycle.C0199s;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.C4642b;
import com.bytedance.android.livesdk.chatroom.event.C5153a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.gift.effect.p359b.C7328a;
import com.bytedance.android.livesdk.message.model.C7802ah;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C8844a;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.d */
public enum C5007d {
    INSTANCE;
    

    /* renamed from: a */
    Runnable f13414a;

    /* renamed from: b */
    private Queue<C8844a> f13415b;

    /* renamed from: c */
    private C5009a f13416c;

    /* renamed from: d */
    private boolean f13417d;

    /* renamed from: e */
    private boolean f13418e;

    /* renamed from: f */
    private C5153a f13419f;

    /* renamed from: g */
    private Handler f13420g;

    /* renamed from: com.bytedance.android.livesdk.chatroom.bl.d$a */
    public interface C5009a {
        /* renamed from: a */
        void mo10886a(C8844a aVar);
    }

    public final void onMessageFinish() {
        this.f13417d = false;
        m11499a();
    }

    /* renamed from: b */
    private static boolean m11501b() {
        ((Boolean) LiveConfigSettingKeys.GUIDE_DIALOG_PAUSE_ENABLE.mo9431a()).booleanValue();
        return true;
    }

    public final void resume() {
        ((Boolean) LiveConfigSettingKeys.GUIDE_DIALOG_PAUSE_ENABLE.mo9431a()).booleanValue();
    }

    public final void stop() {
        this.f13416c = null;
        this.f13415b = null;
        this.f13418e = false;
        this.f13417d = false;
        if (this.f13420g != null) {
            this.f13420g.removeCallbacksAndMessages(null);
        }
        this.f13420g = null;
        this.f13414a = null;
    }

    /* renamed from: a */
    private void m11499a() {
        if (this.f13415b != null && this.f13415b.size() > 0 && this.f13416c != null && this.f13418e && !this.f13417d) {
            m11501b();
            this.f13417d = true;
            this.f13416c.mo10886a((C8844a) this.f13415b.poll());
        }
    }

    /* renamed from: a */
    static boolean m11500a(Room room) {
        if (room == null) {
            return false;
        }
        long followStatus = room.getOwner().getFollowInfo().getFollowStatus();
        if (followStatus == 1 || followStatus == 2) {
            return true;
        }
        return false;
    }

    public final void add(C8844a aVar) {
        if (this.f13418e && aVar != null && this.f13415b != null) {
            this.f13415b.offer(aVar);
            m11499a();
        }
    }

    public final void start(C5009a aVar) {
        this.f13416c = aVar;
        this.f13415b = new ArrayDeque();
        this.f13418e = true;
        this.f13417d = false;
        C4642b.m11130a().f12688a.observeForever(new C0199s<Boolean>() {
            public final /* synthetic */ void onChanged(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    C5007d.this.resume();
                }
            }
        });
    }

    public final void addFollowGuideMessage(Room room, C8844a aVar) {
        boolean z;
        if (aVar instanceof C7802ah) {
            if (m11500a(room)) {
                if (this.f13420g != null) {
                    this.f13420g.removeCallbacksAndMessages(null);
                }
                this.f13414a = null;
                onMessageFinish();
                return;
            }
            C7802ah ahVar = (C7802ah) aVar;
            if (this.f13418e && this.f13415b != null) {
                if (this.f13420g == null) {
                    this.f13420g = new Handler(Looper.getMainLooper());
                }
                if (this.f13414a == null) {
                    this.f13414a = new C5010e(this, room, ahVar);
                }
                if (this.f13419f == null || this.f13419f.f13813b) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.f13420g.postDelayed(new C5011f(this, room, aVar), 2000);
                } else {
                    this.f13420g.postDelayed(this.f13414a, 500);
                }
            }
        }
    }

    public final void setBigGiftPlayStateEvent(boolean z, boolean z2, C7328a aVar) {
        if (this.f13419f == null) {
            this.f13419f = new C5153a(z, z2, aVar);
        }
        this.f13419f.f13812a = z;
        this.f13419f.f13813b = z2;
        this.f13419f.f13814c = aVar;
    }
}
