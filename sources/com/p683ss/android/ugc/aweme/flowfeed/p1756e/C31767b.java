package com.p683ss.android.ugc.aweme.flowfeed.p1756e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.common.widget.DragView.IViewInfo;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.feed.C30180e;
import com.p683ss.android.ugc.aweme.feed.C30303h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30447d;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30491n;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30493o;
import com.p683ss.android.ugc.aweme.feed.utils.C31187c;
import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31779b;
import com.p683ss.android.ugc.aweme.forward.view.FeedDetailActivity;
import com.p683ss.android.ugc.aweme.forward.view.OriginDetailActivity;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.ImageFollowFeedDetailActivity;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.VideoFollowFeedDetailActivity;
import com.p683ss.android.ugc.aweme.p1632di.C27614ba;
import com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a;
import com.p683ss.android.ugc.aweme.shortvideo.C42424ao;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.e.b */
public final class C31767b implements C31779b {
    /* renamed from: b */
    public static C31779b m73783b() {
        if (C27991b.f73514j == null) {
            synchronized (C31779b.class) {
                if (C27991b.f73514j == null) {
                    C27991b.f73514j = C27614ba.m66298b();
                }
            }
        }
        return (C31779b) C27991b.f73514j;
    }

    /* renamed from: a */
    public final void mo64688a(View view, String str, boolean z, Aweme aweme) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(str, "eventType");
        C52711k.m112240b(aweme, "aweme");
    }

    /* renamed from: b */
    public final void mo64692b(View view, String str, boolean z, Aweme aweme) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(str, "eventType");
        C52711k.m112240b(aweme, "aweme");
    }

    /* renamed from: a */
    public final void mo64691a(String str) {
        C42424ao.INSTANCE.setVideoId(str);
    }

    /* renamed from: a */
    public final AbsInteractStickerWidget mo64683a() {
        return new InteractStickerWidget();
    }

    /* renamed from: a */
    public final void mo64689a(TextView textView) {
        C52711k.m112240b(textView, "textView");
        C29408b.m69342a(textView);
    }

    /* renamed from: a */
    public final void mo64686a(Context context, Aweme aweme) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aweme, "aweme");
        C30493o oVar = new C30493o(context);
        oVar.mo54799a(new C30491n());
        oVar.mo60917a(aweme, 2);
        oVar.mo44934a_(aweme.getAid(), Integer.valueOf(3));
    }

    /* renamed from: a */
    public final void mo64690a(Aweme aweme, Activity activity, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(str, "eventType");
        C41922a.m91868a().showReportDialog(aweme, str, activity, "");
    }

    /* renamed from: a */
    public final C30180e mo64682a(String str, int i, C30313ae<C30332aw> aeVar, C30447d dVar) {
        C52711k.m112240b(aeVar, "onInternalEventListener");
        C52711k.m112240b(dVar, "getEnterFromListener");
        return new C30303h(str, i, aeVar, dVar);
    }

    /* renamed from: a */
    public final void mo64685a(Context context, IViewInfo iViewInfo, Aweme aweme, String str, String str2) {
        String str3;
        C52711k.m112240b(context, "context");
        if (aweme != null) {
            Intent intent = new Intent(context, ImageFollowFeedDetailActivity.class);
            intent.putExtra("view_info", iViewInfo);
            C31187c.m72819a(aweme);
            intent.putExtra("enter_from", str);
            intent.putExtra("share_id", str2);
            intent.putExtra("launch_from_origin_detail", C11016e.m22312g() instanceof OriginDetailActivity);
            String str4 = "page_type";
            if (C11016e.m22312g() instanceof FeedDetailActivity) {
                str3 = C22858c.f61208d;
            } else {
                str3 = "list";
            }
            intent.putExtra(str4, str3);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public final void mo64687a(Context context, Aweme aweme, String str, String str2, String str3) {
        C52711k.m112240b(context, "context");
        Intent intent = new Intent(context, OriginDetailActivity.class);
        intent.putExtra("forward_item", aweme);
        intent.putExtra("refer", str);
        intent.putExtra("share_id", str2);
        intent.putExtra("tab_name", str3);
        intent.putExtra("content_source", "trends");
        context.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo64684a(Context context, IViewInfo iViewInfo, Aweme aweme, int i, String str, String str2, boolean z, boolean z2) {
        boolean z3;
        String str3;
        C52711k.m112240b(context, "context");
        if (aweme != null) {
            if (C11016e.m22312g() instanceof OriginDetailActivity) {
                z3 = true;
            } else {
                z3 = false;
            }
            Intent intent = new Intent(context, VideoFollowFeedDetailActivity.class);
            intent.putExtra("view_info", iViewInfo);
            C31187c.m72819a(aweme);
            intent.putExtra("play_action_type", i);
            intent.putExtra("enter_from", str);
            intent.putExtra("share_id", str2);
            intent.putExtra("launch_from_origin_detail", z3);
            intent.putExtra("use_follow_flow_strategy", z2);
            String str4 = "page_type";
            if (C11016e.m22312g() instanceof FeedDetailActivity) {
                str3 = C22858c.f61208d;
            } else {
                str3 = "list";
            }
            intent.putExtra(str4, str3);
            intent.putExtra("pause_on_close", false);
            context.startActivity(intent);
        }
    }
}
