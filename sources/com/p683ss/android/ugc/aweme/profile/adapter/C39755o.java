package com.p683ss.android.ugc.aweme.profile.adapter;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p683ss.android.ugc.aweme.live.feedpage.C36083b;
import com.p683ss.android.ugc.aweme.live.p1921d.C36067b;
import com.p683ss.android.ugc.aweme.live.p1921d.C36068c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2088f.C39870a;
import com.p683ss.android.ugc.aweme.profile.service.C40026s;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.o */
public final class C39755o extends C1352v implements C0199s<Boolean> {

    /* renamed from: k */
    public static final C39757a f101495k = new C39757a(null);

    /* renamed from: a */
    public final TextView f101496a;

    /* renamed from: b */
    public final RemoteImageView f101497b;

    /* renamed from: c */
    public final FrameLayout f101498c;

    /* renamed from: d */
    public final TextView f101499d;

    /* renamed from: e */
    public final TextView f101500e;

    /* renamed from: f */
    public LiveRoomStruct f101501f;

    /* renamed from: g */
    final C39870a f101502g = C40026s.f101964a.mainAnimViewModel(this.f101505j);

    /* renamed from: h */
    boolean f101503h;

    /* renamed from: i */
    public final C36068c f101504i;

    /* renamed from: j */
    public final FragmentActivity f101505j;

    /* renamed from: l */
    private C1710e<C36083b> f101506l;

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.o$a */
    public static final class C39757a {
        private C39757a() {
        }

        public /* synthetic */ C39757a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.o$b */
    static final class C39758b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39755o f101508a;

        C39758b(C39755o oVar) {
            this.f101508a = oVar;
        }

        public final void run() {
            this.f101508a.f101496a.setVisibility(0);
            this.f101508a.f101498c.setVisibility(0);
            this.f101508a.f101499d.setVisibility(0);
            this.f101508a.f101497b.setVisibility(8);
            this.f101508a.f101500e.setVisibility(8);
            this.f101508a.f101497b.postDelayed(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C39758b f101509a;

                {
                    this.f101509a = r1;
                }

                public final void run() {
                    this.f101509a.f101508a.f101504i.mo74821a(true);
                }
            }, 1000);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.o$c */
    public static final class C39760c implements C36067b {

        /* renamed from: a */
        final /* synthetic */ C39755o f101510a;

        /* renamed from: com.ss.android.ugc.aweme.profile.adapter.o$c$a */
        static final class C39761a extends C52712l implements C52671b<View, C52860x> {

            /* renamed from: a */
            public static final C39761a f101511a = new C39761a();

            C39761a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                View view = (View) obj;
                C52711k.m112240b(view, "$receiver");
                view.setVisibility(0);
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.adapter.o$c$b */
        static final class C39762b extends C52712l implements C52671b<View, C52860x> {

            /* renamed from: a */
            public static final C39762b f101512a = new C39762b();

            C39762b() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                View view = (View) obj;
                C52711k.m112240b(view, "$receiver");
                view.setVisibility(8);
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.adapter.o$c$c */
        static final class C39763c extends C52712l implements C52671b<View, C52860x> {

            /* renamed from: a */
            public static final C39763c f101513a = new C39763c();

            C39763c() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                View view = (View) obj;
                C52711k.m112240b(view, "$receiver");
                view.setVisibility(8);
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public final void mo60360a(TextureView textureView, int i, int i2) {
        }

        C39760c(C39755o oVar) {
            this.f101510a = oVar;
        }

