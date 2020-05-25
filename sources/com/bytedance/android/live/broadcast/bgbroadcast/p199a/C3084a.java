package com.bytedance.android.live.broadcast.bgbroadcast.p199a;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.android.live.broadcast.api.p196c.C3049b;
import com.bytedance.android.live.broadcast.bgbroadcast.C3082a;
import com.bytedance.android.live.broadcast.p202d.C3161a;
import com.bytedance.android.live.broadcast.p202d.C3164c;
import com.bytedance.android.live.broadcast.p202d.C3165d;
import com.bytedance.android.live.broadcast.p202d.C3166e;
import com.bytedance.android.live.broadcast.p213h.C3430b;
import com.bytedance.android.live.broadcast.p213h.C3441c.C3442a;
import com.bytedance.android.live.broadcast.p213h.p216b.C3439a;
import com.bytedance.android.live.broadcast.p213h.p216b.C3440b;
import com.bytedance.android.live.broadcast.p213h.p217c.C3443a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.C8725y;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.a */
public final class C3084a extends C3082a implements C3049b {

    /* renamed from: g */
    private static final int[][] f9023g = {new int[]{200, 500, 800, 1}, new int[]{200, 800, 1200, 3}};

    /* renamed from: b */
    final Context f9024b;

    /* renamed from: c */
    private final Handler f9025c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private C3048a f9026d;

    /* renamed from: e */
    private final Room f9027e;

    /* renamed from: f */
    private int f9028f = 0;

    /* renamed from: a */
    public final void mo8311a(float f) {
    }

    /* renamed from: d */
    public final void mo8313d() {
    }

    /* renamed from: b */
    public final void mo8384b() {
        if (this.f9026d != null) {
            this.f9026d.mo8302a(false);
        }
    }

    /* renamed from: c */
    public final void mo8385c() {
        if (this.f9026d != null) {
            this.f9026d.mo8302a(true);
        }
    }

    /* renamed from: e */
    public final void mo8314e() {
        this.f9025c.post(new C3085b(this));
    }

    /* renamed from: f */
    public final void mo8315f() {
        this.f9025c.post(new C3086c(this));
    }

    /* renamed from: g */
    public final void mo8386g() {
        if (this.f9026d != null) {
            this.f9026d.mo8305d();
        }
    }

    /* renamed from: a */
    public final boolean mo8382a() {
        if (this.f9026d == null) {
            return false;
        }
        this.f9026d.mo8293a();
        this.f9026d.mo8307f();
        return true;
    }

    /* renamed from: a */
    public final boolean mo8383a(boolean z) {
        if (this.f9027e.getStreamUrl() == null || this.f9027e.getStreamUrl().mo15381a() == null || this.f9026d == null) {
            return false;
        }
        this.f9026d.mo8306e();
        this.f9026d.mo8299a(this.f9027e.getStreamUrl().mo15381a());
        return true;
    }

    /* renamed from: a */
    public final void mo8312a(int i) {
        String str = "";
        int i2 = BaseNotice.HASHTAG;
        int i3 = 1;
        switch (i) {
            case 1:
                str = "stream push failed";
                i3 = 6;
                break;
            case 2:
                i2 = 104;
                str = "enter background timeout";
                break;
            case 3:
                this.f9025c.post(new C3087d(this));
                str = "broadcast error";
                break;
            default:
                i2 = 0;
                break;
        }
        if (i > 0) {
            this.f9025c.post(new C3088e(this));
            C3161a.m8758a(false, i2, str);
            if (this.f9022a != null) {
                this.f9022a.mo8387a(i3);
            }
        }
    }

