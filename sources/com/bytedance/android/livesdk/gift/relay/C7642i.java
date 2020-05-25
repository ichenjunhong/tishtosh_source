package com.bytedance.android.livesdk.gift.relay;

import android.content.res.Resources;
import android.graphics.Point;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.gift.relay.p381a.C7631c;
import com.bytedance.android.livesdk.gift.relay.p381a.C7631c.C7632a;
import com.bytedance.android.livesdk.p279af.C4577ap;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gift.relay.i */
public final class C7642i extends C1352v {

    /* renamed from: a */
    HSImageView f21040a;

    /* renamed from: b */
    HSImageView f21041b;

    /* renamed from: c */
    HSImageView f21042c;

    /* renamed from: d */
    TextView f21043d;

    /* renamed from: e */
    TextView f21044e;

    /* renamed from: f */
    public C7643a f21045f;

    /* renamed from: g */
    C7631c f21046g;

    /* renamed from: h */
    private View f21047h;

    /* renamed from: com.bytedance.android.livesdk.gift.relay.i$a */
    public interface C7643a {
        /* renamed from: a */
        void mo13992a(C7642i iVar, C7632a aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13998a(boolean z) {
        int i;
        View view = this.f21047h;
        Resources resources = this.itemView.getContext().getResources();
        if (z) {
            i = R.drawable.br6;
        } else {
            i = R.drawable.br7;
        }
        view.setBackgroundDrawable(resources.getDrawable(i));
    }

    public C7642i(View view, C7631c cVar) {
        super(view);
        this.f21047h = view.findViewById(R.id.alc);
        this.f21040a = (HSImageView) view.findViewById(R.id.all);
        this.f21041b = (HSImageView) view.findViewById(R.id.alg);
        this.f21042c = (HSImageView) view.findViewById(R.id.al3);
        this.f21043d = (TextView) view.findViewById(R.id.alh);
        this.f21044e = (TextView) view.findViewById(R.id.alj);
        this.f21046g = cVar;
        LayoutParams layoutParams = this.f21047h.getLayoutParams();
        if (layoutParams != null) {
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            layoutParams.width = ((point.x - ((int) C4577ap.m10990a(view.getContext(), 28.0f))) / 3) - ((int) C4577ap.m10990a(view.getContext(), 4.0f));
            this.f21047h.setLayoutParams(layoutParams);
        }
    }
}
