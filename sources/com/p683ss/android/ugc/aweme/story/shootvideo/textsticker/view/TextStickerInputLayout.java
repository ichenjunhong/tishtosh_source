package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p683ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.p683ss.android.ugc.aweme.story.shootvideo.p2338a.C46665a;
import com.p683ss.android.ugc.aweme.story.shootvideo.p2341c.C46670b;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46678b;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46679c;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.TextSelectFontStyleLayout;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.C46712a;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.C46714c;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.C46717e;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.C46717e.C46718a;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerTextUnderlineIndexRange;
import com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerTextWrap;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.p2344b.C46745a;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout */
public class TextStickerInputLayout extends FrameLayout {

    /* renamed from: A */
    private ImageView f117921A;

    /* renamed from: B */
    private ImageView f117922B;

    /* renamed from: C */
    private InputMethodManager f117923C;

    /* renamed from: D */
    private C46712a f117924D;

    /* renamed from: E */
    private View f117925E;

    /* renamed from: F */
    private View f117926F;

    /* renamed from: G */
    private View f117927G;

    /* renamed from: H */
    private View f117928H;

    /* renamed from: a */
    protected TextStickerEditText f117929a;

    /* renamed from: b */
    protected ColorSelectLayout f117930b;

    /* renamed from: c */
    protected int f117931c;

    /* renamed from: d */
    protected int f117932d;

    /* renamed from: e */
    protected int f117933e;

    /* renamed from: f */
    protected int f117934f;

    /* renamed from: g */
    public boolean f117935g;

    /* renamed from: h */
    public C46670b f117936h;

    /* renamed from: i */
    public View f117937i;

    /* renamed from: j */
    protected TextSelectFontStyleLayout f117938j;

    /* renamed from: k */
    View f117939k;

    /* renamed from: l */
    public LinearLayout f117940l;

    /* renamed from: m */
    public String f117941m;

    /* renamed from: n */
    public String f117942n;

    /* renamed from: o */
    public boolean f117943o;

    /* renamed from: p */
    public boolean f117944p;

    /* renamed from: q */
    public boolean f117945q;

    /* renamed from: r */
    C46745a f117946r;

    /* renamed from: s */
    public C46736b f117947s;

    /* renamed from: t */
    public List<InteractTextStructWrap> f117948t;

    /* renamed from: u */
    public int f117949u;

    /* renamed from: v */
    public AVETParameter f117950v;

    /* renamed from: w */
    protected int f117951w;

    /* renamed from: x */
    C46735a f117952x;

    /* renamed from: y */
    private Context f117953y;

    /* renamed from: z */
    private View f117954z;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout$a */
    public interface C46735a {
        /* renamed from: a */
        void mo93689a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout$b */
    public interface C46736b {
        /* renamed from: a */
        void mo93668a();

        /* renamed from: b */
        void mo93669b();

        /* renamed from: c */
        boolean mo93670c();
    }

    public AVETParameter getAVETParameter() {
        return this.f117950v;
    }

    public int getAlignTxt() {
        return this.f117933e;
    }

    public int getCurColor() {
        return this.f117934f;
    }

    public int getCurTxtMode() {
        return this.f117931c;
    }

    public EditText getEditText() {
        return this.f117929a;
    }

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.a9j;
    }

    /* access modifiers changed from: protected */
    public int getScene() {
        return 0;
    }

