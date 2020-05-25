package com.p683ss.android.ugc.aweme.discover.adapter;

import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.p683ss.android.ugc.aweme.discover.mob.helpers.SearchSugMobHelper;
import com.p683ss.android.ugc.aweme.discover.model.SearchSugEntity;
import com.p683ss.android.ugc.aweme.discover.p1651i.p1652a.C28238a;
import com.p683ss.android.ugc.aweme.discover.widget.SugCompletionView;
import com.p683ss.android.ugc.aweme.discover.widget.SugCompletionView.C28975a;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchSugViewHolder */
public class SearchSugViewHolder extends C1352v {

    /* renamed from: a */
    public long f72978a;

    /* renamed from: b */
    public C28238a f72979b;

    /* renamed from: c */
    SearchSugEntity f72980c;

    /* renamed from: d */
    int f72981d;

    /* renamed from: e */
    SearchSugMobHelper f72982e;

    /* renamed from: f */
    private C28975a f72983f;
    View mBottomDivider;
    ImageView mIvSearchIcon;
    SugCompletionView mIvSugCompletion;
    TextView mSugView;

    public SearchSugViewHolder(View view, C28238a aVar, C28975a aVar2) {
        super(view);
        this.f72979b = aVar;
        this.f72983f = aVar2;
        ButterKnife.bind((Object) this, view);
        this.mIvSugCompletion.setOnClickListener(new C27878bk(this));
        this.mIvSugCompletion.setVisibility(0);
        this.mIvSugCompletion.setKeyboardDismissHandler(this.f72983f);
        Context context = this.itemView.getContext();
        if (context instanceof FragmentActivity) {
            this.f72982e = (SearchSugMobHelper) C0214z.m440a((FragmentActivity) context).mo359a(SearchSugMobHelper.class);
        }
    }
}
