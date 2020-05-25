package com.p683ss.android.ugc.aweme.shortvideo.sticker.p2231f;

import android.content.Context;
import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.port.p2082in.C39600bi.C39601a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39600bi.C39602b;
import com.p683ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.p683ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.p683ss.android.ugc.aweme.sticker.C46049k;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.f.b */
public final class C44567b implements C46049k {

    /* renamed from: a */
    Effect f112754a;

    /* renamed from: b */
    public OnUnlockShareFinishListener f112755b;

    /* renamed from: c */
    String f112756c;

    /* renamed from: d */
    public C17432q<IStickerUtilsService> f112757d = new C17432q<IStickerUtilsService>() {

        /* renamed from: a */
        IStickerUtilsService f112764a;

        public final /* synthetic */ Object get() {
            if (this.f112764a == null) {
                this.f112764a = AVExternalServiceImpl.getAVServiceImpl_Monster().infoService().stickerInfo();
            }
            return this.f112764a;
        }
    };

    /* renamed from: e */
    C39601a f112758e = new C39601a() {
    };

    /* renamed from: f */
    private Context f112759f;

    /* renamed from: g */
    private C39602b f112760g = new C39602b() {
    };

    /* renamed from: h */
    private boolean f112761h = false;

    /* renamed from: i */
    private boolean f112762i = false;

    /* renamed from: a */
    public final void mo90502a(Effect effect) {
        this.f112754a = effect;
    }

    public C44567b(String str, Context context, Effect effect, OnUnlockShareFinishListener onUnlockShareFinishListener, boolean z, boolean z2) {
        this.f112756c = str;
        this.f112759f = context;
        this.f112754a = effect;
        this.f112755b = onUnlockShareFinishListener;
        this.f112761h = z;
        this.f112762i = z2;
    }
}
