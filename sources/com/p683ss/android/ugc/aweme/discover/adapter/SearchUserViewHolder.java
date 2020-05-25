package com.p683ss.android.ugc.aweme.discover.adapter;

import android.arch.lifecycle.C0199s;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerifyAndLive;
import com.p683ss.android.ugc.aweme.base.utils.C23710a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.model.C26110ae;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26401at;
import com.p683ss.android.ugc.aweme.discover.abtest.SearchUserStyleExperiment;
import com.p683ss.android.ugc.aweme.discover.alading.C28037g;
import com.p683ss.android.ugc.aweme.discover.alading.C28039i;
import com.p683ss.android.ugc.aweme.discover.mixfeed.p1656c.C28310a;
import com.p683ss.android.ugc.aweme.discover.mixfeed.p1656c.C28310a.C28311a;
import com.p683ss.android.ugc.aweme.discover.model.SearchUser;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28634cf;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30828c;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LiveCircleView;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31984a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31988e;
import com.p683ss.android.ugc.aweme.following.p1770ui.adapter.C32112c;
import com.p683ss.android.ugc.aweme.following.p1770ui.view.FollowUserBtn;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.p1487c.C24478a;
import com.p683ss.android.ugc.aweme.p1487c.C24479b;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.C40733z;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.util.C40536aj;
import com.p683ss.android.ugc.aweme.search.C41405b;
import com.p683ss.android.ugc.aweme.search.performance.C41443a;
import com.p683ss.android.ugc.aweme.search.performance.C41457i;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.story.live.C46641d;
import com.p683ss.android.ugc.aweme.userservice.C47588a;
import com.p683ss.android.ugc.aweme.userservice.api.C47590b;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchUserViewHolder */
public class SearchUserViewHolder extends C27849b implements C0199s<FollowStatus>, OnClickListener {
    ViewStub adCardLinkStub;

    /* renamed from: c */
    View f72989c;
    ViewStub cardViewStub;

    /* renamed from: d */
    User f72990d;

    /* renamed from: e */
    public C26110ae f72991e;

    /* renamed from: f */
    C24479b f72992f;

    /* renamed from: g */
    ViewGroup f72993g;

    /* renamed from: h */
    ViewGroup f72994h;

    /* renamed from: i */
    C28037g f72995i;

    /* renamed from: j */
    C32112c f72996j;

    /* renamed from: k */
    private final boolean f72997k;

    /* renamed from: l */
    private C30828c f72998l;

    /* renamed from: m */
    private C24479b f72999m;
    FollowUserBtn mBtnFollow;
    AvatarImageWithVerifyAndLive mIvAvator;
    LiveCircleView mLiveCircle;
    TextView mLiveNewTag;
    FrameLayout mLiveNewTagLayout;
    ImageView mLiveTag;
    ViewStub mMusicianCardStub;
    TextView mTvAwemeId;
    TextView mTvDesc;
    TextView mTvFansCnt;
    TextView mTvRecommendReason;
    TextView mTvUsername;

    /* renamed from: n */
    private SearchUser f73000n;

    /* renamed from: o */
    private SparseArray<C24479b> f73001o;

    /* renamed from: p */
    private TextView f73002p;

    /* renamed from: q */
    private int f73003q;

    /* renamed from: r */
    private C31980a f73004r;

    /* renamed from: s */
    private C47590b f73005s;

    /* renamed from: d */
    public final View mo56209d() {
        return this.itemView;
    }

