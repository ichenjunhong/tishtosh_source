package com.p683ss.android.ugc.aweme.tools.draft;

import android.content.Context;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39535f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39536g;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45546c;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.x */
public final class C47025x implements C39536g {

    /* renamed from: a */
    private C39535f f118770a = C39618d.f101168i.mo80562a((C39536g) this);

    /* renamed from: b */
    private C45547d f118771b;

    /* renamed from: c */
    private C29059c f118772c;

    /* renamed from: d */
    private Context f118773d;

    /* renamed from: a */
    public final void mo94314a() {
        this.f118771b = C45546c.m99207a(this.f118773d, this.f118773d.getResources().getString(R.string.e1s));
        this.f118771b.setIndeterminate(true);
        this.f118770a.mo80630a(new Object[0]);
    }

    public C47025x(Context context, C29059c cVar) {
        this.f118772c = cVar;
        this.f118773d = context;
    }

    /* renamed from: a */
    public final void mo80631a(Exception exc, String str) {
        this.f118771b.hide();
        PhotoMovieContext convertFromDraft = PhotoMovieContext.convertFromDraft(this.f118772c);
        if (convertFromDraft != null) {
            C44403a.m97196a().mo48303a(this.f118773d, convertFromDraft, (List<? extends C42482c>) new ArrayList<Object>());
        }
    }

    /* renamed from: a */
    public final void mo80632a(List<C42482c> list, String str) {
        this.f118771b.hide();
        PhotoMovieContext convertFromDraft = PhotoMovieContext.convertFromDraft(this.f118772c);
        if (convertFromDraft != null) {
            C44403a.m97196a().mo48303a(this.f118773d, convertFromDraft, list);
        }
    }
}