    /* renamed from: a */
    public final void mo8381a(Intent intent, boolean z) {
        boolean z2;
        String str;
        float f;
        super.mo8381a(intent, z);
        if (this.f9026d == null) {
            C8725y streamUrlExtraSafely = this.f9027e.getStreamUrlExtraSafely();
            int intValue = ((Integer) LiveSettingKeys.STREAM_DEFINITION_LEVEL.mo9431a()).intValue();
            int i = 2;
            int[] iArr = (intValue <= 0 || intValue > f9023g.length) ? new int[]{streamUrlExtraSafely.mo15392c(), streamUrlExtraSafely.mo15393d(), streamUrlExtraSafely.mo15394e(), streamUrlExtraSafely.f23978h} : f9023g[intValue - 1];
            int intValue2 = ((Integer) LiveSettingKeys.STREAM_HARDWARE_ENCODE.mo9431a()).intValue();
            if (intValue2 <= 0) {
                z2 = streamUrlExtraSafely.f23979i;
            } else if (intValue2 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            int b = streamUrlExtraSafely.mo15391b();
            int a = streamUrlExtraSafely.mo15390a();
            if (((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_SIZE.mo9431a()).length == 2) {
                b = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_SIZE.mo9431a())[0].intValue();
                a = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_SIZE.mo9431a())[1].intValue();
            }
            if (((Boolean) LiveConfigSettingKeys.LIVE_GAME_STREAM_PROPORTION_ADAPT.mo9431a()).booleanValue()) {
                float a2 = ((float) streamUrlExtraSafely.mo15390a()) / ((float) streamUrlExtraSafely.mo15391b());
                if (C3922z.m9910c() > C3922z.m9908b()) {
                    f = ((float) C3922z.m9910c()) / ((float) C3922z.m9908b());
                } else {
                    f = ((float) C3922z.m9908b()) / ((float) C3922z.m9910c());
                }
                if (a2 > f) {
                    a = (int) (((float) b) * f);
                } else if (a2 < f) {
                    b = (int) (((float) a) / f);
                }
            }
            int i2 = a;
            int i3 = b;
            if (z) {
                int i4 = i2;
                i2 = i3;
                i3 = i4;
            }
            int i5 = iArr[0];
            int i6 = iArr[1];
            int i7 = iArr[2];
            int i8 = iArr[3];
            if (((Integer) LiveConfigSettingKeys.LIVE_STREAM_PROFILE.mo9431a()).intValue() >= 0) {
                i8 = ((Integer) LiveConfigSettingKeys.LIVE_STREAM_PROFILE.mo9431a()).intValue();
            }
            if (((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.mo9431a()).length == 3) {
                i6 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.mo9431a())[0].intValue();
                i5 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.mo9431a())[1].intValue();
                i7 = ((Integer[]) LiveConfigSettingKeys.LIVE_STREAM_BITRATE.mo9431a())[2].intValue();
            }
            C3442a a3 = new C3442a(this.f9024b).mo8820a(0).mo8821a(i3, i2).mo8836f(i3).mo8837g(i2).mo8832c(i5).mo8830b(i6).mo8834d(i7).mo8838h(i8).mo8835e(streamUrlExtraSafely.mo15395f()).mo8828a(z2);
            if (((Boolean) LiveConfigSettingKeys.LIVE_STREAM_ENABLE_SDK_PARAMS.mo9431a()).booleanValue()) {
                str = this.f9027e.getStreamUrl().f23786n;
            } else {
                str = "";
            }
            C3442a a4 = a3.mo8831b(str).mo8820a(2).mo8827a(((C4139d) C4116c.m10249a(C4139d.class)).getProjectKey()).mo8824a((C3440b) new C3166e()).mo8823a((C3439a) new C3165d()).mo8825a((C3443a) new C3164c());
            a4.f9831L = 1;
            a4.f9847p = intent;
            C3442a j = a4.mo8840j(3);
            if (((Integer) LiveSettingKeys.LIVE_USE_NEW_AUDIO_CODEC.mo9431a()).intValue() != 1) {
                i = 1;
            }
            this.f9026d = new C3430b(j.mo8839i(i).mo8829a());
            this.f9026d.mo8296a((C3049b) this);
        }
    }

    public C3084a(Context context, Room room, MediaProjection mediaProjection) {
        this.f9024b = context;
        this.f9027e = room;
    }
}
