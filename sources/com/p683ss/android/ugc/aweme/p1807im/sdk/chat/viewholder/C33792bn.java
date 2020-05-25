package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import com.C2240a;
import com.bytedance.p702im.core.p706c.C11207p;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareGoodWindowContent;
import com.ss.android.ugc.trill.R;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.bn */
public class C33792bn extends C33809cc {
    public C33792bn(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, BaseContent baseContent, int i) {
        super.mo71780a(pVar, pVar2, baseContent, i);
        if (baseContent instanceof ShareGoodWindowContent) {
            ShareGoodWindowContent shareGoodWindowContent = (ShareGoodWindowContent) baseContent;
            this.f87727w.setText(C2240a.m6773a(Locale.getDefault(), this.f87727w.getContext().getString(R.string.bhu), new Object[]{shareGoodWindowContent.getName()}));
            this.f87728x.setVisibility(8);
            this.f87729y.setText(R.string.bht);
            C13837e eVar = new C13837e();
            eVar.mo25937a(true);
            ((C13833a) this.f87726v.getHierarchy()).mo25899a(eVar);
            ((C13833a) this.f87726v.getHierarchy()).mo25902b((int) R.drawable.daj);
            C23515d.m57669a(this.f87726v, shareGoodWindowContent.getAvatar());
            this.f87708j.setTag(50331648, Integer.valueOf(35));
            this.f87708j.setTag(67108864, shareGoodWindowContent);
        }
    }
}
