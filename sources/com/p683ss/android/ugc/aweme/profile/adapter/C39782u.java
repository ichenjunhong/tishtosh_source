package com.p683ss.android.ugc.aweme.profile.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p669e.C10705c.C10707a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.u */
public final class C39782u extends C26840g<UrlModel> {

    /* renamed from: a */
    public C39783a f101536a;

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.u$a */
    public interface C39783a {
        /* renamed from: a */
        void mo80853a(UrlModel urlModel);
    }

    /* renamed from: a */
    public final int mo51179a(View view) {
        return (int) C9432q.m18687b(view.getContext(), 24.0f);
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        return new ProfileCoverViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.v0, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        boolean z;
        int i2;
        User curUser = C20902b.m53242a().getCurUser();
        int i3 = 0;
        if (!C9376b.m18558a((Collection<T>) curUser.getCoverUrls())) {
            z = TextUtils.equals(((UrlModel) this.f70670n.get(i)).getUri(), ((UrlModel) curUser.getCoverUrls().get(0)).getUri());
        } else {
            z = false;
        }
        ProfileCoverViewHolder profileCoverViewHolder = (ProfileCoverViewHolder) vVar;
        UrlModel urlModel = (UrlModel) this.f70670n.get(i);
        C39783a aVar = this.f101536a;
        C23515d.m57669a(profileCoverViewHolder.mCoverImage, urlModel);
        ImageView imageView = profileCoverViewHolder.mSelectedImage;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        TextView textView = profileCoverViewHolder.mUnselectedText;
        if (z) {
            i3 = 8;
        }
        textView.setVisibility(i3);
        profileCoverViewHolder.mSelectBtn.setOnTouchListener(new C10707a());
        profileCoverViewHolder.mSelectBtn.setOnClickListener(new C39784v(aVar, urlModel));
    }
}
