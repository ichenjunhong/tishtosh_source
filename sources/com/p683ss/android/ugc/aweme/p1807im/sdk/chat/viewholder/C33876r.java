package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33711v.C33716b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33711v.C33716b.C33717a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.CommentContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35233bh;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.EnableEndEllipsizeTextView;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.r */
public class C33876r extends C33805c<CommentContent> {

    /* renamed from: u */
    protected EnableEndEllipsizeTextView f87865u;

    /* renamed from: v */
    protected C33716b f87866v;

    /* renamed from: w */
    private RemoteImageView f87867w;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo71782b() {
        super.mo71782b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87867w = (RemoteImageView) this.itemView.findViewById(R.id.by0);
        this.f87865u = (EnableEndEllipsizeTextView) this.itemView.findViewById(R.id.d1l);
        this.f87708j = this.itemView.findViewById(R.id.ze);
    }

    public C33876r(View view, int i) {
        super(view, i);
        if (this.f87866v == null) {
            this.f87866v = new C33716b(C11010c.m22280a().getResources().getColor(R.color.r0));
        }
    }

    /* renamed from: a */
    public final void mo71847a(IMUser iMUser, C11207p pVar, int i) {
        IMUser iMUser2;
        super.mo71847a(iMUser, pVar, i);
        Resources resources = C11010c.m22280a().getResources();
        if (C35265e.m79729a(String.valueOf(pVar.getSender()))) {
            iMUser2 = C34010e.m77748a().mo71964b(String.valueOf(C11190e.m22685a(pVar.getConversationId())));
        } else {
            User c = C35265e.m79732c();
            if (c == null) {
                c = new User();
            }
            iMUser2 = IMUser.fromUser(c);
        }
        if (iMUser2 == null) {
            iMUser2 = new IMUser();
        }
        String nickName = iMUser2.getNickName();
        if (nickName == null) {
            nickName = "";
        } else if (nickName.length() > 4) {
            StringBuilder sb = new StringBuilder();
            sb.append(nickName.substring(0, 4));
            sb.append("...");
            nickName = sb.toString();
        }
        this.f87866v.f87460a = iMUser2.getUid();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(resources.getString(R.string.bem));
        sb2.append(nickName);
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(resources.getString(R.string.bky, new Object[]{sb3}));
        sb4.append(((CommentContent) this.f87709k).getComment());
        String sb5 = sb4.toString();
        EnableEndEllipsizeTextView enableEndEllipsizeTextView = this.f87865u;
        C33716b bVar = this.f87866v;
        C338771 r2 = new C33717a() {
            /* renamed from: a */
            public final void mo71740a() {
                C41302w a = C41302w.m91042a();
                Activity activity = (Activity) C33876r.this.itemView.getContext();
                StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                sb.append(((CommentContent) C33876r.this.f87709k).getAwemeId());
                a.mo83858a(activity, C41311y.m91065a(sb.toString()).mo83870a("refer", "chat").mo83870a("video_from", "from_chat").mo83870a("cid", ((CommentContent) C33876r.this.f87709k).getCommentId()).mo83871a());
            }

            /* renamed from: b */
            public final void mo71742b(View view) {
                C33876r.this.f87708j.performLongClick();
            }

            /* renamed from: a */
            public final void mo71741a(View view) {
                C35233bh.m79635a(C33876r.this.f87866v.f87460a);
            }
        };
        SpannableString spannableString = new SpannableString(sb5);
        int indexOf = sb5.indexOf(sb3);
        if (indexOf < 0) {
            enableEndEllipsizeTextView.setText(sb5);
            return;
        }
        spannableString.setSpan(bVar, indexOf, sb3.length() + indexOf, 33);
        enableEndEllipsizeTextView.setText(spannableString);
        enableEndEllipsizeTextView.setMovementMethod(LinkMovementMethod.getInstance());
        enableEndEllipsizeTextView.setOnTouchListener(new OnTouchListener(r2, enableEndEllipsizeTextView) {

            /* renamed from: a */
            final /* synthetic */ C33717a f87448a;

            /* renamed from: b */
            final /* synthetic */ TextView f87449b;

            /* renamed from: c */
            private long f87450c;

            /* renamed from: d */
            private Handler f87451d;

            /* renamed from: e */
            private Runnable f87452e;

            /* renamed from: a */
            private void m77221a() {
                if (this.f87451d != null && this.f87452e != null) {
                    this.f87451d.removeCallbacks(this.f87452e);
                }
            }

            {
                this.f87448a = r1;
                this.f87449b = r2;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                TextView textView = (TextView) view;
                CharSequence text = textView.getText();
                if (text instanceof SpannableString) {
                    if (action == 0) {
                        m77221a();
                        if (this.f87451d == null) {
                            this.f87451d = new Handler(Looper.getMainLooper());
                        }
                        if (this.f87452e == null) {
                            this.f87452e = new Runnable() {
                                public final void run() {
                                    if (C337121.this.f87448a != null) {
                                        C337121.this.f87448a.mo71742b(C337121.this.f87449b);
                                    }
                                }
                            };
                        }
                        this.f87451d.postDelayed(this.f87452e, (long) ViewConfiguration.getLongPressTimeout());
                        this.f87450c = System.currentTimeMillis();
                    } else if (action == 1) {
                        m77221a();
                        int x = (int) motionEvent.getX();
                        int totalPaddingLeft = (x - textView.getTotalPaddingLeft()) + textView.getScrollX();
                        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
                        Layout layout = textView.getLayout();
                        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) totalPaddingLeft);
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((SpannableString) text).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (System.currentTimeMillis() - this.f87450c < ((long) ViewConfiguration.getLongPressTimeout())) {
                            if (clickableSpanArr.length != 0) {
                                if (this.f87448a != null) {
                                    this.f87448a.mo71741a(textView);
                                }
                            } else if (this.f87448a != null) {
                                this.f87448a.mo71740a();
                            }
                        }
                    } else if (action == 3) {
                        m77221a();
                    }
                }
                return true;
            }
        });
        enableEndEllipsizeTextView.setVisibility(0);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, CommentContent commentContent, int i) {
        super.mo71780a(pVar, pVar2, commentContent, i);
        C23515d.m57669a(this.f87867w, commentContent.getCoverUrl());
        this.f87708j.setTag(50331648, Integer.valueOf(14));
    }
}
