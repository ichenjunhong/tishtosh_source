package com.bytedance.android.livesdk.player;

import android.graphics.Point;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.player.C8086g.C8087a;
import com.bytedance.android.livesdk.player.C8086g.C8088b;
import com.bytedance.android.livesdk.player.C8086g.C8089c;
import com.bytedance.android.livesdk.player.C8086g.C8090d;
import com.bytedance.android.livesdk.player.p404a.C8074a;
import com.bytedance.android.livesdk.player.p404a.C8075b;
import com.bytedance.android.livesdk.player.p404a.C8076c;
import com.bytedance.common.utility.C9431p;
import com.p683ss.p2568f.p2569a.C51334e;
import com.p683ss.p2568f.p2569a.p2571b.C51310d;
import com.p683ss.p2568f.p2569a.p2573d.C51333c;
import java.io.IOException;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.player.v */
public final class C8112v implements Callback, C8086g {

    /* renamed from: e */
    private static final SparseIntArray f22151e;

    /* renamed from: a */
    C51334e f22152a;

    /* renamed from: b */
    C8117y f22153b;

    /* renamed from: c */
    C8087a f22154c;

    /* renamed from: d */
    public Handler f22155d = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private C8088b f22156f;

    /* renamed from: g */
    private Handler f22157g;

    /* renamed from: h */
    private HandlerThread f22158h = new HandlerThread("single-live-player-thread", 10);

    /* renamed from: i */
    private C8087a f22159i = new C8087a() {
        /* renamed from: a */
        public final void mo14265a(C8089c cVar, int i, String str) {
            C8112v.this.f22155d.post(new C8114w(this, cVar, i, str));
        }
    };

    /* renamed from: a */
    public final void mo14250a(String str, Map<String, String> map, C8090d dVar) throws IOException {
        m16153a(m16152a(2, (Object) new C8075b(str, map, dVar)));
    }

    /* renamed from: a */
    public final void mo14249a(String str, String str2) throws IOException {
        m16153a(m16152a(1, (Object) new C8074a(str, str2)));
    }

    /* renamed from: a */
    public final void mo14251a(boolean z) {
        m16153a(m16152a(7, (Object) Boolean.valueOf(z)));
    }

    /* renamed from: a */
    public final void mo14252a(boolean z, boolean z2, int i) {
        m16153a(m16152a(16, (Object) new C8076c(z, z2, i)));
    }

    /* renamed from: k */
    private void m16155k() {
        if (this.f22158h != null) {
            this.f22158h.quit();
            this.f22158h.interrupt();
        }
    }

    /* renamed from: b */
    public final void mo14253b() {
        m16153a(m16152a(4, (Object) null));
    }

    /* renamed from: c */
    public final void mo14256c() {
        m16153a(m16152a(3, (Object) null));
    }

    /* renamed from: d */
    public final void mo14258d() {
        m16153a(m16152a(12, (Object) null));
    }

    /* renamed from: e */
    public final void mo14259e() {
        m16153a(m16152a(13, (Object) null));
    }

    /* renamed from: f */
    public final void mo14260f() {
        m16153a(m16152a(14, (Object) null));
    }

