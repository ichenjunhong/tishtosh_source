package com.bytedance.android.livesdk.player;

import android.graphics.Point;
import android.net.Uri;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.player.C8086g.C8087a;
import com.bytedance.android.livesdk.player.C8086g.C8088b;
import com.bytedance.android.livesdk.player.C8086g.C8090d;
import com.bytedance.common.utility.C9431p;
import com.p683ss.p2568f.p2569a.C51334e;
import com.p683ss.p2568f.p2569a.p2571b.C51310d;
import java.io.IOException;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.player.u */
public final class C8111u implements C8086g {

    /* renamed from: e */
    private static final SparseIntArray f22146e;

    /* renamed from: a */
    C51334e f22147a;

    /* renamed from: b */
    C8117y f22148b;

    /* renamed from: c */
    C8087a f22149c;

    /* renamed from: d */
    C8088b f22150d;

    /* renamed from: a */
    public final void mo14244a(int i) {
    }

    /* renamed from: a */
    public final void mo14252a(boolean z, boolean z2, int i) {
    }

    /* renamed from: g */
    public final boolean mo14261g() {
        if (this.f22147a == null || !this.f22147a.mo101910j()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo14262h() {
        if (this.f22147a == null || !this.f22147a.mo101909i()) {
            return false;
        }
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f22146e = sparseIntArray;
        sparseIntArray.put(0, 0);
        f22146e.put(1, 1);
        f22146e.put(2, 2);
        f22146e.put(3, 3);
    }

    /* renamed from: a */
    public final void mo14243a() {
        new StringBuilder("reset: LivePlayer = ").append(this.f22147a);
        this.f22147a.mo101903e();
    }

    /* renamed from: d */
    public final void mo14258d() {
        new StringBuilder("stop: LivePlayer = ").append(this.f22147a);
        this.f22147a.mo101898c();
    }

    /* renamed from: e */
    public final void mo14259e() {
        new StringBuilder("release: LivePlayer = ").append(this.f22147a);
        this.f22147a.mo101907g();
    }

    /* renamed from: f */
    public final void mo14260f() {
        new StringBuilder("releaseAsync: LivePlayer = ").append(this.f22147a);
        this.f22147a.mo101908h();
    }

    /* renamed from: i */
    public final Point mo14263i() {
        return new Point(this.f22147a.mo101911k(), this.f22147a.mo101912l());
    }

    /* renamed from: j */
    public final JSONObject mo14264j() {
        if (this.f22147a != null) {
            return this.f22147a.mo101914n();
        }
        return new JSONObject();
    }

    /* renamed from: b */
    public final void mo14253b() {
        new StringBuilder("prepareAsync: LivePlayer = ").append(this.f22147a);
        this.f22147a.mo101882a(2, 0);
        if (((Boolean) LiveSettingKeys.LIVE_NET_ADAPTIVE_ENABLE.mo9431a()).booleanValue()) {
            this.f22147a.mo101882a(18, 0);
            this.f22147a.mo101881a(19, ((Float) LiveSettingKeys.LIVE_NET_ADAPTIVE_HURRY_SPEED.mo9431a()).floatValue());
            this.f22147a.mo101882a(17, ((Integer) LiveSettingKeys.LIVE_NET_ADAPTIVE_HURRY_TIME.mo9431a()).intValue());
            this.f22147a.mo101881a(20, ((Float) LiveSettingKeys.LIVE_NET_ADAPTIVE_SLOW_SPEED.mo9431a()).floatValue());
            this.f22147a.mo101882a(21, ((Integer) LiveSettingKeys.LIVE_NET_ADAPTIVE_SLOW_TIME.mo9431a()).intValue());
        }
        if (((Integer) LiveSettingKeys.LIVE_HARDWARD_DECODE_H264_ENABLE.mo9431a()).intValue() == 1) {
            this.f22147a.mo101882a(35, 1);
            this.f22147a.mo101882a(33, 1);
            this.f22147a.mo101882a(34, 0);
        }
        if (((Integer) LiveSettingKeys.LIVE_HARDWARD_DECODE_H265_ENABLE.mo9431a()).intValue() == 1) {
            this.f22147a.mo101882a(36, 1);
        }
        if (((Integer) LiveSettingKeys.LIVE_SDK_FAST_OPEN_DISABLE.mo9431a()).intValue() == 1) {
            this.f22147a.mo101882a(40, 0);
        }
        if (((Integer) LiveSettingKeys.LIVE_SDK_NTP_ENABLE.mo9431a()).intValue() == 1) {
            this.f22147a.mo101882a(42, 1);
        }
        this.f22147a.mo101882a(9, 2);
        this.f22147a.mo101895b();
        if (this.f22150d != null) {
            this.f22150d.mo14266e();
        }
    }

    /* renamed from: c */
    public final void mo14256c() {
        new StringBuilder("start: LivePlayer = ").append(this.f22147a);
        if (((Boolean) LiveSettingKeys.LIVE_NET_ADAPTIVE_ENABLE.mo9431a()).booleanValue()) {
            this.f22147a.mo101882a(18, 0);
            this.f22147a.mo101881a(19, ((Float) LiveSettingKeys.LIVE_NET_ADAPTIVE_HURRY_SPEED.mo9431a()).floatValue());
            this.f22147a.mo101882a(17, ((Integer) LiveSettingKeys.LIVE_NET_ADAPTIVE_HURRY_TIME.mo9431a()).intValue());
            this.f22147a.mo101881a(20, ((Float) LiveSettingKeys.LIVE_NET_ADAPTIVE_SLOW_SPEED.mo9431a()).floatValue());
            this.f22147a.mo101882a(21, ((Integer) LiveSettingKeys.LIVE_NET_ADAPTIVE_SLOW_TIME.mo9431a()).intValue());
        }
        if (((Integer) LiveSettingKeys.LIVE_HARDWARD_DECODE_H264_ENABLE.mo9431a()).intValue() == 1) {
            this.f22147a.mo101882a(35, 1);
            this.f22147a.mo101882a(33, 1);
            this.f22147a.mo101882a(34, 0);
        }
        if (((Integer) LiveSettingKeys.LIVE_HARDWARD_DECODE_H265_ENABLE.mo9431a()).intValue() == 1) {
            this.f22147a.mo101882a(36, 1);
        }
        this.f22147a.mo101882a(9, 2);
        this.f22147a.mo101895b();
        if (this.f22150d != null) {
            this.f22150d.mo14266e();
        }
    }

    /* renamed from: a */
    public final void mo14245a(Surface surface) {
        this.f22147a.mo101884a(surface);
    }

    /* renamed from: b */
    public final void mo14254b(String str) {
        this.f22147a.mo101902d(str);
    }

    /* renamed from: c */
    public final void mo14257c(boolean z) {
        this.f22147a.mo101891a(z);
    }

    /* renamed from: a */
    public final void mo14246a(SurfaceHolder surfaceHolder) {
        this.f22147a.mo101885a((SurfaceHolder) null);
    }

    /* renamed from: b */
    public final void mo14255b(boolean z) {
        if (!z && this.f22147a != null) {
            this.f22147a.mo101882a(41, 0);
        }
    }

    public C8111u(C8115x xVar) {
        this.f22147a = xVar.mo14301a();
        this.f22148b = xVar.f22171g;
        if (this.f22149c != null) {
            this.f22148b.f22173a = this.f22149c;
            this.f22149c = null;
        }
    }

    /* renamed from: a */
    public final void mo14248a(String str) {
        this.f22147a.mo101894a(str);
    }

    /* renamed from: a */
    public final void mo14251a(boolean z) {
        this.f22147a.mo101888a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo14247a(C8087a aVar, C8088b bVar) {
        if (this.f22148b != null) {
            this.f22148b.f22173a = aVar;
            this.f22148b.f22174b = bVar;
        } else {
            this.f22149c = aVar;
        }
        this.f22150d = bVar;
    }

    /* renamed from: a */
    public final void mo14249a(String str, String str2) throws IOException {
        new StringBuilder("setDataSource: with pull stream data, LivePlayer = ").append(this.f22147a);
        this.f22147a.mo101896b(str);
        if (!C9431p.m18664a(str2)) {
            this.f22147a.mo101883a(43, str2);
        }
    }

    /* renamed from: a */
    public final void mo14250a(String str, Map<String, String> map, C8090d dVar) throws IOException {
        new StringBuilder("setDataSource: with url, LivePlayer = ").append(this.f22147a);
        if (str.indexOf("://") <= 0) {
            StringBuilder sb = new StringBuilder("file://");
            sb.append(str);
            this.f22147a.mo101899c(Uri.parse(sb.toString()).toString());
            return;
        }
        String str2 = (String) map.get("sdk_params");
        this.f22147a.mo101892a(new C51310d[]{new C51310d(Uri.parse(str).toString(), null, str2)});
    }
}
