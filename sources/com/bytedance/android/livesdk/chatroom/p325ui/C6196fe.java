package com.bytedance.android.livesdk.chatroom.p325ui;

import android.graphics.Color;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.C2978h;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.browser.p289c.C4697b;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4700b;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdkapi.depend.model.live.C8712o;
import com.bytedance.android.livesdkapi.depend.model.live.C8719s;
import com.bytedance.android.livesdkapi.depend.model.live.C8720t;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.fe */
public final class C6196fe extends C1322a<C1352v> {

    /* renamed from: a */
    public static final C6197a f16646a = new C6197a(null);

    /* renamed from: b */
    private final FragmentActivity f16647b;

    /* renamed from: c */
    private final C8720t f16648c;

    /* renamed from: d */
    private final boolean f16649d;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.fe$a */
    static final class C6197a {
        private C6197a() {
        }

        public /* synthetic */ C6197a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.fe$b */
    public static final class C6198b extends C1352v {

        /* renamed from: a */
        final ImageView f16650a;

        /* renamed from: b */
        final ImageView f16651b;

        /* renamed from: c */
        final TextView f16652c;

        /* renamed from: d */
        final TextView f16653d;

        /* renamed from: com.bytedance.android.livesdk.chatroom.ui.fe$b$a */
        static final class C6199a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C8719s f16654a;

            /* renamed from: b */
            final /* synthetic */ boolean f16655b;

            /* renamed from: c */
            final /* synthetic */ FragmentActivity f16656c;

            C6199a(C8719s sVar, boolean z, FragmentActivity fragmentActivity) {
                this.f16654a = sVar;
                this.f16655b = z;
                this.f16656c = fragmentActivity;
            }

            /* JADX WARNING: type inference failed for: r1v0 */
            /* JADX WARNING: type inference failed for: r1v1 */
            /* JADX WARNING: type inference failed for: r1v3, types: [com.bytedance.android.livesdkapi.depend.model.live.s] */
            /* JADX WARNING: type inference failed for: r1v4, types: [com.bytedance.android.live.core.widget.a] */
            /* JADX WARNING: type inference failed for: r1v5, types: [com.bytedance.android.livesdkapi.depend.model.live.s] */
            /* JADX WARNING: type inference failed for: r1v6 */
            /* JADX WARNING: type inference failed for: r1v7 */
            /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
                if (r5 == null) goto L_0x0008;
             */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
              assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.bytedance.android.livesdkapi.depend.model.live.s, com.bytedance.android.live.core.widget.a]
              uses: [?[OBJECT, ARRAY], com.bytedance.android.livesdkapi.depend.model.live.s]
              mth insns count: 39
            	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
            	at jadx.core.ProcessClass.process(ProcessClass.java:35)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
             */
            /* JADX WARNING: Unknown variable types count: 3 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r5) {
                /*
                    r4 = this;
                    com.bytedance.android.livesdkapi.depend.model.live.s r5 = r4.f16654a
                    if (r5 == 0) goto L_0x0008
                    java.lang.String r5 = r5.f23932d
                    if (r5 != 0) goto L_0x000a
                L_0x0008:
                    java.lang.String r5 = ""
                L_0x000a:
                    com.bytedance.android.livesdk.browser.c.b$b r5 = com.bytedance.android.livesdk.browser.p289c.C4704c.m11226a(r5)
                    r0 = 0
                    com.bytedance.android.livesdk.browser.c.b$b r5 = r5.mo10511a(r0, r0, r0, r0)
                    r0 = -1
                    com.bytedance.android.livesdk.browser.c.b$b r5 = r5.mo10521f(r0)
                    int r0 = com.bytedance.android.live.core.p230g.C3922z.m9908b()
                    double r0 = (double) r0
                    r2 = 4604480259023595110(0x3fe6666666666666, double:0.7)
                    java.lang.Double.isNaN(r0)
                    double r0 = r0 * r2
                    int r0 = (int) r0
                    float r0 = com.bytedance.android.live.core.p230g.C3922z.m9914e(r0)
                    int r0 = (int) r0
                    com.bytedance.android.livesdk.browser.c.b$b r5 = r5.mo10514b(r0)
                    int r0 = com.bytedance.android.live.core.p230g.C3922z.m9910c()
                    float r0 = com.bytedance.android.live.core.p230g.C3922z.m9914e(r0)
                    int r0 = (int) r0
                    com.bytedance.android.livesdk.browser.c.b$b r5 = r5.mo10510a(r0)
                    r0 = 80
                    com.bytedance.android.livesdk.browser.c.b$b r5 = r5.mo10520e(r0)
                    java.lang.Class<com.bytedance.android.live.browser.a> r0 = com.bytedance.android.live.browser.C3805a.class
                    com.bytedance.android.live.base.b r0 = com.bytedance.android.live.p245d.C4116c.m10249a(r0)
                    com.bytedance.android.live.browser.a r0 = (com.bytedance.android.live.browser.C3805a) r0
                    r1 = 0
                    if (r0 == 0) goto L_0x0054
                    com.bytedance.android.livesdk.browser.c.b r0 = r0.webViewManager()
                    goto L_0x0055
                L_0x0054:
                    r0 = r1
                L_0x0055:
                    if (r0 == 0) goto L_0x0062
                    boolean r2 = r4.f16655b
                    if (r2 == 0) goto L_0x005c
                    goto L_0x005e
                L_0x005c:
                    com.bytedance.android.livesdkapi.depend.model.live.s r1 = r4.f16654a
                L_0x005e:
                    com.bytedance.android.live.core.widget.a r1 = r0.mo10488a(r5, r1)
                L_0x0062:
                    android.support.v4.app.FragmentActivity r5 = r4.f16656c
                    android.support.v4.app.f r1 = (android.support.p030v4.app.C0649f) r1
                    com.bytedance.android.live.core.widget.C4104a.m10232a(r5, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p325ui.C6196fe.C6198b.C6199a.onClick(android.view.View):void");
            }
        }

        /* renamed from: com.bytedance.android.livesdk.chatroom.ui.fe$b$b */
        static final class C6200b implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ boolean f16657a;

