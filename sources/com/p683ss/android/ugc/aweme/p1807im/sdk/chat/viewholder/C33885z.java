package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11207p;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.EmojiContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35186ab;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35234bi;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.z */
public class C33885z extends C33805c<EmojiContent> {

    /* renamed from: v */
    private static int f87881v = ((int) C9432q.m18687b(C11010c.m22280a(), 112.0f));

    /* renamed from: w */
    private static int f87882w = ((int) C9432q.m18687b(C11010c.m22280a(), 300.0f));

    /* renamed from: x */
    private static int f87883x = ((int) C9432q.m18687b(C11010c.m22280a(), 180.0f));

    /* renamed from: u */
    private RemoteImageView f87884u;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87884u = (RemoteImageView) this.itemView.findViewById(R.id.by0);
        this.f87708j = this.itemView.findViewById(R.id.ze);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo71782b() {
        super.mo71782b();
        this.f87713o.mo73331a(this.f87708j);
    }

    public C33885z(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, EmojiContent emojiContent, int i) {
        int i2;
        int i3;
        super.mo71780a(pVar, pVar2, emojiContent, i);
        if (((EmojiContent) this.f87709k).getType() == 500 || ((EmojiContent) this.f87709k).getType() == 501) {
            ((C13833a) this.f87884u.getHierarchy()).mo25904b((Drawable) null);
        } else {
            ((C13833a) this.f87884u.getHierarchy()).mo25902b((int) R.drawable.db3);
        }
        UrlModel localUrl = ((EmojiContent) this.f87709k).getLocalUrl();
        UrlModel urlModel = (UrlModel) this.f87884u.getTag(67108864);
        if (localUrl != null) {
            if (!localUrl.equals(urlModel)) {
                this.f87884u.setTag(67108864, localUrl);
            }
            this.f87708j.setTag(50331648, Integer.valueOf(10));
            this.f87708j.setTag(67108864, this.f87712n);
        }
        if (((EmojiContent) this.f87709k).getUrl() != null && !((EmojiContent) this.f87709k).getUrl().equals(urlModel)) {
            this.f87884u.setTag(67108864, ((EmojiContent) this.f87709k).getUrl());
        }
        this.f87708j.setTag(50331648, Integer.valueOf(10));
        this.f87708j.setTag(67108864, this.f87712n);
        boolean z = false;
        if (((EmojiContent) this.f87709k).getHeight() == 0 || ((EmojiContent) this.f87709k).getWidth() == 0) {
            i2 = 0;
            i3 = 0;
        } else if (((EmojiContent) this.f87709k).getWidth() >= ((EmojiContent) this.f87709k).getHeight()) {
            i2 = f87881v;
            i3 = (f87881v * ((EmojiContent) this.f87709k).getHeight()) / ((EmojiContent) this.f87709k).getWidth();
        } else {
            i3 = f87881v;
            i2 = (f87881v * ((EmojiContent) this.f87709k).getWidth()) / ((EmojiContent) this.f87709k).getHeight();
        }
        if (C35186ab.m79436d(((EmojiContent) this.f87709k).getImageType())) {
            i2 = f87883x;
            int height = (((EmojiContent) this.f87709k).getHeight() * i2) / ((EmojiContent) this.f87709k).getWidth();
            if (height > f87882w) {
                height = f87882w;
            }
            ((C13833a) this.f87884u.getHierarchy()).mo25898a(C13818b.f36067g);
        }
        LayoutParams layoutParams = this.f87884u.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i3;
        this.f87884u.setLayoutParams(layoutParams);
        if (!C35186ab.m79436d(((EmojiContent) this.f87709k).getImageType())) {
            String imageType = ((EmojiContent) this.f87709k).getImageType();
            if (imageType != null && imageType.toLowerCase().equals("webp")) {
                z = true;
            }
            if (!z) {
                if (localUrl == null) {
                    C23515d.m57670a(this.f87884u, ((EmojiContent) this.f87709k).getUrl(), i2, i3);
                } else {
                    C23515d.m57670a(this.f87884u, localUrl, i2, i3);
                }
                this.f87708j.setTag(50331648, Integer.valueOf(10));
                this.f87708j.setTag(67108864, this.f87712n);
            }
        }
        if (localUrl == null) {
            C35234bi.m79639a(this.f87884u, ((EmojiContent) this.f87709k).getUrl(), i2, i3);
        } else {
            C35234bi.m79639a(this.f87884u, localUrl, i2, i3);
        }
        this.f87708j.setTag(50331648, Integer.valueOf(10));
        this.f87708j.setTag(67108864, this.f87712n);
    }
}
