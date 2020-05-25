package com.p683ss.android.ugc.aweme.commercialize.anchor;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.design.widget.C0535b;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.commercialize.anchor.p1546a.C25607c;
import com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.h */
public final class C25628h extends C0535b {

    /* renamed from: d */
    public final List<WikipediaInfo> f67844d;

    /* renamed from: e */
    public final C52671b<WikipediaInfo, C52860x> f67845e;

    /* renamed from: f */
    public final C52670a<C52860x> f67846f;

    /* renamed from: g */
    private final Map<String, String> f67847g;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.h$a */
    static final class C25629a extends C52712l implements C52671b<WikipediaInfo, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C25628h f67848a;

        C25629a(C25628h hVar) {
            this.f67848a = hVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            WikipediaInfo wikipediaInfo = (WikipediaInfo) obj;
            C52711k.m112240b(wikipediaInfo, "it");
            C52671b<WikipediaInfo, C52860x> bVar = this.f67848a.f67845e;
            if (bVar != null) {
                bVar.invoke(wikipediaInfo);
            }
            this.f67848a.dismiss();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.h$b */
    static final class C25630b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25628h f67849a;

        C25630b(C25628h hVar) {
            this.f67849a = hVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f67849a.dismiss();
            C52670a<C52860x> aVar = this.f67849a.f67846f;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.h$c */
    static final class C25631c implements OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ C25628h f67850a;

        C25631c(C25628h hVar) {
            this.f67850a = hVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C52670a<C52860x> aVar = this.f67850a.f67846f;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.bjh);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.etg);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new C25607c(this.f67844d, this.f67847g, new C25629a(this)));
        LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (this.f67844d.size() > 7) {
                marginLayoutParams.height = (int) C9432q.m18687b(recyclerView.getContext(), 422.0f);
            } else if (this.f67844d.size() <= 4) {
                marginLayoutParams.height = (int) C9432q.m18687b(recyclerView.getContext(), 250.0f);
                recyclerView.setPadding(0, 0, 0, 0);
            } else {
                marginLayoutParams.height = -2;
            }
            recyclerView.setLayoutParams(marginLayoutParams);
            ((ImageView) findViewById(R.id.edy)).setOnClickListener(new C25630b(this));
            int b = C9432q.m18688b(getContext()) - C9432q.m18695e(getContext());
            Window window = getWindow();
            if (window != null) {
                if (b == 0) {
                    b = -1;
                }
                window.setLayout(-1, b);
                window.setGravity(80);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 80;
                window.setAttributes(attributes);
                setCanceledOnTouchOutside(true);
            }
            setOnCancelListener(new C25631c(this));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public C25628h(Context context, List<WikipediaInfo> list, Map<String, String> map, C52671b<? super WikipediaInfo, C52860x> bVar, C52670a<C52860x> aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(list, "infos");
        C52711k.m112240b(map, "params");
        super(context, R.style.tn);
        this.f67844d = list;
        this.f67847g = map;
        this.f67845e = bVar;
        this.f67846f = aVar;
    }
}
