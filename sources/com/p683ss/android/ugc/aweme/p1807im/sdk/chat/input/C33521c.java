package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Message;
import android.os.SystemClock;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.p042b.C1027f;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.p702im.core.internal.utils.C11501n;
import com.bytedance.p702im.core.internal.utils.C11501n.C11502a;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11245w.C11247a;
import com.bytedance.p702im.sugar.input.C11504a.C11505a;
import com.bytedance.p702im.sugar.input.SoftInputResizeFuncLayoutView;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29361p;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1682c.p1683a.C29299b;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29406a;
import com.p683ss.android.ugc.aweme.emoji.p1693i.C29410a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33243e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImMTInputGifSettings;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33353ab;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33354ac;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33359af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio.widget.AudioRecordBar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33550b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33550b.C33553a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33558e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifpanel.C33588b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.C33592a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.giphy.C33600a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.giphy.p1828a.C33603a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.giphy.p1828a.C33604b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.giphy.p1828a.C33605c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.giphy.p1828a.C33609g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1824a.C33593a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1824a.C33594b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1825b.C33595a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1825b.C33596b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1826c.p1827a.C33598b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.gifsearch.p1826c.p1827a.C33599c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.p1822a.C33476a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.p1822a.C33476a.C33480c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo.C33672w;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.EmojiContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.TextContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1813a.C33350a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33453a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.view.MentionEditText.C33727e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.view.SearchableEditText;
import com.p683ss.android.ugc.aweme.p1807im.sdk.commercialize.C33987a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34042m;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35211ax;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc.C35225a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35237bj;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35237bj.C35241a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.C35402h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1896a.C35383b;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.c */
public class C33521c extends C34042m implements C11502a, C11505a, C33519b {

    /* renamed from: a */
    public static final String f86870a = "c";

    /* renamed from: A */
    private boolean f86871A;

    /* renamed from: B */
    private boolean f86872B = true;

    /* renamed from: C */
    private int f86873C;

    /* renamed from: D */
    private int f86874D;

    /* renamed from: E */
    private int f86875E;

    /* renamed from: F */
    private int f86876F;

    /* renamed from: G */
    private int f86877G;

    /* renamed from: H */
    private boolean f86878H;

    /* renamed from: I */
    private OnClickListener f86879I;

    /* renamed from: J */
    private OnKeyListener f86880J;

    /* renamed from: K */
    private TextWatcher f86881K;

    /* renamed from: L */
    private C33593a<C33605c> f86882L;

    /* renamed from: M */
    private C33593a<C33599c> f86883M;

    /* renamed from: b */
    public int f86884b;

    /* renamed from: c */
    public C33519b f86885c;

    /* renamed from: d */
    public SearchableEditText f86886d;

    /* renamed from: e */
    ImageView f86887e;

    /* renamed from: f */
    public ImageView f86888f;

    /* renamed from: g */
    ImageView f86889g;

    /* renamed from: h */
    public LinearLayout f86890h;

    /* renamed from: i */
    public ViewGroup f86891i;

    /* renamed from: j */
    public RecyclerView f86892j;

    /* renamed from: k */
    public TextView f86893k;

    /* renamed from: l */
    public C33476a f86894l;

    /* renamed from: m */
    public C33550b f86895m;

    /* renamed from: n */
    public C33353ab f86896n;

    /* renamed from: o */
    public List<C33604b> f86897o;

    /* renamed from: p */
    public C33536c f86898p;

    /* renamed from: q */
    public C11501n f86899q = new C11501n(this);

    /* renamed from: r */
    private boolean f86900r;

    /* renamed from: s */
    private C33558e f86901s;

    /* renamed from: t */
    private SoftInputResizeFuncLayoutView f86902t;

    /* renamed from: u */
    private View f86903u;

    /* renamed from: v */
    private C33535b f86904v;

    /* renamed from: w */
    private C33588b f86905w;

    /* renamed from: x */
    private int f86906x = 4;

    /* renamed from: y */
    private int f86907y = -1;

    /* renamed from: z */
    private boolean f86908z;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.c$a */
    public interface C33534a {
        /* renamed from: d */
        void mo70687d();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.c$b */
    public interface C33535b {
        /* renamed from: a */
        void mo70663a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.c$c */
    class C33536c implements Runnable {

        /* renamed from: a */
        long f86923a;

        /* renamed from: b */
        boolean f86924b;

        /* renamed from: d */
        private IMUser f86926d;

