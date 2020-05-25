package com.p683ss.android.ugc.aweme.photo.publish;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.PermissionSettingItem;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.photo.publish.PhotoPublishFragment_ViewBinding */
public class PhotoPublishFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PhotoPublishFragment f98436a;

    /* renamed from: b */
    private View f98437b;

    /* renamed from: c */
    private View f98438c;

    /* renamed from: d */
    private View f98439d;

    /* renamed from: e */
    private View f98440e;

    public void unbind() {
        PhotoPublishFragment photoPublishFragment = this.f98436a;
        if (photoPublishFragment != null) {
            this.f98436a = null;
            photoPublishFragment.mPermissionSettingItem = null;
            photoPublishFragment.mPhotoThumbView = null;
            photoPublishFragment.mLayoutSettingContainer = null;
            this.f98437b.setOnClickListener(null);
            this.f98437b = null;
            this.f98438c.setOnClickListener(null);
            this.f98438c = null;
            this.f98439d.setOnClickListener(null);
            this.f98439d = null;
            this.f98440e.setOnClickListener(null);
            this.f98440e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PhotoPublishFragment_ViewBinding(final PhotoPublishFragment photoPublishFragment, View view) {
        this.f98436a = photoPublishFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.bx9, "field 'mPermissionSettingItem' and method 'onClick'");
        photoPublishFragment.mPermissionSettingItem = (PermissionSettingItem) Utils.castView(findRequiredView, R.id.bx9, "field 'mPermissionSettingItem'", PermissionSettingItem.class);
        this.f98437b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                photoPublishFragment.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.ar6, "field 'mPhotoThumbView' and method 'onClick'");
        photoPublishFragment.mPhotoThumbView = (ImageView) Utils.castView(findRequiredView2, R.id.ar6, "field 'mPhotoThumbView'", ImageView.class);
        this.f98438c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                photoPublishFragment.onClick(view);
            }
        });
        photoPublishFragment.mLayoutSettingContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.b9m, "field 'mLayoutSettingContainer'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.ge, "method 'onClick'");
        this.f98439d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                photoPublishFragment.onClick(view);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.c6u, "method 'onClick'");
        this.f98440e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                photoPublishFragment.onClick(view);
            }
        });
    }
}
