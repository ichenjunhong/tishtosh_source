package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11207p;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.OnlyPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33455c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35196al;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ak */
public class C33749ak extends C33805c<OnlyPictureContent> {

    /* renamed from: u */
    private final int f87538u = C11010c.m22280a().getResources().getDimensionPixelSize(R.dimen.in);

    /* renamed from: v */
    private RemoteImageView f87539v;

    /* renamed from: c */
    public final View mo71804c() {
        return this.f87539v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87539v = (RemoteImageView) this.itemView.findViewById(R.id.by0);
        this.f87708j = this.itemView.findViewById(R.id.ze);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo71782b() {
        super.mo71782b();
        this.f87713o.mo73331a(this.f87708j);
    }

    /* renamed from: a */
    public void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        this.f87708j.setOnClickListener(onClickListener);
    }

    public C33749ak(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, OnlyPictureContent onlyPictureContent, int i) {
        super.mo71780a(pVar, pVar2, onlyPictureContent, i);
        Integer[] a = C35196al.m79551a(this.f87539v, (float) ((OnlyPictureContent) this.f87709k).getWidth(), (float) ((OnlyPictureContent) this.f87709k).getHeight());
        LayoutParams layoutParams = (LayoutParams) this.f87539v.getLayoutParams();
        layoutParams.width = a[0].intValue();
        layoutParams.height = a[1].intValue();
        this.f87539v.setLayoutParams(layoutParams);
        ((C13833a) this.f87539v.getHierarchy()).mo25899a(C13837e.m28114b((float) this.f87538u, (float) this.f87538u, (float) this.f87538u, (float) this.f87538u));
        C23515d.m57669a(this.f87539v, C33455c.m76688a(onlyPictureContent.getUrl(), onlyPictureContent.getPicturePath()));
        this.f87708j.setTag(50331648, Integer.valueOf(9));
        this.f87708j.setTag(67108864, this.f87712n);
    }
}
