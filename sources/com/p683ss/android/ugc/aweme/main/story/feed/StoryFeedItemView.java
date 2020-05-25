package com.p683ss.android.ugc.aweme.main.story.feed;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.mvvm.C23558a;
import com.p683ss.android.ugc.aweme.base.p1416g.C23533a;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarWithBorderView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23725l;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.main.story.feed.C36719c.C36726a;
import com.p683ss.android.ugc.aweme.story.C46637c;
import com.p683ss.android.ugc.aweme.story.model.Story;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.main.story.feed.StoryFeedItemView */
public class StoryFeedItemView implements C23558a<C36719c> {
    private static final int FOLLOWING_BORDER_NEW_COLOR = 2131821877;
    private static final int FOLLOWING_BORDER_READ_COLOR = 2131821929;
    private static final int INVALID_COLORS = 2131820803;
    private static final int LIVE_BORDER_COLOR = 2131821884;
    private static final int VALID_COLORS = 2131820805;
    private C23533a mAvatarDrawable;
    private View mFlBorderContainer;
    private ImageView mImgFollowingPlay;
    private boolean mIsBig;
    protected AvatarWithBorderView mIvAvatar;
    protected DmtTextView mIvLive;
    private View mLayout;
    private C36726a mStatusInView;
    private TextView mTvName;
    private View mView;
    private C36719c mViewModel;

    private void initListeners() {
    }

    public View getAndroidView() {
        return this.mView;
    }

    /* access modifiers changed from: protected */
    public int getItemLayout() {
        return R.layout.awu;
    }

    public C36719c getViewModel() {
        return this.mViewModel;
    }

    public Rect getIvAvatarRect() {
        return C23729p.m58268c((View) this.mIvAvatar);
    }

    public Context getContext() {
        return getAndroidView().getContext();
    }

    public void refresh() {
        if (this.mViewModel != null) {
            bind(this.mViewModel);
        }
    }

    /* access modifiers changed from: protected */
    public void initViews() {
        this.mAvatarDrawable = new C23533a();
        C23533a aVar = this.mAvatarDrawable;
        aVar.f62646b = C23728o.m58241a(1.5d);
        aVar.f62645a.setStrokeWidth((float) aVar.f62646b);
        View view = this.mFlBorderContainer;
        view.setLayerType(1, null);
        view.setDrawingCacheEnabled(false);
    }

    private void initReferences() {
        this.mLayout = this.mView.findViewById(R.id.ax_);
        this.mFlBorderContainer = this.mView.findViewById(R.id.agq);
        this.mIvAvatar = (AvatarWithBorderView) this.mView.findViewById(R.id.ay2);
        this.mTvName = (TextView) this.mView.findViewById(R.id.dcn);
        this.mIvLive = (DmtTextView) this.mView.findViewById(R.id.b1x);
        this.mImgFollowingPlay = (ImageView) this.mView.findViewById(R.id.as7);
    }

    public StoryFeedItemView(Context context) {
    }

    public void setIsBig(boolean z) {
        this.mIsBig = z;
    }

    private boolean isFollowingVideo(C36726a aVar) {
        if (aVar == C36726a.FOLLOWING_NEW || aVar == C36726a.FOLLOWING_READ) {
            return true;
        }
        return false;
    }

    private boolean isRead(C36726a aVar) {
        if (aVar == C36726a.READ || aVar == C36726a.FOLLOWING_READ) {
            return true;
        }
        return false;
    }

