package com.p683ss.android.ugc.aweme.poi.p2061d;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.api.PoiAnswerLikeApi;
import com.p683ss.android.ugc.aweme.poi.model.C39123g;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.poi.d.a */
public final class C39055a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f99595a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C39055a.class), "service", "getService()Lcom/ss/android/ugc/aweme/poi/api/PoiAnswerLikeApi;"))};

    /* renamed from: b */
    public int f99596b;

    /* renamed from: c */
    public boolean f99597c;

    /* renamed from: d */
    public View f99598d;

    /* renamed from: e */
    public C39123g f99599e;

    /* renamed from: f */
    public String f99600f;

    /* renamed from: g */
    public C39067g f99601g;

    /* renamed from: h */
    private final CheckableImageView f99602h;

    /* renamed from: i */
    private final DmtTextView f99603i;

    /* renamed from: j */
    private final LinearLayout f99604j;

    /* renamed from: k */
    private final C52668f f99605k = C52732g.m112286a(C52757k.NONE, C39058a.f99608a);

    /* renamed from: com.ss.android.ugc.aweme.poi.d.a$a */
    static final class C39058a extends C52712l implements C52670a<PoiAnswerLikeApi> {

        /* renamed from: a */
        public static final C39058a f99608a = new C39058a();

        C39058a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(PoiAnswerLikeApi.class);
            C52711k.m112236a(create, "ServiceManager.get().get…nswerLikeApi::class.java)");
            return (PoiAnswerLikeApi) create;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.d.a$b */
    static final class C39059b<T> implements C1710e<BaseResponse> {

        /* renamed from: a */
        public static final C39059b f99609a = new C39059b();

        C39059b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.d.a$c */
    static final class C39060c<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C39060c f99610a = new C39060c();

        C39060c() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C17840a.m43754b(th);
            }
        }
    }

    /* renamed from: a */
    public final void mo79220a() {
        int i;
        boolean z;
        int i2 = 1;
        this.f99597c = !this.f99597c;
        if (!this.f99597c || this.f99596b != Integer.MAX_VALUE) {
            if (this.f99597c) {
                this.f99596b++;
                m86894a("like_poi_answer");
            } else {
                this.f99596b--;
                m86894a("cancel_like_poi_answer");
            }
        }
        CheckableImageView checkableImageView = this.f99602h;
        if (this.f99597c) {
            i = R.drawable.dle;
        } else {
            i = R.drawable.dld;
        }
        checkableImageView.setImageResource(i);
        this.f99603i.setVisibility(8);
        Integer valueOf = Integer.valueOf(this.f99596b);
        if (valueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.intValue();
            this.f99603i.setVisibility(0);
            this.f99603i.setText(C33095b.m76068a((long) this.f99596b));
        }
        String answerId = this.f99599e.getAnswerId();
        C52711k.m112240b(answerId, "answerId");
        if (!this.f99597c) {
            i2 = 2;
        }
        ((PoiAnswerLikeApi) this.f99605k.getValue()).uploadAnswerLike(answerId, i2).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) C39059b.f99609a, (C1710e<? super Throwable>) C39060c.f99610a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r3 == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        if (r3 == null) goto L_0x0039;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m86894a(java.lang.String r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.poi.g r0 = r4.f99601g
            com.ss.android.ugc.aweme.app.f.d r1 = new com.ss.android.ugc.aweme.app.f.d
            r1.<init>()
            java.lang.String r2 = "question_id"
            java.lang.String r3 = r4.f99600f
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "answer_id"
            com.ss.android.ugc.aweme.poi.model.g r3 = r4.f99599e
            java.lang.String r3 = r3.getAnswerId()
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "poi_id"
            com.ss.android.ugc.aweme.poi.g r3 = r4.f99601g
            if (r3 == 0) goto L_0x0027
            java.lang.String r3 = r3.getPoiId()
            if (r3 != 0) goto L_0x0029
        L_0x0027:
            java.lang.String r3 = ""
        L_0x0029:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "previous_page"
            com.ss.android.ugc.aweme.poi.g r3 = r4.f99601g
            if (r3 == 0) goto L_0x0039
            java.lang.String r3 = r3.getPreviousPage()
            if (r3 != 0) goto L_0x003b
        L_0x0039:
            java.lang.String r3 = ""
        L_0x003b:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "poi_page"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            com.p683ss.android.ugc.aweme.poi.utils.C39452l.m87730a(r0, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.p2061d.C39055a.m86894a(java.lang.String):void");
    }

    public C39055a(View view, C39123g gVar, String str, C39067g gVar2) {
        boolean z;
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(gVar, "answer");
        C52711k.m112240b(str, "questionId");
        this.f99598d = view;
        this.f99599e = gVar;
        this.f99600f = str;
        this.f99601g = gVar2;
        View findViewById = this.f99598d.findViewById(R.id.eba);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.ic_like)");
        this.f99602h = (CheckableImageView) findViewById;
        View findViewById2 = this.f99598d.findViewById(R.id.eiz);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.like_amounts)");
        this.f99603i = (DmtTextView) findViewById2;
        View findViewById3 = this.f99598d.findViewById(R.id.ej0);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.like_container)");
        this.f99604j = (LinearLayout) findViewById3;
        this.f99604j.setOnClickListener(new C47687av(this) {

            /* renamed from: a */
            final /* synthetic */ C39055a f99606a;

            /* renamed from: com.ss.android.ugc.aweme.poi.d.a$1$a */
            static final class C39057a implements C23505g {

                /* renamed from: a */
                final /* synthetic */ C390561 f99607a;

                C39057a(C390561 r1) {
                    this.f99607a = r1;
                }

                /* renamed from: a */
                public final void mo46280a(Bundle bundle) {
                }

                /* renamed from: a */
                public final void mo46279a() {
                    this.f99607a.f99606a.mo79220a();
                }
            }

            {
                this.f99606a = r1;
            }

            /* renamed from: a */
            public final void mo59929a(View view) {
                IAccountUserService g = C20854a.m53167g();
                C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                if (!g.isLogin()) {
                    C27965f.m66722a(C11016e.m22312g(), "poi_page", "click_like_poi_answer", (C23505g) new C39057a(this));
                } else {
                    this.f99606a.mo79220a();
                }
            }
        });
        int i = 0;
        this.f99604j.setVisibility(0);
        Boolean isUserLike = this.f99599e.isUserLike();
        if (isUserLike != null) {
            z = isUserLike.booleanValue();
        } else {
            z = false;
        }
        this.f99597c = z;
        this.f99603i.setVisibility(8);
        Integer likeAmounts = this.f99599e.getLikeAmounts();
        if (likeAmounts != null) {
            i = likeAmounts.intValue();
        }
        this.f99596b = i;
    }
}
