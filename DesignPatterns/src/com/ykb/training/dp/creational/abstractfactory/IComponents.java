package com.ykb.training.dp.creational.abstractfactory;

import com.ykb.training.dp.creational.abstractfactory.before.IButon;
import com.ykb.training.dp.creational.abstractfactory.before.IInput;
import com.ykb.training.dp.creational.abstractfactory.before.IText;

public interface IComponents {
    IButon createButton();

    IText createText();

    IInput createInput();
}