    public C46736b getVisibleController() {
        return this.f117947s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C46745a mo90852a() {
        return new C46745a() {
            /* renamed from: a */
            public final void mo90858a(int i) {
                StringBuilder sb = new StringBuilder();
                sb.append(Integer.toHexString(i));
                C47702b.f120193a.mo94984a("select_text_color", C46665a.m101262a(TextStickerInputLayout.this.f117941m, TextStickerInputLayout.this.f117942n, TextStickerInputLayout.this.f117943o, TextStickerInputLayout.this.f117944p, TextStickerInputLayout.this.f117945q).mo47829a("color", sb.toString()).mo47826a("is_subtitle", 0).f61491a);
            }

            /* renamed from: b */
            public final void mo90862b(int i) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                C47702b.f120193a.mo94984a("select_text_style", C46665a.m101262a(TextStickerInputLayout.this.f117941m, TextStickerInputLayout.this.f117942n, TextStickerInputLayout.this.f117943o, TextStickerInputLayout.this.f117944p, TextStickerInputLayout.this.f117945q).mo47829a("text_style", sb.toString()).mo47826a("is_subtitle", 0).f61491a);
            }

            /* renamed from: a */
            public final void mo90859a(C46678b bVar) {
                C47702b.f120193a.mo94984a("select_text_font", C46665a.m101262a(TextStickerInputLayout.this.f117941m, TextStickerInputLayout.this.f117942n, TextStickerInputLayout.this.f117943o, TextStickerInputLayout.this.f117944p, TextStickerInputLayout.this.f117945q).mo47829a(" font", bVar.f117744b).mo47826a("is_subtitle", 0).f61491a);
            }

            /* renamed from: a */
            public final void mo90860a(TextStickerTextWrap textStickerTextWrap) {
                C47702b.f120193a.mo94984a("text_complete", C46665a.m101262a(TextStickerInputLayout.this.f117941m, TextStickerInputLayout.this.f117942n, TextStickerInputLayout.this.f117943o, TextStickerInputLayout.this.f117944p, TextStickerInputLayout.this.f117945q).f61491a);
            }

            /* renamed from: a */
            public final void mo90861a(String str) {
                C47702b.f120193a.mo94984a("select_text_paragraph", C46665a.m101262a(TextStickerInputLayout.this.f117941m, TextStickerInputLayout.this.f117942n, TextStickerInputLayout.this.f117943o, TextStickerInputLayout.this.f117944p, TextStickerInputLayout.this.f117945q).mo47829a("paragraph_style", str).f61491a);
            }
        };
    }

    /* access modifiers changed from: protected */
    public int getTopMargin() {
        return C23724k.m58225c();
    }

    /* renamed from: h */
    private void m101475h() {
        if (this.f117929a != null && this.f117923C != null) {
            this.f117923C.toggleSoftInput(0, 2);
        }
    }

    private int getEditTextLength() {
        if (this.f117929a.getText() != null) {
            return this.f117929a.getText().length();
        }
        return 0;
    }

    /* renamed from: f */
    public final void mo93844f() {
        if (this.f117929a != null && this.f117923C != null) {
            this.f117923C.hideSoftInputFromWindow(this.f117929a.getWindowToken(), 0);
        }
    }

    /* renamed from: g */
    public final void mo93845g() {
        if (this.f117938j != null) {
            this.f117938j.mo93609a(C46679c.m101291a().mo93629b());
        }
    }

    public Point getEditInputCenterPoint() {
        return new Point(C9432q.m18670a(this.f117953y) / 2, ((int) C9432q.m18687b(this.f117953y, 52.0f)) + (this.f117926F.getHeight() / 2));
    }

