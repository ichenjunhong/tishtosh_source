package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C5188h;
import com.bytedance.android.livesdk.message.model.C7862cc;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8336h;
import com.bytedance.android.livesdk.user.C8337i;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C1673aa;
import p064c.p065a.C1674ab;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.q */
final /* synthetic */ class C6593q implements OnClickListener {

    /* renamed from: a */
    private final CommentPromotionWidget f17931a;

    /* renamed from: b */
    private final C7862cc f17932b;

    C6593q(CommentPromotionWidget commentPromotionWidget, C7862cc ccVar) {
        this.f17931a = commentPromotionWidget;
        this.f17932b = ccVar;
    }

    public final void onClick(View view) {
        CommentPromotionWidget commentPromotionWidget = this.f17931a;
        C7862cc ccVar = this.f17932b;
        commentPromotionWidget.dismiss();
        if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
            TTLiveSDKContext.getHostService().mo10315h().mo14516a(commentPromotionWidget.context, C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.e6t)).mo14544d("live_detail").mo14545e("comment_live").mo14543c("input").mo14539a(18).mo14541a()).mo6513a((C1673aa<? super T, ? extends R>) commentPromotionWidget.getAutoUnbindTransformer()).mo6314a((C1674ab<? super T>) new C8335g<C3009i>() {
                public final void onError(Throwable th) {
                    super.onError(th);
                    if (CommentPromotionWidget.this.f16812a != null) {
                        CommentPromotionWidget.this.f16812a = null;
                    }
                }

                public final /* synthetic */ void onNext(Object obj) {
                    super.onNext((C3009i) obj);
                    if (CommentPromotionWidget.this.f16812a != null) {
                        CommentPromotionWidget.this.dataCenter.lambda$put$1$DataCenter("cmd_do_send_message", new C5188h(CommentPromotionWidget.this.f16812a.f21750e));
                        CommentPromotionWidget.this.f16812a = null;
                    }
                }
            });
            return;
        }
        if (!TTLiveSDKContext.getHostService().mo10315h().mo14528a(C8336h.COMMENT_GUIDE)) {
            C5188h hVar = new C5188h(ccVar.f21750e);
            hVar.f13894b = true;
            commentPromotionWidget.mo12311a();
            hVar.f13895c = commentPromotionWidget.mo12311a();
            commentPromotionWidget.dataCenter.lambda$put$1$DataCenter("cmd_do_send_message", hVar);
            commentPromotionWidget.f16812a = null;
        }
    }
}
