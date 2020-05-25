package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2323a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2324b.C46487b;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2326d.C46502b;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2327e.C46504a;
import com.p683ss.android.ugc.aweme.views.C48216n;
import com.p683ss.android.ugc.tools.utils.C50201e;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.a.a */
public final class C46477a extends C1322a<C1352v> {

    /* renamed from: e */
    public static final C46478a f117267e = new C46478a(null);

    /* renamed from: a */
    public C46487b f117268a;

    /* renamed from: b */
    public final ArrayList<C46487b> f117269b = new ArrayList<>();

    /* renamed from: c */
    public int f117270c;

    /* renamed from: d */
    public final C46502b f117271d;

    /* renamed from: f */
    private View f117272f = LayoutInflater.from(this.f117274h).inflate(R.layout.s2, null);

    /* renamed from: g */
    private C46479b f117273g;

    /* renamed from: h */
    private final Context f117274h;

    /* renamed from: i */
    private final boolean f117275i;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.a.a$a */
    public static final class C46478a {
        private C46478a() {
        }

        public /* synthetic */ C46478a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.a.a$b */
    final class C46479b extends C1352v {

        /* renamed from: a */
        ObjectAnimator f117276a;

        /* renamed from: b */
        final ImageView f117277b;

        /* renamed from: c */
        final /* synthetic */ C46477a f117278c;

        public C46479b(C46477a aVar, View view) {
            C52711k.m112240b(view, "itemView");
            this.f117278c = aVar;
            super(view);
            View findViewById = view.findViewById(R.id.b25);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.iv_loading)");
            this.f117277b = (ImageView) findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.a.a$c */
    static final class C46480c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C46477a f117279a;

        /* renamed from: b */
        final /* synthetic */ C46504a f117280b;

        C46480c(C46477a aVar, C46504a aVar2) {
            this.f117279a = aVar;
            this.f117280b = aVar2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            int adapterPosition = this.f117280b.getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < this.f117279a.f117269b.size()) {
                this.f117279a.f117268a = (C46487b) this.f117279a.f117269b.get(adapterPosition);
                this.f117279a.notifyItemChanged(this.f117279a.f117270c);
                this.f117279a.notifyItemChanged(adapterPosition);
                C46502b bVar = this.f117279a.f117271d;
                if (bVar != null) {
                    bVar.mo93183a(this.f117279a.f117268a);
                }
                this.f117279a.f117270c = adapterPosition;
            }
        }
    }

    /* renamed from: b */
    public final void mo93218b() {
        this.f117268a = null;
        if (this.f117270c >= 0) {
            notifyItemChanged(this.f117270c);
        }
    }

    /* renamed from: e */
    public final void mo93221e() {
        this.f117269b.clear();
        this.f117268a = null;
    }

    public final int getItemCount() {
        int size = this.f117269b.size();
        if (this.f117272f != null) {
            return size + 1;
        }
        return size;
    }

    /* renamed from: a */
    public final int mo93215a() {
        if (C50201e.m108355a(this.f117269b)) {
            return 0;
        }
        return this.f117269b.size();
    }

    /* renamed from: d */
    public final void mo93220d() {
        if (this.f117272f == null) {
            this.f117272f = LayoutInflater.from(this.f117274h).inflate(R.layout.s2, null);
        }
    }

    /* renamed from: c */
    public final void mo93219c() {
        if (this.f117273g != null) {
            C46479b bVar = this.f117273g;
            if (bVar == null) {
                C52711k.m112234a();
            }
            if (bVar.f117276a != null) {
                ObjectAnimator objectAnimator = bVar.f117276a;
                if (objectAnimator == null) {
                    C52711k.m112234a();
                }
                objectAnimator.cancel();
                bVar.f117276a = null;
            }
            if (bVar.itemView != null) {
                View view = bVar.itemView;
                C52711k.m112236a((Object) view, "itemView");
                view.setVisibility(8);
            }
            this.f117272f = null;
        }
    }

