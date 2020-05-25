package com.p683ss.android.ugc.aweme.commercialize.anchor;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.C0535b;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.commercialize.anchor.p1546a.C25605a;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.e */
public final class C25622e extends C0535b {

    /* renamed from: d */
    private View f67821d;

    /* renamed from: e */
    private RecyclerView f67822e;

    /* renamed from: f */
    private View f67823f;

    /* renamed from: g */
    private C25605a f67824g;

    /* renamed from: h */
    private final List<C25626g> f67825h;

    /* renamed from: i */
    private final C0184k f67826i;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.e$a */
    static final class C25623a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25622e f67827a;

        C25623a(C25622e eVar) {
            this.f67827a = eVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f67827a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.e$b */
    static final class C25624b implements OnShowListener {

        /* renamed from: a */
        public static final C25624b f67828a = new C25624b();

        C25624b() {
        }

        public final void onShow(DialogInterface dialogInterface) {
            if (dialogInterface != null) {
                FrameLayout frameLayout = (FrameLayout) ((C0535b) dialogInterface).findViewById(R.id.a4q);
                if (frameLayout != null) {
                    BottomSheetBehavior a = BottomSheetBehavior.m1227a(frameLayout);
                    C52711k.m112236a((Object) a, "behavior");
                    a.mo1296a(frameLayout.getHeight());
                    a.f1639j = true;
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.design.widget.BottomSheetDialog");
        }
    }

    public final void show() {
        setOnShowListener(C25624b.f67828a);
        super.show();
    }

    public final void onCreate(Bundle bundle) {
        LayoutParams layoutParams;
        super.onCreate(bundle);
        setContentView((int) R.layout.a1g);
        this.f67821d = findViewById(R.id.az_);
        this.f67822e = (RecyclerView) findViewById(R.id.fc);
        this.f67823f = findViewById(R.id.cfc);
        RecyclerView recyclerView = this.f67822e;
        if (recyclerView != null) {
            RecyclerView recyclerView2 = this.f67822e;
            if (recyclerView2 != null) {
                layoutParams = recyclerView2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                if (this.f67825h.size() > 7) {
                    marginLayoutParams.height = (int) C9432q.m18687b(getContext(), 422.0f);
                } else if (this.f67825h.size() <= 4) {
                    marginLayoutParams.height = (int) C9432q.m18687b(getContext(), 250.0f);
                    recyclerView.setPadding(0, 0, 0, 0);
                } else {
                    marginLayoutParams.height = -2;
                }
                recyclerView.setLayoutParams(marginLayoutParams);
            } else {
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        int b = C9432q.m18688b(getContext()) - C9432q.m18695e(getContext());
        Window window = getWindow();
        if (window != null) {
            if (b == 0) {
                b = -1;
            }
            window.setLayout(-1, b);
            window.setGravity(80);
            Window window2 = getWindow();
            if (window2 == null) {
                C52711k.m112234a();
            }
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.gravity = 80;
            Window window3 = getWindow();
            if (window3 == null) {
                C52711k.m112234a();
            }
            window3.setAttributes(attributes);
            setCanceledOnTouchOutside(true);
        }
        RecyclerView recyclerView3 = this.f67822e;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        this.f67824g = new C25605a(this.f67825h, this.f67826i);
        RecyclerView recyclerView4 = this.f67822e;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(this.f67824g);
        }
        View view = this.f67821d;
        if (view != null) {
            view.setOnClickListener(new C25623a(this));
        }
    }

    public C25622e(Context context, List<C25626g> list, C0184k kVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(list, "anchorList");
        C52711k.m112240b(kVar, "lifecycleOwner");
        super(context, R.style.tn);
        this.f67825h = list;
        this.f67826i = kVar;
    }
}
