package dmt.p2652av.video.superentrance.p2657a;

import android.view.View;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: dmt.av.video.superentrance.a.b */
public final class C53004b {

    /* renamed from: dmt.av.video.superentrance.a.b$a */
    public static final class C53005a extends C47687av {

        /* renamed from: a */
        final /* synthetic */ C52670a f131446a;

        C53005a(C52670a aVar) {
            this.f131446a = aVar;
        }

        /* renamed from: a */
        public final void mo59929a(View view) {
            this.f131446a.invoke();
        }
    }

    /* renamed from: a */
    public static final void m112729a(View view, C52670a<C52860x> aVar) {
        C52711k.m112240b(view, "$this$setDebounceOnClickListener");
        C52711k.m112240b(aVar, "run");
        view.setOnClickListener(new C53005a(aVar));
    }
}
