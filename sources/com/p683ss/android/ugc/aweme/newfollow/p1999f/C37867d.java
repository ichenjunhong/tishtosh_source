package com.p683ss.android.ugc.aweme.newfollow.p1999f;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.newfollow.p1994a.C37837a;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37997r;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.video.IAVPublishService.OnPublishCallback;
import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.C43856fy;
import com.p683ss.android.ugc.aweme.shortvideo.C44334o;
import com.p683ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44371e;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.f.d */
public final class C37867d implements C44334o<CreateAwemeResponse> {

    /* renamed from: a */
    Context f96398a;

    /* renamed from: b */
    public String f96399b;

    /* renamed from: c */
    public OnPublishCallback f96400c;

    /* renamed from: d */
    C44371e f96401d;

    /* renamed from: e */
    public C37997r f96402e;

    /* renamed from: f */
    public Bitmap f96403f;

    /* renamed from: g */
    volatile boolean f96404g;

    /* renamed from: h */
    private int f96405h;

    /* renamed from: i */
    private boolean f96406i;

    /* renamed from: j */
    private boolean f96407j;

    /* renamed from: k */
    private Handler f96408k = new Handler(Looper.getMainLooper());

    public final void onSynthetiseSuccess(String str) {
    }

    /* renamed from: a */
    public final void mo77309a() {
        if (this.f96401d != null) {
            m84529a(this.f96405h, this.f96406i);
        }
    }

    /* renamed from: a */
    public final void mo77310a(C44371e eVar) {
        this.f96401d = eVar;
        if (this.f96401d != null) {
            this.f96401d.mo80718a(this);
        }
        if (this.f96402e != null) {
            this.f96402e.mo77465l();
        }
    }

    /* renamed from: a */
    public final void mo77311a(boolean z) {
        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C37873g(this, z));
    }

    public final void onError(C43856fy fyVar) {
        this.f96407j = false;
        if (this.f96400c != null) {
            this.f96400c.onStopPublish();
        }
        if (this.f96402e != null) {
            this.f96402e.mo77457a((FollowFeed) null, false);
        }
        if (fyVar.isRecover()) {
            mo77311a(fyVar.isCauseByApiServerException());
        }
        if (this.f96401d != null) {
            this.f96401d.mo80720b(this);
        }
        this.f96408k.post(new Runnable() {
            public final void run() {
                if (C37867d.this.f96403f != null) {
                    C37867d.this.f96403f.recycle();
                    C37867d.this.f96403f = null;
                }
            }
        });
    }

    public C37867d(Context context, String str) {
        this.f96398a = context;
        this.f96399b = str;
    }

    public final void onProgressUpdate(int i, boolean z) {
        m84529a(i, z);
        if (z && !this.f96407j && TextUtils.equals(this.f96399b, "homepage_friends")) {
            this.f96407j = true;
            if (this.f96398a != null) {
                this.f96408k.post(new C37874h(this));
            }
        }
    }

    /* renamed from: a */
    private void m84529a(int i, boolean z) {
        this.f96405h = i;
        this.f96406i = z;
        if ((this.f96403f == null || this.f96403f.isRecycled()) && !this.f96404g && this.f96401d != null) {
            this.f96404g = true;
            C0013i.m16a((Callable<TResult>) new C37871e<TResult>(this)).mo20a((C0011g<TResult, TContinuationResult>) new C37872f<TResult,TContinuationResult>(this), C0013i.f25b);
        }
        if (this.f96402e != null) {
            C37997r rVar = this.f96402e;
            Bitmap bitmap = this.f96403f;
            if (rVar.f83139f != null && rVar.mo77464k()) {
                rVar.mo64861a(4);
                if (rVar.f83135b != null && rVar.f83135b.getScrollState() == 0 && !rVar.f83135b.mo4875i()) {
                    ((C37837a) rVar.f83139f).mo77275a(i, bitmap, z);
                }
            }
        }
    }

    public final /* synthetic */ void onSuccess(C42421al alVar, boolean z) {
        CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) alVar;
        boolean z2 = false;
        this.f96407j = false;
        if (this.f96400c != null) {
            this.f96400c.onStopPublish();
        }
        if (this.f96401d != null) {
            this.f96401d.mo80720b(this);
        }
        FollowFeed followFeed = null;
        if (createAwemeResponse != null) {
            Aweme aweme = createAwemeResponse.aweme;
            if (aweme != null) {
                aweme.setRequestId(createAwemeResponse.getRequestId());
                followFeed = new FollowFeed(aweme);
                C29981aa.m70153a().mo60162a(createAwemeResponse.getRequestId(), createAwemeResponse.getLogPbBean());
            }
        }
        if (this.f96402e != null) {
            if (!(followFeed == null || followFeed.getAweme() == null || C47950q.m103755d(followFeed.getAweme()))) {
                z2 = true;
            }
            this.f96402e.mo77457a(followFeed, z2);
            C45407ay.m98968a("PublishDurationMonitor MANUAL_END hideUploadItem");
        }
        this.f96408k.post(new Runnable() {
            public final void run() {
                if (C37867d.this.f96403f != null) {
                    C37867d.this.f96403f.recycle();
                    C37867d.this.f96403f = null;
                }
            }
        });
    }
}
