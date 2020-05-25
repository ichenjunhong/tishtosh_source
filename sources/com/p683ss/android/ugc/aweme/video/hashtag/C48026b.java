package com.p683ss.android.ugc.aweme.video.hashtag;

import android.view.View;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.video.hashtag.b */
public abstract class C48026b implements C26877c<AVChallenge> {

    /* renamed from: b */
    public static final C48027a f120703b = new C48027a(null);

    /* renamed from: a */
    public final C48028b f120704a;

    /* renamed from: com.ss.android.ugc.aweme.video.hashtag.b$a */
    public static final class C48027a {
        private C48027a() {
        }

        public /* synthetic */ C48027a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.hashtag.b$b */
    public static final class C48028b {

        /* renamed from: a */
        public final View f120705a;

        /* renamed from: b */
        public final C48033f f120706b;

        public C48028b(View view, C48033f fVar) {
            C52711k.m112240b(view, "rootLayout");
            C52711k.m112240b(fVar, "iAddHashTag");
            this.f120705a = view;
            this.f120706b = fVar;
        }
    }

    /* renamed from: a */
    private static void m104015a(List<AVChallenge> list) {
        C52711k.m112240b(list, "list");
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: b */
    public final void mo47026b(List<AVChallenge> list, boolean z) {
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<AVChallenge> list, boolean z) {
    }

    /* renamed from: e */
    public final void mo47031e() {
    }

    public final void aJ_() {
        m104015a(new ArrayList());
    }

    public C48026b(C48028b bVar) {
        C52711k.m112240b(bVar, "mConstructorParam");
        this.f120704a = bVar;
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        m104015a(new ArrayList());
    }

    /* renamed from: a */
    public final void mo47018a(List<AVChallenge> list, boolean z) {
        if (list == null) {
            list = new ArrayList<>();
        }
        m104015a(list);
    }
}
