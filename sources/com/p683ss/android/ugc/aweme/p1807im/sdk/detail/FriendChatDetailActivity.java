package com.p683ss.android.ugc.aweme.p1807im.sdk.detail;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11190e;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.BlockResponse;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.UserStruct;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34030j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc.C35225a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.AutoRTLImageView;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.p1901c.C35431a;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity */
public final class FriendChatDetailActivity extends BaseChatDetailActivity implements C9382a {

    /* renamed from: h */
    public static final C34073a f88082h = new C34073a(null);

    /* renamed from: f */
    public IMUser f88083f;

    /* renamed from: g */
    public C9381g f88084g;

    /* renamed from: i */
    private RelativeLayout f88085i;

    /* renamed from: j */
    private AvatarImageView f88086j;

    /* renamed from: k */
    private ImageView f88087k;

    /* renamed from: l */
    private TextView f88088l;

    /* renamed from: m */
    private TextView f88089m;

    /* renamed from: n */
    private TextView f88090n;

    /* renamed from: o */
    private TextView f88091o;

    /* renamed from: p */
    private RelativeLayout f88092p;

    /* renamed from: q */
    private boolean f88093q;

    /* renamed from: r */
    private boolean f88094r;

    /* renamed from: s */
    private int f88095s;

    /* renamed from: t */
    private HashMap f88096t;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity$a */
    public static final class C34073a {
        private C34073a() {
        }

        public /* synthetic */ C34073a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity$b */
    public static final class C34074b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FriendChatDetailActivity f88097a;

        /* renamed from: b */
        final /* synthetic */ boolean f88098b;

        public final void run() {
            if (this.f88098b) {
                FriendChatDetailActivity.m77861a(this.f88097a).setFollowStatus(0);
            }
            FriendChatDetailActivity.m77861a(this.f88097a).setBlock(this.f88098b);
            C34010e.m77748a().mo71959a(FriendChatDetailActivity.m77861a(this.f88097a));
        }

        C34074b(FriendChatDetailActivity friendChatDetailActivity, boolean z) {
            this.f88097a = friendChatDetailActivity;
            this.f88098b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity$c */
    public static final class C34075c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FriendChatDetailActivity f88099a;

        C34075c(FriendChatDetailActivity friendChatDetailActivity) {
            this.f88099a = friendChatDetailActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == -1) {
                String b = C34030j.f87981c.mo71977b(FriendChatDetailActivity.m77861a(this.f88099a));
                C9381g gVar = this.f88099a.f88084g;
                if (gVar == null) {
                    C52711k.m112237a("mHandler");
                }
                C35286u.m79871a((Handler) gVar, (CharSequence) FriendChatDetailActivity.m77861a(this.f88099a).getUid(), b, 1, 1);
                C35190af.m79442a();
                C35190af.m79464a("success", FriendChatDetailActivity.m77861a(this.f88099a).getUid(), "chat");
                return;
            }
            C35190af.m79442a();
            C35190af.m79464a("cancel", FriendChatDetailActivity.m77861a(this.f88099a).getUid(), "chat");
        }
    }

    /* renamed from: a */
    public final View mo72009a(int i) {
        if (this.f88096t == null) {
            this.f88096t = new HashMap();
        }
        View view = (View) this.f88096t.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f88096t.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public final int mo72015d() {
        return R.layout.bbz;
    }

    public final boolean isRegisterEventBus() {
        return true;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity", "onCreate", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity", "onResume", true);
        super.onResume();
        C9381g gVar = this.f88084g;
        if (gVar == null) {
            C52711k.m112237a("mHandler");
        }
        Handler handler = gVar;
        IMUser iMUser = this.f88083f;
        if (iMUser == null) {
            C52711k.m112237a("mUser");
        }
        CharSequence uid = iMUser.getUid();
        IMUser iMUser2 = this.f88083f;
        if (iMUser2 == null) {
            C52711k.m112237a("mUser");
        }
        C35286u.m79870a(handler, uid, iMUser2.getSecUid(), 0);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity", "onResume", false);
    }

