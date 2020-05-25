package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.I18nShopPublishSettingItem */
public final class I18nShopPublishSettingItem extends PublishSettingItem {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.I18nShopPublishSettingItem$a */
    static final class C44903a implements OnClickListener {

        /* renamed from: a */
        public static final C44903a f113640a = new C44903a();

        C44903a() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.I18nShopPublishSettingItem$b */
    static final class C44904b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ I18nShopPublishSettingItem f113641a;

        /* renamed from: b */
        final /* synthetic */ C52670a f113642b;

        C44904b(I18nShopPublishSettingItem i18nShopPublishSettingItem, C52670a aVar) {
            this.f113641a = i18nShopPublishSettingItem;
            this.f113642b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f113641a.f113683j) {
                ImageView imageView = this.f113641a.f113681h;
                C52711k.m112236a((Object) imageView, "mIconRight");
                if (imageView.getVisibility() == 0) {
                    this.f113642b.invoke();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo91054a() {
        setDrawableLeft((int) R.drawable.a04);
        setTitle((int) R.string.eu);
        setSingleLine(true);
        setSubtitle("");
        setDrawableRight((int) R.drawable.avm);
        setRightIconListener(C44903a.f113640a);
    }

    public I18nShopPublishSettingItem(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        mo91054a();
    }

    public /* synthetic */ I18nShopPublishSettingItem(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
