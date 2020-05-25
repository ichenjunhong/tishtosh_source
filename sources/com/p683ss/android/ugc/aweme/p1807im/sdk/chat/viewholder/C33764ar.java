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
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SelfStoryReplyContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.ss.android.ugc.trill.R;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ar */
public class C33764ar extends C33805c<SelfStoryReplyContent> {

    /* renamed from: u */
    public final DmtTextView f87573u;

    /* renamed from: v */
    public final RemoteImageView f87574v;

    /* renamed from: w */
    public final DmtTextView f87575w;

    /* renamed from: x */
    public final ImageView f87576x;

    /* renamed from: y */
    public final LinearLayout f87577y;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ar$a */
    static final class C33765a<TTaskResult, TContinuationResult> implements C0011g<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ C33764ar f87578a;

        /* renamed from: b */
        final /* synthetic */ C11207p f87579b;

        C33765a(C33764ar arVar, C11207p pVar) {
            this.f87578a = arVar;
            this.f87579b = pVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            boolean z;
            C33764ar arVar = this.f87578a;
            if (iVar == null || !iVar.mo26b() || ((Boolean) iVar.mo34e()).booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            arVar.mo71815a(z);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71779a() {
        super.mo71779a();
        this.f87708j = this.itemView.findViewById(R.id.ze);
    }

    /* renamed from: a */
    public void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        this.f87713o.mo73331a(this.f87708j);
    }

    /* renamed from: a */
    public final void mo71815a(boolean z) {
        ((SelfStoryReplyContent) this.f87709k).setStoryState(z);
        if (z) {
            if (((SelfStoryReplyContent) this.f87709k).getStoryContent().getStoryCover() != null) {
                C23515d.m57669a(this.f87574v, ((SelfStoryReplyContent) this.f87709k).getStoryContent().getStoryCover());
            } else {
                this.f87574v.setImageURI("");
            }
            ImageView imageView = this.f87576x;
            C52711k.m112236a((Object) imageView, "mStoryPlayableImage");
            imageView.setVisibility(0);
            LinearLayout linearLayout = this.f87577y;
            C52711k.m112236a((Object) linearLayout, "mStoryUnplayableLayout");
            linearLayout.setVisibility(8);
            return;
        }
        this.f87574v.setImageURI("");
        ImageView imageView2 = this.f87576x;
        C52711k.m112236a((Object) imageView2, "mStoryPlayableImage");
        imageView2.setVisibility(8);
        LinearLayout linearLayout2 = this.f87577y;
        C52711k.m112236a((Object) linearLayout2, "mStoryUnplayableLayout");
        linearLayout2.setVisibility(0);
    }

    public C33764ar(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
        this.f87573u = (DmtTextView) view.findViewById(R.id.ctj);
        this.f87574v = (RemoteImageView) view.findViewById(R.id.b4n);
        this.f87575w = (DmtTextView) view.findViewById(R.id.dgq);
        this.f87576x = (ImageView) view.findViewById(R.id.b4o);
        this.f87577y = (LinearLayout) view.findViewById(R.id.b4p);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, SelfStoryReplyContent selfStoryReplyContent, int i) {
        BaseContent baseContent = selfStoryReplyContent;
        super.mo71780a(pVar, pVar2, baseContent, i);
        if (!(selfStoryReplyContent == null || pVar == null)) {
            this.f87573u.setText(R.string.bog);
            if (pVar.getLocalExt() == null || !pVar.getLocalExt().containsKey("story_state_unexpected")) {
                Object tag = pVar.getTag(220224);
                if (tag == null || C52711k.m112239a(tag, (Object) "story_state_net_error")) {
                    String storyId = selfStoryReplyContent.getStoryContent().getStoryId();
                    if (storyId != null) {
                        C35286u.m79860a(storyId, pVar).mo20a((C0011g<TResult, TContinuationResult>) new C33765a<TResult,TContinuationResult>(this, pVar), C0013i.f25b);
                    }
                } else if (C52711k.m112239a(tag, (Object) "story_state_checked")) {
                    mo71815a(true);
                }
            } else {
                mo71815a(false);
            }
            if (TextUtils.isEmpty(selfStoryReplyContent.getStoryReplyText())) {
                DmtTextView dmtTextView = this.f87575w;
                C52711k.m112236a((Object) dmtTextView, "mStoryReplyText");
                dmtTextView.setVisibility(8);
            } else {
                DmtTextView dmtTextView2 = this.f87575w;
                C52711k.m112236a((Object) dmtTextView2, "mStoryReplyText");
                dmtTextView2.setVisibility(0);
                C34004b a = C34004b.m77717a();
                C52711k.m112236a((Object) a, "AwemeImManager.instance()");
                C35460j f = a.mo71949f();
                C52711k.m112236a((Object) f, "AwemeImManager.instance().proxy");
                if (f.getIMSetting().f91143a == 1) {
                    String storyReplyText = selfStoryReplyContent.getStoryReplyText();
                    if (storyReplyText == null) {
                        C52711k.m112234a();
                    }
                    if (storyReplyText.length() <= 1024) {
                        C33684p.m77135a(this.f87575w, selfStoryReplyContent.getStoryReplyText(), this.f87707i, C35197am.m79559a(pVar, baseContent), pVar.getMsgId(), pVar);
                    }
                }
                DmtTextView dmtTextView3 = this.f87575w;
                C52711k.m112236a((Object) dmtTextView3, "mStoryReplyText");
                dmtTextView3.setText(selfStoryReplyContent.getStoryReplyText());
            }
        }
        this.f87708j.setTag(50331648, Integer.valueOf(32));
        this.f87708j.setTag(117440512, this.f87574v);
        this.f87708j.setTag(67108864, pVar);
    }
}
