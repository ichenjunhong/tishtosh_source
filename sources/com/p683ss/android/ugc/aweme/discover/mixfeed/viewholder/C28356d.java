package com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.graphics.Outline;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import com.p683ss.android.ugc.aweme.discover.adapter.C27849b;
import com.p683ss.android.ugc.aweme.discover.mob.C28386ag.C28387a;
import com.p683ss.android.ugc.aweme.discover.model.SearchOperation;
import com.ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.d */
public final class C28356d extends C27849b {

    /* renamed from: h */
    public static final C28358a f74447h = new C28358a(null);

    /* renamed from: c */
    public AnimatedImageView f74448c;

    /* renamed from: d */
    public DmtTextView f74449d;

    /* renamed from: e */
    public ImageView f74450e;

    /* renamed from: f */
    public String f74451f = "";

    /* renamed from: g */
    public View f74452g;

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.d$a */
    public static final class C28358a {
        private C28358a() {
        }

        public /* synthetic */ C28358a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.d$b */
    public static final class C28359b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28356d f74453a;

        /* renamed from: b */
        final /* synthetic */ SearchOperation f74454b;

        /* renamed from: c */
        final /* synthetic */ int f74455c;

        public C28359b(C28356d dVar, SearchOperation searchOperation, int i) {
            this.f74453a = dVar;
            this.f74454b = searchOperation;
            this.f74455c = i;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickInstrumentation.onClick(view);
            String str3 = null;
            C25945k.m62926q().mo47707a(this.f74453a.mo56271b(), this.f74454b.getLink(), null);
            if (this.f74455c == 2) {
                View view2 = this.f74453a.itemView;
                C52711k.m112236a((Object) view2, "itemView");
                C27797ad a = C28387a.m67363a(view2);
                String str4 = "search_operation_card_click";
                C23089d a2 = C23089d.m56640a().mo47829a("card_id", this.f74454b.getCardId()).mo47829a("enter_from", "general_search");
                String str5 = "search_keyword";
                if (a != null) {
                    str2 = a.mo56235b();
                } else {
                    str2 = null;
                }
                C23089d a3 = a2.mo47829a(str5, str2);
                String str6 = "log_pb";
                if (a != null) {
                    str3 = a.mo56236c();
                }
                C26890h.m65011a(str4, a3.mo47829a(str6, str3).f61491a);
            } else {
                View view3 = this.f74453a.itemView;
                C52711k.m112236a((Object) view3, "itemView");
                C27797ad a4 = C28387a.m67363a(view3);
                String str7 = "search_operation_card_click";
                C23089d a5 = C23089d.m56640a().mo47829a("enter_from", "general_search");
                String str8 = "search_keyword";
                if (a4 != null) {
                    str = a4.mo56235b();
                } else {
                    str = null;
                }
                C23089d a6 = a5.mo47829a(str8, str);
                String str9 = "log_pb";
                if (a4 != null) {
                    str3 = a4.mo56236c();
                }
                C26890h.m65011a(str7, a6.mo47829a(str9, str3).f61491a);
            }
            C28356d dVar = this.f74453a;
            String str10 = "search_result_click";
            C52711k.m112240b(str10, "eventName");
            C52711k.m112240b(dVar.f74451f, "docId");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("token_type", "activity");
            CharSequence charSequence = str10;
            if (TextUtils.equals("search_result_click", charSequence)) {
                linkedHashMap.put("aladdin_button_type", "click_photo");
                dVar.mo56272b(linkedHashMap);
                return;
            }
            if (TextUtils.equals("search_result_show", charSequence)) {
                dVar.mo56208a(linkedHashMap);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.d$c */
    public static final class C28360c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C28356d f74456a;

        /* renamed from: b */
        final /* synthetic */ int f74457b;

        /* renamed from: c */
        final /* synthetic */ SearchOperation f74458c;

        public C28360c(C28356d dVar, int i, SearchOperation searchOperation) {
            this.f74456a = dVar;
            this.f74457b = i;
            this.f74458c = searchOperation;
        }

        public final /* synthetic */ Object call() {
            String str;
            String str2;
            String str3 = null;
            if (this.f74457b == 2) {
                C27797ad a = C28387a.m67363a(this.f74456a.f74452g);
                String str4 = "search_operation_card_show";
                C23089d a2 = C23089d.m56640a().mo47829a("card_id", this.f74458c.getCardId()).mo47829a("enter_from", "general_search");
                String str5 = "search_keyword";
                if (a != null) {
                    str2 = a.mo56235b();
                } else {
                    str2 = null;
                }
                C23089d a3 = a2.mo47829a(str5, str2);
                String str6 = "log_pb";
                if (a != null) {
                    str3 = a.mo56236c();
                }
                C26890h.m65011a(str4, a3.mo47829a(str6, str3).f61491a);
            } else {
                C27797ad a4 = C28387a.m67363a(this.f74456a.f74452g);
                String str7 = "search_operation_card_show";
                C23089d a5 = C23089d.m56640a().mo47829a("enter_from", "general_search");
                String str8 = "search_keyword";
                if (a4 != null) {
                    str = a4.mo56235b();
                } else {
                    str = null;
                }
                C23089d a6 = a5.mo47829a(str8, str);
                String str9 = "log_pb";
                if (a4 != null) {
                    str3 = a4.mo56236c();
                }
                C26890h.m65011a(str7, a6.mo47829a(str9, str3).f61491a);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: d */
    public final View mo56209d() {
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        return view;
    }

    public C28356d(View view, View view2) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(view2, "parent");
        super(view);
        this.f74452g = view2;
        this.f74448c = (AnimatedImageView) view.findViewById(R.id.bv4);
        this.f74449d = (DmtTextView) view.findViewById(R.id.bv3);
        this.f74450e = (ImageView) view.findViewById(R.id.bmy);
        if (VERSION.SDK_INT >= 21) {
            AnimatedImageView animatedImageView = this.f74448c;
            C52711k.m112236a((Object) animatedImageView, "operationPic");
            animatedImageView.setOutlineProvider(new ViewOutlineProvider() {
                public final void getOutline(View view, Outline outline) {
                    C52711k.m112240b(view, "view");
                    C52711k.m112240b(outline, "outline");
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + 8, 8.0f);
                }
            });
            AnimatedImageView animatedImageView2 = this.f74448c;
            C52711k.m112236a((Object) animatedImageView2, "operationPic");
            animatedImageView2.setClipToOutline(true);
        }
    }
}
