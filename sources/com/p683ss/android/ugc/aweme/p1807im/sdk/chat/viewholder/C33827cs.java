package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.p702im.core.p706c.C11178a;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryVideoContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33455c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35196al;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.cs */
public class C33827cs extends C33805c<StoryVideoContent> {

    /* renamed from: u */
    protected ImageView f87772u;

    /* renamed from: v */
    private RemoteImageView f87773v;

    /* renamed from: w */
    private TextView f87774w;

    /* renamed from: c */
    public final View mo71804c() {
        RemoteImageView remoteImageView = this.f87773v;
        if (remoteImageView == null) {
            C52711k.m112237a("mStoryCoverImage");
        }
        return remoteImageView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final ImageView mo71869g() {
        ImageView imageView = this.f87772u;
        if (imageView == null) {
            C52711k.m112237a("mStoryPlayableImage");
        }
        return imageView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        View findViewById = this.itemView.findViewById(R.id.b4o);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.iv_story_playable)");
        this.f87772u = (ImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.b4n);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.iv_story_cover)");
        this.f87773v = (RemoteImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.bs0);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.notice_tv)");
        this.f87774w = (TextView) findViewById3;
        this.f87708j = this.itemView.findViewById(R.id.ze);
    }

    /* renamed from: a */
    public void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        if (onClickListener != null) {
            this.f87713o.mo73331a(this.f87708j);
            this.f87708j.setOnClickListener(onClickListener);
        }
    }

    public C33827cs(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, StoryVideoContent storyVideoContent, int i) {
        super.mo71780a(pVar, pVar2, storyVideoContent, i);
        RemoteImageView remoteImageView = this.f87773v;
        if (remoteImageView == null) {
            C52711k.m112237a("mStoryCoverImage");
        }
        Integer[] a = C35196al.m79551a(remoteImageView, (float) ((StoryVideoContent) this.f87709k).getWidth(), (float) ((StoryVideoContent) this.f87709k).getHeight());
        RemoteImageView remoteImageView2 = this.f87773v;
        if (remoteImageView2 == null) {
            C52711k.m112237a("mStoryCoverImage");
        }
        LayoutParams layoutParams = remoteImageView2.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = a[0].intValue();
            layoutParams2.height = a[1].intValue();
            RemoteImageView remoteImageView3 = this.f87773v;
            if (remoteImageView3 == null) {
                C52711k.m112237a("mStoryCoverImage");
            }
            remoteImageView3.setLayoutParams(layoutParams2);
            if (pVar != null && storyVideoContent != null) {
                if (pVar.getAttachments() != null && pVar.getAttachments().size() >= 3) {
                    List<C11178a> attachments = pVar.getAttachments();
                    C52711k.m112236a((Object) attachments, "msg.attachments");
                    for (C11178a aVar : attachments) {
                        if (aVar != null) {
                            if (TextUtils.isEmpty(storyVideoContent.getLocalVideo()) && aVar.getIndex() == 1) {
                                storyVideoContent.setLocalVideo(aVar.getLocalPath());
                            } else if (TextUtils.isEmpty(storyVideoContent.getLocalPoster()) && aVar.getIndex() == 2) {
                                storyVideoContent.setLocalPoster(aVar.getLocalPath());
                            }
                        }
                        if (!TextUtils.isEmpty(storyVideoContent.getLocalVideo())) {
                            TextUtils.isEmpty(storyVideoContent.getLocalPoster());
                        }
                    }
                }
                UrlModel a2 = C33455c.m76688a(storyVideoContent.getDisplayPoster(), storyVideoContent.getLocalPoster());
                RemoteImageView remoteImageView4 = this.f87773v;
                if (remoteImageView4 == null) {
                    C52711k.m112237a("mStoryCoverImage");
                }
                C23515d.m57669a(remoteImageView4, a2);
                this.f87708j.setTag(50331648, Integer.valueOf(29));
                View view = this.f87708j;
                RemoteImageView remoteImageView5 = this.f87773v;
                if (remoteImageView5 == null) {
                    C52711k.m112237a("mStoryCoverImage");
                }
                view.setTag(67108864, remoteImageView5);
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }
}