    /* renamed from: g */
    public final boolean mo14261g() {
        if (this.f22152a == null || !this.f22152a.mo101910j()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo14262h() {
        if (this.f22152a == null || !this.f22152a.mo101909i()) {
            return false;
        }
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f22151e = sparseIntArray;
        sparseIntArray.put(0, 0);
        f22151e.put(1, 1);
        f22151e.put(2, 2);
        f22151e.put(3, 3);
    }

    /* renamed from: a */
    public final void mo14243a() {
        m16153a(m16152a(15, (Object) null));
    }

    /* renamed from: i */
    public final Point mo14263i() {
        if (this.f22152a != null) {
            return new Point(this.f22152a.mo101911k(), this.f22152a.mo101912l());
        }
        return new Point(0, 0);
    }

    /* renamed from: j */
    public final JSONObject mo14264j() {
        if (this.f22152a != null) {
            return this.f22152a.mo101914n();
        }
        return new JSONObject();
    }

    /* renamed from: a */
    private void m16153a(Message message) {
        m16154a(message, 0);
    }

    /* renamed from: b */
    public final void mo14254b(String str) {
        m16153a(m16152a(20, (Object) str));
    }

    /* renamed from: c */
    public final void mo14257c(boolean z) {
        m16153a(m16152a(19, (Object) Boolean.valueOf(z)));
    }

    public C8112v(C8115x xVar) {
        this.f22158h.start();
        this.f22157g = new Handler(this.f22158h.getLooper(), this);
        m16153a(m16152a(18, (Object) xVar));
    }

    /* renamed from: b */
    public final void mo14255b(boolean z) {
        m16153a(m16152a(9, (Object) Boolean.valueOf(z)));
    }

    /* renamed from: a */
    public final void mo14244a(int i) {
        m16153a(m16152a(17, (Object) Integer.valueOf(i)));
    }

    /* renamed from: a */
    public final void mo14245a(Surface surface) {
        m16153a(m16152a(5, (Object) surface));
    }

    /* renamed from: a */
    public final void mo14246a(SurfaceHolder surfaceHolder) {
        m16153a(m16152a(6, (Object) null));
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                C8074a aVar = (C8074a) message.obj;
                String str = aVar.f22055a;
                String str2 = aVar.f22056b;
                this.f22152a.mo101896b(str);
                if (!C9431p.m18664a(str2)) {
                    this.f22152a.mo101883a(43, str2);
                    break;
                }
                break;
            case 2:
                C8075b bVar = (C8075b) message.obj;
                String str3 = bVar.f22057a;
                Map<String, String> map = bVar.f22058b;
                C8090d dVar = bVar.f22059c;
                if (str3.indexOf("://") > 0) {
                    Uri parse = Uri.parse(str3);
                    String str4 = "";
                    if (map != null) {
                        str4 = (String) map.get("sdk_params");
                    }
                    this.f22152a.mo101892a(new C51310d[]{new C51310d(parse.toString(), null, str4)});
                    break;
                } else {
                    StringBuilder sb = new StringBuilder("file://");
                    sb.append(str3);
                    this.f22152a.mo101899c(Uri.parse(sb.toString()).toString());
                    break;
                }
            case 3:
                if (((Boolean) LiveSettingKeys.LIVE_NET_ADAPTIVE_ENABLE.mo9431a()).booleanValue()) {
                    this.f22152a.mo101882a(18, 0);
                    this.f22152a.mo101881a(19, ((Float) LiveSettingKeys.LIVE_NET_ADAPTIVE_HURRY_SPEED.mo9431a()).floatValue());
                    this.f22152a.mo101882a(17, ((Integer) LiveSettingKeys.LIVE_NET_ADAPTIVE_HURRY_TIME.mo9431a()).intValue());
                    this.f22152a.mo101881a(20, ((Float) LiveSettingKeys.LIVE_NET_ADAPTIVE_SLOW_SPEED.mo9431a()).floatValue());
                    this.f22152a.mo101882a(21, ((Integer) LiveSettingKeys.LIVE_NET_ADAPTIVE_SLOW_TIME.mo9431a()).intValue());
                }
                if (((Integer) LiveSettingKeys.LIVE_HARDWARD_DECODE_H264_ENABLE.mo9431a()).intValue() == 1) {
                    this.f22152a.mo101882a(35, 1);
                    this.f22152a.mo101882a(33, 1);
                    this.f22152a.mo101882a(34, 0);
                }
                if (((Integer) LiveSettingKeys.LIVE_HARDWARD_DECODE_H265_ENABLE.mo9431a()).intValue() == 1) {
                    this.f22152a.mo101882a(36, 1);
                }
                this.f22152a.mo101882a(9, 2);
                this.f22152a.mo101895b();
                if (this.f22156f != null) {
                    this.f22156f.mo14266e();
                    break;
                }
                break;
            case 4:
                this.f22152a.mo101882a(2, 0);
                if (((Boolean) LiveSettingKeys.LIVE_NET_ADAPTIVE_ENABLE.mo9431a()).booleanValue()) {
                    this.f22152a.mo101882a(18, 0);
                    this.f22152a.mo101881a(19, ((Float) LiveSettingKeys.LIVE_NET_ADAPTIVE_HURRY_SPEED.mo9431a()).floatValue());
                    this.f22152a.mo101882a(17, ((Integer) LiveSettingKeys.LIVE_NET_ADAPTIVE_HURRY_TIME.mo9431a()).intValue());
                    this.f22152a.mo101881a(20, ((Float) LiveSettingKeys.LIVE_NET_ADAPTIVE_SLOW_SPEED.mo9431a()).floatValue());
                    this.f22152a.mo101882a(21, ((Integer) LiveSettingKeys.LIVE_NET_ADAPTIVE_SLOW_TIME.mo9431a()).intValue());
                }
                if (((Integer) LiveSettingKeys.LIVE_HARDWARD_DECODE_H264_ENABLE.mo9431a()).intValue() == 1) {
                    this.f22152a.mo101882a(35, 1);
                    this.f22152a.mo101882a(33, 1);
                    this.f22152a.mo101882a(34, 0);
                }
                if (((Integer) LiveSettingKeys.LIVE_HARDWARD_DECODE_H265_ENABLE.mo9431a()).intValue() == 1) {
                    this.f22152a.mo101882a(36, 1);
                }
                if (((Integer) LiveSettingKeys.LIVE_SDK_FAST_OPEN_DISABLE.mo9431a()).intValue() == 1) {
                    this.f22152a.mo101882a(40, 0);
                }
                if (((Integer) LiveSettingKeys.LIVE_SDK_NTP_ENABLE.mo9431a()).intValue() == 1) {
                    this.f22152a.mo101882a(42, 1);
                }
                this.f22152a.mo101882a(9, 2);
                this.f22152a.mo101895b();
                if (this.f22156f != null) {
                    this.f22156f.mo14266e();
                    break;
                }
                break;
            case 5:
                this.f22152a.mo101884a((Surface) message.obj);
                break;
            case 6:
                this.f22152a.mo101885a((SurfaceHolder) message.obj);
                break;
            case 7:
                this.f22152a.mo101888a(Boolean.valueOf(((Boolean) message.obj).booleanValue()));
                break;
            case 8:
                float floatValue = ((Float) message.obj).floatValue();
                C51333c cVar = this.f22152a.f128357f;
                if (cVar.f128276b != null) {
                    AudioManager audioManager = (AudioManager) cVar.f128275a.getSystemService("audio");
                    if (audioManager != null) {
                        audioManager.setStreamVolume(3, (int) floatValue, 0);
                        break;
                    }
                }
                break;
            case 9:
                if (!((Boolean) message.obj).booleanValue() && this.f22152a != null) {
                    this.f22152a.mo101882a(41, 0);
                    break;
                }
            case 10:
                this.f22152a.mo101894a((String) message.obj);
                break;
            case 11:
                C51334e eVar = this.f22152a;
                eVar.mo101906f("pause");
                if (eVar.f128359h != null && eVar.f128359h.isPlaying()) {
                    eVar.f128359h.pause();
                    break;
                }
            case 12:
                this.f22152a.mo101898c();
                break;
            case 13:
                this.f22152a.mo101907g();
                m16155k();
                break;
            case 14:
                this.f22152a.mo101908h();
                m16155k();
                break;
            case 15:
                this.f22152a.mo101903e();
                break;
            case 16:
                Object obj = message.obj;
                break;
            case 17:
                ((Integer) message.obj).intValue();
                break;
            case 18:
                C8115x xVar = (C8115x) message.obj;
                this.f22152a = xVar.mo14301a();
                this.f22153b = xVar.f22171g;
                this.f22153b.f22173a = this.f22159i;
                this.f22152a.mo101882a(44, 0);
                break;
            case 19:
                this.f22152a.mo101891a(((Boolean) message.obj).booleanValue());
                break;
            case 20:
                this.f22152a.mo101902d((String) message.obj);
                break;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo14248a(String str) {
        m16153a(m16152a(10, (Object) str));
    }

    /* renamed from: a */
    private static Message m16152a(int i, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = obj;
        return obtain;
    }

    /* renamed from: a */
    private void m16154a(Message message, long j) {
        if (this.f22158h != null && this.f22158h.isAlive() && !this.f22158h.isInterrupted()) {
            if (this.f22157g == null) {
                this.f22157g = new Handler(this.f22158h.getLooper(), this);
            }
            this.f22157g.sendMessageDelayed(message, 0);
        }
    }

    /* renamed from: a */
    public final void mo14247a(C8087a aVar, C8088b bVar) {
        this.f22154c = aVar;
        if (this.f22153b != null) {
            this.f22153b.f22174b = bVar;
        }
        this.f22156f = bVar;
    }
}
