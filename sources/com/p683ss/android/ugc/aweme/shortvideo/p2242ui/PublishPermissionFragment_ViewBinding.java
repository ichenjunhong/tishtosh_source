package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.Context;
import android.content.res.Resources;
import android.support.p030v4.content.C0726c;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.PublishPermissionFragment_ViewBinding */
public class PublishPermissionFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PublishPermissionFragment f113664a;

    /* renamed from: b */
    private View f113665b;

    /* renamed from: c */
    private View f113666c;

    /* renamed from: d */
    private View f113667d;

    public void unbind() {
        PublishPermissionFragment publishPermissionFragment = this.f113664a;
        if (publishPermissionFragment != null) {
            this.f113664a = null;
            publishPermissionFragment.mImgPermissionPrivate = null;
            publishPermissionFragment.mImgPermissionFriend = null;
            publishPermissionFragment.mImgPermissionOpen = null;
            publishPermissionFragment.permissionFriendLayout = null;
            publishPermissionFragment.permissionOpenLayout = null;
            publishPermissionFragment.permissionPrivateLayout = null;
            publishPermissionFragment.mTvPermissionOpen = null;
            publishPermissionFragment.mTvPermissionOpenText = null;
            this.f113665b.setOnClickListener(null);
            this.f113665b = null;
            this.f113666c.setOnClickListener(null);
            this.f113666c = null;
            this.f113667d.setOnClickListener(null);
            this.f113667d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PublishPermissionFragment_ViewBinding(final PublishPermissionFragment publishPermissionFragment, View view) {
        this.f113664a = publishPermissionFragment;
        publishPermissionFragment.mImgPermissionPrivate = (ImageView) Utils.findRequiredViewAsType(view, R.id.bx8, "field 'mImgPermissionPrivate'", ImageView.class);
        publishPermissionFragment.mImgPermissionFriend = (ImageView) Utils.findRequiredViewAsType(view, R.id.bx6, "field 'mImgPermissionFriend'", ImageView.class);
        publishPermissionFragment.mImgPermissionOpen = (ImageView) Utils.findRequiredViewAsType(view, R.id.bx7, "field 'mImgPermissionOpen'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.b8r, "field 'permissionFriendLayout' and method 'onClick'");
        publishPermissionFragment.permissionFriendLayout = (LinearLayout) Utils.castView(findRequiredView, R.id.b8r, "field 'permissionFriendLayout'", LinearLayout.class);
        this.f113665b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                publishPermissionFragment.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.b8s, "field 'permissionOpenLayout' and method 'onClick'");
        publishPermissionFragment.permissionOpenLayout = (LinearLayout) Utils.castView(findRequiredView2, R.id.b8s, "field 'permissionOpenLayout'", LinearLayout.class);
        this.f113666c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                publishPermissionFragment.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.b8t, "field 'permissionPrivateLayout' and method 'onClick'");
        publishPermissionFragment.permissionPrivateLayout = (LinearLayout) Utils.castView(findRequiredView3, R.id.b8t, "field 'permissionPrivateLayout'", LinearLayout.class);
        this.f113667d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                publishPermissionFragment.onClick(view);
            }
        });
        publishPermissionFragment.mTvPermissionOpen = (TextView) Utils.findRequiredViewAsType(view, R.id.ddj, "field 'mTvPermissionOpen'", TextView.class);
        publishPermissionFragment.mTvPermissionOpenText = (TextView) Utils.findRequiredViewAsType(view, R.id.ddk, "field 'mTvPermissionOpenText'", TextView.class);
        Context context = view.getContext();
        Resources resources = context.getResources();
        publishPermissionFragment.mImgSelected = C0726c.m2091a(context, (int) R.drawable.agb);
        publishPermissionFragment.mImgNormal = C0726c.m2091a(context, (int) R.drawable.fu);
        publishPermissionFragment.mTitle = resources.getString(R.string.d0y);
    }
}