    public final int getItemViewType(int i) {
        if (this.f117272f == null || i != getItemCount() - 1) {
            return 2;
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo93217a(List<C46487b> list) {
        C52711k.m112240b(list, "pixaloopDataList");
        this.f117269b.clear();
        this.f117269b.addAll(list);
        this.f117272f = null;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo93216a(String str) {
        if (!TextUtils.isEmpty(str) && !C50201e.m108355a(this.f117269b)) {
            int size = this.f117269b.size();
            for (int i = 0; i < size; i++) {
                if (C52830p.m112407a(str, ((C46487b) this.f117269b.get(i)).f117304a, false, 2, null)) {
                    this.f117268a = (C46487b) this.f117269b.get(i);
                    if (this.f117270c >= 0) {
                        notifyItemChanged(this.f117270c);
                    }
                    notifyItemChanged(i);
                    this.f117270c = i;
                }
            }
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        float f;
        C52711k.m112240b(viewGroup, "parent");
        if (i == 1) {
            View view = this.f117272f;
            if (view == null) {
                C52711k.m112234a();
            }
            this.f117273g = new C46479b(this, view);
            C46479b bVar = this.f117273g;
            if (bVar != null) {
                return bVar;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.adapter.PixaloopMattingAdapter.FooterViewHolder");
        }
        if (this.f117275i) {
            i2 = R.layout.ff;
        } else {
            i2 = R.layout.s4;
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
        if (VERSION.SDK_INT >= 21) {
            if (this.f117275i) {
                f = 2.0f;
            } else {
                f = 6.0f;
            }
            C52711k.m112236a((Object) inflate, "view");
            inflate.setOutlineProvider(new C48216n((int) C9432q.m18687b(viewGroup.getContext(), f)));
            inflate.setClipToOutline(true);
        }
        C52711k.m112236a((Object) inflate, "view");
        C46504a aVar = new C46504a(inflate);
        inflate.setOnClickListener(new C46480c(this, aVar));
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(android.support.p043v7.widget.RecyclerView.C1352v r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = "holder"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            boolean r0 = r8 instanceof com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2323a.C46477a.C46479b
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0053
            com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.a.a$b r8 = (com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2323a.C46477a.C46479b) r8
            android.view.View r9 = r8.itemView
            java.lang.String r0 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r0)
            r9.setVisibility(r3)
            android.widget.ImageView r9 = r8.f117277b
            java.lang.String r0 = "rotation"
            float[] r1 = new float[r1]
            r1 = {0, 1135869952} // fill-array
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r9, r0, r1)
            r8.f117276a = r9
            android.animation.ObjectAnimator r9 = r8.f117276a
            if (r9 != 0) goto L_0x002e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x002e:
            r0 = 800(0x320, double:3.953E-321)
            r9.setDuration(r0)
            android.animation.ObjectAnimator r9 = r8.f117276a
            if (r9 != 0) goto L_0x003a
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x003a:
            r9.setRepeatMode(r2)
            android.animation.ObjectAnimator r9 = r8.f117276a
            if (r9 != 0) goto L_0x0044
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0044:
            r0 = -1
            r9.setRepeatCount(r0)
            android.animation.ObjectAnimator r8 = r8.f117276a
            if (r8 != 0) goto L_0x004f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x004f:
            r8.start()
            return
        L_0x0053:
            boolean r0 = r8 instanceof com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2327e.C46504a
            if (r0 == 0) goto L_0x0114
            com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.e.a r8 = (com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2327e.C46504a) r8
            java.util.ArrayList<com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.b.b> r0 = r7.f117269b
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r0 = "dataList[position]"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r0)
            com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.b.b r9 = (com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2324b.C46487b) r9
            if (r9 != 0) goto L_0x006a
        L_0x0068:
            r0 = 0
            goto L_0x0090
        L_0x006a:
            com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.b.b r0 = r7.f117268a
            if (r0 != 0) goto L_0x006f
            goto L_0x0068
        L_0x006f:
            com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.b.b r0 = r7.f117268a
            if (r0 != 0) goto L_0x0076
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0076:
            java.lang.String r0 = r0.f117304a
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0081
            goto L_0x0068
        L_0x0081:
            com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.b.b r0 = r7.f117268a
            if (r0 != 0) goto L_0x0088
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0088:
            java.lang.String r0 = r0.f117304a
            java.lang.String r4 = r9.f117304a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r4)
        L_0x0090:
            r4 = 8
            if (r0 == 0) goto L_0x009a
            android.widget.ImageView r0 = r8.f117340a
            r0.setVisibility(r3)
            goto L_0x009f
        L_0x009a:
            android.widget.ImageView r0 = r8.f117340a
            r0.setVisibility(r4)
        L_0x009f:
            java.io.File r0 = new java.io.File
            java.lang.String r5 = r9.f117304a
            r0.<init>(r5)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "Uri.fromFile(File(pixalo…Data.imgPath)).toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r5)
            com.facebook.drawee.view.SimpleDraweeView r5 = r8.f117341b
            android.content.Context r5 = r5.getContext()
            r6 = 1112014848(0x42480000, float:50.0)
            float r5 = com.bytedance.common.utility.C9432q.m18687b(r5, r6)
            int r5 = (int) r5
            com.facebook.drawee.view.SimpleDraweeView r6 = r8.f117341b
            com.p683ss.android.ugc.tools.p2504a.C50181a.m108293a(r6, r0, r5, r5)
            int r0 = r9.f117312i
            if (r0 != r1) goto L_0x010f
            r0 = 1065353216(0x3f800000, float:1.0)
            long r4 = r9.f117311h
            float r9 = (float) r4
            float r9 = r9 * r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r9 = r9 / r0
            android.widget.TextView r8 = r8.f117342c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r4 = "Locale.getDefault()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            java.lang.String r4 = "%.1f"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r5[r3] = r9
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r5, r2)
            java.lang.String r9 = com.C2240a.m6773a(r1, r4, r9)
            java.lang.String r1 = "java.lang.String.format(locale, format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r1)
            r0.append(r9)
            java.lang.String r9 = "s"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r8.setText(r9)
            r8.setVisibility(r3)
            return
        L_0x010f:
            android.widget.TextView r8 = r8.f117342c
            r8.setVisibility(r4)
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2323a.C46477a.onBindViewHolder(android.support.v7.widget.RecyclerView$v, int):void");
    }

    public C46477a(Context context, boolean z, C46502b bVar) {
        C52711k.m112240b(context, "context");
        this.f117274h = context;
        this.f117275i = z;
        this.f117271d = bVar;
    }
}
