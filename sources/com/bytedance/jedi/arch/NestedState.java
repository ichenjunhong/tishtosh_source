package com.bytedance.jedi.arch;

import com.bytedance.jedi.arch.C11932s;

public interface NestedState<SUB extends C11932s> extends C11932s {
    SUB getSubstate();

    NestedState<SUB> newSubstate(SUB sub);
}
