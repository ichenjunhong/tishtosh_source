package com.p683ss.android.ugc.aweme.longvideo.p1934b;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.longvideo.C36369f;
import com.p683ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideo.b.a */
public final class C36351a {

    /* renamed from: a */
    public static final C36352a f93060a = new C36352a(null);

    /* renamed from: com.ss.android.ugc.aweme.longvideo.b.a$a */
    public static final class C36352a {
        private C36352a() {
        }

        public /* synthetic */ C36352a(C52707g gVar) {
            this();
        }

        /* renamed from: b */
        public final boolean mo75268b(Context context) {
            if (m82035a(context) == 1) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public static int m82035a(Context context) {
            if (context instanceof FragmentActivity) {
                C36369f fVar = ((LongVideoMobViewModel) C0214z.m440a((FragmentActivity) context).mo359a(LongVideoMobViewModel.class)).f93193a;
                if (fVar != null) {
                    return fVar.f93090c;
                }
            }
            return 0;
        }

        /* renamed from: a */
        public static LongVideoMobViewModel m82036a(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "activity");
            C0209x a = C0214z.m440a(fragmentActivity).mo359a(LongVideoMobViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…MobViewModel::class.java)");
            return (LongVideoMobViewModel) a;
        }
    }

    /* renamed from: a */
    public static final int m82034a(Context context) {
        return C36352a.m82035a(context);
    }
}
