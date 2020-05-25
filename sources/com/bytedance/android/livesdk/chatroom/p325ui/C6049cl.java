package com.bytedance.android.livesdk.chatroom.p325ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.C2970d;
import com.bytedance.android.live.base.model.FansClubMember;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.C3003c;
import com.bytedance.android.live.base.model.user.C3004d;
import com.bytedance.android.live.base.model.user.C3014m;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.p230g.C3865ac;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.core.setting.C4085g;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.event.C5182ba;
import com.bytedance.android.livesdk.chatroom.event.C5189i;
import com.bytedance.android.livesdk.chatroom.event.C5197p;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.p325ui.C6086dh.C6088a;
import com.bytedance.android.livesdk.chatroom.p325ui.C6086dh.C6089b;
import com.bytedance.android.livesdk.chatroom.presenter.C5789al;
import com.bytedance.android.livesdk.chatroom.presenter.C5793ao;
import com.bytedance.android.livesdk.chatroom.presenter.C5793ao.C5794a;
import com.bytedance.android.livesdk.chatroom.presenter.C5805ay;
import com.bytedance.android.livesdk.chatroom.presenter.C5806az;
import com.bytedance.android.livesdk.chatroom.presenter.C5810ba;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4559aa;
import com.bytedance.android.livesdk.p279af.C4568ah;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4600j;
import com.bytedance.android.livesdk.p279af.C4622w;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8065e.C8066a;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.rank.C8123a;
import com.bytedance.android.livesdk.user.C8325b.C8326a;
import com.bytedance.android.livesdk.user.C8325b.C8327b;
import com.bytedance.android.livesdk.user.C8334f;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8336h;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdk.widget.C8555i;
import com.bytedance.android.livesdk.widget.C8555i.C8556a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import com.bytedance.android.livesdkapi.depend.p434b.C8615a;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.android.livesdkapi.p432d.C8612a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.C1674ab;
import p064c.p065a.C2203w;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cl */
public final class C6049cl extends C3846a implements OnClickListener, C5794a, C6089b {

    /* renamed from: A */
    private TextView f16118A;

    /* renamed from: B */
    private TextView f16119B;

    /* renamed from: F */
    private TextView f16120F;

    /* renamed from: G */
    private TextView f16121G;

    /* renamed from: H */
    private TextView f16122H;

    /* renamed from: I */
    private TextView f16123I;

    /* renamed from: J */
    private TextView f16124J;

    /* renamed from: K */
    private TextView f16125K;

    /* renamed from: L */
    private TextView f16126L;

    /* renamed from: M */
    private TextView f16127M;

    /* renamed from: N */
    private View f16128N;

    /* renamed from: O */
    private View f16129O;

    /* renamed from: P */
    private ImageView f16130P;

    /* renamed from: Q */
    private View f16131Q;

    /* renamed from: R */
    private ImageView f16132R;

    /* renamed from: S */
    private View f16133S;

    /* renamed from: T */
    private ImageView f16134T;

    /* renamed from: U */
    private View f16135U;

    /* renamed from: V */
    private TextView f16136V;

    /* renamed from: W */
    private TextView f16137W;

    /* renamed from: X */
    private View f16138X;

    /* renamed from: Y */
    private View f16139Y;

    /* renamed from: Z */
    private View f16140Z;

    /* renamed from: a */
    TextView f16141a;

    /* renamed from: aA */
    private View f16142aA;

    /* renamed from: aB */
    private Animator[] f16143aB = {null, null};

    /* renamed from: aC */
    private Animator[] f16144aC = {null, null};

    /* renamed from: aD */
    private boolean f16145aD;

    /* renamed from: aE */
    private boolean f16146aE;

    /* renamed from: aF */
    private FansClubData f16147aF;

    /* renamed from: aG */
    private boolean f16148aG = true;

    /* renamed from: aH */
    private boolean f16149aH = true;

    /* renamed from: aI */
    private boolean f16150aI = true;

    /* renamed from: aa */
    private View f16151aa;

    /* renamed from: ab */
    private HSImageView f16152ab;

    /* renamed from: ac */
    private TextView f16153ac;

    /* renamed from: ad */
    private HSImageView f16154ad;

    /* renamed from: ae */
    private TextView f16155ae;

    /* renamed from: af */
    private HSImageView f16156af;

    /* renamed from: ag */
    private TextView f16157ag;

    /* renamed from: ah */
    private HSImageView f16158ah;

    /* renamed from: ai */
    private TextView f16159ai;

    /* renamed from: aj */
    private View f16160aj;

    /* renamed from: ak */
    private HSImageView f16161ak;

    /* renamed from: al */
    private TextView f16162al;

    /* renamed from: am */
    private TextView f16163am;

    /* renamed from: an */
    private View f16164an;

    /* renamed from: ao */
    private TextView f16165ao;

    /* renamed from: ap */
    private RecyclerView f16166ap;

    /* renamed from: aq */
    private C6206fh f16167aq;

    /* renamed from: ar */
    private LinearLayout f16168ar;

    /* renamed from: as */
    private TextView f16169as;

    /* renamed from: at */
    private LinearLayout f16170at;

    /* renamed from: au */
    private View f16171au;

    /* renamed from: av */
    private LinearLayout f16172av;

    /* renamed from: aw */
    private ImageView f16173aw;

    /* renamed from: ax */
    private ImageView f16174ax;

    /* renamed from: ay */
    private View f16175ay;

    /* renamed from: az */
    private ImageView f16176az;

    /* renamed from: b */
    public View f16177b;

    /* renamed from: c */
    Activity f16178c;

