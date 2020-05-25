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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtRadioButton;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
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
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1682c.p1683a.C29299b;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29406a;
import com.p683ss.android.ugc.aweme.emoji.p1693i.C29410a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33243e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33353ab;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33354ac;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33359af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33521c.C33534a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33521c.C33535b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio.widget.AudioRecordBar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33546a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33546a.C33549a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji.C33558e;
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
import com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices.IMService;
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
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.p1900b.C35429a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.i */
public final class C33611i extends C34042m implements C11502a, C11505a, C33519b {

    /* renamed from: a */
    public static final String f87107a = C33521c.class.getSimpleName();

    /* renamed from: A */
    private boolean f87108A = true;

    /* renamed from: B */
    private int f87109B;

    /* renamed from: C */
    private int f87110C;

    /* renamed from: D */
    private int f87111D;

    /* renamed from: E */
    private int f87112E;

    /* renamed from: F */
    private int f87113F;

    /* renamed from: G */
    private boolean f87114G;

    /* renamed from: H */
    private OnClickListener f87115H;

    /* renamed from: I */
    private OnKeyListener f87116I;

    /* renamed from: J */
    private TextWatcher f87117J;

    /* renamed from: K */
    private C33593a<C33605c> f87118K;

    /* renamed from: L */
    private C33593a<C33599c> f87119L;

    /* renamed from: b */
    C33519b f87120b;

    /* renamed from: c */
    public SearchableEditText f87121c;

    /* renamed from: d */
    ImageView f87122d;

    /* renamed from: e */
    public ImageView f87123e;

    /* renamed from: f */
    ImageView f87124f;

    /* renamed from: g */
    public LinearLayout f87125g;

    /* renamed from: h */
    public ViewGroup f87126h;

    /* renamed from: i */
    public LinearLayout f87127i;

    /* renamed from: j */
    public RadioGroup f87128j;

    /* renamed from: k */
    public RecyclerView f87129k;

    /* renamed from: l */
    public TextView f87130l;

    /* renamed from: m */
    public C33476a f87131m;

    /* renamed from: n */
    public C33546a f87132n;

    /* renamed from: o */
    public C33353ab f87133o;

    /* renamed from: p */
    int f87134p = 4;

    /* renamed from: q */
    public int f87135q = -1;

    /* renamed from: r */
    public List<C33604b> f87136r;

    /* renamed from: s */
    public C33625a f87137s;

    /* renamed from: t */
    public C11501n f87138t = new C11501n(this);

    /* renamed from: u */
    private AudioRecordBar f87139u;

    /* renamed from: v */
    private C33558e f87140v;

    /* renamed from: w */
    private SoftInputResizeFuncLayoutView f87141w;

    /* renamed from: x */
    private C33535b f87142x;

    /* renamed from: y */
    private boolean f87143y;

    /* renamed from: z */
    private boolean f87144z;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.i$a */
    class C33625a implements Runnable {

        /* renamed from: a */
        long f87163a;

        /* renamed from: b */
        boolean f87164b;

        /* renamed from: d */
        private IMUser f87166d;