        /* renamed from: a */
        public final void mo60361a(C8652b bVar, Object obj) {
            C52711k.m112240b(bVar, "message");
            switch (C39770p.f101522a[bVar.ordinal()]) {
                case 1:
                    C39755o.m88476a(new View[]{this.f101510a.f101496a, this.f101510a.f101498c, this.f101510a.f101499d}, C39761a.f101511a);
                    C39755o.m88476a(new View[]{this.f101510a.f101497b, this.f101510a.f101500e}, C39762b.f101512a);
                    return;
                case 2:
                    C39755o.m88476a(new View[]{this.f101510a.f101496a, this.f101510a.f101498c, this.f101510a.f101499d, this.f101510a.f101500e}, C39763c.f101513a);
                    this.f101510a.f101497b.setVisibility(0);
                    LiveRoomStruct liveRoomStruct = this.f101510a.f101501f;
                    if (liveRoomStruct != null) {
                        UrlModel urlModel = liveRoomStruct.roomCover;
                        if (urlModel != null) {
                            C23515d.m57670a(this.f101510a.f101497b, urlModel, this.f101510a.f101497b.getWidth(), this.f101510a.f101497b.getHeight());
                            break;
                        }
                    }
                    return;
                case 3:
                    this.f101510a.mo80844a();
                    break;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.o$d */
    static final class C39764d extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        public static final C39764d f101514a = new C39764d();

        C39764d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            View view = (View) obj;
            C52711k.m112240b(view, "$receiver");
            view.setVisibility(8);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.o$e */
    static final class C39765e extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        public static final C39765e f101515a = new C39765e();

        C39765e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            View view = (View) obj;
            C52711k.m112240b(view, "$receiver");
            view.setVisibility(0);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.o$f */
    public static final class C39766f implements C1710e<C36083b> {

        /* renamed from: a */
        final /* synthetic */ C39755o f101516a;

        /* renamed from: b */
        final /* synthetic */ LiveRoomStruct f101517b;

        public final /* synthetic */ void accept(Object obj) {
            C36083b bVar = (C36083b) obj;
            C52711k.m112240b(bVar, "liveState");
            CharSequence valueOf = String.valueOf(bVar.f92446a);
            User user = this.f101517b.owner;
            C52711k.m112236a((Object) user, "room.owner");
            if (TextUtils.equals(valueOf, user.getUid())) {
                this.f101517b.f79734id = bVar.f92447b;
                this.f101517b.owner.roomId = this.f101517b.f79734id;
                this.f101516a.f101504i.mo74820a();
                this.f101516a.mo80844a();
            }
        }

        C39766f(C39755o oVar, LiveRoomStruct liveRoomStruct) {
            this.f101516a = oVar;
            this.f101517b = liveRoomStruct;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.o$g */
    static final class C39767g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UrlModel f101518a;

        /* renamed from: b */
        final /* synthetic */ C39755o f101519b;

        C39767g(UrlModel urlModel, C39755o oVar) {
            this.f101518a = urlModel;
            this.f101519b = oVar;
        }

        public final void run() {
            C23515d.m57671a(this.f101519b.f101497b, this.f101518a, this.f101519b.f101497b.getWidth(), this.f101519b.f101497b.getHeight(), C40026s.f101964a.newLiveBlurProcessor(5, (((float) this.f101518a.getWidth()) * 1.0f) / ((float) this.f101519b.f101497b.getWidth()), null));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.o$h */
    static final class C39768h extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        public static final C39768h f101520a = new C39768h();

        C39768h() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            View view = (View) obj;
            C52711k.m112240b(view, "$receiver");
            view.setVisibility(8);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.o$i */
    static final class C39769i extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        public static final C39769i f101521a = new C39769i();

        C39769i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            View view = (View) obj;
            C52711k.m112240b(view, "$receiver");
            view.setVisibility(0);
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo80844a() {
        m88476a(new View[]{this.f101496a, this.f101498c, this.f101499d}, C39768h.f101520a);
        m88476a(new View[]{this.f101497b, this.f101500e}, C39769i.f101521a);
        LiveRoomStruct liveRoomStruct = this.f101501f;
        if (liveRoomStruct != null) {
            UrlModel urlModel = liveRoomStruct.roomCover;
            if (urlModel != null) {
                this.f101497b.post(new C39767g(urlModel, this));
            }
        }
    }

    /* renamed from: a */
    static void m88475a(LiveRoomStruct liveRoomStruct) {
        User user = liveRoomStruct.owner;
        C52711k.m112236a((Object) user, "room.owner");
        C26890h.m65011a("livesdk_live_show", C23089d.m56640a().mo47829a("scene_id", "1009").mo47829a("enter_from_merge", "others_homepage").mo47829a("action_type", "click").mo47829a("anchor_id", user.getUid()).mo47827a("room_id", liveRoomStruct.f79734id).mo47829a("request_id", liveRoomStruct.getRequestId()).mo47829a("enter_method", "live_cover").f61491a);
    }

    public final /* synthetic */ void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        LiveRoomStruct liveRoomStruct = this.f101501f;
        if (liveRoomStruct != null) {
            if (C52711k.m112239a((Object) bool, (Object) Boolean.valueOf(true))) {
                this.f101504i.mo74822a(true, liveRoomStruct, this.f101498c);
            } else {
                this.f101504i.mo74820a();
                m88476a(new View[]{this.f101496a, this.f101499d}, C39764d.f101514a);
                m88476a(new View[]{this.f101497b}, C39765e.f101515a);
            }
            if (C52711k.m112239a((Object) bool, (Object) Boolean.valueOf(true))) {
                m88475a(liveRoomStruct);
            }
            this.f101503h = C52711k.m112239a((Object) bool, (Object) Boolean.valueOf(true));
            if (this.f101503h) {
                C1710e<C36083b> eVar = this.f101506l;
                if (eVar == null) {
                    eVar = new C39766f<>(this, liveRoomStruct);
                }
                this.f101506l = eVar;
            }
        }
    }

    /* renamed from: a */
    public static void m88476a(View[] viewArr, C52671b<? super View, C52860x> bVar) {
        for (View invoke : viewArr) {
            bVar.invoke(invoke);
        }
    }

    public C39755o(View view, FragmentActivity fragmentActivity) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(fragmentActivity, "activity");
        super(view);
        this.f101505j = fragmentActivity;
        View findViewById = view.findViewById(R.id.dhp);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.tv_top)");
        this.f101496a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.cd1);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.riv_cover)");
        this.f101497b = (RemoteImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ah9);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.fl_live_container)");
        this.f101498c = (FrameLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.dij);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.tv_watch_people_count)");
        this.f101499d = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.ag3);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.finished_status)");
        this.f101500e = (TextView) findViewById5;
        view.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C39755o f101507a;

            {
                this.f101507a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                LiveRoomStruct liveRoomStruct = this.f101507a.f101501f;
                if (liveRoomStruct != null) {
                    C40026s sVar = C40026s.f101964a;
                    C52711k.m112236a((Object) view, "v");
                    Context context = view.getContext();
                    C52711k.m112236a((Object) context, "v.context");
                    User user = liveRoomStruct.owner;
                    C52711k.m112236a((Object) user, "it.owner");
                    sVar.watchLiveMob(context, user, "others_homepage", "live_cover");
                }
            }
        });
        this.f101504i = C40026s.f101964a.newLivePlayHelper(new C39758b(this), new C39760c(this));
    }
}
