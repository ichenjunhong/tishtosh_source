package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.RecommendFriendViewHolder_ViewBinding */
public class RecommendFriendViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RecommendFriendViewHolder f72938a;

    /* renamed from: b */
    private View f72939b;

    public void unbind() {
        RecommendFriendViewHolder recommendFriendViewHolder = this.f72938a;
        if (recommendFriendViewHolder != null) {
            this.f72938a = null;
            recommendFriendViewHolder.txtFindMore = null;
            recommendFriendViewHolder.txtInterested = null;
            recommendFriendViewHolder.recyclerView = null;
            this.f72939b.setOnClickListener(null);
            this.f72939b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RecommendFriendViewHolder_ViewBinding(final RecommendFriendViewHolder recommendFriendViewHolder, View view) {
        this.f72938a = recommendFriendViewHolder;
        View findRequiredView = Utils.findRequiredView(view, R.id.afw, "field 'txtFindMore' and method 'goAddFriends'");
        recommendFriendViewHolder.txtFindMore = (TextView) Utils.castView(findRequiredView, R.id.afw, "field 'txtFindMore'", TextView.class);
        this.f72939b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                recommendFriendViewHolder.goAddFriends();
            }
        });
        recommendFriendViewHolder.txtInterested = (TextView) Utils.findRequiredViewAsType(view, R.id.bx0, "field 'txtInterested'", TextView.class);
        recommendFriendViewHolder.recyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.c_6, "field 'recyclerView'", RecyclerView.class);
    }
}
