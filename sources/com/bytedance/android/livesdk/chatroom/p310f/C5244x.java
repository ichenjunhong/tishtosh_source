package com.bytedance.android.livesdk.chatroom.p310f;

import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a.C8619a;

/* renamed from: com.bytedance.android.livesdk.chatroom.f.x */
public final class C5244x implements C8619a {

    /* renamed from: a */
    public static long f13971a = 10000;

    /* renamed from: b */
    public long f13972b;

    /* renamed from: c */
    public C8618a f13973c = new C8618a(this);

    /* renamed from: d */
    public boolean f13974d;

    /* renamed from: e */
    public boolean f13975e;

    /* renamed from: f */
    private boolean f13976f;

    /* renamed from: g */
    private boolean f13977g = true;

    /* renamed from: a */
    public final void mo11059a() {
        if (this.f13974d && !this.f13975e) {
            this.f13974d = false;
            this.f13976f = true;
            this.f13973c.removeCallbacksAndMessages(null);
            mo11062c();
        }
    }

    /* renamed from: b */
    public final void mo11061b() {
        this.f13974d = false;
        this.f13976f = false;
        this.f13975e = false;
        this.f13977g = true;
        this.f13973c.removeCallbacksAndMessages(null);
    }

    /* renamed from: c */
    public void mo11062c() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f13972b;
        if (!this.f13977g || elapsedRealtime >= 10000) {
            ((C4193l) C4116c.m10249a(C4193l.class)).getLiveWatchTime().onNext(Long.valueOf((elapsedRealtime / 1000) * 1000));
        }
    }

    /* renamed from: a */
    public final void mo11060a(Message message) {
        if (!this.f13976f && message.what == 100) {
            if (this.f13977g) {
                this.f13977g = false;
            }
            ((C4193l) C4116c.m10249a(C4193l.class)).getLiveWatchTime().onNext(Long.valueOf(f13971a));
            this.f13972b = SystemClock.elapsedRealtime();
            this.f13973c.sendEmptyMessageDelayed(100, f13971a);
        }
    }
}
