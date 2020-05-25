package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.CategoryViewHolder_ViewBinding */
public class CategoryViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CategoryViewHolder f72836a;

    public void unbind() {
        CategoryViewHolder categoryViewHolder = this.f72836a;
        if (categoryViewHolder != null) {
            this.f72836a = null;
            categoryViewHolder.mIvType = null;
            categoryViewHolder.mTvTitle = null;
            categoryViewHolder.mTvType = null;
            categoryViewHolder.mTvCount = null;
            categoryViewHolder.mListView = null;
            categoryViewHolder.mRoot = null;
            categoryViewHolder.mViewStubPlaceHolder = null;
            categoryViewHolder.mViewDiscoverBg = null;
            categoryViewHolder.mCategoryCountView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CategoryViewHolder_ViewBinding(CategoryViewHolder categoryViewHolder, View view) {
        this.f72836a = categoryViewHolder;
        categoryViewHolder.mIvType = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.b55, "field 'mIvType'", RemoteImageView.class);
        categoryViewHolder.mTvTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.dhb, "field 'mTvTitle'", TextView.class);
        categoryViewHolder.mTvType = (TextView) Utils.findRequiredViewAsType(view, R.id.di0, "field 'mTvType'", TextView.class);
        categoryViewHolder.mTvCount = (TextView) Utils.findRequiredViewAsType(view, R.id.d8u, "field 'mTvCount'", TextView.class);
        categoryViewHolder.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cg7, "field 'mListView'", RecyclerView.class);
        categoryViewHolder.mRoot = Utils.findRequiredView(view, R.id.cfc, "field 'mRoot'");
        categoryViewHolder.mViewStubPlaceHolder = (ViewStub) Utils.findRequiredViewAsType(view, R.id.dt3, "field 'mViewStubPlaceHolder'", ViewStub.class);
        categoryViewHolder.mViewDiscoverBg = (ImageView) Utils.findRequiredViewAsType(view, R.id.a65, "field 'mViewDiscoverBg'", ImageView.class);
        categoryViewHolder.mCategoryCountView = Utils.findRequiredView(view, R.id.bb3, "field 'mCategoryCountView'");
    }
}
