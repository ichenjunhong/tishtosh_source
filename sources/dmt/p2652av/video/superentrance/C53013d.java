package dmt.p2652av.video.superentrance;

import android.content.Context;
import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.services.effect.EffectService;
import com.p683ss.android.ugc.aweme.services.effect.IEffectService;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: dmt.av.video.superentrance.d */
public final class C53013d {

    /* renamed from: a */
    C29252f f131460a;

    /* renamed from: b */
    final C53014a f131461b = new C53014a();

    /* renamed from: c */
    public final Context f131462c;

    /* renamed from: dmt.av.video.superentrance.d$a */
    public static final class C53014a implements C17432q<IEffectService> {

        /* renamed from: a */
        public IEffectService f131463a;

        C53014a() {
        }

        /* renamed from: a */
        public final IEffectService get() {
            if (this.f131463a == null) {
                this.f131463a = EffectService.getInstance();
            }
            return this.f131463a;
        }
    }

    public C53013d(Context context) {
        C52711k.m112240b(context, "context");
        this.f131462c = context;
    }
}