    /* renamed from: G */
    private void m66488G() {
        this.mIvAvator.mo48964b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo56219h() {
        m66492a("click_follow_button");
    }

    /* renamed from: k */
    private void m66496k() {
        if (this.f72999m != null) {
            this.f72999m.mo50247a();
        }
    }

    /* renamed from: t */
    private boolean m66505t() {
        if (C47915gg.m103651b()) {
            return true;
        }
        return this.f72997k;
    }

    /* renamed from: g */
    public final String mo56218g() {
        if (this.f73167b == null || !this.f73167b.f73038a) {
            return "search_result";
        }
        return "general_search";
    }

    /* renamed from: B */
    private String m66483B() {
        try {
            return C36173w.m81665a().getLive().mo15061n().mo15022a(this.itemView.getContext());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: C */
    private static boolean m66484C() {
        try {
            return C36173w.m81665a().getLive().mo15062o().mo15065a();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: F */
    private void m66487F() {
        if (m66484C()) {
            this.mLiveNewTag.setVisibility(8);
            this.mLiveNewTagLayout.setVisibility(8);
        } else {
            this.mIvAvator.mo48975a(false);
        }
        this.mLiveCircle.setVisibility(8);
    }

    /* renamed from: m */
    private void m66498m() {
        if (m66505t()) {
            this.mBtnFollow.setVisibility(8);
            m66499n();
            return;
        }
        this.f73004r.mo65173a(this.f72990d);
    }

    /* renamed from: n */
    private void m66499n() {
        if (this.f72990d != null && this.f73005s != null) {
            this.f73005s.mo94911b().removeObserver(this);
            this.f73005s.mo94911b().observe(mo56273c(), this);
        }
    }

    /* renamed from: q */
    private void m66502q() {
        if (this.f72991e != null && this.f72991e.brandInfo != null) {
            C26401at.m63860a(this.mTvUsername, this.f72991e.brandInfo, 4);
        }
    }

    /* renamed from: A */
    private String m66482A() {
        int followStatus = this.f72990d.getFollowStatus();
        if (followStatus == 1) {
            return this.itemView.getContext().getResources().getString(R.string.b55);
        }
        if (followStatus == 2) {
            return this.itemView.getContext().getResources().getString(R.string.as8);
        }
        return "";
    }

    /* renamed from: D */
    private void m66485D() {
        String str;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from_merge", "general_search");
            String str2 = "is_english";
            if ("LIVE".equals(m66483B())) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put(str2, str);
            C36173w.m81665a().getLive().mo15061n().mo15023a("livesdk_live_show_language", hashMap, new Object[0]);
        } catch (Exception unused) {
        }
    }

    /* renamed from: E */
    private void m66486E() {
        if (m66484C()) {
            this.mLiveNewTag.setText(m66483B());
            this.mLiveNewTagLayout.setVisibility(0);
            this.mLiveNewTag.setVisibility(0);
            this.mIvAvator.mo48975a(false);
            m66485D();
        } else {
            this.mIvAvator.mo48975a(true);
            this.mLiveNewTag.setVisibility(8);
            this.mLiveNewTagLayout.setVisibility(8);
        }
        this.mLiveCircle.setVisibility(0);
    }

    /* renamed from: H */
    private String m66489H() {
        if (this.f73000n == null) {
            return "person";
        }
        if (!C9376b.m18558a((Collection<T>) this.f73000n.musicCards)) {
            return "musician";
        }
        if (!C9376b.m18558a((Collection<T>) this.f73000n.awemeCards)) {
            return "hot_user";
        }
        return "person";
    }

    /* renamed from: i */
    private void m66494i() {
        if (this.f72991e == null) {
            return;
        }
        if (this.f72991e.adType == 3 || this.f72991e.adType == 4) {
            C25945k.m62911b().mo53140d(mo56271b(), String.valueOf(this.f72991e.f68945id), "card", this.f72991e.logExtra);
        }
    }

    /* renamed from: o */
    private void m66500o() {
        UserVerify userVerify;
        if (this.f72990d != null) {
            userVerify = new UserVerify(this.f72990d.getAvatarThumb(), this.f72990d.getCustomVerify(), this.f72990d.getEnterpriseVerifyReason(), Integer.valueOf(this.f72990d.getVerificationType()), this.f72990d.getWeiboVerify());
        } else {
            userVerify = null;
        }
        this.mIvAvator.setUserData(userVerify);
        m66491a(this.f72990d);
        m66488G();
    }

    /* renamed from: s */
    private void m66504s() {
        SpannableString spannableString;
        if (C47915gg.m103672u(this.f72990d)) {
            spannableString = m66509x();
        } else {
            spannableString = m66507v();
        }
        if (this.f72997k) {
            this.mTvAwemeId.setText(spannableString);
            return;
        }
        this.mTvAwemeId.setText(spannableString);
        this.mTvFansCnt.setVisibility(0);
        this.mTvFansCnt.setText(m66510y());
    }

    /* renamed from: w */
    private SpannableString m66508w() {
        String str;
        if (TextUtils.isEmpty(this.f72990d.getUniqueId())) {
            str = this.f72990d.getShortId();
        } else {
            str = this.f72990d.getUniqueId();
        }
        return C23710a.m58189a(this.itemView.getContext(), str, this.f73000n.uniqidPosition);
    }

    /* renamed from: x */
    private SpannableString m66509x() {
        if (!TextUtils.isEmpty(this.f72990d.getRemarkName())) {
            return C23710a.m58189a(this.mIvAvator.getContext(), this.f72990d.getRemarkName(), this.f73000n.remarkPosition);
        }
        return C23710a.m58189a(this.mIvAvator.getContext(), this.f72990d.getNickname(), this.f73000n.position);
    }

    /* renamed from: y */
    private String m66510y() {
        String a = C33095b.m76068a((long) this.f72990d.getFollowerCount());
        String string = this.itemView.getContext().getResources().getString(R.string.b57);
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(" ");
        sb.append(string);
        return sb.toString();
    }

    /* renamed from: z */
    private String m66511z() {
        String a = C33095b.m76068a((long) this.f72990d.getAwemeCount());
        String string = this.itemView.getContext().getResources().getString(R.string.fci);
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(" ");
        sb.append(string);
        return sb.toString();
    }

    /* renamed from: j */
    private void m66495j() {
        String str;
        if (this.f73000n == null || C9376b.m18558a((Collection<T>) this.f73000n.musicCards)) {
            m66496k();
            return;
        }
        if (this.f72999m == null) {
            this.f72999m = C41405b.m91220a(this.mMusicianCardStub, this.f73000n);
        }
        if (this.f72999m instanceof C24478a) {
            C24478a aVar = (C24478a) this.f72999m;
            C28311a newBuilder = C28310a.newBuilder();
            if (this.f73000n.user != null) {
                str = this.f73000n.user.getUid();
            } else {
                str = "";
            }
            aVar.mo50246a(newBuilder.mo56720a(str).mo56719a(this.f73000n.rank).mo56722b("musician").mo56723c(this.f73167b.mo56235b()).mo56721a());
        }
        if (this.f72999m != null) {
            this.f72999m.mo50248a(this.f73000n, this.f72991e);
        }
    }

    /* renamed from: v */
    private SpannableString m66507v() {
        String str;
        if (TextUtils.isEmpty(this.f72990d.getUniqueId())) {
            str = this.f72990d.getShortId();
        } else {
            str = this.f72990d.getUniqueId();
        }
        String a = C28634cf.m67893a(this.itemView.getContext());
        int indexOf = a.indexOf("%1");
        if (indexOf == -1) {
            indexOf = 0;
        }
        return C23710a.m58190a(this.itemView.getContext(), C2240a.m6772a(a, new Object[]{str}), this.f73000n.uniqidPosition, indexOf);
    }

    /* renamed from: e */
    public final Map<String, String> mo56210e() {
        String str;
        Map<String, String> e = super.mo56210e();
        if (e != null) {
            String H = m66489H();
            if (TextUtils.equals(H, "hot_user")) {
                e.put("user_name", this.f73000n.user.getUniqueId());
            }
            e.put("token_type", H);
            e.put("search_result_id", this.f73000n.user.getUid());
            String str2 = "is_aladdin";
            if (this.f73000n.isAladdin()) {
                str = "1";
            } else {
                str = "0";
            }
            e.put(str2, str);
        }
        return e;
    }

    /* renamed from: f */
    public final Map<String, String> mo56211f() {
        String str;
        Map<String, String> f = super.mo56211f();
        if (f != null) {
            String H = m66489H();
            if (TextUtils.equals(H, "hot_user")) {
                f.put("user_name", this.f73000n.user.getUniqueId());
            }
            f.put("token_type", H);
            f.put("search_result_id", this.f73000n.user.getUid());
            String str2 = "is_aladdin";
            if (this.f73000n.isAladdin()) {
                str = "1";
            } else {
                str = "0";
            }
            f.put(str2, str);
        }
        return f;
    }

    /* renamed from: l */
    private void m66497l() {
        if (this.f72993g == null) {
            this.f72993g = (ViewGroup) this.adCardLinkStub.inflate();
        }
        this.f72989c = this.f72993g.findViewById(R.id.dwm);
        this.f72989c.setOnClickListener(null);
        this.f72994h.setPadding(0, 0, 0, 0);
        this.f73002p = (TextView) this.f72993g.findViewById(R.id.dwl);
        if (!TextUtils.isEmpty(this.f72991e.title)) {
            this.f73002p.setText(this.f72991e.title);
            this.f73002p.setOnClickListener(new C27883bo(this));
            this.f73002p.setVisibility(0);
            C25945k.m62911b().mo53125a(mo56271b(), String.valueOf(this.f72991e.f68945id), "link", this.f72991e.logExtra);
            C25945k.m62912c().mo53496b(this.f72991e.trackUrlList, this.f72991e.f68945id, this.f72991e.logExtra);
            this.f72993g.setVisibility(0);
        }
    }

    /* renamed from: p */
    private void m66501p() {
        UserVerify userVerify;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (C47915gg.m103672u(this.f72990d)) {
            spannableStringBuilder.append(m66508w());
        } else {
            spannableStringBuilder.append(m66509x());
        }
        if (this.f72990d != null) {
            userVerify = new UserVerify(null, this.f72990d.getCustomVerify(), this.f72990d.getEnterpriseVerifyReason(), Integer.valueOf(-1), null);
        } else {
            userVerify = null;
        }
        if (C47916gh.m103676a(userVerify)) {
            String str = " T";
            spannableStringBuilder.append(str);
            spannableStringBuilder.setSpan(new C40536aj(mo56271b(), R.drawable.d0p, 1), (spannableStringBuilder.length() - str.length()) + 1, spannableStringBuilder.length(), 17);
        }
        if (this.f72997k && !TextUtils.isEmpty(m66482A())) {
            spannableStringBuilder.append(" · ");
            SpannableString spannableString = new SpannableString(m66482A());
            spannableString.setSpan(new ForegroundColorSpan(C0726c.m2098c(this.itemView.getContext(), R.color.a1a)), 0, spannableString.length(), 33);
            spannableString.setSpan(new AbsoluteSizeSpan(14, true), 0, spannableString.length(), 33);
            spannableStringBuilder.append(spannableString);
        }
        this.mTvUsername.setText(spannableStringBuilder);
        this.f72990d.getStarBillboardRank();
        mo56218g();
        m66502q();
    }

    /* renamed from: r */
    private void m66503r() {
        this.mTvDesc.setVisibility(0);
        this.mTvDesc.setCompoundDrawables(null, null, null, null);
        this.mTvDesc.setCompoundDrawablePadding(0);
        if (this.f72997k) {
            StringBuilder sb = new StringBuilder();
            sb.append(m66510y());
            sb.append(" · ");
            sb.append(m66511z());
            this.mTvDesc.setText(sb.toString());
        } else if (!TextUtils.isEmpty(this.f72990d.getRemarkName())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            this.mTvDesc.setText(spannableStringBuilder.append(new SpannableString(C23729p.m58270d(mo56209d()).getString(R.string.b50))).append(C23710a.m58189a(this.mIvAvator.getContext(), this.f72990d.getNickname(), this.f73000n.position)));
        } else if (TextUtils.isEmpty(this.f72990d.getSignature())) {
            this.mTvDesc.setVisibility(8);
        } else {
            this.mTvDesc.setText(this.f72990d.getSignature());
        }
    }

    /* renamed from: u */
    private void m66506u() {
        if (TextUtils.isEmpty(this.f72990d.getRecommendReason())) {
            this.mTvRecommendReason.setVisibility(8);
            return;
        }
        Drawable drawable = this.mTvRecommendReason.getContext().getResources().getDrawable(R.drawable.ad9);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        drawable.setAlpha(128);
        if (this.mTvDesc.getVisibility() != 0) {
            this.mTvRecommendReason.setVisibility(8);
            this.mTvDesc.setVisibility(0);
            this.mTvDesc.setCompoundDrawablePadding(C23728o.m58241a(2.0d));
            this.mTvDesc.setCompoundDrawables(drawable, null, null, null);
            this.mTvDesc.setText(this.f72990d.getRecommendReason());
            return;
        }
        this.mTvRecommendReason.setVisibility(0);
        this.mTvRecommendReason.setCompoundDrawablePadding(C23728o.m58241a(2.0d));
        this.mTvRecommendReason.setCompoundDrawables(drawable, null, null, null);
        this.mTvRecommendReason.setText(this.f72990d.getRecommendReason());
    }

    /* renamed from: a */
    private void m66492a(String str) {
        String str2;
        Map f = mo56211f();
        if (f != null) {
            String str3 = "is_aladdin";
            if (this.f73000n.isAladdin()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            f.put(str3, str2);
            f.put("aladdin_button_type", str);
            f.put("token_type", m66489H());
            mo56272b(f);
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        FollowStatus followStatus = (FollowStatus) obj;
        if (followStatus != null && this.f72990d != null && TextUtils.equals(followStatus.userId, this.f72990d.getUid())) {
            int followStatus2 = this.f72990d.getFollowStatus();
            this.f72990d.setFollowStatus(followStatus.followStatus);
            if (followStatus2 != followStatus.followStatus) {
                m66501p();
            }
        }
    }

    /* renamed from: a */
    private void m66491a(User user) {
        if (this.f72998l == null) {
            this.f72998l = new C30828c(true, this.mIvAvator, this.mIvAvator, this.mLiveCircle);
        }
        if (user != null) {
            this.f72998l.mo63563a(user, getClass(), null);
            if (BusinessComponentServiceUtils.getLiveAllService().mo74807a(user)) {
                C46641d.m101215a(user.getUid(), user.roomId, mo56218g(), "others_photo", user.getRequestId(), -1, "");
                m66486E();
                return;
            }
            m66487F();
        }
    }

    /* renamed from: b */
    private C24479b m66493b(SearchUser searchUser) {
        if (this.f72992f != null && this.f72992f.mo50249a(searchUser)) {
            return this.f72992f;
        }
        int cardType = searchUser.cardType();
        this.f72992f = (C24479b) this.f73001o.get(cardType);
        if (this.f72992f != null && this.f72992f.mo50249a(searchUser)) {
            return this.f72992f;
        }
        C28037g gVar = this.f72995i;
        C28039i iVar = null;
        if (searchUser.cardType() == 1) {
            iVar = new C28039i(gVar);
        }
        this.f72992f = iVar;
        this.f73001o.put(cardType, this.f72992f);
        return this.f72992f;
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C32800a.m75679a(view)) {
            if (this.f72991e != null && (this.f72991e.adType == 3 || this.f72991e.adType == 4)) {
                C25945k.m62911b().mo53138c(mo56271b(), String.valueOf(this.f72991e.f68945id), "card", this.f72991e.logExtra);
            }
            m66492a("click_info");
            if (view.getId() != R.id.ay2 || !BusinessComponentServiceUtils.getLiveAllService().mo74807a(this.f72990d)) {
                this.f72996j.mo56497a(this.f72990d, getAdapterPosition());
            } else {
                C36173w.m81665a().getLiveWatcherUtils().mo70094a(view.getContext(), this.f72990d, mo56218g());
            }
        }
    }

    /* renamed from: a */
    public final void mo56217a(SearchUser searchUser) {
        if (searchUser != null && searchUser.user != null) {
            this.f73000n = searchUser;
            this.f72990d = searchUser.user;
            m66501p();
            m66504s();
            m66503r();
            m66506u();
            m66500o();
            m66498m();
            m66494i();
            int cardType = searchUser.cardType();
            int i = 0;
            if (!(cardType == 0 || this.f72991e == null || this.f72991e.adType != 4)) {
                cardType = 0;
            }
            if (cardType != 0) {
                if (this.f72994h == null) {
                    this.cardViewStub.setLayoutResource(R.layout.bsx);
                    this.cardViewStub.setLayoutInflater(new C41443a(this.cardViewStub.getContext()));
                    this.f72994h = (ViewGroup) this.cardViewStub.inflate();
                    this.f72995i = new C28037g(this.f72994h);
                    this.f72994h.setPadding(0, (int) C9432q.m18687b(mo56271b(), 4.0f), 0, 0);
                }
                if (this.f72991e != null && this.f72991e.adType == 2) {
                    m66497l();
                }
                C24479b b = m66493b(searchUser);
                if (b != null) {
                    b.mo50248a(searchUser, this.f72991e);
                }
                ViewGroup viewGroup = this.f72994h;
                if (cardType != 1) {
                    i = 8;
                }
                C9432q.m18691b((View) viewGroup, i);
                m66495j();
                mo56208a(null);
                return;
            }
            m66496k();
            mo56208a(null);
            C9432q.m18691b((View) this.f72994h, 8);
        }
    }

    /* renamed from: a */
    public final void mo56208a(Map<String, String> map) {
        String str;
        Map e = super.mo56210e();
        if (e != null) {
            String str2 = "is_aladdin";
            if (this.f73000n.isAladdin()) {
                str = "1";
            } else {
                str = "0";
            }
            e.put(str2, str);
            e.put("token_type", m66489H());
        }
        super.mo56208a(e);
    }

    /* renamed from: a */
    public static SearchUserViewHolder m66490a(ViewGroup viewGroup, C32112c cVar) {
        return new SearchUserViewHolder(C41457i.f105090b.mo84196a(viewGroup, R.layout.bsw), cVar);
    }

    private SearchUserViewHolder(final View view, C32112c cVar) {
        super(view);
        int a = C10181b.m20511a().mo18168a(SearchUserStyleExperiment.class, true, "search_user_style", 31744, 2);
        boolean z = true;
        if (!(a == 1 || a == 2)) {
            z = false;
        }
        this.f72997k = z;
        this.f73001o = new SparseArray<>();
        this.f73003q = 56;
        ButterKnife.bind((Object) this, view);
        view.setOnClickListener(this);
        this.mIvAvator.setRequestImgSize(C47788ct.m103417a(BaseNotice.HASHTAG));
        this.mIvAvator.setOnClickListener(this);
        this.mIvAvator.setPlaceHolder(R.drawable.du4);
        this.f72996j = cVar;
        this.f73004r = new C31980a(this.mBtnFollow, new C31988e() {
            /* renamed from: a */
            public final String mo56221a() {
                return "search_result";
            }

            /* renamed from: b */
            public final String mo56222b() {
                return "click_follow";
            }

            /* renamed from: c */
            public final int mo56223c() {
                return 14;
            }

            /* renamed from: a */
            public final void mo49741a(int i, User user) {
                SearchUserViewHolder.this.f72996j.mo56498a(user);
            }
        });
        this.f73004r.f83488c = new C31984a() {
            /* renamed from: a */
            public final void mo56224a(FollowStatus followStatus) {
                C40733z.f103767a.showRemindUserCompleteProfileDialogAfterFollow(view.getContext(), SearchUserViewHolder.this.mo56218g(), "follow", SearchUserViewHolder.this.f72990d, followStatus.followStatus);
            }
        };
        this.f73005s = C47588a.m103036c();
        this.f73004r.f83490e = new C27882bn(this);
    }
}
