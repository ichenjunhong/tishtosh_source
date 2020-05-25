package com.bytedance.android.live.broadcast.share;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.host.IHostShare;

public abstract class AbsStartLiveShareView extends LinearLayout implements OnClickListener {

    /* renamed from: a */
    protected String f10318a;

    /* renamed from: b */
    protected Activity f10319b;

    /* renamed from: c */
    protected IHostShare f10320c;

    /* renamed from: d */
    protected C3620a f10321d;

    /* renamed from: com.bytedance.android.live.broadcast.share.AbsStartLiveShareView$a */
    public interface C3620a {
        /* renamed from: a */
        void mo8899a(String str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8999a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo9001b();

    public AbsStartLiveShareView(Context context) {
        super(context);
    }

    public void onClick(View view) {
        this.f10321d.mo8899a(this.f10318a);
    }

    public AbsStartLiveShareView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo9000a(Activity activity, C3620a aVar) {
        this.f10319b = activity;
        this.f10321d = aVar;
        this.f10320c = (IHostShare) C4116c.m10249a(IHostShare.class);
        mo8999a();
        mo9001b();
    }

    public AbsStartLiveShareView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }
}
