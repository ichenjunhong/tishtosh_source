package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.arch.lifecycle.C0199s;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedLiveWindowView */
public class FeedLiveWindowView extends C31009h implements C0199s<C23274a> {

    /* renamed from: a */
    private boolean f80415a;
    RemoteImageView mCoverIv;
    DmtTextView mTagView;
    public FrameLayout mVideoContainer;

    /* renamed from: a */
    public final void mo49781a() {
        this.f80415a = false;
    }

    public void clickClose() {
        this.f81197q.mo48228a("dismiss_live_window", (Object) Boolean.valueOf(true));
    }

    /* renamed from: i */
    public final void mo63327i() {
        super.mo63327i();
        if (this.f81192l != null && this.f81192l.getAuthor() != null) {
            UrlModel avatarLarger = this.f81192l.getAuthor().getAvatarLarger();
            if (avatarLarger != null) {
                this.mCoverIv.post(new C30752ah(this, avatarLarger));
            }
        }
    }

    public void clickWindow() {
        if (this.f81192l != null && !this.f80415a) {
            User author = this.f81192l.getAuthor();
            if (author != null) {
                this.f81197q.mo48228a("live_window_clicked", (Object) Boolean.valueOf(true));
                Bundle bundle = new Bundle();
                bundle.putString("live.intent.extra.ENTER_AWEME_ID", this.f81192l.getAid());
                C36173w.m81665a().getLiveWatcherUtils().mo70095a(this.f81198r, author, this.f81193m, "live_window", bundle);
            }
        }
    }

    public FeedLiveWindowView(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
        dataCenter.mo48226a("live_has_end", (C0199s<C23274a>) this);
    }

    /* renamed from: a */
    public final void mo58323a(VideoItemParams videoItemParams) {
        super.mo58323a(videoItemParams);
    }

    public /* synthetic */ void onChanged(Object obj) {
        C23274a aVar = (C23274a) obj;
        if (aVar != null && TextUtils.equals(aVar.f62242a, "live_has_end")) {
            Boolean bool = (Boolean) aVar.mo48246a();
            if (bool != null && bool.booleanValue()) {
                this.f80415a = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49783a(View view) {
        View view2 = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f81198r, R.layout.b_8);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        ButterKnife.bind((Object) this, view2);
        if (C47842ed.m103485a(view.getContext())) {
            this.mTagView.setBackgroundResource(R.drawable.cvu);
        } else {
            this.mTagView.setBackgroundResource(R.drawable.cvt);
        }
    }
}
