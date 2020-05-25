package com.p683ss.android.ugc.aweme.common.p1589a;

import android.view.View;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.bytedance.lighten.p766a.p769c.C12166a;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.image.C35482b;
import com.p683ss.android.ugc.aweme.image.C35482b.C35483a;
import com.p683ss.android.ugc.aweme.utils.C47788ct;

/* renamed from: com.ss.android.ugc.aweme.common.a.a */
public abstract class C26833a extends C26838e<Aweme> {

    /* renamed from: i */
    protected C35483a f70659i;

    /* renamed from: j */
    protected C12166a f70660j = new C12166a() {
        /* renamed from: a */
        public final void mo23084a() {
            C26833a aVar = C26833a.this;
            if (!aVar.f70668n && C10181b.m20511a().mo18172a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", 31744, false)) {
                aVar.f70666l.mo23138c();
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo54755e() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int[] mo50307b() {
        return C47788ct.m103417a(200);
    }

    /* renamed from: d */
    public final Aweme mo54754d() {
        return (Aweme) this.f70665k;
    }

    public C26833a(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo54753a(Video video, String str) {
        if (mo54781g()) {
            if (C35482b.f91208a.mo73885a(this.f70666l, video, str, mo54755e(), this.f70659i, null)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54752a(UrlModel urlModel, String str) {
        C12208t a = C12203q.m24645a((Object) C23608p.m57874a(urlModel));
        int[] b = mo50307b();
        if (b != null) {
            a.mo23125b(b);
        }
        a.mo23116a((C12197k) this.f70666l).mo23118a(str).mo23121a();
        if (this.f70665k != null && ((Aweme) this.f70665k).getVideo() != null) {
            ((Aweme) this.f70665k).getVideo().setCachedOuterCoverUrl(urlModel);
            ((Aweme) this.f70665k).getVideo().setCachedOuterCoverSize(b);
        }
    }
}
