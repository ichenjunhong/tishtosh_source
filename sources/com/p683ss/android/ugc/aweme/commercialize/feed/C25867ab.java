package com.p683ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.commercialize.log.C26047an;
import com.p683ss.android.ugc.aweme.commercialize.log.C26060ay;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52682m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.ab */
public final class C25867ab implements C9382a {

    /* renamed from: a */
    static final C9381g f68404a;

    /* renamed from: b */
    static C25868a f68405b;

    /* renamed from: c */
    public static final C25867ab f68406c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.ab$a */
    static final class C25868a implements Runnable {

        /* renamed from: a */
        private final Aweme f68407a;

        /* renamed from: b */
        private final String f68408b;

        public final void run() {
            C26088l.m63340d(C11010c.m22280a(), this.f68407a, this.f68408b);
        }

        public C25868a(Aweme aweme, String str) {
            this.f68407a = aweme;
            this.f68408b = str;
        }
    }

    private C25867ab() {
    }

    /* renamed from: a */
    public static final void m62599a() {
        C25868a aVar = f68405b;
        if (aVar != null) {
            aVar.run();
        }
        f68405b = null;
    }

    static {
        C25867ab abVar = new C25867ab();
        f68406c = abVar;
        f68404a = new C9381g(abVar);
    }

    public final void handleMsg(Message message) {
        if (message != null && message.what == 1048577) {
            Bundle data = message.getData();
            if (data != null) {
                try {
                    String string = data.getString("refer");
                    Serializable serializable = data.getSerializable("aweme_raw_data");
                    if (serializable != null) {
                        AwemeRawAd awemeRawAd = (AwemeRawAd) serializable;
                        Context a = C11010c.m22280a();
                        JSONObject a2 = C26088l.m63265a(a, awemeRawAd, "raw ad click", true);
                        if (string != null) {
                            try {
                                a2.put("refer", string);
                            } catch (JSONException unused) {
                            }
                        }
                        String str = "click";
                        if (C26088l.m63351e(a, awemeRawAd)) {
                            C26088l.m63299a(a, "draw_ad", str, a2, awemeRawAd);
                        }
                        if (awemeRawAd != null) {
                            C26060ay.f68819a.mo53545a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26047an<Object,Object,Object>(awemeRawAd));
                        }
                        message.setData(null);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.AwemeRawAd");
                } catch (Exception unused2) {
                }
            }
        }
    }
}
