package com.p683ss.android.ugc.aweme.record;

import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.ApiCenter.C2755a;
import com.bytedance.als.C2756a;
import com.bytedance.als.C2757b;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2764h;
import com.bytedance.als.ext.C2761a;
import com.bytedance.als.ext.OCAdapterViewModel;
import com.bytedance.p780m.C12361b;
import com.bytedance.p780m.C12366c;
import com.bytedance.p780m.C12366c.C12369a;
import com.bytedance.p780m.C12372e;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.ktx.C12932b;
import com.p683ss.android.ugc.aweme.C27988y;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.comment_sticker.C25465a;
import com.p683ss.android.ugc.aweme.comment_sticker.C25468d;
import com.p683ss.android.ugc.aweme.p1481bv.C24365a;
import com.p683ss.android.ugc.aweme.p2345t.C46776g;
import com.p683ss.android.ugc.aweme.shortvideo.C42562ct;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.countdown.C42501a;
import com.p683ss.android.ugc.aweme.shortvideo.countdown.C42502b;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43236a;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43296x;
import com.p683ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43860b;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.sticker.panel.C46255p;
import com.p683ss.android.ugc.gamora.C48922a;
import com.p683ss.android.ugc.gamora.p2457a.C48923a;
import com.p683ss.android.ugc.gamora.recorder.filter.filter_panel.C49746c;
import com.p683ss.android.ugc.gamora.recorder.filter.filter_panel.FilterPanelViewModel;
import com.p683ss.android.ugc.gamora.recorder.filter.p2471b.C49705a;
import com.p683ss.android.ugc.gamora.recorder.filter.p2471b.C49706b;
import com.p683ss.android.ugc.gamora.recorder.p2464a.C49568a;
import com.p683ss.android.ugc.gamora.recorder.p2464a.C49569b;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49583g;
import com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a;
import com.p683ss.android.ugc.gamora.recorder.p2466c.C49612d;
import com.p683ss.android.ugc.gamora.recorder.p2467d.C49648a;
import com.p683ss.android.ugc.gamora.recorder.p2467d.C49649b;
import com.p683ss.android.ugc.gamora.recorder.p2468e.C49659a;
import com.p683ss.android.ugc.gamora.recorder.p2468e.C49660b;
import com.p683ss.android.ugc.gamora.recorder.p2473g.C49784a;
import com.p683ss.android.ugc.gamora.recorder.p2473g.C49786c;
import com.p683ss.android.ugc.gamora.recorder.p2474h.C49822a;
import com.p683ss.android.ugc.gamora.recorder.p2474h.C49823b;
import com.p683ss.android.ugc.gamora.recorder.p2475i.C49829a;
import com.p683ss.android.ugc.gamora.recorder.p2475i.C49830b;
import com.p683ss.android.ugc.gamora.recorder.p2476j.C49842a;
import com.p683ss.android.ugc.gamora.recorder.p2476j.C49843b;
import com.p683ss.android.ugc.gamora.recorder.p2477k.C49850a;
import com.p683ss.android.ugc.gamora.recorder.p2477k.C49851b;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49862b;
import com.p683ss.android.ugc.gamora.recorder.p2479m.C49898a;
import com.p683ss.android.ugc.gamora.recorder.p2479m.C49903c;
import com.p683ss.android.ugc.gamora.recorder.p2480n.C49904a;
import com.p683ss.android.ugc.gamora.recorder.p2480n.C49912d;
import com.p683ss.android.ugc.gamora.recorder.p2481o.C49913a;
import com.p683ss.android.ugc.gamora.recorder.p2481o.C49916b;
import com.p683ss.android.ugc.gamora.recorder.p2482p.p2483a.C49951e;
import com.p683ss.android.ugc.gamora.recorder.p2482p.p2483a.C49952f;
import com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel.C50057a;
import com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel.C50071e;
import com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel.RecordStickerPanelViewModel;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.record.a */
public final class C41152a implements C48922a {

    /* renamed from: com.ss.android.ugc.aweme.record.a$a */
    public static final class C41153a extends C12372e<C49607a> {

        /* renamed from: a */
        final /* synthetic */ Class f104566a;

        public C41153a(Class cls) {
            this.f104566a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104566a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$aa */
    public static final class C41154aa extends C12372e<C49904a> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104567a;

        /* renamed from: b */
        final /* synthetic */ C48923a f104568b;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C49904a(this.f104567a, bVar);
        }

        public C41154aa(C12896b bVar, C48923a aVar) {
            this.f104567a = bVar;
            this.f104568b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$ab */
    public static final class C41155ab extends C12372e<C49649b> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104569a;

        /* renamed from: b */
        final /* synthetic */ C48923a f104570b;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C49649b(this.f104569a, bVar);
        }

        public C41155ab(C12896b bVar, C48923a aVar) {
            this.f104569a = bVar;
            this.f104570b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$ac */
    public static final class C41156ac extends C12372e<C49913a> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104571a;

        /* renamed from: b */
        final /* synthetic */ C48923a f104572b;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C49913a(this.f104571a, bVar);
        }

