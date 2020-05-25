package com.p683ss.android.ugc.aweme.main.story.live.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.View.OnClickListener;
import com.p683ss.android.ugc.aweme.main.story.live.view.C36745a.C36746a;

/* renamed from: com.ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView */
public abstract class AbsLiveStoryItemView extends ConstraintLayout implements OnClickListener, C36745a {

    /* renamed from: h */
    protected String f93913h;

    /* renamed from: i */
    public String f93914i = "toplist_homepage_hot";

    /* renamed from: j */
    private View f93915j;
    protected C36746a mListener;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo53039a(Context context, boolean z);

    public View getRootView() {
        return this.f93915j;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mListener != null) {
            this.mListener.mo75848a();
        }
    }

    public void setListener(C36746a aVar) {
        this.mListener = aVar;
    }

    public void setRequestId(String str) {
        this.f93913h = str;
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.mListener != null) {
            this.mListener.mo75849a(i);
        }
    }

    public AbsLiveStoryItemView(Context context, boolean z) {
        super(context);
        this.f93915j = mo53039a(context, z);
        setOnClickListener(this);
        setVisibility(8);
    }
}
