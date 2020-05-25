package com.bytedance.android.live.broadcast.effect;

import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p385j.p387b.C7705a;

/* renamed from: com.bytedance.android.live.broadcast.effect.a */
public abstract class C3197a {

    /* renamed from: g */
    private static float[] f9264g = {0.0f, 0.3f, 0.43f, 0.57f, 0.7f, 0.8f};

    /* renamed from: a */
    public float f9265a = (((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21201b.f21205a * ((Float) C4525b.f12319O.mo10345a()).floatValue());

    /* renamed from: b */
    public float f9266b = (((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21202c.f21205a * ((Float) C4525b.f12320P.mo10345a()).floatValue());

    /* renamed from: c */
    public float f9267c = (((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21203d.f21205a * ((Float) C4525b.f12321Q.mo10345a()).floatValue());

    /* renamed from: d */
    public float f9268d = (((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21200a.f21205a * ((Float) C4525b.f12318N.mo10345a()).floatValue());

    /* renamed from: e */
    public float f9269e = (((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21204e.f21205a * ((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21204e.f21206b);

    /* renamed from: f */
    public int f9270f = ((Integer) C4525b.f12322R.mo10345a()).intValue();

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract void mo8543e(float f);

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public abstract void mo8544f(float f);

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public abstract void mo8545g(float f);

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public abstract void mo8546h(float f);

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public abstract void mo8547i(float f);

    public C3197a() {
        m8831a();
    }

    /* renamed from: a */
    public static void m8831a() {
        if (((Float) C4525b.f12318N.mo10345a()).floatValue() < 0.0f) {
            C4525b.f12318N.mo10346a(Float.valueOf(((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21200a.f21206b));
        }
        if (((Float) C4525b.f12319O.mo10345a()).floatValue() < 0.0f) {
            C4525b.f12319O.mo10346a(Float.valueOf(((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21201b.f21206b));
        }
        if (((Float) C4525b.f12320P.mo10345a()).floatValue() < 0.0f) {
            C4525b.f12320P.mo10346a(Float.valueOf(((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21202c.f21206b));
        }
        if (((Float) C4525b.f12321Q.mo10345a()).floatValue() < 0.0f) {
            C4525b.f12321Q.mo10346a(Float.valueOf(((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21203d.f21206b));
        }
    }

    /* renamed from: a */
    public final void mo8538a(float f) {
        if (((Float) C4525b.f12319O.mo10345a()).floatValue() != f) {
            C4525b.f12319O.mo10346a(Float.valueOf(f));
            this.f9265a = ((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21201b.f21205a * f;
        }
        mo8543e(this.f9265a);
    }

    /* renamed from: b */
    public final void mo8540b(float f) {
        if (((Float) C4525b.f12320P.mo10345a()).floatValue() != f) {
            C4525b.f12320P.mo10346a(Float.valueOf(f));
            this.f9266b = ((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21202c.f21205a * f;
        }
        mo8544f(this.f9266b);
    }

    /* renamed from: c */
    public final void mo8541c(float f) {
        if (((Float) C4525b.f12321Q.mo10345a()).floatValue() != f) {
            C4525b.f12321Q.mo10346a(Float.valueOf(f));
            this.f9267c = ((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21203d.f21205a * f;
        }
        mo8545g(this.f9267c);
    }

    /* renamed from: d */
    public final void mo8542d(float f) {
        if (((Float) C4525b.f12318N.mo10345a()).floatValue() != f) {
            C4525b.f12318N.mo10346a(Float.valueOf(f));
            this.f9268d = ((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21200a.f21205a * f;
        }
        mo8547i(this.f9268d);
        mo8546h(this.f9269e);
    }

    /* renamed from: a */
    public final void mo8539a(int i) {
        if (((Integer) C4525b.f12322R.mo10345a()).intValue() != i) {
            C4525b.f12322R.mo10346a(Integer.valueOf(i));
            this.f9270f = i;
        }
        mo8543e(f9264g[i]);
        mo8547i(f9264g[1]);
        mo8546h(this.f9269e);
    }
}
