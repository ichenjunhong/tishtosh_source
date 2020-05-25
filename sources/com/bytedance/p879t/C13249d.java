package com.bytedance.p879t;

import com.bytedance.p879t.p880a.C13230a;
import com.bytedance.p879t.p880a.C13231b;
import com.bytedance.p879t.p881b.C13233a;
import com.bytedance.p879t.p881b.C13234b;
import com.bytedance.p879t.p881b.C13235c;
import com.bytedance.p879t.p881b.C13236d;
import com.bytedance.p879t.p881b.C13237e;
import com.bytedance.p879t.p881b.C13238f;
import com.bytedance.p879t.p881b.C13239g;
import com.bytedance.p879t.p882c.C13241a;
import com.bytedance.p879t.p882c.C13242b;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2649l.C52785g;
import p2628d.p2649l.C52786h;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.t.d */
public final class C13249d {

    /* renamed from: a */
    private final XPath f34502a;

    /* renamed from: b */
    private int f34503b;

    /* renamed from: c */
    private final C13238f f34504c;

    /* renamed from: d */
    private final C13232b f34505d;

    /* renamed from: e */
    private final C13240c f34506e;

    /* renamed from: com.bytedance.t.d$a */
    public static final class C13250a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Integer.valueOf(((C13234b) t).byWrapper ? 1 : 0), Integer.valueOf(((C13234b) t2).byWrapper ? 1 : 0));
        }
    }

    /* renamed from: com.bytedance.t.d$b */
    public static final class C13251b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Integer.valueOf(((C13234b) t).byWrapper ? 1 : 0), Integer.valueOf(((C13234b) t2).byWrapper ? 1 : 0));
        }
    }

    /* renamed from: com.bytedance.t.d$c */
    public static final class C13252c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Integer.valueOf(((C13234b) t).byWrapper ? 1 : 0), Integer.valueOf(((C13234b) t2).byWrapper ? 1 : 0));
        }
    }

    /* renamed from: com.bytedance.t.d$d */
    static final /* synthetic */ class C13253d extends C52710j implements C52671b<Node, C13239g> {
        C13253d(C13249d dVar) {
            super(1, dVar);
        }

        public final String getName() {
            return "parseVideoClick";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C13249d.class);
        }

        public final String getSignature() {
            return "parseVideoClick(Lorg/w3c/dom/Node;)Lcom/bytedance/vast/model/VideoClick;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Node node = (Node) obj;
            C52711k.m112240b(node, "p1");
            return ((C13249d) this.receiver).mo24837a(node);
        }
    }

    /* renamed from: com.bytedance.t.d$e */
    public static final class C13254e<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Integer.valueOf(((C13234b) t).byWrapper ? 1 : 0), Integer.valueOf(((C13234b) t2).byWrapper ? 1 : 0));
        }
    }

    /* renamed from: com.bytedance.t.d$f */
    public static final class C13255f<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Integer.valueOf(((C13234b) t).byWrapper ? 1 : 0), Integer.valueOf(((C13234b) t2).byWrapper ? 1 : 0));
        }
    }

    /* renamed from: com.bytedance.t.d$g */
    public static final class C13256g<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Integer.valueOf(((C13234b) t).byWrapper ? 1 : 0), Integer.valueOf(((C13234b) t2).byWrapper ? 1 : 0));
        }
    }

    public C13249d(C13238f fVar) {
        this(fVar, null, null, 6, null);
    }

    public C13249d(C13238f fVar, C13232b bVar) {
        this(fVar, bVar, null, 4, null);
    }

    /* renamed from: b */
    private final void m26644b(Node node) {
        m26646c(node);
        m26648d(node);
        m26650e(node);
        m26652f(node);
    }

    /* renamed from: c */
    private final void m26646c(Node node) {
        XPath xPath = this.f34502a;
        C52711k.m112236a((Object) xPath, "xpath");
        C52785g a = C13242b.m26633a(xPath, (Object) node, "./Error");
        XPath xPath2 = this.f34502a;
        C52711k.m112236a((Object) xPath2, "xpath");
        Iterator a2 = C13242b.m26630a(a, xPath2, true, true).mo110157a();
        while (a2.hasNext()) {
            String str = (String) a2.next();
            this.f34504c.errorSet = C13241a.m26628a(this.f34504c.errorSet, str);
        }
    }

    /* renamed from: d */
    private final void m26648d(Node node) {
        XPath xPath = this.f34502a;
        C52711k.m112236a((Object) xPath, "xpath");
        C52785g a = C13242b.m26633a(xPath, (Object) node, "./Impression");
        XPath xPath2 = this.f34502a;
        C52711k.m112236a((Object) xPath2, "xpath");
        Iterator a2 = C13242b.m26630a(a, xPath2, true, true).mo110157a();
        while (a2.hasNext()) {
            String str = (String) a2.next();
            this.f34504c.impressionSet = C13241a.m26628a(this.f34504c.impressionSet, str);
        }
    }

    /* renamed from: e */
    private final void m26650e(Node node) {
        XPath xPath = this.f34502a;
        C52711k.m112236a((Object) xPath, "xpath");
        Iterator a = C13242b.m26633a(xPath, (Object) node, "./AdVerifications/Verification", "./Extension[@type='AdVerifications']/AdVerifications/Verification", "./Extensions/Extension[@type='AdVerifications']/AdVerifications/Verification").mo110157a();
        while (a.hasNext()) {
            Node node2 = (Node) a.next();
            C13233a aVar = new C13233a();
            String evaluate = this.f34502a.evaluate("./@vendor", node2);
            C52711k.m112236a((Object) evaluate, "xpath.evaluate(\"./@vendor\", verificationNode)");
            if (evaluate != null) {
                aVar.vender = C52830p.m112447b(evaluate).toString();
                String evaluate2 = this.f34502a.evaluate("./JavaScriptResource/text()", node2);
                C52711k.m112236a((Object) evaluate2, "xpath.evaluate(\"./JavaSc…ext()\", verificationNode)");
                if (evaluate2 != null) {
                    aVar.javascriptResource = C52830p.m112447b(evaluate2).toString();
                    String evaluate3 = this.f34502a.evaluate("./verificationParameters/text()", node2);
                    C52711k.m112236a((Object) evaluate3, "xpath.evaluate(\"./verifi…ext()\", verificationNode)");
                    if (evaluate3 != null) {
                        aVar.verificationParameters = C52830p.m112447b(evaluate3).toString();
                        this.f34504c.adVerificationList = C13241a.m26627a(this.f34504c.adVerificationList, aVar);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    /* renamed from: f */
    private final void m26652f(Node node) {
        XPath xPath = this.f34502a;
        C52711k.m112236a((Object) xPath, "xpath");
        Iterator a = C13242b.m26633a(xPath, (Object) node, "./ViewableImpression").mo110157a();
        while (a.hasNext()) {
            Node node2 = (Node) a.next();
            XPath xPath2 = this.f34502a;
            C52711k.m112236a((Object) xPath2, "xpath");
            C52785g a2 = C13242b.m26633a(xPath2, (Object) node2, "./Viewable");
            XPath xPath3 = this.f34502a;
            C52711k.m112236a((Object) xPath3, "xpath");
            Iterator a3 = C13242b.m26630a(a2, xPath3, true, true).mo110157a();
            while (a3.hasNext()) {
                String str = (String) a3.next();
                this.f34504c.viewableSet = C13241a.m26628a(this.f34504c.viewableSet, str);
            }
            XPath xPath4 = this.f34502a;
            C52711k.m112236a((Object) xPath4, "xpath");
            C52785g a4 = C13242b.m26633a(xPath4, (Object) node2, "./NotViewable");
            XPath xPath5 = this.f34502a;
            C52711k.m112236a((Object) xPath5, "xpath");
            Iterator a5 = C13242b.m26630a(a4, xPath5, true, true).mo110157a();
            while (a5.hasNext()) {
                String str2 = (String) a5.next();
                this.f34504c.notViewableSet = C13241a.m26628a(this.f34504c.notViewableSet, str2);
            }
            XPath xPath6 = this.f34502a;
            C52711k.m112236a((Object) xPath6, "xpath");
            C52785g a6 = C13242b.m26633a(xPath6, (Object) node2, "./ViewUndetermined");
            XPath xPath7 = this.f34502a;
            C52711k.m112236a((Object) xPath7, "xpath");
            Iterator a7 = C13242b.m26630a(a6, xPath7, true, true).mo110157a();
            while (a7.hasNext()) {
                String str3 = (String) a7.next();
                this.f34504c.viewUndeterminedSet = C13241a.m26628a(this.f34504c.viewUndeterminedSet, str3);
            }
        }
    }

    /* renamed from: a */
    public final C13239g mo24837a(Node node) {
        C13239g gVar = new C13239g();
        XPath xPath = this.f34502a;
        C52711k.m112236a((Object) xPath, "xpath");
        gVar.clickThrough = C13242b.m26636b(xPath, node, C52786h.m112337a((Object[]) new String[]{"./ClickThrough", "./IconClickThrough"}));
        XPath xPath2 = this.f34502a;
        C52711k.m112236a((Object) xPath2, "xpath");
        C52785g a = C13242b.m26632a(xPath2, (Object) node, C52786h.m112337a((Object[]) new String[]{"./ClickTracking", "./IconClickTracking"}));
        XPath xPath3 = this.f34502a;
        C52711k.m112236a((Object) xPath3, "xpath");
        Iterator a2 = C13242b.m26630a(a, xPath3, true, true).mo110157a();
        while (a2.hasNext()) {
            gVar.clickTracking = C13241a.m26628a(gVar.clickTracking, (String) a2.next());
        }
        return gVar;
    }

    /* renamed from: b */
    private final void m26645b(Node node, C13234b bVar) {
        XPath xPath = this.f34502a;
        C52711k.m112236a((Object) xPath, "xpath");
        bVar.duration = C13242b.m26634a(xPath, (Object) node, "./Linear/Duration");
    }

    /* renamed from: a */
    private final void m26639a(Node node, C13234b bVar) {
        String evaluate = this.f34502a.evaluate("./@id", node);
        C52711k.m112236a((Object) evaluate, "xpath.evaluate(\"./@id\", creativeNode)");
        if (evaluate != null) {
            bVar.f34494id = C52830p.m112447b(evaluate).toString();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
    }

    /* renamed from: a */
    private final void m26640a(Node node, boolean z) {
        XPath xPath = this.f34502a;
        C52711k.m112236a((Object) xPath, "xpath");
        Iterator a = C13242b.m26633a(xPath, (Object) node, "./Creatives/Creative").mo110157a();
        while (a.hasNext()) {
            Node node2 = (Node) a.next();
            C13234b bVar = new C13234b();
            bVar.byWrapper = z;
            m26639a(node2, bVar);
            m26645b(node2, bVar);
            m26647c(node2, bVar);
            m26649d(node2, bVar);
            m26651e(node2, bVar);
            m26653f(node2, bVar);
            if (z) {
                this.f34504c.creativeList = C13241a.m26629b(this.f34504c.creativeList, bVar);
            } else {
                this.f34504c.creativeList = C13241a.m26627a(this.f34504c.creativeList, bVar);
            }
        }
    }

    /* renamed from: d */
    private final void m26649d(Node node, C13234b bVar) {
        XPath xPath = this.f34502a;
        C52711k.m112236a((Object) xPath, "xpath");
        Iterator a = C52786h.m112348d(C13242b.m26633a(xPath, (Object) node, "./Linear/VideoClicks"), new C13253d(this)).mo110157a();
        while (a.hasNext()) {
            bVar.clickList = C13241a.m26627a(bVar.clickList, (C13239g) a.next());
        }
    }

    /* renamed from: c */
    private final void m26647c(Node node, C13234b bVar) {
        XPath xPath = this.f34502a;
        C52711k.m112236a((Object) xPath, "xpath");
        Iterator a = C13242b.m26633a(xPath, (Object) node, "./Linear/TrackingEvents/Tracking").mo110157a();
        while (a.hasNext()) {
            Node node2 = (Node) a.next();
            C13237e eVar = new C13237e();
            String evaluate = this.f34502a.evaluate("./@event", node2);
            C52711k.m112236a((Object) evaluate, "xpath.evaluate(\"./@event\", it)");
            if (evaluate != null) {
                eVar.name = C52830p.m112447b(evaluate).toString();
                String evaluate2 = this.f34502a.evaluate("./@offset", node2);
                C52711k.m112236a((Object) evaluate2, "xpath.evaluate(\"./@offset\", it)");
                if (evaluate2 != null) {
                    eVar.offset = C52830p.m112447b(evaluate2).toString();
                    String evaluate3 = this.f34502a.evaluate("./text()", node2);
                    C52711k.m112236a((Object) evaluate3, "xpath.evaluate(\"./text()\", it)");
                    if (evaluate3 != null) {
                        eVar.url = C52830p.m112447b(evaluate3).toString();
                        bVar.trackingEventList = C13241a.m26627a(bVar.trackingEventList, eVar);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    /* renamed from: b */
    public final boolean mo24839b(String str, int i) {
        C13240c cVar = this.f34506e;
        if (cVar != null) {
            cVar.mo24836b(str, i);
        }
        this.f34503b++;
        Document document = null;
        if (str != null) {
            try {
                document = C13242b.m26637b(str);
            } catch (C13231b e) {
                C13240c cVar2 = this.f34506e;
                if (cVar2 != null) {
                    cVar2.mo24833a(e);
                }
            } catch (Throwable th) {
                C13240c cVar3 = this.f34506e;
                if (cVar3 != null) {
                    cVar3.mo24831a(i);
                }
                this.f34503b--;
                if (this.f34503b == 0) {
                    List<C13234b> list = this.f34504c.creativeList;
                    if (list != null && list.size() > 1) {
                        C52575l.m112105a(list, new C13252c());
                    }
                }
                throw th;
            }
        }
        Document document2 = document;
        if (document2 == null) {
            C13240c cVar4 = this.f34506e;
            if (cVar4 != null) {
                cVar4.mo24831a(i);
            }
            this.f34503b--;
            if (this.f34503b == 0) {
                List<C13234b> list2 = this.f34504c.creativeList;
                if (list2 != null && list2.size() > 1) {
                    C52575l.m112105a(list2, new C13250a());
                }
            }
            return false;
        }
        boolean a = m26642a(document2, i, 0);
        C13240c cVar5 = this.f34506e;
        if (cVar5 != null) {
            cVar5.mo24831a(i);
        }
        this.f34503b--;
        if (this.f34503b == 0) {
            List<C13234b> list3 = this.f34504c.creativeList;
            if (list3 != null && list3.size() > 1) {
                C52575l.m112105a(list3, new C13251b());
            }
        }
        return a;
    }

    /* renamed from: e */
    private final void m26651e(Node node, C13234b bVar) {
        boolean z;
        boolean z2;
        XPath xPath = this.f34502a;
        C52711k.m112236a((Object) xPath, "xpath");
        Iterator a = C13242b.m26633a(xPath, (Object) node, "./Linear/MediaFiles/MediaFile").mo110157a();
        while (a.hasNext()) {
            Node node2 = (Node) a.next();
            C13236d dVar = new C13236d();
            String evaluate = this.f34502a.evaluate("./@delivery", node2);
            C52711k.m112236a((Object) evaluate, "xpath.evaluate(\"./@delivery\", mediaFileNode)");
            if (evaluate != null) {
                dVar.delivery = C52830p.m112447b(evaluate).toString();
                String evaluate2 = this.f34502a.evaluate("./@type", node2);
                C52711k.m112236a((Object) evaluate2, "xpath.evaluate(\"./@type\", mediaFileNode)");
                if (evaluate2 != null) {
                    dVar.type = C52830p.m112447b(evaluate2).toString();
                    String evaluate3 = this.f34502a.evaluate("./text()", node2);
                    C52711k.m112236a((Object) evaluate3, "xpath.evaluate(\"./text()\", mediaFileNode)");
                    if (evaluate3 != null) {
                        dVar.url = C52830p.m112447b(evaluate3).toString();
                        XPath xPath2 = this.f34502a;
                        C52711k.m112236a((Object) xPath2, "xpath");
                        String evaluate4 = xPath2.evaluate("./@bitrate", node2);
                        C52711k.m112236a((Object) evaluate4, "evaluate(expr, item)");
                        if (evaluate4 != null) {
                            Integer c = C52830p.m112395c(C52830p.m112447b(evaluate4).toString());
                            if (c != null) {
                                dVar.bitRate = c.intValue();
                            }
                            XPath xPath3 = this.f34502a;
                            C52711k.m112236a((Object) xPath3, "xpath");
                            String evaluate5 = xPath3.evaluate("./@width", node2);
                            C52711k.m112236a((Object) evaluate5, "evaluate(expr, item)");
                            if (evaluate5 != null) {
                                Integer c2 = C52830p.m112395c(C52830p.m112447b(evaluate5).toString());
                                if (c2 != null) {
                                    dVar.width = c2.intValue();
                                }
                                XPath xPath4 = this.f34502a;
                                C52711k.m112236a((Object) xPath4, "xpath");
                                String evaluate6 = xPath4.evaluate("./@height", node2);
                                C52711k.m112236a((Object) evaluate6, "evaluate(expr, item)");
                                if (evaluate6 != null) {
                                    Integer c3 = C52830p.m112395c(C52830p.m112447b(evaluate6).toString());
                                    if (c3 != null) {
                                        dVar.height = c3.intValue();
                                    }
                                    XPath xPath5 = this.f34502a;
                                    C52711k.m112236a((Object) xPath5, "xpath");
                                    String evaluate7 = xPath5.evaluate("./@scalable", node2);
                                    C52711k.m112236a((Object) evaluate7, "evaluate(expr, item)");
                                    if (evaluate7 != null) {
                                        String obj = C52830p.m112447b(evaluate7).toString();
                                        if (obj.length() > 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            dVar.scalable = Boolean.valueOf(C52830p.m112406a("true", obj, true));
                                        }
                                        XPath xPath6 = this.f34502a;
                                        C52711k.m112236a((Object) xPath6, "xpath");
                                        String evaluate8 = xPath6.evaluate("./@maintainAspectRatio", node2);
                                        C52711k.m112236a((Object) evaluate8, "evaluate(expr, item)");
                                        if (evaluate8 != null) {
                                            String obj2 = C52830p.m112447b(evaluate8).toString();
                                            if (obj2.length() > 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                dVar.maintainAspectRatio = Boolean.valueOf(C52830p.m112406a("true", obj2, true));
                                            }
                                            bVar.mediaFileList = C13241a.m26627a(bVar.mediaFileList, dVar);
                                        } else {
                                            throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                                        }
                                    } else {
                                        throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                                    }
                                } else {
                                    throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                                }
                            } else {
                                throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        } else {
                            throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    /* renamed from: f */
    private final void m26653f(Node node, C13234b bVar) {
        XPath xPath = this.f34502a;
        C52711k.m112236a((Object) xPath, "xpath");
        Iterator a = C13242b.m26633a(xPath, (Object) node, "./Linear/Icons/Icon").mo110157a();
        while (a.hasNext()) {
            Node node2 = (Node) a.next();
            C13235c cVar = new C13235c();
            XPath xPath2 = this.f34502a;
            C52711k.m112236a((Object) xPath2, "xpath");
            String evaluate = xPath2.evaluate("./@width", node2);
            C52711k.m112236a((Object) evaluate, "evaluate(expr, item)");
            if (evaluate != null) {
                Integer c = C52830p.m112395c(C52830p.m112447b(evaluate).toString());
                if (c != null) {
                    cVar.width = c.intValue();
                }
                XPath xPath3 = this.f34502a;
                C52711k.m112236a((Object) xPath3, "xpath");
                String evaluate2 = xPath3.evaluate("./@height", node2);
                C52711k.m112236a((Object) evaluate2, "evaluate(expr, item)");
                if (evaluate2 != null) {
                    Integer c2 = C52830p.m112395c(C52830p.m112447b(evaluate2).toString());
                    if (c2 != null) {
                        cVar.width = c2.intValue();
                    }
                    cVar.program = this.f34502a.evaluate("./@program", node2);
                    XPath xPath4 = this.f34502a;
                    C52711k.m112236a((Object) xPath4, "xpath");
                    C52785g a2 = C13242b.m26633a(xPath4, (Object) node2, "./StaticResource");
                    XPath xPath5 = this.f34502a;
                    C52711k.m112236a((Object) xPath5, "xpath");
                    cVar.staticResource = C52786h.m112352f(C13242b.m26630a(a2, xPath5, true, true));
                    XPath xPath6 = this.f34502a;
                    C52711k.m112236a((Object) xPath6, "xpath");
                    C52785g a3 = C13242b.m26633a(xPath6, (Object) node2, "./HTMLResource");
                    XPath xPath7 = this.f34502a;
                    C52711k.m112236a((Object) xPath7, "xpath");
                    cVar.htmlResource = (String) C52786h.m112349d(C13242b.m26630a(a3, xPath7, true, true));
                    XPath xPath8 = this.f34502a;
                    C52711k.m112236a((Object) xPath8, "xpath");
                    C52785g a4 = C13242b.m26633a(xPath8, (Object) node2, "./IFrameResource");
                    XPath xPath9 = this.f34502a;
                    C52711k.m112236a((Object) xPath9, "xpath");
                    cVar.iFrameResource = (String) C52786h.m112349d(C13242b.m26630a(a4, xPath9, true, true));
                    XPath xPath10 = this.f34502a;
                    C52711k.m112236a((Object) xPath10, "xpath");
                    C52785g a5 = C13242b.m26633a(xPath10, (Object) node2, "./IconViewTracking");
                    XPath xPath11 = this.f34502a;
                    C52711k.m112236a((Object) xPath11, "xpath");
                    cVar.viewTracking = C52786h.m112352f(C13242b.m26630a(a5, xPath11, true, true));
                    XPath xPath12 = this.f34502a;
                    C52711k.m112236a((Object) xPath12, "xpath");
                    Iterator a6 = C13242b.m26633a(xPath12, (Object) node2, "./IconClicks").mo110157a();
                    while (a6.hasNext()) {
                        cVar.clickList = C13241a.m26627a(cVar.clickList, mo24837a((Node) a6.next()));
                    }
                    bVar.iconList = C13241a.m26627a(bVar.iconList, cVar);
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        r3 = null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo24838a(java.lang.String r9, int r10) {
        /*
            r8 = this;
            com.bytedance.t.c r0 = r8.f34506e
            if (r0 == 0) goto L_0x0007
            r0.mo24835a(r9, r10)
        L_0x0007:
            int r0 = r8.f34503b
            r1 = 1
            int r0 = r0 + r1
            r8.f34503b = r0
            r0 = 0
            com.bytedance.t.b r2 = r8.f34505d     // Catch:{ a -> 0x0028, b -> 0x001f }
            if (r2 != 0) goto L_0x0016
            com.bytedance.t.a r2 = com.bytedance.p879t.C13229a.f34492a     // Catch:{ a -> 0x0028, b -> 0x001f }
            com.bytedance.t.b r2 = (com.bytedance.p879t.C13232b) r2     // Catch:{ a -> 0x0028, b -> 0x001f }
        L_0x0016:
            org.w3c.dom.Document r9 = r2.mo24821a(r9)     // Catch:{ a -> 0x0028, b -> 0x001f }
            r3 = r9
            goto L_0x0031
        L_0x001c:
            r9 = move-exception
            goto L_0x008d
        L_0x001f:
            r9 = move-exception
            com.bytedance.t.c r2 = r8.f34506e     // Catch:{ all -> 0x001c }
            if (r2 == 0) goto L_0x0030
            r2.mo24833a(r9)     // Catch:{ all -> 0x001c }
            goto L_0x0030
        L_0x0028:
            r9 = move-exception
            com.bytedance.t.c r2 = r8.f34506e     // Catch:{ all -> 0x001c }
            if (r2 == 0) goto L_0x0030
            r2.mo24832a(r9)     // Catch:{ all -> 0x001c }
        L_0x0030:
            r3 = r0
        L_0x0031:
            if (r3 != 0) goto L_0x005c
            com.bytedance.t.c r9 = r8.f34506e
            if (r9 == 0) goto L_0x003a
            r9.mo24831a(r10)
        L_0x003a:
            int r9 = r8.f34503b
            int r9 = r9 + -1
            r8.f34503b = r9
            int r9 = r8.f34503b
            if (r9 != 0) goto L_0x005a
            com.bytedance.t.b.f r9 = r8.f34504c
            java.util.List<com.bytedance.t.b.b> r9 = r9.creativeList
            if (r9 == 0) goto L_0x005a
            int r10 = r9.size()
            if (r10 <= r1) goto L_0x005a
            com.bytedance.t.d$e r10 = new com.bytedance.t.d$e
            r10.<init>()
            java.util.Comparator r10 = (java.util.Comparator) r10
            p2628d.p2629a.C52575l.m112105a(r9, r10)
        L_0x005a:
            r9 = 0
            return r9
        L_0x005c:
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r8
            r4 = r10
            boolean r9 = r2.m26642a(r3, r4, 0)     // Catch:{ all -> 0x001c }
            com.bytedance.t.c r0 = r8.f34506e
            if (r0 == 0) goto L_0x006c
            r0.mo24831a(r10)
        L_0x006c:
            int r10 = r8.f34503b
            int r10 = r10 + -1
            r8.f34503b = r10
            int r10 = r8.f34503b
            if (r10 != 0) goto L_0x008c
            com.bytedance.t.b.f r10 = r8.f34504c
            java.util.List<com.bytedance.t.b.b> r10 = r10.creativeList
            if (r10 == 0) goto L_0x008c
            int r0 = r10.size()
            if (r0 <= r1) goto L_0x008c
            com.bytedance.t.d$f r0 = new com.bytedance.t.d$f
            r0.<init>()
            java.util.Comparator r0 = (java.util.Comparator) r0
            p2628d.p2629a.C52575l.m112105a(r10, r0)
        L_0x008c:
            return r9
        L_0x008d:
            com.bytedance.t.c r0 = r8.f34506e
            if (r0 == 0) goto L_0x0094
            r0.mo24831a(r10)
        L_0x0094:
            int r10 = r8.f34503b
            int r10 = r10 + -1
            r8.f34503b = r10
            int r10 = r8.f34503b
            if (r10 != 0) goto L_0x00b4
            com.bytedance.t.b.f r10 = r8.f34504c
            java.util.List<com.bytedance.t.b.b> r10 = r10.creativeList
            if (r10 == 0) goto L_0x00b4
            int r0 = r10.size()
            if (r0 <= r1) goto L_0x00b4
            com.bytedance.t.d$g r0 = new com.bytedance.t.d$g
            r0.<init>()
            java.util.Comparator r0 = (java.util.Comparator) r0
            p2628d.p2629a.C52575l.m112105a(r10, r0)
        L_0x00b4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p879t.C13249d.mo24838a(java.lang.String, int):boolean");
    }

    public C13249d(C13238f fVar, C13232b bVar, C13240c cVar) {
        C52711k.m112240b(fVar, "vast");
        this.f34504c = fVar;
        this.f34505d = bVar;
        this.f34506e = cVar;
        this.f34502a = XPathFactory.newInstance().newXPath();
    }

    /* renamed from: a */
    private final boolean m26643a(Node node, int i, int i2) {
        if (i < 0) {
            C13240c cVar = this.f34506e;
            if (cVar != null) {
                XPath xPath = this.f34502a;
                C52711k.m112236a((Object) xPath, "xpath");
                C52785g a = C13242b.m26633a(xPath, (Object) node, "./VASTAdTagURI");
                XPath xPath2 = this.f34502a;
                C52711k.m112236a((Object) xPath2, "xpath");
                Iterator a2 = C13242b.m26630a(a, xPath2, true, true).mo110157a();
                while (a2.hasNext()) {
                    cVar.mo24834a((String) a2.next());
                }
            }
            return false;
        }
        XPath xPath3 = this.f34502a;
        C52711k.m112236a((Object) xPath3, "xpath");
        C52785g a3 = C13242b.m26633a(xPath3, (Object) node, "./VASTAdTagURI");
        XPath xPath4 = this.f34502a;
        C52711k.m112236a((Object) xPath4, "xpath");
        Iterator a4 = C13242b.m26630a(a3, xPath4, true, true).mo110157a();
        boolean z = false;
        while (a4.hasNext()) {
            String str = (String) a4.next();
            C13240c cVar2 = this.f34506e;
            if (cVar2 != null) {
                cVar2.mo24835a(str, i);
            }
            Document document = null;
            try {
                C13232b bVar = this.f34505d;
                if (bVar == null) {
                    bVar = C13229a.f34492a;
                }
                document = bVar.mo24821a(str);
            } catch (C13230a e) {
                C13240c cVar3 = this.f34506e;
                if (cVar3 != null) {
                    cVar3.mo24832a(e);
                }
            } catch (C13231b e2) {
                C13240c cVar4 = this.f34506e;
                if (cVar4 != null) {
                    cVar4.mo24833a(e2);
                }
            } catch (Throwable th) {
                C13240c cVar5 = this.f34506e;
                if (cVar5 != null) {
                    cVar5.mo24831a(i);
                }
                throw th;
            }
            if (document == null) {
                C13240c cVar6 = this.f34506e;
                if (cVar6 != null) {
                    cVar6.mo24831a(i);
                }
                return false;
            } else if (!m26642a(document, i, i2 + 1)) {
                C13240c cVar7 = this.f34506e;
                if (cVar7 != null) {
                    cVar7.mo24831a(i);
                }
                return false;
            } else {
                C13240c cVar8 = this.f34506e;
                if (cVar8 != null) {
                    cVar8.mo24831a(i);
                }
                z = true;
            }
        }
        if (!z) {
            C13240c cVar9 = this.f34506e;
            if (cVar9 != null) {
                cVar9.mo24833a(new C13231b("VASTAdTagURI missing"));
            }
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m26642a(Document document, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Document document2 = document;
        int i3 = i - 1;
        CharSequence charSequence = this.f34504c.version;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f34504c.version = this.f34502a.evaluate("/VAST/@version", document2);
        }
        XPath xPath = this.f34502a;
        C52711k.m112236a((Object) xPath, "xpath");
        Iterator a = C13242b.m26633a(xPath, (Object) document2, "/VAST/Ad/InLine").mo110157a();
        while (a.hasNext()) {
            Node node = (Node) a.next();
            C13240c cVar = this.f34506e;
            if (cVar != null) {
                cVar.mo24830a();
            }
            CharSequence charSequence2 = this.f34504c.adSystem;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C13238f fVar = this.f34504c;
                XPath xPath2 = this.f34502a;
                C52711k.m112236a((Object) xPath2, "xpath");
                C52785g a2 = C13242b.m26633a(xPath2, (Object) node, "./AdSystem");
                XPath xPath3 = this.f34502a;
                C52711k.m112236a((Object) xPath3, "xpath");
                fVar.adSystem = (String) C52786h.m112349d(C13242b.m26630a(a2, xPath3, true, true));
            }
            CharSequence charSequence3 = this.f34504c.adTitle;
            if (charSequence3 == null || charSequence3.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                C13238f fVar2 = this.f34504c;
                XPath xPath4 = this.f34502a;
                C52711k.m112236a((Object) xPath4, "xpath");
                C52785g a3 = C13242b.m26633a(xPath4, (Object) node, "./AdTitle");
                XPath xPath5 = this.f34502a;
                C52711k.m112236a((Object) xPath5, "xpath");
                fVar2.adTitle = (String) C52786h.m112349d(C13242b.m26630a(a3, xPath5, true, true));
            }
            String evaluate = this.f34502a.evaluate("./Description/text()", node);
            C52711k.m112236a((Object) evaluate, "xpath.evaluate(\"./Description/text()\", inLineNode)");
            if (evaluate != null) {
                String obj = C52830p.m112447b(evaluate).toString();
                if (obj.length() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    this.f34504c.description = obj;
                }
                m26640a(node, false);
                m26644b(node);
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        XPath xPath6 = this.f34502a;
        C52711k.m112236a((Object) xPath6, "xpath");
        Iterator a4 = C13242b.m26633a(xPath6, (Object) document2, "/VAST/Ad/Wrapper").mo110157a();
        while (a4.hasNext()) {
            Node node2 = (Node) a4.next();
            m26640a(node2, true);
            m26644b(node2);
            if (!m26643a(node2, i3, i2)) {
                return false;
            }
        }
        return true;
    }

    private /* synthetic */ C13249d(C13238f fVar, C13232b bVar, C13240c cVar, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        this(fVar, bVar, null);
    }
}
