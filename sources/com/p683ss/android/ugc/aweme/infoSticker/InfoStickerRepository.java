package com.p683ss.android.ugc.aweme.infoSticker;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.os.Looper;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48701f;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48707l;
import com.p683ss.android.ugc.tools.utils.C50200d;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.InfoStickerRepository */
public final class InfoStickerRepository {

    /* renamed from: a */
    C29252f f91303a;

    /* renamed from: b */
    RetrofitService f91304b = ((RetrofitService) C39629l.m88232a().mo58595z().retrofitCreate(AVApiImpl.createAVApibyMonsterPlugin().getAPI_URL_PREFIX_SI(), RetrofitService.class));

    /* renamed from: c */
    Queue<Effect> f91305c = new LinkedBlockingQueue();

    /* renamed from: d */
    private Effect f91306d;

    /* renamed from: e */
    private boolean f91307e;

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.InfoStickerRepository$RetrofitService */
    interface RetrofitService {
        @C53075f(mo110603a = "/aweme/v1/info/sticker/")
        C17832m<C35585aw> getTemperature(@C53089t(mo110619a = "longitude") double d, @C53089t(mo110619a = "latitude") double d2);
    }

    /* renamed from: a */
    public final void mo73916a() {
        this.f91307e = false;
    }

    /* renamed from: b */
    public final void mo73919b() {
        m80274b(false);
    }

    public InfoStickerRepository(Context context) {
        this.f91303a = C29242c.m68868a(context);
    }

    /* renamed from: b */
    private void m80274b(boolean z) {
        while (this.f91307e) {
            this.f91306d = (Effect) this.f91305c.poll();
            if (this.f91306d != null) {
                if (!m80273a(this.f91306d, this.f91303a, z)) {
                    this.f91303a.mo59123a(this.f91306d, (C48705j) new C48705j() {
                        /* renamed from: a */
                        public final void mo8643a(Effect effect) {
                        }

                        /* renamed from: a */
                        public final /* synthetic */ void mo8638a(Object obj) {
                            Effect effect = (Effect) obj;
                            InfoStickerRepository.this.mo73919b();
                        }

                        /* renamed from: a */
                        public final void mo8644a(Effect effect, C48649d dVar) {
                            InfoStickerRepository.this.mo73919b();
                        }
                    });
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final LiveData<C37721a<EffectChannelResponse>> mo73913a(final String str) {
        final C0198r rVar = new C0198r();
        rVar.setValue(C37721a.m84218a(C37722a.LOADING, null));
        this.f91303a.mo59143b(str, false, (C48702g) new C48702g() {
            /* renamed from: a */
            public final /* synthetic */ void mo8638a(Object obj) {
                rVar.setValue(C37721a.m84218a(C37722a.SUCCESS, (EffectChannelResponse) obj));
            }

            /* renamed from: a */
            public final void mo8637a(C48649d dVar) {
                InfoStickerRepository infoStickerRepository = InfoStickerRepository.this;
                C0198r rVar = rVar;
                infoStickerRepository.f91303a.mo59126a(str, (C48702g) new C48702g(rVar) {

                    /* renamed from: a */
                    final /* synthetic */ C0198r f91314a;

                    /* renamed from: a */
                    public final void mo8637a(C48649d dVar) {
                        this.f91314a.setValue(C37721a.m84220a(C37722a.ERROR, dVar.f122281c));
                    }

                    /* renamed from: a */
                    public final /* synthetic */ void mo8638a(Object obj) {
                        this.f91314a.setValue(C37721a.m84218a(C37722a.SUCCESS, (EffectChannelResponse) obj));
                    }

                    {
                        this.f91314a = r2;
                    }
                });
                StringBuilder sb = new StringBuilder("uniformFetchList fail : ");
                sb.append(dVar.toString());
                C39629l.m88232a().mo58567E().mo49428a("InfoStickerRepository", sb.toString());
            }
        });
        return rVar;
    }

    /* renamed from: a */
    public final void mo73918a(boolean z) {
        if (!this.f91307e) {
            this.f91307e = true;
            m80274b(z);
        }
    }

    /* renamed from: a */
    public final void mo73917a(List<Effect> list, boolean z) {
        this.f91305c.addAll(list);
        m80274b(z);
    }

    /* renamed from: a */
    private static boolean m80273a(Effect effect, C29252f fVar, boolean z) {
        if (z) {
            if (effect == null || !C50200d.m108346a(effect.getUnzipPath())) {
                return false;
            }
            return true;
        } else if (fVar == null || effect == null || !fVar.mo59142a(effect)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final LiveData<C37721a<PanelInfoModel>> mo73914a(String str, String str2, int i, int i2) {
        final C0198r rVar = new C0198r();
        rVar.setValue(C37721a.m84218a(C37722a.LOADING, null));
        this.f91303a.mo59139a(str, true, str2, i, i2, (C48707l) new C48707l() {
            /* renamed from: a */
            public final void mo59192a(C48649d dVar) {
                rVar.setValue(C37721a.m84218a(C37722a.ERROR, null));
            }

            /* renamed from: a */
            public final /* synthetic */ void mo8638a(Object obj) {
                rVar.setValue(C37721a.m84218a(C37722a.SUCCESS, (PanelInfoModel) obj));
            }
        });
        return rVar;
    }

    /* renamed from: a */
    public final LiveData<C37721a<CategoryPageModel>> mo73915a(String str, String str2, int i, int i2, int i3, String str3) {
        final C0198r rVar = new C0198r();
        Looper.myLooper();
        Looper.getMainLooper();
        rVar.postValue(C37721a.m84218a(C37722a.LOADING, null));
        this.f91303a.mo59129a(str, str2, i, i2, i3, str3, new C48701f() {
            /* renamed from: a */
            public final void mo59186a(C48649d dVar) {
                rVar.setValue(C37721a.m84218a(C37722a.ERROR, null));
            }

            /* renamed from: a */
            public final /* synthetic */ void mo8638a(Object obj) {
                rVar.setValue(C37721a.m84218a(C37722a.SUCCESS, (CategoryPageModel) obj));
            }
        });
        return rVar;
    }
}
