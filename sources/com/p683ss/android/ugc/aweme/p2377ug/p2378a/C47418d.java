package com.p683ss.android.ugc.aweme.p2377ug.p2378a;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.AppStoreMessage;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ug.a.d */
public final class C47418d {

    /* renamed from: a */
    public final C47422e f119638a = new C47422e(this.f119639b);

    /* renamed from: b */
    public final Context f119639b;

    /* renamed from: com.ss.android.ugc.aweme.ug.a.d$a */
    static final class C47419a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47418d f119640a;

        C47419a(C47418d dVar) {
            this.f119640a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C47422e eVar = this.f119640a.f119638a;
            C47409a.m102785a("rating_feedback");
            eVar.f119627a.mo94701a(true);
            eVar.mo94688a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.a.d$b */
    static final class C47420b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47418d f119641a;

        C47420b(C47418d dVar) {
            this.f119641a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C47422e eVar = this.f119641a.f119638a;
            C47409a.m102785a("rating_submit");
            eVar.f119627a.mo94703b(true);
            eVar.mo94689b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.a.d$c */
    static final class C47421c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47418d f119642a;

        C47421c(C47418d dVar) {
            this.f119642a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C47422e eVar = this.f119642a.f119638a;
            C47409a.m102785a("rating_cancel");
        }
    }

    /* renamed from: a */
    public final void mo94694a() {
        String str = "";
        String str2 = "";
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            AppStoreMessage appStoreScore = b.getAppStoreScore();
            C52711k.m112236a((Object) appStoreScore, "message");
            if (!TextUtils.isEmpty(appStoreScore.getTitle())) {
                String title = appStoreScore.getTitle();
                C52711k.m112236a((Object) title, "message.title");
                str = title;
            }
            if (!TextUtils.isEmpty(appStoreScore.getText())) {
                String text = appStoreScore.getText();
                C52711k.m112236a((Object) text, "message.text");
                str2 = text;
            }
        } catch (C10174a unused) {
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f119639b.getResources().getString(R.string.b8s);
            C52711k.m112236a((Object) str, "context.resources.getStr…R.string.give_us_5_stars)");
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = this.f119639b.getResources().getString(R.string.b9m);
            C52711k.m112236a((Object) str2, "context.resources.getStr…eputation_dialog_content)");
        }
        C10643a aVar = new C10643a(this.f119639b);
        int i = R.drawable.d24;
        if (C47842ed.m103485a(this.f119639b)) {
            i = R.drawable.d25;
        }
        aVar.mo18892a(str).mo18902b(str2).mo18895a(this.f119638a.mo94698c(), (OnClickListener) new C47419a(this)).mo18886a((int) R.string.b3p, (DialogInterface.OnClickListener) new C47420b(this)).mo18900b((int) R.string.vj, (DialogInterface.OnClickListener) new C47421c(this)).mo18907c(R.drawable.b12).mo18912f(i).mo18905b(false).mo18897a().mo18883c();
    }

    public C47418d(Context context) {
        C52711k.m112240b(context, "context");
        this.f119639b = context;
        C47422e eVar = this.f119638a;
        C47409a.m102785a("rating_show");
        eVar.f119627a.mo94699a(System.currentTimeMillis());
        eVar.f119627a.mo94700a(String.valueOf(C11010c.m22287h()));
    }
}
