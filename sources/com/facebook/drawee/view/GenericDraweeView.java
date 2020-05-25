package com.facebook.drawee.view;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13834b;
import com.facebook.drawee.p940f.C13835c;
import com.facebook.imagepipeline.p976p.C14237b;

public class GenericDraweeView extends DraweeView<C13833a> {
    public GenericDraweeView(Context context) {
        super(context);
        inflateHierarchy(context, null);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflateHierarchy(context, attributeSet);
    }

    public GenericDraweeView(Context context, C13833a aVar) {
        super(context);
        setHierarchy(aVar);
    }

    /* access modifiers changed from: protected */
    public void inflateHierarchy(Context context, AttributeSet attributeSet) {
        if (C14237b.m29187b()) {
            C14237b.m29186a("GenericDraweeView#inflateHierarchy");
        }
        if (C14237b.m29187b()) {
            C14237b.m29186a("GenericDraweeHierarchyBuilder#inflateBuilder");
        }
        C13834b a = C13835c.m28109a(new C13834b(context.getResources()), context, attributeSet);
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
        setAspectRatio(a.f36089e);
        setHierarchy(a.mo25912a());
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflateHierarchy(context, attributeSet);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        inflateHierarchy(context, attributeSet);
    }
}