        public final void run() {
            this.f86923a = SystemClock.elapsedRealtime();
            mo71001a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo71001a() {
            int i;
            if (!C35279p.m79763a()) {
                IMUser iMUser = this.f86926d;
                if (iMUser != null && (iMUser.getCommerceUserLevel() != 0 || iMUser.isWithCommerceEntry())) {
                    new StringBuilder("try send user action, hasContent=").append(this.f86924b);
                    String uid = iMUser.getUid();
                    if (!TextUtils.isEmpty(uid)) {
                        C11180b a = C11182d.m22641a().mo20658a(C11190e.m22687a(Long.valueOf(uid).longValue()));
                        if (a != null) {
                            C11247a aVar = new C11247a();
                            if (this.f86924b) {
                                i = 3;
                            } else {
                                i = 4;
                            }
                            aVar.mo20940a(i).mo20941a(a).mo20943a();
                        }
                    }
                }
            }
        }

        public C33536c(C33353ab abVar) {
            this.f86926d = C33521c.this.f86896n.getSingleChatFromUser();
        }
    }

    /* renamed from: a */
    public final void mo20108a() {
    }

    /* renamed from: a */
    public final void mo70581a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.f86886d.getText() == null || this.f86886d.getText().length() + str.length() <= C35197am.m79552a()) {
                if (this.f86907y == -1) {
                    mo70976d(-2);
                }
                this.f86886d.mo71760a(str);
                return;
            }
            C10691a.m21542b(mo70981i(), (int) R.string.bkj).mo19066a();
        }
    }

