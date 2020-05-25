package com.p683ss.android.ugc.aweme.infoSticker;

import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.editor.EditViewModel;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2629a.C52555ag;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2639f.p2641b.C52731z;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.at */
public final class C35579at {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f91447a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35579at.class), "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35579at.class), "stickerChallenge", "getStickerChallenge()Lcom/ss/android/ugc/aweme/infosticker/StickerChallenge;"))};

    /* renamed from: b */
    public final FragmentActivity f91448b;

    /* renamed from: c */
    private final C52668f f91449c = C52732g.m112285a(new C35581b(this));

    /* renamed from: d */
    private final C52668f f91450d = C52732g.m112285a(new C35582c(this));

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.at$a */
    static final class C35580a implements C35586b {

        /* renamed from: a */
        final /* synthetic */ C35579at f91451a;

        /* renamed from: b */
        final /* synthetic */ Effect f91452b;

        C35580a(C35579at atVar, Effect effect) {
            this.f91451a = atVar;
            this.f91452b = effect;
        }

        /* renamed from: a */
        public final void mo73981a(AVChallenge aVChallenge) {
            List stickerList = this.f91451a.mo73978b().getStickerList();
            String effectId = this.f91452b.getEffectId();
            C52711k.m112236a((Object) effectId, "effect.effectId");
            stickerList.add(effectId);
            this.f91451a.mo73978b().getStickerToChallenge().put(this.f91452b.getEffectId(), aVChallenge);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.at$b */
    static final class C35581b extends C52712l implements C52670a<VideoPublishEditModel> {

        /* renamed from: a */
        final /* synthetic */ C35579at f91453a;

        C35581b(C35579at atVar) {
            this.f91453a = atVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((EditViewModel) C48927d.m105736a(this.f91453a.f91448b).mo96760a(EditViewModel.class)).mo97035e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.at$c */
    static final class C35582c extends C52712l implements C52670a<StickerChallenge> {

        /* renamed from: a */
        final /* synthetic */ C35579at f91454a;

        C35582c(C35579at atVar) {
            this.f91454a = atVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f91454a.mo73975a().stickerChallenge == null) {
                return new StickerChallenge();
            }
            return this.f91454a.mo73975a().stickerChallenge;
        }
    }

    /* renamed from: a */
    public final VideoPublishEditModel mo73975a() {
        return (VideoPublishEditModel) this.f91449c.getValue();
    }

    /* renamed from: b */
    public final StickerChallenge mo73978b() {
        return (StickerChallenge) this.f91450d.getValue();
    }

    /* renamed from: d */
    public final Collection<AVChallenge> mo73980d() {
        return mo73978b().getRecordStickerChallengeList();
    }

    /* renamed from: c */
    public final Collection<AVChallenge> mo73979c() {
        Collection<AVChallenge> values = mo73978b().getStickerToChallenge().values();
        C52711k.m112236a((Object) values, "stickerChallenge.stickerToChallenge.values");
        return values;
    }

    public C35579at(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "context");
        this.f91448b = fragmentActivity;
    }

    /* renamed from: a */
    public final void mo73977a(String str) {
        Object obj;
        AVChallenge aVChallenge = (AVChallenge) mo73978b().getStickerToChallenge().get(str);
        if (aVChallenge != null) {
            Iterator it = mo73978b().getRecordStickerChallengeList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C52711k.m112239a((Object) aVChallenge.challengeName, (Object) ((AVChallenge) obj).challengeName)) {
                    break;
                }
            }
            if (((AVChallenge) obj) == null) {
                mo73975a().removeChallengeFromTitleAndStruct(C52555ag.m112061a(aVChallenge));
            }
        }
        Collection stickerList = mo73978b().getStickerList();
        if (stickerList != null) {
            C52731z.m112266b(stickerList).remove(str);
            if (!C52575l.m112125a((Iterable<? extends T>) mo73978b().getStickerList(), str)) {
                Map stickerToChallenge = mo73978b().getStickerToChallenge();
                if (stickerToChallenge != null) {
                    C52731z.m112270f(stickerToChallenge).remove(str);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
    }

    /* renamed from: a */
    public final void mo73976a(FragmentActivity fragmentActivity, Effect effect) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(effect, "effect");
        new C35587c(fragmentActivity, C46059g.m100090n(effect)).mo73988a(new C35580a(this, effect));
    }
}
