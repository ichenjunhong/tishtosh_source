package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.AppCompatCheckBox;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.widget.C13376b;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.comment.C25056a;
import com.p683ss.android.ugc.aweme.comment.C25056a.C25058b;
import com.p683ss.android.ugc.aweme.comment.C25056a.C25059c;
import com.p683ss.android.ugc.aweme.comment.C25156f;
import com.p683ss.android.ugc.aweme.comment.abtest.DouyinDirectShowCommentMentionList;
import com.p683ss.android.ugc.aweme.comment.adapter.C25104b;
import com.p683ss.android.ugc.aweme.comment.adapter.C25104b.C25106b;
import com.p683ss.android.ugc.aweme.comment.adapter.C25134u;
import com.p683ss.android.ugc.aweme.comment.experiment.CommentGifEmojiExperiment;
import com.p683ss.android.ugc.aweme.comment.model.CommentAtSummonFriendItem;
import com.p683ss.android.ugc.aweme.comment.model.CommentAtUser;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25244o;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25244o.C25245a;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25244o.C25247c;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25244o.C25249d;
import com.p683ss.android.ugc.aweme.comment.widget.C25425b;
import com.p683ss.android.ugc.aweme.comment.widget.C25426c;
import com.p683ss.android.ugc.aweme.comment.widgets.SearchGifWidget;
import com.p683ss.android.ugc.aweme.comment.widgets.SearchGifWidget.C25447e;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.keyboard.C26912b;
import com.p683ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1596h.C26892b;
import com.p683ss.android.ugc.aweme.detail.p1628ui.FadeImageView;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29340c;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.C29340c.C29342a;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29406a;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47885fh;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.p2390d.C47801c;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText;
import com.ss.android.ugc.trill.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.KeyboardDialogFragment */
public class KeyboardDialogFragment extends C26892b implements OnShowListener, TextWatcher, C25359ba, C26912b {

    /* renamed from: A */
    private C47885fh f66956A;

    /* renamed from: B */
    private C25332ab f66957B;

    /* renamed from: C */
    private Pattern f66958C = Pattern.compile("^\\s*$");

    /* renamed from: D */
    private boolean f66959D = false;

    /* renamed from: E */
    private C29366a f66960E;

    /* renamed from: F */
    private boolean f66961F = false;

    /* renamed from: G */
    private CharSequence f66962G = null;

    /* renamed from: H */
    private boolean f66963H = false;

    /* renamed from: I */
    private boolean f66964I = true;

    /* renamed from: a */
    C29340c f66965a;

    /* renamed from: b */
    public C25327b f66966b;

    /* renamed from: c */
    public C25326a f66967c;

    /* renamed from: d */
    public C25328c f66968d;

    /* renamed from: e */
    protected boolean f66969e;

    /* renamed from: f */
    protected boolean f66970f;

    /* renamed from: g */
    protected int f66971g;

    /* renamed from: h */
    protected boolean f66972h;

    /* renamed from: i */
    protected boolean f66973i;

    /* renamed from: j */
    public boolean f66974j;

    /* renamed from: k */
    protected int f66975k;

    /* renamed from: l */
    protected boolean f66976l = false;

    /* renamed from: m */
    public Aweme f66977m;
    FadeImageView mAtView;
    AppCompatCheckBox mCbForward;
    CommentAtSearchLayout mCommentAtSearchLayout;
    CommentAtSearchLoadingView mCommentAtSearchLoadingView;
    View mContentLayout;
    View mEditBlank;
    public MentionEditText mEditText;
    FadeImageView mEmojiView;
    DmtTextView mErrorText;
    RemoteImageView mGifEmoji;
    View mGifEmojiClear;
    ImageView mGifEmojiDrawingCache;
    View mGifEmojiLayout;
    View mGuideLayout;
    TextView mGuideText;
    View mInputLayout;
    ClipLinearLayout mMiniPanelContainer;
    MeasureLinearLayout mOutWrapper;
    LinearLayout mPanelContainer;
    FadeImageView mPublishView;
    FadeImageView mReplyWithVideoView;
    RecyclerView mRvSearch;
    View mSearchGifLayout;
    ViewGroup mVgCommentContainer;

    /* renamed from: n */
    ValueAnimator f66978n;

    /* renamed from: o */
    public SearchGifWidget f66979o;

    /* renamed from: p */
    int[] f66980p = null;

    /* renamed from: q */
    public C25056a f66981q;

    /* renamed from: r */
    public boolean f66982r = false;

    /* renamed from: s */
    C25156f f66983s;

    /* renamed from: t */
    public C25104b f66984t;

    /* renamed from: u */
    public boolean f66985u = false;

    /* renamed from: v */
    C25360bb f66986v;

    /* renamed from: z */
    private C25426c f66987z;

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.KeyboardDialogFragment$a */
    public interface C25326a {
        /* renamed from: a */
        void mo51290a(String str, CharSequence charSequence, String str2, int i, LogPbBean logPbBean);

