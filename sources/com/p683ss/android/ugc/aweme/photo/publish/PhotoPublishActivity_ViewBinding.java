package com.p683ss.android.ugc.aweme.photo.publish;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.photo.publish.PhotoPublishActivity_ViewBinding */
public class PhotoPublishActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PhotoPublishActivity f98421a;

    /* renamed from: b */
    private View f98422b;

    public void unbind() {
        if (this.f98421a != null) {
            this.f98421a = null;
            this.f98422b.setOnClickListener(null);
            this.f98422b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PhotoPublishActivity_ViewBinding(final PhotoPublishActivity photoPublishActivity, View view) {
        this.f98421a = photoPublishActivity;
        View findRequiredView = Utils.findRequiredView(view, R.id.ij, "method 'onClick'");
        this.f98422b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                photoPublishActivity.onClick(view);
            }
        });
    }
}
