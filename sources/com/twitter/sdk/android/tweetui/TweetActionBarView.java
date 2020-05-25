package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.ss.android.ugc.trill.R;
import com.twitter.sdk.android.core.C52068b;
import com.twitter.sdk.android.core.models.C52209m;

public class TweetActionBarView extends LinearLayout {

    /* renamed from: a */
    final C52262a f130126a;

    /* renamed from: b */
    ToggleImageButton f130127b;

    /* renamed from: c */
    ImageButton f130128c;

    /* renamed from: d */
    C52068b<C52209m> f130129d;

    /* renamed from: com.twitter.sdk.android.tweetui.TweetActionBarView$a */
    static class C52262a {
        C52262a() {
        }

        /* renamed from: a */
        static C52312r m111686a() {
            return C52312r.m111747a();
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f130127b = (ToggleImageButton) findViewById(R.id.djp);
        this.f130128c = (ImageButton) findViewById(R.id.djs);
    }

    /* access modifiers changed from: 0000 */
    public void setOnActionCallback(C52068b<C52209m> bVar) {
        this.f130129d = bVar;
    }

    /* access modifiers changed from: 0000 */
    public void setTweet(C52209m mVar) {
        setLike(mVar);
        setShare(mVar);
    }

    public TweetActionBarView(Context context) {
        this(context, null, new C52262a());
    }

    /* access modifiers changed from: 0000 */
    public void setLike(C52209m mVar) {
        C52312r a = C52262a.m111686a();
        if (mVar != null) {
            this.f130127b.setToggledOn(mVar.f129967g);
            this.f130127b.setOnClickListener(new C52267e(mVar, a, this.f130129d));
        }
    }

    /* access modifiers changed from: 0000 */
    public void setShare(C52209m mVar) {
        C52312r a = C52262a.m111686a();
        if (mVar != null) {
            this.f130128c.setOnClickListener(new C52305m(mVar, a));
        }
    }

    public TweetActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new C52262a());
    }

    TweetActionBarView(Context context, AttributeSet attributeSet, C52262a aVar) {
        super(context, attributeSet);
        this.f130126a = aVar;
    }
}
