package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b;
import com.facebook.imagepipeline.p975o.C14234d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.p1921d.C36067b;
import com.p683ss.android.ugc.aweme.live.p1921d.C36068c;
import com.p683ss.android.ugc.aweme.newfollow.live.C37899a;
import com.ss.android.ugc.trill.R;
import p2628d.C52803m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.y */
public class C38014y extends C38007x {

    /* renamed from: aY */
    public FrameLayout f96777aY;

    /* renamed from: aZ */
    private C36068c f96778aZ;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.y$a */
    static final class C38015a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C38014y f96779a;

        C38015a(C38014y yVar) {
            this.f96779a = yVar;
        }

        public final void run() {
            if (!C52711k.m112239a((Object) this.f96779a.getClass(), (Object) C38014y.class) && !C52711k.m112239a((Object) this.f96779a.getClass(), (Object) C38017z.class)) {
                this.f96779a.f96761aT = false;
                this.f96779a.mo64808x();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.y$b */
    public static final class C38016b implements C36067b {

        /* renamed from: a */
        final /* synthetic */ C38014y f96780a;

        C38016b(C38014y yVar) {
            this.f96780a = yVar;
        }

        /* renamed from: a */
        public final void mo60361a(C8652b bVar, Object obj) {
            C52711k.m112240b(bVar, "message");
            StringBuilder sb = new StringBuilder("An operation is not implemented: ");
            sb.append("not implemented");
            throw new C52803m(sb.toString());
        }

        /* renamed from: a */
        public final void mo60360a(TextureView textureView, int i, int i2) {
            this.f96780a.mo77421a(i, i2);
        }
    }

    /* renamed from: a */
    public void mo77421a(int i, int i2) {
    }

    /* renamed from: K */
    public final void mo64746K() {
        super.mo64746K();
        C36068c cVar = this.f96778aZ;
        if (cVar == null) {
            C52711k.m112237a("livePlayHelper");
        }
        cVar.mo74824c();
    }

    /* renamed from: ah */
    public final void mo77431ah() {
        super.mo77431ah();
        C36068c cVar = this.f96778aZ;
        if (cVar == null) {
            C52711k.m112237a("livePlayHelper");
        }
        cVar.mo74823b();
    }

    /* renamed from: ai */
    public final FrameLayout mo77432ai() {
        FrameLayout frameLayout = this.f96777aY;
        if (frameLayout == null) {
            C52711k.m112237a("liveStreamViewContainer");
        }
        return frameLayout;
    }

    /* renamed from: ag */
    public final void mo77430ag() {
        View findViewById = this.itemView.findViewById(R.id.be8);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.…ve_stream_view_container)");
        this.f96777aY = (FrameLayout) findViewById;
        C36068c generateLivePlayHelper = C36173w.m81665a().generateLivePlayHelper(new C38015a(this), new C38016b(this));
        C52711k.m112236a((Object) generateLivePlayHelper, "ServiceManager.get().get…\n            }\n        })");
        this.f96778aZ = generateLivePlayHelper;
    }

    /* renamed from: x */
    public final void mo64808x() {
        if (mo77429af().roomCover != null) {
            if (this.f96761aT) {
                UrlModel urlModel = mo77429af().roomCover;
                C52711k.m112236a((Object) urlModel, "mRoom.roomCover");
                float width = ((float) urlModel.getWidth()) * 1.0f;
                RemoteImageView remoteImageView = this.f83053h;
                C52711k.m112236a((Object) remoteImageView, "mCoverView");
                float width2 = width / ((float) remoteImageView.getWidth());
                RemoteImageView remoteImageView2 = this.f83053h;
                UrlModel urlModel2 = mo77429af().roomCover;
                RemoteImageView remoteImageView3 = this.f83053h;
                C52711k.m112236a((Object) remoteImageView3, "mCoverView");
                int width3 = remoteImageView3.getWidth();
                RemoteImageView remoteImageView4 = this.f83053h;
                C52711k.m112236a((Object) remoteImageView4, "mCoverView");
                C23515d.m57671a(remoteImageView2, urlModel2, width3, remoteImageView4.getHeight(), (C14234d) new C37899a(5, width2, null));
                return;
            }
            RemoteImageView remoteImageView5 = this.f83053h;
            UrlModel urlModel3 = mo77429af().roomCover;
            RemoteImageView remoteImageView6 = this.f83053h;
            C52711k.m112236a((Object) remoteImageView6, "mCoverView");
            int width4 = remoteImageView6.getWidth();
            RemoteImageView remoteImageView7 = this.f83053h;
            C52711k.m112236a((Object) remoteImageView7, "mCoverView");
            C23515d.m57670a(remoteImageView5, urlModel3, width4, remoteImageView7.getHeight());
        }
    }

    /* renamed from: a */
    public final void mo77476a(LiveRoomStruct liveRoomStruct) {
        C52711k.m112240b(liveRoomStruct, "room");
        super.mo77476a(liveRoomStruct);
        if (!this.f96764aW) {
            boolean a = C52711k.m112239a((Object) getClass(), (Object) C37946aa.class);
            C36068c cVar = this.f96778aZ;
            if (cVar == null) {
                C52711k.m112237a("livePlayHelper");
            }
            FrameLayout frameLayout = this.f96777aY;
            if (frameLayout == null) {
                C52711k.m112237a("liveStreamViewContainer");
            }
            cVar.mo74822a(a, liveRoomStruct, frameLayout);
        }
    }

    /* renamed from: a */
    public void mo64756a(View view) {
        ViewStub viewStub;
        View view2;
        ViewStub viewStub2;
        View view3;
        ViewStub viewStub3;
        View view4 = null;
        if (view != null) {
            viewStub = (ViewStub) view.findViewById(R.id.cu2);
        } else {
            viewStub = null;
        }
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.a4k);
        }
        if (viewStub != null) {
            view2 = viewStub.inflate();
        } else {
            view2 = null;
        }
        mo64757a(view2, 4.0f);
        if (view != null) {
            viewStub2 = (ViewStub) view.findViewById(R.id.ctu);
        } else {
            viewStub2 = null;
        }
        if (viewStub2 != null) {
            viewStub2.setLayoutResource(R.layout.ba0);
        }
        if (viewStub2 != null) {
            view3 = viewStub2.inflate();
        } else {
            view3 = null;
        }
        mo64757a(view3, 12.0f);
        if (view != null) {
            viewStub3 = (ViewStub) view.findViewById(R.id.ctz);
        } else {
            viewStub3 = null;
        }
        if (viewStub3 != null) {
            viewStub3.setLayoutResource(R.layout.a3f);
        }
        if (viewStub3 != null) {
            view4 = viewStub3.inflate();
        }
        mo64759a(view4, 16.0f, 16.0f, 0.0f, 0.0f);
    }

    public C38014y(FollowFeedLayout followFeedLayout, C31755b bVar, C31848j jVar, C31754a aVar) {
        C52711k.m112240b(followFeedLayout, "view");
        C52711k.m112240b(bVar, "provider");
        C52711k.m112240b(jVar, "scrollStateManager");
        C52711k.m112240b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, aVar);
    }
}
