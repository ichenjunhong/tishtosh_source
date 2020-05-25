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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.y */
public final class C45235y extends PublishSettingItem {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.y$a */
    static final class C45236a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C45235y f114416a;

        /* renamed from: b */
        final /* synthetic */ C52670a f114417b;

        C45236a(C45235y yVar, C52670a aVar) {
            this.f114416a = yVar;
            this.f114417b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f114416a.f113683j) {
                ImageView imageView = this.f114416a.f113681h;
                C52711k.m112236a((Object) imageView, "mIconRight");
                if (imageView.getVisibility() == 0) {
                    this.f114417b.invoke();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo91509a() {
        setDrawableLeft((int) R.drawable.d0d);
        setTitle((int) R.string.gt2);
        setSingleLine(true);
        setSubtitle("");
        setDrawableRight((int) R.drawable.avm);
        mo91061b();
    }

    public C45235y(Context context) {
        super(context);
        mo91509a();
    }

    /* renamed from: a */
    public final void mo91510a(UrlModel urlModel, String str, int i, C52670a<C52860x> aVar) {
        C52711k.m112240b(urlModel, "addIcon");
        C52711k.m112240b(str, "title");
        C52711k.m112240b(aVar, "clearAction");
        C23515d.m57669a(getLeftDrawableView(), urlModel);
        setDrawableRight((int) R.drawable.aiy);
        setRightIconListener(new C45236a(this, aVar));
        setTitle(str);
        ImageView imageView = this.f113681h;
        C52711k.m112236a((Object) imageView, "mIconRight");
        boolean a = C36811b.m82845a(Integer.valueOf(i));
        int i2 = 0;
        if (a) {
            setEnable(false);
            i2 = 8;
        } else {
            setEnable(true);
        }
        imageView.setVisibility(i2);
    }
}
