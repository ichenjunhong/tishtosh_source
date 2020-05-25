package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g;
import com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.d */
public final class C45156d extends PublishSettingItem {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.d$a */
    static final class C45157a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C45156d f114270a;

        /* renamed from: b */
        final /* synthetic */ C52670a f114271b;

        C45157a(C45156d dVar, C52670a aVar) {
            this.f114270a = dVar;
            this.f114271b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f114270a.f113683j) {
                ImageView imageView = this.f114270a.f113681h;
                C52711k.m112236a((Object) imageView, "mIconRight");
                if (imageView.getVisibility() == 0) {
                    this.f114271b.invoke();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo91461a() {
        setDrawableLeft((int) R.drawable.aix);
        setTitle((int) R.string.ak_);
        setTagText("");
        setSingleLine(true);
        setDrawableRight((int) R.drawable.avm);
        mo91061b();
        List arrayList = new ArrayList();
        List b = AnchorListManager.f67772d.mo52758b();
        if (b != null && b.size() > 0 && !((C25626g) b.get(0)).f67837h) {
            arrayList.addAll(b);
        }
        if (arrayList.size() == 2) {
            if (((C25626g) arrayList.get(0)).f67830a == C25600a.POI.getTYPE() && ((C25626g) arrayList.get(1)).f67830a == C25600a.WIKIPEDIA.getTYPE()) {
                Context context = getContext();
                C52711k.m112236a((Object) context, "context");
                setSubtitle(context.getResources().getString(R.string.am2));
                return;
            }
            Context context2 = getContext();
            C52711k.m112236a((Object) context2, "context");
            setSubtitle(context2.getResources().getString(R.string.alt, new Object[]{((C25626g) arrayList.get(0)).f67832c, ((C25626g) arrayList.get(1)).f67832c}));
        } else if (arrayList.size() >= 3) {
            Context context3 = getContext();
            C52711k.m112236a((Object) context3, "context");
            setSubtitle(context3.getResources().getString(R.string.alu, new Object[]{((C25626g) arrayList.get(0)).f67832c, ((C25626g) arrayList.get(1)).f67832c}));
        } else {
            setSubtitle("");
        }
    }

    public C45156d(Context context) {
        super(context);
        mo91461a();
    }

    /* renamed from: a */
    public final void mo91462a(UrlModel urlModel, String str, String str2, int i, C52670a<C52860x> aVar) {
        C52711k.m112240b(urlModel, "addIcon");
        C52711k.m112240b(str, "title");
        C52711k.m112240b(str2, "tag");
        C52711k.m112240b(aVar, "clearAction");
        C23515d.m57669a(getLeftDrawableView(), urlModel);
        setTitle(str);
        setSubtitle("");
        setTagText(str2);
        setDrawableRight((int) R.drawable.aiy);
        setRightIconListener(new C45157a(this, aVar));
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
