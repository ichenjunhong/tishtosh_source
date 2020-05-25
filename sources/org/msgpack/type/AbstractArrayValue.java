package org.msgpack.type;

import java.util.AbstractList;
import org.msgpack.C53798c;

abstract class AbstractArrayValue extends AbstractList<Value> implements ArrayValue {
    AbstractArrayValue() {
    }

    public ArrayValue asArrayValue() {
        return this;
    }

    public boolean isArrayValue() {
        return true;
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

    public RawValue asRawValue() {
        throw new C53798c();
    }
}
