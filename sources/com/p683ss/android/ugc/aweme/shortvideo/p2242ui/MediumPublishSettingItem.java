package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.Context;
import android.util.AttributeSet;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.MediumPublishSettingItem */
public final class MediumPublishSettingItem extends PublishSettingItem {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.MediumPublishSettingItem$a */
    static final class C44906a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MediumPublishSettingItem f113649a;

        /* renamed from: b */
        final /* synthetic */ C52670a f113650b;

        C44906a(MediumPublishSettingItem mediumPublishSettingItem, C52670a aVar) {
            this.f113649a = mediumPublishSettingItem;
            this.f113650b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f113649a.f113683j) {
                ImageView imageView = this.f113649a.f113681h;
                C52711k.m112236a((Object) imageView, "mIconRight");
                if (imageView.getVisibility() == 0) {
                    this.f113650b.invoke();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo91068a() {
        setDrawableLeft((int) R.drawable.d45);
        setTagText("");
        setTitle("添加影视综艺");
        setSingleLine(true);
        setSubtitle("");
        setDrawableRight((int) R.drawable.avm);
        mo91061b();
    }

    public MediumPublishSettingItem(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet);
        mo91068a();
    }

    /* renamed from: a */
    public final void mo91069a(UrlModel urlModel, String str, String str2, int i, C52670a<C52860x> aVar) {
        C52711k.m112240b(urlModel, "addIcon");
        C52711k.m112240b(str, "title");
        C52711k.m112240b(str2, "tag");
        C52711k.m112240b(aVar, "clearAction");
        C23515d.m57669a(getLeftDrawableView(), urlModel);
        setDrawableRight((int) R.drawable.aiy);
        setRightIconListener(new C44906a(this, aVar));
        setTitle(str);
        setSubtitle("");
        setTagText(str2);
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