    public String getEditTextStr() {
        if (this.f117929a.getText() != null) {
            return this.f117929a.getText().toString();
        }
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo93838b() {
        if (this.f117933e == 2) {
            this.f117922B.setImageResource(R.drawable.af4);
        } else if (this.f117933e == 1) {
            this.f117922B.setImageResource(R.drawable.af7);
        } else {
            if (this.f117933e == 3) {
                this.f117922B.setImageResource(R.drawable.afb);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo93841d() {
        if (this.f117931c == 1) {
            this.f117921A.setImageResource(R.drawable.af6);
        } else if (this.f117931c == 2) {
            this.f117921A.setImageResource(R.drawable.af3);
        } else {
            if (this.f117931c == 3) {
                this.f117921A.setImageResource(R.drawable.afc);
            }
        }
    }

    /* renamed from: e */
    public final void mo93843e() {
        this.f117938j.mo93607a();
        this.f117931c = 1;
        this.f117932d = -1;
        this.f117934f = C46714c.m101387a().mo93786b().f117839b;
        this.f117933e = 2;
        this.f117929a.mo90950a(this.f117931c, this.f117934f);
        this.f117929a.mo93819a("", 0);
    }

    /* renamed from: c */
    public final void mo93840c() {
        if (this.f117931c == 1) {
            this.f117931c = 2;
        } else if (this.f117931c == 2) {
            this.f117931c = 3;
        } else if (this.f117931c == 3) {
            this.f117931c = 1;
        }
        mo93841d();
        this.f117929a.mo90950a(this.f117931c, this.f117934f);
        this.f117932d = this.f117931c;
        int i = 0;
        if (this.f117931c != 1) {
            if (this.f117931c == 2) {
                i = 1;
            } else if (this.f117931c == 3) {
                i = 2;
            }
        }
        if (this.f117946r != null) {
            this.f117946r.mo90862b(i);
        }
    }

    public TextStickerTextWrap getTextWrap() {
        TextStickerEditText textStickerEditText = this.f117929a;
        List<InteractTextStructWrap> list = this.f117948t;
        if (textStickerEditText == null) {
            TextStickerTextWrap textStickerTextWrap = new TextStickerTextWrap(null, null, 0, 7, null);
            return textStickerTextWrap;
        }
        String obj = textStickerEditText.getText().toString();
        Map linkedHashMap = new LinkedHashMap();
        int lineCount = textStickerEditText.getLineCount();
        int i = 0;
        int i2 = 0;
        while (i < lineCount) {
            int lineEnd = textStickerEditText.getLayout().getLineEnd(i);
            if (obj != null) {
                String substring = obj.substring(i2, lineEnd);
                C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                TextStickerString textStickerString = new TextStickerString(substring);
                List arrayList = new ArrayList();
                if (list != null) {
                    for (InteractTextStructWrap interactTextStructWrap : list) {
                        if (interactTextStructWrap.getRange().getStart() < lineEnd && interactTextStructWrap.getRange().getEnd() > i2) {
                            if (i2 >= interactTextStructWrap.getRange().getStart() && lineEnd <= interactTextStructWrap.getRange().getEnd()) {
                                arrayList.add(new InteractTextStructWrap(new TextStickerTextUnderlineIndexRange(i2 - i2, lineEnd - i2), CreateAnchorInfo.copy$default(interactTextStructWrap.getStruct(), 0, null, null, null, null, 31, null)));
                            } else if (i2 >= interactTextStructWrap.getRange().getStart() && lineEnd > interactTextStructWrap.getRange().getEnd()) {
                                arrayList.add(new InteractTextStructWrap(new TextStickerTextUnderlineIndexRange(i2 - i2, interactTextStructWrap.getRange().getEnd() - i2), CreateAnchorInfo.copy$default(interactTextStructWrap.getStruct(), 0, null, null, null, null, 31, null)));
                            } else if (i2 < interactTextStructWrap.getRange().getStart() && lineEnd <= interactTextStructWrap.getRange().getEnd()) {
                                arrayList.add(new InteractTextStructWrap(new TextStickerTextUnderlineIndexRange(interactTextStructWrap.getRange().getStart() - i2, lineEnd - i2), CreateAnchorInfo.copy$default(interactTextStructWrap.getStruct(), 0, null, null, null, null, 31, null)));
                            } else if (i2 < interactTextStructWrap.getRange().getStart() && lineEnd > interactTextStructWrap.getRange().getEnd()) {
                                arrayList.add(new InteractTextStructWrap(new TextStickerTextUnderlineIndexRange(interactTextStructWrap.getRange().getStart() - i2, interactTextStructWrap.getRange().getEnd() - i2), CreateAnchorInfo.copy$default(interactTextStructWrap.getStruct(), 0, null, null, null, null, 31, null)));
                            }
                        }
                    }
                }
                if (arrayList.size() > 1) {
                    C52575l.m112105a(arrayList, new C46718a());
                }
                linkedHashMap.put(textStickerString, arrayList);
                textStickerEditText.getLayout().getLineBounds(i, new Rect());
                i++;
                i2 = lineEnd;
            } else {
                throw new C52857u("null cannot be cast to non-null type java.lang.String");
            }
        }
        List arrayList2 = new ArrayList();
        if (list != null) {
            for (InteractTextStructWrap copy$default : list) {
                arrayList2.add(InteractTextStructWrap.copy$default(copy$default, null, null, 3, null));
            }
        }
        return new TextStickerTextWrap(linkedHashMap, new C52847n(obj, arrayList2), textStickerEditText.getSelectionStart());
    }

    public void setAVETParameter(AVETParameter aVETParameter) {
        this.f117950v = aVETParameter;
    }

    public void setBgColorChangeListener(C46712a aVar) {
        this.f117924D = aVar;
    }

    public void setStoryEditViewShowListener(C46670b bVar) {
        this.f117936h = bVar;
    }

    public void setTextStickerInputMobListener(C46745a aVar) {
        this.f117946r = aVar;
    }

    public void setTextStickerUpdateListener(C46735a aVar) {
        this.f117952x = aVar;
    }

    public void setVisibleController(C46736b bVar) {
        this.f117947s = bVar;
    }

    public TextStickerInputLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m101474a(boolean z) {
        if (this.f117935g || z) {
            this.f117935g = false;
            m101475h();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo93834a(int i) {
        this.f117929a.mo90950a(this.f117931c, i);
        this.f117934f = i;
        if (this.f117946r != null) {
            this.f117946r.mo90858a(i);
        }
    }

    public void dismiss(boolean z) {
        if (!this.f117935g) {
            if (getVisibility() != 8) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.0f});
                ofFloat.setDuration(300);
                ofFloat.addListener(new AnimatorListenerAdapter(this, null) {

                    /* renamed from: a */
                    final /* synthetic */ View f117706a;

                    /* renamed from: b */
                    final /* synthetic */ AnimatorListener f117707b;

                    public final void onAnimationEnd(Animator animator) {
                        this.f117706a.setVisibility(8);
                        if (this.f117707b != null) {
                            this.f117707b.onAnimationEnd(animator);
                        }
                        super.onAnimationEnd(animator);
                    }

                    {
                        this.f117706a = r1;
                        this.f117707b = r2;
                    }
                });
                ofFloat.start();
            }
            this.f117935g = true;
            if (this.f117936h != null) {
                this.f117936h.dismiss();
            }
        }
    }

    public void setData(TextStickerData textStickerData) {
        int bgMode = textStickerData.getBgMode();
        int color = textStickerData.getColor();
        int align = textStickerData.getAlign();
        this.f117931c = bgMode;
        this.f117934f = color;
        this.f117933e = align;
        if (TextUtils.isEmpty(textStickerData.getFontType())) {
            C46679c.m101291a().mo93625a(textStickerData.getFontType(), getScene());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo93835a(View view) {
        if (this.f117933e == 2) {
            this.f117933e = 1;
        } else if (this.f117933e == 1) {
            this.f117933e = 3;
        } else if (this.f117933e == 3) {
            this.f117933e = 2;
        }
        mo93838b();
        this.f117929a.setAligin(this.f117933e);
        String str = "center";
        if (this.f117933e == 2) {
            str = "center";
        } else if (this.f117933e == 1) {
            str = "left";
        } else if (this.f117933e == 3) {
            str = "right";
        }
        if (this.f117946r != null) {
            this.f117946r.mo90861a(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo93839b(C46678b bVar) {
        if (bVar != null) {
            mo93836a(bVar);
            C46679c.m101291a().mo93625a(bVar.f117747e, getScene());
            this.f117929a.setFontType(C46679c.m101291a().mo93631c(getScene()));
            this.f117929a.mo90950a(this.f117931c, this.f117934f);
            if (getScene() == 0) {
                if (bVar.f117748f > 0) {
                    this.f117929a.setFontSize(bVar.f117748f);
                } else {
                    this.f117929a.setFontSize(28);
                }
            }
            if (this.f117946r != null) {
                this.f117946r.mo90859a(bVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo93836a(C46678b bVar) {
        boolean z;
        if (bVar != null) {
            if (bVar.f117745c == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f117932d = this.f117931c;
                this.f117931c = 1;
                this.f117921A.setAlpha(0.34f);
                this.f117921A.setClickable(false);
                this.f117921A.setTag(Boolean.valueOf(false));
                return;
            }
            if (this.f117932d != -1) {
                this.f117931c = this.f117932d;
            }
            this.f117921A.setAlpha(1.0f);
            this.f117921A.setClickable(true);
            this.f117921A.setTag(Boolean.valueOf(true));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo90853a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.nt});
            this.f117951w = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public TextStickerInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f117931c = 1;
        this.f117932d = -1;
        this.f117933e = 2;
        this.f117934f = -1;
        this.f117935g = true;
        this.f117945q = true;
        this.f117946r = mo90852a();
        this.f117948t = new ArrayList();
        this.f117949u = 0;
        this.f117953y = context;
        this.f117923C = (InputMethodManager) this.f117953y.getSystemService("input_method");
        mo90853a(context, attributeSet);
        this.f117954z = LayoutInflater.from(this.f117953y).inflate(getLayoutRes(), null);
        this.f117937i = this.f117954z.findViewById(R.id.zl);
        this.f117926F = this.f117954z.findViewById(R.id.au4);
        this.f117929a = (TextStickerEditText) this.f117954z.findViewById(R.id.abs);
        this.f117921A = (ImageView) this.f117954z.findViewById(R.id.cm8);
        LinearLayout linearLayout = (LinearLayout) this.f117954z.findViewById(R.id.aiu);
        TextSelectFontStyleLayout textSelectFontStyleLayout = new TextSelectFontStyleLayout(this.f117953y, null, getScene());
        textSelectFontStyleLayout.setLayoutParams(new LayoutParams(-2, -2));
        this.f117938j = textSelectFontStyleLayout;
        this.f117938j.mo93609a(C46679c.m101291a().mo93629b());
        linearLayout.addView(this.f117938j);
        this.f117922B = (ImageView) this.f117954z.findViewById(R.id.el);
        this.f117922B.setOnClickListener(new C46750e(this));
        this.f117930b = (ColorSelectLayout) this.f117954z.findViewById(R.id.v7);
        this.f117930b.setColorChangeListener(new C46751f(this));
        this.f117938j.setClickFontStyleListener(new C46752g(this));
        this.f117921A.setOnClickListener(new C47687av() {
            /* renamed from: a */
            public final void mo59929a(View view) {
                TextStickerInputLayout.this.mo93840c();
            }
        });
        View findViewById = this.f117954z.findViewById(R.id.cv6);
        View findViewById2 = this.f117954z.findViewById(R.id.dgx);
        if (this.f117951w == 0) {
            this.f117925E = findViewById;
            findViewById2.setVisibility(8);
        } else {
            this.f117925E = findViewById2;
            findViewById.setVisibility(8);
        }
        this.f117925E.setOnClickListener(new C46753h(this));
        this.f117954z.setOnClickListener(new C46754i(this));
        this.f117921A.setImageResource(R.drawable.af3);
        addView(this.f117954z);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f117954z.getLayoutParams();
        layoutParams.topMargin = getTopMargin();
        this.f117954z.setLayoutParams(layoutParams);
        findViewById(R.id.buj).setOnClickListener(C46755j.f118063a);
        this.f117927G = this.f117954z.findViewById(R.id.k2);
        this.f117939k = this.f117954z.findViewById(R.id.k1);
        this.f117928H = this.f117954z.findViewById(R.id.cko);
        this.f117928H.setVisibility(8);
        this.f117927G.setBackground(C42430at.m93196a(-1, 16777215, (int) C9432q.m18687b(getContext(), 2.0f), (int) C9432q.m18687b(getContext(), 4.0f)));
        this.f117939k.setBackground(C42430at.m93199a(C46714c.m101387a().mo93786b().f117838a));
        this.f117928H.setOnClickListener(new C46756k(this));
        C38446k.m85767b(this.f117928H);
        this.f117921A.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (view.getTag() != null && !((Boolean) view.getTag()).booleanValue()) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            C38446k.m85765a(view, true);
                            break;
                        case 1:
                            break;
                    }
                }
                C38446k.m85765a(view, false);
                return false;
            }
        });
        this.f117925E.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (view.getTag() != null && !((Boolean) view.getTag()).booleanValue()) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            C38446k.m85766a(true, view);
                            break;
                        case 1:
                            break;
                    }
                }
                C38446k.m85766a(false, view);
                return false;
            }
        });
        C38446k.m85767b(this.f117922B);
        this.f117940l = (LinearLayout) findViewById(R.id.eke);
        int a = C39630m.m88234a().mo58602F().mo74269a();
        if (a == 1 || a == 3) {
            this.f117940l.setVisibility(0);
        } else {
            this.f117940l.setVisibility(8);
        }
        this.f117940l.setOnClickListener(new OnClickListener() {
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0084, code lost:
                if (r4 == null) goto L_0x0086;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x0094, code lost:
                if (r4 == null) goto L_0x0096;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a4, code lost:
                if (r4 == null) goto L_0x00a6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
                if (r6 == null) goto L_0x00b6;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r6) {
                /*
                    r5 = this;
                    com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r6)
                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r6 = com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout.this
                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout$b r6 = r6.f117947s
                    if (r6 == 0) goto L_0x0024
                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r6 = com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout.this
                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout$b r6 = r6.f117947s
                    boolean r6 = r6.mo93670c()
                    if (r6 == 0) goto L_0x0024
                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r6 = com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout.this
                    android.content.Context r6 = r6.getContext()
                    r0 = 2132552018(0x7f1c2952, float:2.0757411E38)
                    com.bytedance.ies.dmt.ui.d.a r6 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r6, r0)
                    r6.mo19066a()
                    return
                L_0x0024:
                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r6 = com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout.this
                    int r6 = r6.f117949u
                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r0 = com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout.this
                    java.util.List<com.ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap> r0 = r0.f117948t
                    int r0 = r0.size()
                    int r6 = r6 + r0
                    r0 = 100
                    if (r6 < r0) goto L_0x0046
                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r6 = com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout.this
                    android.content.Context r6 = r6.getContext()
                    r0 = 2132543666(0x7f1c08b2, float:2.0740472E38)
                    com.bytedance.ies.dmt.ui.d.a r6 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r6, r0)
                    r6.mo19066a()
                    return
                L_0x0046:
                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r6 = com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout.this
                    java.util.List<com.ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap> r6 = r6.f117948t
                    int r6 = r6.size()
                    r0 = 10
                    if (r6 < r0) goto L_0x0063
                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r6 = com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout.this
                    android.content.Context r6 = r6.getContext()
                    r0 = 2132543665(0x7f1c08b1, float:2.074047E38)
                    com.bytedance.ies.dmt.ui.d.a r6 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r6, r0)
                    r6.mo19066a()
                    return
                L_0x0063:
                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r6 = com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout.this
                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout$b r6 = r6.f117947s
                    if (r6 == 0) goto L_0x0070
                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r6 = com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout.this
                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout$b r6 = r6.f117947s
                    r6.mo93669b()
                L_0x0070:
                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r6 = com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout.this
                    com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r6 = r6.f117950v
                    com.ss.android.ugc.aweme.utils.b r0 = com.p683ss.android.ugc.aweme.utils.C47702b.f120193a
                    java.lang.String r1 = "click_wiki_entrance"
                    com.ss.android.ugc.aweme.shortvideo.az r2 = com.p683ss.android.ugc.aweme.shortvideo.C42438az.m93209a()
                    java.lang.String r3 = "creation_id"
                    if (r6 == 0) goto L_0x0086
                    java.lang.String r4 = r6.getCreationId()
                    if (r4 != 0) goto L_0x0088
                L_0x0086:
                    java.lang.String r4 = ""
                L_0x0088:
                    com.ss.android.ugc.aweme.shortvideo.az r2 = r2.mo86526a(r3, r4)
                    java.lang.String r3 = "shoot_way"
                    if (r6 == 0) goto L_0x0096
                    java.lang.String r4 = r6.getShootWay()
                    if (r4 != 0) goto L_0x0098
                L_0x0096:
                    java.lang.String r4 = ""
                L_0x0098:
                    com.ss.android.ugc.aweme.shortvideo.az r2 = r2.mo86526a(r3, r4)
                    java.lang.String r3 = "content_source"
                    if (r6 == 0) goto L_0x00a6
                    java.lang.String r4 = r6.getContentSource()
                    if (r4 != 0) goto L_0x00a8
                L_0x00a6:
                    java.lang.String r4 = ""
                L_0x00a8:
                    com.ss.android.ugc.aweme.shortvideo.az r2 = r2.mo86526a(r3, r4)
                    java.lang.String r3 = "content_type"
                    if (r6 == 0) goto L_0x00b6
                    java.lang.String r6 = r6.getContentType()
                    if (r6 != 0) goto L_0x00b8
                L_0x00b6:
                    java.lang.String r6 = ""
                L_0x00b8:
                    com.ss.android.ugc.aweme.shortvideo.az r6 = r2.mo86526a(r3, r6)
                    java.lang.String r2 = "enter_from"
                    java.lang.String r3 = "video_edit_page"
                    com.ss.android.ugc.aweme.shortvideo.az r6 = r6.mo86526a(r2, r3)
                    java.lang.String r2 = "EventMapBuilder.newBuild…ob.Label.VIDEO_EDIT_PAGE)"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r6, r2)
                    java.util.Map<java.lang.String, java.lang.String> r6 = r6.f107329a
                    r0.mo94984a(r1, r6)
                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r6 = com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout.this
                    android.widget.LinearLayout r6 = r6.f117940l
                    com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout$2$1 r0 = new com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout$2$1
                    r0.<init>()
                    r1 = 500(0x1f4, double:2.47E-321)
                    r6.postDelayed(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout.C467302.onClick(android.view.View):void");
            }
        });
    }

    /* renamed from: a */
    public void mo90854a(String str, int i, int i2, int i3, String str2, boolean z) {
        mo93837a(C46717e.m101394a(str), i, i2, i3, str2, z, 28, 0);
    }

    /* renamed from: a */
    public final void mo93837a(TextStickerTextWrap textStickerTextWrap, int i, int i2, int i3, String str, boolean z, int i4, int i5) {
        this.f117932d = -1;
        m101474a(z);
        mo93845g();
        this.f117929a.requestFocus();
        this.f117929a.setCursorVisible(true);
        this.f117929a.setTextSize((float) i4);
        this.f117930b.mo93806a(z, i2);
        String str2 = (String) textStickerTextWrap.getStrPair().getFirst();
        this.f117948t = (List) textStickerTextWrap.getStrPair().getSecond();
        this.f117949u = i5 - this.f117948t.size();
        this.f117929a.setTextStructWrapList(this.f117948t);
        if (z) {
            C46679c.m101291a().mo93623a(getScene());
            mo93843e();
            if (getScene() == 0) {
                int e = C46679c.m101291a().mo93637e();
                if (e > 0) {
                    this.f117929a.setFontSize(e);
                }
            }
        } else {
            this.f117929a.mo93819a(str2, textStickerTextWrap.getSelectionStart());
            this.f117930b.setSelectColorView(i2);
            this.f117931c = i;
            this.f117933e = i3;
            this.f117934f = i2;
            C46679c.m101291a().mo93625a(str, getScene());
        }
        mo93841d();
        this.f117929a.setFontType(C46679c.m101291a().mo93631c(getScene()));
        this.f117929a.mo90950a(i, i2);
        this.f117929a.setAligin(this.f117933e);
        this.f117938j.mo93607a();
        mo93838b();
        mo93836a(C46679c.m101291a().mo93636d(getScene()));
        if (!this.f117945q) {
            this.f117939k.setBackground(C42430at.m93199a(C46714c.m101387a().mo93786b().f117838a));
        }
    }
}
