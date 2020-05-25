package com.p683ss.android.ugc.aweme.filter.view.p1750a;

import com.p683ss.android.ugc.aweme.filter.C31459g;

/* renamed from: com.ss.android.ugc.aweme.filter.view.a.k */
public interface C31616k extends C31612g {

    /* renamed from: com.ss.android.ugc.aweme.filter.view.a.k$a */
    public enum C31617a {
        FILTER_CONFIRM(1),
        FILTER_CANCEL(0),
        FILTER_RATE_CONFIRM(2),
        FILTER_RATE_CANCEL(3),
        FILTER_RATE_CHANGING(4),
        FILTER_SELECTED_CHANGE(5);
        

        /* renamed from: b */
        private final int f82621b;

        public final int getValue() {
            return this.f82621b;
        }

        private C31617a(int i) {
            this.f82621b = i;
        }
    }

    /* renamed from: a */
    void mo64513a(C31459g gVar);

    /* renamed from: a */
    void mo64514a(C31459g gVar, float f);

    /* renamed from: a */
    void mo64515a(C31618l lVar);
}
