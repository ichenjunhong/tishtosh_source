package org.msgpack.type;

import java.math.BigInteger;
import org.msgpack.C53798c;

public abstract class NumberValue extends Number implements Value {
    public abstract BigInteger bigIntegerValue();

    public boolean isArrayValue() {
        return false;
    }

    public boolean isBooleanValue() {
        return false;
    }

    public boolean isFloatValue() {
        return false;
    }

    public boolean isIntegerValue() {
        return false;
    }

    public boolean isMapValue() {
        return false;
    }

    public boolean isNilValue() {
        return false;
    }

    public boolean isRawValue() {
        return false;
    }

    public ArrayValue asArrayValue() {
        throw new C53798c();
    }

    public BooleanValue asBooleanValue() {
        throw new C53798c();
    }

    public FloatValue asFloatValue() {
        throw new C53798c();
    }

    public IntegerValue asIntegerValue() {
        throw new C53798c();
    }

    public MapValue asMapValue() {
        throw new C53798c();
    }

    public NilValue asNilValue() {
        throw new C53798c();
    }

    public RawValue asRawValue() {
        throw new C53798c();
    }
}
