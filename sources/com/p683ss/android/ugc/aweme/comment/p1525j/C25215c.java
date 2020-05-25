package com.p683ss.android.ugc.aweme.comment.p1525j;

import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.C17971f;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25067d;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25225e;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25241l;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.translation.api.TranslationApi;
import com.p683ss.android.ugc.aweme.translation.p2371a.C47353a;
import com.p683ss.android.ugc.aweme.translation.p2371a.C47356c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.j.c */
public final class C25215c implements Runnable {

    /* renamed from: a */
    public Comment f66804a;

    /* renamed from: b */
    private C25213b f66805b;

    public final void run() {
        C17971f fVar = new C17971f();
        try {
            C17825i.m43740a(TranslationApi.m102713a().getMultiTranslation(this.f66805b.f66801b, fVar.mo34889b(this.f66805b.f66800a), 2), new C17824h<C47353a>() {
                public final void onFailure(Throwable th) {
                    C25215c.this.mo51478a(th);
                }

                public final /* synthetic */ void onSuccess(Object obj) {
                    List<C47356c> list = ((C47353a) obj).f119506a;
                    if (!C9376b.m18558a((Collection<T>) list)) {
                        C25215c.this.mo51477a((C47356c) list.get(0), false);
                        if (list.size() > 1) {
                            C25215c.this.mo51477a((C47356c) list.get(1), true);
                        }
                        C25215c.this.f66804a.setTranslated(true);
                        C25212a.m61315a().mo51472a(C25215c.this.f66804a, false);
                        C25212a a = C25212a.m61315a();
                        Comment comment = C25215c.this.f66804a;
                        if (comment != null) {
                            Comment clone = comment.clone();
                            a.f66796a.put(comment.getCid(), clone);
                            if (comment.getCommentType() == 0 && !C9376b.m18558a((Collection<T>) clone.getReplyComments())) {
                                Comment comment2 = (Comment) clone.getReplyComments().get(0);
                                a.f66796a.put(comment2.getCid(), comment2);
                            }
                        }
                        C25212a.m61315a().mo51470a(C25215c.this.f66804a.getCid()).setValue(new C25067d(C25215c.this.f66804a, true, null));
                    }
                }
            }, C23551l.f62672a);
        } catch (Exception unused) {
            mo51478a(new Exception());
        }
    }

    /* renamed from: a */
    public final void mo51478a(Throwable th) {
        C25212a.m61315a().mo51472a(this.f66804a, false);
        C25067d dVar = new C25067d(this.f66804a, false, null);
        if (th instanceof Exception) {
            dVar.f66402c = (Exception) th;
        }
        C25212a.m61315a().mo51470a(this.f66804a.getCid()).setValue(dVar);
    }

    public C25215c(Comment comment, C25213b bVar) {
        this.f66804a = comment;
        this.f66805b = bVar;
    }

    /* renamed from: a */
    public final void mo51477a(C47356c cVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        String b = C25241l.m61364b(cVar.f119513a);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b);
        sb2.append(" ");
        sb.append(sb2.toString());
        Comment comment = this.f66804a;
        if (z) {
            List replyComments = this.f66804a.getReplyComments();
            if (C9376b.m18558a((Collection<T>) replyComments)) {
                mo51478a(new Exception());
            } else {
                comment = (Comment) replyComments.get(0);
            }
        }
        for (int i = 0; i < comment.getTextExtra().size(); i++) {
            TextExtraStruct textExtraStruct = (TextExtraStruct) comment.getTextExtra().get(i);
            int min = Math.min(Math.max(textExtraStruct.getStart(), 0), C25225e.m61343d(comment).length());
            int min2 = Math.min(textExtraStruct.getEnd(), C25225e.m61343d(comment).length());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(C25225e.m61343d(comment).substring(min, min2));
            sb3.append(" ");
            String sb4 = sb3.toString();
            sb.append(sb4);
            TextExtraStruct clone = textExtraStruct.clone();
            int length = sb4.length();
            if (i == 0) {
                clone.setStart(b.length());
            } else {
                clone.setStart(((TextExtraStruct) arrayList.get(i - 1)).getEnd() + 1);
            }
            clone.setEnd(clone.getStart() + length);
            arrayList.add(clone);
        }
        String sb5 = sb.toString();
        Comment comment2 = this.f66804a;
        if (z && !C9376b.m18558a((Collection<T>) this.f66804a.getReplyComments())) {
            comment2 = (Comment) this.f66804a.getReplyComments().get(0);
        }
        comment2.setText(sb5);
        comment2.setTextExtra(arrayList);
    }
}