        public C41156ac(C12896b bVar, C48923a aVar) {
            this.f104571a = bVar;
            this.f104572b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$ad */
    public static final class C41157ad extends C12372e<C49898a> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104573a;

        /* renamed from: b */
        final /* synthetic */ C48923a f104574b;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C49898a(this.f104573a, bVar, this.f104574b);
        }

        public C41157ad(C12896b bVar, C48923a aVar) {
            this.f104573a = bVar;
            this.f104574b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$ae */
    public static final class C41158ae extends C12372e<C49746c> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104575a;

        /* renamed from: b */
        final /* synthetic */ C48923a f104576b;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C49746c(this.f104575a, bVar, R.id.c_q);
        }

        public C41158ae(C12896b bVar, C48923a aVar) {
            this.f104575a = bVar;
            this.f104576b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$af */
    public static final class C41159af extends C12372e<C49706b> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104577a;

        /* renamed from: b */
        final /* synthetic */ C48923a f104578b;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C49706b(this.f104577a, bVar, R.id.c_q);
        }

        public C41159af(C12896b bVar, C48923a aVar) {
            this.f104577a = bVar;
            this.f104578b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$ag */
    public static final class C41160ag extends C12372e<C49851b> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104579a;

        /* renamed from: b */
        final /* synthetic */ C48923a f104580b;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C49851b(this.f104579a, bVar);
        }

        public C41160ag(C12896b bVar, C48923a aVar) {
            this.f104579a = bVar;
            this.f104580b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$ah */
    public static final class C41161ah extends C12372e<C42502b> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104581a;

        /* renamed from: b */
        final /* synthetic */ C48923a f104582b;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C42502b(this.f104581a, bVar);
        }

        public C41161ah(C12896b bVar, C48923a aVar) {
            this.f104581a = bVar;
            this.f104582b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$ai */
    public static final class C41162ai extends C12372e<C49830b> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104583a;

        /* renamed from: b */
        final /* synthetic */ C48923a f104584b;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C49830b(this.f104583a, bVar);
        }

        public C41162ai(C12896b bVar, C48923a aVar) {
            this.f104583a = bVar;
            this.f104584b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$aj */
    public static final class C41163aj extends C12372e<C49843b> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104585a;

        /* renamed from: b */
        final /* synthetic */ C48923a f104586b;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C49843b(this.f104585a, bVar);
        }

        public C41163aj(C12896b bVar, C48923a aVar) {
            this.f104585a = bVar;
            this.f104586b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$ak */
    public static final class C41164ak extends C12372e<C43296x> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104587a;

        /* renamed from: b */
        final /* synthetic */ C48923a f104588b;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C43296x(this.f104587a, bVar);
        }

