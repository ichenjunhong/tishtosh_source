package com.twitter.sdk.android.tweetui;

import android.view.View;
import android.view.View.OnClickListener;
import com.twitter.sdk.android.core.C52068b;
import com.twitter.sdk.android.core.C52077i;
import com.twitter.sdk.android.core.C52190l;
import com.twitter.sdk.android.core.C52219n;
import com.twitter.sdk.android.core.C52229t;
import com.twitter.sdk.android.core.C52231v;
import com.twitter.sdk.android.core.models.C52209m;
import com.twitter.sdk.android.core.models.C52210n;

/* renamed from: com.twitter.sdk.android.tweetui.e */
final class C52267e extends C52263a implements OnClickListener {

    /* renamed from: b */
    final C52209m f130135b;

    /* renamed from: c */
    final C52307o f130136c;

    /* renamed from: d */
    final C52312r f130137d;

    /* renamed from: e */
    final C52310p f130138e;

    /* renamed from: com.twitter.sdk.android.tweetui.e$a */
    static class C52268a extends C52068b<C52209m> {

        /* renamed from: a */
        final ToggleImageButton f130139a;

        /* renamed from: b */
        final C52209m f130140b;

        /* renamed from: c */
        final C52068b<C52209m> f130141c;

        /* renamed from: a */
        public final void mo23366a(C52077i<C52209m> iVar) {
            this.f130141c.mo23366a(iVar);
        }

        /* renamed from: a */
        public final void mo23367a(C52229t tVar) {
            if (tVar instanceof C52219n) {
                int errorCode = ((C52219n) tVar).getErrorCode();
                if (errorCode == 139) {
                    this.f130141c.mo23366a(new C52077i<>(new C52210n().mo108931a(this.f130140b).mo108932a(true).mo108930a(), null));
                } else if (errorCode != 144) {
                    this.f130139a.setToggledOn(this.f130140b.f129967g);
                    this.f130141c.mo23367a(tVar);
                } else {
                    this.f130141c.mo23366a(new C52077i<>(new C52210n().mo108931a(this.f130140b).mo108932a(false).mo108930a(), null));
                }
            } else {
                this.f130139a.setToggledOn(this.f130140b.f129967g);
                this.f130141c.mo23367a(tVar);
            }
        }

        C52268a(ToggleImageButton toggleImageButton, C52209m mVar, C52068b<C52209m> bVar) {
            this.f130139a = toggleImageButton;
            this.f130140b = mVar;
            this.f130141c = bVar;
        }
    }

    public final void onClick(View view) {
        if (view instanceof ToggleImageButton) {
            ToggleImageButton toggleImageButton = (ToggleImageButton) view;
            if (this.f130135b.f129967g) {
                this.f130138e.mo109121c(this.f130135b);
                C52307o oVar = this.f130136c;
                long j = this.f130135b.f129969i;
                C52268a aVar = new C52268a(toggleImageButton, this.f130135b, this.f130130a);
                C523092 r2 = new C52269f<C52231v>(aVar, C52190l.m111621c(), j, aVar) {

                    /* renamed from: a */
                    final /* synthetic */ long f130263a;

                    /* renamed from: b */
                    final /* synthetic */ C52068b f130264b;

                    /* renamed from: a */
                    public final void mo23366a(C52077i<C52231v> iVar) {
                        C52307o.this.f130255a.mo108949a((C52231v) iVar.f129666a).mo108922b().destroy(Long.valueOf(this.f130263a), Boolean.valueOf(false)).mo110595a(this.f130264b);
                    }

                    {
                        this.f130263a = r4;
                        this.f130264b = r6;
                    }
                };
                oVar.mo109118a(r2);
                return;
            }
            this.f130138e.mo109120b(this.f130135b);
            C52307o oVar2 = this.f130136c;
            long j2 = this.f130135b.f129969i;
            C52268a aVar2 = new C52268a(toggleImageButton, this.f130135b, this.f130130a);
            C523081 r22 = new C52269f<C52231v>(aVar2, C52190l.m111621c(), j2, aVar2) {

                /* renamed from: a */
                final /* synthetic */ long f130260a;

                /* renamed from: b */
                final /* synthetic */ C52068b f130261b;

                /* renamed from: a */
                public final void mo23366a(C52077i<C52231v> iVar) {
                    C52307o.this.f130255a.mo108949a((C52231v) iVar.f129666a).mo108922b().create(Long.valueOf(this.f130260a), Boolean.valueOf(false)).mo110595a(this.f130261b);
                }

                {
                    this.f130260a = r4;
                    this.f130261b = r6;
                }
            };
            oVar2.mo109118a(r22);
        }
    }

    C52267e(C52209m mVar, C52312r rVar, C52068b<C52209m> bVar) {
        this(mVar, rVar, bVar, new C52311q(rVar));
    }

    private C52267e(C52209m mVar, C52312r rVar, C52068b<C52209m> bVar, C52310p pVar) {
        super(bVar);
        this.f130135b = mVar;
        this.f130137d = rVar;
        this.f130138e = pVar;
        this.f130136c = rVar.f130272f;
    }
}
