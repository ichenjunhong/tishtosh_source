package com.p683ss.android.ugc.aweme.global.config.settings;

import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.d */
public interface C32811d {

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.d$a */
    public static class C32812a implements C32811d {

        /* renamed from: a */
        C32811d f85416a;

        C32812a(C32811d dVar) {
            this.f85416a = dVar;
        }

        public final void change(IESSettingsProxy iESSettingsProxy) {
            if (this.f85416a != null) {
                this.f85416a.change(iESSettingsProxy);
            }
        }
    }

    void change(IESSettingsProxy iESSettingsProxy);
}
