package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui;

import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.C21636a;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.e */
public final class C22000e {

    /* renamed from: g */
    public static final C22004c f59458g = new C22004c(null);

    /* renamed from: a */
    public boolean f59459a;

    /* renamed from: b */
    public int f59460b = -1;

    /* renamed from: c */
    public int f59461c = -1;

    /* renamed from: d */
    public final RecyclerView f59462d;

    /* renamed from: e */
    public List<String> f59463e;

    /* renamed from: f */
    public final C52671b<String, C52860x> f59464f;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.e$a */
    public final class C22001a extends C1322a<C22002b> {
        public final int getItemCount() {
            List<String> list = C22000e.this.f59463e;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public C22001a() {
        }

        public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            C22002b bVar;
            C52711k.m112240b(viewGroup, "p0");
            if (i == 0) {
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.azd, viewGroup, false);
                C22000e eVar = C22000e.this;
                if (inflate != null) {
                    bVar = new C22002b(eVar, (TextView) inflate);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
                }
            } else {
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.az_, viewGroup, false);
                C22000e eVar2 = C22000e.this;
                if (inflate2 != null) {
                    bVar = new C22002b(eVar2, (TextView) inflate2);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
                }
            }
            return bVar;
        }

        public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
            boolean z;
            C22002b bVar = (C22002b) vVar;
            C52711k.m112240b(bVar, "holder");
            List<String> list = C22000e.this.f59463e;
            if (list == null) {
                C52711k.m112234a();
            }
            String str = (String) list.get(i);
            if (C22000e.this.f59461c == i) {
                z = true;
            } else {
                z = false;
            }
            C52711k.m112240b(str, "s");
            bVar.f59466a.setText(str);
            if (!bVar.f59467b.f59459a || bVar.getAdapterPosition() != 0) {
                bVar.f59466a.setSelected(z);
                bVar.f59466a.setBackground(bVar.f59466a.getResources().getDrawable(R.drawable.cdi));
                bVar.f59466a.setTextColor(bVar.f59466a.getResources().getColor(R.color.ji));
                bVar.f59466a.setPadding((int) C20141b.m49696a(C11010c.m22280a(), 8.0f), (int) C20141b.m49696a(C11010c.m22280a(), 5.5f), (int) C20141b.m49696a(C11010c.m22280a(), 8.0f), (int) C20141b.m49696a(C11010c.m22280a(), 5.5f));
                return;
            }
            bVar.f59466a.setBackground(bVar.f59466a.getResources().getDrawable(R.color.a8w));
            bVar.f59466a.setTextColor(bVar.f59466a.getResources().getColor(R.color.avv));
            bVar.f59466a.setPadding(0, (int) C20141b.m49696a(C11010c.m22280a(), 5.5f), 0, (int) C20141b.m49696a(C11010c.m22280a(), 5.5f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.e$b */
    public final class C22002b extends C1352v {

        /* renamed from: a */
        public final TextView f59466a;

        /* renamed from: b */
        final /* synthetic */ C22000e f59467b;

        public C22002b(C22000e eVar, TextView textView) {
            C52711k.m112240b(textView, "item");
            this.f59467b = eVar;
            super(textView);
            this.f59466a = textView;
            TextView textView2 = this.f59466a;
            if (textView2 != null) {
                ((DmtTextView) textView2).setFontType(C10751d.f28903b);
                this.f59466a.setOnClickListener(new OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C22002b f59468a;

                    {
                        this.f59468a = r1;
                    }

                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        C22002b bVar = this.f59468a;
                        if (!bVar.f59467b.f59459a || bVar.getAdapterPosition() != 0) {
                            bVar.f59467b.f59460b = bVar.f59467b.f59461c;
                            bVar.f59467b.f59461c = bVar.getAdapterPosition();
                            if (bVar.f59467b.f59460b != -1) {
                                C1322a adapter = bVar.f59467b.f59462d.getAdapter();
                                if (adapter == null) {
                                    C52711k.m112234a();
                                }
                                adapter.notifyItemChanged(bVar.f59467b.f59460b);
                            }
                            C1322a adapter2 = bVar.f59467b.f59462d.getAdapter();
                            if (adapter2 == null) {
                                C52711k.m112234a();
                            }
                            adapter2.notifyItemChanged(bVar.f59467b.f59461c);
                            C52671b<String, C52860x> bVar2 = bVar.f59467b.f59464f;
                            List<String> list = bVar.f59467b.f59463e;
                            if (list == null) {
                                C52711k.m112234a();
                            }
                            bVar2.invoke(list.get(bVar.getAdapterPosition()));
                        }
                    }
                });
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.e$c */
    public static final class C22004c {

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.e$c$a */
        static final class C22005a extends C52712l implements C52671b<String, C52860x> {

            /* renamed from: a */
            final /* synthetic */ EditText f59469a;

            /* renamed from: b */
            final /* synthetic */ String f59470b;

            /* renamed from: c */
            final /* synthetic */ String f59471c;

            C22005a(EditText editText, String str, String str2) {
                this.f59469a = editText;
                this.f59470b = str;
                this.f59471c = str2;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                String str = (String) obj;
                C52711k.m112240b(str, "it");
                Editable text = this.f59469a.getText();
                if (TextUtils.isEmpty(text)) {
                    this.f59469a.setText(str);
                } else {
                    if (text == null) {
                        C52711k.m112234a();
                    }
                    int a = C52830p.m112419a((CharSequence) text.toString(), "@", 0, false, 6, (Object) null);
                    if (a != -1) {
                        text.replace(a, text.length(), str);
                    } else {
                        text.append(str);
                    }
                }
                C26890h.m65011a("choose_recommend_email_suffix", new C20856a().mo44776a("enter_from", this.f59470b).mo44776a("enter_method", this.f59471c).f56798a);
                return C52860x.f131107a;
            }
        }

        private C22004c() {
        }

        public /* synthetic */ C22004c(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C22000e m54757a(RecyclerView recyclerView, EditText editText, String str, String str2) {
            C52711k.m112240b(recyclerView, "recyclerView");
            C52711k.m112240b(editText, "editText");
            C52711k.m112240b(str, "enterFrom");
            C52711k.m112240b(str2, "enterMethod");
            List a = C21636a.m54341a();
            List list = null;
            if (a != null) {
                List b = C52575l.m112128b((Iterable<? extends T>) a);
                if (b != null) {
                    Iterable<String> iterable = b;
                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (String str3 : iterable) {
                        if (!C52830p.m112456b((CharSequence) str3, (CharSequence) "@", false, 2, (Object) null)) {
                            StringBuilder sb = new StringBuilder("@");
                            sb.append(str3);
                            str3 = sb.toString();
                        }
                        arrayList.add(str3);
                    }
                    list = C52575l.m112139e((Collection<? extends T>) (List) arrayList);
                }
            }
            return new C22000e(recyclerView, list, new C22005a(editText, str, str2));
        }
    }

    /* renamed from: a */
    public final void mo46068a(List<String> list) {
        this.f59463e = list;
        if (this.f59463e != null) {
            List<String> list2 = this.f59463e;
            if (list2 == null) {
                C52711k.m112234a();
            }
            if (!list2.isEmpty()) {
                if (this.f59462d.getVisibility() != 0) {
                    this.f59462d.mo4814b(0);
                    this.f59462d.setVisibility(0);
                }
                if (this.f59459a) {
                    List<String> list3 = this.f59463e;
                    if (list3 == null) {
                        C52711k.m112234a();
                    }
                    String string = this.f59462d.getContext().getString(R.string.aey);
                    C52711k.m112236a((Object) string, "recyclerView.context.get…on_email_input_suggested)");
                    list3.add(0, string);
                }
                if (this.f59462d.getAdapter() == null) {
                    this.f59462d.setAdapter(new C22001a());
                    return;
                }
                C1322a adapter = this.f59462d.getAdapter();
                if (adapter == null) {
                    C52711k.m112234a();
                }
                adapter.notifyDataSetChanged();
            }
        }
        if (this.f59462d.getVisibility() != 8) {
            this.f59462d.setVisibility(8);
        }
    }

    public C22000e(RecyclerView recyclerView, List<String> list, C52671b<? super String, C52860x> bVar) {
        C52711k.m112240b(recyclerView, "recyclerView");
        C52711k.m112240b(bVar, "selectCallBack");
        this.f59462d = recyclerView;
        this.f59463e = list;
        this.f59464f = bVar;
        this.f59462d.setLayoutManager(new LinearLayoutManager(this.f59462d.getContext(), 0, false));
        if (this.f59463e != null) {
            List<String> list2 = this.f59463e;
            if (list2 == null) {
                C52711k.m112234a();
            }
            if (!list2.isEmpty()) {
                if (this.f59459a) {
                    List<String> list3 = this.f59463e;
                    if (list3 == null) {
                        C52711k.m112234a();
                    }
                    String string = this.f59462d.getContext().getString(R.string.aey);
                    C52711k.m112236a((Object) string, "recyclerView.context.get…on_email_input_suggested)");
                    list3.add(0, string);
                }
                if (this.f59462d.getAdapter() == null) {
                    this.f59462d.setAdapter(new C22001a());
                    return;
                }
                C1322a adapter = this.f59462d.getAdapter();
                if (adapter == null) {
                    C52711k.m112234a();
                }
                adapter.notifyDataSetChanged();
            }
        }
    }
}
