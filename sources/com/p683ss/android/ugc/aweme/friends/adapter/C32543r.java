package com.p683ss.android.ugc.aweme.friends.adapter;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12200n;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.p769c.C12168c;
import com.bytedance.lighten.p766a.p769c.C12175j;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.p1589a.C26838e;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32506c;
import com.p683ss.android.ugc.aweme.profile.model.RecommendAwemeItem;
import com.p683ss.android.ugc.aweme.utils.C47856en;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.r */
public final class C32543r extends C26838e<RecommendAwemeItem> {

    /* renamed from: a */
    int f84726a;

    /* renamed from: b */
    public C32506c f84727b;

    /* renamed from: c */
    private ImageView f84728c;

    /* renamed from: c */
    public final void mo50308c() {
        boolean z;
        if (mo54781g()) {
            UrlModel dynamicCover = ((RecommendAwemeItem) this.f70665k).getDynamicCover();
            if (dynamicCover != null && dynamicCover.getUrlList() != null && !dynamicCover.getUrlList().isEmpty()) {
                Iterator it = dynamicCover.getUrlList().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!TextUtils.isEmpty((String) it.next())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                this.f70667m = true;
                C12203q.m24645a((Object) C23608p.m57874a(((RecommendAwemeItem) this.f70665k).getDynamicCover())).mo23116a((C12197k) this.f70666l).mo23118a("RecommendAwemeViewHolder").mo23124b(true).mo23122a((C12175j) new C12168c() {
                    /* renamed from: a */
                    public final void mo23095a(Uri uri, View view, Throwable th) {
                    }

                    /* renamed from: a */
                    public final void mo23094a(Uri uri, View view, C12200n nVar, Animatable animatable) {
                        C32543r.this.f70666l.setUserVisibleHint(true);
                        C32543r.this.f70666l.mo23137b();
                    }
                });
                return;
            }
        }
        if (((RecommendAwemeItem) this.f70665k).getCover() == null || ((RecommendAwemeItem) this.f70665k).getCover().getUrlList() == null || ((RecommendAwemeItem) this.f70665k).getCover().getUrlList().size() == 0 || TextUtils.isEmpty((CharSequence) ((RecommendAwemeItem) this.f70665k).getCover().getUrlList().get(0))) {
            this.f70666l.setImageResource(R.color.a1x);
        } else {
            C12203q.m24645a((Object) C23608p.m57874a(((RecommendAwemeItem) this.f70665k).getCover())).mo23116a((C12197k) this.f70666l).mo23118a("RecommendAwemeViewHolder").mo23111a(this.f84726a, this.f84726a).mo23121a();
        }
    }

    C32543r(View view) {
        super(view);
        this.f70666l = (SmartImageView) view.findViewById(R.id.as2);
        this.f84728c = (ImageView) view.findViewById(R.id.asp);
    }

    /* renamed from: a */
    public final void mo54774a(RecommendAwemeItem recommendAwemeItem, int i) {
        int i2;
        if (recommendAwemeItem != null) {
            this.f70665k = recommendAwemeItem;
            ImageView imageView = this.f84728c;
            if (TextUtils.equals(recommendAwemeItem.getMediaType(), "2")) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            mo50308c();
            ((C13833a) this.f70666l.getHierarchy()).mo25899a(C13837e.m28113b((float) C23728o.m58241a(2.0d)));
            if (VERSION.SDK_INT >= 21) {
                this.f70666l.setOutlineProvider(new C47856en(C23728o.m58241a(2.0d)));
                this.f70666l.setClipToOutline(true);
            }
            this.f70666l.setOnClickListener(new C32545s(this, i));
        }
    }
}
