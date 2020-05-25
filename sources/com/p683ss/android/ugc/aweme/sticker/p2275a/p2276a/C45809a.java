package com.p683ss.android.ugc.aweme.sticker.p2275a.p2276a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45815a;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45816b;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45817c;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.panel.C46254o;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.view.p2512e.C50224a.C50232a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p2628d.C52856t;
import p2628d.C52860x;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.a.a.a */
public final class C45809a implements C45812b {

    /* renamed from: a */
    public Object f115793a;

    /* renamed from: b */
    public final C52671b<C45816b<?>, C52860x> f115794b;

    /* renamed from: c */
    private final Context f115795c;

    /* renamed from: d */
    private final C17432q<C46254o> f115796d;

    /* renamed from: e */
    private final ShortVideoContext f115797e;

    /* renamed from: com.ss.android.ugc.aweme.sticker.a.a.a$a */
    static final class C45810a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ HashMap f115798a;

        /* renamed from: b */
        final /* synthetic */ C45809a f115799b;

        /* renamed from: c */
        final /* synthetic */ Effect f115800c;

        /* renamed from: d */
        final /* synthetic */ C45816b f115801d;

        C45810a(HashMap hashMap, C45809a aVar, Effect effect, C45816b bVar) {
            this.f115798a = hashMap;
            this.f115799b = aVar;
            this.f115800c = effect;
            this.f115801d = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f115798a.put("to_status", "confirm");
            C47702b.f120193a.mo94984a("shoot_video_delete_confirm", (Map<String, String>) this.f115798a);
            this.f115799b.f115793a = this.f115801d;
            this.f115799b.f115794b.invoke(this.f115801d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.a.a.a$b */
    static final class C45811b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ HashMap f115802a;

        C45811b(HashMap hashMap) {
            this.f115802a = hashMap;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f115802a.put("to_status", "cancel");
            C47702b.f120193a.mo94984a("shoot_video_delete_confirm", (Map<String, String>) this.f115802a);
        }
    }

    /* renamed from: a */
    public final <T> boolean mo92257a(C45816b<T> bVar) {
        C52711k.m112240b(bVar, "request");
        if ((!C52711k.m112239a(this.f115793a, (Object) bVar)) && (bVar instanceof C45817c) && bVar.mo92261b() == C45815a.UI_CLICK) {
            Effect effect = ((C45817c) bVar).f115806a.f115779a;
            if (!C46059g.m100095s(effect)) {
                return false;
            }
            C46254o oVar = (C46254o) this.f115796d.get();
            if (!oVar.mo92776c()) {
                oVar = null;
            }
            if (oVar == null || this.f115797e.f107119l.isEmpty()) {
                return false;
            }
            C52711k.m112236a((Object) effect, "effect");
            HashMap c = C52550ab.m112057c(C52856t.m112465a("prop_id", effect.getEffectId()), C52856t.m112465a("creation_id", this.f115797e.f107131x), C52856t.m112465a("shoot_way", this.f115797e.f107132y));
            new C50232a(this.f115795c).mo98007a(R.string.f9i).mo98010b(R.string.f9h).mo98011b(R.string.wf, new C45811b(c)).mo98008a(R.string.ahm, new C45810a(c, this, effect, bVar)).mo98009a().mo97997a();
            return true;
        }
        return false;
    }

    public C45809a(Context context, C17432q<C46254o> qVar, ShortVideoContext shortVideoContext, C52671b<? super C45816b<?>, C52860x> bVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(qVar, "stickerViewSupplier");
        C52711k.m112240b(shortVideoContext, "shortVideoContext");
        C52711k.m112240b(bVar, "onUseGameEffect");
        this.f115795c = context;
        this.f115796d = qVar;
        this.f115797e = shortVideoContext;
        this.f115794b = bVar;
    }
}
