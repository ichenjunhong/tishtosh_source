package com.p683ss.android.ugc.aweme.sticker.panel.p2303b;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.view.widget.AVTextView;
import com.p683ss.android.ugc.tools.view.widget.AvatarImageView;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.f */
public final class C46099f implements OnClickListener {

    /* renamed from: a */
    LinearLayout f116337a;

    /* renamed from: b */
    public AvatarImageView f116338b;

    /* renamed from: c */
    public AVTextView f116339c;

    /* renamed from: d */
    public AVTextView f116340d;

    /* renamed from: e */
    public Context f116341e;

    /* renamed from: f */
    HashMap<String, C22055c> f116342f = new HashMap<>();

    /* renamed from: g */
    Effect f116343g;

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
    }

    public C46099f(LinearLayout linearLayout, Context context) {
        this.f116337a = linearLayout;
        this.f116341e = context;
        this.f116338b = (AvatarImageView) linearLayout.findViewById(R.id.b9u);
        this.f116339c = (AVTextView) linearLayout.findViewById(R.id.b9v);
        this.f116340d = (AVTextView) linearLayout.findViewById(R.id.b9t);
        this.f116337a.setOnClickListener(this);
        this.f116337a.post(new Runnable() {
            public final void run() {
                C46099f.this.f116340d.measure(MeasureSpec.makeMeasureSpec(1073741823, DynamicTabYellowPointVersion.DEFAULT), MeasureSpec.makeMeasureSpec(1073741823, DynamicTabYellowPointVersion.DEFAULT));
                int i = C46099f.this.f116338b.getLayoutParams().width;
                C46099f.this.f116339c.setMaxWidth((int) (((float) ((C43303dy.m94971b(C46099f.this.f116341e) - i) - C46099f.this.f116340d.getMeasuredWidth())) - C9432q.m18687b(C46099f.this.f116341e, 106.0f)));
            }
        });
    }

    /* renamed from: a */
    public final void mo92793a(Effect effect, C46098e eVar) {
        if (effect != null) {
            this.f116343g = effect;
        }
        boolean z = true;
        if (effect == null || effect.getSource() != 1 || TextUtils.isEmpty(effect.getDesignerId())) {
            z = false;
        }
        if (z) {
            C0013i.m16a((Callable<TResult>) new C46101g<TResult>(effect)).mo20a((C0011g<TResult, TContinuationResult>) new C46102h<TResult,TContinuationResult>(this, effect, null), C0013i.f25b);
        } else {
            this.f116337a.setVisibility(8);
        }
    }
}
