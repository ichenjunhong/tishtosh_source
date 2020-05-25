package com.p683ss.android.ugc.aweme.video.hashtag.helper;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper */
public abstract class BaseTitleHelper extends C0209x {

    /* renamed from: d */
    public static final C48034a f120713d = new C48034a(null);

    /* renamed from: a */
    public C48035b f120714a;

    /* renamed from: b */
    public String f120715b = "";

    /* renamed from: c */
    public String f120716c = "";

    /* renamed from: com.ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper$a */
    public static final class C48034a {
        private C48034a() {
        }

        public /* synthetic */ C48034a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static BaseTitleHelper m104029a(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "fragmentActivity");
            C0209x a = C0214z.m440a(fragmentActivity).mo359a(TitleHelper.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(fr…(TitleHelper::class.java)");
            return (BaseTitleHelper) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper$b */
    public interface C48035b {
        /* renamed from: a */
        void mo86602a(String str);
    }

    /* renamed from: a */
    public static final BaseTitleHelper m104027a(FragmentActivity fragmentActivity) {
        return C48034a.m104029a(fragmentActivity);
    }

    /* renamed from: a */
    public abstract void mo95300a();
}
