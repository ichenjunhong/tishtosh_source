package com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.graphics.drawable.Animatable;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.fresco.animation.p952c.C13877a;
import com.facebook.fresco.animation.p952c.C13882b;
import com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder.C28363f.C28364a;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.g */
public final class C28365g extends C28363f {

    /* renamed from: b */
    public C28368a f74463b;

    /* renamed from: c */
    public boolean f74464c;

    /* renamed from: h */
    private C13882b f74465h;

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.g$a */
    public interface C28368a {
        /* renamed from: a */
        void mo56248a();
    }

    /* renamed from: b */
    public final void mo56768b() {
        super.mo56768b();
        mo64973q();
    }

    /* renamed from: j */
    public final void mo56781j() {
        super.mo56781j();
        this.f74464c = false;
    }

    /* renamed from: k */
    public final void mo56782k() {
        super.mo56782k();
        this.f74464c = false;
    }

    /* renamed from: l */
    public final void mo56783l() {
        if (mo56773g() instanceof SmartImageView) {
            SmartImageView smartImageView = (SmartImageView) mo56773g();
            if (smartImageView.getController() != null) {
                Animatable i = smartImageView.getController().mo25749i();
                if (i instanceof C13877a) {
                    ((C13877a) i).mo26025a(this.f74465h);
                }
            }
        }
        if (this.f74464c) {
            mo56768b();
        }
    }

    /* renamed from: a */
    public final void mo56767a(int i) {
        super.mo56767a(i);
        mo64973q();
    }

    public C28365g(final C28364a aVar) {
        super(aVar);
        this.f74465h = new C13882b() {
            /* renamed from: a */
            public final void mo26041a(C13877a aVar, int i) {
            }

            /* renamed from: b */
            public final void mo26042b(C13877a aVar) {
            }

            /* renamed from: c */
            public final void mo26043c(C13877a aVar) {
            }

            /* renamed from: a */
            public final void mo26040a(final C13877a aVar) {
                aVar.aP_().postDelayed(new Runnable() {
                    public final void run() {
                        if (aVar.isRunning() && C28365g.this.f74463b != null) {
                            C28365g.this.f74463b.mo56248a();
                        }
                    }
                }, 3000);
            }
        };
    }
}
