package com.p683ss.android.ugc.aweme.discover.p1645g;

import com.p683ss.android.ugc.aweme.app.api.C22990h;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p683ss.android.ugc.aweme.discover.p1644f.C28116e;
import com.p683ss.android.ugc.aweme.discover.p1645g.C28127h;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28483al;
import java.util.concurrent.CancellationException;

/* renamed from: com.ss.android.ugc.aweme.discover.g.i */
public class C28128i<T extends C28127h> extends C26876b<T> {

    /* renamed from: a */
    public boolean f73865a;

    /* renamed from: b */
    public C28483al f73866b;

    public final void aq_() {
        if (this.f70700f != null) {
            ((C28127h) this.f70700f).mo56534b();
        }
        super.aq_();
    }

    /* renamed from: b */
    public void mo44838b() {
        this.f73865a = true;
        super.mo44838b();
        if (((C28127h) this.f70700f).mListQueryType == 1) {
            if (this.f73866b != null) {
                m66953a(this.f73866b);
                this.f73866b.mo58145a(((C28127h) this.f70700f).mo56538e());
                this.f73866b.mo56555a(((C28127h) this.f70700f).mo56541h());
                this.f73866b.mo58147a(((C28127h) this.f70700f).mo56539f());
                this.f73866b.mo58144a(((C28127h) this.f70700f).mo56540g());
                this.f73866b.mo58146a((SearchApiResult) ((C28127h) this.f70700f).getData());
                return;
            }
            if (this.f70701g instanceof C28483al) {
                m66953a((C28483al) this.f70701g);
                ((C28483al) this.f70701g).mo58145a(((C28127h) this.f70700f).mo56538e());
                ((C28483al) this.f70701g).mo56555a(((C28127h) this.f70700f).mo56541h());
                ((C28483al) this.f70701g).mo58147a(((C28127h) this.f70700f).mo56539f());
                ((C28483al) this.f70701g).mo58144a(((C28127h) this.f70700f).mo56540g());
                ((C28483al) this.f70701g).mo58146a((SearchApiResult) ((C28127h) this.f70700f).getData());
            }
        }
    }

    /* renamed from: a */
    public final void mo54800a(C26877c cVar) {
        super.mo54800a(cVar);
        if (cVar instanceof C28483al) {
            this.f73866b = (C28483al) cVar;
        }
    }

    /* renamed from: b */
    public final void mo56544b(int i) {
        if (this.f70700f != null) {
            ((C28127h) this.f70700f).f73862i = i;
        }
    }

    /* renamed from: a */
    public void mo56543a(String str) {
        if (this.f70700f != null) {
            ((C28127h) this.f70700f).mo56533a(str);
        }
    }

    /* renamed from: a_ */
    public final boolean mo44934a_(Object... objArr) {
        if (this.f70700f != null) {
            if (this.f73866b != null) {
                ((C28127h) this.f70700f).f73860g = this.f73866b.mo58148r();
            }
            ((C28127h) this.f70700f).mo56534b();
        }
        if (this.f73866b != null) {
            C28116e.m66923a(this.f73866b.mo58148r()).mo56512a();
        }
        return super.mo44934a_(objArr);
    }

    /* renamed from: c_ */
    public void mo44840c_(Exception exc) {
        if (!(exc instanceof CancellationException)) {
            this.f73865a = false;
            super.mo44840c_(exc);
            C28483al alVar = this.f73866b;
            if (alVar == null && (this.f70701g instanceof C28483al)) {
                alVar = (C28483al) this.f70701g;
            }
            if (alVar != null) {
                C28116e.m66923a(alVar.mo58148r()).mo56516b().mo56517b(1).mo56518b(exc.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m66953a(C28483al alVar) {
        if (this.f70700f != null && ((C28127h) this.f70700f).getItems() != null) {
            C28116e.m66923a(alVar.mo58148r()).mo56519c(((C28127h) this.f70700f).getItems().size()).mo56516b().mo56515a(((C28127h) this.f70700f).f73863j).mo56514a((C22990h) (SearchApiResult) ((C28127h) this.f70700f).getData()).mo56517b(0);
        }
    }
}
