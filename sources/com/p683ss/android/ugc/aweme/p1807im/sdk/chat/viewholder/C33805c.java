package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.content.Context;
import android.content.Intent;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p706c.C11205n;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.IMMessageBgStyleExperiment;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33358ae;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33711v;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33711v.C33714a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33888y;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.CheckMessage;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SystemContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.TextContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33453a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.view.ChatDiggLayout;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like.C33859c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like.C33860d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like.C33870h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34044o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35178a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35220bb;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc.C35225a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.c */
public abstract class C33805c<CONTENT extends BaseContent> extends C1352v {

    /* renamed from: q */
    static int f87693q = -1;

    /* renamed from: A */
    private View f87694A;

    /* renamed from: B */
    private ImageView f87695B;

    /* renamed from: C */
    private C33754an f87696C;

    /* renamed from: D */
    private String f87697D;

    /* renamed from: E */
    private final SimpleOnGestureListener f87698E = new SimpleOnGestureListener() {
        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return true;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return super.onSingleTapUp(motionEvent);
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (C33805c.this.f87706h != null) {
                C33805c.this.f87706h.mo71890a(Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()), true);
            }
            return true;
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (!(C33805c.this.f87706h == null || C33805c.this.f87715r == null || C33805c.this.f87708j == null)) {
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                C33805c cVar = C33805c.this;
                View view = C33805c.this.f87708j;
                view.getLocationOnScreen(cVar.f87716s);
                boolean z = false;
                int i = cVar.f87716s[0];
                int i2 = cVar.f87716s[1];
                int width = view.getWidth();
                int height = view.getHeight();
                if (rawX >= i && rawX <= i + width && rawY >= i2 && rawY <= i2 + height) {
                    z = true;
                }
                if (z) {
                    C33805c.this.f87715r.onClick(C33805c.this.f87708j);
                }
            }
            return super.onSingleTapConfirmed(motionEvent);
        }
    };

    /* renamed from: a */
    public int f87699a = 7;

    /* renamed from: b */
    public int f87700b;

    /* renamed from: c */
    public CheckBox f87701c;

    /* renamed from: d */
    public FrameLayout f87702d;

    /* renamed from: e */
    protected DmtTextView f87703e;

    /* renamed from: f */
    protected ImageView f87704f;

    /* renamed from: g */
    public View f87705g;

    /* renamed from: h */
    public C33860d f87706h;

    /* renamed from: i */
    protected String f87707i;

    /* renamed from: j */
    protected View f87708j;

    /* renamed from: k */
    protected CONTENT f87709k;

    /* renamed from: l */
    public int f87710l;

    /* renamed from: m */
    protected SystemContent f87711m;

    /* renamed from: n */
    public C11207p f87712n;

    /* renamed from: o */
    protected C35225a f87713o;

    /* renamed from: p */
    protected C33714a f87714p;

    /* renamed from: r */
    protected OnClickListener f87715r;

    /* renamed from: s */
    int[] f87716s = new int[2];

    /* renamed from: t */
    GestureDetector f87717t = null;

    /* renamed from: u */
    private int f87718u;

    /* renamed from: v */
    private int f87719v;

    /* renamed from: w */
    private TextView f87720w;

    /* renamed from: x */
    private TextView f87721x;

    /* renamed from: y */
    private AvatarImageView f87722y;

    /* renamed from: z */
    private DmtTextView f87723z;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo71786a(C11207p pVar, int i) {
    }

    /* renamed from: c */
    public View mo71804c() {
        return this.itemView;
    }

    /* renamed from: f */
    public final void mo71851f() {
        this.f87706h = null;
    }

    /* renamed from: a */
    public void mo71847a(IMUser iMUser, C11207p pVar, int i) {
        this.f87697D = null;
        if (iMUser == null) {
            if (pVar != null) {
                this.f87697D = String.valueOf(pVar.getSender());
                C34010e.m77748a().mo71954a(String.valueOf(pVar.getSender()), pVar.getSecSender());
            }
            return;
        }
        if (this.f87722y != null) {
            LayoutParams layoutParams = (LayoutParams) this.f87722y.getLayoutParams();
            if (pVar.getConversationType() != C11170a.f30116b || pVar.isSelf()) {
                layoutParams.topMargin = 0;
            } else {
                layoutParams.topMargin = (int) C9432q.m18687b(C11010c.m22280a(), 2.0f);
            }
            this.f87722y.setLayoutParams(layoutParams);
            this.f87722y.setTag(67108864, String.valueOf(pVar.getSender()));
            this.f87722y.setTag(50331648, Integer.valueOf(3));
            this.f87713o.mo73331a(this.f87722y);
            C23515d.m57669a((RemoteImageView) this.f87722y, iMUser.getAvatarThumb());
            C35178a.m79422a((ImageView) this.f87722y, iMUser);
        }
        if (this.f87723z != null) {
            if (pVar.isSelf() || !mo71820b(pVar)) {
                this.f87723z.setVisibility(8);
            } else {
                this.f87723z.setText(iMUser.getDisplayName());
                this.f87723z.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo71848a(IMUser iMUser, IMUser iMUser2, C11207p pVar, boolean z) {
        boolean z2;
        if (this.f87706h != null) {
            boolean isSelf = pVar.isSelf();
            IMUser iMUser3 = isSelf ? iMUser : iMUser2;
            if (isSelf) {
                iMUser = iMUser2;
            }
            C33860d dVar = this.f87706h;
            C52711k.m112240b(pVar, "msg");
            dVar.f87844h = pVar;
            dVar.f87845i = z;
            Map propertyItemListMap = pVar.getPropertyItemListMap();
            String str = null;
            Iterable<C11205n> iterable = propertyItemListMap != null ? (List) propertyItemListMap.get("e:love") : null;
            Object uid = iMUser3 != null ? iMUser3.getUid() : null;
            if (iMUser != null) {
                str = iMUser.getUid();
            }
            boolean z3 = false;
            if (iterable != null) {
                z2 = false;
                for (C11205n nVar : iterable) {
                    if (nVar != null) {
                        CharSequence str2 = nVar.idempotent_id.toString();
                        if (TextUtils.equals((CharSequence) uid, str2)) {
                            z3 = true;
                        } else if (TextUtils.equals(str, str2)) {
                            z2 = true;
                        }
                    }
                }
            } else {
                z2 = false;
            }
            StringBuilder sb = new StringBuilder("bind->");
            sb.append(z3);
            sb.append(',');
            sb.append(z2);
            C32458a.m75141a(3, "DmHelper", sb.toString());
            if (dVar.f87843g.isEmpty()) {
                dVar.mo71889a(iMUser3, z3);
                dVar.mo71889a(iMUser, z2);
                if (iMUser != null) {
                    String uid2 = iMUser.getUid();
                    if (uid2 != null) {
                        dVar.f87843g.put(uid2, new C33859c(z2, iMUser));
                    }
                }
            } else {
                C33859c cVar = (C33859c) dVar.f87843g.get(uid);
                if (cVar != null) {
                    cVar.f87834a = z3;
                }
                C33859c cVar2 = (C33859c) dVar.f87843g.get(str);
                if (cVar2 != null) {
                    cVar2.f87834a = z2;
                }
            }
            dVar.mo71891a(z);
            return;
        }
        StringBuilder sb2 = new StringBuilder("dmLikePanel is null. do nothing:");
        sb2.append(this.f87699a);
        C32458a.m75141a(3, "DmHelper", sb2.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo71782b() {
        if (this.f87694A != null) {
            this.f87694A.setOnClickListener(new C33844e(this));
        }
    }

    /* renamed from: e */
    public void mo71850e() {
        if (C53755c.m114319a().mo112958b((Object) this)) {
            C53755c.m114319a().mo112959c((Object) this);
        }
    }

    /* renamed from: d */
    public void mo71849d() {
        if (!TextUtils.isEmpty(this.f87697D) && !C53755c.m114319a().mo112958b((Object) this)) {
            C53755c.m114319a().mo112955a((Object) this);
        }
        if (this.f87703e != null) {
            if (this.f87709k != null && this.f87709k.getExtContent() != null) {
                C33711v.m77218a(this.f87709k.getExtContent());
            } else if (this.f87711m != null) {
                C33711v.m77218a(this.f87711m);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        String str;
        this.f87703e = (DmtTextView) mo71845a((int) R.id.bs0);
        this.f87721x = (TextView) mo71845a((int) R.id.bng);
        this.f87723z = (DmtTextView) mo71845a((int) R.id.dn1);
        this.f87722y = (AvatarImageView) mo71845a((int) R.id.i0);
        this.f87705g = (View) mo71845a((int) R.id.drh);
        this.f87701c = (CheckBox) mo71845a((int) R.id.r8);
        this.f87702d = (FrameLayout) mo71845a((int) R.id.b9l);
        this.f87694A = (View) mo71845a((int) R.id.dvw);
        this.f87720w = (TextView) mo71845a((int) R.id.dlg);
        this.f87695B = (ImageView) mo71845a((int) R.id.dvx);
        ViewGroup viewGroup = (ViewGroup) mo71845a((int) R.id.ejt);
        if (viewGroup != null) {
            this.f87706h = new C33860d(viewGroup, this.f87699a);
        }
        if (C35243bl.m79710a(this.itemView.getContext())) {
            str = "open";
        } else {
            str = "install";
        }
        C35190af.m79445a(5, str, "duoshan_banner_show");
        DmtTextView dmtTextView = (DmtTextView) mo71845a((int) R.id.deb);
        if (dmtTextView != null) {
            this.f87696C = new C33754an(dmtTextView, this);
        }
    }

    /* renamed from: b */
    private static boolean mo71820b(C11207p pVar) {
        if (pVar.getConversationType() == C11170a.f30116b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m77464a(C11207p pVar) {
        if (pVar == null || (pVar.getMsgStatus() != 2 && pVar.getMsgStatus() != 5)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <T> T mo71845a(int i) {
        T findViewById = this.itemView.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        return null;
    }

    /* renamed from: a */
    public void mo71783a(OnClickListener onClickListener) {
        if (this.f87722y != null) {
            this.f87722y.setOnClickListener(onClickListener);
        }
        if (this.f87708j == null || this.f87706h != null) {
            this.f87715r = onClickListener;
        } else {
            this.f87708j.setOnClickListener(onClickListener);
        }
    }

    @C53771m
    public void onUserUpdate(C34044o oVar) {
        if (TextUtils.equals(this.f87697D, oVar.f88009a)) {
            IMUser b = C34010e.m77748a().mo71964b(oVar.f88009a);
            if (b != null) {
                UrlModel avatarThumb = b.getAvatarThumb();
                if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                    C23515d.m57668a((RemoteImageView) this.f87722y, 2131953301);
                } else {
                    C23515d.m57669a((RemoteImageView) this.f87722y, avatarThumb);
                }
                this.f87723z.setText(b.getDisplayName());
            }
        }
    }

    /* renamed from: a */
    public void mo71840a(OnLongClickListener onLongClickListener) {
        if (this.f87722y != null) {
            this.f87722y.setOnLongClickListener(onLongClickListener);
        }
        if (this.f87708j != null) {
            this.f87708j.setOnLongClickListener(onLongClickListener);
        }
    }

    /* renamed from: a */
    public final void mo71846a(ChatDiggLayout chatDiggLayout) {
        if (this.f87706h != null) {
            this.f87706h.f87837a = chatDiggLayout;
            if (this.f87708j != null) {
                this.f87708j.setOnClickListener(null);
                this.f87708j.setOnTouchListener(new C33846g(this, C33870h.m77637a(this.f87708j)));
            }
        }
    }

    /* renamed from: a */
    private static CharSequence m77462a(Context context, long j) {
        return C35220bb.m79612c(context, j);
    }

    /* renamed from: a */
    public static void m77463a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public C33805c(View view, int i) {
        super(view);
        Context context = this.itemView.getContext();
        this.f87710l = 0;
        this.f87700b = (int) C9432q.m18687b(context, 8.0f);
        this.f87718u = (int) C9432q.m18687b(context, 5.0f);
        this.f87719v = (int) C9432q.m18687b(context, 20.0f);
        this.f87713o = C35225a.m79617l();
        this.f87717t = new GestureDetector(context, this.f87698E);
        this.f87713o.f90524k = this.f87717t;
        this.f87714p = C33711v.m77215a(context.getResources().getColor(R.color.av1), this.f87707i);
        mo71779a();
        mo71782b();
        if (f87693q == -1) {
            f87693q = C10181b.m20511a().mo18168a(IMMessageBgStyleExperiment.class, true, "im_message_bubble_bg_strategy", 31744, 0);
        }
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, CONTENT content, int i) {
        int i2;
        int i3;
        this.f87712n = pVar;
        this.f87709k = content;
        this.f87707i = String.valueOf(pVar.getSender());
        this.f87699a = C33888y.valueOf(pVar).getItemViewType();
        ((RecyclerView.LayoutParams) this.itemView.getLayoutParams()).setMargins(0, this.f87700b, 0, this.f87700b);
        if (this.f87720w != null) {
            if (C35279p.m79763a()) {
                i2 = R.color.art;
            } else {
                i2 = R.color.ri;
            }
            this.f87720w.setTextColor(C11010c.m22280a().getResources().getColor(i2));
            this.f87720w.setPadding(this.f87720w.getPaddingLeft(), this.f87720w.getPaddingTop(), this.f87720w.getPaddingRight(), this.f87700b * 2);
            TextView textView = this.f87720w;
            if (this.f87712n.getLocalExt().containsKey("show_unread_message_tips")) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            textView.setVisibility(i3);
        }
        if (this.f87721x != null) {
            if (pVar2 == null && this.f87699a != 9) {
                this.f87721x.setText(m77462a(this.itemView.getContext(), pVar.getCreatedAt()));
                this.f87721x.setVisibility(0);
            } else if (pVar2 == null || pVar.getCreatedAt() - pVar2.getCreatedAt() < 300000) {
                this.f87721x.setVisibility(8);
            } else {
                this.f87721x.setText(m77462a(this.itemView.getContext(), pVar.getCreatedAt()));
                this.f87721x.setVisibility(0);
            }
            if (i == 0) {
                this.f87721x.setPadding(this.f87721x.getPaddingLeft(), 0, this.f87721x.getPaddingRight(), this.f87721x.getPaddingBottom());
            } else {
                this.f87721x.setPadding(this.f87721x.getPaddingLeft(), (int) C9432q.m18687b(C11010c.m22280a(), 4.0f), this.f87721x.getPaddingRight(), this.f87721x.getPaddingBottom());
            }
            if (this.f87721x.getVisibility() == 0 && this.f87720w != null && this.f87720w.getVisibility() == 0) {
                this.f87720w.setPadding(this.f87720w.getPaddingLeft(), this.f87720w.getPaddingTop(), this.f87720w.getPaddingRight(), 0);
            }
        }
        if (this.f87708j != null) {
            this.f87708j.setTag(100663296, content);
            this.f87708j.setTag(134217728, pVar);
            mo71786a(pVar, f87693q);
        }
        if (this.f87722y != null) {
            this.f87722y.setTag(134217728, pVar);
            if (C33453a.m76678a(pVar.getConversationId()) && !C33453a.m76682e()) {
                this.f87722y.setEnabled(false);
            }
        }
        if (this.f87694A != null) {
            if (C35243bl.m79712b()) {
                C11207p pVar3 = this.f87712n;
                boolean z = true;
                if (pVar3.isSelf() || !C35197am.m79567e(pVar3) || ((content instanceof TextContent) && ((TextContent) content).isDefault())) {
                    z = false;
                }
                if (z) {
                    this.f87694A.setVisibility(0);
                }
            }
            this.f87694A.setVisibility(8);
        }
        if (this.f87696C != null) {
            C52711k.m112240b(pVar, "message");
        }
        try {
            this.f87711m = CheckMessage.getContent((CheckMessage) C35277o.m79760a((String) pVar.getLocalExt().get("s:send_response_check_msg"), CheckMessage.class));
        } catch (Exception unused) {
            this.f87711m = null;
        }
        if (this.f87703e != null) {
            if (content != null && content.getExtContent() != null) {
                C33711v.m77217a(pVar, content.getExtContent(), this.f87703e, this.f87707i);
            } else if (this.f87711m != null) {
                C33711v.m77217a(pVar, this.f87711m, this.f87703e, this.f87707i);
            } else {
                this.f87703e.setText("");
                this.f87703e.setVisibility(8);
            }
        }
        if (!(pVar.getMsgType() == 1007 || content == null || content.getExtContent() == null || TextUtils.isEmpty(content.getExtContent().getStrongTips()))) {
            Context context = mo71804c().getContext();
            SystemContent extContent = content.getExtContent();
            StringBuilder sb = new StringBuilder();
            sb.append(pVar.getSender());
            C33358ae.m76519a(context, extContent, sb.toString(), 2);
        }
        if (!mo71820b(this.f87712n)) {
            AvatarImageView avatarImageView = this.f87722y;
            C11207p pVar4 = this.f87712n;
            if (pVar4 != null) {
                String conversationId = pVar4.getConversationId();
                String uuid = pVar4.getUuid();
                if (C34004b.m77717a().f87929a.f91092a && avatarImageView != null) {
                    avatarImageView.setOnLongClickListener(new OnLongClickListener(conversationId, uuid) {

                        /* renamed from: a */
                        final /* synthetic */ String f88027a;

                        /* renamed from: b */
                        final /* synthetic */ String f88028b;

                        public final boolean onLongClick(View view) {
                            Context context = view.getContext();
                            String str = this.f88027a;
                            String str2 = this.f88028b;
                            Intent intent = new Intent(context, DebugActivity.class);
                            intent.putExtra("EXTRA_CONVERSATION_ID", str);
                            intent.putExtra("EXTRA_MSG_UUID", str2);
                            context.startActivity(intent);
                            return false;
                        }

                        {
                            this.f88027a = r1;
                            this.f88028b = r2;
                        }
                    });
                }
            }
        }
    }
}
