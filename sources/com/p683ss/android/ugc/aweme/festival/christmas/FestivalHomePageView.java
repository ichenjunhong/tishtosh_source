package com.p683ss.android.ugc.aweme.festival.christmas;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.utils.C23711b.C23712a;
import com.p683ss.android.ugc.aweme.base.utils.C23722i;
import com.p683ss.android.ugc.aweme.bizactivity.AnimateDraweeView;
import com.p683ss.android.ugc.aweme.festival.p1739a.C31351d;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.festival.christmas.FestivalHomePageView */
public class FestivalHomePageView extends FrameLayout {

    /* renamed from: a */
    C31356a f82121a;

    /* renamed from: b */
    private ImageView f82122b;

    /* renamed from: c */
    private View f82123c;

    /* renamed from: d */
    private AnimateDraweeView f82124d;

    /* renamed from: com.ss.android.ugc.aweme.festival.christmas.FestivalHomePageView$a */
    public interface C31356a {
        /* renamed from: a */
        void mo64240a();
    }

    public AnimateDraweeView getHomePageIconView() {
        return this.f82124d;
    }

    /* renamed from: b */
    public final void mo64236b() {
        setVisibility(8);
    }

    /* renamed from: a */
    public final void mo64234a() {
        if (this.f82123c != null) {
            setVisibility(0);
            this.f82123c.setVisibility(0);
        }
    }

    /* renamed from: c */
    public final void mo64237c() {
        Drawable a = C31351d.m73082a("top_left_close_icon.png");
        if (a == null) {
            a = C31351d.m73080a(C31351d.m73086b("top_left_close_icon.png"));
            if (a != null) {
                C31351d.m73084a("top_left_close_icon.png", a);
            }
        }
        if (a != null) {
            this.f82122b.setImageDrawable(a);
            this.f82122b.setVisibility(0);
            this.f82122b.setOnClickListener(new C31363c(this));
        }
    }

    public void setCloseClickListener(C31356a aVar) {
        this.f82121a = aVar;
    }

    public FestivalHomePageView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo64235a(File file) {
        if (file != null && file.exists() && file.isFile()) {
            UrlModel urlModel = new UrlModel();
            ArrayList arrayList = new ArrayList();
            arrayList.add(Uri.fromFile(file).toString());
            urlModel.setUrlList(arrayList);
            AnimateDraweeView animateDraweeView = this.f82124d;
            Config config = Config.ARGB_8888;
            if (!C23722i.m58215a(animateDraweeView.f63482a, urlModel)) {
                animateDraweeView.f63482a = urlModel;
                if (animateDraweeView.f63483b == null) {
                    animateDraweeView.f63483b = new C23712a();
                }
                C23712a aVar = animateDraweeView.f63483b;
                UrlModel urlModel2 = animateDraweeView.f63482a;
                aVar.f63240e = animateDraweeView;
                aVar.f63239d = urlModel2;
                aVar.f63236a = true;
                aVar.f63237b = config;
                aVar.mo49147a(aVar.f63236a, aVar.f63237b, null);
            }
        }
    }

    public FestivalHomePageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FestivalHomePageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f82123c = LayoutInflater.from(context).inflate(R.layout.b4j, this, false);
        this.f82122b = (ImageView) this.f82123c.findViewById(R.id.az9);
        this.f82124d = (AnimateDraweeView) this.f82123c.findViewById(R.id.b1f);
        addView(this.f82123c);
    }
}
