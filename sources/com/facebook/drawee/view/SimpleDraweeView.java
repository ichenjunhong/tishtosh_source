package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p920d.C13691k;
import com.facebook.common.p927k.C13731f;
import com.facebook.drawee.p936c.C13786b;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p976p.C14237b;
import com.ss.android.ugc.trill.R;

public class SimpleDraweeView extends GenericDraweeView {
    private static C13691k<? extends C13786b> sDraweecontrollerbuildersupplier;
    private C13786b mControllerBuilder;

    /* access modifiers changed from: protected */
    public C13786b getControllerBuilder() {
        return this.mControllerBuilder;
    }

    public static void initialize(C13691k<? extends C13786b> kVar) {
        sDraweecontrollerbuildersupplier = kVar;
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    public SimpleDraweeView(Context context) {
        super(context);
        init(context, null);
    }

    public void setActualImageResource(int i) {
        setActualImageResource(i, null);
    }

    public void setImageURI(Uri uri) {
        setImageURI(uri, (Object) null);
    }

    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setVisible(true, false);
        }
    }

    public void setImageURI(String str) {
        setImageURI(str, (Object) null);
    }

    public void setImageRequest(C14229b bVar) {
        setController(this.mControllerBuilder.mo25757b(bVar).mo25759b(getController()).mo25763d());
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public void setActualImageResource(int i, Object obj) {
        setImageURI(C13731f.m27775a(i), obj);
    }

    public void setImageURI(Uri uri, Object obj) {
        setController(this.mControllerBuilder.mo25753a(obj).mo25725b(uri).mo25759b(getController()).mo25763d());
    }

    public void setImageURI(String str, Object obj) {
        Uri uri;
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        setImageURI(uri, obj);
    }

    public SimpleDraweeView(Context context, C13833a aVar) {
        super(context, aVar);
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        try {
            if (C14237b.m29187b()) {
                C14237b.m29186a("SimpleDraweeView#init");
            }
            if (isInEditMode()) {
                ((C13833a) getHierarchy()).mo25899a((C13837e) null);
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                C13689i.m27653a(sDraweecontrollerbuildersupplier, (Object) "SimpleDraweeView was not initialized!");
                this.mControllerBuilder = (C13786b) sDraweecontrollerbuildersupplier.mo23157b();
            }
            if (attributeSet != null) {
                obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a8, R.attr.a9, R.attr.a_, R.attr.bv, R.attr.lj, R.attr.ll, R.attr.lm, R.attr.v2, R.attr.vm, R.attr.vn, R.attr.vx, R.attr.w8, R.attr.w9, R.attr.w_, R.attr.ye, R.attr.yf, R.attr.zz, R.attr.a00, R.attr.a01, R.attr.a02, R.attr.a03, R.attr.a05, R.attr.a06, R.attr.a07, R.attr.a08, R.attr.a09, R.attr.a0h, R.attr.a0j, R.attr.a0k, R.attr.a0l, R.attr.a_l});
                if (obtainStyledAttributes.hasValue(2)) {
                    setImageURI(Uri.parse(obtainStyledAttributes.getString(2)), (Object) null);
                } else if (obtainStyledAttributes.hasValue(0)) {
                    int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                    if (resourceId != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                }
                obtainStyledAttributes.recycle();
            }
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        } catch (Throwable th) {
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
            throw th;
        }
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context, attributeSet);
    }
}
