package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.text.SpannableStringBuilder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.autodispose.C4005af;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1680ad;
import p064c.p065a.C1681ae;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.cn */
final /* synthetic */ class C6506cn implements C1710e {

    /* renamed from: a */
    private final LinkPKMvpWidget f17817a;

    /* renamed from: b */
    private final User f17818b;

    C6506cn(LinkPKMvpWidget linkPKMvpWidget, User user) {
        this.f17817a = linkPKMvpWidget;
        this.f17818b = user;
    }

    public final void accept(Object obj) {
        LinkPKMvpWidget linkPKMvpWidget = this.f17817a;
        User user = this.f17818b;
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
        int c = C3922z.m9910c();
        C5213c.m11820a(linkPKMvpWidget.f17183e, user.getAvatarThumb());
        linkPKMvpWidget.f17184f.setText(spannableStringBuilder);
        if (linkPKMvpWidget.f17187i == null || linkPKMvpWidget.f17188j == null) {
            linkPKMvpWidget.f17187i = ObjectAnimator.ofFloat(linkPKMvpWidget.f17182d, "translationX", new float[]{(float) c, 0.0f});
            linkPKMvpWidget.f17187i.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    LinkPKMvpWidget.this.f17182d.setVisibility(0);
                    ((C4005af) C1680ad.m5956a(10, TimeUnit.SECONDS).mo6148a(C1667a.m5940a()).mo6153a((C1681ae<T, ? extends R>) LinkPKMvpWidget.this.autoDispose())).mo9409a(new C6509cq(this));
                }
            });
            linkPKMvpWidget.f17187i.setDuration(1000);
            linkPKMvpWidget.f17188j = ObjectAnimator.ofFloat(linkPKMvpWidget.f17182d, "translationX", new float[]{0.0f, (float) (-c)});
            linkPKMvpWidget.f17188j.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    LinkPKMvpWidget.this.f17182d.setVisibility(8);
                }
            });
            linkPKMvpWidget.f17188j.setDuration(1000);
        }
        linkPKMvpWidget.f17187i.start();
    }
}
