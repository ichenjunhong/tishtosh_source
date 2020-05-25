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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.w */
public final class C45227w extends PublishSettingItem {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.w$a */
    static final class C45228a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C45227w f114403a;

        /* renamed from: b */
        final /* synthetic */ C52670a f114404b;

        C45228a(C45227w wVar, C52670a aVar) {
            this.f114403a = wVar;
            this.f114404b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f114403a.f113683j) {
                ImageView imageView = this.f114403a.f113681h;
                C52711k.m112236a((Object) imageView, "mIconRight");
                if (imageView.getVisibility() == 0) {
                    this.f114404b.invoke();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo91504a() {
        setDrawableLeft((int) R.drawable.aj1);
        setTitle((int) R.string.akd);
        setSingleLine(true);
        setSubtitle("");
        setDrawableRight((int) R.drawable.avm);
        mo91061b();
    }

    public C45227w(Context context) {
        super(context);
        mo91504a();
    }

    /* renamed from: a */
    public final void mo91505a(UrlModel urlModel, String str, String str2, int i, C52670a<C52860x> aVar) {
        C52711k.m112240b(urlModel, "addIcon");
        C52711k.m112240b(str, "title");
        C52711k.m112240b(str2, "tag");
        C52711k.m112240b(aVar, "clearAction");
        C23515d.m57669a(getLeftDrawableView(), urlModel);
        setDrawableRight((int) R.drawable.aiy);
        setRightIconListener(new C45228a(this, aVar));
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
