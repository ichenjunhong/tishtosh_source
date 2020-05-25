package com.p683ss.android.ugc.aweme.poi.p2074ui.detail.component;

import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.location.C36282r;
import com.p683ss.android.ugc.aweme.location.C36285u.C36286a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.adapter.C38976g;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C38999a;
import com.p683ss.android.ugc.aweme.poi.model.C39095aa;
import com.p683ss.android.ugc.aweme.poi.model.C39102ah;
import com.p683ss.android.ugc.aweme.poi.model.C39103ai;
import com.p683ss.android.ugc.aweme.poi.model.C39111aq;
import com.p683ss.android.ugc.aweme.poi.model.C39127k;
import com.p683ss.android.ugc.aweme.poi.model.C39132p;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.model.p2062a.C39092f;
import com.p683ss.android.ugc.aweme.poi.model.p2062a.C39093g;
import com.p683ss.android.ugc.aweme.poi.p2060c.C39053b;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39389l;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39407s;
import com.p683ss.android.ugc.aweme.poi.p2074ui.PoiNoticeActivity.C39266a;
import com.p683ss.android.ugc.aweme.poi.p2074ui.coupon.C39312e;
import com.p683ss.android.ugc.aweme.poi.utils.C39440a;
import com.p683ss.android.ugc.aweme.poi.utils.C39442c;
import com.p683ss.android.ugc.aweme.poi.utils.C39443d;
import com.p683ss.android.ugc.aweme.poi.utils.C39449i;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.p683ss.android.ugc.aweme.poi.utils.C39460p;
import com.p683ss.android.ugc.aweme.poi.utils.C39462r;
import com.p683ss.android.ugc.aweme.poi.widget.C39488e;
import com.p683ss.android.ugc.aweme.poi.widget.C39489f;
import com.p683ss.android.ugc.aweme.poi.widget.CompoundDrawableAndTextLayout;
import com.p683ss.android.ugc.aweme.poi.widget.HorizontalBusinessComponentLayout;
import com.p683ss.android.ugc.aweme.poi.widget.PoiActsFlipperView;
import com.p683ss.android.ugc.aweme.poi.widget.PoiHeaderLayout;
import com.p683ss.android.ugc.aweme.poi.widget.VerticalSPULayout;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget */
public final class PoiStructureInfoWidget extends LinearLayout {

    /* renamed from: a */
    public PoiDetail f100569a;

    /* renamed from: b */
    public C39389l f100570b;

    /* renamed from: c */
    public C38999a f100571c;

    /* renamed from: d */
    public C38976g f100572d;

    /* renamed from: e */
    public C39067g f100573e;

    /* renamed from: f */
    C39312e f100574f;

    /* renamed from: g */
    private PoiStruct f100575g;

    /* renamed from: h */
    private double f100576h;

    /* renamed from: i */
    private double f100577i;

    /* renamed from: j */
    private C36282r f100578j;

    /* renamed from: k */
    private double f100579k;

    /* renamed from: l */
    private double f100580l;

    /* renamed from: m */
    private HashMap f100581m;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$a */
    static final class C39340a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f100582a;

