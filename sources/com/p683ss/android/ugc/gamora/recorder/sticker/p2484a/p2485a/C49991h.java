package com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import com.bef.effectsdk.message.MessageCenter.C2593a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.messagecenter.MessageCenterViewModel;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46340k;
import com.p683ss.android.ugc.aweme.sticker.viewmodel.FaceStickerViewModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import com.p683ss.android.ugc.tools.utils.C50200d;
import dmt.p2652av.video.C52884a;
import java.io.File;
import java.util.concurrent.Callable;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a.h */
public final class C49991h implements C2593a, C46340k {

    /* renamed from: a */
    public final C0198r<Effect> f125260a = new C0198r<>();

    /* renamed from: b */
    private long f125261b;

    /* renamed from: c */
    private final FaceStickerViewModel f125262c;

    /* renamed from: d */
    private final MessageCenterViewModel f125263d;

    /* renamed from: e */
    private final AppCompatActivity f125264e;

    /* renamed from: f */
    private final ShortVideoContext f125265f;

    /* renamed from: g */
    private final C50048n f125266g;

    /* renamed from: h */
    private final C45889c f125267h;

    /* renamed from: i */
    private final C52670a<C52860x> f125268i;

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.a.h$a */
    static final class C49992a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ String f125269a;

        C49992a(String str) {
            this.f125269a = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            try {
                if (!TextUtils.isEmpty(this.f125269a)) {
                    C50200d.m108342a(new File(this.f125269a));
                }
            } catch (Exception unused) {
                C39629l.m88232a().mo58567E().mo49425a("delete failed");
            }
            return null;
        }
    }

    /* renamed from: a */
    private final Effect m107872a() {
        return (Effect) this.f125260a.getValue();
    }

    /* renamed from: a */
    private final void m107873a(Effect effect) {
        String str;
        this.f125260a.setValue(effect);
        String str2 = "sticker_id";
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        C52884a.m112519a(1, str2, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0086, code lost:
        if (r3 == null) goto L_0x0088;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b mo93033a(com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46317c r12, com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46340k.C46341a r13) {
        /*
            r11 = this;
            java.lang.String r0 = "session"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            java.lang.String r0 = "chain"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r11.f125261b = r0
            boolean r0 = r12 instanceof com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0052
            r3 = r12
            com.ss.android.ugc.aweme.sticker.presenter.handler.c.a r3 = (com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a) r3
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r3.f116852a
            r11.m107873a(r4)
            com.ss.android.ugc.aweme.sticker.viewmodel.FaceStickerViewModel r4 = r11.f125262c
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r11.m107872a()
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r5 = com.p683ss.android.ugc.aweme.sticker.p2301k.C46057f.m100055a(r5)
            java.lang.String r6 = "StickerConfig.covert(mCurrentEffect)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.lang.String r6 = "faceStickerBean"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r6)
            android.arch.lifecycle.r<com.ss.android.ugc.aweme.sticker.viewmodel.b> r4 = r4.f117608a
            com.ss.android.ugc.aweme.sticker.viewmodel.c r6 = new com.ss.android.ugc.aweme.sticker.viewmodel.c
            r6.<init>(r5)
            r4.setValue(r6)
            com.ss.android.ugc.aweme.sticker.a.b.a r4 = r3.f116854c
            com.ss.android.ugc.aweme.sticker.a.b.a r5 = com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45815a.MANUAL_SET
            if (r4 == r5) goto L_0x0044
            r3 = 0
            goto L_0x004a
        L_0x0044:
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r3.f116852a
            boolean r3 = com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g.m100102z(r3)
        L_0x004a:
            if (r3 == 0) goto L_0x0078
            d.f.a.a<d.x> r3 = r11.f125268i
            r3.invoke()
            goto L_0x0078
        L_0x0052:
            boolean r3 = r12 instanceof com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46318d
            if (r3 == 0) goto L_0x0078
            r11.m107873a(r1)
            com.ss.android.ugc.aweme.sticker.viewmodel.FaceStickerViewModel r3 = r11.f125262c
            r4 = r12
            com.ss.android.ugc.aweme.sticker.presenter.handler.c.d r4 = (com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46318d) r4
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r4.f116858a
            com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r4 = com.p683ss.android.ugc.aweme.sticker.p2301k.C46057f.m100055a(r4)
            java.lang.String r5 = "StickerConfig.covert(session.sticker)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.String r5 = "faceStickerBean"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r5)
            android.arch.lifecycle.r<com.ss.android.ugc.aweme.sticker.viewmodel.b> r3 = r3.f117608a
            com.ss.android.ugc.aweme.sticker.viewmodel.a r5 = new com.ss.android.ugc.aweme.sticker.viewmodel.a
            r5.<init>(r4)
            r3.setValue(r5)
        L_0x0078:
            com.ss.android.ugc.aweme.sticker.presenter.handler.c.b r13 = r13.mo93036a(r12)
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r11.m107872a()
            if (r3 == 0) goto L_0x0088
            java.lang.String r3 = r3.getEffectId()
            if (r3 != 0) goto L_0x008a
        L_0x0088:
            java.lang.String r3 = ""
        L_0x008a:
            java.lang.Class<com.ss.android.ugc.aweme.services.IFoundationAVService> r4 = com.p683ss.android.ugc.aweme.services.IFoundationAVService.class
            java.lang.Object r4 = com.p683ss.android.ugc.C27991b.m66756a(r4)
            if (r4 == 0) goto L_0x0095
            com.ss.android.ugc.aweme.services.IFoundationAVService r4 = (com.p683ss.android.ugc.aweme.services.IFoundationAVService) r4
            goto L_0x00ae
        L_0x0095:
            java.lang.Class<com.ss.android.ugc.aweme.services.IFoundationAVService> r4 = com.p683ss.android.ugc.aweme.services.IFoundationAVService.class
            com.ss.android.ugc.a.a r4 = com.p683ss.android.ugc.p1235a.C20302a.m50070a(r4)
            com.ss.android.ugc.a.d r5 = new com.ss.android.ugc.a.d
            r5.<init>()
            com.ss.android.ugc.a.a r4 = r4.mo42947a(r5)
            com.ss.android.ugc.a.a r4 = r4.mo42946a()
            java.lang.Object r4 = r4.mo42948b()
            com.ss.android.ugc.aweme.services.IFoundationAVService r4 = (com.p683ss.android.ugc.aweme.services.IFoundationAVService) r4
        L_0x00ae:
            com.ss.android.ugc.aweme.services.IFoundationAVService r4 = (com.p683ss.android.ugc.aweme.services.IFoundationAVService) r4
            android.support.v7.app.AppCompatActivity r5 = r11.f125264e
            android.content.Context r5 = (android.content.Context) r5
            r10 = 1
            r4.setLastStickerId(r5, r3, r10)
            java.lang.String r4 = com.p683ss.android.ugc.aweme.p2345t.C46769b.f118125b
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = r3
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            r4 = r4 ^ r10
            if (r4 == 0) goto L_0x016f
            com.p683ss.android.ugc.aweme.p2345t.C46769b.m101573a()
            if (r0 == 0) goto L_0x016f
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r11.f125265f
            java.lang.String r5 = r0.f107131x
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r11.f125265f
            java.lang.String r6 = r0.f107132y
            com.p683ss.android.ugc.aweme.p2345t.C46769b.f118125b = r3
            com.ss.android.ugc.aweme.t.b$a r0 = new com.ss.android.ugc.aweme.t.b$a
            long r8 = android.os.SystemClock.elapsedRealtime()
            r4 = r0
            r7 = r3
            r4.<init>(r5, r6, r7, r8)
            com.p683ss.android.ugc.aweme.p2345t.C46769b.f118124a = r0
            com.ss.android.ugc.aweme.sticker.presenter.handler.c.a r12 = (com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a) r12
            com.ss.android.ugc.aweme.sticker.a.b.a r12 = r12.f116854c
            com.ss.android.ugc.aweme.sticker.a.b.a r0 = com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45815a.MANUAL_SET
            if (r12 != r0) goto L_0x016f
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r12 = r11.f125265f
            java.lang.String r12 = r12.f107132y
            com.ss.android.ugc.aweme.shortvideo.dh r0 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            java.lang.String r4 = "PublishManager.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            java.util.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r0 = r0.f109287b
            if (r0 == 0) goto L_0x0102
            java.lang.Object r0 = p2628d.p2629a.C52575l.m112140f(r0)
            r1 = r0
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r1 = (com.p683ss.android.ugc.aweme.shortvideo.AVChallenge) r1
        L_0x0102:
            r0 = r12
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r4 = "challenge"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 == 0) goto L_0x0141
            if (r1 == 0) goto L_0x0141
            boolean r0 = r1.isCommerce
            if (r0 == r10) goto L_0x0116
            goto L_0x0141
        L_0x0116:
            java.lang.String r0 = "autoselected_sticker_monitor"
            com.ss.android.ugc.aweme.shortvideo.ay r4 = com.p683ss.android.ugc.aweme.shortvideo.C42437ay.m93202a()
            java.lang.String r5 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.ay r12 = r4.mo86521a(r5, r12)
            java.lang.String r4 = "challenge_id"
            java.lang.String r5 = r1.cid
            if (r5 != 0) goto L_0x012a
            java.lang.String r5 = ""
        L_0x012a:
            com.ss.android.ugc.aweme.shortvideo.ay r12 = r12.mo86521a(r4, r5)
            java.lang.String r4 = "sticker_id"
            java.lang.String r1 = r1.stickerId
            if (r1 != 0) goto L_0x0136
            java.lang.String r1 = ""
        L_0x0136:
            com.ss.android.ugc.aweme.shortvideo.ay r12 = r12.mo86521a(r4, r1)
            org.json.JSONObject r12 = r12.mo86522b()
            com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r0, r2, r12)
        L_0x0141:
            com.ss.android.ugc.aweme.utils.b r12 = com.p683ss.android.ugc.aweme.utils.C47702b.f120193a
            java.lang.String r0 = "commerce_prop_click"
            com.ss.android.ugc.aweme.shortvideo.az r1 = com.p683ss.android.ugc.aweme.shortvideo.C42438az.m93209a()
            java.lang.String r4 = "enter_from"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r11.f125265f
            java.lang.String r5 = r5.f107133z
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x015c
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r11.f125265f
            java.lang.String r5 = r5.f107132y
            goto L_0x0160
        L_0x015c:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r11.f125265f
            java.lang.String r5 = r5.f107133z
        L_0x0160:
            com.ss.android.ugc.aweme.shortvideo.az r1 = r1.mo86526a(r4, r5)
            java.lang.String r4 = "prop_id"
            com.ss.android.ugc.aweme.shortvideo.az r1 = r1.mo86526a(r4, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f107329a
            r12.mo94984a(r0, r1)
        L_0x016f:
            com.ss.android.ugc.gamora.recorder.sticker.a.n r12 = r11.f125266g
            r12.mo97810d(r2)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a.C49991h.mo93033a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.c, com.ss.android.ugc.aweme.sticker.presenter.handler.k$a):com.ss.android.ugc.aweme.sticker.presenter.handler.c.b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b3, code lost:
        if (r1 == null) goto L_0x00b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMessageReceived(int r13, int r14, int r15, java.lang.String r16) {
        /*
            r12 = this;
            r0 = r12
            r7 = r13
            r8 = r14
            r9 = r16
            com.ss.android.ugc.aweme.sticker.viewmodel.FaceStickerViewModel r2 = r0.f125262c
            com.ss.android.ugc.aweme.sticker.viewmodel.FaceStickerViewModel$a r10 = new com.ss.android.ugc.aweme.sticker.viewmodel.FaceStickerViewModel$a
            r1 = r10
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.Callable r10 = (java.util.concurrent.Callable) r10
            java.util.concurrent.Executor r1 = p001a.C0013i.f25b
            p001a.C0013i.m18a(r10, r1)
            com.ss.android.ugc.aweme.shortvideo.messagecenter.MessageCenterViewModel r2 = r0.f125263d
            com.ss.android.ugc.aweme.shortvideo.messagecenter.MessageCenterViewModel$a r10 = new com.ss.android.ugc.aweme.shortvideo.messagecenter.MessageCenterViewModel$a
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.Callable r10 = (java.util.concurrent.Callable) r10
            java.util.concurrent.Executor r1 = p001a.C0013i.f25b
            p001a.C0013i.m18a(r10, r1)
            com.ss.android.ugc.gamora.recorder.sticker.a.n r1 = r0.f125266g
            r2 = r15
            r1.mo92997a(r13, r14, r15, r9)
            r1 = 4099(0x1003, float:5.744E-42)
            if (r7 == r1) goto L_0x0036
            r1 = 49
            if (r7 != r1) goto L_0x0060
        L_0x0036:
            android.support.v7.app.AppCompatActivity r1 = r0.f125264e
            android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
            android.arch.lifecycle.y r1 = android.arch.lifecycle.C0214z.m440a(r1)
            java.lang.Class<com.ss.android.ugc.aweme.sticker.types.game.GameResultViewModel> r2 = com.p683ss.android.ugc.aweme.sticker.types.game.GameResultViewModel.class
            android.arch.lifecycle.x r1 = r1.mo359a(r2)
            java.lang.String r2 = "ViewModelProviders.of(ac…ultViewModel::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.sticker.types.game.GameResultViewModel r1 = (com.p683ss.android.ugc.aweme.sticker.types.game.GameResultViewModel) r1
            android.arch.lifecycle.r r1 = r1.mo93332a()
            android.util.Pair r2 = new android.util.Pair
            r3 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r2.<init>(r3, r4)
            r1.postValue(r2)
        L_0x0060:
            r1 = 4104(0x1008, float:5.751E-42)
            if (r7 != r1) goto L_0x0084
            android.support.v7.app.AppCompatActivity r1 = r0.f125264e
            android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
            android.arch.lifecycle.y r1 = android.arch.lifecycle.C0214z.m440a(r1)
            java.lang.Class<com.ss.android.ugc.aweme.sticker.types.game.GameResultViewModel> r2 = com.p683ss.android.ugc.aweme.sticker.types.game.GameResultViewModel.class
            android.arch.lifecycle.x r1 = r1.mo359a(r2)
            java.lang.String r2 = "ViewModelProviders.of(ac…ultViewModel::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.sticker.types.game.GameResultViewModel r1 = (com.p683ss.android.ugc.aweme.sticker.types.game.GameResultViewModel) r1
            android.arch.lifecycle.r r1 = r1.mo93333b()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r1.postValue(r2)
        L_0x0084:
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r12.m107872a()
            r2 = 17
            if (r7 != r2) goto L_0x0141
            r2 = 3
            r3 = 0
            r4 = 0
            if (r8 != r2) goto L_0x00f3
            if (r1 == 0) goto L_0x00b5
            java.lang.String r1 = r1.getEffectId()
            if (r1 == 0) goto L_0x00b5
            com.ss.android.ugc.aweme.port.in.u r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.port.in.as r2 = r2.mo58567E()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "sticker_id: "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r2.mo49425a(r6)
            if (r1 != 0) goto L_0x00b7
        L_0x00b5:
            java.lang.String r1 = ""
        L_0x00b7:
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r0.f125261b
            long r6 = r6 - r8
            com.ss.android.ugc.aweme.port.in.u r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.port.in.as r2 = r2.mo58567E()
            java.lang.String r8 = "type_av_sticker_show_time"
            com.ss.android.ugc.aweme.shortvideo.ay r9 = com.p683ss.android.ugc.aweme.shortvideo.C42437ay.m93202a()
            java.lang.String r10 = "duration"
            java.lang.Long r11 = java.lang.Long.valueOf(r6)
            com.ss.android.ugc.aweme.shortvideo.ay r9 = r9.mo86520a(r10, r11)
            org.json.JSONObject r9 = r9.mo86522b()
            r2.mo49431a(r8, r9)
            com.ss.android.ugc.aweme.sticker.g.c r2 = r0.f125267h
            r2.mo92485a(r1, r6)
            com.ss.android.ugc.aweme.port.in.u r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.port.in.as r1 = r1.mo58567E()
            java.lang.String r2 = "3d_sticker_show_rate"
            r6 = 0
            r1.mo49426a(r2, r6, r3)
            r0.f125261b = r4
            return
        L_0x00f3:
            r2 = 4
            if (r8 != r2) goto L_0x0115
            if (r1 == 0) goto L_0x00fc
            java.lang.String r3 = r1.getUnzipPath()
        L_0x00fc:
            r1 = r3
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0115
            com.ss.android.ugc.gamora.recorder.sticker.a.a.h$a r1 = new com.ss.android.ugc.gamora.recorder.sticker.a.a.h$a
            r1.<init>(r3)
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
            java.util.concurrent.ExecutorService r2 = com.p683ss.android.ugc.aweme.p1468bu.C24076h.m58902c()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            p001a.C0013i.m18a(r1, r2)
        L_0x0115:
            android.support.v7.app.AppCompatActivity r1 = r0.f125264e
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2132545876(0x7f1c1154, float:2.0744954E38)
            com.ss.android.ugc.tools.view.widget.d r1 = com.p683ss.android.ugc.tools.view.widget.C50275d.m108538b(r1, r2)
            r1.mo98174a()
            com.ss.android.ugc.aweme.port.in.u r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.port.in.as r1 = r1.mo58567E()
            java.lang.String r2 = "3d_sticker_show_rate"
            com.ss.android.ugc.aweme.shortvideo.ay r3 = new com.ss.android.ugc.aweme.shortvideo.ay
            r3.<init>()
            java.lang.String r6 = "resource_name"
            com.ss.android.ugc.aweme.shortvideo.ay r3 = r3.mo86521a(r6, r9)
            org.json.JSONObject r3 = r3.mo86522b()
            r1.mo49426a(r2, r14, r3)
            r0.f125261b = r4
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.p2485a.C49991h.onMessageReceived(int, int, int, java.lang.String):void");
    }

    public C49991h(AppCompatActivity appCompatActivity, ShortVideoContext shortVideoContext, C50048n nVar, C45889c cVar, C52670a<C52860x> aVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(shortVideoContext, "mVideoContext");
        C52711k.m112240b(nVar, "stickerApiComponent");
        C52711k.m112240b(cVar, "stickerMobHelper");
        C52711k.m112240b(aVar, "onShowStickerView");
        this.f125264e = appCompatActivity;
        this.f125265f = shortVideoContext;
        this.f125266g = nVar;
        this.f125267h = cVar;
        this.f125268i = aVar;
        C0209x a = C0214z.m440a((FragmentActivity) this.f125264e).mo359a(FaceStickerViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…kerViewModel::class.java)");
        this.f125262c = (FaceStickerViewModel) a;
        C0209x a2 = C0214z.m440a((FragmentActivity) this.f125264e).mo359a(MessageCenterViewModel.class);
        C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…terViewModel::class.java)");
        this.f125263d = (MessageCenterViewModel) a2;
    }
}
