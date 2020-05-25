package com.p683ss.android.ugc.aweme.sticker.types.game;

import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p683ss.android.ugc.aweme.base.p1417h.C23536a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.C44518a;
import com.p683ss.android.ugc.aweme.sticker.types.game.p2329a.C46550a;
import com.p683ss.android.ugc.aweme.sticker.types.game.p2329a.C46551b;
import com.p683ss.android.ugc.aweme.sticker.viewmodel.EffectStickerViewModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.view.p2508a.C50206a;
import com.p683ss.android.ugc.tools.view.p2508a.C50207b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.game.b */
public final class C46552b implements C46562k {

    /* renamed from: a */
    ASCameraView f117446a;

    /* renamed from: b */
    public Effect f117447b;

    /* renamed from: c */
    public boolean f117448c;

    /* renamed from: d */
    boolean f117449d;

    /* renamed from: e */
    boolean f117450e;

    /* renamed from: f */
    private C46550a f117451f;

    /* renamed from: g */
    private C46563l f117452g;

    /* renamed from: h */
    private AppCompatActivity f117453h;

    /* renamed from: i */
    private int f117454i;

    /* renamed from: j */
    private long f117455j;

    /* renamed from: k */
    private C46560i f117456k;

    /* renamed from: l */
    private C46561j f117457l;

    /* renamed from: m */
    private C50207b f117458m;

    /* renamed from: n */
    private C50206a f117459n = new C46554c(this);

    /* renamed from: b */
    public final void mo93351b() {
        this.f117448c = false;
    }

    /* renamed from: d */
    public final boolean mo93353d() {
        return this.f117449d;
    }