    /* renamed from: d */
    DataCenter f16179d;

    /* renamed from: e */
    public View f16180e;

    /* renamed from: f */
    public View f16181f;

    /* renamed from: g */
    public View f16182g;

    /* renamed from: h */
    View f16183h;

    /* renamed from: i */
    public View f16184i;

    /* renamed from: j */
    View f16185j;

    /* renamed from: k */
    Animator f16186k;

    /* renamed from: l */
    Animator f16187l;

    /* renamed from: m */
    User f16188m;

    /* renamed from: n */
    int f16189n;

    /* renamed from: o */
    boolean f16190o;

    /* renamed from: p */
    long f16191p;

    /* renamed from: q */
    Room f16192q;

    /* renamed from: r */
    C4559aa f16193r;

    /* renamed from: s */
    boolean f16194s;

    /* renamed from: t */
    C5793ao f16195t;

    /* renamed from: u */
    int f16196u;

    /* renamed from: v */
    public String f16197v;

    /* renamed from: w */
    public String f16198w;

    /* renamed from: x */
    boolean f16199x;

    /* renamed from: y */
    public List<C2970d> f16200y;

    /* renamed from: z */
    boolean f16201z;

    /* renamed from: a */
    public final void mo11681a(Throwable th) {
        if (this.f16146aE) {
            if (th instanceof C2949a) {
                C4575an.m10987a(((C2949a) th).getPrompt());
            } else {
                C4575an.m10981a((int) R.string.eon);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f16179d != null) {
            this.f16179d.lambda$put$1$DataCenter("hide_share_lead", Boolean.valueOf(false));
        }
        this.f16146aE = false;
        m13213a(this.f16143aB[0]);
        m13213a(this.f16143aB[1]);
        m13213a(this.f16144aC[0]);
        m13213a(this.f16144aC[1]);
        m13213a(this.f16186k);
        m13213a(this.f16187l);
    }

    /* renamed from: b */
    private void m13216b() {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live_view");
        hashMap.put("event_type", "core");
        hashMap.put("event_page", "live_detail");
        hashMap.put("action_type", "click");
        hashMap.put("event_module", "right_anchor");
        hashMap.put("enter_from_merge", "live_detail");
        hashMap.put("enter_method", "right_anchor");
        hashMap.put("anchor_id", String.valueOf(this.f16188m.getId()));
        hashMap.put("room_id", String.valueOf(this.f16188m.getLiveRoomId()));
        hashMap.put("right_user_id", String.valueOf(this.f16188m.getId()));
        String str3 = "live_type";
        if (this.f16192q.isLiveTypeAudio()) {
            str = "voice_live";
        } else {
            str = "video_live";
        }
        hashMap.put(str3, str);
        if (LinkCrossRoomDataHolder.m11103a().f12612c > 0) {
            hashMap.put("channel_id", String.valueOf(LinkCrossRoomDataHolder.m11103a().f12612c));
            hashMap.put("pk_id", String.valueOf(LinkCrossRoomDataHolder.m11103a().f12613d));
            String str4 = "connection_type";
            if (LinkCrossRoomDataHolder.m11103a().f12619j == 0) {
                str2 = "anchor";
            } else {
                str2 = "pk";
            }
            hashMap.put(str4, str2);
        }
        C8049c.m15979a().mo14202a("live_show", hashMap, Room.class, new C8059j());
    }

    /* renamed from: a */
    public final void mo12078a() {
        if (getActivity() != null && getActivity().getSupportFragmentManager() != null) {
            C0679r a = getActivity().getSupportFragmentManager().mo2225a();
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                a.mo2196c(parentFragment);
            }
            a.mo2196c(this);
            a.mo2189b();
        }
    }

    /* renamed from: a */
    static void m13213a(Animator animator) {
        if (animator != null) {
            animator.removeAllListeners();
            if (animator.isRunning()) {
                animator.cancel();
            }
        }
    }

    /* renamed from: a */
    private void m13214a(View view) {
        view.setCameraDistance(getResources().getDisplayMetrics().density * 16000.0f);
    }

    public final void onEvent(C8615a aVar) {
        C8686a aVar2 = aVar.f23584a;
        if (aVar2 != null && aVar2.f23732a == this.f16191p) {
            mo11680a(aVar2);
        }
    }

    /* renamed from: b */
    private void m13217b(int i) {
        switch (i) {
            case 0:
            case 2:
                this.f16174ax.setImageDrawable(getResources().getDrawable(R.drawable.e1j));
                return;
            case 1:
                this.f16174ax.setImageDrawable(getResources().getDrawable(R.drawable.e1g));
                return;
            case 3:
                this.f16174ax.setImageDrawable(getResources().getDrawable(R.drawable.e1i));
                break;
        }
    }

    /* renamed from: c */
    private void m13219c(User user) {
        if (user != null) {
            if (!user.isFollowing()) {
                C9432q.m18691b((View) this.f16136V, 0);
                C9432q.m18691b((View) this.f16137W, 8);
                this.f16188m.getFollowInfo().setPushStatus(2);
                m13217b(2);
                this.f16175ay.setVisibility(8);
                return;
            }
            C9432q.m18691b((View) this.f16136V, 8);
            C9432q.m18691b((View) this.f16137W, 0);
            String string = getResources().getString(R.string.eos);
            if (user.getFollowInfo() != null && user.getFollowInfo().getFollowStatus() == 2) {
                string = getResources().getString(R.string.e_8);
            }
            if (this.f16137W != null) {
                this.f16137W.setText(string);
            }
            boolean booleanValue = ((Boolean) LiveSettingKeys.LIVE_MT_NOTIFICATION_AB.mo9431a()).booleanValue();
            if (this.f16145aD || this.f16189n != 0 || !user.isFollowing() || !booleanValue) {
                this.f16175ay.setVisibility(8);
            } else {
                this.f16175ay.setVisibility(0);
            }
        }
    }

