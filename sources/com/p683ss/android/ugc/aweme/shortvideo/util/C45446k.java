package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45546c;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46582f;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.p2330a.C46567b;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.p2330a.C46568c;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.k */
final /* synthetic */ class C45446k implements Callable {

    /* renamed from: a */
    private final Map f114850a;

    /* renamed from: b */
    private final String f114851b;

    /* renamed from: c */
    private final C0027j f114852c;

    /* renamed from: d */
    private final C45546c f114853d;

    /* renamed from: e */
    private final Context f114854e;

    C45446k(Map map, String str, C0027j jVar, C45546c cVar, Context context) {
        this.f114850a = map;
        this.f114851b = str;
        this.f114852c = jVar;
        this.f114853d = cVar;
        this.f114854e = context;
    }

    public final Object call() {
        Map map = this.f114850a;
        String str = this.f114851b;
        C0027j jVar = this.f114852c;
        C45546c cVar = this.f114853d;
        Context context = this.f114854e;
        ArrayList a = C45435f.m99012a((List) map.get(str));
        if (a.isEmpty()) {
            jVar.mo44a(new Bundle());
            C47700ay.m103236b(cVar);
        } else {
            C29252f a2 = C29242c.m68868a(context);
            if (context instanceof C0184k) {
                a2.mo59122a((C0184k) context);
            }
            C454372 r9 = new C46568c(str, a, cVar, jVar) {

                /* renamed from: a */
                final /* synthetic */ String f114827a;

                /* renamed from: b */
                final /* synthetic */ ArrayList f114828b;

                /* renamed from: c */
                final /* synthetic */ C45546c f114829c;

                /* renamed from: d */
                final /* synthetic */ C0027j f114830d;

                /* renamed from: a */
                public final void mo91736a(C48649d dVar) {
                    C47700ay.m103236b(this.f114829c);
                    this.f114830d.mo43a(dVar.f122281c);
                }

                /* renamed from: a */
                public final void mo91739a(List<StickerWrapper> list, ResourceListModel resourceListModel) {
                    C47700ay.m103236b(this.f114829c);
                    if (C9414h.m18630a(list)) {
                        this.f114830d.mo44a(new Bundle());
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("update_effect_id", this.f114827a);
                    bundle.putParcelableArrayList("update_effect_extra", new ArrayList(list));
                    this.f114830d.mo44a(bundle);
                }

                /* renamed from: a */
                public final void mo91737a(String str, Effect effect, ResourceListModel resourceListModel) {
                    C46582f.m101117a(this.f114827a, effect, (List<StickerWrapper>) this.f114828b, 0, resourceListModel, (C46567b) this);
                }

                {
                    this.f114827a = r1;
                    this.f114828b = r2;
                    this.f114829c = r3;
                    this.f114830d = r4;
                }

                /* renamed from: a */
                public final void mo91738a(String str, List<StickerWrapper> list, StickerWrapper stickerWrapper, Exception exc) {
                    C47700ay.m103236b(this.f114829c);
                    if (C9414h.m18630a(list)) {
                        this.f114830d.mo44a(new Bundle());
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("update_effect_id", this.f114827a);
                    bundle.putParcelableArrayList("update_effect_extra", new ArrayList(list));
                    this.f114830d.mo44a(bundle);
                }
            };
            C46582f.m101114a();
            for (int i = 0; i < a.size(); i++) {
                C46582f.m101115a(a2, str, (StickerWrapper) a.get(i), i, (List<StickerWrapper>) a, (C46567b) r9);
            }
        }
        return null;
    }
}
