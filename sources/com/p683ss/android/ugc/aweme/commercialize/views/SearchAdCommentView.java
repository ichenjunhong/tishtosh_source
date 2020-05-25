package com.p683ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25708a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.p1308ad.common.C22381a;
import com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22317a;
import com.p683ss.android.ugc.aweme.p1308ad.p1310b.C22324a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.SearchAdCommentView */
public final class SearchAdCommentView extends AdCommentView {

    /* renamed from: e */
    private final int f70213e;

    /* renamed from: f */
    private final int f70214f;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo54244e() {
        return true;
    }

    public final String getEventType() {
        return "general_search";
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C47718bf.m103291d(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54240a() {
        C47718bf.m103290c(this);
        Aweme aweme = this.f69897b;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C52711k.m112236a((Object) awemeRawAd, "aweme?.awemeRawAd ?: return");
                C22317a a = C22317a.m55223a();
                C52711k.m112236a((Object) a, "AdDependManager.inst()");
                a.f60116c.mo46439c(getContext(), String.valueOf(awemeRawAd.getCreativeId().longValue()), "comment_sign", awemeRawAd.getLogExtra());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo54241b() {
        super.mo54241b();
        TextView textView = this.mCommentTimeView;
        C52711k.m112236a((Object) textView, "mCommentTimeView");
        textView.setVisibility(8);
        View view = this.mReplyContainer;
        C52711k.m112236a((Object) view, "mReplyContainer");
        view.setVisibility(8);
        ImageView imageView = this.mMenuItem;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TextView textView2 = this.mCommentTimeView;
        C52711k.m112236a((Object) textView2, "mCommentTimeView");
        textView2.setVisibility(8);
        this.mTitleView.setTextColor(this.f70213e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo54242c() {
        this.mContentView.setTextColor(this.f70214f);
        MentionTextView mentionTextView = this.mContentView;
        C52711k.m112236a((Object) mentionTextView, "mContentView");
        C26129j data = getData();
        C52711k.m112236a((Object) data, "data");
        mentionTextView.setText(data.getCommentInfo());
    }

    public SearchAdCommentView(Context context) {
        C52711k.m112240b(context, "context");
        this(context, null);
    }

    @C53771m
    public final void onAdCommentDiggEvent(C25708a aVar) {
        C52711k.m112240b(aVar, "event");
        mo54243d();
    }

    public final void onClick(View view) {
        if (!(view == null || getData() == null || this.f69897b == null)) {
            Aweme aweme = this.f69897b;
            C52711k.m112236a((Object) aweme, "aweme");
            if (aweme.isAd()) {
                Aweme aweme2 = this.f69897b;
                C52711k.m112236a((Object) aweme2, "aweme");
                AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                if (awemeRawAd == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) awemeRawAd, "aweme.awemeRawAd!!");
                int id = view.getId();
                if (id == R.id.b7f) {
                    C26129j data = getData();
                    C52711k.m112236a((Object) data, "data");
                    C26129j data2 = getData();
                    C52711k.m112236a((Object) data2, "data");
                    int i = 1;
                    if (data2.getUserDigged() == 1) {
                        i = 0;
                    }
                    data.setUserDigged(i);
                    mo54243d();
                    C22381a a = C22381a.m55385a();
                    String diggSpKey = getDiggSpKey();
                    C26129j data3 = getData();
                    C52711k.m112236a((Object) data3, "data");
                    a.mo46605b(diggSpKey, data3.getUserDigged());
                } else if (id == R.id.title || id == R.id.hi) {
                    mo54245f();
                    Context context = view.getContext();
                    C52711k.m112236a((Object) context, "view.context");
                    C22317a a2 = C22317a.m55223a();
                    C52711k.m112236a((Object) a2, "AdDependManager.inst()");
                    a2.f60116c.mo46435b(context, String.valueOf(awemeRawAd.getCreativeId().longValue()), "comment_sign", awemeRawAd.getLogExtra());
                } else {
                    if (id == R.id.x2 || id == R.id.zw || id == R.id.xl) {
                        if (!(this.f69898c == null || this.f69898c.get() == null)) {
                            Object obj = this.f69898c.get();
                            if (obj == null) {
                                C52711k.m112234a();
                            }
                            ((C22324a) obj).mo46459a(this, false, "search_ad_comment");
                        }
                        Context context2 = view.getContext();
                        C52711k.m112236a((Object) context2, "view.context");
                        C22317a a3 = C22317a.m55223a();
                        C52711k.m112236a((Object) a3, "AdDependManager.inst()");
                        a3.f60116c.mo46428a(context2, String.valueOf(awemeRawAd.getCreativeId().longValue()), "comment_sign", awemeRawAd.getLogExtra());
                    }
                }
            }
        }
    }

    public SearchAdCommentView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        this(context, attributeSet, 0);
    }

    public SearchAdCommentView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f70213e = context.getResources().getColor(R.color.a1o);
        this.f70214f = context.getResources().getColor(R.color.a1l);
    }
}
