package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.feed.C30228f;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.PoiSetting;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g.C37383a;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.model.C39106al;
import com.p683ss.android.ugc.aweme.poi.model.C39123g;
import com.p683ss.android.ugc.aweme.poi.p2061d.C39055a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.ss.android.ugc.trill.R;
import com.taobao.android.dexposed.ClassUtils;
import java.util.Arrays;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.l */
public final class C39024l extends C1352v {

    /* renamed from: r */
    public static final C39025a f99455r = new C39025a(null);

    /* renamed from: a */
    public final Context f99456a;

    /* renamed from: b */
    public final View f99457b;

    /* renamed from: c */
    public final DmtTextView f99458c;

    /* renamed from: d */
    public final ImageView f99459d;

    /* renamed from: e */
    public final ConstraintLayout f99460e;

    /* renamed from: f */
    public final DmtTextView f99461f;

    /* renamed from: g */
    public final DmtTextView f99462g;

    /* renamed from: h */
    public final DmtTextView f99463h;

    /* renamed from: i */
    public final DmtTextView f99464i;

    /* renamed from: j */
    public final ImageView f99465j;

    /* renamed from: k */
    public final ImageView f99466k;

    /* renamed from: l */
    public final Guideline f99467l;

    /* renamed from: m */
    public final LinearLayout f99468m;

    /* renamed from: n */
    public C39106al f99469n;

    /* renamed from: o */
    public C39067g f99470o;

    /* renamed from: p */
    public long f99471p;

    /* renamed from: q */
    public C39055a f99472q;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.l$a */
    public static final class C39025a {
        private C39025a() {
        }

        public /* synthetic */ C39025a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.l$b */
    public static final class C39026b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39024l f99473a;

        public C39026b(C39024l lVar) {
            this.f99473a = lVar;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            try {
                C39067g gVar = this.f99473a.f99470o;
                if (gVar != null) {
                    IESSettingsProxy b = C32816h.m75716b();
                    C52711k.m112236a((Object) b, "SettingsReader.get()");
                    PoiSetting poiSetting = b.getPoiSetting();
                    C52711k.m112236a((Object) poiSetting, "SettingsReader.get().poiSetting");
                    String poiQaListUrl = poiSetting.getPoiQaListUrl();
                    boolean z = false;
                    if (!TextUtils.isEmpty(gVar.getPoiCity())) {
                        z = C52830p.m112406a(gVar.getPoiCity(), C30228f.m70982f(), true);
                    }
                    C52711k.m112236a((Object) poiQaListUrl, "qaListUrl");
                    C37383a a = C37382g.m83707a(poiQaListUrl);
                    String str2 = "poi_id";
                    String poiId = gVar.getPoiId();
                    if (poiId == null) {
                        poiId = "";
                    }
                    C37383a a2 = a.mo76659a(str2, poiId).mo76659a("enter_from", "poi_page");
                    String str3 = "group_id";
                    String awemeId = gVar.getAwemeId();
                    if (awemeId == null) {
                        awemeId = "";
                    }
                    C37383a a3 = a2.mo76659a(str3, awemeId);
                    String str4 = "poi_city";
                    String poiCity = gVar.getPoiCity();
                    if (poiCity == null) {
                        poiCity = "";
                    }
                    C37383a a4 = a3.mo76659a(str4, poiCity);
                    String str5 = "poi_device_samecity";
                    if (z) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    C37383a a5 = a4.mo76659a(str5, str);
                    String str6 = "poi_backend_type";
                    String backendType = gVar.getBackendType();
                    if (backendType == null) {
                        backendType = "";
                    }
                    String uri = a5.mo76659a(str6, backendType).mo76658a().toString();
                    C52711k.m112236a((Object) uri, "RnSchemeHelper.parseRnSc…      .build().toString()");
                    C41302w.m91042a().mo83861a(uri);
                }
            } catch (C10174a unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.l$c */
    public static final class C39027c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f99474a;

        /* renamed from: b */
        final /* synthetic */ C39024l f99475b;

        /* renamed from: c */
        final /* synthetic */ C39123g f99476c;

        /* renamed from: d */
        final /* synthetic */ String f99477d;

        public C39027c(LinearLayout linearLayout, C39024l lVar, C39123g gVar, String str) {
            this.f99474a = linearLayout;
            this.f99475b = lVar;
            this.f99476c = gVar;
            this.f99477d = str;
        }

        public final void run() {
            this.f99475b.f99467l.setGuidelineEnd((int) (((float) this.f99474a.getWidth()) + C9432q.m18687b(this.f99475b.f99456a, 12.0f)));
        }
    }

    public C39024l(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        this.f99456a = context;
        View findViewById = view.findViewById(R.id.d2v);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.top_divider)");
        this.f99457b = findViewById;
        View findViewById2 = view.findViewById(R.id.c7n);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.question_amounts)");
        this.f99458c = (DmtTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.c7p);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.question_more_arrow)");
        this.f99459d = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.tk);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.cl_question_answering)");
        this.f99460e = (ConstraintLayout) findViewById4;
        View findViewById5 = view.findViewById(R.id.c1c);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.poi_question)");
        this.f99461f = (DmtTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.byv);
        C52711k.m112236a((Object) findViewById6, "itemView.findViewById(R.id.poi_answer)");
        this.f99462g = (DmtTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.c0s);
        C52711k.m112236a((Object) findViewById7, "itemView.findViewById(R.id.poi_follow_count)");
        this.f99463h = (DmtTextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.byw);
        C52711k.m112236a((Object) findViewById8, "itemView.findViewById(R.id.poi_answer_more)");
        this.f99464i = (DmtTextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.aq_);
        C52711k.m112236a((Object) findViewById9, "itemView.findViewById(R.id.ic_question)");
        this.f99465j = (ImageView) findViewById9;
        View findViewById10 = view.findViewById(R.id.aq3);
        C52711k.m112236a((Object) findViewById10, "itemView.findViewById(R.id.ic_answer)");
        this.f99466k = (ImageView) findViewById10;
        View findViewById11 = view.findViewById(R.id.an8);
        C52711k.m112236a((Object) findViewById11, "itemView.findViewById(R.id.guideline)");
        this.f99467l = (Guideline) findViewById11;
        View findViewById12 = view.findViewById(R.id.br4);
        C52711k.m112236a((Object) findViewById12, "itemView.findViewById(R.id.no_question_layout)");
        this.f99468m = (LinearLayout) findViewById12;
    }

    /* renamed from: a */
    public static String m86862a(long j, int i) {
        String a = C2240a.m6772a("%.1f", Arrays.copyOf(new Object[]{Float.valueOf((((float) j) * 1.0f) / 10000.0f)}, 1));
        C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
        if (C52830p.m112413c(a, "0", false, 2, null)) {
            CharSequence charSequence = a;
            if (C52830p.m112419a(charSequence, ClassUtils.PACKAGE_SEPARATOR, 0, false, 6, (Object) null) != -1) {
                int a2 = C52830p.m112419a(charSequence, ClassUtils.PACKAGE_SEPARATOR, 0, false, 6, (Object) null);
                if (a != null) {
                    String substring = a.substring(0, a2);
                    C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    return substring;
                }
                throw new C52857u("null cannot be cast to non-null type java.lang.String");
            }
        }
        return a;
    }
}