    public void bind(C36719c cVar) {
        int i;
        float f;
        int i2;
        int i3;
        String str;
        C36719c cVar2 = this.mViewModel;
        if (!(cVar2 == null || cVar2 == cVar || cVar2.mo48745a() != this)) {
            cVar2.mo48746a(null);
        }
        this.mViewModel = cVar;
        if (this.mViewModel.mo75821e() && C46637c.m101192a().mo93526a(this.mViewModel.mo75822f())) {
            this.mViewModel.mo75818a(C36726a.FOLLOWING_READ);
        }
        this.mViewModel.f93854d = this.mIsBig;
        cVar.mo48746a(this);
        this.mIvAvatar.setBackgroundDrawable(null);
        C23515d.m57676a((RemoteImageView) this.mIvAvatar, cVar.f93856f);
        C23729p.m58260a(this.mTvName, cVar.f93857g);
        AvatarWithBorderView avatarWithBorderView = this.mIvAvatar;
        OnClickListener onClickListener = cVar.f93858h;
        if (avatarWithBorderView != null) {
            avatarWithBorderView.setOnClickListener(onClickListener);
        }
        C36726a aVar = cVar.f93861k;
        if (aVar == C36726a.LIVE) {
            Story story = cVar.f93859i.mo75789a().f117676a;
            if (story.getUserInfo().getFollowStatus() == 0) {
                DmtTextView dmtTextView = this.mIvLive;
                if (C23725l.m58233a(story.skyLightDisplayTag)) {
                    str = getContext().getResources().getString(R.string.d4v);
                } else {
                    str = story.skyLightDisplayTag;
                }
                dmtTextView.setText(str);
            } else {
                this.mIvLive.setText(R.string.bx8);
            }
        }
        if (this.mStatusInView != aVar) {
            C36726a aVar2 = this.mStatusInView;
            this.mStatusInView = aVar;
            ImageView imageView = this.mImgFollowingPlay;
            int i4 = 8;
            if (isFollowingVideo(aVar)) {
                i = 0;
            } else {
                i = 8;
            }
            C23729p.m58257a((View) imageView, i);
            DmtTextView dmtTextView2 = this.mIvLive;
            if (aVar == C36726a.LIVE) {
                i4 = 0;
            }
            C23729p.m58257a((View) dmtTextView2, i4);
            switch (aVar) {
                case NEW:
                    this.mIvAvatar.setBorderColor(VALID_COLORS);
                    break;
                case FOLLOWING_NEW:
                    this.mIvAvatar.setBorderColor(FOLLOWING_BORDER_NEW_COLOR);
                    break;
                case FOLLOWING_READ:
                    this.mIvAvatar.setBorderColor(FOLLOWING_BORDER_READ_COLOR);
                    break;
                case LIVE:
                    this.mIvAvatar.setBorderColor(LIVE_BORDER_COLOR);
                    break;
                case DOWNLOADING:
                    C23533a aVar3 = this.mAvatarDrawable;
                    if (isFollowingVideo(aVar2)) {
                        i3 = FOLLOWING_BORDER_NEW_COLOR;
                    } else {
                        i3 = VALID_COLORS;
                    }
                    int[] iArr = {i3, i3};
                    if (!Arrays.equals(iArr, aVar3.f62648d)) {
                        aVar3.f62648d = iArr;
                        aVar3.mo48691a();
                    }
                    C23533a aVar4 = this.mAvatarDrawable;
                    aVar4.f62650f = false;
                    aVar4.f62649e = true;
                    aVar4.f62651g = false;
                    aVar4.invalidateSelf();
                    this.mIvAvatar.setBackgroundDrawable(this.mAvatarDrawable);
                    break;
                case READ:
                    this.mIvAvatar.setBorderColor(VALID_COLORS);
                    break;
            }
            boolean isRead = isRead(aVar2);
            boolean isRead2 = isRead(aVar);
            if (isRead != isRead2) {
                AvatarWithBorderView avatarWithBorderView2 = this.mIvAvatar;
                if (isRead2) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                avatarWithBorderView2.setAlpha(f);
                ImageView imageView2 = this.mImgFollowingPlay;
                if (isRead2) {
                    i2 = R.drawable.aw2;
                } else {
                    i2 = R.drawable.aw1;
                }
                imageView2.setImageResource(i2);
            }
        }
    }

    public StoryFeedItemView create(Context context, ViewGroup viewGroup) {
        this.mView = LayoutInflater.from(context).inflate(getItemLayout(), viewGroup, false);
        initReferences();
        initListeners();
        initViews();
        this.mView.setTag(R.id.aqy, this);
        return this;
    }
}