        /* renamed from: b */
        void mo51297b(String str, CharSequence charSequence, String str2, int i, LogPbBean logPbBean);

        /* renamed from: d */
        void mo51302d(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.KeyboardDialogFragment$b */
    public interface C25327b {
        /* renamed from: a */
        void mo51280a(int i, int i2, int i3, String str, String str2);

        /* renamed from: a */
        void mo51285a(CharSequence charSequence);

        /* renamed from: a */
        void mo51286a(CharSequence charSequence, List<TextExtraStruct> list, C29366a aVar, boolean z);

        /* renamed from: a */
        void mo51291a(boolean z);

        /* renamed from: b */
        void mo51294b(User user);

        /* renamed from: b */
        void mo51296b(String str);

        /* renamed from: c */
        void mo51299c(User user);

        /* renamed from: c */
        void mo51300c(String str);

        /* renamed from: k */
        void mo51308k();

        /* renamed from: l */
        void mo51309l();

        /* renamed from: m */
        int mo51310m();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.KeyboardDialogFragment$c */
    public interface C25328c {
        /* renamed from: a */
        void mo51283a(C29366a aVar);

        /* renamed from: n */
        void mo51311n();
    }

    /* renamed from: b */
    private static String m61572b(int i) {
        return i == 2 ? "favorite" : i == 3 ? "recent" : "recommend";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo51830a() {
        return R.drawable.a9s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo51831b() {
        return R.drawable.a9v;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: a */
    public final void mo51851a(boolean z, int i) {
        this.mEditText.postDelayed(new C25342ak(this, z), (long) i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo51850a(boolean z) {
        if (z) {
            this.f66984t.f66523c = m61571a((CharSequence) this.mEditText.getText(), this.mEditText.getSelectionStart());
            this.f66981q.mo51118a(this.mEditText.getSelectionStart(), this.mEditText.getText());
            this.mEditText.requestFocus();
            KeyboardUtils.m58183b(this.mEditText);
        } else {
            this.mCommentAtSearchLayout.dismiss();
            KeyboardUtils.m58184c(this.mEditText);
        }
        this.f66976l = !z;
    }

    /* renamed from: a */
    public final boolean mo51852a(String str, String str2) {
        return this.mEditText.mo95669a(0, str, str2);
    }

    /* renamed from: a */
    public final void mo51848a(C29366a aVar, int i, int i2) {
        mo51855b(m61572b(i), m61573b(aVar), i2, aVar.getLogPb());
    }

    /* renamed from: a */
    public final void mo51849a(String str, String str2, int i, LogPbBean logPbBean) {
        if (this.f66967c != null) {
            this.f66967c.mo51290a(str, this.f66979o.mo52054y(), str2, i, logPbBean);
        }
    }

    /* renamed from: d */
    public final void mo51860d() {
        KeyboardUtils.m58184c(this.mEditText);
        dismiss();
    }

    /* renamed from: f */
    public final void mo51863f() {
        if (this.f66983s != null) {
            this.f66983s.mo51281a((EditText) this.mEditText);
        }
    }

    public void onPause() {
        super.onPause();
        this.mOutWrapper.getKeyBoardObservable().mo54867b(this);
    }

    public void onResume() {
        super.onResume();
        this.mOutWrapper.getKeyBoardObservable().mo54865a(this);
        this.mEditText.requestFocus();
        mo51851a(!this.f66976l, 200);
    }

    public void onStart() {
        super.onStart();
        try {
            Window window = getDialog().getWindow();
            LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.dimAmount = 0.15f;
                window.setAttributes(attributes);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: k */
    private void m61574k() {
        if (this.f66980p == null) {
            int[] iArr = new int[2];
            this.mEditText.getLocationInWindow(iArr);
            this.f66980p = new int[2];
            this.f66980p[0] = iArr[0];
            this.f66980p[1] = (int) (((float) iArr[1]) + C9432q.m18687b(C11010c.m22280a(), -15.0f));
        }
    }

    /* renamed from: g */
    public final boolean mo51864g() {
        if (!C20854a.m53167g().isLogin() || !this.f66970f) {
            return false;
        }
        if (this.mEditText.getTextExtraStructList() == null || this.mEditText.getTextExtraStructList().size() < 5) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void mo51866i() {
        boolean z;
        Editable text = this.mEditText.getText();
        FadeImageView fadeImageView = this.mPublishView;
        if ((text == null || text.length() <= 0 || this.f66958C.matcher(text).matches()) && this.f66960E == null) {
            z = false;
        } else {
            z = true;
        }
        fadeImageView.setEnabled(z);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f66983s != null) {
            C25156f fVar = this.f66983s;
            MentionEditText mentionEditText = this.mEditText;
            if (mentionEditText != null && fVar.f66600p.contains(mentionEditText)) {
                fVar.f66600p.remove(mentionEditText);
            }
        }
        if (this.f66981q != null) {
            C1690c cVar = this.f66981q.f66383g.f66851b;
            if (cVar != null) {
                cVar.dispose();
            }
        }
        if (this.f66965a != null) {
            this.f66965a.mo59232e();
        }
    }

    public void dismiss() {
        this.f66957B = null;
        if (this.f66978n != null && this.f66978n.isRunning()) {
            this.f66978n.cancel();
            this.mGifEmojiDrawingCache.setVisibility(8);
        }
        this.f66979o.mo52052w();
        try {
            super.dismiss();
        } catch (IllegalStateException unused) {
            super.dismissAllowingStateLoss();
        }
        if (this.f66968d != null) {
            this.f66968d.mo51283a(this.f66960E);
        }
        this.f66960E = null;
        if (this.mReplyWithVideoView != null && this.mReplyWithVideoView.getVisibility() == 0) {
            this.mReplyWithVideoView.setVisibility(8);
            this.mEditBlank.setVisibility(0);
            if (this.f66969e) {
                this.mEmojiView.setVisibility(0);
                this.f66969e = false;
            }
            if (this.f66986v != null) {
                this.f66986v.dismiss();
            }
            this.mVgCommentContainer.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* renamed from: e */
    public final void mo51862e() {
        m61574k();
        int height = this.mInputLayout.getHeight();
        int height2 = this.mSearchGifLayout.getHeight();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) height);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setDuration(300);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, (float) height2, 0.0f);
        translateAnimation2.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation2.setDuration(300);
        translateAnimation.setAnimationListener(new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                KeyboardDialogFragment.this.mInputLayout.setVisibility(8);
            }
        });
        translateAnimation2.setAnimationListener(new AnimationListener() {
            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                KeyboardDialogFragment.this.mSearchGifLayout.setAlpha(1.0f);
                KeyboardDialogFragment.this.mSearchGifLayout.setVisibility(0);
                SearchGifWidget searchGifWidget = KeyboardDialogFragment.this.f66979o;
                searchGifWidget.mo52049t().requestFocus();
                searchGifWidget.mo52049t().postDelayed(new C25447e(searchGifWidget), 300);
            }
        });
        this.mInputLayout.startAnimation(translateAnimation);
        this.mSearchGifLayout.startAnimation(translateAnimation2);
    }

    /* renamed from: h */
    public final void mo51865h() {
        this.f66979o.mo52051v();
        int height = this.mInputLayout.getHeight();
        int height2 = this.mSearchGifLayout.getHeight();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) height, 0.0f);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setDuration(300);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) height2));
        animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.setDuration(300);
        translateAnimation.setAnimationListener(new AnimationListener() {
            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                KeyboardDialogFragment.this.mInputLayout.setVisibility(0);
            }
        });
        animationSet.setAnimationListener(new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                KeyboardDialogFragment.this.mSearchGifLayout.setAlpha(0.0f);
                KeyboardDialogFragment.this.mSearchGifLayout.setVisibility(8);
                KeyboardDialogFragment.this.mEditText.requestFocus();
                if (!KeyboardDialogFragment.this.f66976l) {
                    KeyboardDialogFragment.this.f66981q.mo51118a(KeyboardDialogFragment.this.mEditText.getSelectionStart(), KeyboardDialogFragment.this.mEditText.getText());
                    KeyboardDialogFragment.this.mEmojiView.setImageResource(KeyboardDialogFragment.this.mo51830a());
                    KeyboardDialogFragment.this.mEmojiView.setContentDescription(C11010c.m22280a().getString(R.string.c3));
                    KeyboardUtils.m58183b(KeyboardDialogFragment.this.mEditText);
                    return;
                }
                KeyboardDialogFragment.this.mCommentAtSearchLayout.dismiss();
                KeyboardDialogFragment.this.mEmojiView.setImageResource(KeyboardDialogFragment.this.mo51831b());
                KeyboardDialogFragment.this.mEmojiView.setContentDescription(C11010c.m22280a().getString(R.string.c4));
                KeyboardUtils.m58184c(KeyboardDialogFragment.this.mEditText);
            }
        });
        this.mInputLayout.startAnimation(translateAnimation);
        this.mSearchGifLayout.startAnimation(animationSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo51858c() {
        if (this.f66966b != null) {
            this.f66966b.mo51286a(this.mEditText.getText(), this.mEditText.getTextExtraStructList(), this.f66960E, this.f66973i);
            this.f66956A.mo95094a("comment");
            C29406a b = C29406a.m69329b(C11010c.m22280a());
            String b2 = b.mo59405b();
            LinkedHashMap a = b.mo59470a((CharSequence) this.mEditText.getText());
            if (!a.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                for (Entry entry : a.entrySet()) {
                    sb.append((String) entry.getKey());
                    sb.append(',');
                    sb2.append(entry.getValue());
                    sb2.append(',');
                }
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                    sb.deleteCharAt(sb.length() - 1);
                }
                if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                    sb2.deleteCharAt(sb2.length() - 1);
                }
                C26890h.m65011a("send_emoji", C23089d.m56640a().mo47829a("enter_from", "comment").mo47829a("md5", b2).mo47829a("emoji_name", sb.toString()).mo47829a("cnt", sb2.toString()).f61491a);
            }
        }
    }

    /* renamed from: a */
    public final void mo51847a(C29366a aVar) {
        this.f66960E = aVar;
        this.f66983s.mo51293b(aVar);
    }

    /* renamed from: a */
    public final void mo51846a(C25156f fVar) {
        this.f66983s = fVar;
        if (this.mEditText != null) {
            this.f66983s.mo51292b((EditText) this.mEditText);
        }
    }

    public void afterTextChanged(Editable editable) {
        C29408b.m69342a((TextView) this.mEditText);
        mo51863f();
        mo51866i();
    }

    public void onShow(DialogInterface dialogInterface) {
        if (this.f66968d != null) {
            this.f66968d.mo51311n();
        }
    }

    /* renamed from: b */
    public static String m61573b(C29366a aVar) {
        String str = "";
        if (aVar == null || aVar.getAnimateUrl() == null) {
            return str;
        }
        return aVar.getAnimateUrl().getUri();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo51859c(View view) {
        if (this.f66966b != null) {
            if (this.f66976l) {
                this.f66966b.mo51296b("icon");
            } else {
                this.f66966b.mo51309l();
            }
        }
        mo51851a(this.f66976l, 0);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mOutWrapper != null) {
            MeasureLinearLayout measureLinearLayout = this.mOutWrapper;
            if (C47801c.m103435d()) {
                measureLinearLayout.f70769a++;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.a4e);
        this.f66956A = new C47885fh();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo51854b(View view) {
        if (this.f66976l && this.f66966b != null) {
            this.f66966b.mo51296b("box");
        }
        mo51851a(true, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo51861d(View view) {
        if (this.f66966b != null) {
            this.f66982r = true;
            if (!this.f66976l) {
                int selectionStart = this.mEditText.getSelectionStart();
                Editable text = this.mEditText.getText();
                if (text != null) {
                    text.insert(selectionStart, "@");
                }
                return;
            }
            this.f66961F = true;
            mo51851a(true, 0);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        int i;
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("showEmojiPanel")) {
            i = 21;
        } else {
            i = 19;
            this.f66976l = true;
        }
        if (window != null) {
            window.setSoftInputMode(i);
            window.setGravity(80);
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(true);
        return onCreateDialog;
    }

    /* renamed from: a */
    public final void mo51842a(int i) {
        String str;
        if (this.f66967c != null) {
            C25326a aVar = this.f66967c;
            switch (i) {
                case 2:
                    str = "favorite";
                    break;
                case 3:
                case 4:
                    str = "recommend";
                    break;
                default:
                    str = "system";
                    break;
            }
            aVar.mo51302d(str);
        }
    }

    /* renamed from: a */
    public final void mo51843a(View view) {
        this.mGifEmojiLayout.setVisibility(0);
        this.mSearchGifLayout.setVisibility(8);
        this.mInputLayout.setVisibility(0);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        this.mContentLayout.getLocationInWindow(iArr2);
        this.mGifEmojiLayout.post(new C25347ap(this, view, iArr, iArr2));
    }

    public void onActivityCreated(Bundle bundle) {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int[] iArr;
        super.onActivityCreated(bundle);
        if (this.f66981q == null) {
            this.f66981q = new C25056a();
        }
        C25056a aVar = this.f66981q;
        C25244o oVar = aVar.f66383g;
        C25245a cVar = new C25059c(aVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C52711k.m112240b(cVar, "onReceiveMsgListener");
        C52711k.m112240b(timeUnit, "timeUnit");
        C2201v a = C2201v.m6601a((C2205y<T>) new C25247c<T>(oVar));
        C52711k.m112236a((Object) a, "Observable.create {\n    …}\n            }\n        }");
        oVar.f66851b = a.mo6534c(300, timeUnit).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C25249d<Object>(cVar));
        this.mRvSearch.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f66984t = new C25104b(this.f66977m, this.f66959D);
        this.mRvSearch.setAdapter(this.f66984t);
        this.mErrorText.setOnClickListener(new C25345an(this));
        C25056a aVar2 = this.f66981q;
        C253193 r1 = new C25058b() {
            public final void dismiss() {
                KeyboardDialogFragment.this.mCommentAtSearchLayout.dismiss();
            }

            /* renamed from: a */
            public final void mo51124a() {
                KeyboardDialogFragment.this.mErrorText.setVisibility(8);
                KeyboardDialogFragment.this.mRvSearch.setVisibility(0);
                KeyboardDialogFragment.this.mCommentAtSearchLayout.mo51796a();
            }

            /* renamed from: b */
            public final void mo51127b() {
                KeyboardDialogFragment.this.mErrorText.setVisibility(0);
                KeyboardDialogFragment.this.mRvSearch.setVisibility(8);
            }

            /* renamed from: a */
            public final void mo51125a(boolean z) {
                KeyboardDialogFragment.this.mCommentAtSearchLoadingView.mo51808a(!z);
                if (z) {
                    KeyboardDialogFragment.this.mCommentAtSearchLoadingView.setVisibility(8);
                } else {
                    KeyboardDialogFragment.this.mCommentAtSearchLoadingView.setVisibility(0);
                }
            }

            /* renamed from: a */
            public final boolean mo51126a(String str) {
                return TextUtils.equals(str, C25056a.m60903a(KeyboardDialogFragment.this.mEditText.getSelectionStart(), KeyboardDialogFragment.this.mEditText.getEditableText(), true));
            }
        };
        C52711k.m112240b(r1, "<set-?>");
        aVar2.f66377a = r1;
        C25056a aVar3 = this.f66981q;
        C25104b bVar = this.f66984t;
        C52711k.m112240b(bVar, "<set-?>");
        aVar3.f66378b = bVar;
        this.f66984t.mo54788a((C26846a) new C25346ao(this));
        this.f66984t.f66521a = new C25106b() {
            /* renamed from: a */
            public final void mo51193a(User user) {
                if (user != null) {
                    Context context = KeyboardDialogFragment.this.getContext();
                    if (context == null) {
                        context = C11010c.m22280a();
                    }
                    if (!C25357az.m61638a(context)) {
                        C10691a.m21542b(context, (int) R.string.cg1).mo19066a();
                    } else if (!KeyboardDialogFragment.this.mCommentAtSearchLayout.f66887c) {
                        KeyboardDialogFragment.this.f66966b.mo51294b(user);
                        C10691a.m21548c(context, (int) R.string.bna).mo19066a();
                        KeyboardDialogFragment.this.mEditText.setText("");
                        KeyboardDialogFragment.this.mo51860d();
                    }
                }
            }

            /* renamed from: a */
            public final void mo51192a(int i, CommentAtSummonFriendItem commentAtSummonFriendItem) {
                int i2;
                if (!KeyboardDialogFragment.this.mCommentAtSearchLayout.f66887c) {
                    KeyboardDialogFragment.this.mCommentAtSearchLayout.dismiss();
                    Editable text = KeyboardDialogFragment.this.mEditText.getText();
                    int selectionStart = KeyboardDialogFragment.this.mEditText.getSelectionStart();
                    String a = C25056a.m60903a(selectionStart, KeyboardDialogFragment.this.mEditText.getText(), false);
                    if (a == null) {
                        a = "";
                    }
                    String str = a;
                    if (text != null) {
                        text.delete(selectionStart - str.length(), selectionStart);
                    }
                    User user = CommentAtUser.Companion.toUser(commentAtSummonFriendItem.mUser);
                    if (user != null) {
                        String nickname = user.getNickname();
                        boolean a2 = KeyboardDialogFragment.this.mo51852a(C47915gg.m103650b(user), commentAtSummonFriendItem.mUser.uid);
                        if (!a2 && KeyboardDialogFragment.this.getContext() != null) {
                            C9432q.m18672a(KeyboardDialogFragment.this.getContext(), (int) R.string.hm);
                        }
                        if (a2) {
                            C25327b bVar = KeyboardDialogFragment.this.f66966b;
                            int length = str.length();
                            if (nickname != null) {
                                i2 = nickname.length();
                            } else {
                                i2 = 0;
                            }
                            bVar.mo51280a(length, i2, i + 1, str, user.getUid());
                            KeyboardDialogFragment.this.f66966b.mo51299c(user);
                        }
                    }
                }
            }
        };
        this.mEditText.addTextChangedListener(new C23698l() {
            public final void afterTextChanged(Editable editable) {
                if (KeyboardDialogFragment.this.mo51864g() && !KeyboardDialogFragment.this.f66976l && !KeyboardDialogFragment.this.mCommentAtSearchLayout.f66888d) {
                    KeyboardDialogFragment.this.f66984t.f66523c = KeyboardDialogFragment.m61571a((CharSequence) editable, KeyboardDialogFragment.this.mEditText.getSelectionStart());
                    KeyboardDialogFragment.this.f66981q.mo51118a(KeyboardDialogFragment.this.mEditText.getSelectionStart(), editable);
                }
                KeyboardDialogFragment.this.mo51863f();
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (!TextUtils.isEmpty(charSequence) && i3 > 0) {
                    if ('@' == charSequence.toString().charAt((i + i3) - 1) && KeyboardDialogFragment.this.mo51864g()) {
                        KeyboardDialogFragment.this.mCommentAtSearchLayout.mo51796a();
                        if (KeyboardDialogFragment.this.f66966b != null) {
                            if (KeyboardDialogFragment.this.f66982r) {
                                KeyboardDialogFragment.this.f66966b.mo51300c("button");
                            } else {
                                KeyboardDialogFragment.this.f66966b.mo51300c("input");
                            }
                            if (KeyboardDialogFragment.this.f66976l) {
                                KeyboardDialogFragment.this.f66966b.mo51296b("icon");
                                KeyboardDialogFragment.this.mo51851a(KeyboardDialogFragment.this.f66976l, 0);
                            }
                        }
                        KeyboardDialogFragment.this.f66982r = false;
                    } else if (KeyboardDialogFragment.this.mEditText.getTextExtraStructList().size() >= 5) {
                        C9432q.m18672a(KeyboardDialogFragment.this.getContext(), (int) R.string.c56);
                    }
                }
            }
        });
        this.mEditText.setHighlightColor(getContext().getResources().getColor(R.color.io));
        getDialog().getWindow().setLayout(-1, -1);
        getDialog().setOnShowListener(this);
        this.mPublishView.setOnClickListener(new C25349ar(this));
        this.mAtView.setOnClickListener(new C25350as(this));
        this.mReplyWithVideoView.setOnClickListener(new C25351at(this));
        this.mEmojiView.setOnClickListener(new C25352au(this));
        FadeImageView fadeImageView = this.mEmojiView;
        if (this.f66976l) {
            i = mo51831b();
        } else {
            i = mo51830a();
        }
        fadeImageView.setImageResource(i);
        FadeImageView fadeImageView2 = this.mEmojiView;
        Context a2 = C11010c.m22280a();
        if (this.f66976l) {
            i2 = R.string.c4;
        } else {
            i2 = R.string.c3;
        }
        fadeImageView2.setContentDescription(a2.getString(i2));
        this.f66956A.mo95093a((EditText) this.mEditText);
        this.mEditText.setMentionTextColor(C0726c.m2098c(C11010c.m22280a(), R.color.a0y));
        this.mEditText.setOnMentionInputListener(new C25353av(this));
        this.mEditText.setOnClickListener(new C25354aw(this));
        this.mOutWrapper.setOnClickListener(new C25355ax(this));
        this.mOutWrapper.findViewById(R.id.yw).setOnClickListener(C25356ay.f67042a);
        this.mCbForward.setOnCheckedChangeListener(new C25339ah(this));
        this.mGifEmojiClear.setOnClickListener(new C25340ai(this));
        this.f66987z = new C25426c(this.mPanelContainer);
        C25426c cVar2 = this.f66987z;
        C25341aj ajVar = new C25341aj(this);
        C52711k.m112240b(ajVar, "listener");
        cVar2.f67257a = ajVar;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f66961F = arguments.getBoolean("clickAt");
            this.f66975k = arguments.getInt("maxLength");
            boolean z4 = true;
            if (this.f66975k > 0) {
                this.mEditText.setFilters(new InputFilter[]{new C25425b(this.f66975k)});
            }
            C29366a aVar4 = this.f66960E;
            if (aVar4 != null) {
                UrlModel animateUrl = aVar4.getAnimateUrl();
                if (animateUrl != null) {
                    this.mGifEmojiLayout.setVisibility(0);
                    this.mGifEmojiClear.setVisibility(0);
                    C52711k.m112240b(aVar4, "$this$thumbnailDisplaySize");
                    int b = (int) C9432q.m18687b(C11010c.m22280a(), 60.0f);
                    if (aVar4.getWidth() == 0 || aVar4.getHeight() == 0) {
                        iArr = new int[]{b, b};
                    } else {
                        iArr = new int[]{Math.min((aVar4.getWidth() / aVar4.getHeight()) * b, (int) C9432q.m18687b(C11010c.m22280a(), 107.0f)), b};
                    }
                    this.mGifEmojiLayout.getLayoutParams().width = iArr[0];
                    this.mGifEmojiLayout.requestLayout();
                    C23515d.m57670a(this.mGifEmoji, animateUrl, iArr[0], iArr[1]);
                }
            }
            CharSequence charSequence = arguments.getCharSequence("hint");
            if (charSequence != null) {
                this.mEditText.setHint(charSequence);
            }
            User user = (User) arguments.getSerializable("user");
            if (user != null) {
                this.mEditText.setHint(C11010c.m22280a().getString(R.string.d6y, new Object[]{C47915gg.m103650b(user)}));
                if (this.f66966b != null) {
                    this.f66966b.mo51285a(this.mEditText.getHint());
                }
            }
            this.mEditText.addTextChangedListener(this);
            HashSet hashSet = (HashSet) arguments.getSerializable("atUserSet");
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    User user2 = (User) it.next();
                    mo51852a(C47915gg.m103650b(user2), user2.getUid());
                }
            }
            User user3 = (User) arguments.getSerializable("atUser");
            if (user3 != null) {
                mo51852a(C47915gg.m103650b(user3), user3.getUid());
            }
            this.mPublishView.setVisibility(0);
            mo51866i();
            boolean z5 = arguments.getBoolean("showAt");
            FadeImageView fadeImageView3 = this.mAtView;
            if (z5) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            fadeImageView3.setVisibility(i3);
            this.f66970f = z5;
            this.f66971g = arguments.getInt("viewType");
            this.f66972h = arguments.getBoolean("canForward");
            if (!this.f66972h || this.f66971g == 4) {
                z = false;
            } else {
                z = true;
            }
            AppCompatCheckBox appCompatCheckBox = this.mCbForward;
            if (z) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            appCompatCheckBox.setVisibility(i4);
            if (!this.f66972h || z) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f66973i = z2;
            this.mCbForward.setTextColor(getContext().getResources().getColor(R.color.a3u));
            if (this.mPanelContainer != null) {
                if (this.f66957B == null) {
                    this.f66957B = new C25332ab(this.mEditText, this.f66975k, this);
                }
                C29342a a3 = new C29342a(this.f66957B, this.mPanelContainer).mo59281a();
                if (C10181b.m20511a().mo18168a(CommentGifEmojiExperiment.class, true, "comment_support_gif_emoji", 31744, 0) == 3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 && this.f66971g != 4) {
                    a3.f76831a.f76835b = true;
                    a3.f76831a.f76840g.add(Integer.valueOf(3));
                    a3.f76831a.f76836c = true;
                    a3.f76831a.f76840g.add(Integer.valueOf(4));
                    String str = "";
                    if (!(this.f66977m == null || this.f66977m.getAid() == null)) {
                        str = this.f66977m.getAid();
                    }
                    if (str != null) {
                        a3.f76831a.f76839f = str;
                    }
                }
                this.f66965a = a3.mo59282b();
                this.mPanelContainer.addView(this.f66965a.mo59227a());
            }
            C25426c cVar3 = this.f66987z;
            if (this.f66976l) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            cVar3.mo52025a(i5);
            if (this.f66985u) {
                this.mReplyWithVideoView.setVisibility(0);
                this.mEditBlank.setVisibility(8);
                if (this.mEmojiView.getVisibility() != 0) {
                    z4 = false;
                }
                this.f66969e = z4;
                if (this.f66969e) {
                    this.mEmojiView.setVisibility(8);
                }
                this.mVgCommentContainer.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) C9432q.m18687b(getContext(), 56.0f)));
            }
        }
        if (bundle != null) {
            try {
                super.dismiss();
            } catch (IllegalStateException unused) {
                super.dismissAllowingStateLoss();
            }
        }
    }

    /* renamed from: a */
    public static KeyboardDialogFragment m61569a(int i, boolean z) {
        KeyboardDialogFragment keyboardDialogFragment = new KeyboardDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("viewType", i);
        bundle.putBoolean("canForward", z);
        keyboardDialogFragment.setArguments(bundle);
        return keyboardDialogFragment;
    }

    /* renamed from: a */
    public static boolean m61571a(CharSequence charSequence, int i) {
        boolean z;
        if (C10181b.m20511a().mo18168a(DouyinDirectShowCommentMentionList.class, true, "direct_show_comment_mention_list", 31744, 0) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z && charSequence != null && i == charSequence.length()) {
            return Pattern.matches("^@+[^@]*$", charSequence);
        }
        return false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C13376b a = C13376b.f34879h.mo25076a(this, view);
        C25337af afVar = new C25337af(this);
        C253171 r0 = new C25134u() {
            /* renamed from: b */
            public final void mo51214b(View view, C29366a aVar, int i) {
                KeyboardDialogFragment.this.mo51855b("search", KeyboardDialogFragment.m61573b(aVar), i, aVar.getLogPb());
            }

            /* renamed from: a */
            public final void mo51213a(View view, C29366a aVar, int i) {
                KeyboardDialogFragment.this.mo51847a(aVar);
                KeyboardDialogFragment.this.mo51849a("search", KeyboardDialogFragment.m61573b(aVar), i, aVar.getLogPb());
                KeyboardDialogFragment.this.mo51866i();
                KeyboardDialogFragment.this.mo51843a(view);
                KeyboardDialogFragment.this.mo51865h();
            }
        };
        C25338ag agVar = new C25338ag(this);
        String str = "";
        if (!(this.f66977m == null || this.f66977m.getAid() == null)) {
            str = this.f66977m.getAid();
        }
        this.f66979o = new SearchGifWidget(afVar, r0, agVar, str);
        SearchGifWidget searchGifWidget = this.f66979o;
        C52711k.m112240b(searchGifWidget, "widget");
        if (searchGifWidget.mo25056e() <= 0) {
            a.mo25074a(searchGifWidget);
        } else {
            View view2 = a.f34884f;
            if (view2 != null) {
                searchGifWidget.f34859b = a.mo25073a();
                ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.b9j);
                C52711k.m112236a((Object) viewGroup, "container");
                searchGifWidget.mo25052a(viewGroup);
                a.f34882d.put(searchGifWidget, viewGroup);
                View inflate = ((LayoutInflater) a.f34880b.getValue()).inflate(searchGifWidget.mo25056e(), viewGroup, false);
                C52711k.m112236a((Object) inflate, "syncLayoutInflater.infla…youtId, container, false)");
                a.mo25075a(searchGifWidget, viewGroup, inflate);
            } else {
                throw new IllegalArgumentException("make sure this WidgetManager is created with rootView".toString());
            }
        }
        if (this.f66983s != null) {
            this.f66983s.mo51292b((EditText) this.mEditText);
        }
        if (!C25366f.f67056a) {
            C25366f.f67059d = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    public final void mo51856b(boolean z, int i) {
        int i2;
        float b = C9432q.m18687b(getContext(), 220.0f);
        if (this.f66966b.mo51310m() > 0) {
            float m = ((float) (this.f66966b.mo51310m() - i)) - C9432q.m18687b(getContext(), 52.0f);
            if (m > b) {
                i2 = (int) m;
            } else if (((float) C9432q.m18670a(getContext())) - C9432q.m18687b(getContext(), 52.0f) < b) {
                i2 = (int) (((float) (C9432q.m18670a(getContext()) - i)) - C9432q.m18687b(getContext(), 52.0f));
            } else {
                i2 = (int) b;
            }
        } else {
            i2 = (int) b;
        }
        this.mCommentAtSearchLayout.getLayoutParams().height = i2;
        this.mCommentAtSearchLayout.setInitValue(i2);
        if (this.f66961F) {
            this.mEditText.postDelayed(new C25343al(this), 300);
            this.f66961F = false;
        }
        if (z && !this.f66963H && !this.f66964I) {
            this.f66981q.mo51118a(this.mEditText.getSelectionStart(), this.mEditText.getText());
        }
        if (!z) {
            this.mCommentAtSearchLayout.dismiss();
        }
        int i3 = 8;
        if (z) {
            this.mEmojiView.setImageResource(mo51830a());
            this.mEmojiView.setContentDescription(C11010c.m22280a().getString(R.string.c3));
            this.f66987z.mo52025a(8);
            if (this.mReplyWithVideoView.getVisibility() == 0) {
                this.mReplyWithVideoView.post(new C25344am(this));
            }
        } else {
            this.mEmojiView.setImageResource(mo51831b());
            this.mEmojiView.setContentDescription(C11010c.m22280a().getString(R.string.c4));
            C25426c cVar = this.f66987z;
            if (this.f66976l) {
                i3 = 0;
            }
            cVar.mo52025a(i3);
            if (this.f66974j) {
                mo51851a(!this.f66976l, 300);
                this.f66974j = false;
            } else if ((!this.f66976l || this.f66979o.f67335h) && C25366f.m61645b()) {
                if (!C25366f.f67056a) {
                    if (System.currentTimeMillis() - C25366f.f67059d < 240) {
                        C25366f.f67060e++;
                    }
                    if (C25366f.f67060e >= 2) {
                        C25366f.f67058c.storeBoolean("keyboard_can_dismiss", false);
                        C25366f.f67058c.storeLong("keyboard_can_dismiss_expire_time", System.currentTimeMillis() + C25366f.f67057b);
                    }
                }
                if (C25366f.m61644a()) {
                    dismiss();
                }
            }
        }
        this.f66963H = z;
        this.f66964I = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo51845a(CompoundButton compoundButton, boolean z) {
        this.f66973i = z;
        if (z) {
            this.mEditText.setFilters(new InputFilter[]{new C25425b(60)});
            if (this.f66957B != null) {
                this.f66957B.f67004a = 60;
            }
        } else {
            this.mEditText.setFilters(new InputFilter[]{new C25425b(100)});
            if (this.f66957B != null) {
                this.f66957B.f67004a = 100;
            }
        }
        if (this.f66966b != null) {
            this.f66966b.mo51291a(z);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.b1j, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        return inflate;
    }

    /* renamed from: b */
    public final void mo51855b(String str, String str2, int i, LogPbBean logPbBean) {
        if (this.f66967c != null) {
            this.f66967c.mo51297b(str, this.f66979o.mo52054y(), str2, i, logPbBean);
        }
    }

    /* renamed from: a */
    public final void mo51844a(View view, C29366a aVar, int i, int i2) {
        m61574k();
        mo51847a(aVar);
        mo51849a(m61572b(i), m61573b(aVar), i2, aVar.getLogPb());
        mo51866i();
        mo51843a(view);
    }

    /* renamed from: a */
    public static KeyboardDialogFragment m61570a(CharSequence charSequence, int i, boolean z, int i2, boolean z2, boolean z3) {
        KeyboardDialogFragment a = m61569a(i2, z2);
        Bundle arguments = a.getArguments();
        if (arguments != null) {
            arguments.putCharSequence("hint", charSequence);
            arguments.putInt("maxLength", i);
            arguments.putBoolean("showAt", true);
            arguments.putBoolean("showEmojiPanel", z3);
        }
        return a;
    }
}
