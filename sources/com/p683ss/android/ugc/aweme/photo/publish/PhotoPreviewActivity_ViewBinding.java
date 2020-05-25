package com.p683ss.android.ugc.aweme.photo.publish;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.photo.publish.PhotoPreviewActivity_ViewBinding */
public class PhotoPreviewActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PhotoPreviewActivity f98414a;

    /* renamed from: b */
    private View f98415b;

    public void unbind() {
        PhotoPreviewActivity photoPreviewActivity = this.f98414a;
        if (photoPreviewActivity != null) {
            this.f98414a = null;
            photoPreviewActivity.mImageView = null;
            this.f98415b.setOnClickListener(null);
            this.f98415b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PhotoPreviewActivity_ViewBinding(final PhotoPreviewActivity photoPreviewActivity, View view) {
        this.f98414a = photoPreviewActivity;
        View findRequiredView = Utils.findRequiredView(view, R.id.bxv, "field 'mImageView' and method 'onClick'");
        photoPreviewActivity.mImageView = (ImageView) Utils.castView(findRequiredView, R.id.bxv, "field 'mImageView'", ImageView.class);
        this.f98415b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                photoPreviewActivity.onClick(view);
            }
        });
    }
}
