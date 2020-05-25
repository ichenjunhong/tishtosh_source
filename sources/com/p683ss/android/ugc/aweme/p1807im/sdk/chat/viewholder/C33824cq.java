package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33684p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryReplyContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.ss.android.ugc.trill.R;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.cq */
public class C33824cq extends C33805c<StoryReplyContent> {

    /* renamed from: u */
    private RemoteImageView f87765u;

    /* renamed from: v */
    private DmtTextView f87766v;

    /* renamed from: w */
    private LinearLayout f87767w;

    /* renamed from: x */
    private ImageView f87768x;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.cq$a */
    static final class C33825a<TTaskResult, TContinuationResult> implements C0011g<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ C33824cq f87769a;

        C33825a(C33824cq cqVar) {
            this.f87769a = cqVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            boolean z;
            C33824cq cqVar = this.f87769a;
            if (iVar == null || !iVar.mo26b() || ((Boolean) iVar.mo34e()).booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            cqVar.mo71867a(z);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        View findViewById = this.itemView.findViewById(R.id.b4n);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.iv_story_cover)");
        this.f87765u = (RemoteImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.dgq);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.tv_story_reply)");
        this.f87766v = (DmtTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.b4p);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.iv_story_unplayable)");
        this.f87767w = (LinearLayout) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.b4o);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.iv_story_playable)");
        this.f87768x = (ImageView) findViewById4;
        this.f87708j = this.itemView.findViewById(R.id.ze);
    }

    /* renamed from: a */
    public final void mo71867a(boolean z) {
        ((StoryReplyContent) this.f87709k).setStoryState(z);
        m77547b(z);
    }

    /* renamed from: a */
    public void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        if (onClickListener != null) {
            this.f87713o.mo73331a(this.f87708j);
            this.f87708j.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: b */
    private final void m77547b(boolean z) {
        if (z) {
            if (((StoryReplyContent) this.f87709k).getStoryContent().getStoryCover() != null) {
                RemoteImageView remoteImageView = this.f87765u;
                if (remoteImageView == null) {
                    C52711k.m112237a("mStoryCoverImage");
                }
                C23515d.m57669a(remoteImageView, ((StoryReplyContent) this.f87709k).getStoryContent().getStoryCover());
            } else {
                RemoteImageView remoteImageView2 = this.f87765u;
                if (remoteImageView2 == null) {
                    C52711k.m112237a("mStoryCoverImage");
                }
                remoteImageView2.setImageURI("");
            }
            ImageView imageView = this.f87768x;
            if (imageView == null) {
                C52711k.m112237a("mStoryPlayableImage");
            }
            imageView.setVisibility(0);
            LinearLayout linearLayout = this.f87767w;
            if (linearLayout == null) {
                C52711k.m112237a("mStoryUnplayableLayout");
            }
            linearLayout.setVisibility(8);
            return;
        }
        RemoteImageView remoteImageView3 = this.f87765u;
        if (remoteImageView3 == null) {
            C52711k.m112237a("mStoryCoverImage");
        }
        remoteImageView3.setImageURI("");
        ImageView imageView2 = this.f87768x;
        if (imageView2 == null) {
            C52711k.m112237a("mStoryPlayableImage");
        }
        imageView2.setVisibility(8);
        LinearLayout linearLayout2 = this.f87767w;
        if (linearLayout2 == null) {
            C52711k.m112237a("mStoryUnplayableLayout");
        }
        linearLayout2.setVisibility(0);
    }

    public C33824cq(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, StoryReplyContent storyReplyContent, int i) {
        BaseContent baseContent = storyReplyContent;
        super.mo71780a(pVar, pVar2, baseContent, i);
        if (pVar != null && storyReplyContent != null) {
            if (pVar.getLocalExt() == null || !pVar.getLocalExt().containsKey("story_state_unexpected")) {
                Object tag = pVar.getTag(220224);
                if (tag == null || C52711k.m112239a(tag, (Object) "story_state_net_error")) {
                    pVar.setTag(220224, "story_state_checking");
                    C35286u.m79860a(((StoryReplyContent) this.f87709k).getStoryContent().getStoryId(), pVar).mo20a((C0011g<TResult, TContinuationResult>) new C33825a<TResult,TContinuationResult>(this), C0013i.f25b);
                } else if (C52711k.m112239a(tag, (Object) "story_state_checked")) {
                    mo71867a(true);
                }
            } else {
                mo71867a(false);
            }
            if (TextUtils.isEmpty(storyReplyContent.getStoryReplyText())) {
                DmtTextView dmtTextView = this.f87766v;
                if (dmtTextView == null) {
                    C52711k.m112237a("mStoryReplyText");
                }
                dmtTextView.setVisibility(8);
            } else {
                DmtTextView dmtTextView2 = this.f87766v;
                if (dmtTextView2 == null) {
                    C52711k.m112237a("mStoryReplyText");
                }
                dmtTextView2.setVisibility(0);
                C34004b a = C34004b.m77717a();
                C52711k.m112236a((Object) a, "AwemeImManager.instance()");
                C35460j f = a.mo71949f();
                C52711k.m112236a((Object) f, "AwemeImManager.instance().proxy");
                if (f.getIMSetting().f91143a == 1) {
                    String storyReplyText = storyReplyContent.getStoryReplyText();
                    if (storyReplyText == null) {
                        C52711k.m112234a();
                    }
                    if (storyReplyText.length() <= 1024) {
                        DmtTextView dmtTextView3 = this.f87766v;
                        if (dmtTextView3 == null) {
                            C52711k.m112237a("mStoryReplyText");
                        }
                        C33684p.m77135a(dmtTextView3, storyReplyContent.getStoryReplyText(), this.f87707i, C35197am.m79559a(pVar, baseContent), pVar.getMsgId(), pVar);
                    }
                }
                DmtTextView dmtTextView4 = this.f87766v;
                if (dmtTextView4 == null) {
                    C52711k.m112237a("mStoryReplyText");
                }
                dmtTextView4.setText(storyReplyContent.getStoryReplyText());
            }
            this.f87708j.setTag(50331648, Integer.valueOf(25));
            View view = this.f87708j;
            RemoteImageView remoteImageView = this.f87765u;
            if (remoteImageView == null) {
                C52711k.m112237a("mStoryCoverImage");
            }
            view.setTag(117440512, remoteImageView);
            this.f87708j.setTag(67108864, pVar);
        }
    }
}
