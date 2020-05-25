package com.p683ss.android.ugc.aweme.proaccount;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.CategoryPageTextStruct;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.ProAccountEnableDetailInfo;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52725c;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.aweme.proaccount.b */
public final class C39676b extends C1322a<C39677a> {

    /* renamed from: d */
    public static final C39678b f101258d = new C39678b(null);

    /* renamed from: a */
    public C39679c f101259a;

    /* renamed from: b */
    public List<Boolean> f101260b = new ArrayList();

    /* renamed from: c */
    public int f101261c = -1;

    /* renamed from: e */
    private final Context f101262e;

    /* renamed from: f */
    private final List<CategoryStruct> f101263f;

    /* renamed from: com.ss.android.ugc.aweme.proaccount.b$a */
    public static final class C39677a extends C1352v {

        /* renamed from: a */
        public DmtTextView f101264a;

        /* renamed from: b */
        public DmtTextView f101265b;

        /* renamed from: c */
        public DmtTextView f101266c;

        /* renamed from: d */
        public View f101267d;

        public C39677a(View view) {
            C52711k.m112240b(view, "v");
            super(view);
            View findViewById = view.findViewById(R.id.d7h);
            C52711k.m112236a((Object) findViewById, "v.findViewById(R.id.tv_category_check)");
            this.f101264a = (DmtTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.d7j);
            C52711k.m112236a((Object) findViewById2, "v.findViewById(R.id.tv_category_title)");
            this.f101265b = (DmtTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.d7i);
            C52711k.m112236a((Object) findViewById3, "v.findViewById(R.id.tv_category_desc)");
            this.f101266c = (DmtTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.a6f);
            C52711k.m112236a((Object) findViewById4, "v.findViewById(R.id.divide_line)");
            this.f101267d = findViewById4;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.b$b */
    public static final class C39678b {
        private C39678b() {
        }

        public /* synthetic */ C39678b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.b$c */
    public interface C39679c {
        /* renamed from: a */
        void mo80763a(String str, String str2, boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.b$d */
    static final class C39680d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39676b f101268a;

        /* renamed from: b */
        final /* synthetic */ C52725c f101269b;

        /* renamed from: c */
        final /* synthetic */ int f101270c;

        /* renamed from: d */
        final /* synthetic */ C52727e f101271d;

        /* renamed from: e */
        final /* synthetic */ C52727e f101272e;

        C39680d(C39676b bVar, C52725c cVar, int i, C52727e eVar, C52727e eVar2) {
            this.f101268a = bVar;
            this.f101269b = cVar;
            this.f101270c = i;
            this.f101271d = eVar;
            this.f101272e = eVar2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f101269b.element != this.f101268a.f101261c) {
                this.f101268a.f101260b.set(this.f101269b.element, Boolean.valueOf(true));
                this.f101268a.notifyItemChanged(this.f101270c);
                if (this.f101268a.f101261c != -1) {
                    this.f101268a.f101260b.set(this.f101268a.f101261c, Boolean.valueOf(false));
                    this.f101268a.notifyItemChanged(this.f101268a.f101261c + 2);
                }
                this.f101268a.f101261c = this.f101269b.element;
            }
            C39679c cVar = this.f101268a.f101259a;
            if (cVar == null) {
                C52711k.m112237a("onItemClick");
            }
            cVar.mo80763a((String) this.f101271d.element, (String) this.f101272e.element, false);
        }
    }

    public final int getItemCount() {
        return this.f101263f.size() + 2;
    }

    public C39676b(Context context, List<CategoryStruct> list) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(list, "list");
        this.f101262e = context;
        this.f101263f = list;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "p0");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.yn, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C39677a(inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C39677a aVar = (C39677a) vVar;
        C52711k.m112240b(aVar, "p0");
        this.f101260b.add(Boolean.valueOf(false));
        switch (i) {
            case 0:
                aVar.f101264a.setVisibility(8);
                aVar.f101266c.setVisibility(8);
                aVar.f101265b.setVisibility(0);
                aVar.f101267d.setVisibility(8);
                aVar.f101265b.setFontType(C10751d.f28903b);
                try {
                    IESSettingsProxy b = C32816h.m75716b();
                    C52711k.m112236a((Object) b, "SettingsReader.get()");
                    ProAccountEnableDetailInfo proAccountEnableDetailInfo = b.getProAccountEnableDetailInfo();
                    C52711k.m112236a((Object) proAccountEnableDetailInfo, "SettingsReader.get().proAccountEnableDetailInfo");
                    CategoryPageTextStruct categoryPageText = proAccountEnableDetailInfo.getCategoryPageText();
                    DmtTextView dmtTextView = aVar.f101265b;
                    C52711k.m112236a((Object) categoryPageText, "categoryStruct");
                    dmtTextView.setText(categoryPageText.getTitle());
                    break;
                } catch (C10174a unused) {
                    return;
                }
            case 1:
                aVar.f101264a.setVisibility(8);
                aVar.f101266c.setVisibility(0);
                aVar.f101265b.setVisibility(8);
                aVar.f101267d.setVisibility(8);
                try {
                    IESSettingsProxy b2 = C32816h.m75716b();
                    C52711k.m112236a((Object) b2, "SettingsReader.get()");
                    ProAccountEnableDetailInfo proAccountEnableDetailInfo2 = b2.getProAccountEnableDetailInfo();
                    C52711k.m112236a((Object) proAccountEnableDetailInfo2, "SettingsReader.get().proAccountEnableDetailInfo");
                    CategoryPageTextStruct categoryPageText2 = proAccountEnableDetailInfo2.getCategoryPageText();
                    DmtTextView dmtTextView2 = aVar.f101265b;
                    C52711k.m112236a((Object) categoryPageText2, "categoryStruct");
                    dmtTextView2.setText(categoryPageText2.getDescription());
                    break;
                } catch (C10174a unused2) {
                    return;
                }
            default:
                C52727e eVar = new C52727e();
                eVar.element = "";
                C52727e eVar2 = new C52727e();
                eVar2.element = "";
                C52725c cVar = new C52725c();
                cVar.element = i - 2;
                if (cVar.element < this.f101263f.size() && cVar.element >= 0) {
                    try {
                        T categoryName = ((CategoryStruct) this.f101263f.get(cVar.element)).getCategoryName();
                        C52711k.m112236a((Object) categoryName, "list[position].categoryName");
                        eVar.element = categoryName;
                        T categoryId = ((CategoryStruct) this.f101263f.get(cVar.element)).getCategoryId();
                        C52711k.m112236a((Object) categoryId, "list[position].categoryId");
                        eVar2.element = categoryId;
                        m88390a(aVar, (String) eVar.element, cVar.element);
                    } catch (C10174a unused3) {
                        m88390a(aVar, (String) eVar.element, cVar.element);
                    }
                    View view = aVar.itemView;
                    C39680d dVar = new C39680d(this, cVar, i, eVar, eVar2);
                    view.setOnClickListener(dVar);
                    break;
                } else {
                    return;
                }
                break;
        }
    }

    /* renamed from: a */
    private final void m88390a(C39677a aVar, String str, int i) {
        aVar.f101264a.setVisibility(0);
        aVar.f101266c.setVisibility(8);
        aVar.f101265b.setVisibility(8);
        aVar.f101267d.setVisibility(0);
        if (((Boolean) this.f101260b.get(i)).booleanValue()) {
            Drawable a = C0726c.m2091a(this.f101262e, (int) R.drawable.asi);
            if (a == null) {
                C52711k.m112234a();
            }
            a.setBounds(0, 0, (int) C20141b.m49696a(this.f101262e, 24.0f), (int) C20141b.m49696a(this.f101262e, 24.0f));
            aVar.f101264a.setCompoundDrawablesRelative(null, null, a, null);
            aVar.f101264a.setFontType(C10751d.f28903b);
        } else {
            Drawable a2 = C0726c.m2091a(this.f101262e, (int) R.drawable.d5_);
            if (a2 == null) {
                C52711k.m112234a();
            }
            a2.setBounds(0, 0, (int) C20141b.m49696a(this.f101262e, 24.0f), (int) C20141b.m49696a(this.f101262e, 24.0f));
            aVar.f101264a.setCompoundDrawablesRelative(null, null, a2, null);
            aVar.f101264a.setFontType(C10751d.f28902a);
        }
        aVar.f101264a.setText(str);
    }
}
