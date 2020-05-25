package com.p683ss.android.ugc.aweme.shortvideo.sticker.p2227b;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.PopupWindow.OnDismissListener;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.scene.C18998a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.C43507as;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.C43511a.C43512a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.C43514c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.C43527n;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2226a.C44519a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2226a.C44523c;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.a */
public abstract class C44526a {

    /* renamed from: g */
    public static final C44527a f112686g = new C44527a(null);

    /* renamed from: a */
    public boolean f112687a;

    /* renamed from: b */
    public C43527n f112688b;

    /* renamed from: c */
    public final Context f112689c;

    /* renamed from: d */
    public final C43507as f112690d = new C43507as();

    /* renamed from: e */
    public final View f112691e;

    /* renamed from: f */
    public final C44541f f112692f;

    /* renamed from: h */
    private final Handler f112693h = new Handler();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.a$a */
    public static final class C44527a {
        private C44527a() {
        }

        public /* synthetic */ C44527a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.a$b */
    public static final class C44528b implements C43512a {
        C44528b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.a$c */
    static final class C44529c implements OnDismissListener {

        /* renamed from: a */
        public static final C44529c f112694a = new C44529c();

        C44529c() {
        }

        public final void onDismiss() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.a$d */
    static final class C44530d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44526a f112695a;

        /* renamed from: b */
        final /* synthetic */ RectF f112696b;

        /* renamed from: c */
        final /* synthetic */ int f112697c;

        /* renamed from: d */
        final /* synthetic */ int f112698d;

        /* renamed from: e */
        final /* synthetic */ float f112699e;

        C44530d(C44526a aVar, RectF rectF, int i, int i2, float f) {
            this.f112695a = aVar;
            this.f112696b = rectF;
            this.f112697c = i;
            this.f112698d = i2;
            this.f112699e = f;
        }

        public final void run() {
            C44526a aVar = this.f112695a;
            C43527n nVar = this.f112695a.f112688b;
            if (nVar == null) {
                C52711k.m112234a();
            }
            RectF rectF = this.f112696b;
            int i = this.f112697c;
            int i2 = this.f112698d;
            float f = this.f112699e;
            aVar.f112691e.getLocationOnScreen(new int[2]);
            nVar.mo88572l();
            C52711k.m112240b(rectF, "helpBoxRect");
            nVar.f110103f = rectF;
            nVar.f110104g = i;
            nVar.f110105h = i2;
            nVar.f110106i = f;
            nVar.f110102e = aVar.f112687a;
            nVar.mo88589b(aVar.f112691e);
        }
    }

    /* renamed from: c */
    public abstract View mo90468c();

    /* renamed from: a */
    public final void mo90465a() {
        m97447a(false);
    }

    /* renamed from: b */
    public final void mo90467b() {
        m97447a(true);
    }

    /* renamed from: f */
    public final void mo90471f() {
        C53755c.m114319a().mo112955a((Object) this);
    }

    /* renamed from: g */
    public final void mo90472g() {
        C53755c.m114319a().mo112959c((Object) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final LinearLayout mo90469d() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f112689c);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setMinimumWidth((int) C9432q.m18687b(this.f112689c, 104.0f));
        linearLayout.setGravity(16);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final View mo90470e() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) C9432q.m18687b(this.f112689c, 0.5f));
        View view = new View(this.f112689c);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(this.f112689c.getResources().getColor(R.color.aso));
        view.setAlpha(0.2f);
        return view;
    }

    @C53771m
    public final void onDismissPopEvent(C44533c cVar) {
        C52711k.m112240b(cVar, "event");
        mo90467b();
    }

    /* renamed from: b */
    private static void m97448b(C43514c cVar) {
        cVar.mo88543a((C43512a) new C44528b());
        cVar.setOnDismissListener(C44529c.f112694a);
    }

    /* renamed from: a */
    private final void m97447a(boolean z) {
        this.f112693h.removeCallbacksAndMessages(null);
        C43527n nVar = this.f112688b;
        if (nVar != null && nVar.isShowing()) {
            if (z) {
                C43527n nVar2 = this.f112688b;
                if (nVar2 != null) {
                    nVar2.mo88569i();
                }
            } else {
                C43527n nVar3 = this.f112688b;
                if (nVar3 != null) {
                    nVar3.mo88568h();
                }
            }
        }
        this.f112688b = null;
    }

    /* renamed from: a */
    private final void m97446a(C43514c cVar) {
        cVar.mo88564c(true);
        cVar.mo88560a(200);
        cVar.mo88563b(-1);
        cVar.mo88545a(this.f112689c.getResources().getColor(R.color.jc));
        cVar.mo88546a(false);
        cVar.mo88548b(false);
        cVar.mo88542a(mo90468c());
        C44519a aVar = new C44519a(this.f112689c, 200, 200, cVar);
        cVar.mo88561a((C44523c) aVar);
        C43514c.m95400g((int) C9432q.m18687b(this.f112689c, 15.0f));
    }

    public C44526a(View view, C44541f fVar) {
        C52711k.m112240b(view, "contentView");
        this.f112691e = view;
        this.f112692f = fVar;
        Context context = this.f112691e.getContext();
        C52711k.m112236a((Object) context, "contentView.context");
        this.f112689c = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final LinearLayout mo90464a(int i, int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) C9432q.m18687b(this.f112689c, 44.0f));
        LinearLayout linearLayout = new LinearLayout(this.f112689c);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setMinimumWidth((int) C9432q.m18687b(this.f112689c, 104.0f));
        DmtTextView dmtTextView = new DmtTextView(this.f112689c);
        dmtTextView.setTextColor(this.f112689c.getResources().getColor(R.color.aso));
        dmtTextView.setTextSize(14.0f);
        dmtTextView.setMaxLines(1);
        dmtTextView.setGravity(16);
        dmtTextView.setText(this.f112689c.getString(i2));
        TextPaint paint = dmtTextView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = (int) C9432q.m18687b(this.f112689c, 4.0f);
        layoutParams2.rightMargin = (int) C9432q.m18687b(this.f112689c, 12.0f);
        if (VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) C9432q.m18687b(this.f112689c, 4.0f));
            layoutParams2.setMarginEnd((int) C9432q.m18687b(this.f112689c, 12.0f));
        }
        dmtTextView.setLayoutParams(layoutParams2);
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.f112689c);
        autoRTLImageView.setImageResource(i);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = (int) C9432q.m18687b(this.f112689c, 12.0f);
        if (VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart((int) C9432q.m18687b(this.f112689c, 12.0f));
        }
        autoRTLImageView.setLayoutParams(layoutParams3);
        linearLayout.addView(autoRTLImageView);
        linearLayout.addView(dmtTextView);
        if (VERSION.SDK_INT >= 17) {
            autoRTLImageView.setLayoutDirection(0);
        }
        return linearLayout;
    }

    /* renamed from: a */
    public final void mo90466a(RectF rectF, int i, int i2, float f) {
        C52711k.m112240b(rectF, "helpBoxRect");
        C53755c.m114319a().mo112960d(new C44533c());
        if (this.f112688b == null) {
            this.f112688b = new C43527n(C18998a.m46169a(this.f112689c), false);
            C43527n nVar = this.f112688b;
            if (nVar == null) {
                C52711k.m112234a();
            }
            m97446a((C43514c) nVar);
        }
        C43527n nVar2 = this.f112688b;
        if (nVar2 == null) {
            C52711k.m112234a();
        }
        m97448b(nVar2);
        Handler handler = this.f112693h;
        C44530d dVar = new C44530d(this, rectF, i, i2, f);
        handler.postDelayed(dVar, 200);
    }
}