    /* renamed from: a */
    public final void mo70582a(String str, String str2) {
        mo70976d(-2);
        if (!TextUtils.isEmpty(str)) {
            if (this.f86886d.getText() == null || this.f86886d.getText().length() + str.length() <= C35197am.m79552a()) {
                this.f86886d.mo71761a(str, str2);
            } else {
                C10691a.m21542b(mo70981i(), (int) R.string.bkj).mo19066a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo70971a(boolean z) {
        if (z) {
            this.f86894l.mo70896d();
            mo70985m();
            this.f86899q.sendEmptyMessage(1);
            return;
        }
        mo70989p();
        this.f86893k.setVisibility(8);
        this.f86892j.setVisibility(8);
        mo70985m();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo70968a(CharSequence charSequence) {
        String str;
        String str2;
        String a = C35211ax.m79597a(charSequence.toString());
        int i = this.f86894l.f86754a;
        if (C35279p.m79763a()) {
            m76827s();
            if (TextUtils.isEmpty(a)) {
                C33600a.m76995a(i, this.f86882L);
            } else {
                C33600a.m76997a(i, a, this.f86882L);
            }
        } else if (TextUtils.isEmpty(a)) {
            mo70977d(true);
        } else if (a.length() <= 8) {
            m76828t();
            if (this.f86896n.isSingleChat()) {
                str2 = "im";
                str = this.f86896n.getSingleChatFromUserId();
            } else {
                str2 = "im_group";
                str = this.f86896n.getConversationId();
            }
            C35286u.m79876a(a, i, str2, str, this.f86883M);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo70970a(List<C29366a> list) {
        if (this.f86901s == null) {
            this.f86901s = new C33558e(this, this.f86891i, this.f86896n.getConversationId());
        }
        this.f86901s.mo71019a(list);
    }

    /* renamed from: a */
    public final void mo70969a(Runnable runnable) {
        if (this.f86902t.mo22250c() == -2) {
            runnable.run();
        }
    }

    /* renamed from: b */
    public final void mo70583b() {
        this.f86886d.setText("");
    }

    /* renamed from: d */
    public final void mo70587d() {
        this.f86902t.mo22249b();
    }

    /* renamed from: i */
    public final Context mo70981i() {
        return this.f86891i.getContext();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo70983k() {
        mo70971a(false);
    }

    /* renamed from: s */
    private void m76827s() {
        if (this.f86882L == null) {
            this.f86882L = new C33594b<C33605c>() {
                /* renamed from: a */
                public final void mo70990a() {
                    super.mo70990a();
                    C33521c.this.mo70989p();
                    C33521c.this.f86894l.mo70895c();
                    C33521c.this.f86893k.setVisibility(8);
                    C33521c.this.f86892j.setVisibility(0);
                    C10691a.m21542b(C33521c.this.mo70981i(), (int) R.string.bl6).mo19066a();
                }

                /* renamed from: a */
                public final /* synthetic */ void mo70991a(Object obj) {
                    C33605c cVar = (C33605c) obj;
                    super.mo70991a(cVar);
                    C33521c.this.f86894l.mo70894b(cVar);
                    C33521c.this.mo70972b(cVar);
                }

                /* renamed from: b */
                public final /* synthetic */ void mo70992b(Object obj) {
                    C33605c cVar = (C33605c) obj;
                    super.mo70992b(cVar);
                    C33521c.this.mo70967a(cVar);
                    C33521c.this.mo70989p();
                    C33521c.this.f86893k.setVisibility(8);
                }

                /* renamed from: c */
                public final /* synthetic */ void mo70993c(Object obj) {
                    C33605c cVar = (C33605c) obj;
                    super.mo70993c(cVar);
                    C33521c.this.mo70967a(cVar);
                    C33521c.this.f86893k.setVisibility(0);
                    C33521c.this.mo70989p();
                    C33521c.this.f86899q.sendEmptyMessageDelayed(2, 3000);
                }
            };
        }
    }

    /* renamed from: t */
    private void m76828t() {
        if (this.f86883M == null) {
            this.f86883M = new C33594b<C33599c>() {
                /* renamed from: a */
                public final void mo70990a() {
                    super.mo70990a();
                    C33521c.this.mo70969a((Runnable) new C33610h(this));
                }

                /* renamed from: b */
                public final /* synthetic */ void mo70992b(Object obj) {
                    C33599c cVar = (C33599c) obj;
                    super.mo70992b(cVar);
                    C33521c.this.mo70969a((Runnable) new C33577f(this, cVar));
                }

                /* renamed from: a */
                public final /* synthetic */ void mo70991a(Object obj) {
                    C33599c cVar = (C33599c) obj;
                    super.mo70991a(cVar);
                    C33521c.this.mo70969a((Runnable) new C33578g(this, cVar));
                }
            };
        }
    }

    /* renamed from: e */
    public final AudioRecordBar mo70588e() {
        return new AudioRecordBar(mo70981i());
    }

    /* renamed from: h */
    public final void mo70980h() {
        mo70986n();
        this.f86894l.mo70896d();
    }

    /* renamed from: l */
    public final void mo70984l() {
        if (this.f86885c == null) {
            this.f86885c = new C33243e(this, mo70981i());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo70985m() {
        if (this.f86899q.hasMessages(1)) {
            this.f86899q.removeMessages(1);
        }
    }

    /* renamed from: n */
    public final void mo70986n() {
        if (this.f86899q.hasMessages(3)) {
            this.f86899q.removeMessages(3);
        }
    }

    /* renamed from: o */
    public final void mo70987o() {
        this.f86899q.sendEmptyMessageDelayed(3, 5000);
    }

    /* renamed from: p */
    public final void mo70989p() {
        if (this.f86899q.hasMessages(2)) {
            this.f86899q.removeMessages(2);
        }
    }

    /* renamed from: q */
    private void m76825q() {
        if (TextUtils.isEmpty(this.f86886d.getText())) {
            mo70974c(0);
        } else {
            mo70974c(1);
        }
    }

    public final void bi_() {
        if (this.f86895m != null) {
            this.f86895m.mo70886e();
        }
        C33672w.m77098a().mo71155f();
    }

    /* renamed from: c */
    public final boolean mo70586c() {
        if (this.f86902t.mo22248a()) {
            mo70587d();
            return true;
        }
        if (mo70981i() instanceof ChatRoomActivity) {
            ((Activity) mo70981i()).finish();
        }
        return false;
    }

    /* renamed from: f */
    public final void mo70978f() {
        if (!this.f86872B) {
            this.f86886d.setVisibility(8);
        }
        if (!this.f86908z) {
            this.f86887e.setVisibility(8);
        }
    }

    /* renamed from: r */
    private void m76826r() {
        if (this.f86874D == 0) {
            Resources resources = this.f86890h.getResources();
            this.f86874D = resources.getColor(R.color.ex);
            this.f86876F = resources.getColor(R.color.ey);
            this.f86875E = resources.getColor(R.color.ew);
            this.f86877G = resources.getColor(R.color.ez);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo70979g() {
        if (this.f86908z && this.f86887e.isSelected()) {
            this.f86887e.setImageResource(R.drawable.dar);
            this.f86887e.setContentDescription(mo70981i().getResources().getString(R.string.be3));
            this.f86887e.setSelected(false);
        }
    }

    /* renamed from: j */
    public final boolean mo70982j() {
        if (this.f86896n.isGroupChat()) {
            return false;
        }
        if (this.f86896n.isAuthorSupporterChat() && C33453a.m76680c()) {
            return false;
        }
        IMUser b = C34010e.m77748a().mo71964b(String.valueOf(C11190e.m22685a(this.f86896n.getConversationId())));
        if ((C35279p.m79763a() || ((b == null || b.getCommerceUserLevel() <= 0) && (C35265e.m79732c() == null || C35265e.m79732c().getCommerceUserLevel() <= 0))) && b == null) {
            return true;
        }
        return false;
    }

    public final void bh_() {
        long currentTimeMillis = System.currentTimeMillis();
        Editable text = this.f86886d.getText();
        if (text != null) {
            if (TextUtils.isEmpty(text.toString())) {
                C9432q.m18672a(mo70981i(), (int) R.string.bkz);
            } else if (text.length() > C35197am.m79552a()) {
                C9432q.m18676a(mo70981i(), C11010c.m22280a().getResources().getString(R.string.bkj));
            } else {
                C29406a b = C29406a.m69329b(mo70981i());
                C35190af.m79442a();
                C35190af.m79469a(this.f86896n.getConversationId(), b.mo59405b(), b.mo59470a((CharSequence) text));
                TextContent obtain = TextContent.obtain(text.toString());
                obtain.setSendStartTime(Long.valueOf(currentTimeMillis));
                C33987a.m77686a(this.f86896n.getConversationId(), (BaseContent) obtain);
                C35237bj.m79649a().mo73346b(this.f86896n.getConversationId(), (BaseContent) obtain, (C35241a) new C35241a() {
                    public final void onSendFailure(C11202k kVar) {
                    }

                    public final void onSendSuccess(C11207p pVar) {
                        if (C33521c.this.f86896n instanceof C33354ac) {
                            C35190af.m79442a();
                            C35190af.m79451a(((C33354ac) C33521c.this.f86896n).getImAdLog());
                        }
                    }

                    public final void onSend(C11180b bVar, List<C11207p> list) {
                        if (C33521c.this.f86896n.isGroupChat() && list != null) {
                            for (int i = 0; i < list.size(); i++) {
                                List mentionIds = C33521c.this.f86886d.getMentionIds();
                                if (mentionIds != null && !mentionIds.isEmpty()) {
                                    C35197am.m79554a((C11207p) list.get(i), mentionIds);
                                }
                            }
                        }
                    }
                });
                this.f86886d.setText("");
            }
        }
    }

    @C53771m
    public void onEvent(C33350a aVar) {
        mo70587d();
    }

    /* renamed from: a */
    public final void mo70578a(final C33534a aVar) {
        if (this.f86886d != null) {
            this.f86886d.addTextChangedListener(new C23698l() {
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    aVar.mo70687d();
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo70584b(int i) {
        this.f86891i.setVisibility(i);
    }

    /* renamed from: b */
    private void m76822b(List<C33604b> list) {
        if (this.f86897o == null) {
            this.f86897o = new ArrayList();
        }
        this.f86897o.addAll(list);
    }

    /* renamed from: e */
    private void m76823e(int i) {
        this.f86886d.setVisibility(0);
        this.f86906x = 4;
        if (!C35279p.m79763a()) {
            this.f86887e.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo70576a(int i) {
        KeyEvent keyEvent = new KeyEvent(0, 67);
        if (!this.f86886d.mo71759a()) {
            this.f86886d.dispatchKeyEvent(keyEvent);
        }
    }

    /* renamed from: e */
    private void m76824e(boolean z) {
        int i;
        int i2;
        if (this.f86878H != z) {
            this.f86878H = z;
            m76826r();
            SearchableEditText searchableEditText = this.f86886d;
            if (z) {
                i = this.f86874D;
            } else {
                i = this.f86876F;
            }
            searchableEditText.setHintTextColor(i);
            SearchableEditText searchableEditText2 = this.f86886d;
            if (z) {
                i2 = this.f86875E;
            } else {
                i2 = this.f86877G;
            }
            searchableEditText2.setTextColor(i2);
            this.f86886d.setSelected(z);
            this.f86887e.setActivated(z);
            if (z) {
                m76823e(4);
            }
            this.f86890h.setBackgroundResource(R.drawable.d6r);
            mo70978f();
        }
    }

    /* renamed from: a */
    public final void mo20961a(Message message) {
        if (message.what == 1) {
            this.f86894l.f86754a = 0;
            mo70968a((CharSequence) this.f86886d.getText());
        } else if (message.what == 2) {
            this.f86893k.setVisibility(8);
        } else {
            if (message.what == 3) {
                mo70977d(true);
            }
        }
    }

    /* renamed from: b */
    public final void mo70972b(C33605c cVar) {
        C33609g gVar = cVar.f87099c;
        if (gVar != null && gVar.f87104a != null && gVar.f87104a.size() > 0) {
            m76822b(gVar.f87104a);
        }
    }

    /* renamed from: c */
    public final void mo70975c(boolean z) {
        if (this.f86873C < 11) {
            if (z) {
                this.f86873C++;
            } else {
                this.f86873C = 0;
            }
            if (this.f86873C == 11) {
                C10691a.m21542b(mo70981i(), (int) R.string.bgl).mo19066a();
            }
            C35284t.m79782a().mo73425h(this.f86873C);
        }
    }

    /* renamed from: b */
    public final void mo70973b(boolean z) {
        if (this.f86889g != null) {
            boolean isActivated = this.f86889g.isActivated();
            this.f86889g.setActivated(z);
            if ((C33229c.f86227e.mo70573f() == 1 || C33229c.f86227e.mo70573f() == 2) && z && !isActivated) {
                C35383b.m80019a(this.f86889g);
            }
        }
    }

    /* renamed from: c */
    public final void mo70974c(int i) {
        boolean z;
        if (this.f86888f != null) {
            if (C33229c.f86227e.mo70573f() == 2) {
                z = true;
            } else {
                z = false;
            }
            if (i == 0) {
                if (z && (this.f86884b == 1 || this.f86884b == 3 || this.f86884b == 2)) {
                    C35383b.m80019a(this.f86888f);
                }
                this.f86888f.setImageResource(R.drawable.das);
                this.f86884b = 0;
            } else if (i == 1) {
                if (z && (this.f86884b == 0 || this.f86884b == 3 || this.f86884b == 2)) {
                    C35383b.m80019a(this.f86888f);
                }
                this.f86888f.setImageResource(R.drawable.dav);
                this.f86884b = 1;
            } else if (i == 2) {
                this.f86888f.setImageResource(R.drawable.daq);
                this.f86884b = 2;
            } else if (i == 3) {
                this.f86888f.setImageResource(R.drawable.dau);
                this.f86884b = 3;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo70976d(int i) {
        if (this.f86901s != null) {
            this.f86901s.mo71019a(null);
        }
        if (i == -1) {
            mo70587d();
        } else if (i == -2) {
            this.f86902t.mo22253e();
            C35190af.m79506f();
        } else if (i != 1) {
            if (i == 6) {
                if (this.f86902t.mo22250c() == 6) {
                    mo70587d();
                    return;
                }
                if (this.f86905w == null) {
                    this.f86905w = new C33588b(this, this.f86902t, new C29361p() {
                        /* renamed from: a */
                        public final void mo59290a() {
                        }

                        /* renamed from: a */
                        public final void mo59292a(String str) {
                        }

                        /* renamed from: b */
                        public final void mo59293b() {
                        }

                        /* renamed from: c */
                        public final void mo59294c() {
                        }

                        /* renamed from: a */
                        public final void mo59291a(View view, C29285a aVar, int i) {
                            C29299b.m69093a(aVar.f76668d);
                            C33521c.this.mo70984l();
                            C33521c.this.f86885c.mo70577a(aVar);
                        }
                    });
                    this.f86902t.mo22247a(6, this.f86905w.mo70881a());
                }
                this.f86905w.mo71036a((FragmentActivity) mo70981i());
                this.f86902t.mo22246a(6);
                C35190af.m79525j();
            }
        } else if (this.f86902t.mo22250c() == 1) {
            mo70587d();
        } else {
            this.f86895m.mo71016h();
            this.f86902t.mo22246a(1);
            C35190af.m79511g();
        }
    }

    /* renamed from: a */
    public final void mo70577a(C29285a aVar) {
        int stickerType = aVar.f76668d.getStickerType();
        if ((stickerType == 10 || stickerType == 2 || stickerType == 3) && mo70982j()) {
            C9432q.m18672a(mo70981i(), (int) R.string.bh0);
        } else {
            C35237bj.m79649a().mo73345b(this.f86896n.getConversationId(), (BaseContent) EmojiContent.obtain(aVar.f76668d));
        }
    }

    /* renamed from: d */
    public final void mo70977d(final boolean z) {
        float f;
        float f2;
        float f3 = 20.0f;
        float f4 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 20.0f;
        }
        if (!z) {
            f3 = 0.0f;
        }
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        if (!z) {
            f4 = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f86892j, "translationY", new float[]{f, f3});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f86892j, "alpha", new float[]{f2, f4});
        C335273 r4 = new AnimatorListener() {
            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
                if (!z) {
                    C33521c.this.f86892j.setVisibility(0);
                }
            }

            public final void onAnimationCancel(Animator animator) {
                if (z) {
                    C33521c.this.f86892j.setVisibility(8);
                    C33521c.this.mo70980h();
                }
            }

            public final void onAnimationEnd(Animator animator) {
                if (z) {
                    C33521c.this.f86892j.setVisibility(8);
                    C33521c.this.mo70980h();
                }
            }
        };
        ofFloat.setDuration(60);
        ofFloat.setInterpolator(C1027f.m2954a(0.14f, 1.0f, 0.34f, 1.0f));
        ofFloat2.setDuration(40);
        ofFloat2.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(r4);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.start();
    }

    /* renamed from: a */
    public final void mo70579a(C33535b bVar) {
        this.f86904v = bVar;
    }

    /* renamed from: a */
    public final void mo70967a(C33605c cVar) {
        this.f86892j.setVisibility(0);
        this.f86894l.mo70890a(cVar);
        this.f86892j.mo4814b(0);
        if (this.f86897o == null) {
            this.f86897o = new ArrayList();
        } else {
            this.f86897o.clear();
        }
        mo70972b(cVar);
    }

    /* renamed from: a */
    public final void mo70580a(C33727e eVar) {
        if (this.f86886d != null) {
            this.f86886d.setMOnMentionInputListener(eVar);
        }
    }

    /* renamed from: a */
    public static C33521c m76821a(ViewGroup viewGroup, C33353ab abVar) {
        return new C33521c(viewGroup, abVar);
    }

    /* renamed from: a */
    public final void mo22264a(int i, View view) {
        int i2 = 0;
        if (i == -1) {
            mo70979g();
            mo70983k();
            m76825q();
            m76824e(false);
            this.f86895m.mo71018j();
        } else if (i == -2) {
            m76824e(true);
            if (!this.f86900r) {
                C35190af.m79506f();
                this.f86900r = true;
            }
            if (this.f86884b == 3) {
                m76825q();
            }
        } else if (i == 1) {
            m76824e(true);
        }
        if (this.f86904v != null) {
            C33535b bVar = this.f86904v;
            if (i == -1) {
                i2 = 8;
            }
            bVar.mo70663a(i2);
        }
        this.f86907y = i;
        if (!C35279p.m79763a() && this.f86902t.mo22250c() != -2 && !this.f86894l.mo70891a()) {
            mo70977d(true);
        }
    }

    private C33521c(ViewGroup viewGroup, C33353ab abVar) {
        this.f86896n = abVar;
        this.f86908z = C34004b.m77718b().enableSendEmoji();
        this.f86871A = C34004b.m77718b().enableSendVoice();
        if (this.f86896n.isAuthorSupporterChat()) {
            this.f86872B = C33453a.m76675a();
            this.f86908z = C33453a.m76681d();
            this.f86871A = C33453a.m76679b();
        }
        if (viewGroup.getContext() instanceof AbsActivity) {
            ((AbsActivity) viewGroup.getContext()).registerLifeCycleMonitor(this);
        }
        this.f86898p = new C33536c(this.f86896n);
        this.f86891i = (ViewGroup) viewGroup.findViewById(R.id.au5);
        this.f86886d = (SearchableEditText) viewGroup.findViewById(R.id.bnf);
        this.f86890h = (LinearLayout) viewGroup.findViewById(R.id.e6p);
        this.f86887e = (ImageView) viewGroup.findViewById(R.id.a_q);
        this.f86888f = (ImageView) viewGroup.findViewById(R.id.e_f);
        this.f86889g = (ImageView) viewGroup.findViewById(R.id.cl4);
        this.f86903u = viewGroup.findViewById(R.id.a6f);
        int i = 8;
        this.f86903u.setVisibility(8);
        if (!ImMTInputGifSettings.INSTANCE.getValue()) {
            this.f86888f.setVisibility(8);
            ((LayoutParams) this.f86887e.getLayoutParams()).setMargins(0, 0, (int) C9432q.m18687b(mo70981i(), 9.0f), (int) C9432q.m18687b(mo70981i(), 8.0f));
        }
        this.f86892j = (RecyclerView) viewGroup.findViewById(R.id.cg1);
        this.f86893k = (TextView) viewGroup.findViewById(R.id.d_v);
        RecyclerView recyclerView = this.f86892j;
        if (!C35279p.m79763a()) {
            i = 0;
        }
        recyclerView.setVisibility(i);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mo70981i());
        linearLayoutManager.mo4731b(0);
        this.f86892j.setLayoutManager(linearLayoutManager);
        this.f86892j.mo4798a((C1331h) new C35402h(mo70981i().getResources().getDimensionPixelSize(R.dimen.ir)));
        this.f86894l = new C33476a(this.f86892j);
        this.f86892j.setAdapter(this.f86894l);
        this.f86902t = (SoftInputResizeFuncLayoutView) viewGroup.findViewById(R.id.bw1);
        this.f86902t.setEditText(this.f86886d);
        this.f86902t.setResizable(true);
        mo70978f();
        if (this.f86879I == null) {
            this.f86879I = new C33538e(this);
        }
        if (this.f86881K == null) {
            this.f86881K = new C23698l() {
                public final void afterTextChanged(Editable editable) {
                    boolean z = false;
                    if (TextUtils.isEmpty(editable)) {
                        if (C33521c.this.f86895m != null) {
                            C33521c.this.f86895m.mo70882a(false);
                        }
                        C33521c.this.mo70973b(false);
                    } else {
                        if (C33521c.this.f86895m != null) {
                            C33521c.this.f86895m.mo70882a(true);
                        }
                        C33521c.this.mo70973b(true);
                    }
                    if (C33521c.this.f86888f != null) {
                        if (C33521c.this.f86884b == 1 && TextUtils.isEmpty(editable)) {
                            C33521c.this.mo70974c(0);
                        } else if (C33521c.this.f86884b != 2) {
                            C33521c.this.mo70974c(1);
                        }
                    }
                    C33521c.this.mo70978f();
                    C33536c cVar = C33521c.this.f86898p;
                    if (editable.length() > 0) {
                        z = true;
                    }
                    new StringBuilder("onStatusChanged hasContent=").append(z);
                    cVar.f86924b = z;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = cVar.f86923a + 2000;
                    if (j <= elapsedRealtime || !z) {
                        cVar.f86923a = elapsedRealtime;
                        cVar.mo71001a();
                        return;
                    }
                    C33521c.this.f86891i.removeCallbacks(cVar);
                    C33521c.this.f86891i.postDelayed(cVar, j - elapsedRealtime);
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    if (C33521c.this.f86884b == 2) {
                        C33521c cVar = C33521c.this;
                        cVar.mo70985m();
                        cVar.f86899q.sendEmptyMessageDelayed(1, 200);
                    }
                    CharSequence charSequence2 = (CharSequence) C33521c.this.f86886d.getTag(R.id.j);
                    if (charSequence2 == null || !TextUtils.equals(charSequence2, charSequence)) {
                        C33521c cVar2 = C33521c.this;
                        if (!C29410a.m69356a().mo59477e()) {
                            if (TextUtils.isEmpty(charSequence)) {
                                cVar2.mo70970a(null);
                                return;
                            }
                            cVar2.mo70970a(C29410a.m69356a().mo59471a(charSequence.toString()));
                        }
                        return;
                    }
                    C33521c.this.f86886d.setTag(R.id.j, null);
                }
            };
        }
        if (this.f86880J == null) {
            this.f86880J = new OnKeyListener() {
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (view.equals(C33521c.this.f86886d) && i == 4 && keyEvent.getAction() == 0) {
                        return C33521c.this.mo70586c();
                    }
                    return false;
                }
            };
        }
        this.f86886d.removeTextChangedListener(this.f86881K);
        this.f86886d.addTextChangedListener(this.f86881K);
        this.f86886d.setFilters(new InputFilter[]{new C33359af(C35197am.m79552a())});
        this.f86886d.setOnKeyListener(this.f86880J);
        this.f86886d.setOnClickListener(this.f86879I);
        this.f86886d.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                if (!z) {
                    C33521c.this.mo70587d();
                }
            }
        });
        this.f86889g.setOnClickListener(this.f86879I);
        this.f86887e.setOnClickListener(this.f86879I);
        this.f86888f.setOnClickListener(this.f86879I);
        this.f86894l.f86759f = new C33480c() {
            /* renamed from: a */
            public final void mo70897a(int i) {
                if (i >= 0) {
                    if (C33521c.this.mo70982j()) {
                        C10691a.m21542b(C33521c.this.mo70981i(), (int) R.string.bh0).mo19066a();
                        return;
                    }
                    C33604b bVar = (C33604b) C33521c.this.f86897o.get(i);
                    if (bVar != null && bVar.f87095b != null && bVar.f87095b.f87100a != null) {
                        C33596b bVar2 = bVar.f87095b.f87100a;
                        C33521c cVar = C33521c.this;
                        C29366a aVar = new C29366a();
                        aVar.setAnimateType(bVar.f87094a);
                        aVar.setStickerType(3);
                        aVar.setWidth(Integer.parseInt(bVar2.f87074b));
                        aVar.setHeight(Integer.parseInt(bVar2.f87075c));
                        aVar.setDisplayName(cVar.mo70981i().getString(R.string.bkp));
                        List singletonList = Collections.singletonList(bVar2.f87073a);
                        UrlModel urlModel = new UrlModel();
                        urlModel.setUrlList(singletonList);
                        aVar.setAnimateUrl(urlModel);
                        C29285a aVar2 = new C29285a();
                        aVar2.f76668d = aVar;
                        cVar.mo70984l();
                        cVar.f86885c.mo70577a(aVar2);
                        C33603a aVar3 = bVar.f87096c;
                        if (!(aVar3 == null || aVar3.f87093a == null || TextUtils.isEmpty(aVar3.f87093a.f87101a))) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(aVar3.f87093a.f87101a);
                            sb.append("&ts=");
                            sb.append(System.currentTimeMillis());
                            C33592a.m76986a(sb.toString());
                        }
                    }
                }
            }

            /* renamed from: a */
            public final void mo70898a(C33598b bVar) {
                String str;
                String trim;
                if (bVar != null) {
                    C33521c cVar = C33521c.this;
                    if (bVar.f87082f == 2) {
                        String str2 = TEVideoRecorder.FACE_BEAUTY_NULL;
                        String str3 = ",";
                        String charSequence = C35265e.m79730b().toString();
                        String conversationId = cVar.f86896n.getConversationId();
                        if (cVar.f86896n.isGroupChat()) {
                            str = str2;
                        } else {
                            str = String.valueOf(C11190e.m22685a(conversationId));
                        }
                        if (cVar.f86886d.getText() == null) {
                            trim = "";
                        } else {
                            trim = cVar.f86886d.getText().toString().trim();
                        }
                        String str4 = trim;
                        List<C33595a> b = cVar.f86894l.mo70892b();
                        StringBuilder sb = new StringBuilder();
                        if (b == null || b.isEmpty()) {
                            sb.append(str2);
                        } else {
                            for (C33595a aVar : b) {
                                if (aVar instanceof C33598b) {
                                    sb.append(((C33598b) aVar).f87079c);
                                    sb.append(str3);
                                }
                            }
                            if (TextUtils.isEmpty(sb)) {
                                sb.append(str2);
                            } else {
                                sb.substring(0, sb.length() - 1);
                            }
                        }
                        C35190af.m79487b(conversationId, str, charSequence, str4, sb.toString(), bVar.f87079c);
                    }
                    C33521c cVar2 = C33521c.this;
                    UrlModel urlModel = bVar.f87078b;
                    UrlModel urlModel2 = bVar.f87077a;
                    if (!(urlModel2 == null || urlModel == null)) {
                        C29366a aVar2 = new C29366a();
                        aVar2.setAnimateUrl(urlModel2);
                        aVar2.setStaticUrl(urlModel);
                        aVar2.setId(bVar.f87080d);
                        aVar2.setWidth(urlModel2.getWidth());
                        aVar2.setHeight(urlModel2.getHeight());
                        aVar2.setStickerType(1);
                        aVar2.setAnimateType("gif");
                        aVar2.setStaticType("gif");
                        aVar2.setDisplayName(cVar2.mo70981i().getString(R.string.bgu));
                        C29285a aVar3 = new C29285a();
                        aVar3.f76668d = aVar2;
                        cVar2.mo70984l();
                        C29299b.m69093a(aVar2);
                        cVar2.f86885c.mo70577a(aVar3);
                        cVar2.f86886d.setText("");
                    }
                    C33521c.this.mo70975c(false);
                }
            }
        };
        this.f86894l.f86758e = new C33537d(this);
        if (!C35279p.m79763a()) {
            this.f86892j.mo4801a((C1340m) new C1340m() {
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 0) {
                        C33521c.this.mo70987o();
                    } else {
                        C33521c.this.mo70986n();
                    }
                    C33521c.this.mo70975c(false);
                }
            });
        }
        this.f86902t.setOnPanelChangeListener(this);
        this.f86902t.setOnClickListener(this.f86879I);
        C35225a.m79617l();
        this.f86890h.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (C33521c.this.f86890h.getVisibility() != 0) {
                    C33521c.this.mo70587d();
                }
            }
        });
        C33553a aVar = new C33553a(this, this.f86902t);
        aVar.f86974c.f76837d = true;
        aVar.f86974c.f76840g.add(Integer.valueOf(2));
        aVar.f86974c.f76834a = true;
        aVar.f86974c.f76840g.add(Integer.valueOf(1));
        aVar.f86974c.f76835b = true;
        aVar.f86974c.f76840g.add(Integer.valueOf(3));
        aVar.f86974c.f76836c = true;
        aVar.f86974c.f76840g.add(Integer.valueOf(4));
        this.f86895m = new C33550b(aVar.f86972a, aVar.f86974c, aVar.f86973b);
        this.f86902t.mo22247a(1, this.f86895m.mo70881a());
        this.f86873C = Math.max(0, C35284t.m79782a().mo73448x());
    }
}
