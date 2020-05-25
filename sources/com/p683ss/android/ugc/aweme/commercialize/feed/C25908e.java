package com.p683ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22317a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.e */
public final class C25908e implements C25909f {

    /* renamed from: a */
    public Aweme f68446a;

    /* renamed from: b */
    public Context f68447b;

    /* renamed from: c */
    public C25874af f68448c;

    /* renamed from: d */
    private boolean f68449d;

    /* renamed from: k */
    public final void mo53255k() {
        mo53243a(null);
    }

    /* renamed from: l */
    private boolean m62856l() {
        if (!this.f68449d) {
            return false;
        }
        this.f68449d = false;
        return true;
    }

    /* renamed from: b */
    public final boolean mo53246b() {
        if (this.f68448c == null) {
            return false;
        }
        return this.f68448c.hasLandPage();
    }

    /* renamed from: c */
    public final boolean mo53247c() {
        if (this.f68448c == null) {
            return false;
        }
        return this.f68448c.hasOpenUrl();
    }

    /* renamed from: d */
    public final boolean mo53248d() {
        if (this.f68448c == null) {
            return true;
        }
        return this.f68448c.isRealAuthor();
    }

    /* renamed from: e */
    public final boolean mo53249e() {
        if (this.f68448c == null) {
            return true;
        }
        return this.f68448c.enableComment();
    }

    /* renamed from: f */
    public final boolean mo53250f() {
        if (this.f68448c == null) {
            return false;
        }
        return this.f68448c.isDownloadMode();
    }

    /* renamed from: g */
    public final void mo53251g() {
        if (this.f68448c != null) {
            this.f68448c.mo53180b(this.f68447b, this.f68446a);
        }
    }

    /* renamed from: h */
    public final void mo53252h() {
        if (this.f68448c != null) {
            this.f68448c.mo53182c(this.f68447b, this.f68446a);
        }
    }

    /* renamed from: i */
    public final void mo53253i() {
        if (this.f68448c != null) {
            this.f68448c.mo53185e(this.f68447b, this.f68446a);
        }
    }

    /* renamed from: j */
    public final void mo53254j() {
        IFeedTypeService createIFeedTypeServicebyMonsterPlugin = FeedTypeServiceImpl.createIFeedTypeServicebyMonsterPlugin();
        if (createIFeedTypeServicebyMonsterPlugin != null) {
            this.f68448c = createIFeedTypeServicebyMonsterPlugin.getNonAdType();
        }
    }

    /* renamed from: a */
    public final boolean mo53244a() {
        if (this.f68448c == null) {
            return false;
        }
        return this.f68448c.mo53178a();
    }

    /* renamed from: a */
    public final void mo53243a(String str) {
        if (this.f68448c != null) {
            this.f68448c.mo53175a(this.f68447b, this.f68446a, (String) null);
        }
    }

    /* renamed from: a */
    public final boolean mo53245a(int i) {
        if (this.f68448c == null) {
            return false;
        }
        return this.f68448c.mo53179a(this.f68447b, this.f68446a, i);
    }

    /* renamed from: a */
    public final void mo53240a(Context context, Aweme aweme) {
        this.f68446a = aweme;
        this.f68447b = context;
        if (this.f68447b != null && this.f68446a != null) {
            IFeedTypeService createIFeedTypeServicebyMonsterPlugin = FeedTypeServiceImpl.createIFeedTypeServicebyMonsterPlugin();
            if (createIFeedTypeServicebyMonsterPlugin != null) {
                this.f68448c = createIFeedTypeServicebyMonsterPlugin.valueOf(aweme);
            }
            this.f68449d = false;
        }
    }

    /* renamed from: a */
    public final void mo53239a(int i, int i2) {
        switch (i) {
            case 1:
                if (!m62856l() && this.f68448c != null) {
                    this.f68448c.mo53181b(this.f68447b, this.f68446a, i2);
                    return;
                }
            case 2:
                if (!m62856l() && this.f68448c != null) {
                    this.f68448c.mo53183c(this.f68447b, this.f68446a, i2);
                    break;
                }
            case 3:
                this.f68449d = true;
                C22317a.m55223a().f60116c.mo46437c(this.f68447b, this.f68446a);
                return;
        }
    }

    /* renamed from: a */
    public final void mo53241a(Context context, Aweme aweme, String str) {
        if (aweme != null && aweme.isAd()) {
            aweme.getAwemeRawAd().setPageFrom(str);
        }
        mo53240a(context, aweme);
    }

    /* renamed from: a */
    public final void mo53242a(Aweme aweme, String str, long j, int i) {
        if (this.f68448c != null) {
            this.f68448c.mo53174a(this.f68447b, this.f68446a, aweme, str, j, i);
        }
    }
}