        public C41164ak(C12896b bVar, C48923a aVar) {
            this.f104587a = bVar;
            this.f104588b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$al */
    public static final class C41165al extends C12372e<C25468d> {

        /* renamed from: a */
        final /* synthetic */ CommentVideoModel f104589a;

        /* renamed from: b */
        final /* synthetic */ C12896b f104590b;

        /* renamed from: c */
        final /* synthetic */ C48923a f104591c;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C25468d(this.f104590b, bVar, this.f104589a);
        }

        public C41165al(CommentVideoModel commentVideoModel, C12896b bVar, C48923a aVar) {
            this.f104589a = commentVideoModel;
            this.f104590b = bVar;
            this.f104591c = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$am */
    public static final class C41166am extends C12372e<C49569b> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104592a;

        /* renamed from: b */
        final /* synthetic */ C48923a f104593b;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C49569b(this.f104592a, this.f104593b);
        }

        public C41166am(C12896b bVar, C48923a aVar) {
            this.f104592a = bVar;
            this.f104593b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$an */
    public static final class C41167an extends C12372e<C49786c> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104594a;

        /* renamed from: b */
        final /* synthetic */ C48923a f104595b;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C49786c(this.f104594a, bVar);
        }

        public C41167an(C12896b bVar, C48923a aVar) {
            this.f104594a = bVar;
            this.f104595b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$ao */
    public static final class C41168ao extends C12372e<C49612d> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104596a;

        /* renamed from: b */
        final /* synthetic */ C48923a f104597b;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C49612d(this.f104596a, bVar);
        }

        public C41168ao(C12896b bVar, C48923a aVar) {
            this.f104596a = bVar;
            this.f104597b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$ap */
    public static final class C41169ap extends C12372e<C49952f> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104598a;

        /* renamed from: b */
        final /* synthetic */ C48923a f104599b;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C24365a().mo50168a(this.f104598a, bVar, this.f104599b);
        }

        public C41169ap(C12896b bVar, C48923a aVar) {
            this.f104598a = bVar;
            this.f104599b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$aq */
    public static final class C41170aq extends C12372e<C50071e> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104600a;

        /* renamed from: b */
        final /* synthetic */ C48923a f104601b;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            C50057a aVar = new C50057a(bVar);
            C12896b bVar2 = this.f104600a;
            C52711k.m112240b(bVar2, "parentScene");
            return new C50071e(aVar.f125393a, bVar2, R.id.c_q);
        }

        public C41170aq(C12896b bVar, C48923a aVar) {
            this.f104600a = bVar;
            this.f104601b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$ar */
    public static final class C41171ar extends C12372e<C49862b> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104602a;

        /* renamed from: b */
        final /* synthetic */ C48923a f104603b;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C49862b(bVar, this.f104602a, R.id.c_q);
        }

        public C41171ar(C12896b bVar, C48923a aVar) {
            this.f104602a = bVar;
            this.f104603b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$as */
    public static final class C41172as extends C12372e<C49660b> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104604a;

        /* renamed from: b */
        final /* synthetic */ C48923a f104605b;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C49660b(this.f104604a, this.f104605b, bVar);
        }

        public C41172as(C12896b bVar, C48923a aVar) {
            this.f104604a = bVar;
            this.f104605b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$at */
    public static final class C41173at extends C12372e<C42562ct> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104606a;

        /* renamed from: b */
        final /* synthetic */ C42562ct f104607b;

        /* renamed from: c */
        final /* synthetic */ C48923a f104608c;

        /* renamed from: a */
        public final C42562ct mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return this.f104607b;
        }

        public C41173at(C12896b bVar, C42562ct ctVar, C48923a aVar) {
            this.f104606a = bVar;
            this.f104607b = ctVar;
            this.f104608c = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$au */
    public static final class C41174au extends C12372e<ShortVideoContext> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104609a;

        /* renamed from: b */
        final /* synthetic */ C42562ct f104610b;

        /* renamed from: c */
        final /* synthetic */ C48923a f104611c;

        /* renamed from: a */
        public final ShortVideoContext mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return this.f104611c.mo96752c();
        }

        public C41174au(C12896b bVar, C42562ct ctVar, C48923a aVar) {
            this.f104609a = bVar;
            this.f104610b = ctVar;
            this.f104611c = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$av */
    public static final class C41175av extends C12372e<ApiCenter> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104612a;

        /* renamed from: b */
        final /* synthetic */ C42562ct f104613b;

        /* renamed from: c */
        final /* synthetic */ C48923a f104614c;

        /* renamed from: a */
        public final ApiCenter mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return C2755a.m7851a(C12932b.m25979b(this.f104612a));
        }

        public C41175av(C12896b bVar, C42562ct ctVar, C48923a aVar) {
            this.f104612a = bVar;
            this.f104613b = ctVar;
            this.f104614c = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$b */
    public static final class C41176b extends C12372e<C49951e> {

        /* renamed from: a */
        final /* synthetic */ Class f104615a;

        public C41176b(Class cls) {
            this.f104615a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104615a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$c */
    public static final class C41177c extends C12372e<RecordStickerPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ Class f104616a;

        public C41177c(Class cls) {
            this.f104616a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104616a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$d */
    public static final class C41178d extends C12372e<C49860a> {

        /* renamed from: a */
        final /* synthetic */ Class f104617a;

        public C41178d(Class cls) {
            this.f104617a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104617a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$e */
    public static final class C41179e extends C12372e<C49659a> {

        /* renamed from: a */
        final /* synthetic */ Class f104618a;

        public C41179e(Class cls) {
            this.f104618a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104618a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$f */
    public static final class C41180f extends C12372e<C49822a> {

        /* renamed from: a */
        final /* synthetic */ Class f104619a;

        public C41180f(Class cls) {
            this.f104619a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104619a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$g */
    public static final class C41181g extends C12372e<C49577b> {

        /* renamed from: a */
        final /* synthetic */ Class f104620a;

        public C41181g(Class cls) {
            this.f104620a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104620a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$h */
    public static final class C41182h extends C12372e<C49912d> {

        /* renamed from: a */
        final /* synthetic */ Class f104621a;

        public C41182h(Class cls) {
            this.f104621a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104621a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$i */
    public static final class C41183i extends C12372e<C49648a> {

        /* renamed from: a */
        final /* synthetic */ Class f104622a;

        public C41183i(Class cls) {
            this.f104622a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104622a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$j */
    public static final class C41184j extends C12372e<C49916b> {

        /* renamed from: a */
        final /* synthetic */ Class f104623a;

        public C41184j(Class cls) {
            this.f104623a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104623a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$k */
    public static final class C41185k extends C12372e<C49903c> {

        /* renamed from: a */
        final /* synthetic */ Class f104624a;

        public C41185k(Class cls) {
            this.f104624a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104624a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$l */
    public static final class C41186l extends C12372e<FilterPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ Class f104625a;

        public C41186l(Class cls) {
            this.f104625a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104625a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$m */
    public static final class C41187m extends C12372e<C49705a> {

        /* renamed from: a */
        final /* synthetic */ Class f104626a;

        public C41187m(Class cls) {
            this.f104626a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104626a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$n */
    public static final class C41188n extends C12372e<C49850a> {

        /* renamed from: a */
        final /* synthetic */ Class f104627a;

        public C41188n(Class cls) {
            this.f104627a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104627a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$o */
    public static final class C41189o extends C12372e<C42501a> {

        /* renamed from: a */
        final /* synthetic */ Class f104628a;

        public C41189o(Class cls) {
            this.f104628a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104628a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$p */
    public static final class C41190p extends C12372e<C49829a> {

        /* renamed from: a */
        final /* synthetic */ Class f104629a;

        public C41190p(Class cls) {
            this.f104629a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104629a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$q */
    public static final class C41191q extends C12372e<C43860b> {
        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C43860b(bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$r */
    public static final class C41192r extends C12372e<C49842a> {

        /* renamed from: a */
        final /* synthetic */ Class f104630a;

        public C41192r(Class cls) {
            this.f104630a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104630a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$s */
    public static final class C41193s extends C12372e<C43859a> {

        /* renamed from: a */
        final /* synthetic */ Class f104631a;

        public C41193s(Class cls) {
            this.f104631a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104631a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$t */
    public static final class C41194t extends C12372e<DuetLayoutModeViewModel> {

        /* renamed from: a */
        final /* synthetic */ Class f104632a;

        public C41194t(Class cls) {
            this.f104632a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104632a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$u */
    public static final class C41195u extends C12372e<C25465a> {

        /* renamed from: a */
        final /* synthetic */ Class f104633a;

        public C41195u(Class cls) {
            this.f104633a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104633a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$v */
    public static final class C41196v extends C12372e<C49568a> {

        /* renamed from: a */
        final /* synthetic */ Class f104634a;

        public C41196v(Class cls) {
            this.f104634a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104634a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$w */
    public static final class C41197w extends C12372e<C49784a> {

        /* renamed from: a */
        final /* synthetic */ Class f104635a;

        public C41197w(Class cls) {
            this.f104635a = cls;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return ((C2764h) bVar.mo23372a(this.f104635a)).mo7353a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$x */
    public static final class C41198x extends C12372e<C46255p> {
        /* renamed from: a */
        public final C46255p mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return C46776g.m101582a((C45004a) bVar.mo23373a(C45004a.class, (String) null));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$y */
    public static final class C41199y extends C12372e<C49823b> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104636a;

        /* renamed from: b */
        final /* synthetic */ C48923a f104637b;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C49823b(this.f104636a, bVar, R.id.akh);
        }

        public C41199y(C12896b bVar, C48923a aVar) {
            this.f104636a = bVar;
            this.f104637b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$z */
    public static final class C41200z extends C12372e<C49583g> {

        /* renamed from: a */
        final /* synthetic */ C12896b f104638a;

        /* renamed from: b */
        final /* synthetic */ C48923a f104639b;

        /* renamed from: a */
        public final /* synthetic */ Object mo23382a(C12361b bVar) {
            C52711k.m112240b(bVar, "container");
            return new C49583g(this.f104638a, bVar, C27988y.m66753a().mo49421a(this.f104639b));
        }

        public C41200z(C12896b bVar, C48923a aVar) {
            this.f104638a = bVar;
            this.f104639b = aVar;
        }
    }

    /* renamed from: a */
    public final void mo83693a(C12896b bVar, C12896b bVar2) {
        C52711k.m112240b(bVar, "$this$create");
        C52711k.m112240b(bVar2, "parentScene");
        Object a = bVar.mo24460E().mo24560a("record_env_context");
        if (a == null) {
            C52711k.m112234a();
        }
        C48923a aVar = (C48923a) a;
        C42562ct ctVar = (C42562ct) bVar;
        OCAdapterViewModel a2 = C2761a.m7860a((C12924i) bVar);
        C12366c cVar = a2.f8323a;
        C52711k.m112236a((Object) cVar.mo23380a(C12896b.class, (String) null, bVar), "this.registerInstance(T:…ass.java, null, instance)");
        C52711k.m112236a((Object) cVar.mo23378a(C42562ct.class, (String) null, (C12372e<T>) new C41173at<T>(bVar, ctVar, aVar)), "this.registerSingle(T::c…ntainer)\n        }\n    })");
        C52711k.m112236a((Object) cVar.mo23378a(ShortVideoContext.class, (String) null, (C12372e<T>) new C41174au<T>(bVar, ctVar, aVar)), "this.registerSingle(T::c…ntainer)\n        }\n    })");
        C52711k.m112236a((Object) cVar.mo23378a(ApiCenter.class, (String) null, (C12372e<T>) new C41175av<T>(bVar, ctVar, aVar)), "this.registerSingle(T::c…ntainer)\n        }\n    })");
        C52711k.m112236a((Object) cVar.mo23378a(C46255p.class, (String) null, (C12372e<T>) new C41198x<T>()), "this.registerSingle(T::c…ntainer)\n        }\n    })");
        a2.mo7346a();
        if (a2.mo7347b() == null) {
            C52711k.m112234a();
        }
        C2757b bVar3 = new C2757b(C2756a.m7853a(bVar));
        AlsLogicContainer alsLogicContainer = bVar3.f8321a;
        Class<C49822a> cls = C49822a.class;
        Class<C49823b> cls2 = C49823b.class;
        alsLogicContainer.f8308c.mo23377a(cls2, (C12372e<T>) new C41199y<T>(bVar2, aVar));
        C12369a a3 = alsLogicContainer.f8308c.mo23377a(cls, (C12372e<T>) new C41180f<T>(cls2));
        Class[] interfaces = cls.getInterfaces();
        C52711k.m112236a((Object) interfaces, "apiComponentClazz.interfaces");
        for (Class cls3 : interfaces) {
            if (!C52711k.m112239a((Object) cls3, (Object) C2759d.class)) {
                Class[] clsArr = new Class[1];
                if (cls3 != null) {
                    clsArr[0] = cls3;
                    a3.mo23383a(clsArr);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer.f8310e.add(cls2);
        AlsLogicContainer alsLogicContainer2 = bVar3.f8321a;
        Class<C49842a> cls4 = C49842a.class;
        Class<C49843b> cls5 = C49843b.class;
        alsLogicContainer2.f8308c.mo23377a(cls5, (C12372e<T>) new C41163aj<T>(bVar2, aVar));
        C12369a a4 = alsLogicContainer2.f8308c.mo23377a(cls4, (C12372e<T>) new C41192r<T>(cls5));
        Class[] interfaces2 = cls4.getInterfaces();
        C52711k.m112236a((Object) interfaces2, "apiComponentClazz.interfaces");
        for (Class cls6 : interfaces2) {
            if (!C52711k.m112239a((Object) cls6, (Object) C2759d.class)) {
                Class[] clsArr2 = new Class[1];
                if (cls6 != null) {
                    clsArr2[0] = cls6;
                    a4.mo23383a(clsArr2);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer2.f8310e.add(cls5);
        AlsLogicContainer alsLogicContainer3 = bVar3.f8321a;
        Class<C49568a> cls7 = C49568a.class;
        Class<C49569b> cls8 = C49569b.class;
        alsLogicContainer3.f8308c.mo23377a(cls8, (C12372e<T>) new C41166am<T>(bVar2, aVar));
        C12369a a5 = alsLogicContainer3.f8308c.mo23377a(cls7, (C12372e<T>) new C41196v<T>(cls8));
        Class[] interfaces3 = cls7.getInterfaces();
        C52711k.m112236a((Object) interfaces3, "apiComponentClazz.interfaces");
        for (Class cls9 : interfaces3) {
            if (!C52711k.m112239a((Object) cls9, (Object) C2759d.class)) {
                Class[] clsArr3 = new Class[1];
                if (cls9 != null) {
                    clsArr3[0] = cls9;
                    a5.mo23383a(clsArr3);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer3.f8310e.add(cls8);
        AlsLogicContainer alsLogicContainer4 = bVar3.f8321a;
        Class<C49784a> cls10 = C49784a.class;
        Class<C49786c> cls11 = C49786c.class;
        alsLogicContainer4.f8308c.mo23377a(cls11, (C12372e<T>) new C41167an<T>(bVar2, aVar));
        C12369a a6 = alsLogicContainer4.f8308c.mo23377a(cls10, (C12372e<T>) new C41197w<T>(cls11));
        Class[] interfaces4 = cls10.getInterfaces();
        C52711k.m112236a((Object) interfaces4, "apiComponentClazz.interfaces");
        for (Class cls12 : interfaces4) {
            if (!C52711k.m112239a((Object) cls12, (Object) C2759d.class)) {
                Class[] clsArr4 = new Class[1];
                if (cls12 != null) {
                    clsArr4[0] = cls12;
                    a6.mo23383a(clsArr4);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer4.f8310e.add(cls11);
        AlsLogicContainer alsLogicContainer5 = bVar3.f8321a;
        Class<C49607a> cls13 = C49607a.class;
        Class<C49612d> cls14 = C49612d.class;
        alsLogicContainer5.f8308c.mo23377a(cls14, (C12372e<T>) new C41168ao<T>(bVar2, aVar));
        C12369a a7 = alsLogicContainer5.f8308c.mo23377a(cls13, (C12372e<T>) new C41153a<T>(cls14));
        Class[] interfaces5 = cls13.getInterfaces();
        C52711k.m112236a((Object) interfaces5, "apiComponentClazz.interfaces");
        for (Class cls15 : interfaces5) {
            if (!C52711k.m112239a((Object) cls15, (Object) C2759d.class)) {
                Class[] clsArr5 = new Class[1];
                if (cls15 != null) {
                    clsArr5[0] = cls15;
                    a7.mo23383a(clsArr5);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer5.f8310e.add(cls14);
        AlsLogicContainer alsLogicContainer6 = bVar3.f8321a;
        Class<C49951e> cls16 = C49951e.class;
        Class<C49952f> cls17 = C49952f.class;
        alsLogicContainer6.f8308c.mo23377a(cls17, (C12372e<T>) new C41169ap<T>(bVar2, aVar));
        C12369a a8 = alsLogicContainer6.f8308c.mo23377a(cls16, (C12372e<T>) new C41176b<T>(cls17));
        Class[] interfaces6 = cls16.getInterfaces();
        C52711k.m112236a((Object) interfaces6, "apiComponentClazz.interfaces");
        for (Class cls18 : interfaces6) {
            if (!C52711k.m112239a((Object) cls18, (Object) C2759d.class)) {
                Class[] clsArr6 = new Class[1];
                if (cls18 != null) {
                    clsArr6[0] = cls18;
                    a8.mo23383a(clsArr6);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer6.f8310e.add(cls17);
        AlsLogicContainer alsLogicContainer7 = bVar3.f8321a;
        Class<RecordStickerPanelViewModel> cls19 = RecordStickerPanelViewModel.class;
        Class<C50071e> cls20 = C50071e.class;
        alsLogicContainer7.f8308c.mo23377a(cls20, (C12372e<T>) new C41170aq<T>(bVar2, aVar));
        C12369a a9 = alsLogicContainer7.f8308c.mo23377a(cls19, (C12372e<T>) new C41177c<T>(cls20));
        Class[] interfaces7 = cls19.getInterfaces();
        C52711k.m112236a((Object) interfaces7, "apiComponentClazz.interfaces");
        for (Class cls21 : interfaces7) {
            if (!C52711k.m112239a((Object) cls21, (Object) C2759d.class)) {
                Class[] clsArr7 = new Class[1];
                if (cls21 != null) {
                    clsArr7[0] = cls21;
                    a9.mo23383a(clsArr7);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer7.f8310e.add(cls20);
        AlsLogicContainer alsLogicContainer8 = bVar3.f8321a;
        Class<C49860a> cls22 = C49860a.class;
        Class<C49862b> cls23 = C49862b.class;
        alsLogicContainer8.f8308c.mo23377a(cls23, (C12372e<T>) new C41171ar<T>(bVar2, aVar));
        C12369a a10 = alsLogicContainer8.f8308c.mo23377a(cls22, (C12372e<T>) new C41178d<T>(cls23));
        Class[] interfaces8 = cls22.getInterfaces();
        C52711k.m112236a((Object) interfaces8, "apiComponentClazz.interfaces");
        for (Class cls24 : interfaces8) {
            if (!C52711k.m112239a((Object) cls24, (Object) C2759d.class)) {
                Class[] clsArr8 = new Class[1];
                if (cls24 != null) {
                    clsArr8[0] = cls24;
                    a10.mo23383a(clsArr8);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer8.f8310e.add(cls23);
        AlsLogicContainer alsLogicContainer9 = bVar3.f8321a;
        Class<C49659a> cls25 = C49659a.class;
        Class<C49660b> cls26 = C49660b.class;
        alsLogicContainer9.f8308c.mo23377a(cls26, (C12372e<T>) new C41172as<T>(bVar2, aVar));
        C12369a a11 = alsLogicContainer9.f8308c.mo23377a(cls25, (C12372e<T>) new C41179e<T>(cls26));
        Class[] interfaces9 = cls25.getInterfaces();
        C52711k.m112236a((Object) interfaces9, "apiComponentClazz.interfaces");
        for (Class cls27 : interfaces9) {
            if (!C52711k.m112239a((Object) cls27, (Object) C2759d.class)) {
                Class[] clsArr9 = new Class[1];
                if (cls27 != null) {
                    clsArr9[0] = cls27;
                    a11.mo23383a(clsArr9);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer9.f8310e.add(cls26);
        AlsLogicContainer alsLogicContainer10 = bVar3.f8321a;
        Class<C49577b> cls28 = C49577b.class;
        Class<C49583g> cls29 = C49583g.class;
        alsLogicContainer10.f8308c.mo23377a(cls29, (C12372e<T>) new C41200z<T>(bVar2, aVar));
        C12369a a12 = alsLogicContainer10.f8308c.mo23377a(cls28, (C12372e<T>) new C41181g<T>(cls29));
        Class[] interfaces10 = cls28.getInterfaces();
        C52711k.m112236a((Object) interfaces10, "apiComponentClazz.interfaces");
        for (Class cls30 : interfaces10) {
            if (!C52711k.m112239a((Object) cls30, (Object) C2759d.class)) {
                Class[] clsArr10 = new Class[1];
                if (cls30 != null) {
                    clsArr10[0] = cls30;
                    a12.mo23383a(clsArr10);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer10.f8310e.add(cls29);
        AlsLogicContainer alsLogicContainer11 = bVar3.f8321a;
        Class<C49912d> cls31 = C49912d.class;
        Class<C49904a> cls32 = C49904a.class;
        alsLogicContainer11.f8308c.mo23377a(cls32, (C12372e<T>) new C41154aa<T>(bVar2, aVar));
        C12369a a13 = alsLogicContainer11.f8308c.mo23377a(cls31, (C12372e<T>) new C41182h<T>(cls32));
        Class[] interfaces11 = cls31.getInterfaces();
        C52711k.m112236a((Object) interfaces11, "apiComponentClazz.interfaces");
        for (Class cls33 : interfaces11) {
            if (!C52711k.m112239a((Object) cls33, (Object) C2759d.class)) {
                Class[] clsArr11 = new Class[1];
                if (cls33 != null) {
                    clsArr11[0] = cls33;
                    a13.mo23383a(clsArr11);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer11.f8310e.add(cls32);
        AlsLogicContainer alsLogicContainer12 = bVar3.f8321a;
        Class<C49648a> cls34 = C49648a.class;
        Class<C49649b> cls35 = C49649b.class;
        alsLogicContainer12.f8308c.mo23377a(cls35, (C12372e<T>) new C41155ab<T>(bVar2, aVar));
        C12369a a14 = alsLogicContainer12.f8308c.mo23377a(cls34, (C12372e<T>) new C41183i<T>(cls35));
        Class[] interfaces12 = cls34.getInterfaces();
        C52711k.m112236a((Object) interfaces12, "apiComponentClazz.interfaces");
        for (Class cls36 : interfaces12) {
            if (!C52711k.m112239a((Object) cls36, (Object) C2759d.class)) {
                Class[] clsArr12 = new Class[1];
                if (cls36 != null) {
                    clsArr12[0] = cls36;
                    a14.mo23383a(clsArr12);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer12.f8310e.add(cls35);
        AlsLogicContainer alsLogicContainer13 = bVar3.f8321a;
        Class<C49916b> cls37 = C49916b.class;
        Class<C49913a> cls38 = C49913a.class;
        alsLogicContainer13.f8308c.mo23377a(cls38, (C12372e<T>) new C41156ac<T>(bVar2, aVar));
        C12369a a15 = alsLogicContainer13.f8308c.mo23377a(cls37, (C12372e<T>) new C41184j<T>(cls38));
        Class[] interfaces13 = cls37.getInterfaces();
        C52711k.m112236a((Object) interfaces13, "apiComponentClazz.interfaces");
        for (Class cls39 : interfaces13) {
            if (!C52711k.m112239a((Object) cls39, (Object) C2759d.class)) {
                Class[] clsArr13 = new Class[1];
                if (cls39 != null) {
                    clsArr13[0] = cls39;
                    a15.mo23383a(clsArr13);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer13.f8310e.add(cls38);
        AlsLogicContainer alsLogicContainer14 = bVar3.f8321a;
        Class<C49903c> cls40 = C49903c.class;
        Class<C49898a> cls41 = C49898a.class;
        alsLogicContainer14.f8308c.mo23377a(cls41, (C12372e<T>) new C41157ad<T>(bVar2, aVar));
        C12369a a16 = alsLogicContainer14.f8308c.mo23377a(cls40, (C12372e<T>) new C41185k<T>(cls41));
        Class[] interfaces14 = cls40.getInterfaces();
        C52711k.m112236a((Object) interfaces14, "apiComponentClazz.interfaces");
        for (Class cls42 : interfaces14) {
            if (!C52711k.m112239a((Object) cls42, (Object) C2759d.class)) {
                Class[] clsArr14 = new Class[1];
                if (cls42 != null) {
                    clsArr14[0] = cls42;
                    a16.mo23383a(clsArr14);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer14.f8310e.add(cls41);
        AlsLogicContainer alsLogicContainer15 = bVar3.f8321a;
        Class<FilterPanelViewModel> cls43 = FilterPanelViewModel.class;
        Class<C49746c> cls44 = C49746c.class;
        alsLogicContainer15.f8308c.mo23377a(cls44, (C12372e<T>) new C41158ae<T>(bVar2, aVar));
        C12369a a17 = alsLogicContainer15.f8308c.mo23377a(cls43, (C12372e<T>) new C41186l<T>(cls44));
        Class[] interfaces15 = cls43.getInterfaces();
        C52711k.m112236a((Object) interfaces15, "apiComponentClazz.interfaces");
        for (Class cls45 : interfaces15) {
            if (!C52711k.m112239a((Object) cls45, (Object) C2759d.class)) {
                Class[] clsArr15 = new Class[1];
                if (cls45 != null) {
                    clsArr15[0] = cls45;
                    a17.mo23383a(clsArr15);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer15.f8310e.add(cls44);
        AlsLogicContainer alsLogicContainer16 = bVar3.f8321a;
        Class<C49705a> cls46 = C49705a.class;
        Class<C49706b> cls47 = C49706b.class;
        alsLogicContainer16.f8308c.mo23377a(cls47, (C12372e<T>) new C41159af<T>(bVar2, aVar));
        C12369a a18 = alsLogicContainer16.f8308c.mo23377a(cls46, (C12372e<T>) new C41187m<T>(cls47));
        Class[] interfaces16 = cls46.getInterfaces();
        C52711k.m112236a((Object) interfaces16, "apiComponentClazz.interfaces");
        for (Class cls48 : interfaces16) {
            if (!C52711k.m112239a((Object) cls48, (Object) C2759d.class)) {
                Class[] clsArr16 = new Class[1];
                if (cls48 != null) {
                    clsArr16[0] = cls48;
                    a18.mo23383a(clsArr16);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer16.f8310e.add(cls47);
        AlsLogicContainer alsLogicContainer17 = bVar3.f8321a;
        Class<C49850a> cls49 = C49850a.class;
        Class<C49851b> cls50 = C49851b.class;
        alsLogicContainer17.f8308c.mo23377a(cls50, (C12372e<T>) new C41160ag<T>(bVar2, aVar));
        C12369a a19 = alsLogicContainer17.f8308c.mo23377a(cls49, (C12372e<T>) new C41188n<T>(cls50));
        Class[] interfaces17 = cls49.getInterfaces();
        C52711k.m112236a((Object) interfaces17, "apiComponentClazz.interfaces");
        for (Class cls51 : interfaces17) {
            if (!C52711k.m112239a((Object) cls51, (Object) C2759d.class)) {
                Class[] clsArr17 = new Class[1];
                if (cls51 != null) {
                    clsArr17[0] = cls51;
                    a19.mo23383a(clsArr17);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer17.f8310e.add(cls50);
        AlsLogicContainer alsLogicContainer18 = bVar3.f8321a;
        Class<C42501a> cls52 = C42501a.class;
        Class<C42502b> cls53 = C42502b.class;
        alsLogicContainer18.f8308c.mo23377a(cls53, (C12372e<T>) new C41161ah<T>(bVar2, aVar));
        C12369a a20 = alsLogicContainer18.f8308c.mo23377a(cls52, (C12372e<T>) new C41189o<T>(cls53));
        Class[] interfaces18 = cls52.getInterfaces();
        C52711k.m112236a((Object) interfaces18, "apiComponentClazz.interfaces");
        for (Class cls54 : interfaces18) {
            if (!C52711k.m112239a((Object) cls54, (Object) C2759d.class)) {
                Class[] clsArr18 = new Class[1];
                if (cls54 != null) {
                    clsArr18[0] = cls54;
                    a20.mo23383a(clsArr18);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer18.f8310e.add(cls53);
        AlsLogicContainer alsLogicContainer19 = bVar3.f8321a;
        Class<C49829a> cls55 = C49829a.class;
        Class<C49830b> cls56 = C49830b.class;
        alsLogicContainer19.f8308c.mo23377a(cls56, (C12372e<T>) new C41162ai<T>(bVar2, aVar));
        C12369a a21 = alsLogicContainer19.f8308c.mo23377a(cls55, (C12372e<T>) new C41190p<T>(cls56));
        Class[] interfaces19 = cls55.getInterfaces();
        C52711k.m112236a((Object) interfaces19, "apiComponentClazz.interfaces");
        for (Class cls57 : interfaces19) {
            if (!C52711k.m112239a((Object) cls57, (Object) C2759d.class)) {
                Class[] clsArr19 = new Class[1];
                if (cls57 != null) {
                    clsArr19[0] = cls57;
                    a21.mo23383a(clsArr19);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer19.f8310e.add(cls56);
        AlsLogicContainer alsLogicContainer20 = bVar3.f8321a;
        Class<C43859a> cls58 = C43859a.class;
        Class<C43860b> cls59 = C43860b.class;
        alsLogicContainer20.f8308c.mo23377a(cls59, (C12372e<T>) new C41191q<T>());
        C12369a a22 = alsLogicContainer20.f8308c.mo23377a(cls58, (C12372e<T>) new C41193s<T>(cls59));
        Class[] interfaces20 = cls58.getInterfaces();
        C52711k.m112236a((Object) interfaces20, "apiComponentClazz.interfaces");
        for (Class cls60 : interfaces20) {
            if (!C52711k.m112239a((Object) cls60, (Object) C2759d.class)) {
                Class[] clsArr20 = new Class[1];
                if (cls60 != null) {
                    clsArr20[0] = cls60;
                    a22.mo23383a(clsArr20);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer20.f8310e.add(cls59);
        if (C43236a.m94873a(aVar.mo96752c())) {
            AlsLogicContainer alsLogicContainer21 = bVar3.f8321a;
            Class<DuetLayoutModeViewModel> cls61 = DuetLayoutModeViewModel.class;
            Class<C43296x> cls62 = C43296x.class;
            alsLogicContainer21.f8308c.mo23377a(cls62, (C12372e<T>) new C41164ak<T>(bVar2, aVar));
            C12369a a23 = alsLogicContainer21.f8308c.mo23377a(cls61, (C12372e<T>) new C41194t<T>(cls62));
            Class[] interfaces21 = cls61.getInterfaces();
            C52711k.m112236a((Object) interfaces21, "apiComponentClazz.interfaces");
            for (Class cls63 : interfaces21) {
                if (!C52711k.m112239a((Object) cls63, (Object) C2759d.class)) {
                    Class[] clsArr21 = new Class[1];
                    if (cls63 != null) {
                        clsArr21[0] = cls63;
                        a23.mo23383a(clsArr21);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                    }
                }
            }
            alsLogicContainer21.f8310e.add(cls62);
        }
        CommentVideoModel commentVideoModel = aVar.mo96752c().f107125r;
        if (CommentUtils.isDataValid(commentVideoModel)) {
            AlsLogicContainer alsLogicContainer22 = bVar3.f8321a;
            Class<C25465a> cls64 = C25465a.class;
            Class<C25468d> cls65 = C25468d.class;
            alsLogicContainer22.f8308c.mo23377a(cls65, (C12372e<T>) new C41165al<T>(commentVideoModel, bVar2, aVar));
            C12369a a24 = alsLogicContainer22.f8308c.mo23377a(cls64, (C12372e<T>) new C41195u<T>(cls65));
            Class[] interfaces22 = cls64.getInterfaces();
            C52711k.m112236a((Object) interfaces22, "apiComponentClazz.interfaces");
            for (Class cls66 : interfaces22) {
                if (!C52711k.m112239a((Object) cls66, (Object) C2759d.class)) {
                    Class[] clsArr22 = new Class[1];
                    if (cls66 != null) {
                        clsArr22[0] = cls66;
                        a24.mo23383a(clsArr22);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                    }
                }
            }
            alsLogicContainer22.f8310e.add(cls65);
        }
        bVar3.mo7344a();
    }
}
