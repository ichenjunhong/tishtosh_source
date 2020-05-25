package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39605bl.C39607b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44372f;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44372f.C44374b;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44372f.C44375c;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44372f.C44376d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bz */
final /* synthetic */ class C45086bz implements C39607b {

    /* renamed from: a */
    private final C45054bg f114186a;

    C45086bz(C45054bg bgVar) {
        this.f114186a = bgVar;
    }

    /* renamed from: a */
    public final boolean mo80681a(View view) {
        Dialog dialog;
        C45054bg bgVar = this.f114186a;
        if (bgVar.f114129o.f109303a.mo74260c() == 1) {
            bgVar.f114129o.f109303a.mo74256a(1, false);
        } else {
            C22055c e = C39618d.f101183x.mo74285e();
            String c = e != null ? e.mo46159c() : "";
            C44372f fVar = new C44372f();
            Context context = bgVar.getContext();
            if (context == null) {
                dialog = null;
            } else {
                C10643a aVar = new C10643a(context);
                aVar.mo18902b(context.getString(R.string.hvl)).mo18886a((int) R.string.ast, (OnClickListener) new C44375c(fVar)).mo18900b((int) R.string.g_h, (OnClickListener) new C44376d(fVar));
                dialog = aVar.mo18897a().mo18883c();
                dialog.setCanceledOnTouchOutside(false);
                dialog.setCancelable(false);
            }
            if (dialog != null) {
                fVar.f112282a = new C44374b(dialog, c) {

                    /* renamed from: a */
                    final /* synthetic */ Dialog f114144a;

                    /* renamed from: b */
                    final /* synthetic */ String f114145b;

                    /* renamed from: a */
                    public final void mo90234a() {
                        C45111cf.m98621a(this.f114144a);
                        C45054bg.this.f114129o.f109303a.mo74256a(1, true);
                        C44372f.m97166a("", this.f114145b, "video_post_page", "download_with_publish", "download");
                    }

                    /* renamed from: b */
                    public final void mo90235b() {
                        C45111cf.m98621a(this.f114144a);
                        C44372f.m97166a("", this.f114145b, "video_post_page", "download_with_publish", "cancel");
                    }

                    {
                        this.f114144a = r2;
                        this.f114145b = r3;
                    }
                };
                dialog.show();
            }
        }
        return false;
    }
}
