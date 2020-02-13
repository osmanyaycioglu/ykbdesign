package com.ykb.training.dp.creational.abstractfactory;

import com.ykb.training.dp.creational.abstractfactory.before.BlueButton;
import com.ykb.training.dp.creational.abstractfactory.before.BlueInput;
import com.ykb.training.dp.creational.abstractfactory.before.BlueText;
import com.ykb.training.dp.creational.abstractfactory.before.IButon;
import com.ykb.training.dp.creational.abstractfactory.before.IInput;
import com.ykb.training.dp.creational.abstractfactory.before.IText;

public class BlueComponents implements IComponents {

    @Override
    public IButon createButton() {
        return new BlueButton();
    }

    @Override
    public IText createText() {
        return new BlueText();
    }

    @Override
    public IInput createInput() {
        return new BlueInput();
    }

}
