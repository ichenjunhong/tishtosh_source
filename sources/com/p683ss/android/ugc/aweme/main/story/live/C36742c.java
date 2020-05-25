package com.p683ss.android.ugc.aweme.main.story.live;

import android.view.View;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.main.story.live.p1946a.C36733a;
import com.p683ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import com.p683ss.android.ugc.aweme.main.story.live.view.C36745a.C36746a;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.main.story.live.c */
public class C36742c implements C36732a {

    /* renamed from: a */
    protected AbsLiveStoryItemView f93905a;

    /* renamed from: b */
    protected C36733a f93906b;

    /* renamed from: c */
    protected boolean f93907c;

    /* renamed from: d */
    private C36746a f93908d = new C36746a() {
        /* renamed from: a */
        public final void mo75848a() {
            C36742c.this.f93906b.mo53034b();
        }

        /* renamed from: a */
        public final void mo75849a(int i) {
            if (!C36742c.this.f93907c) {
                C36742c.this.f93905a.setVisibility(8);
            } else if (i == 0) {
                C36742c.this.mo75837b();
            } else if (i == 4) {
                C36742c.this.f93906b.mo53035c();
            } else {
                if (i == 8) {
                    C36742c.this.mo75834a();
                }
            }
        }
    };

    /* renamed from: c */
    public final View mo75838c() {
        return this.f93905a;
    }

    /* renamed from: a */
    public final void mo75834a() {
        this.f93906b.mo53034b();
    }

    /* renamed from: b */
    public final void mo75837b() {
        this.f93906b.mo53031a();
    }

    /* renamed from: a */
    public final void mo75836a(String str) {
        this.f93905a.f93914i = str;
    }

    /* renamed from: a */
    public final void mo75835a(C36744d dVar) {
        if (dVar == null || C9376b.m18558a((Collection<T>) dVar.f93910a)) {
            this.f93905a.setVisibility(8);
        } else if (!dVar.f93911b || this.f93906b == null) {
            this.f93905a.setVisibility(8);
        } else {
            this.f93906b.mo75839a(dVar.f93910a);
            this.f93907c = true;
            this.f93905a.setVisibility(0);
            this.f93905a.setRequestId(dVar.getRequestId());
            new String[1][0] = "2";
            if (FollowStatus.class.getSimpleName().equals("LiveEvent")) {
                C47718bf.m103288a(new FollowStatus());
            }
        }
    }

    public C36742c(AbsLiveStoryItemView absLiveStoryItemView, C36733a aVar) {
        this.f93905a = absLiveStoryItemView;
        this.f93906b = aVar;
        this.f93905a.setListener(this.f93908d);
    }
}
