package p2628d.p2650m;

/* renamed from: d.m.o */
final class C52829o {

    /* renamed from: a */
    public static final C52820l f131082a;

    /* renamed from: b */
    public static final C52829o f131083b = new C52829o();

    private C52829o() {
    }

    static {
        String str = "(\\p{Digit}+)";
        String str2 = "(\\p{XDigit}+)";
        StringBuilder sb = new StringBuilder("[eE][+-]?");
        sb.append(str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("(0[xX]");
        sb3.append(str2);
        sb3.append("(\\.)?)|(0[xX]");
        sb3.append(str2);
        sb3.append("?(\\.)");
        sb3.append(str2);
        sb3.append(')');
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder("(");
        sb5.append(str);
        sb5.append("(\\.)?(");
        sb5.append(str);
        sb5.append("?)(");
        sb5.append(sb2);
        sb5.append(")?)|(\\.(");
        sb5.append(str);
        sb5.append(")(");
        sb5.append(sb2);
        sb5.append(")?)|((");
        sb5.append(sb4);
        sb5.append(")[pP][+-]?");
        sb5.append(str);
        sb5.append(')');
        String sb6 = sb5.toString();
        StringBuilder sb7 = new StringBuilder("[\\x00-\\x20]*[+-]?(NaN|Infinity|((");
        sb7.append(sb6);
        sb7.append(")[fFdD]?))[\\x00-\\x20]*");
        f131082a = new C52820l(sb7.toString());
    }
}