            /* renamed from: b */
            final /* synthetic */ C8719s f16658b;

            C6200b(boolean z, C8719s sVar) {
                this.f16657a = z;
                this.f16658b = sVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
                if (r1 == null) goto L_0x0012;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r4) {
                /*
                    r3 = this;
                    boolean r4 = r3.f16657a
                    if (r4 == 0) goto L_0x001c
                    com.bytedance.android.livesdk.aa.a r4 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
                    com.bytedance.android.livesdk.chatroom.event.at r0 = new com.bytedance.android.livesdk.chatroom.event.at
                    com.bytedance.android.livesdkapi.depend.model.live.s r1 = r3.f16658b
                    if (r1 == 0) goto L_0x0012
                    java.lang.String r1 = r1.f23933e
                    if (r1 != 0) goto L_0x0014
                L_0x0012:
                    java.lang.String r1 = ""
                L_0x0014:
                    r2 = 0
                    r0.<init>(r1, r2)
                    r4.mo10301a(r0)
                    return
                L_0x001c:
                    com.bytedance.android.livesdk.aa.a r4 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
                    com.bytedance.android.livesdk.chatroom.event.ak r0 = new com.bytedance.android.livesdk.chatroom.event.ak
                    com.bytedance.android.livesdkapi.depend.model.live.s r1 = r3.f16658b
                    r0.<init>(r1)
                    r4.mo10301a(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p325ui.C6196fe.C6198b.C6200b.onClick(android.view.View):void");
            }
        }

        public C6198b(View view) {
            C52711k.m112240b(view, "view");
            super(view);
            this.f16650a = (ImageView) view.findViewById(R.id.exg);
            this.f16651b = (ImageView) view.findViewById(R.id.exi);
            this.f16652c = (TextView) view.findViewById(R.id.exj);
            this.f16653d = (TextView) view.findViewById(R.id.exh);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.fe$c */
    public static final class C6201c extends C1352v {

        /* renamed from: a */
        final String f16659a = "Tiltify";

        /* renamed from: b */
        final TextView f16660b;

        /* renamed from: com.bytedance.android.livesdk.chatroom.ui.fe$c$a */
        static final class C6202a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ String f16661a;

            /* renamed from: b */
            final /* synthetic */ FragmentActivity f16662b;

            C6202a(String str, FragmentActivity fragmentActivity) {
                this.f16661a = str;
                this.f16662b = fragmentActivity;
            }

            public final void onClick(View view) {
                C4697b bVar;
                String str = this.f16661a;
                if (str == null) {
                    str = "";
                }
                C4700b f = C4704c.m11226a(str).mo10511a(0, 0, 0, 0).mo10521f(-1);
                double b = (double) C3922z.m9908b();
                Double.isNaN(b);
                C4700b e = f.mo10514b((int) C3922z.m9914e((int) (b * 0.7d))).mo10510a((int) C3922z.m9914e(C3922z.m9910c())).mo10520e(80);
                C3805a aVar = (C3805a) C4116c.m10249a(C3805a.class);
                C4104a aVar2 = null;
                if (aVar != null) {
                    bVar = aVar.webViewManager();
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    aVar2 = bVar.mo10488a(e, (C8719s) null);
                }
                C4104a.m10232a(this.f16662b, aVar2);
            }
        }

        public C6201c(View view) {
            C52711k.m112240b(view, "view");
            super(view);
            this.f16660b = (TextView) view.findViewById(R.id.exq);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.fe$d */
    public static final class C6203d extends C1352v {

        /* renamed from: a */
        final TextView f16663a;

        public C6203d(View view) {
            C52711k.m112240b(view, "view");
            super(view);
            this.f16663a = (TextView) view.findViewById(R.id.ext);
        }
    }

    public final int getItemCount() {
        int i;
        List<C8719s> list = this.f16648c.f23939f;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        return i + 2;
    }

    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == getItemCount() - 1) {
            return 2;
        }
        return 1;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "viewGroup");
        switch (i) {
            case 0:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bx1, viewGroup, false);
                C52711k.m112236a((Object) inflate, "LayoutInflater.from(view…n_rule, viewGroup, false)");
                return new C6203d(inflate);
            case 1:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bwz, viewGroup, false);
                C52711k.m112236a((Object) inflate2, "LayoutInflater.from(view…n_item, viewGroup, false)");
                return new C6198b(inflate2);
            case 2:
                View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bx0, viewGroup, false);
                C52711k.m112236a((Object) inflate3, "LayoutInflater.from(view…ficial, viewGroup, false)");
                return new C6201c(inflate3);
            default:
                throw new IllegalArgumentException("wrong view type");
        }
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        C8719s sVar;
        CharSequence charSequence;
        CharSequence charSequence2;
        ImageModel imageModel;
        C52711k.m112240b(vVar, "vh");
        String str = null;
        if (vVar instanceof C6203d) {
            C6203d dVar = (C6203d) vVar;
            C8712o oVar = this.f16648c.f23938e;
            TextView textView = dVar.f16663a;
            C52711k.m112236a((Object) textView, "ruleTv");
            if (oVar != null) {
                str = oVar.f23902a;
            }
            textView.setText(str);
        } else if (vVar instanceof C6198b) {
            C6198b bVar = (C6198b) vVar;
            FragmentActivity fragmentActivity = this.f16647b;
            List<C8719s> list = this.f16648c.f23939f;
            if (list != null) {
                sVar = (C8719s) C52575l.m112118a((List) list, i - 1);
            } else {
                sVar = null;
            }
            boolean z = this.f16649d;
            C52711k.m112240b(fragmentActivity, "fragmentActivity");
            TextView textView2 = bVar.f16652c;
            C52711k.m112236a((Object) textView2, "nameTv");
            if (sVar != null) {
                charSequence = sVar.f23929a;
            } else {
                charSequence = null;
            }
            textView2.setText(charSequence);
            TextView textView3 = bVar.f16653d;
            C52711k.m112236a((Object) textView3, "contentTv");
            if (sVar != null) {
                charSequence2 = sVar.f23930b;
            } else {
                charSequence2 = null;
            }
            textView3.setText(charSequence2);
            bVar.f16650a.setImageDrawable(null);
            ImageView imageView = bVar.f16650a;
            if (sVar != null) {
                C2978h hVar = sVar.f23931c;
                if (hVar != null) {
                    imageModel = hVar.mo7701a();
                    C5213c.m11824b(imageView, imageModel);
                    bVar.f16651b.setOnClickListener(new C6199a(sVar, z, fragmentActivity));
                    bVar.itemView.setOnClickListener(new C6200b(z, sVar));
                }
            }
            imageModel = new ImageModel();
            C5213c.m11824b(imageView, imageModel);
            bVar.f16651b.setOnClickListener(new C6199a(sVar, z, fragmentActivity));
            bVar.itemView.setOnClickListener(new C6200b(z, sVar));
        } else {
            if (vVar instanceof C6201c) {
                C6201c cVar = (C6201c) vVar;
                FragmentActivity fragmentActivity2 = this.f16647b;
                String str2 = this.f16648c.f23936c;
                C52711k.m112240b(fragmentActivity2, "fragmentActivity");
                String a = C3922z.m9905a((int) R.string.h0s, cVar.f16659a);
                CharSequence charSequence3 = a;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence3);
                C52711k.m112236a((Object) a, "originStr");
                int a2 = C52830p.m112419a(charSequence3, cVar.f16659a, 0, false, 6, (Object) null);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE2C55")), a2, cVar.f16659a.length() + a2, 33);
                TextView textView4 = cVar.f16660b;
                C52711k.m112236a((Object) textView4, "officialTv");
                textView4.setText(spannableStringBuilder);
                cVar.f16660b.setOnClickListener(new C6202a(str2, fragmentActivity2));
            }
        }
    }

    public C6196fe(FragmentActivity fragmentActivity, C8720t tVar, boolean z) {
        C52711k.m112240b(fragmentActivity, "fragmentActivity");
        C52711k.m112240b(tVar, "data");
        this.f16647b = fragmentActivity;
        this.f16648c = tVar;
        this.f16649d = z;
    }
}