    /* renamed from: e */
    public final void mo93354e() {
        this.f117458m.mo94978b(this.f117459n);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo93357h() {
        return C44518a.m97421e(this.f117447b);
    }

    /* renamed from: g */
    public final ShortVideoContext mo93356g() {
        return ((EffectStickerViewModel) C0214z.m440a((FragmentActivity) this.f117453h).mo359a(EffectStickerViewModel.class)).mo93416a().mo91264d();
    }

    /* renamed from: f */
    public final void mo93355f() {
        if (!this.f117450e) {
            this.f117448c = false;
            this.f117457l.mo93343e();
            mo93356g().f107095au = 0;
            if (!mo93357h()) {
                this.f117446a.mo43625a(MessageCenter.MSG_CLIENT_TO_SDK_RESTART_GAME, 0, 0, "");
                mo93356g().f107110c = this.f117455j;
                this.f117452g.mo93360b();
                return;
            }
            this.f117451f.mo93346c(this.f117447b);
        }
    }

    /* renamed from: a */
    public final void mo93349a() {
        if (!this.f117446a.mo43642g()) {
            this.f117457l.mo93338a();
            this.f117448c = true;
            this.f117455j = mo93356g().f107110c;
            ShortVideoContext g = mo93356g();
            if (!mo93357h()) {
                this.f117446a.mo43625a(4097, 0, 0, "");
                g.f107110c = 30000;
            } else {
                g.f107110c = 2147483647L;
            }
            g.f107095au = 1;
            if (g.f107097aw != null) {
                this.f117446a.mo43625a(MessageCenter.MSG_CLIENT_TO_SDK_CHALLENGE_GAME, (long) g.f107097aw.gameScore, 0, "");
            }
            this.f117452g.mo93361c();
            this.f117456k.mo93335a(1);
            this.f117457l.mo93340b();
        }
    }

    /* renamed from: c */
    public final void mo93352c() {
        if (!this.f117450e) {
            this.f117457l.mo93341c();
            this.f117452g.mo93361c();
            this.f117452g.mo93362d();
            this.f117449d = false;
            ((GameResultViewModel) C0214z.m440a((FragmentActivity) this.f117453h).mo359a(GameResultViewModel.class)).f117441a = false;
            this.f117456k.mo93337c();
            if (mo93356g().f107118k.mo86458e() != null) {
                this.f117446a.mo43633b(true);
                this.f117446a.mo43637d(false);
                this.f117446a.setMusicPath(mo93356g().f107118k.mo86458e().getPath());
            } else {
                this.f117446a.mo43633b(false);
                this.f117446a.mo43637d(true);
            }
            this.f117446a.mo43631a(true);
            if (mo93356g().f107097aw != null) {
                this.f117457l.mo93342d();
            } else {
                this.f117451f.mo93345b(this.f117447b);
                if (!mo93357h() && this.f117454i != this.f117456k.mo93334a()) {
                    this.f117456k.mo93336b();
                }
            }
            this.f117447b = null;
        }
    }

    /* renamed from: a */
    public final void mo93350a(Effect effect, String str) {
        int i;
        this.f117447b = effect;
        this.f117451f.mo93344a(effect);
        this.f117449d = true;
        this.f117450e = false;
        ((GameResultViewModel) C0214z.m440a((FragmentActivity) this.f117453h).mo359a(GameResultViewModel.class)).f117441a = true;
        this.f117452g.mo93358a();
        this.f117446a.mo43633b(false);
        this.f117446a.mo43637d(true);
        this.f117446a.mo43631a(false);
        if (!this.f117448c) {
            HashMap hashMap = new HashMap();
            hashMap.put("prop_id", effect.getEffectId());
            hashMap.put("shoot_way", mo93356g().f107132y);
            hashMap.put("creation_id", mo93356g().f107131x);
            C39629l.m88232a().mo58567E().mo49430a("enter_prop_game_page", (Map<String, String>) hashMap);
        }
        if (mo93357h()) {
            if (this.f117447b != null) {
                String str2 = "VideoRecord";
                String effectId = this.f117447b.getEffectId();
                if (C23536a.m57712b(str2, effectId)) {
                    i = 0;
                } else {
                    String a = C23536a.m57710a(str2, effectId);
                    if (C23536a.f62660b.containsKey(a)) {
                        i = ((Integer) C23536a.f62660b.get(a)).intValue();
                    } else {
                        i = C35807d.m80935a(C11010c.m22280a(), str2, 0).getInt(effectId, 0);
                    }
                }
                this.f117446a.mo43625a(46, 1, (long) i, str);
                String str3 = "VideoRecord";
                String effectId2 = this.f117447b.getEffectId();
                int i2 = i + 1;
                C35807d.m80935a(C11010c.m22280a(), str3, 0).edit().putInt(effectId2, i2).apply();
                C23536a.f62660b.put(C23536a.m57710a(str3, effectId2), Integer.valueOf(i2));
            }
            return;
        }
        this.f117454i = this.f117456k.mo93334a();
        if (this.f117454i != 1) {
            this.f117456k.mo93336b();
        }
    }

    public C46552b(AppCompatActivity appCompatActivity, C50207b bVar, ASCameraView aSCameraView, C46563l lVar, C46560i iVar, C46561j jVar, C46550a aVar) {
        this.f117446a = aSCameraView;
        this.f117451f = aVar;
        this.f117453h = appCompatActivity;
        this.f117456k = iVar;
        this.f117457l = jVar;
        this.f117458m = bVar;
        bVar.mo94977a(this.f117459n);
        this.f117452g = lVar;
        lVar.mo93359a(new C46551b() {
            /* renamed from: b */
            public final void mo93348b() {
                if (C46552b.this.f117448c) {
                    C46552b.this.mo93355f();
                } else {
                    C46552b.this.mo93352c();
                }
            }

            /* renamed from: a */
            public final void mo93347a() {
                String str;
                C46552b.this.mo93349a();
                HashMap hashMap = new HashMap();
                String str2 = "prop_id";
                if (C46552b.this.f117447b == null) {
                    str = "";
                } else {
                    str = C46552b.this.f117447b.getEffectId();
                }
                hashMap.put(str2, str);
                hashMap.put("shoot_way", C46552b.this.mo93356g().f107132y);
                hashMap.put("creation_id", C46552b.this.mo93356g().f107131x);
                C39629l.m88232a().mo58567E().mo49430a("click_game_play_button", (Map<String, String>) hashMap);
            }
        });
        ((GameResultViewModel) C0214z.m440a((FragmentActivity) appCompatActivity).mo359a(GameResultViewModel.class)).mo93332a().observe(appCompatActivity, new C46555d(this, jVar));
        ((GameResultViewModel) C0214z.m440a((FragmentActivity) appCompatActivity).mo359a(GameResultViewModel.class)).mo93333b().observe(appCompatActivity, new C46556e(this, lVar));
    }
}
