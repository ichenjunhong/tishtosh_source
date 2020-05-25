package com.p683ss.android.ugc.aweme.shortvideo.sticker.p2227b;

import android.app.Activity;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.scene.C18998a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.gamora.editor.EditViewModel;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.d */
public final class C44534d extends C44526a {

    /* renamed from: h */
    public VideoPublishEditModel f112701h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.d$a */
    static final class C44535a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44534d f112702a;

        C44535a(C44534d dVar) {
            this.f112702a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f112702a.mo90467b();
            C44541f fVar = this.f112702a.f112692f;
            if (fVar != null) {
                fVar.mo88480c();
            }
            this.f112702a.f112690d.mo88524a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.d$b */
    static final class C44536b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44534d f112703a;

        C44536b(C44534d dVar) {
            this.f112703a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f112703a.mo90467b();
            C44541f fVar = this.f112703a.f112692f;
            if (fVar != null) {
                fVar.mo88478a();
            }
            this.f112703a.f112690d.mo88524a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.d$c */
    static final class C44537c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44534d f112704a;

        C44537c(C44534d dVar) {
            this.f112704a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f112704a.mo90467b();
            C44541f fVar = this.f112704a.f112692f;
            if (fVar != null) {
                fVar.mo88482e();
            }
            this.f112704a.f112690d.mo88524a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.d$d */
    static final class C44538d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44534d f112705a;

        C44538d(C44534d dVar) {
            this.f112705a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f112705a.mo90467b();
            C44541f fVar = this.f112705a.f112692f;
            if (fVar != null) {
                fVar.mo88481d();
            }
            this.f112705a.f112690d.mo88524a(true);
        }
    }

    /* renamed from: c */
    public final View mo90468c() {
        LinearLayout d = mo90469d();
        LinearLayout a = mo90464a(R.drawable.cco, R.string.alc);
        a.setOnClickListener(new C44535a(this));
        LinearLayout a2 = mo90464a(R.drawable.ea, R.string.akz);
        a2.setOnClickListener(new C44536b(this));
        LinearLayout a3 = mo90464a(R.drawable.e_, R.string.fo1);
        a3.setOnClickListener(new C44537c(this));
        LinearLayout a4 = mo90464a(R.drawable.d4i, R.string.ao2);
        a4.setOnClickListener(new C44538d(this));
        if (this.f112687a) {
            d.addView(a3);
            d.addView(a4);
            return d;
        }
        boolean z = false;
        if (C39629l.m88232a().mo58583n().mo83103a(C40790a.StudioStickerPinEnable) && this.f112701h != null) {
            VideoPublishEditModel videoPublishEditModel = this.f112701h;
            if (videoPublishEditModel == null || videoPublishEditModel.videoType != 7) {
                VideoPublishEditModel videoPublishEditModel2 = this.f112701h;
                if (videoPublishEditModel2 == null || videoPublishEditModel2.videoType != 8) {
                    VideoPublishEditModel videoPublishEditModel3 = this.f112701h;
                    if (videoPublishEditModel3 == null || videoPublishEditModel3.videoType != 9) {
                        Context context = this.f112691e.getContext();
                        C52711k.m112236a((Object) context, "contentView.context");
                        Activity a5 = C18998a.m46169a(context);
                        if (a5 != null) {
                            JediViewModel a6 = C48927d.m105736a((FragmentActivity) a5).mo96760a(EditViewModel.class);
                            C52711k.m112236a((Object) a6, "JediViewModelProviders.o…ditViewModel::class.java)");
                            if (!((EditViewModel) a6).mo97047q()) {
                                z = true;
                            }
                        } else {
                            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                    }
                }
            }
        }
        if (z) {
            d.addView(a);
            d.addView(mo90470e());
        }
        d.addView(a2);
        return d;
    }

    public C44534d(View view, C44541f fVar) {
        C52711k.m112240b(view, "contentView");
        super(view, fVar);
    }
}
