package com.p683ss.android.ugc.aweme.infoSticker;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.LiveData;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48708m;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.InfoStickerViewModel */
public class InfoStickerViewModel extends C0209x {

    /* renamed from: a */
    InfoStickerRepository f91353a;

    /* renamed from: b */
    public int f91354b;

    /* renamed from: c */
    public VideoPublishEditModel f91355c;

    /* renamed from: d */
    private C0198r<Effect> f91356d;

    /* renamed from: e */
    private LiveData<C37721a<EffectChannelResponse>> f91357e;

    /* renamed from: f */
    private LiveData<C37721a<PanelInfoModel>> f91358f;

    /* renamed from: g */
    private C0198r<Integer> f91359g;

    public void onCleared() {
        super.onCleared();
    }

    /* renamed from: b */
    public final void mo73937b() {
        m80317a(false);
    }

    /* renamed from: a */
    public final void mo73935a() {
        this.f91353a.mo73916a();
    }

    /* renamed from: c */
    public final C0198r<Effect> mo73938c() {
        if (this.f91356d == null) {
            this.f91356d = new C0198r<>();
        }
        return this.f91356d;
    }

    /* renamed from: d */
    public final C0198r<Integer> mo73939d() {
        if (this.f91359g == null) {
            this.f91359g = new C0198r<>();
        }
        return this.f91359g;
    }

    public InfoStickerViewModel(InfoStickerRepository infoStickerRepository) {
        this.f91353a = infoStickerRepository;
    }

    /* renamed from: a */
    private void m80317a(boolean z) {
        this.f91353a.mo73918a(false);
    }

    /* renamed from: a */
    public final LiveData<C37721a<EffectChannelResponse>> mo73932a(String str) {
        if (this.f91357e == null || ((C37721a) this.f91357e.getValue()).f96126b == C37722a.ERROR) {
            this.f91357e = this.f91353a.mo73913a(str);
        }
        return this.f91357e;
    }

    /* renamed from: a */
    public final LiveData<C37721a<ProviderEffectModel>> mo73933a(String str, int i, int i2) {
        InfoStickerRepository infoStickerRepository = this.f91353a;
        C0198r rVar = new C0198r();
        rVar.setValue(C37721a.m84218a(C37722a.LOADING, null));
        infoStickerRepository.f91303a.mo59137a(str, false, i, 30, (C48708m) new C48708m(rVar) {

            /* renamed from: a */
            final /* synthetic */ C0198r f91328a;

            /* renamed from: a */
            public final /* synthetic */ void mo8638a(Object obj) {
                this.f91328a.setValue(C37721a.m84218a(C37722a.SUCCESS, (ProviderEffectModel) obj));
            }

            /* renamed from: a */
            public final void mo73920a(C48649d dVar) {
                StringBuilder sb = new StringBuilder("uniformFetchList fail : ");
                sb.append(dVar.toString());
                C39629l.m88232a().mo58567E().mo49428a("InfoStickerRepository", sb.toString());
                this.f91328a.setValue(C37721a.m84220a(C37722a.ERROR, dVar.f122281c));
            }

            {
                this.f91328a = r2;
            }
        });
        return rVar;
    }

    /* renamed from: b */
    public final LiveData<C37721a<ProviderEffectModel>> mo73936b(String str, String str2, int i, int i2) {
        InfoStickerRepository infoStickerRepository = this.f91353a;
        C0198r rVar = new C0198r();
        rVar.setValue(C37721a.m84218a(C37722a.LOADING, null));
        infoStickerRepository.f91303a.mo59130a(str, str2, i, 30, (C48708m) new C48708m(rVar) {

            /* renamed from: a */
            final /* synthetic */ C0198r f91310a;

            /* renamed from: a */
            public final /* synthetic */ void mo8638a(Object obj) {
                this.f91310a.setValue(C37721a.m84218a(C37722a.SUCCESS, (ProviderEffectModel) obj));
            }

            /* renamed from: a */
            public final void mo73920a(C48649d dVar) {
                StringBuilder sb = new StringBuilder("uniformFetchList fail : ");
                sb.append(dVar.toString());
                C39629l.m88232a().mo58567E().mo49428a("InfoStickerRepository", sb.toString());
                this.f91310a.setValue(C37721a.m84220a(C37722a.ERROR, dVar.f122281c));
            }

            {
                this.f91310a = r2;
            }
        });
        return rVar;
    }

    /* renamed from: a */
    public final LiveData<C37721a<PanelInfoModel>> mo73934a(String str, String str2, int i, int i2) {
        if (this.f91358f == null || ((C37721a) this.f91358f.getValue()).f96126b == C37722a.ERROR) {
            this.f91358f = this.f91353a.mo73914a(str, str2, 75, 0);
        }
        return this.f91358f;
    }
}
