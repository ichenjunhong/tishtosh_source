package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ad */
public final class C44965ad extends PublishSettingItem {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ad$a */
    static final class C44966a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44965ad f113890a;

        /* renamed from: b */
        final /* synthetic */ C52670a f113891b;

        C44966a(C44965ad adVar, C52670a aVar) {
            this.f113890a = adVar;
            this.f113891b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f113890a.f113683j) {
                ImageView imageView = this.f113890a.f113681h;
                C52711k.m112236a((Object) imageView, "mIconRight");
                if (imageView.getVisibility() == 0) {
                    this.f113891b.invoke();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo91252a() {
        setDrawableLeft((int) R.drawable.aj3);
        setTitle((int) R.string.akg);
        setSingleLine(true);
        setSubtitle("");
        setDrawableRight((int) R.drawable.avm);
        mo91061b();
    }

    public C44965ad(Context context) {
        super(context);
        mo91252a();
    }

    /* renamed from: a */
    public final void mo91253a(UrlModel urlModel, String str, String str2, int i, C52670a<C52860x> aVar) {
        C52711k.m112240b(urlModel, "addIcon");
        C52711k.m112240b(str, "title");
        C52711k.m112240b(str2, "tag");
        C52711k.m112240b(aVar, "clearAction");
        C23515d.m57669a(getLeftDrawableView(), urlModel);
        setDrawableRight((int) R.drawable.aiy);
        setRightIconListener(new C44966a(this, aVar));
        setTagText(str2);
        setTitle(str);
        ImageView imageView = this.f113681h;
        C52711k.m112236a((Object) imageView, "mIconRight");
        int i2 = 0;
        if (C36811b.m82845a(Integer.valueOf(i))) {
            setEnable(false);
            i2 = 8;
        } else {
            setEnable(true);
        }
        imageView.setVisibility(i2);
    }
}
