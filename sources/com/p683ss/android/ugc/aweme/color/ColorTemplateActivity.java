package com.p683ss.android.ugc.aweme.color;

import android.os.Bundle;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.aweme.color.ColorTemplateActivity */
public final class ColorTemplateActivity extends AppCompatActivity {

    /* renamed from: a */
    private HashMap f66368a;

    /* renamed from: com.ss.android.ugc.aweme.color.ColorTemplateActivity$a */
    static final class C25052a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52727e f66369a;

        C25052a(C52727e eVar) {
            this.f66369a = eVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C25053a aVar = (C25053a) this.f66369a.element;
            aVar.f66370a = !aVar.f66370a;
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private View m60899a(int i) {
        if (this.f66368a == null) {
            this.f66368a = new HashMap();
        }
        View view = (View) this.f66368a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f66368a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.color.ColorTemplateActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.color.ColorTemplateActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.color.ColorTemplateActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.color.ColorTemplateActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ax5);
        C52727e eVar = new C52727e();
        eVar.element = new C25053a(this);
        RecyclerView recyclerView = (RecyclerView) m60899a(R.id.bbo);
        C52711k.m112236a((Object) recyclerView, "list");
        recyclerView.setAdapter((C25053a) eVar.element);
        ((FrameLayout) m60899a(R.id.f0s)).setOnClickListener(new C25052a(eVar));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.color.ColorTemplateActivity", "onCreate", false);
    }
}