    /* renamed from: e */
    public final void mo72016e() {
        boolean z;
        super.mo72016e();
        Intent intent = getIntent();
        C52711k.m112236a((Object) intent, "intent");
        if (intent.getExtras() != null) {
            Intent intent2 = getIntent();
            C52711k.m112236a((Object) intent2, "intent");
            Bundle extras = intent2.getExtras();
            if (extras == null) {
                C52711k.m112234a();
            }
            if (extras.getSerializable("simple_uesr") != null) {
                Intent intent3 = getIntent();
                C52711k.m112236a((Object) intent3, "intent");
                Bundle extras2 = intent3.getExtras();
                if (extras2 == null) {
                    C52711k.m112234a();
                }
                Serializable serializable = extras2.getSerializable("simple_uesr");
                if (serializable != null) {
                    this.f88083f = (IMUser) serializable;
                    IMUser iMUser = this.f88083f;
                    if (iMUser == null) {
                        C52711k.m112237a("mUser");
                    }
                    String uid = iMUser.getUid();
                    CharSequence charSequence = uid;
                    if (charSequence == null || charSequence.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        try {
                            this.f88043e = new C11190e(C11190e.m22687a(Long.parseLong(uid)));
                        } catch (Exception unused) {
                        }
                    }
                    Intent intent4 = getIntent();
                    C52711k.m112236a((Object) intent4, "intent");
                    Bundle extras3 = intent4.getExtras();
                    if (extras3 == null) {
                        C52711k.m112234a();
                    }
                    this.f88093q = extras3.getBoolean("is_stranger", false);
                    Intent intent5 = getIntent();
                    C52711k.m112236a((Object) intent5, "intent");
                    Bundle extras4 = intent5.getExtras();
                    if (extras4 == null) {
                        C52711k.m112234a();
                    }
                    this.f88094r = extras4.getBoolean("is_author_supporter", false);
                    this.f88084g = new C9381g(this);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            }
        }
        finish();
    }

    /* renamed from: g */
    public final void mo72018g() {
        super.mo72018g();
        RelativeLayout relativeLayout = this.f88085i;
        if (relativeLayout == null) {
            C52711k.m112237a("mAvatarLayout");
        }
        View.OnClickListener onClickListener = this;
        relativeLayout.setOnClickListener(onClickListener);
        AvatarImageView avatarImageView = this.f88086j;
        if (avatarImageView == null) {
            C52711k.m112237a("mAvatarImage");
        }
        avatarImageView.setOnClickListener(onClickListener);
        TextView textView = this.f88090n;
        if (textView == null) {
            C52711k.m112237a("mBlockText");
        }
        textView.setOnClickListener(onClickListener);
        TextView textView2 = this.f88091o;
        if (textView2 == null) {
            C52711k.m112237a("mReportText");
        }
        textView2.setOnClickListener(onClickListener);
        C35225a l = C35225a.m79617l();
        View[] viewArr = new View[2];
        RelativeLayout relativeLayout2 = this.f88085i;
        if (relativeLayout2 == null) {
            C52711k.m112237a("mAvatarLayout");
        }
        viewArr[0] = relativeLayout2;
        AvatarImageView avatarImageView2 = this.f88086j;
        if (avatarImageView2 == null) {
            C52711k.m112237a("mAvatarImage");
        }
        viewArr[1] = avatarImageView2;
        l.mo73331a(viewArr);
        int color = getResources().getColor(R.color.a8w);
        int color2 = getResources().getColor(R.color.qb);
        View[] viewArr2 = new View[2];
        TextView textView3 = this.f88090n;
        if (textView3 == null) {
            C52711k.m112237a("mBlockText");
        }
        viewArr2[0] = textView3;
        TextView textView4 = this.f88091o;
        if (textView4 == null) {
            C52711k.m112237a("mReportText");
        }
        viewArr2[1] = textView4;
        C35221bc.m79613a(color, color2, viewArr2);
    }

    /* renamed from: f */
    public final void mo72017f() {
        super.mo72017f();
        RelativeLayout relativeLayout = (RelativeLayout) mo72009a((int) R.id.i9);
        C52711k.m112236a((Object) relativeLayout, "avatar_rl");
        this.f88085i = relativeLayout;
        AvatarImageView avatarImageView = (AvatarImageView) mo72009a((int) R.id.i0);
        C52711k.m112236a((Object) avatarImageView, "avatar_iv");
        this.f88086j = avatarImageView;
        ImageView imageView = (ImageView) mo72009a((int) R.id.doe);
        C52711k.m112236a((Object) imageView, "verify_iv");
        this.f88087k = imageView;
        DmtTextView dmtTextView = (DmtTextView) mo72009a((int) R.id.bpu);
        C52711k.m112236a((Object) dmtTextView, "name_tv");
        this.f88088l = dmtTextView;
        DmtTextView dmtTextView2 = (DmtTextView) mo72009a((int) R.id.a51);
        C52711k.m112236a((Object) dmtTextView2, "detail_tv");
        this.f88089m = dmtTextView2;
        RelativeLayout relativeLayout2 = (RelativeLayout) mo72009a((int) R.id.l_);
        C52711k.m112236a((Object) relativeLayout2, "block_rl");
        this.f88092p = relativeLayout2;
        DmtTextView dmtTextView3 = (DmtTextView) mo72009a((int) R.id.cbn);
        C52711k.m112236a((Object) dmtTextView3, "report_tv");
        this.f88091o = dmtTextView3;
        DmtTextView dmtTextView4 = (DmtTextView) mo72009a((int) R.id.la);
        C52711k.m112236a((Object) dmtTextView4, "block_tv");
        this.f88090n = dmtTextView4;
        if (this.f88093q) {
            RelativeLayout relativeLayout3 = (RelativeLayout) mo72009a((int) R.id.b8i);
            C52711k.m112236a((Object) relativeLayout3, "layout_mute");
            relativeLayout3.setVisibility(8);
            RelativeLayout relativeLayout4 = (RelativeLayout) mo72009a((int) R.id.b9r);
            C52711k.m112236a((Object) relativeLayout4, "layout_stick_top");
            relativeLayout4.setVisibility(8);
        }
        if (this.f88094r) {
            RelativeLayout relativeLayout5 = (RelativeLayout) mo72009a((int) R.id.b9b);
            C52711k.m112236a((Object) relativeLayout5, "layout_report");
            relativeLayout5.setVisibility(8);
            RelativeLayout relativeLayout6 = (RelativeLayout) mo72009a((int) R.id.l_);
            C52711k.m112236a((Object) relativeLayout6, "block_rl");
            relativeLayout6.setVisibility(8);
            AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo72009a((int) R.id.bn9);
            C52711k.m112236a((Object) autoRTLImageView, "more_iv");
            autoRTLImageView.setVisibility(8);
            DmtTextView dmtTextView5 = (DmtTextView) mo72009a((int) R.id.a51);
            C52711k.m112236a((Object) dmtTextView5, "detail_tv");
            dmtTextView5.setVisibility(8);
            AvatarImageView avatarImageView2 = (AvatarImageView) mo72009a((int) R.id.i0);
            C52711k.m112236a((Object) avatarImageView2, "avatar_iv");
            avatarImageView2.setEnabled(false);
            RelativeLayout relativeLayout7 = (RelativeLayout) mo72009a((int) R.id.i9);
            C52711k.m112236a((Object) relativeLayout7, "avatar_rl");
            relativeLayout7.setEnabled(false);
        }
        IMUser iMUser = this.f88083f;
        if (iMUser == null) {
            C52711k.m112237a("mUser");
        }
        m77863a(iMUser);
        IMUser iMUser2 = this.f88083f;
        if (iMUser2 == null) {
            C52711k.m112237a("mUser");
        }
        if (TextUtils.equals(iMUser2.getUid(), C35265e.m79730b())) {
            RelativeLayout relativeLayout8 = this.f88092p;
            if (relativeLayout8 == null) {
                C52711k.m112237a("mBlockLayout");
            }
            relativeLayout8.setVisibility(8);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IMUser m77861a(FriendChatDetailActivity friendChatDetailActivity) {
        IMUser iMUser = friendChatDetailActivity.f88083f;
        if (iMUser == null) {
            C52711k.m112237a("mUser");
        }
        return iMUser;
    }

    /* renamed from: c */
    private final void m77865c(boolean z) {
        C9381g gVar = this.f88084g;
        if (gVar == null) {
            C52711k.m112237a("mHandler");
        }
        gVar.post(new C34074b(this, z));
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onBlockUserSuccessEvent(C35431a aVar) {
        C52711k.m112240b(aVar, "event");
        this.f88095s = 1;
        TextView textView = this.f88090n;
        if (textView == null) {
            C52711k.m112237a("mBlockText");
        }
        textView.setText(R.string.bp0);
        C10691a.m21533a((Context) this, (int) R.string.bf9).mo19066a();
        m77865c(true);
    }

    /* renamed from: b */
    private final String m77864b(IMUser iMUser) {
        String str;
        if (TextUtils.isEmpty(iMUser.getRemarkName()) || TextUtils.isEmpty(iMUser.getNickName())) {
            if (TextUtils.isEmpty(iMUser.getSignature())) {
                str = getString(R.string.bf5);
            } else {
                str = iMUser.getSignature();
            }
            C52711k.m112236a((Object) str, "if (TextUtils.isEmpty(us…r.signature\n            }");
            return str;
        }
        String string = getString(R.string.blf, new Object[]{iMUser.getNickName()});
        C52711k.m112236a((Object) string, "getString(R.string.im_nickname, user.nickName)");
        return string;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m77863a(com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r6.getAvatarThumb()
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r6.getAvatarThumb()
            java.lang.String r1 = "user.avatarThumb"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r6.getAvatarThumb()
            java.lang.String r1 = "user.avatarThumb"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.util.List r0 = r0.getUrlList()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x003b
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r5.f88086j
            if (r0 != 0) goto L_0x0031
            java.lang.String r1 = "mAvatarImage"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0031:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r0
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r6.getAvatarThumb()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r0, r1)
            goto L_0x004c
        L_0x003b:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r5.f88086j
            if (r0 != 0) goto L_0x0044
            java.lang.String r1 = "mAvatarImage"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0044:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r0
            r1 = 2131953301(0x7f130695, float:1.954307E38)
            com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r0, r1)
        L_0x004c:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r5.f88086j
            if (r0 != 0) goto L_0x0055
            java.lang.String r1 = "mAvatarImage"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0055:
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35178a.m79422a(r0, r6)
            android.widget.TextView r0 = r5.f88088l
            if (r0 != 0) goto L_0x0063
            java.lang.String r1 = "mUserNameText"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0063:
            java.lang.String r1 = r6.getDisplayName()
            m77862a(r0, r1)
            r0 = r5
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = r6.getCustomVerify()
            java.lang.String r2 = r6.getEnterpriseVerifyReason()
            android.widget.TextView r3 = r5.f88088l
            if (r3 != 0) goto L_0x007e
            java.lang.String r4 = "mUserNameText"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x007e:
            com.p683ss.android.ugc.aweme.utils.C47916gh.m103675a(r0, r1, r2, r3)
            android.widget.TextView r0 = r5.f88089m
            if (r0 != 0) goto L_0x008a
            java.lang.String r1 = "mDetailText"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x008a:
            java.lang.String r1 = r5.m77864b(r6)
            m77862a(r0, r1)
            com.ss.android.ugc.aweme.services.IMainService r0 = com.p683ss.android.ugc.aweme.services.MainServiceImpl.createIMainServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.services.IMainService r0 = (com.p683ss.android.ugc.aweme.services.IMainService) r0
            java.lang.String r1 = "Message"
            boolean r0 = r0.shouldChangeToHandle(r1)
            if (r0 == 0) goto L_0x00bf
            android.widget.TextView r0 = r5.f88088l
            if (r0 != 0) goto L_0x00a8
            java.lang.String r1 = "mUserNameText"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00a8:
            java.lang.String r1 = r6.getDisplayId()
            m77862a(r0, r1)
            android.widget.TextView r0 = r5.f88089m
            if (r0 != 0) goto L_0x00b8
            java.lang.String r1 = "mDetailText"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00b8:
            java.lang.String r6 = r6.getDisplayName()
            m77862a(r0, r6)
        L_0x00bf:
            boolean r6 = r5.f88094r
            if (r6 == 0) goto L_0x00d1
            android.widget.TextView r6 = r5.f88089m
            if (r6 != 0) goto L_0x00cc
            java.lang.String r0 = "mDetailText"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00cc:
            r0 = 8
            r6.setVisibility(r0)
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.detail.FriendChatDetailActivity.m77863a(com.ss.android.ugc.aweme.im.service.model.IMUser):void");
    }

    public final void handleMsg(Message message) {
        C52711k.m112240b(message, "msg");
        switch (message.what) {
            case 0:
                Object obj = message.obj;
                if (obj instanceof UserStruct) {
                    UserStruct userStruct = (UserStruct) obj;
                    if (userStruct.getUser() != null) {
                        if (userStruct.getUser().isBlock()) {
                            this.f88095s = 1;
                            TextView textView = this.f88090n;
                            if (textView == null) {
                                C52711k.m112237a("mBlockText");
                            }
                            textView.setText(R.string.bp0);
                        } else {
                            this.f88095s = 0;
                            TextView textView2 = this.f88090n;
                            if (textView2 == null) {
                                C52711k.m112237a("mBlockText");
                            }
                            textView2.setText(R.string.bf6);
                        }
                        IMUser fromUser = IMUser.fromUser(userStruct.getUser());
                        C52711k.m112236a((Object) fromUser, "IMUser.fromUser(userStruct.user)");
                        this.f88083f = fromUser;
                        IMUser iMUser = this.f88083f;
                        if (iMUser == null) {
                            C52711k.m112237a("mUser");
                        }
                        m77863a(iMUser);
                        C34010e a = C34010e.m77748a();
                        IMUser iMUser2 = this.f88083f;
                        if (iMUser2 == null) {
                            C52711k.m112237a("mUser");
                        }
                        a.mo71959a(iMUser2);
                    }
                }
                return;
            case 1:
                Object obj2 = message.obj;
                if (!(obj2 instanceof C23459a)) {
                    if (obj2 instanceof BlockResponse) {
                        BlockResponse blockResponse = (BlockResponse) obj2;
                        if (blockResponse.getBlockStaus() != 1) {
                            if (blockResponse.getBlockStaus() == 0) {
                                this.f88095s = 0;
                                TextView textView3 = this.f88090n;
                                if (textView3 == null) {
                                    C52711k.m112237a("mBlockText");
                                }
                                textView3.setText(R.string.bf6);
                                C10691a.m21533a((Context) this, (int) R.string.bp1).mo19066a();
                                m77865c(false);
                                break;
                            }
                        } else {
                            this.f88095s = 1;
                            TextView textView4 = this.f88090n;
                            if (textView4 == null) {
                                C52711k.m112237a("mBlockText");
                            }
                            textView4.setText(R.string.bp0);
                            C10691a.m21533a((Context) this, (int) R.string.bf9).mo19066a();
                            m77865c(true);
                            return;
                        }
                    }
                } else {
                    C10691a.m21542b((Context) this, (int) R.string.bh3).mo19066a();
                    return;
                }
                break;
        }
    }

    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            java.lang.String r0 = "v"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
            super.onClick(r11)
            int r11 = r11.getId()
            r0 = 0
            r1 = 0
            r2 = 1
            r3 = 2132017545(0x7f140189, float:1.9673371E38)
            if (r11 == r3) goto L_0x01fa
            r3 = 2132017532(0x7f14017c, float:1.9673345E38)
            if (r11 != r3) goto L_0x001b
            goto L_0x01fa
        L_0x001b:
            r3 = 2132017675(0x7f14020b, float:1.9673635E38)
            r4 = 2
            if (r11 != r3) goto L_0x0099
            int r11 = r10.f88095s
            if (r11 != 0) goto L_0x0059
            com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity$c r11 = new com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity$c
            r11.<init>(r10)
            com.ss.android.ugc.aweme.im.service.model.IMUser r3 = r10.f88083f
            if (r3 != 0) goto L_0x0033
            java.lang.String r5 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0033:
            int r3 = r3.getFollowStatus()
            if (r3 != r4) goto L_0x003a
            r1 = 1
        L_0x003a:
            r2 = r10
            android.content.Context r2 = (android.content.Context) r2
            android.content.DialogInterface$OnClickListener r11 = (android.content.DialogInterface.OnClickListener) r11
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl.m79707a(r2, r1, r11)
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
            java.lang.String r11 = "chat"
            com.ss.android.ugc.aweme.im.service.model.IMUser r1 = r10.f88083f
            if (r1 != 0) goto L_0x0050
            java.lang.String r2 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0050:
            java.lang.String r1 = r1.getUid()
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79464a(r11, r1, r0)
            goto L_0x022e
        L_0x0059:
            com.ss.android.ugc.aweme.im.sdk.d.j r11 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34030j.f87981c
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r10.f88083f
            if (r0 != 0) goto L_0x0064
            java.lang.String r3 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0064:
            java.lang.String r11 = r11.mo71977b(r0)
            com.bytedance.common.utility.b.g r0 = r10.f88084g
            if (r0 != 0) goto L_0x0071
            java.lang.String r3 = "mHandler"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0071:
            android.os.Handler r0 = (android.os.Handler) r0
            com.ss.android.ugc.aweme.im.service.model.IMUser r3 = r10.f88083f
            if (r3 != 0) goto L_0x007c
            java.lang.String r4 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x007c:
            java.lang.String r3 = r3.getUid()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u.m79871a(r0, r3, r11, r1, r2)
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
            com.ss.android.ugc.aweme.im.service.model.IMUser r11 = r10.f88083f
            if (r11 != 0) goto L_0x0091
            java.lang.String r0 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0091:
            java.lang.String r11 = r11.getUid()
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79490c(r11)
            return
        L_0x0099:
            r3 = 2132022229(0x7f1413d5, float:1.9682872E38)
            if (r11 != r3) goto L_0x022e
            com.bytedance.im.core.c.e r11 = r10.f88043e
            if (r11 == 0) goto L_0x00a5
            java.lang.String r11 = r11.f30190a
            goto L_0x00a6
        L_0x00a5:
            r11 = r0
        L_0x00a6:
            com.bytedance.im.core.c.e r3 = r10.f88043e
            if (r3 == 0) goto L_0x00af
            com.bytedance.im.core.c.b r3 = r3.mo20685a()
            goto L_0x00b0
        L_0x00af:
            r3 = r0
        L_0x00b0:
            if (r3 == 0) goto L_0x00bb
            long r5 = r3.getConversationShortId()
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            goto L_0x00bc
        L_0x00bb:
            r3 = r0
        L_0x00bc:
            com.ss.android.ugc.aweme.im.service.model.IMUser r5 = r10.f88083f
            if (r5 != 0) goto L_0x00c5
            java.lang.String r6 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x00c5:
            java.lang.String r5 = r5.getUid()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L_0x00d6
            int r5 = r5.length()
            if (r5 != 0) goto L_0x00d4
            goto L_0x00d6
        L_0x00d4:
            r5 = 0
            goto L_0x00d7
        L_0x00d6:
            r5 = 1
        L_0x00d7:
            if (r5 != 0) goto L_0x01f9
            r5 = r11
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L_0x00e7
            int r5 = r5.length()
            if (r5 != 0) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            r5 = 0
            goto L_0x00e8
        L_0x00e7:
            r5 = 1
        L_0x00e8:
            if (r5 != 0) goto L_0x01f9
            if (r3 == 0) goto L_0x01f9
            long r5 = r3.longValue()
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x00f8
            goto L_0x01f9
        L_0x00f8:
            boolean r5 = r10.f88093q
            if (r5 == 0) goto L_0x00fe
            r4 = 1
            goto L_0x010f
        L_0x00fe:
            com.ss.android.ugc.aweme.im.service.model.IMUser r5 = r10.f88083f
            if (r5 != 0) goto L_0x0107
            java.lang.String r6 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0107:
            int r5 = r5.getCommerceUserLevel()
            if (r5 <= 0) goto L_0x010e
            goto L_0x010f
        L_0x010e:
            r4 = 0
        L_0x010f:
            com.p683ss.android.ugc.aweme.p1807im.sdk.chat.selectmsg.C33707b.m77192a(r11)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.p683ss.android.ugc.aweme.p1807im.sdk.chat.selectmsg.C33707b.m77193a(r11, r4)
            java.lang.String r4 = ""
            com.google.gson.o r5 = new com.google.gson.o     // Catch:{ Exception -> 0x0176 }
            r5.<init>()     // Catch:{ Exception -> 0x0176 }
            java.lang.String r6 = "conversation_id"
            r5.mo35020a(r6, r11)     // Catch:{ Exception -> 0x0176 }
            java.lang.String r6 = "unique_id"
            com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r10.f88083f     // Catch:{ Exception -> 0x0176 }
            if (r7 != 0) goto L_0x0130
            java.lang.String r8 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112237a(r8)     // Catch:{ Exception -> 0x0176 }
        L_0x0130:
            if (r7 != 0) goto L_0x0135
            java.lang.String r7 = ""
            goto L_0x015b
        L_0x0135:
            java.lang.String r8 = r7.getUniqueId()     // Catch:{ Exception -> 0x0176 }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ Exception -> 0x0176 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0176 }
            if (r8 == 0) goto L_0x0154
            java.lang.String r8 = r7.getShortId()     // Catch:{ Exception -> 0x0176 }
            if (r8 != 0) goto L_0x014a
            java.lang.String r7 = ""
            goto L_0x014e
        L_0x014a:
            java.lang.String r7 = r7.getShortId()     // Catch:{ Exception -> 0x0176 }
        L_0x014e:
            java.lang.String r8 = "if (user.shortId == null) \"\" else user.shortId"
        L_0x0150:
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)     // Catch:{ Exception -> 0x0176 }
            goto L_0x015b
        L_0x0154:
            java.lang.String r7 = r7.getUniqueId()     // Catch:{ Exception -> 0x0176 }
            java.lang.String r8 = "user.uniqueId"
            goto L_0x0150
        L_0x015b:
            r5.mo35020a(r6, r7)     // Catch:{ Exception -> 0x0176 }
            java.lang.String r6 = "is_blocked"
            int r7 = r10.f88095s     // Catch:{ Exception -> 0x0176 }
            if (r7 != r2) goto L_0x0165
            r1 = 1
        L_0x0165:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0176 }
            r5.mo35018a(r6, r1)     // Catch:{ Exception -> 0x0176 }
            java.lang.String r1 = com.p683ss.android.ugc.aweme.utils.C47760cd.m103385a(r5)     // Catch:{ Exception -> 0x0176 }
            java.lang.String r2 = "GsonUtil.toJson(jsonObject)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ Exception -> 0x0176 }
            goto L_0x0177
        L_0x0176:
            r1 = r4
        L_0x0177:
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r4 = "owner_id"
            com.ss.android.ugc.aweme.im.service.model.IMUser r5 = r10.f88083f
            if (r5 != 0) goto L_0x0187
            java.lang.String r6 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0187:
            java.lang.String r5 = r5.getUid()
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r4, r5)
            java.lang.String r4 = "report_type"
            java.lang.String r5 = "im"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r4, r5)
            java.lang.String r4 = "extra"
            android.net.Uri$Builder r1 = r2.appendQueryParameter(r4, r1)
            java.lang.String r2 = "object_id"
            long r3 = r3.longValue()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)
            com.ss.android.ugc.aweme.compliance.api.services.report.IReportService r2 = com.p683ss.android.ugc.aweme.compliance.api.C27013a.m65227a()
            r3 = r10
            android.app.Activity r3 = (android.app.Activity) r3
            r2.report(r3, r1)
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
            com.bytedance.im.core.c.e r1 = r10.f88043e
            if (r1 == 0) goto L_0x01be
            java.lang.String r0 = r1.f30190a
        L_0x01be:
            java.lang.String r1 = "private"
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79497d(r0, r1)
            com.ss.android.ugc.aweme.app.f.d r0 = new com.ss.android.ugc.aweme.app.f.d
            r0.<init>()
            java.lang.String r1 = "author_id"
            com.ss.android.ugc.aweme.im.service.model.IMUser r2 = r10.f88083f
            if (r2 != 0) goto L_0x01d3
            java.lang.String r3 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x01d3:
            java.lang.String r2 = r2.getUid()
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "object_id"
            com.ss.android.ugc.aweme.app.f.d r11 = r0.mo47829a(r1, r11)
            java.lang.String r0 = "object_type"
            java.lang.String r1 = "im"
            com.ss.android.ugc.aweme.app.f.d r11 = r11.mo47829a(r0, r1)
            java.lang.String r0 = "enter_method"
            java.lang.String r1 = "click_share_button"
            com.ss.android.ugc.aweme.app.f.d r11 = r11.mo47829a(r0, r1)
            java.lang.String r0 = "click_report"
            java.util.Map<java.lang.String, java.lang.String> r11 = r11.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r11)
            goto L_0x022e
        L_0x01f9:
            return
        L_0x01fa:
            boolean r11 = r10.f88094r
            if (r11 == 0) goto L_0x0205
            boolean r11 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33453a.m76682e()
            if (r11 != 0) goto L_0x0205
            r1 = 1
        L_0x0205:
            if (r1 != 0) goto L_0x0208
            r0 = r10
        L_0x0208:
            com.ss.android.ugc.aweme.im.sdk.detail.FriendChatDetailActivity r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.detail.FriendChatDetailActivity) r0
            if (r0 == 0) goto L_0x022f
            com.ss.android.ugc.aweme.im.sdk.d.j r11 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34030j.f87981c
            com.ss.android.ugc.aweme.im.service.model.IMUser r1 = r0.f88083f
            if (r1 != 0) goto L_0x0217
            java.lang.String r2 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0217:
            java.lang.String r1 = r1.getUid()
            r11.mo71978c(r1)
            com.ss.android.ugc.aweme.im.service.model.IMUser r11 = r0.f88083f
            if (r11 != 0) goto L_0x0227
            java.lang.String r0 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0227:
            java.lang.String r11 = r11.getUid()
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35233bh.m79635a(r11)
        L_0x022e:
            return
        L_0x022f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.detail.FriendChatDetailActivity.onClick(android.view.View):void");
    }

    /* renamed from: a */
    private static void m77862a(TextView textView, String str) {
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(0);
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(4);
    }
}
