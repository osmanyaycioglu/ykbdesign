package com.ykb.training.dp.creational.abstractfactory;

import com.ykb.training.dp.creational.abstractfactory.before.IButon;
import com.ykb.training.dp.creational.abstractfactory.before.IInput;
import com.ykb.training.dp.creational.abstractfactory.before.IText;
import com.ykb.training.dp.creational.abstractfactory.before.RedButton;
import com.ykb.training.dp.creational.abstractfactory.before.RedInput;
import com.ykb.training.dp.creational.abstractfactory.before.RedText;

public class RedComponents implements IComponents {

    @Override
    public IButon createButton() {
        return new RedButton();
    }

    @Override
    public IText createText() {
        return new RedText();
    }

    @Override
    public IInput createInput() {
        return new RedInput();
    }

}