    /* renamed from: b */
    private void m13218b(User user) {
        if (((Integer) C4639e.m11122a().f12651b).intValue() == 2) {
            C4575an.m10981a((int) R.string.ejr);
            return;
        }
        if (this.f16189n == 0) {
            this.f16193r.mo10374a("live_audience_c_anchor", user.getId());
        } else if (this.f16189n == 2) {
            this.f16193r.mo10374a("right_anchor", user.getId());
        } else {
            this.f16193r.mo10374a("live_audience_c_audience", user.getId());
        }
        C4559aa.m10949a(user.getIdStr());
        HashMap hashMap = new HashMap(1);
        hashMap.put("log_enter_live_source", this.f16179d.get("log_enter_live_source"));
        hashMap.put("sec_user_id", user.getSecUid());
        C4514j.m10883j().mo10328i().showUserProfile(user.getId(), null, hashMap);
    }

    /* renamed from: a */
    public final void mo12079a(int i) {
        m13217b(i);
        this.f16188m.getFollowInfo().setPushStatus((long) i);
    }

    /* renamed from: a */
    public final void mo11680a(C8686a aVar) {
        if (this.f16146aE && this.f16188m != null && this.f16188m.getFollowInfo() != null && ((int) this.f16188m.getFollowInfo().getFollowStatus()) != aVar.mo15140a()) {
            this.f16188m.setFollowStatus(aVar.mo15140a());
            m13219c(this.f16188m);
        }
    }

