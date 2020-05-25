package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.common.utility.C9432q;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;

/* renamed from: com.ss.android.ugc.aweme.views.WrapContentRemoteImageView */
public class WrapContentRemoteImageView extends RemoteImageView {

    /* renamed from: a */
    private final C13791d f121188a;

    /* renamed from: a */
    public final void mo48929a() {
        super.mo48929a();
        if (VERSION.SDK_INT >= 21) {
            setOutlineProvider(new ViewOutlineProvider() {
                public final void getOutline(View view, Outline outline) {
                    float aspectRatio = WrapContentRemoteImageView.this.getAspectRatio();
                    float height = (float) WrapContentRemoteImageView.this.getHeight();
                    float width = (float) WrapContentRemoteImageView.this.getWidth();
                    if (height != 0.0f) {
                        float f = height * aspectRatio;
                        float f2 = (width - f) / 2.0f;
                        outline.setRoundRect((int) f2, 0, (int) (f2 + f), WrapContentRemoteImageView.this.getBottom(), C9432q.m18687b(WrapContentRemoteImageView.this.getContext(), 4.3f));
                    }
                }
            });
            setClipToOutline(true);
        }
    }

    public WrapContentRemoteImageView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo95597a(C14045f fVar) {
        if (VERSION.SDK_INT < 21) {
            getLayoutParams().width = (getLayoutParams().height * fVar.getWidth()) / fVar.getHeight();
            requestLayout();
        } else if (fVar != null) {
            setAspectRatio(((float) fVar.getWidth()) / ((float) fVar.getHeight()));
            if (VERSION.SDK_INT >= 21) {
                invalidateOutline();
            }
        }
    }

    /* renamed from: b */
    public final void mo95599b(C14045f fVar) {
        if (VERSION.SDK_INT < 21) {
            getLayoutParams().height = (getLayoutParams().width * fVar.getHeight()) / fVar.getWidth();
            requestLayout();
        } else if (fVar != null) {
            setAspectRatio(((float) fVar.getWidth()) / ((float) fVar.getHeight()));
            if (VERSION.SDK_INT >= 21) {
                invalidateOutline();
            }
        }
    }

    public WrapContentRemoteImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setImageURI(Uri uri, Object obj) {
        setController(((C13773e) ((C13773e) ((C13773e) ((C13773e) getControllerBuilder()).mo25751a(this.f121188a)).mo25753a(obj)).mo25725b(uri).mo25759b(getController())).mo25763d());
    }

    public WrapContentRemoteImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121188a = new C13790c<C14045f>() {
            public final /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
                WrapContentRemoteImageView.this.mo95597a((C14045f) obj);
            }

            public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                WrapContentRemoteImageView.this.mo95597a((C14045f) obj);
            }
        };
    }

    /* renamed from: a */
    public final void mo95598a(String str, Object obj, C13791d<C14045f> dVar) {
        Uri uri;
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        setController(((C13773e) ((C13773e) ((C13773e) ((C13773e) getControllerBuilder()).mo25751a(dVar)).mo25753a((Object) null)).mo25725b(uri).mo25759b(getController())).mo25763d());
    }
}
