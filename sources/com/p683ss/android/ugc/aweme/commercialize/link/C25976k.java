package com.p683ss.android.ugc.aweme.commercialize.link;

import android.content.Context;
import android.net.Uri;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.C25732e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26060ay;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.model.C26110ae;
import com.p683ss.android.ugc.aweme.commercialize.p1549b.C25652a.C25653a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26533q;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.C26534a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.p1583a.C26452a.C26453a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.k */
public final class C25976k implements C25975j {

    /* renamed from: a */
    public final TextView f68564a;

    /* renamed from: b */
    public final RecyclerView f68565b;

    /* renamed from: c */
    public C25947a f68566c;

    /* renamed from: d */
    public C26110ae f68567d;

    /* renamed from: e */
    public final View f68568e;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.k$a */
    static final class C25977a implements C26534a {

        /* renamed from: a */
        final /* synthetic */ C25976k f68569a;

        C25977a(C25976k kVar) {
            this.f68569a = kVar;
        }

        /* renamed from: a */
        public final void mo49915a(boolean z) {
            String str;
            Long l;
            C26080b a = C26077e.m63190a().mo53582a("result_ad");
            if (z) {
                str = "deeplink_success";
            } else {
                str = "deeplink_failed";
            }
            C26080b b = a.mo53593b(str);
            C26110ae aeVar = this.f68569a.f68567d;
            String str2 = null;
            if (aeVar != null) {
                l = Long.valueOf(aeVar.f68945id);
            } else {
                l = null;
            }
            C26080b a2 = b.mo53580a(l);
            C26110ae aeVar2 = this.f68569a.f68567d;
            if (aeVar2 != null) {
                str2 = aeVar2.logExtra;
            }
            a2.mo53604i(str2).mo53586a(this.f68569a.f68568e.getContext());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.k$b */
    static final class C25978b extends C52712l implements C52682m<C26080b, Boolean, C26080b> {

        /* renamed from: a */
        final /* synthetic */ C25976k f68570a;

        C25978b(C25976k kVar) {
            this.f68570a = kVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C26080b bVar = (C26080b) obj;
            ((Boolean) obj2).booleanValue();
            C52711k.m112240b(bVar, "$receiver");
            C26080b a = bVar.mo53575a(this.f68570a.f68567d);
            C52711k.m112236a((Object) a, "adId(adData)");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.k$c */
    public static final class C25979c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25976k f68571a;

        public C25979c(C25976k kVar) {
            this.f68571a = kVar;
        }

        public final void onClick(View view) {
            String str;
            boolean z;
            Object obj;
            String str2;
            UrlModel urlModel;
            Long l;
            String str3;
            String str4;
            long j;
            String str5;
            Long l2;
            String str6;
            String str7;
            Long l3;
            String str8;
            Aweme aweme;
            ClickInstrumentation.onClick(view);
            C25976k kVar = this.f68571a;
            C26110ae aeVar = kVar.f68567d;
            String str9 = null;
            if (aeVar != null) {
                str = aeVar.openUrl;
            } else {
                str = null;
            }
            boolean z2 = false;
            if (C26512f.m64141b(str)) {
                String builder = Uri.parse(C25653a.f67876a).buildUpon().appendQueryParameter("tag", "result_ad").toString();
                C52711k.m112236a((Object) builder, "Uri.parse(CommercializeC…              .toString()");
                str = C26512f.m64129a(str, builder);
                z = true;
            } else {
                z = false;
            }
            if (C26540w.m64226a(kVar.f68568e.getContext(), str, false)) {
                C26110ae aeVar2 = kVar.f68567d;
                if (aeVar2 != null) {
                    str7 = aeVar2.openUrl;
                } else {
                    str7 = null;
                }
                if (!TextUtils.isEmpty(str7) && (C26533q.m64230a(Uri.parse(str7).getScheme().toLowerCase()) || C26533q.m64238b(str7.toLowerCase()))) {
                    z2 = true;
                }
                if (!z2) {
                    if (z) {
                        C25732e a = C25732e.m62287a();
                        C52711k.m112236a((Object) a, "CommercializeManager.getInstance()");
                        C26110ae aeVar3 = kVar.f68567d;
                        if (aeVar3 == null) {
                            aweme = null;
                        } else {
                            aweme = new Aweme();
                            AwemeRawAd awemeRawAd = new AwemeRawAd();
                            awemeRawAd.setCreativeId(Long.valueOf(aeVar3.getCreativeId()));
                            awemeRawAd.setLogExtra(aeVar3.getLogExtra());
                            aweme.setAwemeRawAd(awemeRawAd);
                            aweme.setAd(true);
                        }
                        a.f68051a = aweme;
                    }
                    C26080b b = C26077e.m63190a().mo53582a("result_ad").mo53593b("open_url_app");
                    C26110ae aeVar4 = kVar.f68567d;
                    if (aeVar4 != null) {
                        l3 = Long.valueOf(aeVar4.f68945id);
                    } else {
                        l3 = null;
                    }
                    C26080b a2 = b.mo53580a(l3);
                    C26110ae aeVar5 = kVar.f68567d;
                    if (aeVar5 != null) {
                        str8 = aeVar5.logExtra;
                    } else {
                        str8 = null;
                    }
                    a2.mo53604i(str8).mo53586a(kVar.f68568e.getContext());
                    C26540w.m64208a((C26534a) new C25977a(kVar));
                }
            } else {
                Context context = kVar.f68568e.getContext();
                C26110ae aeVar6 = kVar.f68567d;
                if (aeVar6 != null) {
                    str3 = aeVar6.webUrl;
                } else {
                    str3 = null;
                }
                C26110ae aeVar7 = kVar.f68567d;
                if (aeVar7 != null) {
                    str4 = aeVar7.webTitle;
                } else {
                    str4 = null;
                }
                C26110ae aeVar8 = kVar.f68567d;
                if (aeVar8 != null) {
                    j = aeVar8.f68945id;
                } else {
                    j = 0;
                }
                Long valueOf = Long.valueOf(j);
                C26110ae aeVar9 = kVar.f68567d;
                if (aeVar9 != null) {
                    str5 = aeVar9.logExtra;
                } else {
                    str5 = null;
                }
                C26453a aVar = new C26453a(valueOf, str5, null, null, null, null, 0, 0, 252, null);
                C26540w.m64225a(context, str3, str4, false, null, true, aVar);
                C26080b b2 = C26077e.m63190a().mo53582a("result_ad").mo53593b("open_url_h5");
                C26110ae aeVar10 = kVar.f68567d;
                if (aeVar10 != null) {
                    l2 = Long.valueOf(aeVar10.f68945id);
                } else {
                    l2 = null;
                }
                C26080b a3 = b2.mo53580a(l2);
                C26110ae aeVar11 = kVar.f68567d;
                if (aeVar11 != null) {
                    str6 = aeVar11.logExtra;
                } else {
                    str6 = null;
                }
                a3.mo53604i(str6).mo53586a(kVar.f68568e.getContext());
            }
            Context context2 = kVar.f68568e.getContext();
            C26110ae aeVar12 = kVar.f68567d;
            if (aeVar12 != null) {
                obj = Long.valueOf(aeVar12.f68945id);
            } else {
                obj = null;
            }
            String valueOf2 = String.valueOf(obj);
            String str10 = "link";
            C26110ae aeVar13 = kVar.f68567d;
            if (aeVar13 != null) {
                str2 = aeVar13.logExtra;
            } else {
                str2 = null;
            }
            C26088l.m63325b(context2, valueOf2, str10, str2);
            C26060ay ayVar = C26060ay.f68819a;
            String str11 = "click";
            C26110ae aeVar14 = kVar.f68567d;
            if (aeVar14 != null) {
                urlModel = aeVar14.clickTrackUrlList;
            } else {
                urlModel = null;
            }
            C26110ae aeVar15 = kVar.f68567d;
            if (aeVar15 != null) {
                l = Long.valueOf(aeVar15.getCreativeId());
            } else {
                l = null;
            }
            C26110ae aeVar16 = kVar.f68567d;
            if (aeVar16 != null) {
                str9 = aeVar16.logExtra;
            }
            ayVar.mo53545a(str11, urlModel, l, str9, (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C25978b<Object,Object,Object>(kVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.k$d */
    public static final class C25980d extends C52712l implements C52682m<C26080b, Boolean, C26080b> {

        /* renamed from: a */
        final /* synthetic */ C26110ae f68572a;

        public C25980d(C26110ae aeVar) {
            this.f68572a = aeVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C26080b bVar = (C26080b) obj;
            ((Boolean) obj2).booleanValue();
            C52711k.m112240b(bVar, "$receiver");
            C26080b a = bVar.mo53575a(this.f68572a);
            C52711k.m112236a((Object) a, "adId(adData)");
            return a;
        }
    }

    /* renamed from: a */
    public final void mo53337a(int i) {
        Object obj;
        Context context = this.f68568e.getContext();
        C26110ae aeVar = this.f68567d;
        String str = null;
        if (aeVar != null) {
            obj = Long.valueOf(aeVar.f68945id);
        } else {
            obj = null;
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder("topic");
        sb.append(i + 1);
        String sb2 = sb.toString();
        C26110ae aeVar2 = this.f68567d;
        if (aeVar2 != null) {
            str = aeVar2.logExtra;
        }
        C26088l.m63337c(context, valueOf, sb2, str);
    }

    /* renamed from: b */
    public final void mo53338b(int i) {
        Object obj;
        Context context = this.f68568e.getContext();
        C26110ae aeVar = this.f68567d;
        String str = null;
        if (aeVar != null) {
            obj = Long.valueOf(aeVar.f68945id);
        } else {
            obj = null;
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder("topic");
        sb.append(i + 1);
        String sb2 = sb.toString();
        C26110ae aeVar2 = this.f68567d;
        if (aeVar2 != null) {
            str = aeVar2.logExtra;
        }
        C26088l.m63344d(context, valueOf, sb2, str);
    }

    public C25976k(View view) {
        C52711k.m112240b(view, "contentView");
        this.f68568e = view;
        DmtTextView dmtTextView = (DmtTextView) this.f68568e.findViewById(R.id.av);
        C52711k.m112236a((Object) dmtTextView, "contentView.adLink");
        this.f68564a = dmtTextView;
        RecyclerView recyclerView = (RecyclerView) this.f68568e.findViewById(R.id.rr);
        C52711k.m112236a((Object) recyclerView, "contentView.challengeView");
        this.f68565b = recyclerView;
        this.f68565b.setLayoutManager(new LinearLayoutManager(this.f68568e.getContext(), 0, false));
    }
}