    /* renamed from: a */
    public final void mo12080a(User user) {
        boolean z;
        boolean z2;
        Object obj;
        int i;
        if (!this.f16146aE || user == null || user.getId() <= 0) {
            if (this.f16151aa != null) {
                this.f16151aa.setVisibility(8);
            }
            return;
        }
        if (this.f16151aa.getVisibility() == 8) {
            this.f16151aa.setVisibility(0);
        }
        if (this.f16193r == null) {
            this.f16193r = new C4559aa(this.f16178c, this.f16192q, user.getId());
        }
        this.f16188m = user;
        this.f16191p = this.f16188m.getId();
        long b = TTLiveSDKContext.getHostService().mo10315h().mo14529b();
        if (b == this.f16191p) {
            z = true;
        } else {
            z = false;
        }
        this.f16145aD = z;
        if (this.f16192q.getOwnerUserId() == this.f16191p) {
            this.f16189n = 0;
        } else if (LinkCrossRoomDataHolder.m11103a().f12614e == this.f16191p) {
            this.f16189n = 2;
        } else {
            this.f16189n = 1;
        }
        if (b == this.f16192q.getOwnerUserId()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f16190o = z2;
        boolean booleanValue = ((Boolean) LiveSettingKeys.LIVE_MT_NOTIFICATION_AB.mo9431a()).booleanValue();
        if (!this.f16145aD && this.f16189n == 0 && (this.f16188m.getFollowInfo().getFollowStatus() == 1 || this.f16188m.getFollowInfo().getFollowStatus() == 2)) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from_merge", "message");
            hashMap.put("enter_method", "live_cell");
            hashMap.put("anchor_id", String.valueOf(this.f16192q.getOwner().getId()));
            hashMap.put("room_id", String.valueOf(this.f16192q.getId()));
            if (booleanValue) {
                this.f16175ay.setVisibility(0);
                if (this.f16188m == null || this.f16188m.getFollowInfo() == null) {
                    i = 0;
                } else {
                    i = (int) this.f16188m.getFollowInfo().getPushStatus();
                }
                m13217b(i);
                hashMap.put("is_setting", "1");
            } else {
                hashMap.put("is_setting", "0");
            }
            C8049c.m15979a().mo14202a("livesdk_click_user_following_show", hashMap, new C8059j().mo14218f("show").mo14214b(CustomActionPushReceiver.f104061f).mo14213a("anchor_profile"));
        }
        ArrayList arrayList = new ArrayList();
        C3004d authenticationInfo = this.f16188m.getAuthenticationInfo();
        FansClubData fansClubData = null;
        if (authenticationInfo == null) {
            obj = null;
        } else {
            obj = authenticationInfo.f8831c;
        }
        if (obj != null) {
            arrayList.add(obj);
        }
        arrayList.addAll(this.f16188m.getBadgeImageList());
        this.f16167aq.mo12248a(arrayList);
        this.f16167aq.f16674a = new OnClickListener() {
            public final void onClick(View view) {
                String str;
                if (view.getTag() instanceof ImageModel) {
                    ImageModel imageModel = (ImageModel) view.getTag();
                    if (!C9431p.m18664a(imageModel.getSchema()) && C6049cl.this.getContext() != null) {
                        C6049cl clVar = C6049cl.this;
                        String schema = imageModel.getSchema();
                        Uri parse = Uri.parse(schema);
                        String queryParameter = parse.getQueryParameter("noble_intercept");
                        if (!(queryParameter == null || C4568ah.m10970b(queryParameter) == 0)) {
                            String queryParameter2 = parse.getQueryParameter("url");
                            if (queryParameter2 != null) {
                                String uri = Uri.parse(queryParameter2).buildUpon().appendQueryParameter("status_bar_height", String.valueOf(C3922z.m9914e(C3865ac.m9795a(clVar.getContext())))).build().toString();
                                Set<String> queryParameterNames = parse.getQueryParameterNames();
                                Builder clearQuery = parse.buildUpon().clearQuery();
                                for (String str2 : queryParameterNames) {
                                    if (str2.equals("url")) {
                                        str = uri;
                                    } else {
                                        str = parse.getQueryParameter(str2);
                                    }
                                    clearQuery.appendQueryParameter(str2, str);
                                }
                                HashMap hashMap = new HashMap();
                                hashMap.put("type", "card");
                                C8049c.m15979a().mo14202a("livesdk_nobility_page_click", hashMap, null);
                                schema = clearQuery.build().toString();
                            }
                        }
                        C4514j.m10883j().mo10328i().handle(C6049cl.this.getContext(), schema);
                    }
                }
            }
        };
        if ((((IHostApp) C4116c.m10249a(IHostApp.class)).isInMusicallyRegion() || ((Boolean) LiveSettingKeys.LIVE_USERNAME_DISPLAY.mo9431a()).booleanValue()) && this.f16188m.displayId != null) {
            this.f16118A.setText(this.f16188m.displayId);
        } else {
            this.f16118A.setText(this.f16188m.getNickName());
        }
        if (!(this.f16188m.getGender() == 1 || this.f16188m.getGender() == 2)) {
            C9432q.m18691b((View) this.f16165ao, 8);
            C9432q.m18691b((View) this.f16176az, 8);
        }
        if (TextUtils.isEmpty(this.f16188m.getCity())) {
            this.f16119B.setText(R.string.evu);
        } else {
            this.f16119B.setText(this.f16188m.getCity());
        }
        if (!TextUtils.isEmpty(this.f16188m.getSpecialId())) {
            this.f16120F.setVisibility(8);
            this.f16141a.setVisibility(0);
            this.f16141a.setText(C3922z.m9905a((int) R.string.e82, this.f16188m.getSpecialId()));
            this.f16141a.postDelayed(new C6063ct(this), 1000);
        } else {
            this.f16120F.setVisibility(0);
            this.f16141a.setVisibility(8);
            this.f16177b.setVisibility(8);
            if (((Boolean) LiveSettingKeys.LIVE_USERNAME_DISPLAY.mo9431a()).booleanValue()) {
                this.f16120F.setText(this.f16188m.getNickName());
            } else {
                this.f16120F.setText(C3922z.m9905a((int) R.string.eow, this.f16188m.displayId));
            }
        }
        if (!this.f16188m.isVerified() || TextUtils.isEmpty(this.f16188m.getVerifiedReason())) {
            this.f16121G.setVisibility(8);
        } else {
            this.f16121G.setText(this.f16188m.getVerifiedReason());
            this.f16121G.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.f16188m.getSignature())) {
            this.f16122H.setText(R.string.e9c);
        } else {
            this.f16122H.setText(this.f16188m.getSignature());
        }
        this.f16122H.setMaxLines(2);
        this.f16125K.setText(m13212a(C4622w.m11084a(this.f16188m.getFanTicketCount()), 17));
        FollowInfo followInfo = this.f16188m.getFollowInfo();
        if (followInfo != null) {
            this.f16123I.setText(m13212a(C4622w.m11084a(followInfo.getFollowingCount()), 17));
            this.f16124J.setText(m13212a(C4622w.m11084a(followInfo.getFollowerCount()), 17));
        } else {
            this.f16123I.setText("0");
        }
        if (followInfo != null) {
            this.f16124J.setText(m13212a(C4622w.m11084a(followInfo.getFollowerCount()), 17));
        } else {
            this.f16124J.setText("0");
        }
        if (this.f16188m.getUserHonor() != null) {
            this.f16126L.setText(m13212a(C4622w.m11084a(this.f16188m.getUserHonor().mo8152g()), 17));
        } else {
            this.f16126L.setText("0");
        }
        this.f16127M.setText(R.string.ep8);
        if (C9376b.m18558a((Collection<T>) this.f16188m.getTopFans()) || C8607a.f23572a) {
            this.f16128N.setVisibility(8);
        } else {
            int size = this.f16188m.getTopFans().size();
            int i2 = 1;
            for (int i3 = 0; i3 < size; i3++) {
                User user2 = (User) this.f16188m.getTopFans().get(i3);
                if (user2 != null) {
                    if (i2 == 1) {
                        C5213c.m11826b(this.f16130P, user2.getAvatarThumb(), this.f16130P.getWidth(), this.f16130P.getHeight(), 0);
                        this.f16129O.setVisibility(0);
                        this.f16129O.setTag(R.id.hi, user2);
                        this.f16129O.setOnClickListener(this);
                    } else if (i2 == 2) {
                        C5213c.m11826b(this.f16132R, user2.getAvatarThumb(), this.f16132R.getWidth(), this.f16132R.getHeight(), 0);
                        this.f16131Q.setVisibility(0);
                        this.f16131Q.setTag(R.id.hi, user2);
                        this.f16131Q.setOnClickListener(this);
                    } else if (i2 == 3) {
                        C5213c.m11826b(this.f16134T, user2.getAvatarThumb(), this.f16134T.getWidth(), this.f16134T.getHeight(), 0);
                        this.f16133S.setVisibility(0);
                        this.f16133S.setTag(R.id.hi, user2);
                        this.f16133S.setOnClickListener(this);
                    }
                    i2++;
                }
            }
            if (this.f16149aH) {
                this.f16128N.setVisibility(0);
            }
        }
        if (this.f16145aD && this.f16190o) {
            this.f16135U.setVisibility(8);
        } else if (this.f16145aD) {
            this.f16136V.setVisibility(8);
            this.f16137W.setVisibility(8);
            this.f16138X.setVisibility(8);
            if (this.f16148aG) {
                C9432q.m18691b(this.f16139Y, 0);
                this.f16139Y.setTag(this.f16188m);
            }
            this.f16135U.setVisibility(8);
        } else {
            m13219c(this.f16188m);
            this.f16136V.setOnClickListener(this);
            this.f16137W.setOnClickListener(this);
            if (LinkCrossRoomDataHolder.m11103a().f12614e == this.f16188m.getId() || this.f16196u == 2) {
                this.f16138X.setVisibility(8);
            } else {
                this.f16138X.setVisibility(0);
                this.f16138X.setOnClickListener(this);
            }
            if (this.f16190o) {
                C9432q.m18691b(this.f16139Y, 8);
                C9432q.m18691b(this.f16140Z, 8);
            } else if (LinkCrossRoomDataHolder.m11103a().f12614e == this.f16188m.getId()) {
                C9432q.m18691b(this.f16139Y, 0);
                C9432q.m18691b(this.f16140Z, 0);
                this.f16140Z.setOnClickListener(this);
                m13216b();
            } else {
                C9432q.m18691b(this.f16140Z, 8);
                if (this.f16148aG) {
                    C9432q.m18691b(this.f16139Y, 0);
                    this.f16139Y.setTag(this.f16188m);
                }
            }
            this.f16135U.setVisibility(0);
        }
        FansClubMember fansClub = this.f16188m.getFansClub();
        if (fansClub != null) {
            if (fansClub.getPreferData() != null && fansClub.getPreferData().size() > 0) {
                fansClubData = (FansClubData) fansClub.getPreferData().get(Integer.valueOf(0));
            }
            if (FansClubData.isValid(fansClubData) && fansClubData.userFansClubStatus == 1 && fansClubData.badge != null && fansClubData.badge.icons != null) {
                ImageModel imageModel = (ImageModel) fansClubData.badge.icons.get(Integer.valueOf(1));
                if (imageModel != null) {
                    C5213c.m11820a(this.f16161ak, imageModel);
                    this.f16162al.setText(fansClubData.clubName);
                    this.f16163am.setText(C3922z.m9905a((int) R.string.ea3, String.valueOf(fansClubData.level)));
                    if (this.f16150aI) {
                        this.f16160aj.setVisibility(0);
                    }
                }
                this.f16147aF = fansClubData;
            }
        }
        if (this.f16169as != null) {
            if (this.f16188m == null || this.f16188m.getAuthorInfo() == null) {
                this.f16169as.setText("0");
            } else {
                this.f16169as.setText(m13212a(C4622w.m11084a(this.f16188m.getAuthorInfo().f8837f), 17));
            }
        }
        if (this.f16201z) {
            C3014m userHonor = this.f16188m.getUserHonor();
            if (userHonor == null || userHonor.mo8159n() <= 0) {
                this.f16180e.setVisibility(8);
                this.f16182g.setVisibility(8);
            } else {
                C5213c.m11814a((ImageView) this.f16152ab, userHonor.mo8165t());
                this.f16153ac.setText(String.valueOf(userHonor.mo8159n()));
                C5213c.m11814a((ImageView) this.f16156af, userHonor.mo8166u());
                this.f16157ag.setText(String.valueOf(userHonor.mo8163r() - userHonor.mo8153h()));
                this.f16180e.setVisibility(0);
                this.f16182g.setVisibility(4);
            }
            C3003c anchorLevel = this.f16188m.getAnchorLevel();
            if (anchorLevel == null || anchorLevel.mo8134a() <= 0) {
                this.f16181f.setVisibility(8);
                this.f16184i.setVisibility(8);
                return;
            }
            C5213c.m11814a((ImageView) this.f16154ad, anchorLevel.mo8143j());
            this.f16155ae.setText(String.valueOf(anchorLevel.mo8134a()));
            C5213c.m11814a((ImageView) this.f16158ah, anchorLevel.mo8144k());
            this.f16159ai.setText(String.valueOf(anchorLevel.mo8137d() - anchorLevel.mo8135b()));
            this.f16181f.setVisibility(0);
            this.f16184i.setVisibility(4);
        }
    }

    public final void onClick(View view) {
        String str;
        boolean z;
        int i;
        int id = view.getId();
        if (id == R.id.d2f || id == R.id.d2h || id == R.id.d2j) {
            if (!this.f16190o && (view.getTag(R.id.hi) instanceof User)) {
                m13218b((User) view.getTag(R.id.hi));
            }
        } else if (id != R.id.ap6) {
            if (id == R.id.ai0 || id == R.id.aii) {
                if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("enter_from", "live_detail");
                    bundle.putString("action_type", "follow");
                    bundle.putString("source", CustomActionPushReceiver.f104061f);
                    bundle.putString("v1_source", "follow");
                    TTLiveSDKContext.getHostService().mo10315h().mo14516a(this.f16178c, C8337i.m16520a().mo14540a(C4085g.m10200a()).mo14542b(C4085g.m10201b()).mo14544d("live_detail").mo14545e("follow").mo14543c(CustomActionPushReceiver.f104061f).mo14539a(-1).mo14541a()).mo6314a((C1674ab<? super T>) new C8335g<Object>());
                } else if (!C6071da.m13225a(getContext())) {
                    C4575an.m10981a((int) R.string.e77);
                } else {
                    if (this.f16190o) {
                        str = "live_anchor_c_audience";
                    } else if (this.f16189n == 0) {
                        str = "live_audience_c_anchor";
                    } else if (this.f16189n == 2) {
                        str = "right_anchor";
                    } else {
                        str = "live_audience_c_audience";
                    }
                    if (!this.f16188m.isFollowing()) {
                        C5793ao aoVar = this.f16195t;
                        String requestId = this.f16192q.getRequestId();
                        long j = this.f16191p;
                        long id2 = this.f16192q.getId();
                        String labels = this.f16192q.getLabels();
                        if (!aoVar.f15243g) {
                            aoVar.f15243g = true;
                            TTLiveSDKContext.getHostService().mo10315h().mo14517a(((C8327b) ((C8327b) ((C8327b) ((C8327b) ((C8327b) ((C8326a) C8334f.m16517a().mo14503a(j)).mo14504a(requestId)).mo14507b("live_detail")).mo14508c(str)).mo14506b(id2)).mo14509d(labels)).mo14510c()).mo6506a((C1710e<? super T>) new C5805ay<Object>(aoVar), (C1710e<? super Throwable>) new C5806az<Object>(aoVar), (C1706a) new C5810ba(aoVar));
                        }
                        if (C4600j.m11040b(this.f16179d) && this.f16192q.getOwner() != null && this.f16191p == this.f16192q.getOwner().getId()) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("anchor_id", String.valueOf(this.f16192q.getOwner().getId()));
                                jSONObject.put("room_id", String.valueOf(this.f16192q.getId()));
                            } catch (JSONException unused) {
                            }
                            C4116c.m10249a(C8612a.class);
                            C8066a.m16007a().mo14223a(jSONObject).mo14222a(C4600j.m11041c(this.f16179d));
                        }
                        if (C4600j.m11043d(this.f16179d) && this.f16192q.getOwner() != null && this.f16191p == this.f16192q.getOwner().getId()) {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("anchor_id", String.valueOf(this.f16192q.getOwner().getId()));
                                jSONObject2.put("room_id", String.valueOf(this.f16192q.getId()));
                            } catch (JSONException unused2) {
                            }
                            C4116c.m10249a(C8612a.class);
                            C8066a.m16007a().mo14223a(jSONObject2).mo14222a(C4600j.m11044e(this.f16179d));
                        }
                        C4559aa aaVar = this.f16193r;
                        long j2 = this.f16191p;
                        String str2 = this.f16197v;
                        boolean z2 = this.f16190o;
                        int i2 = this.f16189n;
                        String str3 = this.f16198w;
                        if (LinkCrossRoomDataHolder.m11103a().f12614e == this.f16188m.getId()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        aaVar.mo10375a(true, j2, str2, z2, i2, str3, z);
                    } else {
                        C8555i.m16887a();
                        C8556a a = C8555i.m16886a(getContext());
                        a.mo15008c((int) R.string.epc);
                        a.mo15003b(0, (int) R.string.exh, (DialogInterface.OnClickListener) new C6068cy(this, str)).mo15003b(1, (int) R.string.e45, C6069cz.f16227a).mo15005b(C6058co.f16215a).mo15006b(C6059cp.f16216a).mo15011d();
                    }
                }
            } else if (id == R.id.gd) {
                if (!TTLiveSDKContext.getHostService().mo10315h().mo14528a(C8336h.AT)) {
                    C8068g.m16014a(this.f16193r.f12520a);
                    this.f16195t.mo11679d();
                    if (this.f16192q == null || this.f16192q.getOrientation() != 2 || this.f16179d.get("data_is_portrait") == null || ((Boolean) this.f16179d.get("data_is_portrait")).booleanValue()) {
                        String str4 = this.f16188m.displayId;
                        C4495a.m10823a().mo10301a((Object) new C5182ba(1, str4));
                        this.f16179d.lambda$put$1$DataCenter("cmd_wanna_send_message", new C5182ba(1, str4));
                    }
                }
            } else if (id == R.id.am8) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("enter_from_merge", "live_detail");
                bundle2.putString("enter_method", "right_anchor");
                bundle2.putString("enter_from", "live_detail");
                bundle2.putString("source", "right_anchor");
                bundle2.putString("enter_method", "right_anchor");
                bundle2.putLong("from_room_id", this.f16192q.getId());
                bundle2.putString("superior_page_from", this.f16198w);
                bundle2.putLong("anchor_id", this.f16188m.getId());
                bundle2.putInt("back_source", 2);
                C8123a.m16197b(this.f16179d, bundle2);
                C4495a.m10823a().mo10301a((Object) new C5197p(this.f16188m.getLiveRoomId(), "live_detail", bundle2));
            } else if (id == R.id.adi) {
                if (!this.f16145aD && this.f16147aF != null) {
                    long b = TTLiveSDKContext.getHostService().mo10315h().mo14529b();
                    if ((this.f16192q == null || this.f16192q.getOwner() == null || this.f16192q.getOwner().getId() != b) && this.f16147aF.anchorId > 0) {
                        C4514j.m10883j().mo10328i().showUserProfile(this.f16147aF.anchorId);
                    }
                } else if (this.f16145aD && this.f16179d != null) {
                    this.f16195t.mo11679d();
                    C5189i iVar = new C5189i();
                    iVar.f13896a = this.f16147aF;
                    iVar.f13897b = this.f16200y;
                    this.f16179d.lambda$put$1$DataCenter("cmd_show_fans_club_setting", iVar);
                }
            } else if (id == R.id.dmw || id == R.id.dmx) {
                m13215a(this.f16143aB, this.f16180e, this.f16182g, new C6064cu(this));
            } else if (id == R.id.f9 || id == R.id.f_) {
                m13215a(this.f16144aC, this.f16181f, this.f16184i, new C6065cv(this));
            } else if (id == R.id.dml || id == R.id.dmm) {
                m13215a(this.f16143aB, this.f16182g, this.f16180e, new C6066cw(this));
            } else if (id == R.id.f0 || id == R.id.f1) {
                m13215a(this.f16144aC, this.f16184i, this.f16181f, new C6067cx(this));
            } else if (id == this.f16175ay.getId() && this.f16192q != null && this.f16188m != null) {
                if (this.f16188m.getFollowInfo() != null) {
                    i = (int) this.f16188m.getFollowInfo().getPushStatus();
                } else {
                    i = 0;
                }
                String valueOf = String.valueOf(this.f16192q.getId());
                String secUid = this.f16188m.getSecUid();
                String valueOf2 = String.valueOf(this.f16191p);
                C6086dh dhVar = new C6086dh();
                C5789al alVar = new C5789al();
                dhVar.f16304a = alVar;
                alVar.mo8520a(dhVar);
                dhVar.f16306c = valueOf;
                if (i == 1) {
                    dhVar.f16309f = C6088a.All;
                } else if (i != 3) {
                    dhVar.f16309f = C6088a.Part;
                } else {
                    dhVar.f16309f = C6088a.No;
                }
                dhVar.f16305b = this;
                dhVar.f16307d = secUid;
                dhVar.f16308e = valueOf2;
                if (getFragmentManager() != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("enter_from_merge", "message");
                    hashMap.put("enter_method", "live_cell");
                    hashMap.put("anchor_id", String.valueOf(this.f16191p));
                    hashMap.put("room_id", String.valueOf(this.f16192q.getId()));
                    C8049c.m15979a().mo14202a("livesdk_live_notification_button_click", hashMap, new C8059j().mo14218f("click").mo14214b(CustomActionPushReceiver.f104061f).mo14213a("anchor_profile"));
                    dhVar.show(getFragmentManager(), "LiveProfileNotificationSetting");
                    if (!(getActivity() == null || getActivity().getSupportFragmentManager() == null)) {
                        C0679r a2 = getActivity().getSupportFragmentManager().mo2225a();
                        a2.mo2193b(this);
                        Fragment parentFragment = getParentFragment();
                        if (parentFragment != null) {
                            a2.mo2193b(parentFragment);
                        }
                        a2.mo2189b();
                    }
                }
            }
        } else if (!this.f16190o && this.f16188m != null) {
            m13218b(this.f16188m);
        }
    }

    /* renamed from: a */
    private static Spannable m13212a(String str, int i) {
        SpannableString spannableString = new SpannableString(str);
        int length = str.length() - 1;
        int length2 = str.length() - 1;
        while (true) {
            if (length2 >= str.length()) {
                break;
            } else if (Character.isDigit(str.charAt(length2))) {
                length = length2 + 1;
                break;
            } else {
                length2--;
            }
        }
        if (length != 0 && length <= str.length() - 1) {
            spannableString.setSpan(new AbsoluteSizeSpan(17, true), length, str.length(), 33);
        }
        return spannableString;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16146aE = true;
        ((C4002ac) C4495a.m10823a().mo10300a(C8615a.class).mo6513a(C4064k.m10180a(this)).mo6525a((C2203w<T, ? extends R>) C4021e.m10137a((Fragment) this))).mo9405a((C1710e<? super T>) new C6056cm<Object>(this));
        this.f16148aG = false;
        this.f16149aH = false;
        this.f16150aI = false;
        this.f16201z = false;
        this.f16151aa = layoutInflater.inflate(R.layout.ako, viewGroup, false);
        this.f16118A = (TextView) this.f16151aa.findViewById(R.id.bpp);
        this.f16166ap = (RecyclerView) this.f16151aa.findViewById(R.id.dmp);
        this.f16119B = (TextView) this.f16151aa.findViewById(R.id.bi7);
        this.f16120F = (TextView) this.f16151aa.findViewById(R.id.apr);
        this.f16141a = (TextView) this.f16151aa.findViewById(R.id.cqj);
        this.f16177b = this.f16151aa.findViewById(R.id.cpc);
        this.f16121G = (TextView) this.f16151aa.findViewById(R.id.dup);
        this.f16122H = (TextView) this.f16151aa.findViewById(R.id.cof);
        this.f16123I = (TextView) this.f16151aa.findViewById(R.id.aio);
        this.f16124J = (TextView) this.f16151aa.findViewById(R.id.aij);
        this.f16125K = (TextView) this.f16151aa.findViewById(R.id.d01);
        this.f16126L = (TextView) this.f16151aa.findViewById(R.id.a5f);
        this.f16127M = (TextView) this.f16151aa.findViewById(R.id.cl6);
        this.f16128N = this.f16151aa.findViewById(R.id.d2u);
        this.f16129O = this.f16151aa.findViewById(R.id.d2f);
        this.f16130P = (ImageView) this.f16151aa.findViewById(R.id.d2e);
        this.f16131Q = this.f16151aa.findViewById(R.id.d2h);
        this.f16132R = (ImageView) this.f16151aa.findViewById(R.id.d2g);
        this.f16133S = this.f16151aa.findViewById(R.id.d2j);
        this.f16134T = (ImageView) this.f16151aa.findViewById(R.id.d2i);
        this.f16135U = this.f16151aa.findViewById(R.id.ac);
        this.f16136V = (TextView) this.f16151aa.findViewById(R.id.ai0);
        this.f16137W = (TextView) this.f16151aa.findViewById(R.id.aii);
        this.f16174ax = (ImageView) this.f16151aa.findViewById(R.id.dz3);
        this.f16175ay = this.f16151aa.findViewById(R.id.dz4);
        this.f16138X = this.f16151aa.findViewById(R.id.gd);
        this.f16139Y = this.f16151aa.findViewById(R.id.ap6);
        this.f16140Z = this.f16151aa.findViewById(R.id.am8);
        this.f16160aj = this.f16151aa.findViewById(R.id.adi);
        this.f16161ak = (HSImageView) this.f16151aa.findViewById(R.id.adh);
        this.f16162al = (TextView) this.f16151aa.findViewById(R.id.ado);
        this.f16163am = (TextView) this.f16151aa.findViewById(R.id.adl);
        this.f16164an = this.f16151aa.findViewById(R.id.bib);
        this.f16165ao = (TextView) this.f16151aa.findViewById(R.id.akd);
        this.f16171au = this.f16151aa.findViewById(R.id.bic);
        this.f16173aw = (ImageView) this.f16151aa.findViewById(R.id.bid);
        this.f16176az = (ImageView) this.f16151aa.findViewById(R.id.e_a);
        this.f16142aA = this.f16151aa.findViewById(R.id.atq);
        if (this.f16201z) {
            this.f16180e = this.f16151aa.findViewById(R.id.dmw);
            this.f16152ab = (HSImageView) this.f16151aa.findViewById(R.id.dmv);
            this.f16153ac = (TextView) this.f16151aa.findViewById(R.id.dmu);
            this.f16181f = this.f16151aa.findViewById(R.id.f9);
            this.f16154ad = (HSImageView) this.f16151aa.findViewById(R.id.f8);
            this.f16155ae = (TextView) this.f16151aa.findViewById(R.id.f7);
            this.f16182g = this.f16151aa.findViewById(R.id.dml);
            this.f16156af = (HSImageView) this.f16151aa.findViewById(R.id.dmk);
            this.f16183h = this.f16151aa.findViewById(R.id.dmn);
            this.f16157ag = (TextView) this.f16151aa.findViewById(R.id.dmj);
            this.f16184i = this.f16151aa.findViewById(R.id.f0);
            this.f16158ah = (HSImageView) this.f16151aa.findViewById(R.id.ez);
            this.f16185j = this.f16151aa.findViewById(R.id.f2);
            this.f16159ai = (TextView) this.f16151aa.findViewById(R.id.ey);
            this.f16151aa.findViewById(R.id.f1).setOnClickListener(this);
            this.f16151aa.findViewById(R.id.dmm).setOnClickListener(this);
            this.f16151aa.findViewById(R.id.f_).setOnClickListener(this);
            this.f16151aa.findViewById(R.id.dmx).setOnClickListener(this);
            m13214a(this.f16180e);
            m13214a(this.f16182g);
            m13214a(this.f16181f);
            m13214a(this.f16184i);
        }
        this.f16160aj.setOnClickListener(this);
        this.f16120F.setLongClickable(true);
        this.f16120F.setOnLongClickListener(new C6057cn(this));
        this.f16141a.setLongClickable(true);
        this.f16141a.setOnLongClickListener(new C6062cs(this));
        this.f16167aq = new C6206fh();
        this.f16166ap.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f16166ap.setAdapter(this.f16167aq);
        this.f16139Y.setOnClickListener(this);
        this.f16175ay.setOnClickListener(this);
        this.f16172av = (LinearLayout) this.f16151aa.findViewById(R.id.a5i);
        this.f16170at = (LinearLayout) this.f16151aa.findViewById(R.id.d04);
        this.f16168ar = (LinearLayout) this.f16151aa.findViewById(R.id.bar);
        this.f16169as = (TextView) this.f16151aa.findViewById(R.id.baq);
        C9432q.m18691b((View) this.f16168ar, 0);
        C9432q.m18691b((View) this.f16170at, 8);
        C9432q.m18691b((View) this.f16172av, 8);
        C9432q.m18691b(this.f16139Y, 8);
        if (!((IHostApp) C4116c.m10249a(IHostApp.class)).isInMusicallyRegion() || ((Boolean) LiveSettingKeys.LIVE_USERNAME_DISPLAY.mo9431a()).booleanValue()) {
            C9432q.m18691b((View) this.f16173aw, 8);
            C9432q.m18691b(this.f16171au, 8);
            C9432q.m18691b((View) this.f16119B, 8);
        } else {
            C9432q.m18691b(this.f16164an, 8);
        }
        mo12080a(this.f16188m);
        if (this.f16179d != null) {
            this.f16179d.lambda$put$1$DataCenter("hide_share_lead", Boolean.valueOf(true));
        }
        return this.f16151aa;
    }

    /* renamed from: a */
    private void m13215a(final Animator[] animatorArr, final View view, final View view2, final Runnable runnable) {
        m13213a(this.f16186k);
        m13213a(this.f16187l);
        m13213a(animatorArr[0]);
        m13213a(animatorArr[1]);
        animatorArr[0] = ObjectAnimator.ofFloat(view, "rotationX", new float[]{0.0f, -90.0f});
        animatorArr[1] = ObjectAnimator.ofFloat(view2, "rotationX", new float[]{90.0f, 0.0f});
        animatorArr[0].addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                view.setVisibility(4);
                animatorArr[1].start();
            }

            public final void onAnimationStart(Animator animator) {
                view.setClickable(false);
                view2.setClickable(false);
                view2.setVisibility(4);
            }
        });
        animatorArr[1].addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                view2.setVisibility(0);
            }

            public final void onAnimationEnd(Animator animator) {
                view2.setClickable(true);
                view2.setClickable(true);
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        animatorArr[0].start();
    }
}
