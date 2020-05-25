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
import java.util.Iterator;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.di */
public final class C45170di extends PublishSettingItem {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.di$a */
    static final class C45171a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C45170di f114291a;

        /* renamed from: b */
        final /* synthetic */ C52670a f114292b;

        C45171a(C45170di diVar, C52670a aVar) {
            this.f114291a = diVar;
            this.f114292b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f114291a.f113683j) {
                ImageView imageView = this.f114291a.f113681h;
                C52711k.m112236a((Object) imageView, "mIconRight");
                if (imageView.getVisibility() == 0) {
                    this.f114292b.invoke();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo91473a() {
        boolean z;
        List b = AnchorListManager.f67772d.mo52758b();
        C25626g gVar = null;
        if (b != null) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C25626g gVar2 = (C25626g) next;
                if (gVar2.f67830a == C25600a.WIKIPEDIA.getTYPE() || gVar2.f67830a == C25600a.YELP.getTYPE() || gVar2.f67830a == C25600a.TRIP_ADVISOR.getTYPE()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    gVar = next;
                    break;
                }
            }
            gVar = gVar;
        }
        if (gVar == null) {
            setVisibility(8);
            return;
        }
        C23515d.m57669a(getLeftDrawableView(), gVar.f67834e);
        int i = gVar.f67830a;
        if (i == C25600a.WIKIPEDIA.getTYPE()) {
            setTitle((int) R.string.akk);
        } else if (i == C25600a.YELP.getTYPE()) {
            setTitle((int) R.string.akl);
        } else if (i == C25600a.TRIP_ADVISOR.getTYPE()) {
            setTitle((int) R.string.akj);
        }
        setSingleLine(true);
        setSubtitle("");
        setDrawableRight((int) R.drawable.avm);
        mo91061b();
    }

    public C45170di(Context context) {
        super(context);
        mo91473a();
    }

    /* renamed from: a */
    public final void mo91474a(UrlModel urlModel, String str, int i, C52670a<C52860x> aVar) {
        C52711k.m112240b(urlModel, "addIcon");
        C52711k.m112240b(str, "title");
        C52711k.m112240b(aVar, "clearAction");
        C23515d.m57669a(getLeftDrawableView(), urlModel);
        setDrawableRight((int) R.drawable.aiy);
        setRightIconListener(new C45171a(this, aVar));
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