        public final void run() {
            this.f87163a = SystemClock.elapsedRealtime();
            mo71077a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo71077a() {
            int i;
            if (!C35279p.m79763a()) {
                IMUser iMUser = this.f87166d;
                if (iMUser != null && (iMUser.getCommerceUserLevel() != 0 || iMUser.isWithCommerceEntry())) {
                    new StringBuilder("try send user action, hasContent=").append(this.f87164b);
                    String uid = iMUser.getUid();
                    if (!TextUtils.isEmpty(uid)) {
                        C11180b a = C11182d.m22641a().mo20658a(C11190e.m22687a(Long.valueOf(uid).longValue()));
                        if (a != null) {
                            C11247a aVar = new C11247a();
                            if (this.f87164b) {
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

        public C33625a(C33353ab abVar) {
            this.f87166d = C33611i.this.f87133o.getSingleChatFromUser();
        }
    }

    /* renamed from: a */
    public final void mo20108a() {
    }

    /* renamed from: e */
    public final AudioRecordBar mo70588e() {
        return this.f87139u;
    }

    /* renamed from: a */
    public final void mo70581a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.f87121c.getText() == null || this.f87121c.getText().length() + str.length() <= C35197am.m79552a()) {
                if (this.f87135q == -1) {
                    mo71055c(-2);
                }
                this.f87121c.mo71760a(str);
                return;
            }
            C10691a.m21542b(mo71060h(), (int) R.string.bkj).mo19066a();
        }
    }

    /* renamed from: a */
    public final void mo70582a(String str, String str2) {
        mo71055c(-2);
        if (!TextUtils.isEmpty(str)) {
            if (this.f87121c.getText() == null || this.f87121c.getText().length() + str.length() <= C35197am.m79552a()) {
                this.f87121c.mo71761a(str, str2);
            } else {
                C10691a.m21542b(mo71060h(), (int) R.string.bkj).mo19066a();
            }
        }
    }

    /* renamed from: a */
    public final void mo71052a(boolean z) {
        if (!this.f87121c.f87492c && !TextUtils.isEmpty(this.f87121c.getText())) {
            this.f87121c.setTag(R.id.o, this.f87121c.getText());
        }
        this.f87121c.setSearchable(z);
        m77001p();
        if (z) {
            this.f87121c.setHint(R.string.bjg);
            this.f87131m.mo70896d();
            if (!TextUtils.isEmpty(this.f87121c.getText())) {
                this.f87121c.setText("");
            }
            m77005t();
            this.f87138t.sendEmptyMessage(1);
            return;
        }
        mo71067o();
        this.f87130l.setVisibility(8);
        this.f87129k.setVisibility(8);
        CharSequence charSequence = (CharSequence) this.f87121c.getTag(R.id.o);
        if (charSequence != null) {
            this.f87121c.setTag(R.id.o, null);
            if (!TextUtils.equals(this.f87121c.getText(), charSequence)) {
                this.f87121c.setTag(R.id.j, charSequence);
                this.f87121c.setText(charSequence);
            }
        } else if (!TextUtils.isEmpty(this.f87121c.getText())) {
            this.f87121c.setText("");
        }
        this.f87121c.setHint(R.string.bji);
        Editable text = this.f87121c.getText();
        if (text != null) {
            this.f87121c.setSelection(text.length());
        }
        m77005t();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo71049a(CharSequence charSequence) {
        String str;
        String str2;
        String a = C35211ax.m79597a(charSequence.toString());
        int i = this.f87131m.f86754a;
        if (C35279p.m79763a()) {
            m77006u();
            if (TextUtils.isEmpty(a)) {
                C33600a.m76995a(i, this.f87118K);
            } else {
                C33600a.m76997a(i, a, this.f87118K);
            }
        } else if (TextUtils.isEmpty(a)) {
            mo71056c(true);
        } else if (a.length() <= 8) {
            m77007v();
            if (this.f87133o.isSingleChat()) {
                str2 = "im";
                str = this.f87133o.getSingleChatFromUserId();
            } else {
                str2 = "im_group";
                str = this.f87133o.getConversationId();
            }
            C35286u.m79876a(a, i, str2, str, this.f87119L);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo71051a(List<C29366a> list) {
        if (this.f87140v == null) {
            this.f87140v = new C33558e(this, this.f87126h, this.f87133o.getConversationId());
        }
        this.f87140v.mo71019a(list);
    }

    /* renamed from: a */
    public final void mo71050a(Runnable runnable) {
        if (this.f87141w.mo22250c() == -2) {
            runnable.run();
        }
    }

    /* renamed from: b */
    public final void mo70583b() {
        this.f87121c.setText("");
    }

    /* renamed from: d */
    public final void mo70587d() {
        this.f87141w.mo22249b();
    }

    /* renamed from: h */
    public final Context mo71060h() {
        return this.f87126h.getContext();
    }

    /* renamed from: t */
    private void m77005t() {
        if (this.f87138t.hasMessages(1)) {
            this.f87138t.removeMessages(1);
        }
    }

    /* renamed from: u */
    private void m77006u() {
        if (this.f87118K == null) {
            this.f87118K = new C33594b<C33605c>() {
                /* renamed from: a */
                public final void mo70990a() {
                    super.mo70990a();
                    if (C33611i.this.f87121c.f87492c) {
                        C33611i.this.mo71067o();
                        C33611i.this.f87131m.mo70895c();
                        C33611i.this.f87130l.setVisibility(8);
                        C33611i.this.f87129k.setVisibility(0);
                        C10691a.m21542b(C33611i.this.mo71060h(), (int) R.string.bl6).mo19066a();
                    }
                }

                /* renamed from: a */
                public final /* synthetic */ void mo70991a(Object obj) {
                    C33605c cVar = (C33605c) obj;
                    super.mo70991a(cVar);
                    if (C33611i.this.f87121c.f87492c) {
                        C33611i.this.f87131m.mo70894b(cVar);
                        C33611i.this.mo71053b(cVar);
                    }
                }

                /* renamed from: b */
                public final /* synthetic */ void mo70992b(Object obj) {
                    C33605c cVar = (C33605c) obj;
                    super.mo70992b(cVar);
                    if (C33611i.this.f87121c.f87492c) {
                        C33611i.this.mo71048a(cVar);
                        C33611i.this.mo71067o();
                        C33611i.this.f87130l.setVisibility(8);
                    }
                }

                /* renamed from: c */
                public final /* synthetic */ void mo70993c(Object obj) {
                    C33605c cVar = (C33605c) obj;
                    super.mo70993c(cVar);
                    if (C33611i.this.f87121c.f87492c) {
                        C33611i.this.mo71048a(cVar);
                        C33611i.this.f87130l.setVisibility(0);
                        C33611i.this.mo71067o();
                        C33611i.this.f87138t.sendEmptyMessageDelayed(2, 3000);
                    }
                }
            };
        }
    }

    /* renamed from: v */
    private void m77007v() {
        if (this.f87119L == null) {
            this.f87119L = new C33594b<C33599c>() {
                /* renamed from: a */
                public final void mo70990a() {
                    super.mo70990a();
                    C33611i.this.mo71050a((Runnable) new C33630n(this));
                }

                /* renamed from: b */
                public final /* synthetic */ void mo70992b(Object obj) {
                    C33599c cVar = (C33599c) obj;
                    super.mo70992b(cVar);
                    C33611i.this.mo71050a((Runnable) new C33628l(this, cVar));
                }

                /* renamed from: a */
                public final /* synthetic */ void mo70991a(Object obj) {
                    C33599c cVar = (C33599c) obj;
                    super.mo70991a(cVar);
                    C33611i.this.mo71050a((Runnable) new C33629m(this, cVar));
                }
            };
        }
    }

    /* renamed from: g */
    public final void mo71059g() {
        mo71065m();
        this.f87131m.mo70896d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo71062j() {
        if (this.f87120b == null) {
            this.f87120b = new C33243e(this, mo71060h());
        }
    }

    /* renamed from: l */
    public final void mo71064l() {
        m77005t();
        this.f87138t.sendEmptyMessageDelayed(1, 200);
    }

    /* renamed from: m */
    public final void mo71065m() {
        if (this.f87138t.hasMessages(3)) {
            this.f87138t.removeMessages(3);
        }
    }

    /* renamed from: n */
    public final void mo71066n() {
        this.f87138t.sendEmptyMessageDelayed(3, 5000);
    }

    /* renamed from: o */
    public final void mo71067o() {
        if (this.f87138t.hasMessages(2)) {
            this.f87138t.removeMessages(2);
        }
    }

    /* renamed from: p */
    private void m77001p() {
        int i;
        SearchableEditText searchableEditText = this.f87121c;
        if (this.f87144z || this.f87121c.f87492c) {
            i = R.drawable.db6;
        } else {
            i = 0;
        }
        searchableEditText.setBackgroundResource(i);
    }

    /* renamed from: q */
    private void m77002q() {
        if (C34004b.m77718b().enableExpressionTab() && this.f87128j.getVisibility() == 0) {
            mo71063k();
        }
        m77003r();
    }

    public final void bi_() {
        if (this.f87132n != null) {
            this.f87132n.mo70886e();
        }
        C33672w.m77098a().mo71155f();
    }

    /* renamed from: c */
    public final boolean mo70586c() {
        if (this.f87141w.mo22248a()) {
            mo70587d();
            return true;
        }
        if (mo71060h() instanceof ChatRoomActivity) {
            ((Activity) mo71060h()).finish();
        }
        return false;
    }

    /* renamed from: f */
    public final void mo71058f() {
        if (!this.f87108A) {
            this.f87121c.setVisibility(8);
        }
        if (!this.f87143y) {
            this.f87122d.setVisibility(8);
        }
        if (!this.f87144z) {
            this.f87124f.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo71063k() {
        if (C34004b.m77718b().enableExpressionTab()) {
            this.f87128j.setVisibility(8);
            mo71052a(false);
        }
    }

    /* renamed from: r */
    private void m77003r() {
        if (this.f87143y && this.f87122d.isSelected()) {
            this.f87122d.setImageResource(2131954291);
            this.f87122d.setContentDescription(mo71060h().getResources().getString(R.string.be3));
            this.f87122d.setSelected(false);
        }
    }

    /* renamed from: s */
    private void m77004s() {
        if (this.f87110C == 0) {
            Resources resources = this.f87125g.getResources();
            this.f87110C = resources.getColor(R.color.ex);
            this.f87112E = resources.getColor(R.color.ey);
            this.f87111D = resources.getColor(R.color.ew);
            this.f87113F = resources.getColor(R.color.ez);
        }
    }

    /* renamed from: i */
    public final boolean mo71061i() {
        if (this.f87133o.isGroupChat()) {
            return false;
        }
        if (this.f87133o.isAuthorSupporterChat() && C33453a.m76680c()) {
            return false;
        }
        IMUser b = C34010e.m77748a().mo71964b(String.valueOf(C11190e.m22685a(this.f87133o.getConversationId())));
        if (!C35279p.m79763a() && ((b != null && b.getCommerceUserLevel() > 0) || (C35265e.m79732c() != null && C35265e.m79732c().getCommerceUserLevel() > 0))) {
            return false;
        }
        if (b == null || (b.getFollowStatus() != 2 && !C35265e.m79728a(b))) {
            return true;
        }
        return false;
    }

    public final void bh_() {
        long currentTimeMillis = System.currentTimeMillis();
        Editable text = this.f87121c.getText();
        if (text != null) {
            if (TextUtils.isEmpty(text.toString())) {
                C9432q.m18672a(mo71060h(), (int) R.string.bkz);
            } else if (text.length() > C35197am.m79552a()) {
                C9432q.m18676a(mo71060h(), C11010c.m22280a().getResources().getString(R.string.bkj));
            } else {
                C29406a b = C29406a.m69329b(mo71060h());
                C35190af.m79442a();
                C35190af.m79469a(this.f87133o.getConversationId(), b.mo59405b(), b.mo59470a((CharSequence) text));
                TextContent obtain = TextContent.obtain(text.toString());
                obtain.setSendStartTime(Long.valueOf(currentTimeMillis));
                C33987a.m77686a(this.f87133o.getConversationId(), (BaseContent) obtain);
                C35237bj.m79649a().mo73346b(this.f87133o.getConversationId(), (BaseContent) obtain, (C35241a) new C35241a() {
                    public final void onSendFailure(C11202k kVar) {
                    }

                    public final void onSendSuccess(C11207p pVar) {
                        if (C33611i.this.f87133o instanceof C33354ac) {
                            C35190af.m79442a();
                            C35190af.m79451a(((C33354ac) C33611i.this.f87133o).getImAdLog());
                        }
                    }

                    public final void onSend(C11180b bVar, List<C11207p> list) {
                        if (C33611i.this.f87133o.isGroupChat() && list != null) {
                            for (int i = 0; i < list.size(); i++) {
                                List mentionIds = C33611i.this.f87121c.getMentionIds();
                                if (mentionIds != null && !mentionIds.isEmpty()) {
                                    C35197am.m79554a((C11207p) list.get(i), mentionIds);
                                }
                            }
                        }
                    }
                });
                this.f87121c.setText("");
            }
        }
    }

    @C53771m
    public final void onEvent(C33350a aVar) {
        mo70587d();
    }

    /* renamed from: a */
    public final void mo70578a(final C33534a aVar) {
        if (this.f87121c != null) {
            this.f87121c.addTextChangedListener(new C23698l() {
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    aVar.mo70687d();
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo70584b(int i) {
        this.f87126h.setVisibility(i);
    }

    /* renamed from: b */
    private void m76999b(List<C33604b> list) {
        if (this.f87136r == null) {
            this.f87136r = new ArrayList();
        }
        this.f87136r.addAll(list);
    }

    /* renamed from: a */
    public final void mo70576a(int i) {
        KeyEvent keyEvent = new KeyEvent(0, 67);
        if (!this.f87121c.mo71759a()) {
            this.f87121c.dispatchKeyEvent(keyEvent);
        }
    }

    /* renamed from: a */
    public final void mo20961a(Message message) {
        if (message.what == 1) {
            this.f87131m.f86754a = 0;
            mo71049a((CharSequence) this.f87121c.getText());
            C35190af.m79516h();
        } else if (message.what == 2) {
            this.f87130l.setVisibility(8);
        } else {
            if (message.what == 3) {
                mo71056c(true);
            }
        }
    }

    /* renamed from: b */
    public final void mo71053b(C33605c cVar) {
        C33609g gVar = cVar.f87099c;
        if (gVar != null && gVar.f87104a != null && gVar.f87104a.size() > 0) {
            m76999b(gVar.f87104a);
        }
    }

    /* renamed from: c */
    public final void mo71055c(int i) {
        if (this.f87140v != null) {
            this.f87140v.mo71019a(null);
        }
        if (i == -1) {
            mo70587d();
        } else if (i == -2) {
            this.f87141w.mo22253e();
            C35190af.m79506f();
        } else {
            if (i == 1) {
                if (this.f87141w.mo22250c() == 1) {
                    mo70587d();
                    return;
                }
                this.f87132n.mo71012h();
                this.f87141w.mo22246a(1);
                C35190af.m79511g();
            }
        }
    }

    /* renamed from: d */
    private void m77000d(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.f87114G != z) {
            this.f87114G = z;
            m77004s();
            SearchableEditText searchableEditText = this.f87121c;
            if (z) {
                i = this.f87110C;
            } else {
                i = this.f87112E;
            }
            searchableEditText.setHintTextColor(i);
            SearchableEditText searchableEditText2 = this.f87121c;
            if (z) {
                i2 = this.f87111D;
            } else {
                i2 = this.f87113F;
            }
            searchableEditText2.setTextColor(i2);
            this.f87121c.setSelected(z);
            this.f87122d.setActivated(z);
            if (z) {
                mo71057d(4);
            }
            ImageView imageView = this.f87124f;
            if (z) {
                i3 = R.drawable.d9m;
            } else {
                i3 = R.drawable.dbq;
            }
            imageView.setImageResource(i3);
            LinearLayout linearLayout = this.f87125g;
            if (z) {
                i4 = R.drawable.d6r;
            } else {
                i4 = R.drawable.d6s;
            }
            linearLayout.setBackgroundResource(i4);
            mo71058f();
        }
    }

    /* renamed from: b */
    public final void mo71054b(boolean z) {
        if (this.f87109B < 11) {
            if (z) {
                this.f87109B++;
            } else {
                this.f87109B = 0;
            }
            if (this.f87109B == 11) {
                C10691a.m21542b(mo71060h(), (int) R.string.bgl).mo19066a();
            }
            C35284t.m79782a().mo73425h(this.f87109B);
        }
    }

    /* renamed from: c */
    public final void mo71056c(final boolean z) {
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
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f87129k, "translationY", new float[]{f, f3});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f87129k, "alpha", new float[]{f2, f4});
        C336194 r4 = new AnimatorListener() {
            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
                if (!z) {
                    C33611i.this.f87129k.setVisibility(0);
                }
            }

            public final void onAnimationCancel(Animator animator) {
                if (z) {
                    C33611i.this.f87129k.setVisibility(8);
                    C33611i.this.mo71059g();
                }
            }

            public final void onAnimationEnd(Animator animator) {
                if (z) {
                    C33611i.this.f87129k.setVisibility(8);
                    C33611i.this.mo71059g();
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
    public final void mo70577a(C29285a aVar) {
        int stickerType = aVar.f76668d.getStickerType();
        if ((stickerType == 10 || stickerType == 2 || stickerType == 3) && mo71061i()) {
            C9432q.m18672a(mo71060h(), (int) R.string.bh0);
        } else {
            C35237bj.m79649a().mo73345b(this.f87133o.getConversationId(), (BaseContent) EmojiContent.obtain(aVar.f76668d));
        }
    }

    /* renamed from: d */
    public final void mo71057d(int i) {
        if (i == 5) {
            if (mo71061i()) {
                C9432q.m18672a(mo71060h(), (int) R.string.blo);
            } else {
                this.f87139u.setVisibility(0);
                this.f87121c.setVisibility(8);
                if (this.f87134p != i) {
                    this.f87124f.setSelected(!this.f87124f.isSelected());
                    this.f87124f.setContentDescription(mo71060h().getResources().getString(R.string.be_));
                }
                this.f87134p = 5;
            }
            if (!C35279p.m79763a()) {
                this.f87122d.setVisibility(8);
            }
        } else {
            this.f87139u.setVisibility(8);
            this.f87121c.setVisibility(0);
            if (this.f87134p != i) {
                this.f87124f.setSelected(!this.f87124f.isSelected());
                this.f87124f.setContentDescription(mo71060h().getResources().getString(R.string.be0));
            }
            this.f87134p = 4;
            if (!C35279p.m79763a()) {
                this.f87122d.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo70579a(C33535b bVar) {
        this.f87142x = bVar;
    }

    /* renamed from: a */
    public final void mo71048a(C33605c cVar) {
        this.f87129k.setVisibility(0);
        this.f87131m.mo70890a(cVar);
        this.f87129k.mo4814b(0);
        if (this.f87136r == null) {
            this.f87136r = new ArrayList();
        } else {
            this.f87136r.clear();
        }
        mo71053b(cVar);
    }

    /* renamed from: a */
    public final void mo70580a(C33727e eVar) {
        if (this.f87121c != null) {
            this.f87121c.setMOnMentionInputListener(eVar);
        }
    }

    /* renamed from: a */
    public static C33611i m76998a(ViewGroup viewGroup, C33353ab abVar) {
        return new C33611i(viewGroup, abVar);
    }

    /* renamed from: a */
    public final void mo22264a(int i, View view) {
        int i2 = 0;
        if (i == -1) {
            m77002q();
            m77000d(false);
            this.f87132n.mo71015k();
        } else if (i == -2) {
            if (!(C34004b.m77718b().enableExpressionTab() && this.f87128j.getVisibility() == 0 && R.id.c92 == this.f87128j.getCheckedRadioButtonId())) {
                m77002q();
            }
            m77000d(true);
        } else if (i == 1) {
            m77000d(true);
        }
        if (this.f87142x != null) {
            C33535b bVar = this.f87142x;
            if (i == -1) {
                i2 = 8;
            }
            bVar.mo70663a(i2);
        }
        this.f87135q = i;
        if (!C35279p.m79763a() && this.f87141w.mo22250c() != -2 && !this.f87131m.mo70891a()) {
            mo71056c(true);
        }
    }

    private C33611i(ViewGroup viewGroup, C33353ab abVar) {
        int i;
        this.f87133o = abVar;
        this.f87143y = C34004b.m77718b().enableSendEmoji();
        this.f87144z = C34004b.m77718b().enableSendVoice();
        if (this.f87133o.isAuthorSupporterChat()) {
            this.f87108A = C33453a.m76675a();
            this.f87143y = C33453a.m76681d();
            this.f87144z = C33453a.m76679b();
        }
        if (viewGroup.getContext() instanceof AbsActivity) {
            ((AbsActivity) viewGroup.getContext()).registerLifeCycleMonitor(this);
        }
        this.f87137s = new C33625a(this.f87133o);
        this.f87126h = (ViewGroup) viewGroup.findViewById(R.id.au5);
        this.f87121c = (SearchableEditText) viewGroup.findViewById(R.id.bnf);
        m77001p();
        this.f87125g = (LinearLayout) viewGroup.findViewById(R.id.e6q);
        this.f87127i = (LinearLayout) viewGroup.findViewById(R.id.b82);
        this.f87122d = (ImageView) viewGroup.findViewById(R.id.a_q);
        this.f87123e = (ImageView) viewGroup.findViewById(R.id.cl4);
        this.f87124f = (ImageView) viewGroup.findViewById(R.id.cw5);
        this.f87139u = (AudioRecordBar) viewGroup.findViewById(R.id.blw);
        this.f87128j = (RadioGroup) viewGroup.findViewById(R.id.cc2);
        this.f87129k = (RecyclerView) viewGroup.findViewById(R.id.cg1);
        this.f87130l = (TextView) viewGroup.findViewById(R.id.d_v);
        RecyclerView recyclerView = this.f87129k;
        if (C35279p.m79763a()) {
            i = 8;
        } else {
            i = 0;
        }
        recyclerView.setVisibility(i);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mo71060h());
        linearLayoutManager.mo4731b(0);
        this.f87129k.setLayoutManager(linearLayoutManager);
        this.f87129k.mo4798a((C1331h) new C35402h(mo71060h().getResources().getDimensionPixelSize(R.dimen.ir)));
        this.f87131m = new C33476a(this.f87129k);
        this.f87129k.setAdapter(this.f87131m);
        this.f87141w = (SoftInputResizeFuncLayoutView) viewGroup.findViewById(R.id.bw1);
        this.f87141w.setEditText(this.f87121c);
        this.f87141w.setResizable(false);
        mo71058f();
        if (this.f87115H == null) {
            this.f87115H = new C33627k(this);
        }
        if (this.f87117J == null) {
            this.f87117J = new C23698l() {
                public final void afterTextChanged(Editable editable) {
                    boolean z = true;
                    if (TextUtils.isEmpty(editable)) {
                        if (C33611i.this.f87132n != null) {
                            C33611i.this.f87132n.mo70882a(false);
                        }
                        C33611i.this.f87123e.setActivated(false);
                        C33611i.this.f87123e.setVisibility(8);
                    } else {
                        if (C33611i.this.f87132n != null) {
                            C33611i.this.f87132n.mo70882a(true);
                        }
                        C33611i.this.f87123e.setActivated(true);
                        C33611i.this.f87123e.setVisibility(0);
                    }
                    C33611i iVar = C33611i.this;
                    if (C34004b.m77718b().enableExpressionTab() && iVar.f87121c.f87492c) {
                        iVar.f87123e.setVisibility(8);
                        iVar.f87123e.setActivated(false);
                    }
                    C33611i.this.mo71058f();
                    C33625a aVar = C33611i.this.f87137s;
                    if (editable.length() <= 0) {
                        z = false;
                    }
                    new StringBuilder("onStatusChanged hasContent=").append(z);
                    aVar.f87164b = z;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = aVar.f87163a + 2000;
                    if (j <= elapsedRealtime || !z) {
                        aVar.f87163a = elapsedRealtime;
                        aVar.mo71077a();
                        return;
                    }
                    C33611i.this.f87126h.removeCallbacks(aVar);
                    C33611i.this.f87126h.postDelayed(aVar, j - elapsedRealtime);
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    if (C34004b.m77718b().enableExpressionTab() && C33611i.this.f87121c.f87492c) {
                        C33611i.this.mo71064l();
                    } else if (C35279p.m79763a() || C32816h.m75716b().getImAssociativeEmoticonAll().getShow().intValue() != 1 || C34004b.m77717a().mo71949f().getAssociativeEmoji() == 0 || !C35284t.m79782a().mo73447w() || ((C33611i.this.f87133o.isAuthorSupporterChat() && !C33453a.m76681d()) || charSequence.length() > 8)) {
                        CharSequence charSequence2 = (CharSequence) C33611i.this.f87121c.getTag(R.id.j);
                        if (charSequence2 == null || !TextUtils.equals(charSequence2, charSequence)) {
                            C33611i iVar = C33611i.this;
                            if (!C29410a.m69356a().mo59477e()) {
                                if (TextUtils.isEmpty(charSequence)) {
                                    iVar.mo71051a(null);
                                    return;
                                }
                                iVar.mo71051a(C29410a.m69356a().mo59471a(charSequence.toString()));
                            }
                            return;
                        }
                        C33611i.this.f87121c.setTag(R.id.j, null);
                    } else {
                        C33611i.this.mo71064l();
                    }
                }
            };
        }
        if (this.f87116I == null) {
            this.f87116I = new OnKeyListener() {
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (view.equals(C33611i.this.f87121c) && i == 4 && keyEvent.getAction() == 0) {
                        return C33611i.this.mo70586c();
                    }
                    return false;
                }
            };
        }
        this.f87121c.removeTextChangedListener(this.f87117J);
        this.f87121c.addTextChangedListener(this.f87117J);
        this.f87121c.setFilters(new InputFilter[]{new C33359af(C35197am.m79552a())});
        this.f87121c.setOnKeyListener(this.f87116I);
        this.f87121c.setOnClickListener(this.f87115H);
        this.f87121c.setOnFocusChangeListener(new OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                if (!z) {
                    C33611i.this.mo70587d();
                }
            }
        });
        this.f87123e.setOnClickListener(this.f87115H);
        this.f87122d.setOnClickListener(this.f87115H);
        this.f87124f.setOnClickListener(this.f87115H);
        this.f87128j.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            /* renamed from: a */
            DmtRadioButton f87160a = ((DmtRadioButton) C33611i.this.f87128j.findViewById(R.id.c91));

            /* renamed from: b */
            DmtRadioButton f87161b = ((DmtRadioButton) C33611i.this.f87128j.findViewById(R.id.c92));

            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.c91) {
                    C33611i.this.mo71055c(1);
                    C33611i.this.mo71052a(false);
                    this.f87160a.setFontType(C10751d.f28903b);
                    this.f87161b.setFontType(C10751d.f28902a);
                    return;
                }
                C33611i.this.mo71055c(-2);
                C33611i.this.mo71052a(true);
                this.f87160a.setFontType(C10751d.f28902a);
                this.f87161b.setFontType(C10751d.f28903b);
            }
        });
        this.f87131m.f86759f = new C33480c() {
            /* renamed from: a */
            public final void mo70897a(int i) {
                if (i >= 0) {
                    if (C33611i.this.mo71061i()) {
                        C10691a.m21542b(C33611i.this.mo71060h(), (int) R.string.bh0).mo19066a();
                        return;
                    }
                    C33604b bVar = (C33604b) C33611i.this.f87136r.get(i);
                    if (bVar != null && bVar.f87095b != null && bVar.f87095b.f87100a != null) {
                        C33596b bVar2 = bVar.f87095b.f87100a;
                        C33611i iVar = C33611i.this;
                        C29366a aVar = new C29366a();
                        aVar.setAnimateType(bVar.f87094a);
                        aVar.setStickerType(3);
                        aVar.setWidth(Integer.parseInt(bVar2.f87074b));
                        aVar.setHeight(Integer.parseInt(bVar2.f87075c));
                        aVar.setDisplayName(iVar.mo71060h().getString(R.string.bkp));
                        List singletonList = Collections.singletonList(bVar2.f87073a);
                        UrlModel urlModel = new UrlModel();
                        urlModel.setUrlList(singletonList);
                        aVar.setAnimateUrl(urlModel);
                        C29285a aVar2 = new C29285a();
                        aVar2.f76668d = aVar;
                        iVar.mo71062j();
                        iVar.f87120b.mo70577a(aVar2);
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
                    C33611i iVar = C33611i.this;
                    if (bVar.f87082f == 2) {
                        String str2 = TEVideoRecorder.FACE_BEAUTY_NULL;
                        String str3 = ",";
                        String charSequence = C35265e.m79730b().toString();
                        String conversationId = iVar.f87133o.getConversationId();
                        if (iVar.f87133o.isGroupChat()) {
                            str = str2;
                        } else {
                            str = String.valueOf(C11190e.m22685a(conversationId));
                        }
                        if (iVar.f87121c.getText() == null) {
                            trim = "";
                        } else {
                            trim = iVar.f87121c.getText().toString().trim();
                        }
                        String str4 = trim;
                        List<C33595a> b = iVar.f87131m.mo70892b();
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
                    C33611i iVar2 = C33611i.this;
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
                        aVar2.setDisplayName(iVar2.mo71060h().getString(R.string.bgu));
                        C29285a aVar3 = new C29285a();
                        aVar3.f76668d = aVar2;
                        iVar2.mo71062j();
                        C29299b.m69093a(aVar2);
                        iVar2.f87120b.mo70577a(aVar3);
                        iVar2.f87121c.setText("");
                    }
                    C33611i.this.mo71054b(false);
                }
            }
        };
        this.f87131m.f86758e = new C33626j(this);
        if (!C35279p.m79763a()) {
            this.f87129k.mo4801a((C1340m) new C1340m() {
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 0) {
                        C33611i.this.mo71066n();
                    } else {
                        C33611i.this.mo71065m();
                    }
                    C33611i.this.mo71054b(false);
                }
            });
        }
        this.f87141w.setOnPanelChangeListener(this);
        this.f87141w.setOnClickListener(this.f87115H);
        C35225a.m79617l().mo73331a(this.f87122d, this.f87123e);
        this.f87125g.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (C33611i.this.f87125g.getVisibility() != 0) {
                    C33611i.this.mo70587d();
                }
            }
        });
        C33549a aVar = new C33549a(this, this.f87141w);
        aVar.f86960c.f76837d = true;
        aVar.f86960c.f76840g.add(Integer.valueOf(2));
        aVar.f86960c.f76834a = true;
        aVar.f86960c.f76840g.add(Integer.valueOf(1));
        aVar.f86960c.f76835b = true;
        aVar.f86960c.f76840g.add(Integer.valueOf(3));
        aVar.f86960c.f76836c = true;
        aVar.f86960c.f76840g.add(Integer.valueOf(4));
        this.f87132n = new C33546a(aVar.f86958a, aVar.f86960c, aVar.f86959b);
        this.f87141w.mo22247a(1, this.f87132n.mo70881a());
        this.f87109B = Math.max(0, C35284t.m79782a().mo73448x());
        C35429a inputMenuCustomizer = IMService.get().getInputMenuCustomizer();
        if (this.f87133o.isSingleChat() && inputMenuCustomizer != null) {
            C33354ac acVar = (C33354ac) this.f87133o;
            final IMUser fromUser = acVar.getFromUser();
            if (fromUser != null) {
                fromUser.getUid();
                fromUser.getSecUid();
                fromUser.getVerificationType();
                fromUser.getEnterpriseVerifyReason();
                new Object() {
                };
                acVar.getImAdLog();
            }
        }
    }
}