        C39340a(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f100582a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            VerticalSPULayout verticalSPULayout = (VerticalSPULayout) this.f100582a.mo80177a((int) R.id.eps);
            DmtTextView dmtTextView = (DmtTextView) this.f100582a.mo80177a((int) R.id.f2_);
            C52711k.m112236a((Object) dmtTextView, "tv_elastic");
            ImageView imageView = (ImageView) this.f100582a.mo80177a((int) R.id.e6u);
            C52711k.m112236a((Object) imageView, "elastic_arrow");
            C52711k.m112240b(dmtTextView, "elasticText");
            C52711k.m112240b(imageView, "arrow");
            verticalSPULayout.mo80477a("project_click_more", "");
            int i = 3;
            if (verticalSPULayout.f100978b) {
                if (verticalSPULayout.getChildCount() <= 3) {
                    List<C39102ah> list = verticalSPULayout.f100977a;
                    if (list == null) {
                        C52711k.m112237a("products");
                    }
                    List<C39102ah> list2 = verticalSPULayout.f100977a;
                    if (list2 == null) {
                        C52711k.m112237a("products");
                    }
                    verticalSPULayout.mo80478a(C52575l.m112139e((Collection<? extends T>) C52575l.m112130b(list, list2.size() - 3)));
                }
                int childCount = verticalSPULayout.getChildCount();
                while (i < childCount) {
                    View childAt = verticalSPULayout.getChildAt(i);
                    C52711k.m112236a((Object) childAt, "getChildAt(i)");
                    childAt.setVisibility(0);
                    i++;
                }
                imageView.setImageResource(R.drawable.dk6);
                dmtTextView.setText(verticalSPULayout.getContext().getText(R.string.h1y));
            } else {
                int childCount2 = verticalSPULayout.getChildCount();
                while (i < childCount2) {
                    View childAt2 = verticalSPULayout.getChildAt(i);
                    C52711k.m112236a((Object) childAt2, "getChildAt(i)");
                    childAt2.setVisibility(8);
                    i++;
                }
                imageView.setImageResource(R.drawable.dk5);
                dmtTextView.setText(verticalSPULayout.getContext().getText(R.string.h1v));
            }
            verticalSPULayout.f100978b = !verticalSPULayout.f100978b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$b */
    static final class C39341b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f100583a;

        C39341b(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f100583a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            IAwemeService a = C23324d.m57378a();
            C39067g gVar = this.f100583a.f100573e;
            String str2 = null;
            if (gVar != null) {
                str = gVar.getAwemeId();
            } else {
                str = null;
            }
            Aweme rawAdAwemeById = a.getRawAdAwemeById(str);
            C39452l.m87735a("click_address", "click", this.f100583a.f100573e);
            C38999a aVar = this.f100583a.f100571c;
            if (aVar != null) {
                aVar.mo79150a(true);
            }
            Context context = this.f100583a.getContext();
            String str3 = "address";
            C39067g gVar2 = this.f100583a.f100573e;
            if (gVar2 != null) {
                str2 = gVar2.getPoiId();
            }
            C39443d.m87702a(context, rawAdAwemeById, str3, str2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$c */
    static final class C39342c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f100584a;

        C39342c(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f100584a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickInstrumentation.onClick(view);
            PoiDetail poiDetail = this.f100584a.f100569a;
            if (poiDetail != null) {
                if (poiDetail.isEnterprise()) {
                    C39462r.m87768a(this.f100584a.getContext(), this.f100584a.f100569a, "poi_page", this.f100584a.f100573e, true, "click_button");
                } else {
                    IAwemeService a = C23324d.m57378a();
                    C39067g gVar = this.f100584a.f100573e;
                    String str3 = null;
                    if (gVar != null) {
                        str = gVar.getAwemeId();
                    } else {
                        str = null;
                    }
                    Aweme rawAdAwemeById = a.getRawAdAwemeById(str);
                    Context context = this.f100584a.getContext();
                    C39067g gVar2 = this.f100584a.f100573e;
                    if (gVar2 != null) {
                        str2 = gVar2.getPoiId();
                    } else {
                        str2 = null;
                    }
                    C39443d.m87708c(context, rawAdAwemeById, str2);
                    Context context2 = this.f100584a.getContext();
                    PoiDetail poiDetail2 = this.f100584a.f100569a;
                    if (poiDetail2 != null) {
                        str3 = poiDetail2.getPhone();
                    }
                    C39462r.m87769a(context2, str3, "poi_page", "click_button", this.f100584a.f100573e);
                }
                C39053b.m86889a("click", "contacts", "poi_page", "poi_page", this.f100584a.f100573e, null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$d */
    public static final class C39343d extends C47687av {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f100585a;

        C39343d(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f100585a = poiStructureInfoWidget;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
            if (com.p683ss.android.ugc.aweme.poi.utils.C39449i.m87720a(r2.getEnterpriseId()) != false) goto L_0x002a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo59929a(android.view.View r12) {
            /*
                r11 = this;
                com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget r12 = r11.f100585a
                com.ss.android.ugc.aweme.poi.model.PoiDetail r12 = r12.f100569a
                if (r12 == 0) goto L_0x004d
                boolean r0 = r12.isEnterprise()
                r1 = 0
                if (r0 == 0) goto L_0x000e
                goto L_0x000f
            L_0x000e:
                r12 = r1
            L_0x000f:
                if (r12 == 0) goto L_0x004d
                com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget r12 = r11.f100585a
                com.ss.android.ugc.aweme.poi.model.PoiDetail r0 = r12.f100569a
                if (r0 == 0) goto L_0x0029
                com.ss.android.ugc.aweme.poi.model.PoiDetail r2 = r12.f100569a
                if (r2 != 0) goto L_0x001e
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x001e:
                java.lang.String r2 = r2.getEnterpriseId()
                boolean r2 = com.p683ss.android.ugc.aweme.poi.utils.C39449i.m87720a(r2)
                if (r2 == 0) goto L_0x0029
                goto L_0x002a
            L_0x0029:
                r0 = r1
            L_0x002a:
                android.content.Context r2 = r12.getContext()
                com.ss.android.ugc.aweme.poi.g r12 = r12.f100573e
                if (r12 == 0) goto L_0x0036
                java.lang.String r1 = r12.getAwemeId()
            L_0x0036:
                com.p683ss.android.ugc.aweme.poi.utils.C39462r.m87767a(r2, r0, r1)
                java.lang.String r3 = "click"
                java.lang.String r4 = "merchants"
                java.lang.String r5 = "poi_page"
                java.lang.String r6 = "poi_page"
                com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget r12 = r11.f100585a
                com.ss.android.ugc.aweme.poi.g r7 = r12.f100573e
                r8 = 0
                r9 = 32
                r10 = 0
                com.p683ss.android.ugc.aweme.poi.p2060c.C39053b.m86889a(r3, r4, r5, r6, r7, null)
                return
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.p2074ui.detail.component.PoiStructureInfoWidget.C39343d.mo59929a(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$e */
    static final class C39344e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f100586a;

        C39344e(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f100586a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C32800a.m75679a(view)) {
                C39389l lVar = this.f100586a.f100570b;
                if (lVar != null) {
                    lVar.mo80356a(view, false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$f */
    static final class C39345f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f100587a;

        C39345f(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f100587a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            PoiDetail poiDetail = this.f100587a.f100569a;
            if (poiDetail != null) {
                C39067g gVar = this.f100587a.f100573e;
                String str2 = "click_poi_introduction";
                C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page");
                String str3 = "previous_page";
                C39067g gVar2 = this.f100587a.f100573e;
                if (gVar2 != null) {
                    str = gVar2.getPreviousPage();
                } else {
                    str = null;
                }
                C39452l.m87730a(gVar, str2, a.mo47829a(str3, str).mo47829a("poi_id", poiDetail.getPoiId()));
                StringBuilder sb = new StringBuilder("https://aweme.snssdk.com/falcon/douyin_falcon/poi/detail/?poi_id=");
                sb.append(poiDetail.getPoiId());
                String sb2 = sb.toString();
                Bundle bundle = new Bundle();
                bundle.putString("title", poiDetail.getDesc());
                bundle.putBoolean("hide_nav_bar", false);
                bundle.putBoolean("hide_status_bar", false);
                bundle.putBoolean("show_closeall", false);
                C39460p.m87761a(this.f100587a.getContext(), sb2, bundle);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$g */
    static final class C39346g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f100588a;

        C39346g(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f100588a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            long j;
            C39132p pVar;
            String str;
            String str2;
            ClickInstrumentation.onClick(view);
            PoiDetail poiDetail = this.f100588a.f100569a;
            if (poiDetail != null) {
                j = poiDetail.getPoiRankClassCode();
            } else {
                j = -1;
            }
            PoiDetail poiDetail2 = this.f100588a.f100569a;
            String str3 = null;
            if (poiDetail2 != null) {
                pVar = poiDetail2.getPoiRankBundle();
            } else {
                pVar = null;
            }
            if (j != -1 && pVar != null) {
                if (pVar.classOption != null) {
                    C39093g gVar = pVar.classOption;
                    C52711k.m112236a((Object) gVar, "poiClassRankStruct.classOption");
                    str = gVar.getName();
                } else {
                    str = "";
                }
                C39067g gVar2 = this.f100588a.f100573e;
                String str4 = "enter_poi_leaderboard";
                C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("city_info", C23198ae.m56845a()).mo47829a("enter_method", "click_leaderboard_bar");
                String str5 = "poi_channel";
                C39127k kVar = pVar.backendType;
                if (kVar != null) {
                    str2 = kVar.getCode();
                } else {
                    str2 = null;
                }
                C23089d a2 = a.mo47829a(str5, str2).mo47829a("sub_class", str).mo47829a("district_code", pVar.districtCode);
                String str6 = "poi_id";
                C39067g gVar3 = this.f100588a.f100573e;
                if (gVar3 != null) {
                    str3 = gVar3.getPoiId();
                }
                C39452l.m87730a(gVar2, str4, a2.mo47829a(str6, str3));
                Bundle bundle = new Bundle();
                bundle.putSerializable("poi_rank", pVar);
                bundle.putString("enter_from", "poi_page");
                bundle.putString("enter_method", "click_leaderboard_bar");
                bundle.putString("district_code", pVar.districtCode);
                Context context = this.f100588a.getContext();
                C52711k.m112236a((Object) context, "context");
                C39407s.m87632a(context, bundle);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$h */
    static final class C39347h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f100589a;

        C39347h(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f100589a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            if (this.f100589a.f100572d == null) {
                PoiStructureInfoWidget poiStructureInfoWidget = this.f100589a;
                C39067g gVar = this.f100589a.f100573e;
                String str2 = "poi_page";
                PoiDetail poiDetail = this.f100589a.f100569a;
                if (poiDetail != null) {
                    str = poiDetail.getBackendType();
                } else {
                    str = null;
                }
                poiStructureInfoWidget.f100572d = new C38976g(gVar, str2, 0, str);
            }
            ((PoiActsFlipperView) this.f100589a.mo80177a((int) R.id.bzg)).mo80443a();
            C38976g gVar2 = this.f100589a.f100572d;
            if (gVar2 != null) {
                Context context = this.f100589a.getContext();
                C52711k.m112236a((Object) context, "context");
                PoiActsFlipperView poiActsFlipperView = (PoiActsFlipperView) this.f100589a.mo80177a((int) R.id.bzg);
                C52711k.m112236a((Object) poiActsFlipperView, "poi_detail_act_content");
                C39092f currentItem = poiActsFlipperView.getCurrentItem();
                if (currentItem == null) {
                    C52711k.m112234a();
                }
                PoiActsFlipperView poiActsFlipperView2 = (PoiActsFlipperView) this.f100589a.mo80177a((int) R.id.bzg);
                C52711k.m112236a((Object) poiActsFlipperView2, "poi_detail_act_content");
                gVar2.mo79131a(context, currentItem, poiActsFlipperView2.getCurrentPosition());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$i */
    static final class C39348i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f100590a;

        C39348i(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f100590a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            PoiDetail poiDetail = this.f100590a.f100569a;
            if (poiDetail != null) {
                Context context = this.f100590a.getContext();
                C52711k.m112236a((Object) context, "context");
                String poiName = poiDetail.getPoiName();
                C52711k.m112236a((Object) poiName, "getPoiName()");
                C39092f merchantAct = poiDetail.getMerchantAct();
                C52711k.m112236a((Object) merchantAct, "merchantAct");
                C39266a.m87280a(context, poiName, merchantAct);
                C39067g gVar = this.f100590a.f100573e;
                String str2 = "merchant_event_click";
                C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page");
                String str3 = "previous_page";
                C39067g gVar2 = this.f100590a.f100573e;
                String str4 = null;
                if (gVar2 != null) {
                    str = gVar2.getPreviousPage();
                } else {
                    str = null;
                }
                C23089d a2 = a.mo47829a(str3, str);
                String str5 = "poi_id";
                C39067g gVar3 = this.f100590a.f100573e;
                if (gVar3 != null) {
                    str4 = gVar3.getPoiId();
                }
                C39452l.m87730a(gVar, str2, a2.mo47829a(str5, str4).mo47829a("merchant_event_id", poiDetail.getMerchantActId()));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$j */
    static final class C39349j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f100591a;

        C39349j(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f100591a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            PoiDetail poiDetail = this.f100591a.f100569a;
            if (poiDetail != null) {
                C39103ai aiVar = poiDetail.productInfo;
                if (aiVar != null) {
                    String str = aiVar.supplierId;
                    if (str != null) {
                        Context context = this.f100591a.getContext();
                        C52711k.m112236a((Object) context, "context");
                        C52711k.m112240b(context, "context");
                        C52711k.m112240b(str, "supplierId");
                    }
                }
            }
            C0013i.m18a((Callable<TResult>) new C39350k<TResult>(this.f100591a), (Executor) C26890h.m65003a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$k */
    static final class C39350k<V> implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f100592a;

        C39350k(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f100592a = poiStructureInfoWidget;
        }

        public final /* synthetic */ Object call() {
            C39452l.m87730a(this.f100592a.f100573e, "service_facility_bar_click", this.f100592a.getServiceMobParams());
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$l */
    static final class C39351l<V> implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f100593a;

        C39351l(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f100593a = poiStructureInfoWidget;
        }

        public final /* synthetic */ Object call() {
            C39452l.m87730a(this.f100593a.f100573e, "service_facility_bar_show", this.f100593a.getServiceMobParams());
            return null;
        }
    }

    public PoiStructureInfoWidget(Context context) {
        this(context, null, 0, 6, null);
    }

    public PoiStructureInfoWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final View mo80177a(int i) {
        if (this.f100581m == null) {
            this.f100581m = new HashMap();
        }
        View view = (View) this.f100581m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f100581m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: g */
    private final boolean m87453g() {
        PoiDetail poiDetail = this.f100569a;
        if (poiDetail != null) {
            return poiDetail.isEnterprise();
        }
        return false;
    }

    /* renamed from: o */
    private final void m87461o() {
        C0013i.m18a((Callable<TResult>) new C39351l<TResult>(this), (Executor) C26890h.m65003a());
    }

    /* renamed from: e */
    private final void m87451e() {
        PoiDetail poiDetail = this.f100569a;
        if (poiDetail != null) {
            String poiRank = poiDetail.getPoiRank();
            if (poiRank != null && C39449i.m87720a(poiRank)) {
                m87452f();
                LinearLayout linearLayout = (LinearLayout) mo80177a((int) R.id.c0l);
                C52711k.m112236a((Object) linearLayout, "poi_detail_rank_layout");
                linearLayout.setVisibility(0);
                ((CompoundDrawableAndTextLayout) mo80177a((int) R.id.c0k)).setText(poiRank);
            }
        }
    }

    /* renamed from: i */
    private final void m87455i() {
        boolean z;
        PoiDetail poiDetail = this.f100569a;
        if (poiDetail != null) {
            String str = poiDetail.supplierTag;
            if (str != null) {
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    str = null;
                }
                if (str != null) {
                    DmtTextView dmtTextView = (DmtTextView) mo80177a((int) R.id.f4r);
                    C52711k.m112236a((Object) dmtTextView, "tv_supplier_tag");
                    dmtTextView.setVisibility(0);
                    DmtTextView dmtTextView2 = (DmtTextView) mo80177a((int) R.id.f4r);
                    C52711k.m112236a((Object) dmtTextView2, "tv_supplier_tag");
                    dmtTextView2.setText(str);
                }
            }
        }
    }

    /* renamed from: l */
    private final void m87458l() {
        PoiDetail poiDetail = this.f100569a;
        if (poiDetail != null) {
            String desc = poiDetail.getDesc();
            if (desc != null && C39449i.m87720a(desc)) {
                LinearLayout linearLayout = (LinearLayout) mo80177a((int) R.id.bzm);
                C52711k.m112236a((Object) linearLayout, "poi_detail_desc_layout");
                linearLayout.setVisibility(0);
                ((CompoundDrawableAndTextLayout) mo80177a((int) R.id.bzl)).setText(desc);
            }
        }
    }

    /* renamed from: m */
    private final boolean m87459m() {
        C39103ai aiVar;
        if (this.f100569a != null) {
            PoiDetail poiDetail = this.f100569a;
            String str = null;
            if (poiDetail != null) {
                aiVar = poiDetail.productInfo;
            } else {
                aiVar = null;
            }
            if (aiVar != null) {
                PoiDetail poiDetail2 = this.f100569a;
                if (poiDetail2 != null) {
                    C39103ai aiVar2 = poiDetail2.productInfo;
                    if (aiVar2 != null) {
                        str = aiVar2.supplierId;
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    PoiDetail poiDetail3 = this.f100569a;
                    if (poiDetail3 != null) {
                        C39103ai aiVar3 = poiDetail3.productInfo;
                        if (aiVar3 != null && aiVar3.hotelDetailEntry) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m87460n() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.poi.model.PoiDetail r0 = r4.f100569a
            if (r0 == 0) goto L_0x000b
            com.ss.android.ugc.aweme.poi.model.ai r0 = r0.productInfo
            if (r0 == 0) goto L_0x000b
            java.util.List<java.lang.Object> r0 = r0.hotelFeatures
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
            if (r1 == 0) goto L_0x0016
            return
        L_0x0016:
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r2 = 2132021794(0x7f141222, float:1.968199E38)
            android.view.View r2 = r4.mo80177a(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            java.lang.String r3 = "poi_service_item_container"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.p683ss.android.ugc.aweme.poi.p2074ui.C39407s.m87633a(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.p2074ui.detail.component.PoiStructureInfoWidget.m87460n():void");
    }

    public final C23089d getServiceMobParams() {
        String str;
        C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page");
        String str2 = "previous_page";
        C39067g gVar = this.f100573e;
        if (gVar != null) {
            str = gVar.getPreviousPage();
        } else {
            str = null;
        }
        C23089d a2 = a.mo47829a(str2, str);
        C52711k.m112236a((Object) a2, "EventMapBuilder.newBuild…mpleBundle?.previousPage)");
        return a2;
    }

    /* renamed from: d */
    private final boolean m87450d() {
        String str;
        String str2;
        PoiDetail poiDetail = this.f100569a;
        if (poiDetail != null) {
            String merchantActTitle = poiDetail.getMerchantActTitle();
            if (merchantActTitle != null && C39449i.m87720a(merchantActTitle)) {
                LinearLayout linearLayout = (LinearLayout) mo80177a((int) R.id.c17);
                C52711k.m112236a((Object) linearLayout, "poi_merchant_act_layout");
                linearLayout.setVisibility(0);
                ((CompoundDrawableAndTextLayout) mo80177a((int) R.id.c16)).setText(merchantActTitle);
                C39067g gVar = this.f100573e;
                String str3 = "merchant_event_show";
                C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page");
                String str4 = "previous_page";
                C39067g gVar2 = this.f100573e;
                String str5 = null;
                if (gVar2 != null) {
                    str = gVar2.getPreviousPage();
                } else {
                    str = null;
                }
                C23089d a2 = a.mo47829a(str4, str);
                String str6 = "poi_id";
                C39067g gVar3 = this.f100573e;
                if (gVar3 != null) {
                    str2 = gVar3.getPoiId();
                } else {
                    str2 = null;
                }
                C23089d a3 = a2.mo47829a(str6, str2);
                String str7 = "merchant_event_id";
                PoiDetail poiDetail2 = this.f100569a;
                if (poiDetail2 != null) {
                    str5 = poiDetail2.getMerchantActId();
                }
                C39452l.m87730a(gVar, str3, a3.mo47829a(str7, str5));
                return true;
            }
        }
        return false;
    }

    private final void getLocation() {
        this.f100578j = C36286a.m81925a().mo75120b(null);
        C36282r rVar = this.f100578j;
        if (rVar != null) {
            C36286a.m81925a().mo75121b();
            try {
                this.f100579k = rVar.getLatitude();
                this.f100580l = rVar.getLongitude();
                if (!rVar.isGaode()) {
                    double[] a = C39440a.m87681a(this.f100580l, this.f100579k);
                    this.f100580l = a[0];
                    this.f100579k = a[1];
                }
            } catch (Exception e) {
                C32458a.m75143a(e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ad, code lost:
        if (r0 == null) goto L_0x00b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m87446a() {
        /*
            r11 = this;
            double r0 = r11.f100576h
            double r2 = r11.f100577i
            boolean r0 = com.p683ss.android.ugc.aweme.poi.utils.C39462r.m87773a(r0, r2)
            r1 = 2132021680(0x7f1411b0, float:1.9681758E38)
            if (r0 == 0) goto L_0x0057
            double r2 = r11.f100579k
            double r4 = r11.f100580l
            boolean r0 = com.p683ss.android.ugc.aweme.poi.utils.C39462r.m87773a(r2, r4)
            if (r0 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.poi.model.PoiDetail r0 = r11.f100569a
            if (r0 == 0) goto L_0x001e
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r0.poiStruct
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            com.ss.android.ugc.aweme.location.r r2 = r11.f100578j
            boolean r0 = com.p683ss.android.ugc.aweme.poi.utils.C39468x.m87786a(r0, r2)
            if (r0 == 0) goto L_0x0057
            android.view.View r0 = r11.mo80177a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0
            java.lang.String r2 = "poi_detail_loc_distance"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            r2 = 0
            r0.setVisibility(r2)
            android.view.View r0 = r11.mo80177a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_detail_loc_distance"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.content.Context r2 = r11.getContext()
            double r3 = r11.f100576h
            double r5 = r11.f100577i
            double r7 = r11.f100579k
            double r9 = r11.f100580l
            java.lang.String r1 = com.p683ss.android.ugc.aweme.poi.utils.C39442c.m87699b(r2, r3, r5, r7, r9)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            goto L_0x0067
        L_0x0057:
            android.view.View r0 = r11.mo80177a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0
            java.lang.String r1 = "poi_detail_loc_distance"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
        L_0x0067:
            r0 = 2132021672(0x7f1411a8, float:1.9681742E38)
            android.view.View r1 = r11.mo80177a(r0)
            com.ss.android.ugc.aweme.poi.widget.CompoundDrawableAndTextLayout r1 = (com.p683ss.android.ugc.aweme.poi.widget.CompoundDrawableAndTextLayout) r1
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r11.f100575g
            r3 = 2131954789(0x7f130c65, float:1.9546087E38)
            r1.mo80435a(r2, r3)
            r1 = 2132021675(0x7f1411ab, float:1.9681748E38)
            android.view.View r1 = r11.mo80177a(r1)
            r2 = r1
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            android.view.View r0 = r11.mo80177a(r0)
            com.ss.android.ugc.aweme.poi.widget.CompoundDrawableAndTextLayout r0 = (com.p683ss.android.ugc.aweme.poi.widget.CompoundDrawableAndTextLayout) r0
            java.lang.String r1 = "poi_detail_loc_addr"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.widget.TextView r0 = r0.getTextView()
            java.lang.String r1 = "poi_detail_loc_addr.textView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.CharSequence r3 = r0.getText()
            android.content.Context r4 = r11.getContext()
            r5 = 2132547549(0x7f1c17dd, float:2.0748347E38)
            java.lang.String r6 = "poi_address"
            com.ss.android.ugc.aweme.poi.model.PoiDetail r7 = r11.f100569a
            com.ss.android.ugc.aweme.poi.g r0 = r11.f100573e
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = r0.getPreviousPage()
            if (r0 != 0) goto L_0x00b0
            goto L_0x00b2
        L_0x00b0:
            r8 = r0
            goto L_0x00b5
        L_0x00b2:
            java.lang.String r0 = ""
            goto L_0x00b0
        L_0x00b5:
            com.p683ss.android.ugc.aweme.poi.utils.C39462r.m87771a(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.p2074ui.detail.component.PoiStructureInfoWidget.m87446a():void");
    }

    /* renamed from: b */
    private final void m87448b() {
        boolean z;
        List list;
        ((PoiHeaderLayout) mo80177a((int) R.id.c0w)).mo80450a(this.f100569a);
        LinearLayout linearLayout = (LinearLayout) mo80177a((int) R.id.bzs);
        C52711k.m112236a((Object) linearLayout, "poi_detail_loc_addr_layout");
        if (linearLayout.getVisibility() == 8) {
            z = true;
        } else {
            z = false;
        }
        m87446a();
        m87451e();
        m87458l();
        m87454h();
        m87449c();
        m87457k();
        m87456j();
        PoiDetail poiDetail = this.f100569a;
        if (poiDetail != null) {
            list = poiDetail.getActs();
        } else {
            list = null;
        }
        if (!C9376b.m18558a((Collection<T>) list)) {
            LinearLayout linearLayout2 = (LinearLayout) mo80177a((int) R.id.bzh);
            C52711k.m112236a((Object) linearLayout2, "poi_detail_act_layout");
            linearLayout2.setVisibility(0);
            ((PoiActsFlipperView) mo80177a((int) R.id.bzg)).mo80444a(list, this.f100573e);
            if (z) {
                ((LinearLayout) mo80177a((int) R.id.bzh)).setPadding(0, (int) C9432q.m18687b(getContext(), 7.0f), 0, 0);
            }
            z = false;
        }
        boolean d = m87450d();
        if (z) {
            z = !d;
        }
        if (z) {
            View a = mo80177a((int) R.id.bzr);
            C52711k.m112236a((Object) a, "poi_detail_loc_addr_divider");
            a.setVisibility(8);
        }
        DmtTextView dmtTextView = (DmtTextView) mo80177a((int) R.id.c0m);
        C52711k.m112236a((Object) dmtTextView, "poi_detail_rank_more");
        dmtTextView.setVisibility(0);
        DmtTextView dmtTextView2 = (DmtTextView) mo80177a((int) R.id.bzi);
        C52711k.m112236a((Object) dmtTextView2, "poi_detail_act_more");
        dmtTextView2.setVisibility(0);
        DmtTextView dmtTextView3 = (DmtTextView) mo80177a((int) R.id.c18);
        C52711k.m112236a((Object) dmtTextView3, "poi_merchant_act_more");
        dmtTextView3.setVisibility(0);
    }

    /* renamed from: c */
    private final void m87449c() {
        String str;
        PoiDetail poiDetail = this.f100569a;
        if (poiDetail != null) {
            str = poiDetail.getPhone();
        } else {
            str = null;
        }
        if (C39449i.m87720a(str)) {
            ImageView imageView = (ImageView) mo80177a((int) R.id.c02);
            C52711k.m112236a((Object) imageView, "poi_detail_loc_phone");
            imageView.setVisibility(0);
            View a = mo80177a((int) R.id.c03);
            C52711k.m112236a((Object) a, "poi_detail_loc_phone_divider");
            a.setVisibility(0);
        }
        PoiDetail poiDetail2 = this.f100569a;
        if (poiDetail2 != null) {
            if (!m87453g()) {
                poiDetail2 = null;
            }
            if (poiDetail2 != null) {
                View a2 = mo80177a((int) R.id.epa);
                C52711k.m112236a((Object) a2, "poi_detail_merchant_homepage_divider");
                a2.setVisibility(0);
                ImageView imageView2 = (ImageView) mo80177a((int) R.id.ep_);
                C52711k.m112236a((Object) imageView2, "poi_detail_merchant_homepage");
                imageView2.setVisibility(0);
                C39053b.m86889a("show", "merchants", "poi_page", "poi_page", this.f100573e, null);
                if (C39449i.m87720a(poiDetail2.getPhone())) {
                    C39053b.m86889a("show", "contacts", "poi_page", "poi_page", this.f100573e, null);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r1 == null) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m87452f() {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.poi.model.PoiDetail r0 = r10.f100569a
            if (r0 == 0) goto L_0x0089
            com.ss.android.ugc.aweme.poi.model.p r0 = r0.getPoiRankBundle()
            if (r0 == 0) goto L_0x0089
            com.ss.android.ugc.aweme.poi.model.a.g r1 = r0.classOption
            if (r1 == 0) goto L_0x0014
            java.lang.String r1 = r1.getName()
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            java.lang.String r1 = ""
        L_0x0016:
            com.ss.android.ugc.aweme.poi.g r2 = r10.f100573e
            java.lang.String r3 = "leaderboard_bar_show"
            com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r5 = "enter_from"
            java.lang.String r6 = "poi_page"
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
            java.lang.String r5 = "previous_page"
            com.ss.android.ugc.aweme.poi.g r6 = r10.f100573e
            r7 = 0
            if (r6 == 0) goto L_0x0032
            java.lang.String r6 = r6.getPreviousPage()
            goto L_0x0033
        L_0x0032:
            r6 = r7
        L_0x0033:
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
            java.lang.String r5 = "rank_index"
            long r8 = r0.rankValue
            java.lang.String r6 = java.lang.String.valueOf(r8)
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
            java.lang.String r5 = "poi_channel"
            com.ss.android.ugc.aweme.poi.model.PoiDetail r6 = r10.f100569a
            if (r6 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.poi.model.p r6 = r6.getPoiRankBundle()
            if (r6 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.poi.model.k r6 = r6.backendType
            if (r6 == 0) goto L_0x0058
            java.lang.String r6 = r6.getCode()
            goto L_0x0059
        L_0x0058:
            r6 = r7
        L_0x0059:
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
            java.lang.String r5 = "sub_class"
            com.ss.android.ugc.aweme.app.f.d r1 = r4.mo47829a(r5, r1)
            java.lang.String r4 = "city_info"
            java.lang.String r5 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56845a()
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r4, r5)
            java.lang.String r4 = "district_code"
            java.lang.String r0 = r0.districtCode
            com.ss.android.ugc.aweme.app.f.d r0 = r1.mo47829a(r4, r0)
            java.lang.String r1 = "poi_id"
            com.ss.android.ugc.aweme.poi.model.PoiDetail r4 = r10.f100569a
            if (r4 == 0) goto L_0x0081
            com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r4.poiStruct
            if (r4 == 0) goto L_0x0081
            java.lang.String r7 = r4.poiId
        L_0x0081:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r7)
            com.p683ss.android.ugc.aweme.poi.utils.C39452l.m87730a(r2, r3, r0)
            return
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.p2074ui.detail.component.PoiStructureInfoWidget.m87452f():void");
    }

    /* renamed from: h */
    private final void m87454h() {
        String str;
        PoiDetail poiDetail = this.f100569a;
        if (poiDetail != null) {
            List<C39095aa> list = poiDetail.poiMultiServices;
            if (list != null) {
                if (!(!list.isEmpty())) {
                    list = null;
                }
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (C39095aa aaVar : list) {
                        Context context = getContext();
                        C52711k.m112236a((Object) context, "context");
                        C52711k.m112236a((Object) aaVar, "service");
                        C39488e a = C39489f.m87835a(context, aaVar, this.f100573e);
                        if (a != null) {
                            List suppliers = aaVar.getSuppliers();
                            if (suppliers != null) {
                                if (!(!suppliers.isEmpty())) {
                                    suppliers = null;
                                }
                                if (suppliers != null) {
                                    if (suppliers.size() > 1) {
                                        Iterable<C39111aq> iterable = suppliers;
                                        Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable, 10));
                                        for (C39111aq supplier : iterable) {
                                            arrayList2.add(supplier.getSupplier());
                                        }
                                        str = ((List) arrayList2).toString();
                                    } else {
                                        str = String.valueOf(((C39111aq) suppliers.get(0)).getSupplier());
                                    }
                                    C39053b.m86889a("show", aaVar.getServiceName(), "poi_page", "poi_page", this.f100573e, str);
                                }
                            }
                            arrayList.add(a);
                        }
                    }
                    if (arrayList.size() > 2) {
                        m87455i();
                        ((HorizontalBusinessComponentLayout) mo80177a((int) R.id.bzj)).mo80441a(arrayList);
                        View a2 = mo80177a((int) R.id.c0p);
                        C52711k.m112236a((Object) a2, "poi_detail_reserve_and_queue_divider");
                        a2.setVisibility(0);
                    } else {
                        m87447a(arrayList);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private final void m87456j() {
        PoiDetail poiDetail = this.f100569a;
        if (poiDetail != null) {
            if (!poiDetail.hasValidSPUProduct()) {
                poiDetail = null;
            }
            if (poiDetail != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) mo80177a((int) R.id.e22);
                C52711k.m112236a((Object) constraintLayout, "cl_poi_spu_layout");
                constraintLayout.setVisibility(0);
                View a = mo80177a((int) R.id.epr);
                C52711k.m112236a((Object) a, "poi_spu_divider");
                a.setVisibility(0);
                DmtTextView dmtTextView = (DmtTextView) mo80177a((int) R.id.ewi);
                C52711k.m112236a((Object) dmtTextView, "spu_title");
                dmtTextView.setText(poiDetail.productInfo.title);
                VerticalSPULayout verticalSPULayout = (VerticalSPULayout) mo80177a((int) R.id.eps);
                List<C39102ah> list = poiDetail.productInfo.products;
                C52711k.m112236a((Object) list, "productInfo.products");
                verticalSPULayout.mo80479a(list, this.f100573e);
                C39103ai aiVar = poiDetail.productInfo;
                C52711k.m112236a((Object) aiVar, "productInfo");
                if (aiVar.getSize() > 3) {
                    LinearLayout linearLayout = (LinearLayout) mo80177a((int) R.id.e6v);
                    C52711k.m112236a((Object) linearLayout, "elastic_layout");
                    linearLayout.setVisibility(0);
                    ((LinearLayout) mo80177a((int) R.id.e6v)).setOnClickListener(new C39340a(this));
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.String, java.util.List]
      uses: [java.util.List, ?[OBJECT, ARRAY]]
      mth insns count: 65
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m87457k() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.poi.model.PoiDetail r0 = r7.f100569a
            r1 = 0
            if (r0 == 0) goto L_0x000a
            com.ss.android.ugc.aweme.poi.model.d r0 = r0.getPoiActivityInfo()
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            r2 = 2132543477(0x7f1c07f5, float:2.0740088E38)
            if (r0 != 0) goto L_0x002c
            com.ss.android.ugc.aweme.poi.g r0 = r7.f100573e
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = r0.getActivityId()
        L_0x0018:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x002b
            android.content.Context r0 = r7.getContext()
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r0, r2)
            r0.mo19066a()
        L_0x002b:
            return
        L_0x002c:
            com.ss.android.ugc.aweme.poi.model.PoiDetail r3 = r7.f100569a
            if (r3 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.poi.model.w r3 = r3.poiExtension
            if (r3 == 0) goto L_0x003b
            int r3 = r3.source
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x003d
        L_0x003b:
            java.lang.String r3 = ""
        L_0x003d:
            java.lang.String r3 = r3.toString()
            r4 = 2132021633(0x7f141181, float:1.9681663E38)
            android.view.View r4 = r7.mo80177a(r4)
            com.ss.android.ugc.aweme.poi.ui.coupon.PoiAdLayout r4 = (com.p683ss.android.ugc.aweme.poi.p2074ui.coupon.PoiAdLayout) r4
            com.ss.android.ugc.aweme.poi.model.a r5 = r0.getAdCard()
            com.ss.android.ugc.aweme.poi.g r6 = r7.f100573e
            r4.mo80121a(r5, r3, r6)
            com.ss.android.ugc.aweme.commercialize.coupon.model.b r3 = r0.getCouponInfo()
            if (r3 == 0) goto L_0x009a
            com.ss.android.ugc.aweme.poi.g r3 = r7.f100573e
            if (r3 == 0) goto L_0x0062
            java.lang.String r3 = r3.getActivityId()
            goto L_0x0063
        L_0x0062:
            r3 = r1
        L_0x0063:
            boolean r3 = com.p683ss.android.ugc.aweme.poi.utils.C39449i.m87720a(r3)
            if (r3 == 0) goto L_0x009a
            com.ss.android.ugc.aweme.commercialize.coupon.model.b r3 = r0.getCouponInfo()
            java.lang.String r4 = "poiActivityInfo.couponInfo"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            int r3 = r3.getActivityId()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            com.ss.android.ugc.aweme.poi.g r4 = r7.f100573e
            if (r4 != 0) goto L_0x0083
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0083:
            java.lang.String r4 = r4.getActivityId()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x009a
            android.content.Context r3 = r7.getContext()
            com.bytedance.ies.dmt.ui.d.a r2 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r3, r2)
            r2.mo19066a()
        L_0x009a:
            r2 = 2132021659(0x7f14119b, float:1.9681716E38)
            android.view.View r2 = r7.mo80177a(r2)
            com.ss.android.ugc.aweme.poi.ui.coupon.PoiCouponLayout r2 = (com.p683ss.android.ugc.aweme.poi.p2074ui.coupon.PoiCouponLayout) r2
            com.ss.android.ugc.aweme.commercialize.coupon.model.b r0 = r0.getCouponInfo()
            com.ss.android.ugc.aweme.poi.ui.coupon.e r3 = r7.f100574f
            com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r7.f100575g
            if (r4 == 0) goto L_0x00b1
            java.util.List r1 = r4.getVoucherReleaseAreas()
        L_0x00b1:
            com.ss.android.ugc.aweme.poi.g r4 = r7.f100573e
            r2.mo80123a(r0, r3, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.p2074ui.detail.component.PoiStructureInfoWidget.m87457k():void");
    }

    /* renamed from: a */
    private final void m87447a(ArrayList<C39488e> arrayList) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            C39488e eVar = (C39488e) it.next();
            if (i == 0) {
                CompoundDrawableAndTextLayout compoundDrawableAndTextLayout = (CompoundDrawableAndTextLayout) mo80177a((int) R.id.epm);
                C52711k.m112236a((Object) compoundDrawableAndTextLayout, "poi_service_1");
                compoundDrawableAndTextLayout.setVisibility(0);
                ((CompoundDrawableAndTextLayout) mo80177a((int) R.id.epm)).setText(eVar.f101017a);
                ((CompoundDrawableAndTextLayout) mo80177a((int) R.id.epm)).mo80434a(eVar.f101018b);
                ((CompoundDrawableAndTextLayout) mo80177a((int) R.id.epm)).setOnClickListener(eVar.f101020d);
            } else {
                CompoundDrawableAndTextLayout compoundDrawableAndTextLayout2 = (CompoundDrawableAndTextLayout) mo80177a((int) R.id.epn);
                C52711k.m112236a((Object) compoundDrawableAndTextLayout2, "poi_service_2");
                compoundDrawableAndTextLayout2.setVisibility(0);
                ((CompoundDrawableAndTextLayout) mo80177a((int) R.id.epn)).setText(eVar.f101017a);
                ((CompoundDrawableAndTextLayout) mo80177a((int) R.id.epn)).mo80434a(eVar.f101018b);
                ((CompoundDrawableAndTextLayout) mo80177a((int) R.id.epn)).setOnClickListener(eVar.f101020d);
                View a = mo80177a((int) R.id.epb);
                C52711k.m112236a((Object) a, "poi_detail_seervice_divider");
                a.setVisibility(0);
            }
            i++;
        }
        if (i != 1 || ((C39488e) arrayList.get(0)).f101019c) {
            if (i > 0) {
                m87455i();
                LinearLayout linearLayout = (LinearLayout) mo80177a((int) R.id.c0o);
                C52711k.m112236a((Object) linearLayout, "poi_detail_reserve_and_queue");
                linearLayout.setVisibility(0);
                View a2 = mo80177a((int) R.id.c0p);
                C52711k.m112236a((Object) a2, "poi_detail_reserve_and_queue_divider");
                a2.setVisibility(0);
            }
            if (i == 1) {
                View a3 = mo80177a((int) R.id.bzr);
                C52711k.m112236a((Object) a3, "poi_detail_loc_addr_divider");
                a3.setVisibility(8);
                LinearLayout linearLayout2 = (LinearLayout) mo80177a((int) R.id.c0o);
                C52711k.m112236a((Object) linearLayout2, "poi_detail_reserve_and_queue");
                LayoutParams layoutParams = linearLayout2.getLayoutParams();
                if (layoutParams != null) {
                    ((LinearLayout.LayoutParams) layoutParams).topMargin = (int) C9432q.m18687b(getContext(), 15.0f);
                    DmtTextView dmtTextView = (DmtTextView) mo80177a((int) R.id.f4r);
                    C52711k.m112236a((Object) dmtTextView, "tv_supplier_tag");
                    LayoutParams layoutParams2 = dmtTextView.getLayoutParams();
                    if (layoutParams2 != null) {
                        ((LinearLayout.LayoutParams) layoutParams2).bottomMargin = (int) C9432q.m18687b(getContext(), -20.0f);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo80178a(PoiDetail poiDetail) {
        PoiStruct poiStruct;
        String str;
        this.f100569a = poiDetail;
        String str2 = null;
        if (poiDetail != null) {
            poiStruct = poiDetail.poiStruct;
        } else {
            poiStruct = null;
        }
        this.f100575g = poiStruct;
        LinearLayout linearLayout = (LinearLayout) mo80177a((int) R.id.bzs);
        C52711k.m112236a((Object) linearLayout, "poi_detail_loc_addr_layout");
        linearLayout.setVisibility(8);
        PoiStruct poiStruct2 = this.f100575g;
        if (poiStruct2 != null) {
            C39067g gVar = this.f100573e;
            if (gVar != null) {
                gVar.setPoiId(poiStruct2.poiId);
                gVar.setPoiType(poiStruct2.getTypeCode());
                gVar.setBackendType(poiStruct2.getBackendTypeCode());
                gVar.setPoiCity(poiStruct2.getCityCode());
            }
            if (poiDetail != null) {
                str = poiDetail.getAddress();
            } else {
                str = null;
            }
            if (C39449i.m87720a(str)) {
                LinearLayout linearLayout2 = (LinearLayout) mo80177a((int) R.id.bzs);
                C52711k.m112236a((Object) linearLayout2, "poi_detail_loc_addr_layout");
                linearLayout2.setVisibility(0);
                CompoundDrawableAndTextLayout compoundDrawableAndTextLayout = (CompoundDrawableAndTextLayout) mo80177a((int) R.id.bzp);
                C52711k.m112236a((Object) compoundDrawableAndTextLayout, "poi_detail_loc_addr");
                compoundDrawableAndTextLayout.setVisibility(0);
                CompoundDrawableAndTextLayout compoundDrawableAndTextLayout2 = (CompoundDrawableAndTextLayout) mo80177a((int) R.id.bzp);
                if (poiDetail != null) {
                    str2 = poiDetail.getAddress();
                }
                compoundDrawableAndTextLayout2.setText(str2);
                if (C39449i.m87720a(poiStruct2.getPoiLatitude()) && C39449i.m87720a(poiStruct2.getPoiLongitude())) {
                    try {
                        getLocation();
                        this.f100576h = Double.parseDouble(poiStruct2.getPoiLatitude());
                        this.f100577i = Double.parseDouble(poiStruct2.getPoiLongitude());
                        double[] a = C39442c.m87696a(this.f100576h, this.f100577i);
                        this.f100576h = a[0];
                        this.f100577i = a[1];
                    } catch (Exception e) {
                        C32458a.m75143a(e);
                    }
                }
            }
            m87448b();
        }
        if (m87459m()) {
            RelativeLayout relativeLayout = (RelativeLayout) mo80177a((int) R.id.epo);
            C52711k.m112236a((Object) relativeLayout, "poi_service_container");
            relativeLayout.setVisibility(8);
            View a2 = mo80177a((int) R.id.epp);
            C52711k.m112236a((Object) a2, "poi_service_divider");
            a2.setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) mo80177a((int) R.id.epo);
        C52711k.m112236a((Object) relativeLayout2, "poi_service_container");
        relativeLayout2.setVisibility(0);
        View a3 = mo80177a((int) R.id.epp);
        C52711k.m112236a((Object) a3, "poi_service_divider");
        a3.setVisibility(0);
        m87460n();
        m87461o();
    }

    public PoiStructureInfoWidget(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.bn3, this);
    }

    public /* synthetic */ PoiStructureInfoWidget(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
