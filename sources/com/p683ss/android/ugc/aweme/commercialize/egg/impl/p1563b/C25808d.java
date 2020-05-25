package com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1563b;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1564c.C25815a;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25749d;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25750e;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25773a;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1561f.C25781b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.d */
public final class C25808d extends C25797a {

    /* renamed from: h */
    public C25781b f68245h;

    /* renamed from: i */
    public long f68246i;

    /* renamed from: j */
    public boolean f68247j;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.d$a */
    static final class C25809a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25808d f68248a;

        C25809a(C25808d dVar) {
            this.f68248a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f68248a.f68246i);
            C25749d dVar = this.f68248a.f68223d;
            if (dVar != null) {
                C52711k.m112236a((Object) view, "v");
                dVar.mo52943a(view, currentTimeMillis);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.d$b */
    public static final class C25810b implements C25750e {

        /* renamed from: a */
        final /* synthetic */ C25808d f68249a;

        /* renamed from: a */
        public final void mo52949a() {
            C25749d dVar = this.f68249a.f68223d;
            if (dVar != null) {
                dVar.mo52942a();
            }
            if (!this.f68249a.f68247j) {
                this.f68249a.f68247j = true;
                this.f68249a.mo53005c();
            }
        }

        C25810b(C25808d dVar) {
            this.f68249a = dVar;
        }

        /* renamed from: a */
        public final void mo52950a(String str) {
            C25749d dVar = this.f68249a.f68223d;
            if (dVar != null) {
                dVar.mo52945b();
            }
            this.f68249a.mo53003a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.d$c */
    static final class C25811c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25808d f68250a;

        C25811c(C25808d dVar) {
            this.f68250a = dVar;
        }

        public final void onClick(View view) {
            View view2;
            ClickInstrumentation.onClick(view);
            C25749d dVar = this.f68250a.f68223d;
            if (dVar != null) {
                C25781b bVar = this.f68250a.f68245h;
                if (bVar != null) {
                    view2 = bVar.mo52968a();
                } else {
                    view2 = null;
                }
                C52711k.m112236a((Object) view, "v");
                dVar.mo52944a(view2, view);
            }
        }
    }

    /* renamed from: b */
    public final void mo53004b() {
        C25781b bVar = this.f68245h;
        if (bVar != null) {
            this.f68226g.removeView(bVar.mo52968a());
            this.f68226g.setVisibility(8);
            bVar.mo52968a().setVisibility(8);
            this.f68245h = null;
        }
    }

    /* renamed from: a */
    public final void mo53002a() {
        String str;
        boolean z;
        C25773a aVar = this.f68222c;
        View view = null;
        if (aVar != null) {
            str = aVar.f68153a;
        } else {
            str = null;
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C25749d dVar = this.f68223d;
            if (dVar != null) {
                dVar.mo52945b();
            }
            mo53003a("materialUrl为空");
            return;
        }
        if (this.f68245h == null) {
            this.f68245h = C25815a.m62455a().mo52807a(this.f68221b, str);
            FrameLayout frameLayout = this.f68226g;
            C25781b bVar = this.f68245h;
            if (bVar != null) {
                view = bVar.mo52968a();
            }
            frameLayout.addView(view);
        }
        C25781b bVar2 = this.f68245h;
        if (bVar2 != null) {
            C25749d dVar2 = this.f68223d;
            if (dVar2 != null) {
                dVar2.mo52946b(bVar2.mo52968a(), this.f68226g);
            }
            bVar2.mo52968a().setOnClickListener(new C25809a(this));
            bVar2.mo52969a(new C25810b(this));
        }
        this.f68226g.setOnClickListener(new C25811c(this));
        this.f68226g.setVisibility(0);
        C25781b bVar3 = this.f68245h;
        if (bVar3 != null) {
            View a = bVar3.mo52968a();
            if (a != null) {
                a.setVisibility(0);
            }
        }
        this.f68246i = System.currentTimeMillis();
        C25781b bVar4 = this.f68245h;
        if (bVar4 != null) {
            this.f68247j = false;
            bVar4.mo52970b();
        }
    }

    public C25808d(FrameLayout frameLayout) {
        C52711k.m112240b(frameLayout, "eggLayout");
        super(frameLayout);
    }
}
